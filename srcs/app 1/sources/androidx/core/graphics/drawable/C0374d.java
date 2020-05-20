package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: androidx.core.graphics.drawable.d */
class C0374d extends Drawable implements Callback, C0373c, C0372b {

    /* renamed from: l */
    static final Mode f1736l = Mode.SRC_IN;

    /* renamed from: f */
    private int f1737f;

    /* renamed from: g */
    private Mode f1738g;

    /* renamed from: h */
    private boolean f1739h;

    /* renamed from: i */
    C0376f f1740i;

    /* renamed from: j */
    private boolean f1741j;

    /* renamed from: k */
    Drawable f1742k;

    C0374d(Drawable drawable) {
        this.f1740i = m1918c();
        mo2245a(drawable);
    }

    C0374d(C0376f fVar, Resources resources) {
        this.f1740i = fVar;
        m1916a(resources);
    }

    /* renamed from: a */
    private void m1916a(Resources resources) {
        C0376f fVar = this.f1740i;
        if (fVar != null) {
            ConstantState constantState = fVar.f1745b;
            if (constantState != null) {
                mo2245a(constantState.newDrawable(resources));
            }
        }
    }

    /* renamed from: a */
    private boolean m1917a(int[] iArr) {
        if (!mo2246b()) {
            return false;
        }
        C0376f fVar = this.f1740i;
        ColorStateList colorStateList = fVar.f1746c;
        Mode mode = fVar.f1747d;
        if (colorStateList == null || mode == null) {
            this.f1739h = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f1739h && colorForState == this.f1737f && mode == this.f1738g)) {
                setColorFilter(colorForState, mode);
                this.f1737f = colorForState;
                this.f1738g = mode;
                this.f1739h = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private C0376f m1918c() {
        return new C0376f(this.f1740i);
    }

    /* renamed from: a */
    public final Drawable mo2244a() {
        return this.f1742k;
    }

    /* renamed from: a */
    public final void mo2245a(Drawable drawable) {
        Drawable drawable2 = this.f1742k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1742k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0376f fVar = this.f1740i;
            if (fVar != null) {
                fVar.f1745b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo2246b() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f1742k.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0376f fVar = this.f1740i;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f1742k.getChangingConfigurations();
    }

    public ConstantState getConstantState() {
        C0376f fVar = this.f1740i;
        if (fVar == null || !fVar.mo2281a()) {
            return null;
        }
        this.f1740i.f1744a = getChangingConfigurations();
        return this.f1740i;
    }

    public Drawable getCurrent() {
        return this.f1742k.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f1742k.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f1742k.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f1742k.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f1742k.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f1742k.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f1742k.getPadding(rect);
    }

    public int[] getState() {
        return this.f1742k.getState();
    }

    public Region getTransparentRegion() {
        return this.f1742k.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f1742k.isAutoMirrored();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        if (mo2246b()) {
            C0376f fVar = this.f1740i;
            if (fVar != null) {
                colorStateList = fVar.f1746c;
                return (colorStateList == null && colorStateList.isStateful()) || this.f1742k.isStateful();
            }
        }
        colorStateList = null;
        if (colorStateList == null) {
        }
    }

    public void jumpToCurrentState() {
        this.f1742k.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f1741j && super.mutate() == this) {
            this.f1740i = m1918c();
            Drawable drawable = this.f1742k;
            if (drawable != null) {
                drawable.mutate();
            }
            C0376f fVar = this.f1740i;
            if (fVar != null) {
                Drawable drawable2 = this.f1742k;
                fVar.f1745b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f1741j = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1742k;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f1742k.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f1742k.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f1742k.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f1742k.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1742k.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f1742k.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f1742k.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m1917a(iArr) || this.f1742k.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1740i.f1746c = colorStateList;
        m1917a(getState());
    }

    public void setTintMode(Mode mode) {
        this.f1740i.f1747d = mode;
        m1917a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1742k.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
