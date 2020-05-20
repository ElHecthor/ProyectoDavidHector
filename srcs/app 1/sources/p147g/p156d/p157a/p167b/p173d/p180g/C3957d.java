package p147g.p156d.p157a.p167b.p173d.p180g;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.internal.C2156w;
import com.google.android.gms.common.p051p.C2175c;
import com.google.android.gms.common.util.C2190e;
import com.google.android.gms.common.util.C2193h;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.C2212a;
import com.google.android.gms.dynamite.DynamiteModule.C2213b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.C2324h6;
import com.google.android.gms.measurement.p053a.C2230a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: g.d.a.b.d.g.d */
public class C3957d {

    /* renamed from: h */
    private static volatile C3957d f10879h = null;

    /* renamed from: i */
    private static Boolean f10880i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static Boolean f10881j = null;

    /* renamed from: k */
    private static boolean f10882k = false;

    /* renamed from: l */
    private static Boolean f10883l = null;

    /* renamed from: m */
    private static String f10884m = "use_dynamite_api";

    /* renamed from: n */
    private static String f10885n = "allow_remote_dynamite";

    /* renamed from: o */
    private static boolean f10886o = true;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f10887a;

    /* renamed from: b */
    protected final C2190e f10888b;

    /* renamed from: c */
    private final ExecutorService f10889c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<Pair<C2324h6, C3959b>> f10890d;

    /* renamed from: e */
    private int f10891e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f10892f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C4302yc f10893g;

    /* renamed from: g.d.a.b.d.g.d$a */
    abstract class C3958a implements Runnable {

        /* renamed from: f */
        final long f10894f;

        /* renamed from: g */
        final long f10895g;

        /* renamed from: h */
        private final boolean f10896h;

        C3958a(C3957d dVar) {
            this(true);
        }

        C3958a(boolean z) {
            this.f10894f = C3957d.this.f10888b.mo6988b();
            this.f10895g = C3957d.this.f10888b.mo6989c();
            this.f10896h = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo12054a();

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo12314b() {
        }

        public void run() {
            if (C3957d.this.f10892f) {
                mo12314b();
                return;
            }
            try {
                mo12054a();
            } catch (Exception e) {
                C3957d.this.m16146a(e, false, this.f10896h);
                mo12314b();
            }
        }
    }

    /* renamed from: g.d.a.b.d.g.d$b */
    static class C3959b extends C3976dd {

        /* renamed from: a */
        private final C2324h6 f10898a;

        C3959b(C2324h6 h6Var) {
            this.f10898a = h6Var;
        }

        /* renamed from: a */
        public final int mo12316a() {
            return System.identityHashCode(this.f10898a);
        }

        /* renamed from: a */
        public final void mo12317a(String str, String str2, Bundle bundle, long j) {
            this.f10898a.onEvent(str, str2, bundle, j);
        }
    }

    /* renamed from: g.d.a.b.d.g.d$c */
    class C3960c implements ActivityLifecycleCallbacks {
        C3960c() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C3957d.this.m16143a((C3958a) new C3908a0(this, activity, bundle));
        }

