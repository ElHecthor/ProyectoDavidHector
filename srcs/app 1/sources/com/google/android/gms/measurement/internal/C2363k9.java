package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.k9 */
abstract class C2363k9 extends C2375l9 {

    /* renamed from: c */
    private boolean f6602c;

    C2363k9(C2399n9 n9Var) {
        super(n9Var);
        this.f6652b.mo7533a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public final boolean mo7458q() {
        return this.f6602c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo7459r() {
        if (!mo7458q()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: s */
    public final void mo7460s() {
        if (!this.f6602c) {
            mo7181t();
            this.f6652b.mo7560s();
            this.f6602c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract boolean mo7181t();
}
