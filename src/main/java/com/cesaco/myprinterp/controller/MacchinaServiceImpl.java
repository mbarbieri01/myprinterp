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
import com.cesaco.myprinterp.client.shared.Macchina;
import com.cesaco.myprinterp.client.shared.MacchinaService;
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
public class MacchinaServiceImpl implements MacchinaService {

  @Inject
  private Logger log;

  @Inject
  private EntityManager em;

  @Inject
  private UserTransaction userTransaction;

  @Inject @New
  private Event<Macchina> newMacchinaEvent;

  @Override
  public void register(Macchina newMacchina) {
    log.info("Registering " + newMacchina.getCod_macchina());
    try {
      userTransaction.begin();
      em.persist(newMacchina);
      userTransaction.commit();
    } catch (Exception ex) {
      try {
        userTransaction.rollback();
      } catch (Exception e) {
        e.printStackTrace();
      }
      throw new RuntimeException("Registering the member failed: "+ex.toString());
    }
    newMacchinaEvent.fire(newMacchina);
  }

  @Override
  public List<Macchina> retrieveAllMacchinaOrderedByName() {
    CriteriaBuilder cb = em.getCriteriaBuilder();
    CriteriaQuery<Macchina> criteria = cb.createQuery(Macchina.class);
    Root<Macchina> macchina = criteria.from(Macchina.class);
    // Swap criteria statements if you would like to try out type-safe criteria queries, a new
    // feature in JPA 2.0
    // criteria.select(member).orderBy(cb.asc(member.get(Member_.name)));
    criteria.select(macchina).orderBy(cb.asc(macchina.get("cod_macchina")));
    return em.createQuery(criteria).getResultList();
  }

}