package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import p071f.p072a.C3102j;
import p071f.p097h.p108m.C3379v;

/* renamed from: androidx.appcompat.widget.e */
class C0211e {

    /* renamed from: a */
    private final View f931a;

    /* renamed from: b */
    private final C0236j f932b;

    /* renamed from: c */
    private int f933c = -1;

    /* renamed from: d */
    private C0260r0 f934d;

    /* renamed from: e */
    private C0260r0 f935e;

    /* renamed from: f */
    private C0260r0 f936f;

    C0211e(View view) {
        this.f931a = view;
        this.f932b = C0236j.m1169b();
    }

    /* renamed from: b */
    private boolean m1047b(Drawable drawable) {
        if (this.f936f == null) {
            this.f936f = new C0260r0();
        }
        C0260r0 r0Var = this.f936f;
        r0Var.mo1665a();
        ColorStateList h = C3379v.m13819h(this.f931a);
        if (h != null) {
            r0Var.f1154d = true;
            r0Var.f1151a = h;
        }
        Mode i = C3379v.m13821i(this.f931a);
        if (i != null) {
            r0Var.f1153c = true;
            r0Var.f1152b = i;
        }
        if (!r0Var.f1154d && !r0Var.f1153c) {
            return false;
        }
        C0236j.m1168a(drawable, r0Var, this.f931a.getDrawableState());
        return true;
    }

    /* renamed from: d */
    private boolean m1048d() {
        int i = VERSION.SDK_INT;
        boolean z = true;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f934d == null) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1321a() {
        Drawable background = this.f931a.getBackground();
        if (background != null && (!m1048d() || !m1047b(background))) {
            C0260r0 r0Var = this.f935e;
            if (r0Var != null) {
                C0236j.m1168a(background, r0Var, this.f931a.getDrawableState());
            } else {
                C0260r0 r0Var2 = this.f934d;
                if (r0Var2 != null) {
                    C0236j.m1168a(background, r0Var2, this.f931a.getDrawableState());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1322a(int i) {
        this.f933c = i;
        C0236j jVar = this.f932b;
        mo1323a(jVar != null ? jVar.mo1477b(this.f931a.getContext(), i) : null);
        mo1321a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1323a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f934d == null) {
                this.f934d = new C0260r0();
            }
            C0260r0 r0Var = this.f934d;
            r0Var.f1151a = colorStateList;
            r0Var.f1154d = true;
        } else {
            this.f934d = null;
        }
        mo1321a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1324a(Mode mode) {
        if (this.f935e == null) {
            this.f935e = new C0260r0();
        }
        C0260r0 r0Var = this.f935e;
        r0Var.f1152b = mode;
        r0Var.f1153c = true;
        mo1321a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1325a(Drawable drawable) {
        this.f933c = -1;
        mo1323a((ColorStateList) null);
        mo1321a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1326a(AttributeSet attributeSet, int i) {
        C0275t0 a = C0275t0.m1311a(this.f931a.getContext(), attributeSet, C3102j.ViewBackgroundHelper, i, 0);
        try {
            if (a.mo1751g(C3102j.ViewBackgroundHelper_android_background)) {
                this.f933c = a.mo1750g(C3102j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.f932b.mo1477b(this.f931a.getContext(), this.f933c);
                if (b != null) {
                    mo1323a(b);
                }
            }
            if (a.mo1751g(C3102j.ViewBackgroundHelper_backgroundTint)) {
                C3379v.m13784a(this.f931a, a.mo1735a(C3102j.ViewBackgroundHelper_backgroundTint));
            }
            if (a.mo1751g(C3102j.ViewBackgroundHelper_backgroundTintMode)) {
                C3379v.m13785a(this.f931a, C0189a0.m975a(a.mo1744d(C3102j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a.mo1737a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ColorStateList mo1327b() {
        C0260r0 r0Var = this.f935e;
        if (r0Var != null) {
            return r0Var.f1151a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1328b(ColorStateList colorStateList) {
        if (this.f935e == null) {
            this.f935e = new C0260r0();
        }
        C0260r0 r0Var = this.f935e;
        r0Var.f1151a = colorStateList;
        r0Var.f1154d = true;
        mo1321a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Mode mo1329c() {
        C0260r0 r0Var = this.f935e;
        if (r0Var != null) {
            return r0Var.f1152b;
        }
        return null;
    }
}
