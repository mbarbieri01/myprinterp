package com.cesaco.myprinterp.client.local;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.cellview.client.CellTable;

public class BaseMenuClient extends Composite {

	private static BaseMenuClientUiBinder uiBinder = GWT
			.create(BaseMenuClientUiBinder.class);
	

	interface BaseMenuClientUiBinder extends UiBinder<Widget, BaseMenuClient> {
	}

	public BaseMenuClient() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	Button button;
	
	@UiField
	MenuItem tab1;
	
	@UiField
	MenuItem tab2;
	
	@UiField
	VerticalPanel vPanel;

	public BaseMenuClient(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		button.setText(firstName);
		tab1.setText("tab1item");
		tab1.setCommand(cmdBtnLogout);
		tab2.setCommand(cmdBtn2);
	}

	@UiHandler("button")
	void onButtonClick(ClickEvent e) {
		Window.alert("Hello!");
	}
	
	

	public void setText(String text) {
		button.setText(text);
	}

	public String getText() {
		return button.getText();
	}
	
	Command cmdBtnLogout = new Command() {
		         public void execute() {
		             vPanel.add(new InnerEntity1());
		       }
	     };
	     
	Command cmdBtn2 = new Command() {
	         public void execute() {
	             MyPopup1 mp = new MyPopup1();
	             mp.setGlassEnabled(true);
	             mp.center();
	             mp.show();
	             
	       }
     };

}
