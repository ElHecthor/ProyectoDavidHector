package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p048x.C2158a;

public abstract class StatsEvent extends C2158a implements ReflectedParcelable {
    /* renamed from: e */
    public abstract int mo6970e();

    /* renamed from: f */
    public abstract long mo6971f();

    /* renamed from: g */
    public abstract long mo6972g();

    /* renamed from: h */
    public abstract String mo6973h();

    public String toString() {
        long f = mo6971f();
        int e = mo6970e();
        long g = mo6972g();
        String h = mo6973h();
        StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 53);
        sb.append(f);
        String str = "\t";
        sb.append(str);
        sb.append(e);
        sb.append(str);
        sb.append(g);
        sb.append(h);
        return sb.toString();
    }
}
