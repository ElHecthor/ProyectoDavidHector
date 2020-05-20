package kotlinx.coroutines;

import p308k.C5803m;
import p308k.C5806n;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.u */
public final class C6197u {
    /* renamed from: a */
    public static final <T> Object m23230a(Object obj) {
        if (C5803m.m22052d(obj)) {
            C5806n.m22054a(obj);
            return obj;
        }
        Throwable b = C5803m.m22050b(obj);
        if (b != null) {
            return new C6193t(b, false, 2, null);
        }
        C5942k.m22323a();
        throw null;
    }
}
