package com.facebook.p034f0.p038s;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C1787m;
import com.facebook.C1845w;
import com.facebook.internal.C1661j;
import com.facebook.internal.C1661j.C1664c;
import com.facebook.internal.C1661j.C1665d;
import com.facebook.internal.C1670l;
import com.facebook.internal.C1672m;
import com.facebook.internal.C1682p;
import com.facebook.internal.C1698v;
import com.facebook.p034f0.C1547g;
import com.facebook.p034f0.p035q.C1565a;
import com.facebook.p034f0.p036r.C1575b;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.f0.s.a */
public class C1602a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f4965a = "com.facebook.f0.s.a";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final ScheduledExecutorService f4966b = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static volatile ScheduledFuture f4967c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Object f4968d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static AtomicInteger f4969e = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static volatile C1622h f4970f;

    /* renamed from: g */
    private static AtomicBoolean f4971g = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static String f4972h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static long f4973i;

    /* renamed from: j */
    private static int f4974j = 0;

    /* renamed from: com.facebook.f0.s.a$a */
    static class C1603a implements C1664c {
        C1603a() {
        }

        /* renamed from: a */
        public void mo5768a(boolean z) {
            if (z) {
                C1575b.m6990d();
            } else {
                C1575b.m6986c();
            }
        }
    }

    /* renamed from: com.facebook.f0.s.a$b */
    static class C1604b implements ActivityLifecycleCallbacks {
        C1604b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C1682p.m7282a(C1845w.APP_EVENTS, C1602a.f4965a, "onActivityCreated");
            C1609b.m7092a();
            C1602a.m7074c(activity);
        }

        public void onActivityDestroyed(Activity activity) {
            C1682p.m7282a(C1845w.APP_EVENTS, C1602a.f4965a, "onActivityDestroyed");
            C1602a.m7076d(activity);
        }

        public void onActivityPaused(Activity activity) {
            C1682p.m7282a(C1845w.APP_EVENTS, C1602a.f4965a, "onActivityPaused");
            C1609b.m7092a();
            C1602a.m7078e(activity);
        }

        public void onActivityResumed(Activity activity) {
            C1682p.m7282a(C1845w.APP_EVENTS, C1602a.f4965a, "onActivityResumed");
            C1609b.m7092a();
            C1602a.m7080f(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C1682p.m7282a(C1845w.APP_EVENTS, C1602a.f4965a, "onActivitySaveInstanceState");
        }

        public void onActivityStarted(Activity activity) {
            C1602a.m7073c();
            C1682p.m7282a(C1845w.APP_EVENTS, C1602a.f4965a, "onActivityStarted");
        }

        public void onActivityStopped(Activity activity) {
            C1682p.m7282a(C1845w.APP_EVENTS, C1602a.f4965a, "onActivityStopped");
            C1547g.m6887d();
            C1602a.m7075d();
        }
    }

    /* renamed from: com.facebook.f0.s.a$c */
    static class C1605c implements Runnable {
        C1605c() {
        }

        public void run() {
            if (C1602a.f4970f == null) {
                C1602a.f4970f = C1622h.m7130j();
            }
        }
    }

    /* renamed from: com.facebook.f0.s.a$d */
    static class C1606d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ long f4975f;

        /* renamed from: g */
        final /* synthetic */ String f4976g;

        C1606d(long j, String str) {
            this.f4975f = j;
            this.f4976g = str;
        }

        public void run() {
            if (C1602a.f4970f == null) {
                C1602a.f4970f = new C1622h(Long.valueOf(this.f4975f), null);
                C1623i.m7143a(this.f4976g, (C1624j) null, C1602a.f4972h);
            } else if (C1602a.f4970f.mo5853d() != null) {
                long longValue = this.f4975f - C1602a.f4970f.mo5853d().longValue();
                if (longValue > ((long) (C1602a.m7087m() * 1000))) {
                    C1623i.m7142a(this.f4976g, C1602a.f4970f, C1602a.f4972h);
                    C1623i.m7143a(this.f4976g, (C1624j) null, C1602a.f4972h);
                    C1602a.f4970f = new C1622h(Long.valueOf(this.f4975f), null);
                } else if (longValue > 1000) {
                    C1602a.f4970f.mo5856g();
                }
            }
            C1602a.f4970f.mo5850a(Long.valueOf(this.f4975f));
            C1602a.f4970f.mo5857h();
        }
    }

    /* renamed from: com.facebook.f0.s.a$e */
    static class C1607e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ long f4977f;

        /* renamed from: g */
        final /* synthetic */ String f4978g;

        /* renamed from: com.facebook.f0.s.a$e$a */
        class C1608a implements Runnable {
            C1608a() {
            }

            public void run() {
                if (C1602a.f4969e.get() <= 0) {
                    C1623i.m7142a(C1607e.this.f4978g, C1602a.f4970f, C1602a.f4972h);
                    C1622h.m7129i();
                    C1602a.f4970f = null;
                }
                synchronized (C1602a.f4968d) {
                    C1602a.f4967c = null;
                }
            }
        }

        C1607e(long j, String str) {
            this.f4977f = j;
            this.f4978g = str;
        }

        public void run() {
            if (C1602a.f4970f == null) {
                C1602a.f4970f = new C1622h(Long.valueOf(this.f4977f), null);
            }
            C1602a.f4970f.mo5850a(Long.valueOf(this.f4977f));
            if (C1602a.f4969e.get() <= 0) {
                C1608a aVar = new C1608a();
                synchronized (C1602a.f4968d) {
                    C1602a.f4967c = C1602a.f4966b.schedule(aVar, (long) C1602a.m7087m(), TimeUnit.SECONDS);
                }
            }
            long e = C1602a.f4973i;
            long j = 0;
            if (e > 0) {
                j = (this.f4977f - e) / 1000;
            }
            C1613d.m7099a(this.f4978g, j);
            C1602a.f4970f.mo5857h();
        }
    }

    /* renamed from: a */
    public static void m7070a(Application application, String str) {
        if (f4971g.compareAndSet(false, true)) {
            C1661j.m7223a(C1665d.CodelessEvents, new C1603a());
            f4972h = str;
            application.registerActivityLifecycleCallbacks(new C1604b());
        }
    }

    /* renamed from: c */
    static /* synthetic */ int m7073c() {
        int i = f4974j;
        f4974j = i + 1;
        return i;
    }

    /* renamed from: c */
    public static void m7074c(Activity activity) {
        f4966b.execute(new C1605c());
    }

    /* renamed from: d */
    static /* synthetic */ int m7075d() {
        int i = f4974j;
        f4974j = i - 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m7076d(Activity activity) {
        C1575b.m6980a(activity);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m7078e(Activity activity) {
        if (f4969e.decrementAndGet() < 0) {
            f4969e.set(0);
            Log.w(f4965a, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        m7085k();
        long currentTimeMillis = System.currentTimeMillis();
        String b = C1698v.m7393b((Context) activity);
        C1575b.m6985b(activity);
        f4966b.execute(new C1607e(currentTimeMillis, b));
    }

    /* renamed from: f */
    public static void m7080f(Activity activity) {
        f4969e.incrementAndGet();
        m7085k();
        long currentTimeMillis = System.currentTimeMillis();
        f4973i = currentTimeMillis;
        String b = C1698v.m7393b((Context) activity);
        C1575b.m6987c(activity);
        C1565a.m6950a(activity);
        f4966b.execute(new C1606d(currentTimeMillis, b));
    }

    /* renamed from: k */
    private static void m7085k() {
        synchronized (f4968d) {
            if (f4967c != null) {
                f4967c.cancel(false);
            }
            f4967c = null;
        }
    }

    /* renamed from: l */
    public static UUID m7086l() {
        if (f4970f != null) {
            return f4970f.mo5852c();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static int m7087m() {
        C1670l c = C1672m.m7268c(C1787m.m7745f());
        return c == null ? C1615e.m7103a() : c.mo5912h();
    }

    /* renamed from: n */
    public static boolean m7088n() {
        return f4974j == 0;
    }
}
