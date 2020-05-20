package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView.C0560a0;
import androidx.recyclerview.widget.RecyclerView.C0579n;
import androidx.recyclerview.widget.RecyclerView.C0588s;
import androidx.recyclerview.widget.RecyclerView.C0589t;
import p071f.p097h.p108m.C3379v;

/* renamed from: androidx.recyclerview.widget.j */
class C0645j extends C0579n implements C0588s {

    /* renamed from: D */
    private static final int[] f2628D = {16842919};

    /* renamed from: E */
    private static final int[] f2629E = new int[0];

    /* renamed from: A */
    int f2630A = 0;

    /* renamed from: B */
    private final Runnable f2631B = new C0646a();

    /* renamed from: C */
    private final C0589t f2632C = new C0647b();

    /* renamed from: a */
    private final int f2633a;

    /* renamed from: b */
    private final int f2634b;

    /* renamed from: c */
    final StateListDrawable f2635c;

    /* renamed from: d */
    final Drawable f2636d;

    /* renamed from: e */
    private final int f2637e;

    /* renamed from: f */
    private final int f2638f;

    /* renamed from: g */
    private final StateListDrawable f2639g;

    /* renamed from: h */
    private final Drawable f2640h;

    /* renamed from: i */
    private final int f2641i;

    /* renamed from: j */
    private final int f2642j;

    /* renamed from: k */
    int f2643k;

    /* renamed from: l */
    int f2644l;

    /* renamed from: m */
    float f2645m;

    /* renamed from: n */
    int f2646n;

    /* renamed from: o */
    int f2647o;

    /* renamed from: p */
    float f2648p;

    /* renamed from: q */
    private int f2649q = 0;

    /* renamed from: r */
    private int f2650r = 0;

    /* renamed from: s */
    private RecyclerView f2651s;

    /* renamed from: t */
    private boolean f2652t = false;

    /* renamed from: u */
    private boolean f2653u = false;

    /* renamed from: v */
    private int f2654v = 0;

    /* renamed from: w */
    private int f2655w = 0;

    /* renamed from: x */
    private final int[] f2656x = new int[2];

    /* renamed from: y */
    private final int[] f2657y = new int[2];

    /* renamed from: z */
    final ValueAnimator f2658z = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

    /* renamed from: androidx.recyclerview.widget.j$a */
    class C0646a implements Runnable {
        C0646a() {
        }

