package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.internal.C2017c;
import com.google.android.gms.common.api.internal.C2017c.C2018a;
import com.google.android.gms.common.internal.C2141q;
import com.google.android.gms.common.internal.C2141q.C2142a;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.util.C2188c;
import com.google.android.gms.common.util.C2197l;
import com.google.android.gms.common.util.C2198m;
import com.google.firebase.components.C2873d;
import com.google.firebase.components.C2877f;
import com.google.firebase.components.C2886l;
import com.google.firebase.components.C2896s;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.p059f.C2917c;
import com.google.firebase.p060g.C2920b;
import com.google.firebase.p062i.C2925a;
import com.google.firebase.p066j.C3038c;
import com.google.firebase.p066j.C3040e;
import com.google.firebase.p066j.C3042g;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;
import p071f.p088e.C3162a;
import p071f.p097h.p104i.C3281d;

public class FirebaseApp {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final Object f8303i = new Object();

    /* renamed from: j */
    private static final Executor f8304j = new C2858d();
    @GuardedBy("LOCK")

    /* renamed from: k */
    static final Map<String, FirebaseApp> f8305k = new C3162a();

    /* renamed from: a */
    private final Context f8306a;

    /* renamed from: b */
    private final String f8307b;

    /* renamed from: c */
    private final C2901d f8308c;

    /* renamed from: d */
    private final C2886l f8309d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicBoolean f8310e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f8311f = new AtomicBoolean();

    /* renamed from: g */
    private final C2896s<C2925a> f8312g;

    /* renamed from: h */
    private final List<C2856b> f8313h = new CopyOnWriteArrayList();

    /* renamed from: com.google.firebase.FirebaseApp$b */
    public interface C2856b {
        /* renamed from: a */
        void mo9518a(boolean z);
    }

    @TargetApi(14)
    /* renamed from: com.google.firebase.FirebaseApp$c */
    private static class C2857c implements C2018a {

        /* renamed from: a */
        private static AtomicReference<C2857c> f8314a = new AtomicReference<>();

