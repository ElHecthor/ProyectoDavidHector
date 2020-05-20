package p147g.p156d.p157a.p158a;

/* renamed from: g.d.a.a.a */
final class C3738a<T> extends C3740c<T> {

    /* renamed from: a */
    private final Integer f10603a;

    /* renamed from: b */
    private final T f10604b;

    /* renamed from: c */
    private final C3741d f10605c;

    C3738a(Integer num, T t, C3741d dVar) {
        this.f10603a = num;
        if (t != null) {
            this.f10604b = t;
            if (dVar != null) {
                this.f10605c = dVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    /* renamed from: a */
    public Integer mo11886a() {
        return this.f10603a;
    }

    /* renamed from: b */
    public T mo11887b() {
        return this.f10604b;
    }

    /* renamed from: c */
    public C3741d mo11888c() {
        return this.f10605c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r4.f10605c.equals(r5.mo11888c()) != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof p147g.p156d.p157a.p158a.C3740c
            r2 = 0
            if (r1 == 0) goto L_0x003b
            g.d.a.a.c r5 = (p147g.p156d.p157a.p158a.C3740c) r5
            java.lang.Integer r1 = r4.f10603a
            if (r1 != 0) goto L_0x0016
            java.lang.Integer r1 = r5.mo11886a()
            if (r1 != 0) goto L_0x0039
            goto L_0x0020
        L_0x0016:
            java.lang.Integer r3 = r5.mo11886a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0039
        L_0x0020:
            T r1 = r4.f10604b
            java.lang.Object r3 = r5.mo11887b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0039
            g.d.a.a.d r1 = r4.f10605c
            g.d.a.a.d r5 = r5.mo11888c()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            return r0
        L_0x003b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p157a.p158a.C3738a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Integer num = this.f10603a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f10604b.hashCode()) * 1000003) ^ this.f10605c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Event{code=");
        sb.append(this.f10603a);
        sb.append(", payload=");
        sb.append(this.f10604b);
        sb.append(", priority=");
        sb.append(this.f10605c);
        sb.append("}");
        return sb.toString();
    }
}
