package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;

/* renamed from: com.google.firebase.messaging.b */
public final class C3051b extends C2158a {
    public static final Creator<C3051b> CREATOR = new C3078z();

    /* renamed from: f */
    Bundle f8673f;

    public C3051b(Bundle bundle) {
        this.f8673f = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8895a(parcel, 2, this.f8673f, false);
        C2161c.m8891a(parcel, a);
    }
}
