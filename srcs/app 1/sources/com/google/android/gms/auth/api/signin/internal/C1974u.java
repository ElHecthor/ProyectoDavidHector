package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p147g.p156d.p157a.p167b.p173d.p175b.C3864d;
import p147g.p156d.p157a.p167b.p173d.p175b.C3865e;

/* renamed from: com.google.android.gms.auth.api.signin.internal.u */
public final class C1974u extends C3864d implements C1975v {
    C1974u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void mo6565a(C1973t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel t = mo12017t();
        C3865e.m15611a(t, (IInterface) tVar);
        C3865e.m15612a(t, (Parcelable) googleSignInOptions);
        mo12015a(103, t);
    }

    /* renamed from: b */
    public final void mo6566b(C1973t tVar, GoogleSignInOptions googleSignInOptions) {
        Parcel t = mo12017t();
        C3865e.m15611a(t, (IInterface) tVar);
        C3865e.m15612a(t, (Parcelable) googleSignInOptions);
        mo12015a(102, t);
    }
}
