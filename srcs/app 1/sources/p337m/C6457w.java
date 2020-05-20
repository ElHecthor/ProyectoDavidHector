package p337m;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p308k.p323z.p325d.C5942k;
import p337m.C6455v.C6456a;
import p337m.p338f0.C6250b;
import p350n.C6480e;
import p350n.C6483f;
import p350n.C6485h;

/* renamed from: m.w */
public final class C6457w extends C6225a0 {

    /* renamed from: g */
    public static final C6455v f15982g = C6455v.f15978f.mo16671a("multipart/mixed");

    /* renamed from: h */
    public static final C6455v f15983h = C6455v.f15978f.mo16671a("multipart/form-data");

    /* renamed from: i */
    private static final byte[] f15984i = {(byte) 58, (byte) 32};

    /* renamed from: j */
    private static final byte[] f15985j = {(byte) 13, (byte) 10};

    /* renamed from: k */
    private static final byte[] f15986k;

    /* renamed from: b */
    private final C6455v f15987b;

    /* renamed from: c */
    private long f15988c = -1;

    /* renamed from: d */
    private final C6485h f15989d;

    /* renamed from: e */
    private final C6455v f15990e;

    /* renamed from: f */
    private final List<C6460c> f15991f;

    /* renamed from: m.w$a */
    public static final class C6458a {

        /* renamed from: a */
        private final C6485h f15992a;

        /* renamed from: b */
        private C6455v f15993b;

        /* renamed from: c */
        private final List<C6460c> f15994c;

        public C6458a() {
            this(null, 1, null);
        }

        public C6458a(String str) {
            C5942k.m22327b(str, "boundary");
            this.f15992a = C6485h.f16098j.mo16875b(str);
            this.f15993b = C6457w.f15982g;
            this.f15994c = new ArrayList();
        }

        public /* synthetic */ C6458a(String str, int i, C5938g gVar) {
            if ((i & 1) != 0) {
                str = UUID.randomUUID().toString();
                C5942k.m22324a((Object) str, "UUID.randomUUID().toString()");
            }
            this(str);
        }

        /* renamed from: a */
        public final C6458a mo16674a(C6445s sVar, C6225a0 a0Var) {
            C5942k.m22327b(a0Var, "body");
            mo16676a(C6460c.f15995c.mo16680a(sVar, a0Var));
            return this;
        }

