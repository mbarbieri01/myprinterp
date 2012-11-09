package com.cesaco.myprinterp.client.forms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import org.jboss.errai.bus.client.api.ErrorCallback;
import org.jboss.errai.bus.client.api.Message;
import org.jboss.errai.bus.client.api.RemoteCallback;
import org.jboss.errai.ioc.client.api.Caller;

import com.cesaco.myprinterp.client.shared.Gruppo;
import com.cesaco.myprinterp.client.shared.GruppoService;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.form.FieldLabel;
import com.sencha.gxt.widget.core.client.form.FieldSet;
import com.sencha.gxt.widget.core.client.form.TextField;
import com.sencha.gxt.widget.core.client.info.Info;

public class GruppoFormClient extends Composite {

	
	
	private VerticalPanel vp;
	
	@Inject
	private Caller<GruppoService> gruppoService;
	private final List<Gruppo> gruppi = new ArrayList<Gruppo>();
	 
	  public Widget asWidget() {
	    if (vp == null) {
	      vp = new VerticalPanel();
	      vp.setSpacing(10);
	      createForm();
	    }
	    return vp;
	  }
	  
	  public GruppoFormClient() {
		  
		  if (vp == null) {
		      vp = new VerticalPanel();
		      vp.setSpacing(10);
		      createForm();
		    }
		  initWidget(vp);
		  PopupPanel pp = new PopupPanel();
			pp.add(this);
			pp.center();
			pp.setGlassEnabled(true);
			pp.show();
	  }

	  private TextField cod_gruppo;
	  private TextField des_gruppo;
	  
	  private Label cod_gruppoError;
	  private Label des_gruppoError;
	  private Label registerConfirmMessage;
	  
	 
	  private void createForm() {
	    FramedPanel form = new FramedPanel();
	    form.setHeadingText("Gestione Gruppo");
	    form.setWidth(350);
	 
	    FieldSet fieldSet = new FieldSet();
	    fieldSet.setHeadingText("Informazioni Gruppo");
	    fieldSet.setCollapsible(true);
	    form.add(fieldSet);
	 
	    VerticalLayoutContainer p = new VerticalLayoutContainer();
	    fieldSet.add(p);
	 
	    cod_gruppo = new TextField();
	    cod_gruppo.setAllowBlank(false);
	    cod_gruppo.addValueChangeHandler(new ValueChangeHandler<String>() {
	        @Override
	        public void onValueChange(ValueChangeEvent<String> event) {
	          Info.display("Valore cambiato", "cod_gruppo =  " + event.getValue() == null ? "blank" : event.getValue());
	        }
	      });
	    p.add(new FieldLabel(cod_gruppo, "cod_gruppo"), new VerticalLayoutData(1, -1));
	    
	    cod_gruppoError = new Label();
	    p.add(cod_gruppoError);
	 
	    des_gruppo = new TextField();
	    des_gruppo.setAllowBlank(false);
	    p.add(new FieldLabel(des_gruppo, "des_gruppo"), new VerticalLayoutData(1, -1));
	    
	    des_gruppoError = new Label();
	    p.add(des_gruppoError);
	    
	    final Actions ac = new Actions();

	    form.addButton(new TextButton("Salva", new SelectEvent.SelectHandler() {
			
			@Override
			public void onSelect(SelectEvent event) {
				Info.display("pressed","OK");
				
				ac.registerGruppo();
				//closeForm();
			
			}
		}
		));
	    
	    form.addButton(new TextButton("Annulla"));
	 
	    vp.add(form);
	  }
	  
	  private class Actions {
	  
//	  private void closeForm() {
//		  super.removeFromParent();
//	  }
	  
	  private void registerGruppo() {
		  Info.display("ERROR", "inizio registerGruppo");
		  Gruppo newGruppo = new Gruppo();
		  newGruppo.setCod_gruppo(cod_gruppo.getText());
		  newGruppo.setDes_gruppo(des_gruppo.getText());
		  Info.display("ERROR2", "inizio registerGruppo");
		    cod_gruppoError.setText("");
		    des_gruppoError.setText("");
		    Info.display("ERROR3", "inizio registerGruppo");
		    
		    ////////ERRORE qui
		    Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
		    Set<ConstraintViolation<Gruppo>> violations = validator.validate(newGruppo);
		    /////////####
		    Info.display("ERROR4", "inizio registerGruppo");
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

		    Info.display("ERROR", "ci sono problemi sul validator: Gruppo.class");
		    if (!violations.isEmpty()) return;

		    gruppoService.call(
		        new RemoteCallback<Void>() {
		          @Override
		          public void callback(Void response) {
		            registerConfirmMessage.setText("Inserimento completato.");
		            registerConfirmMessage.setStyleName("successMessage");

		            // the server will also broadcast a @New Member CDI event, which causes the table to update
		            // so we don't have to do that here.
		          }
		        },
		        new ErrorCallback() {
		            @Override
		            public boolean error(Message message, Throwable throwable) {
		              registerConfirmMessage.setText("Inserimento fallito: " + throwable.getMessage());
		              return false;
		            }
		          }).register(newGruppo);
		  }
	  }
	  
}
