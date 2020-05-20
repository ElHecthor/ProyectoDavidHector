package com.facebook.share.p046b;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.facebook.share.b.c */
public final class C1827c extends C1823a<C1827c, Object> {
    public static final Creator<C1827c> CREATOR = new C1828a();
    @Deprecated

    /* renamed from: l */
    private final String f5444l;
    @Deprecated

    /* renamed from: m */
    private final String f5445m;
    @Deprecated

    /* renamed from: n */
    private final Uri f5446n;

    /* renamed from: o */
    private final String f5447o;

    /* renamed from: com.facebook.share.b.c$a */
    static class C1828a implements Creator<C1827c> {
        C1828a() {
        }

        public C1827c createFromParcel(Parcel parcel) {
            return new C1827c(parcel);
        }

        public C1827c[] newArray(int i) {
            return new C1827c[i];
        }
    }

    C1827c(Parcel parcel) {
        super(parcel);
        this.f5444l = parcel.readString();
        this.f5445m = parcel.readString();
        this.f5446n = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f5447o = parcel.readString();
    }

    /* renamed from: c */
    public String mo6262c() {
        return this.f5447o;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f5444l);
        parcel.writeString(this.f5445m);
        parcel.writeParcelable(this.f5446n, 0);
        parcel.writeString(this.f5447o);
    }
}
