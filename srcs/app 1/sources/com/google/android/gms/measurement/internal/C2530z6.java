package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.z6 */
final class C2530z6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f7125f;

    /* renamed from: g */
    private final /* synthetic */ C2348j6 f7126g;

    C2530z6(C2348j6 j6Var, AtomicReference atomicReference) {
        this.f7126g = j6Var;
        this.f7125f = atomicReference;
    }

    public final void run() {
        synchronized (this.f7125f) {
            try {
                this.f7125f.set(Double.valueOf(this.f7126g.mo7827m().mo7111c(this.f7126g.mo7278q().mo7667B(), C2457t.f6890O)));
                this.f7125f.notify();
            } catch (Throwable th) {
                this.f7125f.notify();
                throw th;
            }
        }
    }
}
