package com.cesaco.myprinterp.client.shared;

public class Gruppo_name_ModelLabelProviderImpl implements com.sencha.gxt.data.shared.LabelProvider<com.cesaco.myprinterp.client.shared.Gruppo> {
  public static final Gruppo_name_ModelLabelProviderImpl INSTANCE = new Gruppo_name_ModelLabelProviderImpl();
  public String getLabel(com.cesaco.myprinterp.client.shared.Gruppo item) {
    return item.getName();
  }
}
