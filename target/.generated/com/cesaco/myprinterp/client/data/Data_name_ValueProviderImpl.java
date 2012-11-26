package com.cesaco.myprinterp.client.data;

public class Data_name_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.cesaco.myprinterp.client.data.Data, java.lang.String> {
  public static final Data_name_ValueProviderImpl INSTANCE = new Data_name_ValueProviderImpl();
  public java.lang.String getValue(com.cesaco.myprinterp.client.data.Data object) {
    return object.getName();
  }
  public void setValue(com.cesaco.myprinterp.client.data.Data object, java.lang.String value) {
    object.setName(value);
  }
  public String getPath() {
    return "name";
  }
}
