package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.drawable.e */
class C0375e extends C0374d {

    /* renamed from: m */
    private static Method f1743m;

    C0375e(Drawable drawable) {
        super(drawable);
        m1922c();
    }

    C0375e(C0376f fVar, Resources resources) {
        super(fVar, resources);
        m1922c();
    }

    /* renamed from: c */
    private void m1922c() {
        if (f1743m == null) {
            try {
                f1743m = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo2246b() {
        if (VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f1742k;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public Rect getDirtyBounds() {
        return this.f1742k.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f1742k.getOutline(outline);
    }

    public boolean isProjected() {
        Drawable drawable = this.f1742k;
        if (drawable != null) {
            Method method = f1743m;
            if (method != null) {
                try {
                    return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
                } catch (Exception e) {
                    Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
                }
            }
        }
        return false;
    }

    public void setHotspot(float f, float f2) {
        this.f1742k.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f1742k.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo2246b()) {
            super.setTint(i);
        } else {
            this.f1742k.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo2246b()) {
            super.setTintList(colorStateList);
        } else {
            this.f1742k.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        if (mo2246b()) {
            super.setTintMode(mode);
        } else {
            this.f1742k.setTintMode(mode);
        }
    }
}
