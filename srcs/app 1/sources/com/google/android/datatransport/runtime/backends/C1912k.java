package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.backends.k */
class C1912k implements C1904e {

    /* renamed from: a */
    private final C1913a f5637a;

    /* renamed from: b */
    private final C1910i f5638b;

    /* renamed from: c */
    private final Map<String, C1915m> f5639c;

    /* renamed from: com.google.android.datatransport.runtime.backends.k$a */
    static class C1913a {

        /* renamed from: a */
        private final Context f5640a;

        /* renamed from: b */
        private Map<String, String> f5641b = null;

        C1913a(Context context) {
            this.f5640a = context;
        }

        /* renamed from: a */
        private Map<String, String> m8116a() {
            if (this.f5641b == null) {
                this.f5641b = m8117a(this.f5640a);
            }
            return this.f5641b;
        }

        /* renamed from: a */
        private Map<String, String> m8117a(Context context) {
            Bundle b = m8118b(context);
            if (b == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : b.keySet()) {
                Object obj = b.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String trim : ((String) obj).split(",", -1)) {
                        String trim2 = trim.trim();
                        if (!trim2.isEmpty()) {
                            hashMap.put(trim2, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: b */
        private static Bundle m8118b(Context context) {
            String str = "BackendRegistry";
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w(str, "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w(str, "TransportBackendDiscovery has no service info.");
                return null;
            } catch (NameNotFoundException unused) {
                Log.w(str, "Application info not found.");
                return null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1903d mo6428a(String str) {
            String str2;
            String str3;
            String str4 = "Could not instantiate %s";
            String str5 = "Could not instantiate %s.";
            String str6 = "BackendRegistry";
            String str7 = (String) m8116a().get(str);
            if (str7 == null) {
                return null;
            }
            try {
                return (C1903d) Class.forName(str7).asSubclass(C1903d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                e = e;
                str2 = String.format("Class %s is not found.", new Object[]{str7});
                Log.w(str6, str2, e);
                return null;
            } catch (IllegalAccessException e2) {
                e = e2;
                str2 = String.format(str5, new Object[]{str7});
                Log.w(str6, str2, e);
                return null;
            } catch (InstantiationException e3) {
                e = e3;
                str2 = String.format(str5, new Object[]{str7});
                Log.w(str6, str2, e);
                return null;
            } catch (NoSuchMethodException e4) {
                e = e4;
                str3 = String.format(str4, new Object[]{str7});
                Log.w(str6, str3, e);
                return null;
            } catch (InvocationTargetException e5) {
                e = e5;
                str3 = String.format(str4, new Object[]{str7});
                Log.w(str6, str3, e);
                return null;
            }
        }
    }

    C1912k(Context context, C1910i iVar) {
        this(new C1913a(context), iVar);
    }

    C1912k(C1913a aVar, C1910i iVar) {
        this.f5639c = new HashMap();
        this.f5637a = aVar;
        this.f5638b = iVar;
    }

    /* renamed from: a */
    public synchronized C1915m mo6425a(String str) {
        if (this.f5639c.containsKey(str)) {
            return (C1915m) this.f5639c.get(str);
        }
        C1903d a = this.f5637a.mo6428a(str);
        if (a == null) {
            return null;
        }
        C1915m create = a.create(this.f5638b.mo6426a(str));
        this.f5639c.put(str, create);
        return create;
    }
}