        /* renamed from: a */
        public final C6458a mo16675a(C6455v vVar) {
            C5942k.m22327b(vVar, "type");
            if (C5942k.m22326a((Object) vVar.mo16666a(), (Object) "multipart")) {
                this.f15993b = vVar;
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("multipart != ");
            sb.append(vVar);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        /* renamed from: a */
        public final C6458a mo16676a(C6460c cVar) {
            C5942k.m22327b(cVar, "part");
            this.f15994c.add(cVar);
            return this;
        }

        /* renamed from: a */
        public final C6457w mo16677a() {
            if (!this.f15994c.isEmpty()) {
                return new C6457w(this.f15992a, this.f15993b, C6250b.m23471b(this.f15994c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }
    }

    /* renamed from: m.w$b */
    public static final class C6459b {
        private C6459b() {
        }

        public /* synthetic */ C6459b(C5938g gVar) {
            this();
        }
    }

    /* renamed from: m.w$c */
    public static final class C6460c {

        /* renamed from: c */
        public static final C6461a f15995c = new C6461a(null);

        /* renamed from: a */
        private final C6445s f15996a;

        /* renamed from: b */
        private final C6225a0 f15997b;

        /* renamed from: m.w$c$a */
        public static final class C6461a {
            private C6461a() {
            }

            public /* synthetic */ C6461a(C5938g gVar) {
                this();
            }

            /* renamed from: a */
            public final C6460c mo16680a(C6445s sVar, C6225a0 a0Var) {
                C5942k.m22327b(a0Var, "body");
                boolean z = true;
                if ((sVar != null ? sVar.mo16602a("Content-Type") : null) == null) {
                    if ((sVar != null ? sVar.mo16602a("Content-Length") : null) != null) {
                        z = false;
                    }
                    if (z) {
                        return new C6460c(sVar, a0Var, null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }
        }

        private C6460c(C6445s sVar, C6225a0 a0Var) {
            this.f15996a = sVar;
            this.f15997b = a0Var;
        }

        public /* synthetic */ C6460c(C6445s sVar, C6225a0 a0Var, C5938g gVar) {
            this(sVar, a0Var);
        }

        /* renamed from: a */
        public final C6225a0 mo16678a() {
            return this.f15997b;
        }

        /* renamed from: b */
        public final C6445s mo16679b() {
            return this.f15996a;
        }
    }

    static {
        new C6459b(null);
        C6455v.f15978f.mo16671a("multipart/alternative");
        C6455v.f15978f.mo16671a("multipart/digest");
        C6455v.f15978f.mo16671a("multipart/parallel");
        byte b = (byte) 45;
        f15986k = new byte[]{b, b};
    }

    public C6457w(C6485h hVar, C6455v vVar, List<C6460c> list) {
        C5942k.m22327b(hVar, "boundaryByteString");
        C5942k.m22327b(vVar, "type");
        C5942k.m22327b(list, "parts");
        this.f15989d = hVar;
        this.f15990e = vVar;
        this.f15991f = list;
        C6456a aVar = C6455v.f15978f;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15990e);
        sb.append("; boundary=");
        sb.append(mo16673e());
        this.f15987b = aVar.mo16671a(sb.toString());
    }

    /* renamed from: a */
    private final long m24353a(C6483f fVar, boolean z) {
        C6480e eVar;
        if (z) {
            r14 = new C6480e();
            eVar = r14;
            r14 = r14;
        } else {
            eVar = 0;
            r14 = fVar;
        }
        int size = this.f15991f.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            C6460c cVar = (C6460c) this.f15991f.get(i);
            C6445s b = cVar.mo16679b();
            C6225a0 a = cVar.mo16678a();
            if (r14 != 0) {
                r14.write(f15986k);
                r14.mo16788a(this.f15989d);
                r14.write(f15985j);
                if (b != null) {
                    int size2 = b.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        r14.mo16784a(b.mo16604c(i2)).write(f15984i).mo16784a(b.mo16606d(i2)).write(f15985j);
                    }
                }
                C6455v b2 = a.mo16009b();
                if (b2 != null) {
                    r14.mo16784a("Content-Type: ").mo16784a(b2.toString()).write(f15985j);
                }
                long a2 = a.mo16007a();
                if (a2 != -1) {
                    r14.mo16784a("Content-Length: ").mo16806i(a2).write(f15985j);
                } else if (z) {
                    if (eVar != 0) {
                        eVar.mo16797d();
                        return -1;
                    }
                    C5942k.m22323a();
                    throw null;
                }
                r14.write(f15985j);
                if (z) {
                    j += a2;
                } else {
                    a.mo16008a(r14);
                }
                r14.write(f15985j);
                i++;
            } else {
                C5942k.m22323a();
                throw null;
            }
        }
        if (r14 != 0) {
            r14.write(f15986k);
            r14.mo16788a(this.f15989d);
            r14.write(f15986k);
            r14.write(f15985j);
            if (z) {
                if (eVar != 0) {
                    j += eVar.mo16834x();
                    eVar.mo16797d();
                } else {
                    C5942k.m22323a();
                    throw null;
                }
            }
            return j;
        }
        C5942k.m22323a();
        throw null;
    }

    /* renamed from: a */
    public long mo16007a() {
        long j = this.f15988c;
        if (j != -1) {
            return j;
        }
        long a = m24353a(null, true);
        this.f15988c = a;
        return a;
    }

    /* renamed from: a */
    public void mo16008a(C6483f fVar) {
        C5942k.m22327b(fVar, "sink");
        m24353a(fVar, false);
    }

    /* renamed from: b */
    public C6455v mo16009b() {
        return this.f15987b;
    }

    /* renamed from: e */
    public final String mo16673e() {
        return this.f15989d.mo16870r();
    }
}
