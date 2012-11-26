package com.sencha.gxt.theme.gray.client.window;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class GrayWindowAppearance_GrayWindowResources_safari_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayWindowResources {
  private static GrayWindowAppearance_GrayWindowResources_safari_default_InlineClientBundleGenerator _instance0 = new GrayWindowAppearance_GrayWindowResources_safari_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayWindowStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GP34Q33AWC{border-style:" + ("solid")  + ";border-width:" + ("0")  + ";outline:" + ("0"+ " " +"none")  + ";zoom:" + ("1")  + ";-moz-outline:" + ("none")  + ";outline:" + ("0"+ " " +"none")  + ";}.GP34Q33PVC{border-top-width:" + ("1px")  + ";}.GP34Q33OVC{position:" + ("relative")  + ";}.GP34Q33KVC{border-bottom:" + ("1px"+ " " +"solid")  + ";border-right:" + ("1px"+ " " +"solid")  + ";border-left:") + (("1px"+ " " +"solid")  + ";border-top:" + ("0"+ " " +"none")  + ";overflow:" + ("hidden")  + ";position:" + ("relative")  + ";font:" + ("12px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.GP34Q33MVC{position:" + ("relative")  + ";}.GP34Q33NVC{z-index:" + ("12000")  + ";overflow:" + ("hidden")  + ";position:" + ("absolute")  + ";right:" + ("0")  + ";top:" + ("0") ) + (";opacity:" + ("0.5")  + ";}.GP34Q33NVC ul{margin:" + ("0")  + ";padding:" + ("0")  + ";overflow:" + ("hidden")  + ";font-size:" + ("0")  + ";line-height:" + ("0")  + ";border:" + ("1px"+ " " +"solid")  + ";border-top:" + ("0"+ " " +"none")  + ";display:" + ("block")  + ";}.GP34Q33NVC *{cursor:" + ("move")  + " !important;}.GP34Q33KVC{border:") + (("none")  + ";background:" + ("none")  + ";}.GP34Q33NVC ul{background-color:" + ("#d7d7d7")  + ";border-color:" + ("#a1a1a1")  + ";}")) : ((".GP34Q33AWC{border-style:" + ("solid")  + ";border-width:" + ("0")  + ";outline:" + ("0"+ " " +"none")  + ";zoom:" + ("1")  + ";-moz-outline:" + ("none")  + ";outline:" + ("0"+ " " +"none")  + ";}.GP34Q33PVC{border-top-width:" + ("1px")  + ";}.GP34Q33OVC{position:" + ("relative")  + ";}.GP34Q33KVC{border-bottom:" + ("1px"+ " " +"solid")  + ";border-left:" + ("1px"+ " " +"solid")  + ";border-right:") + (("1px"+ " " +"solid")  + ";border-top:" + ("0"+ " " +"none")  + ";overflow:" + ("hidden")  + ";position:" + ("relative")  + ";font:" + ("12px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.GP34Q33MVC{position:" + ("relative")  + ";}.GP34Q33NVC{z-index:" + ("12000")  + ";overflow:" + ("hidden")  + ";position:" + ("absolute")  + ";left:" + ("0")  + ";top:" + ("0") ) + (";opacity:" + ("0.5")  + ";}.GP34Q33NVC ul{margin:" + ("0")  + ";padding:" + ("0")  + ";overflow:" + ("hidden")  + ";font-size:" + ("0")  + ";line-height:" + ("0")  + ";border:" + ("1px"+ " " +"solid")  + ";border-top:" + ("0"+ " " +"none")  + ";display:" + ("block")  + ";}.GP34Q33NVC *{cursor:" + ("move")  + " !important;}.GP34Q33KVC{border:") + (("none")  + ";background:" + ("none")  + ";}.GP34Q33NVC ul{background-color:" + ("#d7d7d7")  + ";border-color:" + ("#a1a1a1")  + ";}"));
      }
      public java.lang.String body(){
        return "GP34Q33KVC";
      }
      public java.lang.String bodyWrap(){
        return "GP34Q33LVC";
      }
      public java.lang.String footer(){
        return "GP34Q33MVC";
      }
      public java.lang.String ghost(){
        return "GP34Q33NVC";
      }
      public java.lang.String header(){
        return "GP34Q33OVC";
      }
      public java.lang.String noHeader(){
        return "GP34Q33PVC";
      }
      public java.lang.String panel(){
        return "GP34Q33AWC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayWindowStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayWindowStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayWindowStyle style;
  
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
      case 'style': return this.@com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayWindowResources::style()();
    }
    return null;
  }-*/;
}
