package com.sencha.gxt.theme.base.client.status;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class StatusBaseAppearance_TemplateImpl implements com.sencha.gxt.theme.base.client.status.StatusBaseAppearance.Template {
  public com.google.gwt.safehtml.shared.SafeHtml template(com.sencha.gxt.theme.base.client.status.StatusBaseAppearance.StatusStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0}"><span class="{1}"></span><span class="{2}"></span></div>
       * 
     * params:
       * com.sencha.gxt.theme.base.client.status.StatusBaseAppearance_StatusStyle_status_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.status.StatusBaseAppearance_StatusStyle_statusIcon_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.status.StatusBaseAppearance_StatusStyle_statusText_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.status.StatusBaseAppearance_Template_template_SafeHtml__StatusStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.status.StatusBaseAppearance_Template_template_SafeHtml__StatusStyle_style___SafeHtmlTemplates.class).template0(com.sencha.gxt.theme.base.client.status.StatusBaseAppearance_StatusStyle_status_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.status.StatusBaseAppearance_StatusStyle_statusIcon_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.status.StatusBaseAppearance_StatusStyle_statusText_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}
