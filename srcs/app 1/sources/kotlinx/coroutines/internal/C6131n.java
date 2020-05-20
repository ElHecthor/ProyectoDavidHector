package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C6087f2;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.internal.n */
public final class C6131n {

    /* renamed from: a */
    private static final boolean f15239a = C6140w.m23087a("kotlinx.coroutines.fast.service.loader", true);

    /* renamed from: b */
    public static final C6087f2 f15240b;

    static {
        C6131n nVar = new C6131n();
        f15240b = nVar.m23053a();
    }

    private C6131n() {
    }

    /* renamed from: a */
    private final C6087f2 m23053a() {
        List list;
        Object obj;
        try {
            if (f15239a) {
                Class<MainDispatcherFactory> cls = MainDispatcherFactory.class;
                C6119h hVar = C6119h.f15214a;
                ClassLoader classLoader = cls.getClassLoader();
                C5942k.m22324a((Object) classLoader, "clz.classLoader");
                list = hVar.mo15890a(cls, classLoader);
            } else {
                Iterator b = C0000a.m1b();
                C5942k.m22324a((Object) b, "ServiceLoader.load(\n    …             ).iterator()");
                list = C5761l.m21908c(C5758j.m21899a(b));
            }
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    int b2 = ((MainDispatcherFactory) obj).mo15709b();
                    do {
                        Object next = it.next();
                        int b3 = ((MainDispatcherFactory) next).mo15709b();
                        if (b2 < b3) {
                            obj = next;
                            b2 = b3;
                        }
                    } while (it.hasNext());
                }
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) obj;
            if (mainDispatcherFactory != null) {
                C6087f2 a = C6132o.m23054a(mainDispatcherFactory, list);
                if (a != null) {
                    return a;
                }
            }
            return new C6133p(null, null, 2, null);
        } catch (Throwable th) {
            return new C6133p(th, null, 2, null);
        }
    }
}
