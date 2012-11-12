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
    final CreationalCallback<CallerProvider> inj2099_CallerProvider_creationalCallback = new CreationalCallback<CallerProvider>() {
      public CallerProvider getInstance(final CreationalContext context) {
        Class beanType = CallerProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final CallerProvider inj2086_CallerProvider = new CallerProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2086_CallerProvider);
        return inj2086_CallerProvider;
      }
    };
    final CallerProvider inj2086_CallerProvider = inj2099_CallerProvider_creationalCallback.getInstance(context);
    final CreationalCallback<RequestDispatcherProvider> inj2100_RequestDispatcherProvider_creationalCallback = new CreationalCallback<RequestDispatcherProvider>() {
      public RequestDispatcherProvider getInstance(final CreationalContext context) {
        Class beanType = RequestDispatcherProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final RequestDispatcherProvider inj2084_RequestDispatcherProvider = new RequestDispatcherProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2084_RequestDispatcherProvider);
        return inj2084_RequestDispatcherProvider;
      }
    };
    final RequestDispatcherProvider inj2084_RequestDispatcherProvider = inj2100_RequestDispatcherProvider_creationalCallback.getInstance(context);
    final CreationalCallback<SenderProvider> inj2101_SenderProvider_creationalCallback = new CreationalCallback<SenderProvider>() {
      public SenderProvider getInstance(final CreationalContext context) {
        Class beanType = SenderProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final SenderProvider inj2096_SenderProvider = new SenderProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2096_SenderProvider);
        return inj2096_SenderProvider;
      }
    };
    final SenderProvider inj2096_SenderProvider = inj2101_SenderProvider_creationalCallback.getInstance(context);
    final CreationalCallback<MessageBusProvider> inj2103_MessageBusProvider_creationalCallback = new CreationalCallback<MessageBusProvider>() {
      public MessageBusProvider getInstance(final CreationalContext context) {
        Class beanType = MessageBusProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final MessageBusProvider inj2098_MessageBusProvider = new MessageBusProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2098_MessageBusProvider);
        return inj2098_MessageBusProvider;
      }
    };
    final MessageBusProvider inj2098_MessageBusProvider = inj2103_MessageBusProvider_creationalCallback.getInstance(context);
    final CreationalCallback<KitchenSinkApp> inj2102_KitchenSinkApp_creationalCallback = new CreationalCallback<KitchenSinkApp>() {
      public KitchenSinkApp getInstance(final CreationalContext context) {
        Class beanType = KitchenSinkApp.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final KitchenSinkApp inj150_KitchenSinkApp = new KitchenSinkApp();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj150_KitchenSinkApp);
        com_cesaco_myprinterp_client_local_KitchenSinkApp_memberService(inj150_KitchenSinkApp, inj2086_CallerProvider.provide(new Class[] { MemberService.class }, null));
        com_cesaco_myprinterp_client_local_KitchenSinkApp_gruppoService(inj150_KitchenSinkApp, inj2086_CallerProvider.provide(new Class[] { GruppoService.class }, null));
        com_cesaco_myprinterp_client_local_KitchenSinkApp_macchinaService(inj150_KitchenSinkApp, inj2086_CallerProvider.provide(new Class[] { MacchinaService.class }, null));
        InitVotes.registerOneTimeInitCallback(new Runnable() {
          public void run() {
            GWT.runAsync(new RunAsyncCallback() {
              public void onFailure(Throwable throwable) {
                throw new RuntimeException("failed to run asynchronously", throwable);
              }
              public void onSuccess() {
                inj150_KitchenSinkApp.createUI();
              }
            });
          }
        });
        final Subscription var1 = CDI.subscribe("com.cesaco.myprinterp.client.shared.Member", new AbstractCDIEventCallback() {
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
                  inj150_KitchenSinkApp.onMemberAdded(message.get(Member.class, CDIProtocol.BeanReference));
                }
              });
            }
          }
          public String toString() {
            return "Observer: com.cesaco.myprinterp.client.shared.Member [@com.cesaco.myprinterp.client.shared.New()]";
          }
        });
        final Subscription var2 = inj2098_MessageBusProvider.get().subscribe("cdi.event:com.cesaco.myprinterp.client.shared.Member", CDI.ROUTING_CALLBACK);
        context.addDestructionCallback(inj150_KitchenSinkApp, new DestructionCallback<Member>() {
          public void destroy(final Member obj) {
            var1.remove();
            var2.remove();
          }
        });
        return inj150_KitchenSinkApp;
      }
    };
    final KitchenSinkApp inj150_KitchenSinkApp = inj2102_KitchenSinkApp_creationalCallback.getInstance(context);
    final CreationalCallback<RootPanelProvider> inj2104_RootPanelProvider_creationalCallback = new CreationalCallback<RootPanelProvider>() {
      public RootPanelProvider getInstance(final CreationalContext context) {
        Class beanType = RootPanelProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final RootPanelProvider inj2090_RootPanelProvider = new RootPanelProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2090_RootPanelProvider);
        return inj2090_RootPanelProvider;
      }
    };
    final RootPanelProvider inj2090_RootPanelProvider = inj2104_RootPanelProvider_creationalCallback.getInstance(context);
    final CreationalCallback<IOCBeanManagerProvider> inj2105_IOCBeanManagerProvider_creationalCallback = new CreationalCallback<IOCBeanManagerProvider>() {
      public IOCBeanManagerProvider getInstance(final CreationalContext context) {
        Class beanType = IOCBeanManagerProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final IOCBeanManagerProvider inj2082_IOCBeanManagerProvider = new IOCBeanManagerProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2082_IOCBeanManagerProvider);
        return inj2082_IOCBeanManagerProvider;
      }
    };
    final IOCBeanManagerProvider inj2082_IOCBeanManagerProvider = inj2105_IOCBeanManagerProvider_creationalCallback.getInstance(context);
    final CreationalCallback<InstanceProvider> inj2106_InstanceProvider_creationalCallback = new CreationalCallback<InstanceProvider>() {
      public InstanceProvider getInstance(final CreationalContext context) {
        Class beanType = InstanceProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final InstanceProvider inj2088_InstanceProvider = new InstanceProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2088_InstanceProvider);
        return inj2088_InstanceProvider;
      }
    };
    final InstanceProvider inj2088_InstanceProvider = inj2106_InstanceProvider_creationalCallback.getInstance(context);
    final CreationalCallback<EventProvider> inj2107_EventProvider_creationalCallback = new CreationalCallback<EventProvider>() {
      public EventProvider getInstance(final CreationalContext context) {
        Class beanType = EventProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final EventProvider inj2080_EventProvider = new EventProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2080_EventProvider);
        return inj2080_EventProvider;
      }
    };
    final EventProvider inj2080_EventProvider = inj2107_EventProvider_creationalCallback.getInstance(context);
    final CreationalCallback<DisposerProvider> inj2108_DisposerProvider_creationalCallback = new CreationalCallback<DisposerProvider>() {
      public DisposerProvider getInstance(final CreationalContext context) {
        Class beanType = DisposerProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final DisposerProvider inj2092_DisposerProvider = new DisposerProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2092_DisposerProvider);
        org_jboss_errai_ioc_client_api_builtin_DisposerProvider_beanManager(inj2092_DisposerProvider, inj2082_IOCBeanManagerProvider.get());
        return inj2092_DisposerProvider;
      }
    };
    final DisposerProvider inj2092_DisposerProvider = inj2108_DisposerProvider_creationalCallback.getInstance(context);
    final CreationalCallback<InitBallotProvider> inj2109_InitBallotProvider_creationalCallback = new CreationalCallback<InitBallotProvider>() {
      public InitBallotProvider getInstance(final CreationalContext context) {
        Class beanType = InitBallotProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final InitBallotProvider inj2094_InitBallotProvider = new InitBallotProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2094_InitBallotProvider);
        return inj2094_InitBallotProvider;
      }
    };
    final InitBallotProvider inj2094_InitBallotProvider = inj2109_InitBallotProvider_creationalCallback.getInstance(context);
    injContext.addBean(CallerProvider.class, inj2099_CallerProvider_creationalCallback, inj2086_CallerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj2099_CallerProvider_creationalCallback, inj2086_CallerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(RequestDispatcherProvider.class, inj2100_RequestDispatcherProvider_creationalCallback, inj2084_RequestDispatcherProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(Provider.class, inj2100_RequestDispatcherProvider_creationalCallback, inj2084_RequestDispatcherProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(SenderProvider.class, inj2101_SenderProvider_creationalCallback, inj2096_SenderProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj2101_SenderProvider_creationalCallback, inj2096_SenderProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(MessageBusProvider.class, inj2103_MessageBusProvider_creationalCallback, inj2098_MessageBusProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(Provider.class, inj2103_MessageBusProvider_creationalCallback, inj2098_MessageBusProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(KitchenSinkApp.class, inj2102_KitchenSinkApp_creationalCallback, inj150_KitchenSinkApp, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(RootPanelProvider.class, inj2104_RootPanelProvider_creationalCallback, inj2090_RootPanelProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(Provider.class, inj2104_RootPanelProvider_creationalCallback, inj2090_RootPanelProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(IOCBeanManagerProvider.class, inj2105_IOCBeanManagerProvider_creationalCallback, inj2082_IOCBeanManagerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(Provider.class, inj2105_IOCBeanManagerProvider_creationalCallback, inj2082_IOCBeanManagerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(InstanceProvider.class, inj2106_InstanceProvider_creationalCallback, inj2088_InstanceProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj2106_InstanceProvider_creationalCallback, inj2088_InstanceProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(EventProvider.class, inj2107_EventProvider_creationalCallback, inj2080_EventProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj2107_EventProvider_creationalCallback, inj2080_EventProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(DisposerProvider.class, inj2108_DisposerProvider_creationalCallback, inj2092_DisposerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj2108_DisposerProvider_creationalCallback, inj2092_DisposerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(InitBallotProvider.class, inj2109_InitBallotProvider_creationalCallback, inj2094_InitBallotProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj2109_InitBallotProvider_creationalCallback, inj2094_InitBallotProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    return injContext;
  }
}