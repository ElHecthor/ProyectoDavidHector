package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.concurrent.Executor;
import p147g.p156d.p157a.p158a.p159i.p162v.p163j.C3796c;
import p147g.p156d.p157a.p158a.p159i.p164w.C3831b;
import p240h.p241a.C4773b;
import p306j.p307a.C5718a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.r */
public final class C1939r implements C4773b<C1938q> {

    /* renamed from: a */
    private final C5718a<Executor> f5704a;

    /* renamed from: b */
    private final C5718a<C3796c> f5705b;

    /* renamed from: c */
    private final C5718a<C1940s> f5706c;

    /* renamed from: d */
    private final C5718a<C3831b> f5707d;

    public C1939r(C5718a<Executor> aVar, C5718a<C3796c> aVar2, C5718a<C1940s> aVar3, C5718a<C3831b> aVar4) {
        this.f5704a = aVar;
        this.f5705b = aVar2;
        this.f5706c = aVar3;
        this.f5707d = aVar4;
    }

    /* renamed from: a */
    public static C1939r m8184a(C5718a<Executor> aVar, C5718a<C3796c> aVar2, C5718a<C1940s> aVar3, C5718a<C3831b> aVar4) {
        return new C1939r(aVar, aVar2, aVar3, aVar4);
    }

    public C1938q get() {
        return new C1938q((Executor) this.f5704a.get(), (C3796c) this.f5705b.get(), (C1940s) this.f5706c.get(), (C3831b) this.f5707d.get());
    }
}
