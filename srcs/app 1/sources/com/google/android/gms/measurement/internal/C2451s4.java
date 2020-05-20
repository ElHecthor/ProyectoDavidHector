package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import android.util.Pair;
import com.google.android.gms.common.internal.C2148s;

/* renamed from: com.google.android.gms.measurement.internal.s4 */
public final class C2451s4 {

    /* renamed from: a */
    private final String f6849a;

    /* renamed from: b */
    private final String f6850b;

    /* renamed from: c */
    private final String f6851c;

    /* renamed from: d */
    private final long f6852d;

    /* renamed from: e */
    private final /* synthetic */ C2370l4 f6853e;

    private C2451s4(C2370l4 l4Var, String str, long j) {
        this.f6853e = l4Var;
        C2148s.m8844b(str);
        C2148s.m8841a(j > 0);
        this.f6849a = String.valueOf(str).concat(":start");
        this.f6850b = String.valueOf(str).concat(":count");
        this.f6851c = String.valueOf(str).concat(":value");
        this.f6852d = j;
    }

    /* renamed from: b */
    private final void m9819b() {
        this.f6853e.mo7274c();
        long b = this.f6853e.mo7095g().mo6988b();
        Editor edit = this.f6853e.mo7478t().edit();
        edit.remove(this.f6850b);
        edit.remove(this.f6851c);
        edit.putLong(this.f6849a, b);
        edit.apply();
    }

    /* renamed from: c */
    private final long m9820c() {
        return this.f6853e.mo7478t().getLong(this.f6849a, 0);
    }

    /* renamed from: a */
    public final Pair<String, Long> mo7617a() {
        long j;
        this.f6853e.mo7274c();
        this.f6853e.mo7274c();
        long c = m9820c();
        if (c == 0) {
            m9819b();
            j = 0;
        } else {
            j = Math.abs(c - this.f6853e.mo7095g().mo6988b());
        }
        long j2 = this.f6852d;
        if (j < j2) {
            return null;
        }
        if (j > (j2 << 1)) {
            m9819b();
            return null;
        }
        String string = this.f6853e.mo7478t().getString(this.f6851c, null);
        long j3 = this.f6853e.mo7478t().getLong(this.f6850b, 0);
        m9819b();
        return (string == null || j3 <= 0) ? C2370l4.f6615E : new Pair<>(string, Long.valueOf(j3));
    }

    /* renamed from: a */
    public final void mo7618a(String str, long j) {
        this.f6853e.mo7274c();
        if (m9820c() == 0) {
            m9819b();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f6853e.mo7478t().getLong(this.f6850b, 0);
        if (j2 <= 0) {
            Editor edit = this.f6853e.mo7478t().edit();
            edit.putString(this.f6851c, str);
            edit.putLong(this.f6850b, 1);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.f6853e.mo7825k().mo7712u().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        Editor edit2 = this.f6853e.mo7478t().edit();
        if (z) {
            edit2.putString(this.f6851c, str);
        }
        edit2.putLong(this.f6850b, j3);
        edit2.apply();
    }
}
