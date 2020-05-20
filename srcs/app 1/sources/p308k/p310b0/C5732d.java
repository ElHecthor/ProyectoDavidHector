package p308k.p310b0;

/* renamed from: k.b0.d */
public final class C5732d extends C5729b implements C5728a<Integer> {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C5732d f14815j = new C5732d(1, 0);

    /* renamed from: k */
    public static final C5733a f14816k = new C5733a(null);

    /* renamed from: k.b0.d$a */
    public static final class C5733a {
        private C5733a() {
        }

        public /* synthetic */ C5733a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C5732d mo15377a() {
            return C5732d.f14815j;
        }
    }

    public C5732d(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo15362a(Comparable comparable) {
        return mo15374c(((Number) comparable).intValue());
    }

    /* renamed from: c */
    public boolean mo15374c(int i) {
        return mo15363c() <= i && i <= mo15364d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (mo15364d() == r3.mo15364d()) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof p308k.p310b0.C5732d
            if (r0 == 0) goto L_0x002b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            k.b0.d r0 = (p308k.p310b0.C5732d) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0029
        L_0x0013:
            int r0 = r2.mo15363c()
            k.b0.d r3 = (p308k.p310b0.C5732d) r3
            int r1 = r3.mo15363c()
            if (r0 != r1) goto L_0x002b
            int r0 = r2.mo15364d()
            int r3 = r3.mo15364d()
            if (r0 != r3) goto L_0x002b
        L_0x0029:
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p308k.p310b0.C5732d.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public Integer mo15375f() {
        return Integer.valueOf(mo15364d());
    }

    /* renamed from: g */
    public Integer mo15376g() {
        return Integer.valueOf(mo15363c());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (mo15363c() * 31) + mo15364d();
    }

    public boolean isEmpty() {
        return mo15363c() > mo15364d();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo15363c());
        sb.append("..");
        sb.append(mo15364d());
        return sb.toString();
    }
}
