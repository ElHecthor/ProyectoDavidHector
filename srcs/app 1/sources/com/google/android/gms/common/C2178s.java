package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.internal.C2149s0;
import com.google.android.gms.common.internal.C2151t0;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.C2212a;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import p147g.p156d.p157a.p167b.p172c.C3854b;

@CheckReturnValue
/* renamed from: com.google.android.gms.common.s */
final class C2178s {

    /* renamed from: a */
    private static volatile C2151t0 f6138a;

    /* renamed from: b */
    private static final Object f6139b = new Object();

    /* renamed from: c */
    private static Context f6140c;

    /* renamed from: a */
    static C2079b0 m8941a(String str, C2184t tVar, boolean z, boolean z2) {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m8944b(str, tVar, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ String m8942a(boolean z, String str, C2184t tVar) {
        boolean z2 = true;
        if (z || !m8944b(str, tVar, true, false).f5968a) {
            z2 = false;
        }
        return C2079b0.m8602a(str, tVar, z, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void m8943a(android.content.Context r2) {
        /*
            java.lang.Class<com.google.android.gms.common.s> r0 = com.google.android.gms.common.C2178s.class
            monitor-enter(r0)
            android.content.Context r1 = f6140c     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0018
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x001a }
            f6140c = r2     // Catch:{ all -> 0x001a }
            monitor-exit(r0)
            return
        L_0x0011:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r1 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r0)
            return
        L_0x001a:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C2178s.m8943a(android.content.Context):void");
    }

    /* renamed from: b */
    private static C2079b0 m8944b(String str, C2184t tVar, boolean z, boolean z2) {
        try {
            if (f6138a == null) {
                C2148s.m8834a(f6140c);
                synchronized (f6139b) {
                    if (f6138a == null) {
                        f6138a = C2149s0.m8848a(DynamiteModule.m9040a(f6140c, DynamiteModule.f6201j, "com.google.android.gms.googlecertificates").mo6993a("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            C2148s.m8834a(f6140c);
            try {
                return f6138a.mo6941a(new C2211z(str, tVar, z, z2), C3854b.m15592a(f6140c.getPackageManager())) ? C2079b0.m8603c() : C2079b0.m8601a((Callable<String>) new C2185u<String>(z, str, tVar));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return C2079b0.m8600a("module call", e);
            }
        } catch (C2212a e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String str2 = "module init: ";
            String valueOf = String.valueOf(e2.getMessage());
            return C2079b0.m8600a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e2);
        }
    }
}
