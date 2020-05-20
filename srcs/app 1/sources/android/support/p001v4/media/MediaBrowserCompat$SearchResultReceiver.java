package android.support.p001v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p001v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import p067e.p068a.p069a.p070a.C3089b;

/* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
class MediaBrowserCompat$SearchResultReceiver extends C3089b {

    /* renamed from: h */
    private final String f7h;

    /* renamed from: i */
    private final Bundle f8i;

    /* renamed from: j */
    private final C0008c f9j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1a(int i, Bundle bundle) {
        MediaSessionCompat.m52a(bundle);
        if (i == 0 && bundle != null) {
            String str = "search_results";
            if (bundle.containsKey(str)) {
                Parcelable[] parcelableArray = bundle.getParcelableArray(str);
                ArrayList arrayList = null;
                if (parcelableArray != null) {
                    arrayList = new ArrayList();
                    for (Parcelable parcelable : parcelableArray) {
                        arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
                    }
                }
                this.f9j.mo37a(this.f7h, this.f8i, arrayList);
                return;
            }
        }
        this.f9j.mo36a(this.f7h, this.f8i);
    }
}
