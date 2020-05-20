package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import p071f.p087d.C3158b;
import p071f.p087d.C3159c;

/* renamed from: androidx.cardview.widget.g */
class C0303g extends Drawable {

    /* renamed from: q */
    private static final double f1298q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r */
    static C0304a f1299r;

    /* renamed from: a */
    private final int f1300a;

    /* renamed from: b */
    private Paint f1301b;

    /* renamed from: c */
    private Paint f1302c;

    /* renamed from: d */
    private Paint f1303d;

    /* renamed from: e */
    private final RectF f1304e;

    /* renamed from: f */
    private float f1305f;

    /* renamed from: g */
    private Path f1306g;

    /* renamed from: h */
    private float f1307h;

    /* renamed from: i */
    private float f1308i;

    /* renamed from: j */
    private float f1309j;

    /* renamed from: k */
    private ColorStateList f1310k;

    /* renamed from: l */
    private boolean f1311l = true;

    /* renamed from: m */
    private final int f1312m;

    /* renamed from: n */
    private final int f1313n;

    /* renamed from: o */
    private boolean f1314o = true;

    /* renamed from: p */
    private boolean f1315p = false;

    /* renamed from: androidx.cardview.widget.g$a */
    interface C0304a {
        /* renamed from: a */
        void mo1878a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    C0303g(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f1312m = resources.getColor(C3158b.cardview_shadow_start_color);
        this.f1313n = resources.getColor(C3158b.cardview_shadow_end_color);
        this.f1300a = resources.getDimensionPixelSize(C3159c.cardview_compat_inset_shadow);
        this.f1301b = new Paint(5);
        m1571b(colorStateList);
        Paint paint = new Paint(5);
        this.f1302c = paint;
        paint.setStyle(Style.FILL);
        this.f1305f = (float) ((int) (f + 0.5f));
        this.f1304e = new RectF();
        Paint paint2 = new Paint(this.f1302c);
        this.f1303d = paint2;
        paint2.setAntiAlias(false);
        m1568a(f2, f3);
    }

