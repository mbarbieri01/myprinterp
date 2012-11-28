package com.cesaco.myprinterp.client.forms;

public class GruppoFormClient_SimpleBeanEditorDelegate extends com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate {
  private com.cesaco.myprinterp.client.forms.GruppoFormClient editor;
  @Override protected com.cesaco.myprinterp.client.forms.GruppoFormClient getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(com.cesaco.myprinterp.client.forms.GruppoFormClient)editor;}
  private com.cesaco.myprinterp.client.shared.Gruppo object;
  @Override public com.cesaco.myprinterp.client.shared.Gruppo getObject() {return object;}
  @Override protected void setObject(Object object) {this.object=(com.cesaco.myprinterp.client.shared.Gruppo)object;}
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate cod_gruppoDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate des_gruppoDelegate;
  @Override protected void initializeSubDelegates() {
    if (editor.cod_gruppo != null) {
      cod_gruppoDelegate = new com.sencha.gxt.widget.core.client.form.TextField_SimpleBeanEditorDelegate();
      addSubDelegate(cod_gruppoDelegate, appendPath("cod_gruppo"), editor.cod_gruppo);
    }
    if (editor.des_gruppo != null) {
      des_gruppoDelegate = new com.sencha.gxt.widget.core.client.form.TextField_SimpleBeanEditorDelegate();
      addSubDelegate(des_gruppoDelegate, appendPath("des_gruppo"), editor.des_gruppo);
    }
  }
  @Override public void accept(com.google.gwt.editor.client.EditorVisitor visitor) {
    if (cod_gruppoDelegate != null) 
    {
      com.cesaco.myprinterp.client.forms.GruppoFormClient_cod_1gruppo_Context ctx = new com.cesaco.myprinterp.client.forms.GruppoFormClient_cod_1gruppo_Context(getObject(), editor.cod_gruppo, appendPath("cod_gruppo"));
      ctx.setEditorDelegate(cod_gruppoDelegate);
      ctx.traverse(visitor, cod_gruppoDelegate);
    }
    if (des_gruppoDelegate != null) 
    {
      com.cesaco.myprinterp.client.forms.GruppoFormClient_des_1gruppo_Context ctx = new com.cesaco.myprinterp.client.forms.GruppoFormClient_des_1gruppo_Context(getObject(), editor.des_gruppo, appendPath("des_gruppo"));
      ctx.setEditorDelegate(des_gruppoDelegate);
      ctx.traverse(visitor, des_gruppoDelegate);
    }
  }
}
