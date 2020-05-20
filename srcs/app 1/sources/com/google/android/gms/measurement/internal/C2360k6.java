package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.k6 */
final class C2360k6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f6590f;

    /* renamed from: g */
    private final /* synthetic */ C2348j6 f6591g;

    C2360k6(C2348j6 j6Var, AtomicReference atomicReference) {
        this.f6591g = j6Var;
        this.f6590f = atomicReference;
    }

    public final void run() {
        synchronized (this.f6590f) {
            try {
                this.f6590f.set(Boolean.valueOf(this.f6591g.mo7827m().mo7119h(this.f6591g.mo7278q().mo7667B())));
                this.f6590f.notify();
            } catch (Throwable th) {
                this.f6590f.notify();
                throw th;
            }
        }
    }
}
