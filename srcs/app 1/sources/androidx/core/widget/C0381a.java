package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p071f.p097h.p108m.C3379v;

/* renamed from: androidx.core.widget.a */
public abstract class C0381a implements OnTouchListener {

    /* renamed from: w */
    private static final int f1777w = ViewConfiguration.getTapTimeout();

    /* renamed from: f */
    final C0382a f1778f = new C0382a();

    /* renamed from: g */
    private final Interpolator f1779g = new AccelerateInterpolator();

    /* renamed from: h */
    final View f1780h;

    /* renamed from: i */
    private Runnable f1781i;

    /* renamed from: j */
    private float[] f1782j = {0.0f, 0.0f};

    /* renamed from: k */
    private float[] f1783k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: l */
    private int f1784l;

    /* renamed from: m */
    private int f1785m;

    /* renamed from: n */
    private float[] f1786n = {0.0f, 0.0f};

    /* renamed from: o */
    private float[] f1787o = {0.0f, 0.0f};

    /* renamed from: p */
    private float[] f1788p = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: q */
    private boolean f1789q;

    /* renamed from: r */
    boolean f1790r;

    /* renamed from: s */
    boolean f1791s;

    /* renamed from: t */
    boolean f1792t;

    /* renamed from: u */
    private boolean f1793u;

    /* renamed from: v */
    private boolean f1794v;

    /* renamed from: androidx.core.widget.a$a */
    private static class C0382a {

        /* renamed from: a */
        private int f1795a;

        /* renamed from: b */
        private int f1796b;

        /* renamed from: c */
        private float f1797c;

        /* renamed from: d */
        private float f1798d;

        /* renamed from: e */
        private long f1799e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f1800f = 0;

        /* renamed from: g */
        private int f1801g = 0;

        /* renamed from: h */
        private int f1802h = 0;

        /* renamed from: i */
        private long f1803i = -1;

        /* renamed from: j */
        private float f1804j;

        /* renamed from: k */
        private int f1805k;

        C0382a() {
        }

