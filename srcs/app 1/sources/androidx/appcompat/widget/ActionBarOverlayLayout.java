package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.C0137m.C0138a;
import androidx.recyclerview.widget.RecyclerView;
import p071f.p072a.C3093a;
import p071f.p072a.C3098f;
import p071f.p097h.p108m.C3371n;
import p071f.p097h.p108m.C3372o;
import p071f.p097h.p108m.C3373p;
import p071f.p097h.p108m.C3374q;
import p071f.p097h.p108m.C3379v;

public class ActionBarOverlayLayout extends ViewGroup implements C0290y, C3373p, C3371n, C3372o {

    /* renamed from: G */
    static final int[] f652G = {C3093a.actionBarSize, 16842841};

    /* renamed from: A */
    private OverScroller f653A;

    /* renamed from: B */
    ViewPropertyAnimator f654B;

    /* renamed from: C */
    final AnimatorListenerAdapter f655C;

    /* renamed from: D */
    private final Runnable f656D;

    /* renamed from: E */
    private final Runnable f657E;

    /* renamed from: F */
    private final C3374q f658F;

    /* renamed from: f */
    private int f659f;

    /* renamed from: g */
    private int f660g;

    /* renamed from: h */
    private ContentFrameLayout f661h;

    /* renamed from: i */
    ActionBarContainer f662i;

    /* renamed from: j */
    private C0292z f663j;

    /* renamed from: k */
    private Drawable f664k;

    /* renamed from: l */
    private boolean f665l;

    /* renamed from: m */
    private boolean f666m;

    /* renamed from: n */
    private boolean f667n;

    /* renamed from: o */
    private boolean f668o;

    /* renamed from: p */
    boolean f669p;

    /* renamed from: q */
    private int f670q;

    /* renamed from: r */
    private int f671r;

    /* renamed from: s */
    private final Rect f672s;

    /* renamed from: t */
    private final Rect f673t;

    /* renamed from: u */
    private final Rect f674u;

    /* renamed from: v */
    private final Rect f675v;

    /* renamed from: w */
    private final Rect f676w;

    /* renamed from: x */
    private final Rect f677x;

    /* renamed from: y */
    private final Rect f678y;

