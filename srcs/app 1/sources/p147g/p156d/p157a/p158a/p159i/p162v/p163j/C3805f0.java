package p147g.p156d.p157a.p158a.p159i.p162v.p163j;

import android.content.Context;
import p240h.p241a.C4773b;
import p306j.p307a.C5718a;

/* renamed from: g.d.a.a.i.v.j.f0 */
public final class C3805f0 implements C4773b<C3802e0> {

    /* renamed from: a */
    private final C5718a<Context> f10724a;

    /* renamed from: b */
    private final C5718a<Integer> f10725b;

    public C3805f0(C5718a<Context> aVar, C5718a<Integer> aVar2) {
        this.f10724a = aVar;
        this.f10725b = aVar2;
    }

    /* renamed from: a */
    public static C3805f0 m15485a(C5718a<Context> aVar, C5718a<Integer> aVar2) {
        return new C3805f0(aVar, aVar2);
    }

    public C3802e0 get() {
        return new C3802e0((Context) this.f10724a.get(), ((Integer) this.f10725b.get()).intValue());
    }
}
