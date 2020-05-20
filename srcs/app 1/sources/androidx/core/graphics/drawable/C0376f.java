package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;

/* renamed from: androidx.core.graphics.drawable.f */
final class C0376f extends ConstantState {

    /* renamed from: a */
    int f1744a;

    /* renamed from: b */
    ConstantState f1745b;

    /* renamed from: c */
    ColorStateList f1746c = null;

    /* renamed from: d */
    Mode f1747d = C0374d.f1736l;

    C0376f(C0376f fVar) {
        if (fVar != null) {
            this.f1744a = fVar.f1744a;
            this.f1745b = fVar.f1745b;
            this.f1746c = fVar.f1746c;
            this.f1747d = fVar.f1747d;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2281a() {
        return this.f1745b != null;
    }

    public int getChangingConfigurations() {
        int i = this.f1744a;
        ConstantState constantState = this.f1745b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable(null);
    }

    public Drawable newDrawable(Resources resources) {
        return VERSION.SDK_INT >= 21 ? new C0375e(this, resources) : new C0374d(this, resources);
    }
}
