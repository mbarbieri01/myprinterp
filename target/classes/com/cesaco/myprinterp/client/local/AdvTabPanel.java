package com.cesaco.myprinterp.client.local;


/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */

 
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.TabItemConfig;
import com.sencha.gxt.widget.core.client.TabPanel;
 
public class AdvTabPanel implements IsWidget {
	 
	  private TabPanel advanced;
	  private int index = 0;
	  
	  private KitchenSinkApp controller;
	 
	  public KitchenSinkApp getController() {
		return controller;
	}

	public void setController(KitchenSinkApp controller) {
		this.controller = controller;
	}
	private int i;
	public Widget asWidget() {

		i = 0;
	      advanced = new TabPanel();
	      //advanced.setBorders(false);
	      
	      //advanced.setPixelSize(600, 250);
	      
	      advanced.setAnimScroll(true);
	      advanced.setTabScroll(true);
	      advanced.setCloseContextMenu(true);
	 
	 
	 
	      

		  
	      return advanced;
	  }
	 
	  public void onModuleLoad() {
	    RootPanel.get().add(asWidget());
	  }
	 
	  public void addTab(IsWidget form, String label) {
//	    Label item = new Label("Tab Body " + (index + 1));
//	    item.addStyleName("pad-text");
	    advanced.add(form, new TabItemConfig(""+label+i, true));
	    advanced.setActiveWidget(advanced.getWidget(advanced.getWidgetCount()-1));
	    i++;
	  }
	 
	}