        public void run() {
            C0645j.this.mo3894a(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$b */
    class C0647b extends C0589t {
        C0647b() {
        }

        /* renamed from: a */
        public void mo3641a(RecyclerView recyclerView, int i, int i2) {
            C0645j.this.mo3895a(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$c */
    private class C0648c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f2661a = false;

        C0648c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f2661a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f2661a) {
                this.f2661a = false;
                return;
            }
            if (((Float) C0645j.this.f2658z.getAnimatedValue()).floatValue() == 0.0f) {
                C0645j jVar = C0645j.this;
                jVar.f2630A = 0;
                jVar.mo3899b(0);
            } else {
                C0645j jVar2 = C0645j.this;
                jVar2.f2630A = 2;
                jVar2.mo3893a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$d */
    private class C0649d implements AnimatorUpdateListener {
        C0649d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0645j.this.f2635c.setAlpha(floatValue);
            C0645j.this.f2636d.setAlpha(floatValue);
            C0645j.this.mo3893a();
        }
    }

    C0645j(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f2635c = stateListDrawable;
        this.f2636d = drawable;
        this.f2639g = stateListDrawable2;
        this.f2640h = drawable2;
        this.f2637e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2638f = Math.max(i, drawable.getIntrinsicWidth());
        this.f2641i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f2642j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2633a = i2;
        this.f2634b = i3;
        this.f2635c.setAlpha(255);
        this.f2636d.setAlpha(255);
        this.f2658z.addListener(new C0648c());
        this.f2658z.addUpdateListener(new C0649d());
        mo3896a(recyclerView);
    }

    /* renamed from: a */
    private int m3648a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: a */
    private void m3649a(float f) {
        int[] e = m3656e();
        float max = Math.max((float) e[0], Math.min((float) e[1], f));
        if (Math.abs(((float) this.f2647o) - max) >= 2.0f) {
            int a = m3648a(this.f2648p, max, e, this.f2651s.computeHorizontalScrollRange(), this.f2651s.computeHorizontalScrollOffset(), this.f2649q);
            if (a != 0) {
                this.f2651s.scrollBy(a, 0);
            }
            this.f2648p = max;
        }
    }

    /* renamed from: a */
    private void m3650a(Canvas canvas) {
        int i = this.f2650r;
        int i2 = this.f2641i;
        int i3 = i - i2;
        int i4 = this.f2647o;
        int i5 = this.f2646n;
        int i6 = i4 - (i5 / 2);
        this.f2639g.setBounds(0, 0, i5, i2);
        this.f2640h.setBounds(0, 0, this.f2649q, this.f2642j);
        canvas.translate(0.0f, (float) i3);
        this.f2640h.draw(canvas);
        canvas.translate((float) i6, 0.0f);
        this.f2639g.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* renamed from: b */
    private void m3651b(float f) {
        int[] f2 = m3657f();
        float max = Math.max((float) f2[0], Math.min((float) f2[1], f));
        if (Math.abs(((float) this.f2644l) - max) >= 2.0f) {
            int a = m3648a(this.f2645m, max, f2, this.f2651s.computeVerticalScrollRange(), this.f2651s.computeVerticalScrollOffset(), this.f2650r);
            if (a != 0) {
                this.f2651s.scrollBy(0, a);
            }
            this.f2645m = max;
        }
    }

    /* renamed from: b */
    private void m3652b(Canvas canvas) {
        int i = this.f2649q;
        int i2 = this.f2637e;
        int i3 = i - i2;
        int i4 = this.f2644l;
        int i5 = this.f2643k;
        int i6 = i4 - (i5 / 2);
        this.f2635c.setBounds(0, 0, i2, i5);
        this.f2636d.setBounds(0, 0, this.f2638f, this.f2650r);
        if (m3658g()) {
            this.f2636d.draw(canvas);
            canvas.translate((float) this.f2637e, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f2635c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i3 = this.f2637e;
        } else {
            canvas.translate((float) i3, 0.0f);
            this.f2636d.draw(canvas);
            canvas.translate(0.0f, (float) i6);
            this.f2635c.draw(canvas);
        }
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* renamed from: c */
    private void m3653c() {
        this.f2651s.removeCallbacks(this.f2631B);
    }

    /* renamed from: c */
    private void m3654c(int i) {
        m3653c();
        this.f2651s.postDelayed(this.f2631B, (long) i);
    }

    /* renamed from: d */
    private void m3655d() {
        this.f2651s.removeItemDecoration(this);
        this.f2651s.removeOnItemTouchListener(this);
        this.f2651s.removeOnScrollListener(this.f2632C);
        m3653c();
    }

    /* renamed from: e */
    private int[] m3656e() {
        int[] iArr = this.f2657y;
        int i = this.f2634b;
        iArr[0] = i;
        iArr[1] = this.f2649q - i;
        return iArr;
    }

    /* renamed from: f */
    private int[] m3657f() {
        int[] iArr = this.f2656x;
        int i = this.f2634b;
        iArr[0] = i;
        iArr[1] = this.f2650r - i;
        return iArr;
    }

    /* renamed from: g */
    private boolean m3658g() {
        return C3379v.m13829p(this.f2651s) == 1;
    }

    /* renamed from: h */
    private void m3659h() {
        this.f2651s.addItemDecoration(this);
        this.f2651s.addOnItemTouchListener(this);
        this.f2651s.addOnScrollListener(this.f2632C);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3893a() {
        this.f2651s.invalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3894a(int i) {
        int i2 = this.f2630A;
        if (i2 == 1) {
            this.f2658z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f2630A = 3;
        ValueAnimator valueAnimator = this.f2658z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f2658z.setDuration((long) i);
        this.f2658z.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3895a(int i, int i2) {
        int computeVerticalScrollRange = this.f2651s.computeVerticalScrollRange();
        int i3 = this.f2650r;
        this.f2652t = computeVerticalScrollRange - i3 > 0 && i3 >= this.f2633a;
        int computeHorizontalScrollRange = this.f2651s.computeHorizontalScrollRange();
        int i4 = this.f2649q;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f2633a;
        this.f2653u = z;
        if (this.f2652t || z) {
            if (this.f2652t) {
                float f = (float) i3;
                this.f2644l = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f2643k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f2653u) {
                float f2 = (float) i4;
                this.f2647o = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f2646n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f2654v;
            if (i5 == 0 || i5 == 1) {
                mo3899b(1);
            }
            return;
        }
        if (this.f2654v != 0) {
            mo3899b(0);
        }
    }

    /* renamed from: a */
    public void mo3896a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2651s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m3655d();
            }
            this.f2651s = recyclerView;
            if (recyclerView != null) {
                m3659h();
            }
        }
    }

    /* renamed from: a */
    public void mo3637a(boolean z) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3897a(float f, float f2) {
        if (f2 >= ((float) (this.f2650r - this.f2641i))) {
            int i = this.f2647o;
            int i2 = this.f2646n;
            if (f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo3638a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f2654v;
        if (i == 1) {
            boolean b = mo3900b(motionEvent.getX(), motionEvent.getY());
            boolean a = mo3897a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b && !a) {
                return false;
            }
            if (a) {
                this.f2655w = 1;
                this.f2648p = (float) ((int) motionEvent.getX());
            } else if (b) {
                this.f2655w = 2;
                this.f2645m = (float) ((int) motionEvent.getY());
            }
            mo3899b(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo3898b() {
        int i = this.f2630A;
        if (i != 0) {
            if (i == 3) {
                this.f2658z.cancel();
            } else {
                return;
            }
        }
        this.f2630A = 1;
        ValueAnimator valueAnimator = this.f2658z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f2658z.setDuration(500);
        this.f2658z.setStartDelay(0);
        this.f2658z.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3899b(int i) {
        int i2;
        if (i == 2 && this.f2654v != 2) {
            this.f2635c.setState(f2628D);
            m3653c();
        }
        if (i == 0) {
            mo3893a();
        } else {
            mo3898b();
        }
        if (this.f2654v != 2 || i == 2) {
            if (i == 1) {
                i2 = 1500;
            }
            this.f2654v = i;
        }
        this.f2635c.setState(f2629E);
        i2 = 1200;
        m3654c(i2);
        this.f2654v = i;
    }

    /* renamed from: b */
    public void mo3530b(Canvas canvas, RecyclerView recyclerView, C0560a0 a0Var) {
        if (this.f2649q == this.f2651s.getWidth() && this.f2650r == this.f2651s.getHeight()) {
            if (this.f2630A != 0) {
                if (this.f2652t) {
                    m3652b(canvas);
                }
                if (this.f2653u) {
                    m3650a(canvas);
                }
            }
            return;
        }
        this.f2649q = this.f2651s.getWidth();
        this.f2650r = this.f2651s.getHeight();
        mo3899b(0);
    }

    /* renamed from: b */
    public void mo3639b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f2654v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean b = mo3900b(motionEvent.getX(), motionEvent.getY());
                boolean a = mo3897a(motionEvent.getX(), motionEvent.getY());
                if (b || a) {
                    if (a) {
                        this.f2655w = 1;
                        this.f2648p = (float) ((int) motionEvent.getX());
                    } else if (b) {
                        this.f2655w = 2;
                        this.f2645m = (float) ((int) motionEvent.getY());
                    }
                    mo3899b(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f2654v == 2) {
                this.f2645m = 0.0f;
                this.f2648p = 0.0f;
                mo3899b(1);
                this.f2655w = 0;
            } else if (motionEvent.getAction() == 2 && this.f2654v == 2) {
                mo3898b();
                if (this.f2655w == 1) {
                    m3649a(motionEvent.getX());
                }
                if (this.f2655w == 2) {
                    m3651b(motionEvent.getY());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo3900b(float f, float f2) {
        if (!m3658g() ? f >= ((float) (this.f2649q - this.f2637e)) : f <= ((float) (this.f2637e / 2))) {
            int i = this.f2644l;
            int i2 = this.f2643k;
            if (f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)))) {
                return true;
            }
        }
        return false;
    }
}
