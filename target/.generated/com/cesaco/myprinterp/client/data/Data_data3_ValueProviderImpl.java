package com.cesaco.myprinterp.client.data;

public class Data_data3_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.cesaco.myprinterp.client.data.Data, java.lang.Double> {
  public static final Data_data3_ValueProviderImpl INSTANCE = new Data_data3_ValueProviderImpl();
  public java.lang.Double getValue(com.cesaco.myprinterp.client.data.Data object) {
    return object.getData3();
  }
  public void setValue(com.cesaco.myprinterp.client.data.Data object, java.lang.Double value) {
    object.setData3(value);
  }
  public String getPath() {
    return "data3";
  }
}
