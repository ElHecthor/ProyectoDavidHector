package android.support.p001v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaSession.QueueItem;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.e */
class C0031e {

    /* renamed from: android.support.v4.media.session.e$a */
    public interface C0032a {
        /* renamed from: a */
        void mo99a(int i, int i2, int i3, int i4, int i5);

        /* renamed from: a */
        void mo100a(CharSequence charSequence);

        /* renamed from: a */
        void mo101a(Object obj);

        /* renamed from: a */
        void mo102a(String str, Bundle bundle);

        /* renamed from: a */
        void mo103a(List<?> list);

        /* renamed from: b */
        void mo104b(Bundle bundle);

        /* renamed from: b */
        void mo105b(Object obj);

        /* renamed from: f */
        void mo106f();
    }

    /* renamed from: android.support.v4.media.session.e$b */
    static class C0033b<T extends C0032a> extends Callback {

        /* renamed from: a */
        protected final T f71a;

        public C0033b(T t) {
            this.f71a = t;
        }

        public void onAudioInfoChanged(PlaybackInfo playbackInfo) {
            this.f71a.mo99a(playbackInfo.getPlaybackType(), C0034c.m117b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m52a(bundle);
            this.f71a.mo104b(bundle);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f71a.mo101a((Object) mediaMetadata);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f71a.mo105b((Object) playbackState);
        }

        public void onQueueChanged(List<QueueItem> list) {
            this.f71a.mo103a(list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f71a.mo100a(charSequence);
        }

        public void onSessionDestroyed() {
            this.f71a.mo106f();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m52a(bundle);
            this.f71a.mo102a(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.e$c */
    public static class C0034c {
        /* renamed from: a */
        private static int m115a(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage == 13) {
                return 1;
            }
            switch (usage) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }

        /* renamed from: a */
        public static AudioAttributes m116a(Object obj) {
            return ((PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m117b(Object obj) {
            return m115a(m116a(obj));
        }
    }

    /* renamed from: a */
    public static Object m106a(C0032a aVar) {
        return new C0033b(aVar);
    }
}
