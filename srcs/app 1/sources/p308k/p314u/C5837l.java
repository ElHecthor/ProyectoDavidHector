package p308k.p314u;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.u.l */
class C5837l extends C5836k {
    /* renamed from: a */
    public static <T> int m22155a(List<? extends T> list) {
        C5942k.m22327b(list, "$this$lastIndex");
        return list.size() - 1;
    }

    /* renamed from: a */
    public static final <T extends Comparable<? super T>> int m22156a(List<? extends T> list, T t, int i, int i2) {
        C5942k.m22327b(list, "$this$binarySearch");
        m22160a(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int a = C5854b.m22211a((Comparable) list.get(i4), t);
            if (a < 0) {
                i = i4 + 1;
            } else if (a <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: a */
    public static /* synthetic */ int m22157a(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return m22156a(list, comparable, i, i2);
    }

    /* renamed from: a */
    public static final <T> Collection<T> m22158a(T[] tArr) {
        C5942k.m22327b(tArr, "$this$asCollection");
        return new C5822c(tArr, false);
    }

    /* renamed from: a */
    public static <T> List<T> m22159a() {
        return C5848v.f14885f;
    }

    /* renamed from: a */
    private static final void m22160a(int i, int i2, int i3) {
        String str = ").";
        String str2 = "fromIndex (";
        if (i2 > i3) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(i2);
            sb.append(") is greater than toIndex (");
            sb.append(i3);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(i2);
            sb2.append(") is less than zero.");
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i3 > i) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("toIndex (");
            sb3.append(i3);
            sb3.append(") is greater than size (");
            sb3.append(i);
            sb3.append(str);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* renamed from: b */
    public static <T> List<T> m22161b(List<? extends T> list) {
        C5942k.m22327b(list, "$this$optimizeReadOnlyList");
        int size = list.size();
        return size != 0 ? size != 1 ? list : C5836k.m22153a(list.get(0)) : m22159a();
    }

    /* renamed from: b */
    public static <T> List<T> m22162b(T... tArr) {
        C5942k.m22327b(tArr, "elements");
        return tArr.length > 0 ? C5830g.m22102a(tArr) : m22159a();
    }

    /* renamed from: b */
    public static void m22163b() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* renamed from: c */
    public static <T> List<T> m22164c(T... tArr) {
        C5942k.m22327b(tArr, "elements");
        return C5832h.m22117b(tArr);
    }

    /* renamed from: d */
    public static <T> List<T> m22165d(T... tArr) {
        C5942k.m22327b(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C5822c(tArr, true));
    }
}
