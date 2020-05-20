package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.C1904e;
import java.util.concurrent.Executor;
import p147g.p156d.p157a.p158a.p159i.p162v.p163j.C3796c;
import p147g.p156d.p157a.p158a.p159i.p164w.C3831b;
import p147g.p156d.p157a.p158a.p159i.p165x.C3833a;
import p240h.p241a.C4773b;
import p306j.p307a.C5718a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.n */
public final class C1935n implements C4773b<C1934m> {

    /* renamed from: a */
    private final C5718a<Context> f5691a;

    /* renamed from: b */
    private final C5718a<C1904e> f5692b;

    /* renamed from: c */
    private final C5718a<C3796c> f5693c;

    /* renamed from: d */
    private final C5718a<C1940s> f5694d;

    /* renamed from: e */
    private final C5718a<Executor> f5695e;

    /* renamed from: f */
    private final C5718a<C3831b> f5696f;

    /* renamed from: g */
    private final C5718a<C3833a> f5697g;

    public C1935n(C5718a<Context> aVar, C5718a<C1904e> aVar2, C5718a<C3796c> aVar3, C5718a<C1940s> aVar4, C5718a<Executor> aVar5, C5718a<C3831b> aVar6, C5718a<C3833a> aVar7) {
        this.f5691a = aVar;
        this.f5692b = aVar2;
        this.f5693c = aVar3;
        this.f5694d = aVar4;
        this.f5695e = aVar5;
        this.f5696f = aVar6;
        this.f5697g = aVar7;
    }

    /* renamed from: a */
    public static C1935n m8177a(C5718a<Context> aVar, C5718a<C1904e> aVar2, C5718a<C3796c> aVar3, C5718a<C1940s> aVar4, C5718a<Executor> aVar5, C5718a<C3831b> aVar6, C5718a<C3833a> aVar7) {
        C1935n nVar = new C1935n(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
        return nVar;
    }

    public C1934m get() {
        C1934m mVar = new C1934m((Context) this.f5691a.get(), (C1904e) this.f5692b.get(), (C3796c) this.f5693c.get(), (C1940s) this.f5694d.get(), (Executor) this.f5695e.get(), (C3831b) this.f5696f.get(), (C3833a) this.f5697g.get());
        return mVar;
    }
}
