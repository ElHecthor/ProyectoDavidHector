package p071f.p139v;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: f.v.f0 */
class C3591f0 extends C3589e0 {

    /* renamed from: h */
    private static boolean f10082h = true;

    C3591f0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo11330a(View view, int i, int i2, int i3, int i4) {
        if (f10082h) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f10082h = false;
            }
        }
    }
}
