package com.google.android.material.theme.p054a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p071f.p072a.p079o.C3127d;
import p147g.p156d.p157a.p185c.C4375b;

/* renamed from: com.google.android.material.theme.a.a */
public class C2794a {

    /* renamed from: a */
    private static final int[] f8205a = {16842752, C4375b.theme};

    /* renamed from: b */
    private static final int[] f8206b = {C4375b.materialThemeOverlay};

    /* renamed from: a */
    private static int m11642a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8205a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* renamed from: a */
    private static int m11643a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8206b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: b */
    public static Context m11644b(Context context, AttributeSet attributeSet, int i, int i2) {
        int a = m11643a(context, attributeSet, i, i2);
        boolean z = (context instanceof C3127d) && ((C3127d) context).mo10049a() == a;
        if (a == 0 || z) {
            return context;
        }
        C3127d dVar = new C3127d(context, a);
        int a2 = m11642a(context, attributeSet);
        if (a2 != 0) {
            dVar.getTheme().applyStyle(a2, true);
        }
        return dVar;
    }
}
