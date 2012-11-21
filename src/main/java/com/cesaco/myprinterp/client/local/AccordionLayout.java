package com.cesaco.myprinterp.client.local;

import com.cesaco.myprinterp.client.local.data.TestData;
import com.cesaco.myprinterp.client.local.data.model.NameImageModel;
import com.cesaco.myprinterp.client.local.images.ExampleImages;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.IconProvider;
import com.sencha.gxt.data.shared.TreeStore;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.container.AccordionLayoutContainer;
import com.sencha.gxt.widget.core.client.container.AccordionLayoutContainer.AccordionLayoutAppearance;
import com.sencha.gxt.widget.core.client.container.AccordionLayoutContainer.ExpandMode;
import com.sencha.gxt.widget.core.client.tree.Tree;
 
public class AccordionLayout implements IsWidget, EntryPoint {
 
  private ContentPanel panel;
private KitchenSinkApp controller;
 
  public Widget asWidget() {
    if (panel == null) {
      panel = new ContentPanel();
      panel.setHeadingText("Menu Secondario");
      panel.setBodyBorder(false);
      panel.setPixelSize(200, 325);
      panel.addStyleName("margin-10");
 
      AccordionLayoutContainer con = new AccordionLayoutContainer();
      con.setExpandMode(ExpandMode.SINGLE_FILL);
      panel.add(con);
 
      AccordionLayoutAppearance appearance = GWT.<AccordionLayoutAppearance> create(AccordionLayoutAppearance.class);
 
      ContentPanel cp = new ContentPanel(appearance);
      cp.setAnimCollapse(false);
      cp.setHeadingText("Utenti online");
      con.add(cp);
      con.setActiveWidget(cp);
 
      TreeStore<NameImageModel> store = new TreeStore<NameImageModel>(NameImageModel.KP);
 
      Tree<NameImageModel, String> tree = new Tree<NameImageModel, String>(store,
          new ValueProvider<NameImageModel, String>() {
 
            @Override
            public String getValue(NameImageModel object) {
              return object.getName();
            }
 
            @Override
            public void setValue(NameImageModel object, String value) {
            }
 
            @Override
            public String getPath() {
              return "name";
            }
          });
 
      tree.setIconProvider(new IconProvider<NameImageModel>() {
        public ImageResource getIcon(NameImageModel model) {
          if (null == model.getImage()) {
            return null;
          } else if ("utente-uno" == model.getImage()) {
            return ExampleImages.INSTANCE.userFemale();
          } else if ("utente-medio" == model.getImage()) {
            return ExampleImages.INSTANCE.userKid();
          } else {
            return ExampleImages.INSTANCE.user();
          }
        }
      });
 
      NameImageModel m = newItem("Stampanti", null);
      store.add(m);
 
      store.add(m, newItem("Canon IRC8800", "utente"));
      store.add(m, newItem("Canon 238379", "utente-uomo"));
      store.add(m, newItem("Epson KTCKS", "utente-medio"));
      store.add(m, newItem("HP 29jee", "utente-secondario"));
      store.add(m, newItem("HP dhj55", "utente-manager"));
 
      tree.setExpanded(m, true);
 
      m = newItem("Filler", null);
      store.add(m);
 
      store.add(m, newItem("TONER1", "utente"));
      store.add(m, newItem("TONER2", "utente-donna"));
      store.add(m, newItem("CartdrigeAH", "manager"));
      store.add(m, newItem("CartdrigeAP", "utente"));
 
      tree.setExpanded(m, true);
 
      cp.add(tree);
 
      cp = new ContentPanel(appearance);
      cp.setAnimCollapse(false);
      cp.setBodyStyleName("pad-text");
      cp.setHeadingText("Impostazioni");
      cp.add(new Label(TestData.DUMMY_TEXT_SHORT));
      con.add(cp);
 
      cp = new ContentPanel(appearance);
      cp.setAnimCollapse(false);
      cp.setBodyStyleName("pad-text");
      cp.setHeadingText("Strumenti");
      cp.add(new Label(TestData.DUMMY_TEXT_SHORT));
      con.add(cp);
 
      cp = new ContentPanel(appearance);
      cp.setAnimCollapse(false);
      cp.setBodyStyleName("pad-text");
      cp.setHeadingText("Altri strumenti");
      cp.add(new Label(TestData.DUMMY_TEXT_SHORT));
      con.add(cp);
 
    }
    return panel;
  }
 
  private NameImageModel newItem(String text, String iconStyle) {
    return new NameImageModel(text, iconStyle);
  }
 
  public void onModuleLoad() {
    RootPanel.get().add(asWidget());
  }

public void setController(KitchenSinkApp controller) {
	this.controller = controller;
	
}
 
}
