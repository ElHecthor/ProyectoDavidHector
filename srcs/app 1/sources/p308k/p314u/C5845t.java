package p308k.p314u;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p308k.C5809q;
import p308k.p312d0.C5751d;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.u.t */
class C5845t extends C5844s {

    /* renamed from: k.u.t$a */
    public static final class C5846a implements C5751d<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f14883a;

        public C5846a(Iterable iterable) {
            this.f14883a = iterable;
        }

        public Iterator<T> iterator() {
            return this.f14883a.iterator();
        }
    }

    /* renamed from: a */
    public static final <T, A extends Appendable> A m22171a(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C5918l<? super T, ? extends CharSequence> lVar) {
        C5942k.m22327b(iterable, "$this$joinTo");
        C5942k.m22327b(a, "buffer");
        C5942k.m22327b(charSequence, "separator");
        C5942k.m22327b(charSequence2, "prefix");
        C5942k.m22327b(charSequence3, "postfix");
        C5942k.m22327b(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C5777h.m21955a(a, next, lVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: a */
    public static /* synthetic */ Appendable m22172a(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C5918l lVar, int i2, Object obj) {
        CharSequence charSequence5 = (i2 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence6 = "";
        CharSequence charSequence7 = (i2 & 4) != 0 ? charSequence6 : charSequence2;
        if ((i2 & 8) == 0) {
            charSequence6 = charSequence3;
        }
        m22171a(iterable, appendable, charSequence5, charSequence7, charSequence6, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : lVar);
        return appendable;
    }

    /* renamed from: a */
    public static final <T> String m22173a(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C5918l<? super T, ? extends CharSequence> lVar) {
        C5942k.m22327b(iterable, "$this$joinToString");
        C5942k.m22327b(charSequence, "separator");
        C5942k.m22327b(charSequence2, "prefix");
        C5942k.m22327b(charSequence3, "postfix");
        C5942k.m22327b(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        m22171a(iterable, sb, charSequence, charSequence2, charSequence3, i, charSequence4, lVar);
        String sb2 = sb.toString();
        C5942k.m22324a((Object) sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: a */
    public static /* synthetic */ String m22174a(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C5918l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return m22173a(iterable, charSequence, charSequence6, charSequence5, i3, charSequence7, lVar);
    }

    /* renamed from: a */
    public static final <T, C extends Collection<? super T>> C m22175a(Iterable<? extends T> iterable, C c) {
        C5942k.m22327b(iterable, "$this$toCollection");
        C5942k.m22327b(c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: a */
    public static <T> List<T> m22176a(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        C5942k.m22327b(iterable, "$this$sortedWith");
        C5942k.m22327b(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return m22184d(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            String str = "null cannot be cast to non-null type kotlin.Array<T>";
            if (array == null) {
                throw new C5809q(str);
            } else if (array != null) {
                C5830g.m22105a((T[]) array, comparator);
                return C5830g.m22102a(array);
            } else {
                throw new C5809q(str);
            }
        } else {
            List<T> e = m22186e(iterable);
            C5841p.m22167a(e, comparator);
            return e;
        }
    }

    /* renamed from: a */
    public static <T> C5751d<T> m22177a(Iterable<? extends T> iterable) {
        C5942k.m22327b(iterable, "$this$asSequence");
        return new C5846a(iterable);
    }

    /* renamed from: a */
    public static int[] m22178a(Collection<Integer> collection) {
        C5942k.m22327b(collection, "$this$toIntArray");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Number intValue : collection) {
            int i2 = i + 1;
            iArr[i] = intValue.intValue();
            i = i2;
        }
        return iArr;
    }

    /* renamed from: b */
    public static <T> T m22179b(Iterable<? extends T> iterable) {
        C5942k.m22327b(iterable, "$this$single");
        if (iterable instanceof List) {
            return m22187f((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: b */
    public static <T> List<T> m22180b(Collection<? extends T> collection) {
        C5942k.m22327b(collection, "$this$toMutableList");
        return new ArrayList(collection);
    }

    /* renamed from: b */
    public static <T> List<T> m22181b(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        C5942k.m22327b(collection, "$this$plus");
        C5942k.m22327b(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C5842q.m22169a((Collection<? super T>) arrayList2, iterable);
        return arrayList2;
    }

    /* renamed from: c */
    public static int m22182c(Iterable<Integer> iterable) {
        C5942k.m22327b(iterable, "$this$sum");
        int i = 0;
        for (Number intValue : iterable) {
            i += intValue.intValue();
        }
        return i;
    }

    /* renamed from: d */
    public static <T> T m22183d(List<? extends T> list) {
        C5942k.m22327b(list, "$this$first");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: d */
    public static <T> List<T> m22184d(Iterable<? extends T> iterable) {
        List<T> list;
        C5942k.m22327b(iterable, "$this$toList");
        if (!(iterable instanceof Collection)) {
            return C5837l.m22161b(m22186e(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            list = C5837l.m22159a();
        } else if (size != 1) {
            list = m22180b(collection);
        } else {
            list = C5836k.m22153a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        return list;
    }

    /* renamed from: e */
    public static <T> T m22185e(List<? extends T> list) {
        C5942k.m22327b(list, "$this$last");
        if (!list.isEmpty()) {
            return list.get(C5837l.m22155a(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: e */
    public static final <T> List<T> m22186e(Iterable<? extends T> iterable) {
        C5942k.m22327b(iterable, "$this$toMutableList");
        if (iterable instanceof Collection) {
            return m22180b((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m22175a(iterable, (C) arrayList);
        return arrayList;
    }

    /* renamed from: f */
    public static final <T> T m22187f(List<? extends T> list) {
        C5942k.m22327b(list, "$this$single");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    /* renamed from: f */
    public static <T> Set<T> m22188f(Iterable<? extends T> iterable) {
        Set<T> set;
        C5942k.m22327b(iterable, "$this$toSet");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                set = C5831g0.m22112a();
            } else if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(C5821b0.m22068a(collection.size()));
                m22175a(iterable, (C) linkedHashSet);
                set = linkedHashSet;
            } else {
                set = C5829f0.m22101a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            }
            return set;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        m22175a(iterable, (C) linkedHashSet2);
        return C5831g0.m22113a(linkedHashSet2);
    }
}
