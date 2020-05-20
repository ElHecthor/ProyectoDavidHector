package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.l5 */
final class C2371l5 implements Callable<List<C2388ma>> {

    /* renamed from: f */
    private final /* synthetic */ C2244aa f6644f;

    /* renamed from: g */
    private final /* synthetic */ String f6645g;

    /* renamed from: h */
    private final /* synthetic */ String f6646h;

    /* renamed from: i */
    private final /* synthetic */ C2335i5 f6647i;

    C2371l5(C2335i5 i5Var, C2244aa aaVar, String str, String str2) {
        this.f6647i = i5Var;
        this.f6644f = aaVar;
        this.f6645g = str;
        this.f6646h = str2;
    }

    public final /* synthetic */ Object call() {
        this.f6647i.f6519a.mo7559r();
        return this.f6647i.f6519a.mo7551e().mo7167b(this.f6644f.f6243f, this.f6645g, this.f6646h);
    }
}
