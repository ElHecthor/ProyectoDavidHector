package p071f.p139v;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.ViewGroup;

/* renamed from: f.v.x */
class C3629x {

    /* renamed from: a */
    private static boolean f10185a = true;

    /* renamed from: a */
    static C3628w m14780a(ViewGroup viewGroup) {
        return VERSION.SDK_INT >= 18 ? new C3627v(viewGroup) : C3626u.m14771a(viewGroup);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private static void m14781a(ViewGroup viewGroup, boolean z) {
        if (f10185a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f10185a = false;
            }
        }
    }

    /* renamed from: b */
    static void m14782b(ViewGroup viewGroup, boolean z) {
        int i = VERSION.SDK_INT;
        if (i >= 29) {
            viewGroup.suppressLayout(z);
        } else if (i >= 18) {
            m14781a(viewGroup, z);
        } else {
            C3630y.m14784a(viewGroup, z);
        }
    }
}
