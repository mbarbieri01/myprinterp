package com.cesaco.myprinterp.client.grids;

import java.util.ArrayList;
import java.util.List;

import org.jboss.errai.bus.client.api.ErrorCallback;
import org.jboss.errai.bus.client.api.Message;
import org.jboss.errai.bus.client.api.RemoteCallback;
import org.jboss.errai.ioc.client.api.Caller;

import com.cesaco.myprinterp.client.data.model.GruppoProperties;
import com.cesaco.myprinterp.client.local.images.ExampleImages;
import com.cesaco.myprinterp.client.shared.Gruppo;
import com.cesaco.myprinterp.client.shared.GruppoService;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.cell.core.client.form.ComboBoxCell.TriggerAction;
import com.sencha.gxt.core.client.GXT;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.StringLabelProvider;
import com.sencha.gxt.state.client.CookieProvider;
import com.sencha.gxt.state.client.GridStateHandler;
import com.sencha.gxt.state.client.StateManager;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.Resizable;
import com.sencha.gxt.widget.core.client.Resizable.Dir;
import com.sencha.gxt.widget.core.client.button.ToolButton;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.form.SimpleComboBox;
import com.sencha.gxt.widget.core.client.grid.CellSelectionModel;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;
import com.sencha.gxt.widget.core.client.grid.GridSelectionModel;
import com.sencha.gxt.widget.core.client.info.Info;
import com.sencha.gxt.widget.core.client.selection.CellSelectionChangedEvent;
import com.sencha.gxt.widget.core.client.selection.CellSelectionChangedEvent.CellSelectionChangedHandler;
import com.sencha.gxt.widget.core.client.tips.QuickTip;
import com.sencha.gxt.widget.core.client.tips.ToolTipConfig;
import com.sencha.gxt.widget.core.client.toolbar.LabelToolItem;
import com.sencha.gxt.widget.core.client.toolbar.ToolBar;

public class CopyOfGruppoGrid implements IsWidget {

	private Caller<GruppoService> gruppoService;

	public CopyOfGruppoGrid(Caller<GruppoService> gruppoService) {
		this.gruppoService = gruppoService;
	}

	private ContentPanel root;

	private ListStore<Gruppo> store;
	
	private Grid<Gruppo> grid;
	

