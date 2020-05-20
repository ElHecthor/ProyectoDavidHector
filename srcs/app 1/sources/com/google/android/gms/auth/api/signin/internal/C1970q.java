package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import p147g.p156d.p157a.p167b.p173d.p175b.C3863c;

/* renamed from: com.google.android.gms.auth.api.signin.internal.q */
public abstract class C1970q extends C3863c implements C1971r {
    public C1970q() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo6562a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo6563g();
        } else if (i != 2) {
            return false;
        } else {
            mo6564h();
        }
        return true;
    }
}
