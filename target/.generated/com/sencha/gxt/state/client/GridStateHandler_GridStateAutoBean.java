package com.sencha.gxt.state.client;

public class GridStateHandler_GridStateAutoBean extends com.google.web.bindery.autobean.shared.impl.AbstractAutoBean<com.sencha.gxt.state.client.GridStateHandler.GridState> {
  private final com.sencha.gxt.state.client.GridStateHandler.GridState shim = new com.sencha.gxt.state.client.GridStateHandler.GridState() {
    public com.sencha.gxt.data.shared.SortDir getSortDir()  {
      com.sencha.gxt.data.shared.SortDir toReturn = GridStateHandler_GridStateAutoBean.this.getWrapped().getSortDir();
      return toReturn;
    }
    public java.lang.String getSortField()  {
      java.lang.String toReturn = GridStateHandler_GridStateAutoBean.this.getWrapped().getSortField();
      return toReturn;
    }
    public java.util.Map getWidths()  {
      java.util.Map toReturn = GridStateHandler_GridStateAutoBean.this.getWrapped().getWidths();
      if (toReturn != null) {
        if (GridStateHandler_GridStateAutoBean.this.isWrapped(toReturn)) {
          toReturn = GridStateHandler_GridStateAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.MapAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public java.util.Set getHidden()  {
      java.util.Set toReturn = GridStateHandler_GridStateAutoBean.this.getWrapped().getHidden();
      if (toReturn != null) {
        if (GridStateHandler_GridStateAutoBean.this.isWrapped(toReturn)) {
          toReturn = GridStateHandler_GridStateAutoBean.this.getFromWrapper(toReturn);
        } else {
          toReturn = new emul.java.util.SetAutoBean(getFactory(), toReturn).as();
        }
      }
      return toReturn;
    }
    public void setHidden(java.util.Set hidden)  {
      GridStateHandler_GridStateAutoBean.this.getWrapped().setHidden(hidden);
      GridStateHandler_GridStateAutoBean.this.set("setHidden", hidden);
    }
    public void setSortDir(com.sencha.gxt.data.shared.SortDir sortDir)  {
      GridStateHandler_GridStateAutoBean.this.getWrapped().setSortDir(sortDir);
      GridStateHandler_GridStateAutoBean.this.set("setSortDir", sortDir);
    }
    public void setSortField(java.lang.String field)  {
      GridStateHandler_GridStateAutoBean.this.getWrapped().setSortField(field);
      GridStateHandler_GridStateAutoBean.this.set("setSortField", field);
    }
    public void setWidths(java.util.Map widths)  {
      GridStateHandler_GridStateAutoBean.this.getWrapped().setWidths(widths);
      GridStateHandler_GridStateAutoBean.this.set("setWidths", widths);
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
  public GridStateHandler_GridStateAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory) {super(factory);}
  public GridStateHandler_GridStateAutoBean(com.google.web.bindery.autobean.shared.AutoBeanFactory factory, com.sencha.gxt.state.client.GridStateHandler.GridState wrapped) {
    super(wrapped, factory);
  }
  public com.sencha.gxt.state.client.GridStateHandler.GridState as() {return shim;}
  public Class<com.sencha.gxt.state.client.GridStateHandler.GridState> getType() {return com.sencha.gxt.state.client.GridStateHandler.GridState.class;}
  @Override protected com.sencha.gxt.state.client.GridStateHandler.GridState createSimplePeer() {
    return new com.sencha.gxt.state.client.GridStateHandler.GridState() {
      private final com.google.web.bindery.autobean.shared.Splittable data = com.sencha.gxt.state.client.GridStateHandler_GridStateAutoBean.this.data;
      public com.sencha.gxt.data.shared.SortDir getSortDir()  {
        return (com.sencha.gxt.data.shared.SortDir) getOrReify("sortDir");
      }
      public java.lang.String getSortField()  {
        return (java.lang.String) getOrReify("sortField");
      }
      public java.util.Map getWidths()  {
        return (java.util.Map) getOrReify("widths");
      }
      public java.util.Set getHidden()  {
        return (java.util.Set) getOrReify("hidden");
      }
      public void setHidden(java.util.Set hidden)  {
        setProperty("hidden", hidden);
      }
      public void setSortDir(com.sencha.gxt.data.shared.SortDir sortDir)  {
        setProperty("sortDir", sortDir);
      }
      public void setSortField(java.lang.String field)  {
        setProperty("sortField", field);
      }
      public void setWidths(java.util.Map widths)  {
        setProperty("widths", widths);
      }
    };
  }
  @Override protected void traverseProperties(com.google.web.bindery.autobean.shared.AutoBeanVisitor visitor, com.google.web.bindery.autobean.shared.impl.AbstractAutoBean.OneShotContext ctx) {
    com.google.web.bindery.autobean.shared.impl.AbstractAutoBean bean;
    Object value;
    com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext propertyContext;
    com.sencha.gxt.state.client.GridStateHandler.GridState as = as();
    value = as.getSortDir();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(GridStateHandler_GridStateAutoBean.this, "sortDir"),
      com.sencha.gxt.data.shared.SortDir.class
    );
    if (visitor.visitValueProperty("sortDir", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("sortDir", value, propertyContext);
    value = as.getSortField();
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(GridStateHandler_GridStateAutoBean.this, "sortField"),
      java.lang.String.class
    );
    if (visitor.visitValueProperty("sortField", value, propertyContext)) {
    }
    visitor.endVisitValueProperty("sortField", value, propertyContext);
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getWidths());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(GridStateHandler_GridStateAutoBean.this, "widths"),
      new Class<?>[] {java.util.Map.class, java.lang.String.class, java.lang.Integer.class},
      new int[] {2, 0, 0}
    );
    if (visitor.visitMapProperty("widths", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitMapProperty("widths", bean, propertyContext);
    bean = (com.google.web.bindery.autobean.shared.impl.AbstractAutoBean) com.google.web.bindery.autobean.shared.AutoBeanUtils.getAutoBean(as.getHidden());
    propertyContext = new com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext(
      as,
      com.google.web.bindery.autobean.gwt.client.impl.ClientPropertyContext.Setter.beanSetter(GridStateHandler_GridStateAutoBean.this, "hidden"),
      new Class<?>[] {java.util.Set.class, java.lang.String.class},
      new int[] {1, 0}
    );
    if (visitor.visitCollectionProperty("hidden", bean, propertyContext)) {
      if (bean != null) { bean.traverse(visitor, ctx); }
    }
    visitor.endVisitCollectionProperty("hidden", bean, propertyContext);
  }
}
