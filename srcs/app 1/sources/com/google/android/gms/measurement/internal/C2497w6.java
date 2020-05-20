package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.w6 */
final class C2497w6 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f7053f;

    /* renamed from: g */
    private final /* synthetic */ C2348j6 f7054g;

    C2497w6(C2348j6 j6Var, AtomicReference atomicReference) {
        this.f7054g = j6Var;
        this.f7053f = atomicReference;
    }

    public final void run() {
        synchronized (this.f7053f) {
            try {
                this.f7053f.set(Integer.valueOf(this.f7054g.mo7827m().mo7110b(this.f7054g.mo7278q().mo7667B(), C2457t.f6888N)));
                this.f7053f.notify();
            } catch (Throwable th) {
                this.f7053f.notify();
                throw th;
            }
        }
    }
}
