package com.cesaco.myprinterp.client.charts;

public class LineExample_DataPropertyAccessImpl implements com.cesaco.myprinterp.client.charts.LineExample.DataPropertyAccess {
  public com.sencha.gxt.core.client.ValueProvider data1() {
    return com.cesaco.myprinterp.client.data.Data_data1_ValueProviderImpl.INSTANCE;
  }
  public com.sencha.gxt.core.client.ValueProvider data2() {
    return com.cesaco.myprinterp.client.data.Data_data2_ValueProviderImpl.INSTANCE;
  }
  public com.sencha.gxt.core.client.ValueProvider data3() {
    return com.cesaco.myprinterp.client.data.Data_data3_ValueProviderImpl.INSTANCE;
  }
  public com.sencha.gxt.core.client.ValueProvider name() {
    return com.cesaco.myprinterp.client.data.Data_name_ValueProviderImpl.INSTANCE;
  }
  public com.sencha.gxt.data.shared.ModelKeyProvider nameKey() {
    return com.cesaco.myprinterp.client.data.Data_name_ModelKeyProviderImpl.INSTANCE;
  }
}
