package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import p071f.p097h.p108m.C3379v;

/* renamed from: com.google.android.material.appbar.a */
abstract class C2543a<V extends View> extends C2546c<V> {

    /* renamed from: d */
    private Runnable f7171d;

    /* renamed from: e */
    OverScroller f7172e;

    /* renamed from: f */
    private boolean f7173f;

    /* renamed from: g */
    private int f7174g = -1;

    /* renamed from: h */
    private int f7175h;

    /* renamed from: i */
    private int f7176i = -1;

    /* renamed from: j */
    private VelocityTracker f7177j;

    /* renamed from: com.google.android.material.appbar.a$a */
    private class C2544a implements Runnable {

        /* renamed from: f */
        private final CoordinatorLayout f7178f;

        /* renamed from: g */
        private final V f7179g;

        C2544a(CoordinatorLayout coordinatorLayout, V v) {
            this.f7178f = coordinatorLayout;
            this.f7179g = v;
        }

        public void run() {
            if (this.f7179g != null) {
                OverScroller overScroller = C2543a.this.f7172e;
                if (overScroller == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    C2543a aVar = C2543a.this;
                    aVar.mo7931c(this.f7178f, this.f7179g, aVar.f7172e.getCurrY());
                    C3379v.m13794a((View) this.f7179g, (Runnable) this);
                    return;
                }
                C2543a.this.mo7913e(this.f7178f, this.f7179g);
            }
        }
    }

    public C2543a() {
    }

    public C2543a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: d */
    private void m10277d() {
        if (this.f7177j == null) {
            this.f7177j = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo7929a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo7907b(coordinatorLayout, v, mo7910c() - i, i2, i3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo7901a(V v);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo7930a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        V v2 = v;
        Runnable runnable = this.f7171d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f7171d = null;
        }
        if (this.f7172e == null) {
            this.f7172e = new OverScroller(v.getContext());
        }
        this.f7172e.fling(0, mo7940b(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f7172e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            C2544a aVar = new C2544a(coordinatorLayout, v);
            this.f7171d = aVar;
            C3379v.m13794a((View) v, (Runnable) aVar);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        mo7913e(coordinatorLayout, v);
        return false;
    }

    /* renamed from: a */
    public boolean mo2110a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f7176i < 0) {
            this.f7176i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f7173f) {
            int i = this.f7174g;
            if (i == -1) {
                return false;
            }
            int findPointerIndex = motionEvent.findPointerIndex(i);
            if (findPointerIndex == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f7175h) > this.f7176i) {
                this.f7175h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f7174g = -1;
            int y2 = (int) motionEvent.getY();
            boolean z = mo7901a(v) && coordinatorLayout.mo2052a((View) v, (int) motionEvent.getX(), y2);
            this.f7173f = z;
            if (z) {
                this.f7175h = y2;
                this.f7174g = motionEvent.getPointerId(0);
                m10277d();
                OverScroller overScroller = this.f7172e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f7172e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f7177j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract int mo7906b(V v);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract int mo7907b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2115b(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x004e
            r4 = 2
            if (r0 == r4) goto L_0x002d
            r12 = 3
            if (r0 == r12) goto L_0x0072
            r12 = 6
            if (r0 == r12) goto L_0x0013
            goto L_0x004c
        L_0x0013:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L_0x001b
            r12 = 1
            goto L_0x001c
        L_0x001b:
            r12 = 0
        L_0x001c:
            int r13 = r14.getPointerId(r12)
            r11.f7174g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f7175h = r12
            goto L_0x004c
        L_0x002d:
            int r0 = r11.f7174g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0036
            return r3
        L_0x0036:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f7175h
            int r7 = r1 - r0
            r11.f7175h = r0
            int r8 = r11.mo7906b(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.mo7929a(r5, (V) r6, r7, r8, r9)
        L_0x004c:
            r12 = 0
            goto L_0x0081
        L_0x004e:
            android.view.VelocityTracker r0 = r11.f7177j
            if (r0 == 0) goto L_0x0072
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f7177j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f7177j
            int r4 = r11.f7174g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo7911c(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.mo7930a(r6, (V) r7, r8, r9, r10)
            r12 = 1
            goto L_0x0073
        L_0x0072:
            r12 = 0
        L_0x0073:
            r11.f7173f = r3
            r11.f7174g = r1
            android.view.VelocityTracker r13 = r11.f7177j
            if (r13 == 0) goto L_0x0081
            r13.recycle()
            r13 = 0
            r11.f7177j = r13
        L_0x0081:
            android.view.VelocityTracker r13 = r11.f7177j
            if (r13 == 0) goto L_0x0088
            r13.addMovement(r14)
        L_0x0088:
            boolean r13 = r11.f7173f
            if (r13 != 0) goto L_0x0090
            if (r12 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r2 = 0
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.C2543a.mo2115b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract int mo7910c();

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract int mo7911c(V v);

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo7931c(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo7907b(coordinatorLayout, v, i, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public abstract void mo7913e(CoordinatorLayout coordinatorLayout, V v);
}
