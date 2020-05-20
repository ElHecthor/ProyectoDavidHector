package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.m6 */
final class C2384m6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ String f6663f;

    /* renamed from: g */
    private final /* synthetic */ String f6664g;

    /* renamed from: h */
    private final /* synthetic */ long f6665h;

    /* renamed from: i */
    private final /* synthetic */ Bundle f6666i;

    /* renamed from: j */
    private final /* synthetic */ boolean f6667j;

    /* renamed from: k */
    private final /* synthetic */ boolean f6668k;

    /* renamed from: l */
    private final /* synthetic */ boolean f6669l;

    /* renamed from: m */
    private final /* synthetic */ String f6670m;

    /* renamed from: n */
    private final /* synthetic */ C2348j6 f6671n;

    C2384m6(C2348j6 j6Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f6671n = j6Var;
        this.f6663f = str;
        this.f6664g = str2;
        this.f6665h = j;
        this.f6666i = bundle;
        this.f6667j = z;
        this.f6668k = z2;
        this.f6669l = z3;
        this.f6670m = str3;
    }

    public final void run() {
        this.f6671n.mo7430a(this.f6663f, this.f6664g, this.f6665h, this.f6666i, this.f6667j, this.f6668k, this.f6669l, this.f6670m);
    }
}
