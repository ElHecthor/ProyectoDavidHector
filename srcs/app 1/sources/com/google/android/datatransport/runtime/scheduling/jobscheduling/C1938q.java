package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.concurrent.Executor;
import p147g.p156d.p157a.p158a.p159i.C3767l;
import p147g.p156d.p157a.p158a.p159i.p162v.p163j.C3796c;
import p147g.p156d.p157a.p158a.p159i.p164w.C3831b;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.q */
public class C1938q {

    /* renamed from: a */
    private final Executor f5700a;

    /* renamed from: b */
    private final C3796c f5701b;

    /* renamed from: c */
    private final C1940s f5702c;

    /* renamed from: d */
    private final C3831b f5703d;

    C1938q(Executor executor, C3796c cVar, C1940s sVar, C3831b bVar) {
        this.f5700a = executor;
        this.f5701b = cVar;
        this.f5702c = sVar;
        this.f5703d = bVar;
    }

    /* renamed from: a */
    static /* synthetic */ Object m8181a(C1938q qVar) {
        for (C3767l a : qVar.f5701b.mo11991k()) {
            qVar.f5702c.mo6432a(a, 1);
        }
        return null;
    }

    /* renamed from: a */
    public void mo6463a() {
        this.f5700a.execute(C1936o.m8178a(this));
    }
}
