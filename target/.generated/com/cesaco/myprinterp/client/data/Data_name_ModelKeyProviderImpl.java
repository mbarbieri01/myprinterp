package com.cesaco.myprinterp.client.data;

public class Data_name_ModelKeyProviderImpl implements com.sencha.gxt.data.shared.ModelKeyProvider<com.cesaco.myprinterp.client.data.Data> {
  public static final Data_name_ModelKeyProviderImpl INSTANCE = new Data_name_ModelKeyProviderImpl();
  public String getKey(com.cesaco.myprinterp.client.data.Data item) {
    return "" + item.getName();
  }
}
