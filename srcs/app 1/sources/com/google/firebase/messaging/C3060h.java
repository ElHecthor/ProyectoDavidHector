package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import com.google.firebase.iid.C2974r;
import java.io.IOException;

/* renamed from: com.google.firebase.messaging.h */
final class C3060h implements Runnable {

    /* renamed from: k */
    private static final Object f8705k = new Object();

    /* renamed from: l */
    private static Boolean f8706l;

    /* renamed from: m */
    private static Boolean f8707m;

    /* renamed from: f */
    private final Context f8708f;

    /* renamed from: g */
    private final C2974r f8709g;

    /* renamed from: h */
    private final WakeLock f8710h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C3058f f8711i;

    /* renamed from: j */
    private final long f8712j;

    C3060h(C3058f fVar, Context context, C2974r rVar, long j) {
        this.f8711i = fVar;
        this.f8708f = context;
        this.f8712j = j;
        this.f8709g = rVar;
        this.f8710h = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    /* renamed from: a */
    private static boolean m12442a(Context context) {
        boolean booleanValue;
        synchronized (f8705k) {
            Boolean valueOf = Boolean.valueOf(f8706l == null ? m12443a(context, "android.permission.WAKE_LOCK", f8706l) : f8706l.booleanValue());
            f8706l = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: a */
    private static boolean m12443a(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z) {
            String str2 = "FirebaseMessaging";
            if (Log.isLoggable(str2, 3)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 142);
                sb.append("Missing Permission: ");
                sb.append(str);
                sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
                Log.d(str2, sb.toString());
            }
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final synchronized boolean m12446b() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f8708f.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: b */
    private static boolean m12447b(Context context) {
        boolean booleanValue;
        synchronized (f8705k) {
            Boolean valueOf = Boolean.valueOf(f8707m == null ? m12443a(context, "android.permission.ACCESS_NETWORK_STATE", f8707m) : f8707m.booleanValue());
            f8707m = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m12448c() {
        String str = "FirebaseMessaging";
        return Log.isLoggable(str, 3) || (VERSION.SDK_INT == 23 && Log.isLoggable(str, 3));
    }

    @SuppressLint({"Wakelock"})
    public final void run() {
        String str = "TopicsSyncTask's wakelock was already released due to timeout.";
        String str2 = "FirebaseMessaging";
        if (m12442a(this.f8708f)) {
            this.f8710h.acquire(C3063k.f8717a);
        }
        try {
            boolean z = true;
            this.f8711i.mo9835a(true);
            if (!this.f8709g.mo9689a()) {
                this.f8711i.mo9835a(false);
                if (m12442a(this.f8708f)) {
                    try {
                        this.f8710h.release();
                    } catch (RuntimeException unused) {
                        Log.i(str2, str);
                    }
                }
            } else if (!m12447b(this.f8708f) || m12446b()) {
                if (this.f8711i.mo9836b()) {
                    this.f8711i.mo9835a(false);
                } else {
                    this.f8711i.mo9833a(this.f8712j);
                }
                if (m12442a(this.f8708f)) {
                    try {
                        this.f8710h.release();
                    } catch (RuntimeException unused2) {
                        Log.i(str2, str);
                    }
                }
            } else {
                C3059g gVar = new C3059g(this, this);
                if (!Log.isLoggable(str2, 3)) {
                    if (VERSION.SDK_INT != 23 || !Log.isLoggable(str2, 3)) {
                        z = false;
                    }
                }
                if (z) {
                    Log.d(str2, "Connectivity change received registered");
                }
                gVar.f8704b.f8708f.registerReceiver(gVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                if (m12442a(this.f8708f)) {
                    try {
                        this.f8710h.release();
                    } catch (RuntimeException unused3) {
                        Log.i(str2, str);
                    }
                }
            }
        } catch (IOException e) {
            String str3 = "Failed to sync topics. Won't retry sync. ";
            String valueOf = String.valueOf(e.getMessage());
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            this.f8711i.mo9835a(false);
            if (m12442a(this.f8708f)) {
                try {
                    this.f8710h.release();
                } catch (RuntimeException unused4) {
                    Log.i(str2, str);
                }
            }
        } catch (Throwable th) {
            if (m12442a(this.f8708f)) {
                try {
                    this.f8710h.release();
                } catch (RuntimeException unused5) {
                    Log.i(str2, str);
                }
            }
            throw th;
        }
    }
}
