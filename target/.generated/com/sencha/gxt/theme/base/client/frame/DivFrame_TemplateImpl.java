package com.sencha.gxt.theme.base.client.frame;

import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class DivFrame_TemplateImpl implements com.sencha.gxt.theme.base.client.frame.DivFrame.Template {
  public com.google.gwt.safehtml.shared.SafeHtml render(com.sencha.gxt.theme.base.client.frame.DivFrame.DivFrameStyle style, com.google.gwt.safehtml.shared.SafeHtml content){
    SafeHtml outer;
    
    /**
     * Root of template
     */
    
    /**
     * safehtml content:
       * <div class="{0}"><div class="{1}">{2}</div><div class="{3}"></div><div class="{4}"></div><div class="{5}"></div><div class="{6}"></div><div class="{7}"></div><div class="{8}"></div><div class="{9}"></div><div class="{10}"></div></div>
       * 
     * params:
       * com.sencha.gxt.theme.base.client.frame.DivFrame_DivFrameStyle_contentArea_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.frame.DivFrame_DivFrameStyle_content_ValueProviderImpl.INSTANCE.getValue(style), content, com.sencha.gxt.theme.base.client.frame.DivFrame_DivFrameStyle_topLeft_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.frame.DivFrame_DivFrameStyle_top_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.frame.DivFrame_DivFrameStyle_topRight_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.frame.DivFrame_DivFrameStyle_bottomLeft_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.frame.DivFrame_DivFrameStyle_bottom_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.frame.DivFrame_DivFrameStyle_bottomRight_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.frame.DivFrame_DivFrameStyle_left_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.frame.DivFrame_DivFrameStyle_right_ValueProviderImpl.INSTANCE.getValue(style)
     */
    outer = GWT.<com.sencha.gxt.theme.base.client.frame.DivFrame_Template_render_SafeHtml__DivFrameStyle_style__SafeHtml_content___SafeHtmlTemplates>create(com.sencha.gxt.theme.base.client.frame.DivFrame_Template_render_SafeHtml__DivFrameStyle_style__SafeHtml_content___SafeHtmlTemplates.class).render0(com.sencha.gxt.theme.base.client.frame.DivFrame_DivFrameStyle_contentArea_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.frame.DivFrame_DivFrameStyle_content_ValueProviderImpl.INSTANCE.getValue(style), content, com.sencha.gxt.theme.base.client.frame.DivFrame_DivFrameStyle_topLeft_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.frame.DivFrame_DivFrameStyle_top_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.frame.DivFrame_DivFrameStyle_topRight_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.frame.DivFrame_DivFrameStyle_bottomLeft_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.frame.DivFrame_DivFrameStyle_bottom_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.frame.DivFrame_DivFrameStyle_bottomRight_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.frame.DivFrame_DivFrameStyle_left_ValueProviderImpl.INSTANCE.getValue(style), com.sencha.gxt.theme.base.client.frame.DivFrame_DivFrameStyle_right_ValueProviderImpl.INSTANCE.getValue(style));
    return outer;
  }
}
