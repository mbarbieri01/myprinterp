package com.sencha.gxt.theme.gray.client.field;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class GrayFieldSetAppearance_GrayFieldSetResources_safari_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.gray.client.field.GrayFieldSetAppearance.GrayFieldSetResources {
  private static GrayFieldSetAppearance_GrayFieldSetResources_safari_default_InlineClientBundleGenerator _instance0 = new GrayFieldSetAppearance_GrayFieldSetResources_safari_default_InlineClientBundleGenerator();
  private void cssInitializer() {
    css = new com.sencha.gxt.theme.gray.client.field.GrayFieldSetAppearance.GrayFieldSetStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GP34Q33KEC{border:" + ("1px"+ " " +"solid")  + ";padding:" + ("10px")  + ";margin-bottom:" + ("10px")  + ";display:" + ("block")  + ";overflow:" + ("hidden")  + ";}.GP34Q33KEC legend .GP34Q33OEC{margin-left:" + ("3px")  + ";margin-right:" + ("0")  + ";float:" + ("right")  + " !important;}.GP34Q33KEC legend input{margin-left:" + ("3px")  + ";float:" + ("right")  + " !important;height:") + (("13px")  + ";width:" + ("13px")  + ";}fieldset.GP34Q33JEC{padding-bottom:" + ("0")  + " !important;border-width:" + ("1px"+ " " +"1px"+ " " +"0"+ " " +"1px")  + " !important;border-right-color:" + ("transparent")  + ";border-left-color:" + ("transparent")  + ";}fieldset.GP34Q33JEC .GP34Q33IEC{visibility:" + ("hidden")  + ";position:" + ("absolute")  + ";right:" + ("-1000px")  + ";top:" + ("-1000px")  + ";}.GP34Q33NEC{border:" + ("0"+ " " +"none"+ " " +"transparent") ) + (";}.GP34Q33NEC legend{margin-right:" + ("-3px")  + ";}.GP34Q33LEC,.GP34Q33KEC legend>div{padding-top:" + ("1px")  + ";}.GP34Q33IEC{overflow:" + ("hidden")  + ";height:" + ("100%")  + ";}.GP34Q33KEC{border-color:" + ("#b8b8b8")  + ";}.GP34Q33KEC legend{font:" + ("bold"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";color:" + ("#3c3c3c")  + ";}")) : ((".GP34Q33KEC{border:" + ("1px"+ " " +"solid")  + ";padding:" + ("10px")  + ";margin-bottom:" + ("10px")  + ";display:" + ("block")  + ";overflow:" + ("hidden")  + ";}.GP34Q33KEC legend .GP34Q33OEC{margin-right:" + ("3px")  + ";margin-left:" + ("0")  + ";float:" + ("left")  + " !important;}.GP34Q33KEC legend input{margin-right:" + ("3px")  + ";float:" + ("left")  + " !important;height:") + (("13px")  + ";width:" + ("13px")  + ";}fieldset.GP34Q33JEC{padding-bottom:" + ("0")  + " !important;border-width:" + ("1px"+ " " +"1px"+ " " +"0"+ " " +"1px")  + " !important;border-left-color:" + ("transparent")  + ";border-right-color:" + ("transparent")  + ";}fieldset.GP34Q33JEC .GP34Q33IEC{visibility:" + ("hidden")  + ";position:" + ("absolute")  + ";left:" + ("-1000px")  + ";top:" + ("-1000px")  + ";}.GP34Q33NEC{border:" + ("0"+ " " +"none"+ " " +"transparent") ) + (";}.GP34Q33NEC legend{margin-left:" + ("-3px")  + ";}.GP34Q33LEC,.GP34Q33KEC legend>div{padding-top:" + ("1px")  + ";}.GP34Q33IEC{overflow:" + ("hidden")  + ";height:" + ("100%")  + ";}.GP34Q33KEC{border-color:" + ("#b8b8b8")  + ";}.GP34Q33KEC legend{font:" + ("bold"+ " " +"11px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";color:" + ("#3c3c3c")  + ";}"));
      }
      public java.lang.String body(){
        return "GP34Q33IEC";
      }
      public java.lang.String collapsed(){
        return "GP34Q33JEC";
      }
      public java.lang.String fieldSet(){
        return "GP34Q33KEC";
      }
      public java.lang.String header(){
        return "GP34Q33LEC";
      }
      public java.lang.String legend(){
        return "GP34Q33MEC";
      }
      public java.lang.String noborder(){
        return "GP34Q33NEC";
      }
      public java.lang.String toolWrap(){
        return "GP34Q33OEC";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static com.sencha.gxt.theme.gray.client.field.GrayFieldSetAppearance.GrayFieldSetStyle get() {
      return css;
    }
  }
  public com.sencha.gxt.theme.gray.client.field.GrayFieldSetAppearance.GrayFieldSetStyle css() {
    return cssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.gray.client.field.GrayFieldSetAppearance.GrayFieldSetStyle css;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      css(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("css", css());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'css': return this.@com.sencha.gxt.theme.gray.client.field.GrayFieldSetAppearance.GrayFieldSetResources::css()();
    }
    return null;
  }-*/;
}
