package p337m.p349g0;

import java.util.Set;
import p308k.p323z.p325d.C5942k;
import p337m.C6445s;
import p337m.C6452u;

/* renamed from: m.g0.a */
public final class C6412a implements C6452u {

    /* renamed from: b */
    private volatile Set<String> f15871b;

    /* renamed from: c */
    private volatile C6413a f15872c;

    /* renamed from: d */
    private final C6414b f15873d;

    /* renamed from: m.g0.a$a */
    public enum C6413a {
        NONE,
        HEADERS,
        BODY
    }

    /* renamed from: m.g0.a$b */
    public interface C6414b {

        /* renamed from: a */
        public static final C6414b f15878a = new b$a();

        /* renamed from: m.g0.a$b$a */
        public static final class C6415a {
            private C6415a() {
            }

            public /* synthetic */ C6415a(C5938g gVar) {
                this();
            }
        }

        static {
            new C6415a(null);
        }

        /* renamed from: a */
        void mo16525a(String str);
    }

    public C6412a(C6414b bVar) {
        C5942k.m22327b(bVar, "logger");
        this.f15873d = bVar;
        this.f15871b = C5831g0.m22112a();
        this.f15872c = C6413a.NONE;
    }

    public /* synthetic */ C6412a(C6414b bVar, int i, C5938g gVar) {
        if ((i & 1) != 0) {
            bVar = C6414b.f15878a;
        }
        this(bVar);
    }

    /* renamed from: a */
    private final void m24153a(C6445s sVar, int i) {
        String d = this.f15871b.contains(sVar.mo16604c(i)) ? "██" : sVar.mo16606d(i);
        C6414b bVar = this.f15873d;
        StringBuilder sb = new StringBuilder();
        sb.append(sVar.mo16604c(i));
        sb.append(": ");
        sb.append(d);
        bVar.mo16525a(sb.toString());
    }

