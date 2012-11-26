package com.sencha.gxt.theme.base.client.toolbar;

public class LabelToolItemDefaultAppearance_LabelToolItemStyle_item_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.toolbar.LabelToolItemDefaultAppearance.LabelToolItemStyle, java.lang.String> {
  public static final LabelToolItemDefaultAppearance_LabelToolItemStyle_item_ValueProviderImpl INSTANCE = new LabelToolItemDefaultAppearance_LabelToolItemStyle_item_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.toolbar.LabelToolItemDefaultAppearance.LabelToolItemStyle object) {
    return object.item();
  }
  public void setValue(com.sencha.gxt.theme.base.client.toolbar.LabelToolItemDefaultAppearance.LabelToolItemStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "item";
  }
}
