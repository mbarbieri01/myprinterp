package com.cesaco.myprinterp.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.UserTransaction;

import org.jboss.errai.bus.server.annotations.Service;

import com.cesaco.myprinterp.client.shared.Gruppo;
import com.cesaco.myprinterp.client.shared.GruppoService;
import com.cesaco.myprinterp.client.shared.Member;
import com.cesaco.myprinterp.client.shared.New;

/**
 * CDI service that can be called from either the client side (via Errai RPC) or
 * the server side.
 *
 * @author Jonathan Fuerth <jfuerth@redhat.com>
 * @author Christian Sadilek <csadilek@redhat.com>
 */
@ApplicationScoped
@Service
public class GruppoServiceImpl implements GruppoService {

  @Inject
  private Logger log;

  @Inject
  private EntityManager em;

  @Inject
  private UserTransaction userTransaction;

  @Inject @New
  private Event<Gruppo> newGruppoEvent;

  
  @Override
  public void update(Gruppo newGruppo) {
	  log.info("Updating " + newGruppo.getCod_gruppo());
	    try {
	      userTransaction.begin();
	      em.merge(newGruppo);
	      userTransaction.commit();
	    } catch (Exception ex) {
	      try {
	        userTransaction.rollback();
	      } catch (Exception e) {
	        e.printStackTrace();
	      }
	      throw new RuntimeException("Updating the member failed: "+ex.toString());
	    }
	    //newGruppoEvent.fire(newGruppo);
  }
  
  @Override
  public void register(Gruppo newGruppo) {
    log.info("Registering " + newGruppo.getCod_gruppo());
    try {
      userTransaction.begin();
      em.persist(newGruppo);
      userTransaction.commit();
    } catch (Exception ex) {
      try {
        userTransaction.rollback();
      } catch (Exception e) {
        e.printStackTrace();
      }
      throw new RuntimeException("Registering the member failed: "+ex.toString());
    }
    newGruppoEvent.fire(newGruppo);
  }

  @Override
  public List<Gruppo> retrieveAllGruppoOrderedByName() {
    CriteriaBuilder cb = em.getCriteriaBuilder();
    CriteriaQuery<Gruppo> criteria = cb.createQuery(Gruppo.class);
    Root<Gruppo> gruppo = criteria.from(Gruppo.class);
    // Swap criteria statements if you would like to try out type-safe criteria queries, a new
    // feature in JPA 2.0
    // criteria.select(member).orderBy(cb.asc(member.get(Member_.name)));
    criteria.select(gruppo).orderBy(cb.asc(gruppo.get("cod_gruppo")));
    return em.createQuery(criteria).getResultList();
  }

}