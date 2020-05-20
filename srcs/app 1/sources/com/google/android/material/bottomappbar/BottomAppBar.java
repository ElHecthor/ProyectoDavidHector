package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.C0182e;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0331b;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0335f;
import androidx.core.graphics.drawable.C0371a;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton.C2671b;
import com.google.android.material.internal.C2715j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071f.p097h.p108m.C3379v;
import p071f.p112j.p113a.C3400a;
import p147g.p156d.p157a.p185c.C4408d;
import p147g.p156d.p157a.p185c.p187b0.C4382g;
import p147g.p156d.p157a.p185c.p187b0.C4386h;
import p147g.p156d.p157a.p185c.p189m.C4427k;

public class BottomAppBar extends Toolbar implements C0331b {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final int f7218U;

    /* renamed from: V */
    private final C4382g f7219V;

    /* renamed from: W */
    private Animator f7220W;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public Animator f7221a0;

    /* renamed from: b0 */
    private int f7222b0;

    /* renamed from: c0 */
    private int f7223c0;

    /* renamed from: d0 */
    private boolean f7224d0;

    /* renamed from: e0 */
    private int f7225e0;

    /* renamed from: f0 */
    private ArrayList<C2561f> f7226f0;

    /* renamed from: g0 */
    private boolean f7227g0;

    /* renamed from: h0 */
    private Behavior f7228h0;

    /* renamed from: i0 */
    private int f7229i0;

    /* renamed from: j0 */
    private int f7230j0;

    /* renamed from: k0 */
    private int f7231k0;

    /* renamed from: l0 */
    AnimatorListenerAdapter f7232l0;

    /* renamed from: m0 */
    C4427k<FloatingActionButton> f7233m0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final Rect f7234e = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public WeakReference<BottomAppBar> f7235f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f7236g;

