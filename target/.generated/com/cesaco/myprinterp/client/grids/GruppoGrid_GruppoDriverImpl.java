package com.cesaco.myprinterp.client.grids;

public class GruppoGrid_GruppoDriverImpl extends com.google.gwt.editor.client.impl.AbstractSimpleBeanEditorDriver<com.cesaco.myprinterp.client.shared.Gruppo, com.cesaco.myprinterp.client.forms.GruppoFormClient> implements com.cesaco.myprinterp.client.grids.GruppoGrid.GruppoDriver {
  @Override public void accept(com.google.gwt.editor.client.EditorVisitor visitor) {
    com.google.gwt.editor.client.impl.RootEditorContext ctx = new com.google.gwt.editor.client.impl.RootEditorContext(getDelegate(), com.cesaco.myprinterp.client.shared.Gruppo.class, getObject());
    ctx.traverse(visitor, getDelegate());
  }
  @Override protected com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate createDelegate() {
    return new com.cesaco.myprinterp.client.forms.GruppoFormClient_SimpleBeanEditorDelegate();
  }
}
