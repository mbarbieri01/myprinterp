package com.cesaco.myprinterp.client.forms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import org.jboss.errai.bus.client.api.ErrorCallback;
import org.jboss.errai.bus.client.api.Message;
import org.jboss.errai.bus.client.api.RemoteCallback;
import org.jboss.errai.ioc.client.api.Caller;

import com.cesaco.myprinterp.client.shared.Gruppo;
import com.cesaco.myprinterp.client.shared.GruppoService;
import com.cesaco.myprinterp.client.shared.Macchina;
import com.cesaco.myprinterp.client.shared.MacchinaService;
import com.cesaco.myprinterp.client.data.model.GruppoProperties;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.cell.core.client.form.ComboBoxCell.TriggerAction;
import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.Window;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.form.ComboBox;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.form.FieldSet;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.info.Info;

public class MacchinaFormClient extends Composite {

	private VerticalPanel vp;

	private Caller<MacchinaService> macchinaService;
	private Caller<GruppoService> gruppoService;

	private final List<Macchina> macchine = new ArrayList<Macchina>();

	private final Actions ac = new Actions();

	private final Window window = new Window();

	private FramedPanel form;
	private FieldSet fieldSet;
	private VerticalLayoutContainer p;

	public Widget asWidget() {
		if (vp == null) {
		      vp = new VerticalPanel();
		      vp.setSpacing(0);
		      vp.setWidth("100%");
		      vp.setHeight("200px");
		      createForm();
		    }
		    return vp;
	}

	public MacchinaFormClient(Caller<MacchinaService> macchinaService,
			Caller<GruppoService> gruppoService) {
		// form = new FramedPanel();
		// window.setPixelSize(500, 300);
		// window.setModal(true);
		// window.setBlinkModal(true);
		// window.setHeadingText("AT_MACCHINA");
		// window.setResizable(false);
		//
		// window.addHideHandler(new HideHandler() {
		// @Override
		// public void onHide(HideEvent event) {
		//
		// }
		// });

		this.macchinaService = macchinaService;
		this.gruppoService = gruppoService;
		if (vp == null) {
			vp = new VerticalPanel();
			vp.setSpacing(0);
			vp.setWidth("100%");
		      vp.setHeight("200px");
			createForm();
		}

		// initWidget(vp);
		// PopupPanel pp = new PopupPanel();
		// pp.add(this);
		// pp.center();
		// pp.setGlassEnabled(true);
		// pp.show();
	}

	private TextField cod_macchina;
	private TextField cod_art_gest;
	private TextField des_macchina;
	private ComboBox<Gruppo> comboGruppi;

	private Label cod_macchinaError;
	private Label cod_art_gestError;
	private Label des_macchinaError;
	private Label cod_gruppoError;
	private Label registerConfirmMessage;

	

	private ListStore<Gruppo> gruppi;

	private void createForm() {
		// ac = new Actions();
		FramedPanel form = new FramedPanel();
		form.setWidth("100%");
		 
		tempGruppoList = new ArrayList<Gruppo>();

		form.setHeaderVisible(false);
		form.setBorders(false);

		// form.setHeadingText("Gestione Macchina");
		// form.setWidth(window.);

		fieldSet = new FieldSet();
		fieldSet.setHeadingText("Informazioni Macchina");
		fieldSet.setCollapsible(true);

		form.add(fieldSet);

		p = new VerticalLayoutContainer();

		fieldSet.add(p);

		cod_macchina = new TextField();
		cod_macchina.setAllowBlank(false);
		cod_macchina.addValueChangeHandler(new ValueChangeHandler<String>() {
			@Override
			public void onValueChange(ValueChangeEvent<String> event) {
				Info.display("Valore cambiato",
						"cod_macchina =  " + event.getValue() == null ? "blank"
								: event.getValue());
			}
		});
		p.add(new FieldLabel(cod_macchina, "cod_macchina"),
				new VerticalLayoutData(1, -1));

		cod_macchinaError = new Label();
		p.add(cod_macchinaError);

		cod_art_gest = new TextField();
		cod_art_gest.setAllowBlank(false);
		cod_art_gest.addValueChangeHandler(new ValueChangeHandler<String>() {
			@Override
			public void onValueChange(ValueChangeEvent<String> event) {
				Info.display("Valore cambiato",
						"cod_art_gest =  " + event.getValue() == null ? "blank"
								: event.getValue());
			}
		});
		p.add(new FieldLabel(cod_art_gest, "cod_art_gest"),
				new VerticalLayoutData(1, -1));

		cod_art_gestError = new Label();
		p.add(cod_art_gestError);

		des_macchina = new TextField();
		des_macchina.setAllowBlank(false);
		p.add(new FieldLabel(des_macchina, "des_macchina"),
				new VerticalLayoutData(1, -1));

		des_macchinaError = new Label();
		p.add(des_macchinaError);

		// COMBO BOX GRUPPI
		GruppoProperties propsGruppo = GWT.create(GruppoProperties.class);
		// Combo box
		gruppi = new ListStore<Gruppo>(propsGruppo.abbr());
		GWT.log("MacchinaFormClient. gruppi.size = "+gruppi.size());
		// !!! devo popolare la lista di gruppi!!!!!!
		// ###################
		getAllGruppo();

		//gruppi.addAll(ac.getGruppoList());
		// ################

		comboGruppi = new ComboBox<Gruppo>(gruppi, propsGruppo.name());
		addHandlersForEventObservation(comboGruppi, propsGruppo.name());

		comboGruppi.setEmptyText("Seleziona un gruppo...");
		comboGruppi.setWidth(150);
		comboGruppi.setTypeAhead(true);
		comboGruppi.setTriggerAction(TriggerAction.ALL);
		p.add(comboGruppi);
		// END COMBO BOX GRUPPI
		cod_gruppoError = new Label();
		p.add(cod_gruppoError);
		registerConfirmMessage = new Label();
		p.add(registerConfirmMessage);

		form.addButton(new TextButton("Salva", new SelectEvent.SelectHandler() {

			@Override
			public void onSelect(SelectEvent event) {

				ac.registerGruppo();

			}
		}));

		form.addButton(new TextButton("Annulla"));

		vp.add(form);

	}

