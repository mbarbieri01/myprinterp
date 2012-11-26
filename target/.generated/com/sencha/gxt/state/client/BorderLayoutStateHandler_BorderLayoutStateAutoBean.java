package com.sencha.gxt.state.client;

public class BorderLayoutStateHandler_BorderLayoutStateAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.sencha.gxt.state.client.BorderLayoutStateHandler.BorderLayoutState> {
  private final com.sencha.gxt.state.client.BorderLayoutStateHandler.BorderLayoutState shim = new com.sencha.gxt.state.client.BorderLayoutStateHandler.BorderLayoutState() {
    public java.util.Map getSizes()  {
      java.util.Map toReturn = BorderLayoutStateHandler_BorderLayoutStateAutoBean.this.getWrapped().getSizes();
      if (toReturn != null) {
        if (BorderLayoutStateHandler_BorderLayoutStateAutoBean.this.isWrapped(toReturn)) {
          toReturn = BorderLayoutStateHandler_BorderLayoutStateAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.MapAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.Set getCollapsed()  {
      java.util.Set toReturn = BorderLayoutStateHandler_BorderLayoutStateAutoBean.this.getWrapped().getCollapsed();
      if (toReturn != null) {
        if (BorderLayoutStateHandler_BorderLayoutStateAutoBean.this.isWrapped(toReturn)) {
          toReturn = BorderLayoutStateHandler_BorderLayoutStateAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.SetAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public void setCollapsed(java.util.Set collapsed)  {
      BorderLayoutStateHandler_BorderLayoutStateAutoBean.this.getWrapped().setCollapsed(collapsed);
      BorderLayoutStateHandler_BorderLayoutStateAutoBean.this.set("setCollapsed", collapsed);
    }
    public void setSizes(java.util.Map sizes)  {
      BorderLayoutStateHandler_BorderLayoutStateAutoBean.this.getWrapped().setSizes(sizes);
      BorderLayoutStateHandler_BorderLayoutStateAutoBean.this.set("setSizes", sizes);
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
  public BorderLayoutStateHandler_BorderLayoutStateAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public BorderLayoutStateHandler_BorderLayoutStateAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.sencha.gxt.state.client.BorderLayoutStateHandler.BorderLayoutState wrapped) {
    super(wrapped, factory);
  }
  public com.sencha.gxt.state.client.BorderLayoutStateHandler.BorderLayoutState as() {return shim;}
  public Class<com.sencha.gxt.state.client.BorderLayoutStateHandler.BorderLayoutState> getType() {return com.sencha.gxt.state.client.BorderLayoutStateHandler.BorderLayoutState.class;}
  @Override protected com.sencha.gxt.state.client.BorderLayoutStateHandler.BorderLayoutState createSimplePeer() {
    return new com.sencha.gxt.state.client.BorderLayoutStateHandler.BorderLayoutState() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.sencha.gxt.state.client.BorderLayoutStateHandler_BorderLayoutStateAutoBean.this.data;
      public java.util.Map getSizes()  {
        return (java.util.Map) getOrReify("sizes");
      }
      public java.util.Set getCollapsed()  {
        return (java.util.Set) getOrReify("collapsed");
      }
      public void setCollapsed(java.util.Set collapsed)  {
        setProperty("collapsed", collapsed);
      }
      public void setSizes(java.util.Map sizes)  {
        setProperty("sizes", sizes);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.sencha.gxt.state.client.BorderLayoutStateHandler.BorderLayoutState as = as();
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getSizes());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(BorderLayoutStateHandler_BorderLayoutStateAutoBean.this, "sizes"),
      new Class<?>[] {java.util.Map.class, java.lang.String.class, java.lang.Double.class},
      new int[] {2, 0, 0}
    );
    if (visitor.visitMapProperty("sizes", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitMapProperty("sizes", bean, propertyContext);
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getCollapsed());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(BorderLayoutStateHandler_BorderLayoutStateAutoBean.this, "collapsed"),
      new Class<?>[] {java.util.Set.class, java.lang.String.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("collapsed", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("collapsed", bean, propertyContext);
  }
}
