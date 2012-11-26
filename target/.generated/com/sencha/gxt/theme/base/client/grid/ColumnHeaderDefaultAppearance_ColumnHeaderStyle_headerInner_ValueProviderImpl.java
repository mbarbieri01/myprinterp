package com.sencha.gxt.theme.base.client.grid;

public class ColumnHeaderDefaultAppearance_ColumnHeaderStyle_headerInner_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.grid.ColumnHeaderDefaultAppearance.ColumnHeaderStyle, java.lang.String> {
  public static final ColumnHeaderDefaultAppearance_ColumnHeaderStyle_headerInner_ValueProviderImpl INSTANCE = new ColumnHeaderDefaultAppearance_ColumnHeaderStyle_headerInner_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.grid.ColumnHeaderDefaultAppearance.ColumnHeaderStyle object) {
    return object.headerInner();
  }
  public void setValue(com.sencha.gxt.theme.base.client.grid.ColumnHeaderDefaultAppearance.ColumnHeaderStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "headerInner";
  }
}
