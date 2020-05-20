package p071f.p112j.p114b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import p071f.p097h.p108m.C3379v;

/* renamed from: f.j.b.c */
public class C3411c {

    /* renamed from: w */
    private static final Interpolator f9640w = new C3412a();

    /* renamed from: a */
    private int f9641a;

    /* renamed from: b */
    private int f9642b;

    /* renamed from: c */
    private int f9643c = -1;

    /* renamed from: d */
    private float[] f9644d;

    /* renamed from: e */
    private float[] f9645e;

    /* renamed from: f */
    private float[] f9646f;

    /* renamed from: g */
    private float[] f9647g;

    /* renamed from: h */
    private int[] f9648h;

    /* renamed from: i */
    private int[] f9649i;

    /* renamed from: j */
    private int[] f9650j;

    /* renamed from: k */
    private int f9651k;

    /* renamed from: l */
    private VelocityTracker f9652l;

    /* renamed from: m */
    private float f9653m;

    /* renamed from: n */
    private float f9654n;

    /* renamed from: o */
    private int f9655o;

    /* renamed from: p */
    private int f9656p;

    /* renamed from: q */
    private OverScroller f9657q;

    /* renamed from: r */
    private final C3414c f9658r;

    /* renamed from: s */
    private View f9659s;

    /* renamed from: t */
    private boolean f9660t;

    /* renamed from: u */
    private final ViewGroup f9661u;

    /* renamed from: v */
    private final Runnable f9662v = new C3413b();

    /* renamed from: f.j.b.c$a */
    static class C3412a implements Interpolator {
        C3412a() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: f.j.b.c$b */
    class C3413b implements Runnable {
        C3413b() {
        }

        public void run() {
            C3411c.this.mo10912b(0);
        }
    }

    /* renamed from: f.j.b.c$c */
    public static abstract class C3414c {
        /* renamed from: a */
        public int mo10920a(int i) {
            return i;
        }

        /* renamed from: a */
        public int mo7954a(View view) {
            return 0;
        }

        /* renamed from: a */
        public abstract int mo7955a(View view, int i, int i2);

        /* renamed from: a */
        public void mo10921a(int i, int i2) {
        }

        /* renamed from: a */
        public abstract void mo7956a(View view, float f, float f2);

        /* renamed from: a */
        public void mo7957a(View view, int i) {
        }

        /* renamed from: a */
        public abstract void mo7958a(View view, int i, int i2, int i3, int i4);

        /* renamed from: b */
        public int mo8127b(View view) {
            return 0;
        }

        /* renamed from: b */
        public abstract int mo7959b(View view, int i, int i2);

        /* renamed from: b */
        public void mo10922b(int i, int i2) {
        }

        /* renamed from: b */
        public boolean mo10923b(int i) {
            return false;
        }

        /* renamed from: b */
        public abstract boolean mo7960b(View view, int i);

        /* renamed from: c */
        public abstract void mo7961c(int i);
    }

    private C3411c(Context context, ViewGroup viewGroup, C3414c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f9661u = viewGroup;
            this.f9658r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f9655o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f9642b = viewConfiguration.getScaledTouchSlop();
            this.f9653m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f9654n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f9657q = new OverScroller(context, f9640w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    private float m13973a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: a */
    private float m13974a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs <= f3) {
            return f;
        }
        if (f <= 0.0f) {
            f3 = -f3;
        }
        return f3;
    }

    /* renamed from: a */
    private int m13975a(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i <= 0) {
            i3 = -i3;
        }
        return i3;
    }

