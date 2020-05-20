package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.AsyncTask;
import com.facebook.C1797q.C1802e;
import com.facebook.internal.C1633a;
import com.facebook.internal.C1661j.C1664c;
import com.facebook.internal.C1696t;
import com.facebook.internal.C1698v;
import com.facebook.internal.C1703w;
import com.facebook.internal.p042y.C1714a;
import com.facebook.p034f0.C1547g;
import com.facebook.p034f0.C1552i;
import com.facebook.p034f0.p038s.C1610c;
import com.facebook.p034f0.p038s.C1610c.C1612b;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

/* renamed from: com.facebook.m */
public final class C1787m {

    /* renamed from: a */
    private static final String f5361a = "com.facebook.m";

    /* renamed from: b */
    private static final HashSet<C1845w> f5362b;

    /* renamed from: c */
    private static Executor f5363c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static volatile String f5364d;

    /* renamed from: e */
    private static volatile String f5365e;

    /* renamed from: f */
    private static volatile String f5366f;

    /* renamed from: g */
    private static volatile Boolean f5367g;

    /* renamed from: h */
    private static volatile String f5368h = "facebook.com";

    /* renamed from: i */
    private static AtomicLong f5369i = new AtomicLong(65536);

    /* renamed from: j */
    private static volatile boolean f5370j = false;

    /* renamed from: k */
    private static boolean f5371k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static Context f5372l;

    /* renamed from: m */
    private static int f5373m = 64206;

    /* renamed from: n */
    private static final Object f5374n = new Object();

    /* renamed from: o */
    private static String f5375o = C1696t.m7347a();

    /* renamed from: p */
    private static Boolean f5376p;

    /* renamed from: q */
    private static Boolean f5377q;

    /* renamed from: com.facebook.m$a */
    static class C1788a implements Callable<File> {
        C1788a() {
        }

        public File call() {
            return C1787m.f5372l.getCacheDir();
        }
    }

    /* renamed from: com.facebook.m$b */
    static class C1789b implements C1664c {
        C1789b() {
        }

        /* renamed from: a */
        public void mo5768a(boolean z) {
            if (z) {
                C1714a.m7470a();
            }
        }
    }

    /* renamed from: com.facebook.m$c */
    static class C1790c implements C1664c {
        C1790c() {
        }

        /* renamed from: a */
        public void mo5768a(boolean z) {
            if (z) {
                C1552i.m6911a();
            }
        }
    }

    /* renamed from: com.facebook.m$d */
    static class C1791d implements Callable<Void> {

        /* renamed from: f */
        final /* synthetic */ C1793f f5378f;

        /* renamed from: g */
        final /* synthetic */ Context f5379g;

        C1791d(C1793f fVar, Context context) {
            this.f5378f = fVar;
            this.f5379g = context;
        }

        public Void call() {
            C1507c.m6802e().mo5723d();
            C1850z.m7947c().mo6307b();
            if (C1499a.m6760s() && C1846x.m7938d() == null) {
                C1846x.m7937c();
            }
            C1793f fVar = this.f5378f;
            if (fVar != null) {
                fVar.mo6166a();
            }
            C1547g.m6882a(C1787m.f5372l, C1787m.f5364d);
            C1547g.m6885b(this.f5379g.getApplicationContext()).mo5756a();
            return null;
        }
    }

    /* renamed from: com.facebook.m$e */
    static class C1792e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Context f5380f;

        /* renamed from: g */
        final /* synthetic */ String f5381g;

        C1792e(Context context, String str) {
            this.f5380f = context;
            this.f5381g = str;
        }

