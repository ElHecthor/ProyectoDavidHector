package com.google.firebase.p060g;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.google.firebase.g.d */
class C2923d {

    /* renamed from: b */
    private static C2923d f8416b;

    /* renamed from: a */
    private final SharedPreferences f8417a;

    private C2923d(Context context) {
        this.f8417a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    /* renamed from: a */
    static synchronized C2923d m12053a(Context context) {
        C2923d dVar;
        synchronized (C2923d.class) {
            if (f8416b == null) {
                f8416b = new C2923d(context);
            }
            dVar = f8416b;
        }
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized boolean mo9606a(long j) {
        return mo9607a("fire-global", j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized boolean mo9607a(String str, long j) {
        if (!this.f8417a.contains(str)) {
            this.f8417a.edit().putLong(str, j).apply();
            return true;
        } else if (j - this.f8417a.getLong(str, -1) < 86400000) {
            return false;
        } else {
            this.f8417a.edit().putLong(str, j).apply();
            return true;
        }
    }
}
