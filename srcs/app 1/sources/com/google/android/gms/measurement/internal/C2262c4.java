package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.c4 */
public final class C2262c4 {

    /* renamed from: a */
    public String f6306a;

    /* renamed from: b */
    public String f6307b;

    /* renamed from: c */
    public long f6308c;

    /* renamed from: d */
    public Bundle f6309d;

    public C2262c4(String str, String str2, Bundle bundle, long j) {
        this.f6306a = str;
        this.f6307b = str2;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f6309d = bundle;
        this.f6308c = j;
    }

    public final String toString() {
        String str = this.f6307b;
        String str2 = this.f6306a;
        String valueOf = String.valueOf(this.f6309d);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }
}
