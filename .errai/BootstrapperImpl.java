package org.jboss.errai.ioc.client;

import com.cesaco.myprinterp.client.local.KitchenSinkApp;
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
    final CreationalCallback<CallerProvider> inj1753_CallerProvider_creationalCallback = new CreationalCallback<CallerProvider>() {
      public CallerProvider getInstance(final CreationalContext context) {
        Class beanType = CallerProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final CallerProvider inj1746_CallerProvider = new CallerProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj1746_CallerProvider);
        return inj1746_CallerProvider;
      }
    };
    final CallerProvider inj1746_CallerProvider = inj1753_CallerProvider_creationalCallback.getInstance(context);
    final CreationalCallback<RequestDispatcherProvider> inj1754_RequestDispatcherProvider_creationalCallback = new CreationalCallback<RequestDispatcherProvider>() {
      public RequestDispatcherProvider getInstance(final CreationalContext context) {
        Class beanType = RequestDispatcherProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final RequestDispatcherProvider inj1748_RequestDispatcherProvider = new RequestDispatcherProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj1748_RequestDispatcherProvider);
        return inj1748_RequestDispatcherProvider;
      }
    };
    final RequestDispatcherProvider inj1748_RequestDispatcherProvider = inj1754_RequestDispatcherProvider_creationalCallback.getInstance(context);
    final CreationalCallback<SenderProvider> inj1755_SenderProvider_creationalCallback = new CreationalCallback<SenderProvider>() {
      public SenderProvider getInstance(final CreationalContext context) {
        Class beanType = SenderProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final SenderProvider inj1738_SenderProvider = new SenderProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj1738_SenderProvider);
        return inj1738_SenderProvider;
      }
    };
    final SenderProvider inj1738_SenderProvider = inj1755_SenderProvider_creationalCallback.getInstance(context);
    final CreationalCallback<MessageBusProvider> inj1757_MessageBusProvider_creationalCallback = new CreationalCallback<MessageBusProvider>() {
      public MessageBusProvider getInstance(final CreationalContext context) {
        Class beanType = MessageBusProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final MessageBusProvider inj1740_MessageBusProvider = new MessageBusProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj1740_MessageBusProvider);
        return inj1740_MessageBusProvider;
      }
    };
    final MessageBusProvider inj1740_MessageBusProvider = inj1757_MessageBusProvider_creationalCallback.getInstance(context);
    final CreationalCallback<KitchenSinkApp> inj1756_KitchenSinkApp_creationalCallback = new CreationalCallback<KitchenSinkApp>() {
      public KitchenSinkApp getInstance(final CreationalContext context) {
        Class beanType = KitchenSinkApp.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final KitchenSinkApp inj116_KitchenSinkApp = new KitchenSinkApp();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj116_KitchenSinkApp);
        com_cesaco_myprinterp_client_local_KitchenSinkApp_memberService(inj116_KitchenSinkApp, inj1746_CallerProvider.provide(new Class[] { MemberService.class }, null));
        InitVotes.registerOneTimeInitCallback(new Runnable() {
          public void run() {
            GWT.runAsync(new RunAsyncCallback() {
              public void onFailure(Throwable throwable) {
                throw new RuntimeException("failed to run asynchronously", throwable);
              }
              public void onSuccess() {
                inj116_KitchenSinkApp.createUI();
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
                  inj116_KitchenSinkApp.onMemberAdded(message.get(Member.class, CDIProtocol.BeanReference));
                }
              });
            }
          }
          public String toString() {
            return "Observer: com.cesaco.myprinterp.client.shared.Member [@com.cesaco.myprinterp.client.shared.New()]";
          }
        });
        final Subscription var2 = inj1740_MessageBusProvider.get().subscribe("cdi.event:com.cesaco.myprinterp.client.shared.Member", CDI.ROUTING_CALLBACK);
        context.addDestructionCallback(inj116_KitchenSinkApp, new DestructionCallback<Member>() {
          public void destroy(final Member obj) {
            var1.remove();
            var2.remove();
          }
        });
        return inj116_KitchenSinkApp;
      }
    };
    final KitchenSinkApp inj116_KitchenSinkApp = inj1756_KitchenSinkApp_creationalCallback.getInstance(context);
    final CreationalCallback<RootPanelProvider> inj1758_RootPanelProvider_creationalCallback = new CreationalCallback<RootPanelProvider>() {
      public RootPanelProvider getInstance(final CreationalContext context) {
        Class beanType = RootPanelProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final RootPanelProvider inj1750_RootPanelProvider = new RootPanelProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj1750_RootPanelProvider);
        return inj1750_RootPanelProvider;
      }
    };
    final RootPanelProvider inj1750_RootPanelProvider = inj1758_RootPanelProvider_creationalCallback.getInstance(context);
    final CreationalCallback<IOCBeanManagerProvider> inj1759_IOCBeanManagerProvider_creationalCallback = new CreationalCallback<IOCBeanManagerProvider>() {
      public IOCBeanManagerProvider getInstance(final CreationalContext context) {
        Class beanType = IOCBeanManagerProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final IOCBeanManagerProvider inj1752_IOCBeanManagerProvider = new IOCBeanManagerProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj1752_IOCBeanManagerProvider);
        return inj1752_IOCBeanManagerProvider;
      }
    };
    final IOCBeanManagerProvider inj1752_IOCBeanManagerProvider = inj1759_IOCBeanManagerProvider_creationalCallback.getInstance(context);
    final CreationalCallback<InstanceProvider> inj1760_InstanceProvider_creationalCallback = new CreationalCallback<InstanceProvider>() {
      public InstanceProvider getInstance(final CreationalContext context) {
        Class beanType = InstanceProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final InstanceProvider inj1736_InstanceProvider = new InstanceProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj1736_InstanceProvider);
        return inj1736_InstanceProvider;
      }
    };
    final InstanceProvider inj1736_InstanceProvider = inj1760_InstanceProvider_creationalCallback.getInstance(context);
    final CreationalCallback<EventProvider> inj1761_EventProvider_creationalCallback = new CreationalCallback<EventProvider>() {
      public EventProvider getInstance(final CreationalContext context) {
        Class beanType = EventProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final EventProvider inj1744_EventProvider = new EventProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj1744_EventProvider);
        return inj1744_EventProvider;
      }
    };
    final EventProvider inj1744_EventProvider = inj1761_EventProvider_creationalCallback.getInstance(context);
    final CreationalCallback<DisposerProvider> inj1762_DisposerProvider_creationalCallback = new CreationalCallback<DisposerProvider>() {
      public DisposerProvider getInstance(final CreationalContext context) {
        Class beanType = DisposerProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final DisposerProvider inj1734_DisposerProvider = new DisposerProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj1734_DisposerProvider);
        org_jboss_errai_ioc_client_api_builtin_DisposerProvider_beanManager(inj1734_DisposerProvider, inj1752_IOCBeanManagerProvider.get());
        return inj1734_DisposerProvider;
      }
    };
    final DisposerProvider inj1734_DisposerProvider = inj1762_DisposerProvider_creationalCallback.getInstance(context);
    final CreationalCallback<InitBallotProvider> inj1763_InitBallotProvider_creationalCallback = new CreationalCallback<InitBallotProvider>() {
      public InitBallotProvider getInstance(final CreationalContext context) {
        Class beanType = InitBallotProvider.class;
        Annotation[] qualifiers = new Annotation[] { new Any() {
            public Class annotationType() {
              return Any.class;
            }
        } };
        final InitBallotProvider inj1742_InitBallotProvider = new InitBallotProvider();
        BeanRef beanRef = context.getBeanReference(beanType, qualifiers);
        context.addBean(beanRef, inj1742_InitBallotProvider);
        return inj1742_InitBallotProvider;
      }
    };
    final InitBallotProvider inj1742_InitBallotProvider = inj1763_InitBallotProvider_creationalCallback.getInstance(context);
    injContext.addBean(CallerProvider.class, inj1753_CallerProvider_creationalCallback, inj1746_CallerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj1753_CallerProvider_creationalCallback, inj1746_CallerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(RequestDispatcherProvider.class, inj1754_RequestDispatcherProvider_creationalCallback, inj1748_RequestDispatcherProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(Provider.class, inj1754_RequestDispatcherProvider_creationalCallback, inj1748_RequestDispatcherProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(SenderProvider.class, inj1755_SenderProvider_creationalCallback, inj1738_SenderProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj1755_SenderProvider_creationalCallback, inj1738_SenderProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(MessageBusProvider.class, inj1757_MessageBusProvider_creationalCallback, inj1740_MessageBusProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(Provider.class, inj1757_MessageBusProvider_creationalCallback, inj1740_MessageBusProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(KitchenSinkApp.class, inj1756_KitchenSinkApp_creationalCallback, inj116_KitchenSinkApp, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(RootPanelProvider.class, inj1758_RootPanelProvider_creationalCallback, inj1750_RootPanelProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(Provider.class, inj1758_RootPanelProvider_creationalCallback, inj1750_RootPanelProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(IOCBeanManagerProvider.class, inj1759_IOCBeanManagerProvider_creationalCallback, inj1752_IOCBeanManagerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(Provider.class, inj1759_IOCBeanManagerProvider_creationalCallback, inj1752_IOCBeanManagerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(InstanceProvider.class, inj1760_InstanceProvider_creationalCallback, inj1736_InstanceProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj1760_InstanceProvider_creationalCallback, inj1736_InstanceProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(EventProvider.class, inj1761_EventProvider_creationalCallback, inj1744_EventProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj1761_EventProvider_creationalCallback, inj1744_EventProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(DisposerProvider.class, inj1762_DisposerProvider_creationalCallback, inj1734_DisposerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj1762_DisposerProvider_creationalCallback, inj1734_DisposerProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(InitBallotProvider.class, inj1763_InitBallotProvider_creationalCallback, inj1742_InitBallotProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    injContext.addBean(ContextualTypeProvider.class, inj1763_InitBallotProvider_creationalCallback, inj1742_InitBallotProvider, BuiltInQualifiers.DEFAULT_QUALIFIERS);
    return injContext;
  }
}