package p147g.p153c.p154a.p155a;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.view.View;

/* renamed from: g.c.a.a.a */
class C3717a {
    /* renamed from: a */
    public static void m15193a(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            m15194b(view, runnable);
        } else {
            view.postDelayed(runnable, 16);
        }
    }

    @TargetApi(16)
    /* renamed from: b */
    private static void m15194b(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
