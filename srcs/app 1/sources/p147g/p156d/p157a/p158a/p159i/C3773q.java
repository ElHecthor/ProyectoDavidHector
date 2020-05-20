package p147g.p156d.p157a.p158a.p159i;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1934m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1938q;
import java.util.Collections;
import java.util.Set;
import p147g.p156d.p157a.p158a.C3739b;
import p147g.p156d.p157a.p158a.C3744g;
import p147g.p156d.p157a.p158a.C3745h;
import p147g.p156d.p157a.p158a.p159i.C3761h.C3762a;
import p147g.p156d.p157a.p158a.p159i.C3767l.C3768a;
import p147g.p156d.p157a.p158a.p159i.p162v.C3785e;
import p147g.p156d.p157a.p158a.p159i.p165x.C3833a;

/* renamed from: g.d.a.a.i.q */
public class C3773q implements C3772p {

    /* renamed from: e */
    private static volatile C3774r f10664e;

    /* renamed from: a */
    private final C3833a f10665a;

    /* renamed from: b */
    private final C3833a f10666b;

    /* renamed from: c */
    private final C3785e f10667c;

    /* renamed from: d */
    private final C1934m f10668d;

    C3773q(C3833a aVar, C3833a aVar2, C3785e eVar, C1934m mVar, C1938q qVar) {
        this.f10665a = aVar;
        this.f10666b = aVar2;
        this.f10667c = eVar;
        this.f10668d = mVar;
        qVar.mo6463a();
    }

    /* renamed from: a */
    private C3761h m15402a(C3765k kVar) {
        C3762a i = C3761h.m15347i();
        i.mo11906a(this.f10665a.mo12001a());
        i.mo11912b(this.f10666b.mo12001a());
        i.mo11909a(kVar.mo11919f());
        i.mo11907a(new C3760g(kVar.mo11914a(), kVar.mo11954c()));
        i.mo11908a(kVar.mo11915b().mo11886a());
        return i.mo11911a();
    }

    /* renamed from: a */
    public static void m15403a(Context context) {
        if (f10664e == null) {
            synchronized (C3773q.class) {
                if (f10664e == null) {
                    C3775a f = C3755d.m15336f();
                    f.mo11939a(context);
                    f10664e = f.mo11940a();
                }
            }
        }
    }

    /* renamed from: b */
    public static C3773q m15404b() {
        C3774r rVar = f10664e;
        if (rVar != null) {
            return rVar.mo11938d();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: b */
    private static Set<C3739b> m15405b(C3758e eVar) {
        return eVar instanceof C3759f ? Collections.unmodifiableSet(((C3759f) eVar).mo6309a()) : Collections.singleton(C3739b.m15293a("proto"));
    }

    /* renamed from: a */
    public C1934m mo11959a() {
        return this.f10668d;
    }

    /* renamed from: a */
    public C3744g mo11960a(C3758e eVar) {
        Set b = m15405b(eVar);
        C3768a d = C3767l.m15386d();
        d.mo11934a(eVar.mo6310b());
        d.mo11935a(eVar.mo6311c());
        return new C3769m(b, d.mo11936a(), this);
    }

    /* renamed from: a */
    public void mo11958a(C3765k kVar, C3745h hVar) {
        this.f10667c.mo11963a(kVar.mo11917e().mo11955a(kVar.mo11915b().mo11888c()), m15402a(kVar), hVar);
    }
}
