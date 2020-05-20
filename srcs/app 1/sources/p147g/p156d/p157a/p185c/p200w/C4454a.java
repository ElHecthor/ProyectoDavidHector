package p147g.p156d.p157a.p185c.p200w;

/* renamed from: g.d.a.c.w.a */
public final class C4454a {
    /* renamed from: a */
    public static float m18160a(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: a */
    public static float m18161a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: a */
    public static float m18162a(float f, float f2, float f3, float f4, float f5, float f6) {
        return m18163b(m18161a(f, f2, f3, f4), m18161a(f, f2, f5, f4), m18161a(f, f2, f5, f6), m18161a(f, f2, f3, f6));
    }

    /* renamed from: b */
    private static float m18163b(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }
}
