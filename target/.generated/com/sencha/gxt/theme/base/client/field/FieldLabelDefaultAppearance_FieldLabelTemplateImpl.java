package com.sencha.gxt.theme.base.client.field;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class FieldLabelDefaultAppearance_FieldLabelTemplateImpl implements com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance.FieldLabelTemplate {
  public com.google.gwt.safehtml.shared.SafeHtml render(java.lang.String id, com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance.Style style, com.google.gwt.safecss.shared.SafeStyles fieldLabelStyles, com.google.gwt.safecss.shared.SafeStyles fieldElementStyles){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    SafeHtml subTemplate;
    SafeHtmlBuilder subTemplate_builder = new SafeHtmlBuilder();
    if ((id)==null) {
      SafeHtml innerTemplate;
      
      /**
       * <tpl> tag: {if=id==null}
       */
      
      /**
       * safehtml content:
         * <label class="{0}" style="{1}"></label>
       * params:
         * com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance_Style_fieldLabel_ValueProviderImpl.INSTANCE.getValue(style), fieldLabelStyles
       */
      innerTemplate = GWT.<com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance_FieldLabelTemplate_render_SafeHtml__String_id__Style_style__SafeStyles_fieldLabelStyles__SafeStyles_fieldElementStyles___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance_FieldLabelTemplate_render_SafeHtml__String_id__Style_style__SafeStyles_fieldLabelStyles__SafeStyles_fieldElementStyles___SafeHtmlTemplates.class).render0(com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance_Style_fieldLabel_ValueProviderImpl.INSTANCE.getValue(style), fieldLabelStyles);
      subTemplate_builder.append(innerTemplate);
    }
    subTemplate = subTemplate_builder.toSafeHtml();
    SafeHtml subTemplate1;
    SafeHtmlBuilder subTemplate1_builder = new SafeHtmlBuilder();
    if ((id)!=null) {
      SafeHtml innerTemplate1;
      
      /**
       * <tpl> tag: {if=id!=null}
       */
      
      /**
       * safehtml content:
         * <label for="{0}" class="{1}" style="{2}"></label>
       * params:
         * id, com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance_Style_fieldLabel_ValueProviderImpl.INSTANCE.getValue(style), fieldLabelStyles
       */
      innerTemplate1 = GWT.<com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance_FieldLabelTemplate_render_SafeHtml__String_id__Style_style__SafeStyles_fieldLabelStyles__SafeStyles_fieldElementStyles___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance_FieldLabelTemplate_render_SafeHtml__String_id__Style_style__SafeStyles_fieldLabelStyles__SafeStyles_fieldElementStyles___SafeHtmlTemplates.class).render1(id, com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance_Style_fieldLabel_ValueProviderImpl.INSTANCE.getValue(style), fieldLabelStyles);
      subTemplate1_builder.append(innerTemplate1);
    }
    subTemplate1 = subTemplate1_builder.toSafeHtml();
    
    /**
     * safehtml content:
       * <div class="{0}">{1}{2}<div class="{3}" style="{4}"></div><div class="{5}"></div></div>
       * 
     * params:
       * com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance_Style_fieldItem_ValueProviderImpl.INSTANCE.getValue(style), subTemplate, subTemplate1, com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance_Style_fieldElement_ValueProviderImpl.INSTANCE.getValue(style), fieldElementStyles, com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance_Style_clearLeft_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance_FieldLabelTemplate_render_SafeHtml__String_id__Style_style__SafeStyles_fieldLabelStyles__SafeStyles_fieldElementStyles___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance_FieldLabelTemplate_render_SafeHtml__String_id__Style_style__SafeStyles_fieldLabelStyles__SafeStyles_fieldElementStyles___SafeHtmlTemplates.class).render2(com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance_Style_fieldItem_ValueProviderImpl.INSTANCE.getValue(style), subTemplate, subTemplate1, com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance_Style_fieldElement_ValueProviderImpl.INSTANCE.getValue(style), fieldElementStyles, com.sencha.gxt.theme.base.client.field.FieldLabelDefaultAppearance_Style_clearLeft_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}
