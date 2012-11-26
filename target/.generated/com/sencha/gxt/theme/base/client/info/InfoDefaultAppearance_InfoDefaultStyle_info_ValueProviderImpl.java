package com.sencha.gxt.theme.base.client.info;

public class InfoDefaultAppearance_InfoDefaultStyle_info_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDefaultStyle, java.lang.String> {
  public static final InfoDefaultAppearance_InfoDefaultStyle_info_ValueProviderImpl INSTANCE = new InfoDefaultAppearance_InfoDefaultStyle_info_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDefaultStyle object) {
    return object.info();
  }
  public void setValue(com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDefaultStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "info";
  }
}
