package com.sencha.gxt.theme.base.client.info;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class InfoDefaultAppearance_TemplateImpl implements com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.Template {
  public com.google.gwt.safehtml.shared.SafeHtml render(com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance.InfoDefaultStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0}"></div>
     * params:
       * com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance_InfoDefaultStyle_info_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance_Template_render_SafeHtml__InfoDefaultStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance_Template_render_SafeHtml__InfoDefaultStyle_style___SafeHtmlTemplates.class).render0(com.sencha.gxt.theme.base.client.info.InfoDefaultAppearance_InfoDefaultStyle_info_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}
