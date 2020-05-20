package p308k.p314u;

import java.util.Collection;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.u.m */
class C5838m extends C5837l {
    /* renamed from: a */
    public static <T> int m22166a(Iterable<? extends T> iterable, int i) {
        C5942k.m22327b(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
