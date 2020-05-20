package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: androidx.coordinatorlayout.widget.b */
public class C0341b {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f1614a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f1615b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m1771a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m1773b(viewGroup, view, rect);
    }

    /* renamed from: a */
    private static void m1772a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m1772a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }

    /* renamed from: b */
    static void m1773b(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = (Matrix) f1614a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f1614a.set(matrix);
        } else {
            matrix.reset();
        }
        m1772a((ViewParent) viewGroup, view, matrix);
        RectF rectF = (RectF) f1615b.get();
        if (rectF == null) {
            rectF = new RectF();
            f1615b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
