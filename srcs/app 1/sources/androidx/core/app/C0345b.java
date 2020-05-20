package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import p071f.p097h.p107l.C3317d;

/* renamed from: androidx.core.app.b */
public class C0345b {

    /* renamed from: androidx.core.app.b$a */
    private static class C0346a extends C0345b {

        /* renamed from: a */
        private final ActivityOptions f1623a;

        C0346a(ActivityOptions activityOptions) {
            this.f1623a = activityOptions;
        }

        /* renamed from: a */
        public Bundle mo2164a() {
            return this.f1623a.toBundle();
        }
    }

    protected C0345b() {
    }

    /* renamed from: a */
    public static C0345b m1782a(Activity activity, C3317d<View, String>... dVarArr) {
        if (VERSION.SDK_INT < 21) {
            return new C0345b();
        }
        Pair[] pairArr = null;
        if (dVarArr != null) {
            pairArr = new Pair[dVarArr.length];
            for (int i = 0; i < dVarArr.length; i++) {
                pairArr[i] = Pair.create(dVarArr[i].f9493a, dVarArr[i].f9494b);
            }
        }
        return new C0346a(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    /* renamed from: a */
    public Bundle mo2164a() {
        return null;
    }
}
