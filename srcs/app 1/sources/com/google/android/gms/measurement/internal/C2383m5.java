package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.m5 */
final class C2383m5 implements Callable<List<C2500w9>> {

    /* renamed from: f */
    private final /* synthetic */ String f6659f;

    /* renamed from: g */
    private final /* synthetic */ String f6660g;

    /* renamed from: h */
    private final /* synthetic */ String f6661h;

    /* renamed from: i */
    private final /* synthetic */ C2335i5 f6662i;

    C2383m5(C2335i5 i5Var, String str, String str2, String str3) {
        this.f6662i = i5Var;
        this.f6659f = str;
        this.f6660g = str2;
        this.f6661h = str3;
    }

    public final /* synthetic */ Object call() {
        this.f6662i.f6519a.mo7559r();
        return this.f6662i.f6519a.mo7551e().mo7155a(this.f6659f, this.f6660g, this.f6661h);
    }
}
