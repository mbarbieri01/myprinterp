package com.sencha.gxt.theme.gray.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class GrayContentPanelAppearance_GrayContentPanelResources_safari_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.gray.client.panel.GrayContentPanelAppearance.GrayContentPanelResources {
  private static GrayContentPanelAppearance_GrayContentPanelResources_safari_default_InlineClientBundleGenerator _instance0 = new GrayContentPanelAppearance_GrayContentPanelResources_safari_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.gray.client.panel.GrayContentPanelAppearance.GrayContentPanelStyle() {
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
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GP34Q33OIC{border-style:" + ("solid")  + ";border-width:" + ("0")  + ";outline:" + ("0"+ " " +"none")  + ";border-color:" + ("#d0d0d0")  + ";}.GP34Q33NIC{border-top-width:" + ("1px")  + ";}.GP34Q33MIC{position:" + ("relative")  + ";}.GP34Q33JIC{border-bottom:" + ("1px"+ " " +"solid")  + ";border-right:" + ("1px"+ " " +"solid")  + ";border-left:" + ("1px"+ " " +"solid")  + ";border-top:" + ("0"+ " " +"none")  + ";overflow:") + (("hidden")  + ";position:" + ("relative")  + ";background-color:" + ("#fff")  + ";border-color:" + ("#d0d0d0")  + ";}.GP34Q33LIC{position:" + ("relative")  + ";}")) : ((".GP34Q33OIC{border-style:" + ("solid")  + ";border-width:" + ("0")  + ";outline:" + ("0"+ " " +"none")  + ";border-color:" + ("#d0d0d0")  + ";}.GP34Q33NIC{border-top-width:" + ("1px")  + ";}.GP34Q33MIC{position:" + ("relative")  + ";}.GP34Q33JIC{border-bottom:" + ("1px"+ " " +"solid")  + ";border-left:" + ("1px"+ " " +"solid")  + ";border-right:" + ("1px"+ " " +"solid")  + ";border-top:" + ("0"+ " " +"none")  + ";overflow:") + (("hidden")  + ";position:" + ("relative")  + ";background-color:" + ("#fff")  + ";border-color:" + ("#d0d0d0")  + ";}.GP34Q33LIC{position:" + ("relative")  + ";}"));
      }
      public java.lang.String body(){
        return "GP34Q33JIC";
      }
      public java.lang.String bodyWrap(){
        return "GP34Q33KIC";
      }
      public java.lang.String footer(){
        return "GP34Q33LIC";
      }
      public java.lang.String header(){
        return "GP34Q33MIC";
      }
      public java.lang.String noHeader(){
        return "GP34Q33NIC";
      }
      public java.lang.String panel(){
        return "GP34Q33OIC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.gray.client.panel.GrayContentPanelAppearance.GrayContentPanelStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.gray.client.panel.GrayContentPanelAppearance.GrayContentPanelStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.gray.client.panel.GrayContentPanelAppearance.GrayContentPanelStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.sencha.gxt.theme.gray.client.panel.GrayContentPanelAppearance.GrayContentPanelResources::style()();
    }
    return null;
  }-*/;
}