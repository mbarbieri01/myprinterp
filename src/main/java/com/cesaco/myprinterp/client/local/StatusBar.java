package com.cesaco.myprinterp.client.local;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.GXT;
import com.sencha.gxt.core.client.resources.ThemeStyles;
import com.sencha.gxt.core.client.util.DelayedTask;
import com.sencha.gxt.core.client.util.Margins;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.Status;
import com.sencha.gxt.widget.core.client.Status.BoxStatusAppearance;
import com.sencha.gxt.widget.core.client.Status.StatusAppearance;
import com.sencha.gxt.widget.core.client.container.CenterLayoutContainer;
import com.sencha.gxt.widget.core.client.container.SimpleContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.form.TextArea;
import com.sencha.gxt.widget.core.client.toolbar.FillToolItem;
import com.sencha.gxt.widget.core.client.toolbar.LabelToolItem;
import com.sencha.gxt.widget.core.client.toolbar.ToolBar;

public class StatusBar implements IsWidget {

	private MyPrinterpApp controller;

	public MyPrinterpApp getController() {
		return controller;
	}

	public void setController(MyPrinterpApp controller) {
		this.controller = controller;
	}

	private DelayedTask task = new DelayedTask() {
		@Override
		public void onExecute() {
			status.clearStatus("Not writing");
		}
	};

	private Status charCount;
	private Status wordCount;
	private Status status;

	public Widget asWidget() {
		ToolBar toolBar = new ToolBar();
		toolBar.addStyleName(ThemeStyles.getStyle().borderTop());

		status = new Status();
		status.setText("Autenticato");
		status.setWidth(150);
		toolBar.add(status);
		toolBar.add(new FillToolItem());
		toolBar.setHeight(50);
		toolBar.setPixelSize(100, 50);

		charCount = new Status(
				GWT.<StatusAppearance> create(BoxStatusAppearance.class));
		charCount.setWidth(100);
		charCount.setText("0 Chars");
		toolBar.add(charCount);

		toolBar.add(new LabelToolItem(" "));

		wordCount = new Status(
				GWT.<StatusAppearance> create(BoxStatusAppearance.class));
		wordCount.setWidth(100);
		wordCount.setText("0 Words");
		toolBar.add(wordCount);

		ContentPanel panel = new ContentPanel();
		panel.setBorders(false);

		panel.setHeaderVisible(false);

		CenterLayoutContainer form = new CenterLayoutContainer();
		panel.add(form);

		TextArea textArea = new TextArea();
		textArea.addKeyPressHandler(new KeyPressHandler() {

			@Override
			public void onKeyPress(KeyPressEvent event) {
				status.setBusy("writing...");
				TextArea t = (TextArea) event.getSource();
				String value = t.getCurrentValue();
				int length = value != null ? value.length() : 0;
				charCount.setText(length + (length == 1 ? " Char" : " Chars"));

				if (value != null) {
					int wc = getWordCount(value);
					wordCount.setText(wc + (wc == 1 ? " Tabelle" : " Record"));
				}

				task.delay(1000);
			}

		});

		VerticalLayoutData data = new VerticalLayoutData(1, 1);
		data.setMargins(new Margins(5));
		textArea.setLayoutData(data);

		Widget w = textArea;
		// TODO investigate IE bug where text area is floating out of view
		if (GXT.isIE6()) {
			SimpleContainer s = new SimpleContainer();
			s.setWidget(textArea);
			w = s;
		}

		toolBar.setLayoutData(new VerticalLayoutData(1, -1));
		form.add(toolBar);

		return toolBar;
	}

	public native int getWordCount(String v) /*-{
		if (v) {
			var wc = v.match(/\b/g);
			return wc ? wc.length / 2 : 0;
		}
		return 0;
	}-*/;

	public void onModuleLoad() {
		RootPanel.get().add(asWidget());
	}

}