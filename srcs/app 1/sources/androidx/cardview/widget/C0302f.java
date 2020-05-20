package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.f */
class C0302f extends Drawable {

    /* renamed from: a */
    private float f1287a;

    /* renamed from: b */
    private final Paint f1288b;

    /* renamed from: c */
    private final RectF f1289c;

    /* renamed from: d */
    private final Rect f1290d;

    /* renamed from: e */
    private float f1291e;

    /* renamed from: f */
    private boolean f1292f = false;

    /* renamed from: g */
    private boolean f1293g = true;

    /* renamed from: h */
    private ColorStateList f1294h;

    /* renamed from: i */
    private PorterDuffColorFilter f1295i;

    /* renamed from: j */
    private ColorStateList f1296j;

    /* renamed from: k */
    private Mode f1297k = Mode.SRC_IN;

    C0302f(ColorStateList colorStateList, float f) {
        this.f1287a = f;
        this.f1288b = new Paint(5);
        m1560b(colorStateList);
        this.f1289c = new RectF();
        this.f1290d = new Rect();
    }

    /* renamed from: a */
    private PorterDuffColorFilter m1558a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: a */
    private void m1559a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1289c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f1290d.set(rect);
        if (this.f1292f) {
            float b = C0303g.m1570b(this.f1291e, this.f1287a, this.f1293g);
            this.f1290d.inset((int) Math.ceil((double) C0303g.m1567a(this.f1291e, this.f1287a, this.f1293g)), (int) Math.ceil((double) b));
            this.f1289c.set(this.f1290d);
        }
    }

    /* renamed from: b */
    private void m1560b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1294h = colorStateList;
        this.f1288b.setColor(colorStateList.getColorForState(getState(), this.f1294h.getDefaultColor()));
    }

    /* renamed from: a */
    public ColorStateList mo1893a() {
        return this.f1294h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1894a(float f) {
        if (f != this.f1287a) {
            this.f1287a = f;
            m1559a((Rect) null);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1895a(float f, boolean z, boolean z2) {
        if (f != this.f1291e || this.f1292f != z || this.f1293g != z2) {
            this.f1291e = f;
            this.f1292f = z;
            this.f1293g = z2;
            m1559a((Rect) null);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo1896a(ColorStateList colorStateList) {
        m1560b(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo1897b() {
        return this.f1291e;
    }

    /* renamed from: c */
    public float mo1898c() {
        return this.f1287a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f1288b;
        if (this.f1295i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f1295i);
            z = true;
        }
        RectF rectF = this.f1289c;
        float f = this.f1287a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1290d, this.f1287a);
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f1296j;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.f1294h;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && !super.isStateful()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m1559a(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1294h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f1288b.getColor();
        if (z) {
            this.f1288b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1296j;
        if (colorStateList2 != null) {
            Mode mode = this.f1297k;
            if (mode != null) {
                this.f1295i = m1558a(colorStateList2, mode);
                return true;
            }
        }
        return z;
    }

    public void setAlpha(int i) {
        this.f1288b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1288b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1296j = colorStateList;
        this.f1295i = m1558a(colorStateList, this.f1297k);
        invalidateSelf();
    }

    public void setTintMode(Mode mode) {
        this.f1297k = mode;
        this.f1295i = m1558a(this.f1296j, mode);
        invalidateSelf();
    }
}
