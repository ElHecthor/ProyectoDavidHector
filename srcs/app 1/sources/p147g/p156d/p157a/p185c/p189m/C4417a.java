package p147g.p156d.p157a.p185c.p189m;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p071f.p121n.p122a.p123a.C3450a;
import p071f.p121n.p122a.p123a.C3451b;
import p071f.p121n.p122a.p123a.C3452c;

/* renamed from: g.d.a.c.m.a */
public class C4417a {

    /* renamed from: a */
    public static final TimeInterpolator f11712a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f11713b = new C3451b();

    /* renamed from: c */
    public static final TimeInterpolator f11714c = new C3450a();

    /* renamed from: d */
    public static final TimeInterpolator f11715d = new C3452c();

    /* renamed from: e */
    public static final TimeInterpolator f11716e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m18005a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    public static int m18006a(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
