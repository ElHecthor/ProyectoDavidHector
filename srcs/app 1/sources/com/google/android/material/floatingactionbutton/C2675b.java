package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import p071f.p097h.p107l.C3321h;
import p147g.p156d.p157a.p185c.p189m.C4418b;
import p147g.p156d.p157a.p185c.p189m.C4424h;

/* renamed from: com.google.android.material.floatingactionbutton.b */
abstract class C2675b implements C2694f {

    /* renamed from: a */
    private final Context f7717a;

    /* renamed from: b */
    private final ExtendedFloatingActionButton f7718b;

    /* renamed from: c */
    private final ArrayList<AnimatorListener> f7719c = new ArrayList<>();

    /* renamed from: d */
    private final C2674a f7720d;

    /* renamed from: e */
    private C4424h f7721e;

    /* renamed from: f */
    private C4424h f7722f;

    C2675b(ExtendedFloatingActionButton extendedFloatingActionButton, C2674a aVar) {
        this.f7718b = extendedFloatingActionButton;
        this.f7717a = extendedFloatingActionButton.getContext();
        this.f7720d = aVar;
    }

    /* renamed from: a */
    public void mo8725a() {
        this.f7720d.mo8821b();
    }

    /* renamed from: a */
    public final void mo8822a(C4424h hVar) {
        this.f7722f = hVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public AnimatorSet mo8823b(C4424h hVar) {
        ArrayList arrayList = new ArrayList();
        String str = "opacity";
        if (hVar.mo13174c(str)) {
            arrayList.add(hVar.mo13169a(str, this.f7718b, View.ALPHA));
        }
        String str2 = "scale";
        if (hVar.mo13174c(str2)) {
            arrayList.add(hVar.mo13169a(str2, this.f7718b, View.SCALE_Y));
            arrayList.add(hVar.mo13169a(str2, this.f7718b, View.SCALE_X));
        }
        String str3 = "width";
        if (hVar.mo13174c(str3)) {
            arrayList.add(hVar.mo13169a(str3, this.f7718b, ExtendedFloatingActionButton.f7665F));
        }
        String str4 = "height";
        if (hVar.mo13174c(str4)) {
            arrayList.add(hVar.mo13169a(str4, this.f7718b, ExtendedFloatingActionButton.f7666G));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C4418b.m18007a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: b */
    public void mo8732b() {
        this.f7720d.mo8821b();
    }

    /* renamed from: e */
    public C4424h mo8824e() {
        return this.f7722f;
    }

    /* renamed from: f */
    public AnimatorSet mo8729f() {
        return mo8823b(mo8826i());
    }

    /* renamed from: g */
    public final List<AnimatorListener> mo8825g() {
        return this.f7719c;
    }

    /* renamed from: i */
    public final C4424h mo8826i() {
        C4424h hVar = this.f7722f;
        if (hVar != null) {
            return hVar;
        }
        if (this.f7721e == null) {
            this.f7721e = C4424h.m18017a(this.f7717a, mo8727c());
        }
        C4424h hVar2 = this.f7721e;
        C3321h.m13543a(hVar2);
        return hVar2;
    }

    public void onAnimationStart(Animator animator) {
        this.f7720d.mo8820a(animator);
    }
}
