package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.p048x.C2159b;

/* renamed from: com.google.android.gms.common.internal.g0 */
public final class C2118g0 implements Creator<C2150t> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = C2159b.m8873b(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C2159b.m8868a(parcel);
            int a2 = C2159b.m8867a(a);
            if (a2 == 1) {
                i = C2159b.m8885k(parcel, a);
            } else if (a2 == 2) {
                account = (Account) C2159b.m8870a(parcel, a, Account.CREATOR);
            } else if (a2 == 3) {
                i2 = C2159b.m8885k(parcel, a);
            } else if (a2 != 4) {
                C2159b.m8889o(parcel, a);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C2159b.m8870a(parcel, a, GoogleSignInAccount.CREATOR);
            }
        }
        C2159b.m8878d(parcel, b);
        return new C2150t(i, account, i2, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2150t[i];
    }
}
