package com.cesaco.myprinterp.client.local;

public class KitchenSinkClient_KitchenSinkTemplatesImpl implements com.cesaco.myprinterp.client.local.KitchenSinkClient.KitchenSinkTemplates {
  
  public com.google.gwt.safehtml.shared.SafeHtml link(com.google.gwt.safehtml.shared.SafeUri arg0,java.lang.String arg1) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<a target=\"_blank\" href=\"");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0.asString()));
    sb.append("\">");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
    sb.append("</a>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
