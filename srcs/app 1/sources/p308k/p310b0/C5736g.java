package p308k.p310b0;

import androidx.recyclerview.widget.RecyclerView;
import p308k.p310b0.C5729b.C5730a;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.b0.g */
class C5736g extends C5735f {
    /* renamed from: a */
    public static int m21866a(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public static int m21867a(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot coerce value to an empty range: maximum ");
        sb.append(i3);
        sb.append(" is less than minimum ");
        sb.append(i2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static long m21868a(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: a */
    public static final Integer m21869a(double d) {
        double d2 = (double) Integer.MAX_VALUE;
        if (d < ((double) RecyclerView.UNDEFINED_DURATION) || d > d2) {
            return null;
        }
        return Integer.valueOf((int) d);
    }

    /* renamed from: a */
    public static C5729b m21870a(C5729b bVar, int i) {
        C5942k.m22327b(bVar, "$this$step");
        C5735f.m21865a(i > 0, Integer.valueOf(i));
        C5730a aVar = C5729b.f14807i;
        int c = bVar.mo15363c();
        int d = bVar.mo15364d();
        if (bVar.mo15365e() <= 0) {
            i = -i;
        }
        return aVar.mo15371a(c, d, i);
    }

    /* renamed from: a */
    public static boolean m21871a(C5728a<Integer> aVar, double d) {
        C5942k.m22327b(aVar, "$this$contains");
        Integer a = m21869a(d);
        if (a != null) {
            return aVar.mo15362a(a);
        }
        return false;
    }

    /* renamed from: b */
    public static int m21872b(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: b */
    public static long m21873b(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: c */
    public static C5729b m21874c(int i, int i2) {
        return C5729b.f14807i.mo15371a(i, i2, -1);
    }

    /* renamed from: d */
    public static C5732d m21875d(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? C5732d.f14816k.mo15377a() : new C5732d(i, i2 - 1);
    }
}
