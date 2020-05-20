package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.u6 */
final class C2475u6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f6986f;

    /* renamed from: g */
    private final /* synthetic */ String f6987g;

    /* renamed from: h */
    private final /* synthetic */ String f6988h;

    /* renamed from: i */
    private final /* synthetic */ String f6989i;

    /* renamed from: j */
    private final /* synthetic */ boolean f6990j;

    /* renamed from: k */
    private final /* synthetic */ C2348j6 f6991k;

    C2475u6(C2348j6 j6Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f6991k = j6Var;
        this.f6986f = atomicReference;
        this.f6987g = str;
        this.f6988h = str2;
        this.f6989i = str3;
        this.f6990j = z;
    }

    public final void run() {
        this.f6991k.f7100a.mo7194E().mo7648a(this.f6986f, this.f6987g, this.f6988h, this.f6989i, this.f6990j);
    }
}
