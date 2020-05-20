package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.util.p052q.C2202a;
import com.google.firebase.C2860a;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.C3004h;
import com.google.firebase.p059f.C2916b;
import com.google.firebase.p059f.C2918d;
import com.google.firebase.p060g.C2921c;
import com.google.firebase.p066j.C3043h;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import p147g.p156d.p157a.p167b.p184g.C4343c;
import p147g.p156d.p157a.p167b.p184g.C4349g;
import p147g.p156d.p157a.p167b.p184g.C4350h;
import p147g.p156d.p157a.p167b.p184g.C4354k;

public class FirebaseInstanceId {

    /* renamed from: i */
    private static final long f8421i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j */
    private static C2935c0 f8422j;

    /* renamed from: k */
    private static final Pattern f8423k = Pattern.compile("\\AA[\\w-]{38}\\z");
    @GuardedBy("FirebaseInstanceId.class")

    /* renamed from: l */
    private static ScheduledExecutorService f8424l;

    /* renamed from: a */
    private final Executor f8425a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final FirebaseApp f8426b;

    /* renamed from: c */
    private final C2974r f8427c;

    /* renamed from: d */
    private final C2945f1 f8428d;

    /* renamed from: e */
    private final C2985w f8429e;

    /* renamed from: f */
    private final C3004h f8430f;
    @GuardedBy("this")

    /* renamed from: g */
    private boolean f8431g;

    /* renamed from: h */
    private final C2926a f8432h;

    /* renamed from: com.google.firebase.iid.FirebaseInstanceId$a */
    private class C2926a {

        /* renamed from: a */
        private boolean f8433a;

        /* renamed from: b */
        private final C2918d f8434b;
        @GuardedBy("this")

        /* renamed from: c */
        private boolean f8435c;
        @GuardedBy("this")

        /* renamed from: d */
        private C2916b<C2860a> f8436d;
        @GuardedBy("this")

        /* renamed from: e */
        private Boolean f8437e;

        C2926a(C2918d dVar) {
            this.f8434b = dVar;
        }

        /* renamed from: b */
        private final synchronized void m12091b() {
            if (!this.f8435c) {
                this.f8433a = m12093d();
                Boolean c = m12092c();
                this.f8437e = c;
                if (c == null && this.f8433a) {
                    C2936c1 c1Var = new C2936c1(this);
                    this.f8436d = c1Var;
                    this.f8434b.mo9575a(C2860a.class, c1Var);
                }
                this.f8435c = true;
            }
        }

