package com.sencha.gxt.theme.base.client.status;

public class BoxStatusBaseAppearance_BoxStatusStyle_status_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.status.BoxStatusBaseAppearance.BoxStatusStyle, java.lang.String> {
  public static final BoxStatusBaseAppearance_BoxStatusStyle_status_ValueProviderImpl INSTANCE = new BoxStatusBaseAppearance_BoxStatusStyle_status_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.status.BoxStatusBaseAppearance.BoxStatusStyle object) {
    return object.status();
  }
  public void setValue(com.sencha.gxt.theme.base.client.status.BoxStatusBaseAppearance.BoxStatusStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "status";
  }
}
