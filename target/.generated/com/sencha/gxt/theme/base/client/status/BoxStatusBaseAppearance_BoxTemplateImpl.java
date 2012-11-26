package com.sencha.gxt.theme.base.client.status;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class BoxStatusBaseAppearance_BoxTemplateImpl implements com.sencha.gxt.theme.base.client.status.BoxStatusBaseAppearance.BoxTemplate {
  public com.google.gwt.safehtml.shared.SafeHtml render(com.sencha.gxt.theme.base.client.status.BoxStatusBaseAppearance.BoxStatusStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0} {1}"><span class="{2}"></span><span class="{3}"></span></div>
     * params:
       * com.sencha.gxt.theme.base.client.status.BoxStatusBaseAppearance_BoxStatusStyle_status_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.status.BoxStatusBaseAppearance_BoxStatusStyle_statusBox_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.status.BoxStatusBaseAppearance_BoxStatusStyle_statusIcon_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.status.BoxStatusBaseAppearance_BoxStatusStyle_statusText_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.status.BoxStatusBaseAppearance_BoxTemplate_render_SafeHtml__BoxStatusStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.status.BoxStatusBaseAppearance_BoxTemplate_render_SafeHtml__BoxStatusStyle_style___SafeHtmlTemplates.class).render0(com.sencha.gxt.theme.base.client.status.BoxStatusBaseAppearance_BoxStatusStyle_status_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.status.BoxStatusBaseAppearance_BoxStatusStyle_statusBox_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.status.BoxStatusBaseAppearance_BoxStatusStyle_statusIcon_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.status.BoxStatusBaseAppearance_BoxStatusStyle_statusText_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}
