package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.components.f */
public final class C2877f<T> {

    /* renamed from: a */
    private final T f8350a;

    /* renamed from: b */
    private final C2880c<T> f8351b;

    /* renamed from: com.google.firebase.components.f$b */
    private static class C2879b implements C2880c<Context> {

        /* renamed from: a */
        private final Class<? extends Service> f8352a;

        private C2879b(Class<? extends Service> cls) {
            this.f8352a = cls;
        }

        /* renamed from: b */
        private Bundle m11945b(Context context) {
            String str = "ComponentDiscovery";
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w(str, "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f8352a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.f8352a);
                sb.append(" has no service info.");
                Log.w(str, sb.toString());
                return null;
            } catch (NameNotFoundException unused) {
                Log.w(str, "Application info not found.");
                return null;
            }
        }

        /* renamed from: a */
        public List<String> mo9554a(Context context) {
            Bundle b = m11945b(context);
            if (b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.google.firebase.components.f$c */
    interface C2880c<T> {
        /* renamed from: a */
        List<String> mo9554a(T t);
    }

    C2877f(T t, C2880c<T> cVar) {
        this.f8350a = t;
        this.f8351b = cVar;
    }

    /* renamed from: a */
    public static C2877f<Context> m11942a(Context context, Class<? extends Service> cls) {
        return new C2877f<>(context, new C2879b(cls));
    }

    /* renamed from: a */
    private static List<C2882h> m11943a(List<String> list) {
        String str;
        String str2 = "Could not instantiate %s";
        String str3 = "Could not instantiate %s.";
        String str4 = "ComponentDiscovery";
        ArrayList arrayList = new ArrayList();
        for (String str5 : list) {
            try {
                Class cls = Class.forName(str5);
                if (!C2882h.class.isAssignableFrom(cls)) {
                    Log.w(str4, String.format("Class %s is not an instance of %s", new Object[]{str5, "com.google.firebase.components.ComponentRegistrar"}));
                } else {
                    arrayList.add((C2882h) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException e) {
                e = e;
                str = String.format("Class %s is not an found.", new Object[]{str5});
                Log.w(str4, str, e);
            } catch (IllegalAccessException e2) {
                e = e2;
                str = String.format(str3, new Object[]{str5});
                Log.w(str4, str, e);
            } catch (InstantiationException e3) {
                e = e3;
                str = String.format(str3, new Object[]{str5});
                Log.w(str4, str, e);
            } catch (NoSuchMethodException e4) {
                e = e4;
                str = String.format(str2, new Object[]{str5});
                Log.w(str4, str, e);
            } catch (InvocationTargetException e5) {
                e = e5;
                str = String.format(str2, new Object[]{str5});
                Log.w(str4, str, e);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<C2882h> mo9552a() {
        return m11943a(this.f8351b.mo9554a(this.f8350a));
    }
}
