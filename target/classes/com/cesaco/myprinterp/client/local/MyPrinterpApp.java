package com.cesaco.myprinterp.client.local;

import java.util.List;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.jboss.errai.bus.client.api.ErrorCallback;
import org.jboss.errai.bus.client.api.Message;
import org.jboss.errai.bus.client.api.RemoteCallback;
import org.jboss.errai.ioc.client.api.AfterInitialization;
import org.jboss.errai.ioc.client.api.Caller;
import org.jboss.errai.ioc.client.api.EntryPoint;

import com.cesaco.myprinterp.client.charts.LineExample;
import com.cesaco.myprinterp.client.forms.GruppoFormClient;
import com.cesaco.myprinterp.client.forms.MacchinaFormClient;
import com.cesaco.myprinterp.client.grids.GruppoGrid;
import com.cesaco.myprinterp.client.shared.GruppoService;
import com.cesaco.myprinterp.client.shared.MacchinaService;
import com.cesaco.myprinterp.client.shared.Member;
import com.cesaco.myprinterp.client.shared.MemberService;
import com.cesaco.myprinterp.client.shared.New;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;

@EntryPoint
public class MyPrinterpApp {

	@Inject
	private Caller<MemberService> memberService;
	@Inject
	private Caller<GruppoService> gruppoService;
	@Inject
	private Caller<MacchinaService> macchinaService;

	private BaseLayoutEntry baseLayoutEntry;

	private StatusBar statusBar;
	private MenuBar menuBar;
	private AdvTabPanel advTabPanel;
	private AccordionLayout accordionPanel;

	@AfterInitialization
	public void createUI() {

		baseLayoutEntry = new BaseLayoutEntry();

		statusBar = new StatusBar();
		statusBar.setController(this);
		menuBar = new MenuBar();
		menuBar.setController(this);
		
		advTabPanel = new AdvTabPanel();
		advTabPanel.setController(this);

		accordionPanel = new AccordionLayout();
		accordionPanel.setController(this);

		baseLayoutEntry.setAdvTabPanel(advTabPanel);
		baseLayoutEntry.setMenuBar(menuBar);
		baseLayoutEntry.setStatusBar(statusBar);
		baseLayoutEntry.setAccordionPanel(accordionPanel);

		RootPanel.get("myprinterp").add(baseLayoutEntry);
	}

//	public void onMemberAdded(@Observes @New Member newMember) {
//		kitchenSinkUi.addDisplayedMember(newMember);
//	}

	public void addForm1() {
		CentralPanel centralPanel = new CentralPanel();
		GruppoFormClient gfc = new GruppoFormClient(gruppoService);
		GWT.log("GruppoFormClient hash = "+gfc.hashCode());
		centralPanel.setNorth((IsWidget) gfc);
		centralPanel.setSouth((IsWidget) new GruppoGrid(gruppoService, gfc));
		advTabPanel.addTab(centralPanel, "AT_GRUPPO");
	}

	public void addChart1() {
		advTabPanel.addTab((IsWidget) new LineExample(/* gruppoService */),
				"Chart esempio");
	}
	
	public void addForm2() {	
		advTabPanel.addTab((IsWidget) new MacchinaFormClient(macchinaService, gruppoService), "AT_MACCHINA");
	}
}
