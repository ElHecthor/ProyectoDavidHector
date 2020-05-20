package kotlinx.coroutines;

import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.u2 */
public final class C6202u2 {

    /* renamed from: a */
    private static final ThreadLocal<C6046d1> f15310a = new ThreadLocal<>();

    /* renamed from: b */
    public static final C6202u2 f15311b = new C6202u2();

    private C6202u2() {
    }

    /* renamed from: a */
    public final C6046d1 mo15967a() {
        return (C6046d1) f15310a.get();
    }

    /* renamed from: a */
    public final void mo15968a(C6046d1 d1Var) {
        C5942k.m22327b(d1Var, "eventLoop");
        f15310a.set(d1Var);
    }

    /* renamed from: b */
    public final C6046d1 mo15969b() {
        C6046d1 d1Var = (C6046d1) f15310a.get();
        if (d1Var != null) {
            return d1Var;
        }
        C6046d1 a = C6090g1.m22905a();
        f15310a.set(a);
        return a;
    }

    /* renamed from: c */
    public final void mo15970c() {
        f15310a.set(null);
    }
}