	// Actions ac;

	List<Gruppo> tempGruppoList;

	private void getAllGruppo() {

		gruppoService.call(new RemoteCallback<List<Gruppo>>() {
			@Override
			public void callback(List<Gruppo> response) {
				GWT.log("Got gruppo list. Size: " + response.size());
				gruppi.addAll(response);
				// ac.setTempGruppoList(response);
				Info.display("INFO", "hashcode  = " + ac.hashCode());
				Info.display("INFO", "in getAllGruppo(). response.size = "
						+ response.size());
			}
		}, new ErrorCallback() {
			@Override
			public boolean error(Message message, Throwable throwable) {
				throwable.printStackTrace();
				return false;
			}
		}).retrieveAllGruppoOrderedByName();
		Info.display("INFO", "CHiamato gruppoService.retrieve");

	}

	private <T> void addHandlersForEventObservation(ComboBox<T> combo,
			final LabelProvider<T> labelProvider) {
		combo.addValueChangeHandler(new ValueChangeHandler<T>() {
			@Override
			public void onValueChange(ValueChangeEvent<T> event) {
				Info.display(
						"Valore cambiato",
						"Nuovo valore: "
								+ (event.getValue() == null ? "null"
										: labelProvider.getLabel(event
												.getValue()) + "!"));
			}
		});
		combo.addSelectionHandler(new SelectionHandler<T>() {
			@Override
			public void onSelection(SelectionEvent<T> event) {
				Info.display(
						"Gruppo selezionato",
						"Hai selezionato "
								+ (event.getSelectedItem() == null ? "null"
										: labelProvider.getLabel(event
												.getSelectedItem()) + "!"));
			}
		});
	}

	private class Actions {

		private final List<Gruppo> gruppoList = new ArrayList<Gruppo>();

		public void setTempGruppoList(List<Gruppo> gruppoList) {
			Info.display("INFO",
					"gruppoList size from actions: " + gruppoList.size());
			this.gruppoList.clear();
			Info.display("INFO", "hashcode  = " + this.hashCode());
			for (int i = 0; i < gruppoList.size(); i++) {
				this.gruppoList.add(gruppoList.get(i));
			}
		}

		public List<Gruppo> getGruppoList() {
			Info.display("INFO - ACTIONS",
					gruppoList != null ? "" + gruppoList.size()
							: "gruppoList is null");
			return gruppoList;
		}

		private void closeForm() {
			removeFromParent();
		}

		private void registerGruppo() {

			Macchina newMacchina = new Macchina();
			newMacchina.setCod_macchina(cod_macchina.getText());
			newMacchina.setCod_art_gest(cod_art_gest.getText());
			newMacchina.setDes_macchina(des_macchina.getText());
			newMacchina.setGruppo(comboGruppi.getCurrentValue());

			cod_macchinaError.setText("");
			cod_art_gestError.setText("");
			des_macchinaError.setText("");
			cod_gruppoError.setText("");

			// //////ERRORE qui
			Validator validator = Validation.buildDefaultValidatorFactory()
					.getValidator();
			Set<ConstraintViolation<Macchina>> violations = validator
					.validate(newMacchina);
			// ///////####

			for (ConstraintViolation<Macchina> cv : violations) {
				String prop = cv.getPropertyPath().toString();
				if (prop.equals("cod_macchina")) {
					cod_macchinaError.setText(cv.getMessage());
				} else if (prop.equals("cod_art_gest")) {
					cod_art_gestError.setText(cv.getMessage());
				} else if (prop.equals("des_macchina")) {
					des_macchinaError.setText(cv.getMessage());
				} else if (prop.equals("cod_gruppo")) {
					cod_gruppoError.setText(cv.getMessage());
				} else {
					Info.display("OK", cv.getMessage());
				}
			}

			if (!violations.isEmpty())
				return;

			macchinaService.call(new RemoteCallback<Void>() {
				@Override
				public void callback(Void response) {
					registerConfirmMessage.setText("Inserimento completato.");
					registerConfirmMessage.setStyleName("successMessage");

					// the server will also broadcast a @New Member CDI event,
					// which causes the table to update
					// so we don't have to do that here.
				}
			}, new ErrorCallback() {
				@Override
				public boolean error(Message message, Throwable throwable) {
					registerConfirmMessage.setText("Inserimento fallito: "
							+ throwable.getMessage());
					registerConfirmMessage.setStyleName("errorMessage");
					return false;
				}
			}).register(newMacchina);
		}
	}

}
