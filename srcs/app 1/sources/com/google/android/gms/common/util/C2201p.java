package com.google.android.gms.common.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.p051p.C2175c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.common.util.p */
public class C2201p {

    /* renamed from: a */
    private static final Method f6174a = m9026e();

    /* renamed from: b */
    private static final Method f6175b = m9027f();

    /* renamed from: c */
    private static final Method f6176c = m9028g();

    /* renamed from: d */
    private static final Method f6177d = m9023b();

    static {
        Process.myUid();
        m9018a();
        m9024c();
        m9025d();
    }

    /* renamed from: a */
    private static WorkSource m9015a(int i, String str) {
        WorkSource workSource = new WorkSource();
        m9020a(workSource, i, str);
        return workSource;
    }

    /* renamed from: a */
    public static WorkSource m9016a(Context context, String str) {
        String str2 = "WorkSourceUtil";
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo a = C2175c.m8939a(context).mo6959a(str, 0);
                if (a != null) {
                    return m9015a(a.uid, str);
                }
                String str3 = "Could not get applicationInfo from package: ";
                String valueOf = String.valueOf(str);
                Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                return null;
            } catch (NameNotFoundException unused) {
                String str4 = "Could not find package: ";
                String valueOf2 = String.valueOf(str);
                Log.e(str2, valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4));
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m9017a(WorkSource workSource, int i) {
        Method method = f6177d;
        if (method != null) {
            try {
                return (String) method.invoke(workSource, new Object[]{Integer.valueOf(i)});
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Method m9018a() {
        try {
            return WorkSource.class.getMethod("get", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static List<String> m9019a(WorkSource workSource) {
        int b = workSource == null ? 0 : m9022b(workSource);
        if (b == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            String a = m9017a(workSource, i);
            if (!C2199n.m9012a(a)) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m9020a(WorkSource workSource, int i, String str) {
        String str2 = "Unable to assign blame through WorkSource";
        String str3 = "WorkSourceUtil";
        if (f6175b != null) {
            if (str == null) {
                str = "";
            }
            try {
                f6175b.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception e) {
                Log.wtf(str3, str2, e);
            }
        } else {
            Method method = f6174a;
            if (method != null) {
                try {
                    method.invoke(workSource, new Object[]{Integer.valueOf(i)});
                } catch (Exception e2) {
                    Log.wtf(str3, str2, e2);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m9021a(Context context) {
        if (context == null || context.getPackageManager() == null) {
            return false;
        }
        return C2175c.m8939a(context).mo6958a("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) == 0;
    }

    /* renamed from: b */
    private static int m9022b(WorkSource workSource) {
        Method method = f6176c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(workSource, new Object[0])).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    /* renamed from: b */
    private static Method m9023b() {
        if (C2197l.m9002e()) {
            try {
                return WorkSource.class.getMethod("getName", new Class[]{Integer.TYPE});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    private static final Method m9024c() {
        if (C2197l.m9008k()) {
            try {
                return WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: d */
    private static final Method m9025d() {
        if (C2197l.m9008k()) {
            try {
                return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[]{Integer.TYPE, String.class});
            } catch (Exception e) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e);
            }
        }
        return null;
    }

    /* renamed from: e */
    private static Method m9026e() {
        try {
            return WorkSource.class.getMethod("add", new Class[]{Integer.TYPE});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    private static Method m9027f() {
        if (C2197l.m9002e()) {
            try {
                return WorkSource.class.getMethod("add", new Class[]{Integer.TYPE, String.class});
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: g */
    private static Method m9028g() {
        try {
            return WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