    /* renamed from: a */
    private int m13976a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int a = m13975a(i3, (int) this.f9654n, (int) this.f9653m);
        int a2 = m13975a(i4, (int) this.f9654n, (int) this.f9653m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(a);
        int abs4 = Math.abs(a2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (a != 0) {
            f2 = (float) abs3;
            f = (float) i5;
        } else {
            f2 = (float) abs;
            f = (float) i6;
        }
        float f5 = f2 / f;
        if (a2 != 0) {
            f4 = (float) abs4;
            f3 = (float) i5;
        } else {
            f4 = (float) abs2;
            f3 = (float) i6;
        }
        float f6 = f4 / f3;
        return (int) ((((float) m13984b(i, a, this.f9658r.mo7954a(view))) * f5) + (((float) m13984b(i2, a2, this.f9658r.mo8127b(view))) * f6));
    }

    /* renamed from: a */
    public static C3411c m13977a(ViewGroup viewGroup, float f, C3414c cVar) {
        C3411c a = m13978a(viewGroup, cVar);
        a.f9642b = (int) (((float) a.f9642b) * (1.0f / f));
        return a;
    }

    /* renamed from: a */
    public static C3411c m13978a(ViewGroup viewGroup, C3414c cVar) {
        return new C3411c(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: a */
    private void m13979a(float f, float f2) {
        this.f9660t = true;
        this.f9658r.mo7956a(this.f9659s, f, f2);
        this.f9660t = false;
        if (this.f9641a == 1) {
            mo10912b(0);
        }
    }

    /* renamed from: a */
    private void m13980a(float f, float f2, int i) {
        int i2 = 1;
        if (!m13982a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m13982a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m13982a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m13982a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f9649i;
            iArr[i] = iArr[i] | i2;
            this.f9658r.mo10921a(i2, i);
        }
    }

    /* renamed from: a */
    private void m13981a(int i, int i2, int i3, int i4) {
        int left = this.f9659s.getLeft();
        int top = this.f9659s.getTop();
        if (i3 != 0) {
            i = this.f9658r.mo7955a(this.f9659s, i, i3);
            C3379v.m13811d(this.f9659s, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f9658r.mo7959b(this.f9659s, i2, i4);
            C3379v.m13814e(this.f9659s, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f9658r.mo7958a(this.f9659s, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: a */
    private boolean m13982a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        boolean z = false;
        if (!((this.f9648h[i] & i2) != i2 || (this.f9656p & i2) == 0 || (this.f9650j[i] & i2) == i2 || (this.f9649i[i] & i2) == i2)) {
            int i3 = this.f9642b;
            if (abs > ((float) i3) || abs2 > ((float) i3)) {
                if (abs < abs2 * 0.5f && this.f9658r.mo10923b(i2)) {
                    int[] iArr = this.f9650j;
                    iArr[i] = iArr[i] | i2;
                    return false;
                } else if ((this.f9649i[i] & i2) == 0 && abs > ((float) this.f9642b)) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    private boolean m13983a(View view, float f, float f2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        boolean z2 = this.f9658r.mo7954a(view) > 0;
        boolean z3 = this.f9658r.mo8127b(view) > 0;
        if (z2 && z3) {
            float f3 = (f * f) + (f2 * f2);
            int i = this.f9642b;
            if (f3 > ((float) (i * i))) {
                z = true;
            }
            return z;
        } else if (z2) {
            if (Math.abs(f) > ((float) this.f9642b)) {
                z = true;
            }
            return z;
        } else {
            if (z3 && Math.abs(f2) > ((float) this.f9642b)) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: b */
    private int m13984b(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f9661u.getWidth();
        float f = (float) (width / 2);
        float a = f + (m13973a(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(a / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: b */
    private void m13985b(float f, float f2, int i) {
        m13992d(i);
        float[] fArr = this.f9644d;
        this.f9646f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f9645e;
        this.f9647g[i] = f2;
        fArr2[i] = f2;
        this.f9648h[i] = m13990d((int) f, (int) f2);
        this.f9651k |= 1 << i;
    }

    /* renamed from: b */
    private boolean m13986b(int i, int i2, int i3, int i4) {
        int left = this.f9659s.getLeft();
        int top = this.f9659s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f9657q.abortAnimation();
            mo10912b(0);
            return false;
        }
        this.f9657q.startScroll(left, top, i5, i6, m13976a(this.f9659s, i5, i6, i3, i4));
        mo10912b(2);
        return true;
    }

    /* renamed from: c */
    private void m13987c() {
        float[] fArr = this.f9644d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f9645e, 0.0f);
            Arrays.fill(this.f9646f, 0.0f);
            Arrays.fill(this.f9647g, 0.0f);
            Arrays.fill(this.f9648h, 0);
            Arrays.fill(this.f9649i, 0);
            Arrays.fill(this.f9650j, 0);
            this.f9651k = 0;
        }
    }

    /* renamed from: c */
    private void m13988c(int i) {
        if (this.f9644d != null && mo10908a(i)) {
            this.f9644d[i] = 0.0f;
            this.f9645e[i] = 0.0f;
            this.f9646f[i] = 0.0f;
            this.f9647g[i] = 0.0f;
            this.f9648h[i] = 0;
            this.f9649i[i] = 0;
            this.f9650j[i] = 0;
            this.f9651k = (~(1 << i)) & this.f9651k;
        }
    }

    /* renamed from: c */
    private void m13989c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m13993e(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f9646f[pointerId] = x;
                this.f9647g[pointerId] = y;
            }
        }
    }

    /* renamed from: d */
    private int m13990d(int i, int i2) {
        int i3 = i < this.f9661u.getLeft() + this.f9655o ? 1 : 0;
        if (i2 < this.f9661u.getTop() + this.f9655o) {
            i3 |= 4;
        }
        if (i > this.f9661u.getRight() - this.f9655o) {
            i3 |= 2;
        }
        return i2 > this.f9661u.getBottom() - this.f9655o ? i3 | 8 : i3;
    }

    /* renamed from: d */
    private void m13991d() {
        this.f9652l.computeCurrentVelocity(1000, this.f9653m);
        m13979a(m13974a(this.f9652l.getXVelocity(this.f9643c), this.f9654n, this.f9653m), m13974a(this.f9652l.getYVelocity(this.f9643c), this.f9654n, this.f9653m));
    }

    /* renamed from: d */
    private void m13992d(int i) {
        float[] fArr = this.f9644d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            float[] fArr6 = this.f9644d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f9645e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f9646f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f9647g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f9648h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f9649i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f9650j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f9644d = fArr2;
            this.f9645e = fArr3;
            this.f9646f = fArr4;
            this.f9647g = fArr5;
            this.f9648h = iArr;
            this.f9649i = iArr2;
            this.f9650j = iArr3;
        }
    }

    /* renamed from: e */
    private boolean m13993e(int i) {
        if (mo10908a(i)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Ignoring pointerId=");
        sb.append(i);
        sb.append(" because ACTION_DOWN was not received ");
        sb.append("for this pointer before ACTION_MOVE. It likely happened because ");
        sb.append(" ViewDragHelper did not receive all the events in the event stream.");
        Log.e("ViewDragHelper", sb.toString());
        return false;
    }

    /* renamed from: a */
    public View mo10904a(int i, int i2) {
        for (int childCount = this.f9661u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f9661u;
            this.f9658r.mo10920a(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo10905a() {
        this.f9643c = -1;
        m13987c();
        VelocityTracker velocityTracker = this.f9652l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f9652l = null;
        }
    }

    /* renamed from: a */
    public void mo10906a(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo10905a();
        }
        if (this.f9652l == null) {
            this.f9652l = VelocityTracker.obtain();
        }
        this.f9652l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f9641a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i2 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i2);
                            if (m13993e(pointerId)) {
                                float x = motionEvent.getX(i2);
                                float y = motionEvent.getY(i2);
                                float f = x - this.f9644d[pointerId];
                                float f2 = y - this.f9645e[pointerId];
                                m13980a(f, f2, pointerId);
                                if (this.f9641a != 1) {
                                    View a = mo10904a((int) x, (int) y);
                                    if (m13983a(a, f, f2) && mo10915b(a, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i2++;
                        }
                    } else if (m13993e(this.f9643c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f9643c);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f9646f;
                        int i3 = this.f9643c;
                        int i4 = (int) (x2 - fArr[i3]);
                        int i5 = (int) (y2 - this.f9647g[i3]);
                        m13981a(this.f9659s.getLeft() + i4, this.f9659s.getTop() + i5, i4, i5);
                    } else {
                        return;
                    }
                    m13989c(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x3 = motionEvent.getX(actionIndex);
                        float y3 = motionEvent.getY(actionIndex);
                        m13985b(x3, y3, pointerId2);
                        if (this.f9641a == 0) {
                            mo10915b(mo10904a((int) x3, (int) y3), pointerId2);
                            int i6 = this.f9648h[pointerId2];
                            int i7 = this.f9656p;
                            if ((i6 & i7) != 0) {
                                this.f9658r.mo10922b(i6 & i7, pointerId2);
                                return;
                            }
                            return;
                        } else if (mo10913b((int) x3, (int) y3)) {
                            mo10915b(this.f9659s, pointerId2);
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.f9641a == 1 && pointerId3 == this.f9643c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i2 >= pointerCount2) {
                                    i = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i2);
                                if (pointerId4 != this.f9643c) {
                                    View a2 = mo10904a((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                    View view = this.f9659s;
                                    if (a2 == view && mo10915b(view, pointerId4)) {
                                        i = this.f9643c;
                                        break;
                                    }
                                }
                                i2++;
                            }
                            if (i == -1) {
                                m13991d();
                            }
                        }
                        m13988c(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f9641a == 1) {
                    m13979a(0.0f, 0.0f);
                }
            } else if (this.f9641a == 1) {
                m13991d();
            }
            mo10905a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View a3 = mo10904a((int) x4, (int) y4);
        m13985b(x4, y4, pointerId5);
        mo10915b(a3, pointerId5);
        int i8 = this.f9648h[pointerId5];
        int i9 = this.f9656p;
        if ((i8 & i9) != 0) {
            this.f9658r.mo10922b(i8 & i9, pointerId5);
        }
    }

    /* renamed from: a */
    public void mo10907a(View view, int i) {
        if (view.getParent() == this.f9661u) {
            this.f9659s = view;
            this.f9643c = i;
            this.f9658r.mo7957a(view, i);
            mo10912b(1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sb.append(this.f9661u);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public boolean mo10908a(int i) {
        return ((1 << i) & this.f9651k) != 0;
    }

    /* renamed from: a */
    public boolean mo10909a(View view, int i, int i2) {
        boolean z = false;
        if (view == null) {
            return false;
        }
        if (i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo10910a(boolean z) {
        if (this.f9641a == 2) {
            boolean computeScrollOffset = this.f9657q.computeScrollOffset();
            int currX = this.f9657q.getCurrX();
            int currY = this.f9657q.getCurrY();
            int left = currX - this.f9659s.getLeft();
            int top = currY - this.f9659s.getTop();
            if (left != 0) {
                C3379v.m13811d(this.f9659s, left);
            }
            if (top != 0) {
                C3379v.m13814e(this.f9659s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f9658r.mo7958a(this.f9659s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f9657q.getFinalX() && currY == this.f9657q.getFinalY()) {
                this.f9657q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f9661u.post(this.f9662v);
                } else {
                    mo10912b(0);
                }
            }
        }
        return this.f9641a == 2;
    }

    /* renamed from: b */
    public int mo10911b() {
        return this.f9642b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo10912b(int i) {
        this.f9661u.removeCallbacks(this.f9662v);
        if (this.f9641a != i) {
            this.f9641a = i;
            this.f9658r.mo7961c(i);
            if (this.f9641a == 0) {
                this.f9659s = null;
            }
        }
    }

    /* renamed from: b */
    public boolean mo10913b(int i, int i2) {
        return mo10909a(this.f9659s, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10914b(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo10905a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f9652l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f9652l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f9652l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.m13988c(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m13985b(r7, r1, r2)
            int r3 = r0.f9641a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f9648h
            r1 = r1[r2]
            int r3 = r0.f9656p
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            f.j.b.c$c r4 = r0.f9658r
            r1 = r1 & r3
            r4.mo10922b(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo10904a(r3, r1)
            android.view.View r3 = r0.f9659s
            if (r1 != r3) goto L_0x0031
            r0.mo10915b(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f9644d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f9645e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m13993e(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f9644d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f9645e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo10904a(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.m13983a(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            f.j.b.c$c r14 = r0.f9658r
            int r12 = r14.mo7955a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            f.j.b.c$c r5 = r0.f9658r
            int r5 = r5.mo7959b(r7, r15, r14)
            f.j.b.c$c r14 = r0.f9658r
            int r14 = r14.mo7954a(r7)
            f.j.b.c$c r15 = r0.f9658r
            int r15 = r15.mo8127b(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.m13980a(r9, r10, r4)
            int r5 = r0.f9641a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.mo10915b(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.m13989c(r17)
            goto L_0x0031
        L_0x00ff:
            r16.mo10905a()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m13985b(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo10904a(r2, r3)
            android.view.View r3 = r0.f9659s
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f9641a
            if (r3 != r4) goto L_0x0125
            r0.mo10915b(r2, r1)
        L_0x0125:
            int[] r2 = r0.f9648h
            r2 = r2[r1]
            int r3 = r0.f9656p
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            f.j.b.c$c r4 = r0.f9658r
            r2 = r2 & r3
            r4.mo10922b(r2, r1)
        L_0x0135:
            int r1 = r0.f9641a
            if (r1 != r6) goto L_0x013a
            r5 = 1
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p112j.p114b.C3411c.mo10914b(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo10915b(View view, int i) {
        if (view == this.f9659s && this.f9643c == i) {
            return true;
        }
        if (view == null || !this.f9658r.mo7960b(view, i)) {
            return false;
        }
        this.f9643c = i;
        mo10907a(view, i);
        return true;
    }

    /* renamed from: b */
    public boolean mo10916b(View view, int i, int i2) {
        this.f9659s = view;
        this.f9643c = -1;
        boolean b = m13986b(i, i2, 0, 0);
        if (!b && this.f9641a == 0 && this.f9659s != null) {
            this.f9659s = null;
        }
        return b;
    }

    /* renamed from: c */
    public boolean mo10917c(int i, int i2) {
        if (this.f9660t) {
            return m13986b(i, i2, (int) this.f9652l.getXVelocity(this.f9643c), (int) this.f9652l.getYVelocity(this.f9643c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }
}
