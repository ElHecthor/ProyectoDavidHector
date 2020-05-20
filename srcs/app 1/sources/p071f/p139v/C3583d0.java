package p071f.p139v;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: f.v.d0 */
class C3583d0 extends C3597i0 {

    /* renamed from: e */
    private static boolean f10070e = true;

    C3583d0() {
    }

    /* renamed from: a */
    public void mo11323a(View view) {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo11324a(View view, float f) {
        if (f10070e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f10070e = false;
            }
        }
        view.setAlpha(f);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public float mo11325b(View view) {
        if (f10070e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f10070e = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: c */
    public void mo11326c(View view) {
    }
}
