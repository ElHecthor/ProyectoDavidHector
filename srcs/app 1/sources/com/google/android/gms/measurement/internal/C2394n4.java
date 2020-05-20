package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.C2148s;

/* renamed from: com.google.android.gms.measurement.internal.n4 */
public final class C2394n4 {

    /* renamed from: a */
    private final String f6706a;

    /* renamed from: b */
    private final boolean f6707b;

    /* renamed from: c */
    private boolean f6708c;

    /* renamed from: d */
    private boolean f6709d;

    /* renamed from: e */
    private final /* synthetic */ C2370l4 f6710e;

    public C2394n4(C2370l4 l4Var, String str, boolean z) {
        this.f6710e = l4Var;
        C2148s.m8844b(str);
        this.f6706a = str;
        this.f6707b = z;
    }

    /* renamed from: a */
    public final void mo7516a(boolean z) {
        Editor edit = this.f6710e.mo7478t().edit();
        edit.putBoolean(this.f6706a, z);
        edit.apply();
        this.f6709d = z;
    }

    /* renamed from: a */
    public final boolean mo7517a() {
        if (!this.f6708c) {
            this.f6708c = true;
            this.f6709d = this.f6710e.mo7478t().getBoolean(this.f6706a, this.f6707b);
        }
        return this.f6709d;
    }
}