    /* renamed from: z */
    private C0152d f679z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    class C0149a extends AnimatorListenerAdapter {
        C0149a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f654B = null;
            actionBarOverlayLayout.f669p = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f654B = null;
            actionBarOverlayLayout.f669p = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    class C0150b implements Runnable {
        C0150b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo894b();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f654B = actionBarOverlayLayout.f662i.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f655C);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    class C0151c implements Runnable {
        C0151c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo894b();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f654B = actionBarOverlayLayout.f662i.animate().translationY((float) (-ActionBarOverlayLayout.this.f662i.getHeight())).setListener(ActionBarOverlayLayout.this.f655C);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0152d {
        /* renamed from: a */
        void mo385a();

        /* renamed from: a */
        void mo387a(int i);

        /* renamed from: a */
        void mo389a(boolean z);

        /* renamed from: b */
        void mo390b();

        /* renamed from: c */
        void mo391c();

        /* renamed from: d */
        void mo392d();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0153e extends MarginLayoutParams {
        public C0153e(int i, int i2) {
            super(i, i2);
        }

        public C0153e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0153e(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f660g = 0;
        this.f672s = new Rect();
        this.f673t = new Rect();
        this.f674u = new Rect();
        this.f675v = new Rect();
        this.f676w = new Rect();
        this.f677x = new Rect();
        this.f678y = new Rect();
        this.f655C = new C0149a();
        this.f656D = new C0150b();
        this.f657E = new C0151c();
        m802a(context);
        this.f658F = new C3374q(this);
    }

    /* renamed from: a */
    private C0292z m801a(View view) {
        if (view instanceof C0292z) {
            return (C0292z) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view.getClass().getSimpleName());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    private void m802a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f652G);
        boolean z = false;
        this.f659f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f664k = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f665l = z;
        this.f653A = new OverScroller(context);
    }

    /* renamed from: a */
    private boolean m803a(float f, float f2) {
        this.f653A.fling(0, 0, 0, (int) f2, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        return this.f653A.getFinalY() > this.f662i.getHeight();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m804a(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0153e) r3
            r0 = 1
            if (r5 == 0) goto L_0x0013
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L_0x0013
            r3.leftMargin = r1
            r5 = 1
            goto L_0x0014
        L_0x0013:
            r5 = 0
        L_0x0014:
            if (r6 == 0) goto L_0x001f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L_0x001f
            r3.topMargin = r1
            r5 = 1
        L_0x001f:
            if (r8 == 0) goto L_0x002a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L_0x002a
            r3.rightMargin = r8
            r5 = 1
        L_0x002a:
            if (r7 == 0) goto L_0x0035
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L_0x0035
            r3.bottomMargin = r4
            goto L_0x0036
        L_0x0035:
            r0 = r5
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m804a(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* renamed from: k */
    private void m805k() {
        mo894b();
        this.f657E.run();
    }

    /* renamed from: l */
    private void m806l() {
        mo894b();
        postDelayed(this.f657E, 600);
    }

    /* renamed from: m */
    private void m807m() {
        mo894b();
        postDelayed(this.f656D, 600);
    }

    /* renamed from: n */
    private void m808n() {
        mo894b();
        this.f656D.run();
    }

    /* renamed from: a */
    public void mo886a(int i) {
        mo912j();
        if (i == 2) {
            this.f663j.mo1786n();
        } else if (i == 5) {
            this.f663j.mo1787o();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: a */
    public void mo887a(Menu menu, C0138a aVar) {
        mo912j();
        this.f663j.mo1757a(menu, aVar);
    }

    /* renamed from: a */
    public void mo888a(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: a */
    public void mo889a(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public void mo890a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo889a(view, i, i2, i3, i4, i5);
    }

    /* renamed from: a */
    public void mo891a(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    /* renamed from: a */
    public void mo892a(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* renamed from: a */
    public boolean mo893a() {
        mo912j();
        return this.f663j.mo1763a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo894b() {
        removeCallbacks(this.f656D);
        removeCallbacks(this.f657E);
        ViewPropertyAnimator viewPropertyAnimator = this.f654B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: b */
    public boolean mo895b(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    /* renamed from: c */
    public void mo896c() {
        mo912j();
        this.f663j.mo1769c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0153e;
    }

    /* renamed from: d */
    public boolean mo898d() {
        mo912j();
        return this.f663j.mo1774d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f664k != null && !this.f665l) {
            int bottom = this.f662i.getVisibility() == 0 ? (int) (((float) this.f662i.getBottom()) + this.f662i.getTranslationY() + 0.5f) : 0;
            this.f664k.setBounds(0, bottom, getWidth(), this.f664k.getIntrinsicHeight() + bottom);
            this.f664k.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo900e() {
        mo912j();
        return this.f663j.mo1776e();
    }

    /* renamed from: f */
    public boolean mo901f() {
        mo912j();
        return this.f663j.mo1777f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        mo912j();
        int w = C3379v.m13836w(this) & 256;
        boolean a = m804a((View) this.f662i, rect, true, true, false, true);
        this.f675v.set(rect);
        C0293z0.m1486a(this, this.f675v, this.f672s);
        if (!this.f676w.equals(this.f675v)) {
            this.f676w.set(this.f675v);
            a = true;
        }
        if (!this.f673t.equals(this.f672s)) {
            this.f673t.set(this.f672s);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo903g() {
        mo912j();
        return this.f663j.mo1778g();
    }

    /* access modifiers changed from: protected */
    public C0153e generateDefaultLayoutParams() {
        return new C0153e(-1, -1);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new C0153e(layoutParams);
    }

    public C0153e generateLayoutParams(AttributeSet attributeSet) {
        return new C0153e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f662i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f658F.mo10831a();
    }

    public CharSequence getTitle() {
        mo912j();
        return this.f663j.getTitle();
    }

    /* renamed from: h */
    public void mo910h() {
        mo912j();
        this.f663j.mo1780h();
    }

    /* renamed from: i */
    public boolean mo911i() {
        return this.f666m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo912j() {
        if (this.f661h == null) {
            this.f661h = (ContentFrameLayout) findViewById(C3098f.action_bar_activity_content);
            this.f662i = (ActionBarContainer) findViewById(C3098f.action_bar_container);
            this.f663j = m801a(findViewById(C3098f.action_bar));
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m802a(getContext());
        C3379v.m13773I(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo894b();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0153e eVar = (C0153e) childAt.getLayoutParams();
                int i6 = eVar.leftMargin + paddingLeft;
                int i7 = eVar.topMargin + paddingTop;
                childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        mo912j();
        measureChildWithMargins(this.f662i, i, 0, i2, 0);
        C0153e eVar = (C0153e) this.f662i.getLayoutParams();
        int max = Math.max(0, this.f662i.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f662i.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f662i.getMeasuredState());
        boolean z = (C3379v.m13836w(this) & 256) != 0;
        if (z) {
            i3 = this.f659f;
            if (this.f667n && this.f662i.getTabContainer() != null) {
                i3 += this.f659f;
            }
        } else {
            i3 = this.f662i.getVisibility() != 8 ? this.f662i.getMeasuredHeight() : 0;
        }
        this.f674u.set(this.f672s);
        this.f677x.set(this.f675v);
        Rect rect = (this.f666m || z) ? this.f677x : this.f674u;
        rect.top += i3;
        rect.bottom += 0;
        m804a((View) this.f661h, this.f674u, true, true, true, true);
        if (!this.f678y.equals(this.f677x)) {
            this.f678y.set(this.f677x);
            this.f661h.mo1042a(this.f677x);
        }
        measureChildWithMargins(this.f661h, i, 0, i2, 0);
        C0153e eVar2 = (C0153e) this.f661h.getLayoutParams();
        int max3 = Math.max(max, this.f661h.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f661h.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f661h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f668o || !z) {
            return false;
        }
        if (m803a(f, f2)) {
            m805k();
        } else {
            m808n();
        }
        this.f669p = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f670q + i2;
        this.f670q = i5;
        setActionBarHideOffset(i5);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f658F.mo10834a(view, view2, i);
        this.f670q = getActionBarHideOffset();
        mo894b();
        C0152d dVar = this.f679z;
        if (dVar != null) {
            dVar.mo390b();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f662i.getVisibility() != 0) {
            return false;
        }
        return this.f668o;
    }

    public void onStopNestedScroll(View view) {
        if (this.f668o && !this.f669p) {
            if (this.f670q <= this.f662i.getHeight()) {
                m807m();
            } else {
                m806l();
            }
        }
        C0152d dVar = this.f679z;
        if (dVar != null) {
            dVar.mo391c();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo912j();
        int i2 = this.f671r ^ i;
        this.f671r = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        C0152d dVar = this.f679z;
        if (dVar != null) {
            dVar.mo389a(!z);
            if (z2 || !z) {
                this.f679z.mo385a();
            } else {
                this.f679z.mo392d();
            }
        }
        if ((i2 & 256) != 0 && this.f679z != null) {
            C3379v.m13773I(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f660g = i;
        C0152d dVar = this.f679z;
        if (dVar != null) {
            dVar.mo387a(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        mo894b();
        this.f662i.setTranslationY((float) (-Math.max(0, Math.min(i, this.f662i.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0152d dVar) {
        this.f679z = dVar;
        if (getWindowToken() != null) {
            this.f679z.mo387a(this.f660g);
            int i = this.f671r;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C3379v.m13773I(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f667n = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f668o) {
            this.f668o = z;
            if (!z) {
                mo894b();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo912j();
        this.f663j.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        mo912j();
        this.f663j.setIcon(drawable);
    }

    public void setLogo(int i) {
        mo912j();
        this.f663j.mo1770c(i);
    }

    public void setOverlayMode(boolean z) {
        this.f666m = z;
        this.f665l = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Callback callback) {
        mo912j();
        this.f663j.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo912j();
        this.f663j.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
