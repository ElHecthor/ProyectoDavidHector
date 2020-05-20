package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.v6 */
final class C2486v6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f7023f;

    /* renamed from: g */
    private final /* synthetic */ String f7024g;

    /* renamed from: h */
    private final /* synthetic */ String f7025h;

    /* renamed from: i */
    private final /* synthetic */ String f7026i;

    /* renamed from: j */
    private final /* synthetic */ C2348j6 f7027j;

    C2486v6(C2348j6 j6Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f7027j = j6Var;
        this.f7023f = atomicReference;
        this.f7024g = str;
        this.f7025h = str2;
        this.f7026i = str3;
    }

    public final void run() {
        this.f7027j.f7100a.mo7194E().mo7647a(this.f7023f, this.f7024g, this.f7025h, this.f7026i);
    }
}
