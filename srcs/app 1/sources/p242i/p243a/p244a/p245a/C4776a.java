package p242i.p243a.p244a.p245a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* renamed from: i.a.a.a.a */
public class C4776a {

    /* renamed from: a */
    private final Application f12485a;

    /* renamed from: b */
    private C4777a f12486b;

    /* renamed from: i.a.a.a.a$a */
    private static class C4777a {

        /* renamed from: a */
        private final Set<ActivityLifecycleCallbacks> f12487a = new HashSet();

        /* renamed from: b */
        private final Application f12488b;

        /* renamed from: i.a.a.a.a$a$a */
        class C4778a implements ActivityLifecycleCallbacks {

            /* renamed from: f */
            final /* synthetic */ C4779b f12489f;

            C4778a(C4777a aVar, C4779b bVar) {
                this.f12489f = bVar;
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
                this.f12489f.mo5433a(activity, bundle);
            }

            public void onActivityDestroyed(Activity activity) {
                this.f12489f.mo5432a(activity);
            }

            public void onActivityPaused(Activity activity) {
                this.f12489f.mo5434b(activity);
            }

            public void onActivityResumed(Activity activity) {
                this.f12489f.mo5436c(activity);
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                this.f12489f.mo5435b(activity, bundle);
            }

            public void onActivityStarted(Activity activity) {
                this.f12489f.mo5437d(activity);
            }

            public void onActivityStopped(Activity activity) {
                this.f12489f.mo5438e(activity);
            }
        }

        C4777a(Application application) {
            this.f12488b = application;
        }

        /* access modifiers changed from: private */
        @TargetApi(14)
        /* renamed from: a */
        public void m19195a() {
            for (ActivityLifecycleCallbacks unregisterActivityLifecycleCallbacks : this.f12487a) {
                this.f12488b.unregisterActivityLifecycleCallbacks(unregisterActivityLifecycleCallbacks);
            }
        }

        /* access modifiers changed from: private */
        @TargetApi(14)
        /* renamed from: a */
        public boolean m19198a(C4779b bVar) {
            if (this.f12488b == null) {
                return false;
            }
            C4778a aVar = new C4778a(this, bVar);
            this.f12488b.registerActivityLifecycleCallbacks(aVar);
            this.f12487a.add(aVar);
            return true;
        }
    }

    /* renamed from: i.a.a.a.a$b */
    public static abstract class C4779b {
        /* renamed from: a */
        public void mo5432a(Activity activity) {
        }

        /* renamed from: a */
        public abstract void mo5433a(Activity activity, Bundle bundle);

        /* renamed from: b */
        public void mo5434b(Activity activity) {
        }

        /* renamed from: b */
        public void mo5435b(Activity activity, Bundle bundle) {
        }

        /* renamed from: c */
        public abstract void mo5436c(Activity activity);

        /* renamed from: d */
        public abstract void mo5437d(Activity activity);

        /* renamed from: e */
        public void mo5438e(Activity activity) {
        }
    }

    public C4776a(Context context) {
        Application application = (Application) context.getApplicationContext();
        this.f12485a = application;
        if (VERSION.SDK_INT >= 14) {
            this.f12486b = new C4777a(application);
        }
    }

    /* renamed from: a */
    public void mo13776a() {
        C4777a aVar = this.f12486b;
        if (aVar != null) {
            aVar.m19195a();
        }
    }

    /* renamed from: a */
    public boolean mo13777a(C4779b bVar) {
        C4777a aVar = this.f12486b;
        return aVar != null && aVar.m19198a(bVar);
    }
}