	@Override
	public Widget asWidget() {
		if (root == null) {

			
			final NumberFormat number = NumberFormat.getFormat("0.00");

			GruppoProperties props = GWT.create(GruppoProperties.class);

			ColumnConfig<Gruppo, String> cod_gruppoCol = new ColumnConfig<Gruppo, String>(
					props.cod_gruppo(), 50, "cod_gruppo");
			ColumnConfig<Gruppo, String> des_gruppoCol = new ColumnConfig<Gruppo, String>(
					props.des_gruppo(), 100, "des_gruppo");

			// changeCol.setCell(new AbstractCell<Double>() {
			//
			// @Override
			// public void render(Context context, Double value, SafeHtmlBuilder
			// sb) {
			// String style = "style='color: " + (value < 0 ? "red" : "green") +
			// "'";
			// String v = number.format(value);
			// sb.appendHtmlConstant("<span " + style +
			// " qtitle='Change' qtip='" + v + "'>" + v + "</span>");
			// }
			// });

			// ColumnConfig<Gruppo, Date> lastTransCol = new
			// ColumnConfig<Gruppo, Date>(props.lastTrans(), 100,
			// "Last Updated");
			// lastTransCol.setCell(new
			// DateCell(DateTimeFormat.getFormat("MM/dd/yyyy")));

			List<ColumnConfig<Gruppo, ?>> l = new ArrayList<ColumnConfig<Gruppo, ?>>();
			l.add(cod_gruppoCol);
			l.add(des_gruppoCol);

			ColumnModel<Gruppo> cm = new ColumnModel<Gruppo>(l);

			store = new ListStore<Gruppo>(props.abbr());

			GWT.log("pre getAllGruppo. store.size = " + store.size());
			
			getAllGruppo();

		
			GWT.log("post getAllGruppo. store.size = " + store.size());
			root = new ContentPanel();
			root.setHeadingText("Basic Grid");
			// root.getHeader().setIcon(ExampleImages.INSTANCE.table());
			// root.setPixelSize(600, 300);
			// root.addStyleName("margin-10");

			ToolButton info = new ToolButton(ToolButton.QUESTION);
			ToolTipConfig config = new ToolTipConfig("Example Info",
					"This examples includes resizable panel, reorderable columns and grid state.");
			config.setMaxWidth(225);
			info.setToolTipConfig(config);
			// root.addTool(info);

			new Resizable(root, Dir.E, Dir.SE, Dir.S);

			grid = new Grid<Gruppo>(store, cm);
			grid.getView().setAutoExpandColumn(cod_gruppoCol);
			grid.getView().setStripeRows(true);
			grid.getView().setColumnLines(true);
			grid.setBorders(false);

			grid.setColumnReordering(true);
			grid.setStateful(true);
			grid.setStateId("gridExample");

			GridStateHandler<Gruppo> state = new GridStateHandler<Gruppo>(grid);
			// state.loadState();

			ToolBar toolBar = new ToolBar();
			toolBar.add(new LabelToolItem("Selection Mode: "));

			SimpleComboBox<String> type = new SimpleComboBox<String>(
					new StringLabelProvider<String>());
			type.setTriggerAction(TriggerAction.ALL);
			type.setEditable(false);
			type.setWidth(100);
			type.add("Row");
			type.add("Cell");
			type.setValue("Row");
			// we want to change selection model on select, not value change
			// which fires on blur
			type.addSelectionHandler(new SelectionHandler<String>() {

				@Override
				public void onSelection(SelectionEvent<String> event) {
					boolean cell = event.getSelectedItem().equals("Cell");
					if (cell) {
						CellSelectionModel<Gruppo> c = new CellSelectionModel<Gruppo>();
						c.addCellSelectionChangedHandler(new CellSelectionChangedHandler<Gruppo>() {

							@Override
							public void onCellSelectionChanged(
									CellSelectionChangedEvent<Gruppo> event) {

							}
						});

						grid.setSelectionModel(c);
					} else {
						grid.setSelectionModel(new GridSelectionModel<Gruppo>());
					}
				}
			});
			type.addValueChangeHandler(new ValueChangeHandler<String>() {

				@Override
				public void onValueChange(ValueChangeEvent<String> event) {

				}
			});
			toolBar.add(type);

			VerticalLayoutContainer con = new VerticalLayoutContainer();
			root.setWidget(con);

			// con.add(toolBar, new VerticalLayoutData(1, -1));
			con.add(grid, new VerticalLayoutData(1, 1));

			// needed to enable quicktips (qtitle for the heading and qtip for
			// the
			// content) that are setup in the change GridCellRenderer
			new QuickTip(grid);
		}

		return root;
	}

	private void getAllGruppo() {
		gruppoService.call(new RemoteCallback<List<Gruppo>>() {
			@Override
			public void callback(List<Gruppo> response) {
				GWT.log("Got gruppo Grid list. Size: " + response.size());
				store.addAll(response);
				grid.getView().refresh(true);
				// ac.setTempGruppoList(response);
				Info.display("INFO", "in GruppoGrid(). response.size = "
						+ response.size());
				Info.display("INFO",
						"in GruppoGrid(). store.size = " + store.size());
			}
		}, new ErrorCallback() {
			@Override
			public boolean error(Message message, Throwable throwable) {
				throwable.printStackTrace();
				return false;
			}
		}).retrieveAllGruppoOrderedByName();
		GWT.log("exiting");
		Info.display("INFO", "CHiamato gruppoService.retrieve");
	}

	public void onModuleLoad() {
		StateManager.get().setProvider(
				new CookieProvider("/", null, null, GXT.isSecure()));
		RootPanel.get().add(asWidget());
	}
}
