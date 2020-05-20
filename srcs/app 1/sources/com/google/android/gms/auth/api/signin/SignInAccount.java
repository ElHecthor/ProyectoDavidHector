package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;
import javax.annotation.Nullable;

public class SignInAccount extends C2158a implements ReflectedParcelable {
    public static final Creator<SignInAccount> CREATOR = new C1952i();
    @Deprecated

    /* renamed from: f */
    private String f5748f;

    /* renamed from: g */
    private GoogleSignInAccount f5749g;
    @Deprecated

    /* renamed from: h */
    private String f5750h;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f5749g = googleSignInAccount;
        C2148s.m8836a(str, (Object) "8.3 and 8.4 SDKs require non-null email");
        this.f5748f = str;
        C2148s.m8836a(str2, (Object) "8.3 and 8.4 SDKs require non-null userId");
        this.f5750h = str2;
    }

    @Nullable
    /* renamed from: d */
    public final GoogleSignInAccount mo6511d() {
        return this.f5749g;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8902a(parcel, 4, this.f5748f, false);
        C2161c.m8897a(parcel, 7, (Parcelable) this.f5749g, i, false);
        C2161c.m8902a(parcel, 8, this.f5750h, false);
        C2161c.m8891a(parcel, a);
    }
}
