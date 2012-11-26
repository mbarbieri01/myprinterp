package com.sencha.gxt.theme.gray.client.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class GrayCheckMenuItemAppearance_GrayCheckMenuItemResources_chrome_safari_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.gray.client.menu.GrayCheckMenuItemAppearance.GrayCheckMenuItemResources {
  private static GrayCheckMenuItemAppearance_GrayCheckMenuItemResources_chrome_safari_default_InlineClientBundleGenerator _instance0 = new GrayCheckMenuItemAppearance_GrayCheckMenuItemResources_chrome_safari_default_InlineClientBundleGenerator();
  private void checkStyleInitializer() {
    checkStyle = new com.sencha.gxt.theme.gray.client.menu.GrayCheckMenuItemAppearance.GrayCheckMenuItemStyle() {
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
        return "checkStyle";
      }
      public String getText() {
        return (".GP34Q33FGC{border:" + ("1px"+ " " +"dotted")  + " !important;padding:" + ("0")  + ";border-color:" + ("#b8b8b8")  + " !important;background-color:" + ("#efefef")  + ";}");
      }
      public java.lang.String menuItemChecked(){
        return "GP34Q33FGC";
      }
    }
    ;
  }
  private static class checkStyleInitializer {
    static {
      _instance0.checkStyleInitializer();
    }
    static com.sencha.gxt.theme.gray.client.menu.GrayCheckMenuItemAppearance.GrayCheckMenuItemStyle get() {
      return checkStyle;
    }
  }
  public com.sencha.gxt.theme.gray.client.menu.GrayCheckMenuItemAppearance.GrayCheckMenuItemStyle checkStyle() {
    return checkStyleInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.gray.client.menu.GrayMenuItemAppearance.GrayMenuItemStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GP34Q33JHC{-khtml-user-select:" + ("none")  + ";-webkit-user-select:" + ("ignore")  + ";}a.GP34Q33JHC{cursor:" + ("pointer")  + ";display:" + ("block")  + ";line-height:" + ("16px")  + ";outline-style:" + ("none")  + ";outline-width:" + ("0")  + ";padding:" + ("3px"+ " " +"27px"+ " " +"3px"+ " " +"21px")  + ";position:" + ("relative")  + ";text-decoration:" + ("none")  + ";white-space:") + (("nowrap")  + ";color:" + ("#222")  + ";}.GP34Q33MHC{white-space:" + ("nowrap")  + ";display:" + ("block")  + ";padding:" + ("1px")  + ";font:" + ("normal"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"sans-serif")  + ";}.GP34Q33LHC{border:" + ("0"+ " " +"none")  + ";height:" + ("16px")  + ";padding:" + ("0")  + ";vertical-align:" + ("top")  + ";width:" + ("16px") ) + (";position:" + ("absolute")  + ";right:" + ("3px")  + ";top:" + ("3px")  + ";margin:" + ("0")  + ";background-position:" + ("center")  + ";}.GP34Q33KHC{height:" + ((GrayCheckMenuItemAppearance_GrayCheckMenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getHeight() + "px")  + ";width:" + ((GrayCheckMenuItemAppearance_GrayCheckMenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayCheckMenuItemAppearance_GrayCheckMenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getSafeUri().asString() + "\") -" + (GrayCheckMenuItemAppearance_GrayCheckMenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getLeft() + "px -" + (GrayCheckMenuItemAppearance_GrayCheckMenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getTop() + "px  no-repeat")  + ";height:" + ("auto")  + ";width:") + (("auto")  + ";background-position:" + ("left")  + ";background-repeat:" + ("no-repeat")  + ";}")) : ((".GP34Q33JHC{-khtml-user-select:" + ("none")  + ";-webkit-user-select:" + ("ignore")  + ";}a.GP34Q33JHC{cursor:" + ("pointer")  + ";display:" + ("block")  + ";line-height:" + ("16px")  + ";outline-style:" + ("none")  + ";outline-width:" + ("0")  + ";padding:" + ("3px"+ " " +"21px"+ " " +"3px"+ " " +"27px")  + ";position:" + ("relative")  + ";text-decoration:" + ("none")  + ";white-space:") + (("nowrap")  + ";color:" + ("#222")  + ";}.GP34Q33MHC{white-space:" + ("nowrap")  + ";display:" + ("block")  + ";padding:" + ("1px")  + ";font:" + ("normal"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"sans-serif")  + ";}.GP34Q33LHC{border:" + ("0"+ " " +"none")  + ";height:" + ("16px")  + ";padding:" + ("0")  + ";vertical-align:" + ("top")  + ";width:" + ("16px") ) + (";position:" + ("absolute")  + ";left:" + ("3px")  + ";top:" + ("3px")  + ";margin:" + ("0")  + ";background-position:" + ("center")  + ";}.GP34Q33KHC{height:" + ((GrayCheckMenuItemAppearance_GrayCheckMenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getHeight() + "px")  + ";width:" + ((GrayCheckMenuItemAppearance_GrayCheckMenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayCheckMenuItemAppearance_GrayCheckMenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getSafeUri().asString() + "\") -" + (GrayCheckMenuItemAppearance_GrayCheckMenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getLeft() + "px -" + (GrayCheckMenuItemAppearance_GrayCheckMenuItemResources_chrome_safari_default_InlineClientBundleGenerator.this.menuParent()).getTop() + "px  no-repeat")  + ";height:" + ("auto")  + ";width:") + (("auto")  + ";background-position:" + ("right")  + ";background-repeat:" + ("no-repeat")  + ";}"));
      }
      public java.lang.String menuItem(){
        return "GP34Q33JHC";
      }
      public java.lang.String menuItemArrow(){
        return "GP34Q33KHC";
      }
      public java.lang.String menuItemIcon(){
        return "GP34Q33LHC";
      }
      public java.lang.String menuListItem(){
        return "GP34Q33MHC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.gray.client.menu.GrayMenuItemAppearance.GrayMenuItemStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.gray.client.menu.GrayMenuItemAppearance.GrayMenuItemStyle style() {
    return styleInitializer.get();
  }
  private void checkedInitializer() {
    checked = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "checked",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 16, 16, false, false
    );
  }
  private static class checkedInitializer {
    static {
      _instance0.checkedInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return checked;
    }
  }
  public com.google.gwt.resources.client.ImageResource checked() {
    return checkedInitializer.get();
  }
  private void groupCheckedInitializer() {
    groupChecked = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "groupChecked",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 16, 16, false, false
    );
  }
  private static class groupCheckedInitializer {
    static {
      _instance0.groupCheckedInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return groupChecked;
    }
  }
  public com.google.gwt.resources.client.ImageResource groupChecked() {
    return groupCheckedInitializer.get();
  }
  private void menuParentInitializer() {
    menuParent = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "menuParent",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 12, 9, false, false
    );
  }
  private static class menuParentInitializer {
    static {
      _instance0.menuParentInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return menuParent;
    }
  }
  public com.google.gwt.resources.client.ImageResource menuParent() {
    return menuParentInitializer.get();
  }
  private void uncheckedInitializer() {
    unchecked = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "unchecked",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage2),
      0, 0, 16, 16, false, false
    );
  }
  private static class uncheckedInitializer {
    static {
      _instance0.uncheckedInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return unchecked;
    }
  }
  public com.google.gwt.resources.client.ImageResource unchecked() {
    return uncheckedInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.gray.client.menu.GrayCheckMenuItemAppearance.GrayCheckMenuItemStyle checkStyle;
  private static com.sencha.gxt.theme.gray.client.menu.GrayMenuItemAppearance.GrayMenuItemStyle style;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAABW0lEQVR42s2Ty0sCURTG/d+KstoHUZpQBC2CCLJdyzZFRpTmwkWUCAUWtKixwiIKn4xCdygdX0ONjS96jMNMm6+ZC7nInAo3HfjgXi7nd875ONdi+Rex6nLhr2oDyLLcUaqqQtM0KIpC7x0BwSOmTdFECr7ABZxL++ALD2g2m+aAOEtaSqQ41BsvGJ72oWdkHUw4Rbv4FSCZ5lAURBycsOjVkyedfpTLTz+PQO5zKAiPIHc8Xt9k2Ga30Te6gbMrDlmeNwdcR5OIsjnsBCN66w2ELgmsNjcm5v3USEI4c0C+WMLM4h6tyN4KmFoIYHDcg+MwobPzubw5IMmmkS9J6B/bhNXupsmOuV2o2jt9LwmCOeAmEkOl9oxl7ykG7B4MObZwyKRbOyCKojkgFk8gk8nqJkpY8Yaw5jvXjVRQq9dRrdYgSRVzwKeMZTGqGsYZ56+b+S2gq7/QTXwA3ngd6xuLHCkAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAA20lEQVR42mNgGAU4gV/lvP88XvX/Wd3q/rsXzvxPkmafmsX/lWO6/svG9v5nC+39z+DZ/t8hZw5xhvhXzv2vAtSsm9T7XzYGaEAI0ADfnv8MTk3/3bKnEDaE17v+vwLQZjkgFowEag4CYu+u/wyuLf+ZLYsJG8DmXvufI6z3PwfQ6YxBUNs92oEuaPzPbF5I2AA3UIB5dfxn8ANq9On+z+AO1Ozc9J/Buuq/a/pE4sLBIRcYYC7N/xncWsF+B2l2SJ1CWkw4ZU7+z2RW9J/JpOC/U9qE/6MJGzcAAA5fZUJ66l+pAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAwAAAAJCAYAAAAGuM1UAAAAb0lEQVR42mOwaLr2n4EUYNtx979Ny2XiNWmXnvo/9fT//5bEagJp6Dv87X/X4T//HTtv/idKQ8iCl/+TVn38n77g6n+j0v3/CWoIWvDmf+iUc/+1CvcTZ4N798n/mnn7iPeDTsEB4kPJquocSfEAADQCQiRH/8LtAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage2 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAABBElEQVR42s2T3UrDQBBG+/4X9k0UtKC11dKqVWyDrW7a2E0aN39NdhMSQpLbz3QvAqJuK7lx4LAwMGeGYbbT+Rdx0u3ir3wTFEVxNL8KTi/6P3LWu0avf4PB7fiwYPaif2HxZkA3TFDLxvju4XiBtlzhVd/AoFtYNoPjepg+Ph0WaMs1FuQdZE1lV+a48IMAYRhirmlqwfnlUI67MW18MFcWxXGMJEkkRF+pBVeDkRzX831wzpGmKfI8bzCtrVowHE3gej6iKJId90X7fFmW8mWOoxZM7qdNcZZlMldVVUNQ70IpeJ7NQYgOSs16BwzBbgcuBES9ByHiWs7VglaX2OovtIlPX7c5S7fSRyEAAAAASUVORK5CYII=";
  private static com.google.gwt.resources.client.ImageResource checked;
  private static com.google.gwt.resources.client.ImageResource groupChecked;
  private static com.google.gwt.resources.client.ImageResource menuParent;
  private static com.google.gwt.resources.client.ImageResource unchecked;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      checkStyle(), 
      style(), 
      checked(), 
      groupChecked(), 
      menuParent(), 
      unchecked(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("checkStyle", checkStyle());
        resourceMap.put("style", style());
        resourceMap.put("checked", checked());
        resourceMap.put("groupChecked", groupChecked());
        resourceMap.put("menuParent", menuParent());
        resourceMap.put("unchecked", unchecked());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'checkStyle': return this.@com.sencha.gxt.theme.gray.client.menu.GrayCheckMenuItemAppearance.GrayCheckMenuItemResources::checkStyle()();
      case 'style': return this.@com.sencha.gxt.theme.gray.client.menu.GrayMenuItemAppearance.GrayMenuItemResources::style()();
      case 'checked': return this.@com.sencha.gxt.theme.base.client.menu.CheckMenuItemBaseAppearance.CheckMenuItemResources::checked()();
      case 'groupChecked': return this.@com.sencha.gxt.theme.base.client.menu.CheckMenuItemBaseAppearance.CheckMenuItemResources::groupChecked()();
      case 'menuParent': return this.@com.sencha.gxt.theme.gray.client.menu.GrayMenuItemAppearance.GrayMenuItemResources::menuParent()();
      case 'unchecked': return this.@com.sencha.gxt.theme.base.client.menu.CheckMenuItemBaseAppearance.CheckMenuItemResources::unchecked()();
    }
    return null;
  }-*/;
}
