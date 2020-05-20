package android.support.p001v4.media;

import android.os.Bundle;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.util.Log;
import p067e.p068a.p069a.p070a.C3089b;

/* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
class MediaBrowserCompat$CustomActionResultReceiver extends C3089b {

    /* renamed from: h */
    private final String f0h;

    /* renamed from: i */
    private final Bundle f1i;

    /* renamed from: j */
    private final C0006a f2j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1a(int i, Bundle bundle) {
        if (this.f2j != null) {
            MediaSessionCompat.m52a(bundle);
            if (i == -1) {
                this.f2j.mo31a(this.f0h, this.f1i, bundle);
            } else if (i == 0) {
                this.f2j.mo33c(this.f0h, this.f1i, bundle);
            } else if (i != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown result code: ");
                sb.append(i);
                sb.append(" (extras=");
                sb.append(this.f1i);
                sb.append(", resultData=");
                sb.append(bundle);
                sb.append(")");
                Log.w("MediaBrowserCompat", sb.toString());
            } else {
                this.f2j.mo32b(this.f0h, this.f1i, bundle);
            }
        }
    }
}
