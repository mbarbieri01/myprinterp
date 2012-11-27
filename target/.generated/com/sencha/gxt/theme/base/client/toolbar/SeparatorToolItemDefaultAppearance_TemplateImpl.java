package com.sencha.gxt.theme.base.client.toolbar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class SeparatorToolItemDefaultAppearance_TemplateImpl implements com.sencha.gxt.theme.base.client.toolbar.SeparatorToolItemDefaultAppearance.Template {
  public com.google.gwt.safehtml.shared.SafeHtml render(com.sencha.gxt.theme.base.client.toolbar.SeparatorToolItemDefaultAppearance.SeparatorToolItemStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0}"></div>
     * params:
       * com.sencha.gxt.theme.base.client.toolbar.SeparatorToolItemDefaultAppearance_SeparatorToolItemStyle_separator_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.toolbar.SeparatorToolItemDefaultAppearance_Template_render_SafeHtml__SeparatorToolItemStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.toolbar.SeparatorToolItemDefaultAppearance_Template_render_SafeHtml__SeparatorToolItemStyle_style___SafeHtmlTemplates.class).render0(com.sencha.gxt.theme.base.client.toolbar.SeparatorToolItemDefaultAppearance_SeparatorToolItemStyle_separator_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}
