package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.j5 */
final class C2347j5 implements Callable<List<C2500w9>> {

    /* renamed from: f */
    private final /* synthetic */ C2244aa f6546f;

    /* renamed from: g */
    private final /* synthetic */ String f6547g;

    /* renamed from: h */
    private final /* synthetic */ String f6548h;

    /* renamed from: i */
    private final /* synthetic */ C2335i5 f6549i;

    C2347j5(C2335i5 i5Var, C2244aa aaVar, String str, String str2) {
        this.f6549i = i5Var;
        this.f6546f = aaVar;
        this.f6547g = str;
        this.f6548h = str2;
    }

    public final /* synthetic */ Object call() {
        this.f6549i.f6519a.mo7559r();
        return this.f6549i.f6519a.mo7551e().mo7155a(this.f6546f.f6243f, this.f6547g, this.f6548h);
    }
}
