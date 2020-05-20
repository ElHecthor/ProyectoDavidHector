package p071f.p097h.p108m;

import android.os.Build.VERSION;
import android.view.WindowInsets;
import java.util.Objects;
import p071f.p097h.p107l.C3316c;

/* renamed from: f.h.m.e0 */
public class C3343e0 {

    /* renamed from: a */
    private final Object f9546a;

    C3343e0(Object obj) {
        this.f9546a = obj;
    }

    /* renamed from: a */
    public static C3343e0 m13616a(WindowInsets windowInsets) {
        return new C3343e0(Objects.requireNonNull(windowInsets));
    }

    /* renamed from: a */
    public int mo10729a() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f9546a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* renamed from: a */
    public C3343e0 mo10730a(int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 20) {
            return new C3343e0(((WindowInsets) this.f9546a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    /* renamed from: b */
    public int mo10731b() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f9546a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* renamed from: c */
    public int mo10732c() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f9546a).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public int mo10733d() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f9546a).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* renamed from: e */
    public boolean mo10734e() {
        if (VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f9546a).isConsumed();
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3343e0)) {
            return false;
        }
        return C3316c.m13532a(this.f9546a, ((C3343e0) obj).f9546a);
    }

    /* renamed from: f */
    public WindowInsets mo10736f() {
        return (WindowInsets) this.f9546a;
    }

    public int hashCode() {
        Object obj = this.f9546a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
