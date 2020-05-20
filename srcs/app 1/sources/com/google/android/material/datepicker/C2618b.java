package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.TextView;
import p071f.p097h.p107l.C3321h;
import p071f.p097h.p108m.C3379v;
import p147g.p156d.p157a.p185c.C4416l;
import p147g.p156d.p157a.p185c.p187b0.C4382g;
import p147g.p156d.p157a.p185c.p187b0.C4389k;
import p147g.p156d.p157a.p185c.p202y.C4459c;

/* renamed from: com.google.android.material.datepicker.b */
final class C2618b {

    /* renamed from: a */
    private final Rect f7560a;

    /* renamed from: b */
    private final ColorStateList f7561b;

    /* renamed from: c */
    private final ColorStateList f7562c;

    /* renamed from: d */
    private final ColorStateList f7563d;

    /* renamed from: e */
    private final int f7564e;

    /* renamed from: f */
    private final C4389k f7565f;

    private C2618b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C4389k kVar, Rect rect) {
        C3321h.m13541a(rect.left);
        C3321h.m13541a(rect.top);
        C3321h.m13541a(rect.right);
        C3321h.m13541a(rect.bottom);
        this.f7560a = rect;
        this.f7561b = colorStateList2;
        this.f7562c = colorStateList;
        this.f7563d = colorStateList3;
        this.f7564e = i;
        this.f7565f = kVar;
    }

    /* renamed from: a */
    static C2618b m10832a(Context context, int i) {
        C3321h.m13546a(i != 0, (Object) "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C4416l.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C4416l.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(C4416l.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(C4416l.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(C4416l.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList a = C4459c.m18175a(context, obtainStyledAttributes, C4416l.MaterialCalendarItem_itemFillColor);
        ColorStateList a2 = C4459c.m18175a(context, obtainStyledAttributes, C4416l.MaterialCalendarItem_itemTextColor);
        ColorStateList a3 = C4459c.m18175a(context, obtainStyledAttributes, C4416l.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C4416l.MaterialCalendarItem_itemStrokeWidth, 0);
        C4389k a4 = C4389k.m17882a(context, obtainStyledAttributes.getResourceId(C4416l.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(C4416l.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).mo13120a();
        obtainStyledAttributes.recycle();
        C2618b bVar = new C2618b(a, a2, a3, dimensionPixelSize, a4, rect);
        return bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo8615a() {
        return this.f7560a.bottom;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8616a(TextView textView) {
        C4382g gVar = new C4382g();
        C4382g gVar2 = new C4382g();
        gVar.setShapeAppearanceModel(this.f7565f);
        gVar2.setShapeAppearanceModel(this.f7565f);
        gVar.mo13059a(this.f7562c);
        gVar.mo13055a((float) this.f7564e, this.f7563d);
        textView.setTextColor(this.f7561b);
        Drawable rippleDrawable = VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f7561b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.f7560a;
        InsetDrawable insetDrawable = new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        C3379v.m13787a((View) textView, (Drawable) insetDrawable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo8617b() {
        return this.f7560a.top;
    }
}
