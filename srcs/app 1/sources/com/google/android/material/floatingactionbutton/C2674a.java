package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

/* renamed from: com.google.android.material.floatingactionbutton.a */
class C2674a {

    /* renamed from: a */
    private Animator f7716a;

    C2674a() {
    }

    /* renamed from: a */
    public void mo8819a() {
        Animator animator = this.f7716a;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: a */
    public void mo8820a(Animator animator) {
        mo8819a();
        this.f7716a = animator;
    }

    /* renamed from: b */
    public void mo8821b() {
        this.f7716a = null;
    }
}
