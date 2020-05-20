package p147g.p153c.p154a.p155a;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.OverScroller;

/* renamed from: g.c.a.a.l */
public class C3729l implements OnTouchListener, OnLayoutChangeListener {

    /* renamed from: J */
    private static float f10553J = 3.0f;

    /* renamed from: K */
    private static float f10554K = 1.75f;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public static float f10555L = 1.0f;

    /* renamed from: M */
    private static int f10556M = 200;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public static int f10557N = 1;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C3724g f10558A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C3725h f10559B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C3726i f10560C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C3735f f10561D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f10562E = 2;

    /* renamed from: F */
    private float f10563F;

    /* renamed from: G */
    private boolean f10564G = true;

    /* renamed from: H */
    private ScaleType f10565H = ScaleType.FIT_CENTER;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C3720c f10566I = new C3730a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Interpolator f10567f = new AccelerateDecelerateInterpolator();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f10568g = f10556M;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public float f10569h = f10555L;

    /* renamed from: i */
    private float f10570i = f10554K;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float f10571j = f10553J;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f10572k = true;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f10573l = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ImageView f10574m;

    /* renamed from: n */
    private GestureDetector f10575n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C3718b f10576o;

    /* renamed from: p */
    private final Matrix f10577p = new Matrix();

    /* renamed from: q */
    private final Matrix f10578q = new Matrix();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Matrix f10579r = new Matrix();

    /* renamed from: s */
    private final RectF f10580s = new RectF();

    /* renamed from: t */
    private final float[] f10581t = new float[9];

    /* renamed from: u */
    private C3721d f10582u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C3723f f10583v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C3722e f10584w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C3727j f10585x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public OnClickListener f10586y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public OnLongClickListener f10587z;

    /* renamed from: g.c.a.a.l$a */
    class C3730a implements C3720c {
        C3730a() {
        }

        /* renamed from: a */
        public void mo11805a(float f, float f2) {
            if (!C3729l.this.f10576o.mo11801b()) {
                if (C3729l.this.f10560C != null) {
                    C3729l.this.f10560C.mo11813a(f, f2);
                }
                C3729l.this.f10579r.postTranslate(f, f2);
                C3729l.this.m15237l();
                ViewParent parent = C3729l.this.f10574m.getParent();
                if (!C3729l.this.f10572k || C3729l.this.f10576o.mo11801b() || C3729l.this.f10573l) {
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                } else if ((C3729l.this.f10562E == 2 || ((C3729l.this.f10562E == 0 && f >= 1.0f) || (C3729l.this.f10562E == 1 && f <= -1.0f))) && parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            }
        }

        /* renamed from: a */
        public void mo11806a(float f, float f2, float f3) {
            if (C3729l.this.mo11871f() >= C3729l.this.f10571j && f >= 1.0f) {
                return;
            }
            if (C3729l.this.mo11871f() > C3729l.this.f10569h || f > 1.0f) {
                if (C3729l.this.f10558A != null) {
                    C3729l.this.f10558A.mo11811a(f, f2, f3);
                }
                C3729l.this.f10579r.postScale(f, f, f2, f3);
                C3729l.this.m15237l();
            }
        }

        /* renamed from: a */
        public void mo11807a(float f, float f2, float f3, float f4) {
            C3729l lVar = C3729l.this;
            lVar.f10561D = new C3735f(lVar.f10574m.getContext());
            C3735f u = C3729l.this.f10561D;
            C3729l lVar2 = C3729l.this;
            int b = lVar2.m15220b(lVar2.f10574m);
            C3729l lVar3 = C3729l.this;
            u.mo11884a(b, lVar3.m15214a(lVar3.f10574m), (int) f3, (int) f4);
            C3729l.this.f10574m.post(C3729l.this.f10561D);
        }
    }

    /* renamed from: g.c.a.a.l$b */
    class C3731b extends SimpleOnGestureListener {
        C3731b() {
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (C3729l.this.f10559B == null || C3729l.this.mo11871f() > C3729l.f10555L || motionEvent.getPointerCount() > C3729l.f10557N || motionEvent2.getPointerCount() > C3729l.f10557N) {
                return false;
            }
            return C3729l.this.f10559B.onFling(motionEvent, motionEvent2, f, f2);
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (C3729l.this.f10587z != null) {
                C3729l.this.f10587z.onLongClick(C3729l.this.f10574m);
            }
        }
    }

