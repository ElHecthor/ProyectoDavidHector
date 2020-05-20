package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import p147g.p156d.p157a.p167b.p173d.p180g.C3973da;
import p147g.p156d.p157a.p167b.p173d.p180g.C4053ia;
import p147g.p156d.p157a.p167b.p173d.p180g.C4284x9;

/* renamed from: com.google.android.gms.measurement.internal.e9 */
final class C2291e9 {

    /* renamed from: a */
    private long f6385a;

    /* renamed from: b */
    private long f6386b;

    /* renamed from: c */
    private final C2341j f6387c = new C2279d9(this, this.f6388d.f7100a);

    /* renamed from: d */
    private final /* synthetic */ C2521y8 f6388d;

    public C2291e9(C2521y8 y8Var) {
        this.f6388d = y8Var;
        long c = y8Var.mo7095g().mo6989c();
        this.f6385a = c;
        this.f6386b = c;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m9316c() {
        this.f6388d.mo7274c();
        mo7268a(false, false, this.f6388d.mo7095g().mo6989c());
        this.f6388d.mo7276o().mo7130a(this.f6388d.mo7095g().mo6989c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7266a() {
        this.f6387c.mo7403c();
        this.f6385a = 0;
        this.f6386b = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7267a(long j) {
        this.f6388d.mo7274c();
        this.f6387c.mo7403c();
        this.f6385a = j;
        this.f6386b = j;
    }

    /* renamed from: a */
    public final boolean mo7268a(boolean z, boolean z2, long j) {
        this.f6388d.mo7274c();
        this.f6388d.mo7245x();
        if (!C4284x9.m17546b() || !this.f6388d.mo7827m().mo7108a(C2457t.f6865B0)) {
            j = this.f6388d.mo7095g().mo6989c();
        }
        if (!C3973da.m16224b() || !this.f6388d.mo7827m().mo7108a(C2457t.f6953x0) || this.f6388d.f7100a.mo7204c()) {
            this.f6388d.mo7826l().f6639v.mo7571a(this.f6388d.mo7095g().mo6988b());
        }
        long j2 = j - this.f6385a;
        if (z || j2 >= 1000) {
            if (this.f6388d.mo7827m().mo7108a(C2457t.f6900U) && !z2) {
                j2 = (!C4053ia.m16633b() || !this.f6388d.mo7827m().mo7108a(C2457t.f6902W) || !C4284x9.m17546b() || !this.f6388d.mo7827m().mo7108a(C2457t.f6865B0)) ? mo7269b() : mo7271c(j);
            }
            this.f6388d.mo7098j().mo7810B().mo7089a("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            C2397n7.m9636a(this.f6388d.mo7280s().mo7521a(!this.f6388d.mo7827m().mo7126s().booleanValue()), bundle, true);
            if (this.f6388d.mo7827m().mo7108a(C2457t.f6900U) && !this.f6388d.mo7827m().mo7108a(C2457t.f6901V) && z2) {
                bundle.putLong("_fr", 1);
            }
            if (!this.f6388d.mo7827m().mo7108a(C2457t.f6901V) || !z2) {
                this.f6388d.mo7277p().mo7431a("auto", "_e", bundle);
            }
            this.f6385a = j;
            this.f6387c.mo7403c();
            this.f6387c.mo7401a(3600000);
            return true;
        }
        this.f6388d.mo7098j().mo7810B().mo7089a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final long mo7269b() {
        long c = this.f6388d.mo7095g().mo6989c();
        long j = c - this.f6386b;
        this.f6386b = c;
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo7270b(long j) {
        this.f6387c.mo7403c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final long mo7271c(long j) {
        long j2 = j - this.f6386b;
        this.f6386b = j;
        return j2;
    }
}
