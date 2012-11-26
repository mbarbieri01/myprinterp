package com.sencha.gxt.theme.gray.client.status;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class GrayStatusAppearance_GrayStatusResources_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.gray.client.status.GrayStatusAppearance.GrayStatusResources {
  private static GrayStatusAppearance_GrayStatusResources_default_InlineClientBundleGenerator _instance0 = new GrayStatusAppearance_GrayStatusResources_default_InlineClientBundleGenerator();
  private void loadingInitializer() {
    loading = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "loading",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 16, 16, true, false
    );
  }
  private static class loadingInitializer {
    static {
      _instance0.loadingInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return loading;
    }
  }
  public com.google.gwt.resources.client.ImageResource loading() {
    return loadingInitializer.get();
  }
  private void styleInitializer() {
    style = new com.sencha.gxt.theme.base.client.status.StatusBaseAppearance.StatusStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GP34Q33FJB{height:" + ("21px")  + ";line-height:" + ("21px")  + " !important;cursor:" + ("default")  + ";}.GP34Q33FJB .GP34Q33HJB{padding:" + ("0"+ " " +"2px")  + ";line-height:" + ("21px")  + " !important;font:" + ("11px"+ " " +"arial"+ ","+ " " +"tahoma"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.GP34Q33FJB .GP34Q33GJB{display:" + ("none")  + ";width:" + ("18px")  + ";float:" + ("right")  + ";padding-top:" + ("2px")  + ";}")) : ((".GP34Q33FJB{height:" + ("21px")  + ";line-height:" + ("21px")  + " !important;cursor:" + ("default")  + ";}.GP34Q33FJB .GP34Q33HJB{padding:" + ("0"+ " " +"2px")  + ";line-height:" + ("21px")  + " !important;font:" + ("11px"+ " " +"arial"+ ","+ " " +"tahoma"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.GP34Q33FJB .GP34Q33GJB{display:" + ("none")  + ";width:" + ("18px")  + ";float:" + ("left")  + ";padding-top:" + ("2px")  + ";}"));
      }
      public java.lang.String status(){
        return "GP34Q33FJB";
      }
      public java.lang.String statusIcon(){
        return "GP34Q33GJB";
      }
      public java.lang.String statusText(){
        return "GP34Q33HJB";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.sencha.gxt.theme.base.client.status.StatusBaseAppearance.StatusStyle get() {
      return style;
    }
  }
  public com.sencha.gxt.theme.base.client.status.StatusBaseAppearance.StatusStyle style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/gif;base64,R0lGODlhEAAQALMMAKqooJGOhp2bk7e1rZ2bkre1rJCPhqqon8PBudDOxXd1bISCef///wAAAAAAAAAAACH/C05FVFNDQVBFMi4wAwEAAAAh+QQFAAAMACwAAAAAEAAQAAAET5DJyYyhmAZ7sxQEs1nMsmACGJKmSaVEOLXnK1PuBADepCiMg/DQ+/2GRI8RKOxJfpTCIJNIYArS6aRajWYZCASDa41Ow+Fx2YMWOyfpTAQAIfkEBQAADAAsAAAAABAAEAAABE6QyckEoZgKe7MEQMUxhoEd6FFdQWlOqTq15SlT9VQM3rQsjMKO5/n9hANixgjc9SQ/CgKRUSgw0ynFapVmGYkEg3v1gsPibg8tfk7CnggAIfkEBQAADAAsAAAAABAAEAAABE2QycnOoZjaA/IsRWV1goCBoMiUJTW8A0XMBPZmM4Ug3hQEjN2uZygahDyP0RBMEpmTRCKzWGCkUkq1SsFOFQrG1tr9gsPc3jnco4A9EQAh+QQFAAAMACwAAAAAEAAQAAAETpDJyUqhmFqbJ0LMIA7McWDfF5LmAVApOLUvLFMmlSTdJAiM3a73+wl5HYKSEET2lBSFIhMIYKRSimFriGIZiwWD2/WCw+Jt7xxeU9qZCAAh+QQFAAAMACwAAAAAEAAQAAAETZDJyRCimFqbZ0rVxgwF9n3hSJbeSQ2rCWIkpSjddBzMfee7nQ/XCfJ+OQYAQFksMgQBxumkEKLSCfVpMDCugqyW2w18xZmuwZycdDsRACH5BAUAAAwALAAAAAAQABAAAARNkMnJUqKYWpunUtXGIAj2feFIlt5JrWybkdSydNNQMLaND7pC79YBFnY+HENHMRgyhwPGaQhQotGm00oQMLBSLYPQ9QIASrLAq5x0OxEAIfkEBQAADAAsAAAAABAAEAAABE2QycmUopham+da1cYkCfZ94UiW3kmtbJuRlGF0E4Iwto3rut6tA9wFAjiJjkIgZAYDTLNJgUIpgqyAcTgwCuACJssAdL3gpLmbpLAzEQA7";
  private static com.google.gwt.resources.client.ImageResource loading;
  private static com.sencha.gxt.theme.base.client.status.StatusBaseAppearance.StatusStyle style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      loading(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("loading", loading());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'loading': return this.@com.sencha.gxt.theme.gray.client.status.GrayStatusAppearance.GrayStatusResources::loading()();
      case 'style': return this.@com.sencha.gxt.theme.gray.client.status.GrayStatusAppearance.GrayStatusResources::style()();
    }
    return null;
  }-*/;
}
