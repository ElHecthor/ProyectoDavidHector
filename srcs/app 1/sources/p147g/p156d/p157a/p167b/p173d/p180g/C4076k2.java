package p147g.p156d.p157a.p167b.p173d.p180g;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p071f.p088e.C3162a;

/* renamed from: g.d.a.b.d.g.k2 */
public final class C4076k2 implements C4177r1 {

    /* renamed from: f */
    private static final Map<String, C4076k2> f11057f = new C3162a();

    /* renamed from: a */
    private final SharedPreferences f11058a;

    /* renamed from: b */
    private final OnSharedPreferenceChangeListener f11059b = new C4060j2(this);

    /* renamed from: c */
    private final Object f11060c = new Object();

    /* renamed from: d */
    private volatile Map<String, ?> f11061d;

    /* renamed from: e */
    private final List<C4196s1> f11062e = new ArrayList();

    private C4076k2(SharedPreferences sharedPreferences) {
        this.f11058a = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.f11059b);
    }

    /* renamed from: a */
    static C4076k2 m16694a(Context context, String str) {
        C4076k2 k2Var;
        if (!((!C4134o1.m16876a() || str.startsWith("direct_boot:")) ? true : C4134o1.m16877a(context))) {
            return null;
        }
        synchronized (C4076k2.class) {
            k2Var = (C4076k2) f11057f.get(str);
            if (k2Var == null) {
                k2Var = new C4076k2(m16696b(context, str));
                f11057f.put(str, k2Var);
            }
        }
        return k2Var;
    }

    /* renamed from: a */
    static synchronized void m16695a() {
        synchronized (C4076k2.class) {
            for (C4076k2 k2Var : f11057f.values()) {
                k2Var.f11058a.unregisterOnSharedPreferenceChangeListener(k2Var.f11059b);
            }
            f11057f.clear();
        }
    }

    /* renamed from: b */
    private static SharedPreferences m16696b(Context context, String str) {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (str.startsWith("direct_boot:")) {
                if (C4134o1.m16876a()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                return context.getSharedPreferences(str.substring(12), 0);
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return sharedPreferences;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final Object mo12592a(String str) {
        Map<String, ?> map = this.f11061d;
        if (map == null) {
            synchronized (this.f11060c) {
                map = this.f11061d;
                if (map == null) {
                    ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.f11058a.getAll();
                        this.f11061d = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12593a(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f11060c) {
            this.f11061d = null;
            C3927b2.m15760c();
        }
        synchronized (this) {
            for (C4196s1 a : this.f11062e) {
                a.mo12775a();
            }
        }
    }
}
