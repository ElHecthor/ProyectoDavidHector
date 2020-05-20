package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import p071f.p097h.p100f.C3257d;

/* renamed from: androidx.appcompat.widget.o0 */
class C0254o0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1133a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1134b = {-16842910};

    /* renamed from: c */
    static final int[] f1135c = {16842908};

    /* renamed from: d */
    static final int[] f1136d = {16842919};

    /* renamed from: e */
    static final int[] f1137e = {16842912};

    /* renamed from: f */
    static final int[] f1138f = new int[0];

    /* renamed from: g */
    private static final int[] f1139g = new int[1];

    /* renamed from: a */
    public static int m1253a(Context context, int i) {
        ColorStateList c = m1257c(context, i);
        if (c != null && c.isStateful()) {
            return c.getColorForState(f1134b, c.getDefaultColor());
        }
        TypedValue a = m1255a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m1254a(context, i, a.getFloat());
    }

    /* renamed from: a */
    static int m1254a(Context context, int i, float f) {
        int b = m1256b(context, i);
        return C3257d.m13346c(b, Math.round(((float) Color.alpha(b)) * f));
    }

    /* renamed from: a */
    private static TypedValue m1255a() {
        TypedValue typedValue = (TypedValue) f1133a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f1133a.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: b */
    public static int m1256b(Context context, int i) {
        int[] iArr = f1139g;
        iArr[0] = i;
        C0275t0 a = C0275t0.m1310a(context, (AttributeSet) null, iArr);
        try {
            return a.mo1734a(0, 0);
        } finally {
            a.mo1737a();
        }
    }

    /* renamed from: c */
    public static ColorStateList m1257c(Context context, int i) {
        int[] iArr = f1139g;
        iArr[0] = i;
        C0275t0 a = C0275t0.m1310a(context, (AttributeSet) null, iArr);
        try {
            return a.mo1735a(0);
        } finally {
            a.mo1737a();
        }
    }
}
