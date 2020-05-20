package android.support.p001v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.C0023b.C0024a;
import android.support.p001v4.media.session.MediaSessionCompat.QueueItem;
import android.support.p001v4.media.session.MediaSessionCompat.Token;
import android.util.Log;
import androidx.core.app.C0353e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a */
    final Object f32a;

    /* renamed from: b */
    private final List<C0026c> f33b;

    /* renamed from: c */
    private HashMap<C0026c, C0014a> f34c;

    /* renamed from: d */
    final Token f35d;

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: f */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f36f;

        /* access modifiers changed from: protected */
        public void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = (MediaControllerCompat$MediaControllerImplApi21) this.f36f.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.f32a) {
                    mediaControllerCompat$MediaControllerImplApi21.f35d.mo57a(C0024a.m74a(C0353e.m1796a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerCompat$MediaControllerImplApi21.f35d.mo56a(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                    mediaControllerCompat$MediaControllerImplApi21.mo38a();
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
    private static class C0014a extends C0029c {
        C0014a(C0026c cVar) {
            super(cVar);
        }

        /* renamed from: a */
        public void mo40a(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        /* renamed from: a */
        public void mo41a(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        /* renamed from: a */
        public void mo42a(CharSequence charSequence) {
            throw new AssertionError();
        }

        /* renamed from: a */
        public void mo43a(List<QueueItem> list) {
            throw new AssertionError();
        }

        /* renamed from: b */
        public void mo44b(Bundle bundle) {
            throw new AssertionError();
        }

        /* renamed from: f */
        public void mo45f() {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38a() {
        if (this.f35d.mo55a() != null) {
            for (C0026c cVar : this.f33b) {
                C0014a aVar = new C0014a(cVar);
                this.f34c.put(cVar, aVar);
                cVar.f68c = aVar;
                try {
                    this.f35d.mo55a().mo87a(aVar);
                    cVar.mo90a(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            }
            this.f33b.clear();
        }
    }
}
