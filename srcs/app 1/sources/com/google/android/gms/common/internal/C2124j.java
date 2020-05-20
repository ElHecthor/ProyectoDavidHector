package com.google.android.gms.common.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.j */
public final class C2124j {

    /* renamed from: a */
    private final String f6075a;

    /* renamed from: b */
    private final String f6076b;

    public C2124j(String str) {
        this(str, null);
    }

    public C2124j(String str, String str2) {
        C2148s.m8835a(str, (Object) "log tag cannot be null");
        C2148s.m8843a(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, Integer.valueOf(23));
        this.f6075a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f6076b = null;
        } else {
            this.f6076b = str2;
        }
    }

    /* renamed from: a */
    private final String m8776a(String str) {
        String str2 = this.f6076b;
        return str2 == null ? str : str2.concat(str);
    }

    /* renamed from: a */
    public final void mo6900a(String str, String str2) {
        if (mo6902a(3)) {
            Log.d(str, m8776a(str2));
        }
    }

    /* renamed from: a */
    public final void mo6901a(String str, String str2, Throwable th) {
        if (mo6902a(6)) {
            Log.e(str, m8776a(str2), th);
        }
    }

    /* renamed from: a */
    public final boolean mo6902a(int i) {
        return Log.isLoggable(this.f6075a, i);
    }

    /* renamed from: b */
    public final void mo6903b(String str, String str2) {
        if (mo6902a(2)) {
            Log.v(str, m8776a(str2));
        }
    }

    /* renamed from: c */
    public final void mo6904c(String str, String str2) {
        if (mo6902a(5)) {
            Log.w(str, m8776a(str2));
        }
    }
}
