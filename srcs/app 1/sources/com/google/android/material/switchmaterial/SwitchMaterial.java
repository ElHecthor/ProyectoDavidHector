package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C0251n0;
import com.google.android.material.internal.C2714i;
import com.google.android.material.internal.C2715j;
import com.google.android.material.theme.p054a.C2794a;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4408d;
import p147g.p156d.p157a.p185c.C4415k;
import p147g.p156d.p157a.p185c.C4416l;
import p147g.p156d.p157a.p185c.p195r.C4445a;
import p147g.p156d.p157a.p185c.p198u.C4450a;

public class SwitchMaterial extends C0251n0 {

    /* renamed from: b0 */
    private static final int f7922b0 = C4415k.Widget_MaterialComponents_CompoundButton_Switch;

    /* renamed from: c0 */
    private static final int[][] f7923c0 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: U */
    private final C4450a f7924U;

    /* renamed from: V */
    private ColorStateList f7925V;

    /* renamed from: W */
    private ColorStateList f7926W;

    /* renamed from: a0 */
    private boolean f7927a0;

    public SwitchMaterial(Context context) {
        this(context, null);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4375b.switchStyle);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet, int i) {
        super(C2794a.m11644b(context, attributeSet, i, f7922b0), attributeSet, i);
        Context context2 = getContext();
        this.f7924U = new C4450a(context2);
        TypedArray c = C2714i.m11283c(context2, attributeSet, C4416l.SwitchMaterial, i, f7922b0, new int[0]);
        this.f7927a0 = c.getBoolean(C4416l.SwitchMaterial_useMaterialThemeColors, false);
        c.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f7925V == null) {
            int a = C4445a.m18120a((View) this, C4375b.colorSurface);
            int a2 = C4445a.m18120a((View) this, C4375b.colorControlActivated);
            float dimension = getResources().getDimension(C4408d.mtrl_switch_thumb_elevation);
            if (this.f7924U.mo13256a()) {
                dimension += C2715j.m11286a(this);
            }
            int b = this.f7924U.mo13257b(a, dimension);
            int[] iArr = new int[f7923c0.length];
            iArr[0] = C4445a.m18117a(a, a2, 1.0f);
            iArr[1] = b;
            iArr[2] = C4445a.m18117a(a, a2, 0.38f);
            iArr[3] = b;
            this.f7925V = new ColorStateList(f7923c0, iArr);
        }
        return this.f7925V;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f7926W == null) {
            int[] iArr = new int[f7923c0.length];
            int a = C4445a.m18120a((View) this, C4375b.colorSurface);
            int a2 = C4445a.m18120a((View) this, C4375b.colorControlActivated);
            int a3 = C4445a.m18120a((View) this, C4375b.colorOnSurface);
            iArr[0] = C4445a.m18117a(a, a2, 0.54f);
            iArr[1] = C4445a.m18117a(a, a3, 0.32f);
            iArr[2] = C4445a.m18117a(a, a2, 0.12f);
            iArr[3] = C4445a.m18117a(a, a3, 0.12f);
            this.f7926W = new ColorStateList(f7923c0, iArr);
        }
        return this.f7926W;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7927a0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f7927a0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        ColorStateList colorStateList;
        this.f7927a0 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            colorStateList = getMaterialThemeColorsTrackTintList();
        } else {
            colorStateList = null;
            setThumbTintList(null);
        }
        setTrackTintList(colorStateList);
    }
}
