package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0335f;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p071f.p097h.p108m.C3379v;
import p147g.p156d.p157a.p185c.C4410f;
import p147g.p156d.p157a.p185c.p189m.C4417a;
import p147g.p156d.p157a.p185c.p189m.C4418b;
import p147g.p156d.p157a.p185c.p189m.C4419c;
import p147g.p156d.p157a.p185c.p189m.C4420d;
import p147g.p156d.p157a.p185c.p189m.C4421e;
import p147g.p156d.p157a.p185c.p189m.C4424h;
import p147g.p156d.p157a.p185c.p189m.C4425i;
import p147g.p156d.p157a.p185c.p189m.C4426j;
import p147g.p156d.p157a.p185c.p193q.C4434a;
import p147g.p156d.p157a.p185c.p193q.C4437c;
import p147g.p156d.p157a.p185c.p193q.C4438d;
import p147g.p156d.p157a.p185c.p193q.C4438d.C4442d;
import p147g.p156d.p157a.p185c.p193q.C4438d.C4443e;
import p147g.p156d.p157a.p185c.p200w.C4454a;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f8214c = new Rect();

    /* renamed from: d */
    private final RectF f8215d = new RectF();

    /* renamed from: e */
    private final RectF f8216e = new RectF();

    /* renamed from: f */
    private final int[] f8217f = new int[2];

    /* renamed from: g */
    private float f8218g;

    /* renamed from: h */
    private float f8219h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    class C2797a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f8220a;

        /* renamed from: b */
        final /* synthetic */ View f8221b;

        /* renamed from: c */
        final /* synthetic */ View f8222c;

        C2797a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f8220a = z;
            this.f8221b = view;
            this.f8222c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f8220a) {
                this.f8221b.setVisibility(4);
                this.f8222c.setAlpha(1.0f);
                this.f8222c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f8220a) {
                this.f8221b.setVisibility(0);
                this.f8222c.setAlpha(0.0f);
                this.f8222c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    class C2798b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f8223a;

        C2798b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.f8223a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f8223a.invalidate();
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    class C2799c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C4438d f8224a;

        /* renamed from: b */
        final /* synthetic */ Drawable f8225b;

        C2799c(FabTransformationBehavior fabTransformationBehavior, C4438d dVar, Drawable drawable) {
            this.f8224a = dVar;
            this.f8225b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f8224a.setCircularRevealOverlayDrawable(null);
        }

        public void onAnimationStart(Animator animator) {
            this.f8224a.setCircularRevealOverlayDrawable(this.f8225b);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    class C2800d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C4438d f8226a;

        C2800d(FabTransformationBehavior fabTransformationBehavior, C4438d dVar) {
            this.f8226a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            C4443e revealInfo = this.f8226a.getRevealInfo();
            revealInfo.f11777c = Float.MAX_VALUE;
            this.f8226a.setRevealInfo(revealInfo);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    protected static class C2801e {

        /* renamed from: a */
        public C4424h f8227a;

        /* renamed from: b */
        public C4426j f8228b;

        protected C2801e() {
        }
    }

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private float m11654a(View view, View view2, C4426j jVar) {
        RectF rectF = this.f8215d;
        RectF rectF2 = this.f8216e;
        m11660a(view, rectF);
        m11668b(view2, rectF2);
        rectF2.offset(-m11670c(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: a */
    private float m11655a(C2801e eVar, C4425i iVar, float f, float f2) {
        long a = iVar.mo13179a();
        long b = iVar.mo13181b();
        C4425i b2 = eVar.f8227a.mo13173b("expansion");
        return C4417a.m18005a(f, f2, iVar.mo13182c().getInterpolation(((float) (((b2.mo13179a() + b2.mo13181b()) + 17) - a)) / ((float) b)));
    }

    /* renamed from: a */
    private Pair<C4425i, C4425i> m11656a(float f, float f2, boolean z, C2801e eVar) {
        String str;
        C4424h hVar;
        C4425i iVar;
        if (f != 0.0f) {
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i != 0) {
                if ((!z || f2 >= 0.0f) && (z || i <= 0)) {
                    iVar = eVar.f8227a.mo13173b("translationXCurveDownwards");
                    hVar = eVar.f8227a;
                    str = "translationYCurveDownwards";
                } else {
                    iVar = eVar.f8227a.mo13173b("translationXCurveUpwards");
                    hVar = eVar.f8227a;
                    str = "translationYCurveUpwards";
                }
                return new Pair<>(iVar, hVar.mo13173b(str));
            }
        }
        iVar = eVar.f8227a.mo13173b("translationXLinear");
        hVar = eVar.f8227a;
        str = "translationYLinear";
        return new Pair<>(iVar, hVar.mo13173b(str));
    }

    /* renamed from: a */
    private ViewGroup m11657a(View view) {
        View findViewById = view.findViewById(C4410f.mtrl_child_content_container);
        return findViewById != null ? m11671c(findViewById) : ((view instanceof C2804b) || (view instanceof C2803a)) ? m11671c(((ViewGroup) view).getChildAt(0)) : m11671c(view);
    }

    /* renamed from: a */
    private void m11658a(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: a */
    private void m11659a(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }

    /* renamed from: a */
    private void m11660a(View view, RectF rectF) {
        m11668b(view, rectF);
        rectF.offset(this.f8218g, this.f8219h);
    }

    /* renamed from: a */
    private void m11661a(View view, View view2, boolean z, C2801e eVar, List<Animator> list) {
        float c = m11670c(view, view2, eVar.f8228b);
        float d = m11673d(view, view2, eVar.f8228b);
        Pair a = m11656a(c, d, z, eVar);
        C4425i iVar = (C4425i) a.first;
        C4425i iVar2 = (C4425i) a.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            c = this.f8218g;
        }
        fArr[0] = c;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            d = this.f8219h;
        }
        fArr2[0] = d;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.mo13180a((Animator) ofFloat);
        iVar2.mo13180a((Animator) ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: a */
    private void m11662a(View view, View view2, boolean z, boolean z2, C2801e eVar, float f, float f2, List<Animator> list, List<AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        C2801e eVar2 = eVar;
        if (view4 instanceof C4438d) {
            C4438d dVar = (C4438d) view4;
            float a = m11654a(view3, view4, eVar2.f8228b);
            float b = m11666b(view3, view4, eVar2.f8228b);
            ((FloatingActionButton) view3).mo8742a(this.f8214c);
            float width = ((float) this.f8214c.width()) / 2.0f;
            C4425i b2 = eVar2.f8227a.mo13173b("expansion");
            if (z) {
                if (!z2) {
                    dVar.setRevealInfo(new C4443e(a, b, width));
                }
                if (z2) {
                    width = dVar.getRevealInfo().f11777c;
                }
                animator = C4434a.m18093a(dVar, a, b, C4454a.m18162a(a, b, 0.0f, 0.0f, f, f2));
                animator.addListener(new C2800d(this, dVar));
                m11658a(view2, b2.mo13179a(), (int) a, (int) b, width, list);
            } else {
                float f3 = dVar.getRevealInfo().f11777c;
                Animator a2 = C4434a.m18093a(dVar, a, b, width);
                int i = (int) a;
                int i2 = (int) b;
                View view5 = view2;
                int i3 = i;
                m11658a(view5, b2.mo13179a(), i, i2, f3, list);
                m11659a(view5, b2.mo13179a(), b2.mo13181b(), eVar2.f8227a.mo13168a(), i3, i2, width, list);
                animator = a2;
            }
            b2.mo13180a(animator);
            list.add(animator);
            list2.add(C4434a.m18092a(dVar));
        }
    }

    /* renamed from: a */
    private void m11663a(View view, View view2, boolean z, boolean z2, C2801e eVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if (!(view2 instanceof C4438d) || C4437c.f11770a != 0) {
                ViewGroup a = m11657a(view2);
                if (a != null) {
                    if (z) {
                        if (!z2) {
                            C4420d.f11718a.set(a, Float.valueOf(0.0f));
                        }
                        objectAnimator = ObjectAnimator.ofFloat(a, C4420d.f11718a, new float[]{1.0f});
                    } else {
                        objectAnimator = ObjectAnimator.ofFloat(a, C4420d.f11718a, new float[]{0.0f});
                    }
                    eVar.f8227a.mo13173b("contentFade").mo13180a((Animator) objectAnimator);
                    list.add(objectAnimator);
                }
            }
        }
    }

    /* renamed from: a */
    private void m11664a(View view, View view2, boolean z, boolean z2, C2801e eVar, List<Animator> list, List<AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view3 = view;
        View view4 = view2;
        boolean z3 = z;
        C2801e eVar2 = eVar;
        List<Animator> list3 = list;
        float c = m11670c(view3, view4, eVar2.f8228b);
        float d = m11673d(view3, view4, eVar2.f8228b);
        Pair a = m11656a(c, d, z3, eVar2);
        C4425i iVar = (C4425i) a.first;
        C4425i iVar2 = (C4425i) a.second;
        if (z3) {
            if (!z2) {
                view4.setTranslationX(-c);
                view4.setTranslationY(-d);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            m11665a(view2, eVar, iVar, iVar2, -c, -d, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-c});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-d});
        }
        iVar.mo13180a((Animator) objectAnimator2);
        iVar2.mo13180a((Animator) objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    /* renamed from: a */
    private void m11665a(View view, C2801e eVar, C4425i iVar, C4425i iVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float a = m11655a(eVar, iVar, f, f3);
        float a2 = m11655a(eVar, iVar2, f2, f4);
        Rect rect = this.f8214c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f8215d;
        rectF2.set(rect);
        RectF rectF3 = this.f8216e;
        m11668b(view, rectF3);
        rectF3.offset(a, a2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: b */
    private float m11666b(View view, View view2, C4426j jVar) {
        RectF rectF = this.f8215d;
        RectF rectF2 = this.f8216e;
        m11660a(view, rectF);
        m11668b(view2, rectF2);
        rectF2.offset(0.0f, -m11673d(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: b */
    private int m11667b(View view) {
        ColorStateList h = C3379v.m13819h(view);
        if (h != null) {
            return h.getColorForState(view.getDrawableState(), h.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: b */
    private void m11668b(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f8217f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: b */
    private void m11669b(View view, View view2, boolean z, boolean z2, C2801e eVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof C4438d) {
            C4438d dVar = (C4438d) view2;
            int b = m11667b(view);
            int i = 16777215 & b;
            if (z) {
                if (!z2) {
                    dVar.setCircularRevealScrimColor(b);
                }
                objectAnimator = ObjectAnimator.ofInt(dVar, C4442d.f11774a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(dVar, C4442d.f11774a, new int[]{b});
            }
            objectAnimator.setEvaluator(C4419c.m18008a());
            eVar.f8227a.mo13173b("color").mo13180a((Animator) objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* renamed from: c */
    private float m11670c(View view, View view2, C4426j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f8215d;
        RectF rectF2 = this.f8216e;
        m11660a(view, rectF);
        m11668b(view2, rectF2);
        int i = jVar.f11732a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + jVar.f11733b;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + jVar.f11733b;
    }

    /* renamed from: c */
    private ViewGroup m11671c(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @TargetApi(21)
    /* renamed from: c */
    private void m11672c(View view, View view2, boolean z, boolean z2, C2801e eVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float l = C3379v.m13825l(view2) - C3379v.m13825l(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-l);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-l});
        }
        eVar.f8227a.mo13173b("elevation").mo13180a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: d */
    private float m11673d(View view, View view2, C4426j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f8215d;
        RectF rectF2 = this.f8216e;
        m11660a(view, rectF);
        m11668b(view2, rectF2);
        int i = jVar.f11732a & 112;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + jVar.f11734c;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + jVar.f11734c;
    }

    /* renamed from: d */
    private void m11674d(View view, View view2, boolean z, boolean z2, C2801e eVar, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof C4438d) && (view instanceof ImageView)) {
            C4438d dVar = (C4438d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, C4421e.f11719b, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, C4421e.f11719b, new int[]{255});
                }
                objectAnimator.addUpdateListener(new C2798b(this, view2));
                eVar.f8227a.mo13173b("iconFade").mo13180a((Animator) objectAnimator);
                list.add(objectAnimator);
                list2.add(new C2799c(this, dVar, drawable));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C2801e mo9385a(Context context, boolean z);

    /* renamed from: a */
    public void mo2095a(C0335f fVar) {
        if (fVar.f1598h == 0) {
            fVar.f1598h = 80;
        }
    }

    /* renamed from: a */
    public boolean mo2111a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AnimatorSet mo9383b(View view, View view2, boolean z, boolean z2) {
        boolean z3 = z;
        C2801e a = mo9385a(view2.getContext(), z3);
        if (z3) {
            this.f8218g = view.getTranslationX();
            this.f8219h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (VERSION.SDK_INT >= 21) {
            m11672c(view, view2, z, z2, a, arrayList, arrayList2);
        }
        RectF rectF = this.f8215d;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        m11664a(view3, view4, z4, z2, a, (List<Animator>) arrayList3, (List<AnimatorListener>) arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m11661a(view3, view4, z4, a, arrayList);
        boolean z5 = z2;
        C2801e eVar = a;
        m11674d(view3, view4, z4, z5, eVar, arrayList3, arrayList4);
        m11662a(view3, view4, z4, z5, eVar, width, height, (List<Animator>) arrayList, (List<AnimatorListener>) arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        m11669b(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        m11663a(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        C4418b.m18007a(animatorSet, arrayList);
        animatorSet.addListener(new C2797a(this, z3, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }
}
