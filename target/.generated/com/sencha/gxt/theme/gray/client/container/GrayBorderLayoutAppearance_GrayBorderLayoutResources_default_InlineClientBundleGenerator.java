package com.sencha.gxt.theme.gray.client.container;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class GrayBorderLayoutAppearance_GrayBorderLayoutResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.gray.client.container.GrayBorderLayoutAppearance.GrayBorderLayoutResources {
  private static GrayBorderLayoutAppearance_GrayBorderLayoutResources_default_InlineClientBundleGenerator _instance0 = new GrayBorderLayoutAppearance_GrayBorderLayoutResources_default_InlineClientBundleGenerator();
  private void cssInitializer() {
    css = new com.sencha.gxt.theme.gray.client.container.GrayBorderLayoutAppearance.GrayBorderLayoutStyle() {
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
        return (".GP34Q33HEC{background-color:" + ("#e6e6e6")  + ";}");
      }
      public java.lang.String child(){
        return "GP34Q33GEC";
      }
      public java.lang.String container(){
        return "GP34Q33HEC";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static com.sencha.gxt.theme.gray.client.container.GrayBorderLayoutAppearance.GrayBorderLayoutStyle get() {
      return css;
    }
  }
  public com.sencha.gxt.theme.gray.client.container.GrayBorderLayoutAppearance.GrayBorderLayoutStyle css() {
    return cssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.gray.client.container.GrayBorderLayoutAppearance.GrayBorderLayoutStyle css;
  
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
      case 'css': return this.@com.sencha.gxt.theme.gray.client.container.GrayBorderLayoutAppearance.GrayBorderLayoutResources::css()();
    }
    return null;
  }-*/;
}
