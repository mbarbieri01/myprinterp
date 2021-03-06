package com.cesaco.myprinterp.client.grids;

import java.util.ArrayList;
import java.util.List;

import org.jboss.errai.bus.client.api.ErrorCallback;
import org.jboss.errai.bus.client.api.Message;
import org.jboss.errai.bus.client.api.RemoteCallback;
import org.jboss.errai.ioc.client.api.Caller;

import com.cesaco.myprinterp.client.data.model.GruppoProperties;
import com.cesaco.myprinterp.client.forms.GruppoFormClient;
import com.cesaco.myprinterp.client.shared.Gruppo;
import com.cesaco.myprinterp.client.shared.GruppoService;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.core.client.IdentityValueProvider;
import com.sencha.gxt.data.client.loader.RpcProxy;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.loader.LoadResultListStoreBinding;
import com.sencha.gxt.data.shared.loader.PagingLoadConfig;
import com.sencha.gxt.data.shared.loader.PagingLoadResult;
import com.sencha.gxt.data.shared.loader.PagingLoader;
import com.sencha.gxt.widget.core.client.FramedPanel;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer;
import com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData;
import com.sencha.gxt.widget.core.client.event.RefreshEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.grid.CheckBoxSelectionModel;
import com.sencha.gxt.widget.core.client.grid.ColumnConfig;
import com.sencha.gxt.widget.core.client.grid.ColumnModel;
import com.sencha.gxt.widget.core.client.grid.Grid;
import com.sencha.gxt.widget.core.client.selection.SelectionChangedEvent;
import com.sencha.gxt.widget.core.client.selection.SelectionChangedEvent.SelectionChangedHandler;
import com.sencha.gxt.widget.core.client.toolbar.PagingToolBar;

public class GruppoGrid implements IsWidget {

	private Caller<GruppoService> gruppoService;
	private GruppoFormClient gruppoForm;

	private Grid<Gruppo> grid;

	public void onModuleLoad() {
		RootPanel.get().add(this);
	}

	public GruppoGrid(Caller<GruppoService> gruppoService,
			GruppoFormClient gruppoForm) {
		this.gruppoService = gruppoService;
		this.gruppoForm = gruppoForm;
	}

	interface GruppoDriver extends
			SimpleBeanEditorDriver<Gruppo, GruppoFormClient> {
	}

	private final GruppoDriver itemDriver = GWT.create(GruppoDriver.class);

