package com.cesaco.myprinterp.client.local;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer;
import com.sencha.gxt.widget.core.client.container.BorderLayoutContainer.BorderLayoutData;
import com.sencha.gxt.widget.core.client.container.MarginData;
import com.sencha.gxt.widget.core.client.container.SimpleContainer;
import com.sencha.gxt.widget.core.client.container.Viewport;

public class BaseLayoutEntry implements IsWidget {

	private StatusBar statusBar;
	private MenuBar menuBar;
	private AdvTabPanel advTabPanel;

	public AdvTabPanel getAdvTabPanel() {
		return advTabPanel;
	}

	public void setAdvTabPanel(AdvTabPanel advTabPanel) {
		this.advTabPanel = advTabPanel;
	}

	private AccordionLayout accordionPanel;

	public AccordionLayout getAccordionPanel() {
		return accordionPanel;
	}

	public void setAccordionPanel(AccordionLayout accordionPanel) {
		this.accordionPanel = accordionPanel;
	}

	public StatusBar getStatusBar() {
		return statusBar;
	}

	public void setStatusBar(StatusBar statusBar) {
		this.statusBar = statusBar;
	}

	public MenuBar getMenuBar() {
		return menuBar;
	}

	public void setMenuBar(MenuBar menuBar) {
		this.menuBar = menuBar;
	}

	public Widget asWidget() {

		final BorderLayoutContainer con = new BorderLayoutContainer();
		con.setBorders(false);

		ContentPanel north = new ContentPanel();
		north.setBorders(false);
		north.setHeaderVisible(false);
		ContentPanel west = new ContentPanel();
		west.setBorders(false);
		west.setHeaderVisible(false);
		ContentPanel center = new ContentPanel();
		center.setBorders(false);
		center.setHeaderVisible(false);
		ContentPanel east = new ContentPanel();
		east.setBorders(false);
		east.setHeaderVisible(false);
		ContentPanel south = new ContentPanel();
		south.setBorders(false);
		south.setHeaderVisible(false);

		west.add(accordionPanel);

		north.add(menuBar);

		center.setResize(false);
		center.add(advTabPanel);

		south.add(statusBar);

		BorderLayoutData northData = new BorderLayoutData(100);
		northData.setMargins(new Margins(5));
		northData.setCollapsible(true);
		northData.setSplit(true);

		BorderLayoutData westData = new BorderLayoutData(150);
		westData.setCollapsible(true);
		westData.setSplit(true);
		westData.setMargins(new Margins(5));

		MarginData centerData = new MarginData();

		BorderLayoutData eastData = new BorderLayoutData(150);
		eastData.setMargins(new Margins(5));
		eastData.setCollapsible(true);
		eastData.setSplit(true);

		BorderLayoutData southData = new BorderLayoutData(30);
		southData.setMargins(new Margins(5));
		southData.setCollapsible(true);
		southData.setSplit(true);

		con.setNorthWidget(north, northData);
		con.setWestWidget(west, westData);
		con.setCenterWidget(center, centerData);
		con.setEastWidget(east, eastData);
		con.setSouthWidget(south, southData);

		SimpleContainer simple = new SimpleContainer();
		simple.add(con, new MarginData(0));

		Viewport viewport = new Viewport();
		viewport.setPosition(0, 0);
		viewport.add(simple);

		return viewport;
	}

	public void onModuleLoad() {
		Widget con = asWidget();
		Viewport viewport = new Viewport();
		viewport.add(con);
	}

}
