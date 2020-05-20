package com.facebook.share.p046b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.p046b.C1831f.C1833b;

/* renamed from: com.facebook.share.b.g */
public final class C1834g extends C1823a<C1834g, Object> {
    public static final Creator<C1834g> CREATOR = new C1835a();

    /* renamed from: l */
    private final C1831f f5449l;

    /* renamed from: m */
    private final String f5450m;

    /* renamed from: com.facebook.share.b.g$a */
    static class C1835a implements Creator<C1834g> {
        C1835a() {
        }

        public C1834g createFromParcel(Parcel parcel) {
            return new C1834g(parcel);
        }

        public C1834g[] newArray(int i) {
            return new C1834g[i];
        }
    }

    C1834g(Parcel parcel) {
        super(parcel);
        this.f5449l = new C1833b().mo6269a(parcel).mo6272a();
        this.f5450m = parcel.readString();
    }

    /* renamed from: c */
    public C1831f mo6273c() {
        return this.f5449l;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f5449l, 0);
        parcel.writeString(this.f5450m);
    }
}