        private C2857c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m11871b(Context context) {
            if (C2197l.m8998a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f8314a.get() == null) {
                    C2857c cVar = new C2857c();
                    if (f8314a.compareAndSet(null, cVar)) {
                        C2017c.m8399a(application);
                        C2017c.m8400b().mo6656a((C2018a) cVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo6669a(boolean z) {
            synchronized (FirebaseApp.f8303i) {
                Iterator it = new ArrayList(FirebaseApp.f8305k.values()).iterator();
                while (it.hasNext()) {
                    FirebaseApp firebaseApp = (FirebaseApp) it.next();
                    if (firebaseApp.f8310e.get()) {
                        firebaseApp.m11858a(z);
                    }
                }
            }
        }
    }

    /* renamed from: com.google.firebase.FirebaseApp$d */
    private static class C2858d implements Executor {

        /* renamed from: f */
        private static final Handler f8315f = new Handler(Looper.getMainLooper());

        private C2858d() {
        }

        public void execute(Runnable runnable) {
            f8315f.post(runnable);
        }
    }

    @TargetApi(24)
    /* renamed from: com.google.firebase.FirebaseApp$e */
    private static class C2859e extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference<C2859e> f8316b = new AtomicReference<>();

        /* renamed from: a */
        private final Context f8317a;

        public C2859e(Context context) {
            this.f8317a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m11874b(Context context) {
            if (f8316b.get() == null) {
                C2859e eVar = new C2859e(context);
                if (f8316b.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: a */
        public void mo9520a() {
            this.f8317a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.f8303i) {
                for (FirebaseApp a : FirebaseApp.f8305k.values()) {
                    a.m11862h();
                }
            }
            mo9520a();
        }
    }

    protected FirebaseApp(Context context, String str, C2901d dVar) {
        new CopyOnWriteArrayList();
        C2148s.m8834a(context);
        this.f8306a = context;
        C2148s.m8844b(str);
        this.f8307b = str;
        C2148s.m8834a(dVar);
        this.f8308c = dVar;
        List a = C2877f.m11942a(context, ComponentDiscoveryService.class).mo9552a();
        String a2 = C3040e.m12395a();
        Executor executor = f8304j;
        C2873d[] dVarArr = new C2873d[8];
        dVarArr[0] = C2873d.m11918a(context, Context.class, new Class[0]);
        dVarArr[1] = C2873d.m11918a(this, FirebaseApp.class, new Class[0]);
        dVarArr[2] = C2873d.m11918a(dVar, C2901d.class, new Class[0]);
        dVarArr[3] = C3042g.m12399a("fire-android", "");
        dVarArr[4] = C3042g.m12399a("fire-core", "19.3.0");
        dVarArr[5] = a2 != null ? C3042g.m12399a("kotlin", a2) : null;
        dVarArr[6] = C3038c.m12391b();
        dVarArr[7] = C2920b.m12048a();
        this.f8309d = new C2886l(executor, a, dVarArr);
        this.f8312g = new C2896s<>(C2868b.m11908a(this, context));
    }

    /* renamed from: a */
    public static FirebaseApp m11851a(Context context) {
        synchronized (f8303i) {
            if (f8305k.containsKey("[DEFAULT]")) {
                FirebaseApp instance = getInstance();
                return instance;
            }
            C2901d a = C2901d.m11994a(context);
            if (a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            FirebaseApp a2 = m11852a(context, a);
            return a2;
        }
    }

    /* renamed from: a */
    public static FirebaseApp m11852a(Context context, C2901d dVar) {
        return m11853a(context, dVar, "[DEFAULT]");
    }

    /* renamed from: a */
    public static FirebaseApp m11853a(Context context, C2901d dVar, String str) {
        FirebaseApp firebaseApp;
        C2857c.m11871b(context);
        String a = m11855a(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f8303i) {
            boolean z = !f8305k.containsKey(a);
            StringBuilder sb = new StringBuilder();
            sb.append("FirebaseApp name ");
            sb.append(a);
            sb.append(" already exists!");
            C2148s.m8846b(z, sb.toString());
            C2148s.m8835a(context, (Object) "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, a, dVar);
            f8305k.put(a, firebaseApp);
        }
        firebaseApp.m11862h();
        return firebaseApp;
    }

    /* renamed from: a */
    static /* synthetic */ C2925a m11854a(FirebaseApp firebaseApp, Context context) {
        return new C2925a(context, firebaseApp.mo9512d(), (C2917c) firebaseApp.f8309d.mo9535a(C2917c.class));
    }

    /* renamed from: a */
    private static String m11855a(String str) {
        return str.trim();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11858a(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (C2856b a : this.f8313h) {
            a.mo9518a(z);
        }
    }

    /* renamed from: g */
    private void m11861g() {
        C2148s.m8846b(!this.f8311f.get(), "FirebaseApp was deleted");
    }

    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (f8303i) {
            firebaseApp = (FirebaseApp) f8305k.get("[DEFAULT]");
            if (firebaseApp == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Default FirebaseApp is not initialized in this process ");
                sb.append(C2198m.m9010a());
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return firebaseApp;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m11862h() {
        if (!C3281d.m13446a(this.f8306a)) {
            C2859e.m11874b(this.f8306a);
        } else {
            this.f8309d.mo9555a(mo9513e());
        }
    }

    /* renamed from: a */
    public Context mo9508a() {
        m11861g();
        return this.f8306a;
    }

    /* renamed from: a */
    public <T> T mo9509a(Class<T> cls) {
        m11861g();
        return this.f8309d.mo9535a(cls);
    }

    /* renamed from: b */
    public String mo9510b() {
        m11861g();
        return this.f8307b;
    }

    /* renamed from: c */
    public C2901d mo9511c() {
        m11861g();
        return this.f8308c;
    }

    /* renamed from: d */
    public String mo9512d() {
        StringBuilder sb = new StringBuilder();
        sb.append(C2188c.m8973a(mo9510b().getBytes(Charset.defaultCharset())));
        sb.append("+");
        sb.append(C2188c.m8973a(mo9511c().mo9578b().getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    /* renamed from: e */
    public boolean mo9513e() {
        return "[DEFAULT]".equals(mo9510b());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        return this.f8307b.equals(((FirebaseApp) obj).mo9510b());
    }

    public int hashCode() {
        return this.f8307b.hashCode();
    }

    public boolean isDataCollectionDefaultEnabled() {
        m11861g();
        return ((C2925a) this.f8312g.get()).mo9608a();
    }

    public String toString() {
        C2142a a = C2141q.m8822a((Object) this);
        a.mo6935a("name", this.f8307b);
        a.mo6935a("options", this.f8308c);
        return a.toString();
    }
}
