package android.support.p001v4.media.session;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.support.p001v4.media.MediaMetadataCompat;
import android.support.p001v4.media.session.C0021a.C0022a;
import android.support.p001v4.media.session.C0031e.C0032a;
import android.support.p001v4.media.session.MediaSessionCompat.QueueItem;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
public abstract class C0026c implements DeathRecipient {

    /* renamed from: a */
    final Object f66a;

    /* renamed from: b */
    C0027a f67b;

    /* renamed from: c */
    C0021a f68c;

    /* renamed from: android.support.v4.media.session.c$a */
    private class C0027a extends Handler {
    }

    /* renamed from: android.support.v4.media.session.c$b */
    private static class C0028b implements C0032a {

        /* renamed from: a */
        private final WeakReference<C0026c> f69a;

        C0028b(C0026c cVar) {
            this.f69a = new WeakReference<>(cVar);
        }

        /* renamed from: a */
        public void mo99a(int i, int i2, int i3, int i4, int i5) {
            C0026c cVar = (C0026c) this.f69a.get();
            if (cVar != null) {
                C0030d dVar = new C0030d(i, i2, i3, i4, i5);
                cVar.mo94a(dVar);
            }
        }

        /* renamed from: a */
        public void mo100a(CharSequence charSequence) {
            C0026c cVar = (C0026c) this.f69a.get();
            if (cVar != null) {
                cVar.mo95a(charSequence);
            }
        }

        /* renamed from: a */
        public void mo101a(Object obj) {
            C0026c cVar = (C0026c) this.f69a.get();
            if (cVar != null) {
                cVar.mo92a(MediaMetadataCompat.m16a(obj));
            }
        }

        /* renamed from: a */
        public void mo102a(String str, Bundle bundle) {
            C0026c cVar = (C0026c) this.f69a.get();
            if (cVar == null) {
                return;
            }
            if (cVar.f68c == null || VERSION.SDK_INT >= 23) {
                cVar.mo96a(str, bundle);
            }
        }

        /* renamed from: a */
        public void mo103a(List<?> list) {
            C0026c cVar = (C0026c) this.f69a.get();
            if (cVar != null) {
                cVar.mo97a(QueueItem.m54a(list));
            }
        }

        /* renamed from: b */
        public void mo104b(Bundle bundle) {
            C0026c cVar = (C0026c) this.f69a.get();
            if (cVar != null) {
                cVar.mo91a(bundle);
            }
        }

        /* renamed from: b */
        public void mo105b(Object obj) {
            C0026c cVar = (C0026c) this.f69a.get();
            if (cVar != null && cVar.f68c == null) {
                cVar.mo93a(PlaybackStateCompat.m58a(obj));
            }
        }

        /* renamed from: f */
        public void mo106f() {
            C0026c cVar = (C0026c) this.f69a.get();
            if (cVar != null) {
                cVar.mo89a();
            }
        }
    }

    /* renamed from: android.support.v4.media.session.c$c */
    private static class C0029c extends C0022a {

        /* renamed from: a */
        private final WeakReference<C0026c> f70a;

        C0029c(C0026c cVar) {
            this.f70a = new WeakReference<>(cVar);
        }

        /* renamed from: a */
        public void mo40a(MediaMetadataCompat mediaMetadataCompat) {
            C0026c cVar = (C0026c) this.f70a.get();
            if (cVar != null) {
                cVar.mo90a(3, mediaMetadataCompat, null);
            }
        }

        /* renamed from: a */
        public void mo41a(ParcelableVolumeInfo parcelableVolumeInfo) {
            C0026c cVar = (C0026c) this.f70a.get();
            if (cVar != null) {
                cVar.mo90a(4, parcelableVolumeInfo != null ? new C0030d(parcelableVolumeInfo.f43f, parcelableVolumeInfo.f44g, parcelableVolumeInfo.f45h, parcelableVolumeInfo.f46i, parcelableVolumeInfo.f47j) : null, null);
            }
        }

        /* renamed from: a */
        public void mo78a(PlaybackStateCompat playbackStateCompat) {
            C0026c cVar = (C0026c) this.f70a.get();
            if (cVar != null) {
                cVar.mo90a(2, playbackStateCompat, null);
            }
        }

        /* renamed from: a */
        public void mo42a(CharSequence charSequence) {
            C0026c cVar = (C0026c) this.f70a.get();
            if (cVar != null) {
                cVar.mo90a(6, charSequence, null);
            }
        }

        /* renamed from: a */
        public void mo79a(String str, Bundle bundle) {
            C0026c cVar = (C0026c) this.f70a.get();
            if (cVar != null) {
                cVar.mo90a(1, str, bundle);
            }
        }

        /* renamed from: a */
        public void mo43a(List<QueueItem> list) {
            C0026c cVar = (C0026c) this.f70a.get();
            if (cVar != null) {
                cVar.mo90a(5, list, null);
            }
        }

        /* renamed from: b */
        public void mo80b(int i) {
            C0026c cVar = (C0026c) this.f70a.get();
            if (cVar != null) {
                cVar.mo90a(9, Integer.valueOf(i), null);
            }
        }

        /* renamed from: b */
        public void mo44b(Bundle bundle) {
            C0026c cVar = (C0026c) this.f70a.get();
            if (cVar != null) {
                cVar.mo90a(7, bundle, null);
            }
        }

        /* renamed from: c */
        public void mo81c(int i) {
            C0026c cVar = (C0026c) this.f70a.get();
            if (cVar != null) {
                cVar.mo90a(12, Integer.valueOf(i), null);
            }
        }

        /* renamed from: c */
        public void mo82c(boolean z) {
        }

        /* renamed from: d */
        public void mo83d(boolean z) {
            C0026c cVar = (C0026c) this.f70a.get();
            if (cVar != null) {
                cVar.mo90a(11, Boolean.valueOf(z), null);
            }
        }

        /* renamed from: f */
        public void mo45f() {
            C0026c cVar = (C0026c) this.f70a.get();
            if (cVar != null) {
                cVar.mo90a(8, null, null);
            }
        }

        /* renamed from: p */
        public void mo84p() {
            C0026c cVar = (C0026c) this.f70a.get();
            if (cVar != null) {
                cVar.mo90a(13, null, null);
            }
        }
    }

    public C0026c() {
        if (VERSION.SDK_INT >= 21) {
            this.f66a = C0031e.m106a(new C0028b(this));
        } else {
            this.f68c = new C0029c(this);
        }
    }

    /* renamed from: a */
    public void mo89a() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo90a(int i, Object obj, Bundle bundle) {
        C0027a aVar = this.f67b;
        if (aVar != null) {
            Message obtainMessage = aVar.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    /* renamed from: a */
    public void mo91a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo92a(MediaMetadataCompat mediaMetadataCompat) {
    }

    /* renamed from: a */
    public void mo93a(PlaybackStateCompat playbackStateCompat) {
    }

    /* renamed from: a */
    public void mo94a(C0030d dVar) {
    }

    /* renamed from: a */
    public void mo95a(CharSequence charSequence) {
    }

    /* renamed from: a */
    public void mo96a(String str, Bundle bundle) {
    }

    /* renamed from: a */
    public void mo97a(List<QueueItem> list) {
    }

    public void binderDied() {
        mo90a(8, null, null);
    }
}
