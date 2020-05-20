package p255io.stashteam.stashapp.p269e.p280c;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import p308k.C5802l;
import p308k.C5808p;
import p308k.C5809q;
import p308k.p314u.C5835j;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.e.c.h */
public final class C5299h implements Serializable {

    /* renamed from: f */
    private final C5303j f13890f;

    /* renamed from: g */
    private final List<C5309o> f13891g;

    /* renamed from: h */
    private final List<C5315t> f13892h;

    /* renamed from: i */
    private final C5300a f13893i;

    /* renamed from: j */
    private final C5288b0 f13894j;

    /* renamed from: io.stashteam.stashapp.e.c.h$a */
    public static final class C5300a {
        /* access modifiers changed from: private */

        /* renamed from: c */
        public static final int f13895c = Calendar.getInstance().get(1);

        /* renamed from: d */
        public static final C5301a f13896d = new C5301a(null);

        /* renamed from: a */
        private final int f13897a;

        /* renamed from: b */
        private final int f13898b;

        /* renamed from: io.stashteam.stashapp.e.c.h$a$a */
        public static final class C5301a {
            private C5301a() {
            }

            public /* synthetic */ C5301a(C5938g gVar) {
                this();
            }

            /* renamed from: a */
            public final int mo14949a() {
                return C5300a.f13895c;
            }
        }

        public C5300a(int i, int i2) {
            this.f13897a = i;
            this.f13898b = i2;
        }

        /* renamed from: a */
        public final int mo14943a() {
            return this.f13898b;
        }

        /* renamed from: b */
        public final int mo14944b() {
            return this.f13897a;
        }

        /* renamed from: c */
        public final boolean mo14945c() {
            return this.f13897a == 2000 && this.f13898b == f13895c;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
            if (r2.f13898b == r3.f13898b) goto L_0x0017;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0017
                boolean r0 = r3 instanceof p255io.stashteam.stashapp.p269e.p280c.C5299h.C5300a
                if (r0 == 0) goto L_0x0015
                io.stashteam.stashapp.e.c.h$a r3 = (p255io.stashteam.stashapp.p269e.p280c.C5299h.C5300a) r3
                int r0 = r2.f13897a
                int r1 = r3.f13897a
                if (r0 != r1) goto L_0x0015
                int r0 = r2.f13898b
                int r3 = r3.f13898b
                if (r0 != r3) goto L_0x0015
                goto L_0x0017
            L_0x0015:
                r3 = 0
                return r3
            L_0x0017:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p280c.C5299h.C5300a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return (this.f13897a * 31) + this.f13898b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ReleasePeriod(startYear=");
            sb.append(this.f13897a);
            sb.append(", endYear=");
            sb.append(this.f13898b);
            sb.append(")");
            return sb.toString();
        }
    }

    public C5299h() {
        this(null, null, null, null, null, 31, null);
    }

    public C5299h(C5303j jVar, List<? extends C5309o> list, List<? extends C5315t> list2, C5300a aVar, C5288b0 b0Var) {
        this.f13890f = jVar;
        this.f13891g = list;
        this.f13892h = list2;
        this.f13893i = aVar;
        this.f13894j = b0Var;
    }

    public /* synthetic */ C5299h(C5303j jVar, List list, List list2, C5300a aVar, C5288b0 b0Var, int i, C5938g gVar) {
        C5303j jVar2 = (i & 1) != 0 ? null : jVar;
        this(jVar2, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? null : b0Var);
    }

    /* renamed from: k */
    private final String m20734k() {
        C5303j jVar = this.f13890f;
        if (jVar == null) {
            return "";
        }
        int i = C5302i.f13900b[jVar.ordinal()];
        boolean z = true;
        if (!(i == 1 || i == 2 || i != 3)) {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.mo14950f());
        sb.append(':');
        sb.append(z);
        sb.append(';');
        return sb.toString();
    }

