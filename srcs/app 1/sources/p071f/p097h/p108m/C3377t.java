package p071f.p097h.p108m;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.PointerIcon;

/* renamed from: f.h.m.t */
public final class C3377t {

    /* renamed from: a */
    private Object f9582a;

    private C3377t(Object obj) {
        this.f9582a = obj;
    }

    /* renamed from: a */
    public static C3377t m13763a(Context context, int i) {
        return VERSION.SDK_INT >= 24 ? new C3377t(PointerIcon.getSystemIcon(context, i)) : new C3377t(null);
    }

    /* renamed from: a */
    public Object mo10840a() {
        return this.f9582a;
    }
}
