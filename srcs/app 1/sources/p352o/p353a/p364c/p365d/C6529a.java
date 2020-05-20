package p352o.p353a.p364c.p365d;

import p308k.p323z.p325d.C5942k;
import p352o.p353a.p364c.C6523b;
import p352o.p353a.p364c.p367f.C6541d;

/* renamed from: o.a.c.d.a */
public final class C6529a {

    /* renamed from: a */
    private static C6523b f16166a;

    static {
        new C6529a();
    }

    private C6529a() {
    }

    /* renamed from: a */
    public static final C6523b m24741a() {
        C6523b bVar = f16166a;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("KoinApplication has not been started".toString());
    }

    /* renamed from: a */
    public static final void m24742a(C6523b bVar) {
        C5942k.m22327b(bVar, "koinApplication");
        if (f16166a == null) {
            f16166a = bVar;
            return;
        }
        throw new C6541d("A Koin Application has already been started");
    }
}
