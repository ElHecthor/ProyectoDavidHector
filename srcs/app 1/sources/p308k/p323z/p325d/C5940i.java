package p308k.p323z.p325d;

import p308k.p311c0.C5738a;
import p308k.p311c0.C5741d;

/* renamed from: k.z.d.i */
public class C5940i extends C5932c implements C5939h, C5741d {

    /* renamed from: i */
    private final int f14940i;

    public C5940i(int i, Object obj) {
        super(obj);
        this.f14940i = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C5738a mo15607b() {
        C5950s.m22342a(this);
        return this;
    }

    /* renamed from: d */
    public int mo15599d() {
        return this.f14940i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a(mo15608c(), r5.mo15608c()) != false) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof p308k.p323z.p325d.C5940i
            r2 = 0
            if (r1 == 0) goto L_0x0053
            k.z.d.i r5 = (p308k.p323z.p325d.C5940i) r5
            k.c0.c r1 = r4.mo9885f()
            if (r1 != 0) goto L_0x0018
            k.c0.c r1 = r5.mo9885f()
            if (r1 != 0) goto L_0x0051
            goto L_0x0026
        L_0x0018:
            k.c0.c r1 = r4.mo9885f()
            k.c0.c r3 = r5.mo9885f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0051
        L_0x0026:
            java.lang.String r1 = r4.mo9884e()
            java.lang.String r3 = r5.mo9884e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0051
            java.lang.String r1 = r4.mo9886i()
            java.lang.String r3 = r5.mo9886i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0051
            java.lang.Object r1 = r4.mo15608c()
            java.lang.Object r5 = r5.mo15608c()
            boolean r5 = p308k.p323z.p325d.C5942k.m22326a(r1, r5)
            if (r5 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            return r0
        L_0x0053:
            boolean r0 = r5 instanceof p308k.p311c0.C5741d
            if (r0 == 0) goto L_0x0060
            k.c0.a r0 = r4.mo15606a()
            boolean r5 = r5.equals(r0)
            return r5
        L_0x0060:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p308k.p323z.p325d.C5940i.equals(java.lang.Object):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C5741d m22318h() {
        return (C5741d) super.mo15609h();
    }

    public int hashCode() {
        return (((mo9885f() == null ? 0 : mo9885f().hashCode() * 31) + mo9884e().hashCode()) * 31) + mo9886i().hashCode();
    }

    public String toString() {
        String str;
        C5738a a = mo15606a();
        if (a != this) {
            return a.toString();
        }
        if ("<init>".equals(mo9884e())) {
            str = "constructor (Kotlin reflection is not available)";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("function ");
            sb.append(mo9884e());
            sb.append(" (Kotlin reflection is not available)");
            str = sb.toString();
        }
        return str;
    }
}
