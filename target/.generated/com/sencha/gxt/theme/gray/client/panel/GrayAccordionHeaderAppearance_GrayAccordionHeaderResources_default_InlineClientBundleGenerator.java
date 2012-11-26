package com.sencha.gxt.theme.gray.client.panel;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class GrayAccordionHeaderAppearance_GrayAccordionHeaderResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.gray.client.panel.GrayAccordionHeaderAppearance.GrayAccordionHeaderResources {
  private static GrayAccordionHeaderAppearance_GrayAccordionHeaderResources_default_InlineClientBundleGenerator _instance0 = new GrayAccordionHeaderAppearance_GrayAccordionHeaderResources_default_InlineClientBundleGenerator();
  private void headerBackgroundInitializer() {
    headerBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "headerBackground",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 1, 46, false, false
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
    style = new com.sencha.gxt.theme.gray.client.panel.GrayAccordionHeaderAppearance.GrayAccordionHeaderStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GP34Q33OHC{padding:" + ("4px"+ " " +"5px"+ " " +"2px"+ " " +"3px")  + ";position:" + ("relative")  + ";}.GP34Q33BIC{float:" + ("right")  + ";}.GP34Q33AIC .GP34Q33BIC{width:" + ("18px")  + ";}.GP34Q33AIC .GP34Q33CIC{right:" + ("20px")  + ";}.GP34Q33CIC{font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";font-size:" + ("11px")  + ";font-weight:" + ("bold")  + ";line-height:" + ("15px")  + ";}.GP34Q33PHC{float:" + ("left")  + ";}.GP34Q33OHC{height:") + (((GrayAccordionHeaderAppearance_GrayAccordionHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayAccordionHeaderAppearance_GrayAccordionHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getSafeUri().asString() + "\") -" + (GrayAccordionHeaderAppearance_GrayAccordionHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getLeft() + "px -" + (GrayAccordionHeaderAppearance_GrayAccordionHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getTop() + "px  repeat-x")  + ";color:" + ("#3c3c3c")  + ";font-weight:" + ("bold")  + ";font-size:" + ("11px")  + ";font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";border-color:" + ("#d0d0d0")  + ";height:" + ("auto")  + ";line-height:" + ("15px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#d0d0d0") ) + (";height:" + ((GrayAccordionHeaderAppearance_GrayAccordionHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayAccordionHeaderAppearance_GrayAccordionHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getSafeUri().asString() + "\") -" + (GrayAccordionHeaderAppearance_GrayAccordionHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getLeft() + "px -" + (GrayAccordionHeaderAppearance_GrayAccordionHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getTop() + "px  repeat-x")  + ";padding-top:" + ("4px")  + ";padding-bottom:" + ("3px")  + ";border-top:" + ("0"+ " " +"none")  + ";background-position:" + ("0"+ " " +"-9px")  + ";height:" + ("auto")  + ";}.GP34Q33CIC{color:" + ("#222")  + ";font-weight:" + ("normal")  + ";}")) : ((".GP34Q33OHC{padding:" + ("4px"+ " " +"3px"+ " " +"2px"+ " " +"5px")  + ";position:" + ("relative")  + ";}.GP34Q33BIC{float:" + ("left")  + ";}.GP34Q33AIC .GP34Q33BIC{width:" + ("18px")  + ";}.GP34Q33AIC .GP34Q33CIC{left:" + ("20px")  + ";}.GP34Q33CIC{font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";font-size:" + ("11px")  + ";font-weight:" + ("bold")  + ";line-height:" + ("15px")  + ";}.GP34Q33PHC{float:" + ("right")  + ";}.GP34Q33OHC{height:") + (((GrayAccordionHeaderAppearance_GrayAccordionHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayAccordionHeaderAppearance_GrayAccordionHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getSafeUri().asString() + "\") -" + (GrayAccordionHeaderAppearance_GrayAccordionHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getLeft() + "px -" + (GrayAccordionHeaderAppearance_GrayAccordionHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getTop() + "px  repeat-x")  + ";color:" + ("#3c3c3c")  + ";font-weight:" + ("bold")  + ";font-size:" + ("11px")  + ";font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";border-color:" + ("#d0d0d0")  + ";height:" + ("auto")  + ";line-height:" + ("15px")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#d0d0d0") ) + (";height:" + ((GrayAccordionHeaderAppearance_GrayAccordionHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayAccordionHeaderAppearance_GrayAccordionHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getSafeUri().asString() + "\") -" + (GrayAccordionHeaderAppearance_GrayAccordionHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getLeft() + "px -" + (GrayAccordionHeaderAppearance_GrayAccordionHeaderResources_default_InlineClientBundleGenerator.this.headerBackground()).getTop() + "px  repeat-x")  + ";padding-top:" + ("4px")  + ";padding-bottom:" + ("3px")  + ";border-top:" + ("0"+ " " +"none")  + ";background-position:" + ("0"+ " " +"-9px")  + ";height:" + ("auto")  + ";}.GP34Q33CIC{color:" + ("#222")  + ";font-weight:" + ("normal")  + ";}"));
      }
      public java.lang.String header(){
        return "GP34Q33OHC";
      }
      public java.lang.String headerBar(){
        return "GP34Q33PHC";
      }
      public java.lang.String headerHasIcon(){
        return "GP34Q33AIC";
      }
      public java.lang.String headerIcon(){
        return "GP34Q33BIC";
      }
      public java.lang.String headerText(){
        return "GP34Q33CIC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.gray.client.panel.GrayAccordionHeaderAppearance.GrayAccordionHeaderStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.gray.client.panel.GrayAccordionHeaderAppearance.GrayAccordionHeaderStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAAuCAYAAADp73NqAAAAP0lEQVR42s3IMQrAQAhE0bn/Oe0UEWVFbCZhqxwhv3jFx+4Sb1/umxmiu4lzDlFVRGYSEUG4O2FmhKoSIvJnHm+RoqagUoYHAAAAAElFTkSuQmCC";
  private static com.google.gwt.resources.client.ImageResource headerBackground;
  private static com.sencha.gxt.theme.gray.client.panel.GrayAccordionHeaderAppearance.GrayAccordionHeaderStyle style;
  
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
      case 'headerBackground': return this.@com.sencha.gxt.theme.gray.client.panel.GrayAccordionHeaderAppearance.GrayAccordionHeaderResources::headerBackground()();
      case 'style': return this.@com.sencha.gxt.theme.gray.client.panel.GrayAccordionHeaderAppearance.GrayAccordionHeaderResources::style()();
    }
    return null;
  }-*/;
}
