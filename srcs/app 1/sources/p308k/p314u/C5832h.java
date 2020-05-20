package p308k.p314u;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import p308k.p309a0.C5723c;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.u.h */
class C5832h extends C5830g {
    /* renamed from: a */
    public static char m22114a(char[] cArr) {
        C5942k.m22327b(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: a */
    public static <T> T m22115a(T[] tArr, C5723c cVar) {
        C5942k.m22327b(tArr, "$this$random");
        C5942k.m22327b(cVar, "random");
        if (!(tArr.length == 0)) {
            return tArr[cVar.mo15358b(tArr.length)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: a */
    public static final <C extends Collection<? super T>, T> C m22116a(T[] tArr, C c) {
        C5942k.m22327b(tArr, "$this$filterNotNullTo");
        C5942k.m22327b(c, "destination");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    /* renamed from: b */
    public static final <T> List<T> m22117b(T[] tArr) {
        C5942k.m22327b(tArr, "$this$filterNotNull");
        ArrayList arrayList = new ArrayList();
        m22116a(tArr, (C) arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static final <T> boolean m22118b(T[] tArr, T t) {
        C5942k.m22327b(tArr, "$this$contains");
        return m22121c(tArr, t) >= 0;
    }

    /* renamed from: b */
    public static final <T> T[] m22119b(T[] tArr, Comparator<? super T> comparator) {
        C5942k.m22327b(tArr, "$this$sortedArrayWith");
        C5942k.m22327b(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        C5942k.m22324a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        C5830g.m22105a(copyOf, comparator);
        return copyOf;
    }

    /* renamed from: c */
    public static <T> int m22120c(T[] tArr) {
        C5942k.m22327b(tArr, "$this$lastIndex");
        return tArr.length - 1;
    }

    /* renamed from: c */
    public static <T> int m22121c(T[] tArr, T t) {
        C5942k.m22327b(tArr, "$this$indexOf");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
        } else {
            int length2 = tArr.length;
            while (i < length2) {
                if (C5942k.m22326a((Object) t, (Object) tArr[i])) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static <T> List<T> m22122c(T[] tArr, Comparator<? super T> comparator) {
        C5942k.m22327b(tArr, "$this$sortedWith");
        C5942k.m22327b(comparator, "comparator");
        return C5830g.m22102a(m22119b(tArr, comparator));
    }

    /* renamed from: d */
    public static <T> T m22123d(T[] tArr) {
        C5942k.m22327b(tArr, "$this$singleOrNull");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: e */
    public static <T> List<T> m22124e(T[] tArr) {
        C5942k.m22327b(tArr, "$this$toList");
        int length = tArr.length;
        return length != 0 ? length != 1 ? m22125f(tArr) : C5836k.m22153a(tArr[0]) : C5837l.m22159a();
    }

    /* renamed from: f */
    public static <T> List<T> m22125f(T[] tArr) {
        C5942k.m22327b(tArr, "$this$toMutableList");
        return new ArrayList(C5837l.m22158a(tArr));
    }
}
