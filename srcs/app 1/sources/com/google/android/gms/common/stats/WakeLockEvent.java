package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.p048x.C2161c;
import java.util.List;

public final class WakeLockEvent extends StatsEvent {
    public static final Creator<WakeLockEvent> CREATOR = new C2183e();

    /* renamed from: f */
    private final int f6141f;

    /* renamed from: g */
    private final long f6142g;

    /* renamed from: h */
    private int f6143h;

    /* renamed from: i */
    private final String f6144i;

    /* renamed from: j */
    private final String f6145j;

    /* renamed from: k */
    private final String f6146k;

    /* renamed from: l */
    private final int f6147l;

    /* renamed from: m */
    private final List<String> f6148m;

    /* renamed from: n */
    private final String f6149n;

    /* renamed from: o */
    private final long f6150o;

    /* renamed from: p */
    private int f6151p;

    /* renamed from: q */
    private final String f6152q;

    /* renamed from: r */
    private final float f6153r;

    /* renamed from: s */
    private final long f6154s;

    /* renamed from: t */
    private final boolean f6155t;

    /* renamed from: u */
    private long f6156u;

    WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.f6141f = i;
        this.f6142g = j;
        this.f6143h = i2;
        this.f6144i = str;
        this.f6145j = str3;
        this.f6146k = str5;
        this.f6147l = i3;
        this.f6156u = -1;
        this.f6148m = list;
        this.f6149n = str2;
        this.f6150o = j2;
        this.f6151p = i4;
        this.f6152q = str4;
        this.f6153r = f;
        this.f6154s = j3;
        this.f6155t = z;
    }

    public WakeLockEvent(long j, int i, String str, int i2, List<String> list, String str2, long j2, int i3, String str3, String str4, float f, long j3, String str5, boolean z) {
        this(2, j, i, str, i2, list, str2, j2, i3, str3, str4, f, j3, str5, z);
    }

    /* renamed from: e */
    public final int mo6970e() {
        return this.f6143h;
    }

    /* renamed from: f */
    public final long mo6971f() {
        return this.f6142g;
    }

    /* renamed from: g */
    public final long mo6972g() {
        return this.f6156u;
    }

    /* renamed from: h */
    public final String mo6973h() {
        String str = this.f6144i;
        int i = this.f6147l;
        List<String> list = this.f6148m;
        String str2 = "";
        String join = list == null ? str2 : TextUtils.join(",", list);
        int i2 = this.f6151p;
        String str3 = this.f6145j;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = this.f6152q;
        if (str4 == null) {
            str4 = str2;
        }
        float f = this.f6153r;
        String str5 = this.f6146k;
        if (str5 != null) {
            str2 = str5;
        }
        boolean z = this.f6155t;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(join).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str2).length());
        String str6 = "\t";
        sb.append(str6);
        sb.append(str);
        sb.append(str6);
        sb.append(i);
        sb.append(str6);
        sb.append(join);
        sb.append(str6);
        sb.append(i2);
        sb.append(str6);
        sb.append(str3);
        sb.append(str6);
        sb.append(str4);
        sb.append(str6);
        sb.append(f);
        sb.append(str6);
        sb.append(str2);
        sb.append(str6);
        sb.append(z);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8893a(parcel, 1, this.f6141f);
        C2161c.m8894a(parcel, 2, mo6971f());
        C2161c.m8902a(parcel, 4, this.f6144i, false);
        C2161c.m8893a(parcel, 5, this.f6147l);
        C2161c.m8903a(parcel, 6, this.f6148m, false);
        C2161c.m8894a(parcel, 8, this.f6150o);
        C2161c.m8902a(parcel, 10, this.f6145j, false);
        C2161c.m8893a(parcel, 11, mo6970e());
        C2161c.m8902a(parcel, 12, this.f6149n, false);
        C2161c.m8902a(parcel, 13, this.f6152q, false);
        C2161c.m8893a(parcel, 14, this.f6151p);
        C2161c.m8892a(parcel, 15, this.f6153r);
        C2161c.m8894a(parcel, 16, this.f6154s);
        C2161c.m8902a(parcel, 17, this.f6146k, false);
        C2161c.m8904a(parcel, 18, this.f6155t);
        C2161c.m8891a(parcel, a);
    }
}
