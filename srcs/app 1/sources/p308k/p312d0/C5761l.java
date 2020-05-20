package p308k.p312d0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.p326w.C5954a;

/* renamed from: k.d0.l */
class C5761l extends C5760k {

    /* renamed from: k.d0.l$a */
    public static final class C5762a implements Iterable<T>, C5954a {

        /* renamed from: f */
        final /* synthetic */ C5751d f14829f;

        public C5762a(C5751d dVar) {
            this.f14829f = dVar;
        }

        public Iterator<T> iterator() {
            return this.f14829f.iterator();
        }
    }

    /* renamed from: a */
    public static final <T, A extends Appendable> A m21901a(C5751d<? extends T> dVar, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C5918l<? super T, ? extends CharSequence> lVar) {
        C5942k.m22327b(dVar, "$this$joinTo");
        C5942k.m22327b(a, "buffer");
        C5942k.m22327b(charSequence, "separator");
        C5942k.m22327b(charSequence2, "prefix");
        C5942k.m22327b(charSequence3, "postfix");
        C5942k.m22327b(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : dVar) {
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
    public static final <T> String m21902a(C5751d<? extends T> dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C5918l<? super T, ? extends CharSequence> lVar) {
        C5942k.m22327b(dVar, "$this$joinToString");
        C5942k.m22327b(charSequence, "separator");
        C5942k.m22327b(charSequence2, "prefix");
        C5942k.m22327b(charSequence3, "postfix");
        C5942k.m22327b(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        m21901a(dVar, sb, charSequence, charSequence2, charSequence3, i, charSequence4, lVar);
        String sb2 = sb.toString();
        C5942k.m22324a((Object) sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: a */
    public static /* synthetic */ String m21903a(C5751d dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C5918l lVar, int i2, Object obj) {
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
        return m21902a(dVar, charSequence, charSequence6, charSequence5, i3, charSequence7, lVar);
    }

    /* renamed from: a */
    public static final <T, C extends Collection<? super T>> C m21904a(C5751d<? extends T> dVar, C c) {
        C5942k.m22327b(dVar, "$this$toCollection");
        C5942k.m22327b(c, "destination");
        for (Object add : dVar) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: a */
    public static <T> C5751d<T> m21905a(C5751d<? extends T> dVar, int i) {
        C5942k.m22327b(dVar, "$this$drop");
        if (i >= 0) {
            return i == 0 ? dVar : dVar instanceof C5750c ? ((C5750c) dVar).mo15384a(i) : new C5748b(dVar, i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Requested element count ");
        sb.append(i);
        sb.append(" is less than zero.");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public static <T, R> C5751d<R> m21906a(C5751d<? extends T> dVar, C5918l<? super T, ? extends R> lVar) {
        C5942k.m22327b(dVar, "$this$map");
        C5942k.m22327b(lVar, "transform");
        return new C5763m(dVar, lVar);
    }

    /* renamed from: b */
    public static <T> Iterable<T> m21907b(C5751d<? extends T> dVar) {
        C5942k.m22327b(dVar, "$this$asIterable");
        return new C5762a(dVar);
    }

    /* renamed from: c */
    public static <T> List<T> m21908c(C5751d<? extends T> dVar) {
        C5942k.m22327b(dVar, "$this$toList");
        return C5837l.m22161b(m21909d(dVar));
    }

    /* renamed from: d */
    public static final <T> List<T> m21909d(C5751d<? extends T> dVar) {
        C5942k.m22327b(dVar, "$this$toMutableList");
        ArrayList arrayList = new ArrayList();
        m21904a(dVar, (C) arrayList);
        return arrayList;
    }
}
