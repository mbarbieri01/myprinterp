package com.sencha.gxt.theme.base.client.field;

public class FieldLabelDefaultAppearance_Style_clearLeft_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance.Style, java.lang.String> {
  public static final FieldLabelDefaultAppearance_Style_clearLeft_ValueProviderImpl INSTANCE = new FieldLabelDefaultAppearance_Style_clearLeft_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance.Style object) {
    return object.clearLeft();
  }
  public void setValue(com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance.Style object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "clearLeft";
  }
}
