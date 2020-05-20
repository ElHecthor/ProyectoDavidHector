package androidx.core.app;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.RemoteInput;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.C0358i.C0359a;
import androidx.core.app.C0358i.C0362d;
import androidx.core.app.C0358i.C0363e;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.core.app.j */
class C0365j implements C0357h {

    /* renamed from: a */
    private final Builder f1709a;

    /* renamed from: b */
    private final C0363e f1710b;

    /* renamed from: c */
    private RemoteViews f1711c;

    /* renamed from: d */
    private RemoteViews f1712d;

    /* renamed from: e */
    private final List<Bundle> f1713e = new ArrayList();

    /* renamed from: f */
    private final Bundle f1714f = new Bundle();

    /* renamed from: g */
    private int f1715g;

    /* renamed from: h */
    private RemoteViews f1716h;

    C0365j(C0363e eVar) {
        String str;
        Bundle bundle;
        this.f1710b = eVar;
        this.f1709a = VERSION.SDK_INT >= 26 ? new Builder(eVar.f1679a, eVar.f1670I) : new Builder(eVar.f1679a);
        Notification notification = eVar.f1677P;
        this.f1709a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f1686h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f1682d).setContentText(eVar.f1683e).setContentInfo(eVar.f1688j).setContentIntent(eVar.f1684f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f1685g, (notification.flags & 128) != 0).setLargeIcon(eVar.f1687i).setNumber(eVar.f1689k).setProgress(eVar.f1696r, eVar.f1697s, eVar.f1698t);
        if (VERSION.SDK_INT < 21) {
            this.f1709a.setSound(notification.sound, notification.audioStreamType);
        }
        if (VERSION.SDK_INT >= 16) {
            this.f1709a.setSubText(eVar.f1694p).setUsesChronometer(eVar.f1692n).setPriority(eVar.f1690l);
            Iterator it = eVar.f1680b.iterator();
            while (it.hasNext()) {
                m1861a((C0359a) it.next());
            }
            Bundle bundle2 = eVar.f1663B;
            if (bundle2 != null) {
                this.f1714f.putAll(bundle2);
            }
            if (VERSION.SDK_INT < 20) {
                if (eVar.f1702x) {
                    this.f1714f.putBoolean("android.support.localOnly", true);
                }
                String str2 = eVar.f1699u;
                if (str2 != null) {
                    this.f1714f.putString("android.support.groupKey", str2);
                    if (eVar.f1700v) {
                        bundle = this.f1714f;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f1714f;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = eVar.f1701w;
                if (str3 != null) {
                    this.f1714f.putString("android.support.sortKey", str3);
                }
            }
            this.f1711c = eVar.f1667F;
            this.f1712d = eVar.f1668G;
        }
        if (VERSION.SDK_INT >= 19) {
            this.f1709a.setShowWhen(eVar.f1691m);
            if (VERSION.SDK_INT < 21) {
                ArrayList<String> arrayList = eVar.f1678Q;
                if (arrayList != null && !arrayList.isEmpty()) {
                    Bundle bundle3 = this.f1714f;
                    ArrayList<String> arrayList2 = eVar.f1678Q;
                    bundle3.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
                }
            }
        }
        if (VERSION.SDK_INT >= 20) {
            this.f1709a.setLocalOnly(eVar.f1702x).setGroup(eVar.f1699u).setGroupSummary(eVar.f1700v).setSortKey(eVar.f1701w);
            this.f1715g = eVar.f1674M;
        }
        if (VERSION.SDK_INT >= 21) {
            this.f1709a.setCategory(eVar.f1662A).setColor(eVar.f1664C).setVisibility(eVar.f1665D).setPublicVersion(eVar.f1666E).setSound(notification.sound, notification.audioAttributes);
            Iterator it2 = eVar.f1678Q.iterator();
            while (it2.hasNext()) {
                this.f1709a.addPerson((String) it2.next());
            }
            this.f1716h = eVar.f1669H;
            if (eVar.f1681c.size() > 0) {
                String str4 = "android.car.EXTENSIONS";
                Bundle bundle4 = eVar.mo2206b().getBundle(str4);
                if (bundle4 == null) {
                    bundle4 = new Bundle();
                }
                Bundle bundle5 = new Bundle();
                for (int i = 0; i < eVar.f1681c.size(); i++) {
                    bundle5.putBundle(Integer.toString(i), C0366k.m1867a((C0359a) eVar.f1681c.get(i)));
                }
                bundle4.putBundle("invisible_actions", bundle5);
                eVar.mo2206b().putBundle(str4, bundle4);
                this.f1714f.putBundle(str4, bundle4);
            }
        }
        if (VERSION.SDK_INT >= 24) {
            this.f1709a.setExtras(eVar.f1663B).setRemoteInputHistory(eVar.f1695q);
            RemoteViews remoteViews = eVar.f1667F;
            if (remoteViews != null) {
                this.f1709a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.f1668G;
            if (remoteViews2 != null) {
                this.f1709a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.f1669H;
            if (remoteViews3 != null) {
                this.f1709a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (VERSION.SDK_INT >= 26) {
            this.f1709a.setBadgeIconType(eVar.f1671J).setShortcutId(eVar.f1672K).setTimeoutAfter(eVar.f1673L).setGroupAlertBehavior(eVar.f1674M);
            if (eVar.f1704z) {
                this.f1709a.setColorized(eVar.f1703y);
            }
            if (!TextUtils.isEmpty(eVar.f1670I)) {
                this.f1709a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (VERSION.SDK_INT >= 29) {
            this.f1709a.setAllowSystemGeneratedContextualActions(eVar.f1675N);
            this.f1709a.setBubbleMetadata(C0362d.m1825a(eVar.f1676O));
        }
    }

    /* renamed from: a */
    private void m1860a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & -2;
        notification.defaults = i;
        notification.defaults = i & -3;
    }

    /* renamed from: a */
    private void m1861a(C0359a aVar) {
        Action.Builder builder;
        int i = VERSION.SDK_INT;
        if (i >= 20) {
            if (i >= 23) {
                IconCompat f = aVar.mo2182f();
                builder = new Action.Builder(f == null ? null : f.mo2239e(), aVar.mo2186j(), aVar.mo2177a());
            } else {
                builder = new Action.Builder(aVar.mo2181e(), aVar.mo2186j(), aVar.mo2177a());
            }
            if (aVar.mo2183g() != null) {
                for (RemoteInput addRemoteInput : C0367l.m1872a(aVar.mo2183g())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            Bundle bundle = aVar.mo2180d() != null ? new Bundle(aVar.mo2180d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo2178b());
            if (VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.mo2178b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.mo2184h());
            if (VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(aVar.mo2184h());
            }
            if (VERSION.SDK_INT >= 29) {
                builder.setContextual(aVar.mo2187k());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.mo2185i());
            builder.addExtras(bundle);
            this.f1709a.addAction(builder.build());
        } else if (i >= 16) {
            this.f1713e.add(C0366k.m1865a(this.f1709a, aVar));
        }
    }

    /* renamed from: a */
    public Builder mo2176a() {
        return this.f1709a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r1 != null) goto L_0x0017;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Notification mo2222b() {
        /*
            r5 = this;
            androidx.core.app.i$e r0 = r5.f1710b
            androidx.core.app.i$f r0 = r0.f1693o
            if (r0 == 0) goto L_0x0009
            r0.mo2189a(r5)
        L_0x0009:
            if (r0 == 0) goto L_0x0010
            android.widget.RemoteViews r1 = r0.mo2220c(r5)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            android.app.Notification r2 = r5.mo2223c()
            if (r1 == 0) goto L_0x001a
        L_0x0017:
            r2.contentView = r1
            goto L_0x0021
        L_0x001a:
            androidx.core.app.i$e r1 = r5.f1710b
            android.widget.RemoteViews r1 = r1.f1667F
            if (r1 == 0) goto L_0x0021
            goto L_0x0017
        L_0x0021:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 16
            if (r1 < r3) goto L_0x0031
            if (r0 == 0) goto L_0x0031
            android.widget.RemoteViews r1 = r0.mo2219b(r5)
            if (r1 == 0) goto L_0x0031
            r2.bigContentView = r1
        L_0x0031:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r1 < r4) goto L_0x0045
            if (r0 == 0) goto L_0x0045
            androidx.core.app.i$e r1 = r5.f1710b
            androidx.core.app.i$f r1 = r1.f1693o
            android.widget.RemoteViews r1 = r1.mo2221d(r5)
            if (r1 == 0) goto L_0x0045
            r2.headsUpContentView = r1
        L_0x0045:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r3) goto L_0x0054
            if (r0 == 0) goto L_0x0054
            android.os.Bundle r1 = androidx.core.app.C0358i.m1808a(r2)
            if (r1 == 0) goto L_0x0054
            r0.mo2217a(r1)
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0365j.mo2222b():android.app.Notification");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Notification mo2223c() {
        int i = VERSION.SDK_INT;
        if (i >= 26) {
            return this.f1709a.build();
        }
        if (i >= 24) {
            Notification build = this.f1709a.build();
            if (this.f1715g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f1715g != 2)) {
                    m1860a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f1715g == 1) {
                    m1860a(build);
                }
            }
            return build;
        } else if (i >= 21) {
            this.f1709a.setExtras(this.f1714f);
            Notification build2 = this.f1709a.build();
            RemoteViews remoteViews = this.f1711c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f1712d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f1716h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f1715g != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f1715g != 2)) {
                    m1860a(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f1715g == 1) {
                    m1860a(build2);
                }
            }
            return build2;
        } else if (i >= 20) {
            this.f1709a.setExtras(this.f1714f);
            Notification build3 = this.f1709a.build();
            RemoteViews remoteViews4 = this.f1711c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f1712d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f1715g != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.f1715g != 2)) {
                    m1860a(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f1715g == 1) {
                    m1860a(build3);
                }
            }
            return build3;
        } else {
            String str = "android.support.actionExtras";
            if (i >= 19) {
                SparseArray a = C0366k.m1869a(this.f1713e);
                if (a != null) {
                    this.f1714f.putSparseParcelableArray(str, a);
                }
                this.f1709a.setExtras(this.f1714f);
                Notification build4 = this.f1709a.build();
                RemoteViews remoteViews6 = this.f1711c;
                if (remoteViews6 != null) {
                    build4.contentView = remoteViews6;
                }
                RemoteViews remoteViews7 = this.f1712d;
                if (remoteViews7 != null) {
                    build4.bigContentView = remoteViews7;
                }
                return build4;
            } else if (i < 16) {
                return this.f1709a.getNotification();
            } else {
                Notification build5 = this.f1709a.build();
                Bundle a2 = C0358i.m1808a(build5);
                Bundle bundle = new Bundle(this.f1714f);
                for (String str2 : this.f1714f.keySet()) {
                    if (a2.containsKey(str2)) {
                        bundle.remove(str2);
                    }
                }
                a2.putAll(bundle);
                SparseArray a3 = C0366k.m1869a(this.f1713e);
                if (a3 != null) {
                    C0358i.m1808a(build5).putSparseParcelableArray(str, a3);
                }
                RemoteViews remoteViews8 = this.f1711c;
                if (remoteViews8 != null) {
                    build5.contentView = remoteViews8;
                }
                RemoteViews remoteViews9 = this.f1712d;
                if (remoteViews9 != null) {
                    build5.bigContentView = remoteViews9;
                }
                return build5;
            }
        }
    }
}
