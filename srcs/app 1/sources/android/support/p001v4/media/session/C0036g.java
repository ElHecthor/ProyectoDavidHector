package android.support.p001v4.media.session;

import android.media.session.PlaybackState;
import android.media.session.PlaybackState.CustomAction;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.g */
class C0036g {

    /* renamed from: android.support.v4.media.session.g$a */
    static final class C0037a {
        /* renamed from: a */
        public static String m129a(Object obj) {
            return ((CustomAction) obj).getAction();
        }

        /* renamed from: b */
        public static Bundle m130b(Object obj) {
            return ((CustomAction) obj).getExtras();
        }

        /* renamed from: c */
        public static int m131c(Object obj) {
            return ((CustomAction) obj).getIcon();
        }

        /* renamed from: d */
        public static CharSequence m132d(Object obj) {
            return ((CustomAction) obj).getName();
        }
    }

    /* renamed from: a */
    public static long m120a(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    /* renamed from: b */
    public static long m121b(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }

    /* renamed from: c */
    public static long m122c(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    /* renamed from: d */
    public static List<Object> m123d(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    /* renamed from: e */
    public static CharSequence m124e(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    /* renamed from: f */
    public static long m125f(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    /* renamed from: g */
    public static float m126g(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    /* renamed from: h */
    public static long m127h(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    /* renamed from: i */
    public static int m128i(Object obj) {
        return ((PlaybackState) obj).getState();
    }
}
