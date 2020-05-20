package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* renamed from: com.google.android.gms.measurement.internal.u8 */
final /* synthetic */ class C2477u8 implements Runnable {

    /* renamed from: f */
    private final C2444r8 f6993f;

    /* renamed from: g */
    private final int f6994g;

    /* renamed from: h */
    private final C2516y3 f6995h;

    /* renamed from: i */
    private final Intent f6996i;

    C2477u8(C2444r8 r8Var, int i, C2516y3 y3Var, Intent intent) {
        this.f6993f = r8Var;
        this.f6994g = i;
        this.f6995h = y3Var;
        this.f6996i = intent;
    }

    public final void run() {
        this.f6993f.mo7597a(this.f6994g, this.f6995h, this.f6996i);
    }
}
