package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.p051p.C2175c;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
/* renamed from: com.google.android.gms.common.j */
public class C2165j {

    /* renamed from: b */
    private static C2165j f6125b;

    /* renamed from: a */
    private final Context f6126a;

    private C2165j(Context context) {
        this.f6126a = context.getApplicationContext();
    }

    /* renamed from: a */
    private final C2079b0 m8913a(String str, int i) {
        try {
            PackageInfo a = C2175c.m8939a(this.f6126a).mo6960a(str, 64, i);
            boolean honorsDebugCertificates = C2090i.honorsDebugCertificates(this.f6126a);
            if (a == null) {
                return C2079b0.m8599a("null pkg");
            }
            if (a.signatures != null) {
                if (a.signatures.length == 1) {
                    C2208w wVar = new C2208w(a.signatures[0].toByteArray());
                    String str2 = a.packageName;
                    C2079b0 a2 = C2178s.m8941a(str2, wVar, honorsDebugCertificates, false);
                    return (!a2.f5968a || a.applicationInfo == null || (a.applicationInfo.flags & 2) == 0 || !C2178s.m8941a(str2, wVar, false, true).f5968a) ? a2 : C2079b0.m8599a("debuggable release cert app rejected");
                }
            }
            return C2079b0.m8599a("single cert required");
        } catch (NameNotFoundException unused) {
            String str3 = "no pkg ";
            String valueOf = String.valueOf(str);
            return C2079b0.m8599a(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
    }

    /* renamed from: a */
    public static C2165j m8914a(Context context) {
        C2148s.m8834a(context);
        synchronized (C2165j.class) {
            if (f6125b == null) {
                C2178s.m8943a(context);
                f6125b = new C2165j(context);
            }
        }
        return f6125b;
    }

    /* renamed from: a */
    private static C2184t m8915a(PackageInfo packageInfo, C2184t... tVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C2208w wVar = new C2208w(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < tVarArr.length; i++) {
            if (tVarArr[i].equals(wVar)) {
                return tVarArr[i];
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m8916a(PackageInfo packageInfo, boolean z) {
        C2184t tVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                tVar = m8915a(packageInfo, C2210y.f6188a);
            } else {
                tVar = m8915a(packageInfo, C2210y.f6188a[0]);
            }
            if (tVar != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo6950a(int i) {
        C2079b0 b0Var;
        String[] a = C2175c.m8939a(this.f6126a).mo6963a(i);
        if (a != null && a.length != 0) {
            b0Var = null;
            for (String a2 : a) {
                b0Var = m8913a(a2, i);
                if (b0Var.f5968a) {
                    break;
                }
            }
        } else {
            b0Var = C2079b0.m8599a("no pkgs");
        }
        b0Var.mo6785b();
        return b0Var.f5968a;
    }

    /* renamed from: a */
    public boolean mo6951a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m8916a(packageInfo, false)) {
            return true;
        }
        if (m8916a(packageInfo, true)) {
            if (C2090i.honorsDebugCertificates(this.f6126a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }
}
