package com.cesaco.myprinterp.client.local;

import org.jboss.errai.ioc.client.api.Caller;

import com.cesaco.myprinterp.client.forms.GruppoFormClient;
import com.cesaco.myprinterp.client.forms.MacchinaFormClient;
import com.cesaco.myprinterp.client.shared.GruppoService;
import com.cesaco.myprinterp.client.shared.MacchinaService;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.Slider;
import com.sencha.gxt.widget.core.client.event.SelectEvent;

public class BaseMenuClient extends Composite {

	private Caller<GruppoService> gruppoService;
	private Caller<MacchinaService> macchinaService;
	
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
	MenuItem at_macchina_tab;
	
	@UiField
	MenuItem at_gruppo_tab;
	
	@UiField
	VerticalPanel vPanel;
	
	@UiField
	  Slider slider1;
	
	@UiHandler("slider1Button")
	  public void slider1ButtonClicked(SelectEvent event) {
	    slider1.setValue(40);
	  }

	public BaseMenuClient(Caller<GruppoService> gruppoService, Caller<MacchinaService> macchinaService) {
		this.gruppoService = gruppoService;
		this.macchinaService = macchinaService;
		initWidget(uiBinder.createAndBindUi(this));
		button.setText("prova");
		at_macchina_tab.setCommand(cmdAt_macchina_tab);
		at_gruppo_tab.setCommand(cmdAt_gruppo_tab);
	}

	@UiHandler("button")
	void onButtonClick(ClickEvent e) {
		
		GruppoFormClient gfc = new GruppoFormClient(gruppoService);
		PopupPanel pp = new PopupPanel();
		pp.add(gfc);
		pp.center();
		pp.setGlassEnabled(true);
		pp.show();
	}
	
	

	public void setText(String text) {
		button.setText(text);
	}

	public String getText() {
		return button.getText();
	}
	
	Command cmdAt_macchina_tab = new Command() {
		         public void execute() {
		        	MacchinaFormClient mfc = new MacchinaFormClient(macchinaService, gruppoService);
		        	//initWidget(mfc);
		        	RootPanel.get().add(mfc.asWidget());
//		        	PopupPanel pp = new PopupPanel();
//		     		pp.add(mfc);
//		     		pp.center();
//		     		pp.setGlassEnabled(true);
//		     		pp.show();
		       }
	     };
	     
	Command cmdAt_gruppo_tab = new Command() {
	         public void execute() {
	        	GruppoFormClient gfc = new GruppoFormClient(gruppoService);
	     		PopupPanel pp = new PopupPanel();
	     		pp.add(gfc);
	     		pp.center();
	     		pp.setGlassEnabled(true);
	     		pp.show();

	       }
     };

}
