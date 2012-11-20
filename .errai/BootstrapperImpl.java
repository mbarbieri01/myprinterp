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
    final CreationalCallback<CallerProvider> inj2143_CallerProvider_creationalCallback = new CreationalCallback<CallerProvider>() {
      public CallerProvider getInstance(final CreationalContext context) {
        Class beanType = CallerProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final CallerProvider inj2124_CallerProvider = new CallerProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2124_CallerProvider);
        return inj2124_CallerProvider;
      }
    };
    final CallerProvider inj2124_CallerProvider = inj2143_CallerProvider_creationalCallback.getInstance(context);
    final CreationalCallback<RequestDispatcherProvider> inj2144_RequestDispatcherProvider_creationalCallback = new CreationalCallback<RequestDispatcherProvider>() {
      public RequestDispatcherProvider getInstance(final CreationalContext context) {
        Class beanType = RequestDispatcherProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final RequestDispatcherProvider inj2128_RequestDispatcherProvider = new RequestDispatcherProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2128_RequestDispatcherProvider);
        return inj2128_RequestDispatcherProvider;
      }
    };
    final RequestDispatcherProvider inj2128_RequestDispatcherProvider = inj2144_RequestDispatcherProvider_creationalCallback.getInstance(context);
    final CreationalCallback<SenderProvider> inj2145_SenderProvider_creationalCallback = new CreationalCallback<SenderProvider>() {
      public SenderProvider getInstance(final CreationalContext context) {
        Class beanType = SenderProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final SenderProvider inj2142_SenderProvider = new SenderProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2142_SenderProvider);
        return inj2142_SenderProvider;
      }
    };
    final SenderProvider inj2142_SenderProvider = inj2145_SenderProvider_creationalCallback.getInstance(context);
    final CreationalCallback<MessageBusProvider> inj2147_MessageBusProvider_creationalCallback = new CreationalCallback<MessageBusProvider>() {
      public MessageBusProvider getInstance(final CreationalContext context) {
        Class beanType = MessageBusProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final MessageBusProvider inj2138_MessageBusProvider = new MessageBusProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2138_MessageBusProvider);
        return inj2138_MessageBusProvider;
      }
    };
    final MessageBusProvider inj2138_MessageBusProvider = inj2147_MessageBusProvider_creationalCallback.getInstance(context);
    final CreationalCallback<KitchenSinkApp> inj2146_KitchenSinkApp_creationalCallback = new CreationalCallback<KitchenSinkApp>() {
      public KitchenSinkApp getInstance(final CreationalContext context) {
        Class beanType = KitchenSinkApp.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final KitchenSinkApp inj156_KitchenSinkApp = new KitchenSinkApp();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj156_KitchenSinkApp);
        com_cesaco_myprinterp_client_local_KitchenSinkApp_memberService(inj156_KitchenSinkApp, inj2124_CallerProvider.provide(new Class[] { MemberService.class }, null));
        com_cesaco_myprinterp_client_local_KitchenSinkApp_gruppoService(inj156_KitchenSinkApp, inj2124_CallerProvider.provide(new Class[] { GruppoService.class }, null));
        com_cesaco_myprinterp_client_local_KitchenSinkApp_macchinaService(inj156_KitchenSinkApp, inj2124_CallerProvider.provide(new Class[] { MacchinaService.class }, null));
        InitVotes.registerOneTimeInitCallback(new Runnable() {
          public void run() {
            GWT.runAsync(new RunAsyncCallback() {
              public void onFailure(Throwable throwable) {
                throw new RuntimeException("failed to run asynchronously", throwable);
              }
              public void onSuccess() {
                inj156_KitchenSinkApp.createUI();
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
                  inj156_KitchenSinkApp.onMemberAdded(message.get(Member.class, CDIProtocol.BeanReference));
                }
              });
            }
          }
          public String toString() {
            return "Observer: com.cesaco.myprinterp.client.shared.Member [@com.cesaco.myprinterp.client.shared.New()]";
          }
        });
        final Subscription var2 = inj2138_MessageBusProvider.get().subscribe("cdi.event:com.cesaco.myprinterp.client.shared.Member", CDI.ROUTING_CALLBACK);
        context.addDestructionCallback(inj156_KitchenSinkApp, new DestructionCallback<Member>() {
          public void destroy(final Member obj) {
            var1.remove();
            var2.remove();
          }
        });
        return inj156_KitchenSinkApp;
      }
    };
    final KitchenSinkApp inj156_KitchenSinkApp = inj2146_KitchenSinkApp_creationalCallback.getInstance(context);
    final CreationalCallback<RootPanelProvider> inj2148_RootPanelProvider_creationalCallback = new CreationalCallback<RootPanelProvider>() {
      public RootPanelProvider getInstance(final CreationalContext context) {
        Class beanType = RootPanelProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final RootPanelProvider inj2126_RootPanelProvider = new RootPanelProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2126_RootPanelProvider);
        return inj2126_RootPanelProvider;
      }
    };
    final RootPanelProvider inj2126_RootPanelProvider = inj2148_RootPanelProvider_creationalCallback.getInstance(context);
    final CreationalCallback<IOCBeanManagerProvider> inj2149_IOCBeanManagerProvider_creationalCallback = new CreationalCallback<IOCBeanManagerProvider>() {
      public IOCBeanManagerProvider getInstance(final CreationalContext context) {
        Class beanType = IOCBeanManagerProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final IOCBeanManagerProvider inj2134_IOCBeanManagerProvider = new IOCBeanManagerProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2134_IOCBeanManagerProvider);
        return inj2134_IOCBeanManagerProvider;
      }
    };
    final IOCBeanManagerProvider inj2134_IOCBeanManagerProvider = inj2149_IOCBeanManagerProvider_creationalCallback.getInstance(context);
    final CreationalCallback<InstanceProvider> inj2150_InstanceProvider_creationalCallback = new CreationalCallback<InstanceProvider>() {
      public InstanceProvider getInstance(final CreationalContext context) {
        Class beanType = InstanceProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final InstanceProvider inj2136_InstanceProvider = new InstanceProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2136_InstanceProvider);
        return inj2136_InstanceProvider;
      }
    };
    final InstanceProvider inj2136_InstanceProvider = inj2150_InstanceProvider_creationalCallback.getInstance(context);
    final CreationalCallback<EventProvider> inj2151_EventProvider_creationalCallback = new CreationalCallback<EventProvider>() {
      public EventProvider getInstance(final CreationalContext context) {
        Class beanType = EventProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final EventProvider inj2132_EventProvider = new EventProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2132_EventProvider);
        return inj2132_EventProvider;
      }
    };
    final EventProvider inj2132_EventProvider = inj2151_EventProvider_creationalCallback.getInstance(context);
    final CreationalCallback<DisposerProvider> inj2152_DisposerProvider_creationalCallback = new CreationalCallback<DisposerProvider>() {
      public DisposerProvider getInstance(final CreationalContext context) {
        Class beanType = DisposerProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final DisposerProvider inj2130_DisposerProvider = new DisposerProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2130_DisposerProvider);
        org_jboss_errai_ioc_client_api_builtin_DisposerProvider_beanManager(inj2130_DisposerProvider, inj2134_IOCBeanManagerProvider.get());
        return inj2130_DisposerProvider;
      }
    };
    final DisposerProvider inj2130_DisposerProvider = inj2152_DisposerProvider_creationalCallback.getInstance(context);
    final CreationalCallback<InitBallotProvider> inj2153_InitBallotProvider_creationalCallback = new CreationalCallback<InitBallotProvider>() {
      public InitBallotProvider getInstance(final CreationalContext context) {
        Class beanType = InitBallotProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final InitBallotProvider inj2140_InitBallotProvider = new InitBallotProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj2140_InitBallotProvider);
        return inj2140_InitBallotProvider;
      }
    };
    final InitBallotProvider inj2140_InitBallotProvider = inj2153_InitBallotProvider_creationalCallback.getInstance(context);
    injContext.addBean(CallerProvider.class, inj2143_CallerProvider_creationalCallback, inj2124_CallerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj2143_CallerProvider_creationalCallback, inj2124_CallerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(RequestDispatcherProvider.class, inj2144_RequestDispatcherProvider_creationalCallback, inj2128_RequestDispatcherProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(Provider.class, inj2144_RequestDispatcherProvider_creationalCallback, inj2128_RequestDispatcherProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(SenderProvider.class, inj2145_SenderProvider_creationalCallback, inj2142_SenderProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj2145_SenderProvider_creationalCallback, inj2142_SenderProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(MessageBusProvider.class, inj2147_MessageBusProvider_creationalCallback, inj2138_MessageBusProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(Provider.class, inj2147_MessageBusProvider_creationalCallback, inj2138_MessageBusProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(KitchenSinkApp.class, inj2146_KitchenSinkApp_creationalCallback, inj156_KitchenSinkApp, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(RootPanelProvider.class, inj2148_RootPanelProvider_creationalCallback, inj2126_RootPanelProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(Provider.class, inj2148_RootPanelProvider_creationalCallback, inj2126_RootPanelProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(IOCBeanManagerProvider.class, inj2149_IOCBeanManagerProvider_creationalCallback, inj2134_IOCBeanManagerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(Provider.class, inj2149_IOCBeanManagerProvider_creationalCallback, inj2134_IOCBeanManagerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(InstanceProvider.class, inj2150_InstanceProvider_creationalCallback, inj2136_InstanceProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj2150_InstanceProvider_creationalCallback, inj2136_InstanceProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(EventProvider.class, inj2151_EventProvider_creationalCallback, inj2132_EventProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj2151_EventProvider_creationalCallback, inj2132_EventProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(DisposerProvider.class, inj2152_DisposerProvider_creationalCallback, inj2130_DisposerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj2152_DisposerProvider_creationalCallback, inj2130_DisposerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(InitBallotProvider.class, inj2153_InitBallotProvider_creationalCallback, inj2140_InitBallotProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj2153_InitBallotProvider_creationalCallback, inj2140_InitBallotProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    return injContext;
  }
}