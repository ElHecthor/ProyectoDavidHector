package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import p240h.p241a.C4773b;
import p306j.p307a.C5718a;

/* renamed from: com.google.android.datatransport.runtime.backends.l */
public final class C1914l implements C4773b<C1912k> {

    /* renamed from: a */
    private final C5718a<Context> f5642a;

    /* renamed from: b */
    private final C5718a<C1910i> f5643b;

    public C1914l(C5718a<Context> aVar, C5718a<C1910i> aVar2) {
        this.f5642a = aVar;
        this.f5643b = aVar2;
    }

    /* renamed from: a */
    public static C1914l m8120a(C5718a<Context> aVar, C5718a<C1910i> aVar2) {
        return new C1914l(aVar, aVar2);
    }

    public C1912k get() {
        return new C1912k((Context) this.f5642a.get(), (C1910i) this.f5643b.get());
    }
}
