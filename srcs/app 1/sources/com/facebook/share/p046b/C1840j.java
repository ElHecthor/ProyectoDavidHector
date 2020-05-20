package com.facebook.share.p046b;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.facebook.share.b.j */
public final class C1840j extends C1829d {
    public static final Creator<C1840j> CREATOR = new C1841a();

    /* renamed from: g */
    private final Bitmap f5453g;

    /* renamed from: h */
    private final Uri f5454h;

    /* renamed from: i */
    private final boolean f5455i;

    /* renamed from: j */
    private final String f5456j;

    /* renamed from: com.facebook.share.b.j$a */
    static class C1841a implements Creator<C1840j> {
        C1841a() {
        }

        public C1840j createFromParcel(Parcel parcel) {
            return new C1840j(parcel);
        }

        public C1840j[] newArray(int i) {
            return new C1840j[i];
        }
    }

    C1840j(Parcel parcel) {
        super(parcel);
        this.f5453g = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f5454h = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f5455i = parcel.readByte() != 0;
        this.f5456j = parcel.readString();
    }

    /* renamed from: a */
    public Uri mo6286a() {
        return this.f5454h;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f5453g, 0);
        parcel.writeParcelable(this.f5454h, 0);
        parcel.writeByte(this.f5455i ? (byte) 1 : 0);
        parcel.writeString(this.f5456j);
    }
}
