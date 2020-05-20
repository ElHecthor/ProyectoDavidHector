package p147g.p148a.p149a;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

/* renamed from: g.a.a.c */
class C3678c implements ActivityLifecycleCallbacks {

    /* renamed from: g */
    private static final String f10376g = C3678c.class.getName();

    /* renamed from: h */
    private static C3690f f10377h = C3690f.m15021a();

    /* renamed from: f */
    private C3679d f10378f = null;

    public C3678c(C3679d dVar) {
        if (dVar == null) {
            f10377h.mo11713b(f10376g, "Need to initialize AmplitudeCallbacks with AmplitudeClient instance");
            return;
        }
        this.f10378f = dVar;
        dVar.mo11693d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo11652a() {
        return System.currentTimeMillis();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        C3679d dVar = this.f10378f;
        if (dVar == null) {
            f10377h.mo11713b(f10376g, "Need to initialize AmplitudeCallbacks with AmplitudeClient instance");
        } else {
            dVar.mo11687b(mo11652a());
        }
    }

    public void onActivityResumed(Activity activity) {
        C3679d dVar = this.f10378f;
        if (dVar == null) {
            f10377h.mo11713b(f10376g, "Need to initialize AmplitudeCallbacks with AmplitudeClient instance");
        } else {
            dVar.mo11671a(mo11652a());
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
