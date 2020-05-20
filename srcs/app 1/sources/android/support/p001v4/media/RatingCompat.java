package android.support.p001v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Creator<RatingCompat> CREATOR = new C0005a();

    /* renamed from: f */
    private final int f30f;

    /* renamed from: g */
    private final float f31g;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    static class C0005a implements Creator<RatingCompat> {
        C0005a() {
        }

        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    RatingCompat(int i, float f) {
        this.f30f = i;
        this.f31g = f;
    }

    public int describeContents() {
        return this.f30f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f30f);
        sb.append(" rating=");
        float f = this.f31g;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f30f);
        parcel.writeFloat(this.f31g);
    }
}
