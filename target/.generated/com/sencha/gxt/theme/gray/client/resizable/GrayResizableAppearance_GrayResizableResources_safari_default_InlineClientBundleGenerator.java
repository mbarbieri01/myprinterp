package com.sencha.gxt.theme.gray.client.resizable;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.gray.client.resizable.GrayResizableAppearance.GrayResizableResources {
  private static GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator _instance0 = new GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator();
  private void handleEastInitializer() {
    handleEast = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "handleEast",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 10, 2000, false, false
    );
  }
  private static class handleEastInitializer {
    static {
      _instance0.handleEastInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return handleEast;
    }
  }
  public com.google.gwt.resources.client.ImageResource handleEast() {
    return handleEastInitializer.get();
  }
  private void handleNortheastInitializer() {
    handleNortheast = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "handleNortheast",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 10, 10, false, false
    );
  }
  private static class handleNortheastInitializer {
    static {
      _instance0.handleNortheastInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return handleNortheast;
    }
  }
  public com.google.gwt.resources.client.ImageResource handleNortheast() {
    return handleNortheastInitializer.get();
  }
  private void handleNorthwestInitializer() {
    handleNorthwest = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "handleNorthwest",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 10, 10, false, false
    );
  }
  private static class handleNorthwestInitializer {
    static {
      _instance0.handleNorthwestInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return handleNorthwest;
    }
  }
  public com.google.gwt.resources.client.ImageResource handleNorthwest() {
    return handleNorthwestInitializer.get();
  }
  private void handleSouthInitializer() {
    handleSouth = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "handleSouth",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage2),
      0, 0, 2000, 10, false, false
    );
  }
  private static class handleSouthInitializer {
    static {
      _instance0.handleSouthInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return handleSouth;
    }
  }
  public com.google.gwt.resources.client.ImageResource handleSouth() {
    return handleSouthInitializer.get();
  }
  private void handleSoutheastInitializer() {
    handleSoutheast = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "handleSoutheast",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage3),
      0, 0, 10, 10, false, false
    );
  }
  private static class handleSoutheastInitializer {
    static {
      _instance0.handleSoutheastInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return handleSoutheast;
    }
  }
  public com.google.gwt.resources.client.ImageResource handleSoutheast() {
    return handleSoutheastInitializer.get();
  }
  private void handleSouthwestInitializer() {
    handleSouthwest = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "handleSouthwest",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage4),
      0, 0, 10, 10, false, false
    );
  }
  private static class handleSouthwestInitializer {
    static {
      _instance0.handleSouthwestInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return handleSouthwest;
    }
  }
  public com.google.gwt.resources.client.ImageResource handleSouthwest() {
    return handleSouthwestInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.gray.client.resizable.GrayResizableAppearance.GrayResizableStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GP34Q33MKC{position:" + ("absolute")  + ";z-index:" + ("100")  + ";font-size:" + ("1px")  + ";line-height:" + ("6px")  + ";overflow:" + ("hidden")  + ";opacity:" + ("0")  + ";}.GP34Q33NKC{width:" + ("6px")  + ";cursor:" + ("w-resize")  + ";left:" + ("0")  + ";top:" + ("0")  + ";height:") + (("100%")  + ";}.GP34Q33BLC{width:" + ("100%")  + ";cursor:" + ("s-resize")  + ";right:" + ("0")  + ";bottom:" + ("0")  + ";height:" + ("6px")  + ";}.GP34Q33ELC{width:" + ("6px")  + ";cursor:" + ("e-resize")  + ";right:" + ("0")  + ";top:" + ("0")  + ";height:" + ("100%") ) + (";}.GP34Q33OKC{width:" + ("100%")  + ";cursor:" + ("n-resize")  + ";right:" + ("0")  + ";top:" + ("0")  + ";height:" + ("6px")  + ";}.GP34Q33CLC{width:" + ("6px")  + ";cursor:" + ("sw-resize")  + ";left:" + ("0")  + ";bottom:" + ("0")  + ";height:" + ("6px")  + ";z-index:") + (("101")  + ";}.GP34Q33ALC{width:" + ("6px")  + ";cursor:" + ("ne-resize")  + ";right:" + ("0")  + ";top:" + ("0")  + ";height:" + ("6px")  + ";z-index:" + ("101")  + ";}.GP34Q33PKC{width:" + ("6px")  + ";cursor:" + ("nw-resize")  + ";left:" + ("0")  + ";top:" + ("0") ) + (";height:" + ("6px")  + ";z-index:" + ("101")  + ";}.GP34Q33DLC{width:" + ("6px")  + ";cursor:" + ("se-resize")  + ";right:" + ("0")  + ";bottom:" + ("0")  + ";height:" + ("6px")  + ";z-index:" + ("101")  + ";}.GP34Q33FLC .GP34Q33MKC,.GP34Q33HLC .GP34Q33MKC{opacity:" + ("1")  + ";}.GP34Q33FLC .GP34Q33NKC,.GP34Q33HLC .GP34Q33NKC,.GP34Q33FLC .GP34Q33ELC,.GP34Q33HLC .GP34Q33ELC{background-position:" + ("right")  + ";}.GP34Q33FLC .GP34Q33BLC,.GP34Q33HLC .GP34Q33BLC,.GP34Q33FLC .GP34Q33OKC,.GP34Q33HLC .GP34Q33OKC{background-position:") + (("top")  + ";}.GP34Q33FLC .GP34Q33CLC,.GP34Q33HLC .GP34Q33CLC{background-position:" + ("top"+ " " +"right")  + ";}.GP34Q33FLC .GP34Q33ALC,.GP34Q33HLC .GP34Q33ALC{background-position:" + ("bottom"+ " " +"left")  + ";}.GP34Q33FLC .GP34Q33PKC,.GP34Q33HLC .GP34Q33PKC{background-position:" + ("bottom"+ " " +"right")  + ";}.GP34Q33FLC .GP34Q33DLC,.GP34Q33HLC .GP34Q33DLC{background-position:" + ("top"+ " " +"left")  + ";}.GP34Q33ILC{border:" + ("1px"+ " " +"dashed")  + ";position:" + ("absolute")  + ";overflow:" + ("hidden")  + ";display:" + ("none")  + ";right:" + ("0")  + ";top:" + ("0") ) + (";z-index:" + ("50000")  + ";border-color:" + ("#555")  + ";}.GP34Q33GLC{width:" + ("100%")  + ";height:" + ("100%")  + ";display:" + ("none")  + ";position:" + ("absolute")  + ";right:" + ("0")  + ";top:" + ("0")  + ";z-index:" + ("200000")  + ";}.GP34Q33MKC{opacity:" + ("0")  + ";background-color:") + (("#fff")  + ";}.GP34Q33FLC .GP34Q33NKC,.GP34Q33HLC .GP34Q33NKC,.GP34Q33FLC .GP34Q33ELC,.GP34Q33HLC .GP34Q33ELC{height:" + ((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleEast()).getHeight() + "px")  + ";width:" + ((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleEast()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleEast()).getSafeUri().asString() + "\") -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleEast()).getLeft() + "px -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleEast()).getTop() + "px  no-repeat")  + ";}.GP34Q33FLC .GP34Q33BLC,.GP34Q33HLC .GP34Q33BLC,.GP34Q33FLC .GP34Q33OKC,.GP34Q33HLC .GP34Q33OKC{height:" + ((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSouth()).getHeight() + "px")  + ";width:" + ((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSouth()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSouth()).getSafeUri().asString() + "\") -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSouth()).getLeft() + "px -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSouth()).getTop() + "px  no-repeat")  + ";}.GP34Q33FLC .GP34Q33CLC,.GP34Q33HLC .GP34Q33CLC{height:" + ((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSoutheast()).getHeight() + "px")  + ";width:" + ((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSoutheast()).getWidth() + "px") ) + (";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSoutheast()).getSafeUri().asString() + "\") -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSoutheast()).getLeft() + "px -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSoutheast()).getTop() + "px  no-repeat")  + ";}.GP34Q33FLC .GP34Q33ALC,.GP34Q33HLC .GP34Q33ALC{height:" + ((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleNorthwest()).getHeight() + "px")  + ";width:" + ((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleNorthwest()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleNorthwest()).getSafeUri().asString() + "\") -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleNorthwest()).getLeft() + "px -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleNorthwest()).getTop() + "px  no-repeat")  + ";}.GP34Q33FLC .GP34Q33PKC,.GP34Q33HLC .GP34Q33PKC{height:" + ((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleNortheast()).getHeight() + "px")  + ";width:" + ((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleNortheast()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleNortheast()).getSafeUri().asString() + "\") -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleNortheast()).getLeft() + "px -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleNortheast()).getTop() + "px  no-repeat")  + ";}.GP34Q33FLC .GP34Q33DLC,.GP34Q33HLC .GP34Q33DLC{height:") + (((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSouthwest()).getHeight() + "px")  + ";width:" + ((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSouthwest()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSouthwest()).getSafeUri().asString() + "\") -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSouthwest()).getLeft() + "px -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSouthwest()).getTop() + "px  no-repeat")  + ";}.GP34Q33GLC{background-color:" + ("#fff")  + ";}")) : ((".GP34Q33MKC{position:" + ("absolute")  + ";z-index:" + ("100")  + ";font-size:" + ("1px")  + ";line-height:" + ("6px")  + ";overflow:" + ("hidden")  + ";opacity:" + ("0")  + ";}.GP34Q33NKC{width:" + ("6px")  + ";cursor:" + ("e-resize")  + ";right:" + ("0")  + ";top:" + ("0")  + ";height:") + (("100%")  + ";}.GP34Q33BLC{width:" + ("100%")  + ";cursor:" + ("s-resize")  + ";left:" + ("0")  + ";bottom:" + ("0")  + ";height:" + ("6px")  + ";}.GP34Q33ELC{width:" + ("6px")  + ";cursor:" + ("w-resize")  + ";left:" + ("0")  + ";top:" + ("0")  + ";height:" + ("100%") ) + (";}.GP34Q33OKC{width:" + ("100%")  + ";cursor:" + ("n-resize")  + ";left:" + ("0")  + ";top:" + ("0")  + ";height:" + ("6px")  + ";}.GP34Q33CLC{width:" + ("6px")  + ";cursor:" + ("se-resize")  + ";right:" + ("0")  + ";bottom:" + ("0")  + ";height:" + ("6px")  + ";z-index:") + (("101")  + ";}.GP34Q33ALC{width:" + ("6px")  + ";cursor:" + ("nw-resize")  + ";left:" + ("0")  + ";top:" + ("0")  + ";height:" + ("6px")  + ";z-index:" + ("101")  + ";}.GP34Q33PKC{width:" + ("6px")  + ";cursor:" + ("ne-resize")  + ";right:" + ("0")  + ";top:" + ("0") ) + (";height:" + ("6px")  + ";z-index:" + ("101")  + ";}.GP34Q33DLC{width:" + ("6px")  + ";cursor:" + ("sw-resize")  + ";left:" + ("0")  + ";bottom:" + ("0")  + ";height:" + ("6px")  + ";z-index:" + ("101")  + ";}.GP34Q33FLC .GP34Q33MKC,.GP34Q33HLC .GP34Q33MKC{opacity:" + ("1")  + ";}.GP34Q33FLC .GP34Q33NKC,.GP34Q33HLC .GP34Q33NKC,.GP34Q33FLC .GP34Q33ELC,.GP34Q33HLC .GP34Q33ELC{background-position:" + ("left")  + ";}.GP34Q33FLC .GP34Q33BLC,.GP34Q33HLC .GP34Q33BLC,.GP34Q33FLC .GP34Q33OKC,.GP34Q33HLC .GP34Q33OKC{background-position:") + (("top")  + ";}.GP34Q33FLC .GP34Q33CLC,.GP34Q33HLC .GP34Q33CLC{background-position:" + ("top"+ " " +"left")  + ";}.GP34Q33FLC .GP34Q33ALC,.GP34Q33HLC .GP34Q33ALC{background-position:" + ("bottom"+ " " +"right")  + ";}.GP34Q33FLC .GP34Q33PKC,.GP34Q33HLC .GP34Q33PKC{background-position:" + ("bottom"+ " " +"left")  + ";}.GP34Q33FLC .GP34Q33DLC,.GP34Q33HLC .GP34Q33DLC{background-position:" + ("top"+ " " +"right")  + ";}.GP34Q33ILC{border:" + ("1px"+ " " +"dashed")  + ";position:" + ("absolute")  + ";overflow:" + ("hidden")  + ";display:" + ("none")  + ";left:" + ("0")  + ";top:" + ("0") ) + (";z-index:" + ("50000")  + ";border-color:" + ("#555")  + ";}.GP34Q33GLC{width:" + ("100%")  + ";height:" + ("100%")  + ";display:" + ("none")  + ";position:" + ("absolute")  + ";left:" + ("0")  + ";top:" + ("0")  + ";z-index:" + ("200000")  + ";}.GP34Q33MKC{opacity:" + ("0")  + ";background-color:") + (("#fff")  + ";}.GP34Q33FLC .GP34Q33NKC,.GP34Q33HLC .GP34Q33NKC,.GP34Q33FLC .GP34Q33ELC,.GP34Q33HLC .GP34Q33ELC{height:" + ((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleEast()).getHeight() + "px")  + ";width:" + ((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleEast()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleEast()).getSafeUri().asString() + "\") -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleEast()).getLeft() + "px -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleEast()).getTop() + "px  no-repeat")  + ";}.GP34Q33FLC .GP34Q33BLC,.GP34Q33HLC .GP34Q33BLC,.GP34Q33FLC .GP34Q33OKC,.GP34Q33HLC .GP34Q33OKC{height:" + ((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSouth()).getHeight() + "px")  + ";width:" + ((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSouth()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSouth()).getSafeUri().asString() + "\") -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSouth()).getLeft() + "px -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSouth()).getTop() + "px  no-repeat")  + ";}.GP34Q33FLC .GP34Q33CLC,.GP34Q33HLC .GP34Q33CLC{height:" + ((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSoutheast()).getHeight() + "px")  + ";width:" + ((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSoutheast()).getWidth() + "px") ) + (";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSoutheast()).getSafeUri().asString() + "\") -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSoutheast()).getLeft() + "px -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSoutheast()).getTop() + "px  no-repeat")  + ";}.GP34Q33FLC .GP34Q33ALC,.GP34Q33HLC .GP34Q33ALC{height:" + ((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleNorthwest()).getHeight() + "px")  + ";width:" + ((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleNorthwest()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleNorthwest()).getSafeUri().asString() + "\") -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleNorthwest()).getLeft() + "px -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleNorthwest()).getTop() + "px  no-repeat")  + ";}.GP34Q33FLC .GP34Q33PKC,.GP34Q33HLC .GP34Q33PKC{height:" + ((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleNortheast()).getHeight() + "px")  + ";width:" + ((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleNortheast()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleNortheast()).getSafeUri().asString() + "\") -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleNortheast()).getLeft() + "px -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleNortheast()).getTop() + "px  no-repeat")  + ";}.GP34Q33FLC .GP34Q33DLC,.GP34Q33HLC .GP34Q33DLC{height:") + (((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSouthwest()).getHeight() + "px")  + ";width:" + ((GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSouthwest()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSouthwest()).getSafeUri().asString() + "\") -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSouthwest()).getLeft() + "px -" + (GrayResizableAppearance_GrayResizableResources_safari_default_InlineClientBundleGenerator.this.handleSouthwest()).getTop() + "px  no-repeat")  + ";}.GP34Q33GLC{background-color:" + ("#fff")  + ";}"));
      }
      public java.lang.String handle(){
        return "GP34Q33MKC";
      }
      public java.lang.String handleEast(){
        return "GP34Q33NKC";
      }
      public java.lang.String handleNorth(){
        return "GP34Q33OKC";
      }
      public java.lang.String handleNortheast(){
        return "GP34Q33PKC";
      }
      public java.lang.String handleNorthwest(){
        return "GP34Q33ALC";
      }
      public java.lang.String handleSouth(){
        return "GP34Q33BLC";
      }
      public java.lang.String handleSoutheast(){
        return "GP34Q33CLC";
      }
      public java.lang.String handleSouthwest(){
        return "GP34Q33DLC";
      }
      public java.lang.String handleWest(){
        return "GP34Q33ELC";
      }
      public java.lang.String over(){
        return "GP34Q33FLC";
      }
      public java.lang.String overlay(){
        return "GP34Q33GLC";
      }
      public java.lang.String pinned(){
        return "GP34Q33HLC";
      }
      public java.lang.String proxy(){
        return "GP34Q33ILC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.gray.client.resizable.GrayResizableAppearance.GrayResizableStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.gray.client.resizable.GrayResizableAppearance.GrayResizableStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAoAAAfQCAYAAAD7MM56AAABN0lEQVR42u3RMQqAMAwF0N7/Gr1TlyxdOvQUEQU3RReRwvvwpzxIIGXOmWOM7L1nRGRr7bIFBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQBEEQXAfWWo++hnseV59Z/sa7oRs/+jUIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiAIgiD4F9wASLJDE+oAk0MAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAoAAAAKCAYAAACNMs+9AAAAWklEQVR42sXOQQrAMAgEwPz/G/mTB08iqPEVWyykhIaW3ioIexhWGxHhy7YfoYhgDjNfeYO9d9TWrPkRVvPM1bxBd4eZQVWxvrHBMQYi4sSvpzMThat5feMOD6EgXeFX7vf4AAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAoAAAAKCAYAAACNMs+9AAAAVklEQVR42s2NwQnAQAgEr/827MmHLxE8tQqDgQvCJSHPCAsLDjsDEfNLxo/AdUR0dWa+BwHgTO8bWEvrWUuPYNeJSKpqzjnf1QWZWbr7DnZdLRUUEXkAvlRd4UAcwZMAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage2 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAB9AAAAAKCAYAAADsOsW+AAAAoUlEQVR42u3ZoQ3EMBBE0e2/DfdkYmJi4Cr2dJFCAi1tSN5ID0wNP/beCQAAAAAAAABfF2utBAAAAOq11i6nHwAAAKgVc84EAAAA6t1B/L+TDwAAANSKMUYCAAAA77h3+gEAAIA60XtPAAAAAAAAAPg6AR0AAAAAAAAABHQAAAAAAAAAENABAAAAAAAAQEAHAAAAAAAAAAEdAAAAAAAAAB5+9n1Dx6okBTYAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage3 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAoAAAAKCAYAAACNMs+9AAAAWUlEQVR42sWNSwrAIAxEvf81vJOLrIKQj6dIGcFiK+m2AwMhPOaVMUa4e6hq1FpnmTlaa48WQGYWInKDyAFiCVDvfS6tHOCuWzcR5SDyqd51WErV70fWH8ELdbxd4S97q/gAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage4 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAoAAAAKCAYAAACNMs+9AAAAW0lEQVR42sWOQQrAMAgE8/9v+KcccgoBNb5ii0KKNE2vXVjwMMxaaq3I7b2DiKIigjknzAzlCXoWyMxQ1YBfQY+bxxgBu3kDW2u3Mb/xOZ3v47Sb8xsbeOqP4AWS8F3hz3h64wAAAABJRU5ErkJggg==";
  private static com.google.gwt.resources.client.ImageResource handleEast;
  private static com.google.gwt.resources.client.ImageResource handleNortheast;
  private static com.google.gwt.resources.client.ImageResource handleNorthwest;
  private static com.google.gwt.resources.client.ImageResource handleSouth;
  private static com.google.gwt.resources.client.ImageResource handleSoutheast;
  private static com.google.gwt.resources.client.ImageResource handleSouthwest;
  private static com.sencha.gxt.theme.gray.client.resizable.GrayResizableAppearance.GrayResizableStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      handleEast(), 
      handleNortheast(), 
      handleNorthwest(), 
      handleSouth(), 
      handleSoutheast(), 
      handleSouthwest(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("handleEast", handleEast());
        resourceMap.put("handleNortheast", handleNortheast());
        resourceMap.put("handleNorthwest", handleNorthwest());
        resourceMap.put("handleSouth", handleSouth());
        resourceMap.put("handleSoutheast", handleSoutheast());
        resourceMap.put("handleSouthwest", handleSouthwest());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'handleEast': return this.@com.sencha.gxt.theme.gray.client.resizable.GrayResizableAppearance.GrayResizableResources::handleEast()();
      case 'handleNortheast': return this.@com.sencha.gxt.theme.gray.client.resizable.GrayResizableAppearance.GrayResizableResources::handleNortheast()();
      case 'handleNorthwest': return this.@com.sencha.gxt.theme.gray.client.resizable.GrayResizableAppearance.GrayResizableResources::handleNorthwest()();
      case 'handleSouth': return this.@com.sencha.gxt.theme.gray.client.resizable.GrayResizableAppearance.GrayResizableResources::handleSouth()();
      case 'handleSoutheast': return this.@com.sencha.gxt.theme.gray.client.resizable.GrayResizableAppearance.GrayResizableResources::handleSoutheast()();
      case 'handleSouthwest': return this.@com.sencha.gxt.theme.gray.client.resizable.GrayResizableAppearance.GrayResizableResources::handleSouthwest()();
      case 'style': return this.@com.sencha.gxt.theme.gray.client.resizable.GrayResizableAppearance.GrayResizableResources::style()();
    }
    return null;
  }-*/;
}
