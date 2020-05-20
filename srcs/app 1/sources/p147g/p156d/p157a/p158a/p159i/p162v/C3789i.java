package p147g.p156d.p157a.p158a.p159i.p162v;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1924g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1940s;
import p147g.p156d.p157a.p158a.p159i.p162v.p163j.C3796c;
import p147g.p156d.p157a.p158a.p159i.p165x.C3833a;
import p240h.p241a.C4773b;
import p240h.p241a.C4775d;
import p306j.p307a.C5718a;

/* renamed from: g.d.a.a.i.v.i */
public final class C3789i implements C4773b<C1940s> {

    /* renamed from: a */
    private final C5718a<Context> f10693a;

    /* renamed from: b */
    private final C5718a<C3796c> f10694b;

    /* renamed from: c */
    private final C5718a<C1924g> f10695c;

    /* renamed from: d */
    private final C5718a<C3833a> f10696d;

    public C3789i(C5718a<Context> aVar, C5718a<C3796c> aVar2, C5718a<C1924g> aVar3, C5718a<C3833a> aVar4) {
        this.f10693a = aVar;
        this.f10694b = aVar2;
        this.f10695c = aVar3;
        this.f10696d = aVar4;
    }

    /* renamed from: a */
    public static C1940s m15435a(Context context, C3796c cVar, C1924g gVar, C3833a aVar) {
        C1940s a = C3788h.m15434a(context, cVar, gVar, aVar);
        C4775d.m19191a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    /* renamed from: a */
    public static C3789i m15436a(C5718a<Context> aVar, C5718a<C3796c> aVar2, C5718a<C1924g> aVar3, C5718a<C3833a> aVar4) {
        return new C3789i(aVar, aVar2, aVar3, aVar4);
    }

    public C1940s get() {
        return m15435a((Context) this.f10693a.get(), (C3796c) this.f10694b.get(), (C1924g) this.f10695c.get(), (C3833a) this.f10696d.get());
    }
}
