package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.p048x.C2159b;

/* renamed from: com.google.android.gms.auth.api.signin.internal.x */
public final class C1977x implements Creator<SignInConfiguration> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2159b.m8873b(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < b) {
            int a = C2159b.m8868a(parcel);
            int a2 = C2159b.m8867a(a);
            if (a2 == 2) {
                str = C2159b.m8874b(parcel, a);
            } else if (a2 != 5) {
                C2159b.m8889o(parcel, a);
            } else {
                googleSignInOptions = (GoogleSignInOptions) C2159b.m8870a(parcel, a, GoogleSignInOptions.CREATOR);
            }
        }
        C2159b.m8878d(parcel, b);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInConfiguration[i];
    }
}
