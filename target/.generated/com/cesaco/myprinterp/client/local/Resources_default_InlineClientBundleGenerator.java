package com.cesaco.myprinterp.client.local;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Resources_default_InlineClientBundleGenerator implements com.cesaco.myprinterp.client.local.Resources {
  private static Resources_default_InlineClientBundleGenerator _instance0 = new Resources_default_InlineClientBundleGenerator();
  private void logoInitializer() {
    logo = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "logo",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 249, 97, false, false
    );
  }
  private static class logoInitializer {
    static {
      _instance0.logoInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return logo;
    }
  }
  public com.google.gwt.resources.client.ImageResource logo() {
    return logoInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,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";
  private static com.google.gwt.resources.client.ImageResource logo;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      logo(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("logo", logo());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'logo': return this.@com.cesaco.myprinterp.client.local.Resources::logo()();
    }
    return null;
  }-*/;
}
