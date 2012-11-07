package com.cesaco.myprinterp.client.local;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class MyPopup1 extends PopupPanel {

	private static final Binder binder = GWT.create(Binder.class);
	@UiField Button button;

	interface Binder extends UiBinder<Widget, MyPopup1> {
	}

	public MyPopup1() {
		setWidget(binder.createAndBindUi(this));
	}

	@UiHandler("button")
	void onButtonClick(ClickEvent event) {
		this.removeFromParent();
		
	}
}
