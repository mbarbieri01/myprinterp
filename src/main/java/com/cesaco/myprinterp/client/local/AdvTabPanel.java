package com.cesaco.myprinterp.client.local;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.TabItemConfig;
import com.sencha.gxt.widget.core.client.TabPanel;

public class AdvTabPanel implements IsWidget {

	private TabPanel advanced;
	private int index = 0;

	private MyPrinterpApp controller;

	public MyPrinterpApp getController() {
		return controller;
	}

	public void setController(MyPrinterpApp controller) {
		this.controller = controller;
	}

	private int i;

	public Widget asWidget() {

		i = 0;
		advanced = new TabPanel();

		advanced.setAnimScroll(true);
		advanced.setTabScroll(true);
		advanced.setCloseContextMenu(true);

		return advanced;
	}

	public void onModuleLoad() {
		RootPanel.get().add(asWidget());
	}

	public void addTab(IsWidget form, String label) {
		advanced.add(form, new TabItemConfig(label, true));
		advanced.setActiveWidget(advanced.getWidget(advanced.getWidgetCount() - 1));
		i++;
	}

}