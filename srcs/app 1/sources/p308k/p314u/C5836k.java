package p308k.p314u;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.u.k */
class C5836k {
    /* renamed from: a */
    public static <T> List<T> m22153a(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C5942k.m22324a((Object) singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    /* renamed from: a */
    public static final <T> Object[] m22154a(T[] tArr, boolean z) {
        Class<Object[]> cls = Object[].class;
        C5942k.m22327b(tArr, "$this$copyToArrayOfAny");
        if (z && C5942k.m22326a((Object) tArr.getClass(), (Object) cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        C5942k.m22324a((Object) copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
        return copyOf;
    }
}
