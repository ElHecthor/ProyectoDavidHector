package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;

/* renamed from: com.google.android.gms.common.internal.t */
public class C2150t extends C2158a {
    public static final Creator<C2150t> CREATOR = new C2118g0();

    /* renamed from: f */
    private final int f6103f;

    /* renamed from: g */
    private final Account f6104g;

    /* renamed from: h */
    private final int f6105h;

    /* renamed from: i */
    private final GoogleSignInAccount f6106i;

    C2150t(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f6103f = i;
        this.f6104g = account;
        this.f6105h = i2;
        this.f6106i = googleSignInAccount;
    }

    public C2150t(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    /* renamed from: e */
    public int mo6937e() {
        return this.f6105h;
    }

    /* renamed from: f */
    public GoogleSignInAccount mo6938f() {
        return this.f6106i;
    }

    /* renamed from: i */
    public Account mo6939i() {
        return this.f6104g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8893a(parcel, 1, this.f6103f);
        C2161c.m8897a(parcel, 2, (Parcelable) mo6939i(), i, false);
        C2161c.m8893a(parcel, 3, mo6937e());
        C2161c.m8897a(parcel, 4, (Parcelable) mo6938f(), i, false);
        C2161c.m8891a(parcel, a);
    }
}
