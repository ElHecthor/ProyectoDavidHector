package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.x6 */
final class C2508x6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f7077f;

    /* renamed from: g */
    private final /* synthetic */ C2348j6 f7078g;

    C2508x6(C2348j6 j6Var, AtomicReference atomicReference) {
        this.f7078g = j6Var;
        this.f7077f = atomicReference;
    }

    public final void run() {
        synchronized (this.f7077f) {
            try {
                this.f7077f.set(Long.valueOf(this.f7078g.mo7827m().mo7105a(this.f7078g.mo7278q().mo7667B(), C2457t.f6886M)));
                this.f7077f.notify();
            } catch (Throwable th) {
                this.f7077f.notify();
                throw th;
            }
        }
    }
}
