package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p147g.p156d.p157a.p167b.p173d.p175b.C3863c;
import p147g.p156d.p157a.p167b.p173d.p175b.C3865e;

/* renamed from: com.google.android.gms.auth.api.signin.internal.s */
public abstract class C1972s extends C3863c implements C1973t {
    public C1972s() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo6562a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 101:
                mo6548a((GoogleSignInAccount) C3865e.m15610a(parcel, GoogleSignInAccount.CREATOR), (Status) C3865e.m15610a(parcel, Status.CREATOR));
                throw null;
            case 102:
                mo6549b((Status) C3865e.m15610a(parcel, Status.CREATOR));
                break;
            case 103:
                mo6550c((Status) C3865e.m15610a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
