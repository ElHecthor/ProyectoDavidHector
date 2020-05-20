package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.material.datepicker.C2614a.C2617c;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.f */
public class C2622f implements C2617c {
    public static final Creator<C2622f> CREATOR = new C2623a();

    /* renamed from: f */
    private final long f7574f;

    /* renamed from: com.google.android.material.datepicker.f$a */
    static class C2623a implements Creator<C2622f> {
        C2623a() {
        }

        public C2622f createFromParcel(Parcel parcel) {
            return new C2622f(parcel.readLong(), null);
        }

        public C2622f[] newArray(int i) {
            return new C2622f[i];
        }
    }

    private C2622f(long j) {
        this.f7574f = j;
    }

    /* synthetic */ C2622f(long j, C2623a aVar) {
        this(j);
    }

    /* renamed from: a */
    public static C2622f m10848a(long j) {
        return new C2622f(j);
    }

    /* renamed from: d */
    public boolean mo8614d(long j) {
        return j >= this.f7574f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2622f)) {
            return false;
        }
        if (this.f7574f != ((C2622f) obj).f7574f) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f7574f)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f7574f);
    }
}
