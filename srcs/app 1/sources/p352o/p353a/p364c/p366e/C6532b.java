package p352o.p353a.p364c.p366e;

import java.util.ArrayList;
import p308k.C5801k;
import p308k.C5809q;
import p308k.C5812t;
import p308k.p311c0.C5739b;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p352o.p353a.p364c.p368g.C6547a;
import p352o.p353a.p364c.p368g.C6549b;
import p352o.p353a.p364c.p368g.C6550c;
import p352o.p353a.p364c.p368g.C6551d;
import p352o.p353a.p364c.p368g.C6552e;
import p352o.p353a.p364c.p371j.C6557a;
import p352o.p353a.p364c.p372k.C6560a;
import p352o.p353a.p364c.p374m.C6565a;
import p352o.p353a.p377e.C6572a;

/* renamed from: o.a.c.e.b */
public final class C6532b<T> {

    /* renamed from: a */
    private ArrayList<C5739b<?>> f16168a = new ArrayList<>();

    /* renamed from: b */
    private C6547a<T> f16169b;

    /* renamed from: c */
    public C5922p<? super C6565a, ? super C6557a, ? extends T> f16170c;

    /* renamed from: d */
    private C6536e f16171d = new C6536e(false, false, 3, null);

    /* renamed from: e */
    private C6537f f16172e = new C6537f(null, 1, null);

    /* renamed from: f */
    public C6535d f16173f;

    /* renamed from: g */
    private C5918l<? super T, C5812t> f16174g;

    /* renamed from: h */
    private C5918l<? super T, C5812t> f16175h;

    /* renamed from: i */
    private final C6560a f16176i;

    /* renamed from: j */
    private final C6560a f16177j;

    /* renamed from: k */
    private final C5739b<?> f16178k;

    /* renamed from: o.a.c.e.b$a */
    static final class C6533a extends C5943l implements C5918l<C5739b<?>, String> {

        /* renamed from: g */
        public static final C6533a f16179g = new C6533a();

        C6533a() {
            super(1);
        }

        /* renamed from: a */
        public final String mo4090d(C5739b<?> bVar) {
            C5942k.m22327b(bVar, "it");
            return C6572a.m24854a(bVar);
        }
    }

    public C6532b(C6560a aVar, C6560a aVar2, C5739b<?> bVar) {
        C5942k.m22327b(bVar, "primaryType");
        this.f16176i = aVar;
        this.f16177j = aVar2;
        this.f16178k = bVar;
    }

