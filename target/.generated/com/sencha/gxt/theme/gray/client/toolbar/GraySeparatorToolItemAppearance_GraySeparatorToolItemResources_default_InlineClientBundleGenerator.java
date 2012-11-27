package com.sencha.gxt.theme.gray.client.toolbar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class GraySeparatorToolItemAppearance_GraySeparatorToolItemResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.gray.client.toolbar.GraySeparatorToolItemAppearance.GraySeparatorToolItemResources {
  private static GraySeparatorToolItemAppearance_GraySeparatorToolItemResources_default_InlineClientBundleGenerator _instance0 = new GraySeparatorToolItemAppearance_GraySeparatorToolItemResources_default_InlineClientBundleGenerator();
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
    css = new com.sencha.gxt.theme.base.client.toolbar.SeparatorToolItemDefaultAppearance.SeparatorToolItemStyle() {
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
        return (".GP34Q33MNB{height:" + ((GraySeparatorToolItemAppearance_GraySeparatorToolItemResources_default_InlineClientBundleGenerator.this.background()).getHeight() + "px")  + ";width:" + ((GraySeparatorToolItemAppearance_GraySeparatorToolItemResources_default_InlineClientBundleGenerator.this.background()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GraySeparatorToolItemAppearance_GraySeparatorToolItemResources_default_InlineClientBundleGenerator.this.background()).getSafeUri().asString() + "\") -" + (GraySeparatorToolItemAppearance_GraySeparatorToolItemResources_default_InlineClientBundleGenerator.this.background()).getLeft() + "px -" + (GraySeparatorToolItemAppearance_GraySeparatorToolItemResources_default_InlineClientBundleGenerator.this.background()).getTop() + "px  no-repeat")  + ";background-position:" + ("center"+ " " +"center")  + ";background-repeat:" + ("no-repeat")  + ";border:" + ("0"+ " " +"none")  + ";cursor:" + ("default")  + ";display:" + ("block")  + ";font-size:" + ("1px")  + ";height:") + (("16px")  + ";padding:" + ("0"+ " " +"3px")  + ";overflow:" + ("hidden")  + ";}");
      }
      public java.lang.String separator(){
        return "GP34Q33MNB";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static com.sencha.gxt.theme.base.client.toolbar.SeparatorToolItemDefaultAppearance.SeparatorToolItemStyle get() {
      return css;
    }
  }
  public com.sencha.gxt.theme.base.client.toolbar.SeparatorToolItemDefaultAppearance.SeparatorToolItemStyle css() {
    return cssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAIAAAANCAYAAACD4L/xAAAAEklEQVR42mPYtGnTfxBgoCMDAOJOW96nubqyAAAAAElFTkSuQmCC";
  private static com.google.gwt.resources.client.ImageResource background;
  private static com.sencha.gxt.theme.base.client.toolbar.SeparatorToolItemDefaultAppearance.SeparatorToolItemStyle css;
  
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
      case 'background': return this.@com.sencha.gxt.theme.gray.client.toolbar.GraySeparatorToolItemAppearance.GraySeparatorToolItemResources::background()();
      case 'css': return this.@com.sencha.gxt.theme.base.client.toolbar.SeparatorToolItemDefaultAppearance.SeparatorToolItemResources::css()();
    }
    return null;
  }-*/;
}
