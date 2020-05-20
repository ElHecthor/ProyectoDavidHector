package p308k.p314u;

import java.util.Set;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.u.g0 */
class C5831g0 extends C5829f0 {
    /* renamed from: a */
    public static <T> Set<T> m22112a() {
        return C5850x.f14887f;
    }

    /* renamed from: a */
    public static final <T> Set<T> m22113a(Set<? extends T> set) {
        C5942k.m22327b(set, "$this$optimizeReadOnlySet");
        int size = set.size();
        return size != 0 ? size != 1 ? set : C5829f0.m22101a(set.iterator().next()) : m22112a();
    }
}
