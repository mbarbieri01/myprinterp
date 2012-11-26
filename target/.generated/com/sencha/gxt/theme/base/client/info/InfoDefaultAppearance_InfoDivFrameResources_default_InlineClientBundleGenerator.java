package com.sencha.gxt.theme.base.client.info;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDivFrameResources {
  private static InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator _instance0 = new InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator();
  private void backgroundInitializer() {
    background = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "background",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 1, 1, false, false
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
      0, 0, 1, 9, false, false
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
      0, 0, 9, 9, false, false
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
      0, 0, 9, 9, false, false
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
      0, 0, 9, 1, false, false
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
      0, 0, 9, 1, false, false
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
      0, 0, 1, 9, false, false
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
      0, 0, 9, 9, false, false
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
      0, 0, 9, 9, false, false
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
    style = new com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDivFrameStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GP34Q33DDB{padding:" + (topBorder().getHeight() + "px"+ " " +leftBorder().getWidth() + "px"+ " " +bottomBorder().getHeight() + "px"+ " " +rightBorder().getWidth() + "px")  + ";position:" + ("relative")  + ";outline:" + ("none")  + ";}.GP34Q33CDB{overflow:" + ("hidden")  + ";background:" + ("url(\"" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.background()).getSafeUri().asString() + "\") -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.background()).getLeft() + "px -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.background()).getTop() + "px  repeat")  + ";height:" + ("100%")  + ";width:" + ("100%")  + ";}.GP34Q33JDB{height:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topLeftBorder()).getHeight() + "px")  + ";width:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topLeftBorder()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:") + (("url(\"" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topLeftBorder()).getSafeUri().asString() + "\") -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topLeftBorder()).getLeft() + "px -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topLeftBorder()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";top:" + ("0")  + ";right:" + ("0")  + ";}.GP34Q33IDB{height:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topBorder()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topBorder()).getSafeUri().asString() + "\") -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topBorder()).getLeft() + "px -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topBorder()).getTop() + "px  repeat-x")  + ";position:" + ("absolute")  + ";top:" + ("0")  + ";right:" + (topLeftBorder().getWidth() + "px")  + ";left:" + (topRightBorder().getWidth() + "px") ) + (";}.GP34Q33KDB{height:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topRightBorder()).getHeight() + "px")  + ";width:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topRightBorder()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topRightBorder()).getSafeUri().asString() + "\") -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topRightBorder()).getLeft() + "px -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topRightBorder()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";top:" + ("0")  + ";left:" + ("0")  + ";}.GP34Q33ADB{height:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomLeftBorder()).getHeight() + "px")  + ";width:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomLeftBorder()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:") + (("url(\"" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomLeftBorder()).getSafeUri().asString() + "\") -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomLeftBorder()).getLeft() + "px -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomLeftBorder()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";bottom:" + ("0")  + ";right:" + ("0")  + ";}.GP34Q33PCB{height:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomBorder()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomBorder()).getSafeUri().asString() + "\") -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomBorder()).getLeft() + "px -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomBorder()).getTop() + "px  repeat-x")  + ";position:" + ("absolute")  + ";bottom:" + ("0")  + ";right:" + (bottomLeftBorder().getWidth() + "px")  + ";left:" + (bottomRightBorder().getWidth() + "px") ) + (";}.GP34Q33BDB{height:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomRightBorder()).getHeight() + "px")  + ";width:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomRightBorder()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomRightBorder()).getSafeUri().asString() + "\") -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomRightBorder()).getLeft() + "px -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomRightBorder()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";bottom:" + ("0")  + ";left:" + ("0")  + ";}.GP34Q33EDB{width:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.leftBorder()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.leftBorder()).getSafeUri().asString() + "\") -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.leftBorder()).getLeft() + "px -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.leftBorder()).getTop() + "px  repeat-y")  + ";position:") + (("absolute")  + ";top:" + (bottomLeftBorder().getWidth() + "px")  + ";right:" + ("0")  + ";bottom:" + (bottomLeftBorder().getWidth() + "px")  + ";}.GP34Q33HDB{width:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.rightBorder()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.rightBorder()).getSafeUri().asString() + "\") -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.rightBorder()).getLeft() + "px -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.rightBorder()).getTop() + "px  repeat-y")  + ";position:" + ("absolute")  + ";top:" + (bottomLeftBorder().getWidth() + "px")  + ";left:" + ("0")  + ";bottom:" + (bottomLeftBorder().getWidth() + "px") ) + (";}")) : ((".GP34Q33DDB{padding:" + (topBorder().getHeight() + "px"+ " " +rightBorder().getWidth() + "px"+ " " +bottomBorder().getHeight() + "px"+ " " +leftBorder().getWidth() + "px")  + ";position:" + ("relative")  + ";outline:" + ("none")  + ";}.GP34Q33CDB{overflow:" + ("hidden")  + ";background:" + ("url(\"" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.background()).getSafeUri().asString() + "\") -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.background()).getLeft() + "px -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.background()).getTop() + "px  repeat")  + ";height:" + ("100%")  + ";width:" + ("100%")  + ";}.GP34Q33JDB{height:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topLeftBorder()).getHeight() + "px")  + ";width:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topLeftBorder()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:") + (("url(\"" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topLeftBorder()).getSafeUri().asString() + "\") -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topLeftBorder()).getLeft() + "px -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topLeftBorder()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";top:" + ("0")  + ";left:" + ("0")  + ";}.GP34Q33IDB{height:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topBorder()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topBorder()).getSafeUri().asString() + "\") -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topBorder()).getLeft() + "px -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topBorder()).getTop() + "px  repeat-x")  + ";position:" + ("absolute")  + ";top:" + ("0")  + ";left:" + (topLeftBorder().getWidth() + "px")  + ";right:" + (topRightBorder().getWidth() + "px") ) + (";}.GP34Q33KDB{height:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topRightBorder()).getHeight() + "px")  + ";width:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topRightBorder()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topRightBorder()).getSafeUri().asString() + "\") -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topRightBorder()).getLeft() + "px -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.topRightBorder()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";top:" + ("0")  + ";right:" + ("0")  + ";}.GP34Q33ADB{height:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomLeftBorder()).getHeight() + "px")  + ";width:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomLeftBorder()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:") + (("url(\"" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomLeftBorder()).getSafeUri().asString() + "\") -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomLeftBorder()).getLeft() + "px -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomLeftBorder()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";bottom:" + ("0")  + ";left:" + ("0")  + ";}.GP34Q33PCB{height:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomBorder()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomBorder()).getSafeUri().asString() + "\") -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomBorder()).getLeft() + "px -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomBorder()).getTop() + "px  repeat-x")  + ";position:" + ("absolute")  + ";bottom:" + ("0")  + ";left:" + (bottomLeftBorder().getWidth() + "px")  + ";right:" + (bottomRightBorder().getWidth() + "px") ) + (";}.GP34Q33BDB{height:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomRightBorder()).getHeight() + "px")  + ";width:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomRightBorder()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomRightBorder()).getSafeUri().asString() + "\") -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomRightBorder()).getLeft() + "px -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.bottomRightBorder()).getTop() + "px  no-repeat")  + ";position:" + ("absolute")  + ";bottom:" + ("0")  + ";right:" + ("0")  + ";}.GP34Q33EDB{width:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.leftBorder()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.leftBorder()).getSafeUri().asString() + "\") -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.leftBorder()).getLeft() + "px -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.leftBorder()).getTop() + "px  repeat-y")  + ";position:") + (("absolute")  + ";top:" + (bottomLeftBorder().getWidth() + "px")  + ";left:" + ("0")  + ";bottom:" + (bottomLeftBorder().getWidth() + "px")  + ";}.GP34Q33HDB{width:" + ((InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.rightBorder()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.rightBorder()).getSafeUri().asString() + "\") -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.rightBorder()).getLeft() + "px -" + (InfoDefaultAppearance_InfoDivFrameResources_default_InlineClientBundleGenerator.this.rightBorder()).getTop() + "px  repeat-y")  + ";position:" + ("absolute")  + ";top:" + (bottomLeftBorder().getWidth() + "px")  + ";right:" + ("0")  + ";bottom:" + (bottomLeftBorder().getWidth() + "px") ) + (";}"));
      }
      public java.lang.String bottom(){
        return "GP34Q33PCB";
      }
      public java.lang.String bottomLeft(){
        return "GP34Q33ADB";
      }
      public java.lang.String bottomRight(){
        return "GP34Q33BDB";
      }
      public java.lang.String content(){
        return "GP34Q33CDB";
      }
      public java.lang.String contentArea(){
        return "GP34Q33DDB";
      }
      public java.lang.String left(){
        return "GP34Q33EDB";
      }
      public java.lang.String over(){
        return "GP34Q33FDB";
      }
      public java.lang.String pressed(){
        return "GP34Q33GDB";
      }
      public java.lang.String right(){
        return "GP34Q33HDB";
      }
      public java.lang.String top(){
        return "GP34Q33IDB";
      }
      public java.lang.String topLeft(){
        return "GP34Q33JDB";
      }
      public java.lang.String topRight(){
        return "GP34Q33KDB";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDivFrameStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDivFrameStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAADUlEQVQIHWNgYGDYDwAAxADAeqKnCAAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAAJCAYAAADzRkbkAAAAEElEQVR42mNgYGDYz0AkAQCNMAa43a/9mgAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAkAAAAJCAYAAADgkQYQAAAAN0lEQVR42mNgYGDYA8T7CWCGZcQoqiJGkRUxikBgAjGKVAl4AA6s8ChEAao4rMYKrKC+BgXPHgC+/S+TU5dnPgAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage2 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAkAAAAJCAYAAADgkQYQAAAAOUlEQVR42mNgYGDYTwDvYSBC0TJiFFURo8iKkKIJDFCAz8Gq+BTtgVmDS9EEZBNgYA/Um1XoumEAALvML5O9Y9QFAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage3 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAkAAAABCAYAAAAMwoR9AAAAD0lEQVR42mNgYGDYTwgDAHJMBrhaYxqVAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage4 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAkAAAABCAYAAAAMwoR9AAAAD0lEQVR42mNgYGDYTwgDAHJMBrhaYxqVAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage5 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAAJCAYAAADzRkbkAAAAEElEQVR42mNgYGDYz0AkAQCNMAa43a/9mgAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage6 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAkAAAAJCAYAAADgkQYQAAAAP0lEQVR42mNgwA6sgLgKiJcB8R50SVUgngDE+9Ewiu49WBTsRzYBlwK4ogl4FOyHWbOfkKIqYhQtI0bRHkKKAJyGL5OgbXm4AAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage7 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAkAAAAJCAYAAADgkQYQAAAAPUlEQVR42mNgYGDYA8TLgLgKiK0YcID9aHgCEKsSUrQfaroVIUUwhaqEFMGsJqhoP8xaQoqqiFG0jBhFewCZVS+TqMU7fwAAAABJRU5ErkJggg==";
  private static com.google.gwt.resources.client.ImageResource background;
  private static com.google.gwt.resources.client.ImageResource bottomBorder;
  private static com.google.gwt.resources.client.ImageResource bottomLeftBorder;
  private static com.google.gwt.resources.client.ImageResource bottomRightBorder;
  private static com.google.gwt.resources.client.ImageResource leftBorder;
  private static com.google.gwt.resources.client.ImageResource rightBorder;
  private static com.google.gwt.resources.client.ImageResource topBorder;
  private static com.google.gwt.resources.client.ImageResource topLeftBorder;
  private static com.google.gwt.resources.client.ImageResource topRightBorder;
  private static com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDivFrameStyle style;
  
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
      case 'background': return this.@com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDivFrameResources::background()();
      case 'bottomBorder': return this.@com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDivFrameResources::bottomBorder()();
      case 'bottomLeftBorder': return this.@com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDivFrameResources::bottomLeftBorder()();
      case 'bottomRightBorder': return this.@com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDivFrameResources::bottomRightBorder()();
      case 'leftBorder': return this.@com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDivFrameResources::leftBorder()();
      case 'rightBorder': return this.@com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDivFrameResources::rightBorder()();
      case 'topBorder': return this.@com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDivFrameResources::topBorder()();
      case 'topLeftBorder': return this.@com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDivFrameResources::topLeftBorder()();
      case 'topRightBorder': return this.@com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDivFrameResources::topRightBorder()();
      case 'style': return this.@com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDivFrameResources::style()();
    }
    return null;
  }-*/;
}
