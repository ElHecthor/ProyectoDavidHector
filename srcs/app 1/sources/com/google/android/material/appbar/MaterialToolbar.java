package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.theme.p054a.C2794a;
import p071f.p097h.p108m.C3379v;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4415k;
import p147g.p156d.p157a.p185c.p187b0.C4382g;
import p147g.p156d.p157a.p185c.p187b0.C4386h;

public class MaterialToolbar extends Toolbar {

    /* renamed from: U */
    private static final int f7170U = C4415k.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4375b.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(C2794a.m11644b(context, attributeSet, i, f7170U), attributeSet, i);
        m10276a(getContext());
    }

    /* renamed from: a */
    private void m10276a(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C4382g gVar = new C4382g();
            gVar.mo13059a(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.mo13058a(context);
            gVar.mo13064b(C3379v.m13825l(this));
            C3379v.m13787a((View) this, (Drawable) gVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4386h.m17875a((View) this);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C4386h.m17876a((View) this, f);
    }
}
