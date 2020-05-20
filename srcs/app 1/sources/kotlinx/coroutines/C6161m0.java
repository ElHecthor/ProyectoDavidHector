package kotlinx.coroutines;

import p308k.C5803m;
import p308k.C5803m.C5804a;
import p308k.C5806n;
import p308k.p316w.C5866d;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.m0 */
public final class C6161m0 {
    /* renamed from: a */
    public static final String m23157a(Object obj) {
        C5942k.m22327b(obj, "$this$classSimpleName");
        String simpleName = obj.getClass().getSimpleName();
        C5942k.m22324a((Object) simpleName, "this::class.java.simpleName");
        return simpleName;
    }

    /* renamed from: a */
    public static final String m23158a(C5866d<?> dVar) {
        Object obj;
        C5942k.m22327b(dVar, "$this$toDebugString");
        if (dVar instanceof C6194t0) {
            return dVar.toString();
        }
        try {
            C5804a aVar = C5803m.f14866f;
            StringBuilder sb = new StringBuilder();
            sb.append(dVar);
            sb.append('@');
            sb.append(m23159b(dVar));
            obj = sb.toString();
            C5803m.m22049a(obj);
        } catch (Throwable th) {
            C5804a aVar2 = C5803m.f14866f;
            obj = C5806n.m22053a(th);
            C5803m.m22049a(obj);
        }
        if (C5803m.m22050b(obj) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dVar.getClass().getName());
            sb2.append('@');
            sb2.append(m23159b(dVar));
            obj = sb2.toString();
        }
        return (String) obj;
    }

    /* renamed from: b */
    public static final String m23159b(Object obj) {
        C5942k.m22327b(obj, "$this$hexAddress");
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        C5942k.m22324a((Object) hexString, "Integer.toHexString(System.identityHashCode(this))");
        return hexString;
    }
}
