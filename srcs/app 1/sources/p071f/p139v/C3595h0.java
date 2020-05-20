package p071f.p139v;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: f.v.h0 */
class C3595h0 extends C3593g0 {
    C3595h0() {
    }

    /* renamed from: a */
    public void mo11324a(View view, float f) {
        view.setTransitionAlpha(f);
    }

    /* renamed from: a */
    public void mo11332a(View view, int i) {
        view.setTransitionVisibility(i);
    }

    /* renamed from: a */
    public void mo11330a(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo11328a(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: b */
    public float mo11325b(View view) {
        return view.getTransitionAlpha();
    }

    /* renamed from: b */
    public void mo11329b(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
