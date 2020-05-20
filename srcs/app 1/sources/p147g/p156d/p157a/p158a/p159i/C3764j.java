package p147g.p156d.p157a.p158a.p159i;

import java.util.concurrent.Executor;
import p240h.p241a.C4773b;
import p240h.p241a.C4775d;

/* renamed from: g.d.a.a.i.j */
public final class C3764j implements C4773b<Executor> {

    /* renamed from: a */
    private static final C3764j f10654a = new C3764j();

    /* renamed from: a */
    public static C3764j m15371a() {
        return f10654a;
    }

    /* renamed from: b */
    public static Executor m15372b() {
        Executor a = C3763i.m15370a();
        C4775d.m19191a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public Executor get() {
        return m15372b();
    }
}
