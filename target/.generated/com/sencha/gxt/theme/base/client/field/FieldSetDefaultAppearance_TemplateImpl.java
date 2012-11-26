package com.sencha.gxt.theme.base.client.field;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class FieldSetDefaultAppearance_TemplateImpl implements com.sencha.gxt.theme.base.client.field.FieldSetDefaultAppearance.Template {
  public com.google.gwt.safehtml.shared.SafeHtml render(com.sencha.gxt.theme.base.client.field.FieldSetDefaultAppearance.FieldSetStyle style){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <fieldset class="{0}"><legend class="{1}"><div class="{2}"></div><span class="{3}"></span></legend><div class="{4}"></div></fieldset>
     * params:
       * com.sencha.gxt.theme.base.client.field.FieldSetDefaultAppearance_FieldSetStyle_fieldSet_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.field.FieldSetDefaultAppearance_FieldSetStyle_legend_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.field.FieldSetDefaultAppearance_FieldSetStyle_toolWrap_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.field.FieldSetDefaultAppearance_FieldSetStyle_header_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.field.FieldSetDefaultAppearance_FieldSetStyle_body_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.field.FieldSetDefaultAppearance_Template_render_SafeHtml__FieldSetStyle_style___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.field.FieldSetDefaultAppearance_Template_render_SafeHtml__FieldSetStyle_style___SafeHtmlTemplates.class).render0(com.sencha.gxt.theme.base.client.field.FieldSetDefaultAppearance_FieldSetStyle_fieldSet_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.field.FieldSetDefaultAppearance_FieldSetStyle_legend_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.field.FieldSetDefaultAppearance_FieldSetStyle_toolWrap_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.field.FieldSetDefaultAppearance_FieldSetStyle_header_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.field.FieldSetDefaultAppearance_FieldSetStyle_body_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}