        /* renamed from: c */
        private final Boolean m12092c() {
            String str = "firebase_messaging_auto_init_enabled";
            Context a = FirebaseInstanceId.this.f8426b.mo9508a();
            SharedPreferences sharedPreferences = a.getSharedPreferences("com.google.firebase.messaging", 0);
            String str2 = "auto_init";
            if (sharedPreferences.contains(str2)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(str2, false));
            }
            try {
                PackageManager packageManager = a.getPackageManager();
                if (packageManager != null) {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(a.getPackageName(), 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str))) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(str));
                    }
                }
            } catch (NameNotFoundException unused) {
            }
            return null;
        }

        /* renamed from: d */
        private final boolean m12093d() {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return true;
            } catch (ClassNotFoundException unused) {
                Context a = FirebaseInstanceId.this.f8426b.mo9508a();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(a.getPackageName());
                ResolveInfo resolveService = a.getPackageManager().resolveService(intent, 0);
                return (resolveService == null || resolveService.serviceInfo == null) ? false : true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
            return r1.f8433a && com.google.firebase.iid.FirebaseInstanceId.m12059a(r1.f8438f).isDataCollectionDefaultEnabled();
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized boolean mo9626a() {
            /*
                r1 = this;
                monitor-enter(r1)
                r1.m12091b()     // Catch:{ all -> 0x0025 }
                java.lang.Boolean r0 = r1.f8437e     // Catch:{ all -> 0x0025 }
                if (r0 == 0) goto L_0x0010
                java.lang.Boolean r0 = r1.f8437e     // Catch:{ all -> 0x0025 }
                boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0025 }
                monitor-exit(r1)
                return r0
            L_0x0010:
                boolean r0 = r1.f8433a     // Catch:{ all -> 0x0025 }
                if (r0 == 0) goto L_0x0023
                com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.this     // Catch:{ all -> 0x0025 }
                com.google.firebase.FirebaseApp r0 = r0.f8426b     // Catch:{ all -> 0x0025 }
                boolean r0 = r0.isDataCollectionDefaultEnabled()     // Catch:{ all -> 0x0025 }
                if (r0 == 0) goto L_0x0023
                r0 = 1
            L_0x0021:
                monitor-exit(r1)
                return r0
            L_0x0023:
                r0 = 0
                goto L_0x0021
            L_0x0025:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.C2926a.mo9626a():boolean");
        }
    }

    FirebaseInstanceId(FirebaseApp firebaseApp, C2918d dVar, C3043h hVar, C2921c cVar, C3004h hVar2) {
        this(firebaseApp, new C2974r(firebaseApp.mo9508a()), C2979t0.m12192b(), C2979t0.m12192b(), dVar, hVar, cVar, hVar2);
    }

    private FirebaseInstanceId(FirebaseApp firebaseApp, C2974r rVar, Executor executor, Executor executor2, C2918d dVar, C3043h hVar, C2921c cVar, C3004h hVar2) {
        Executor executor3 = executor2;
        this.f8431g = false;
        if (C2974r.m12180a(firebaseApp) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f8422j == null) {
                    f8422j = new C2935c0(firebaseApp.mo9508a());
                }
            }
            this.f8426b = firebaseApp;
            this.f8427c = rVar;
            C2945f1 f1Var = new C2945f1(firebaseApp, rVar, executor, hVar, cVar, hVar2);
            this.f8428d = f1Var;
            this.f8425a = executor3;
            this.f8432h = new C2926a(dVar);
            Executor executor4 = executor;
            this.f8429e = new C2985w(executor);
            this.f8430f = hVar2;
            executor3.execute(new C2988x0(this));
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    /* renamed from: a */
    private final <T> T m12060a(C4350h<T> hVar) {
        try {
            return C4354k.m17759a(hVar, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    mo9621f();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: a */
    private static String m12061a(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    /* renamed from: a */
    private static void m12062a(FirebaseApp firebaseApp) {
        C2148s.m8836a(firebaseApp.mo9511c().mo9580d(), (Object) "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        C2148s.m8836a(firebaseApp.mo9511c().mo9578b(), (Object) "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        C2148s.m8836a(firebaseApp.mo9511c().mo9577a(), (Object) "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        C2148s.m8842a(firebaseApp.mo9511c().mo9578b().contains(":"), (Object) "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C2148s.m8842a(f8423k.matcher(firebaseApp.mo9511c().mo9577a()).matches(), (Object) "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* renamed from: a */
    static void m12063a(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (f8424l == null) {
                f8424l = new ScheduledThreadPoolExecutor(1, new C2202a("FirebaseInstanceId"));
            }
            f8424l.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* renamed from: b */
    private final C4350h<C2928a> m12065b(String str, String str2) {
        return C4354k.m17756a(null).mo13015b(this.f8425a, new C2986w0(this, str, m12061a(str2)));
    }

    /* renamed from: c */
    private final C2932b0 m12067c(String str, String str2) {
        return f8422j.mo9636a(m12073p(), str, str2);
    }

    @Keep
    public static FirebaseInstanceId getInstance(FirebaseApp firebaseApp) {
        m12062a(firebaseApp);
        return (FirebaseInstanceId) firebaseApp.mo9509a(FirebaseInstanceId.class);
    }

    /* renamed from: k */
    public static FirebaseInstanceId m12068k() {
        return getInstance(FirebaseApp.getInstance());
    }

    /* renamed from: l */
    static boolean m12069l() {
        String str = "FirebaseInstanceId";
        return Log.isLoggable(str, 3) || (VERSION.SDK_INT == 23 && Log.isLoggable(str, 3));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final void m12070m() {
        if (mo9616a(mo9619d())) {
            m12071n();
        }
    }

    /* renamed from: n */
    private final synchronized void m12071n() {
        if (!this.f8431g) {
            mo9614a(0);
        }
    }

    /* renamed from: o */
    private final String m12072o() {
        try {
            f8422j.mo9635a(this.f8426b.mo9512d());
            C4350h d = this.f8430f.mo9731d();
            C2148s.m8835a(d, (Object) "Task must not be null");
            CountDownLatch countDownLatch = new CountDownLatch(1);
            d.mo13007a(C2992z0.f8566f, (C4343c<TResult>) new C2990y0<TResult>(countDownLatch));
            countDownLatch.await(30000, TimeUnit.MILLISECONDS);
            if (d.mo13021e()) {
                return (String) d.mo13016b();
            }
            if (d.mo13019c()) {
                throw new CancellationException("Task is already canceled");
            }
            throw new IllegalStateException(d.mo13011a());
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: p */
    private final String m12073p() {
        return "[DEFAULT]".equals(this.f8426b.mo9510b()) ? "" : this.f8426b.mo9512d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C4350h mo9609a(String str, String str2, C4350h hVar) {
        String o = m12072o();
        C2932b0 c = m12067c(str, str2);
        return !mo9616a(c) ? C4354k.m17756a(new C2937d(o, c.f8446a)) : this.f8429e.mo9704a(str, str2, new C2933b1(this, o, str, str2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C4350h mo9610a(String str, String str2, String str3) {
        return this.f8428d.mo9658a(str, str2, str3).mo13010a(this.f8425a, (C4349g<TResult, TContinuationResult>) new C2930a1<TResult,TContinuationResult>(this, str2, str3, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C4350h mo9611a(String str, String str2, String str3, String str4) {
        f8422j.mo9638a(m12073p(), str, str2, str4, this.f8427c.mo9691c());
        return C4354k.m17756a(new C2937d(str3, str4));
    }

    /* renamed from: a */
    public String mo9612a() {
        m12062a(this.f8426b);
        m12070m();
        return m12072o();
    }

    /* renamed from: a */
    public String mo9613a(String str, String str2) {
        m12062a(this.f8426b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((C2928a) m12060a(m12065b(str, str2))).mo9628a();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo9614a(long j) {
        m12063a((Runnable) new C2944f0(this, Math.min(Math.max(30, j << 1), f8421i)), j);
        this.f8431g = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo9615a(boolean z) {
        this.f8431g = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo9616a(C2932b0 b0Var) {
        return b0Var == null || b0Var.mo9632a(this.f8427c.mo9691c());
    }

    /* renamed from: b */
    public C4350h<C2928a> mo9617b() {
        m12062a(this.f8426b);
        return m12065b(C2974r.m12180a(this.f8426b), "*");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final FirebaseApp mo9618c() {
        return this.f8426b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final C2932b0 mo9619d() {
        return m12067c(C2974r.m12180a(this.f8426b), "*");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final String mo9620e() {
        return mo9613a(C2974r.m12180a(this.f8426b), "*");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final synchronized void mo9621f() {
        f8422j.mo9637a();
        if (this.f8432h.mo9626a()) {
            m12071n();
        }
    }

    /* renamed from: g */
    public final boolean mo9622g() {
        return this.f8427c.mo9689a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final void mo9623h() {
        f8422j.mo9639b(m12073p());
        m12071n();
    }

    /* renamed from: i */
    public final boolean mo9624i() {
        return this.f8432h.mo9626a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo9625j() {
        if (this.f8432h.mo9626a()) {
            m12070m();
        }
    }
}
