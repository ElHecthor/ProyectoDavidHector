package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import p071f.p097h.p100f.C3257d;
import p147g.p156d.p157a.p185c.p187b0.C4389k;
import p147g.p156d.p157a.p185c.p187b0.C4393l;

/* renamed from: com.google.android.material.floatingactionbutton.c */
class C2676c extends Drawable {

    /* renamed from: a */
    private final C4393l f7723a = new C4393l();

    /* renamed from: b */
    private final Paint f7724b;

    /* renamed from: c */
    private final Path f7725c = new Path();

    /* renamed from: d */
    private final Rect f7726d = new Rect();

    /* renamed from: e */
    private final RectF f7727e = new RectF();

    /* renamed from: f */
    private final RectF f7728f = new RectF();

    /* renamed from: g */
    private final C2678b f7729g = new C2678b();

    /* renamed from: h */
    float f7730h;

    /* renamed from: i */
    private int f7731i;

    /* renamed from: j */
    private int f7732j;

    /* renamed from: k */
    private int f7733k;

    /* renamed from: l */
    private int f7734l;

    /* renamed from: m */
    private int f7735m;

    /* renamed from: n */
    private boolean f7736n = true;

    /* renamed from: o */
    private C4389k f7737o;

    /* renamed from: p */
    private ColorStateList f7738p;

    /* renamed from: com.google.android.material.floatingactionbutton.c$b */
    private class C2678b extends ConstantState {
        private C2678b() {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return C2676c.this;
        }
    }

    C2676c(C4389k kVar) {
        this.f7737o = kVar;
        Paint paint = new Paint(1);
        this.f7724b = paint;
        paint.setStyle(Style.STROKE);
    }

    /* renamed from: b */
    private Shader m11086b() {
        Rect rect = this.f7726d;
        copyBounds(rect);
        float height = this.f7730h / ((float) rect.height());
        LinearGradient linearGradient = new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C3257d.m13345b(this.f7731i, this.f7735m), C3257d.m13345b(this.f7732j, this.f7735m), C3257d.m13345b(C3257d.m13346c(this.f7732j, 0), this.f7735m), C3257d.m13345b(C3257d.m13346c(this.f7734l, 0), this.f7735m), C3257d.m13345b(this.f7734l, this.f7735m), C3257d.m13345b(this.f7733k, this.f7735m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, TileMode.CLAMP);
        return linearGradient;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public RectF mo8827a() {
        this.f7728f.set(getBounds());
        return this.f7728f;
    }

    /* renamed from: a */
    public void mo8828a(float f) {
        if (this.f7730h != f) {
            this.f7730h = f;
            this.f7724b.setStrokeWidth(f * 1.3333f);
            this.f7736n = true;
            invalidateSelf();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8829a(int i, int i2, int i3, int i4) {
        this.f7731i = i;
        this.f7732j = i2;
        this.f7733k = i3;
        this.f7734l = i4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8830a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f7735m = colorStateList.getColorForState(getState(), this.f7735m);
        }
        this.f7738p = colorStateList;
        this.f7736n = true;
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo8831a(C4389k kVar) {
        this.f7737o = kVar;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        if (this.f7736n) {
            this.f7724b.setShader(m11086b());
            this.f7736n = false;
        }
        float strokeWidth = this.f7724b.getStrokeWidth() / 2.0f;
        copyBounds(this.f7726d);
        this.f7727e.set(this.f7726d);
        float min = Math.min(this.f7737o.mo13112j().mo13045a(mo8827a()), this.f7727e.width() / 2.0f);
        if (this.f7737o.mo13103a(mo8827a())) {
            this.f7727e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f7727e, min, min, this.f7724b);
        }
    }

    public ConstantState getConstantState() {
        return this.f7729g;
    }

    public int getOpacity() {
        return this.f7730h > 0.0f ? -3 : -2;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f7737o.mo13103a(mo8827a())) {
            outline.setRoundRect(getBounds(), this.f7737o.mo13112j().mo13045a(mo8827a()));
            return;
        }
        copyBounds(this.f7726d);
        this.f7727e.set(this.f7726d);
        this.f7723a.mo13134a(this.f7737o, 1.0f, this.f7727e, this.f7725c);
        if (this.f7725c.isConvex()) {
            outline.setConvexPath(this.f7725c);
        }
    }

    public boolean getPadding(Rect rect) {
        if (this.f7737o.mo13103a(mo8827a())) {
            int round = Math.round(this.f7730h);
            rect.set(round, round, round, round);
        }
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f7738p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f7736n = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f7738p;
        if (colorStateList != null) {
            int colorForState = colorStateList.getColorForState(iArr, this.f7735m);
            if (colorForState != this.f7735m) {
                this.f7736n = true;
                this.f7735m = colorForState;
            }
        }
        if (this.f7736n) {
            invalidateSelf();
        }
        return this.f7736n;
    }

    public void setAlpha(int i) {
        this.f7724b.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f7724b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
