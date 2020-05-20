package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.z7 */
final class C2531z7 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f7127f;

    /* renamed from: g */
    private final /* synthetic */ C2244aa f7128g;

    /* renamed from: h */
    private final /* synthetic */ C2465t7 f7129h;

    C2531z7(C2465t7 t7Var, AtomicReference atomicReference, C2244aa aaVar) {
        this.f7129h = t7Var;
        this.f7127f = atomicReference;
        this.f7128g = aaVar;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f7127f) {
            try {
                C2428q3 d = this.f7129h.f6968d;
                if (d == null) {
                    this.f7129h.mo7098j().mo7815t().mo7088a("Failed to get app instance id");
                    this.f7127f.notify();
                    return;
                }
                this.f7127f.set(d.mo7392b(this.f7128g));
                String str = (String) this.f7127f.get();
                if (str != null) {
                    this.f7129h.mo7277p().mo7428a(str);
                    this.f7129h.mo7826l().f6629l.mo7590a(str);
                }
                this.f7129h.m9926K();
                atomicReference = this.f7127f;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f7129h.mo7098j().mo7815t().mo7089a("Failed to get app instance id", e);
                    atomicReference = this.f7127f;
                } catch (Throwable th) {
                    this.f7127f.notify();
                    throw th;
                }
            }
        }
    }
}
