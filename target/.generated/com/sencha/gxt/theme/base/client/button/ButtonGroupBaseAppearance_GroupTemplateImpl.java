package com.sencha.gxt.theme.base.client.button;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class ButtonGroupBaseAppearance_GroupTemplateImpl implements com.sencha.gxt.theme.base.client.button.ButtonGroupBaseAppearance.GroupTemplate {
  public com.google.gwt.safehtml.shared.SafeHtml render(com.sencha.gxt.theme.base.client.button.ButtonGroupBaseAppearance.ButtonGroupStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class='{0}'><div class='{1}'></div></div>
     * params:
       * com.sencha.gxt.theme.base.client.button.ButtonGroupBaseAppearance_ButtonGroupStyle_group_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.button.ButtonGroupBaseAppearance_ButtonGroupStyle_body_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.button.ButtonGroupBaseAppearance_GroupTemplate_render_SafeHtml__ButtonGroupStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.button.ButtonGroupBaseAppearance_GroupTemplate_render_SafeHtml__ButtonGroupStyle_style___SafeHtmlTemplates.class).render0(com.sencha.gxt.theme.base.client.button.ButtonGroupBaseAppearance_ButtonGroupStyle_group_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.button.ButtonGroupBaseAppearance_ButtonGroupStyle_body_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}
