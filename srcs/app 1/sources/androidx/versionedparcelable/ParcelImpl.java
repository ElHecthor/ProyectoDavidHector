package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Creator<ParcelImpl> CREATOR = new C0775a();

    /* renamed from: f */
    private final C0778c f3048f;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    static class C0775a implements Creator<ParcelImpl> {
        C0775a() {
        }

        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f3048f = new C0777b(parcel).mo4321j();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C0777b(parcel).mo4294a(this.f3048f);
    }
}
