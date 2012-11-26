package com.sencha.gxt.theme.base.client.toolbar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class LabelToolItemDefaultAppearance_TemplateImpl implements com.sencha.gxt.theme.base.client.toolbar.LabelToolItemDefaultAppearance.Template {
  public com.google.gwt.safehtml.shared.SafeHtml render(com.sencha.gxt.theme.base.client.toolbar.LabelToolItemDefaultAppearance.LabelToolItemStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0}"></div>
     * params:
       * com.sencha.gxt.theme.base.client.toolbar.LabelToolItemDefaultAppearance_LabelToolItemStyle_item_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.toolbar.LabelToolItemDefaultAppearance_Template_render_SafeHtml__LabelToolItemStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.toolbar.LabelToolItemDefaultAppearance_Template_render_SafeHtml__LabelToolItemStyle_style___SafeHtmlTemplates.class).render0(com.sencha.gxt.theme.base.client.toolbar.LabelToolItemDefaultAppearance_LabelToolItemStyle_item_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}
