package com.sencha.gxt.theme.gray.client.statusproxy;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.gray.client.statusproxy.GrayStatusProxyAppearance.GrayStatusProxyResources {
  private static GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator _instance0 = new GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator();
  private void dropAllowedInitializer() {
    dropAllowed = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "dropAllowed",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 16, 16, false, false
    );
  }
  private static class dropAllowedInitializer {
    static {
      _instance0.dropAllowedInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return dropAllowed;
    }
  }
  public com.google.gwt.resources.client.ImageResource dropAllowed() {
    return dropAllowedInitializer.get();
  }
  private void dropDisallowedInitializer() {
    dropDisallowed = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "dropDisallowed",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 16, 16, false, false
    );
  }
  private static class dropDisallowedInitializer {
    static {
      _instance0.dropDisallowedInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return dropDisallowed;
    }
  }
  public com.google.gwt.resources.client.ImageResource dropDisallowed() {
    return dropDisallowedInitializer.get();
  }
  private void dropNotAllowedInitializer() {
    dropNotAllowed = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "dropNotAllowed",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 16, 16, false, false
    );
  }
  private static class dropNotAllowedInitializer {
    static {
      _instance0.dropNotAllowedInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return dropNotAllowed;
    }
  }
  public com.google.gwt.resources.client.ImageResource dropNotAllowed() {
    return dropNotAllowedInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.gray.client.statusproxy.GrayStatusProxyAppearance.GrayStatusProxyStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GP34Q33BNC{position:" + ("absolute")  + ";right:" + ("0")  + ";top:" + ("0")  + ";visibility:" + ("hidden")  + ";z-index:" + ("15000")  + ";}.GP34Q33NMC{opacity:" + ("0.85")  + ";filter:" + ("alpha(opacity=85)")  + ";border:" + ("1px"+ " " +"solid")  + ";padding:" + ("3px")  + ";padding-right:" + ("20px")  + ";white-space:") + (("nowrap")  + ";}.GP34Q33ANC{position:" + ("absolute")  + ";top:" + ("3px")  + ";right:" + ("3px")  + ";display:" + ("block")  + ";width:" + ("16px")  + ";height:" + ("16px")  + ";background-color:" + ("transparent")  + ";background-position:" + ("center")  + ";background-repeat:" + ("no-repeat")  + ";z-index:" + ("1") ) + (";}.GP34Q33NMC{color:" + ("#000")  + ";font:" + ("normal"+ " " +"11px"+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";border-color:" + ("#ddd"+ " " +"#ddd"+ " " +"#bbb"+ " " +"#bbb")  + ";background-color:" + ("#fff")  + ";}.GP34Q33PMC .GP34Q33ANC{height:" + ((GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator.this.dropDisallowed()).getHeight() + "px")  + ";width:" + ((GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator.this.dropDisallowed()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator.this.dropDisallowed()).getSafeUri().asString() + "\") -" + (GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator.this.dropDisallowed()).getLeft() + "px -" + (GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator.this.dropDisallowed()).getTop() + "px  no-repeat")  + ";}.GP34Q33OMC .GP34Q33ANC{height:" + ((GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator.this.dropAllowed()).getHeight() + "px")  + ";width:" + ((GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator.this.dropAllowed()).getWidth() + "px")  + ";overflow:") + (("hidden")  + ";background:" + ("url(\"" + (GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator.this.dropAllowed()).getSafeUri().asString() + "\") -" + (GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator.this.dropAllowed()).getLeft() + "px -" + (GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator.this.dropAllowed()).getTop() + "px  no-repeat")  + ";}")) : ((".GP34Q33BNC{position:" + ("absolute")  + ";left:" + ("0")  + ";top:" + ("0")  + ";visibility:" + ("hidden")  + ";z-index:" + ("15000")  + ";}.GP34Q33NMC{opacity:" + ("0.85")  + ";filter:" + ("alpha(opacity=85)")  + ";border:" + ("1px"+ " " +"solid")  + ";padding:" + ("3px")  + ";padding-left:" + ("20px")  + ";white-space:") + (("nowrap")  + ";}.GP34Q33ANC{position:" + ("absolute")  + ";top:" + ("3px")  + ";left:" + ("3px")  + ";display:" + ("block")  + ";width:" + ("16px")  + ";height:" + ("16px")  + ";background-color:" + ("transparent")  + ";background-position:" + ("center")  + ";background-repeat:" + ("no-repeat")  + ";z-index:" + ("1") ) + (";}.GP34Q33NMC{color:" + ("#000")  + ";font:" + ("normal"+ " " +"11px"+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";border-color:" + ("#ddd"+ " " +"#bbb"+ " " +"#bbb"+ " " +"#ddd")  + ";background-color:" + ("#fff")  + ";}.GP34Q33PMC .GP34Q33ANC{height:" + ((GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator.this.dropDisallowed()).getHeight() + "px")  + ";width:" + ((GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator.this.dropDisallowed()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator.this.dropDisallowed()).getSafeUri().asString() + "\") -" + (GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator.this.dropDisallowed()).getLeft() + "px -" + (GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator.this.dropDisallowed()).getTop() + "px  no-repeat")  + ";}.GP34Q33OMC .GP34Q33ANC{height:" + ((GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator.this.dropAllowed()).getHeight() + "px")  + ";width:" + ((GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator.this.dropAllowed()).getWidth() + "px")  + ";overflow:") + (("hidden")  + ";background:" + ("url(\"" + (GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator.this.dropAllowed()).getSafeUri().asString() + "\") -" + (GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator.this.dropAllowed()).getLeft() + "px -" + (GrayStatusProxyAppearance_GrayStatusProxyResources_default_InlineClientBundleGenerator.this.dropAllowed()).getTop() + "px  no-repeat")  + ";}"));
      }
      public java.lang.String dragGhost(){
        return "GP34Q33NMC";
      }
      public java.lang.String dropAllowed(){
        return "GP34Q33OMC";
      }
      public java.lang.String dropDisallowed(){
        return "GP34Q33PMC";
      }
      public java.lang.String dropIcon(){
        return "GP34Q33ANC";
      }
      public java.lang.String proxy(){
        return "GP34Q33BNC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.gray.client.statusproxy.GrayStatusProxyAppearance.GrayStatusProxyStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.gray.client.statusproxy.GrayStatusProxyAppearance.GrayStatusProxyStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAACZUlEQVR42rWT3UvTURjH/V9KxS4iKeliyUi6yJKowMxcL+ZaaermnJqiTjBbZTaNfJlDdIRWWrpyP+dE5qauzW2KLnGZiojRTRoVQvRin37bRSYKXnngC+fifD7nOTzPiYjYjWVebkXtS0bmkHDBfpiskUQ65xvZEfStOsj0nEAznMqTYAPd8+3hmGbqybKdJrk3Dudy3/Yi38oQspF4aie0WJd6aHn3iMqJonBCe2Gpm2rPLSSmaOyLwlaJwpUYhkMHS/w5FHqzUHtuoBFTIKZ47CaWxRfcGy0kwXRws+DlohHVUEr45hAcAlXua+S6MsgdvUreaAZ2sfRytxJBlFx6fpzHHv2GJNt1ElOwHmOwjsKxTJRv5CKYjnJEzHA6jg82Quvj2jKGqWpaJqqRGo5sCM5Y9/Nq4SkVfjX5boVYiZmZzwFUzgyGlvvD8O/1XxgmH1DuzKQ7aCLq9p4NQaI5mp75DrReFRXefL7++BKGVr9/+gc3jN8lz5ZGmf06PcE2orT/CS4KUloDdTRP16AZkaMbK2bt57cwvP5nnQbfHXKsKahFQaO/ima3Dmm1ZEPQGqhFbk7CstBJsVNOnv0yVa4CZlemMYzfJ7vvHLnCeTRWGZb3HZwyHqV28OHmThwTW6MbVvN67hlFg1fIH5Ch6k9FKYQSgtPonW1H259JnDZ26xwMzAns00dSac9BECVNfh1lgwpKB+Q0iU+wiHCZVUG0ei99U8L202idFYjTx3K2LYFmr46ut0a6AkYa3JUkNcZzqPQAfZPCzn+izqFHWiMhpiSSmKJIpFUS6mx6duXn/gUCKMz1WlVR5AAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAABDElEQVR42mNgwAH+fPny//2BA2AMYjMQC15v2PD/rInJ/wMMDHB8kIXl/3kbm/8fjhzBbdDPFy/+XwkIAGs4LiPz/25Jyf+XS5b8fz5nzv87BQX/jwgIgOVupqRgdxFM862MjP+/P3zAUPDjyRO4i0AGYjgbJAGyFZcL0b306cwZhFqQn0+qqOAMLGTNIJccFRH5fzUk5D88tEESTyZMIKgZJgbyAsgQMAcUTSDJd3v2/CdGMwiAAhYk9v3Bg/8Mb3fswGoALs3IBny9ceM/AyjE0b2ATzOGF9ADkZBmjEBEjkZCmkEApBEjGpETEgjjSkggzVgTElWSMsWZCVt2BkXxxxMn/v/98QOnRgCOkkwLYyK2KAAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAABDElEQVR42mNgwAH+fPny//2BA2AMYjMQC15v2PD/rInJ/wMMDHB8kIXl/3kbm/8fjhzBbdDPFy/+XwkIAGs4LiPz/25Jyf+XS5b8fz5nzv87BQX/jwgIgOVupqRgdxFM862MjP+/P3zAUPDjyRO4i0AGYjgbJAGyFZcL0b306cwZhFqQn0+qqOAMLGTNIJccFRH5fzUk5D88tEESTyZMIKgZJgbyAsgQMAcUTSDJd3v2/CdGMwiAAhYk9v3Bg/8Mb3fswGoALs3IBny9ceM/AyjE0b2ATzOGF9ADkZBmjEBEjkZCmkEApBEjGpETEgjjSkggzVgTElWSMsWZCVt2BkXxxxMn/v/98QOnRgCOkkwLYyK2KAAAAABJRU5ErkJggg==";
  private static com.google.gwt.resources.client.ImageResource dropAllowed;
  private static com.google.gwt.resources.client.ImageResource dropDisallowed;
  private static com.google.gwt.resources.client.ImageResource dropNotAllowed;
  private static com.sencha.gxt.theme.gray.client.statusproxy.GrayStatusProxyAppearance.GrayStatusProxyStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      dropAllowed(), 
      dropDisallowed(), 
      dropNotAllowed(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("dropAllowed", dropAllowed());
        resourceMap.put("dropDisallowed", dropDisallowed());
        resourceMap.put("dropNotAllowed", dropNotAllowed());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'dropAllowed': return this.@com.sencha.gxt.theme.gray.client.statusproxy.GrayStatusProxyAppearance.GrayStatusProxyResources::dropAllowed()();
      case 'dropDisallowed': return this.@com.sencha.gxt.theme.gray.client.statusproxy.GrayStatusProxyAppearance.GrayStatusProxyResources::dropDisallowed()();
      case 'dropNotAllowed': return this.@com.sencha.gxt.theme.base.client.statusproxy.StatusProxyBaseAppearance.StatusProxyResources::dropNotAllowed()();
      case 'style': return this.@com.sencha.gxt.theme.gray.client.statusproxy.GrayStatusProxyAppearance.GrayStatusProxyResources::style()();
    }
    return null;
  }-*/;
}
