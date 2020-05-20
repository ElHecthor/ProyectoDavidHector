package androidx.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.lifecycle.C0514h.C0515a;

/* renamed from: androidx.lifecycle.x */
public class C0540x extends Fragment {

    /* renamed from: f */
    private C0541a f2259f;

    /* renamed from: androidx.lifecycle.x$a */
    interface C0541a {
        /* renamed from: a */
        void mo3059a();

        /* renamed from: b */
        void mo3060b();

        /* renamed from: c */
        void mo3061c();
    }

    /* renamed from: androidx.lifecycle.x$b */
    static class C0542b implements ActivityLifecycleCallbacks {
        C0542b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C0540x.m2786a(activity, C0515a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            C0540x.m2786a(activity, C0515a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            C0540x.m2786a(activity, C0515a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            C0540x.m2786a(activity, C0515a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            C0540x.m2786a(activity, C0515a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            C0540x.m2786a(activity, C0515a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static C0540x m2785a(Activity activity) {
        return (C0540x) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    /* renamed from: a */
    static void m2786a(Activity activity, C0515a aVar) {
        if (activity instanceof C0527p) {
            ((C0527p) activity).mo115a().mo3041a(aVar);
            return;
        }
        if (activity instanceof C0523n) {
            C0514h a = ((C0523n) activity).mo115a();
            if (a instanceof C0524o) {
                ((C0524o) a).mo3041a(aVar);
            }
        }
    }

    /* renamed from: a */
    private void m2787a(C0515a aVar) {
        if (VERSION.SDK_INT < 29) {
            m2786a(getActivity(), aVar);
        }
    }

    /* renamed from: b */
    public static void m2788b(Activity activity) {
        if (VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new C0542b());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        String str = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(new C0540x(), str).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: b */
    private void m2789b(C0541a aVar) {
        if (aVar != null) {
            aVar.mo3060b();
        }
    }

    /* renamed from: c */
    private void m2790c(C0541a aVar) {
        if (aVar != null) {
            aVar.mo3061c();
        }
    }

    /* renamed from: d */
    private void m2791d(C0541a aVar) {
        if (aVar != null) {
            aVar.mo3059a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3065a(C0541a aVar) {
        this.f2259f = aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m2789b(this.f2259f);
        m2787a(C0515a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m2787a(C0515a.ON_DESTROY);
        this.f2259f = null;
    }

    public void onPause() {
        super.onPause();
        m2787a(C0515a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m2790c(this.f2259f);
        m2787a(C0515a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m2791d(this.f2259f);
        m2787a(C0515a.ON_START);
    }

    public void onStop() {
        super.onStop();
        m2787a(C0515a.ON_STOP);
    }
}
