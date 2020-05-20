package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.f */
public final class C2706f {

    /* renamed from: a */
    private final ArrayList<C2708b> f7875a = new ArrayList<>();

    /* renamed from: b */
    private C2708b f7876b = null;

    /* renamed from: c */
    ValueAnimator f7877c = null;

    /* renamed from: d */
    private final AnimatorListener f7878d = new C2707a();

    /* renamed from: com.google.android.material.internal.f$a */
    class C2707a extends AnimatorListenerAdapter {
        C2707a() {
        }

        public void onAnimationEnd(Animator animator) {
            C2706f fVar = C2706f.this;
            if (fVar.f7877c == animator) {
                fVar.f7877c = null;
            }
        }
    }

    /* renamed from: com.google.android.material.internal.f$b */
    static class C2708b {

        /* renamed from: a */
        final int[] f7880a;

        /* renamed from: b */
        final ValueAnimator f7881b;

        C2708b(int[] iArr, ValueAnimator valueAnimator) {
            this.f7880a = iArr;
            this.f7881b = valueAnimator;
        }
    }

    /* renamed from: a */
    private void m11254a(C2708b bVar) {
        ValueAnimator valueAnimator = bVar.f7881b;
        this.f7877c = valueAnimator;
        valueAnimator.start();
    }

    /* renamed from: b */
    private void m11255b() {
        ValueAnimator valueAnimator = this.f7877c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7877c = null;
        }
    }

    /* renamed from: a */
    public void mo8987a() {
        ValueAnimator valueAnimator = this.f7877c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f7877c = null;
        }
    }

    /* renamed from: a */
    public void mo8988a(int[] iArr) {
        C2708b bVar;
        int size = this.f7875a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = (C2708b) this.f7875a.get(i);
            if (StateSet.stateSetMatches(bVar.f7880a, iArr)) {
                break;
            }
            i++;
        }
        C2708b bVar2 = this.f7876b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                m11255b();
            }
            this.f7876b = bVar;
            if (bVar != null) {
                m11254a(bVar);
            }
        }
    }

    /* renamed from: a */
    public void mo8989a(int[] iArr, ValueAnimator valueAnimator) {
        C2708b bVar = new C2708b(iArr, valueAnimator);
        valueAnimator.addListener(this.f7878d);
        this.f7875a.add(bVar);
    }
}
