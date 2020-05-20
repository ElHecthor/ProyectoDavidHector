package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.s6 */
final class C2453s6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f6857f;

    /* renamed from: g */
    private final /* synthetic */ C2348j6 f6858g;

    C2453s6(C2348j6 j6Var, AtomicReference atomicReference) {
        this.f6858g = j6Var;
        this.f6857f = atomicReference;
    }

    public final void run() {
        synchronized (this.f6857f) {
            try {
                this.f6857f.set(this.f6858g.mo7827m().mo7120i(this.f6858g.mo7278q().mo7667B()));
                this.f6857f.notify();
            } catch (Throwable th) {
                this.f6857f.notify();
                throw th;
            }
        }
    }
}
