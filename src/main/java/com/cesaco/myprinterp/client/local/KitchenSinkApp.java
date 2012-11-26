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

/**
 * Entry point for the Errai Kitchen Sink application. The {@code @EntryPoint}
 * annotation indicates to the Errai framework that this class should be
 * instantiated inside the web browser when the web page is first loaded.
 * 
 * @author Jonathan Fuerth <jfuerth@redhat.com>
 * @author Christian Sadilek <csadilek@redhat.com>
 */
@EntryPoint
public class KitchenSinkApp {

	/**
	 * This is the client-side proxy to the Errai service implemented by
	 * MemberServiceImpl. The proxy is generated at build time, and injected
	 * into this field when the page loads. You can create additional Errai
	 * services by following this same pattern; just be sure that the
	 * client-side class you inject the Caller into is an injectable class
	 * (client-side injectable classes are annotated with {@code @EntryPoint},
	 * {@code @ApplicationScoped}, or {@code @Singleton}).
	 */
	@Inject
	private Caller<MemberService> memberService;
	@Inject
	private Caller<GruppoService> gruppoService;
	@Inject
	private Caller<MacchinaService> macchinaService;

	private KitchenSinkClient kitchenSinkUi;

	private BaseLayoutEntry baseLayoutEntry;

	private StatusBar statusBar;
	private MenuBar menuBar;
	private AdvTabPanel advTabPanel;
	private AccordionLayout accordionPanel;
	private CentralPanel centralPanel;

	@AfterInitialization
	public void createUI() {

		// ////
		/*
		 * GUARDARE LOG!!!!!
		 */
		kitchenSinkUi = new KitchenSinkClient(memberService);

		baseLayoutEntry = new BaseLayoutEntry();

		statusBar = new StatusBar();
		statusBar.setController(this);
		menuBar = new MenuBar();
		menuBar.setController(this);
		
		centralPanel = new CentralPanel();
		
		advTabPanel = new AdvTabPanel();
		advTabPanel.setController(this);
		
		centralPanel.setNorth(advTabPanel);
		
		accordionPanel = new AccordionLayout();
		accordionPanel.setController(this);

		//baseLayoutEntry.setAdvTabPanel(advTabPanel);
		baseLayoutEntry.setCentralPanel(centralPanel);
		baseLayoutEntry.setMenuBar(menuBar);
		baseLayoutEntry.setStatusBar(statusBar);
		baseLayoutEntry.setAccordionPanel(accordionPanel);

		kitchenSinkUi.setTableStatusMessage("Fetching member list...");

		// RootPanel.get("kitchensink").add(kitchenSinkUi);
		RootPanel.get("kitchensink").add(baseLayoutEntry);
		fetchMemberList();
	}

	/**
	 * Responds to the CDI event that's fired every time a new member is added
	 * to the database.
	 * 
	 * @param newMember
	 *            The member that was just added to the database.
	 */
	public void onMemberAdded(@Observes @New Member newMember) {
		kitchenSinkUi.addDisplayedMember(newMember);
	}

	/**
	 * Fetches the member list from the server, adding each member to the table
	 * in the UI.
	 */
	private void fetchMemberList() {

		// note that GWT.log messages only show up in development mode. They
		// have no effect in production mode.
		GWT.log("Requesting member list...");

		memberService.call(new RemoteCallback<List<Member>>() {
			@Override
			public void callback(List<Member> response) {
				GWT.log("Got member list. Size: " + response.size());
				kitchenSinkUi.setDisplayedMembers(response);
			}
		}, new ErrorCallback() {
			@Override
			public boolean error(Message message, Throwable throwable) {
				throwable.printStackTrace();
				kitchenSinkUi
						.setGeneralErrorMessage("Failed to retrieve list of members: "
								+ throwable.getMessage());
				return false;
			}
		}).retrieveAllMembersOrderedByName();
	}

	public void addForm1() {
		advTabPanel.addTab((IsWidget) new GruppoFormClient(gruppoService),
				"AT_GRUPPO");
	}

	public void addChart1() {
		advTabPanel.addTab((IsWidget) new LineExample(/* gruppoService */),
				"Chart esempio");

	}
	
	public void addForm2() {
		advTabPanel.addTab((IsWidget) new MacchinaFormClient(macchinaService, gruppoService), "AT_MACCHINA");
	}
	
	public void addGrid1() {
		centralPanel.setSouth(new GruppoGrid(gruppoService));
	}

}
