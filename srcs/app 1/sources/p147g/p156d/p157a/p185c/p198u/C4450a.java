package p147g.p156d.p157a.p185c.p198u;

import android.content.Context;
import android.graphics.Color;
import p071f.p097h.p100f.C3257d;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.p195r.C4445a;
import p147g.p156d.p157a.p185c.p202y.C4458b;

/* renamed from: g.d.a.c.u.a */
public class C4450a {

    /* renamed from: a */
    private final boolean f11788a;

    /* renamed from: b */
    private final int f11789b;

    /* renamed from: c */
    private final int f11790c;

    /* renamed from: d */
    private final float f11791d;

    public C4450a(Context context) {
        this.f11788a = C4458b.m18172a(context, C4375b.elevationOverlayEnabled, false);
        this.f11789b = C4445a.m18118a(context, C4375b.elevationOverlayColor, 0);
        this.f11790c = C4445a.m18118a(context, C4375b.colorSurface, 0);
        this.f11791d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    private boolean m18148a(int i) {
        return C3257d.m13346c(i, 255) == this.f11790c;
    }

    /* renamed from: a */
    public float mo13254a(float f) {
        float f2 = this.f11791d;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: a */
    public int mo13255a(int i, float f) {
        float a = mo13254a(f);
        return C3257d.m13346c(C4445a.m18117a(C3257d.m13346c(i, 255), this.f11789b, a), Color.alpha(i));
    }

    /* renamed from: a */
    public boolean mo13256a() {
        return this.f11788a;
    }

    /* renamed from: b */
    public int mo13257b(int i, float f) {
        return (!this.f11788a || !m18148a(i)) ? i : mo13255a(i, f);
    }
}
