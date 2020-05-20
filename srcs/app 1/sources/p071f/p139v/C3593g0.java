package p071f.p139v;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.View;

/* renamed from: f.v.g0 */
class C3593g0 extends C3591f0 {

    /* renamed from: i */
    private static boolean f10083i = true;

    C3593g0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo11332a(View view, int i) {
        if (VERSION.SDK_INT == 28) {
            super.mo11332a(view, i);
        } else if (f10083i) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f10083i = false;
            }
        }
    }
}
