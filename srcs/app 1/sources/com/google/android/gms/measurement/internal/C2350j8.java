package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.j8 */
final class C2350j8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f6562f;

    /* renamed from: g */
    private final /* synthetic */ String f6563g;

    /* renamed from: h */
    private final /* synthetic */ String f6564h;

    /* renamed from: i */
    private final /* synthetic */ String f6565i;

    /* renamed from: j */
    private final /* synthetic */ boolean f6566j;

    /* renamed from: k */
    private final /* synthetic */ C2244aa f6567k;

    /* renamed from: l */
    private final /* synthetic */ C2465t7 f6568l;

    C2350j8(C2465t7 t7Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z, C2244aa aaVar) {
        this.f6568l = t7Var;
        this.f6562f = atomicReference;
        this.f6563g = str;
        this.f6564h = str2;
        this.f6565i = str3;
        this.f6566j = z;
        this.f6567k = aaVar;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List a;
        synchronized (this.f6562f) {
            try {
                C2428q3 d = this.f6568l.f6968d;
                if (d == null) {
                    this.f6568l.mo7098j().mo7815t().mo7091a("(legacy) Failed to get user properties; not connected to service", C2516y3.m10125a(this.f6563g), this.f6564h, this.f6565i);
                    this.f6562f.set(Collections.emptyList());
                    this.f6562f.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f6563g)) {
                    atomicReference2 = this.f6562f;
                    a = d.mo7382a(this.f6564h, this.f6565i, this.f6566j, this.f6567k);
                } else {
                    atomicReference2 = this.f6562f;
                    a = d.mo7381a(this.f6563g, this.f6564h, this.f6565i, this.f6566j);
                }
                atomicReference2.set(a);
                this.f6568l.m9926K();
                atomicReference = this.f6562f;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f6568l.mo7098j().mo7815t().mo7091a("(legacy) Failed to get user properties; remote exception", C2516y3.m10125a(this.f6563g), this.f6564h, e);
                    this.f6562f.set(Collections.emptyList());
                    atomicReference = this.f6562f;
                } catch (Throwable th) {
                    this.f6562f.notify();
                    throw th;
                }
            }
        }
    }
}
