package com.sencha.gxt.theme.base.client.tabs;

public class TabPanelBaseAppearance_TabPanelStyle_tabStrip_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance.TabPanelStyle, java.lang.String> {
  public static final TabPanelBaseAppearance_TabPanelStyle_tabStrip_ValueProviderImpl INSTANCE = new TabPanelBaseAppearance_TabPanelStyle_tabStrip_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance.TabPanelStyle object) {
    return object.tabStrip();
  }
  public void setValue(com.sencha.gxt.theme.base.client.tabs.TabPanelBaseAppearance.TabPanelStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "tabStrip";
  }
}
