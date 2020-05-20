package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.i */
final class C2329i implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C2240a6 f6513f;

    /* renamed from: g */
    private final /* synthetic */ C2341j f6514g;

    C2329i(C2341j jVar, C2240a6 a6Var) {
        this.f6514g = jVar;
        this.f6513f = a6Var;
    }

    public final void run() {
        this.f6513f.mo7094f();
        if (C2352ja.m9553a()) {
            this.f6513f.mo7097i().mo7841a((Runnable) this);
            return;
        }
        boolean b = this.f6514g.mo7402b();
        this.f6514g.f6538c = 0;
        if (b) {
            this.f6514g.mo7230a();
        }
    }
}
