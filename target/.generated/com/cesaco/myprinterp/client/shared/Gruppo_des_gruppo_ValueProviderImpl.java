package com.cesaco.myprinterp.client.shared;

public class Gruppo_des_gruppo_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.cesaco.myprinterp.client.shared.Gruppo, java.lang.String> {
  public static final Gruppo_des_gruppo_ValueProviderImpl INSTANCE = new Gruppo_des_gruppo_ValueProviderImpl();
  public java.lang.String getValue(com.cesaco.myprinterp.client.shared.Gruppo object) {
    return object.getDes_gruppo();
  }
  public void setValue(com.cesaco.myprinterp.client.shared.Gruppo object, java.lang.String value) {
    object.setDes_gruppo(value);
  }
  public String getPath() {
    return "des_gruppo";
  }
}
