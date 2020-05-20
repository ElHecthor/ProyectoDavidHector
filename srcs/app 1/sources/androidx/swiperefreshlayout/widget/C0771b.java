package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import p071f.p097h.p107l.C3321h;
import p071f.p121n.p122a.p123a.C3451b;

/* renamed from: androidx.swiperefreshlayout.widget.b */
public class C0771b extends Drawable implements Animatable {

    /* renamed from: l */
    private static final Interpolator f3014l = new LinearInterpolator();

    /* renamed from: m */
    private static final Interpolator f3015m = new C3451b();

    /* renamed from: n */
    private static final int[] f3016n = {-16777216};

    /* renamed from: f */
    private final C0774c f3017f;

    /* renamed from: g */
    private float f3018g;

    /* renamed from: h */
    private Resources f3019h;

    /* renamed from: i */
    private Animator f3020i;

    /* renamed from: j */
    float f3021j;

    /* renamed from: k */
    boolean f3022k;

    /* renamed from: androidx.swiperefreshlayout.widget.b$a */
    class C0772a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C0774c f3023a;

        C0772a(C0774c cVar) {
            this.f3023a = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C0771b.this.mo4235a(floatValue, this.f3023a);
            C0771b.this.mo4236a(floatValue, this.f3023a, false);
            C0771b.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$b */
    class C0773b implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C0774c f3025a;

        C0773b(C0774c cVar) {
            this.f3025a = cVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            C0771b.this.mo4236a(1.0f, this.f3025a, true);
            this.f3025a.mo4281l();
            this.f3025a.mo4279j();
            C0771b bVar = C0771b.this;
            if (bVar.f3022k) {
                bVar.f3022k = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                this.f3025a.mo4262a(false);
                return;
            }
            bVar.f3021j += 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            C0771b.this.f3021j = 0.0f;
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$c */
    private static class C0774c {

        /* renamed from: a */
        final RectF f3027a = new RectF();

        /* renamed from: b */
        final Paint f3028b = new Paint();

        /* renamed from: c */
        final Paint f3029c = new Paint();

        /* renamed from: d */
        final Paint f3030d = new Paint();

        /* renamed from: e */
        float f3031e = 0.0f;

        /* renamed from: f */
        float f3032f = 0.0f;

        /* renamed from: g */
        float f3033g = 0.0f;

        /* renamed from: h */
        float f3034h = 5.0f;

        /* renamed from: i */
        int[] f3035i;

        /* renamed from: j */
        int f3036j;

        /* renamed from: k */
        float f3037k;

        /* renamed from: l */
        float f3038l;

        /* renamed from: m */
        float f3039m;

        /* renamed from: n */
        boolean f3040n;

        /* renamed from: o */
        Path f3041o;

        /* renamed from: p */
        float f3042p = 1.0f;

        /* renamed from: q */
        float f3043q;

        /* renamed from: r */
        int f3044r;

        /* renamed from: s */
        int f3045s;

        /* renamed from: t */
        int f3046t = 255;

        /* renamed from: u */
        int f3047u;

        C0774c() {
            this.f3028b.setStrokeCap(Cap.SQUARE);
            this.f3028b.setAntiAlias(true);
            this.f3028b.setStyle(Style.STROKE);
            this.f3029c.setStyle(Style.FILL);
            this.f3029c.setAntiAlias(true);
            this.f3030d.setColor(0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo4255a() {
            return this.f3046t;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4256a(float f) {
            if (f != this.f3042p) {
                this.f3042p = f;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4257a(float f, float f2) {
            this.f3044r = (int) f;
            this.f3045s = (int) f2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4258a(int i) {
            this.f3046t = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4259a(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f3040n) {
                Path path = this.f3041o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f3041o = path2;
                    path2.setFillType(FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (((float) this.f3044r) * this.f3042p) / 2.0f;
                this.f3041o.moveTo(0.0f, 0.0f);
                this.f3041o.lineTo(((float) this.f3044r) * this.f3042p, 0.0f);
                Path path3 = this.f3041o;
                float f4 = (float) this.f3044r;
                float f5 = this.f3042p;
                path3.lineTo((f4 * f5) / 2.0f, ((float) this.f3045s) * f5);
                this.f3041o.offset((min + rectF.centerX()) - f3, rectF.centerY() + (this.f3034h / 2.0f));
                this.f3041o.close();
                this.f3029c.setColor(this.f3047u);
                this.f3029c.setAlpha(this.f3046t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f3041o, this.f3029c);
                canvas.restore();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4260a(Canvas canvas, Rect rect) {
            RectF rectF = this.f3027a;
            float f = this.f3043q;
            float f2 = (this.f3034h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f3044r) * this.f3042p) / 2.0f, this.f3034h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f2, ((float) rect.centerY()) - f2, ((float) rect.centerX()) + f2, ((float) rect.centerY()) + f2);
            float f3 = this.f3031e;
            float f4 = this.f3033g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f3032f + f4) * 360.0f) - f5;
            this.f3028b.setColor(this.f3047u);
            this.f3028b.setAlpha(this.f3046t);
            float f7 = this.f3034h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f3030d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f3028b);
            mo4259a(canvas, f5, f6, rectF);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4261a(ColorFilter colorFilter) {
            this.f3028b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4262a(boolean z) {
            if (this.f3040n != z) {
                this.f3040n = z;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4263a(int[] iArr) {
            this.f3035i = iArr;
            mo4269c(0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public float mo4264b() {
            return this.f3032f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4265b(float f) {
            this.f3043q = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4266b(int i) {
            this.f3047u = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo4267c() {
            return this.f3035i[mo4270d()];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4268c(float f) {
            this.f3032f = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4269c(int i) {
            this.f3036j = i;
            this.f3047u = this.f3035i[i];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo4270d() {
            return (this.f3036j + 1) % this.f3035i.length;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo4271d(float f) {
            this.f3033g = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public float mo4272e() {
            return this.f3031e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo4273e(float f) {
            this.f3031e = f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public int mo4274f() {
            return this.f3035i[this.f3036j];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo4275f(float f) {
            this.f3034h = f;
            this.f3028b.setStrokeWidth(f);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public float mo4276g() {
            return this.f3038l;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public float mo4277h() {
            return this.f3039m;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public float mo4278i() {
            return this.f3037k;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo4279j() {
            mo4269c(mo4270d());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo4280k() {
            this.f3037k = 0.0f;
            this.f3038l = 0.0f;
            this.f3039m = 0.0f;
            mo4273e(0.0f);
            mo4268c(0.0f);
            mo4271d(0.0f);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public void mo4281l() {
            this.f3037k = this.f3031e;
            this.f3038l = this.f3032f;
            this.f3039m = this.f3033g;
        }
    }

    public C0771b(Context context) {
        C3321h.m13543a(context);
        this.f3019h = context.getResources();
        C0774c cVar = new C0774c();
        this.f3017f = cVar;
        cVar.mo4263a(f3016n);
        mo4241c(2.5f);
        m4117a();
    }

    /* renamed from: a */
    private int m4116a(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & 255) - i6)))));
    }

    /* renamed from: a */
    private void m4117a() {
        C0774c cVar = this.f3017f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C0772a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f3014l);
        ofFloat.addListener(new C0773b(cVar));
        this.f3020i = ofFloat;
    }

    /* renamed from: a */
    private void m4118a(float f, float f2, float f3, float f4) {
        C0774c cVar = this.f3017f;
        float f5 = this.f3019h.getDisplayMetrics().density;
        cVar.mo4275f(f2 * f5);
        cVar.mo4265b(f * f5);
        cVar.mo4269c(0);
        cVar.mo4257a(f3 * f5, f4 * f5);
    }

    /* renamed from: b */
    private void m4119b(float f, C0774c cVar) {
        mo4235a(f, cVar);
        float floor = (float) (Math.floor((double) (cVar.mo4277h() / 0.8f)) + 1.0d);
        cVar.mo4273e(cVar.mo4278i() + (((cVar.mo4276g() - 0.01f) - cVar.mo4278i()) * f));
        cVar.mo4268c(cVar.mo4276g());
        cVar.mo4271d(cVar.mo4277h() + ((floor - cVar.mo4277h()) * f));
    }

    /* renamed from: d */
    private void m4120d(float f) {
        this.f3018g = f;
    }

    /* renamed from: a */
    public void mo4233a(float f) {
        this.f3017f.mo4256a(f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo4234a(float f, float f2) {
        this.f3017f.mo4273e(f);
        this.f3017f.mo4268c(f2);
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4235a(float f, C0774c cVar) {
        cVar.mo4266b(f > 0.75f ? m4116a((f - 0.75f) / 0.25f, cVar.mo4274f(), cVar.mo4267c()) : cVar.mo4274f());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4236a(float f, C0774c cVar, boolean z) {
        float f2;
        float f3;
        if (this.f3022k) {
            m4119b(f, cVar);
        } else if (f != 1.0f || z) {
            float h = cVar.mo4277h();
            if (f < 0.5f) {
                float f4 = f / 0.5f;
                f2 = cVar.mo4278i();
                f3 = (f3015m.getInterpolation(f4) * 0.79f) + 0.01f + f2;
            } else {
                float i = cVar.mo4278i() + 0.79f;
                float f5 = i;
                f2 = i - (((1.0f - f3015m.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f5;
            }
            float f6 = h + (0.20999998f * f);
            float f7 = (f + this.f3021j) * 216.0f;
            cVar.mo4273e(f2);
            cVar.mo4268c(f3);
            cVar.mo4271d(f6);
            m4120d(f7);
        }
    }

    /* renamed from: a */
    public void mo4237a(int i) {
        float f;
        float f2;
        float f3;
        float f4;
        if (i == 0) {
            f = 11.0f;
            f4 = 3.0f;
            f3 = 12.0f;
            f2 = 6.0f;
        } else {
            f = 7.5f;
            f4 = 2.5f;
            f3 = 10.0f;
            f2 = 5.0f;
        }
        m4118a(f, f4, f3, f2);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo4238a(boolean z) {
        this.f3017f.mo4262a(z);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo4239a(int... iArr) {
        this.f3017f.mo4263a(iArr);
        this.f3017f.mo4269c(0);
        invalidateSelf();
    }

    /* renamed from: b */
    public void mo4240b(float f) {
        this.f3017f.mo4271d(f);
        invalidateSelf();
    }

    /* renamed from: c */
    public void mo4241c(float f) {
        this.f3017f.mo4275f(f);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f3018g, bounds.exactCenterX(), bounds.exactCenterY());
        this.f3017f.mo4260a(canvas, bounds);
        canvas.restore();
    }

    public int getAlpha() {
        return this.f3017f.mo4255a();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f3020i.isRunning();
    }

    public void setAlpha(int i) {
        this.f3017f.mo4258a(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3017f.mo4261a(colorFilter);
        invalidateSelf();
    }

    public void start() {
        long j;
        Animator animator;
        this.f3020i.cancel();
        this.f3017f.mo4281l();
        if (this.f3017f.mo4264b() != this.f3017f.mo4272e()) {
            this.f3022k = true;
            animator = this.f3020i;
            j = 666;
        } else {
            this.f3017f.mo4269c(0);
            this.f3017f.mo4280k();
            animator = this.f3020i;
            j = 1332;
        }
        animator.setDuration(j);
        this.f3020i.start();
    }

    public void stop() {
        this.f3020i.cancel();
        m4120d(0.0f);
        this.f3017f.mo4262a(false);
        this.f3017f.mo4269c(0);
        this.f3017f.mo4280k();
        invalidateSelf();
    }
}
