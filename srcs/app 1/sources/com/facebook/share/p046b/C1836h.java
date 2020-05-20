package com.facebook.share.p046b;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.facebook.share.b.h */
public final class C1836h extends C1838i<C1836h, Object> {
    public static final Creator<C1836h> CREATOR = new C1837a();

    /* renamed from: com.facebook.share.b.h$a */
    static class C1837a implements Creator<C1836h> {
        C1837a() {
        }

        public C1836h createFromParcel(Parcel parcel) {
            return new C1836h(parcel);
        }

        public C1836h[] newArray(int i) {
            return new C1836h[i];
        }
    }

    C1836h(Parcel parcel) {
        super(parcel);
    }
}
