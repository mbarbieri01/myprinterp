package com.sencha.gxt.state.client;

public class DefaultStateAutoBeanFactoryImpl extends com.google.web.bindery.autobean.gwt.client.impl.AbstractAutoBeanFactory implements com.sencha.gxt.state.client.DefaultStateAutoBeanFactory {
  @Override protected void initializeCreatorMap(com.google.web.bindery.autobean.gwt.client.impl.JsniCreatorMap map) {
    map.add(com.sencha.gxt.state.client.BorderLayoutStateHandler.BorderLayoutState.class, getConstructors_com_sencha_gxt_state_client_BorderLayoutStateHandler_BorderLayoutState());
    map.add(com.sencha.gxt.state.client.GridStateHandler.GridState.class, getConstructors_com_sencha_gxt_state_client_GridStateHandler_GridState());
    map.add(com.sencha.gxt.state.client.TreeStateHandler.TreeState.class, getConstructors_com_sencha_gxt_state_client_TreeStateHandler_TreeState());
    map.add(java.util.Set.class, getConstructors_java_util_Set());
    map.add(java.util.Map.class, getConstructors_java_util_Map());
    map.add(java.util.Iterator.class, getConstructors_java_util_Iterator());
    map.add(java.util.Map.Entry.class, getConstructors_java_util_Map_Entry());
    map.add(java.util.Collection.class, getConstructors_java_util_Collection());
  }
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_com_sencha_gxt_state_client_BorderLayoutStateHandler_BorderLayoutState() /*-{
    return [
      @com.sencha.gxt.state.client.BorderLayoutStateHandler_BorderLayoutStateAutoBean::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;),
      @com.sencha.gxt.state.client.BorderLayoutStateHandler_BorderLayoutStateAutoBean::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;Lcom/sencha/gxt/state/client/BorderLayoutStateHandler$BorderLayoutState;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_com_sencha_gxt_state_client_GridStateHandler_GridState() /*-{
    return [
      @com.sencha.gxt.state.client.GridStateHandler_GridStateAutoBean::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;),
      @com.sencha.gxt.state.client.GridStateHandler_GridStateAutoBean::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;Lcom/sencha/gxt/state/client/GridStateHandler$GridState;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_com_sencha_gxt_state_client_TreeStateHandler_TreeState() /*-{
    return [
      @com.sencha.gxt.state.client.TreeStateHandler_TreeStateAutoBean::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;),
      @com.sencha.gxt.state.client.TreeStateHandler_TreeStateAutoBean::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;Lcom/sencha/gxt/state/client/TreeStateHandler$TreeState;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_java_util_Set() /*-{
    return [
      ,
      @emul.java.util.SetAutoBean::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;Ljava/util/Set;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_java_util_Map() /*-{
    return [
      ,
      @emul.java.util.MapAutoBean::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;Ljava/util/Map;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_java_util_Iterator() /*-{
    return [
      ,
      @emul.java.util.IteratorAutoBean::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;Ljava/util/Iterator;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_java_util_Map_Entry() /*-{
    return [
      ,
      @emul.java.util.Map_EntryAutoBean::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;Ljava/util/Map$Entry;)
    ];
  }-*/;
  private native com.google.gwt.core.client.JsArray<com.google.gwt.core.client.JavaScriptObject> getConstructors_java_util_Collection() /*-{
    return [
      ,
      @emul.java.util.CollectionAutoBean::new(Lcom/google/web/bindery/autobean/shared/AutoBeanFactory;Ljava/util/Collection;)
    ];
  }-*/;
  @Override protected void initializeEnumMap() {
    enumToStringMap.put(com.sencha.gxt.data.shared.SortDir.ASC, "ASC");
    enumToStringMap.put(com.sencha.gxt.data.shared.SortDir.DESC, "DESC");
    stringsToEnumsMap.put("DESC", java.util.Collections.<java.lang.Enum<?>> singletonList(com.sencha.gxt.data.shared.SortDir.DESC));
    stringsToEnumsMap.put("ASC", java.util.Collections.<java.lang.Enum<?>> singletonList(com.sencha.gxt.data.shared.SortDir.ASC));
  }
  public com.google.web.bindery.autobean.shared.AutoBean borderLayout() {
    return new com.sencha.gxt.state.client.BorderLayoutStateHandler_BorderLayoutStateAutoBean(DefaultStateAutoBeanFactoryImpl.this);
  }
  public com.google.web.bindery.autobean.shared.AutoBean grid() {
    return new com.sencha.gxt.state.client.GridStateHandler_GridStateAutoBean(DefaultStateAutoBeanFactoryImpl.this);
  }
  public com.google.web.bindery.autobean.shared.AutoBean tree() {
    return new com.sencha.gxt.state.client.TreeStateHandler_TreeStateAutoBean(DefaultStateAutoBeanFactoryImpl.this);
  }
}
