package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.z */
public final class C2991z {

    /* renamed from: e */
    private static C2991z f8561e;
    @GuardedBy("this")

    /* renamed from: a */
    private String f8562a = null;

    /* renamed from: b */
    private Boolean f8563b = null;

    /* renamed from: c */
    private Boolean f8564c = null;

    /* renamed from: d */
    private final Queue<Intent> f8565d = new ArrayDeque();

    private C2991z() {
    }

    /* renamed from: b */
    private final int m12210b(Context context, Intent intent) {
        ComponentName componentName;
        String c = m12212c(context, intent);
        String str = "FirebaseInstanceId";
        if (c != null) {
            if (Log.isLoggable(str, 3)) {
                String str2 = "Restricting intent to a specific service: ";
                String valueOf = String.valueOf(c);
                Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            intent.setClassName(context.getPackageName(), c);
        }
        try {
            if (mo9709a(context)) {
                componentName = C2950h0.m12153a(context, intent);
            } else {
                componentName = context.startService(intent);
                Log.d(str, "Missing wake lock permission, service start may be delayed");
            }
            if (componentName != null) {
                return -1;
            }
            Log.e(str, "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (SecurityException e) {
            Log.e(str, "Error while delivering the message to the serviceIntent", e);
            return 401;
        } catch (IllegalStateException e2) {
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 45);
            sb.append("Failed to start service while in background: ");
            sb.append(valueOf2);
            Log.e(str, sb.toString());
            return 402;
        }
    }

    /* renamed from: b */
    public static synchronized C2991z m12211b() {
        C2991z zVar;
        synchronized (C2991z.class) {
            if (f8561e == null) {
                f8561e = new C2991z();
            }
            zVar = f8561e;
        }
        return zVar;
    }

    /* renamed from: c */
    private final synchronized String m12212c(Context context, Intent intent) {
        String str;
        if (this.f8562a != null) {
            return this.f8562a;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null) {
            if (resolveService.serviceInfo != null) {
                ServiceInfo serviceInfo = resolveService.serviceInfo;
                if (context.getPackageName().equals(serviceInfo.packageName)) {
                    if (serviceInfo.name != null) {
                        if (serviceInfo.name.startsWith(".")) {
                            String valueOf = String.valueOf(context.getPackageName());
                            String valueOf2 = String.valueOf(serviceInfo.name);
                            str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                        } else {
                            str = serviceInfo.name;
                        }
                        this.f8562a = str;
                        return this.f8562a;
                    }
                }
                String str2 = "FirebaseInstanceId";
                String str3 = serviceInfo.packageName;
                String str4 = serviceInfo.name;
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 94 + String.valueOf(str4).length());
                sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                sb.append(str3);
                sb.append("/");
                sb.append(str4);
                Log.e(str2, sb.toString());
                return null;
            }
        }
        Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* renamed from: a */
    public final int mo9707a(Context context, Intent intent) {
        String str = "FirebaseInstanceId";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "Starting service");
        }
        this.f8565d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m12210b(context, intent2);
    }

    /* renamed from: a */
    public final Intent mo9708a() {
        return (Intent) this.f8565d.poll();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo9709a(Context context) {
        if (this.f8563b == null) {
            this.f8563b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f8563b.booleanValue()) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
            }
        }
        return this.f8563b.booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo9710b(Context context) {
        if (this.f8564c == null) {
            this.f8564c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f8563b.booleanValue()) {
            String str = "FirebaseInstanceId";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
            }
        }
        return this.f8564c.booleanValue();
    }
}
