package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.widget.C0283v0;
import androidx.core.graphics.drawable.C0371a;
import androidx.core.widget.C0391i;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.C2714i;
import com.google.android.material.internal.C2715j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p071f.p072a.C3102j;
import p071f.p072a.p073k.p074a.C3103a;
import p071f.p097h.p107l.C3318e;
import p071f.p097h.p107l.C3319f;
import p071f.p097h.p107l.C3320g;
import p071f.p097h.p108m.C3323a;
import p071f.p097h.p108m.C3364g;
import p071f.p097h.p108m.C3377t;
import p071f.p097h.p108m.C3379v;
import p071f.p097h.p108m.p109f0.C3347c;
import p071f.p097h.p108m.p109f0.C3347c.C3348a;
import p071f.p097h.p108m.p109f0.C3347c.C3349b;
import p071f.p097h.p108m.p109f0.C3347c.C3350c;
import p071f.p144y.p145a.C3658a;
import p071f.p144y.p145a.C3659b;
import p071f.p144y.p145a.C3659b.C3664e;
import p071f.p144y.p145a.C3659b.C3668i;
import p071f.p144y.p145a.C3659b.C3669j;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4408d;
import p147g.p156d.p157a.p185c.C4412h;
import p147g.p156d.p157a.p185c.C4415k;
import p147g.p156d.p157a.p185c.C4416l;
import p147g.p156d.p157a.p185c.p187b0.C4382g;
import p147g.p156d.p157a.p185c.p187b0.C4386h;
import p147g.p156d.p157a.p185c.p189m.C4417a;
import p147g.p156d.p157a.p185c.p190n.C4428a;
import p147g.p156d.p157a.p185c.p190n.C4431b;
import p147g.p156d.p157a.p185c.p202y.C4459c;

@C3664e
public class TabLayout extends HorizontalScrollView {

    /* renamed from: T */
    private static final C3318e<C2740i> f7928T = new C3320g(16);

    /* renamed from: A */
    private int f7929A;

    /* renamed from: B */
    int f7930B;

    /* renamed from: C */
    int f7931C;

    /* renamed from: D */
    int f7932D;

    /* renamed from: E */
    int f7933E;

    /* renamed from: F */
    boolean f7934F;

    /* renamed from: G */
    boolean f7935G;

    /* renamed from: H */
    boolean f7936H;

    /* renamed from: I */
    private final ArrayList<C2735f> f7937I;

    /* renamed from: J */
    private C2735f f7938J;

    /* renamed from: K */
    private final HashMap<C2734e<? extends C2740i>, C2735f> f7939K;

    /* renamed from: L */
    private ValueAnimator f7940L;

    /* renamed from: M */
    C3659b f7941M;

    /* renamed from: N */
    private C3658a f7942N;

    /* renamed from: O */
    private DataSetObserver f7943O;

    /* renamed from: P */
    private C2741j f7944P;

    /* renamed from: Q */
    private C2733d f7945Q;

    /* renamed from: R */
    private boolean f7946R;

    /* renamed from: S */
    private final C3318e<C2742k> f7947S;

    /* renamed from: f */
    private final ArrayList<C2740i> f7948f;

    /* renamed from: g */
    private C2740i f7949g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final RectF f7950h;

    /* renamed from: i */
    final C2737h f7951i;

    /* renamed from: j */
    int f7952j;

    /* renamed from: k */
    int f7953k;

    /* renamed from: l */
    int f7954l;

    /* renamed from: m */
    int f7955m;

    /* renamed from: n */
    int f7956n;

    /* renamed from: o */
    ColorStateList f7957o;

    /* renamed from: p */
    ColorStateList f7958p;

    /* renamed from: q */
    ColorStateList f7959q;

    /* renamed from: r */
    Drawable f7960r;

    /* renamed from: s */
    Mode f7961s;

    /* renamed from: t */
    float f7962t;

    /* renamed from: u */
    float f7963u;

    /* renamed from: v */
    final int f7964v;

    /* renamed from: w */
    int f7965w;

    /* renamed from: x */
    private final int f7966x;

    /* renamed from: y */
    private final int f7967y;

