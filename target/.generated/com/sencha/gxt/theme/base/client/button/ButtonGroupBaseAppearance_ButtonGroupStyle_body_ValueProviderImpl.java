package com.sencha.gxt.theme.base.client.button;

public class ButtonGroupBaseAppearance_ButtonGroupStyle_body_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.button.ButtonGroupBaseAppearance.ButtonGroupStyle, java.lang.String> {
  public static final ButtonGroupBaseAppearance_ButtonGroupStyle_body_ValueProviderImpl INSTANCE = new ButtonGroupBaseAppearance_ButtonGroupStyle_body_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.button.ButtonGroupBaseAppearance.ButtonGroupStyle object) {
    return object.body();
  }
  public void setValue(com.sencha.gxt.theme.base.client.button.ButtonGroupBaseAppearance.ButtonGroupStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "body";
  }
}
