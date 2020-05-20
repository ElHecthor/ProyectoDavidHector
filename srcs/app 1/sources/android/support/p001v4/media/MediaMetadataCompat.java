package android.support.p001v4.media;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p001v4.media.session.MediaSessionCompat;
import p071f.p088e.C3162a;

/* renamed from: android.support.v4.media.MediaMetadataCompat */
public final class MediaMetadataCompat implements Parcelable {
    public static final Creator<MediaMetadataCompat> CREATOR = new C0004a();

    /* renamed from: h */
    static final C3162a<String, Integer> f27h;

    /* renamed from: f */
    final Bundle f28f;

    /* renamed from: g */
    private Object f29g;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    static class C0004a implements Creator<MediaMetadataCompat> {
        C0004a() {
        }

        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        C3162a<String, Integer> aVar = new C3162a<>();
        f27h = aVar;
        Integer valueOf = Integer.valueOf(1);
        aVar.put("android.media.metadata.TITLE", valueOf);
        f27h.put("android.media.metadata.ARTIST", valueOf);
        C3162a<String, Integer> aVar2 = f27h;
        Integer valueOf2 = Integer.valueOf(0);
        aVar2.put("android.media.metadata.DURATION", valueOf2);
        f27h.put("android.media.metadata.ALBUM", valueOf);
        f27h.put("android.media.metadata.AUTHOR", valueOf);
        f27h.put("android.media.metadata.WRITER", valueOf);
        f27h.put("android.media.metadata.COMPOSER", valueOf);
        f27h.put("android.media.metadata.COMPILATION", valueOf);
        f27h.put("android.media.metadata.DATE", valueOf);
        f27h.put("android.media.metadata.YEAR", valueOf2);
        f27h.put("android.media.metadata.GENRE", valueOf);
        f27h.put("android.media.metadata.TRACK_NUMBER", valueOf2);
        f27h.put("android.media.metadata.NUM_TRACKS", valueOf2);
        f27h.put("android.media.metadata.DISC_NUMBER", valueOf2);
        f27h.put("android.media.metadata.ALBUM_ARTIST", valueOf);
        C3162a<String, Integer> aVar3 = f27h;
        Integer valueOf3 = Integer.valueOf(2);
        aVar3.put("android.media.metadata.ART", valueOf3);
        f27h.put("android.media.metadata.ART_URI", valueOf);
        f27h.put("android.media.metadata.ALBUM_ART", valueOf3);
        f27h.put("android.media.metadata.ALBUM_ART_URI", valueOf);
        C3162a<String, Integer> aVar4 = f27h;
        Integer valueOf4 = Integer.valueOf(3);
        aVar4.put("android.media.metadata.USER_RATING", valueOf4);
        f27h.put("android.media.metadata.RATING", valueOf4);
        f27h.put("android.media.metadata.DISPLAY_TITLE", valueOf);
        f27h.put("android.media.metadata.DISPLAY_SUBTITLE", valueOf);
        f27h.put("android.media.metadata.DISPLAY_DESCRIPTION", valueOf);
        f27h.put("android.media.metadata.DISPLAY_ICON", valueOf3);
        f27h.put("android.media.metadata.DISPLAY_ICON_URI", valueOf);
        f27h.put("android.media.metadata.MEDIA_ID", valueOf);
        f27h.put("android.media.metadata.BT_FOLDER_TYPE", valueOf2);
        f27h.put("android.media.metadata.MEDIA_URI", valueOf);
        f27h.put("android.media.metadata.ADVERTISEMENT", valueOf2);
        f27h.put("android.media.metadata.DOWNLOAD_STATUS", valueOf2);
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f28f = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    /* renamed from: a */
    public static MediaMetadataCompat m16a(Object obj) {
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        C0013f.m44a(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        mediaMetadataCompat.f29g = obj;
        return mediaMetadataCompat;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f28f);
    }
}
