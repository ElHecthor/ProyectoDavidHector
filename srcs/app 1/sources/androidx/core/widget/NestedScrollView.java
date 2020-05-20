package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p071f.p097h.p108m.C3323a;
import p071f.p097h.p108m.C3368k;
import p071f.p097h.p108m.C3370m;
import p071f.p097h.p108m.C3372o;
import p071f.p097h.p108m.C3374q;
import p071f.p097h.p108m.C3379v;
import p071f.p097h.p108m.p109f0.C3347c;
import p071f.p097h.p108m.p109f0.C3347c.C3348a;
import p071f.p097h.p108m.p109f0.C3354e;

public class NestedScrollView extends FrameLayout implements C3372o, C3368k {

    /* renamed from: F */
    private static final C0377a f1748F = new C0377a();

    /* renamed from: G */
    private static final int[] f1749G = {16843130};

    /* renamed from: A */
    private C0379c f1750A;

    /* renamed from: B */
    private final C3374q f1751B;

    /* renamed from: C */
    private final C3370m f1752C;

    /* renamed from: D */
    private float f1753D;

    /* renamed from: E */
    private C0378b f1754E;

    /* renamed from: f */
    private long f1755f;

    /* renamed from: g */
    private final Rect f1756g;

    /* renamed from: h */
    private OverScroller f1757h;

    /* renamed from: i */
    private EdgeEffect f1758i;

    /* renamed from: j */
    private EdgeEffect f1759j;

    /* renamed from: k */
    private int f1760k;

    /* renamed from: l */
    private boolean f1761l;

    /* renamed from: m */
    private boolean f1762m;

    /* renamed from: n */
    private View f1763n;

    /* renamed from: o */
    private boolean f1764o;

    /* renamed from: p */
    private VelocityTracker f1765p;

    /* renamed from: q */
    private boolean f1766q;

    /* renamed from: r */
    private boolean f1767r;

    /* renamed from: s */
    private int f1768s;

    /* renamed from: t */
    private int f1769t;

    /* renamed from: u */
    private int f1770u;

    /* renamed from: v */
    private int f1771v;

    /* renamed from: w */
    private final int[] f1772w;

    /* renamed from: x */
    private final int[] f1773x;

    /* renamed from: y */
    private int f1774y;

