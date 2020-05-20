package p147g.p153c.p154a.p155a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: g.c.a.a.b */
class C3718b {

    /* renamed from: a */
    private int f10540a = -1;

    /* renamed from: b */
    private int f10541b = 0;

    /* renamed from: c */
    private final ScaleGestureDetector f10542c;

    /* renamed from: d */
    private VelocityTracker f10543d;

    /* renamed from: e */
    private boolean f10544e;

    /* renamed from: f */
    private float f10545f;

    /* renamed from: g */
    private float f10546g;

    /* renamed from: h */
    private final float f10547h;

    /* renamed from: i */
    private final float f10548i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C3720c f10549j;

    /* renamed from: g.c.a.a.b$a */
    class C3719a implements OnScaleGestureListener {
        C3719a() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            C3718b.this.f10549j.mo11806a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    C3718b(Context context, C3720c cVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f10548i = (float) viewConfiguration.getScaledMinimumFlingVelocity();
        this.f10547h = (float) viewConfiguration.getScaledTouchSlop();
        this.f10549j = cVar;
        this.f10542c = new ScaleGestureDetector(context, new C3719a());
    }

    /* renamed from: b */
    private float m15196b(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f10541b);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    /* renamed from: c */
    private float m15197c(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f10541b);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r0 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00db, code lost:
        if (r0 != null) goto L_0x0048;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m15198d(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00df
            r4 = 0
            if (r0 == r2) goto L_0x008e
            r5 = 2
            if (r0 == r5) goto L_0x004f
            r5 = 3
            if (r0 == r5) goto L_0x0042
            r4 = 6
            if (r0 == r4) goto L_0x0019
            goto L_0x00fe
        L_0x0019:
            int r0 = r13.getAction()
            int r0 = p147g.p153c.p154a.p155a.C3736m.m15286a(r0)
            int r4 = r13.getPointerId(r0)
            int r5 = r12.f10540a
            if (r4 != r5) goto L_0x00fe
            if (r0 != 0) goto L_0x002d
            r0 = 1
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            int r4 = r13.getPointerId(r0)
            r12.f10540a = r4
            float r4 = r13.getX(r0)
            r12.f10545f = r4
            float r0 = r13.getY(r0)
            r12.f10546g = r0
            goto L_0x00fe
        L_0x0042:
            r12.f10540a = r1
            android.view.VelocityTracker r0 = r12.f10543d
            if (r0 == 0) goto L_0x00fe
        L_0x0048:
            r0.recycle()
            r12.f10543d = r4
            goto L_0x00fe
        L_0x004f:
            float r0 = r12.m15196b(r13)
            float r4 = r12.m15197c(r13)
            float r5 = r12.f10545f
            float r5 = r0 - r5
            float r6 = r12.f10546g
            float r6 = r4 - r6
            boolean r7 = r12.f10544e
            if (r7 != 0) goto L_0x0079
            float r7 = r5 * r5
            float r8 = r6 * r6
            float r7 = r7 + r8
            double r7 = (double) r7
            double r7 = java.lang.Math.sqrt(r7)
            float r9 = r12.f10547h
            double r9 = (double) r9
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0076
            r7 = 1
            goto L_0x0077
        L_0x0076:
            r7 = 0
        L_0x0077:
            r12.f10544e = r7
        L_0x0079:
            boolean r7 = r12.f10544e
            if (r7 == 0) goto L_0x00fe
            g.c.a.a.c r7 = r12.f10549j
            r7.mo11805a(r5, r6)
            r12.f10545f = r0
            r12.f10546g = r4
            android.view.VelocityTracker r0 = r12.f10543d
            if (r0 == 0) goto L_0x00fe
            r0.addMovement(r13)
            goto L_0x00fe
        L_0x008e:
            r12.f10540a = r1
            boolean r0 = r12.f10544e
            if (r0 == 0) goto L_0x00d9
            android.view.VelocityTracker r0 = r12.f10543d
            if (r0 == 0) goto L_0x00d9
            float r0 = r12.m15196b(r13)
            r12.f10545f = r0
            float r0 = r12.m15197c(r13)
            r12.f10546g = r0
            android.view.VelocityTracker r0 = r12.f10543d
            r0.addMovement(r13)
            android.view.VelocityTracker r0 = r12.f10543d
            r5 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r5)
            android.view.VelocityTracker r0 = r12.f10543d
            float r0 = r0.getXVelocity()
            android.view.VelocityTracker r5 = r12.f10543d
            float r5 = r5.getYVelocity()
            float r6 = java.lang.Math.abs(r0)
            float r7 = java.lang.Math.abs(r5)
            float r6 = java.lang.Math.max(r6, r7)
            float r7 = r12.f10548i
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L_0x00d9
            g.c.a.a.c r6 = r12.f10549j
            float r7 = r12.f10545f
            float r8 = r12.f10546g
            float r0 = -r0
            float r5 = -r5
            r6.mo11807a(r7, r8, r0, r5)
        L_0x00d9:
            android.view.VelocityTracker r0 = r12.f10543d
            if (r0 == 0) goto L_0x00fe
            goto L_0x0048
        L_0x00df:
            int r0 = r13.getPointerId(r3)
            r12.f10540a = r0
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f10543d = r0
            if (r0 == 0) goto L_0x00f0
            r0.addMovement(r13)
        L_0x00f0:
            float r0 = r12.m15196b(r13)
            r12.f10545f = r0
            float r0 = r12.m15197c(r13)
            r12.f10546g = r0
            r12.f10544e = r3
        L_0x00fe:
            int r0 = r12.f10540a
            if (r0 == r1) goto L_0x0103
            r3 = r0
        L_0x0103:
            int r13 = r13.findPointerIndex(r3)
            r12.f10541b = r13
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p153c.p154a.p155a.C3718b.m15198d(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public boolean mo11799a() {
        return this.f10544e;
    }

    /* renamed from: a */
    public boolean mo11800a(MotionEvent motionEvent) {
        try {
            this.f10542c.onTouchEvent(motionEvent);
            return m15198d(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo11801b() {
        return this.f10542c.isInProgress();
    }
}
