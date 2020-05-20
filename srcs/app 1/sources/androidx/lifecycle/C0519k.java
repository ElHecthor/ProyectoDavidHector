package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.k */
class C0519k {

    /* renamed from: a */
    private static AtomicBoolean f2230a = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.k$a */
    static class C0520a extends C0509d {
        C0520a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C0540x.m2788b(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m2733a(Context context) {
        if (!f2230a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0520a());
        }
    }
}
