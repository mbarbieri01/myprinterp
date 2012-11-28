package com.sencha.gxt.widget.core.client.form;

public class TextField_SimpleBeanEditorDelegate extends com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate {
  private com.sencha.gxt.widget.core.client.form.TextField editor;
  @Override protected com.sencha.gxt.widget.core.client.form.TextField getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(com.sencha.gxt.widget.core.client.form.TextField)editor;}
  private java.lang.String object;
  @Override public java.lang.String getObject() {return object;}
  @Override protected void setObject(Object object) {this.object=(java.lang.String)object;}
  @Override protected void initializeSubDelegates() {
  }
  @Override public void accept(com.google.gwt.editor.client.EditorVisitor visitor) {
  }
}
