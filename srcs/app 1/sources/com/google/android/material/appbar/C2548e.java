package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.C2714i;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4411g;

/* renamed from: com.google.android.material.appbar.e */
class C2548e {

    /* renamed from: a */
    private static final int[] f7195a = {16843848};

    /* renamed from: a */
    static void m10309a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: a */
    static void m10310a(View view, float f) {
        int integer = view.getResources().getInteger(C4411g.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        String str = "elevation";
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, C4375b.state_liftable, -C4375b.state_lifted}, ObjectAnimator.ofFloat(view, str, new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, str, new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, str, new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }

    /* renamed from: a */
    static void m10311a(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray c = C2714i.m11283c(context, attributeSet, f7195a, i, i2, new int[0]);
        try {
            if (c.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, c.getResourceId(0, 0)));
            }
        } finally {
            c.recycle();
        }
    }
}
