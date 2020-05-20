package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.C2148s;

/* renamed from: com.google.android.gms.measurement.internal.r4 */
public final class C2440r4 {

    /* renamed from: a */
    private final String f6832a;

    /* renamed from: b */
    private boolean f6833b;

    /* renamed from: c */
    private String f6834c;

    /* renamed from: d */
    private final /* synthetic */ C2370l4 f6835d;

    public C2440r4(C2370l4 l4Var, String str, String str2) {
        this.f6835d = l4Var;
        C2148s.m8844b(str);
        this.f6832a = str;
    }

    /* renamed from: a */
    public final String mo7589a() {
        if (!this.f6833b) {
            this.f6833b = true;
            this.f6834c = this.f6835d.mo7478t().getString(this.f6832a, null);
        }
        return this.f6834c;
    }

    /* renamed from: a */
    public final void mo7590a(String str) {
        if (this.f6835d.mo7827m().mo7108a(C2457t.f6955y0) || !C2489v9.m10027c(str, this.f6834c)) {
            Editor edit = this.f6835d.mo7478t().edit();
            edit.putString(this.f6832a, str);
            edit.apply();
            this.f6834c = str;
        }
    }
}
