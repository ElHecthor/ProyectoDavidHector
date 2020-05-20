package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0331b;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0332c;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0335f;
import androidx.core.graphics.drawable.C0371a;
import com.google.android.material.internal.C2714i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p071f.p072a.p073k.p074a.C3103a;
import p071f.p097h.p103h.C3276a;
import p071f.p097h.p107l.C3316c;
import p071f.p097h.p108m.C3343e0;
import p071f.p097h.p108m.C3369l;
import p071f.p097h.p108m.C3375r;
import p071f.p097h.p108m.C3379v;
import p071f.p112j.p113a.C3400a;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4408d;
import p147g.p156d.p157a.p185c.C4411g;
import p147g.p156d.p157a.p185c.C4415k;
import p147g.p156d.p157a.p185c.C4416l;
import p147g.p156d.p157a.p185c.p187b0.C4382g;
import p147g.p156d.p157a.p185c.p187b0.C4386h;
import p147g.p156d.p157a.p185c.p189m.C4417a;

public class AppBarLayout extends LinearLayout implements C0331b {

    /* renamed from: f */
    private int f7135f;

    /* renamed from: g */
    private int f7136g;

    /* renamed from: h */
    private int f7137h;

    /* renamed from: i */
    private int f7138i;

    /* renamed from: j */
    private boolean f7139j;

    /* renamed from: k */
    private int f7140k;

    /* renamed from: l */
    private C3343e0 f7141l;

    /* renamed from: m */
    private List<C2540c> f7142m;

    /* renamed from: n */
    private boolean f7143n;

    /* renamed from: o */
    private boolean f7144o;

    /* renamed from: p */
    private boolean f7145p;

    /* renamed from: q */
    private boolean f7146q;

    /* renamed from: r */
    private int f7147r;

    /* renamed from: s */
    private WeakReference<View> f7148s;

    /* renamed from: t */
    private ValueAnimator f7149t;

    /* renamed from: u */
    private int[] f7150u;

    /* renamed from: v */
    private Drawable f7151v;

    protected static class BaseBehavior<T extends AppBarLayout> extends C2543a<T> {
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f7152k;

        /* renamed from: l */
        private int f7153l;

        /* renamed from: m */
        private ValueAnimator f7154m;

        /* renamed from: n */
        private int f7155n = -1;

        /* renamed from: o */
        private boolean f7156o;

        /* renamed from: p */
        private float f7157p;

        /* renamed from: q */
        private WeakReference<View> f7158q;

        /* renamed from: r */
        private C2535b f7159r;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        class C2534a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f7160a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f7161b;

