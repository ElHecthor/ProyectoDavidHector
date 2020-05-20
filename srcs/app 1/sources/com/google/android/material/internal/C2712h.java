package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;
import p071f.p139v.C3607m;
import p071f.p139v.C3624s;

/* renamed from: com.google.android.material.internal.h */
public class C2712h extends C3607m {

    /* renamed from: com.google.android.material.internal.h$a */
    class C2713a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TextView f7889a;

        C2713a(C2712h hVar, TextView textView) {
            this.f7889a = textView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f7889a.setScaleX(floatValue);
            this.f7889a.setScaleY(floatValue);
        }
    }

    /* renamed from: d */
    private void m11272d(C3624s sVar) {
        View view = sVar.f10178b;
        if (view instanceof TextView) {
            String str = "android:textscale:scale";
            sVar.f10177a.put(str, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    /* renamed from: a */
    public Animator mo8999a(ViewGroup viewGroup, C3624s sVar, C3624s sVar2) {
        ValueAnimator valueAnimator = null;
        if (!(sVar == null || sVar2 == null || !(sVar.f10178b instanceof TextView))) {
            View view = sVar2.f10178b;
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                Map<String, Object> map = sVar.f10177a;
                Map<String, Object> map2 = sVar2.f10177a;
                String str = "android:textscale:scale";
                float f = 1.0f;
                float floatValue = map.get(str) != null ? ((Float) map.get(str)).floatValue() : 1.0f;
                if (map2.get(str) != null) {
                    f = ((Float) map2.get(str)).floatValue();
                }
                if (floatValue == f) {
                    return null;
                }
                valueAnimator = ValueAnimator.ofFloat(new float[]{floatValue, f});
                valueAnimator.addUpdateListener(new C2713a(this, textView));
            }
        }
        return valueAnimator;
    }

    /* renamed from: a */
    public void mo9000a(C3624s sVar) {
        m11272d(sVar);
    }

    /* renamed from: c */
    public void mo9001c(C3624s sVar) {
        m11272d(sVar);
    }
}
