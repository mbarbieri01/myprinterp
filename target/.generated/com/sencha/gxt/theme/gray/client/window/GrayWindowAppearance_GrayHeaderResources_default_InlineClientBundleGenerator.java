package com.sencha.gxt.theme.gray.client.window;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class GrayWindowAppearance_GrayHeaderResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayHeaderResources {
  private static GrayWindowAppearance_GrayHeaderResources_default_InlineClientBundleGenerator _instance0 = new GrayWindowAppearance_GrayHeaderResources_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayHeaderStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GP34Q33IUC{padding:" + ("4px"+ " " +"5px"+ " " +"2px"+ " " +"3px")  + ";position:" + ("relative")  + ";}.GP34Q33LUC{float:" + ("right")  + ";}.GP34Q33KUC .GP34Q33LUC{width:" + ("18px")  + ";}.GP34Q33KUC .GP34Q33MUC{right:" + ("20px")  + ";}.GP34Q33MUC{font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";font-size:" + ("11px")  + ";font-weight:" + ("bold")  + ";line-height:" + ("15px")  + ";}.GP34Q33JUC{float:" + ("left")  + ";}.GP34Q33IUC{color:") + (("#3c3c3c")  + ";font-weight:" + ("bold")  + ";font-size:" + ("11px")  + ";font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";padding:" + ("5px"+ " " +"0"+ " " +"4px")  + ";}")) : ((".GP34Q33IUC{padding:" + ("4px"+ " " +"3px"+ " " +"2px"+ " " +"5px")  + ";position:" + ("relative")  + ";}.GP34Q33LUC{float:" + ("left")  + ";}.GP34Q33KUC .GP34Q33LUC{width:" + ("18px")  + ";}.GP34Q33KUC .GP34Q33MUC{left:" + ("20px")  + ";}.GP34Q33MUC{font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";font-size:" + ("11px")  + ";font-weight:" + ("bold")  + ";line-height:" + ("15px")  + ";}.GP34Q33JUC{float:" + ("right")  + ";}.GP34Q33IUC{color:") + (("#3c3c3c")  + ";font-weight:" + ("bold")  + ";font-size:" + ("11px")  + ";font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";padding:" + ("5px"+ " " +"0"+ " " +"4px")  + ";}"));
      }
      public java.lang.String header(){
        return "GP34Q33IUC";
      }
      public java.lang.String headerBar(){
        return "GP34Q33JUC";
      }
      public java.lang.String headerHasIcon(){
        return "GP34Q33KUC";
      }
      public java.lang.String headerIcon(){
        return "GP34Q33LUC";
      }
      public java.lang.String headerText(){
        return "GP34Q33MUC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayHeaderStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayHeaderStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayHeaderStyle style;
  
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
      case 'style': return this.@com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayHeaderResources::style()();
    }
    return null;
  }-*/;
}
