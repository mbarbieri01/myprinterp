package com.cesaco.myprinterp.client.local;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.container.NorthSouthContainer;

public class CentralPanel implements IsWidget {

	private IsWidget north;
	private IsWidget south;

	public IsWidget getNorth() {
		return north;
	}

	public void setNorth(IsWidget north) {
		this.north = north;
	}

	public IsWidget getSouth() {
		return south;
	}

	public void setSouth(IsWidget south) {
		this.south = south;
	}

	public void onModuleLoad() {
		RootPanel.get().add(asWidget());
	}

	@Override
	public Widget asWidget() {
		ContentPanel panel = new ContentPanel();
		NorthSouthContainer nsc = new NorthSouthContainer();
		if (north != null) {
			nsc.setNorthWidget(north);
			
		}
		if (south != null) {
			nsc.setSouthWidget(south);
		}
		panel.add(nsc);
		panel.setBorders(false);
		panel.setHeaderVisible(false);
		return panel;

	}

}
