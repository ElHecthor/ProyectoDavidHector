package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.C2078b;
import com.google.android.gms.common.C2084e;
import java.util.concurrent.atomic.AtomicReference;
import p147g.p156d.p157a.p167b.p173d.p177d.C3878d;

/* renamed from: com.google.android.gms.common.api.internal.s0 */
public abstract class C2055s0 extends LifecycleCallback implements OnCancelListener {

    /* renamed from: g */
    protected volatile boolean f5940g;

    /* renamed from: h */
    protected final AtomicReference<C2059u0> f5941h;

    /* renamed from: i */
    private final Handler f5942i;

    /* renamed from: j */
    protected final C2084e f5943j;

    protected C2055s0(C2034i iVar) {
        this(iVar, C2084e.m8612a());
    }

    private C2055s0(C2034i iVar, C2084e eVar) {
        super(iVar);
        this.f5941h = new AtomicReference<>(null);
        this.f5942i = new C3878d(Looper.getMainLooper());
        this.f5943j = eVar;
    }

    /* renamed from: a */
    private static int m8562a(C2059u0 u0Var) {
        if (u0Var == null) {
            return -1;
        }
        return u0Var.mo6751b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6642a(int r5, int r6, android.content.Intent r7) {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.u0> r0 = r4.f5941h
            java.lang.Object r0 = r0.get()
            com.google.android.gms.common.api.internal.u0 r0 = (com.google.android.gms.common.api.internal.C2059u0) r0
            r1 = 1
            r2 = 0
            if (r5 == r1) goto L_0x0030
            r6 = 2
            if (r5 == r6) goto L_0x0010
            goto L_0x005d
        L_0x0010:
            com.google.android.gms.common.e r5 = r4.f5943j
            android.app.Activity r6 = r4.mo6641a()
            int r5 = r5.mo6806b(r6)
            if (r5 != 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            if (r0 != 0) goto L_0x0021
            return
        L_0x0021:
            com.google.android.gms.common.b r6 = r0.mo6750a()
            int r6 = r6.mo6775e()
            r7 = 18
            if (r6 != r7) goto L_0x005e
            if (r5 != r7) goto L_0x005e
            return
        L_0x0030:
            r5 = -1
            if (r6 != r5) goto L_0x0034
            goto L_0x005e
        L_0x0034:
            if (r6 != 0) goto L_0x005d
            r5 = 13
            if (r7 == 0) goto L_0x0040
            java.lang.String r6 = "<<ResolutionFailureErrorDetail>>"
            int r5 = r7.getIntExtra(r6, r5)
        L_0x0040:
            com.google.android.gms.common.api.internal.u0 r6 = new com.google.android.gms.common.api.internal.u0
            com.google.android.gms.common.b r7 = new com.google.android.gms.common.b
            r1 = 0
            com.google.android.gms.common.b r3 = r0.mo6750a()
            java.lang.String r3 = r3.toString()
            r7.<init>(r5, r1, r3)
            int r5 = m8562a(r0)
            r6.<init>(r7, r5)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.common.api.internal.u0> r5 = r4.f5941h
            r5.set(r6)
            r0 = r6
        L_0x005d:
            r1 = 0
        L_0x005e:
            if (r1 == 0) goto L_0x0064
            r4.mo6747g()
            return
        L_0x0064:
            if (r0 == 0) goto L_0x0071
            com.google.android.gms.common.b r5 = r0.mo6750a()
            int r6 = r0.mo6751b()
            r4.mo6739a(r5, r6)
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C2055s0.mo6642a(int, int, android.content.Intent):void");
    }

    /* renamed from: a */
    public void mo6643a(Bundle bundle) {
        super.mo6643a(bundle);
        if (bundle != null) {
            this.f5941h.set(bundle.getBoolean("resolving_error", false) ? new C2059u0(new C2078b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6739a(C2078b bVar, int i);

    /* renamed from: b */
    public void mo6646b(Bundle bundle) {
        super.mo6646b(bundle);
        C2059u0 u0Var = (C2059u0) this.f5941h.get();
        if (u0Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", u0Var.mo6751b());
            bundle.putInt("failed_status", u0Var.mo6750a().mo6775e());
            bundle.putParcelable("failed_resolution", u0Var.mo6750a().mo6778g());
        }
    }

    /* renamed from: b */
    public final void mo6746b(C2078b bVar, int i) {
        C2059u0 u0Var = new C2059u0(bVar, i);
        if (this.f5941h.compareAndSet(null, u0Var)) {
            this.f5942i.post(new C2057t0(this, u0Var));
        }
    }

    /* renamed from: d */
    public void mo6648d() {
        super.mo6648d();
        this.f5940g = true;
    }

    /* renamed from: e */
    public void mo6649e() {
        super.mo6649e();
        this.f5940g = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo6740f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo6747g() {
        this.f5941h.set(null);
        mo6740f();
    }

    public void onCancel(DialogInterface dialogInterface) {
        mo6739a(new C2078b(13, null), m8562a((C2059u0) this.f5941h.get()));
        mo6747g();
    }
}
