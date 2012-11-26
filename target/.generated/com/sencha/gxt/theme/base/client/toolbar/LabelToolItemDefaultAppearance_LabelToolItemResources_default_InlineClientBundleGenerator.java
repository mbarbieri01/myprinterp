package com.sencha.gxt.theme.base.client.toolbar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class LabelToolItemDefaultAppearance_LabelToolItemResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.base.client.toolbar.LabelToolItemDefaultAppearance.LabelToolItemResources {
  private static LabelToolItemDefaultAppearance_LabelToolItemResources_default_InlineClientBundleGenerator _instance0 = new LabelToolItemDefaultAppearance_LabelToolItemResources_default_InlineClientBundleGenerator();
  private void backgroundInitializer() {
    background = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "background",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 2, 13, false, false
    );
  }
  private static class backgroundInitializer {
    static {
      _instance0.backgroundInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return background;
    }
  }
  public com.google.gwt.resources.client.ImageResource background() {
    return backgroundInitializer.get();
  }
  private void cssInitializer() {
    css = new com.sencha.gxt.theme.base.client.toolbar.LabelToolItemDefaultAppearance.LabelToolItemStyle() {
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
        return (".GP34Q33LNB{display:" + ("block")  + ";line-height:" + ("16px")  + ";padding:" + ("2px"+ " " +"2px"+ " " +"0"+ " " +"2px")  + ";font:" + ("11px"+ " " +"arial"+ ","+ " " +"tahoma"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";white-space:" + ("nowrap")  + ";}");
      }
      public java.lang.String item(){
        return "GP34Q33LNB";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static com.sencha.gxt.theme.base.client.toolbar.LabelToolItemDefaultAppearance.LabelToolItemStyle get() {
      return css;
    }
  }
  public com.sencha.gxt.theme.base.client.toolbar.LabelToolItemDefaultAppearance.LabelToolItemStyle css() {
    return cssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAIAAAANCAYAAACD4L/xAAAAEUlEQVR42mOYdew/GDDQkQEAv11fk6zspTEAAAAASUVORK5CYII=";
  private static com.google.gwt.resources.client.ImageResource background;
  private static com.sencha.gxt.theme.base.client.toolbar.LabelToolItemDefaultAppearance.LabelToolItemStyle css;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      background(), 
      css(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("background", background());
        resourceMap.put("css", css());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'background': return this.@com.sencha.gxt.theme.base.client.toolbar.LabelToolItemDefaultAppearance.LabelToolItemResources::background()();
      case 'css': return this.@com.sencha.gxt.theme.base.client.toolbar.LabelToolItemDefaultAppearance.LabelToolItemResources::css()();
    }
    return null;
  }-*/;
}
