package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.google.android.material.internal.k */
public class C2720k extends ImageButton {

    /* renamed from: f */
    private int f7898f;

    public C2720k(Context context) {
        this(context, null);
    }

    public C2720k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C2720k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7898f = getVisibility();
    }

    /* renamed from: a */
    public final void mo9006a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f7898f = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f7898f;
    }

    public void setVisibility(int i) {
        mo9006a(i, true);
    }
}
