package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.h8 */
final class C2326h8 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AtomicReference f6500f;

    /* renamed from: g */
    private final /* synthetic */ String f6501g;

    /* renamed from: h */
    private final /* synthetic */ String f6502h;

    /* renamed from: i */
    private final /* synthetic */ String f6503i;

    /* renamed from: j */
    private final /* synthetic */ C2244aa f6504j;

    /* renamed from: k */
    private final /* synthetic */ C2465t7 f6505k;

    C2326h8(C2465t7 t7Var, AtomicReference atomicReference, String str, String str2, String str3, C2244aa aaVar) {
        this.f6505k = t7Var;
        this.f6500f = atomicReference;
        this.f6501g = str;
        this.f6502h = str2;
        this.f6503i = str3;
        this.f6504j = aaVar;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List a;
        synchronized (this.f6500f) {
            try {
                C2428q3 d = this.f6505k.f6968d;
                if (d == null) {
                    this.f6505k.mo7098j().mo7815t().mo7091a("(legacy) Failed to get conditional properties; not connected to service", C2516y3.m10125a(this.f6501g), this.f6502h, this.f6503i);
                    this.f6500f.set(Collections.emptyList());
                    this.f6500f.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f6501g)) {
                    atomicReference2 = this.f6500f;
                    a = d.mo7379a(this.f6502h, this.f6503i, this.f6504j);
                } else {
                    atomicReference2 = this.f6500f;
                    a = d.mo7380a(this.f6501g, this.f6502h, this.f6503i);
                }
                atomicReference2.set(a);
                this.f6505k.m9926K();
                atomicReference = this.f6500f;
                atomicReference.notify();
            } catch (RemoteException e) {
                try {
                    this.f6505k.mo7098j().mo7815t().mo7091a("(legacy) Failed to get conditional properties; remote exception", C2516y3.m10125a(this.f6501g), this.f6502h, e);
                    this.f6500f.set(Collections.emptyList());
                    atomicReference = this.f6500f;
                } catch (Throwable th) {
                    this.f6500f.notify();
                    throw th;
                }
            }
        }
    }
}
