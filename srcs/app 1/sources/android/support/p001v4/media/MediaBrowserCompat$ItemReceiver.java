package android.support.p001v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p001v4.media.session.MediaSessionCompat;
import p067e.p068a.p069a.p070a.C3089b;

/* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
class MediaBrowserCompat$ItemReceiver extends C3089b {

    /* renamed from: h */
    private final String f3h;

    /* renamed from: i */
    private final C0007b f4i;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1a(int i, Bundle bundle) {
        MediaSessionCompat.m52a(bundle);
        if (i == 0 && bundle != null) {
            String str = "media_item";
            if (bundle.containsKey(str)) {
                Parcelable parcelable = bundle.getParcelable(str);
                if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
                    this.f4i.mo34a((MediaBrowserCompat$MediaItem) parcelable);
                } else {
                    this.f4i.mo35a(this.f3h);
                }
                return;
            }
        }
        this.f4i.mo35a(this.f3h);
    }
}
