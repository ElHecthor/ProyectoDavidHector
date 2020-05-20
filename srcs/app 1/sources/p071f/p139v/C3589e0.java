package p071f.p139v;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: f.v.e0 */
class C3589e0 extends C3583d0 {

    /* renamed from: f */
    private static boolean f10080f = true;

    /* renamed from: g */
    private static boolean f10081g = true;

    C3589e0() {
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo11328a(View view, Matrix matrix) {
        if (f10080f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f10080f = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public void mo11329b(View view, Matrix matrix) {
        if (f10081g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f10081g = false;
            }
        }
    }
}