    /* renamed from: l */
    private final String m20735l() {
        List<C5309o> list = this.f13891g;
        int i = 0;
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C5303j.GENRE.mo14950f());
        sb2.append(':');
        sb.append(sb2.toString());
        for (Object next : this.f13891g) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append(((C5309o) next).mo14974g());
                sb.append(i == C5837l.m22155a((List) this.f13891g) ? ";" : ",");
                i = i2;
            } else {
                C5835j.m22144b();
                throw null;
            }
        }
        String sb3 = sb.toString();
        C5942k.m22324a((Object) sb3, "queryBuilder.toString()");
        return sb3;
    }

    /* renamed from: m */
    private final String m20736m() {
        List<C5315t> list = this.f13892h;
        int i = 0;
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C5303j.PLATFORM.mo14950f());
        sb2.append(':');
        sb.append(sb2.toString());
        for (Object next : this.f13892h) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append(((C5315t) next).mo14989g());
                sb.append(i == C5837l.m22155a((List) this.f13892h) ? ";" : ",");
                i = i2;
            } else {
                C5835j.m22144b();
                throw null;
            }
        }
        String sb3 = sb.toString();
        C5942k.m22324a((Object) sb3, "queryBuilder.toString()");
        return sb3;
    }

    /* renamed from: n */
    private final String m20737n() {
        if (this.f13893i == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C5303j.RELEASE_YEAR.mo14950f());
        sb.append(':');
        sb.append(this.f13893i.mo14944b());
        sb.append('-');
        sb.append(this.f13893i.mo14943a());
        sb.append(';');
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo14930a() {
        String str = null;
        if (!mo14941j()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m20734k());
        sb.append(m20735l());
        sb.append(m20736m());
        sb.append(m20737n());
        String sb2 = sb.toString();
        C5942k.m22324a((Object) sb2, "queryBuilder.toString()");
        if (sb2 != null) {
            String obj = C5788q.m22032f(sb2).toString();
            if (!(obj.length() == 0)) {
                str = obj;
            }
            return str;
        }
        throw new C5809q("null cannot be cast to non-null type kotlin.CharSequence");
    }

    /* renamed from: b */
    public final int mo14931b() {
        int i = 1;
        int i2 = (this.f13890f == null ? 0 : 1) + 0;
        List<C5309o> list = this.f13891g;
        int size = i2 + (list != null ? list.size() : 0);
        List<C5315t> list2 = this.f13892h;
        int size2 = size + (list2 != null ? list2.size() : 0);
        if (this.f13893i == null) {
            i = 0;
        }
        return size2 + i;
    }

    /* renamed from: c */
    public final C5802l<Integer, String> mo14932c() {
        C5303j jVar = this.f13890f;
        if (jVar != null) {
            return C5808p.m22056a(Integer.valueOf(jVar.mo14952h()), null);
        }
        List<C5309o> list = this.f13891g;
        if (list != null && (!list.isEmpty())) {
            return C5808p.m22056a(Integer.valueOf(((C5309o) C5845t.m22183d((List) this.f13891g)).mo14976i()), null);
        }
        List<C5315t> list2 = this.f13892h;
        if (list2 != null && (!list2.isEmpty())) {
            return C5808p.m22056a(null, ((C5315t) C5845t.m22183d((List) this.f13892h)).mo14988f());
        }
        if (this.f13893i == null) {
            return C5808p.m22056a(null, null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13893i.mo14944b());
        sb.append('-');
        sb.append(this.f13893i.mo14943a());
        return C5808p.m22056a(null, sb.toString());
    }

    /* renamed from: d */
    public final C5303j mo14933d() {
        return this.f13890f;
    }

    /* renamed from: e */
    public final List<C5309o> mo14934e() {
        return this.f13891g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.f13894j, (java.lang.Object) r3.f13894j) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof p255io.stashteam.stashapp.p269e.p280c.C5299h
            if (r0 == 0) goto L_0x003b
            io.stashteam.stashapp.e.c.h r3 = (p255io.stashteam.stashapp.p269e.p280c.C5299h) r3
            io.stashteam.stashapp.e.c.j r0 = r2.f13890f
            io.stashteam.stashapp.e.c.j r1 = r3.f13890f
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.util.List<io.stashteam.stashapp.e.c.o> r0 = r2.f13891g
            java.util.List<io.stashteam.stashapp.e.c.o> r1 = r3.f13891g
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.util.List<io.stashteam.stashapp.e.c.t> r0 = r2.f13892h
            java.util.List<io.stashteam.stashapp.e.c.t> r1 = r3.f13892h
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x003b
            io.stashteam.stashapp.e.c.h$a r0 = r2.f13893i
            io.stashteam.stashapp.e.c.h$a r1 = r3.f13893i
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x003b
            io.stashteam.stashapp.e.c.b0 r0 = r2.f13894j
            io.stashteam.stashapp.e.c.b0 r3 = r3.f13894j
            boolean r3 = p308k.p323z.p325d.C5942k.m22326a(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p280c.C5299h.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final List<C5315t> mo14936f() {
        return this.f13892h;
    }

    /* renamed from: g */
    public final C5300a mo14937g() {
        return this.f13893i;
    }

    /* renamed from: h */
    public final C5288b0 mo14938h() {
        return this.f13894j;
    }

    public int hashCode() {
        C5303j jVar = this.f13890f;
        int i = 0;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        List<C5309o> list = this.f13891g;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<C5315t> list2 = this.f13892h;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        C5300a aVar = this.f13893i;
        int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C5288b0 b0Var = this.f13894j;
        if (b0Var != null) {
            i = b0Var.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public final String mo14940i() {
        String str;
        StringBuilder sb;
        C5303j jVar = this.f13890f;
        if (jVar != null) {
            int i = C5302i.f13899a[jVar.ordinal()];
            if (i == 1) {
                sb = new StringBuilder();
                sb.append(this.f13890f.mo14951g());
                sb.append(" < ");
                sb.append(System.currentTimeMillis() / ((long) 1000));
                sb.append(" AND ");
                sb.append(this.f13890f.mo14951g());
                str = " != 0";
            } else if (i == 2) {
                sb = new StringBuilder();
                sb.append(this.f13890f.mo14951g());
                str = " = 1";
            } else if (i == 3) {
                sb = new StringBuilder();
                sb.append(this.f13890f.mo14951g());
                str = " = 0";
            }
            sb.append(str);
            return sb.toString();
        }
        return null;
    }

    /* renamed from: j */
    public final boolean mo14941j() {
        return mo14931b() != 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FilterData(general=");
        sb.append(this.f13890f);
        sb.append(", genres=");
        sb.append(this.f13891g);
        sb.append(", platforms=");
        sb.append(this.f13892h);
        sb.append(", releasePeriod=");
        sb.append(this.f13893i);
        sb.append(", sortField=");
        sb.append(this.f13894j);
        sb.append(")");
        return sb.toString();
    }
}
