package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.i5 */
public class C4048i5 {

    /* renamed from: a */
    private volatile C3985e6 f11011a;

    /* renamed from: b */
    private volatile C4092l3 f11012b;

    static {
        C3999f4.m16366a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p147g.p156d.p157a.p167b.p173d.p180g.C3985e6 m16537b(p147g.p156d.p157a.p167b.p173d.p180g.C3985e6 r2) {
        /*
            r1 = this;
            g.d.a.b.d.g.e6 r0 = r1.f11011a
            if (r0 != 0) goto L_0x001c
            monitor-enter(r1)
            g.d.a.b.d.g.e6 r0 = r1.f11011a     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000b
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x000b:
            r1.f11011a = r2     // Catch:{ d5 -> 0x0012 }
            g.d.a.b.d.g.l3 r0 = p147g.p156d.p157a.p167b.p173d.p180g.C4092l3.f11077g     // Catch:{ d5 -> 0x0012 }
            r1.f11012b = r0     // Catch:{ d5 -> 0x0012 }
            goto L_0x0009
        L_0x0012:
            r1.f11011a = r2     // Catch:{ all -> 0x0019 }
            g.d.a.b.d.g.l3 r2 = p147g.p156d.p157a.p167b.p173d.p180g.C4092l3.f11077g     // Catch:{ all -> 0x0019 }
            r1.f11012b = r2     // Catch:{ all -> 0x0019 }
            goto L_0x0009
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        L_0x001c:
            g.d.a.b.d.g.e6 r2 = r1.f11011a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p157a.p167b.p173d.p180g.C4048i5.m16537b(g.d.a.b.d.g.e6):g.d.a.b.d.g.e6");
    }

    /* renamed from: a */
    public final int mo12538a() {
        if (this.f11012b != null) {
            return this.f11012b.mo12608a();
        }
        if (this.f11011a != null) {
            return this.f11011a.mo12434j();
        }
        return 0;
    }

    /* renamed from: a */
    public final C3985e6 mo12539a(C3985e6 e6Var) {
        C3985e6 e6Var2 = this.f11011a;
        this.f11012b = null;
        this.f11011a = e6Var;
        return e6Var2;
    }

    /* renamed from: b */
    public final C4092l3 mo12540b() {
        if (this.f11012b != null) {
            return this.f11012b;
        }
        synchronized (this) {
            if (this.f11012b != null) {
                C4092l3 l3Var = this.f11012b;
                return l3Var;
            }
            this.f11012b = this.f11011a == null ? C4092l3.f11077g : this.f11011a.mo12244e();
            C4092l3 l3Var2 = this.f11012b;
            return l3Var2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4048i5)) {
            return false;
        }
        C4048i5 i5Var = (C4048i5) obj;
        C3985e6 e6Var = this.f11011a;
        C3985e6 e6Var2 = i5Var.f11011a;
        return (e6Var == null && e6Var2 == null) ? mo12540b().equals(i5Var.mo12540b()) : (e6Var == null || e6Var2 == null) ? e6Var != null ? e6Var.equals(i5Var.m16537b(e6Var.mo12488d())) : m16537b(e6Var2.mo12488d()).equals(e6Var2) : e6Var.equals(e6Var2);
    }

    public int hashCode() {
        return 1;
    }
}
