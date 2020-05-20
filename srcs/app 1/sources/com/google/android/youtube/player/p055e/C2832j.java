package com.google.android.youtube.player.p055e;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: com.google.android.youtube.player.e.j */
public final class C2832j extends FrameLayout {

    /* renamed from: f */
    private final ProgressBar f8274f;

    /* renamed from: g */
    private final TextView f8275g;

    public C2832j(Context context) {
        super(context, null, C2854u.m11849c(context));
        C2831i iVar = new C2831i(context);
        setBackgroundColor(-16777216);
        ProgressBar progressBar = new ProgressBar(context);
        this.f8274f = progressBar;
        progressBar.setVisibility(8);
        addView(this.f8274f, new LayoutParams(-2, -2, 17));
        int i = (int) ((context.getResources().getDisplayMetrics().density * 10.0f) + 0.5f);
        TextView textView = new TextView(context);
        this.f8275g = textView;
        textView.setTextAppearance(context, 16973894);
        this.f8275g.setTextColor(-1);
        this.f8275g.setVisibility(8);
        this.f8275g.setPadding(i, i, i, i);
        this.f8275g.setGravity(17);
        this.f8275g.setText(iVar.f8273a);
        addView(this.f8275g, new LayoutParams(-2, -2, 17));
    }

    /* renamed from: a */
    public final void mo9467a() {
        this.f8274f.setVisibility(8);
        this.f8275g.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo9468b() {
        this.f8274f.setVisibility(0);
        this.f8275g.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo9469c() {
        this.f8274f.setVisibility(8);
        this.f8275g.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        float f;
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (mode == 1073741824 || (mode == Integer.MIN_VALUE && mode2 == 0)) {
                size2 = (int) (((float) size) / 1.777f);
            } else {
                if (mode2 == 1073741824 || (mode2 == Integer.MIN_VALUE && mode == 0)) {
                    f = (float) size2;
                } else if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
                    f = (float) size2;
                    float f2 = ((float) size) / 1.777f;
                    if (f >= f2) {
                        size2 = (int) f2;
                    }
                } else {
                    size = 0;
                    size2 = 0;
                }
                size = (int) (f * 1.777f);
            }
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(FrameLayout.resolveSize(size, i), 1073741824), MeasureSpec.makeMeasureSpec(FrameLayout.resolveSize(size2, i2), 1073741824));
    }
}
