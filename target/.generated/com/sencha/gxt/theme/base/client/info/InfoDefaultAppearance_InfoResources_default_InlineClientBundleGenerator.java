package com.sencha.gxt.theme.base.client.info;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class InfoDefaultAppearance_InfoResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoResources {
  private static InfoDefaultAppearance_InfoResources_default_InlineClientBundleGenerator _instance0 = new InfoDefaultAppearance_InfoResources_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDefaultStyle() {
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
        return (".GP34Q33MCB{color:" + ("white")  + ";}.GP34Q33OCB{font-size:" + ("13px")  + ";margin:" + ("4px")  + ";font-weight:" + ("bold")  + ";}.GP34Q33NCB{margin:" + ("0"+ " " +"4px"+ " " +"4px"+ " " +"4px")  + ";font-size:" + ("12px")  + ";}");
      }
      public java.lang.String info(){
        return "GP34Q33MCB";
      }
      public java.lang.String infoMessage(){
        return "GP34Q33NCB";
      }
      public java.lang.String infoTitle(){
        return "GP34Q33OCB";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDefaultStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDefaultStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDefaultStyle style;
  
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
      case 'style': return this.@com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoResources::style()();
    }
    return null;
  }-*/;
}
