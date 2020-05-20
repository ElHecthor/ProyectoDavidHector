package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.x5 */
abstract class C2507x5 extends C2518y5 {

    /* renamed from: b */
    private boolean f7076b;

    C2507x5(C2263c5 c5Var) {
        super(c5Var);
        this.f7100a.mo7200a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo7477n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo7742o() {
        if (!mo7745s()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: p */
    public final void mo7743p() {
        if (this.f7076b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo7397r()) {
            this.f7100a.mo7208l();
            this.f7076b = true;
        }
    }

    /* renamed from: q */
    public final void mo7744q() {
        if (!this.f7076b) {
            mo7477n();
            this.f7100a.mo7208l();
            this.f7076b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract boolean mo7397r();

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public final boolean mo7745s() {
        return this.f7076b;
    }
}
