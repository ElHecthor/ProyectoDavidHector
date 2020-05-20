package com.google.android.gms.measurement.internal;

import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.j7 */
final /* synthetic */ class C2349j7 implements Runnable {

    /* renamed from: f */
    private final C2361k7 f6557f;

    /* renamed from: g */
    private final int f6558g;

    /* renamed from: h */
    private final Exception f6559h;

    /* renamed from: i */
    private final byte[] f6560i;

    /* renamed from: j */
    private final Map f6561j;

    C2349j7(C2361k7 k7Var, int i, Exception exc, byte[] bArr, Map map) {
        this.f6557f = k7Var;
        this.f6558g = i;
        this.f6559h = exc;
        this.f6560i = bArr;
        this.f6561j = map;
    }

    public final void run() {
        this.f6557f.mo7455a(this.f6558g, this.f6559h, this.f6560i, this.f6561j);
    }
}
