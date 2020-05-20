package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.C2148s;

/* renamed from: com.google.android.gms.measurement.internal.p4 */
public final class C2418p4 {

    /* renamed from: a */
    private final String f6781a;

    /* renamed from: b */
    private final long f6782b;

    /* renamed from: c */
    private boolean f6783c;

    /* renamed from: d */
    private long f6784d;

    /* renamed from: e */
    private final /* synthetic */ C2370l4 f6785e;

    public C2418p4(C2370l4 l4Var, String str, long j) {
        this.f6785e = l4Var;
        C2148s.m8844b(str);
        this.f6781a = str;
        this.f6782b = j;
    }

    /* renamed from: a */
    public final long mo7570a() {
        if (!this.f6783c) {
            this.f6783c = true;
            this.f6784d = this.f6785e.mo7478t().getLong(this.f6781a, this.f6782b);
        }
        return this.f6784d;
    }

    /* renamed from: a */
    public final void mo7571a(long j) {
        Editor edit = this.f6785e.mo7478t().edit();
        edit.putLong(this.f6781a, j);
        edit.apply();
        this.f6784d = j;
    }
}
