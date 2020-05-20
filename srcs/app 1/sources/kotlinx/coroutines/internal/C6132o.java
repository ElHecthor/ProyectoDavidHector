package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.C6087f2;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.internal.o */
public final class C6132o {
    /* renamed from: a */
    public static final C6087f2 m23054a(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        C5942k.m22327b(mainDispatcherFactory, "$this$tryCreateDispatcher");
        C5942k.m22327b(list, "factories");
        try {
            return mainDispatcherFactory.mo15708a(list);
        } catch (Throwable th) {
            return new C6133p(th, mainDispatcherFactory.mo15707a());
        }
    }
}
