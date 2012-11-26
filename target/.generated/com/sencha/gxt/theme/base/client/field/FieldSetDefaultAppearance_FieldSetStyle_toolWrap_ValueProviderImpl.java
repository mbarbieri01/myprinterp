package com.sencha.gxt.theme.base.client.field;

public class FieldSetDefaultAppearance_FieldSetStyle_toolWrap_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.field.FieldSetDefaultAppearance.FieldSetStyle, java.lang.String> {
  public static final FieldSetDefaultAppearance_FieldSetStyle_toolWrap_ValueProviderImpl INSTANCE = new FieldSetDefaultAppearance_FieldSetStyle_toolWrap_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.field.FieldSetDefaultAppearance.FieldSetStyle object) {
    return object.toolWrap();
  }
  public void setValue(com.sencha.gxt.theme.base.client.field.FieldSetDefaultAppearance.FieldSetStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "toolWrap";
  }
}
