package com.sencha.gxt.theme.gray.client.grid;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class GrayGridAppearance_GrayGridResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.gray.client.grid.GrayGridAppearance.GrayGridResources {
  private static GrayGridAppearance_GrayGridResources_default_InlineClientBundleGenerator _instance0 = new GrayGridAppearance_GrayGridResources_default_InlineClientBundleGenerator();
  private void cssInitializer() {
    css = new com.sencha.gxt.theme.gray.client.grid.GrayGridAppearance.GrayGridStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GP34Q33JFC{position:" + ("relative")  + ";overflow:" + ("hidden")  + ";outline:" + ("0"+ " " +"none")  + ";}.GP34Q33EGC{overflow:" + ("auto")  + ";zoom:" + ("1")  + ";position:" + ("relative")  + ";background-color:" + ("white")  + ";}TH{border-bottom:" + ("none")  + " !important;}.GP34Q33L0C{table-layout:" + ("fixed")  + ";border-collapse:" + ("separate")  + ";border-spacing:") + (("0")  + ";}.GP34Q33N0C{cursor:" + ("default")  + ";padding:" + ("0"+ " " +"1px")  + ";vertical-align:" + ("top")  + ";}.GP34Q33C1C{border:" + ("1px"+ " " +"dotted"+ " " +"#545352")  + ";}.GP34Q33E1C .GP34Q33F0C{background-color:" + ("#dfe8f6")  + " !important;border-color:" + ("#a3bae9")  + ";border-style:" + ("dotted")  + ";}.GP34Q33O0C .GP34Q33F0C{background-color:" + ("#fafafa")  + ";}.GP34Q33D1C .GP34Q33F0C{background-color:" + ("#efefef")  + ";border-width:" + ("1px"+ " " +"0") ) + (";border-style:" + ("solid")  + ";}.GP34Q33F0C{background-color:" + ("white")  + ";border-color:" + ("#fafafa"+ " " +"#ededed"+ " " +"#ededed")  + ";border-left:" + ("0"+ " " +"solid"+ " " +"#ededed")  + ";border-style:" + ("solid")  + ";border-width:" + ("1px"+ " " +"0")  + ";font:" + ("11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";overflow:" + ("hidden")  + ";}.GP34Q33H0C{overflow:" + ("hidden")  + ";padding:" + ("4px"+ " " +"5px"+ " " +"3px"+ " " +"3px")  + ";line-height:") + (("13px")  + ";white-space:" + ("nowrap")  + ";-o-text-overflow:" + ("ellipsis")  + ";text-overflow:" + ("ellipsis")  + ";}.GP34Q33G0C{background:" + ("transparent"+ " " +"no-repeat"+ " " +"0"+ " " +"0")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/dirty.gif"))  + ";}.GP34Q33I0C{background:" + ("repeat-x"+ " " +"bottom")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/invalid_line.gif"))  + ";}.GP34Q33G0C{background:" + ("transparent"+ " " +"no-repeat"+ " " +"0"+ " " +"0")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/dirty.gif"))  + ";}.GP34Q33J0C{background-color:" + ("#b8cfee") ) + (" !important;color:" + ("#000")  + ";}.GP34Q33D1C .GP34Q33F0C,.GP34Q33D1C .GP34Q33F1C{border-color:" + ("#ddd")  + ";}.GP34Q33K0C .GP34Q33F0C{padding-left:" + ("0")  + ";border-left:" + ("1px"+ " " +"solid")  + ";}.GP34Q33HFC{padding:" + ("10px")  + ";color:" + ("gray")  + ";font:" + ("normal"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.GP34Q33P0C{font:" + ("11px"+ "/"+ " " +"13px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";padding:" + ("4px")  + ";}.GP34Q33F1C{border-color:" + ("#fafafa"+ " " +"#ededed"+ " " +"#ededed")  + ";border-left:") + (("0"+ " " +"solid"+ " " +"#ededed")  + ";border-style:" + ("solid")  + ";border-width:" + ("1px")  + ";overflow:" + ("hidden")  + ";}.GP34Q33E1C .GP34Q33F0C,.GP34Q33E1C .GP34Q33F1C{background-color:" + ("#dfe8f6")  + " !important;border-color:" + ("#a3bae9")  + ";border-style:" + ("dotted")  + ";}.GP34Q33F1C .GP34Q33F0C,.GP34Q33F1C .GP34Q33H0C{border:" + ("none")  + ";}.x-grid-td-numberer,.GP34Q33E1C .x-grid-td-numberer{background:" + ("transparent"+ " " +"repeat-y"+ " " +"left")  + ";}.x-grid-td-numberer .GP34Q33H0C{padding:" + ("3px"+ " " +"0"+ " " +"0"+ " " +"5px")  + " !important;text-align:" + ("center") ) + (";color:" + ("#444")  + ";}.GP34Q33N0C .x-grid-td-numberer{width:" + ((GrayGridAppearance_GrayGridResources_default_InlineClientBundleGenerator.this.specialColumn()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayGridAppearance_GrayGridResources_default_InlineClientBundleGenerator.this.specialColumn()).getSafeUri().asString() + "\") -" + (GrayGridAppearance_GrayGridResources_default_InlineClientBundleGenerator.this.specialColumn()).getLeft() + "px -" + (GrayGridAppearance_GrayGridResources_default_InlineClientBundleGenerator.this.specialColumn()).getTop() + "px  repeat-y")  + ";height:" + ("auto")  + ";width:" + ("auto")  + ";}.GP34Q33E1C .x-grid-td-numberer{width:" + ((GrayGridAppearance_GrayGridResources_default_InlineClientBundleGenerator.this.specialColumnSelected()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayGridAppearance_GrayGridResources_default_InlineClientBundleGenerator.this.specialColumnSelected()).getSafeUri().asString() + "\") -" + (GrayGridAppearance_GrayGridResources_default_InlineClientBundleGenerator.this.specialColumnSelected()).getLeft() + "px -" + (GrayGridAppearance_GrayGridResources_default_InlineClientBundleGenerator.this.specialColumnSelected()).getTop() + "px  repeat-y")  + ";height:" + ("auto")  + ";width:") + (("auto")  + ";}.GP34Q33IFC{background:" + ("#f7f7f7"+ " " +"none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";display:" + ("block")  + ";overflow:" + ("hidden")  + ";position:" + ("relative")  + ";}.GP34Q33IFC .GP34Q33F0C{background:" + ("none")  + ";}.x-treegrid .x-treegrid-column .GP34Q33H0C{padding:" + ("0")  + " !important;}.GP34Q33C1C{border:" + ("1px"+ " " +"dotted"+ " " +"#535353")  + ";}.GP34Q33O0C .GP34Q33F0C{background-color:" + ("#fafafa") ) + (";}.GP34Q33D1C .GP34Q33F0C{background-color:" + ("#eee")  + ";}.GP34Q33F0C{border-color:" + ("#fafafa"+ " " +"#ededed"+ " " +"#ededed")  + ";border-left:" + ("0"+ " " +"solid"+ " " +"#ededed")  + ";}.GP34Q33J0C{background-color:" + ("#c9c9c9")  + " !important;color:" + ("#000")  + ";}.GP34Q33K0C .GP34Q33F0C{border-left-color:" + ("#ededed")  + ";}.GP34Q33D1C .GP34Q33F0C,.GP34Q33D1C .GP34Q33F1C{border-color:" + ("#ddd")  + ";}.GP34Q33F1C{border-color:" + ("#fafafa"+ " " +"#ededed"+ " " +"#ededed")  + ";border-left:" + ("0"+ " " +"solid"+ " " +"#ededed")  + ";border-style:" + ("solid")  + ";border-width:") + (("1px")  + ";overflow:" + ("hidden")  + ";}.GP34Q33E1C .GP34Q33F0C,.GP34Q33E1C .GP34Q33F1C{background-color:" + ("#dfe8f6")  + " !important;border-color:" + ("#a3bae9")  + ";}.GP34Q33IFC{background:" + ("#f7f7f7"+ " " +"none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";display:" + ("block")  + ";overflow:" + ("hidden")  + ";position:" + ("relative")  + ";}")) : ((".GP34Q33JFC{position:" + ("relative")  + ";overflow:" + ("hidden")  + ";outline:" + ("0"+ " " +"none")  + ";}.GP34Q33EGC{overflow:" + ("auto")  + ";zoom:" + ("1")  + ";position:" + ("relative")  + ";background-color:" + ("white")  + ";}TH{border-bottom:" + ("none")  + " !important;}.GP34Q33L0C{table-layout:" + ("fixed")  + ";border-collapse:" + ("separate")  + ";border-spacing:") + (("0")  + ";}.GP34Q33N0C{cursor:" + ("default")  + ";padding:" + ("0"+ " " +"1px")  + ";vertical-align:" + ("top")  + ";}.GP34Q33C1C{border:" + ("1px"+ " " +"dotted"+ " " +"#545352")  + ";}.GP34Q33E1C .GP34Q33F0C{background-color:" + ("#dfe8f6")  + " !important;border-color:" + ("#a3bae9")  + ";border-style:" + ("dotted")  + ";}.GP34Q33O0C .GP34Q33F0C{background-color:" + ("#fafafa")  + ";}.GP34Q33D1C .GP34Q33F0C{background-color:" + ("#efefef")  + ";border-width:" + ("1px"+ " " +"0") ) + (";border-style:" + ("solid")  + ";}.GP34Q33F0C{background-color:" + ("white")  + ";border-color:" + ("#fafafa"+ " " +"#ededed"+ " " +"#ededed")  + ";border-right:" + ("0"+ " " +"solid"+ " " +"#ededed")  + ";border-style:" + ("solid")  + ";border-width:" + ("1px"+ " " +"0")  + ";font:" + ("11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";overflow:" + ("hidden")  + ";}.GP34Q33H0C{overflow:" + ("hidden")  + ";padding:" + ("4px"+ " " +"3px"+ " " +"3px"+ " " +"5px")  + ";line-height:") + (("13px")  + ";white-space:" + ("nowrap")  + ";-o-text-overflow:" + ("ellipsis")  + ";text-overflow:" + ("ellipsis")  + ";}.GP34Q33G0C{background:" + ("transparent"+ " " +"no-repeat"+ " " +"0"+ " " +"0")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/dirty.gif"))  + ";}.GP34Q33I0C{background:" + ("repeat-x"+ " " +"bottom")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/invalid_line.gif"))  + ";}.GP34Q33G0C{background:" + ("transparent"+ " " +"no-repeat"+ " " +"0"+ " " +"0")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/dirty.gif"))  + ";}.GP34Q33J0C{background-color:" + ("#b8cfee") ) + (" !important;color:" + ("#000")  + ";}.GP34Q33D1C .GP34Q33F0C,.GP34Q33D1C .GP34Q33F1C{border-color:" + ("#ddd")  + ";}.GP34Q33K0C .GP34Q33F0C{padding-right:" + ("0")  + ";border-right:" + ("1px"+ " " +"solid")  + ";}.GP34Q33HFC{padding:" + ("10px")  + ";color:" + ("gray")  + ";font:" + ("normal"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.GP34Q33P0C{font:" + ("11px"+ "/"+ " " +"13px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"verdana"+ ","+ " " +"sans-serif")  + ";padding:" + ("4px")  + ";}.GP34Q33F1C{border-color:" + ("#fafafa"+ " " +"#ededed"+ " " +"#ededed")  + ";border-right:") + (("0"+ " " +"solid"+ " " +"#ededed")  + ";border-style:" + ("solid")  + ";border-width:" + ("1px")  + ";overflow:" + ("hidden")  + ";}.GP34Q33E1C .GP34Q33F0C,.GP34Q33E1C .GP34Q33F1C{background-color:" + ("#dfe8f6")  + " !important;border-color:" + ("#a3bae9")  + ";border-style:" + ("dotted")  + ";}.GP34Q33F1C .GP34Q33F0C,.GP34Q33F1C .GP34Q33H0C{border:" + ("none")  + ";}.x-grid-td-numberer,.GP34Q33E1C .x-grid-td-numberer{background:" + ("transparent"+ " " +"repeat-y"+ " " +"right")  + ";}.x-grid-td-numberer .GP34Q33H0C{padding:" + ("3px"+ " " +"5px"+ " " +"0"+ " " +"0")  + " !important;text-align:" + ("center") ) + (";color:" + ("#444")  + ";}.GP34Q33N0C .x-grid-td-numberer{width:" + ((GrayGridAppearance_GrayGridResources_default_InlineClientBundleGenerator.this.specialColumn()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayGridAppearance_GrayGridResources_default_InlineClientBundleGenerator.this.specialColumn()).getSafeUri().asString() + "\") -" + (GrayGridAppearance_GrayGridResources_default_InlineClientBundleGenerator.this.specialColumn()).getLeft() + "px -" + (GrayGridAppearance_GrayGridResources_default_InlineClientBundleGenerator.this.specialColumn()).getTop() + "px  repeat-y")  + ";height:" + ("auto")  + ";width:" + ("auto")  + ";}.GP34Q33E1C .x-grid-td-numberer{width:" + ((GrayGridAppearance_GrayGridResources_default_InlineClientBundleGenerator.this.specialColumnSelected()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (GrayGridAppearance_GrayGridResources_default_InlineClientBundleGenerator.this.specialColumnSelected()).getSafeUri().asString() + "\") -" + (GrayGridAppearance_GrayGridResources_default_InlineClientBundleGenerator.this.specialColumnSelected()).getLeft() + "px -" + (GrayGridAppearance_GrayGridResources_default_InlineClientBundleGenerator.this.specialColumnSelected()).getTop() + "px  repeat-y")  + ";height:" + ("auto")  + ";width:") + (("auto")  + ";}.GP34Q33IFC{background:" + ("#f7f7f7"+ " " +"none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";display:" + ("block")  + ";overflow:" + ("hidden")  + ";position:" + ("relative")  + ";}.GP34Q33IFC .GP34Q33F0C{background:" + ("none")  + ";}.x-treegrid .x-treegrid-column .GP34Q33H0C{padding:" + ("0")  + " !important;}.GP34Q33C1C{border:" + ("1px"+ " " +"dotted"+ " " +"#535353")  + ";}.GP34Q33O0C .GP34Q33F0C{background-color:" + ("#fafafa") ) + (";}.GP34Q33D1C .GP34Q33F0C{background-color:" + ("#eee")  + ";}.GP34Q33F0C{border-color:" + ("#fafafa"+ " " +"#ededed"+ " " +"#ededed")  + ";border-right:" + ("0"+ " " +"solid"+ " " +"#ededed")  + ";}.GP34Q33J0C{background-color:" + ("#c9c9c9")  + " !important;color:" + ("#000")  + ";}.GP34Q33K0C .GP34Q33F0C{border-right-color:" + ("#ededed")  + ";}.GP34Q33D1C .GP34Q33F0C,.GP34Q33D1C .GP34Q33F1C{border-color:" + ("#ddd")  + ";}.GP34Q33F1C{border-color:" + ("#fafafa"+ " " +"#ededed"+ " " +"#ededed")  + ";border-right:" + ("0"+ " " +"solid"+ " " +"#ededed")  + ";border-style:" + ("solid")  + ";border-width:") + (("1px")  + ";overflow:" + ("hidden")  + ";}.GP34Q33E1C .GP34Q33F0C,.GP34Q33E1C .GP34Q33F1C{background-color:" + ("#dfe8f6")  + " !important;border-color:" + ("#a3bae9")  + ";}.GP34Q33IFC{background:" + ("#f7f7f7"+ " " +"none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"0")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ddd")  + ";display:" + ("block")  + ";overflow:" + ("hidden")  + ";position:" + ("relative")  + ";}"));
      }
      public java.lang.String body(){
        return "GP34Q33PEC";
      }
      public java.lang.String cell(){
        return "GP34Q33F0C";
      }
      public java.lang.String cellDirty(){
        return "GP34Q33G0C";
      }
      public java.lang.String cellInner(){
        return "GP34Q33H0C";
      }
      public java.lang.String cellInvalid(){
        return "GP34Q33I0C";
      }
      public java.lang.String cellSelected(){
        return "GP34Q33J0C";
      }
      public java.lang.String columnLines(){
        return "GP34Q33K0C";
      }
      public java.lang.String dataTable(){
        return "GP34Q33L0C";
      }
      public java.lang.String empty(){
        return "GP34Q33HFC";
      }
      public java.lang.String footer(){
        return "GP34Q33IFC";
      }
      public java.lang.String grid(){
        return "GP34Q33JFC";
      }
      public java.lang.String headerRow(){
        return "GP34Q33M0C";
      }
      public java.lang.String row(){
        return "GP34Q33N0C";
      }
      public java.lang.String rowAlt(){
        return "GP34Q33O0C";
      }
      public java.lang.String rowBody(){
        return "GP34Q33P0C";
      }
      public java.lang.String rowBodyRow(){
        return "GP34Q33A1C";
      }
      public java.lang.String rowDirty(){
        return "GP34Q33B1C";
      }
      public java.lang.String rowHighlight(){
        return "GP34Q33C1C";
      }
      public java.lang.String rowOver(){
        return "GP34Q33D1C";
      }
      public java.lang.String rowSelected(){
        return "GP34Q33E1C";
      }
      public java.lang.String rowWrap(){
        return "GP34Q33F1C";
      }
      public java.lang.String scroller(){
        return "GP34Q33EGC";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static com.sencha.gxt.theme.gray.client.grid.GrayGridAppearance.GrayGridStyle get() {
      return css;
    }
  }
  public com.sencha.gxt.theme.gray.client.grid.GrayGridAppearance.GrayGridStyle css() {
    return cssInitializer.get();
  }
  private void specialColumnInitializer() {
    specialColumn = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "specialColumn",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 24, 2, false, false
    );
  }
  private static class specialColumnInitializer {
    static {
      _instance0.specialColumnInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return specialColumn;
    }
  }
  public com.google.gwt.resources.client.ImageResource specialColumn() {
    return specialColumnInitializer.get();
  }
  private void specialColumnSelectedInitializer() {
    specialColumnSelected = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "specialColumnSelected",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 24, 2, false, false
    );
  }
  private static class specialColumnSelectedInitializer {
    static {
      _instance0.specialColumnSelectedInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return specialColumnSelected;
    }
  }
  public com.google.gwt.resources.client.ImageResource specialColumnSelected() {
    return specialColumnSelectedInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.gray.client.grid.GrayGridAppearance.GrayGridStyle css;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAACCAYAAABCOhwFAAAANklEQVR42rXNqREAIAwEQPqvLn2QH0xUmDmBxiBW76iqfhG5wWNd5glq0aIOLNaTFYiox+/gACe+uBEe1wRCAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAACCAYAAABCOhwFAAAAXUlEQVR42rXNvQ6CMBSA0b7/o/AsDgSiRmIwKNTW8iOaMPTe5qOzu8OZjwnfxC//Sbg1Yd/KsCh9dp+VblJuo9IG5foSGi9cnHB+CqfsaIV6iFR9pHxEisOG+XewA9F9tJvfRlttAAAAAElFTkSuQmCC";
  private static com.google.gwt.resources.client.ImageResource specialColumn;
  private static com.google.gwt.resources.client.ImageResource specialColumnSelected;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      css(), 
      specialColumn(), 
      specialColumnSelected(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("css", css());
        resourceMap.put("specialColumn", specialColumn());
        resourceMap.put("specialColumnSelected", specialColumnSelected());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'css': return this.@com.sencha.gxt.theme.gray.client.grid.GrayGridAppearance.GrayGridResources::css()();
      case 'specialColumn': return this.@com.sencha.gxt.theme.base.client.grid.GridBaseAppearance.GridResources::specialColumn()();
      case 'specialColumnSelected': return this.@com.sencha.gxt.theme.base.client.grid.GridBaseAppearance.GridResources::specialColumnSelected()();
    }
    return null;
  }-*/;
}
