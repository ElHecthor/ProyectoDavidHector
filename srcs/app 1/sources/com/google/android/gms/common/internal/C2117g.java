package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C2082d;
import com.google.android.gms.common.C2087f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C2128l.C2129a;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;

/* renamed from: com.google.android.gms.common.internal.g */
public class C2117g extends C2158a {
    public static final Creator<C2117g> CREATOR = new C2127k0();

    /* renamed from: f */
    private final int f6049f;

    /* renamed from: g */
    private final int f6050g;

    /* renamed from: h */
    private int f6051h;

    /* renamed from: i */
    String f6052i;

    /* renamed from: j */
    IBinder f6053j;

    /* renamed from: k */
    Scope[] f6054k;

    /* renamed from: l */
    Bundle f6055l;

    /* renamed from: m */
    Account f6056m;

    /* renamed from: n */
    C2082d[] f6057n;

    /* renamed from: o */
    C2082d[] f6058o;

    /* renamed from: p */
    private boolean f6059p;

    /* renamed from: q */
    private int f6060q;

    public C2117g(int i) {
        this.f6049f = 4;
        this.f6051h = C2087f.f5982a;
        this.f6050g = i;
        this.f6059p = true;
    }

    C2117g(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C2082d[] dVarArr, C2082d[] dVarArr2, boolean z, int i4) {
        this.f6049f = i;
        this.f6050g = i2;
        this.f6051h = i3;
        String str2 = "com.google.android.gms";
        if (str2.equals(str)) {
            this.f6052i = str2;
        } else {
            this.f6052i = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                account2 = C2091a.m8641a(C2129a.m8785a(iBinder));
            }
            this.f6056m = account2;
        } else {
            this.f6053j = iBinder;
            this.f6056m = account;
        }
        this.f6054k = scopeArr;
        this.f6055l = bundle;
        this.f6057n = dVarArr;
        this.f6058o = dVarArr2;
        this.f6059p = z;
        this.f6060q = i4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8893a(parcel, 1, this.f6049f);
        C2161c.m8893a(parcel, 2, this.f6050g);
        C2161c.m8893a(parcel, 3, this.f6051h);
        C2161c.m8902a(parcel, 4, this.f6052i, false);
        C2161c.m8896a(parcel, 5, this.f6053j, false);
        C2161c.m8905a(parcel, 6, (T[]) this.f6054k, i, false);
        C2161c.m8895a(parcel, 7, this.f6055l, false);
        C2161c.m8897a(parcel, 8, (Parcelable) this.f6056m, i, false);
        C2161c.m8905a(parcel, 10, (T[]) this.f6057n, i, false);
        C2161c.m8905a(parcel, 11, (T[]) this.f6058o, i, false);
        C2161c.m8904a(parcel, 12, this.f6059p);
        C2161c.m8893a(parcel, 13, this.f6060q);
        C2161c.m8891a(parcel, a);
    }
}
