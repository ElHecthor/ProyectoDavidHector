package p352o.p353a.p364c.p375n;

import p308k.C5802l;
import p308k.C5812t;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;

/* renamed from: o.a.c.n.a */
public final class C6569a {
    /* renamed from: a */
    public static final <T> C5802l<T, Double> m24845a(C5907a<? extends T> aVar) {
        C5942k.m22327b(aVar, "code");
        return new C5802l<>(aVar.invoke(), Double.valueOf(((double) (System.nanoTime() - System.nanoTime())) / 1000000.0d));
    }

    /* renamed from: b */
    public static final double m24846b(C5907a<C5812t> aVar) {
        C5942k.m22327b(aVar, "code");
        long nanoTime = System.nanoTime();
        aVar.invoke();
        return ((double) (System.nanoTime() - nanoTime)) / 1000000.0d;
    }
}
