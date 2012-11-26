package com.sencha.gxt.theme.base.client.frame;

public class DivFrame_DivFrameStyle_left_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.frame.DivFrame.DivFrameStyle, java.lang.String> {
  public static final DivFrame_DivFrameStyle_left_ValueProviderImpl INSTANCE = new DivFrame_DivFrameStyle_left_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.frame.DivFrame.DivFrameStyle object) {
    return object.left();
  }
  public void setValue(com.sencha.gxt.theme.base.client.frame.DivFrame.DivFrameStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "left";
  }
}
