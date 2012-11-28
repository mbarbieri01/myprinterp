package org.jboss.errai.ioc.client;

import com.cesaco.myprinterp.client.local.MyPrinterpApp;
import com.cesaco.myprinterp.client.shared.GruppoService;
import com.cesaco.myprinterp.client.shared.MacchinaService;
import com.cesaco.myprinterp.client.shared.MemberService;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import java.lang.annotation.Annotation;
import javax.inject.Provider;
import org.jboss.errai.common.client.api.extension.InitVotes;
import org.jboss.errai.enterprise.client.cdi.CDIEventTypeLookup;
import org.jboss.errai.enterprise.client.cdi.EventProvider;
import org.jboss.errai.enterprise.client.cdi.InstanceProvider;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.api.Caller;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.api.builtin.CallerProvider;
import org.jboss.errai.ioc.client.api.builtin.DisposerProvider;
import org.jboss.errai.ioc.client.api.builtin.IOCBeanManagerProvider;
import org.jboss.errai.ioc.client.api.builtin.InitBallotProvider;
import org.jboss.errai.ioc.client.api.builtin.MessageBusProvider;
import org.jboss.errai.ioc.client.api.builtin.RequestDispatcherProvider;
import org.jboss.errai.ioc.client.api.builtin.RootPanelProvider;
import org.jboss.errai.ioc.client.api.builtin.SenderProvider;
import org.jboss.errai.ioc.client.api.qualifiers.Any;
import org.jboss.errai.ioc.client.api.qualifiers.BuiltInQualifiers;
import org.jboss.errai.ioc.client.container.BeanRef;
import org.jboss.errai.ioc.client.container.CreationalCallback;
import org.jboss.errai.ioc.client.container.CreationalContext;
import org.jboss.errai.ioc.client.container.IOCBeanManager;

public class BootstrapperImpl implements Bootstrapper {
  private native static void org_jboss_errai_ioc_client_api_builtin_DisposerProvider_beanManager(DisposerProvider instance, IOCBeanManager value) /*-{
    instance.@org.jboss.errai.ioc.client.api.builtin.DisposerProvider::beanManager = value;
  }-*/;

  private native static void com_cesaco_myprinterp_client_local_MyPrinterpApp_memberService(MyPrinterpApp instance, Caller value) /*-{
    instance.@com.cesaco.myprinterp.client.local.MyPrinterpApp::memberService = value;
  }-*/;

  private native static void com_cesaco_myprinterp_client_local_MyPrinterpApp_gruppoService(MyPrinterpApp instance, Caller value) /*-{
    instance.@com.cesaco.myprinterp.client.local.MyPrinterpApp::gruppoService = value;
  }-*/;

  private native static void com_cesaco_myprinterp_client_local_MyPrinterpApp_macchinaService(MyPrinterpApp instance, Caller value) /*-{
    instance.@com.cesaco.myprinterp.client.local.MyPrinterpApp::macchinaService = value;
  }-*/;

