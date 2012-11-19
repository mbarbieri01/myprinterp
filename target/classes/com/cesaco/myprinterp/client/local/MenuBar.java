package com.cesaco.myprinterp.client.local;


/**
 * Sencha GXT 3.0.1 - Sencha for GWT
 * Copyright(c) 2007-2012, Sencha, Inc.
 * licensing@sencha.com
 *
 * http://www.sencha.com/products/gxt/license/
 */

 
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.dom.XElement;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.button.ButtonGroup;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.BoxLayoutContainer.BoxLayoutData;
import com.sencha.gxt.widget.core.client.container.FlowLayoutContainer;
import com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer;
import com.sencha.gxt.widget.core.client.container.HBoxLayoutContainer.HBoxLayoutAlign;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.menu.Menu;
import com.sencha.gxt.widget.core.client.menu.MenuItem;
import com.sencha.gxt.widget.core.client.toolbar.ToolBar;
 
public class MenuBar implements IsWidget {
 
  class SamplePanel extends ContentPanel {
 
	private HBoxLayoutContainer cont;
	
    private VerticalLayoutContainer con = new VerticalLayoutContainer();
     
    private ToolBar toolBar = new ToolBar();
 
    public SamplePanel() {
      //setPixelSize();
      //toolBar.setSpacing(2);
 
    	
    	
    	//####CONTROLLARE!!!!! non funziona
    	cont = new HBoxLayoutContainer();
    	cont.setHBoxLayoutAlign(HBoxLayoutAlign.TOP);
 
      con.add(toolBar,  new VerticalLayoutData(1, -1));

      cont.add(con, new BoxLayoutData(new Margins(0, 5, 0, 0)));
      cont.add(new Label("CESACO"), new BoxLayoutData(new Margins(0, 5, 0, 0)));
      add(cont);
    }
 
    public ToolBar getToolBar() {
      return toolBar;
    }
  }
 
  public Widget asWidget() {
    FlowLayoutContainer con = new FlowLayoutContainer();
    
    con.add(createMulti());

 
    return con;
  };
 
 
  private ContentPanel createMulti() {
    SamplePanel panel = new SamplePanel();
    panel.setHeaderVisible(false);
 
    ButtonGroup group = new ButtonGroup();
    group.setHeadingText("Menu Uno");
    panel.getToolBar().add(group);
 
    FlexTable table = new FlexTable();
    group.add(table);
 
    TextButton btn = new TextButton("Cool");
    table.setWidget(0, 0, btn);
 
    btn = new TextButton("Cut");
    Menu menu = new Menu();
    menu.add(new MenuItem("Copy me"));
    btn.setMenu(menu);
    table.setWidget(0, 1, btn);
 
    btn = new TextButton("Copy");
    table.setWidget(1, 0, btn);
    // //
    btn = new TextButton("Paste");
    table.setWidget(1, 1, btn);
 
    group = new ButtonGroup();
    group.setHeadingText("Menu Due");
    panel.getToolBar().add(group);
 
    table = new FlexTable();
    group.add(table);
 
    btn = new TextButton("Cool");
    table.setWidget(0, 0, btn);
 
    btn = new TextButton("Cut");
    menu = new Menu();
    menu.add(new MenuItem("Copy me"));
    btn.setMenu(menu);
    table.setWidget(0, 1, btn);
 
    btn = new TextButton("Copy");
    table.setWidget(1, 0, btn);
    // //
    btn = new TextButton("Paste");
    table.setWidget(1, 1, btn);
    
    group = new ButtonGroup();
    group.setHeadingText("Ancora Menu");
    panel.getToolBar().add(group);
 
    table = new FlexTable();
    group.add(table);
 
    btn = new TextButton("Cool");
    table.setWidget(0, 0, btn);
 
    btn = new TextButton("Cut");
    menu = new Menu();
    menu.add(new MenuItem("Copy me"));
    btn.setMenu(menu);
    table.setWidget(0, 1, btn);
 
    btn = new TextButton("Copy");
    table.setWidget(1, 0, btn);
    // //
    btn = new TextButton("Paste");
    table.setWidget(1, 1, btn);
 
    return panel;
  }
 
 
  private void cleanCells(Element elem) {
    NodeList<Element> tds = elem.<XElement> cast().select("td");
    for (int i = 0; i < tds.getLength(); i++) {
      Element td = tds.getItem(i);
       
      if (!td.hasChildNodes() && td.getClassName().equals("")) {
        td.removeFromParent();
      }
    }
  }
 
  public void onModuleLoad() {
    RootPanel.get().add(asWidget());
  }
 
}
