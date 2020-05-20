package p147g.p156d.p157a.p167b.p173d.p180g;

import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4219e;

/* renamed from: g.d.a.b.d.g.s6 */
final class C4201s6 implements C3949c6 {

    /* renamed from: a */
    private final C3985e6 f11293a;

    /* renamed from: b */
    private final String f11294b;

    /* renamed from: c */
    private final Object[] f11295c;

    /* renamed from: d */
    private final int f11296d;

    C4201s6(C3985e6 e6Var, String str, Object[] objArr) {
        this.f11293a = e6Var;
        this.f11294b = str;
        this.f11295c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f11296d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f11296d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo12282a() {
        return (this.f11296d & 1) == 1 ? C4219e.f11323i : C4219e.f11324j;
    }

    /* renamed from: b */
    public final boolean mo12283b() {
        return (this.f11296d & 2) == 2;
    }

    /* renamed from: c */
    public final C3985e6 mo12284c() {
        return this.f11293a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo12796d() {
        return this.f11294b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Object[] mo12797e() {
        return this.f11295c;
    }
}