    /* renamed from: z */
    private final int f7968z;

    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    class C2730a extends C3323a {
        C2730a() {
        }

        /* renamed from: a */
        public void mo2349a(View view, C3347c cVar) {
            super.mo2349a(view, cVar);
            cVar.mo10747a((Object) C3349b.m13706a(1, TabLayout.this.getTabCount(), false, 1));
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    class C2731b implements C2735f {

        /* renamed from: a */
        final /* synthetic */ C2734e f7970a;

        C2731b(TabLayout tabLayout, C2734e eVar) {
            this.f7970a = eVar;
        }

        /* renamed from: a */
        public void mo9103a(C2740i iVar) {
            this.f7970a.mo9109a(iVar);
        }

        /* renamed from: b */
        public void mo9104b(C2740i iVar) {
            this.f7970a.mo9110b(iVar);
        }

        /* renamed from: c */
        public void mo9105c(C2740i iVar) {
            this.f7970a.mo9111c(iVar);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    class C2732c implements AnimatorUpdateListener {
        C2732c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    private class C2733d implements C3668i {

        /* renamed from: a */
        private boolean f7972a;

        C2733d() {
        }

        /* renamed from: a */
        public void mo9107a(C3659b bVar, C3658a aVar, C3658a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f7941M == bVar) {
                tabLayout.mo9050a(aVar2, this.f7972a);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9108a(boolean z) {
            this.f7972a = z;
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    public interface C2734e<T extends C2740i> {
        /* renamed from: a */
        void mo9109a(T t);

        /* renamed from: b */
        void mo9110b(T t);

        /* renamed from: c */
        void mo9111c(T t);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    public interface C2735f {
        /* renamed from: a */
        void mo9103a(C2740i iVar);

        /* renamed from: b */
        void mo9104b(C2740i iVar);

        /* renamed from: c */
        void mo9105c(C2740i iVar);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    private class C2736g extends DataSetObserver {
        C2736g() {
        }

        public void onChanged() {
            TabLayout.this.mo9063d();
        }

        public void onInvalidated() {
            TabLayout.this.mo9063d();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    class C2737h extends LinearLayout {

        /* renamed from: f */
        private int f7975f;

        /* renamed from: g */
        private final Paint f7976g;

        /* renamed from: h */
        private final GradientDrawable f7977h;

        /* renamed from: i */
        int f7978i = -1;

        /* renamed from: j */
        float f7979j;

        /* renamed from: k */
        private int f7980k = -1;

        /* renamed from: l */
        int f7981l = -1;

        /* renamed from: m */
        int f7982m = -1;

        /* renamed from: n */
        ValueAnimator f7983n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public int f7984o = -1;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public int f7985p = -1;

        /* renamed from: com.google.android.material.tabs.TabLayout$h$a */
        class C2738a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ int f7987a;

            /* renamed from: b */
            final /* synthetic */ int f7988b;

            C2738a(int i, int i2) {
                this.f7987a = i;
                this.f7988b = i2;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                C2737h hVar = C2737h.this;
                hVar.mo9119b(C4417a.m18006a(hVar.f7984o, this.f7987a, animatedFraction), C4417a.m18006a(C2737h.this.f7985p, this.f7988b, animatedFraction));
            }
        }

        /* renamed from: com.google.android.material.tabs.TabLayout$h$b */
        class C2739b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ int f7990a;

            C2739b(int i) {
                this.f7990a = i;
            }

            public void onAnimationEnd(Animator animator) {
                C2737h hVar = C2737h.this;
                hVar.f7978i = this.f7990a;
                hVar.f7979j = 0.0f;
            }

            public void onAnimationStart(Animator animator) {
                C2737h.this.f7978i = this.f7990a;
            }
        }

        C2737h(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f7976g = new Paint();
            this.f7977h = new GradientDrawable();
        }

        /* renamed from: a */
        private void m11364a(C2742k kVar, RectF rectF) {
            int a = kVar.getContentWidth();
            int a2 = (int) C2715j.m11285a(getContext(), 24);
            if (a < a2) {
                a = a2;
            }
            int left = (kVar.getLeft() + kVar.getRight()) / 2;
            int i = a / 2;
            rectF.set((float) (left - i), 0.0f, (float) (left + i), 0.0f);
        }

        /* renamed from: a */
        private void m11365a(boolean z, int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt == null) {
                m11367b();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            TabLayout tabLayout = TabLayout.this;
            if (!tabLayout.f7935G && (childAt instanceof C2742k)) {
                m11364a((C2742k) childAt, tabLayout.f7950h);
                left = (int) TabLayout.this.f7950h.left;
                right = (int) TabLayout.this.f7950h.right;
            }
            int i3 = this.f7981l;
            int i4 = this.f7982m;
            if (i3 != left || i4 != right) {
                if (z) {
                    this.f7984o = i3;
                    this.f7985p = i4;
                }
                C2738a aVar = new C2738a(left, right);
                if (z) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.f7983n = valueAnimator;
                    valueAnimator.setInterpolator(C4417a.f11713b);
                    valueAnimator.setDuration((long) i2);
                    valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                    valueAnimator.addUpdateListener(aVar);
                    valueAnimator.addListener(new C2739b(i));
                    valueAnimator.start();
                } else {
                    this.f7983n.removeAllUpdateListeners();
                    this.f7983n.addUpdateListener(aVar);
                }
            }
        }

        /* renamed from: b */
        private void m11367b() {
            int i;
            int i2;
            View childAt = getChildAt(this.f7978i);
            if (childAt == null || childAt.getWidth() <= 0) {
                i2 = -1;
                i = -1;
            } else {
                i2 = childAt.getLeft();
                i = childAt.getRight();
                TabLayout tabLayout = TabLayout.this;
                if (!tabLayout.f7935G && (childAt instanceof C2742k)) {
                    m11364a((C2742k) childAt, tabLayout.f7950h);
                    i2 = (int) TabLayout.this.f7950h.left;
                    i = (int) TabLayout.this.f7950h.right;
                }
                if (this.f7979j > 0.0f && this.f7978i < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f7978i + 1);
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    TabLayout tabLayout2 = TabLayout.this;
                    if (!tabLayout2.f7935G && (childAt2 instanceof C2742k)) {
                        m11364a((C2742k) childAt2, tabLayout2.f7950h);
                        left = (int) TabLayout.this.f7950h.left;
                        right = (int) TabLayout.this.f7950h.right;
                    }
                    float f = this.f7979j;
                    i2 = (int) ((((float) left) * f) + ((1.0f - f) * ((float) i2)));
                    i = (int) ((((float) right) * f) + ((1.0f - f) * ((float) i)));
                }
            }
            mo9119b(i2, i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9114a(int i) {
            if (this.f7976g.getColor() != i) {
                this.f7976g.setColor(i);
                C3379v.m13772H(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9115a(int i, float f) {
            ValueAnimator valueAnimator = this.f7983n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f7983n.cancel();
            }
            this.f7978i = i;
            this.f7979j = f;
            m11367b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9116a(int i, int i2) {
            ValueAnimator valueAnimator = this.f7983n;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f7983n.cancel();
            }
            m11365a(true, i, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo9117a() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo9118b(int i) {
            if (this.f7975f != i) {
                this.f7975f = i;
                C3379v.m13772H(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo9119b(int i, int i2) {
            if (i != this.f7981l || i2 != this.f7982m) {
                this.f7981l = i;
                this.f7982m = i2;
                C3379v.m13772H(this);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void draw(android.graphics.Canvas r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r0 = r0.f7960r
                r1 = 0
                if (r0 == 0) goto L_0x000c
                int r0 = r0.getIntrinsicHeight()
                goto L_0x000d
            L_0x000c:
                r0 = 0
            L_0x000d:
                int r2 = r5.f7975f
                if (r2 < 0) goto L_0x0012
                r0 = r2
            L_0x0012:
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                int r2 = r2.f7932D
                if (r2 == 0) goto L_0x0031
                r3 = 1
                r4 = 2
                if (r2 == r3) goto L_0x0023
                if (r2 == r4) goto L_0x003a
                r0 = 3
                if (r2 == r0) goto L_0x0036
                r0 = 0
                goto L_0x003a
            L_0x0023:
                int r1 = r5.getHeight()
                int r1 = r1 - r0
                int r1 = r1 / r4
                int r2 = r5.getHeight()
                int r2 = r2 + r0
                int r0 = r2 / 2
                goto L_0x003a
            L_0x0031:
                int r1 = r5.getHeight()
                int r1 = r1 - r0
            L_0x0036:
                int r0 = r5.getHeight()
            L_0x003a:
                int r2 = r5.f7981l
                if (r2 < 0) goto L_0x0070
                int r3 = r5.f7982m
                if (r3 <= r2) goto L_0x0070
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r2 = r2.f7960r
                if (r2 == 0) goto L_0x0049
                goto L_0x004b
            L_0x0049:
                android.graphics.drawable.GradientDrawable r2 = r5.f7977h
            L_0x004b:
                android.graphics.drawable.Drawable r2 = androidx.core.graphics.drawable.C0371a.m1913i(r2)
                int r3 = r5.f7981l
                int r4 = r5.f7982m
                r2.setBounds(r3, r1, r4, r0)
                android.graphics.Paint r0 = r5.f7976g
                if (r0 == 0) goto L_0x006d
                int r1 = android.os.Build.VERSION.SDK_INT
                r3 = 21
                int r0 = r0.getColor()
                if (r1 != r3) goto L_0x006a
                android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
                r2.setColorFilter(r0, r1)
                goto L_0x006d
            L_0x006a:
                androidx.core.graphics.drawable.C0371a.m1906b(r2, r0)
            L_0x006d:
                r2.draw(r6)
            L_0x0070:
                super.draw(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.C2737h.draw(android.graphics.Canvas):void");
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f7983n;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m11367b();
            } else {
                m11365a(false, this.f7978i, -1);
            }
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.f7930B == 1 || tabLayout.f7933E == 2) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (((int) C2715j.m11285a(getContext(), 16)) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.f7930B = 0;
                            tabLayout2.mo9052a(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (VERSION.SDK_INT < 23 && this.f7980k != i) {
                requestLayout();
                this.f7980k = i;
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    public static class C2740i {

        /* renamed from: a */
        private Drawable f7992a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public CharSequence f7993b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public CharSequence f7994c;

        /* renamed from: d */
        private int f7995d = -1;

        /* renamed from: e */
        private View f7996e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f7997f = 1;

        /* renamed from: g */
        public TabLayout f7998g;

        /* renamed from: h */
        public C2742k f7999h;

        /* renamed from: a */
        public View mo9127a() {
            return this.f7996e;
        }

        /* renamed from: a */
        public C2740i mo9128a(int i) {
            mo9130a(LayoutInflater.from(this.f7999h.getContext()).inflate(i, this.f7999h, false));
            return this;
        }

        /* renamed from: a */
        public C2740i mo9129a(Drawable drawable) {
            this.f7992a = drawable;
            TabLayout tabLayout = this.f7998g;
            if (tabLayout.f7930B == 1 || tabLayout.f7933E == 2) {
                this.f7998g.mo9052a(true);
            }
            mo9142i();
            if (C4431b.f11763a && this.f7999h.m11413e() && this.f7999h.f8007j.isVisible()) {
                this.f7999h.invalidate();
            }
            return this;
        }

        /* renamed from: a */
        public C2740i mo9130a(View view) {
            this.f7996e = view;
            mo9142i();
            return this;
        }

        /* renamed from: a */
        public C2740i mo9131a(CharSequence charSequence) {
            this.f7994c = charSequence;
            mo9142i();
            return this;
        }

        /* renamed from: b */
        public Drawable mo9132b() {
            return this.f7992a;
        }

        /* renamed from: b */
        public C2740i mo9133b(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f7994c) && !TextUtils.isEmpty(charSequence)) {
                this.f7999h.setContentDescription(charSequence);
            }
            this.f7993b = charSequence;
            mo9142i();
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo9134b(int i) {
            this.f7995d = i;
        }

        /* renamed from: c */
        public int mo9135c() {
            return this.f7995d;
        }

        /* renamed from: c */
        public C2740i mo9136c(int i) {
            TabLayout tabLayout = this.f7998g;
            if (tabLayout != null) {
                mo9133b(tabLayout.getResources().getText(i));
                return this;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: d */
        public int mo9137d() {
            return this.f7997f;
        }

        /* renamed from: e */
        public CharSequence mo9138e() {
            return this.f7993b;
        }

        /* renamed from: f */
        public boolean mo9139f() {
            TabLayout tabLayout = this.f7998g;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f7995d;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo9140g() {
            this.f7998g = null;
            this.f7999h = null;
            this.f7992a = null;
            this.f7993b = null;
            this.f7994c = null;
            this.f7995d = -1;
            this.f7996e = null;
        }

        /* renamed from: h */
        public void mo9141h() {
            TabLayout tabLayout = this.f7998g;
            if (tabLayout != null) {
                tabLayout.mo9062c(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo9142i() {
            C2742k kVar = this.f7999h;
            if (kVar != null) {
                kVar.mo9148b();
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$j */
    public static class C2741j implements C3669j {

        /* renamed from: a */
        private final WeakReference<TabLayout> f8000a;

        /* renamed from: b */
        private int f8001b;

        /* renamed from: c */
        private int f8002c;

        public C2741j(TabLayout tabLayout) {
            this.f8000a = new WeakReference<>(tabLayout);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9143a() {
            this.f8002c = 0;
            this.f8001b = 0;
        }

        /* renamed from: a */
        public void mo9144a(int i) {
            this.f8001b = this.f8002c;
            this.f8002c = i;
        }

        /* renamed from: a */
        public void mo9145a(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.f8000a.get();
            if (tabLayout != null) {
                boolean z = false;
                boolean z2 = this.f8002c != 2 || this.f8001b == 1;
                if (!(this.f8002c == 2 && this.f8001b == 0)) {
                    z = true;
                }
                tabLayout.mo9045a(i, f, z2, z);
            }
        }

        /* renamed from: b */
        public void mo9146b(int i) {
            TabLayout tabLayout = (TabLayout) this.f8000a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f8002c;
                tabLayout.mo9059b(tabLayout.mo9042a(i), i2 == 0 || (i2 == 2 && this.f8001b == 0));
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$k */
    public final class C2742k extends LinearLayout {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C2740i f8003f;

        /* renamed from: g */
        private TextView f8004g;

        /* renamed from: h */
        private ImageView f8005h;

        /* renamed from: i */
        private View f8006i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C4428a f8007j;

        /* renamed from: k */
        private View f8008k;

        /* renamed from: l */
        private TextView f8009l;

        /* renamed from: m */
        private ImageView f8010m;

        /* renamed from: n */
        private Drawable f8011n;

        /* renamed from: o */
        private int f8012o = 2;

        /* renamed from: com.google.android.material.tabs.TabLayout$k$a */
        class C2743a extends C3323a {
            C2743a(TabLayout tabLayout) {
            }

            /* renamed from: a */
            public void mo2349a(View view, C3347c cVar) {
                super.mo2349a(view, cVar);
                cVar.mo10745a((CharSequence) "androidx.appcompat.app.ActionBar.Tab");
                if (C2742k.this.f8007j != null && C2742k.this.f8007j.isVisible()) {
                    CharSequence contentDescription = C2742k.this.getContentDescription();
                    StringBuilder sb = new StringBuilder();
                    sb.append(contentDescription);
                    sb.append(", ");
                    sb.append(C2742k.this.f8007j.mo13192b());
                    cVar.mo10754b((CharSequence) sb.toString());
                }
                cVar.mo10755b((Object) C3350c.m13707a(0, 1, ((C2742k) view).f8003f.mo9135c(), 1, false, C2742k.this.isSelected()));
                if (C2742k.this.isSelected()) {
                    cVar.mo10766d(false);
                    cVar.mo10757b(C3348a.f9556e);
                }
            }

            /* renamed from: b */
            public void mo2351b(View view, AccessibilityEvent accessibilityEvent) {
                super.mo2351b(view, accessibilityEvent);
                accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar.Tab");
            }
        }

        /* renamed from: com.google.android.material.tabs.TabLayout$k$b */
        class C2744b implements OnLayoutChangeListener {

            /* renamed from: f */
            final /* synthetic */ View f8015f;

            C2744b(View view) {
                this.f8015f = view;
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.f8015f.getVisibility() == 0) {
                    C2742k.this.m11412d(this.f8015f);
                }
            }
        }

        public C2742k(Context context) {
            super(context);
            m11399a(context);
            C3379v.m13783a(this, TabLayout.this.f7952j, TabLayout.this.f7953k, TabLayout.this.f7954l, TabLayout.this.f7955m);
            setGravity(17);
            setOrientation(TabLayout.this.f7934F ^ true ? 1 : 0);
            setClickable(true);
            C3379v.m13793a((View) this, C3377t.m13763a(getContext(), 1002));
            C3379v.m13788a((View) this, (C3323a) new C2743a(TabLayout.this));
        }

        /* renamed from: a */
        private float m11397a(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        /* JADX WARNING: type inference failed for: r7v2, types: [android.graphics.drawable.Drawable] */
        /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: type inference failed for: r7v6, types: [android.graphics.drawable.Drawable] */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m11399a(android.content.Context r7) {
            /*
                r6 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.f7964v
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r7 = p071f.p072a.p073k.p074a.C3103a.m12557c(r7, r0)
                r6.f8011n = r7
                if (r7 == 0) goto L_0x0021
                boolean r7 = r7.isStateful()
                if (r7 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r7 = r6.f8011n
                int[] r0 = r6.getDrawableState()
                r7.setState(r0)
                goto L_0x0021
            L_0x001f:
                r6.f8011n = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
                r7.<init>()
                r0 = 0
                r7.setColor(r0)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f7959q
                if (r2 == 0) goto L_0x0078
                android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
                r2.<init>()
                r3 = 925353388(0x3727c5ac, float:1.0E-5)
                r2.setCornerRadius(r3)
                r3 = -1
                r2.setColor(r3)
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r3 = r3.f7959q
                android.content.res.ColorStateList r3 = p147g.p156d.p157a.p185c.p203z.C4468b.m18199a(r3)
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 21
                if (r4 < r5) goto L_0x0063
                android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.f7936H
                if (r4 == 0) goto L_0x0056
                r7 = r1
            L_0x0056:
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.f7936H
                if (r4 == 0) goto L_0x005d
                goto L_0x005e
            L_0x005d:
                r1 = r2
            L_0x005e:
                r0.<init>(r3, r7, r1)
                r7 = r0
                goto L_0x0078
            L_0x0063:
                android.graphics.drawable.Drawable r1 = androidx.core.graphics.drawable.C0371a.m1913i(r2)
                androidx.core.graphics.drawable.C0371a.m1898a(r1, r3)
                android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
                r3 = 2
                android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r3]
                r3[r0] = r7
                r7 = 1
                r3[r7] = r1
                r2.<init>(r3)
                r7 = r2
            L_0x0078:
                p071f.p097h.p108m.C3379v.m13787a(r6, r7)
                com.google.android.material.tabs.TabLayout r7 = com.google.android.material.tabs.TabLayout.this
                r7.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.C2742k.m11399a(android.content.Context):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m11400a(Canvas canvas) {
            Drawable drawable = this.f8011n;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f8011n.draw(canvas);
            }
        }

        /* renamed from: a */
        private void m11401a(View view) {
            if (view != null) {
                view.addOnLayoutChangeListener(new C2744b(view));
            }
        }

        /* renamed from: a */
        private void m11402a(TextView textView, ImageView imageView) {
            C2740i iVar = this.f8003f;
            CharSequence charSequence = null;
            Drawable mutate = (iVar == null || iVar.mo9132b() == null) ? null : C0371a.m1913i(this.f8003f.mo9132b()).mutate();
            C2740i iVar2 = this.f8003f;
            CharSequence e = iVar2 != null ? iVar2.mo9138e() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(e);
            if (textView != null) {
                if (z) {
                    textView.setText(e);
                    if (this.f8003f.f7997f == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText(null);
                }
            }
            if (imageView != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) imageView.getLayoutParams();
                int a = (!z || imageView.getVisibility() != 0) ? 0 : (int) C2715j.m11285a(getContext(), 8);
                if (TabLayout.this.f7934F) {
                    if (a != C3364g.m13718a(marginLayoutParams)) {
                        C3364g.m13719a(marginLayoutParams, a);
                        marginLayoutParams.bottomMargin = 0;
                    }
                } else if (a != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = a;
                    C3364g.m13719a(marginLayoutParams, 0);
                }
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
            C2740i iVar3 = this.f8003f;
            CharSequence a2 = iVar3 != null ? iVar3.f7994c : null;
            if (!z) {
                charSequence = a2;
            }
            C0283v0.m1404a(this, charSequence);
        }

        /* renamed from: b */
        private FrameLayout m11406b(View view) {
            FrameLayout frameLayout = null;
            if (view != this.f8005h && view != this.f8004g) {
                return null;
            }
            if (C4431b.f11763a) {
                frameLayout = (FrameLayout) view.getParent();
            }
            return frameLayout;
        }

        /* renamed from: c */
        private void m11409c(View view) {
            if (m11413e() && view != null) {
                setClipChildren(false);
                setClipToPadding(false);
                C4431b.m18088a(this.f8007j, view, m11406b(view));
                this.f8006i = view;
            }
        }

        /* renamed from: d */
        private FrameLayout m11410d() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m11412d(View view) {
            if (m11413e() && view == this.f8006i) {
                C4431b.m18090c(this.f8007j, view, m11406b(view));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public boolean m11413e() {
            return this.f8007j != null;
        }

        /* renamed from: f */
        private void m11414f() {
            ViewGroup viewGroup;
            if (C4431b.f11763a) {
                ViewGroup d = m11410d();
                addView(d, 0);
                viewGroup = d;
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C4412h.design_layout_tab_icon, viewGroup, false);
            this.f8005h = imageView;
            viewGroup.addView(imageView, 0);
        }

        /* renamed from: g */
        private void m11415g() {
            ViewGroup viewGroup;
            if (C4431b.f11763a) {
                ViewGroup d = m11410d();
                addView(d);
                viewGroup = d;
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C4412h.design_layout_tab_text, viewGroup, false);
            this.f8004g = textView;
            viewGroup.addView(textView);
        }

        private C4428a getBadge() {
            return this.f8007j;
        }

        /* access modifiers changed from: private */
        public int getContentWidth() {
            View[] viewArr = {this.f8004g, this.f8005h, this.f8008k};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        private C4428a getOrCreateBadge() {
            if (this.f8007j == null) {
                this.f8007j = C4428a.m18041a(getContext());
            }
            m11417i();
            C4428a aVar = this.f8007j;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* renamed from: h */
        private void m11416h() {
            if (m11413e() && this.f8006i != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C4428a aVar = this.f8007j;
                View view = this.f8006i;
                C4431b.m18089b(aVar, view, m11406b(view));
                this.f8006i = null;
            }
        }

        /* renamed from: i */
        private void m11417i() {
            View view;
            View view2;
            if (m11413e()) {
                if (this.f8008k == null) {
                    if (this.f8005h != null) {
                        C2740i iVar = this.f8003f;
                        if (!(iVar == null || iVar.mo9132b() == null)) {
                            View view3 = this.f8006i;
                            view = this.f8005h;
                            if (view3 != view) {
                                m11416h();
                                view2 = this.f8005h;
                                m11409c(view2);
                            }
                            m11412d(view);
                        }
                    }
                    if (this.f8004g != null) {
                        C2740i iVar2 = this.f8003f;
                        if (iVar2 != null && iVar2.mo9137d() == 1) {
                            View view4 = this.f8006i;
                            view = this.f8004g;
                            if (view4 != view) {
                                m11416h();
                                view2 = this.f8004g;
                                m11409c(view2);
                            }
                            m11412d(view);
                        }
                    }
                }
                m11416h();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9147a() {
            setTab(null);
            setSelected(false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo9148b() {
            C2740i iVar = this.f8003f;
            Drawable drawable = null;
            View a = iVar != null ? iVar.mo9127a() : null;
            if (a != null) {
                ViewParent parent = a.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(a);
                    }
                    addView(a);
                }
                this.f8008k = a;
                TextView textView = this.f8004g;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f8005h;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f8005h.setImageDrawable(null);
                }
                TextView textView2 = (TextView) a.findViewById(16908308);
                this.f8009l = textView2;
                if (textView2 != null) {
                    this.f8012o = C0391i.m2038d(textView2);
                }
                this.f8010m = (ImageView) a.findViewById(16908294);
            } else {
                View view = this.f8008k;
                if (view != null) {
                    removeView(view);
                    this.f8008k = null;
                }
                this.f8009l = null;
                this.f8010m = null;
            }
            if (this.f8008k == null) {
                if (this.f8005h == null) {
                    m11414f();
                }
                if (!(iVar == null || iVar.mo9132b() == null)) {
                    drawable = C0371a.m1913i(iVar.mo9132b()).mutate();
                }
                if (drawable != null) {
                    C0371a.m1898a(drawable, TabLayout.this.f7958p);
                    Mode mode = TabLayout.this.f7961s;
                    if (mode != null) {
                        C0371a.m1901a(drawable, mode);
                    }
                }
                if (this.f8004g == null) {
                    m11415g();
                    this.f8012o = C0391i.m2038d(this.f8004g);
                }
                C0391i.m2039d(this.f8004g, TabLayout.this.f7956n);
                ColorStateList colorStateList = TabLayout.this.f7957o;
                if (colorStateList != null) {
                    this.f8004g.setTextColor(colorStateList);
                }
                m11402a(this.f8004g, this.f8005h);
                m11417i();
                m11401a((View) this.f8005h);
                m11401a((View) this.f8004g);
            } else if (!(this.f8009l == null && this.f8010m == null)) {
                m11402a(this.f8009l, this.f8010m);
            }
            if (iVar != null && !TextUtils.isEmpty(iVar.f7994c)) {
                setContentDescription(iVar.f7994c);
            }
            setSelected(iVar != null && iVar.mo9139f());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo9149c() {
            ImageView imageView;
            TextView textView;
            setOrientation(TabLayout.this.f7934F ^ true ? 1 : 0);
            if (this.f8009l == null && this.f8010m == null) {
                textView = this.f8004g;
                imageView = this.f8005h;
            } else {
                textView = this.f8009l;
                imageView = this.f8010m;
            }
            m11402a(textView, imageView);
        }

        /* access modifiers changed from: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f8011n;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f8011n.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public C2740i getTab() {
            return this.f8003f;
        }

        public void onMeasure(int i, int i2) {
            int size = MeasureSpec.getSize(i);
            int mode = MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = MeasureSpec.makeMeasureSpec(TabLayout.this.f7965w, RecyclerView.UNDEFINED_DURATION);
            }
            super.onMeasure(i, i2);
            if (this.f8004g != null) {
                float f = TabLayout.this.f7962t;
                int i3 = this.f8012o;
                ImageView imageView = this.f8005h;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f8004g;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f7963u;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f8004g.getTextSize();
                int lineCount = this.f8004g.getLineCount();
                int d = C0391i.m2038d(this.f8004g);
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (d >= 0 && i3 != d)) {
                    if (TabLayout.this.f7933E == 1 && i4 > 0 && lineCount == 1) {
                        Layout layout = this.f8004g.getLayout();
                        if (layout == null || m11397a(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            z = false;
                        }
                    }
                    if (z) {
                        this.f8004g.setTextSize(0, f);
                        this.f8004g.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f8003f == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f8003f.mo9141h();
            return true;
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z && VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f8004g;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f8005h;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f8008k;
            if (view != null) {
                view.setSelected(z);
            }
        }

        /* access modifiers changed from: 0000 */
        public void setTab(C2740i iVar) {
            if (iVar != this.f8003f) {
                this.f8003f = iVar;
                mo9148b();
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$l */
    public static class C2745l implements C2735f {

        /* renamed from: a */
        private final C3659b f8017a;

        public C2745l(C3659b bVar) {
            this.f8017a = bVar;
        }

        /* renamed from: a */
        public void mo9103a(C2740i iVar) {
        }

        /* renamed from: b */
        public void mo9104b(C2740i iVar) {
        }

        /* renamed from: c */
        public void mo9105c(C2740i iVar) {
            this.f8017a.setCurrentItem(iVar.mo9135c());
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4375b.tabStyle);
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7948f = new ArrayList<>();
        this.f7950h = new RectF();
        this.f7965w = Integer.MAX_VALUE;
        this.f7937I = new ArrayList<>();
        this.f7939K = new HashMap<>();
        this.f7947S = new C3319f(12);
        setHorizontalScrollBarEnabled(false);
        C2737h hVar = new C2737h(context);
        this.f7951i = hVar;
        super.addView(hVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray c = C2714i.m11283c(context, attributeSet, C4416l.TabLayout, i, C4415k.Widget_Design_TabLayout, C4416l.TabLayout_tabTextAppearance);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C4382g gVar = new C4382g();
            gVar.mo13059a(ColorStateList.valueOf(colorDrawable.getColor()));
            gVar.mo13058a(context);
            gVar.mo13064b(C3379v.m13825l(this));
            C3379v.m13787a((View) this, (Drawable) gVar);
        }
        this.f7951i.mo9118b(c.getDimensionPixelSize(C4416l.TabLayout_tabIndicatorHeight, -1));
        this.f7951i.mo9114a(c.getColor(C4416l.TabLayout_tabIndicatorColor, 0));
        setSelectedTabIndicator(C4459c.m18177b(context, c, C4416l.TabLayout_tabIndicator));
        setSelectedTabIndicatorGravity(c.getInt(C4416l.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(c.getBoolean(C4416l.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = c.getDimensionPixelSize(C4416l.TabLayout_tabPadding, 0);
        this.f7955m = dimensionPixelSize;
        this.f7954l = dimensionPixelSize;
        this.f7953k = dimensionPixelSize;
        this.f7952j = dimensionPixelSize;
        this.f7952j = c.getDimensionPixelSize(C4416l.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.f7953k = c.getDimensionPixelSize(C4416l.TabLayout_tabPaddingTop, this.f7953k);
        this.f7954l = c.getDimensionPixelSize(C4416l.TabLayout_tabPaddingEnd, this.f7954l);
        this.f7955m = c.getDimensionPixelSize(C4416l.TabLayout_tabPaddingBottom, this.f7955m);
        int resourceId = c.getResourceId(C4416l.TabLayout_tabTextAppearance, C4415k.TextAppearance_Design_Tab);
        this.f7956n = resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId, C3102j.TextAppearance);
        try {
            this.f7962t = (float) obtainStyledAttributes.getDimensionPixelSize(C3102j.TextAppearance_android_textSize, 0);
            this.f7957o = C4459c.m18175a(context, obtainStyledAttributes, C3102j.TextAppearance_android_textColor);
            obtainStyledAttributes.recycle();
            if (c.hasValue(C4416l.TabLayout_tabTextColor)) {
                this.f7957o = C4459c.m18175a(context, c, C4416l.TabLayout_tabTextColor);
            }
            if (c.hasValue(C4416l.TabLayout_tabSelectedTextColor)) {
                this.f7957o = m11313a(this.f7957o.getDefaultColor(), c.getColor(C4416l.TabLayout_tabSelectedTextColor, 0));
            }
            this.f7958p = C4459c.m18175a(context, c, C4416l.TabLayout_tabIconTint);
            this.f7961s = C2715j.m11287a(c.getInt(C4416l.TabLayout_tabIconTintMode, -1), (Mode) null);
            this.f7959q = C4459c.m18175a(context, c, C4416l.TabLayout_tabRippleColor);
            this.f7931C = c.getInt(C4416l.TabLayout_tabIndicatorAnimationDuration, 300);
            this.f7966x = c.getDimensionPixelSize(C4416l.TabLayout_tabMinWidth, -1);
            this.f7967y = c.getDimensionPixelSize(C4416l.TabLayout_tabMaxWidth, -1);
            this.f7964v = c.getResourceId(C4416l.TabLayout_tabBackground, 0);
            this.f7929A = c.getDimensionPixelSize(C4416l.TabLayout_tabContentStart, 0);
            this.f7933E = c.getInt(C4416l.TabLayout_tabMode, 1);
            this.f7930B = c.getInt(C4416l.TabLayout_tabGravity, 0);
            this.f7934F = c.getBoolean(C4416l.TabLayout_tabInlineLabel, false);
            this.f7936H = c.getBoolean(C4416l.TabLayout_tabUnboundedRipple, false);
            c.recycle();
            Resources resources = getResources();
            this.f7963u = (float) resources.getDimensionPixelSize(C4408d.design_tab_text_size_2line);
            this.f7968z = resources.getDimensionPixelSize(C4408d.design_tab_scrollable_min_width);
            m11324f();
            C3379v.m13788a((View) this, (C3323a) new C2730a());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    private int m11312a(int i, float f) {
        int i2 = this.f7933E;
        int i3 = 0;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        View childAt = this.f7951i.getChildAt(i);
        int i4 = i + 1;
        View childAt2 = i4 < this.f7951i.getChildCount() ? this.f7951i.getChildAt(i4) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f);
        return C3379v.m13829p(this) == 0 ? left + i5 : left - i5;
    }

    /* renamed from: a */
    private static ColorStateList m11313a(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    /* renamed from: a */
    private void m11315a(View view) {
        if (view instanceof C2746a) {
            m11318a((C2746a) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: a */
    private void m11316a(LayoutParams layoutParams) {
        float f;
        if (this.f7933E == 1 && this.f7930B == 0) {
            layoutParams.width = 0;
            f = 1.0f;
        } else {
            layoutParams.width = -2;
            f = 0.0f;
        }
        layoutParams.weight = f;
    }

    /* renamed from: a */
    private void m11317a(C2740i iVar, int i) {
        iVar.mo9134b(i);
        this.f7948f.add(i, iVar);
        int size = this.f7948f.size();
        while (true) {
            i++;
            if (i < size) {
                ((C2740i) this.f7948f.get(i)).mo9134b(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m11318a(C2746a aVar) {
        C2740i c = mo9061c();
        CharSequence charSequence = aVar.f8018f;
        if (charSequence != null) {
            c.mo9133b(charSequence);
        }
        Drawable drawable = aVar.f8019g;
        if (drawable != null) {
            c.mo9129a(drawable);
        }
        int i = aVar.f8020h;
        if (i != 0) {
            c.mo9128a(i);
        }
        if (!TextUtils.isEmpty(aVar.getContentDescription())) {
            c.mo9131a(aVar.getContentDescription());
        }
        mo9047a(c);
    }

    /* renamed from: a */
    private void m11319a(C3659b bVar, boolean z, boolean z2) {
        C3659b bVar2 = this.f7941M;
        if (bVar2 != null) {
            C2741j jVar = this.f7944P;
            if (jVar != null) {
                bVar2.mo11601b((C3669j) jVar);
            }
            C2733d dVar = this.f7945Q;
            if (dVar != null) {
                this.f7941M.mo11600b((C3668i) dVar);
            }
        }
        C2735f fVar = this.f7938J;
        if (fVar != null) {
            mo9058b(fVar);
            this.f7938J = null;
        }
        if (bVar != null) {
            this.f7941M = bVar;
            if (this.f7944P == null) {
                this.f7944P = new C2741j(this);
            }
            this.f7944P.mo9143a();
            bVar.mo11590a((C3669j) this.f7944P);
            C2745l lVar = new C2745l(bVar);
            this.f7938J = lVar;
            mo9046a((C2735f) lVar);
            C3658a adapter = bVar.getAdapter();
            if (adapter != null) {
                mo9050a(adapter, z);
            }
            if (this.f7945Q == null) {
                this.f7945Q = new C2733d();
            }
            this.f7945Q.mo9108a(z);
            bVar.mo11589a((C3668i) this.f7945Q);
            mo9044a(bVar.getCurrentItem(), 0.0f, true);
        } else {
            this.f7941M = null;
            mo9050a((C3658a) null, false);
        }
        this.f7946R = z2;
    }

    /* renamed from: b */
    private void m11320b(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !C3379v.m13768D(this) || this.f7951i.mo9117a()) {
                mo9044a(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int a = m11312a(i, 0.0f);
            if (scrollX != a) {
                m11328h();
                this.f7940L.setIntValues(new int[]{scrollX, a});
                this.f7940L.start();
            }
            this.f7951i.mo9116a(i, this.f7931C);
        }
    }

    /* renamed from: c */
    private void m11321c(int i) {
        C2742k kVar = (C2742k) this.f7951i.getChildAt(i);
        this.f7951i.removeViewAt(i);
        if (kVar != null) {
            kVar.mo9147a();
            this.f7947S.mo5388a(kVar);
        }
        requestLayout();
    }

    /* renamed from: d */
    private void m11322d(C2740i iVar) {
        C2742k kVar = iVar.f7999h;
        kVar.setSelected(false);
        kVar.setActivated(false);
        this.f7951i.addView(kVar, iVar.mo9135c(), m11326g());
    }

    /* renamed from: e */
    private C2742k m11323e(C2740i iVar) {
        C3318e<C2742k> eVar = this.f7947S;
        C2742k kVar = eVar != null ? (C2742k) eVar.mo5387a() : null;
        if (kVar == null) {
            kVar = new C2742k(getContext());
        }
        kVar.setTab(iVar);
        kVar.setFocusable(true);
        kVar.setMinimumWidth(getTabMinWidth());
        kVar.setContentDescription(TextUtils.isEmpty(iVar.f7994c) ? iVar.f7993b : iVar.f7994c);
        return kVar;
    }

    /* renamed from: f */
    private void m11324f() {
        int i = this.f7933E;
        C3379v.m13783a(this.f7951i, (i == 0 || i == 2) ? Math.max(0, this.f7929A - this.f7952j) : 0, 0, 0, 0);
        int i2 = this.f7933E;
        if (i2 == 0) {
            this.f7951i.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            this.f7951i.setGravity(1);
        }
        mo9052a(true);
    }

    /* renamed from: f */
    private void m11325f(C2740i iVar) {
        for (int size = this.f7937I.size() - 1; size >= 0; size--) {
            ((C2735f) this.f7937I.get(size)).mo9103a(iVar);
        }
    }

    /* renamed from: g */
    private LayoutParams m11326g() {
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        m11316a(layoutParams);
        return layoutParams;
    }

    /* renamed from: g */
    private void m11327g(C2740i iVar) {
        for (int size = this.f7937I.size() - 1; size >= 0; size--) {
            ((C2735f) this.f7937I.get(size)).mo9105c(iVar);
        }
    }

    private int getDefaultHeight() {
        int size = this.f7948f.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C2740i iVar = (C2740i) this.f7948f.get(i);
            if (iVar != null && iVar.mo9132b() != null && !TextUtils.isEmpty(iVar.mo9138e())) {
                z = true;
                break;
            }
            i++;
        }
        return (!z || this.f7934F) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.f7966x;
        if (i != -1) {
            return i;
        }
        int i2 = this.f7933E;
        return (i2 == 0 || i2 == 2) ? this.f7968z : 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f7951i.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: h */
    private void m11328h() {
        if (this.f7940L == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f7940L = valueAnimator;
            valueAnimator.setInterpolator(C4417a.f11713b);
            this.f7940L.setDuration((long) this.f7931C);
            this.f7940L.addUpdateListener(new C2732c());
        }
    }

    /* renamed from: h */
    private void m11329h(C2740i iVar) {
        for (int size = this.f7937I.size() - 1; size >= 0; size--) {
            ((C2735f) this.f7937I.get(size)).mo9104b(iVar);
        }
    }

    /* renamed from: i */
    private void m11330i() {
        int size = this.f7948f.size();
        for (int i = 0; i < size; i++) {
            ((C2740i) this.f7948f.get(i)).mo9142i();
        }
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f7951i.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f7951i.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2735f mo9041a(C2734e eVar) {
        if (eVar == null) {
            return null;
        }
        if (this.f7939K.containsKey(eVar)) {
            return (C2735f) this.f7939K.get(eVar);
        }
        C2731b bVar = new C2731b(this, eVar);
        this.f7939K.put(eVar, bVar);
        return bVar;
    }

    /* renamed from: a */
    public C2740i mo9042a(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C2740i) this.f7948f.get(i);
    }

    /* renamed from: a */
    public void mo9043a() {
        this.f7937I.clear();
        this.f7939K.clear();
    }

    /* renamed from: a */
    public void mo9044a(int i, float f, boolean z) {
        mo9045a(i, f, z, true);
    }

    /* renamed from: a */
    public void mo9045a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f7951i.getChildCount()) {
            if (z2) {
                this.f7951i.mo9115a(i, f);
            }
            ValueAnimator valueAnimator = this.f7940L;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f7940L.cancel();
            }
            scrollTo(m11312a(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: a */
    public void mo9046a(C2735f fVar) {
        if (!this.f7937I.contains(fVar)) {
            this.f7937I.add(fVar);
        }
    }

    /* renamed from: a */
    public void mo9047a(C2740i iVar) {
        mo9049a(iVar, this.f7948f.isEmpty());
    }

    /* renamed from: a */
    public void mo9048a(C2740i iVar, int i, boolean z) {
        if (iVar.f7998g == this) {
            m11317a(iVar, i);
            m11322d(iVar);
            if (z) {
                iVar.mo9141h();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: a */
    public void mo9049a(C2740i iVar, boolean z) {
        mo9048a(iVar, this.f7948f.size(), z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9050a(C3658a aVar, boolean z) {
        C3658a aVar2 = this.f7942N;
        if (aVar2 != null) {
            DataSetObserver dataSetObserver = this.f7943O;
            if (dataSetObserver != null) {
                aVar2.mo11579c(dataSetObserver);
            }
        }
        this.f7942N = aVar;
        if (z && aVar != null) {
            if (this.f7943O == null) {
                this.f7943O = new C2736g();
            }
            aVar.mo11570a(this.f7943O);
        }
        mo9063d();
    }

    /* renamed from: a */
    public void mo9051a(C3659b bVar, boolean z) {
        m11319a(bVar, z, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9052a(boolean z) {
        for (int i = 0; i < this.f7951i.getChildCount(); i++) {
            View childAt = this.f7951i.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m11316a((LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public void addView(View view) {
        m11315a(view);
    }

    public void addView(View view, int i) {
        m11315a(view);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m11315a(view);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m11315a(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C2740i mo9057b() {
        C2740i iVar = (C2740i) f7928T.mo5387a();
        return iVar == null ? new C2740i() : iVar;
    }

    /* renamed from: b */
    public void mo9058b(C2735f fVar) {
        this.f7937I.remove(fVar);
    }

    /* renamed from: b */
    public void mo9059b(C2740i iVar, boolean z) {
        C2740i iVar2 = this.f7949g;
        if (iVar2 != iVar) {
            int c = iVar != null ? iVar.mo9135c() : -1;
            if (z) {
                if ((iVar2 == null || iVar2.mo9135c() == -1) && c != -1) {
                    mo9044a(c, 0.0f, true);
                } else {
                    m11320b(c);
                }
                if (c != -1) {
                    setSelectedTabView(c);
                }
            }
            this.f7949g = iVar;
            if (iVar2 != null) {
                m11329h(iVar2);
            }
            if (iVar != null) {
                m11327g(iVar);
            }
        } else if (iVar2 != null) {
            m11325f(iVar);
            m11320b(iVar.mo9135c());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo9060b(C2740i iVar) {
        return f7928T.mo5388a(iVar);
    }

    /* renamed from: c */
    public C2740i mo9061c() {
        C2740i b = mo9057b();
        b.f7998g = this;
        b.f7999h = m11323e(b);
        return b;
    }

    /* renamed from: c */
    public void mo9062c(C2740i iVar) {
        mo9059b(iVar, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo9063d() {
        mo9064e();
        C3658a aVar = this.f7942N;
        if (aVar != null) {
            int a = aVar.mo9887a();
            for (int i = 0; i < a; i++) {
                C2740i c = mo9061c();
                c.mo9133b(this.f7942N.mo11569a(i));
                mo9049a(c, false);
            }
            C3659b bVar = this.f7941M;
            if (bVar != null && a > 0) {
                int currentItem = bVar.getCurrentItem();
                if (currentItem != getSelectedTabPosition() && currentItem < getTabCount()) {
                    mo9062c(mo9042a(currentItem));
                }
            }
        }
    }

    /* renamed from: e */
    public void mo9064e() {
        for (int childCount = this.f7951i.getChildCount() - 1; childCount >= 0; childCount--) {
            m11321c(childCount);
        }
        Iterator it = this.f7948f.iterator();
        while (it.hasNext()) {
            C2740i iVar = (C2740i) it.next();
            it.remove();
            iVar.mo9140g();
            mo9060b(iVar);
        }
        this.f7949g = null;
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        C2740i iVar = this.f7949g;
        if (iVar != null) {
            return iVar.mo9135c();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f7948f.size();
    }

    public int getTabGravity() {
        return this.f7930B;
    }

    public ColorStateList getTabIconTint() {
        return this.f7958p;
    }

    public int getTabIndicatorGravity() {
        return this.f7932D;
    }

    /* access modifiers changed from: 0000 */
    public int getTabMaxWidth() {
        return this.f7965w;
    }

    public int getTabMode() {
        return this.f7933E;
    }

    public ColorStateList getTabRippleColor() {
        return this.f7959q;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f7960r;
    }

    public ColorStateList getTabTextColors() {
        return this.f7957o;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4386h.m17875a((View) this);
        if (this.f7941M == null) {
            ViewParent parent = getParent();
            if (parent instanceof C3659b) {
                m11319a((C3659b) parent, true, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f7946R) {
            setupWithViewPager(null);
            this.f7946R = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.f7951i.getChildCount(); i++) {
            View childAt = this.f7951i.getChildAt(i);
            if (childAt instanceof C2742k) {
                ((C2742k) childAt).m11400a(canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        if (r0 != 2) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007b, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.C2715j.m11285a(r0, r1)
            int r0 = (int) r0
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002b
            if (r1 == 0) goto L_0x001c
            goto L_0x003e
        L_0x001c:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x003e
        L_0x002b:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L_0x003e
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L_0x003e
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L_0x003e:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L_0x005c
            int r1 = r6.f7967y
            if (r1 <= 0) goto L_0x004d
            goto L_0x005a
        L_0x004d:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.C2715j.m11285a(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005a:
            r6.f7965w = r1
        L_0x005c:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00aa
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f7933E
            if (r0 == 0) goto L_0x007f
            if (r0 == r5) goto L_0x0073
            r1 = 2
            if (r0 == r1) goto L_0x007f
            goto L_0x008a
        L_0x0073:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L_0x008a
        L_0x007d:
            r4 = 1
            goto L_0x008a
        L_0x007f:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L_0x008a
            goto L_0x007d
        L_0x008a:
            if (r4 == 0) goto L_0x00aa
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C4386h.m17876a((View) this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f7934F != z) {
            this.f7934F = z;
            for (int i = 0; i < this.f7951i.getChildCount(); i++) {
                View childAt = this.f7951i.getChildAt(i);
                if (childAt instanceof C2742k) {
                    ((C2742k) childAt).mo9149c();
                }
            }
            m11324f();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(C2734e eVar) {
        mo9043a();
        mo9046a(mo9041a(eVar));
    }

    /* access modifiers changed from: 0000 */
    public void setScrollAnimatorListener(AnimatorListener animatorListener) {
        m11328h();
        this.f7940L.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i) {
        setSelectedTabIndicator(i != 0 ? C3103a.m12557c(getContext(), i) : null);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f7960r != drawable) {
            this.f7960r = drawable;
            C3379v.m13772H(this.f7951i);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f7951i.mo9114a(i);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f7932D != i) {
            this.f7932D = i;
            C3379v.m13772H(this.f7951i);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f7951i.mo9118b(i);
    }

    public void setTabGravity(int i) {
        if (this.f7930B != i) {
            this.f7930B = i;
            m11324f();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f7958p != colorStateList) {
            this.f7958p = colorStateList;
            m11330i();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C3103a.m12556b(getContext(), i));
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f7935G = z;
        C3379v.m13772H(this.f7951i);
    }

    public void setTabMode(int i) {
        if (i != this.f7933E) {
            this.f7933E = i;
            m11324f();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f7959q != colorStateList) {
            this.f7959q = colorStateList;
            for (int i = 0; i < this.f7951i.getChildCount(); i++) {
                View childAt = this.f7951i.getChildAt(i);
                if (childAt instanceof C2742k) {
                    ((C2742k) childAt).m11399a(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C3103a.m12556b(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f7957o != colorStateList) {
            this.f7957o = colorStateList;
            m11330i();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(C3658a aVar) {
        mo9050a(aVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f7936H != z) {
            this.f7936H = z;
            for (int i = 0; i < this.f7951i.getChildCount(); i++) {
                View childAt = this.f7951i.getChildAt(i);
                if (childAt instanceof C2742k) {
                    ((C2742k) childAt).m11399a(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(C3659b bVar) {
        mo9051a(bVar, true);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }
}
