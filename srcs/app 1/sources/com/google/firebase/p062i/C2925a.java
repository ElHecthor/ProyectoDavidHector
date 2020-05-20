package com.google.firebase.p062i;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import com.google.firebase.p059f.C2917c;
import java.util.concurrent.atomic.AtomicBoolean;
import p071f.p097h.p098e.C3236a;

/* renamed from: com.google.firebase.i.a */
public class C2925a {

    /* renamed from: a */
    private final Context f8418a;

    /* renamed from: b */
    private final SharedPreferences f8419b;

    /* renamed from: c */
    private final AtomicBoolean f8420c = new AtomicBoolean(m12057b());

    public C2925a(Context context, String str, C2917c cVar) {
        this.f8418a = m12056a(context);
        StringBuilder sb = new StringBuilder();
        sb.append("com.google.firebase.common.prefs:");
        sb.append(str);
        this.f8419b = context.getSharedPreferences(sb.toString(), 0);
    }

    /* renamed from: a */
    private static Context m12056a(Context context) {
        return (VERSION.SDK_INT < 24 || C3236a.m13272c(context)) ? context : C3236a.m13265a(context);
    }

    /* renamed from: b */
    private boolean m12057b() {
        String str = "firebase_data_collection_default_enabled";
        if (this.f8419b.contains(str)) {
            return this.f8419b.getBoolean(str, true);
        }
        try {
            PackageManager packageManager = this.f8418a.getPackageManager();
            if (packageManager != null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.f8418a.getPackageName(), 128);
                if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str))) {
                    return applicationInfo.metaData.getBoolean(str);
                }
            }
        } catch (NameNotFoundException unused) {
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo9608a() {
        return this.f8420c.get();
    }
}
