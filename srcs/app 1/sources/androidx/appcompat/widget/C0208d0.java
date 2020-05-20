package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.C0142p;

/* renamed from: androidx.appcompat.widget.d0 */
public abstract class C0208d0 implements OnTouchListener, OnAttachStateChangeListener {

    /* renamed from: f */
    private final float f920f;

    /* renamed from: g */
    private final int f921g;

    /* renamed from: h */
    private final int f922h;

    /* renamed from: i */
    final View f923i;

    /* renamed from: j */
    private Runnable f924j;

    /* renamed from: k */
    private Runnable f925k;

    /* renamed from: l */
    private boolean f926l;

    /* renamed from: m */
    private int f927m;

    /* renamed from: n */
    private final int[] f928n = new int[2];

    /* renamed from: androidx.appcompat.widget.d0$a */
    private class C0209a implements Runnable {
        C0209a() {
        }

        public void run() {
            ViewParent parent = C0208d0.this.f923i.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.d0$b */
    private class C0210b implements Runnable {
        C0210b() {
        }

        public void run() {
            C0208d0.this.mo1315d();
        }
    }

    public C0208d0(View view) {
        this.f923i = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f920f = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f921g = tapTimeout;
        this.f922h = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private boolean m1037a(MotionEvent motionEvent) {
        View view = this.f923i;
        C0142p a = mo435a();
        if (a == null || !a.mo536a()) {
            return false;
        }
        C0192b0 b0Var = (C0192b0) a.mo544e();
        if (b0Var == null || !b0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m1039a(view, obtainNoHistory);
        m1041b(b0Var, obtainNoHistory);
        boolean a2 = b0Var.mo1268a(obtainNoHistory, this.f927m);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return a2 && (actionMasked != 1 && actionMasked != 3);
    }

    /* renamed from: a */
    private static boolean m1038a(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: a */
    private boolean m1039a(View view, MotionEvent motionEvent) {
        int[] iArr = this.f928n;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1040b(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f923i
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f927m
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f920f
            boolean r6 = m1038a(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.m1042e()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.m1042e()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f927m = r6
            java.lang.Runnable r6 = r5.f924j
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.d0$a r6 = new androidx.appcompat.widget.d0$a
            r6.<init>()
            r5.f924j = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f924j
            int r1 = r5.f921g
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f925k
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.d0$b r6 = new androidx.appcompat.widget.d0$b
            r6.<init>()
            r5.f925k = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f925k
            int r1 = r5.f922h
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0208d0.m1040b(android.view.MotionEvent):boolean");
    }

    /* renamed from: b */
    private boolean m1041b(View view, MotionEvent motionEvent) {
        int[] iArr = this.f928n;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: e */
    private void m1042e() {
        Runnable runnable = this.f925k;
        if (runnable != null) {
            this.f923i.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f924j;
        if (runnable2 != null) {
            this.f923i.removeCallbacks(runnable2);
        }
    }

    /* renamed from: a */
    public abstract C0142p mo435a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo436b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo1304c() {
        C0142p a = mo435a();
        if (a != null && a.mo536a()) {
            a.dismiss();
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1315d() {
        m1042e();
        View view = this.f923i;
        if (view.isEnabled() && !view.isLongClickable() && mo436b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f926l = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f926l;
        if (z2) {
            z = m1037a(motionEvent) || !mo1304c();
        } else {
            z = m1040b(motionEvent) && mo436b();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f923i.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f926l = z;
        return z || z2;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f926l = false;
        this.f927m = -1;
        Runnable runnable = this.f924j;
        if (runnable != null) {
            this.f923i.removeCallbacks(runnable);
        }
    }
}
