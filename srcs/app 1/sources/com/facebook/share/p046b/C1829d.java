package com.facebook.share.p046b;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.facebook.share.b.d */
public abstract class C1829d implements C1830e {

    /* renamed from: f */
    private final Bundle f5448f;

    C1829d(Parcel parcel) {
        this.f5448f = parcel.readBundle();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f5448f);
    }
}
