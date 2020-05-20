package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p048x.C2159b;

/* renamed from: com.google.android.gms.auth.api.signin.i */
public final class C1952i implements Creator<SignInAccount> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2159b.m8873b(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = str;
        while (parcel.dataPosition() < b) {
            int a = C2159b.m8868a(parcel);
            int a2 = C2159b.m8867a(a);
            if (a2 == 4) {
                str = C2159b.m8874b(parcel, a);
            } else if (a2 == 7) {
                googleSignInAccount = (GoogleSignInAccount) C2159b.m8870a(parcel, a, GoogleSignInAccount.CREATOR);
            } else if (a2 != 8) {
                C2159b.m8889o(parcel, a);
            } else {
                str2 = C2159b.m8874b(parcel, a);
            }
        }
        C2159b.m8878d(parcel, b);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }
}
