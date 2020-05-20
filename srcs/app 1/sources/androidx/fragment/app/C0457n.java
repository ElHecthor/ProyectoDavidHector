package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.n */
final class C0457n implements Parcelable {
    public static final Creator<C0457n> CREATOR = new C0458a();

    /* renamed from: f */
    ArrayList<C0461p> f2049f;

    /* renamed from: g */
    ArrayList<String> f2050g;

    /* renamed from: h */
    C0423b[] f2051h;

    /* renamed from: i */
    int f2052i;

    /* renamed from: j */
    String f2053j = null;

    /* renamed from: androidx.fragment.app.n$a */
    static class C0458a implements Creator<C0457n> {
        C0458a() {
        }

        public C0457n createFromParcel(Parcel parcel) {
            return new C0457n(parcel);
        }

        public C0457n[] newArray(int i) {
            return new C0457n[i];
        }
    }

    public C0457n() {
    }

    public C0457n(Parcel parcel) {
        this.f2049f = parcel.createTypedArrayList(C0461p.CREATOR);
        this.f2050g = parcel.createStringArrayList();
        this.f2051h = (C0423b[]) parcel.createTypedArray(C0423b.CREATOR);
        this.f2052i = parcel.readInt();
        this.f2053j = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f2049f);
        parcel.writeStringList(this.f2050g);
        parcel.writeTypedArray(this.f2051h, i);
        parcel.writeInt(this.f2052i);
        parcel.writeString(this.f2053j);
    }
}