    /* renamed from: z */
    private int f1775z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    static class C0377a extends C3323a {
        C0377a() {
        }

        /* renamed from: a */
        public void mo2349a(View view, C3347c cVar) {
            super.mo2349a(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.mo10745a((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                int scrollRange = nestedScrollView.getScrollRange();
                if (scrollRange > 0) {
                    cVar.mo10784k(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        cVar.mo10744a(C3348a.f9558g);
                        cVar.mo10744a(C3348a.f9562k);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        cVar.mo10744a(C3348a.f9557f);
                        cVar.mo10744a(C3348a.f9563l);
                    }
                }
            }
        }

        /* renamed from: a */
        public boolean mo2350a(View view, int i, Bundle bundle) {
            if (super.mo2350a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo2288a(0, max, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.mo2288a(0, min, true);
            return true;
        }

        /* renamed from: b */
        public void mo2351b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2351b(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C3354e.m13713a(accessibilityEvent, nestedScrollView.getScrollX());
            C3354e.m13715b(accessibilityEvent, nestedScrollView.getScrollRange());
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface C0378b {
        /* renamed from: a */
        void mo152a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    static class C0379c extends BaseSavedState {
        public static final Creator<C0379c> CREATOR = new C0380a();

        /* renamed from: f */
        public int f1776f;

        /* renamed from: androidx.core.widget.NestedScrollView$c$a */
        static class C0380a implements Creator<C0379c> {
            C0380a() {
            }

            public C0379c createFromParcel(Parcel parcel) {
                return new C0379c(parcel);
            }

            public C0379c[] newArray(int i) {
                return new C0379c[i];
            }
        }

        C0379c(Parcel parcel) {
            super(parcel);
            this.f1776f = parcel.readInt();
        }

        C0379c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            sb.append(this.f1776f);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1776f);
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1756g = new Rect();
        this.f1761l = true;
        this.f1762m = false;
        this.f1763n = null;
        this.f1764o = false;
        this.f1767r = true;
        this.f1771v = -1;
        this.f1772w = new int[2];
        this.f1773x = new int[2];
        m1943f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1749G, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1751B = new C3374q(this);
        this.f1752C = new C3370m(this);
        setNestedScrollingEnabled(true);
        C3379v.m13788a((View) this, (C3323a) f1748F);
    }

    /* renamed from: a */
    private static int m1925a(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: a */
    private View m1926a(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    private void m1927a() {
        this.f1757h.abortAnimation();
        mo2315f(1);
    }

    /* renamed from: a */
    private void m1928a(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1752C.mo10816a(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* renamed from: a */
    private void m1929a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1771v) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1760k = (int) motionEvent.getY(i);
            this.f1771v = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1765p;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a */
    private void m1930a(boolean z) {
        if (z) {
            mo2298b(2, 1);
        } else {
            mo2315f(1);
        }
        this.f1775z = getScrollY();
        C3379v.m13772H(this);
    }

    /* renamed from: a */
    private boolean m1931a(Rect rect, boolean z) {
        int a = mo2285a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                mo2286a(0, a);
            }
        }
        return z2;
    }

    /* renamed from: a */
    private boolean m1932a(View view) {
        return !m1933a(view, 0, getHeight());
    }

    /* renamed from: a */
    private boolean m1933a(View view, int i, int i2) {
        view.getDrawingRect(this.f1756g);
        offsetDescendantRectToMyCoords(view, this.f1756g);
        return this.f1756g.bottom + i >= getScrollY() && this.f1756g.top - i <= getScrollY() + i2;
    }

    /* renamed from: a */
    private static boolean m1934a(View view, View view2) {
        boolean z = true;
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m1934a((View) parent, view2)) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    private void m1935b(int i, int i2, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1755f > 250) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                this.f1757h.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY);
                m1930a(z);
            } else {
                if (!this.f1757h.isFinished()) {
                    m1927a();
                }
                scrollBy(i, i2);
            }
            this.f1755f = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: b */
    private void m1936b(View view) {
        view.getDrawingRect(this.f1756g);
        offsetDescendantRectToMyCoords(view, this.f1756g);
        int a = mo2285a(this.f1756g);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    /* renamed from: b */
    private boolean m1937b() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: b */
    private boolean m1938b(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View a = m1926a(z2, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m1945g(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z;
    }

    /* renamed from: c */
    private void m1939c() {
        this.f1764o = false;
        m1946h();
        mo2315f(0);
        EdgeEffect edgeEffect = this.f1758i;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f1759j.onRelease();
        }
    }

    /* renamed from: c */
    private boolean m1940c(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    /* renamed from: d */
    private void m1941d() {
        if (getOverScrollMode() == 2) {
            this.f1758i = null;
            this.f1759j = null;
        } else if (this.f1758i == null) {
            Context context = getContext();
            this.f1758i = new EdgeEffect(context);
            this.f1759j = new EdgeEffect(context);
        }
    }

    /* renamed from: e */
    private void m1942e() {
        VelocityTracker velocityTracker = this.f1765p;
        if (velocityTracker == null) {
            this.f1765p = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: f */
    private void m1943f() {
        this.f1757h = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1768s = viewConfiguration.getScaledTouchSlop();
        this.f1769t = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1770u = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: g */
    private void m1944g() {
        if (this.f1765p == null) {
            this.f1765p = VelocityTracker.obtain();
        }
    }

    /* renamed from: g */
    private void m1945g(int i) {
        if (i == 0) {
            return;
        }
        if (this.f1767r) {
            mo2286a(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f1753D == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f1753D = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f1753D;
    }

    /* renamed from: h */
    private void m1946h() {
        VelocityTracker velocityTracker = this.f1765p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1765p = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo2285a(Rect rect) {
        int i = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        if (rect.bottom > i3 && rect.top > scrollY) {
            i = Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i3) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        } else if (rect.top < scrollY && rect.bottom < i3) {
            i = Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
        return i;
    }

    /* renamed from: a */
    public final void mo2286a(int i, int i2) {
        m1935b(i, i2, false);
    }

    /* renamed from: a */
    public void mo2287a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f1752C.mo10816a(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2288a(int i, int i2, boolean z) {
        m1935b(i - getScrollX(), i2 - getScrollY(), z);
    }

    /* renamed from: a */
    public void mo888a(View view, int i) {
        this.f1751B.mo10833a(view, i);
        mo2315f(i);
    }

    /* renamed from: a */
    public void mo889a(View view, int i, int i2, int i3, int i4, int i5) {
        m1928a(i4, i5, (int[]) null);
    }

    /* renamed from: a */
    public void mo890a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m1928a(i4, i5, iArr);
    }

    /* renamed from: a */
    public void mo891a(View view, int i, int i2, int[] iArr, int i3) {
        mo2291a(i, i2, iArr, (int[]) null, i3);
    }

    /* renamed from: a */
    public void mo892a(View view, View view2, int i, int i2) {
        this.f1751B.mo10835a(view, view2, i, i2);
        mo2298b(2, i2);
    }

    /* renamed from: a */
    public boolean mo2289a(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m1933a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m1945g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1756g);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1756g);
            m1945g(mo2285a(this.f1756g));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && m1932a(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2290a(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r3 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
            goto L_0x004e
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r7 = r12.mo2307d(r5)
            if (r7 != 0) goto L_0x007e
            android.widget.OverScroller r7 = r0.f1757h
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo2290a(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: a */
    public boolean mo2291a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f1752C.mo10826a(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: a */
    public boolean mo2292a(KeyEvent keyEvent) {
        this.f1756g.setEmpty();
        boolean z = false;
        int i = 130;
        if (!m1937b()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View findFocus = findFocus();
                if (findFocus == this) {
                    findFocus = null;
                }
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                if (!(findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130))) {
                    z = true;
                }
            }
            return z;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                z = !keyEvent.isAltPressed() ? mo2289a(33) : mo2299c(33);
            } else if (keyCode == 20) {
                z = !keyEvent.isAltPressed() ? mo2289a(130) : mo2299c(130);
            } else if (keyCode == 62) {
                if (keyEvent.isShiftPressed()) {
                    i = 33;
                }
                mo2314e(i);
            }
        }
        return z;
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public void mo2297b(int i) {
        if (getChildCount() > 0) {
            this.f1757h.fling(getScrollX(), getScrollY(), 0, i, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, 0, 0);
            m1930a(true);
        }
    }

    /* renamed from: b */
    public boolean mo2298b(int i, int i2) {
        return this.f1752C.mo10822a(i, i2);
    }

    /* renamed from: b */
    public boolean mo895b(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* renamed from: c */
    public boolean mo2299c(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f1756g;
        rect.top = 0;
        rect.bottom = height;
        if (z) {
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                this.f1756g.bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect2 = this.f1756g;
                rect2.top = rect2.bottom - height;
            }
        }
        Rect rect3 = this.f1756g;
        return m1938b(i, rect3.top, rect3.bottom);
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.f1757h.isFinished()) {
            this.f1757h.computeScrollOffset();
            int currY = this.f1757h.getCurrY();
            int i = currY - this.f1775z;
            this.f1775z = currY;
            int[] iArr = this.f1773x;
            boolean z = false;
            iArr[1] = 0;
            mo2291a(0, i, iArr, (int[]) null, 1);
            int i2 = i - this.f1773x[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                mo2290a(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f1773x;
                iArr2[1] = 0;
                mo2287a(0, scrollY2, 0, i3, this.f1772w, 1, iArr2);
                i2 = i3 - this.f1773x[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    m1941d();
                    if (i2 < 0) {
                        if (this.f1758i.isFinished()) {
                            edgeEffect = this.f1758i;
                        }
                    } else if (this.f1759j.isFinished()) {
                        edgeEffect = this.f1759j;
                    }
                    edgeEffect.onAbsorb((int) this.f1757h.getCurrVelocity());
                }
                m1927a();
            }
            if (!this.f1757h.isFinished()) {
                C3379v.m13772H(this);
            } else {
                mo2315f(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            bottom -= scrollY;
        } else if (scrollY > max) {
            bottom += scrollY - max;
        }
        return bottom;
    }

    /* renamed from: d */
    public boolean mo2307d(int i) {
        return this.f1752C.mo10821a(i);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo2292a(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1752C.mo10820a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1752C.mo10819a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo2291a(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1752C.mo10823a(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1758i != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f1758i.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f1758i.setSize(width, height);
                if (this.f1758i.draw(canvas)) {
                    C3379v.m13772H(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f1759j.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f1759j.setSize(width2, height2);
                if (this.f1759j.draw(canvas)) {
                    C3379v.m13772H(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* renamed from: e */
    public boolean mo2314e(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f1756g.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f1756g;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f1756g.top = getScrollY() - height;
            Rect rect2 = this.f1756g;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f1756g;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return m1938b(i, i2, i3);
    }

    /* renamed from: f */
    public void mo2315f(int i) {
        this.f1752C.mo10830c(i);
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f1751B.mo10831a();
    }

    /* access modifiers changed from: 0000 */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return mo2307d(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f1752C.mo10827b();
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1762m = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f1764o) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f1764o) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f1771v;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid pointerId=");
                            sb.append(i2);
                            sb.append(" in onInterceptTouchEvent");
                            Log.e("NestedScrollView", sb.toString());
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f1760k) > this.f1768s && (2 & getNestedScrollAxes()) == 0) {
                                this.f1764o = true;
                                this.f1760k = y;
                                m1944g();
                                this.f1765p.addMovement(motionEvent);
                                this.f1774y = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m1929a(motionEvent);
                    }
                }
            }
            this.f1764o = false;
            this.f1771v = -1;
            m1946h();
            if (this.f1757h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C3379v.m13772H(this);
            }
            mo2315f(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m1940c((int) motionEvent.getX(), y2)) {
                this.f1764o = false;
                m1946h();
            } else {
                this.f1760k = y2;
                this.f1771v = motionEvent.getPointerId(0);
                m1942e();
                this.f1765p.addMovement(motionEvent);
                this.f1757h.computeScrollOffset();
                this.f1764o = !this.f1757h.isFinished();
                mo2298b(2, 0);
            }
        }
        return this.f1764o;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f1761l = false;
        View view = this.f1763n;
        if (view != null && m1934a(view, (View) this)) {
            m1936b(this.f1763n);
        }
        this.f1763n = null;
        if (!this.f1762m) {
            if (this.f1750A != null) {
                scrollTo(getScrollX(), this.f1750A.f1776f);
                this.f1750A = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int a = m1925a(scrollY, paddingTop, i5);
            if (a != scrollY) {
                scrollTo(getScrollX(), a);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1762m = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1766q && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo2297b((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo891a(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m1928a(i4, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo892a(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, null, i) : instance.findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !m1932a(findNextFocus)) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0379c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0379c cVar = (C0379c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f1750A = cVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0379c cVar = new C0379c(super.onSaveInstanceState());
        cVar.f1776f = getScrollY();
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0378b bVar = this.f1754E;
        if (bVar != null) {
            bVar.mo152a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m1933a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f1756g);
            offsetDescendantRectToMyCoords(findFocus, this.f1756g);
            m1945g(mo2285a(this.f1756g));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo895b(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo888a(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r10.f1757h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0210, code lost:
        if (r10.f1757h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r10 = r23
            r11 = r24
            r23.m1944g()
            int r0 = r24.getActionMasked()
            r12 = 0
            if (r0 != 0) goto L_0x0010
            r10.f1774y = r12
        L_0x0010:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r24)
            int r1 = r10.f1774y
            float r1 = (float) r1
            r2 = 0
            r13.offsetLocation(r2, r1)
            r1 = 2
            r14 = 1
            if (r0 == 0) goto L_0x0214
            r3 = -1
            if (r0 == r14) goto L_0x01cf
            if (r0 == r1) goto L_0x0082
            r1 = 3
            if (r0 == r1) goto L_0x0054
            r1 = 5
            if (r0 == r1) goto L_0x0041
            r1 = 6
            if (r0 == r1) goto L_0x002f
            goto L_0x024a
        L_0x002f:
            r23.m1929a(r24)
            int r0 = r10.f1771v
            int r0 = r11.findPointerIndex(r0)
            float r0 = r11.getY(r0)
            int r0 = (int) r0
            r10.f1760k = r0
            goto L_0x024a
        L_0x0041:
            int r0 = r24.getActionIndex()
            float r1 = r11.getY(r0)
            int r1 = (int) r1
            r10.f1760k = r1
            int r0 = r11.getPointerId(r0)
            r10.f1771v = r0
            goto L_0x024a
        L_0x0054:
            boolean r0 = r10.f1764o
            if (r0 == 0) goto L_0x007b
            int r0 = r23.getChildCount()
            if (r0 <= 0) goto L_0x007b
            android.widget.OverScroller r15 = r10.f1757h
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x007b
        L_0x0078:
            p071f.p097h.p108m.C3379v.m13772H(r23)
        L_0x007b:
            r10.f1771v = r3
            r23.m1939c()
            goto L_0x024a
        L_0x0082:
            int r0 = r10.f1771v
            int r15 = r11.findPointerIndex(r0)
            if (r15 != r3) goto L_0x00a9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r0.append(r1)
            int r1 = r10.f1771v
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L_0x024a
        L_0x00a9:
            float r0 = r11.getY(r15)
            int r6 = (int) r0
            int r0 = r10.f1760k
            int r0 = r0 - r6
            boolean r1 = r10.f1764o
            if (r1 != 0) goto L_0x00cf
            int r1 = java.lang.Math.abs(r0)
            int r2 = r10.f1768s
            if (r1 <= r2) goto L_0x00cf
            android.view.ViewParent r1 = r23.getParent()
            if (r1 == 0) goto L_0x00c6
            r1.requestDisallowInterceptTouchEvent(r14)
        L_0x00c6:
            r10.f1764o = r14
            int r1 = r10.f1768s
            if (r0 <= 0) goto L_0x00ce
            int r0 = r0 - r1
            goto L_0x00cf
        L_0x00ce:
            int r0 = r0 + r1
        L_0x00cf:
            r7 = r0
            boolean r0 = r10.f1764o
            if (r0 == 0) goto L_0x024a
            r1 = 0
            int[] r3 = r10.f1773x
            int[] r4 = r10.f1772w
            r5 = 0
            r0 = r23
            r2 = r7
            boolean r0 = r0.mo2291a(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00f1
            int[] r0 = r10.f1773x
            r0 = r0[r14]
            int r7 = r7 - r0
            int r0 = r10.f1774y
            int[] r1 = r10.f1772w
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.f1774y = r0
        L_0x00f1:
            r16 = r7
            int[] r0 = r10.f1772w
            r0 = r0[r14]
            int r6 = r6 - r0
            r10.f1760k = r6
            int r17 = r23.getScrollY()
            int r9 = r23.getScrollRange()
            int r0 = r23.getOverScrollMode()
            if (r0 == 0) goto L_0x0110
            if (r0 != r14) goto L_0x010d
            if (r9 <= 0) goto L_0x010d
            goto L_0x0110
        L_0x010d:
            r18 = 0
            goto L_0x0112
        L_0x0110:
            r18 = 1
        L_0x0112:
            r1 = 0
            r3 = 0
            int r4 = r23.getScrollY()
            r5 = 0
            r7 = 0
            r8 = 0
            r19 = 1
            r0 = r23
            r2 = r16
            r6 = r9
            r22 = r9
            r9 = r19
            boolean r0 = r0.mo2290a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0137
            boolean r0 = r10.mo2307d(r12)
            if (r0 != 0) goto L_0x0137
            android.view.VelocityTracker r0 = r10.f1765p
            r0.clear()
        L_0x0137:
            int r0 = r23.getScrollY()
            int r2 = r0 - r17
            int r4 = r16 - r2
            int[] r7 = r10.f1773x
            r7[r14] = r12
            r1 = 0
            r3 = 0
            int[] r5 = r10.f1772w
            r6 = 0
            r0 = r23
            r0.mo2287a(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r10.f1760k
            int[] r1 = r10.f1772w
            r2 = r1[r14]
            int r0 = r0 - r2
            r10.f1760k = r0
            int r0 = r10.f1774y
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.f1774y = r0
            if (r18 == 0) goto L_0x024a
            int[] r0 = r10.f1773x
            r0 = r0[r14]
            int r0 = r16 - r0
            r23.m1941d()
            int r1 = r17 + r0
            if (r1 >= 0) goto L_0x0190
            android.widget.EdgeEffect r1 = r10.f1758i
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            float r2 = r11.getX(r15)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            androidx.core.widget.C0386d.m2010a(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f1759j
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01b8
            android.widget.EdgeEffect r0 = r10.f1759j
        L_0x018c:
            r0.onRelease()
            goto L_0x01b8
        L_0x0190:
            r2 = r22
            if (r1 <= r2) goto L_0x01b8
            android.widget.EdgeEffect r1 = r10.f1759j
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r11.getX(r15)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = r2 - r3
            androidx.core.widget.C0386d.m2010a(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f1758i
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01b8
            android.widget.EdgeEffect r0 = r10.f1758i
            goto L_0x018c
        L_0x01b8:
            android.widget.EdgeEffect r0 = r10.f1758i
            if (r0 == 0) goto L_0x024a
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01ca
            android.widget.EdgeEffect r0 = r10.f1759j
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x024a
        L_0x01ca:
            p071f.p097h.p108m.C3379v.m13772H(r23)
            goto L_0x024a
        L_0x01cf:
            android.view.VelocityTracker r0 = r10.f1765p
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r10.f1770u
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r10.f1771v
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r10.f1769t
            if (r1 < r4) goto L_0x01f8
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r10.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x007b
            r10.dispatchNestedFling(r2, r1, r14)
            r10.mo2297b(r0)
            goto L_0x007b
        L_0x01f8:
            android.widget.OverScroller r15 = r10.f1757h
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x007b
            goto L_0x0078
        L_0x0214:
            int r0 = r23.getChildCount()
            if (r0 != 0) goto L_0x021b
            return r12
        L_0x021b:
            android.widget.OverScroller r0 = r10.f1757h
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r14
            r10.f1764o = r0
            if (r0 == 0) goto L_0x022f
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x022f
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x022f:
            android.widget.OverScroller r0 = r10.f1757h
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x023a
            r23.m1927a()
        L_0x023a:
            float r0 = r24.getY()
            int r0 = (int) r0
            r10.f1760k = r0
            int r0 = r11.getPointerId(r12)
            r10.f1771v = r0
            r10.mo2298b(r1, r12)
        L_0x024a:
            android.view.VelocityTracker r0 = r10.f1765p
            if (r0 == 0) goto L_0x0251
            r0.addMovement(r13)
        L_0x0251:
            r13.recycle()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f1761l) {
            m1936b(view2);
        } else {
            this.f1763n = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m1931a(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m1946h();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f1761l = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int width = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int a = m1925a(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), width);
            int a2 = m1925a(i2, height, height2);
            if (a != getScrollX() || a2 != getScrollY()) {
                super.scrollTo(a, a2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f1766q) {
            this.f1766q = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f1752C.mo10817a(z);
    }

    public void setOnScrollChangeListener(C0378b bVar) {
        this.f1754E = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f1767r = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return mo2298b(i, 0);
    }

    public void stopNestedScroll() {
        mo2315f(0);
    }
}
