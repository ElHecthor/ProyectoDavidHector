package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.util.C2197l;
import com.google.firebase.FirebaseApp;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.r */
public final class C2974r {

    /* renamed from: a */
    private final Context f8532a;
    @GuardedBy("this")

    /* renamed from: b */
    private String f8533b;
    @GuardedBy("this")

    /* renamed from: c */
    private String f8534c;
    @GuardedBy("this")

    /* renamed from: d */
    private int f8535d;
    @GuardedBy("this")

    /* renamed from: e */
    private int f8536e = 0;

    public C2974r(Context context) {
        this.f8532a = context;
    }

    /* renamed from: a */
    private final PackageInfo m12179a(String str) {
        try {
            return this.f8532a.getPackageManager().getPackageInfo(str, 0);
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    public static String m12180a(FirebaseApp firebaseApp) {
        String c = firebaseApp.mo9511c().mo9579c();
        if (c != null) {
            return c;
        }
        String b = firebaseApp.mo9511c().mo9578b();
        if (!b.startsWith("1:")) {
            return b;
        }
        String[] split = b.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: f */
    private final synchronized void m12181f() {
        PackageInfo a = m12179a(this.f8532a.getPackageName());
        if (a != null) {
            this.f8533b = Integer.toString(a.versionCode);
            this.f8534c = a.versionName;
        }
    }

    /* renamed from: a */
    public final boolean mo9689a() {
        return mo9690b() != 0;
    }

    /* renamed from: b */
    public final synchronized int mo9690b() {
        if (this.f8536e != 0) {
            return this.f8536e;
        }
        PackageManager packageManager = this.f8532a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C2197l.m9007j()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f8536e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (C2197l.m9007j()) {
                this.f8536e = 2;
            } else {
                this.f8536e = 1;
            }
            return this.f8536e;
        }
        this.f8536e = 2;
        return 2;
    }

    /* renamed from: c */
    public final synchronized String mo9691c() {
        if (this.f8533b == null) {
            m12181f();
        }
        return this.f8533b;
    }

    /* renamed from: d */
    public final synchronized String mo9692d() {
        if (this.f8534c == null) {
            m12181f();
        }
        return this.f8534c;
    }

    /* renamed from: e */
    public final synchronized int mo9693e() {
        if (this.f8535d == 0) {
            PackageInfo a = m12179a("com.google.android.gms");
            if (a != null) {
                this.f8535d = a.versionCode;
            }
        }
        return this.f8535d;
    }
}
