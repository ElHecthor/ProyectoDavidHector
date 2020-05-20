package android.support.p001v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: android.support.v4.media.d */
class C0009d {

    /* renamed from: android.support.v4.media.d$a */
    static class C0010a {
        /* renamed from: a */
        public static Object m33a() {
            return new Builder();
        }

        /* renamed from: a */
        public static Object m34a(Object obj) {
            return ((Builder) obj).build();
        }

        /* renamed from: a */
        public static void m35a(Object obj, Bitmap bitmap) {
            ((Builder) obj).setIconBitmap(bitmap);
        }

        /* renamed from: a */
        public static void m36a(Object obj, Uri uri) {
            ((Builder) obj).setIconUri(uri);
        }

        /* renamed from: a */
        public static void m37a(Object obj, Bundle bundle) {
            ((Builder) obj).setExtras(bundle);
        }

        /* renamed from: a */
        public static void m38a(Object obj, CharSequence charSequence) {
            ((Builder) obj).setDescription(charSequence);
        }

        /* renamed from: a */
        public static void m39a(Object obj, String str) {
            ((Builder) obj).setMediaId(str);
        }

        /* renamed from: b */
        public static void m40b(Object obj, CharSequence charSequence) {
            ((Builder) obj).setSubtitle(charSequence);
        }

        /* renamed from: c */
        public static void m41c(Object obj, CharSequence charSequence) {
            ((Builder) obj).setTitle(charSequence);
        }
    }

    /* renamed from: a */
    public static CharSequence m24a(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    /* renamed from: a */
    public static Object m25a(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m26a(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    /* renamed from: b */
    public static Bundle m27b(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }

    /* renamed from: c */
    public static Bitmap m28c(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    /* renamed from: d */
    public static Uri m29d(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    /* renamed from: e */
    public static String m30e(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    /* renamed from: f */
    public static CharSequence m31f(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    /* renamed from: g */
    public static CharSequence m32g(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }
}
