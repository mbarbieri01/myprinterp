package com.sencha.gxt.state.client;

import com.google.gwt.core.client.GWT;

public class StateManagerImpl_DefaultStateAutoBeanFactory extends com.sencha.gxt.state.client.StateManager {
  public com.sencha.gxt.state.client.DefaultStateAutoBeanFactory getStateBeanFactory() {
    return GWT.create(com.sencha.gxt.state.client.DefaultStateAutoBeanFactory.class);
  }
}