        /* renamed from: h */
        private final OnLayoutChangeListener f7237h = new C2554a();

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        class C2554a implements OnLayoutChangeListener {
            C2554a() {
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f7235f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.mo8745b(Behavior.this.f7234e);
                int height = Behavior.this.f7234e.height();
                bottomAppBar.mo7967b(height);
                C0335f fVar = (C0335f) view.getLayoutParams();
                if (Behavior.this.f7236g == 0) {
                    fVar.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C4408d.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    fVar.leftMargin = bottomAppBar.getLeftInset();
                    fVar.rightMargin = bottomAppBar.getRightInset();
                    if (C2715j.m11289b(floatingActionButton)) {
                        fVar.leftMargin += bottomAppBar.f7218U;
                    } else {
                        fVar.rightMargin += bottomAppBar.f7218U;
                    }
                }
            }
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public boolean mo2106a(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f7235f = new WeakReference<>(bottomAppBar);
            View j = bottomAppBar.m10369p();
            if (j != null && !C3379v.m13768D(j)) {
                C0335f fVar = (C0335f) j.getLayoutParams();
                fVar.f1594d = 49;
                this.f7236g = fVar.bottomMargin;
                if (j instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) j;
                    floatingActionButton.addOnLayoutChangeListener(this.f7237h);
                    bottomAppBar.m10351a(floatingActionButton);
                }
                bottomAppBar.m10372s();
            }
            coordinatorLayout.mo2059c((View) bottomAppBar, i);
            return super.mo2106a(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: a */
        public boolean mo2118b(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.mo2118b(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    class C2555a extends AnimatorListenerAdapter {
        C2555a() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m10366m();
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m10367n();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    class C2556b extends C2671b {

        /* renamed from: a */
        final /* synthetic */ int f7240a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b$a */
        class C2557a extends C2671b {
            C2557a() {
            }

            /* renamed from: b */
            public void mo7990b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m10366m();
            }
        }

        C2556b(int i) {
            this.f7240a = i;
        }

        /* renamed from: a */
        public void mo7989a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m10355c(this.f7240a));
            floatingActionButton.mo8746b((C2671b) new C2557a());
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    class C2558c extends AnimatorListenerAdapter {
        C2558c() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m10366m();
            BottomAppBar.this.f7221a0 = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m10367n();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    class C2559d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f7244a;

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f7245b;

        /* renamed from: c */
        final /* synthetic */ int f7246c;

        /* renamed from: d */
        final /* synthetic */ boolean f7247d;

        C2559d(ActionMenuView actionMenuView, int i, boolean z) {
            this.f7245b = actionMenuView;
            this.f7246c = i;
            this.f7247d = z;
        }

        public void onAnimationCancel(Animator animator) {
            this.f7244a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f7244a) {
                BottomAppBar.this.m10353b(this.f7245b, this.f7246c, this.f7247d);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    class C2560e extends AnimatorListenerAdapter {
        C2560e() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f7232l0.onAnimationStart(animator);
            FloatingActionButton d = BottomAppBar.this.m10368o();
            if (d != null) {
                d.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    interface C2561f {
        /* renamed from: a */
        void mo7996a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void mo7997b(BottomAppBar bottomAppBar);
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    static class C2562g extends C3400a {
        public static final Creator<C2562g> CREATOR = new C2563a();

        /* renamed from: h */
        int f7250h;

        /* renamed from: i */
        boolean f7251i;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g$a */
        static class C2563a implements ClassLoaderCreator<C2562g> {
            C2563a() {
            }

            public C2562g createFromParcel(Parcel parcel) {
                return new C2562g(parcel, null);
            }

            public C2562g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C2562g(parcel, classLoader);
            }

            public C2562g[] newArray(int i) {
                return new C2562g[i];
            }
        }

        public C2562g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7250h = parcel.readInt();
            this.f7251i = parcel.readInt() != 0;
        }

        public C2562g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f7250h);
            parcel.writeInt(this.f7251i ? 1 : 0);
        }
    }

    /* renamed from: a */
    private void m10346a(int i, boolean z) {
        if (C3379v.m13768D(this)) {
            Animator animator = this.f7221a0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!m10370q()) {
                i = 0;
                z = false;
            }
            m10347a(i, z, (List<Animator>) arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f7221a0 = animatorSet;
            animatorSet.addListener(new C2558c());
            this.f7221a0.start();
        }
    }

    /* renamed from: a */
    private void m10347a(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            String str = "alpha";
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, str, new float[]{1.0f});
            if (Math.abs(actionMenuView.getTranslationX() - ((float) mo7965a(actionMenuView, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, str, new float[]{0.0f});
                ofFloat2.addListener(new C2559d(actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10351a(FloatingActionButton floatingActionButton) {
        floatingActionButton.mo8737a((AnimatorListener) this.f7232l0);
        floatingActionButton.mo8744b((AnimatorListener) new C2560e());
        floatingActionButton.mo8740a(this.f7233m0);
    }

    /* renamed from: b */
    private void m10352b(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m10368o(), "translationX", new float[]{m10355c(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m10353b(ActionMenuView actionMenuView, int i, boolean z) {
        actionMenuView.setTranslationX((float) mo7965a(actionMenuView, i, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public float m10355c(int i) {
        boolean b = C2715j.m11289b(this);
        int i2 = 1;
        if (i != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - (this.f7218U + (b ? this.f7231k0 : this.f7230j0));
        if (b) {
            i2 = -1;
        }
        return (float) (measuredWidth * i2);
    }

    /* renamed from: d */
    private void m10358d(int i) {
        if (this.f7222b0 != i && C3379v.m13768D(this)) {
            Animator animator = this.f7220W;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f7223c0 == 1) {
                m10352b(i, arrayList);
            } else {
                mo7966a(i, (List<Animator>) arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f7220W = animatorSet;
            animatorSet.addListener(new C2555a());
            this.f7220W.start();
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.f7229i0;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return m10355c(this.f7222b0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().mo8004c();
    }

    /* access modifiers changed from: private */
    public int getLeftInset() {
        return this.f7231k0;
    }

    /* access modifiers changed from: private */
    public int getRightInset() {
        return this.f7230j0;
    }

    private C2564a getTopEdgeTreatment() {
        return (C2564a) this.f7219V.mo13083l().mo13110h();
    }

    /* renamed from: l */
    private void m10365l() {
        Animator animator = this.f7221a0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f7220W;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m10366m() {
        int i = this.f7225e0 - 1;
        this.f7225e0 = i;
        if (i == 0) {
            ArrayList<C2561f> arrayList = this.f7226f0;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C2561f) it.next()).mo7996a(this);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m10367n() {
        int i = this.f7225e0;
        this.f7225e0 = i + 1;
        if (i == 0) {
            ArrayList<C2561f> arrayList = this.f7226f0;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C2561f) it.next()).mo7997b(this);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public FloatingActionButton m10368o() {
        View p = m10369p();
        if (p instanceof FloatingActionButton) {
            return (FloatingActionButton) p;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public View m10369p() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).mo2057c((View) this)) {
            if (!(view instanceof FloatingActionButton)) {
                if (view instanceof ExtendedFloatingActionButton) {
                }
            }
            return view;
        }
        return null;
    }

    /* renamed from: q */
    private boolean m10370q() {
        FloatingActionButton o = m10368o();
        return o != null && o.mo8749d();
    }

    /* renamed from: r */
    private void m10371r() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!m10370q()) {
                m10353b(actionMenuView, 0, false);
            } else {
                m10353b(actionMenuView, this.f7222b0, this.f7227g0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m10372s() {
        getTopEdgeTreatment().mo8009e(getFabTranslationX());
        View p = m10369p();
        this.f7219V.mo13068c((!this.f7227g0 || !m10370q()) ? 0.0f : 1.0f);
        if (p != null) {
            p.setTranslationY(getFabTranslationY());
            p.setTranslationX(getFabTranslationX());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo7965a(ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean b = C2715j.m11289b(this);
        int measuredWidth = b ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof C0182e) && (((C0182e) childAt.getLayoutParams()).f218a & 8388615) == 8388611) {
                measuredWidth = b ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((b ? actionMenuView.getRight() : actionMenuView.getLeft()) + (b ? this.f7230j0 : -this.f7231k0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7966a(int i, List<Animator> list) {
        FloatingActionButton o = m10368o();
        if (o != null && !o.mo8748c()) {
            m10367n();
            o.mo8738a((C2671b) new C2556b(i));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo7967b(int i) {
        float f = (float) i;
        if (f == getTopEdgeTreatment().mo8010j()) {
            return false;
        }
        getTopEdgeTreatment().mo8007d(f);
        this.f7219V.invalidateSelf();
        return true;
    }

    public ColorStateList getBackgroundTint() {
        return this.f7219V.mo13084m();
    }

    public Behavior getBehavior() {
        if (this.f7228h0 == null) {
            this.f7228h0 = new Behavior();
        }
        return this.f7228h0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().mo8004c();
    }

    public int getFabAlignmentMode() {
        return this.f7222b0;
    }

    public int getFabAnimationMode() {
        return this.f7223c0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().mo8006d();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().mo8008e();
    }

    public boolean getHideOnScroll() {
        return this.f7224d0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4386h.m17877a((View) this, this.f7219V);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m10365l();
            m10372s();
        }
        m10371r();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2562g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2562g gVar = (C2562g) parcelable;
        super.onRestoreInstanceState(gVar.mo10880a());
        this.f7222b0 = gVar.f7250h;
        this.f7227g0 = gVar.f7251i;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C2562g gVar = new C2562g(super.onSaveInstanceState());
        gVar.f7250h = this.f7222b0;
        gVar.f7251i = this.f7227g0;
        return gVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C0371a.m1898a((Drawable) this.f7219V, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().mo8001a(f);
            this.f7219V.invalidateSelf();
            m10372s();
        }
    }

    public void setElevation(float f) {
        this.f7219V.mo13064b(f);
        getBehavior().mo7947a(this, this.f7219V.mo13082k() - this.f7219V.mo13081j());
    }

    public void setFabAlignmentMode(int i) {
        m10358d(i);
        m10346a(i, this.f7227g0);
        this.f7222b0 = i;
    }

    public void setFabAnimationMode(int i) {
        this.f7223c0 = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().mo8003b(f);
            this.f7219V.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().mo8005c(f);
            this.f7219V.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f7224d0 = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
