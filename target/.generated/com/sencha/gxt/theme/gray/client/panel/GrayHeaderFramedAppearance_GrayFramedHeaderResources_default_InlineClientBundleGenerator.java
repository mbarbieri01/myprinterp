package com.sencha.gxt.theme.gray.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class GrayHeaderFramedAppearance_GrayFramedHeaderResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.gray.client.panel.GrayHeaderFramedAppearance.GrayFramedHeaderResources {
  private static GrayHeaderFramedAppearance_GrayFramedHeaderResources_default_InlineClientBundleGenerator _instance0 = new GrayHeaderFramedAppearance_GrayFramedHeaderResources_default_InlineClientBundleGenerator();
  private void headerBackgroundInitializer() {
    headerBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "headerBackground",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 1, 149, false, false
    );
  }
  private static class headerBackgroundInitializer {
    static {
      _instance0.headerBackgroundInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return headerBackground;
    }
  }
  public com.google.gwt.resources.client.ImageResource headerBackground() {
    return headerBackgroundInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.gray.client.panel.GrayHeaderFramedAppearance.GrayHeaderFramedStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GP34Q33HKC{padding:" + ("4px"+ " " +"5px"+ " " +"2px"+ " " +"3px")  + ";position:" + ("relative")  + ";}.GP34Q33KKC{float:" + ("right")  + ";}.GP34Q33JKC .GP34Q33KKC{width:" + ("18px")  + ";}.GP34Q33JKC .GP34Q33LKC{right:" + ("20px")  + ";}.GP34Q33LKC{font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";font-size:" + ("11px")  + ";font-weight:" + ("bold")  + ";line-height:" + ("15px")  + ";}.GP34Q33IKC{float:" + ("left")  + ";}.GP34Q33HKC{height:") + (((GrayHeaderFramedAppearance_GrayFramedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayHeaderFramedAppearance_GrayFramedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getSafeUri().asString() + "\") -" + (GrayHeaderFramedAppearance_GrayFramedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getLeft() + "px -" + (GrayHeaderFramedAppearance_GrayFramedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getTop() + "px  repeat-x")  + ";color:" + ("#3c3c3c")  + ";font-weight:" + ("bold")  + ";font-size:" + ("11px")  + ";font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";border-color:" + ("#d0d0d0")  + ";height:" + ("auto")  + ";line-height:" + ("15px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#d0d0d0") ) + (";border-right:" + ("none")  + ";border-left:" + ("none")  + ";border-bottom:" + ("none")  + ";padding-right:" + ("0")  + ";}")) : ((".GP34Q33HKC{padding:" + ("4px"+ " " +"3px"+ " " +"2px"+ " " +"5px")  + ";position:" + ("relative")  + ";}.GP34Q33KKC{float:" + ("left")  + ";}.GP34Q33JKC .GP34Q33KKC{width:" + ("18px")  + ";}.GP34Q33JKC .GP34Q33LKC{left:" + ("20px")  + ";}.GP34Q33LKC{font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";font-size:" + ("11px")  + ";font-weight:" + ("bold")  + ";line-height:" + ("15px")  + ";}.GP34Q33IKC{float:" + ("right")  + ";}.GP34Q33HKC{height:") + (((GrayHeaderFramedAppearance_GrayFramedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayHeaderFramedAppearance_GrayFramedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getSafeUri().asString() + "\") -" + (GrayHeaderFramedAppearance_GrayFramedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getLeft() + "px -" + (GrayHeaderFramedAppearance_GrayFramedHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getTop() + "px  repeat-x")  + ";color:" + ("#3c3c3c")  + ";font-weight:" + ("bold")  + ";font-size:" + ("11px")  + ";font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";border-color:" + ("#d0d0d0")  + ";height:" + ("auto")  + ";line-height:" + ("15px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#d0d0d0") ) + (";border-left:" + ("none")  + ";border-right:" + ("none")  + ";border-bottom:" + ("none")  + ";padding-left:" + ("0")  + ";}"));
      }
      public java.lang.String header(){
        return "GP34Q33HKC";
      }
      public java.lang.String headerBar(){
        return "GP34Q33IKC";
      }
      public java.lang.String headerHasIcon(){
        return "GP34Q33JKC";
      }
      public java.lang.String headerIcon(){
        return "GP34Q33KKC";
      }
      public java.lang.String headerText(){
        return "GP34Q33LKC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.gray.client.panel.GrayHeaderFramedAppearance.GrayHeaderFramedStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.gray.client.panel.GrayHeaderFramedAppearance.GrayHeaderFramedStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAACVCAYAAACZ4pDcAAAAVklEQVR42u3EyQkEIQBFwZd/goqKiCIqLpjB7zl0DnPpOhT64d4rzjli7y3WWmLOKcYYovcuWmui1ipKKW85Z5FSEjHGtxCC8N4L55yw1gpjzNfXX3sAoN4PUJRhv5EAAAAASUVORK5CYII=";
  private static com.google.gwt.resources.client.ImageResource headerBackground;
  private static com.sencha.gxt.theme.gray.client.panel.GrayHeaderFramedAppearance.GrayHeaderFramedStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      headerBackground(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("headerBackground", headerBackground());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'headerBackground': return this.@com.sencha.gxt.theme.gray.client.panel.GrayHeaderFramedAppearance.GrayFramedHeaderResources::headerBackground()();
      case 'style': return this.@com.sencha.gxt.theme.gray.client.panel.GrayHeaderFramedAppearance.GrayFramedHeaderResources::style()();
    }
    return null;
  }-*/;
}
