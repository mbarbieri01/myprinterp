package com.cesaco.myprinterp.client.local;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class TestForm1 extends Composite implements HasText {

	private static TestForm1UiBinder uiBinder = GWT
			.create(TestForm1UiBinder.class);

	interface TestForm1UiBinder extends UiBinder<Widget, TestForm1> {
	}

	public TestForm1() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	Button button;

	public TestForm1(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		button.setText(firstName);
	}

	@UiHandler("button")
	void onClick(ClickEvent e) {
		Window.alert("Hello!");
	}

	public void setText(String text) {
		button.setText(text);
	}

	public String getText() {
		return button.getText();
	}

}
