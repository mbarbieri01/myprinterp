package com.cesaco.myprinterp.client.shared;

public class Gruppo_abbr_ModelKeyProviderImpl implements com.sencha.gxt.data.shared.ModelKeyProvider<com.cesaco.myprinterp.client.shared.Gruppo> {
  public static final Gruppo_abbr_ModelKeyProviderImpl INSTANCE = new Gruppo_abbr_ModelKeyProviderImpl();
  public String getKey(com.cesaco.myprinterp.client.shared.Gruppo item) {
    return "" + item.getAbbr();
  }
}
