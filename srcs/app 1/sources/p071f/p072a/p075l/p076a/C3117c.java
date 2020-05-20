package p071f.p072a.p075l.p076a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import androidx.core.graphics.drawable.C0371a;

/* renamed from: f.a.l.a.c */
public class C3117c extends Drawable implements Callback {

    /* renamed from: f */
    private Drawable f8828f;

    public C3117c(Drawable drawable) {
        mo10006a(drawable);
    }

    /* renamed from: a */
    public Drawable mo10005a() {
        return this.f8828f;
    }

    /* renamed from: a */
    public void mo10006a(Drawable drawable) {
        Drawable drawable2 = this.f8828f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f8828f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f8828f.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f8828f.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f8828f.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f8828f.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f8828f.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f8828f.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f8828f.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f8828f.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f8828f.getPadding(rect);
    }

    public int[] getState() {
        return this.f8828f.getState();
    }

    public Region getTransparentRegion() {
        return this.f8828f.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0371a.m1910f(this.f8828f);
    }

    public boolean isStateful() {
        return this.f8828f.isStateful();
    }

    public void jumpToCurrentState() {
        C0371a.m1911g(this.f8828f);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f8828f.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f8828f.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f8828f.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0371a.m1902a(this.f8828f, z);
    }

    public void setChangingConfigurations(int i) {
        this.f8828f.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f8828f.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f8828f.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f8828f.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0371a.m1896a(this.f8828f, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0371a.m1897a(this.f8828f, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f8828f.setState(iArr);
    }

    public void setTint(int i) {
        C0371a.m1906b(this.f8828f, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0371a.m1898a(this.f8828f, colorStateList);
    }

    public void setTintMode(Mode mode) {
        C0371a.m1901a(this.f8828f, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f8828f.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
