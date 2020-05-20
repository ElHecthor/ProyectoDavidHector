package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import p147g.p156d.p157a.p185c.C4412h;
import p147g.p156d.p157a.p185c.C4414j;

/* renamed from: com.google.android.material.datepicker.g */
class C2624g extends BaseAdapter {

    /* renamed from: i */
    private static final int f7575i = (VERSION.SDK_INT >= 26 ? 4 : 1);

    /* renamed from: f */
    private final Calendar f7576f;

    /* renamed from: g */
    private final int f7577g;

    /* renamed from: h */
    private final int f7578h = this.f7576f.getFirstDayOfWeek();

    public C2624g() {
        Calendar d = C2656r.m10961d();
        this.f7576f = d;
        this.f7577g = d.getMaximum(7);
    }

    /* renamed from: a */
    private int m10850a(int i) {
        int i2 = i + this.f7578h;
        int i3 = this.f7577g;
        return i2 > i3 ? i2 - i3 : i2;
    }

    public int getCount() {
        return this.f7577g;
    }

    public Integer getItem(int i) {
        if (i >= this.f7577g) {
            return null;
        }
        return Integer.valueOf(m10850a(i));
    }

    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C4412h.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f7576f.set(7, m10850a(i));
        textView.setText(this.f7576f.getDisplayName(7, f7575i, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C4414j.mtrl_picker_day_of_week_column_header), new Object[]{this.f7576f.getDisplayName(7, 2, Locale.getDefault())}));
        return textView;
    }
}
