package p308k.p313e0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p308k.C5802l;
import p308k.C5809q;
import p308k.p310b0.C5732d;
import p308k.p312d0.C5751d;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.p326w.C5954a;

/* renamed from: k.e0.e */
final class C5770e implements C5751d<C5732d> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharSequence f14838a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f14839b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f14840c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C5922p<CharSequence, Integer, C5802l<Integer, Integer>> f14841d;

    /* renamed from: k.e0.e$a */
    public static final class C5771a implements Iterator<C5732d>, C5954a {

        /* renamed from: f */
        private int f14842f = -1;

        /* renamed from: g */
        private int f14843g;

        /* renamed from: h */
        private int f14844h;

        /* renamed from: i */
        private C5732d f14845i;

        /* renamed from: j */
        private int f14846j;

        /* renamed from: k */
        final /* synthetic */ C5770e f14847k;

        C5771a(C5770e eVar) {
            this.f14847k = eVar;
            int a = C5736g.m21867a(eVar.f14839b, 0, eVar.f14838a.length());
            this.f14843g = a;
            this.f14844h = a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < p308k.p313e0.C5770e.m21921c(r6.f14847k)) goto L_0x0023;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m21923b() {
            /*
                r6 = this;
                int r0 = r6.f14844h
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f14842f = r1
                r0 = 0
                r6.f14845i = r0
                goto L_0x0099
            L_0x000c:
                k.e0.e r0 = r6.f14847k
                int r0 = r0.f14840c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f14846j
                int r0 = r0 + r3
                r6.f14846j = r0
                k.e0.e r4 = r6.f14847k
                int r4 = r4.f14840c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f14844h
                k.e0.e r4 = r6.f14847k
                java.lang.CharSequence r4 = r4.f14838a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                int r0 = r6.f14843g
                k.b0.d r1 = new k.b0.d
                k.e0.e r4 = r6.f14847k
                java.lang.CharSequence r4 = r4.f14838a
                int r4 = p308k.p313e0.C5788q.m22026c(r4)
                r1.<init>(r0, r4)
            L_0x0042:
                r6.f14845i = r1
            L_0x0044:
                r6.f14844h = r2
                goto L_0x0097
            L_0x0047:
                k.e0.e r0 = r6.f14847k
                k.z.c.p r0 = r0.f14841d
                k.e0.e r4 = r6.f14847k
                java.lang.CharSequence r4 = r4.f14838a
                int r5 = r6.f14844h
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.mo4018c(r4, r5)
                k.l r0 = (p308k.C5802l) r0
                if (r0 != 0) goto L_0x0073
                int r0 = r6.f14843g
                k.b0.d r1 = new k.b0.d
                k.e0.e r4 = r6.f14847k
                java.lang.CharSequence r4 = r4.f14838a
                int r4 = p308k.p313e0.C5788q.m22026c(r4)
                r1.<init>(r0, r4)
                goto L_0x0042
            L_0x0073:
                java.lang.Object r2 = r0.mo15418a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo15419b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f14843g
                k.b0.d r4 = p308k.p310b0.C5736g.m21875d(r4, r2)
                r6.f14845i = r4
                int r2 = r2 + r0
                r6.f14843g = r2
                if (r0 != 0) goto L_0x0095
                r1 = 1
            L_0x0095:
                int r2 = r2 + r1
                goto L_0x0044
            L_0x0097:
                r6.f14842f = r3
            L_0x0099:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p308k.p313e0.C5770e.C5771a.m21923b():void");
        }

        public boolean hasNext() {
            if (this.f14842f == -1) {
                m21923b();
            }
            return this.f14842f == 1;
        }

        public C5732d next() {
            if (this.f14842f == -1) {
                m21923b();
            }
            if (this.f14842f != 0) {
                C5732d dVar = this.f14845i;
                if (dVar != null) {
                    this.f14845i = null;
                    this.f14842f = -1;
                    return dVar;
                }
                throw new C5809q("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C5770e(CharSequence charSequence, int i, int i2, C5922p<? super CharSequence, ? super Integer, C5802l<Integer, Integer>> pVar) {
        C5942k.m22327b(charSequence, "input");
        C5942k.m22327b(pVar, "getNextMatch");
        this.f14838a = charSequence;
        this.f14839b = i;
        this.f14840c = i2;
        this.f14841d = pVar;
    }

    public Iterator<C5732d> iterator() {
        return new C5771a(this);
    }
}
