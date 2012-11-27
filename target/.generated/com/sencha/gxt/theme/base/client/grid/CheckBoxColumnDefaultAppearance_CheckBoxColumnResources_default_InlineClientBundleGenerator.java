package com.sencha.gxt.theme.base.client.grid;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class CheckBoxColumnDefaultAppearance_CheckBoxColumnResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.base.client.grid.CheckBoxColumnDefaultAppearance.CheckBoxColumnResources {
  private static CheckBoxColumnDefaultAppearance_CheckBoxColumnResources_default_InlineClientBundleGenerator _instance0 = new CheckBoxColumnDefaultAppearance_CheckBoxColumnResources_default_InlineClientBundleGenerator();
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
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.base.client.grid.CheckBoxColumnDefaultAppearance.CheckBoxColumnStyle() {
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
        return (".GP34Q33N0C .x-grid-td-checker{width:" + ((CheckBoxColumnDefaultAppearance_CheckBoxColumnResources_default_InlineClientBundleGenerator.this.specialColumn()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CheckBoxColumnDefaultAppearance_CheckBoxColumnResources_default_InlineClientBundleGenerator.this.specialColumn()).getSafeUri().asString() + "\") -" + (CheckBoxColumnDefaultAppearance_CheckBoxColumnResources_default_InlineClientBundleGenerator.this.specialColumn()).getLeft() + "px -" + (CheckBoxColumnDefaultAppearance_CheckBoxColumnResources_default_InlineClientBundleGenerator.this.specialColumn()).getTop() + "px  repeat-y")  + ";vertical-align:" + ("top")  + ";height:" + ("auto")  + ";width:" + ("auto")  + ";}.GP34Q33E1C .x-grid-td-checker{width:" + ((CheckBoxColumnDefaultAppearance_CheckBoxColumnResources_default_InlineClientBundleGenerator.this.specialColumnSelected()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (CheckBoxColumnDefaultAppearance_CheckBoxColumnResources_default_InlineClientBundleGenerator.this.specialColumnSelected()).getSafeUri().asString() + "\") -" + (CheckBoxColumnDefaultAppearance_CheckBoxColumnResources_default_InlineClientBundleGenerator.this.specialColumnSelected()).getLeft() + "px -" + (CheckBoxColumnDefaultAppearance_CheckBoxColumnResources_default_InlineClientBundleGenerator.this.specialColumnSelected()).getTop() + "px  repeat-y")  + ";height:" + ("auto")  + ";width:") + (("auto")  + ";}.x-grid-row-checker,.x-grid-hd-checker{background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/row-check-sprite.gif"))  + ";}.GP34Q33M2{background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/unchecked.gif"))  + ";}.GP34Q33O2{background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/checked.gif"))  + ";}.GP34Q33N2{background-color:" + ("transparent")  + ";}.GP34Q33L0C .x-grid-td-checker .GP34Q33H0C,.GP34Q33A0C .x-grid-td-checker .GP34Q33M-C{padding:" + ("0")  + " !important;height:" + ("100%")  + ";}.x-grid-row-checker{width:" + ("100%")  + ";height:" + ("18px")  + ";background-position:" + ("3px"+ " " +"2px")  + ";background-repeat:" + ("no-repeat") ) + (";background-color:" + ("transparent")  + ";}.x-grid-hd-checker{width:" + ("100%")  + ";height:" + ("18px")  + ";background-position:" + ("3px"+ " " +"2px")  + ";background-repeat:" + ("no-repeat")  + ";background-color:" + ("transparent")  + ";padding-bottom:" + ("0")  + " !important;}.GP34Q33N0C .x-grid-row-checker{background-position:" + ("2px"+ " " +"2px")  + ";}.GP34Q33E1C .x-grid-row-checker,.GP34Q33K3 .x-grid-hd-checker,.x-grid-row-checked .x-grid-row-checker{background-position:" + ("-23px"+ " " +"2px")  + ";}.x-grid-hd-checker{background-position:" + ("2px"+ " " +"3px")  + ";}.GP34Q33K3 .x-grid-hd-checker{background-position:") + (("-23px"+ " " +"3px")  + ";}");
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
      public java.lang.String checkColumn(){
        return "GP34Q33M2";
      }
      public java.lang.String checkColumnDisabled(){
        return "GP34Q33N2";
      }
      public java.lang.String checkColumnSelected(){
        return "GP34Q33O2";
      }
      public java.lang.String columnLines(){
        return "GP34Q33K0C";
      }
      public java.lang.String columnMoveBottom(){
        return "GP34Q33I-C";
      }
      public java.lang.String columnMoveTop(){
        return "GP34Q33J-C";
      }
      public java.lang.String dataTable(){
        return "GP34Q33L0C";
      }
      public java.lang.String head(){
        return "GP34Q33K-C";
      }
      public java.lang.String headButton(){
        return "GP34Q33L-C";
      }
      public java.lang.String headInner(){
        return "GP34Q33M-C";
      }
      public java.lang.String headMenuOpen(){
        return "GP34Q33N-C";
      }
      public java.lang.String headOver(){
        return "GP34Q33O-C";
      }
      public java.lang.String headRow(){
        return "GP34Q33P-C";
      }
      public java.lang.String header(){
        return "GP34Q33A0C";
      }
      public java.lang.String headerChecked(){
        return "GP34Q33K3";
      }
      public java.lang.String headerInner(){
        return "GP34Q33B0C";
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
      public java.lang.String sortAsc(){
        return "GP34Q33C0C";
      }
      public java.lang.String sortDesc(){
        return "GP34Q33D0C";
      }
      public java.lang.String sortIcon(){
        return "GP34Q33E0C";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.base.client.grid.CheckBoxColumnDefaultAppearance.CheckBoxColumnStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.base.client.grid.CheckBoxColumnDefaultAppearance.CheckBoxColumnStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAACCAYAAABCOhwFAAAANklEQVR42rXNqREAIAwEQPqvLn2QH0xUmDmBxiBW76iqfhG5wWNd5glq0aIOLNaTFYiox+/gACe+uBEe1wRCAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAACCAYAAABCOhwFAAAAXUlEQVR42rXNvQ6CMBSA0b7/o/AsDgSiRmIwKNTW8iOaMPTe5qOzu8OZjwnfxC//Sbg1Yd/KsCh9dp+VblJuo9IG5foSGi9cnHB+CqfsaIV6iFR9pHxEisOG+XewA9F9tJvfRlttAAAAAElFTkSuQmCC";
  private static com.google.gwt.resources.client.ImageResource specialColumn;
  private static com.google.gwt.resources.client.ImageResource specialColumnSelected;
  private static com.sencha.gxt.theme.base.client.grid.CheckBoxColumnDefaultAppearance.CheckBoxColumnStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      specialColumn(), 
      specialColumnSelected(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("specialColumn", specialColumn());
        resourceMap.put("specialColumnSelected", specialColumnSelected());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'specialColumn': return this.@com.sencha.gxt.theme.base.client.grid.CheckBoxColumnDefaultAppearance.CheckBoxColumnResources::specialColumn()();
      case 'specialColumnSelected': return this.@com.sencha.gxt.theme.base.client.grid.CheckBoxColumnDefaultAppearance.CheckBoxColumnResources::specialColumnSelected()();
      case 'style': return this.@com.sencha.gxt.theme.base.client.grid.CheckBoxColumnDefaultAppearance.CheckBoxColumnResources::style()();
    }
    return null;
  }-*/;
}
