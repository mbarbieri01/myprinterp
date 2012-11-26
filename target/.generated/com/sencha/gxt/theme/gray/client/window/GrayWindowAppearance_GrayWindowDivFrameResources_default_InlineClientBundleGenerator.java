package com.sencha.gxt.theme.gray.client.window;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayWindowDivFrameResources {
  private static GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator _instance0 = new GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator();
  private void backgroundInitializer() {
    background = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "background",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 3, 3, false, false
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
  private void bottomBorderInitializer() {
    bottomBorder = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "bottomBorder",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 1, 6, false, false
    );
  }
  private static class bottomBorderInitializer {
    static {
      _instance0.bottomBorderInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return bottomBorder;
    }
  }
  public com.google.gwt.resources.client.ImageResource bottomBorder() {
    return bottomBorderInitializer.get();
  }
  private void bottomLeftBorderInitializer() {
    bottomLeftBorder = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "bottomLeftBorder",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 6, 6, false, false
    );
  }
  private static class bottomLeftBorderInitializer {
    static {
      _instance0.bottomLeftBorderInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return bottomLeftBorder;
    }
  }
  public com.google.gwt.resources.client.ImageResource bottomLeftBorder() {
    return bottomLeftBorderInitializer.get();
  }
  private void bottomRightBorderInitializer() {
    bottomRightBorder = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "bottomRightBorder",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage2),
      0, 0, 6, 6, false, false
    );
  }
  private static class bottomRightBorderInitializer {
    static {
      _instance0.bottomRightBorderInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return bottomRightBorder;
    }
  }
  public com.google.gwt.resources.client.ImageResource bottomRightBorder() {
    return bottomRightBorderInitializer.get();
  }
  private void leftBorderInitializer() {
    leftBorder = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "leftBorder",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage3),
      0, 0, 6, 5, false, false
    );
  }
  private static class leftBorderInitializer {
    static {
      _instance0.leftBorderInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return leftBorder;
    }
  }
  public com.google.gwt.resources.client.ImageResource leftBorder() {
    return leftBorderInitializer.get();
  }
  private void rightBorderInitializer() {
    rightBorder = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "rightBorder",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage4),
      0, 0, 6, 5, false, false
    );
  }
  private static class rightBorderInitializer {
    static {
      _instance0.rightBorderInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return rightBorder;
    }
  }
  public com.google.gwt.resources.client.ImageResource rightBorder() {
    return rightBorderInitializer.get();
  }
  private void topBorderInitializer() {
    topBorder = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "topBorder",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage5),
      0, 0, 1, 150, false, false
    );
  }
  private static class topBorderInitializer {
    static {
      _instance0.topBorderInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return topBorder;
    }
  }
  public com.google.gwt.resources.client.ImageResource topBorder() {
    return topBorderInitializer.get();
  }
  private void topLeftBorderInitializer() {
    topLeftBorder = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "topLeftBorder",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage6),
      0, 0, 6, 150, false, false
    );
  }
  private static class topLeftBorderInitializer {
    static {
      _instance0.topLeftBorderInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return topLeftBorder;
    }
  }
  public com.google.gwt.resources.client.ImageResource topLeftBorder() {
    return topLeftBorderInitializer.get();
  }
  private void topRightBorderInitializer() {
    topRightBorder = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "topRightBorder",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage7),
      0, 0, 6, 150, false, false
    );
  }
  private static class topRightBorderInitializer {
    static {
      _instance0.topRightBorderInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return topRightBorder;
    }
  }
  public com.google.gwt.resources.client.ImageResource topRightBorder() {
    return topRightBorderInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayWindowDivFrameStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GP34Q33CVC{position:" + ("relative")  + ";outline:" + ("none")  + ";}.GP34Q33BVC{height:" + ((GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.background()).getHeight() + "px")  + ";width:" + ((GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.background()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.background()).getSafeUri().asString() + "\") -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.background()).getLeft() + "px -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.background()).getTop() + "px  no-repeat")  + ";overflow:" + ("visible")  + ";height:" + ("auto")  + ";width:" + ("auto")  + ";}.GP34Q33IVC{height:" + ((GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topLeftBorder()).getHeight() + "px")  + ";width:") + (((GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topLeftBorder()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topLeftBorder()).getSafeUri().asString() + "\") -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topLeftBorder()).getLeft() + "px -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topLeftBorder()).getTop() + "px  no-repeat")  + ";padding-right:" + (topLeftBorder().getWidth() + "px")  + ";zoom:" + ("1")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";}.GP34Q33HVC{height:" + ((GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topBorder()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topBorder()).getSafeUri().asString() + "\") -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topBorder()).getLeft() + "px -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topBorder()).getTop() + "px  repeat-x")  + ";width:" + ("auto") ) + (";}.GP34Q33JVC{overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topRightBorder()).getSafeUri().asString() + "\") -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topRightBorder()).getLeft() + "px -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topRightBorder()).getTop() + "px  repeat")  + ";background-repeat:" + ("no-repeat")  + ";background-position:" + ("left"+ " " +"0")  + ";zoom:" + ("1")  + ";padding-left:" + (topRightBorder().getWidth() + "px")  + ";width:" + ("auto")  + ";}.GP34Q33PUC{overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.bottomLeftBorder()).getSafeUri().asString() + "\") -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.bottomLeftBorder()).getLeft() + "px -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.bottomLeftBorder()).getTop() + "px  repeat")  + ";background-repeat:" + ("no-repeat")  + ";width:") + (("auto")  + ";background-position:" + ("0"+ " " +"bottom")  + ";padding-right:" + (bottomLeftBorder().getWidth() + "px")  + ";zoom:" + ("1")  + ";line-height:" + ("1px")  + ";font-size:" + ("1px")  + ";}.GP34Q33OUC{overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.bottomBorder()).getSafeUri().asString() + "\") -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.bottomBorder()).getLeft() + "px -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.bottomBorder()).getTop() + "px  repeat")  + ";background-position:" + ("0"+ " " +"bottom")  + ";zoom:" + ("1")  + ";width:" + ("auto") ) + (";overflow:" + ("visible")  + ";height:" + (bottomBorder().getHeight() + "px")  + ";line-height:" + ("1px")  + ";font-size:" + ("1px")  + ";}.GP34Q33AVC{overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.bottomRightBorder()).getSafeUri().asString() + "\") -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.bottomRightBorder()).getLeft() + "px -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.bottomRightBorder()).getTop() + "px  repeat")  + ";background-repeat:" + ("no-repeat")  + ";background-position:" + ("left"+ " " +"bottom")  + ";padding-left:" + (bottomRightBorder().getWidth() + "px")  + ";zoom:" + ("1")  + ";width:") + (("auto")  + ";height:" + ("auto")  + ";line-height:" + ("1px")  + ";font-size:" + ("1px")  + ";}.GP34Q33DVC{width:" + ((GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.leftBorder()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.leftBorder()).getSafeUri().asString() + "\") -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.leftBorder()).getLeft() + "px -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.leftBorder()).getTop() + "px  repeat-y")  + ";padding-right:" + (bottomLeftBorder().getWidth() + "px")  + ";zoom:" + ("1")  + ";overflow:" + ("visible")  + ";height:" + ("auto") ) + (";width:" + ("auto")  + ";}.GP34Q33GVC{overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.rightBorder()).getSafeUri().asString() + "\") -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.rightBorder()).getLeft() + "px -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.rightBorder()).getTop() + "px  repeat")  + ";background-repeat:" + ("repeat-y")  + ";background-position:" + ("left"+ " " +"0")  + ";padding-left:" + (rightBorder().getWidth() + "px")  + ";overflow:" + ("visible")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";}.GP34Q33IVC{height:" + ("auto")  + ";border:") + (("none")  + ";}.GP34Q33HVC,.GP34Q33JVC{height:" + ("auto")  + ";}.noheader .GP34Q33IVC,.noheader .GP34Q33HVC{height:" + ("3px")  + ";border:" + ("none")  + ";}.GP34Q33DVC{background-color:" + ("#e6e6e6")  + ";padding-right:" + ("6px")  + ";}.GP34Q33GVC{background-color:" + ("#e6e6e6")  + ";padding-left:" + ("6px")  + ";}.GP34Q33BVC{padding-top:" + ("0")  + ";background:" + ("#e8e8e8")  + " !important;}.GP34Q33OUC,.GP34Q33PUC,.GP34Q33AVC{height:" + ("6px") ) + (";}")) : ((".GP34Q33CVC{position:" + ("relative")  + ";outline:" + ("none")  + ";}.GP34Q33BVC{height:" + ((GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.background()).getHeight() + "px")  + ";width:" + ((GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.background()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.background()).getSafeUri().asString() + "\") -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.background()).getLeft() + "px -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.background()).getTop() + "px  no-repeat")  + ";overflow:" + ("visible")  + ";height:" + ("auto")  + ";width:" + ("auto")  + ";}.GP34Q33IVC{height:" + ((GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topLeftBorder()).getHeight() + "px")  + ";width:") + (((GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topLeftBorder()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topLeftBorder()).getSafeUri().asString() + "\") -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topLeftBorder()).getLeft() + "px -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topLeftBorder()).getTop() + "px  no-repeat")  + ";padding-left:" + (topLeftBorder().getWidth() + "px")  + ";zoom:" + ("1")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";}.GP34Q33HVC{height:" + ((GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topBorder()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topBorder()).getSafeUri().asString() + "\") -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topBorder()).getLeft() + "px -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topBorder()).getTop() + "px  repeat-x")  + ";width:" + ("auto") ) + (";}.GP34Q33JVC{overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topRightBorder()).getSafeUri().asString() + "\") -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topRightBorder()).getLeft() + "px -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.topRightBorder()).getTop() + "px  repeat")  + ";background-repeat:" + ("no-repeat")  + ";background-position:" + ("right"+ " " +"0")  + ";zoom:" + ("1")  + ";padding-right:" + (topRightBorder().getWidth() + "px")  + ";width:" + ("auto")  + ";}.GP34Q33PUC{overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.bottomLeftBorder()).getSafeUri().asString() + "\") -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.bottomLeftBorder()).getLeft() + "px -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.bottomLeftBorder()).getTop() + "px  repeat")  + ";background-repeat:" + ("no-repeat")  + ";width:") + (("auto")  + ";background-position:" + ("0"+ " " +"bottom")  + ";padding-left:" + (bottomLeftBorder().getWidth() + "px")  + ";zoom:" + ("1")  + ";line-height:" + ("1px")  + ";font-size:" + ("1px")  + ";}.GP34Q33OUC{overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.bottomBorder()).getSafeUri().asString() + "\") -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.bottomBorder()).getLeft() + "px -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.bottomBorder()).getTop() + "px  repeat")  + ";background-position:" + ("0"+ " " +"bottom")  + ";zoom:" + ("1")  + ";width:" + ("auto") ) + (";overflow:" + ("visible")  + ";height:" + (bottomBorder().getHeight() + "px")  + ";line-height:" + ("1px")  + ";font-size:" + ("1px")  + ";}.GP34Q33AVC{overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.bottomRightBorder()).getSafeUri().asString() + "\") -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.bottomRightBorder()).getLeft() + "px -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.bottomRightBorder()).getTop() + "px  repeat")  + ";background-repeat:" + ("no-repeat")  + ";background-position:" + ("right"+ " " +"bottom")  + ";padding-right:" + (bottomRightBorder().getWidth() + "px")  + ";zoom:" + ("1")  + ";width:") + (("auto")  + ";height:" + ("auto")  + ";line-height:" + ("1px")  + ";font-size:" + ("1px")  + ";}.GP34Q33DVC{width:" + ((GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.leftBorder()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.leftBorder()).getSafeUri().asString() + "\") -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.leftBorder()).getLeft() + "px -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.leftBorder()).getTop() + "px  repeat-y")  + ";padding-left:" + (bottomLeftBorder().getWidth() + "px")  + ";zoom:" + ("1")  + ";overflow:" + ("visible")  + ";height:" + ("auto") ) + (";width:" + ("auto")  + ";}.GP34Q33GVC{overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.rightBorder()).getSafeUri().asString() + "\") -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.rightBorder()).getLeft() + "px -" + (GrayWindowAppearance_GrayWindowDivFrameResources_default_InlineClientBundleGenerator.this.rightBorder()).getTop() + "px  repeat")  + ";background-repeat:" + ("repeat-y")  + ";background-position:" + ("right"+ " " +"0")  + ";padding-right:" + (rightBorder().getWidth() + "px")  + ";overflow:" + ("visible")  + ";width:" + ("auto")  + ";height:" + ("auto")  + ";}.GP34Q33IVC{height:" + ("auto")  + ";border:") + (("none")  + ";}.GP34Q33HVC,.GP34Q33JVC{height:" + ("auto")  + ";}.noheader .GP34Q33IVC,.noheader .GP34Q33HVC{height:" + ("3px")  + ";border:" + ("none")  + ";}.GP34Q33DVC{background-color:" + ("#e6e6e6")  + ";padding-left:" + ("6px")  + ";}.GP34Q33GVC{background-color:" + ("#e6e6e6")  + ";padding-right:" + ("6px")  + ";}.GP34Q33BVC{padding-top:" + ("0")  + ";background:" + ("#e8e8e8")  + " !important;}.GP34Q33OUC,.GP34Q33PUC,.GP34Q33AVC{height:" + ("6px") ) + (";}"));
      }
      public java.lang.String bodyWrap(){
        return "GP34Q33NUC";
      }
      public java.lang.String bottom(){
        return "GP34Q33OUC";
      }
      public java.lang.String bottomLeft(){
        return "GP34Q33PUC";
      }
      public java.lang.String bottomRight(){
        return "GP34Q33AVC";
      }
      public java.lang.String content(){
        return "GP34Q33BVC";
      }
      public java.lang.String contentArea(){
        return "GP34Q33CVC";
      }
      public java.lang.String left(){
        return "GP34Q33DVC";
      }
      public java.lang.String over(){
        return "GP34Q33EVC";
      }
      public java.lang.String pressed(){
        return "GP34Q33FVC";
      }
      public java.lang.String right(){
        return "GP34Q33GVC";
      }
      public java.lang.String top(){
        return "GP34Q33HVC";
      }
      public java.lang.String topLeft(){
        return "GP34Q33IVC";
      }
      public java.lang.String topRight(){
        return "GP34Q33JVC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayWindowDivFrameStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayWindowDivFrameStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/gif;base64,R0lGODlhAwADAIAAAP///wAAACH5BAEAAAAALAAAAAADAAMAAAIDhH8FADs=";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAAGCAYAAAACEPQxAAAAGklEQVR42mP4+PHjGQY04tmzZ2cYVq1adQYAQ9kUxQVWMbwAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAYAAAAGCAYAAADgzO9IAAAAK0lEQVR42mNYtWrVmWfPnp35+PEjCmYgXwJdEixx/uxZuCQMM4AASBIdAwDBNnTZeycz+QAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage2 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAYAAAAGCAYAAADgzO9IAAAALUlEQVR42mP4+PHjGWT87NmzM6tWrTrDQJkESBAuAePA8PmzZyESIAIdMwABAFPNdNlqtAqhAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage3 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAYAAAAFCAYAAABmWJ3mAAAAGklEQVR42mNYtWrVmWfPnp35+PEjCmaggwQAMdhn1eDko7MAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage4 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAYAAAAFCAYAAABmWJ3mAAAAG0lEQVR42mP4+PHjGWT87NmzM6tWrTrDQAcJAIzIZ9WDvl5XAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage5 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAACWCAYAAAAfduJyAAAAS0lEQVR42u3EsQkEIQAAwe2/FGvZXEQQURARRKzAb+ODm2AIIch7T2KMklKSnLOUUqTWKq016b3LGEPmnLLWkr23nHPk3vv19e/9AGohHKDbLYZjAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage6 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAYAAACWCAYAAAD9qvkLAAAAj0lEQVR42u3OQQrEIAyF4d7/KJ4l+yJCKQpVLCIVissOySI0M3OEV/g371Pqsnx9zjnifobneSQdc84yrOsqKfDovddknHNSCMGksG2bSeC+b9r33SQwxqAYo0khpWQSuK6LjuMwCbTWqJRiEjjPk2qtJgE+wbfeKfTeTQL8M37AOwAAAAAAAAAAAAAA/IUPaRwIEVGAb68AAAAASUVORK5CYII=";
  private static final java.lang.String externalImage7 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAYAAACWCAYAAAD9qvkLAAAAkUlEQVR42u3OQQqEMAyFYe9/FM/y9kUEkRZUlFJaKF06xKATRuYGr/CvvoS06/seUvf7zvOE9BpwzkESXNf1i8Mw4O7evGAcR9haa4rTNMH2wDzPsNVaFbz3sJVSFEIIsD2wLAtsOWeFbdtgizEq7PsO23EcCjJhk60LUkqwPSDHbPIBAoFAIBAIBAKBQCD8hQ/x2QgR2M1CkQAAAABJRU5ErkJggg==";
  private static com.google.gwt.resources.client.ImageResource background;
  private static com.google.gwt.resources.client.ImageResource bottomBorder;
  private static com.google.gwt.resources.client.ImageResource bottomLeftBorder;
  private static com.google.gwt.resources.client.ImageResource bottomRightBorder;
  private static com.google.gwt.resources.client.ImageResource leftBorder;
  private static com.google.gwt.resources.client.ImageResource rightBorder;
  private static com.google.gwt.resources.client.ImageResource topBorder;
  private static com.google.gwt.resources.client.ImageResource topLeftBorder;
  private static com.google.gwt.resources.client.ImageResource topRightBorder;
  private static com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayWindowDivFrameStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      background(), 
      bottomBorder(), 
      bottomLeftBorder(), 
      bottomRightBorder(), 
      leftBorder(), 
      rightBorder(), 
      topBorder(), 
      topLeftBorder(), 
      topRightBorder(), 
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
        resourceMap.put("bottomBorder", bottomBorder());
        resourceMap.put("bottomLeftBorder", bottomLeftBorder());
        resourceMap.put("bottomRightBorder", bottomRightBorder());
        resourceMap.put("leftBorder", leftBorder());
        resourceMap.put("rightBorder", rightBorder());
        resourceMap.put("topBorder", topBorder());
        resourceMap.put("topLeftBorder", topLeftBorder());
        resourceMap.put("topRightBorder", topRightBorder());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'background': return this.@com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayWindowDivFrameResources::background()();
      case 'bottomBorder': return this.@com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayWindowDivFrameResources::bottomBorder()();
      case 'bottomLeftBorder': return this.@com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayWindowDivFrameResources::bottomLeftBorder()();
      case 'bottomRightBorder': return this.@com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayWindowDivFrameResources::bottomRightBorder()();
      case 'leftBorder': return this.@com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayWindowDivFrameResources::leftBorder()();
      case 'rightBorder': return this.@com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayWindowDivFrameResources::rightBorder()();
      case 'topBorder': return this.@com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayWindowDivFrameResources::topBorder()();
      case 'topLeftBorder': return this.@com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayWindowDivFrameResources::topLeftBorder()();
      case 'topRightBorder': return this.@com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayWindowDivFrameResources::topRightBorder()();
      case 'style': return this.@com.sencha.gxt.theme.gray.client.window.GrayWindowAppearance.GrayWindowDivFrameResources::style()();
    }
    return null;
  }-*/;
}