        public void run() {
            C1787m.m7735a(this.f5380f, this.f5381g);
        }
    }

    /* renamed from: com.facebook.m$f */
    public interface C1793f {
        /* renamed from: a */
        void mo6166a();
    }

    static {
        C1845w wVar = C1845w.DEVELOPER_ERRORS;
        Boolean valueOf = Boolean.valueOf(false);
        f5362b = new HashSet<>(Arrays.asList(new C1845w[]{wVar}));
        f5376p = valueOf;
        f5377q = valueOf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        return;
     */
    @java.lang.Deprecated
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m7734a(android.content.Context r3, com.facebook.C1787m.C1793f r4) {
        /*
            java.lang.Class<com.facebook.m> r0 = com.facebook.C1787m.class
            monitor-enter(r0)
            java.lang.Boolean r1 = f5376p     // Catch:{ all -> 0x009d }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x0012
            if (r4 == 0) goto L_0x0010
            r4.mo6166a()     // Catch:{ all -> 0x009d }
        L_0x0010:
            monitor-exit(r0)
            return
        L_0x0012:
            java.lang.String r1 = "applicationContext"
            com.facebook.internal.C1703w.m7423a(r3, r1)     // Catch:{ all -> 0x009d }
            r1 = 0
            com.facebook.internal.C1703w.m7422a(r3, r1)     // Catch:{ all -> 0x009d }
            com.facebook.internal.C1703w.m7428b(r3, r1)     // Catch:{ all -> 0x009d }
            android.content.Context r1 = r3.getApplicationContext()     // Catch:{ all -> 0x009d }
            f5372l = r1     // Catch:{ all -> 0x009d }
            com.facebook.p034f0.C1547g.m6880a(r3)     // Catch:{ all -> 0x009d }
            android.content.Context r1 = f5372l     // Catch:{ all -> 0x009d }
            m7739b(r1)     // Catch:{ all -> 0x009d }
            java.lang.String r1 = f5364d     // Catch:{ all -> 0x009d }
            boolean r1 = com.facebook.internal.C1698v.m7401c(r1)     // Catch:{ all -> 0x009d }
            if (r1 != 0) goto L_0x0095
            r1 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x009d }
            f5376p = r1     // Catch:{ all -> 0x009d }
            boolean r1 = m7746g()     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x0044
            m7741c()     // Catch:{ all -> 0x009d }
        L_0x0044:
            android.content.Context r1 = f5372l     // Catch:{ all -> 0x009d }
            boolean r1 = r1 instanceof android.app.Application     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x0059
            boolean r1 = com.facebook.C1524e0.m6831f()     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x0059
            android.content.Context r1 = f5372l     // Catch:{ all -> 0x009d }
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x009d }
            java.lang.String r2 = f5364d     // Catch:{ all -> 0x009d }
            com.facebook.p034f0.p038s.C1602a.m7070a(r1, r2)     // Catch:{ all -> 0x009d }
        L_0x0059:
            com.facebook.internal.C1672m.m7272f()     // Catch:{ all -> 0x009d }
            com.facebook.internal.C1683q.m7318g()     // Catch:{ all -> 0x009d }
            android.content.Context r1 = f5372l     // Catch:{ all -> 0x009d }
            com.facebook.internal.C1637b.m7181a(r1)     // Catch:{ all -> 0x009d }
            com.facebook.internal.o r1 = new com.facebook.internal.o     // Catch:{ all -> 0x009d }
            com.facebook.m$a r2 = new com.facebook.m$a     // Catch:{ all -> 0x009d }
            r2.<init>()     // Catch:{ all -> 0x009d }
            r1.<init>(r2)     // Catch:{ all -> 0x009d }
            com.facebook.internal.j$d r1 = com.facebook.internal.C1661j.C1665d.Instrument     // Catch:{ all -> 0x009d }
            com.facebook.m$b r2 = new com.facebook.m$b     // Catch:{ all -> 0x009d }
            r2.<init>()     // Catch:{ all -> 0x009d }
            com.facebook.internal.C1661j.m7223a(r1, r2)     // Catch:{ all -> 0x009d }
            com.facebook.internal.j$d r1 = com.facebook.internal.C1661j.C1665d.AppEvents     // Catch:{ all -> 0x009d }
            com.facebook.m$c r2 = new com.facebook.m$c     // Catch:{ all -> 0x009d }
            r2.<init>()     // Catch:{ all -> 0x009d }
            com.facebook.internal.C1661j.m7223a(r1, r2)     // Catch:{ all -> 0x009d }
            java.util.concurrent.FutureTask r1 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x009d }
            com.facebook.m$d r2 = new com.facebook.m$d     // Catch:{ all -> 0x009d }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x009d }
            r1.<init>(r2)     // Catch:{ all -> 0x009d }
            java.util.concurrent.Executor r3 = m7751l()     // Catch:{ all -> 0x009d }
            r3.execute(r1)     // Catch:{ all -> 0x009d }
            monitor-exit(r0)
            return
        L_0x0095:
            com.facebook.i r3 = new com.facebook.i     // Catch:{ all -> 0x009d }
            java.lang.String r4 = "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk."
            r3.<init>(r4)     // Catch:{ all -> 0x009d }
            throw r3     // Catch:{ all -> 0x009d }
        L_0x009d:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C1787m.m7734a(android.content.Context, com.facebook.m$f):void");
    }

    /* renamed from: a */
    static void m7735a(Context context, String str) {
        if (context == null || str == null) {
            throw new IllegalArgumentException("Both context and applicationId must be non-null");
        }
        try {
            C1633a d = C1633a.m7170d(context);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("ping");
            String sb2 = sb.toString();
            long j = sharedPreferences.getLong(sb2, 0);
            C1797q a = C1797q.m7765a((C1499a) null, String.format("%s/activities", new Object[]{str}), C1610c.m7096a(C1612b.MOBILE_INSTALL_EVENT, d, C1547g.m6880a(context), m7736a(context), context), (C1802e) null);
            if (j == 0 && a.mo6168a().mo6290a() == null) {
                Editor edit = sharedPreferences.edit();
                edit.putLong(sb2, System.currentTimeMillis());
                edit.apply();
            }
        } catch (JSONException e) {
            throw new C1631i("An error occurred while publishing install.", e);
        } catch (Exception e2) {
            C1698v.m7380a("Facebook-publish", e2);
        }
    }

    /* renamed from: a */
    public static boolean m7736a(Context context) {
        C1703w.m7430c();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    /* renamed from: a */
    public static boolean m7737a(C1845w wVar) {
        boolean z;
        synchronized (f5362b) {
            z = m7756q() && f5362b.contains(wVar);
        }
        return z;
    }

    /* renamed from: b */
    static void m7739b(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                    if (f5364d == null) {
                        Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                        if (obj instanceof String) {
                            String str = (String) obj;
                            if (str.toLowerCase(Locale.ROOT).startsWith("fb")) {
                                str = str.substring(2);
                            }
                            f5364d = str;
                        } else if (obj instanceof Integer) {
                            throw new C1631i("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                        }
                    }
                    if (f5365e == null) {
                        f5365e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
                    }
                    if (f5366f == null) {
                        f5366f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
                    }
                    if (f5373m == 64206) {
                        f5373m = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
                    }
                    if (f5367g == null) {
                        f5367g = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
                    }
                }
            } catch (NameNotFoundException unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m7740b(Context context, String str) {
        m7751l().execute(new C1792e(context.getApplicationContext(), str));
    }

    /* renamed from: c */
    public static void m7741c() {
        f5377q = Boolean.valueOf(true);
    }

    @Deprecated
    /* renamed from: c */
    public static synchronized void m7742c(Context context) {
        synchronized (C1787m.class) {
            m7734a(context, (C1793f) null);
        }
    }

    /* renamed from: d */
    public static boolean m7743d() {
        return C1524e0.m6829d();
    }

    /* renamed from: e */
    public static Context m7744e() {
        C1703w.m7430c();
        return f5372l;
    }

    /* renamed from: f */
    public static String m7745f() {
        C1703w.m7430c();
        return f5364d;
    }

    /* renamed from: g */
    public static boolean m7746g() {
        return C1524e0.m6830e();
    }

    /* renamed from: h */
    public static boolean m7747h() {
        return C1524e0.m6831f();
    }

    /* renamed from: i */
    public static int m7748i() {
        C1703w.m7430c();
        return f5373m;
    }

    /* renamed from: j */
    public static String m7749j() {
        C1703w.m7430c();
        return f5366f;
    }

    /* renamed from: k */
    public static boolean m7750k() {
        return C1524e0.m6832g();
    }

    /* renamed from: l */
    public static Executor m7751l() {
        synchronized (f5374n) {
            if (f5363c == null) {
                f5363c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return f5363c;
    }

    /* renamed from: m */
    public static String m7752m() {
        return f5368h;
    }

    /* renamed from: n */
    public static String m7753n() {
        C1698v.m7399c(f5361a, String.format("getGraphApiVersion: %s", new Object[]{f5375o}));
        return f5375o;
    }

    /* renamed from: o */
    public static long m7754o() {
        C1703w.m7430c();
        return f5369i.get();
    }

    /* renamed from: p */
    public static String m7755p() {
        return "5.8.0";
    }

    /* renamed from: q */
    public static boolean m7756q() {
        return f5370j;
    }

    /* renamed from: r */
    public static synchronized boolean m7757r() {
        boolean booleanValue;
        synchronized (C1787m.class) {
            booleanValue = f5377q.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: s */
    public static synchronized boolean m7758s() {
        boolean booleanValue;
        synchronized (C1787m.class) {
            booleanValue = f5376p.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: t */
    public static boolean m7759t() {
        return f5371k;
    }
}
