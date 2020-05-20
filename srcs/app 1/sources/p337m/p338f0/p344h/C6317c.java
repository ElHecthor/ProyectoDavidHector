package p337m.p338f0.p344h;

import p308k.p323z.p325d.C5942k;
import p350n.C6485h;

/* renamed from: m.f0.h.c */
public final class C6317c {

    /* renamed from: d */
    public static final C6485h f15622d = C6485h.f16098j.mo16875b(":");

    /* renamed from: e */
    public static final C6485h f15623e = C6485h.f16098j.mo16875b(":status");

    /* renamed from: f */
    public static final C6485h f15624f = C6485h.f16098j.mo16875b(":method");

    /* renamed from: g */
    public static final C6485h f15625g = C6485h.f16098j.mo16875b(":path");

    /* renamed from: h */
    public static final C6485h f15626h = C6485h.f16098j.mo16875b(":scheme");

    /* renamed from: i */
    public static final C6485h f15627i = C6485h.f16098j.mo16875b(":authority");

    /* renamed from: a */
    public final int f15628a;

    /* renamed from: b */
    public final C6485h f15629b;

    /* renamed from: c */
    public final C6485h f15630c;

    /* renamed from: m.f0.h.c$a */
    public static final class C6318a {
        private C6318a() {
        }

        public /* synthetic */ C6318a(C5938g gVar) {
            this();
        }
    }

    static {
        new C6318a(null);
    }

    public C6317c(String str, String str2) {
        C5942k.m22327b(str, "name");
        C5942k.m22327b(str2, "value");
        this(C6485h.f16098j.mo16875b(str), C6485h.f16098j.mo16875b(str2));
    }

    public C6317c(C6485h hVar, String str) {
        C5942k.m22327b(hVar, "name");
        C5942k.m22327b(str, "value");
        this(hVar, C6485h.f16098j.mo16875b(str));
    }

    public C6317c(C6485h hVar, C6485h hVar2) {
        C5942k.m22327b(hVar, "name");
        C5942k.m22327b(hVar2, "value");
        this.f15629b = hVar;
        this.f15630c = hVar2;
        this.f15628a = hVar.mo16868p() + 32 + this.f15630c.mo16868p();
    }

    /* renamed from: a */
    public final C6485h mo16275a() {
        return this.f15629b;
    }

    /* renamed from: b */
    public final C6485h mo16276b() {
        return this.f15630c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.f15630c, (java.lang.Object) r3.f15630c) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof p337m.p338f0.p344h.C6317c
            if (r0 == 0) goto L_0x001d
            m.f0.h.c r3 = (p337m.p338f0.p344h.C6317c) r3
            n.h r0 = r2.f15629b
            n.h r1 = r3.f15629b
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x001d
            n.h r0 = r2.f15630c
            n.h r3 = r3.f15630c
            boolean r3 = p308k.p323z.p325d.C5942k.m22326a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p337m.p338f0.p344h.C6317c.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C6485h hVar = this.f15629b;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        C6485h hVar2 = this.f15630c;
        if (hVar2 != null) {
            i = hVar2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15629b.mo16870r());
        sb.append(": ");
        sb.append(this.f15630c.mo16870r());
        return sb.toString();
    }
}
