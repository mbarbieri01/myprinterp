package com.cesaco.myprinterp.client.local;


/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */

 
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.TabItemConfig;
import com.sencha.gxt.widget.core.client.TabPanel;
 
public class AdvTabPanel implements IsWidget {
 
  private TabPanel advanced;
  private int index = 0;
 
  public Widget asWidget() {

 
      
 
      advanced = new TabPanel();
      //advanced.setBorders(false);
      
      //advanced.setPixelSize(600, 250);
      
      advanced.setAnimScroll(true);
      advanced.setTabScroll(true);
      advanced.setCloseContextMenu(true);
 
 
      while (index < 27) {
        addTab();
      }
 
      advanced.setActiveWidget(advanced.getWidget(6));

	  
      return advanced;
  }
 
  public void onModuleLoad() {
    RootPanel.get().add(asWidget());
  }
 
  public void addTab() {
    Label item = new Label("Tab Body " + (index + 1));
    item.addStyleName("pad-text");
    advanced.add(item, new TabItemConfig("New Tab " + ++index, index != 1));
  }
 
}