            C2534a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f7160a = coordinatorLayout;
                this.f7161b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.mo7931c(this.f7160a, this.f7161b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        public static abstract class C2535b<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean mo7915a(T t);
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        protected static class C2536c extends C3400a {
            public static final Creator<C2536c> CREATOR = new C2537a();

            /* renamed from: h */
            int f7163h;

            /* renamed from: i */
            float f7164i;

            /* renamed from: j */
            boolean f7165j;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c$a */
            static class C2537a implements ClassLoaderCreator<C2536c> {
                C2537a() {
                }

                public C2536c createFromParcel(Parcel parcel) {
                    return new C2536c(parcel, null);
                }

                public C2536c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C2536c(parcel, classLoader);
                }

                public C2536c[] newArray(int i) {
                    return new C2536c[i];
                }
            }

            public C2536c(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f7163h = parcel.readInt();
                this.f7164i = parcel.readFloat();
                this.f7165j = parcel.readByte() != 0;
            }

            public C2536c(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f7163h);
                parcel.writeFloat(this.f7164i);
                parcel.writeByte(this.f7165j ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        private View m10222a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C3369l) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        private static View m10223a(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        private void m10224a(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int abs = Math.abs(mo7910c() - i);
            float abs2 = Math.abs(f);
            m10225a(coordinatorLayout, t, i, abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f));
        }

        /* renamed from: a */
        private void m10225a(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int c = mo7910c();
            if (c == i) {
                ValueAnimator valueAnimator = this.f7154m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f7154m.cancel();
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f7154m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f7154m = valueAnimator3;
                valueAnimator3.setInterpolator(C4417a.f11716e);
                this.f7154m.addUpdateListener(new C2534a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f7154m.setDuration((long) Math.min(i2, 600));
            this.f7154m.setIntValues(new int[]{c, i});
            this.f7154m.start();
        }

        /* renamed from: a */
        private void m10226a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View a = m10223a((AppBarLayout) t, i);
            if (a != null) {
                int a2 = ((C2541d) a.getLayoutParams()).mo7924a();
                boolean z2 = false;
                if ((a2 & 1) != 0) {
                    int q = C3379v.m13830q(a);
                    if (i2 <= 0 || (a2 & 12) == 0 ? !((a2 & 2) == 0 || (-i) < (a.getBottom() - q) - t.getTopInset()) : (-i) >= (a.getBottom() - q) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.mo7861c()) {
                    z2 = t.mo7856a(m10222a(coordinatorLayout));
                }
                boolean a3 = t.mo7857a(z2);
                if (z || (a3 && m10231c(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        /* renamed from: a */
        private static boolean m10227a(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: a */
        private boolean m10228a(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.mo7860b() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: b */
        private int m10229b(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C2541d dVar = (C2541d) childAt.getLayoutParams();
                if (m10227a(dVar.mo7924a(), 32)) {
                    top -= dVar.topMargin;
                    bottom += dVar.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: c */
        private int m10230c(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                C2541d dVar = (C2541d) childAt.getLayoutParams();
                Interpolator b = dVar.mo7925b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b != null) {
                    int a = dVar.mo7924a();
                    if ((a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + dVar.topMargin + dVar.bottomMargin;
                        if ((a & 2) != 0) {
                            i2 -= C3379v.m13830q(childAt);
                        }
                    }
                    if (C3379v.m13826m(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: c */
        private boolean m10231c(CoordinatorLayout coordinatorLayout, T t) {
            List c = coordinatorLayout.mo2057c((View) t);
            int size = c.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                C0332c d = ((C0335f) ((View) c.get(i)).getLayoutParams()).mo2138d();
                if (d instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) d).mo7936c() != 0) {
                        z = true;
                    }
                    return z;
                }
            }
            return false;
        }

        /* renamed from: d */
        private void m10232d(CoordinatorLayout coordinatorLayout, T t) {
            int c = mo7910c();
            int b = m10229b(t, c);
            if (b >= 0) {
                View childAt = t.getChildAt(b);
                C2541d dVar = (C2541d) childAt.getLayoutParams();
                int a = dVar.mo7924a();
                if ((a & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (b == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (m10227a(a, 2)) {
                        i2 += C3379v.m13830q(childAt);
                    } else if (m10227a(a, 5)) {
                        int q = C3379v.m13830q(childAt) + i2;
                        if (c < q) {
                            i = q;
                        } else {
                            i2 = q;
                        }
                    }
                    if (m10227a(a, 32)) {
                        i += dVar.topMargin;
                        i2 -= dVar.bottomMargin;
                    }
                    if (c < (i2 + i) / 2) {
                        i = i2;
                    }
                    m10224a(coordinatorLayout, t, C3276a.m13438a(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo7907b(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int c = mo7910c();
            int i4 = 0;
            if (i2 == 0 || c < i2 || c > i3) {
                this.f7152k = 0;
            } else {
                int a = C3276a.m13438a(i, i2, i3);
                if (c != a) {
                    int c2 = t.mo7855a() ? m10230c(t, a) : a;
                    boolean a2 = mo7939a(c2);
                    i4 = c - a;
                    this.f7152k = a - c2;
                    if (!a2 && t.mo7855a()) {
                        coordinatorLayout.mo2047a((View) t);
                    }
                    t.mo7851a(mo7940b());
                    m10226a(coordinatorLayout, t, a, a < c ? -1 : 1, false);
                }
            }
            return i4;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7913e(CoordinatorLayout coordinatorLayout, T t) {
            m10232d(coordinatorLayout, t);
            if (t.mo7861c()) {
                t.mo7857a(t.mo7856a(m10222a(coordinatorLayout)));
            }
        }

        /* renamed from: a */
        public void mo2096a(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof C2536c) {
                C2536c cVar = (C2536c) parcelable;
                super.mo2096a(coordinatorLayout, t, cVar.mo10880a());
                this.f7155n = cVar.f7163h;
                this.f7157p = cVar.f7164i;
                this.f7156o = cVar.f7165j;
                return;
            }
            super.mo2096a(coordinatorLayout, t, parcelable);
            this.f7155n = -1;
        }

        /* renamed from: a */
        public void mo2097a(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f7153l == 0 || i == 1) {
                m10232d(coordinatorLayout, t);
                if (t.mo7861c()) {
                    t.mo7857a(t.mo7856a(view));
                }
            }
            this.f7158q = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo2100a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = mo7929a(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
        }

        /* renamed from: a */
        public void mo2102a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo7929a(coordinatorLayout, t, i2, i5, i4);
                }
            }
            if (t.mo7861c()) {
                t.mo7857a(t.mo7856a(view));
            }
        }

        /* renamed from: a */
        public boolean mo2106a(CoordinatorLayout coordinatorLayout, T t, int i) {
            boolean a = super.mo2106a(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i2 = this.f7155n;
            if (i2 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i2);
                mo7931c(coordinatorLayout, t, (-childAt.getBottom()) + (this.f7156o ? C3379v.m13830q(childAt) + t.getTopInset() : Math.round(((float) childAt.getHeight()) * this.f7157p)));
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i3 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m10224a(coordinatorLayout, t, i3, 0.0f);
                    } else {
                        mo7931c(coordinatorLayout, t, i3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m10224a(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        mo7931c(coordinatorLayout, t, 0);
                    }
                }
            }
            t.mo7863d();
            this.f7155n = -1;
            mo7939a(C3276a.m13438a(mo7940b(), -t.getTotalScrollRange(), 0));
            m10226a(coordinatorLayout, t, mo7940b(), 0, true);
            t.mo7851a(mo7940b());
            return a;
        }

        /* renamed from: a */
        public boolean mo2107a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((C0335f) t.getLayoutParams()).height != -2) {
                return super.mo2107a(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.mo2048a((View) t, i, i2, MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public boolean mo2118b(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            boolean z = (i & 2) != 0 && (t.mo7861c() || m10228a(coordinatorLayout, t, view));
            if (z) {
                ValueAnimator valueAnimator = this.f7154m;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            this.f7158q = null;
            this.f7153l = i2;
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo7901a(T t) {
            C2535b bVar = this.f7159r;
            if (bVar != null) {
                return bVar.mo7915a(t);
            }
            WeakReference<View> weakReference = this.f7158q;
            boolean z = true;
            if (weakReference != null) {
                View view = (View) weakReference.get();
                if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                    z = false;
                }
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo7906b(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* renamed from: b */
        public Parcelable mo2121d(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable d = super.mo2121d(coordinatorLayout, t);
            int b = mo7940b();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + b;
                if (childAt.getTop() + b > 0 || bottom < 0) {
                    i++;
                } else {
                    C2536c cVar = new C2536c(d);
                    cVar.f7163h = i;
                    if (bottom == C3379v.m13830q(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    cVar.f7165j = z;
                    cVar.f7164i = ((float) bottom) / ((float) childAt.getHeight());
                    return cVar;
                }
            }
            return d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo7910c() {
            return mo7940b() + this.f7152k;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo7911c(T t) {
            return t.getTotalScrollRange();
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends C2545b {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4416l.ScrollingViewBehavior_Layout);
            mo7934b(obtainStyledAttributes.getDimensionPixelSize(C4416l.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private static int m10261a(AppBarLayout appBarLayout) {
            C0332c d = ((C0335f) appBarLayout.getLayoutParams()).mo2138d();
            if (d instanceof BaseBehavior) {
                return ((BaseBehavior) d).mo7910c();
            }
            return 0;
        }

        /* renamed from: a */
        private void m10262a(View view, View view2) {
            C0332c d = ((C0335f) view2.getLayoutParams()).mo2138d();
            if (d instanceof BaseBehavior) {
                C3379v.m13814e(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) d).f7152k) + mo7937d()) - mo7933a(view2));
            }
        }

        /* renamed from: b */
        private void m10263b(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.mo7861c()) {
                    appBarLayout.mo7857a(appBarLayout.mo7856a(view));
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public AppBarLayout m10265a(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public boolean mo2109a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout a = mo7919a(coordinatorLayout.mo2053b(view));
            if (a != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f7181d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    a.mo7854a(false, !z);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo2111a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public float mo7920b(View view) {
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int a = m10261a(appBarLayout);
                if (downNestedPreScrollRange != 0 && totalScrollRange + a <= downNestedPreScrollRange) {
                    return 0.0f;
                }
                int i = totalScrollRange - downNestedPreScrollRange;
                if (i != 0) {
                    return (((float) a) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* renamed from: b */
        public boolean mo2116b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m10262a(view, view2);
            m10263b(view, view2);
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo7921c(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.mo7921c(view);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    class C2538a implements C3375r {
        C2538a() {
        }

        /* renamed from: a */
        public C3343e0 mo325a(View view, C3343e0 e0Var) {
            AppBarLayout.this.mo7850a(e0Var);
            return e0Var;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    class C2539b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C4382g f7167a;

        C2539b(AppBarLayout appBarLayout, C4382g gVar) {
            this.f7167a = gVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f7167a.mo13064b(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public interface C2540c<T extends AppBarLayout> {
        /* renamed from: a */
        void mo7923a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public static class C2541d extends LayoutParams {

        /* renamed from: a */
        int f7168a = 1;

        /* renamed from: b */
        Interpolator f7169b;

        public C2541d(int i, int i2) {
            super(i, i2);
        }

        public C2541d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4416l.AppBarLayout_Layout);
            this.f7168a = obtainStyledAttributes.getInt(C4416l.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(C4416l.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f7169b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(C4416l.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public C2541d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C2541d(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C2541d(LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public int mo7924a() {
            return this.f7168a;
        }

        /* renamed from: b */
        public Interpolator mo7925b() {
            return this.f7169b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo7926c() {
            int i = this.f7168a;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$e */
    public interface C2542e extends C2540c<AppBarLayout> {
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4375b.appBarLayoutStyle);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7136g = -1;
        this.f7137h = -1;
        this.f7138i = -1;
        this.f7140k = 0;
        setOrientation(1);
        if (VERSION.SDK_INT >= 21) {
            C2548e.m10309a(this);
            C2548e.m10311a(this, attributeSet, i, C4415k.Widget_Design_AppBarLayout);
        }
        TypedArray c = C2714i.m11283c(context, attributeSet, C4416l.AppBarLayout, i, C4415k.Widget_Design_AppBarLayout, new int[0]);
        C3379v.m13787a((View) this, c.getDrawable(C4416l.AppBarLayout_android_background));
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C4382g gVar = new C4382g();
            gVar.mo13059a(ColorStateList.valueOf(colorDrawable.getColor()));
            gVar.mo13058a(context);
            C3379v.m13787a((View) this, (Drawable) gVar);
        }
        if (c.hasValue(C4416l.AppBarLayout_expanded)) {
            m10199a(c.getBoolean(C4416l.AppBarLayout_expanded, false), false, false);
        }
        if (VERSION.SDK_INT >= 21 && c.hasValue(C4416l.AppBarLayout_elevation)) {
            C2548e.m10310a(this, (float) c.getDimensionPixelSize(C4416l.AppBarLayout_elevation, 0));
        }
        if (VERSION.SDK_INT >= 26) {
            if (c.hasValue(C4416l.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(c.getBoolean(C4416l.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (c.hasValue(C4416l.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(c.getBoolean(C4416l.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.f7146q = c.getBoolean(C4416l.AppBarLayout_liftOnScroll, false);
        this.f7147r = c.getResourceId(C4416l.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(c.getDrawable(C4416l.AppBarLayout_statusBarForeground));
        c.recycle();
        C3379v.m13792a((View) this, (C3375r) new C2538a());
    }

    /* renamed from: a */
    private void m10198a(C4382g gVar, boolean z) {
        float dimension = getResources().getDimension(C4408d.design_appbar_elevation);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f7149t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, dimension});
        this.f7149t = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(C4411g.app_bar_elevation_anim_duration));
        this.f7149t.setInterpolator(C4417a.f11712a);
        this.f7149t.addUpdateListener(new C2539b(this, gVar));
        this.f7149t.start();
    }

    /* renamed from: a */
    private void m10199a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f7140k = i2 | i;
        requestLayout();
    }

    /* renamed from: b */
    private View m10200b(View view) {
        if (this.f7148s == null) {
            int i = this.f7147r;
            if (i != -1) {
                View findViewById = view != null ? view.findViewById(i) : null;
                if (findViewById == null && (getParent() instanceof ViewGroup)) {
                    findViewById = ((ViewGroup) getParent()).findViewById(this.f7147r);
                }
                if (findViewById != null) {
                    this.f7148s = new WeakReference<>(findViewById);
                }
            }
        }
        WeakReference<View> weakReference = this.f7148s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    private boolean m10201b(boolean z) {
        if (this.f7144o == z) {
            return false;
        }
        this.f7144o = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: e */
    private void m10202e() {
        WeakReference<View> weakReference = this.f7148s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f7148s = null;
    }

    /* renamed from: f */
    private boolean m10203f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C2541d) getChildAt(i).getLayoutParams()).mo7926c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private void m10204g() {
        this.f7136g = -1;
        this.f7137h = -1;
        this.f7138i = -1;
    }

    /* renamed from: h */
    private boolean m10205h() {
        return this.f7151v != null && getTopInset() > 0;
    }

    /* renamed from: i */
    private boolean m10206i() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return childAt.getVisibility() != 8 && !C3379v.m13826m(childAt);
    }

    /* renamed from: j */
    private void m10207j() {
        setWillNotDraw(!m10205h());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3343e0 mo7850a(C3343e0 e0Var) {
        C3343e0 e0Var2 = C3379v.m13826m(this) ? e0Var : null;
        if (!C3316c.m13532a(this.f7141l, e0Var2)) {
            this.f7141l = e0Var2;
            m10207j();
            requestLayout();
        }
        return e0Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7851a(int i) {
        this.f7135f = i;
        if (!willNotDraw()) {
            C3379v.m13772H(this);
        }
        List<C2540c> list = this.f7142m;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C2540c cVar = (C2540c) this.f7142m.get(i2);
                if (cVar != null) {
                    cVar.mo7923a(this, i);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo7852a(C2540c cVar) {
        if (this.f7142m == null) {
            this.f7142m = new ArrayList();
        }
        if (cVar != null && !this.f7142m.contains(cVar)) {
            this.f7142m.add(cVar);
        }
    }

    /* renamed from: a */
    public void mo7853a(C2542e eVar) {
        mo7852a((C2540c) eVar);
    }

    /* renamed from: a */
    public void mo7854a(boolean z, boolean z2) {
        m10199a(z, z2, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo7855a() {
        return this.f7139j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo7856a(View view) {
        View b = m10200b(view);
        if (b != null) {
            view = b;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo7857a(boolean z) {
        if (this.f7145p == z) {
            return false;
        }
        this.f7145p = z;
        refreshDrawableState();
        if (this.f7146q && (getBackground() instanceof C4382g)) {
            m10198a((C4382g) getBackground(), z);
        }
        return true;
    }

    /* renamed from: b */
    public void mo7858b(C2540c cVar) {
        List<C2540c> list = this.f7142m;
        if (list != null && cVar != null) {
            list.remove(cVar);
        }
    }

    /* renamed from: b */
    public void mo7859b(C2542e eVar) {
        mo7858b((C2540c) eVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo7860b() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: c */
    public boolean mo7861c() {
        return this.f7146q;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2541d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo7863d() {
        this.f7140k = 0;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m10205h()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f7135f));
            this.f7151v.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f7151v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public C2541d generateDefaultLayoutParams() {
        return new C2541d(-1, -2);
    }

    public C2541d generateLayoutParams(AttributeSet attributeSet) {
        return new C2541d(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C2541d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (VERSION.SDK_INT < 19 || !(layoutParams instanceof LayoutParams)) ? layoutParams instanceof MarginLayoutParams ? new C2541d((MarginLayoutParams) layoutParams) : new C2541d(layoutParams) : new C2541d((LayoutParams) layoutParams);
    }

    public C0332c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    /* access modifiers changed from: 0000 */
    public int getDownNestedPreScrollRange() {
        int i;
        int q;
        int i2 = this.f7137h;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C2541d dVar = (C2541d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = dVar.f7168a;
            if ((i4 & 5) == 5) {
                int i5 = dVar.topMargin + dVar.bottomMargin;
                if ((i4 & 8) != 0) {
                    q = C3379v.m13830q(childAt);
                } else if ((i4 & 2) != 0) {
                    q = measuredHeight - C3379v.m13830q(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && C3379v.m13826m(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + q;
                i = Math.min(i, measuredHeight - getTopInset());
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f7137h = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public int getDownNestedScrollRange() {
        int i = this.f7138i;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C2541d dVar = (C2541d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + dVar.topMargin + dVar.bottomMargin;
            int i4 = dVar.f7168a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C3379v.m13830q(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f7138i = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f7147r;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int q = C3379v.m13830q(this);
        if (q == 0) {
            int childCount = getChildCount();
            q = childCount >= 1 ? C3379v.m13830q(getChildAt(childCount - 1)) : 0;
            if (q == 0) {
                return getHeight() / 3;
            }
        }
        return (q * 2) + topInset;
    }

    /* access modifiers changed from: 0000 */
    public int getPendingAction() {
        return this.f7140k;
    }

    public Drawable getStatusBarForeground() {
        return this.f7151v;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    public final int getTopInset() {
        C3343e0 e0Var = this.f7141l;
        if (e0Var != null) {
            return e0Var.mo10733d();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f7136g;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C2541d dVar = (C2541d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = dVar.f7168a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + dVar.topMargin + dVar.bottomMargin;
            if (i2 == 0 && C3379v.m13826m(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= C3379v.m13830q(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f7136g = max;
        return max;
    }

    /* access modifiers changed from: 0000 */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4386h.m17875a((View) this);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.f7150u == null) {
            this.f7150u = new int[4];
        }
        int[] iArr = this.f7150u;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f7144o ? C4375b.state_liftable : -C4375b.state_liftable;
        iArr[1] = (!this.f7144o || !this.f7145p) ? -C4375b.state_lifted : C4375b.state_lifted;
        iArr[2] = this.f7144o ? C4375b.state_collapsible : -C4375b.state_collapsible;
        iArr[3] = (!this.f7144o || !this.f7145p) ? -C4375b.state_collapsed : C4375b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m10202e();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (C3379v.m13826m(this) && m10206i()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C3379v.m13814e(getChildAt(childCount), topInset);
            }
        }
        m10204g();
        this.f7139j = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C2541d) getChildAt(i5).getLayoutParams()).mo7925b() != null) {
                this.f7139j = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f7151v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f7143n) {
            if (!this.f7146q && !m10203f()) {
                z2 = false;
            }
            m10201b(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C3379v.m13826m(this) && m10206i()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C3276a.m13438a(getMeasuredHeight() + getTopInset(), 0, MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m10204g();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C4386h.m17876a((View) this, f);
    }

    public void setExpanded(boolean z) {
        mo7854a(z, C3379v.m13768D(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f7146q = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f7147r = i;
        m10202e();
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f7151v;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f7151v = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f7151v.setState(getDrawableState());
                }
                C0371a.m1904a(this.f7151v, C3379v.m13829p(this));
                this.f7151v.setVisible(getVisibility() == 0, false);
                this.f7151v.setCallback(this);
            }
            m10207j();
            C3379v.m13772H(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C3103a.m12557c(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (VERSION.SDK_INT >= 21) {
            C2548e.m10310a(this, f);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f7151v;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7151v;
    }
}
