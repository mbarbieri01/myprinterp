package com.sencha.gxt.state.client;

public class TreeStateHandler_TreeStateAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.sencha.gxt.state.client.TreeStateHandler.TreeState> {
  private final com.sencha.gxt.state.client.TreeStateHandler.TreeState shim = new com.sencha.gxt.state.client.TreeStateHandler.TreeState() {
    public java.util.Set getExpandedKeys()  {
      java.util.Set toReturn = TreeStateHandler_TreeStateAutoBean.this.getWrapped().getExpandedKeys();
      if (toReturn != null) {
        if (TreeStateHandler_TreeStateAutoBean.this.isWrapped(toReturn)) {
          toReturn = TreeStateHandler_TreeStateAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.SetAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public void setExpandedKeys(java.util.Set keys)  {
      TreeStateHandler_TreeStateAutoBean.this.getWrapped().setExpandedKeys(keys);
      TreeStateHandler_TreeStateAutoBean.this.set("setExpandedKeys", keys);
    }
    @Override public boolean equals(Object o) {
      return this == o || getWrapped().equals(o);
    }
    @Override public int hashCode() {
      return getWrapped().hashCode();
    }
    @Override public String toString() {
      return getWrapped().toString();
    }
  };
  { com.google.gwt.core.client.impl.WeakMapping.set(shim, com.google.web.bindery.autobean.shared.AutoBean.class.getName(), this); }
  public TreeStateHandler_TreeStateAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public TreeStateHandler_TreeStateAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.sencha.gxt.state.client.TreeStateHandler.TreeState wrapped) {
    super(wrapped, factory);
  }
  public com.sencha.gxt.state.client.TreeStateHandler.TreeState as() {return shim;}
  public Class<com.sencha.gxt.state.client.TreeStateHandler.TreeState> getType() {return com.sencha.gxt.state.client.TreeStateHandler.TreeState.class;}
  @Override protected com.sencha.gxt.state.client.TreeStateHandler.TreeState createSimplePeer() {
    return new com.sencha.gxt.state.client.TreeStateHandler.TreeState() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.sencha.gxt.state.client.TreeStateHandler_TreeStateAutoBean.this.data;
      public java.util.Set getExpandedKeys()  {
        return (java.util.Set) getOrReify("expandedKeys");
      }
      public void setExpandedKeys(java.util.Set keys)  {
        setProperty("expandedKeys", keys);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.sencha.gxt.state.client.TreeStateHandler.TreeState as = as();
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getExpandedKeys());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(TreeStateHandler_TreeStateAutoBean.this, "expandedKeys"),
      new Class<?>[] {java.util.Set.class, java.lang.String.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("expandedKeys", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("expandedKeys", bean, propertyContext);
  }
}
