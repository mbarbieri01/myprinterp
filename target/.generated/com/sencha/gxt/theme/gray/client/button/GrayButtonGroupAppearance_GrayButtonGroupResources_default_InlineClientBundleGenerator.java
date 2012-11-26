package com.sencha.gxt.theme.gray.client.button;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class GrayButtonGroupAppearance_GrayButtonGroupResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.gray.client.button.GrayButtonGroupAppearance.GrayButtonGroupResources {
  private static GrayButtonGroupAppearance_GrayButtonGroupResources_default_InlineClientBundleGenerator _instance0 = new GrayButtonGroupAppearance_GrayButtonGroupResources_default_InlineClientBundleGenerator();
  private void cssInitializer() {
    css = new com.sencha.gxt.theme.base.client.button.ButtonGroupBaseAppearance.ButtonGroupStyle() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "css";
      }
      public String getText() {
        return (".GP34Q33ON{padding:" + ("1px")  + ";}.GP34Q33AO{font:" + ("11px"+ " " +"arial"+ ","+ " " +"tahoma"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";color:" + ("#3e6aaa")  + ";padding:" + ("2px")  + ";text-align:" + ("center")  + ";color:" + ("black")  + ";}");
      }
      public java.lang.String body(){
        return "GP34Q33NN";
      }
      public java.lang.String group(){
        return "GP34Q33ON";
      }
      public java.lang.String header(){
        return "GP34Q33PN";
      }
      public java.lang.String text(){
        return "GP34Q33AO";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static com.sencha.gxt.theme.base.client.button.ButtonGroupBaseAppearance.ButtonGroupStyle get() {
      return css;
    }
  }
  public com.sencha.gxt.theme.base.client.button.ButtonGroupBaseAppearance.ButtonGroupStyle css() {
    return cssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.base.client.button.ButtonGroupBaseAppearance.ButtonGroupStyle css;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      css(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("css", css());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'css': return this.@com.sencha.gxt.theme.gray.client.button.GrayButtonGroupAppearance.GrayButtonGroupResources::css()();
    }
    return null;
  }-*/;
}
