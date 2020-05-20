package p147g.p156d.p157a.p158a.p159i;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.C1911j;
import com.google.android.datatransport.runtime.backends.C1914l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1924g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1934m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1935n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1938q;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1939r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1940s;
import java.util.concurrent.Executor;
import p147g.p156d.p157a.p158a.p159i.p162v.C3783c;
import p147g.p156d.p157a.p158a.p159i.p162v.C3784d;
import p147g.p156d.p157a.p158a.p159i.p162v.C3787g;
import p147g.p156d.p157a.p158a.p159i.p162v.C3789i;
import p147g.p156d.p157a.p158a.p159i.p162v.p163j.C3793a0;
import p147g.p156d.p157a.p158a.p159i.p162v.p163j.C3796c;
import p147g.p156d.p157a.p158a.p159i.p162v.p163j.C3804f;
import p147g.p156d.p157a.p158a.p159i.p162v.p163j.C3805f0;
import p147g.p156d.p157a.p158a.p159i.p162v.p163j.C3806g;
import p147g.p156d.p157a.p158a.p159i.p162v.p163j.C3825z;
import p147g.p156d.p157a.p158a.p159i.p165x.C3833a;
import p147g.p156d.p157a.p158a.p159i.p165x.C3835c;
import p147g.p156d.p157a.p158a.p159i.p165x.C3836d;
import p240h.p241a.C4772a;
import p240h.p241a.C4773b;
import p240h.p241a.C4774c;
import p240h.p241a.C4775d;
import p306j.p307a.C5718a;

/* renamed from: g.d.a.a.i.d */
final class C3755d extends C3774r {

    /* renamed from: f */
    private C5718a<Executor> f10639f;

    /* renamed from: g */
    private C5718a<Context> f10640g;

    /* renamed from: h */
    private C5718a f10641h;

    /* renamed from: i */
    private C5718a f10642i;

    /* renamed from: j */
    private C5718a f10643j;

    /* renamed from: k */
    private C5718a<C3825z> f10644k;

    /* renamed from: l */
    private C5718a<C1924g> f10645l;

    /* renamed from: m */
    private C5718a<C1940s> f10646m;

    /* renamed from: n */
    private C5718a<C3783c> f10647n;

    /* renamed from: o */
    private C5718a<C1934m> f10648o;

    /* renamed from: p */
    private C5718a<C1938q> f10649p;

    /* renamed from: q */
    private C5718a<C3773q> f10650q;

    /* renamed from: g.d.a.a.i.d$b */
    private static final class C3757b implements C3775a {

        /* renamed from: a */
        private Context f10651a;

        private C3757b() {
        }

        /* renamed from: a */
        public C3757b mo11939a(Context context) {
            C4775d.m19190a(context);
            this.f10651a = context;
            return this;
        }

        /* renamed from: a */
        public C3774r mo11940a() {
            C4775d.m19192a(this.f10651a, Context.class);
            return new C3755d(this.f10651a);
        }
    }

    private C3755d(Context context) {
        m15335a(context);
    }

    /* renamed from: a */
    private void m15335a(Context context) {
        this.f10639f = C4772a.m19187a(C3764j.m15371a());
        C4773b a = C4774c.m19189a(context);
        this.f10640g = a;
        C1911j a2 = C1911j.m8114a(a, C3835c.m15574a(), C3836d.m15576a());
        this.f10641h = a2;
        this.f10642i = C4772a.m19187a(C1914l.m8120a(this.f10640g, a2));
        this.f10643j = C3805f0.m15485a(this.f10640g, C3804f.m15483a());
        this.f10644k = C4772a.m19187a(C3793a0.m15446a(C3835c.m15574a(), C3836d.m15576a(), C3806g.m15486a(), this.f10643j));
        C3787g a3 = C3787g.m15433a((C5718a<C3833a>) C3835c.m15574a());
        this.f10645l = a3;
        C3789i a4 = C3789i.m15436a(this.f10640g, this.f10644k, (C5718a<C1924g>) a3, (C5718a<C3833a>) C3836d.m15576a());
        this.f10646m = a4;
        C5718a<Executor> aVar = this.f10639f;
        C5718a aVar2 = this.f10642i;
        C5718a<C3825z> aVar3 = this.f10644k;
        this.f10647n = C3784d.m15429a(aVar, aVar2, a4, aVar3, aVar3);
        C5718a<Context> aVar4 = this.f10640g;
        C5718a aVar5 = this.f10642i;
        C5718a<C3825z> aVar6 = this.f10644k;
        this.f10648o = C1935n.m8177a(aVar4, aVar5, aVar6, this.f10646m, this.f10639f, aVar6, C3835c.m15574a());
        C5718a<Executor> aVar7 = this.f10639f;
        C5718a<C3825z> aVar8 = this.f10644k;
        this.f10649p = C1939r.m8184a(aVar7, aVar8, this.f10646m, aVar8);
        this.f10650q = C4772a.m19187a(C3776s.m15413a(C3835c.m15574a(), C3836d.m15576a(), this.f10647n, this.f10648o, this.f10649p));
    }

    /* renamed from: f */
    public static C3775a m15336f() {
        return new C3757b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3796c mo11937a() {
        return (C3796c) this.f10644k.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C3773q mo11938d() {
        return (C3773q) this.f10650q.get();
    }
}
