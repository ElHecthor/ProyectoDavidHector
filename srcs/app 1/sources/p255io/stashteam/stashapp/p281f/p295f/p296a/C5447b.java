package p255io.stashteam.stashapp.p281f.p295f.p296a;

/* renamed from: io.stashteam.stashapp.f.f.a.b */
public final class C5447b {

    /* renamed from: a */
    private final Integer f14243a;

    /* renamed from: b */
    private final String f14244b;

    /* renamed from: c */
    private final Runnable f14245c;

    public C5447b() {
        this(null, null, null, 7, null);
    }

    public C5447b(Integer num, String str, Runnable runnable) {
        this.f14243a = num;
        this.f14244b = str;
        this.f14245c = runnable;
    }

    public /* synthetic */ C5447b(Integer num, String str, Runnable runnable, int i, C5938g gVar) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            runnable = null;
        }
        this(num, str, runnable);
    }

    /* renamed from: a */
    public final Runnable mo15109a() {
        return this.f14245c;
    }

    /* renamed from: b */
    public final String mo15110b() {
        return this.f14244b;
    }

    /* renamed from: c */
    public final Integer mo15111c() {
        return this.f14243a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.f14245c, (java.lang.Object) r3.f14245c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof p255io.stashteam.stashapp.p281f.p295f.p296a.C5447b
            if (r0 == 0) goto L_0x0027
            io.stashteam.stashapp.f.f.a.b r3 = (p255io.stashteam.stashapp.p281f.p295f.p296a.C5447b) r3
            java.lang.Integer r0 = r2.f14243a
            java.lang.Integer r1 = r3.f14243a
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f14244b
            java.lang.String r1 = r3.f14244b
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.Runnable r0 = r2.f14245c
            java.lang.Runnable r3 = r3.f14245c
            boolean r3 = p308k.p323z.p325d.C5942k.m22326a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p281f.p295f.p296a.C5447b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Integer num = this.f14243a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.f14244b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Runnable runnable = this.f14245c;
        if (runnable != null) {
            i = runnable.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActionSheetItem(titleId=");
        sb.append(this.f14243a);
        sb.append(", title=");
        sb.append(this.f14244b);
        sb.append(", action=");
        sb.append(this.f14245c);
        sb.append(")");
        return sb.toString();
    }
}
