package com.cesaco.myprinterp.client.local;

import com.cesaco.myprinterp.client.data.TestData;
import com.cesaco.myprinterp.client.data.model.NameImageModel;
import com.cesaco.myprinterp.client.local.images.Resources;
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
	private MyPrinterpApp controller;

	public Widget asWidget() {
		if (panel == null) {
			panel = new ContentPanel();
			panel.setBorders(false);
			panel.setHeadingText("Menu Secondario");
			panel.setBodyBorder(false);
			panel.setPixelSize(200, 325);
			panel.addStyleName("margin-10");

			AccordionLayoutContainer con = new AccordionLayoutContainer();
			con.setExpandMode(ExpandMode.SINGLE_FILL);
			panel.add(con);

			AccordionLayoutAppearance appearance = GWT
					.<AccordionLayoutAppearance> create(AccordionLayoutAppearance.class);

			ContentPanel cp = new ContentPanel(appearance);
			cp.setAnimCollapse(false);
			cp.setHeadingText("Utenti online");
			con.add(cp);
			con.setActiveWidget(cp);

			TreeStore<NameImageModel> store = new TreeStore<NameImageModel>(
					NameImageModel.KP);

			Tree<NameImageModel, String> tree = new Tree<NameImageModel, String>(
					store, new ValueProvider<NameImageModel, String>() {

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
						return Resources.INSTANCE.userFemale();
					} else if ("utente-medio" == model.getImage()) {
						return Resources.INSTANCE.userKid();
					} else {
						return Resources.INSTANCE.user();
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

	public void setController(MyPrinterpApp controller) {
		this.controller = controller;

	}

}
