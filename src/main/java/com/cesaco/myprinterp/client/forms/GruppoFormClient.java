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
import com.google.gwt.editor.client.Editor;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.HasSelectHandlers;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.form.FieldSet;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.info.Info;

public class GruppoFormClient implements IsWidget, Editor<Gruppo> {

	private VerticalPanel vp;

	TextField cod_gruppo;
	TextField des_gruppo;

	private TextButton save;

	private Caller<GruppoService> gruppoService;

	private final List<Gruppo> gruppi = new ArrayList<Gruppo>();

	public void setSaveEnabled(boolean enabled) {
		save.setEnabled(enabled);
		cod_gruppo.setEnabled(enabled);
		des_gruppo.setEnabled(enabled);
		if (!enabled) {

			cod_gruppo.setValue("");
			des_gruppo.setValue("");
		}
	}

	public HasSelectHandlers getSaveButton() {
		return save;
	}

	public Widget asWidget() {
		if (vp == null) {
			vp = new VerticalPanel();
			vp.setSpacing(0);

			vp.setWidth("100%");
			createForm();
		}
		return vp;
	}

	public GruppoFormClient(Caller<GruppoService> gruppoService) {
		this.gruppoService = gruppoService;
		if (vp == null) {
			vp = new VerticalPanel();
			vp.setSpacing(0);
			vp.setWidth("100%");
			vp.setHeight("200px");
			createForm();
		}

	}

	private Label cod_gruppoError;
	private Label des_gruppoError;
	private Label registerConfirmMessage;

	private void createForm() {
		FramedPanel form = new FramedPanel();

		form.setHeaderVisible(false);
		form.setWidth("100%");

		FieldSet fieldSet = new FieldSet();
		fieldSet.setHeadingText("Informazioni Gruppo");
		fieldSet.setCollapsible(true);
		form.add(fieldSet);

		VerticalLayoutContainer p = new VerticalLayoutContainer();
		// fieldSet.setWidth("100%");
		fieldSet.add(p);

		cod_gruppo = new TextField();
		cod_gruppo.setAllowBlank(false);
		cod_gruppo.addValueChangeHandler(new ValueChangeHandler<String>() {
			@Override
			public void onValueChange(ValueChangeEvent<String> event) {
				Info.display("Valore cambiato",
						"cod_gruppo =  " + event.getValue() == null ? "blank"
								: event.getValue());
			}
		});
		p.add(new FieldLabel(cod_gruppo, "cod_gruppo"), new VerticalLayoutData(
				1, -1));

		cod_gruppoError = new Label();
		p.add(cod_gruppoError);

		des_gruppo = new TextField();
		des_gruppo.setAllowBlank(false);
		p.add(new FieldLabel(des_gruppo, "des_gruppo"), new VerticalLayoutData(
				1, -1));

		des_gruppoError = new Label();
		p.add(des_gruppoError);

		registerConfirmMessage = new Label();
		p.add(registerConfirmMessage);

		save = new TextButton("Save");
		TextButton insert = new TextButton("Aggiungi");
		insert.addSelectHandler(new SelectHandler() {

			@Override
			public void onSelect(SelectEvent event) {
				Gruppo newGruppo = new Gruppo();
				newGruppo.setCod_gruppo(cod_gruppo.getText());
				newGruppo.setDes_gruppo(des_gruppo.getText());
				registerGruppo(newGruppo);
			}
		});
		save.setEnabled(false);
		form.addButton(save);
		form.addButton(insert);
		form.addButton(new TextButton("Annulla"));

		vp.add(form);
	}

	public void registerGruppo(Gruppo newGruppo) {

		cod_gruppoError.setText("");
		des_gruppoError.setText("");
		
		Validator validator = Validation.buildDefaultValidatorFactory()
				.getValidator();

		Set<ConstraintViolation<Gruppo>> violations = validator
				.validate(newGruppo);

		for (ConstraintViolation<Gruppo> cv : violations) {
			String prop = cv.getPropertyPath().toString();
			if (prop.equals("cod_gruppo")) {
				cod_gruppoError.setText(cv.getMessage());
			} else if (prop.equals("des_gruppo")) {
				des_gruppoError.setText(cv.getMessage());
			} else {
				Info.display("OK", cv.getMessage());
			}
		}

		if (!violations.isEmpty())
			return;

		gruppoService.call(new RemoteCallback<Void>() {
			@Override
			public void callback(Void response) {
				registerConfirmMessage.setText("Inserimento completato.");
				registerConfirmMessage.setStyleName("successMessage");

				// the server will also broadcast a @New Member CDI event, which
				// causes the table to update
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
		}).register(newGruppo);
	}

	public void update(Gruppo newGruppo) {

		cod_gruppoError.setText("");
		des_gruppoError.setText("");

		Validator validator = Validation.buildDefaultValidatorFactory()
				.getValidator();

		Set<ConstraintViolation<Gruppo>> violations = validator
				.validate(newGruppo);

		for (ConstraintViolation<Gruppo> cv : violations) {
			String prop = cv.getPropertyPath().toString();
			if (prop.equals("cod_gruppo")) {
				cod_gruppoError.setText(cv.getMessage());
			} else if (prop.equals("des_gruppo")) {
				des_gruppoError.setText(cv.getMessage());
			} else {
				Info.display("OK", cv.getMessage());
			}
		}

		if (!violations.isEmpty())
			return;

		gruppoService.call(new RemoteCallback<Void>() {
			@Override
			public void callback(Void response) {
				registerConfirmMessage.setText("Aggiornamento completato.");
				registerConfirmMessage.setStyleName("successMessage");

				// the server will also broadcast a @New Member CDI event, which
				// causes the table to update
				// so we don't have to do that here.
			}
		}, new ErrorCallback() {
			@Override
			public boolean error(Message message, Throwable throwable) {
				registerConfirmMessage.setText("Aggiornamento fallito: "
						+ throwable.getMessage());
				registerConfirmMessage.setStyleName("errorMessage");
				return false;
			}
		}).update(newGruppo);

	}
}
