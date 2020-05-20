package androidx.core.app;

import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.BubbleMetadata;
import android.app.Notification.BubbleMetadata.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import p071f.p097h.C3233b;

/* renamed from: androidx.core.app.i */
public class C0358i {

    /* renamed from: androidx.core.app.i$a */
    public static class C0359a {

        /* renamed from: a */
        final Bundle f1647a;

        /* renamed from: b */
        private IconCompat f1648b;

        /* renamed from: c */
        private final C0367l[] f1649c;

        /* renamed from: d */
        private final C0367l[] f1650d;

        /* renamed from: e */
        private boolean f1651e;

        /* renamed from: f */
        boolean f1652f;

        /* renamed from: g */
        private final int f1653g;

        /* renamed from: h */
        private final boolean f1654h;
        @Deprecated

        /* renamed from: i */
        public int f1655i;

        /* renamed from: j */
        public CharSequence f1656j;

        /* renamed from: k */
        public PendingIntent f1657k;

        public C0359a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            IconCompat iconCompat = null;
            if (i != 0) {
                iconCompat = IconCompat.m1886a(null, "", i);
            }
            this(iconCompat, charSequence, pendingIntent);
        }

        public C0359a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        C0359a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0367l[] lVarArr, C0367l[] lVarArr2, boolean z, int i, boolean z2, boolean z3) {
            this.f1652f = true;
            this.f1648b = iconCompat;
            if (iconCompat != null && iconCompat.mo2237c() == 2) {
                this.f1655i = iconCompat.mo2234a();
            }
            this.f1656j = C0363e.m1829d(charSequence);
            this.f1657k = pendingIntent;
            if (bundle == null) {
                bundle = new Bundle();
            }
            this.f1647a = bundle;
            this.f1649c = lVarArr;
            this.f1650d = lVarArr2;
            this.f1651e = z;
            this.f1653g = i;
            this.f1652f = z2;
            this.f1654h = z3;
        }

        /* renamed from: a */
        public PendingIntent mo2177a() {
            return this.f1657k;
        }

        /* renamed from: b */
        public boolean mo2178b() {
            return this.f1651e;
        }

        /* renamed from: c */
        public C0367l[] mo2179c() {
            return this.f1650d;
        }

        /* renamed from: d */
        public Bundle mo2180d() {
            return this.f1647a;
        }

        @Deprecated
        /* renamed from: e */
        public int mo2181e() {
            return this.f1655i;
        }

        /* renamed from: f */
        public IconCompat mo2182f() {
            if (this.f1648b == null) {
                int i = this.f1655i;
                if (i != 0) {
                    this.f1648b = IconCompat.m1886a(null, "", i);
                }
            }
            return this.f1648b;
        }

        /* renamed from: g */
        public C0367l[] mo2183g() {
            return this.f1649c;
        }

        /* renamed from: h */
        public int mo2184h() {
            return this.f1653g;
        }

        /* renamed from: i */
        public boolean mo2185i() {
            return this.f1652f;
        }

        /* renamed from: j */
        public CharSequence mo2186j() {
            return this.f1656j;
        }

        /* renamed from: k */
        public boolean mo2187k() {
            return this.f1654h;
        }
    }

    /* renamed from: androidx.core.app.i$b */
    public static class C0360b extends C0364f {

        /* renamed from: e */
        private Bitmap f1658e;

        /* renamed from: f */
        private Bitmap f1659f;

        /* renamed from: g */
        private boolean f1660g;

        /* renamed from: a */
        public C0360b mo2188a(Bitmap bitmap) {
            this.f1659f = bitmap;
            this.f1660g = true;
            return this;
        }

        /* renamed from: a */
        public void mo2189a(C0357h hVar) {
            if (VERSION.SDK_INT >= 16) {
                BigPictureStyle bigPicture = new BigPictureStyle(hVar.mo2176a()).setBigContentTitle(this.f1706b).bigPicture(this.f1658e);
                if (this.f1660g) {
                    bigPicture.bigLargeIcon(this.f1659f);
                }
                if (this.f1708d) {
                    bigPicture.setSummaryText(this.f1707c);
                }
            }
        }

        /* renamed from: b */
        public C0360b mo2190b(Bitmap bitmap) {
            this.f1658e = bitmap;
            return this;
        }
    }

    /* renamed from: androidx.core.app.i$c */
    public static class C0361c extends C0364f {

        /* renamed from: e */
        private CharSequence f1661e;

        /* renamed from: a */
        public C0361c mo2191a(CharSequence charSequence) {
            this.f1661e = C0363e.m1829d(charSequence);
            return this;
        }

        /* renamed from: a */
        public void mo2189a(C0357h hVar) {
            if (VERSION.SDK_INT >= 16) {
                BigTextStyle bigText = new BigTextStyle(hVar.mo2176a()).setBigContentTitle(this.f1706b).bigText(this.f1661e);
                if (this.f1708d) {
                    bigText.setSummaryText(this.f1707c);
                }
            }
        }
    }

    /* renamed from: androidx.core.app.i$d */
    public static final class C0362d {
        /* renamed from: a */
        public static BubbleMetadata m1825a(C0362d dVar) {
            if (dVar == null) {
                return null;
            }
            new Builder();
            dVar.mo2192a();
            throw null;
        }

        /* renamed from: a */
        public boolean mo2192a() {
            throw null;
        }
    }

    /* renamed from: androidx.core.app.i$e */
    public static class C0363e {

        /* renamed from: A */
        String f1662A;

        /* renamed from: B */
        Bundle f1663B;

        /* renamed from: C */
        int f1664C;

        /* renamed from: D */
        int f1665D;

        /* renamed from: E */
        Notification f1666E;

        /* renamed from: F */
        RemoteViews f1667F;

        /* renamed from: G */
        RemoteViews f1668G;

        /* renamed from: H */
        RemoteViews f1669H;

        /* renamed from: I */
        String f1670I;

        /* renamed from: J */
        int f1671J;

        /* renamed from: K */
        String f1672K;

        /* renamed from: L */
        long f1673L;

        /* renamed from: M */
        int f1674M;

        /* renamed from: N */
        boolean f1675N;

        /* renamed from: O */
        C0362d f1676O;

        /* renamed from: P */
        Notification f1677P;
        @Deprecated

        /* renamed from: Q */
        public ArrayList<String> f1678Q;

        /* renamed from: a */
        public Context f1679a;

        /* renamed from: b */
        public ArrayList<C0359a> f1680b;

        /* renamed from: c */
        ArrayList<C0359a> f1681c;

        /* renamed from: d */
        CharSequence f1682d;

        /* renamed from: e */
        CharSequence f1683e;

        /* renamed from: f */
        PendingIntent f1684f;

        /* renamed from: g */
        PendingIntent f1685g;

        /* renamed from: h */
        RemoteViews f1686h;

        /* renamed from: i */
        Bitmap f1687i;

        /* renamed from: j */
        CharSequence f1688j;

        /* renamed from: k */
        int f1689k;

        /* renamed from: l */
        int f1690l;

        /* renamed from: m */
        boolean f1691m;

        /* renamed from: n */
        boolean f1692n;

        /* renamed from: o */
        C0364f f1693o;

        /* renamed from: p */
        CharSequence f1694p;

        /* renamed from: q */
        CharSequence[] f1695q;

        /* renamed from: r */
        int f1696r;

        /* renamed from: s */
        int f1697s;

        /* renamed from: t */
        boolean f1698t;

        /* renamed from: u */
        String f1699u;

        /* renamed from: v */
        boolean f1700v;

        /* renamed from: w */
        String f1701w;

        /* renamed from: x */
        boolean f1702x;

        /* renamed from: y */
        boolean f1703y;

        /* renamed from: z */
        boolean f1704z;

        @Deprecated
        public C0363e(Context context) {
            this(context, null);
        }

        public C0363e(Context context, String str) {
            this.f1680b = new ArrayList<>();
            this.f1681c = new ArrayList<>();
            this.f1691m = true;
            this.f1702x = false;
            this.f1664C = 0;
            this.f1665D = 0;
            this.f1671J = 0;
            this.f1674M = 0;
            Notification notification = new Notification();
            this.f1677P = notification;
            this.f1679a = context;
            this.f1670I = str;
            notification.when = System.currentTimeMillis();
            this.f1677P.audioStreamType = -1;
            this.f1690l = 0;
            this.f1678Q = new ArrayList<>();
            this.f1675N = true;
        }

        /* renamed from: a */
        private void m1827a(int i, boolean z) {
            Notification notification;
            int i2;
            if (z) {
                notification = this.f1677P;
                i2 = i | notification.flags;
            } else {
                notification = this.f1677P;
                i2 = (~i) & notification.flags;
            }
            notification.flags = i2;
        }

        /* renamed from: b */
        private Bitmap m1828b(Bitmap bitmap) {
            if (bitmap != null && VERSION.SDK_INT < 27) {
                Resources resources = this.f1679a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(C3233b.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(C3233b.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                    return bitmap;
                }
                double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
            }
            return bitmap;
        }

        /* renamed from: d */
        protected static CharSequence m1829d(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                charSequence = charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        /* renamed from: a */
        public Notification mo2193a() {
            return new C0365j(this).mo2222b();
        }

        /* renamed from: a */
        public C0363e mo2194a(int i) {
            this.f1664C = i;
            return this;
        }

        /* renamed from: a */
        public C0363e mo2195a(int i, int i2, int i3) {
            Notification notification = this.f1677P;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            int i4 = (i2 == 0 || i3 == 0) ? 0 : 1;
            Notification notification2 = this.f1677P;
            notification2.flags = i4 | (notification2.flags & -2);
            return this;
        }

        /* renamed from: a */
        public C0363e mo2196a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f1680b.add(new C0359a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: a */
        public C0363e mo2197a(long j) {
            this.f1677P.when = j;
            return this;
        }

        /* renamed from: a */
        public C0363e mo2198a(PendingIntent pendingIntent) {
            this.f1684f = pendingIntent;
            return this;
        }

        /* renamed from: a */
        public C0363e mo2199a(Bitmap bitmap) {
            this.f1687i = m1828b(bitmap);
            return this;
        }

        /* renamed from: a */
        public C0363e mo2200a(Uri uri) {
            Notification notification = this.f1677P;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        /* renamed from: a */
        public C0363e mo2201a(C0364f fVar) {
            if (this.f1693o != fVar) {
                this.f1693o = fVar;
                if (fVar != null) {
                    fVar.mo2218a(this);
                }
            }
            return this;
        }

        /* renamed from: a */
        public C0363e mo2202a(CharSequence charSequence) {
            this.f1683e = m1829d(charSequence);
            return this;
        }

        /* renamed from: a */
        public C0363e mo2203a(String str) {
            this.f1670I = str;
            return this;
        }

        /* renamed from: a */
        public C0363e mo2204a(boolean z) {
            m1827a(16, z);
            return this;
        }

        /* renamed from: a */
        public C0363e mo2205a(long[] jArr) {
            this.f1677P.vibrate = jArr;
            return this;
        }

        /* renamed from: b */
        public Bundle mo2206b() {
            if (this.f1663B == null) {
                this.f1663B = new Bundle();
            }
            return this.f1663B;
        }

        /* renamed from: b */
        public C0363e mo2207b(int i) {
            Notification notification = this.f1677P;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        /* renamed from: b */
        public C0363e mo2208b(PendingIntent pendingIntent) {
            this.f1677P.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: b */
        public C0363e mo2209b(CharSequence charSequence) {
            this.f1682d = m1829d(charSequence);
            return this;
        }

        /* renamed from: b */
        public C0363e mo2210b(boolean z) {
            this.f1702x = z;
            return this;
        }

        /* renamed from: c */
        public C0363e mo2211c(int i) {
            this.f1689k = i;
            return this;
        }

        /* renamed from: c */
        public C0363e mo2212c(CharSequence charSequence) {
            this.f1677P.tickerText = m1829d(charSequence);
            return this;
        }

        /* renamed from: c */
        public C0363e mo2213c(boolean z) {
            this.f1691m = z;
            return this;
        }

        /* renamed from: d */
        public C0363e mo2214d(int i) {
            this.f1690l = i;
            return this;
        }

        /* renamed from: e */
        public C0363e mo2215e(int i) {
            this.f1677P.icon = i;
            return this;
        }

        /* renamed from: f */
        public C0363e mo2216f(int i) {
            this.f1665D = i;
            return this;
        }
    }

    /* renamed from: androidx.core.app.i$f */
    public static abstract class C0364f {

        /* renamed from: a */
        protected C0363e f1705a;

        /* renamed from: b */
        CharSequence f1706b;

        /* renamed from: c */
        CharSequence f1707c;

        /* renamed from: d */
        boolean f1708d = false;

        /* renamed from: a */
        public void mo2217a(Bundle bundle) {
        }

        /* renamed from: a */
        public abstract void mo2189a(C0357h hVar);

        /* renamed from: a */
        public void mo2218a(C0363e eVar) {
            if (this.f1705a != eVar) {
                this.f1705a = eVar;
                if (eVar != null) {
                    eVar.mo2201a(this);
                }
            }
        }

        /* renamed from: b */
        public RemoteViews mo2219b(C0357h hVar) {
            return null;
        }

        /* renamed from: c */
        public RemoteViews mo2220c(C0357h hVar) {
            return null;
        }

        /* renamed from: d */
        public RemoteViews mo2221d(C0357h hVar) {
            return null;
        }
    }

    /* renamed from: a */
    public static Bundle m1808a(Notification notification) {
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C0366k.m1866a(notification);
        }
        return null;
    }
}