    /* renamed from: a */
    private final boolean m24154a(C6445s sVar) {
        String a = sVar.mo16602a("Content-Encoding");
        return a != null && !C5787p.m21979b(a, "identity", true) && !C5787p.m21979b(a, "gzip", true);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x032e, code lost:
        if (r2 != null) goto L_0x0336;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0170, code lost:
        if (r10 != null) goto L_0x0178;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p337m.C6232b0 mo14196a(p337m.C6452u.C6453a r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            java.lang.String r2 = "chain"
            p308k.p323z.p325d.C5942k.m22327b(r0, r2)
            m.g0.a$a r2 = r1.f15872c
            m.z r3 = r22.mo16259g()
            m.g0.a$a r4 = p337m.p349g0.C6412a.C6413a.NONE
            if (r2 != r4) goto L_0x0018
            m.b0 r0 = r0.mo16251a(r3)
            return r0
        L_0x0018:
            m.g0.a$a r4 = p337m.p349g0.C6412a.C6413a.BODY
            if (r2 != r4) goto L_0x001e
            r4 = 1
            goto L_0x001f
        L_0x001e:
            r4 = 0
        L_0x001f:
            if (r4 != 0) goto L_0x0028
            m.g0.a$a r7 = p337m.p349g0.C6412a.C6413a.HEADERS
            if (r2 != r7) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r2 = 0
            goto L_0x0029
        L_0x0028:
            r2 = 1
        L_0x0029:
            m.a0 r7 = r3.mo16749a()
            m.i r8 = r22.mo16253a()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "--> "
            r9.append(r10)
            java.lang.String r10 = r3.mo16754f()
            r9.append(r10)
            r10 = 32
            r9.append(r10)
            m.t r11 = r3.mo16756h()
            r9.append(r11)
            java.lang.String r11 = ""
            if (r8 == 0) goto L_0x0068
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = " "
            r12.append(r13)
            m.y r8 = r8.mo16197a()
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            goto L_0x0069
        L_0x0068:
            r8 = r11
        L_0x0069:
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "-byte body)"
            java.lang.String r12 = " ("
            if (r2 != 0) goto L_0x0091
            if (r7 == 0) goto L_0x0091
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            r13.append(r12)
            long r14 = r7.mo16007a()
            r13.append(r14)
            r13.append(r9)
            java.lang.String r8 = r13.toString()
        L_0x0091:
            m.g0.a$b r13 = r1.f15873d
            r13.mo16525a(r8)
            java.lang.String r8 = "-byte body omitted)"
            java.lang.String r13 = "UTF_8"
            if (r2 == 0) goto L_0x01e8
            m.s r5 = r3.mo16752d()
            if (r7 == 0) goto L_0x00f2
            m.v r6 = r7.mo16009b()
            if (r6 == 0) goto L_0x00c6
            java.lang.String r10 = "Content-Type"
            java.lang.String r10 = r5.mo16602a(r10)
            if (r10 != 0) goto L_0x00c6
            m.g0.a$b r10 = r1.f15873d
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Content-Type: "
            r14.append(r15)
            r14.append(r6)
            java.lang.String r6 = r14.toString()
            r10.mo16525a(r6)
        L_0x00c6:
            long r14 = r7.mo16007a()
            r17 = -1
            int r6 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r6 == 0) goto L_0x00f2
            java.lang.String r6 = "Content-Length"
            java.lang.String r6 = r5.mo16602a(r6)
            if (r6 != 0) goto L_0x00f2
            m.g0.a$b r6 = r1.f15873d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r14 = "Content-Length: "
            r10.append(r14)
            long r14 = r7.mo16007a()
            r10.append(r14)
            java.lang.String r10 = r10.toString()
            r6.mo16525a(r10)
        L_0x00f2:
            int r6 = r5.size()
            r10 = 0
        L_0x00f7:
            if (r10 >= r6) goto L_0x00ff
            r1.m24153a(r5, r10)
            int r10 = r10 + 1
            goto L_0x00f7
        L_0x00ff:
            java.lang.String r5 = "--> END "
            if (r4 == 0) goto L_0x01d0
            if (r7 != 0) goto L_0x0107
            goto L_0x01d0
        L_0x0107:
            m.s r6 = r3.mo16752d()
            boolean r6 = r1.m24154a(r6)
            if (r6 == 0) goto L_0x0126
            m.g0.a$b r6 = r1.f15873d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r5 = r3.mo16754f()
            r7.append(r5)
            java.lang.String r5 = " (encoded body omitted)"
            goto L_0x01de
        L_0x0126:
            boolean r6 = r7.mo16010c()
            if (r6 == 0) goto L_0x0141
            m.g0.a$b r6 = r1.f15873d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r5 = r3.mo16754f()
            r7.append(r5)
            java.lang.String r5 = " (duplex request body omitted)"
            goto L_0x01de
        L_0x0141:
            boolean r6 = r7.mo16011d()
            if (r6 == 0) goto L_0x015c
            m.g0.a$b r6 = r1.f15873d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r5 = r3.mo16754f()
            r7.append(r5)
            java.lang.String r5 = " (one-shot body omitted)"
            goto L_0x01de
        L_0x015c:
            n.e r6 = new n.e
            r6.<init>()
            r7.mo16008a(r6)
            m.v r10 = r7.mo16009b()
            if (r10 == 0) goto L_0x0173
            java.nio.charset.Charset r14 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r10 = r10.mo16667a(r14)
            if (r10 == 0) goto L_0x0173
            goto L_0x0178
        L_0x0173:
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
            p308k.p323z.p325d.C5942k.m22324a(r10, r13)
        L_0x0178:
            m.g0.a$b r14 = r1.f15873d
            r14.mo16525a(r11)
            boolean r14 = p337m.p349g0.C6416c.m24159a(r6)
            if (r14 == 0) goto L_0x01ab
            m.g0.a$b r14 = r1.f15873d
            java.lang.String r6 = r6.mo16782a(r10)
            r14.mo16525a(r6)
            m.g0.a$b r6 = r1.f15873d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            java.lang.String r5 = r3.mo16754f()
            r10.append(r5)
            r10.append(r12)
            long r14 = r7.mo16007a()
            r10.append(r14)
            r10.append(r9)
            goto L_0x01cb
        L_0x01ab:
            m.g0.a$b r6 = r1.f15873d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            java.lang.String r5 = r3.mo16754f()
            r10.append(r5)
            java.lang.String r5 = " (binary "
            r10.append(r5)
            long r14 = r7.mo16007a()
            r10.append(r14)
            r10.append(r8)
        L_0x01cb:
            java.lang.String r5 = r10.toString()
            goto L_0x01e5
        L_0x01d0:
            m.g0.a$b r6 = r1.f15873d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r5 = r3.mo16754f()
        L_0x01de:
            r7.append(r5)
            java.lang.String r5 = r7.toString()
        L_0x01e5:
            r6.mo16525a(r5)
        L_0x01e8:
            long r5 = java.lang.System.nanoTime()
            m.b0 r0 = r0.mo16251a(r3)     // Catch:{ Exception -> 0x03c0 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r14 = java.lang.System.nanoTime()
            long r14 = r14 - r5
            long r5 = r3.toMillis(r14)
            m.c0 r3 = r0.mo16018a()
            if (r3 == 0) goto L_0x03bb
            long r14 = r3.mo16061f()
            r17 = -1
            int r10 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r10 == 0) goto L_0x021d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r14)
            java.lang.String r7 = "-byte"
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            goto L_0x021f
        L_0x021d:
            java.lang.String r7 = "unknown-length"
        L_0x021f:
            m.g0.a$b r10 = r1.f15873d
            r17 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r18 = r14
            java.lang.String r14 = "<-- "
            r9.append(r14)
            int r14 = r0.mo16022g()
            r9.append(r14)
            java.lang.String r14 = r0.mo16027o()
            int r14 = r14.length()
            if (r14 != 0) goto L_0x0242
            r14 = 1
            goto L_0x0243
        L_0x0242:
            r14 = 0
        L_0x0243:
            if (r14 == 0) goto L_0x024b
            r16 = r8
            r8 = r11
            r20 = 32
            goto L_0x0266
        L_0x024b:
            java.lang.String r14 = r0.mo16027o()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r16 = r8
            r20 = 32
            java.lang.String r8 = java.lang.String.valueOf(r20)
            r15.append(r8)
            r15.append(r14)
            java.lang.String r8 = r15.toString()
        L_0x0266:
            r9.append(r8)
            r8 = 32
            r9.append(r8)
            m.z r8 = r0.mo16034v()
            m.t r8 = r8.mo16756h()
            r9.append(r8)
            r9.append(r12)
            r9.append(r5)
            java.lang.String r5 = "ms"
            r9.append(r5)
            if (r2 != 0) goto L_0x029d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = ", "
            r5.append(r6)
            r5.append(r7)
            java.lang.String r6 = " body"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            goto L_0x029e
        L_0x029d:
            r5 = r11
        L_0x029e:
            r9.append(r5)
            r5 = 41
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            r10.mo16525a(r5)
            if (r2 == 0) goto L_0x03ba
            m.s r2 = r0.mo16025l()
            int r5 = r2.size()
            r6 = 0
        L_0x02b8:
            if (r6 >= r5) goto L_0x02c0
            r1.m24153a(r2, r6)
            int r6 = r6 + 1
            goto L_0x02b8
        L_0x02c0:
            if (r4 == 0) goto L_0x03b3
            boolean r4 = p337m.p338f0.p342f.C6297e.m23677a(r0)
            if (r4 != 0) goto L_0x02ca
            goto L_0x03b3
        L_0x02ca:
            m.s r4 = r0.mo16025l()
            boolean r4 = r1.m24154a(r4)
            if (r4 == 0) goto L_0x02da
            m.g0.a$b r2 = r1.f15873d
            java.lang.String r3 = "<-- END HTTP (encoded body omitted)"
            goto L_0x03b7
        L_0x02da:
            n.g r4 = r3.mo16063h()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4.mo16794c(r5)
            n.e r4 = r4.getBuffer()
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r2 = r2.mo16602a(r5)
            java.lang.String r5 = "gzip"
            r6 = 1
            boolean r2 = p308k.p313e0.C5787p.m21979b(r5, r2, r6)
            if (r2 == 0) goto L_0x0321
            long r5 = r4.mo16834x()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            n.l r5 = new n.l
            n.e r4 = r4.clone()
            r5.<init>(r4)
            n.e r4 = new n.e     // Catch:{ all -> 0x0318 }
            r4.<init>()     // Catch:{ all -> 0x0318 }
            r4.mo16780a(r5)     // Catch:{ all -> 0x0318 }
            r6 = 0
            p308k.p322y.C5904a.m22293a(r5, r6)
            r7 = r2
            goto L_0x0322
        L_0x0318:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x031b }
        L_0x031b:
            r0 = move-exception
            r3 = r0
            p308k.p322y.C5904a.m22293a(r5, r2)
            throw r3
        L_0x0321:
            r7 = 0
        L_0x0322:
            m.v r2 = r3.mo16062g()
            if (r2 == 0) goto L_0x0331
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r2 = r2.mo16667a(r3)
            if (r2 == 0) goto L_0x0331
            goto L_0x0336
        L_0x0331:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            p308k.p323z.p325d.C5942k.m22324a(r2, r13)
        L_0x0336:
            boolean r3 = p337m.p349g0.C6416c.m24159a(r4)
            if (r3 != 0) goto L_0x0361
            m.g0.a$b r2 = r1.f15873d
            r2.mo16525a(r11)
            m.g0.a$b r2 = r1.f15873d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "<-- END HTTP (binary "
            r3.append(r5)
            long r4 = r4.mo16834x()
            r3.append(r4)
            r4 = r16
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.mo16525a(r3)
            return r0
        L_0x0361:
            r5 = 0
            int r3 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0379
            m.g0.a$b r3 = r1.f15873d
            r3.mo16525a(r11)
            m.g0.a$b r3 = r1.f15873d
            n.e r5 = r4.clone()
            java.lang.String r2 = r5.mo16782a(r2)
            r3.mo16525a(r2)
        L_0x0379:
            java.lang.String r2 = "<-- END HTTP ("
            m.g0.a$b r3 = r1.f15873d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            if (r7 == 0) goto L_0x0399
            r5.<init>()
            r5.append(r2)
            long r8 = r4.mo16834x()
            r5.append(r8)
            java.lang.String r2 = "-byte, "
            r5.append(r2)
            r5.append(r7)
            java.lang.String r2 = "-gzipped-byte body)"
            goto L_0x03a8
        L_0x0399:
            r5.<init>()
            r5.append(r2)
            long r6 = r4.mo16834x()
            r5.append(r6)
            r2 = r17
        L_0x03a8:
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r3.mo16525a(r2)
            goto L_0x03ba
        L_0x03b3:
            m.g0.a$b r2 = r1.f15873d
            java.lang.String r3 = "<-- END HTTP"
        L_0x03b7:
            r2.mo16525a(r3)
        L_0x03ba:
            return r0
        L_0x03bb:
            p308k.p323z.p325d.C5942k.m22323a()
            r0 = 0
            throw r0
        L_0x03c0:
            r0 = move-exception
            r2 = r0
            m.g0.a$b r0 = r1.f15873d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "<-- HTTP FAILED: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.mo16525a(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p337m.p349g0.C6412a.mo14196a(m.u$a):m.b0");
    }

    /* renamed from: a */
    public final void mo16524a(C6413a aVar) {
        C5942k.m22327b(aVar, "<set-?>");
        this.f15872c = aVar;
    }
}