    /* renamed from: g.c.a.a.l$c */
    class C3732c implements OnDoubleTapListener {
        C3732c() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            C3729l lVar;
            float e;
            try {
                float f = C3729l.this.mo11871f();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (f < C3729l.this.mo11867d()) {
                    lVar = C3729l.this;
                    e = C3729l.this.mo11867d();
                } else if (f < C3729l.this.mo11867d() || f >= C3729l.this.mo11865c()) {
                    lVar = C3729l.this;
                    e = C3729l.this.mo11869e();
                } else {
                    lVar = C3729l.this;
                    e = C3729l.this.mo11865c();
                }
                lVar.mo11847a(e, x, y, true);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (C3729l.this.f10586y != null) {
                C3729l.this.f10586y.onClick(C3729l.this.f10574m);
            }
            RectF a = C3729l.this.mo11845a();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (C3729l.this.f10585x != null) {
                C3729l.this.f10585x.mo11814a(C3729l.this.f10574m, x, y);
            }
            if (a != null) {
                if (a.contains(x, y)) {
                    float width = (x - a.left) / a.width();
                    float height = (y - a.top) / a.height();
                    if (C3729l.this.f10583v != null) {
                        C3729l.this.f10583v.mo11810a(C3729l.this.f10574m, width, height);
                    }
                    return true;
                } else if (C3729l.this.f10584w != null) {
                    C3729l.this.f10584w.mo11809a(C3729l.this.f10574m);
                }
            }
            return false;
        }
    }

    /* renamed from: g.c.a.a.l$d */
    static /* synthetic */ class C3733d {

        /* renamed from: a */
        static final /* synthetic */ int[] f10591a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10591a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10591a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10591a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10591a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p147g.p153c.p154a.p155a.C3729l.C3733d.<clinit>():void");
        }
    }

    /* renamed from: g.c.a.a.l$e */
    private class C3734e implements Runnable {

        /* renamed from: f */
        private final float f10592f;

        /* renamed from: g */
        private final float f10593g;

        /* renamed from: h */
        private final long f10594h = System.currentTimeMillis();

        /* renamed from: i */
        private final float f10595i;

        /* renamed from: j */
        private final float f10596j;

        public C3734e(float f, float f2, float f3, float f4) {
            this.f10592f = f3;
            this.f10593g = f4;
            this.f10595i = f;
            this.f10596j = f2;
        }

