package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.google.android.material.internal.b */
public class C2701b {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f7864a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f7865b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m11248a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m11250b(viewGroup, view, rect);
    }

    /* renamed from: a */
    private static void m11249a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m11249a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }

    /* renamed from: b */
    public static void m11250b(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = (Matrix) f7864a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f7864a.set(matrix);
        } else {
            matrix.reset();
        }
        m11249a((ViewParent) viewGroup, view, matrix);
        RectF rectF = (RectF) f7865b.get();
        if (rectF == null) {
            rectF = new RectF();
            f7865b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
