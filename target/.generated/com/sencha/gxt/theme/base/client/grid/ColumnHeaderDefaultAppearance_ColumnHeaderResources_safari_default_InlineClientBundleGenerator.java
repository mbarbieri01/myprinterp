package com.sencha.gxt.theme.base.client.grid;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.base.client.grid.ColumnHeaderDefaultAppearance.ColumnHeaderResources {
  private static ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator _instance0 = new ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator();
  private void columnHeaderInitializer() {
    columnHeader = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "columnHeader",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 2, 24, false, false
    );
  }
  private static class columnHeaderInitializer {
    static {
      _instance0.columnHeaderInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return columnHeader;
    }
  }
  public com.google.gwt.resources.client.ImageResource columnHeader() {
    return columnHeaderInitializer.get();
  }
  private void columnHeaderOverInitializer() {
    columnHeaderOver = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "columnHeaderOver",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 2, 22, false, false
    );
  }
  private static class columnHeaderOverInitializer {
    static {
      _instance0.columnHeaderOverInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return columnHeaderOver;
    }
  }
  public com.google.gwt.resources.client.ImageResource columnHeaderOver() {
    return columnHeaderOverInitializer.get();
  }
  private void columnMoveBottomInitializer() {
    columnMoveBottom = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "columnMoveBottom",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 9, 9, false, false
    );
  }
  private static class columnMoveBottomInitializer {
    static {
      _instance0.columnMoveBottomInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return columnMoveBottom;
    }
  }
  public com.google.gwt.resources.client.ImageResource columnMoveBottom() {
    return columnMoveBottomInitializer.get();
  }
  private void columnMoveTopInitializer() {
    columnMoveTop = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "columnMoveTop",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage2),
      0, 0, 9, 9, false, false
    );
  }
  private static class columnMoveTopInitializer {
    static {
      _instance0.columnMoveTopInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return columnMoveTop;
    }
  }
  public com.google.gwt.resources.client.ImageResource columnMoveTop() {
    return columnMoveTopInitializer.get();
  }
  private void columnsIconInitializer() {
    columnsIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "columnsIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage3),
      0, 0, 16, 16, false, false
    );
  }
  private static class columnsIconInitializer {
    static {
      _instance0.columnsIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return columnsIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource columnsIcon() {
    return columnsIconInitializer.get();
  }
  private void sortAscInitializer() {
    sortAsc = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "sortAsc",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage4),
      0, 0, 13, 5, false, false
    );
  }
  private static class sortAscInitializer {
    static {
      _instance0.sortAscInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return sortAsc;
    }
  }
  public com.google.gwt.resources.client.ImageResource sortAsc() {
    return sortAscInitializer.get();
  }
  private void sortAscendingIconInitializer() {
    sortAscendingIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "sortAscendingIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage5),
      0, 0, 16, 16, false, false
    );
  }
  private static class sortAscendingIconInitializer {
    static {
      _instance0.sortAscendingIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return sortAscendingIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource sortAscendingIcon() {
    return sortAscendingIconInitializer.get();
  }
  private void sortDescInitializer() {
    sortDesc = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "sortDesc",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage6),
      0, 0, 13, 5, false, false
    );
  }
  private static class sortDescInitializer {
    static {
      _instance0.sortDescInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return sortDesc;
    }
  }
  public com.google.gwt.resources.client.ImageResource sortDesc() {
    return sortDescInitializer.get();
  }
  private void sortDescendingIconInitializer() {
    sortDescendingIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "sortDescendingIcon",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage7),
      0, 0, 16, 16, false, false
    );
  }
  private static class sortDescendingIconInitializer {
    static {
      _instance0.sortDescendingIconInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return sortDescendingIcon;
    }
  }
  public com.google.gwt.resources.client.ImageResource sortDescendingIcon() {
    return sortDescendingIconInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.base.client.grid.ColumnHeaderDefaultAppearance.ColumnHeaderStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GP34Q33A0C{background:" + ("repeat-x"+ " " +"0"+ " " +"bottom")  + ";cursor:" + ("default")  + ";zoom:" + ("1")  + ";padding:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";background-color:" + ("#f9f9f9")  + ";height:" + ((ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnHeader()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnHeader()).getSafeUri().asString() + "\") -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnHeader()).getLeft() + "px -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnHeader()).getTop() + "px  repeat-x")  + ";background-color:" + ("#f9f9f9")  + ";height:" + ("auto")  + ";background-position:") + (("bottom")  + ";}.GP34Q33P-C .GP34Q33K-C{line-height:" + ("15px")  + ";vertical-align:" + ("middle")  + ";border-right:" + ("1px"+ " " +"solid")  + ";border-left:" + ("1px"+ " " +"solid")  + ";-moz-outline:" + ("none")  + ";-moz-user-focus:" + ("normal")  + ";outline:" + ("0"+ " " +"none")  + ";font:" + ("11px"+ " " +"arial"+ ","+ " " +"tahoma"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";border-right-color:" + ("#eee")  + ";border-left-color:" + ("#d0d0d0") ) + (";}.GP34Q33M-C{overflow:" + ("hidden")  + ";zoom:" + ("1")  + ";float:" + ("right")  + ";cursor:" + ("inherit")  + ";position:" + ("relative")  + ";vertical-align:" + ("middle")  + ";overflow:" + ("hidden")  + ";-o-text-overflow:" + ("ellipsis")  + ";text-overflow:" + ("ellipsis")  + ";padding:" + ("4px"+ " " +"5px"+ " " +"4px"+ " " +"3px")  + ";white-space:") + (("nowrap")  + ";}.GP34Q33K-C{-moz-user-select:" + ("none")  + ";-khtml-user-select:" + ("none")  + ";-webkit-user-select:" + ("ignore")  + ";}.GP34Q33L-C{display:" + ("none")  + ";position:" + ("absolute")  + ";width:" + ("14px")  + ";background:" + ("no-repeat"+ " " +"right"+ " " +"center")  + ";left:" + ("0")  + ";top:" + ("0")  + ";z-index:" + ("2") ) + (";cursor:" + ("pointer")  + ";outline:" + ("none")  + ";background-color:" + ("#c3daf9")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/grid3-hd-btn.gif"))  + ";background-color:" + ("#c3daf9")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/grid3-hd-btn.gif"))  + ";}.GP34Q33O-C .GP34Q33L-C,.GP34Q33N-C .GP34Q33L-C{display:" + ("block")  + ";}a.GP34Q33L-C:hover{background-position:" + ("-14px"+ " " +"center")  + ";}td.GP34Q33O-C,td.GP34Q33D0C,td.GP34Q33C0C,td.GP34Q33N-C{border-right:" + ("1px"+ " " +"solid")  + ";border-left:" + ("1px"+ " " +"solid")  + ";}td.GP34Q33O-C .GP34Q33M-C,td.GP34Q33D0C .GP34Q33M-C,td.GP34Q33C0C .GP34Q33M-C,td.GP34Q33N-C .GP34Q33M-C{background:") + (("repeat-x"+ " " +"right"+ " " +"bottom")  + ";}td.GP34Q33O-C,td.GP34Q33D0C,td.GP34Q33C0C,td.GP34Q33N-C{border-right-color:" + ("#aaccf6")  + ";border-left-color:" + ("#aaccf6")  + ";}td.GP34Q33O-C .GP34Q33M-C,td.GP34Q33D0C .GP34Q33M-C,td.GP34Q33C0C .GP34Q33M-C,td.GP34Q33N-C .GP34Q33M-C{height:" + ((ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnHeaderOver()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnHeaderOver()).getSafeUri().asString() + "\") -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnHeaderOver()).getLeft() + "px -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnHeaderOver()).getTop() + "px  repeat-x")  + ";background-color:" + ("#ebf3fd")  + ";background-position:" + ("right"+ " " +"bottom")  + ";}.GP34Q33E0C{background-repeat:" + ("no-repeat")  + ";display:" + ("none")  + ";height:" + ("4px") ) + (";width:" + ("13px")  + ";margin-right:" + ("3px")  + ";vertical-align:" + ("middle")  + ";}.GP34Q33C0C .GP34Q33E0C{display:" + ("inline")  + ";height:" + ((ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.sortAsc()).getHeight() + "px")  + ";width:" + ((ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.sortAsc()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.sortAsc()).getSafeUri().asString() + "\") -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.sortAsc()).getLeft() + "px -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.sortAsc()).getTop() + "px  no-repeat")  + ";}.GP34Q33D0C .GP34Q33E0C{display:" + ("inline")  + ";height:" + ((ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.sortDesc()).getHeight() + "px")  + ";width:") + (((ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.sortDesc()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.sortDesc()).getSafeUri().asString() + "\") -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.sortDesc()).getLeft() + "px -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.sortDesc()).getTop() + "px  no-repeat")  + ";}.GP34Q33J-C{height:" + ((ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnMoveTop()).getHeight() + "px")  + ";width:" + ((ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnMoveTop()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnMoveTop()).getSafeUri().asString() + "\") -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnMoveTop()).getLeft() + "px -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnMoveTop()).getTop() + "px  no-repeat")  + ";}.GP34Q33I-C{height:" + ((ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnMoveBottom()).getHeight() + "px")  + ";width:" + ((ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnMoveBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnMoveBottom()).getSafeUri().asString() + "\") -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnMoveBottom()).getLeft() + "px -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnMoveBottom()).getTop() + "px  no-repeat") ) + (";}")) : ((".GP34Q33A0C{background:" + ("repeat-x"+ " " +"0"+ " " +"bottom")  + ";cursor:" + ("default")  + ";zoom:" + ("1")  + ";padding:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";background-color:" + ("#f9f9f9")  + ";height:" + ((ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnHeader()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnHeader()).getSafeUri().asString() + "\") -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnHeader()).getLeft() + "px -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnHeader()).getTop() + "px  repeat-x")  + ";background-color:" + ("#f9f9f9")  + ";height:" + ("auto")  + ";background-position:") + (("bottom")  + ";}.GP34Q33P-C .GP34Q33K-C{line-height:" + ("15px")  + ";vertical-align:" + ("middle")  + ";border-left:" + ("1px"+ " " +"solid")  + ";border-right:" + ("1px"+ " " +"solid")  + ";-moz-outline:" + ("none")  + ";-moz-user-focus:" + ("normal")  + ";outline:" + ("0"+ " " +"none")  + ";font:" + ("11px"+ " " +"arial"+ ","+ " " +"tahoma"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";border-left-color:" + ("#eee")  + ";border-right-color:" + ("#d0d0d0") ) + (";}.GP34Q33M-C{overflow:" + ("hidden")  + ";zoom:" + ("1")  + ";float:" + ("left")  + ";cursor:" + ("inherit")  + ";position:" + ("relative")  + ";vertical-align:" + ("middle")  + ";overflow:" + ("hidden")  + ";-o-text-overflow:" + ("ellipsis")  + ";text-overflow:" + ("ellipsis")  + ";padding:" + ("4px"+ " " +"3px"+ " " +"4px"+ " " +"5px")  + ";white-space:") + (("nowrap")  + ";}.GP34Q33K-C{-moz-user-select:" + ("none")  + ";-khtml-user-select:" + ("none")  + ";-webkit-user-select:" + ("ignore")  + ";}.GP34Q33L-C{display:" + ("none")  + ";position:" + ("absolute")  + ";width:" + ("14px")  + ";background:" + ("no-repeat"+ " " +"left"+ " " +"center")  + ";right:" + ("0")  + ";top:" + ("0")  + ";z-index:" + ("2") ) + (";cursor:" + ("pointer")  + ";outline:" + ("none")  + ";background-color:" + ("#c3daf9")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/grid3-hd-btn.gif"))  + ";background-color:" + ("#c3daf9")  + ";background-image:" + (com.sencha.gxt.core.client.util.ImageHelper.createModuleBasedUrl("base/images/grid/grid3-hd-btn.gif"))  + ";}.GP34Q33O-C .GP34Q33L-C,.GP34Q33N-C .GP34Q33L-C{display:" + ("block")  + ";}a.GP34Q33L-C:hover{background-position:" + ("-14px"+ " " +"center")  + ";}td.GP34Q33O-C,td.GP34Q33D0C,td.GP34Q33C0C,td.GP34Q33N-C{border-left:" + ("1px"+ " " +"solid")  + ";border-right:" + ("1px"+ " " +"solid")  + ";}td.GP34Q33O-C .GP34Q33M-C,td.GP34Q33D0C .GP34Q33M-C,td.GP34Q33C0C .GP34Q33M-C,td.GP34Q33N-C .GP34Q33M-C{background:") + (("repeat-x"+ " " +"left"+ " " +"bottom")  + ";}td.GP34Q33O-C,td.GP34Q33D0C,td.GP34Q33C0C,td.GP34Q33N-C{border-left-color:" + ("#aaccf6")  + ";border-right-color:" + ("#aaccf6")  + ";}td.GP34Q33O-C .GP34Q33M-C,td.GP34Q33D0C .GP34Q33M-C,td.GP34Q33C0C .GP34Q33M-C,td.GP34Q33N-C .GP34Q33M-C{height:" + ((ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnHeaderOver()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnHeaderOver()).getSafeUri().asString() + "\") -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnHeaderOver()).getLeft() + "px -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnHeaderOver()).getTop() + "px  repeat-x")  + ";background-color:" + ("#ebf3fd")  + ";background-position:" + ("left"+ " " +"bottom")  + ";}.GP34Q33E0C{background-repeat:" + ("no-repeat")  + ";display:" + ("none")  + ";height:" + ("4px") ) + (";width:" + ("13px")  + ";margin-left:" + ("3px")  + ";vertical-align:" + ("middle")  + ";}.GP34Q33C0C .GP34Q33E0C{display:" + ("inline")  + ";height:" + ((ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.sortAsc()).getHeight() + "px")  + ";width:" + ((ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.sortAsc()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.sortAsc()).getSafeUri().asString() + "\") -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.sortAsc()).getLeft() + "px -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.sortAsc()).getTop() + "px  no-repeat")  + ";}.GP34Q33D0C .GP34Q33E0C{display:" + ("inline")  + ";height:" + ((ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.sortDesc()).getHeight() + "px")  + ";width:") + (((ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.sortDesc()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.sortDesc()).getSafeUri().asString() + "\") -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.sortDesc()).getLeft() + "px -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.sortDesc()).getTop() + "px  no-repeat")  + ";}.GP34Q33J-C{height:" + ((ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnMoveTop()).getHeight() + "px")  + ";width:" + ((ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnMoveTop()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnMoveTop()).getSafeUri().asString() + "\") -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnMoveTop()).getLeft() + "px -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnMoveTop()).getTop() + "px  no-repeat")  + ";}.GP34Q33I-C{height:" + ((ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnMoveBottom()).getHeight() + "px")  + ";width:" + ((ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnMoveBottom()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnMoveBottom()).getSafeUri().asString() + "\") -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnMoveBottom()).getLeft() + "px -" + (ColumnHeaderDefaultAppearance_ColumnHeaderResources_safari_default_InlineClientBundleGenerator.this.columnMoveBottom()).getTop() + "px  no-repeat") ) + (";}"));
      }
      public java.lang.String columnMoveBottom(){
        return "GP34Q33I-C";
      }
      public java.lang.String columnMoveTop(){
        return "GP34Q33J-C";
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
      public java.lang.String headerInner(){
        return "GP34Q33B0C";
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
    static com.sencha.gxt.theme.base.client.grid.ColumnHeaderDefaultAppearance.ColumnHeaderStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.base.client.grid.ColumnHeaderDefaultAppearance.ColumnHeaderStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = GWT.getModuleBaseURL() + "60053A3C374CD33DFA7FC43DED4B5AED.cache.png";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAIAAAAWCAYAAADq8U2pAAAAIElEQVR42mN4/fnvfxBmoJBx88Xv/yBMV8aqM9/+gzAAq2ildV6GS2YAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAkAAAAJCAYAAADgkQYQAAAAhklEQVR42mNgQAMFMx78Z8AHChZ8+L/gwP//BhEL/uNVMGHD//8JHQ/+GwSgKQRZAVNQsACoaMKH/w4VFxAKQQocCoACGRcgpsz4AMYGERv+KwAVKXhMQJgY0AAxDawIaJ1CABZ3gRQ1rIAoCABapeCBQxFYQcMFoPUHUK1BVmQAdQMMw+QAwOt3PF1I3lYAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage2 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAkAAAAJCAYAAADgkQYQAAAAiUlEQVR42nXOrRHEIBCGYUpKCVfCykjkSSQSGYmMRJ5ERlJCStgS0sGXZZPckL+dWQPPvGDMPi4tcCPDRYYdZl1znQpSAeIkmwFy5QHFDYUfYOOCzzffUc2HXIFUBkG2Qe1fjgoFRkdJ4b9IvggUnGqFQX6Wy6Lw9FzXZy2Q52fQQgX9C2jh9WwF4eN5q9tihBEAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage3 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAABUUlEQVR42sVTW0sCQRj9flp/QQqTiC4U0YOkKQpqRBFaUAQrblHU0kUKK2MLK9xo2RS2bVuKosCy7aEI+gW9nnYGVrqA0PbQgfMwM5zzHc7MEP07Dqt1ZEtPSG0+IrnhMP+AxFoN8ZU7xKRbRJdvEFm8QnjhEqG5CwRz55xj0hmYljJFG9nymyeGhVMQm+yVA9MaKJmv4zMS6/eoPb//INv/jr7JE5B7YFkWTNNsGPgzrw26BrIsw7ZttMRfuKYnrTgGTmG/ScDErkHX+BGItc1gGAZ0XW+awBW7Bp2jByB2VV4TdIzsg6JL13xRqVSgaVrTBJIkfekgkJRBoXnL8y20xXZAQzmTL1RVhaIoTROIoghBEDgZWqNboGDW8JzAFymAZlZ1DM5W+avqn1LRmz5G90TZabjESwqk9tCe2IU/XnQibztTC5y+4QKY9s+f8QPz2J2WDMzEcwAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage4 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA0AAAAFCAYAAACeuGYRAAAAKElEQVR42mNgQAOJE87+ZyAFgDTAMMkaiNKITQNejY/f/f5PCKPrAQBzT030Gx+XsAAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage5 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAA6ElEQVR42qVTIRLDIBDMVyojkVhkJDIWiUSeRUaexCKRyNg8od/ZQtpmmjSdNO3OMDDcsbt3QNO8QLsJzTH2c4ivUDaD4yHJflzTBO1GyJ5/I+iKep2F/oGgp3FWd3x3oCnhFMFT/YkDF+uY8RNEUeV0b151UAk6+5Hkm5s62YPoAwIx0hDnORiLHNL3DiL5ZZN1j0FJnL7GilyceHFBTvktqbcEKg4rAXGG0uadiDtd7JtdhccLXYYbNiLB+iPrjZDdfLgVm7zMCazUqnHRET65qCWsA1LCyRbBubkE/1jv/hlDf7+DFW76rKAkoIIsyAAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage6 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA0AAAAFCAYAAACeuGYRAAAAKUlEQVR42mN4/O73/8QJZ3FikDwDNoBLI04NuDQS1ICukWgNyBoJqQEAgARN9JU/oo0AAAAASUVORK5CYII=";
  private static final java.lang.String externalImage7 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAA4klEQVR42qWSLQ/DIBiE+1cmK5FYJBKJRSKRWCQSiUUikbP9W7dCuib97rpLCAR4j4eDrhuVXES0Admn1kelUWJGt6/tfLJungxCwjN6VLxv8FUZSRx5oeTyzCBwMeKrs+Jjg6jdFfqxQQkZgbFFcMnY+yEGSmFoj2hMu4Kbxj9ncFPnBlwlPDbQ/g0mE3wcnj2jMBlCR1C+DVBqC+sbHWwoYGLnub/4hG0DDLlRzc341WeTprTT60IlqOO1CaG8FfeE4jK8XYo0zFdYLChbQLjDtKGrBNWAS78xEcr+/Q8W+gCByZ1DgoJnrwAAAABJRU5ErkJggg==";
  private static com.google.gwt.resources.client.ImageResource columnHeader;
  private static com.google.gwt.resources.client.ImageResource columnHeaderOver;
  private static com.google.gwt.resources.client.ImageResource columnMoveBottom;
  private static com.google.gwt.resources.client.ImageResource columnMoveTop;
  private static com.google.gwt.resources.client.ImageResource columnsIcon;
  private static com.google.gwt.resources.client.ImageResource sortAsc;
  private static com.google.gwt.resources.client.ImageResource sortAscendingIcon;
  private static com.google.gwt.resources.client.ImageResource sortDesc;
  private static com.google.gwt.resources.client.ImageResource sortDescendingIcon;
  private static com.sencha.gxt.theme.base.client.grid.ColumnHeaderDefaultAppearance.ColumnHeaderStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      columnHeader(), 
      columnHeaderOver(), 
      columnMoveBottom(), 
      columnMoveTop(), 
      columnsIcon(), 
      sortAsc(), 
      sortAscendingIcon(), 
      sortDesc(), 
      sortDescendingIcon(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("columnHeader", columnHeader());
        resourceMap.put("columnHeaderOver", columnHeaderOver());
        resourceMap.put("columnMoveBottom", columnMoveBottom());
        resourceMap.put("columnMoveTop", columnMoveTop());
        resourceMap.put("columnsIcon", columnsIcon());
        resourceMap.put("sortAsc", sortAsc());
        resourceMap.put("sortAscendingIcon", sortAscendingIcon());
        resourceMap.put("sortDesc", sortDesc());
        resourceMap.put("sortDescendingIcon", sortDescendingIcon());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'columnHeader': return this.@com.sencha.gxt.theme.base.client.grid.ColumnHeaderDefaultAppearance.ColumnHeaderResources::columnHeader()();
      case 'columnHeaderOver': return this.@com.sencha.gxt.theme.base.client.grid.ColumnHeaderDefaultAppearance.ColumnHeaderResources::columnHeaderOver()();
      case 'columnMoveBottom': return this.@com.sencha.gxt.theme.base.client.grid.ColumnHeaderDefaultAppearance.ColumnHeaderResources::columnMoveBottom()();
      case 'columnMoveTop': return this.@com.sencha.gxt.theme.base.client.grid.ColumnHeaderDefaultAppearance.ColumnHeaderResources::columnMoveTop()();
      case 'columnsIcon': return this.@com.sencha.gxt.theme.base.client.grid.ColumnHeaderDefaultAppearance.ColumnHeaderResources::columnsIcon()();
      case 'sortAsc': return this.@com.sencha.gxt.theme.base.client.grid.ColumnHeaderDefaultAppearance.ColumnHeaderResources::sortAsc()();
      case 'sortAscendingIcon': return this.@com.sencha.gxt.theme.base.client.grid.ColumnHeaderDefaultAppearance.ColumnHeaderResources::sortAscendingIcon()();
      case 'sortDesc': return this.@com.sencha.gxt.theme.base.client.grid.ColumnHeaderDefaultAppearance.ColumnHeaderResources::sortDesc()();
      case 'sortDescendingIcon': return this.@com.sencha.gxt.theme.base.client.grid.ColumnHeaderDefaultAppearance.ColumnHeaderResources::sortDescendingIcon()();
      case 'style': return this.@com.sencha.gxt.theme.base.client.grid.ColumnHeaderDefaultAppearance.ColumnHeaderResources::style()();
    }
    return null;
  }-*/;
}
