package p308k.p315v;

import java.util.Comparator;
import p308k.C5809q;

/* renamed from: k.v.b */
class C5854b {
    /* renamed from: a */
    public static <T extends Comparable<?>> int m22211a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    /* renamed from: a */
    public static <T extends Comparable<? super T>> Comparator<T> m22212a() {
        C5857e eVar = C5857e.f14888f;
        if (eVar != null) {
            return eVar;
        }
        throw new C5809q("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
    }
}