        /* renamed from: a */
        private float m15283a() {
            return C3729l.this.f10567f.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.f10594h)) * 1.0f) / ((float) C3729l.this.f10568g)));
        }

        public void run() {
            float a = m15283a();
            float f = this.f10595i;
            C3729l.this.f10566I.mo11806a((f + ((this.f10596j - f) * a)) / C3729l.this.mo11871f(), this.f10592f, this.f10593g);
            if (a < 1.0f) {
                C3717a.m15193a(C3729l.this.f10574m, this);
            }
        }
    }

    /* renamed from: g.c.a.a.l$f */
    private class C3735f implements Runnable {

        /* renamed from: f */
        private final OverScroller f10598f;

        /* renamed from: g */
        private int f10599g;

        /* renamed from: h */
        private int f10600h;

        public C3735f(Context context) {
            this.f10598f = new OverScroller(context);
        }

        /* renamed from: a */
        public void mo11883a() {
            this.f10598f.forceFinished(true);
        }

        /* renamed from: a */
        public void mo11884a(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            RectF a = C3729l.this.mo11845a();
            if (a != null) {
                int round = Math.round(-a.left);
                float f = (float) i;
                if (f < a.width()) {
                    i5 = Math.round(a.width() - f);
                    i6 = 0;
                } else {
                    i6 = round;
                    i5 = i6;
                }
                int round2 = Math.round(-a.top);
                float f2 = (float) i2;
                if (f2 < a.height()) {
                    i7 = Math.round(a.height() - f2);
                    i8 = 0;
                } else {
                    i8 = round2;
                    i7 = i8;
                }
                this.f10599g = round;
                this.f10600h = round2;
                if (!(round == i5 && round2 == i7)) {
                    this.f10598f.fling(round, round2, i3, i4, i6, i5, i8, i7, 0, 0);
                }
            }
        }

        public void run() {
            if (!this.f10598f.isFinished() && this.f10598f.computeScrollOffset()) {
                int currX = this.f10598f.getCurrX();
                int currY = this.f10598f.getCurrY();
                C3729l.this.f10579r.postTranslate((float) (this.f10599g - currX), (float) (this.f10600h - currY));
                C3729l.this.m15237l();
                this.f10599g = currX;
                this.f10600h = currY;
                C3717a.m15193a(C3729l.this.f10574m, this);
            }
        }
    }

    public C3729l(ImageView imageView) {
        this.f10574m = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (!imageView.isInEditMode()) {
            this.f10563F = 0.0f;
            this.f10576o = new C3718b(imageView.getContext(), this.f10566I);
            GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new C3731b());
            this.f10575n = gestureDetector;
            gestureDetector.setOnDoubleTapListener(new C3732c());
        }
    }

    /* renamed from: a */
    private float m15213a(Matrix matrix, int i) {
        matrix.getValues(this.f10581t);
        return this.f10581t[i];
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m15214a(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* renamed from: a */
    private RectF m15216a(Matrix matrix) {
        Drawable drawable = this.f10574m.getDrawable();
        if (drawable == null) {
            return null;
        }
        this.f10580s.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        matrix.mapRect(this.f10580s);
        return this.f10580s;
    }

    /* renamed from: a */
    private void m15219a(Drawable drawable) {
        Matrix matrix;
        ScaleToFit scaleToFit;
        float min;
        if (drawable != null) {
            float b = (float) m15220b(this.f10574m);
            float a = (float) m15214a(this.f10574m);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.f10577p.reset();
            float f = (float) intrinsicWidth;
            float f2 = b / f;
            float f3 = (float) intrinsicHeight;
            float f4 = a / f3;
            ScaleType scaleType = this.f10565H;
            if (scaleType == ScaleType.CENTER) {
                this.f10577p.postTranslate((b - f) / 2.0f, (a - f3) / 2.0f);
            } else {
                if (scaleType == ScaleType.CENTER_CROP) {
                    min = Math.max(f2, f4);
                } else if (scaleType == ScaleType.CENTER_INSIDE) {
                    min = Math.min(1.0f, Math.min(f2, f4));
                } else {
                    RectF rectF = new RectF(0.0f, 0.0f, f, f3);
                    RectF rectF2 = new RectF(0.0f, 0.0f, b, a);
                    if (((int) this.f10563F) % 180 != 0) {
                        rectF = new RectF(0.0f, 0.0f, f3, f);
                    }
                    int i = C3733d.f10591a[this.f10565H.ordinal()];
                    if (i == 1) {
                        matrix = this.f10577p;
                        scaleToFit = ScaleToFit.CENTER;
                    } else if (i == 2) {
                        matrix = this.f10577p;
                        scaleToFit = ScaleToFit.START;
                    } else if (i == 3) {
                        matrix = this.f10577p;
                        scaleToFit = ScaleToFit.END;
                    } else if (i == 4) {
                        matrix = this.f10577p;
                        scaleToFit = ScaleToFit.FILL;
                    }
                    matrix.setRectToRect(rectF, rectF2, scaleToFit);
                }
                this.f10577p.postScale(min, min);
                this.f10577p.postTranslate((b - (f * min)) / 2.0f, (a - (f3 * min)) / 2.0f);
            }
            m15243o();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public int m15220b(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* renamed from: b */
    private void m15223b(Matrix matrix) {
        this.f10574m.setImageMatrix(matrix);
        if (this.f10582u != null) {
            RectF a = m15216a(matrix);
            if (a != null) {
                this.f10582u.mo11808a(a);
            }
        }
    }

    /* renamed from: k */
    private void m15235k() {
        C3735f fVar = this.f10561D;
        if (fVar != null) {
            fVar.mo11883a();
            this.f10561D = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m15237l() {
        if (m15239m()) {
            m15223b(m15241n());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m15239m() {
        /*
            r11 = this;
            android.graphics.Matrix r0 = r11.m15241n()
            android.graphics.RectF r0 = r11.m15216a(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000c
            return r1
        L_0x000c:
            float r2 = r0.height()
            float r3 = r0.width()
            android.widget.ImageView r4 = r11.f10574m
            int r4 = r11.m15214a(r4)
            float r4 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 3
            r7 = 2
            r8 = 0
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x003b
            int[] r9 = p147g.p153c.p154a.p155a.C3729l.C3733d.f10591a
            android.widget.ImageView$ScaleType r10 = r11.f10565H
            int r10 = r10.ordinal()
            r9 = r9[r10]
            if (r9 == r7) goto L_0x0038
            float r4 = r4 - r2
            if (r9 == r6) goto L_0x0034
            float r4 = r4 / r5
        L_0x0034:
            float r2 = r0.top
        L_0x0036:
            float r4 = r4 - r2
            goto L_0x004b
        L_0x0038:
            float r2 = r0.top
            goto L_0x0041
        L_0x003b:
            float r2 = r0.top
            int r9 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x0043
        L_0x0041:
            float r4 = -r2
            goto L_0x004b
        L_0x0043:
            float r2 = r0.bottom
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x004a
            goto L_0x0036
        L_0x004a:
            r4 = 0
        L_0x004b:
            android.widget.ImageView r2 = r11.f10574m
            int r2 = r11.m15220b(r2)
            float r2 = (float) r2
            r9 = 1
            int r10 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r10 > 0) goto L_0x0073
            int[] r1 = p147g.p153c.p154a.p155a.C3729l.C3733d.f10591a
            android.widget.ImageView$ScaleType r8 = r11.f10565H
            int r8 = r8.ordinal()
            r1 = r1[r8]
            if (r1 == r7) goto L_0x006c
            float r2 = r2 - r3
            if (r1 == r6) goto L_0x0067
            float r2 = r2 / r5
        L_0x0067:
            float r0 = r0.left
            float r2 = r2 - r0
            r8 = r2
            goto L_0x0070
        L_0x006c:
            float r0 = r0.left
            float r0 = -r0
            r8 = r0
        L_0x0070:
            r11.f10562E = r7
            goto L_0x008b
        L_0x0073:
            float r3 = r0.left
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x007d
            r11.f10562E = r1
            float r8 = -r3
            goto L_0x008b
        L_0x007d:
            float r0 = r0.right
            int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0088
            float r8 = r2 - r0
            r11.f10562E = r9
            goto L_0x008b
        L_0x0088:
            r0 = -1
            r11.f10562E = r0
        L_0x008b:
            android.graphics.Matrix r0 = r11.f10579r
            r0.postTranslate(r8, r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p153c.p154a.p155a.C3729l.m15239m():boolean");
    }

    /* renamed from: n */
    private Matrix m15241n() {
        this.f10578q.set(this.f10577p);
        this.f10578q.postConcat(this.f10579r);
        return this.f10578q;
    }

    /* renamed from: o */
    private void m15243o() {
        this.f10579r.reset();
        mo11868d(this.f10563F);
        m15223b(m15241n());
        m15239m();
    }

    /* renamed from: a */
    public RectF mo11845a() {
        m15239m();
        return m15216a(m15241n());
    }

    /* renamed from: a */
    public void mo11846a(float f) {
        C3736m.m15287a(this.f10569h, this.f10570i, f);
        this.f10571j = f;
    }

    /* renamed from: a */
    public void mo11847a(float f, float f2, float f3, boolean z) {
        if (f < this.f10569h || f > this.f10571j) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        } else if (z) {
            ImageView imageView = this.f10574m;
            C3734e eVar = new C3734e(mo11871f(), f, f2, f3);
            imageView.post(eVar);
        } else {
            this.f10579r.setScale(f, f, f2, f3);
            m15237l();
        }
    }

    /* renamed from: a */
    public void mo11848a(float f, boolean z) {
        mo11847a(f, (float) (this.f10574m.getRight() / 2), (float) (this.f10574m.getBottom() / 2), z);
    }

    /* renamed from: a */
    public void mo11849a(int i) {
        this.f10568g = i;
    }

    /* renamed from: a */
    public void mo11850a(OnDoubleTapListener onDoubleTapListener) {
        this.f10575n.setOnDoubleTapListener(onDoubleTapListener);
    }

    /* renamed from: a */
    public void mo11851a(OnClickListener onClickListener) {
        this.f10586y = onClickListener;
    }

    /* renamed from: a */
    public void mo11852a(OnLongClickListener onLongClickListener) {
        this.f10587z = onLongClickListener;
    }

    /* renamed from: a */
    public void mo11853a(ScaleType scaleType) {
        if (C3736m.m15288a(scaleType) && scaleType != this.f10565H) {
            this.f10565H = scaleType;
            mo11874h();
        }
    }

    /* renamed from: a */
    public void mo11854a(C3721d dVar) {
        this.f10582u = dVar;
    }

    /* renamed from: a */
    public void mo11855a(C3722e eVar) {
        this.f10584w = eVar;
    }

    /* renamed from: a */
    public void mo11856a(C3723f fVar) {
        this.f10583v = fVar;
    }

    /* renamed from: a */
    public void mo11857a(C3724g gVar) {
        this.f10558A = gVar;
    }

    /* renamed from: a */
    public void mo11858a(C3725h hVar) {
        this.f10559B = hVar;
    }

    /* renamed from: a */
    public void mo11859a(C3726i iVar) {
        this.f10560C = iVar;
    }

    /* renamed from: a */
    public void mo11860a(C3727j jVar) {
        this.f10585x = jVar;
    }

    /* renamed from: a */
    public void mo11861a(boolean z) {
        this.f10572k = z;
    }

    /* renamed from: b */
    public Matrix mo11862b() {
        return this.f10578q;
    }

    /* renamed from: b */
    public void mo11863b(float f) {
        C3736m.m15287a(this.f10569h, f, this.f10571j);
        this.f10570i = f;
    }

    /* renamed from: b */
    public void mo11864b(boolean z) {
        this.f10564G = z;
        mo11874h();
    }

    /* renamed from: c */
    public float mo11865c() {
        return this.f10571j;
    }

    /* renamed from: c */
    public void mo11866c(float f) {
        C3736m.m15287a(f, this.f10570i, this.f10571j);
        this.f10569h = f;
    }

    /* renamed from: d */
    public float mo11867d() {
        return this.f10570i;
    }

    /* renamed from: d */
    public void mo11868d(float f) {
        this.f10579r.postRotate(f % 360.0f);
        m15237l();
    }

    /* renamed from: e */
    public float mo11869e() {
        return this.f10569h;
    }

    /* renamed from: e */
    public void mo11870e(float f) {
        this.f10579r.setRotate(f % 360.0f);
        m15237l();
    }

    /* renamed from: f */
    public float mo11871f() {
        return (float) Math.sqrt((double) (((float) Math.pow((double) m15213a(this.f10579r, 0), 2.0d)) + ((float) Math.pow((double) m15213a(this.f10579r, 3), 2.0d))));
    }

    /* renamed from: f */
    public void mo11872f(float f) {
        mo11848a(f, false);
    }

    /* renamed from: g */
    public ScaleType mo11873g() {
        return this.f10565H;
    }

    /* renamed from: h */
    public void mo11874h() {
        if (this.f10564G) {
            m15219a(this.f10574m.getDrawable());
        } else {
            m15243o();
        }
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
            m15219a(this.f10574m.getDrawable());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.f10564G
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00bb
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = p147g.p153c.p154a.p155a.C3736m.m15289a(r0)
            if (r0 == 0) goto L_0x00bb
            int r0 = r12.getAction()
            if (r0 == 0) goto L_0x006b
            if (r0 == r2) goto L_0x001b
            r3 = 3
            if (r0 == r3) goto L_0x001b
            goto L_0x0077
        L_0x001b:
            float r0 = r10.mo11871f()
            float r3 = r10.f10569h
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0041
            android.graphics.RectF r0 = r10.mo11845a()
            if (r0 == 0) goto L_0x0077
            g.c.a.a.l$e r9 = new g.c.a.a.l$e
            float r5 = r10.mo11871f()
            float r6 = r10.f10569h
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            goto L_0x0066
        L_0x0041:
            float r0 = r10.mo11871f()
            float r3 = r10.f10571j
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0077
            android.graphics.RectF r0 = r10.mo11845a()
            if (r0 == 0) goto L_0x0077
            g.c.a.a.l$e r9 = new g.c.a.a.l$e
            float r5 = r10.mo11871f()
            float r6 = r10.f10571j
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
        L_0x0066:
            r11.post(r9)
            r11 = 1
            goto L_0x0078
        L_0x006b:
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L_0x0074
            r11.requestDisallowInterceptTouchEvent(r2)
        L_0x0074:
            r10.m15235k()
        L_0x0077:
            r11 = 0
        L_0x0078:
            g.c.a.a.b r0 = r10.f10576o
            if (r0 == 0) goto L_0x00af
            boolean r11 = r0.mo11801b()
            g.c.a.a.b r0 = r10.f10576o
            boolean r0 = r0.mo11799a()
            g.c.a.a.b r3 = r10.f10576o
            boolean r3 = r3.mo11800a(r12)
            if (r11 != 0) goto L_0x0098
            g.c.a.a.b r11 = r10.f10576o
            boolean r11 = r11.mo11801b()
            if (r11 != 0) goto L_0x0098
            r11 = 1
            goto L_0x0099
        L_0x0098:
            r11 = 0
        L_0x0099:
            if (r0 != 0) goto L_0x00a5
            g.c.a.a.b r0 = r10.f10576o
            boolean r0 = r0.mo11799a()
            if (r0 != 0) goto L_0x00a5
            r0 = 1
            goto L_0x00a6
        L_0x00a5:
            r0 = 0
        L_0x00a6:
            if (r11 == 0) goto L_0x00ab
            if (r0 == 0) goto L_0x00ab
            r1 = 1
        L_0x00ab:
            r10.f10573l = r1
            r1 = r3
            goto L_0x00b0
        L_0x00af:
            r1 = r11
        L_0x00b0:
            android.view.GestureDetector r11 = r10.f10575n
            if (r11 == 0) goto L_0x00bb
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto L_0x00bb
            r1 = 1
        L_0x00bb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p153c.p154a.p155a.C3729l.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
