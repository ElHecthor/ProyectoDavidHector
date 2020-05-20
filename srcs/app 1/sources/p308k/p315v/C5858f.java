package p308k.p315v;

import java.util.Comparator;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.v.f */
final class C5858f implements Comparator<Comparable<? super Object>> {

    /* renamed from: f */
    public static final C5858f f14889f = new C5858f();

    private C5858f() {
    }

    /* renamed from: a */
    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        C5942k.m22327b(comparable, "a");
        C5942k.m22327b(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return C5857e.f14888f;
    }
}
