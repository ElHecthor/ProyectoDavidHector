package p308k.p314u;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.u.p */
class C5841p extends C5840o {
    /* renamed from: a */
    public static final <T> void m22167a(List<T> list, Comparator<? super T> comparator) {
        C5942k.m22327b(list, "$this$sortWith");
        C5942k.m22327b(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: c */
    public static <T extends Comparable<? super T>> void m22168c(List<T> list) {
        C5942k.m22327b(list, "$this$sort");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
