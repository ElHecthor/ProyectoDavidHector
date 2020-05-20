package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4416l;
import p147g.p156d.p157a.p185c.p202y.C4458b;
import p147g.p156d.p157a.p185c.p202y.C4459c;

/* renamed from: com.google.android.material.datepicker.c */
final class C2619c {

    /* renamed from: a */
    final C2618b f7566a;

    /* renamed from: b */
    final C2618b f7567b;

    /* renamed from: c */
    final C2618b f7568c;

    /* renamed from: d */
    final C2618b f7569d;

    /* renamed from: e */
    final C2618b f7570e;

    /* renamed from: f */
    final C2618b f7571f;

    /* renamed from: g */
    final C2618b f7572g;

    /* renamed from: h */
    final Paint f7573h;

    C2619c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C4458b.m18169a(context, C4375b.materialCalendarStyle, C2625h.class.getCanonicalName()), C4416l.MaterialCalendar);
        this.f7566a = C2618b.m10832a(context, obtainStyledAttributes.getResourceId(C4416l.MaterialCalendar_dayStyle, 0));
        this.f7572g = C2618b.m10832a(context, obtainStyledAttributes.getResourceId(C4416l.MaterialCalendar_dayInvalidStyle, 0));
        this.f7567b = C2618b.m10832a(context, obtainStyledAttributes.getResourceId(C4416l.MaterialCalendar_daySelectedStyle, 0));
        this.f7568c = C2618b.m10832a(context, obtainStyledAttributes.getResourceId(C4416l.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList a = C4459c.m18175a(context, obtainStyledAttributes, C4416l.MaterialCalendar_rangeFillColor);
        this.f7569d = C2618b.m10832a(context, obtainStyledAttributes.getResourceId(C4416l.MaterialCalendar_yearStyle, 0));
        this.f7570e = C2618b.m10832a(context, obtainStyledAttributes.getResourceId(C4416l.MaterialCalendar_yearSelectedStyle, 0));
        this.f7571f = C2618b.m10832a(context, obtainStyledAttributes.getResourceId(C4416l.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f7573h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
