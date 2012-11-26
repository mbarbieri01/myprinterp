package com.sencha.gxt.theme.base.client.status;

public class StatusBaseAppearance_StatusStyle_statusText_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.status.StatusBaseAppearance.StatusStyle, java.lang.String> {
  public static final StatusBaseAppearance_StatusStyle_statusText_ValueProviderImpl INSTANCE = new StatusBaseAppearance_StatusStyle_statusText_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.status.StatusBaseAppearance.StatusStyle object) {
    return object.statusText();
  }
  public void setValue(com.sencha.gxt.theme.base.client.status.StatusBaseAppearance.StatusStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "statusText";
  }
}
