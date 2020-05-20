package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import p147g.p156d.p157a.p158a.p159i.p165x.C3833a;
import p240h.p241a.C4773b;
import p306j.p307a.C5718a;

/* renamed from: com.google.android.datatransport.runtime.backends.j */
public final class C1911j implements C4773b<C1910i> {

    /* renamed from: a */
    private final C5718a<Context> f5634a;

    /* renamed from: b */
    private final C5718a<C3833a> f5635b;

    /* renamed from: c */
    private final C5718a<C3833a> f5636c;

    public C1911j(C5718a<Context> aVar, C5718a<C3833a> aVar2, C5718a<C3833a> aVar3) {
        this.f5634a = aVar;
        this.f5635b = aVar2;
        this.f5636c = aVar3;
    }

    /* renamed from: a */
    public static C1911j m8114a(C5718a<Context> aVar, C5718a<C3833a> aVar2, C5718a<C3833a> aVar3) {
        return new C1911j(aVar, aVar2, aVar3);
    }

    public C1910i get() {
        return new C1910i((Context) this.f5634a.get(), (C3833a) this.f5635b.get(), (C3833a) this.f5636c.get());
    }
}
