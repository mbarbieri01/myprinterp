package org.jboss.errai.ioc.client;

import com.cesaco.myprinterp.client.local.KitchenSinkApp;
import com.cesaco.myprinterp.client.shared.GruppoService;
import com.cesaco.myprinterp.client.shared.MacchinaService;
import com.cesaco.myprinterp.client.shared.Member;
import com.cesaco.myprinterp.client.shared.MemberService;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import java.lang.annotation.Annotation;
import java.util.Set;
import javax.inject.Provider;
import org.jboss.errai.bus.client.api.Message;
import org.jboss.errai.bus.client.framework.Subscription;
import org.jboss.errai.common.client.api.extension.InitVotes;
import org.jboss.errai.enterprise.client.cdi.AbstractCDIEventCallback;
import org.jboss.errai.enterprise.client.cdi.CDIEventTypeLookup;
import org.jboss.errai.enterprise.client.cdi.CDIProtocol;
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
import org.jboss.errai.ioc.client.container.DestructionCallback;
import org.jboss.errai.ioc.client.container.IOCBeanManager;

public class BootstrapperImpl implements Bootstrapper {
  private native static void org_jboss_errai_ioc_client_api_builtin_DisposerProvider_beanManager(DisposerProvider instance, IOCBeanManager value) /*-{
    instance.@org.jboss.errai.ioc.client.api.builtin.DisposerProvider::beanManager = value;
  }-*/;

  private native static void com_cesaco_myprinterp_client_local_KitchenSinkApp_gruppoService(KitchenSinkApp instance, Caller value) /*-{
    instance.@com.cesaco.myprinterp.client.local.KitchenSinkApp::gruppoService = value;
  }-*/;

  private native static void com_cesaco_myprinterp_client_local_KitchenSinkApp_macchinaService(KitchenSinkApp instance, Caller value) /*-{
    instance.@com.cesaco.myprinterp.client.local.KitchenSinkApp::macchinaService = value;
  }-*/;

  private native static void com_cesaco_myprinterp_client_local_KitchenSinkApp_memberService(KitchenSinkApp instance, Caller value) /*-{
    instance.@com.cesaco.myprinterp.client.local.KitchenSinkApp::memberService = value;
  }-*/;

