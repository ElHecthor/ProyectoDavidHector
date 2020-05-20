package p308k.p314u;

import java.util.Collection;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.u.q */
class C5842q extends C5841p {
    /* renamed from: a */
    public static <T> boolean m22169a(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C5942k.m22327b(collection, "$this$addAll");
        C5942k.m22327b(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static <T> boolean m22170a(Collection<? super T> collection, T[] tArr) {
        C5942k.m22327b(collection, "$this$addAll");
        C5942k.m22327b(tArr, "elements");
        return collection.addAll(C5830g.m22102a(tArr));
    }
}
