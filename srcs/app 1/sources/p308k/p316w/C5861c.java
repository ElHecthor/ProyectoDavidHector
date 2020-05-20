package p308k.p316w;

import java.io.Serializable;
import p308k.C5809q;
import p308k.C5812t;
import p308k.p316w.C5871g.C5872a;
import p308k.p316w.C5871g.C5874b;
import p308k.p316w.C5871g.C5876c;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p308k.p323z.p325d.C5947p;

/* renamed from: k.w.c */
public final class C5861c implements C5871g, Serializable {

    /* renamed from: f */
    private final C5871g f14892f;

    /* renamed from: g */
    private final C5874b f14893g;

    /* renamed from: k.w.c$a */
    private static final class C5862a implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: f */
        private final C5871g[] f14894f;

        /* renamed from: k.w.c$a$a */
        public static final class C5863a {
            private C5863a() {
            }

            public /* synthetic */ C5863a(C5938g gVar) {
                this();
            }
        }

        static {
            new C5863a(null);
        }

        public C5862a(C5871g[] gVarArr) {
            C5942k.m22327b(gVarArr, "elements");
            this.f14894f = gVarArr;
        }

        private final Object readResolve() {
            C5871g[] gVarArr = this.f14894f;
            C5871g gVar = C5877h.f14901f;
            for (C5871g plus : gVarArr) {
                gVar = gVar.plus(plus);
            }
            return gVar;
        }
    }

    /* renamed from: k.w.c$b */
    static final class C5864b extends C5943l implements C5922p<String, C5874b, String> {

        /* renamed from: g */
        public static final C5864b f14895g = new C5864b();

        C5864b() {
            super(2);
        }

        /* renamed from: a */
        public final String mo4018c(String str, C5874b bVar) {
            C5942k.m22327b(str, "acc");
            C5942k.m22327b(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(", ");
            sb.append(bVar);
            return sb.toString();
        }
    }

    /* renamed from: k.w.c$c */
    static final class C5865c extends C5943l implements C5922p<C5812t, C5874b, C5812t> {

        /* renamed from: g */
        final /* synthetic */ C5871g[] f14896g;

        /* renamed from: h */
        final /* synthetic */ C5947p f14897h;

        C5865c(C5871g[] gVarArr, C5947p pVar) {
            this.f14896g = gVarArr;
            this.f14897h = pVar;
            super(2);
        }

        /* renamed from: a */
        public final void mo15579a(C5812t tVar, C5874b bVar) {
            C5942k.m22327b(tVar, "<anonymous parameter 0>");
            C5942k.m22327b(bVar, "element");
            C5871g[] gVarArr = this.f14896g;
            C5947p pVar = this.f14897h;
            int i = pVar.f14945f;
            pVar.f14945f = i + 1;
            gVarArr[i] = bVar;
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ Object mo4018c(Object obj, Object obj2) {
            mo15579a((C5812t) obj, (C5874b) obj2);
            return C5812t.f14872a;
        }
    }

    public C5861c(C5871g gVar, C5874b bVar) {
        C5942k.m22327b(gVar, "left");
        C5942k.m22327b(bVar, "element");
        this.f14892f = gVar;
        this.f14893g = bVar;
    }

    /* renamed from: a */
    private final boolean m22217a(C5861c cVar) {
        while (m22218a(cVar.f14893g)) {
            C5871g gVar = cVar.f14892f;
            if (gVar instanceof C5861c) {
                cVar = (C5861c) gVar;
            } else if (gVar != null) {
                return m22218a((C5874b) gVar);
            } else {
                throw new C5809q("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
            }
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m22218a(C5874b bVar) {
        return C5942k.m22326a((Object) get(bVar.getKey()), (Object) bVar);
    }

    /* renamed from: b */
    private final int m22219b() {
        int i = 2;
        C5861c cVar = this;
        while (true) {
            C5871g gVar = cVar.f14892f;
            if (!(gVar instanceof C5861c)) {
                gVar = null;
            }
            cVar = (C5861c) gVar;
            if (cVar == null) {
                return i;
            }
            i++;
        }
    }

    private final Object writeReplace() {
        int b = m22219b();
        C5871g[] gVarArr = new C5871g[b];
        C5947p pVar = new C5947p();
        boolean z = false;
        pVar.f14945f = 0;
        fold(C5812t.f14872a, new C5865c(gVarArr, pVar));
        if (pVar.f14945f == b) {
            z = true;
        }
        if (z) {
            return new C5862a(gVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r3.m22217a(r2) != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001b
            boolean r0 = r3 instanceof p308k.p316w.C5861c
            if (r0 == 0) goto L_0x0019
            k.w.c r3 = (p308k.p316w.C5861c) r3
            int r0 = r3.m22219b()
            int r1 = r2.m22219b()
            if (r0 != r1) goto L_0x0019
            boolean r3 = r3.m22217a(r2)
            if (r3 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r3 = 0
            goto L_0x001c
        L_0x001b:
            r3 = 1
        L_0x001c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p308k.p316w.C5861c.equals(java.lang.Object):boolean");
    }

    public <R> R fold(R r, C5922p<? super R, ? super C5874b, ? extends R> pVar) {
        C5942k.m22327b(pVar, "operation");
        return pVar.mo4018c(this.f14892f.fold(r, pVar), this.f14893g);
    }

    public <E extends C5874b> E get(C5876c<E> cVar) {
        C5942k.m22327b(cVar, "key");
        C5861c cVar2 = this;
        while (true) {
            E e = cVar2.f14893g.get(cVar);
            if (e != null) {
                return e;
            }
            C5871g gVar = cVar2.f14892f;
            if (!(gVar instanceof C5861c)) {
                return gVar.get(cVar);
            }
            cVar2 = (C5861c) gVar;
        }
    }

    public int hashCode() {
        return this.f14892f.hashCode() + this.f14893g.hashCode();
    }

    public C5871g minusKey(C5876c<?> cVar) {
        C5942k.m22327b(cVar, "key");
        if (this.f14893g.get(cVar) != null) {
            return this.f14892f;
        }
        C5871g minusKey = this.f14892f.minusKey(cVar);
        C5871g gVar = minusKey == this.f14892f ? this : minusKey == C5877h.f14901f ? this.f14893g : new C5861c(minusKey, this.f14893g);
        return gVar;
    }

    public C5871g plus(C5871g gVar) {
        C5942k.m22327b(gVar, "context");
        return C5872a.m22232a(this, gVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append((String) fold("", C5864b.f14895g));
        sb.append("]");
        return sb.toString();
    }
}
