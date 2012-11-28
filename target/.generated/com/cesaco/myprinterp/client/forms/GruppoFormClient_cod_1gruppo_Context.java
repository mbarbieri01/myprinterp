package com.cesaco.myprinterp.client.forms;

public class GruppoFormClient_cod_1gruppo_Context extends com.google.gwt.editor.client.impl.AbstractEditorContext<java.lang.String> {
  private final com.cesaco.myprinterp.client.shared.Gruppo parent;
  public GruppoFormClient_cod_1gruppo_Context(com.cesaco.myprinterp.client.shared.Gruppo parent, com.google.gwt.editor.client.Editor<java.lang.String> editor, String path) {
    super(editor,path);
    this.parent = parent;
  }
  @Override public boolean canSetInModel() {
    return parent != null && true && true;
  }
  @Override public java.lang.String checkAssignment(Object value) {
    return (java.lang.String) value;
  }
  @Override public Class getEditedType() { return java.lang.String.class; }
  @Override public java.lang.String getFromModel() {
    return (parent != null && true) ? parent.getCod_gruppo() : null;
  }
  @Override public void setInModel(java.lang.String data) {
    parent.setCod_gruppo(data);
  }
}
