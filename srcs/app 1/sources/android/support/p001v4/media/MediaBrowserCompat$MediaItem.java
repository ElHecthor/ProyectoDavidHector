package android.support.p001v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0001a();

    /* renamed from: f */
    private final int f5f;

    /* renamed from: g */
    private final MediaDescriptionCompat f6g;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
    static class C0001a implements Creator<MediaBrowserCompat$MediaItem> {
        C0001a() {
        }

        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        public MediaBrowserCompat$MediaItem[] newArray(int i) {
            return new MediaBrowserCompat$MediaItem[i];
        }
    }

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f5f = parcel.readInt();
        this.f6g = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediaItem{");
        sb.append("mFlags=");
        sb.append(this.f5f);
        sb.append(", mDescription=");
        sb.append(this.f6g);
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5f);
        this.f6g.writeToParcel(parcel, i);
    }
}
