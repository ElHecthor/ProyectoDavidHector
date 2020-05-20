package android.support.p001v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Creator<ParcelableVolumeInfo> CREATOR = new C0018a();

    /* renamed from: f */
    public int f43f;

    /* renamed from: g */
    public int f44g;

    /* renamed from: h */
    public int f45h;

    /* renamed from: i */
    public int f46i;

    /* renamed from: j */
    public int f47j;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    static class C0018a implements Creator<ParcelableVolumeInfo> {
        C0018a() {
        }

        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f43f = parcel.readInt();
        this.f45h = parcel.readInt();
        this.f46i = parcel.readInt();
        this.f47j = parcel.readInt();
        this.f44g = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f43f);
        parcel.writeInt(this.f45h);
        parcel.writeInt(this.f46i);
        parcel.writeInt(this.f47j);
        parcel.writeInt(this.f44g);
    }
}
