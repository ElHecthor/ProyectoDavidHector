package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4416l;
import p147g.p156d.p157a.p185c.p202y.C4458b;
import p147g.p156d.p157a.p185c.p202y.C4459c;

public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        if (m11630a(context)) {
            Theme theme = context.getTheme();
            if (!m11631a(context, theme, attributeSet, i, i2)) {
                int a = m11628a(theme, attributeSet, i, i2);
                if (a != -1) {
                    m11629a(theme, a);
                }
            }
        }
    }

    /* renamed from: a */
    private static int m11627a(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = C4459c.m18173a(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: a */
    private static int m11628a(Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C4416l.MaterialTextView, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C4416l.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: a */
    private void m11629a(Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C4416l.MaterialTextAppearance);
        int a = m11627a(getContext(), obtainStyledAttributes, C4416l.MaterialTextAppearance_android_lineHeight, C4416l.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (a >= 0) {
            setLineHeight(a);
        }
    }

    /* renamed from: a */
    private static boolean m11630a(Context context) {
        return C4458b.m18172a(context, C4375b.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: a */
    private static boolean m11631a(Context context, Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C4416l.MaterialTextView, i, i2);
        int a = m11627a(context, obtainStyledAttributes, C4416l.MaterialTextView_android_lineHeight, C4416l.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        return a != -1;
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (m11630a(context)) {
            m11629a(context.getTheme(), i);
        }
    }
}