    /* renamed from: a */
    public final <T> T mo16945a(C6550c cVar) {
        C5942k.m22327b(cVar, "context");
        C6547a<T> aVar = this.f16169b;
        if (aVar != null) {
            T b = aVar.mo16977b(cVar);
            if (b != null) {
                return b;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Definition without any InstanceContext - ");
        sb.append(this);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: a */
    public final void mo16946a() {
        C6547a<T> aVar = this.f16169b;
        if (aVar != null) {
            aVar.mo16976a();
        }
        this.f16169b = null;
    }

    /* renamed from: a */
    public final void mo16947a(C5922p<? super C6565a, ? super C6557a, ? extends T> pVar) {
        C5942k.m22327b(pVar, "<set-?>");
        this.f16170c = pVar;
    }

    /* renamed from: a */
    public final void mo16948a(C6535d dVar) {
        C5942k.m22327b(dVar, "<set-?>");
        this.f16173f = dVar;
    }

    /* renamed from: b */
    public final void mo16949b() {
        C6547a<T> aVar;
        C6535d dVar = this.f16173f;
        if (dVar != null) {
            int i = C6531a.f16167a[dVar.ordinal()];
            if (i == 1) {
                aVar = new C6552e<>(this);
            } else if (i == 2) {
                aVar = new C6549b<>(this);
            } else if (i == 3) {
                aVar = new C6551d<>(this);
            } else {
                throw new C5801k();
            }
            this.f16169b = aVar;
            return;
        }
        C5942k.m22329c("kind");
        throw null;
    }

    /* renamed from: c */
    public final C5922p<C6565a, C6557a, T> mo16950c() {
        C5922p<? super C6565a, ? super C6557a, ? extends T> pVar = this.f16170c;
        if (pVar != null) {
            return pVar;
        }
        C5942k.m22329c("definition");
        throw null;
    }

    /* renamed from: d */
    public final C6547a<T> mo16951d() {
        return this.f16169b;
    }

    /* renamed from: e */
    public final C5918l<T, C5812t> mo16952e() {
        return this.f16175h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5942k.m22326a((Object) C6532b.class, (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            C6532b bVar = (C6532b) obj;
            return !(C5942k.m22326a((Object) this.f16176i, (Object) bVar.f16176i) ^ true) && !(C5942k.m22326a((Object) this.f16178k, (Object) bVar.f16178k) ^ true);
        }
        throw new C5809q("null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
    }

    /* renamed from: f */
    public final C5918l<T, C5812t> mo16954f() {
        return this.f16174g;
    }

    /* renamed from: g */
    public final C6536e mo16955g() {
        return this.f16171d;
    }

    /* renamed from: h */
    public final C5739b<?> mo16956h() {
        return this.f16178k;
    }

    public int hashCode() {
        C6560a aVar = this.f16176i;
        return ((aVar != null ? aVar.hashCode() : 0) * 31) + this.f16178k.hashCode();
    }

    /* renamed from: i */
    public final C6537f mo16958i() {
        return this.f16172e;
    }

    /* renamed from: j */
    public final C6560a mo16959j() {
        return this.f16176i;
    }

    /* renamed from: k */
    public final C6560a mo16960k() {
        return this.f16177j;
    }

    /* renamed from: l */
    public final ArrayList<C5739b<?>> mo16961l() {
        return this.f16168a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        if (r2 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        if (r1 != null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r15 = this;
            o.a.c.e.d r0 = r15.f16173f
            if (r0 == 0) goto L_0x00b8
            java.lang.String r0 = r0.toString()
            o.a.c.k.a r1 = r15.f16176i
            java.lang.String r2 = "', "
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x0029
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "name:'"
            r1.append(r4)
            o.a.c.k.a r4 = r15.f16176i
            r1.append(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r1 = r3
        L_0x002a:
            o.a.c.k.a r4 = r15.f16177j
            if (r4 == 0) goto L_0x0047
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "scope:'"
            r4.append(r5)
            o.a.c.k.a r5 = r15.f16177j
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            if (r2 == 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r2 = r3
        L_0x0048:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "primary_type:'"
            r4.append(r5)
            k.c0.b<?> r5 = r15.f16178k
            java.lang.String r5 = p352o.p353a.p377e.C6572a.m24854a(r5)
            r4.append(r5)
            r5 = 39
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.util.ArrayList<k.c0.b<?>> r5 = r15.f16168a
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0090
            java.util.ArrayList<k.c0.b<?>> r6 = r15.f16168a
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            o.a.c.e.b$a r12 = p352o.p353a.p364c.p366e.C6532b.C6533a.f16179g
            r13 = 30
            r14 = 0
            java.lang.String r7 = ","
            java.lang.String r3 = p308k.p314u.C5845t.m22174a(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = ", secondary_type:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
        L_0x0090:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[type:"
            r5.append(r6)
            r5.append(r0)
            r0 = 44
            r5.append(r0)
            r5.append(r2)
            r5.append(r1)
            r5.append(r4)
            r5.append(r3)
            r0 = 93
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            return r0
        L_0x00b8:
            java.lang.String r0 = "kind"
            p308k.p323z.p325d.C5942k.m22329c(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p352o.p353a.p364c.p366e.C6532b.toString():java.lang.String");
    }
}