  // The main IOC bootstrap method.
  public BootstrapperInjectionContext bootstrapContainer() {
    new CDI().__resetSubsystem();
    new CDI().initLookupTable(CDIEventTypeLookup.get());
    final BootstrapperInjectionContext injContext = new BootstrapperInjectionContext();
    CreationalContext context = injContext.getRootContext();
    final CreationalCallback<CallerProvider> inj2214_CallerProvider_creationalCallback = new CreationalCallback<CallerProvider>() {
      public CallerProvider getInstance(final CreationalContext context) {
        Class beanType = CallerProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final CallerProvider inj2213_CallerProvider = new CallerProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2213_CallerProvider);
        return inj2213_CallerProvider;
      }
    };
    final CallerProvider inj2213_CallerProvider = inj2214_CallerProvider_creationalCallback.getInstance(context);
    final CreationalCallback<RequestDispatcherProvider> inj2215_RequestDispatcherProvider_creationalCallback = new CreationalCallback<RequestDispatcherProvider>() {
      public RequestDispatcherProvider getInstance(final CreationalContext context) {
        Class beanType = RequestDispatcherProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final RequestDispatcherProvider inj2209_RequestDispatcherProvider = new RequestDispatcherProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2209_RequestDispatcherProvider);
        return inj2209_RequestDispatcherProvider;
      }
    };
    final RequestDispatcherProvider inj2209_RequestDispatcherProvider = inj2215_RequestDispatcherProvider_creationalCallback.getInstance(context);
    final CreationalCallback<SenderProvider> inj2216_SenderProvider_creationalCallback = new CreationalCallback<SenderProvider>() {
      public SenderProvider getInstance(final CreationalContext context) {
        Class beanType = SenderProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final SenderProvider inj2201_SenderProvider = new SenderProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2201_SenderProvider);
        return inj2201_SenderProvider;
      }
    };
    final SenderProvider inj2201_SenderProvider = inj2216_SenderProvider_creationalCallback.getInstance(context);
    final CreationalCallback<RootPanelProvider> inj2217_RootPanelProvider_creationalCallback = new CreationalCallback<RootPanelProvider>() {
      public RootPanelProvider getInstance(final CreationalContext context) {
        Class beanType = RootPanelProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final RootPanelProvider inj2195_RootPanelProvider = new RootPanelProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2195_RootPanelProvider);
        return inj2195_RootPanelProvider;
      }
    };
    final RootPanelProvider inj2195_RootPanelProvider = inj2217_RootPanelProvider_creationalCallback.getInstance(context);
    final CreationalCallback<MessageBusProvider> inj2218_MessageBusProvider_creationalCallback = new CreationalCallback<MessageBusProvider>() {
      public MessageBusProvider getInstance(final CreationalContext context) {
        Class beanType = MessageBusProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final MessageBusProvider inj2211_MessageBusProvider = new MessageBusProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2211_MessageBusProvider);
        return inj2211_MessageBusProvider;
      }
    };
    final MessageBusProvider inj2211_MessageBusProvider = inj2218_MessageBusProvider_creationalCallback.getInstance(context);
    final CreationalCallback<IOCBeanManagerProvider> inj2219_IOCBeanManagerProvider_creationalCallback = new CreationalCallback<IOCBeanManagerProvider>() {
      public IOCBeanManagerProvider getInstance(final CreationalContext context) {
        Class beanType = IOCBeanManagerProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final IOCBeanManagerProvider inj2203_IOCBeanManagerProvider = new IOCBeanManagerProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2203_IOCBeanManagerProvider);
        return inj2203_IOCBeanManagerProvider;
      }
    };
    final IOCBeanManagerProvider inj2203_IOCBeanManagerProvider = inj2219_IOCBeanManagerProvider_creationalCallback.getInstance(context);
    final CreationalCallback<MyPrinterpApp> inj2220_MyPrinterpApp_creationalCallback = new CreationalCallback<MyPrinterpApp>() {
      public MyPrinterpApp getInstance(final CreationalContext context) {
        Class beanType = MyPrinterpApp.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final MyPrinterpApp inj199_MyPrinterpApp = new MyPrinterpApp();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj199_MyPrinterpApp);
        com_cesaco_myprinterp_client_local_MyPrinterpApp_memberService(inj199_MyPrinterpApp, inj2213_CallerProvider.provide(new Class[] { MemberService.class }, null));
        com_cesaco_myprinterp_client_local_MyPrinterpApp_gruppoService(inj199_MyPrinterpApp, inj2213_CallerProvider.provide(new Class[] { GruppoService.class }, null));
        com_cesaco_myprinterp_client_local_MyPrinterpApp_macchinaService(inj199_MyPrinterpApp, inj2213_CallerProvider.provide(new Class[] { MacchinaService.class }, null));
        InitVotes.registerOneTimeInitCallback(new Runnable() {
          public void run() {
            GWT.runAsync(new RunAsyncCallback() {
              public void onFailure(Throwable throwable) {
                throw new RuntimeException("failed to run asynchronously", throwable);
              }
              public void onSuccess() {
                inj199_MyPrinterpApp.createUI();
              }
            });
          }
        });
        return inj199_MyPrinterpApp;
      }
    };
    final MyPrinterpApp inj199_MyPrinterpApp = inj2220_MyPrinterpApp_creationalCallback.getInstance(context);
    final CreationalCallback<InstanceProvider> inj2221_InstanceProvider_creationalCallback = new CreationalCallback<InstanceProvider>() {
      public InstanceProvider getInstance(final CreationalContext context) {
        Class beanType = InstanceProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final InstanceProvider inj2205_InstanceProvider = new InstanceProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2205_InstanceProvider);
        return inj2205_InstanceProvider;
      }
    };
    final InstanceProvider inj2205_InstanceProvider = inj2221_InstanceProvider_creationalCallback.getInstance(context);
    final CreationalCallback<EventProvider> inj2222_EventProvider_creationalCallback = new CreationalCallback<EventProvider>() {
      public EventProvider getInstance(final CreationalContext context) {
        Class beanType = EventProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final EventProvider inj2197_EventProvider = new EventProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2197_EventProvider);
        return inj2197_EventProvider;
      }
    };
    final EventProvider inj2197_EventProvider = inj2222_EventProvider_creationalCallback.getInstance(context);
    final CreationalCallback<DisposerProvider> inj2223_DisposerProvider_creationalCallback = new CreationalCallback<DisposerProvider>() {
      public DisposerProvider getInstance(final CreationalContext context) {
        Class beanType = DisposerProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final DisposerProvider inj2207_DisposerProvider = new DisposerProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2207_DisposerProvider);
        org_jboss_errai_ioc_client_api_builtin_DisposerProvider_beanManager(inj2207_DisposerProvider, inj2203_IOCBeanManagerProvider.get());
        return inj2207_DisposerProvider;
      }
    };
    final DisposerProvider inj2207_DisposerProvider = inj2223_DisposerProvider_creationalCallback.getInstance(context);
    final CreationalCallback<InitBallotProvider> inj2224_InitBallotProvider_creationalCallback = new CreationalCallback<InitBallotProvider>() {
      public InitBallotProvider getInstance(final CreationalContext context) {
        Class beanType = InitBallotProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final InitBallotProvider inj2199_InitBallotProvider = new InitBallotProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2199_InitBallotProvider);
        return inj2199_InitBallotProvider;
      }
    };
    final InitBallotProvider inj2199_InitBallotProvider = inj2224_InitBallotProvider_creationalCallback.getInstance(context);
    injContext.addBean(CallerProvider.class, inj2214_CallerProvider_creationalCallback, inj2213_CallerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj2214_CallerProvider_creationalCallback, inj2213_CallerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(RequestDispatcherProvider.class, inj2215_RequestDispatcherProvider_creationalCallback, inj2209_RequestDispatcherProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(Provider.class, inj2215_RequestDispatcherProvider_creationalCallback, inj2209_RequestDispatcherProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(SenderProvider.class, inj2216_SenderProvider_creationalCallback, inj2201_SenderProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj2216_SenderProvider_creationalCallback, inj2201_SenderProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(RootPanelProvider.class, inj2217_RootPanelProvider_creationalCallback, inj2195_RootPanelProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(Provider.class, inj2217_RootPanelProvider_creationalCallback, inj2195_RootPanelProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(MessageBusProvider.class, inj2218_MessageBusProvider_creationalCallback, inj2211_MessageBusProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(Provider.class, inj2218_MessageBusProvider_creationalCallback, inj2211_MessageBusProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(IOCBeanManagerProvider.class, inj2219_IOCBeanManagerProvider_creationalCallback, inj2203_IOCBeanManagerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(Provider.class, inj2219_IOCBeanManagerProvider_creationalCallback, inj2203_IOCBeanManagerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(MyPrinterpApp.class, inj2220_MyPrinterpApp_creationalCallback, inj199_MyPrinterpApp, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(InstanceProvider.class, inj2221_InstanceProvider_creationalCallback, inj2205_InstanceProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj2221_InstanceProvider_creationalCallback, inj2205_InstanceProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(EventProvider.class, inj2222_EventProvider_creationalCallback, inj2197_EventProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj2222_EventProvider_creationalCallback, inj2197_EventProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(DisposerProvider.class, inj2223_DisposerProvider_creationalCallback, inj2207_DisposerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj2223_DisposerProvider_creationalCallback, inj2207_DisposerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(InitBallotProvider.class, inj2224_InitBallotProvider_creationalCallback, inj2199_InitBallotProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj2224_InitBallotProvider_creationalCallback, inj2199_InitBallotProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    return injContext;
  }
}