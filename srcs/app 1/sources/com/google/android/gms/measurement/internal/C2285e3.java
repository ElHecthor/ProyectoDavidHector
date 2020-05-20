package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.e3 */
abstract class C2285e3 extends C2298f4 {

    /* renamed from: b */
    private boolean f6374b;

    C2285e3(C2263c5 c5Var) {
        super(c5Var);
        this.f7100a.mo7199a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract boolean mo7242A();

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo7243v() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final boolean mo7244w() {
        return this.f6374b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo7245x() {
        if (!mo7244w()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: y */
    public final void mo7246y() {
        if (this.f6374b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo7242A()) {
            this.f7100a.mo7208l();
            this.f6374b = true;
        }
    }

    /* renamed from: z */
    public final void mo7247z() {
        if (!this.f6374b) {
            mo7243v();
            this.f7100a.mo7208l();
            this.f6374b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
