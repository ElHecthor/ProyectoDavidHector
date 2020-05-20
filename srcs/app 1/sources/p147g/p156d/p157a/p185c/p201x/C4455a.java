package p147g.p156d.p157a.p185c.p201x;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0257q;
import androidx.core.widget.C0385c;
import com.google.android.material.internal.C2714i;
import com.google.android.material.theme.p054a.C2794a;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4415k;
import p147g.p156d.p157a.p185c.C4416l;
import p147g.p156d.p157a.p185c.p195r.C4445a;

/* renamed from: g.d.a.c.x.a */
public class C4455a extends C0257q {

    /* renamed from: k */
    private static final int f11795k = C4415k.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: l */
    private static final int[][] f11796l = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: i */
    private ColorStateList f11797i;

    /* renamed from: j */
    private boolean f11798j;

    public C4455a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4375b.radioButtonStyle);
    }

    public C4455a(Context context, AttributeSet attributeSet, int i) {
        super(C2794a.m11644b(context, attributeSet, i, f11795k), attributeSet, i);
        TypedArray c = C2714i.m11283c(getContext(), attributeSet, C4416l.MaterialRadioButton, i, f11795k, new int[0]);
        this.f11798j = c.getBoolean(C4416l.MaterialRadioButton_useMaterialThemeColors, false);
        c.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f11797i == null) {
            int a = C4445a.m18120a((View) this, C4375b.colorControlActivated);
            int a2 = C4445a.m18120a((View) this, C4375b.colorOnSurface);
            int a3 = C4445a.m18120a((View) this, C4375b.colorSurface);
            int[] iArr = new int[f11796l.length];
            iArr[0] = C4445a.m18117a(a3, a, 1.0f);
            iArr[1] = C4445a.m18117a(a3, a2, 0.54f);
            iArr[2] = C4445a.m18117a(a3, a2, 0.38f);
            iArr[3] = C4445a.m18117a(a3, a2, 0.38f);
            this.f11797i = new ColorStateList(f11796l, iArr);
        }
        return this.f11797i;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f11798j && C0385c.m2009b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f11798j = z;
        C0385c.m2007a((CompoundButton) this, z ? getMaterialThemeColorsTintList() : null);
    }
}
