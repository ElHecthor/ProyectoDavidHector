package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0331b;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0332c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0335f;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C2701b;
import com.google.android.material.internal.C2714i;
import java.util.List;
import p071f.p097h.p108m.C3379v;
import p147g.p156d.p157a.p185c.C4372a;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4415k;
import p147g.p156d.p157a.p185c.C4416l;
import p147g.p156d.p157a.p185c.p187b0.C4389k;
import p147g.p156d.p157a.p185c.p189m.C4424h;

public class ExtendedFloatingActionButton extends MaterialButton implements C0331b {

    /* renamed from: E */
    private static final int f7664E = C4415k.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: F */
    static final Property<View, Float> f7665F;

    /* renamed from: G */
    static final Property<View, Float> f7666G;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final C2694f f7667A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final C2694f f7668B;

    /* renamed from: C */
    private final C0332c<ExtendedFloatingActionButton> f7669C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f7670D;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f7671w;

    /* renamed from: x */
    private final C2674a f7672x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final C2694f f7673y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final C2694f f7674z;

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends C0332c<T> {

        /* renamed from: a */
        private Rect f7675a;

        /* renamed from: b */
        private C2667h f7676b;

        /* renamed from: c */
        private C2667h f7677c;

        /* renamed from: d */
        private boolean f7678d;

        /* renamed from: e */
        private boolean f7679e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f7678d = false;
            this.f7679e = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4416l.ExtendedFloatingActionButton_Behavior_Layout);
            this.f7678d = obtainStyledAttributes.getBoolean(C4416l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f7679e = obtainStyledAttributes.getBoolean(C4416l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private static boolean m10988a(View view) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C0335f) {
                return ((C0335f) layoutParams).mo2138d() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m10989a(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f7678d || this.f7679e) && ((C0335f) extendedFloatingActionButton.getLayoutParams()).mo2137c() == view.getId();
        }

        /* renamed from: a */
        private boolean m10990a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m10989a(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f7675a == null) {
                this.f7675a = new Rect();
            }
            Rect rect = this.f7675a;
            C2701b.m11248a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                mo8711b(extendedFloatingActionButton);
            } else {
                mo8707a(extendedFloatingActionButton);
            }
            return true;
        }

        /* renamed from: b */
        private boolean m10991b(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m10989a(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((C0335f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                mo8711b(extendedFloatingActionButton);
            } else {
                mo8707a(extendedFloatingActionButton);
            }
            return true;
        }

        /* renamed from: a */
        public void mo2095a(C0335f fVar) {
            if (fVar.f1598h == 0) {
                fVar.f1598h = 80;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo8707a(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.m10975a(this.f7679e ? extendedFloatingActionButton.f7674z : extendedFloatingActionButton.f7667A, this.f7679e ? this.f7677c : this.f7676b);
        }

        /* renamed from: a */
        public boolean mo2106a(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List b = coordinatorLayout.mo2053b((View) extendedFloatingActionButton);
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) b.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m10988a(view) && m10991b(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (m10990a(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo2059c((View) extendedFloatingActionButton, i);
            return true;
        }

        /* renamed from: a */
        public boolean mo2108a(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.mo2108a(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        /* renamed from: a */
        public boolean mo2116b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m10990a(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
            } else if (m10988a(view)) {
                m10991b(view, extendedFloatingActionButton);
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo8711b(ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.m10975a(this.f7679e ? extendedFloatingActionButton.f7673y : extendedFloatingActionButton.f7668B, this.f7679e ? this.f7677c : this.f7676b);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    class C2660a implements C2669j {
        C2660a() {
        }

        /* renamed from: a */
        public int mo8712a() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        /* renamed from: b */
        public int mo8713b() {
            return ExtendedFloatingActionButton.this.getMeasuredWidth();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    class C2661b implements C2669j {
        C2661b() {
        }

        /* renamed from: a */
        public int mo8712a() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        /* renamed from: b */
        public int mo8713b() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    class C2662c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f7682a;

        /* renamed from: b */
        final /* synthetic */ C2694f f7683b;

        /* renamed from: c */
        final /* synthetic */ C2667h f7684c;

        C2662c(ExtendedFloatingActionButton extendedFloatingActionButton, C2694f fVar, C2667h hVar) {
            this.f7683b = fVar;
            this.f7684c = hVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f7682a = true;
            this.f7683b.mo8732b();
        }

        public void onAnimationEnd(Animator animator) {
            this.f7683b.mo8725a();
            if (!this.f7682a) {
                this.f7683b.mo8726a(this.f7684c);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f7683b.onAnimationStart(animator);
            this.f7682a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    static class C2663d extends Property<View, Float> {
        C2663d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    static class C2664e extends Property<View, Float> {
        C2664e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    class C2665f extends C2675b {

        /* renamed from: g */
        private final C2669j f7685g;

        /* renamed from: h */
        private final boolean f7686h;

        C2665f(C2674a aVar, C2669j jVar, boolean z) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.f7685g = jVar;
            this.f7686h = z;
        }

        /* renamed from: a */
        public void mo8725a() {
            super.mo8725a();
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
        }

        /* renamed from: a */
        public void mo8726a(C2667h hVar) {
            if (hVar != null) {
                if (this.f7686h) {
                    hVar.mo8733a(ExtendedFloatingActionButton.this);
                } else {
                    hVar.mo8736d(ExtendedFloatingActionButton.this);
                }
            }
        }

        /* renamed from: c */
        public int mo8727c() {
            return C4372a.mtrl_extended_fab_change_size_motion_spec;
        }

        /* renamed from: d */
        public void mo8728d() {
            ExtendedFloatingActionButton.this.f7670D = this.f7686h;
            LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                if (this.f7686h) {
                    ExtendedFloatingActionButton.this.measure(0, 0);
                }
                layoutParams.width = this.f7685g.mo8713b();
                layoutParams.height = this.f7685g.mo8712a();
                ExtendedFloatingActionButton.this.requestLayout();
            }
        }

        /* renamed from: f */
        public AnimatorSet mo8729f() {
            C4424h i = mo8826i();
            String str = "width";
            if (i.mo13174c(str)) {
                PropertyValuesHolder[] a = i.mo13172a(str);
                a[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getWidth(), (float) this.f7685g.mo8713b()});
                i.mo13171a(str, a);
            }
            String str2 = "height";
            if (i.mo13174c(str2)) {
                PropertyValuesHolder[] a2 = i.mo13172a(str2);
                a2[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getHeight(), (float) this.f7685g.mo8712a()});
                i.mo13171a(str2, a2);
            }
            return super.mo8823b(i);
        }

        /* renamed from: h */
        public boolean mo8730h() {
            return this.f7686h == ExtendedFloatingActionButton.this.f7670D || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.f7670D = this.f7686h;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g */
    class C2666g extends C2675b {

        /* renamed from: g */
        private boolean f7688g;

        public C2666g(C2674a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        /* renamed from: a */
        public void mo8725a() {
            super.mo8725a();
            ExtendedFloatingActionButton.this.f7671w = 0;
            if (!this.f7688g) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }

        /* renamed from: a */
        public void mo8726a(C2667h hVar) {
            if (hVar != null) {
                hVar.mo8734b(ExtendedFloatingActionButton.this);
            }
        }

        /* renamed from: b */
        public void mo8732b() {
            super.mo8732b();
            this.f7688g = true;
        }

        /* renamed from: c */
        public int mo8727c() {
            return C4372a.mtrl_extended_fab_hide_motion_spec;
        }

        /* renamed from: d */
        public void mo8728d() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        /* renamed from: h */
        public boolean mo8730h() {
            return ExtendedFloatingActionButton.this.m10980d();
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f7688g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f7671w = 1;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h */
    public static abstract class C2667h {
        /* renamed from: a */
        public abstract void mo8733a(ExtendedFloatingActionButton extendedFloatingActionButton);

        /* renamed from: b */
        public abstract void mo8734b(ExtendedFloatingActionButton extendedFloatingActionButton);

        /* renamed from: c */
        public abstract void mo8735c(ExtendedFloatingActionButton extendedFloatingActionButton);

        /* renamed from: d */
        public abstract void mo8736d(ExtendedFloatingActionButton extendedFloatingActionButton);
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i */
    class C2668i extends C2675b {
        public C2668i(C2674a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        /* renamed from: a */
        public void mo8725a() {
            super.mo8725a();
            ExtendedFloatingActionButton.this.f7671w = 0;
        }

        /* renamed from: a */
        public void mo8726a(C2667h hVar) {
            if (hVar != null) {
                hVar.mo8735c(ExtendedFloatingActionButton.this);
            }
        }

        /* renamed from: c */
        public int mo8727c() {
            return C4372a.mtrl_extended_fab_show_motion_spec;
        }

        /* renamed from: d */
        public void mo8728d() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        /* renamed from: h */
        public boolean mo8730h() {
            return ExtendedFloatingActionButton.this.m10981e();
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f7671w = 2;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j */
    interface C2669j {
        /* renamed from: a */
        int mo8712a();

        /* renamed from: b */
        int mo8713b();
    }

    static {
        Class<Float> cls = Float.class;
        f7665F = new C2663d(cls, "width");
        f7666G = new C2664e(cls, "height");
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4375b.extendedFloatingActionButtonStyle);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7671w = 0;
        C2674a aVar = new C2674a();
        this.f7672x = aVar;
        this.f7667A = new C2668i(aVar);
        this.f7668B = new C2666g(this.f7672x);
        this.f7670D = true;
        this.f7669C = new ExtendedFloatingActionButtonBehavior(context, attributeSet);
        TypedArray c = C2714i.m11283c(context, attributeSet, C4416l.ExtendedFloatingActionButton, i, f7664E, new int[0]);
        C4424h a = C4424h.m18018a(context, c, C4416l.ExtendedFloatingActionButton_showMotionSpec);
        C4424h a2 = C4424h.m18018a(context, c, C4416l.ExtendedFloatingActionButton_hideMotionSpec);
        C4424h a3 = C4424h.m18018a(context, c, C4416l.ExtendedFloatingActionButton_extendMotionSpec);
        C4424h a4 = C4424h.m18018a(context, c, C4416l.ExtendedFloatingActionButton_shrinkMotionSpec);
        C2674a aVar2 = new C2674a();
        this.f7674z = new C2665f(aVar2, new C2660a(), true);
        this.f7673y = new C2665f(aVar2, new C2661b(), false);
        this.f7667A.mo8822a(a);
        this.f7668B.mo8822a(a2);
        this.f7674z.mo8822a(a3);
        this.f7673y.mo8822a(a4);
        c.recycle();
        setShapeAppearanceModel(C4389k.m17887a(context, attributeSet, i, f7664E, C4389k.f11627m).mo13120a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10975a(C2694f fVar, C2667h hVar) {
        if (!fVar.mo8730h()) {
            if (!m10983f()) {
                fVar.mo8728d();
                fVar.mo8726a(hVar);
                return;
            }
            measure(0, 0);
            AnimatorSet f = fVar.mo8729f();
            f.addListener(new C2662c(this, fVar, hVar));
            for (AnimatorListener addListener : fVar.mo8825g()) {
                f.addListener(addListener);
            }
            f.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public boolean m10980d() {
        boolean z = false;
        if (getVisibility() == 0) {
            if (this.f7671w == 1) {
                z = true;
            }
            return z;
        }
        if (this.f7671w != 2) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m10981e() {
        boolean z = false;
        if (getVisibility() != 0) {
            if (this.f7671w == 2) {
                z = true;
            }
            return z;
        }
        if (this.f7671w != 1) {
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    private boolean m10983f() {
        return C3379v.m13768D(this) && !isInEditMode();
    }

    /* renamed from: b */
    public void mo8691b() {
        m10975a(this.f7668B, (C2667h) null);
    }

    /* renamed from: c */
    public void mo8692c() {
        m10975a(this.f7667A, (C2667h) null);
    }

    public C0332c<ExtendedFloatingActionButton> getBehavior() {
        return this.f7669C;
    }

    /* access modifiers changed from: 0000 */
    public int getCollapsedSize() {
        return (Math.min(C3379v.m13834u(this), C3379v.m13833t(this)) * 2) + getIconSize();
    }

    public C4424h getExtendMotionSpec() {
        return this.f7674z.mo8824e();
    }

    public C4424h getHideMotionSpec() {
        return this.f7668B.mo8824e();
    }

    public C4424h getShowMotionSpec() {
        return this.f7667A.mo8824e();
    }

    public C4424h getShrinkMotionSpec() {
        return this.f7673y.mo8824e();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7670D && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f7670D = false;
            this.f7673y.mo8728d();
        }
    }

    public void setExtendMotionSpec(C4424h hVar) {
        this.f7674z.mo8822a(hVar);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C4424h.m18017a(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f7670D != z) {
            C2694f fVar = z ? this.f7674z : this.f7673y;
            if (!fVar.mo8730h()) {
                fVar.mo8728d();
            }
        }
    }

    public void setHideMotionSpec(C4424h hVar) {
        this.f7668B.mo8822a(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C4424h.m18017a(getContext(), i));
    }

    public void setShowMotionSpec(C4424h hVar) {
        this.f7667A.mo8822a(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C4424h.m18017a(getContext(), i));
    }

    public void setShrinkMotionSpec(C4424h hVar) {
        this.f7673y.mo8822a(hVar);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C4424h.m18017a(getContext(), i));
    }
}