	@Override
	public Widget asWidget() {

		RpcProxy<PagingLoadConfig, PagingLoadResult<Gruppo>> proxy = new RpcProxy<PagingLoadConfig, PagingLoadResult<Gruppo>>() {
			@Override
			public void load(PagingLoadConfig loadConfig,
					AsyncCallback<PagingLoadResult<Gruppo>> callback) {
				getAllGruppo(loadConfig, callback);
				// getPosts(loadConfig, callback);

			}
		};

		GruppoProperties props = GWT.create(GruppoProperties.class);

		ListStore<Gruppo> store = new ListStore<Gruppo>(props.abbr());

		final PagingLoader<PagingLoadConfig, PagingLoadResult<Gruppo>> loader = new PagingLoader<PagingLoadConfig, PagingLoadResult<Gruppo>>(
				proxy);
		loader.setRemoteSort(true);
		loader.addLoadHandler(new LoadResultListStoreBinding<PagingLoadConfig, Gruppo, PagingLoadResult<Gruppo>>(
				store));

		final PagingToolBar toolBar = new PagingToolBar(50);
		toolBar.getElement().getStyle().setProperty("borderBottom", "none");
		toolBar.bind(loader);

		itemDriver.initialize(gruppoForm);

		IdentityValueProvider<Gruppo> identity = new IdentityValueProvider<Gruppo>();
		final CheckBoxSelectionModel<Gruppo> sm = new CheckBoxSelectionModel<Gruppo>(
				identity) {
			@Override
			protected void onRefresh(RefreshEvent event) {
				if (isSelectAllChecked()) {
					selectAll();
				}
				super.onRefresh(event);
			}
		};

		ColumnConfig<Gruppo, String> cod_gruppoColumn = new ColumnConfig<Gruppo, String>(
				props.cod_gruppo(), 150, "cod_gruppo");
		ColumnConfig<Gruppo, String> des_gruppoColumn = new ColumnConfig<Gruppo, String>(
				props.des_gruppo(), 150, "des_gruppo");

		List<ColumnConfig<Gruppo, ?>> l = new ArrayList<ColumnConfig<Gruppo, ?>>();
		l.add(sm.getColumn());
		l.add(cod_gruppoColumn);
		l.add(des_gruppoColumn);

		ColumnModel<Gruppo> cm = new ColumnModel<Gruppo>(l);

		grid = new Grid<Gruppo>(store, cm) {
			@Override
			protected void onAfterFirstAttach() {
				super.onAfterFirstAttach();
				Scheduler.get().scheduleDeferred(new ScheduledCommand() {
					@Override
					public void execute() {
						loader.load();
					}
				});
			}
		};
		grid.setSelectionModel(sm);
		grid.getView().setForceFit(true);
		grid.setLoadMask(true);
		grid.setLoader(loader);
		grid.setHeight("100%");
		grid.getSelectionModel().addSelectionChangedHandler(
				new SelectionChangedHandler<Gruppo>() {
					@Override
					public void onSelectionChanged(
							SelectionChangedEvent<Gruppo> event) {
						if (event.getSelection().size() > 0) {
							GWT.log("Selezionato: "
									+ event.getSelection().get(0)
											.getCod_gruppo());
							edit(event.getSelection().get(0));
						} else {
							gruppoForm.setSaveEnabled(false);
						}
					}
				});

		gruppoForm.getSaveButton().addSelectHandler(new SelectHandler() {

			@Override
			public void onSelect(SelectEvent event) {
				saveCurrentStock();

			}
		});

		FramedPanel cp = new FramedPanel();
		cp.setCollapsible(false);
		cp.setHeaderVisible(false);
		cp.setHeight("250px");
		cp.addStyleName("margin-10");

		VerticalLayoutContainer con = new VerticalLayoutContainer();
		con.setBorders(true);
		con.add(grid, new VerticalLayoutData(1, 1));
		con.add(toolBar, new VerticalLayoutData(1, -1));
		cp.setBorders(false);
		cp.setWidget(con);

		return cp;
	}

	protected void edit(Gruppo gruppo) {
		itemDriver.edit(gruppo);
		gruppoForm.setSaveEnabled(true);
	}

	protected void saveCurrentStock() {
		Gruppo edited = itemDriver.flush();
		if (!itemDriver.hasErrors()) {

			gruppoForm.setSaveEnabled(false);
			GWT.log("from GruppoGrid, hashcode: " + gruppoForm.hashCode());
			gruppoForm.update(edited);
			grid.getStore().update(edited);
		}
	}

	private class PagingLoadResultImpl<T> implements PagingLoadResult<T> {

		/**
	 * 
	 */
		private static final long serialVersionUID = 1L;
		private List<T> data;

		@Override
		public List<T> getData() {
			// TODO Auto-generated method stub
			return data;
		}

		public void setData(List<T> data) {
			this.data = data;
		}

		@Override
		public int getOffset() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getTotalLength() {
			// TODO Auto-generated method stub
			return data.size();
		}

		@Override
		public void setOffset(int offset) {
			// TODO Auto-generated method stub

		}

		@Override
		public void setTotalLength(int totalLength) {
			// TODO Auto-generated method stub

		}

	}

	private void getAllGruppo(PagingLoadConfig loadConfig,
			final AsyncCallback<PagingLoadResult<Gruppo>> callback) {
		gruppoService.call(new RemoteCallback<List<Gruppo>>() {
			@Override
			public void callback(List<Gruppo> response) {
				GWT.log("GruppoGrid: " + response.size());

				PagingLoadResultImpl<Gruppo> plri = new PagingLoadResultImpl<Gruppo>();
				plri.setData(response);
				callback.onSuccess(plri);

			}
		}, new ErrorCallback() {
			@Override
			public boolean error(Message message, Throwable throwable) {
				throwable.printStackTrace();
				return false;
			}
		}).retrieveAllGruppoOrderedByName();
		GWT.log("exiting getAllGruppo");

	}

}