        /* renamed from: a */
        private float m1993a(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        private float m1994a(long j) {
            if (j < this.f1799e) {
                return 0.0f;
            }
            long j2 = this.f1803i;
            if (j2 < 0 || j < j2) {
                return C0381a.m1971a(((float) (j - this.f1799e)) / ((float) this.f1795a), 0.0f, 1.0f) * 0.5f;
            }
            long j3 = j - j2;
            float f = this.f1804j;
            return (1.0f - f) + (f * C0381a.m1971a(((float) j3) / ((float) this.f1805k), 0.0f, 1.0f));
        }

        /* renamed from: a */
        public void mo2372a() {
            if (this.f1800f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float a = m1993a(m1994a(currentAnimationTimeMillis));
                long j = currentAnimationTimeMillis - this.f1800f;
                this.f1800f = currentAnimationTimeMillis;
                float f = ((float) j) * a;
                this.f1801g = (int) (this.f1797c * f);
                this.f1802h = (int) (f * this.f1798d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: a */
        public void mo2373a(float f, float f2) {
            this.f1797c = f;
            this.f1798d = f2;
        }

        /* renamed from: a */
        public void mo2374a(int i) {
            this.f1796b = i;
        }

        /* renamed from: b */
        public int mo2375b() {
            return this.f1801g;
        }

        /* renamed from: b */
        public void mo2376b(int i) {
            this.f1795a = i;
        }

        /* renamed from: c */
        public int mo2377c() {
            return this.f1802h;
        }

        /* renamed from: d */
        public int mo2378d() {
            float f = this.f1797c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: e */
        public int mo2379e() {
            float f = this.f1798d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public boolean mo2380f() {
            return this.f1803i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1803i + ((long) this.f1805k);
        }

        /* renamed from: g */
        public void mo2381g() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1805k = C0381a.m1974a((int) (currentAnimationTimeMillis - this.f1799e), 0, this.f1796b);
            this.f1804j = m1994a(currentAnimationTimeMillis);
            this.f1803i = currentAnimationTimeMillis;
        }

        /* renamed from: h */
        public void mo2382h() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1799e = currentAnimationTimeMillis;
            this.f1803i = -1;
            this.f1800f = currentAnimationTimeMillis;
            this.f1804j = 0.5f;
            this.f1801g = 0;
            this.f1802h = 0;
        }
    }

    /* renamed from: androidx.core.widget.a$b */
    private class C0383b implements Runnable {
        C0383b() {
        }

        public void run() {
            C0381a aVar = C0381a.this;
            if (aVar.f1792t) {
                if (aVar.f1790r) {
                    aVar.f1790r = false;
                    aVar.f1778f.mo2382h();
                }
                C0382a aVar2 = C0381a.this.f1778f;
                if (aVar2.mo2380f() || !C0381a.this.mo2362b()) {
                    C0381a.this.f1792t = false;
                    return;
                }
                C0381a aVar3 = C0381a.this;
                if (aVar3.f1791s) {
                    aVar3.f1791s = false;
                    aVar3.mo2358a();
                }
                aVar2.mo2372a();
                C0381a.this.mo2359a(aVar2.mo2375b(), aVar2.mo2377c());
                C3379v.m13794a(C0381a.this.f1780h, (Runnable) this);
            }
        }
    }

    public C0381a(View view) {
        this.f1780h = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        int i = (int) ((f * 315.0f) + 0.5f);
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        mo2361b(f2, f2);
        float f3 = (float) i;
        mo2364c(f3, f3);
        mo2367d(1);
        mo2356a(Float.MAX_VALUE, Float.MAX_VALUE);
        mo2366d(0.2f, 0.2f);
        mo2368e(1.0f, 1.0f);
        mo2365c(f1777w);
        mo2370f(500);
        mo2369e(500);
    }

    /* renamed from: a */
    static float m1971a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    private float m1972a(float f, float f2, float f3, float f4) {
        float f5;
        float a = m1971a(f * f2, 0.0f, f3);
        float f6 = m1977f(f2 - f4, a) - m1977f(f4, a);
        if (f6 < 0.0f) {
            f5 = -this.f1779g.getInterpolation(-f6);
        } else if (f6 <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f1779g.getInterpolation(f6);
        }
        return m1971a(f5, -1.0f, 1.0f);
    }

    /* renamed from: a */
    private float m1973a(int i, float f, float f2, float f3) {
        float a = m1972a(this.f1782j[i], f2, this.f1783k[i], f);
        int i2 = (a > 0.0f ? 1 : (a == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f1786n[i];
        float f5 = this.f1787o[i];
        float f6 = this.f1788p[i];
        float f7 = f4 * f3;
        return i2 > 0 ? m1971a(a * f7, f5, f6) : -m1971a((-a) * f7, f5, f6);
    }

    /* renamed from: a */
    static int m1974a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: c */
    private void m1975c() {
        if (this.f1790r) {
            this.f1792t = false;
        } else {
            this.f1778f.mo2381g();
        }
    }

    /* renamed from: d */
    private void m1976d() {
        if (this.f1781i == null) {
            this.f1781i = new C0383b();
        }
        this.f1792t = true;
        this.f1790r = true;
        if (!this.f1789q) {
            int i = this.f1785m;
            if (i > 0) {
                C3379v.m13795a(this.f1780h, this.f1781i, (long) i);
                this.f1789q = true;
            }
        }
        this.f1781i.run();
        this.f1789q = true;
    }

    /* renamed from: f */
    private float m1977f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f1784l;
        if (i == 0 || i == 1) {
            if (f < f2) {
                return f >= 0.0f ? 1.0f - (f / f2) : (!this.f1792t || this.f1784l != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* renamed from: a */
    public C0381a mo2356a(float f, float f2) {
        float[] fArr = this.f1783k;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: a */
    public C0381a mo2357a(boolean z) {
        if (this.f1793u && !z) {
            m1975c();
        }
        this.f1793u = z;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2358a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1780h.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    public abstract void mo2359a(int i, int i2);

    /* renamed from: a */
    public abstract boolean mo2360a(int i);

    /* renamed from: b */
    public C0381a mo2361b(float f, float f2) {
        float[] fArr = this.f1788p;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo2362b() {
        C0382a aVar = this.f1778f;
        int e = aVar.mo2379e();
        int d = aVar.mo2378d();
        return (e != 0 && mo2363b(e)) || (d != 0 && mo2360a(d));
    }

    /* renamed from: b */
    public abstract boolean mo2363b(int i);

    /* renamed from: c */
    public C0381a mo2364c(float f, float f2) {
        float[] fArr = this.f1787o;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: c */
    public C0381a mo2365c(int i) {
        this.f1785m = i;
        return this;
    }

    /* renamed from: d */
    public C0381a mo2366d(float f, float f2) {
        float[] fArr = this.f1782j;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: d */
    public C0381a mo2367d(int i) {
        this.f1784l = i;
        return this;
    }

    /* renamed from: e */
    public C0381a mo2368e(float f, float f2) {
        float[] fArr = this.f1786n;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: e */
    public C0381a mo2369e(int i) {
        this.f1778f.mo2374a(i);
        return this;
    }

    /* renamed from: f */
    public C0381a mo2370f(int i) {
        this.f1778f.mo2376b(i);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f1793u
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.m1975c()
            goto L_0x0058
        L_0x001a:
            r5.f1791s = r2
            r5.f1789q = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1780h
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m1973a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1780h
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m1973a(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f1778f
            r7.mo2373a(r0, r6)
            boolean r6 = r5.f1792t
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.mo2362b()
            if (r6 == 0) goto L_0x0058
            r5.m1976d()
        L_0x0058:
            boolean r6 = r5.f1794v
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f1792t
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.C0381a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
