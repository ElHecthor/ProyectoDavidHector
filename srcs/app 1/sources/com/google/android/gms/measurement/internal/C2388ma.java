package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;

/* renamed from: com.google.android.gms.measurement.internal.ma */
public final class C2388ma extends C2158a {
    public static final Creator<C2388ma> CREATOR = new C2376la();

    /* renamed from: f */
    public String f6680f;

    /* renamed from: g */
    public String f6681g;

    /* renamed from: h */
    public C2478u9 f6682h;

    /* renamed from: i */
    public long f6683i;

    /* renamed from: j */
    public boolean f6684j;

    /* renamed from: k */
    public String f6685k;

    /* renamed from: l */
    public C2435r f6686l;

    /* renamed from: m */
    public long f6687m;

    /* renamed from: n */
    public C2435r f6688n;

    /* renamed from: o */
    public long f6689o;

    /* renamed from: p */
    public C2435r f6690p;

    C2388ma(C2388ma maVar) {
        C2148s.m8834a(maVar);
        this.f6680f = maVar.f6680f;
        this.f6681g = maVar.f6681g;
        this.f6682h = maVar.f6682h;
        this.f6683i = maVar.f6683i;
        this.f6684j = maVar.f6684j;
        this.f6685k = maVar.f6685k;
        this.f6686l = maVar.f6686l;
        this.f6687m = maVar.f6687m;
        this.f6688n = maVar.f6688n;
        this.f6689o = maVar.f6689o;
        this.f6690p = maVar.f6690p;
    }

    C2388ma(String str, String str2, C2478u9 u9Var, long j, boolean z, String str3, C2435r rVar, long j2, C2435r rVar2, long j3, C2435r rVar3) {
        this.f6680f = str;
        this.f6681g = str2;
        this.f6682h = u9Var;
        this.f6683i = j;
        this.f6684j = z;
        this.f6685k = str3;
        this.f6686l = rVar;
        this.f6687m = j2;
        this.f6688n = rVar2;
        this.f6689o = j3;
        this.f6690p = rVar3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8902a(parcel, 2, this.f6680f, false);
        C2161c.m8902a(parcel, 3, this.f6681g, false);
        C2161c.m8897a(parcel, 4, (Parcelable) this.f6682h, i, false);
        C2161c.m8894a(parcel, 5, this.f6683i);
        C2161c.m8904a(parcel, 6, this.f6684j);
        C2161c.m8902a(parcel, 7, this.f6685k, false);
        C2161c.m8897a(parcel, 8, (Parcelable) this.f6686l, i, false);
        C2161c.m8894a(parcel, 9, this.f6687m);
        C2161c.m8897a(parcel, 10, (Parcelable) this.f6688n, i, false);
        C2161c.m8894a(parcel, 11, this.f6689o);
        C2161c.m8897a(parcel, 12, (Parcelable) this.f6690p, i, false);
        C2161c.m8891a(parcel, a);
    }
}
