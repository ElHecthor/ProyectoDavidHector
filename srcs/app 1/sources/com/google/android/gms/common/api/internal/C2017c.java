package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.C2197l;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.c */
public final class C2017c implements ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: j */
    private static final C2017c f5852j = new C2017c();

    /* renamed from: f */
    private final AtomicBoolean f5853f = new AtomicBoolean();

    /* renamed from: g */
    private final AtomicBoolean f5854g = new AtomicBoolean();
    @GuardedBy("sInstance")

    /* renamed from: h */
    private final ArrayList<C2018a> f5855h = new ArrayList<>();
    @GuardedBy("sInstance")

    /* renamed from: i */
    private boolean f5856i = false;

    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    public interface C2018a {
        /* renamed from: a */
        void mo6669a(boolean z);
    }

    private C2017c() {
    }

    /* renamed from: a */
    public static void m8399a(Application application) {
        synchronized (f5852j) {
            if (!f5852j.f5856i) {
                application.registerActivityLifecycleCallbacks(f5852j);
                application.registerComponentCallbacks(f5852j);
                f5852j.f5856i = true;
            }
        }
    }

    /* renamed from: b */
    public static C2017c m8400b() {
        return f5852j;
    }

    /* renamed from: b */
    private final void m8401b(boolean z) {
        synchronized (f5852j) {
            ArrayList<C2018a> arrayList = this.f5855h;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((C2018a) obj).mo6669a(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo6656a(C2018a aVar) {
        synchronized (f5852j) {
            this.f5855h.add(aVar);
        }
    }

    /* renamed from: a */
    public final boolean mo6657a() {
        return this.f5853f.get();
    }

    @TargetApi(16)
    /* renamed from: a */
    public final boolean mo6658a(boolean z) {
        if (!this.f5854g.get()) {
            if (!C2197l.m9000c()) {
                return z;
            }
            RunningAppProcessInfo runningAppProcessInfo = new RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f5854g.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f5853f.set(true);
            }
        }
        return mo6657a();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f5853f.compareAndSet(true, false);
        this.f5854g.set(true);
        if (compareAndSet) {
            m8401b(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f5853f.compareAndSet(true, false);
        this.f5854g.set(true);
        if (compareAndSet) {
            m8401b(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f5853f.compareAndSet(false, true)) {
            this.f5854g.set(true);
            m8401b(true);
        }
    }
}
