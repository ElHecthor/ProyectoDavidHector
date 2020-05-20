package p147g.p156d.p157a.p185c.p192p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0223g;
import androidx.core.widget.C0385c;
import com.google.android.material.internal.C2714i;
import com.google.android.material.theme.p054a.C2794a;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4415k;
import p147g.p156d.p157a.p185c.C4416l;
import p147g.p156d.p157a.p185c.p195r.C4445a;
import p147g.p156d.p157a.p185c.p202y.C4459c;

/* renamed from: g.d.a.c.p.a */
public class C4433a extends C0223g {

    /* renamed from: k */
    private static final int f11764k = C4415k.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: l */
    private static final int[][] f11765l = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: i */
    private ColorStateList f11766i;

    /* renamed from: j */
    private boolean f11767j;

    public C4433a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4375b.checkboxStyle);
    }

    public C4433a(Context context, AttributeSet attributeSet, int i) {
        super(C2794a.m11644b(context, attributeSet, i, f11764k), attributeSet, i);
        Context context2 = getContext();
        TypedArray c = C2714i.m11283c(context2, attributeSet, C4416l.MaterialCheckBox, i, f11764k, new int[0]);
        if (c.hasValue(C4416l.MaterialCheckBox_buttonTint)) {
            C0385c.m2007a((CompoundButton) this, C4459c.m18175a(context2, c, C4416l.MaterialCheckBox_buttonTint));
        }
        this.f11767j = c.getBoolean(C4416l.MaterialCheckBox_useMaterialThemeColors, false);
        c.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f11766i == null) {
            int[] iArr = new int[f11765l.length];
            int a = C4445a.m18120a((View) this, C4375b.colorControlActivated);
            int a2 = C4445a.m18120a((View) this, C4375b.colorSurface);
            int a3 = C4445a.m18120a((View) this, C4375b.colorOnSurface);
            iArr[0] = C4445a.m18117a(a2, a, 1.0f);
            iArr[1] = C4445a.m18117a(a2, a3, 0.54f);
            iArr[2] = C4445a.m18117a(a2, a3, 0.38f);
            iArr[3] = C4445a.m18117a(a2, a3, 0.38f);
            this.f11766i = new ColorStateList(f11765l, iArr);
        }
        return this.f11766i;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f11767j && C0385c.m2009b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f11767j = z;
        C0385c.m2007a((CompoundButton) this, z ? getMaterialThemeColorsTintList() : null);
    }
}
