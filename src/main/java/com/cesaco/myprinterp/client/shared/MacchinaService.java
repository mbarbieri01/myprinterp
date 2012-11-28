package com.cesaco.myprinterp.client.shared;

import java.util.List;

import org.jboss.errai.bus.server.annotations.Remote;


	@Remote
	public interface MacchinaService {
	  public void register(Macchina macchina);
	  public void update(Macchina macchina);
	  public List<Macchina> retrieveAllMacchinaOrderedByName();
	}

