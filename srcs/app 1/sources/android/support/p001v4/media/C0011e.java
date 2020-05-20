package android.support.p001v4.media;

import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;

/* renamed from: android.support.v4.media.e */
class C0011e {

    /* renamed from: android.support.v4.media.e$a */
    static class C0012a {
        /* renamed from: a */
        public static void m43a(Object obj, Uri uri) {
            ((Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: a */
    public static Uri m42a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
