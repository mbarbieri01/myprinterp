package com.cesaco.myprinterp.client.shared;

public class Gruppo_cod_gruppo_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.cesaco.myprinterp.client.shared.Gruppo, java.lang.String> {
  public static final Gruppo_cod_gruppo_ValueProviderImpl INSTANCE = new Gruppo_cod_gruppo_ValueProviderImpl();
  public java.lang.String getValue(com.cesaco.myprinterp.client.shared.Gruppo object) {
    return object.getCod_gruppo();
  }
  public void setValue(com.cesaco.myprinterp.client.shared.Gruppo object, java.lang.String value) {
    object.setCod_gruppo(value);
  }
  public String getPath() {
    return "cod_gruppo";
  }
}
