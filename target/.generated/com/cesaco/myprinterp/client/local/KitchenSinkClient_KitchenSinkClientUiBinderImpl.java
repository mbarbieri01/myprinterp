package com.cesaco.myprinterp.client.local;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class KitchenSinkClient_KitchenSinkClientUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.cesaco.myprinterp.client.local.KitchenSinkClient>, com.cesaco.myprinterp.client.local.KitchenSinkClient.KitchenSinkClientUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Register")
    SafeHtml html1();
     
    @Template("<h1>Benvenuto in PrintERP!</h1> <p>Gestione stampanti.</p> <h2>Register (Bean Validation example)</h2> <p>Enforces annotation-based constraints defined on the model class.</p> <span id='{0}'></span> <span id='{1}'></span> <span id='{2}'></span> <span id='{3}'></span> <span id='{4}'></span>")
    SafeHtml html2(String arg0, String arg1, String arg2, String arg3, String arg4);
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.cesaco.myprinterp.client.local.KitchenSinkClient owner) {

    com.cesaco.myprinterp.client.local.KitchenSinkClient_KitchenSinkClientUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.cesaco.myprinterp.client.local.KitchenSinkClient_KitchenSinkClientUiBinderImpl_GenBundle) GWT.create(com.cesaco.myprinterp.client.local.KitchenSinkClient_KitchenSinkClientUiBinderImpl_GenBundle.class);
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label generalErrorLabel = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox nameBox = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.Label nameValidationErr = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox emailBox = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.Label emailValidationErr = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Label f_Label5 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox phoneBox = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.Label phoneValidationErr = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Grid f_Grid2 = (com.google.gwt.user.client.ui.Grid) GWT.create(com.google.gwt.user.client.ui.Grid.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button registerButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.Label registerConfirmMessage = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel6 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.cellview.client.CellTable membersTable = (com.google.gwt.user.cellview.client.CellTable) GWT.create(com.google.gwt.user.cellview.client.CellTable.class);
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label tableEmptyMessage = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template.html2(domId0, domId1, domId2, domId3, domId4).asString());

    f_Label3.setText("Name:");
    nameValidationErr.setStyleName("errorMessage");
    nameValidationErr.setWordWrap(false);
    f_Label4.setText("Email:");
    emailValidationErr.setStyleName("errorMessage");
    emailValidationErr.setWordWrap(false);
    f_Label5.setText("Phone:");
    phoneValidationErr.setStyleName("errorMessage");
    phoneValidationErr.setWordWrap(false);
    f_Grid2.resize(3, 3);
    f_Grid2.setWidget(0, 0, f_Label3);
    f_Grid2.setWidget(0, 1, nameBox);
    f_Grid2.setWidget(0, 2, nameValidationErr);
    f_Grid2.setWidget(1, 0, f_Label4);
    f_Grid2.setWidget(1, 1, emailBox);
    f_Grid2.setWidget(1, 2, emailValidationErr);
    f_Grid2.setWidget(2, 0, f_Label5);
    f_Grid2.setWidget(2, 1, phoneBox);
    f_Grid2.setWidget(2, 2, phoneValidationErr);
    registerButton.setHTML(template.html1().asString());
    f_HorizontalPanel6.add(registerButton);
    registerConfirmMessage.setStyleName("errorMessage");
    f_HorizontalPanel6.add(registerConfirmMessage);
    membersTable.setPageSize(10);
    tableEmptyMessage.setStyleName("tableStatus");
    tableEmptyMessage.setText("Table status message");
    f_HTMLPanel1.setStyleName("bodyContent");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(generalErrorLabel, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(f_Grid2, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(f_HorizontalPanel6, domId2Element);
    f_HTMLPanel1.addAndReplaceElement(membersTable, domId3Element);
    f_HTMLPanel1.addAndReplaceElement(tableEmptyMessage, domId4Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onRegisterButtonClick(event);
      }
    };
    registerButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    owner.emailBox = emailBox;
    owner.emailValidationErr = emailValidationErr;
    owner.generalErrorLabel = generalErrorLabel;
    owner.nameBox = nameBox;
    owner.nameValidationErr = nameValidationErr;
    owner.phoneBox = phoneBox;
    owner.phoneValidationErr = phoneValidationErr;
    owner.registerButton = registerButton;
    owner.registerConfirmMessage = registerConfirmMessage;
    owner.tableEmptyMessage = tableEmptyMessage;

    return f_HTMLPanel1;
  }
}
