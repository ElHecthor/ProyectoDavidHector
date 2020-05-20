package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0275t0;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4416l;

/* renamed from: com.google.android.material.internal.i */
public final class C2714i {

    /* renamed from: a */
    private static final int[] f7890a = {C4375b.colorPrimary};

    /* renamed from: b */
    private static final int[] f7891b = {C4375b.colorPrimaryVariant};

    /* renamed from: a */
    public static void m11276a(Context context) {
        m11279a(context, f7890a, "Theme.AppCompat");
    }

    /* renamed from: a */
    private static void m11277a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4416l.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C4416l.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C4375b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m11281b(context);
            }
        }
        m11276a(context);
    }

    /* renamed from: a */
    private static void m11278a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4416l.ThemeEnforcement, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(C4416l.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(C4416l.ThemeEnforcement_android_textAppearance, -1) != -1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = m11282b(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: a */
    private static void m11279a(Context context, int[] iArr, String str) {
        if (!m11280a(context, iArr)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The style on this component requires your app theme to be ");
            sb.append(str);
            sb.append(" (or a descendant).");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private static boolean m11280a(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: b */
    public static void m11281b(Context context) {
        m11279a(context, f7891b, "Theme.MaterialComponents");
    }

    /* renamed from: b */
    private static boolean m11282b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: c */
    public static TypedArray m11283c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m11277a(context, attributeSet, i, i2);
        m11278a(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: d */
    public static C0275t0 m11284d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m11277a(context, attributeSet, i, i2);
        m11278a(context, attributeSet, iArr, i, i2, iArr2);
        return C0275t0.m1311a(context, attributeSet, iArr, i, i2);
    }
}
