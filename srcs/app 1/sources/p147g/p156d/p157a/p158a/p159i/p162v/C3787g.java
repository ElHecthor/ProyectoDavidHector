package p147g.p156d.p157a.p158a.p159i.p162v;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1924g;
import p147g.p156d.p157a.p158a.p159i.p165x.C3833a;
import p240h.p241a.C4773b;
import p240h.p241a.C4775d;
import p306j.p307a.C5718a;

/* renamed from: g.d.a.a.i.v.g */
public final class C3787g implements C4773b<C1924g> {

    /* renamed from: a */
    private final C5718a<C3833a> f10692a;

    public C3787g(C5718a<C3833a> aVar) {
        this.f10692a = aVar;
    }

    /* renamed from: a */
    public static C1924g m15432a(C3833a aVar) {
        C1924g a = C3786f.m15431a(aVar);
        C4775d.m19191a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: a */
    public static C3787g m15433a(C5718a<C3833a> aVar) {
        return new C3787g(aVar);
    }

    public C1924g get() {
        return m15432a((C3833a) this.f10692a.get());
    }
}