        public final void onActivityDestroyed(Activity activity) {
            C3957d.this.m16143a((C3958a) new C3994f0(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            C3957d.this.m16143a((C3958a) new C3978e0(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            C3957d.this.m16143a((C3958a) new C3924b0(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C4271wc wcVar = new C4271wc();
            C3957d.this.m16143a((C3958a) new C4011g0(this, activity, wcVar));
            Bundle b = wcVar.mo12899b(50);
            if (b != null) {
                bundle.putAll(b);
            }
        }

        public final void onActivityStarted(Activity activity) {
            C3957d.this.m16143a((C3958a) new C3940c0(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            C3957d.this.m16143a((C3958a) new C3961d0(this, activity));
        }
    }

    private C3957d(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !m16156c(str2, str3)) {
            str = "FA";
        }
        this.f10887a = str;
        this.f10888b = C2193h.m8985d();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f10889c = threadPoolExecutor;
        new C2230a(this);
        boolean z = false;
        if (!(!m16161f(context) || m16163g())) {
            this.f10892f = true;
            Log.w(this.f10887a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!m16156c(str2, str3)) {
            if (str2 == null || str3 == null) {
                boolean z2 = str2 == null;
                if (str3 == null) {
                    z = true;
                }
                if (z2 ^ z) {
                    Log.w(this.f10887a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f10887a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        C4010g gVar = new C4010g(this, str2, str3, context, bundle);
        m16143a((C3958a) gVar);
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f10887a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C3960c());
        }
    }

    /* renamed from: a */
    public static C3957d m16139a(Context context) {
        return m16140a(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    /* renamed from: a */
    public static C3957d m16140a(Context context, String str, String str2, String str3, Bundle bundle) {
        C2148s.m8834a(context);
        if (f10879h == null) {
            synchronized (C3957d.class) {
                if (f10879h == null) {
                    C3957d dVar = new C3957d(context, str, str2, str3, bundle);
                    f10879h = dVar;
                }
            }
        }
        return f10879h;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16143a(C3958a aVar) {
        this.f10889c.execute(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16146a(Exception exc, boolean z, boolean z2) {
        this.f10892f |= z;
        if (z) {
            Log.w(this.f10887a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        String str = "Error with data collection. Data lost.";
        if (z2) {
            mo12295a(5, str, (Object) exc, (Object) null, (Object) null);
        }
        Log.w(this.f10887a, str, exc);
    }

    /* renamed from: a */
    private final void m16147a(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        C4288y yVar = new C4288y(this, l, str, str2, bundle, z, z2);
        m16143a((C3958a) yVar);
    }

    /* renamed from: a */
    private final void m16148a(String str, String str2, Object obj, boolean z) {
        C4272x xVar = new C4272x(this, str, str2, obj, z);
        m16143a((C3958a) xVar);
    }

    /* renamed from: a */
    private static boolean m16149a(Context context, String str) {
        C2148s.m8844b(str);
        try {
            ApplicationInfo a = C2175c.m8939a(context).mo6959a(context.getPackageName(), 128);
            if (a != null) {
                if (a.metaData != null) {
                    return a.metaData.getBoolean(str);
                }
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m16153b(Context context) {
        Boolean valueOf;
        Class<String> cls = String.class;
        m16165i(context);
        synchronized (C3957d.class) {
            if (!f10882k) {
                try {
                    String str = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke(null, new Object[]{"measurement.dynamite.enabled", ""});
                    if ("true".equals(str)) {
                        valueOf = Boolean.valueOf(true);
                    } else if ("false".equals(str)) {
                        valueOf = Boolean.valueOf(false);
                    } else {
                        f10883l = null;
                        f10882k = true;
                    }
                    f10883l = valueOf;
                } catch (Exception e) {
                    try {
                        Log.e("FA", "Unable to call SystemProperties.get()", e);
                        f10883l = null;
                    } catch (Throwable th) {
                        f10882k = true;
                        throw th;
                    }
                }
                f10882k = true;
            }
        }
        Boolean bool = f10883l;
        if (bool == null) {
            bool = f10880i;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m16156c(String str, String str2) {
        return (str2 == null || str == null || m16163g()) ? false : true;
    }

    /* renamed from: f */
    private static boolean m16161f(Context context) {
        try {
            if (new C2156w(context).mo6948a("google_app_id") != null) {
                return true;
            }
        } catch (IllegalStateException unused) {
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static int m16162g(Context context) {
        return DynamiteModule.m9045b(context, ModuleDescriptor.MODULE_ID);
    }

    /* renamed from: g */
    private static boolean m16163g() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static int m16164h(Context context) {
        return DynamiteModule.m9038a(context, ModuleDescriptor.MODULE_ID);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static void m16165i(Context context) {
        synchronized (C3957d.class) {
            try {
                if (f10880i != null && f10881j != null) {
                    return;
                }
                if (m16149a(context, "app_measurement_internal_disable_startup_flags")) {
                    f10880i = Boolean.valueOf(f10886o);
                    f10881j = Boolean.valueOf(false);
                    return;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                f10880i = Boolean.valueOf(sharedPreferences.getBoolean(f10884m, f10886o));
                f10881j = Boolean.valueOf(sharedPreferences.getBoolean(f10885n, false));
                Editor edit = sharedPreferences.edit();
                edit.remove(f10884m);
                edit.remove(f10885n);
                edit.apply();
            } catch (Exception e) {
                Log.e("FA", "Exception reading flag from SharedPreferences.", e);
                f10880i = Boolean.valueOf(f10886o);
                f10881j = Boolean.valueOf(false);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C4302yc mo12292a(Context context, boolean z) {
        C2213b bVar;
        if (z) {
            try {
                bVar = DynamiteModule.f6202k;
            } catch (C2212a e) {
                m16146a((Exception) e, true, false);
                return null;
            }
        } else {
            bVar = DynamiteModule.f6200i;
        }
        return C4287xc.asInterface(DynamiteModule.m9040a(context, bVar, ModuleDescriptor.MODULE_ID).mo6993a("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
    }

    /* renamed from: a */
    public final String mo12293a() {
        C4271wc wcVar = new C4271wc();
        m16143a((C3958a) new C4118n(this, wcVar));
        return wcVar.mo12898a(500);
    }

    /* renamed from: a */
    public final Map<String, Object> mo12294a(String str, String str2, boolean z) {
        C4271wc wcVar = new C4271wc();
        C4160q qVar = new C4160q(this, str, str2, z, wcVar);
        m16143a((C3958a) qVar);
        Bundle b = wcVar.mo12899b(5000);
        if (b == null || b.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(b.size());
        for (String str3 : b.keySet()) {
            Object obj = b.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo12295a(int i, String str, Object obj, Object obj2, Object obj3) {
        C4193s sVar = new C4193s(this, false, 5, str, obj, null, null);
        m16143a((C3958a) sVar);
    }

    /* renamed from: a */
    public final void mo12296a(Activity activity, String str, String str2) {
        m16143a((C3958a) new C4056j(this, activity, str, str2));
    }

    /* renamed from: a */
    public final void mo12297a(Bundle bundle) {
        m16143a((C3958a) new C4303z(this, bundle));
    }

    /* renamed from: a */
    public final void mo12298a(C2324h6 h6Var) {
        C2148s.m8834a(h6Var);
        m16143a((C3958a) new C4243v(this, h6Var));
    }

    /* renamed from: a */
    public final void mo12299a(String str) {
        m16143a((C3958a) new C4026h(this, str));
    }

    /* renamed from: a */
    public final void mo12300a(String str, Bundle bundle) {
        m16147a(null, str, bundle, false, true, null);
    }

    /* renamed from: a */
    public final void mo12301a(String str, String str2) {
        m16148a((String) null, str, (Object) str2, false);
    }

    /* renamed from: a */
    public final void mo12302a(String str, String str2, Bundle bundle) {
        m16147a(str, str2, bundle, true, true, null);
    }

    /* renamed from: a */
    public final void mo12303a(String str, String str2, Object obj) {
        m16148a(str, str2, obj, true);
    }

    /* renamed from: a */
    public final void mo12304a(boolean z) {
        m16143a((C3958a) new C4257w(this, z));
    }

    /* renamed from: b */
    public final String mo12305b() {
        C4271wc wcVar = new C4271wc();
        m16143a((C3958a) new C4102m(this, wcVar));
        return wcVar.mo12898a(50);
    }

    /* renamed from: b */
    public final List<Bundle> mo12306b(String str, String str2) {
        C4271wc wcVar = new C4271wc();
        m16143a((C3958a) new C4041i(this, str, str2, wcVar));
        List<Bundle> list = (List) C4271wc.m17508a(wcVar.mo12899b(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: b */
    public final void mo12307b(String str) {
        m16143a((C3958a) new C4071k(this, str));
    }

    /* renamed from: b */
    public final void mo12308b(String str, String str2, Bundle bundle) {
        m16143a((C3958a) new C3993f(this, str, str2, bundle));
    }

    /* renamed from: c */
    public final long mo12309c() {
        C4271wc wcVar = new C4271wc();
        m16143a((C3958a) new C4146p(this, wcVar));
        Long l = (Long) C4271wc.m17508a(wcVar.mo12899b(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f10888b.mo6988b()).nextLong();
        int i = this.f10891e + 1;
        this.f10891e = i;
        return nextLong + ((long) i);
    }

    /* renamed from: c */
    public final void mo12310c(String str) {
        m16143a((C3958a) new C4087l(this, str));
    }

    /* renamed from: d */
    public final int mo12311d(String str) {
        C4271wc wcVar = new C4271wc();
        m16143a((C3958a) new C4208t(this, str, wcVar));
        Integer num = (Integer) C4271wc.m17508a(wcVar.mo12899b(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: d */
    public final String mo12312d() {
        C4271wc wcVar = new C4271wc();
        m16143a((C3958a) new C4132o(this, wcVar));
        return wcVar.mo12898a(500);
    }

    /* renamed from: e */
    public final String mo12313e() {
        C4271wc wcVar = new C4271wc();
        m16143a((C3958a) new C4174r(this, wcVar));
        return wcVar.mo12898a(500);
    }
}
