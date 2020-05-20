package p147g.p156d.p157a.p185c.p202y;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import androidx.appcompat.widget.C0275t0;
import p071f.p072a.p073k.p074a.C3103a;

/* renamed from: g.d.a.c.y.c */
public class C4459c {
    /* renamed from: a */
    public static int m18173a(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* renamed from: a */
    static int m18174a(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    /* renamed from: a */
    public static ColorStateList m18175a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList b = C3103a.m12556b(context, resourceId);
                if (b != null) {
                    return b;
                }
            }
        }
        if (VERSION.SDK_INT <= 15) {
            int color = typedArray.getColor(i, -1);
            if (color != -1) {
                return ColorStateList.valueOf(color);
            }
        }
        return typedArray.getColorStateList(i);
    }

    /* renamed from: a */
    public static ColorStateList m18176a(Context context, C0275t0 t0Var, int i) {
        if (t0Var.mo1751g(i)) {
            int g = t0Var.mo1750g(i, 0);
            if (g != 0) {
                ColorStateList b = C3103a.m12556b(context, g);
                if (b != null) {
                    return b;
                }
            }
        }
        if (VERSION.SDK_INT <= 15) {
            int a = t0Var.mo1734a(i, -1);
            if (a != -1) {
                return ColorStateList.valueOf(a);
            }
        }
        return t0Var.mo1735a(i);
    }

    /* renamed from: b */
    public static Drawable m18177b(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                Drawable c = C3103a.m12557c(context, resourceId);
                if (c != null) {
                    return c;
                }
            }
        }
        return typedArray.getDrawable(i);
    }

    /* renamed from: c */
    public static C4460d m18178c(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                return new C4460d(context, resourceId);
            }
        }
        return null;
    }
}
