package com.sencha.gxt.theme.base.client.statusproxy;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class StatusProxyBaseAppearance_StatusProxyTemplatesImpl implements com.sencha.gxt.theme.base.client.statusproxy.StatusProxyBaseAppearance.StatusProxyTemplates {
  public com.google.gwt.safehtml.shared.SafeHtml template(com.sencha.gxt.theme.base.client.statusproxy.StatusProxyBaseAppearance.StatusProxyStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0}"><div class="{1}"></div><div class="{2}"></div></div>
     * params:
       * com.sencha.gxt.theme.base.client.statusproxy.StatusProxyBaseAppearance_StatusProxyStyle_proxy_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.statusproxy.StatusProxyBaseAppearance_StatusProxyStyle_dropIcon_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.statusproxy.StatusProxyBaseAppearance_StatusProxyStyle_dragGhost_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.statusproxy.StatusProxyBaseAppearance_StatusProxyTemplates_template_SafeHtml__StatusProxyStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.statusproxy.StatusProxyBaseAppearance_StatusProxyTemplates_template_SafeHtml__StatusProxyStyle_style___SafeHtmlTemplates.class).template0(com.sencha.gxt.theme.base.client.statusproxy.StatusProxyBaseAppearance_StatusProxyStyle_proxy_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.statusproxy.StatusProxyBaseAppearance_StatusProxyStyle_dropIcon_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.statusproxy.StatusProxyBaseAppearance_StatusProxyStyle_dragGhost_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}
