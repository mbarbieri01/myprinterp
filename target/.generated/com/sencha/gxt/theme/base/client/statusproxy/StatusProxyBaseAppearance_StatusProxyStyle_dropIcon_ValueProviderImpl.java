package com.sencha.gxt.theme.base.client.statusproxy;

public class StatusProxyBaseAppearance_StatusProxyStyle_dropIcon_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.statusproxy.StatusProxyBaseAppearance.StatusProxyStyle, java.lang.String> {
  public static final StatusProxyBaseAppearance_StatusProxyStyle_dropIcon_ValueProviderImpl INSTANCE = new StatusProxyBaseAppearance_StatusProxyStyle_dropIcon_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.statusproxy.StatusProxyBaseAppearance.StatusProxyStyle object) {
    return object.dropIcon();
  }
  public void setValue(com.sencha.gxt.theme.base.client.statusproxy.StatusProxyBaseAppearance.StatusProxyStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "dropIcon";
  }
}