  // The main IOC bootstrap method.
  public BootstrapperInjectionContext bootstrapContainer() {
    CDIEventTypeLookup.get().addLookup("com.cesaco.myprinterp.client.shared.Member", "java.io.Serializable");
    CDIEventTypeLookup.get().addLookup("com.cesaco.myprinterp.client.shared.Member", "java.lang.Comparable");
    CDIEventTypeLookup.get().addLookup("com.cesaco.myprinterp.client.shared.Member", "java.lang.Object");
    new CDI().__resetSubsystem();
    new CDI().initLookupTable(CDIEventTypeLookup.get());
    final BootstrapperInjectionContext injContext = new BootstrapperInjectionContext();
    CreationalContext context = injContext.getRootContext();
    final CreationalCallback<CallerProvider> inj42246_CallerProvider_creationalCallback = new CreationalCallback<CallerProvider>() {
      public CallerProvider getInstance(final CreationalContext context) {
        Class beanType = CallerProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final CallerProvider inj42231_CallerProvider = new CallerProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj42231_CallerProvider);
        return inj42231_CallerProvider;
      }
    };
    final CallerProvider inj42231_CallerProvider = inj42246_CallerProvider_creationalCallback.getInstance(context);
    final CreationalCallback<RequestDispatcherProvider> inj42247_RequestDispatcherProvider_creationalCallback = new CreationalCallback<RequestDispatcherProvider>() {
      public RequestDispatcherProvider getInstance(final CreationalContext context) {
        Class beanType = RequestDispatcherProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final RequestDispatcherProvider inj42227_RequestDispatcherProvider = new RequestDispatcherProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj42227_RequestDispatcherProvider);
        return inj42227_RequestDispatcherProvider;
      }
    };
    final RequestDispatcherProvider inj42227_RequestDispatcherProvider = inj42247_RequestDispatcherProvider_creationalCallback.getInstance(context);
    final CreationalCallback<SenderProvider> inj42248_SenderProvider_creationalCallback = new CreationalCallback<SenderProvider>() {
      public SenderProvider getInstance(final CreationalContext context) {
        Class beanType = SenderProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final SenderProvider inj42229_SenderProvider = new SenderProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj42229_SenderProvider);
        return inj42229_SenderProvider;
      }
    };
    final SenderProvider inj42229_SenderProvider = inj42248_SenderProvider_creationalCallback.getInstance(context);
    final CreationalCallback<MessageBusProvider> inj42250_MessageBusProvider_creationalCallback = new CreationalCallback<MessageBusProvider>() {
      public MessageBusProvider getInstance(final CreationalContext context) {
        Class beanType = MessageBusProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final MessageBusProvider inj42237_MessageBusProvider = new MessageBusProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj42237_MessageBusProvider);
        return inj42237_MessageBusProvider;
      }
    };
    final MessageBusProvider inj42237_MessageBusProvider = inj42250_MessageBusProvider_creationalCallback.getInstance(context);
    final CreationalCallback<KitchenSinkApp> inj42249_KitchenSinkApp_creationalCallback = new CreationalCallback<KitchenSinkApp>() {
      public KitchenSinkApp getInstance(final CreationalContext context) {
        Class beanType = KitchenSinkApp.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final KitchenSinkApp inj40228_KitchenSinkApp = new KitchenSinkApp();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj40228_KitchenSinkApp);
        com_cesaco_myprinterp_client_local_KitchenSinkApp_memberService(inj40228_KitchenSinkApp, inj42231_CallerProvider.provide(new Class[] { MemberService.class }, null));
        com_cesaco_myprinterp_client_local_KitchenSinkApp_gruppoService(inj40228_KitchenSinkApp, inj42231_CallerProvider.provide(new Class[] { GruppoService.class }, null));
        com_cesaco_myprinterp_client_local_KitchenSinkApp_macchinaService(inj40228_KitchenSinkApp, inj42231_CallerProvider.provide(new Class[] { MacchinaService.class }, null));
        InitVotes.registerOneTimeInitCallback(new Runnable() {
          public void run() {
            GWT.runAsync(new RunAsyncCallback() {
              public void onFailure(Throwable throwable) {
                throw new RuntimeException("failed to run asynchronously", throwable);
              }
              public void onSuccess() {
                inj40228_KitchenSinkApp.createUI();
              }
            });
          }
        });
        final Subscription var37 = CDI.subscribe("com.cesaco.myprinterp.client.shared.Member", new AbstractCDIEventCallback() {
          {
            qualifierSet.add("com.cesaco.myprinterp.client.shared.New");
          }
          public void callback(final Message message) {
            Set<String> msgQualifiers = message.get(Set.class, CDIProtocol.Qualifiers);
            if (qualifierSet.equals(msgQualifiers) || ((msgQualifiers == null) && qualifierSet.isEmpty())) {
              GWT.runAsync(new RunAsyncCallback() {
                public void onFailure(Throwable throwable) {
                  throw new RuntimeException("failed to run asynchronously", throwable);
                }
                public void onSuccess() {
                  inj40228_KitchenSinkApp.onMemberAdded(message.get(Member.class, CDIProtocol.BeanReference));
                }
              });
            }
          }
          public String toString() {
            return "Observer: com.cesaco.myprinterp.client.shared.Member [@com.cesaco.myprinterp.client.shared.New()]";
          }
        });
        final Subscription var38 = inj42237_MessageBusProvider.get().subscribe("cdi.event:com.cesaco.myprinterp.client.shared.Member", CDI.ROUTING_CALLBACK);
        context.addDestructionCallback(inj40228_KitchenSinkApp, new DestructionCallback<Member>() {
          public void destroy(final Member obj) {
            var37.remove();
            var38.remove();
          }
        });
        return inj40228_KitchenSinkApp;
      }
    };
    final KitchenSinkApp inj40228_KitchenSinkApp = inj42249_KitchenSinkApp_creationalCallback.getInstance(context);
    final CreationalCallback<RootPanelProvider> inj42251_RootPanelProvider_creationalCallback = new CreationalCallback<RootPanelProvider>() {
      public RootPanelProvider getInstance(final CreationalContext context) {
        Class beanType = RootPanelProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final RootPanelProvider inj42239_RootPanelProvider = new RootPanelProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj42239_RootPanelProvider);
        return inj42239_RootPanelProvider;
      }
    };
    final RootPanelProvider inj42239_RootPanelProvider = inj42251_RootPanelProvider_creationalCallback.getInstance(context);
    final CreationalCallback<IOCBeanManagerProvider> inj42252_IOCBeanManagerProvider_creationalCallback = new CreationalCallback<IOCBeanManagerProvider>() {
      public IOCBeanManagerProvider getInstance(final CreationalContext context) {
        Class beanType = IOCBeanManagerProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final IOCBeanManagerProvider inj42235_IOCBeanManagerProvider = new IOCBeanManagerProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj42235_IOCBeanManagerProvider);
        return inj42235_IOCBeanManagerProvider;
      }
    };
    final IOCBeanManagerProvider inj42235_IOCBeanManagerProvider = inj42252_IOCBeanManagerProvider_creationalCallback.getInstance(context);
    final CreationalCallback<InstanceProvider> inj42253_InstanceProvider_creationalCallback = new CreationalCallback<InstanceProvider>() {
      public InstanceProvider getInstance(final CreationalContext context) {
        Class beanType = InstanceProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final InstanceProvider inj42243_InstanceProvider = new InstanceProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj42243_InstanceProvider);
        return inj42243_InstanceProvider;
      }
    };
    final InstanceProvider inj42243_InstanceProvider = inj42253_InstanceProvider_creationalCallback.getInstance(context);
    final CreationalCallback<EventProvider> inj42254_EventProvider_creationalCallback = new CreationalCallback<EventProvider>() {
      public EventProvider getInstance(final CreationalContext context) {
        Class beanType = EventProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final EventProvider inj42241_EventProvider = new EventProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj42241_EventProvider);
        return inj42241_EventProvider;
      }
    };
    final EventProvider inj42241_EventProvider = inj42254_EventProvider_creationalCallback.getInstance(context);
    final CreationalCallback<DisposerProvider> inj42255_DisposerProvider_creationalCallback = new CreationalCallback<DisposerProvider>() {
      public DisposerProvider getInstance(final CreationalContext context) {
        Class beanType = DisposerProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final DisposerProvider inj42245_DisposerProvider = new DisposerProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj42245_DisposerProvider);
        org_jboss_errai_ioc_client_api_builtin_DisposerProvider_beanManager(inj42245_DisposerProvider, inj42235_IOCBeanManagerProvider.get());
        return inj42245_DisposerProvider;
      }
    };
    final DisposerProvider inj42245_DisposerProvider = inj42255_DisposerProvider_creationalCallback.getInstance(context);
    final CreationalCallback<InitBallotProvider> inj42256_InitBallotProvider_creationalCallback = new CreationalCallback<InitBallotProvider>() {
      public InitBallotProvider getInstance(final CreationalContext context) {
        Class beanType = InitBallotProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final InitBallotProvider inj42233_InitBallotProvider = new InitBallotProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj42233_InitBallotProvider);
        return inj42233_InitBallotProvider;
      }
    };
    final InitBallotProvider inj42233_InitBallotProvider = inj42256_InitBallotProvider_creationalCallback.getInstance(context);
    injContext.addBean(CallerProvider.class, inj42246_CallerProvider_creationalCallback, inj42231_CallerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj42246_CallerProvider_creationalCallback, inj42231_CallerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(RequestDispatcherProvider.class, inj42247_RequestDispatcherProvider_creationalCallback, inj42227_RequestDispatcherProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(Provider.class, inj42247_RequestDispatcherProvider_creationalCallback, inj42227_RequestDispatcherProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(SenderProvider.class, inj42248_SenderProvider_creationalCallback, inj42229_SenderProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj42248_SenderProvider_creationalCallback, inj42229_SenderProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(MessageBusProvider.class, inj42250_MessageBusProvider_creationalCallback, inj42237_MessageBusProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(Provider.class, inj42250_MessageBusProvider_creationalCallback, inj42237_MessageBusProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(KitchenSinkApp.class, inj42249_KitchenSinkApp_creationalCallback, inj40228_KitchenSinkApp, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(RootPanelProvider.class, inj42251_RootPanelProvider_creationalCallback, inj42239_RootPanelProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(Provider.class, inj42251_RootPanelProvider_creationalCallback, inj42239_RootPanelProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(IOCBeanManagerProvider.class, inj42252_IOCBeanManagerProvider_creationalCallback, inj42235_IOCBeanManagerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(Provider.class, inj42252_IOCBeanManagerProvider_creationalCallback, inj42235_IOCBeanManagerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(InstanceProvider.class, inj42253_InstanceProvider_creationalCallback, inj42243_InstanceProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj42253_InstanceProvider_creationalCallback, inj42243_InstanceProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(EventProvider.class, inj42254_EventProvider_creationalCallback, inj42241_EventProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj42254_EventProvider_creationalCallback, inj42241_EventProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(DisposerProvider.class, inj42255_DisposerProvider_creationalCallback, inj42245_DisposerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj42255_DisposerProvider_creationalCallback, inj42245_DisposerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(InitBallotProvider.class, inj42256_InitBallotProvider_creationalCallback, inj42233_InitBallotProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj42256_InitBallotProvider_creationalCallback, inj42233_InitBallotProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    return injContext;
  }
}