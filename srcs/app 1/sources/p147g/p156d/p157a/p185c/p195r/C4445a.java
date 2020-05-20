package p147g.p156d.p157a.p185c.p195r;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import p071f.p097h.p100f.C3257d;
import p147g.p156d.p157a.p185c.p202y.C4458b;

/* renamed from: g.d.a.c.r.a */
public class C4445a {
    /* renamed from: a */
    public static int m18116a(int i, int i2) {
        return C3257d.m13345b(i2, i);
    }

    /* renamed from: a */
    public static int m18117a(int i, int i2, float f) {
        return m18116a(i, C3257d.m13346c(i2, Math.round(((float) Color.alpha(i2)) * f)));
    }

    /* renamed from: a */
    public static int m18118a(Context context, int i, int i2) {
        TypedValue a = C4458b.m18171a(context, i);
        return a != null ? a.data : i2;
    }

    /* renamed from: a */
    public static int m18119a(Context context, int i, String str) {
        return C4458b.m18169a(context, i, str);
    }

    /* renamed from: a */
    public static int m18120a(View view, int i) {
        return C4458b.m18170a(view, i);
    }

    /* renamed from: a */
    public static int m18121a(View view, int i, int i2) {
        return m18118a(view.getContext(), i, i2);
    }

    /* renamed from: a */
    public static int m18122a(View view, int i, int i2, float f) {
        return m18117a(m18120a(view, i), m18120a(view, i2), f);
    }
}
