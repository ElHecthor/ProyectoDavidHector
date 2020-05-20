package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.C0387e;
import p071f.p072a.C3102j;
import p071f.p072a.p073k.p074a.C3103a;

/* renamed from: androidx.appcompat.widget.m */
public class C0247m {

    /* renamed from: a */
    private final ImageView f1064a;

    /* renamed from: b */
    private C0260r0 f1065b;

    /* renamed from: c */
    private C0260r0 f1066c;

    /* renamed from: d */
    private C0260r0 f1067d;

    public C0247m(ImageView imageView) {
        this.f1064a = imageView;
    }

    /* renamed from: a */
    private boolean m1204a(Drawable drawable) {
        if (this.f1067d == null) {
            this.f1067d = new C0260r0();
        }
        C0260r0 r0Var = this.f1067d;
        r0Var.mo1665a();
        ColorStateList a = C0387e.m2011a(this.f1064a);
        if (a != null) {
            r0Var.f1154d = true;
            r0Var.f1151a = a;
        }
        Mode b = C0387e.m2014b(this.f1064a);
        if (b != null) {
            r0Var.f1153c = true;
            r0Var.f1152b = b;
        }
        if (!r0Var.f1154d && !r0Var.f1153c) {
            return false;
        }
        C0236j.m1168a(drawable, r0Var, this.f1064a.getDrawableState());
        return true;
    }

    /* renamed from: e */
    private boolean m1205e() {
        int i = VERSION.SDK_INT;
        boolean z = true;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f1065b == null) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1562a() {
        Drawable drawable = this.f1064a.getDrawable();
        if (drawable != null) {
            C0189a0.m977b(drawable);
        }
        if (drawable != null && (!m1205e() || !m1204a(drawable))) {
            C0260r0 r0Var = this.f1066c;
            if (r0Var != null) {
                C0236j.m1168a(drawable, r0Var, this.f1064a.getDrawableState());
            } else {
                C0260r0 r0Var2 = this.f1065b;
                if (r0Var2 != null) {
                    C0236j.m1168a(drawable, r0Var2, this.f1064a.getDrawableState());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1563a(int i) {
        if (i != 0) {
            Drawable c = C3103a.m12557c(this.f1064a.getContext(), i);
            if (c != null) {
                C0189a0.m977b(c);
            }
            this.f1064a.setImageDrawable(c);
        } else {
            this.f1064a.setImageDrawable(null);
        }
        mo1562a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1564a(ColorStateList colorStateList) {
        if (this.f1066c == null) {
            this.f1066c = new C0260r0();
        }
        C0260r0 r0Var = this.f1066c;
        r0Var.f1151a = colorStateList;
        r0Var.f1154d = true;
        mo1562a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1565a(Mode mode) {
        if (this.f1066c == null) {
            this.f1066c = new C0260r0();
        }
        C0260r0 r0Var = this.f1066c;
        r0Var.f1152b = mode;
        r0Var.f1153c = true;
        mo1562a();
    }

    /* renamed from: a */
    public void mo1566a(AttributeSet attributeSet, int i) {
        C0275t0 a = C0275t0.m1311a(this.f1064a.getContext(), attributeSet, C3102j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f1064a.getDrawable();
            if (drawable == null) {
                int g = a.mo1750g(C3102j.AppCompatImageView_srcCompat, -1);
                if (g != -1) {
                    drawable = C3103a.m12557c(this.f1064a.getContext(), g);
                    if (drawable != null) {
                        this.f1064a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                C0189a0.m977b(drawable);
            }
            if (a.mo1751g(C3102j.AppCompatImageView_tint)) {
                C0387e.m2012a(this.f1064a, a.mo1735a(C3102j.AppCompatImageView_tint));
            }
            if (a.mo1751g(C3102j.AppCompatImageView_tintMode)) {
                C0387e.m2013a(this.f1064a, C0189a0.m975a(a.mo1744d(C3102j.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            a.mo1737a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ColorStateList mo1567b() {
        C0260r0 r0Var = this.f1066c;
        if (r0Var != null) {
            return r0Var.f1151a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Mode mo1568c() {
        C0260r0 r0Var = this.f1066c;
        if (r0Var != null) {
            return r0Var.f1152b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo1569d() {
        return VERSION.SDK_INT < 21 || !(this.f1064a.getBackground() instanceof RippleDrawable);
    }
}
