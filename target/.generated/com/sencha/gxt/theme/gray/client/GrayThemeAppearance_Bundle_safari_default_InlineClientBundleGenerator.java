package com.sencha.gxt.theme.gray.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class GrayThemeAppearance_Bundle_safari_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.gray.client.GrayThemeAppearance.Bundle {
  private static GrayThemeAppearance_Bundle_safari_default_InlineClientBundleGenerator _instance0 = new GrayThemeAppearance_Bundle_safari_default_InlineClientBundleGenerator();
  private void cssInitializer() {
    css = new com.sencha.gxt.core.client.resources.ThemeStyles.Styles() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((":focus{outline:" + ("none")  + " !important;}.GP34Q33AM{border:" + ("1px"+ " " +"solid"+ " " +"#d0d0d0")  + " !important;}.GP34Q33EM{border:" + ("none")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#d0d0d0")  + " !important;}.GP34Q33FM{border:" + ("none")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#d0d0d0")  + " !important;}.GP34Q33GM{border:" + ("none")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#d0d0d0")  + " !important;}.GP34Q33BM{border:" + ("none")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#d0d0d0")  + " !important;}")) : ((":focus{outline:" + ("none")  + " !important;}.GP34Q33AM{border:" + ("1px"+ " " +"solid"+ " " +"#d0d0d0")  + " !important;}.GP34Q33EM{border:" + ("none")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#d0d0d0")  + " !important;}.GP34Q33FM{border:" + ("none")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#d0d0d0")  + " !important;}.GP34Q33GM{border:" + ("none")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#d0d0d0")  + " !important;}.GP34Q33BM{border:" + ("none")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#d0d0d0")  + " !important;}"));
      }
      public java.lang.String backgroundColorLight() {
        return "#e7e7e7";
      }
      public java.lang.String border(){
        return "GP34Q33AM";
      }
      public java.lang.String borderBottom(){
        return "GP34Q33BM";
      }
      public java.lang.String borderColor() {
        return "#d0d0d0";
      }
      public java.lang.String borderColorLight() {
        return "orange";
      }
      public java.lang.String borderLeft(){
        return "GP34Q33EM";
      }
      public java.lang.String borderRight(){
        return "GP34Q33FM";
      }
      public java.lang.String borderTop(){
        return "GP34Q33GM";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static com.sencha.gxt.core.client.resources.ThemeStyles.Styles get() {
      return css;
    }
  }
  public com.sencha.gxt.core.client.resources.ThemeStyles.Styles css() {
    return cssInitializer.get();
  }
  private void moreInitializer() {
    more = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "more",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 12, 16, false, false
    );
  }
  private static class moreInitializer {
    static {
      _instance0.moreInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return more;
    }
  }
  public com.google.gwt.resources.client.ImageResource more() {
    return moreInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.core.client.resources.ThemeStyles.Styles css;
  private static final java.lang.String externalImage = "data:image/gif;base64,R0lGODlhDAAQAKIAAAAAAP///0RERENDQ0JCQv///wAAAAAAACH5BAEAAAUALAAAAAAMABAAAAMcWLrc/jDKCcdQ4rohlH0CgYmM0BUfk5pU675SAgA7";
  private static com.google.gwt.resources.client.ImageResource more;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      css(), 
      more(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("css", css());
        resourceMap.put("more", more());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'css': return this.@com.sencha.gxt.theme.gray.client.GrayThemeAppearance.Bundle::css()();
      case 'more': return this.@com.sencha.gxt.theme.gray.client.GrayThemeAppearance.Bundle::more()();
    }
    return null;
  }-*/;
}
