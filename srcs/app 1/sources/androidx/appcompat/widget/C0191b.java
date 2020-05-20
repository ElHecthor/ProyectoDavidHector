package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b */
class C0191b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f871a;

    public C0191b(ActionBarContainer actionBarContainer) {
        this.f871a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f871a;
        if (actionBarContainer.f637m) {
            Drawable drawable = actionBarContainer.f636l;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f634j;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f871a;
        Drawable drawable3 = actionBarContainer2.f635k;
        if (drawable3 != null && actionBarContainer2.f638n) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f871a;
        if (actionBarContainer.f637m) {
            drawable = actionBarContainer.f636l;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f634j;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
