package com.sencha.gxt.theme.base.client.toolbar;

public class SeparatorToolItemDefaultAppearance_SeparatorToolItemStyle_separator_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.toolbar.SeparatorToolItemDefaultAppearance.SeparatorToolItemStyle, java.lang.String> {
  public static final SeparatorToolItemDefaultAppearance_SeparatorToolItemStyle_separator_ValueProviderImpl INSTANCE = new SeparatorToolItemDefaultAppearance_SeparatorToolItemStyle_separator_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.toolbar.SeparatorToolItemDefaultAppearance.SeparatorToolItemStyle object) {
    return object.separator();
  }
  public void setValue(com.sencha.gxt.theme.base.client.toolbar.SeparatorToolItemDefaultAppearance.SeparatorToolItemStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "separator";
  }
}
