package kotlinx.coroutines.internal;

import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.internal.j */
public final class C6121j {

    /* renamed from: a */
    private static final Object f15215a = new C6139v("CONDITION_FALSE");

    /* renamed from: b */
    private static final Object f15216b = new C6139v("LIST_EMPTY");
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Object f15217c = new C6139v("REMOVE_PREPARED");

    static {
        new C6139v("ALREADY_REMOVED");
    }

    /* renamed from: a */
    public static final C6122k m22984a(Object obj) {
        C5942k.m22327b(obj, "$this$unwrap");
        C6135r rVar = (C6135r) (!(obj instanceof C6135r) ? null : obj);
        if (rVar != null) {
            C6122k kVar = rVar.f15243a;
            if (kVar != null) {
                return kVar;
            }
        }
        return (C6122k) obj;
    }

    /* renamed from: b */
    public static final Object m22985b() {
        return f15215a;
    }

    /* renamed from: c */
    public static final Object m22986c() {
        return f15216b;
    }
}
