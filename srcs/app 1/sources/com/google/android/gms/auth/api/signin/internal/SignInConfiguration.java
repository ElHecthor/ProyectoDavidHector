package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;

public final class SignInConfiguration extends C2158a implements ReflectedParcelable {
    public static final Creator<SignInConfiguration> CREATOR = new C1977x();

    /* renamed from: f */
    private final String f5761f;

    /* renamed from: g */
    private GoogleSignInOptions f5762g;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        C2148s.m8844b(str);
        this.f5761f = str;
        this.f5762g = googleSignInOptions;
    }

    /* renamed from: e */
    public final GoogleSignInOptions mo6527e() {
        return this.f5762g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f5761f.equals(signInConfiguration.f5761f)) {
            GoogleSignInOptions googleSignInOptions = this.f5762g;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f5762g;
            if (googleSignInOptions != null ? googleSignInOptions.equals(googleSignInOptions2) : googleSignInOptions2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        C1955b bVar = new C1955b();
        bVar.mo6538a((Object) this.f5761f);
        bVar.mo6538a((Object) this.f5762g);
        return bVar.mo6537a();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8902a(parcel, 2, this.f5761f, false);
        C2161c.m8897a(parcel, 5, (Parcelable) this.f5762g, i, false);
        C2161c.m8891a(parcel, a);
    }
}
