package com.facebook.p034f0;

import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.C1787m;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.facebook.f0.b */
class C1531b {

    /* renamed from: a */
    private static final String f4784a = "b";

    /* renamed from: b */
    private static ReentrantReadWriteLock f4785b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static String f4786c;

    /* renamed from: d */
    private static volatile boolean f4787d = false;

    /* renamed from: com.facebook.f0.b$a */
    static class C1532a implements Runnable {
        C1532a() {
        }

        public void run() {
            C1531b.m6843c();
        }
    }

    /* renamed from: b */
    public static String m6842b() {
        if (!f4787d) {
            Log.w(f4784a, "initStore should have been called before calling setUserID");
            m6843c();
        }
        f4785b.readLock().lock();
        try {
            return f4786c;
        } finally {
            f4785b.readLock().unlock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m6843c() {
        if (!f4787d) {
            f4785b.writeLock().lock();
            try {
                if (!f4787d) {
                    f4786c = PreferenceManager.getDefaultSharedPreferences(C1787m.m7744e()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                    f4787d = true;
                    f4785b.writeLock().unlock();
                }
            } finally {
                f4785b.writeLock().unlock();
            }
        }
    }

    /* renamed from: d */
    public static void m6844d() {
        if (!f4787d) {
            C1558m.m6915b().execute(new C1532a());
        }
    }
}
