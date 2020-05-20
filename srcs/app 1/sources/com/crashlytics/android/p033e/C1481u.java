package com.crashlytics.android.p033e;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4795l;

/* renamed from: com.crashlytics.android.e.u */
class C1481u implements C1375b {

    /* renamed from: c */
    private static final List<Class<?>> f4647c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1448l f4648a;

    /* renamed from: b */
    private Object f4649b;

    /* renamed from: com.crashlytics.android.e.u$a */
    class C1482a implements InvocationHandler {
        C1482a() {
        }

        /* renamed from: a */
        public boolean mo5657a(Object obj, Object obj2) {
            boolean z = true;
            if (obj == obj2) {
                return true;
            }
            if (obj2 == null || !Proxy.isProxyClass(obj2.getClass()) || !super.equals(Proxy.getInvocationHandler(obj2))) {
                z = false;
            }
            return z;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            if (objArr == null) {
                objArr = new Object[0];
            }
            if (objArr.length == 1 && name.equals("equals")) {
                return Boolean.valueOf(mo5657a(obj, objArr[0]));
            }
            if (objArr.length == 0 && name.equals("hashCode")) {
                return Integer.valueOf(super.hashCode());
            }
            if (objArr.length == 0 && name.equals("toString")) {
                return super.toString();
            }
            if (objArr.length == 4 && name.equals("onEvent") && C1481u.m6710a(objArr)) {
                String str = (String) objArr[0];
                String str2 = (String) objArr[1];
                Bundle bundle = (Bundle) objArr[2];
                if (str != null && !str.equals("crash")) {
                    C1481u.m6712b(C1481u.this.f4648a, str2, bundle);
                    return null;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected method invoked on AppMeasurement.EventListener: ");
            sb.append(name);
            sb.append("(");
            StringBuilder sb2 = new StringBuilder(sb.toString());
            for (int i = 0; i < objArr.length; i++) {
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(objArr[i].getClass().getName());
            }
            sb2.append("); returning null");
            C4781c.m19229f().mo13792c("CrashlyticsCore", sb2.toString());
            return null;
        }
    }

    static {
        Class<String> cls = String.class;
        f4647c = Collections.unmodifiableList(Arrays.asList(new Class[]{cls, cls, Bundle.class, Long.class}));
    }

    public C1481u(C1448l lVar) {
        this.f4648a = lVar;
    }

    /* renamed from: a */
    private Class<?> m6707a(String str) {
        try {
            return this.f4648a.mo13833i().getClassLoader().loadClass(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m6708a(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    /* renamed from: a */
    static boolean m6710a(Object[] objArr) {
        if (objArr.length != f4647c.size()) {
            return false;
        }
        Iterator it = f4647c.iterator();
        for (Object obj : objArr) {
            if (!obj.getClass().equals(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private Object m6711b(Class<?> cls) {
        try {
            return cls.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(cls, new Object[]{this.f4648a.mo13833i()});
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m6712b(C1448l lVar, String str, Bundle bundle) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("$A$:");
            sb.append(m6708a(str, bundle));
            lVar.mo5623a(sb.toString());
        } catch (JSONException unused) {
            C4795l f = C4781c.m19229f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to serialize Firebase Analytics event; ");
            sb2.append(str);
            f.mo13787a("CrashlyticsCore", sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized Object mo5656a(Class cls) {
        if (this.f4649b == null) {
            this.f4649b = Proxy.newProxyInstance(this.f4648a.mo13833i().getClassLoader(), new Class[]{cls}, new C1482a());
        }
        return this.f4649b;
    }

    /* renamed from: a */
    public boolean mo5495a() {
        Class a = m6707a("com.google.android.gms.measurement.AppMeasurement");
        String str = "CrashlyticsCore";
        if (a == null) {
            C4781c.m19229f().mo13796e(str, "Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.");
            return false;
        }
        Object b = m6711b(a);
        if (b == null) {
            C4781c.m19229f().mo13787a(str, "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Could not create an instance of Firebase Analytics.");
            return false;
        }
        Class a2 = m6707a("com.google.android.gms.measurement.AppMeasurement$OnEventListener");
        if (a2 == null) {
            C4781c.m19229f().mo13787a(str, "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Could not get class com.google.android.gms.measurement.AppMeasurement$OnEventListener");
            return false;
        }
        try {
            a.getDeclaredMethod("registerOnMeasurementEventListener", new Class[]{a2}).invoke(b, new Object[]{mo5656a(a2)});
        } catch (NoSuchMethodException e) {
            C4781c.m19229f().mo13791b(str, "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Method registerOnMeasurementEventListener not found.", e);
            return false;
        } catch (Exception e2) {
            C4795l f = C4781c.m19229f();
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: ");
            sb.append(e2.getMessage());
            f.mo13791b(str, sb.toString(), e2);
        }
        return true;
    }
}
