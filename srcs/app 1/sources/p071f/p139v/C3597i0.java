package p071f.p139v;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: f.v.i0 */
class C3597i0 {

    /* renamed from: a */
    private static Method f10090a;

    /* renamed from: b */
    private static boolean f10091b;

    /* renamed from: c */
    private static Field f10092c;

    /* renamed from: d */
    private static boolean f10093d;

    C3597i0() {
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: a */
    private void m14628a() {
        if (!f10091b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                f10090a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
            }
            f10091b = true;
        }
    }

    /* renamed from: a */
    public void mo11323a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C3598j.save_non_transition_alpha, null);
        }
    }

    /* renamed from: a */
    public void mo11324a(View view, float f) {
        Float f2 = (Float) view.getTag(C3598j.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: a */
    public void mo11332a(View view, int i) {
        if (!f10093d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f10092c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f10093d = true;
        }
        Field field = f10092c;
        if (field != null) {
            try {
                f10092c.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: a */
    public void mo11330a(View view, int i, int i2, int i3, int i4) {
        m14628a();
        Method method = f10090a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: a */
    public void mo11328a(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo11328a(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: b */
    public float mo11325b(View view) {
        Float f = (Float) view.getTag(C3598j.save_non_transition_alpha);
        float alpha = view.getAlpha();
        return f != null ? alpha / f.floatValue() : alpha;
    }

    /* renamed from: b */
    public void mo11329b(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo11329b(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) (-view.getLeft()), (float) (-view.getTop()));
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    /* renamed from: c */
    public void mo11326c(View view) {
        if (view.getTag(C3598j.save_non_transition_alpha) == null) {
            view.setTag(C3598j.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }
}
