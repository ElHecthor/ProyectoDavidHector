package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C2082d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.p048x.C2159b;

/* renamed from: com.google.android.gms.common.internal.k0 */
public final class C2127k0 implements Creator<C2117g> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = C2159b.m8873b(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        C2082d[] dVarArr = null;
        C2082d[] dVarArr2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = C2159b.m8868a(parcel);
            switch (C2159b.m8867a(a)) {
                case 1:
                    i = C2159b.m8885k(parcel2, a);
                    break;
                case 2:
                    i2 = C2159b.m8885k(parcel2, a);
                    break;
                case 3:
                    i3 = C2159b.m8885k(parcel2, a);
                    break;
                case 4:
                    str = C2159b.m8874b(parcel2, a);
                    break;
                case 5:
                    iBinder = C2159b.m8884j(parcel2, a);
                    break;
                case 6:
                    scopeArr = (Scope[]) C2159b.m8875b(parcel2, a, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C2159b.m8869a(parcel2, a);
                    break;
                case 8:
                    account = (Account) C2159b.m8870a(parcel2, a, Account.CREATOR);
                    break;
                case 10:
                    dVarArr = (C2082d[]) C2159b.m8875b(parcel2, a, C2082d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (C2082d[]) C2159b.m8875b(parcel2, a, C2082d.CREATOR);
                    break;
                case 12:
                    z = C2159b.m8879e(parcel2, a);
                    break;
                case 13:
                    i4 = C2159b.m8885k(parcel2, a);
                    break;
                default:
                    C2159b.m8889o(parcel2, a);
                    break;
            }
        }
        C2159b.m8878d(parcel2, b);
        C2117g gVar = new C2117g(i, i2, i3, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z, i4);
        return gVar;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C2117g[i];
    }
}