    /* renamed from: a */
    static float m1567a(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f1298q) * ((double) f2))) : f;
    }

    /* renamed from: a */
    private void m1568a(float f, float f2) {
        String str = ". Must be >= 0";
        if (f < 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid shadow size ");
            sb.append(f);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 >= 0.0f) {
            float d = (float) m1573d(f);
            float d2 = (float) m1573d(f2);
            if (d > d2) {
                if (!this.f1315p) {
                    this.f1315p = true;
                }
                d = d2;
            }
            if (this.f1309j != d || this.f1307h != d2) {
                this.f1309j = d;
                this.f1307h = d2;
                this.f1308i = (float) ((int) ((d * 1.5f) + ((float) this.f1300a) + 0.5f));
                this.f1311l = true;
                invalidateSelf();
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid max shadow size ");
            sb2.append(f2);
            sb2.append(str);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    private void m1569a(Canvas canvas) {
        float f = this.f1305f;
        float f2 = (-f) - this.f1308i;
        float f3 = f + ((float) this.f1300a) + (this.f1309j / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f1304e.width() - f4 > 0.0f;
        boolean z2 = this.f1304e.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f1304e;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f1306g, this.f1302c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f1304e.width() - f4, -this.f1305f, this.f1303d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f1304e;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1306g, this.f1302c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f1304e.width() - f4, (-this.f1305f) + this.f1308i, this.f1303d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f1304e;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1306g, this.f1302c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f1304e.height() - f4, -this.f1305f, this.f1303d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f1304e;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1306g, this.f1302c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f1304e.height() - f4, -this.f1305f, this.f1303d);
        }
        canvas.restoreToCount(save4);
    }

    /* renamed from: b */
    static float m1570b(float f, float f2, boolean z) {
        float f3 = f * 1.5f;
        return z ? (float) (((double) f3) + ((1.0d - f1298q) * ((double) f2))) : f3;
    }

    /* renamed from: b */
    private void m1571b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1310k = colorStateList;
        this.f1301b.setColor(colorStateList.getColorForState(getState(), this.f1310k.getDefaultColor()));
    }

    /* renamed from: b */
    private void m1572b(Rect rect) {
        float f = this.f1307h;
        float f2 = 1.5f * f;
        this.f1304e.set(((float) rect.left) + f, ((float) rect.top) + f2, ((float) rect.right) - f, ((float) rect.bottom) - f2);
        m1574g();
    }

    /* renamed from: d */
    private int m1573d(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    /* renamed from: g */
    private void m1574g() {
        float f = this.f1305f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f1308i;
        rectF2.inset(-f2, -f2);
        Path path = this.f1306g;
        if (path == null) {
            this.f1306g = new Path();
        } else {
            path.reset();
        }
        this.f1306g.setFillType(FillType.EVEN_ODD);
        this.f1306g.moveTo(-this.f1305f, 0.0f);
        this.f1306g.rLineTo(-this.f1308i, 0.0f);
        this.f1306g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f1306g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f1306g.close();
        float f3 = this.f1305f;
        float f4 = f3 / (this.f1308i + f3);
        Paint paint = this.f1302c;
        float f5 = this.f1305f + this.f1308i;
        int i = this.f1312m;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f1313n}, new float[]{0.0f, f4, 1.0f}, TileMode.CLAMP);
        paint.setShader(radialGradient);
        Paint paint2 = this.f1303d;
        float f6 = this.f1305f;
        float f7 = -f6;
        float f8 = this.f1308i;
        float f9 = f7 + f8;
        float f10 = (-f6) - f8;
        int i2 = this.f1312m;
        LinearGradient linearGradient = new LinearGradient(0.0f, f9, 0.0f, f10, new int[]{i2, i2, this.f1313n}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP);
        paint2.setShader(linearGradient);
        this.f1303d.setAntiAlias(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ColorStateList mo1909a() {
        return this.f1310k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1910a(float f) {
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (this.f1305f != f2) {
                this.f1305f = f2;
                this.f1311l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid radius ");
        sb.append(f);
        sb.append(". Must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1911a(ColorStateList colorStateList) {
        m1571b(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1912a(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1913a(boolean z) {
        this.f1314o = z;
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo1914b() {
        return this.f1305f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1915b(float f) {
        m1568a(this.f1309j, f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public float mo1916c() {
        return this.f1307h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1917c(float f) {
        m1568a(f, this.f1307h);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public float mo1918d() {
        float f = this.f1307h;
        return (Math.max(f, this.f1305f + ((float) this.f1300a) + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f1307h * 1.5f) + ((float) this.f1300a)) * 2.0f);
    }

    public void draw(Canvas canvas) {
        if (this.f1311l) {
            m1572b(getBounds());
            this.f1311l = false;
        }
        canvas.translate(0.0f, this.f1309j / 2.0f);
        m1569a(canvas);
        canvas.translate(0.0f, (-this.f1309j) / 2.0f);
        f1299r.mo1878a(canvas, this.f1304e, this.f1305f, this.f1301b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public float mo1920e() {
        float f = this.f1307h;
        return (Math.max(f, this.f1305f + ((float) this.f1300a) + (f / 2.0f)) * 2.0f) + ((this.f1307h + ((float) this.f1300a)) * 2.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public float mo1921f() {
        return this.f1309j;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m1570b(this.f1307h, this.f1305f, this.f1314o));
        int ceil2 = (int) Math.ceil((double) m1567a(this.f1307h, this.f1305f, this.f1314o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f1310k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1311l = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1310k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1301b.getColor() == colorForState) {
            return false;
        }
        this.f1301b.setColor(colorForState);
        this.f1311l = true;
        invalidateSelf();
        return true;
    }

    public void setAlpha(int i) {
        this.f1301b.setAlpha(i);
        this.f1302c.setAlpha(i);
        this.f1303d.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1301b.setColorFilter(colorFilter);
    }
}
