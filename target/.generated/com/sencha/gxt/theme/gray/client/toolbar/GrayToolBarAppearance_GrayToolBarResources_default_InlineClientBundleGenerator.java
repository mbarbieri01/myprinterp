package com.sencha.gxt.theme.gray.client.toolbar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class GrayToolBarAppearance_GrayToolBarResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.gray.client.toolbar.GrayToolBarAppearance.GrayToolBarResources {
  private static GrayToolBarAppearance_GrayToolBarResources_default_InlineClientBundleGenerator _instance0 = new GrayToolBarAppearance_GrayToolBarResources_default_InlineClientBundleGenerator();
  private void backgroundInitializer() {
    background = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "background",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 2, 100, false, false
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
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.gray.client.toolbar.GrayToolBarAppearance.GrayToolBarStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GP34Q33GSC{border-style:" + ("solid")  + ";border-width:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0")  + ";display:" + ("block")  + ";background:" + ("repeat-x"+ " " +"top"+ " " +"right")  + ";position:" + ("relative")  + ";right:" + ("0")  + ";top:" + ("0")  + ";zoom:" + ("1")  + ";overflow:" + ("hidden")  + ";width:" + ("auto")  + ";height:") + (("auto")  + ";border:" + ("none")  + ";}.x-toolbar-mark{border-width:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#d0d0d0")  + ";height:" + ((GrayToolBarAppearance_GrayToolBarResources_default_InlineClientBundleGenerator.this.background()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayToolBarAppearance_GrayToolBarResources_default_InlineClientBundleGenerator.this.background()).getSafeUri().asString() + "\") -" + (GrayToolBarAppearance_GrayToolBarResources_default_InlineClientBundleGenerator.this.background()).getLeft() + "px -" + (GrayToolBarAppearance_GrayToolBarResources_default_InlineClientBundleGenerator.this.background()).getTop() + "px  repeat-x")  + ";background-color:" + ("#f0f4f5")  + ";height:" + ("auto")  + ";}")) : ((".GP34Q33GSC{border-style:" + ("solid")  + ";border-width:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0")  + ";display:" + ("block")  + ";background:" + ("repeat-x"+ " " +"top"+ " " +"left")  + ";position:" + ("relative")  + ";left:" + ("0")  + ";top:" + ("0")  + ";zoom:" + ("1")  + ";overflow:" + ("hidden")  + ";width:" + ("auto")  + ";height:") + (("auto")  + ";border:" + ("none")  + ";}.x-toolbar-mark{border-width:" + ("0"+ " " +"0"+ " " +"1px"+ " " +"0")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#d0d0d0")  + ";height:" + ((GrayToolBarAppearance_GrayToolBarResources_default_InlineClientBundleGenerator.this.background()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayToolBarAppearance_GrayToolBarResources_default_InlineClientBundleGenerator.this.background()).getSafeUri().asString() + "\") -" + (GrayToolBarAppearance_GrayToolBarResources_default_InlineClientBundleGenerator.this.background()).getLeft() + "px -" + (GrayToolBarAppearance_GrayToolBarResources_default_InlineClientBundleGenerator.this.background()).getTop() + "px  repeat-x")  + ";background-color:" + ("#f0f4f5")  + ";height:" + ("auto")  + ";}"));
      }
      public java.lang.String moreButton(){
        return "GP34Q33FSC";
      }
      public java.lang.String toolBar(){
        return "GP34Q33GSC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.gray.client.toolbar.GrayToolBarAppearance.GrayToolBarStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.gray.client.toolbar.GrayToolBarAppearance.GrayToolBarStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAIAAABkCAYAAACsG+FjAAAAUElEQVR42u3GSwoAMQgE0dz/oCaaj96gh4aAGw8wixQUvIZbExHwRO8dPDHGAC+gquAJMwMvMOcET6y1wAvsvcET5xzwAu4OnogI8IeHf+IDvAz3JVHRh7UAAAAASUVORK5CYII=";
  private static com.google.gwt.resources.client.ImageResource background;
  private static com.sencha.gxt.theme.gray.client.toolbar.GrayToolBarAppearance.GrayToolBarStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      background(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("background", background());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'background': return this.@com.sencha.gxt.theme.gray.client.toolbar.GrayToolBarAppearance.GrayToolBarResources::background()();
      case 'style': return this.@com.sencha.gxt.theme.gray.client.toolbar.GrayToolBarAppearance.GrayToolBarResources::style()();
    }
    return null;
  }-*/;
}
