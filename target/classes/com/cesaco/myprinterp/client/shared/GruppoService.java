package com.cesaco.myprinterp.client.shared;

import java.util.List;

import org.jboss.errai.bus.server.annotations.Remote;


	@Remote
	public interface GruppoService {
	  public void register(Gruppo gruppo);
	  public void update(Gruppo gruppo);
	  public List<Gruppo> retrieveAllGruppoOrderedByName();
	}

