package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.Collections;
import java.util.List;

/* renamed from: g.d.a.b.d.g.q5 */
final class C4166q5 extends C4138o5 {

    /* renamed from: c */
    private static final Class<?> f11245c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C4166q5() {
        super();
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.List<L>] */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m16940a(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = m16941b(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof p147g.p156d.p157a.p167b.p173d.p180g.C4094l5
            if (r1 == 0) goto L_0x0014
            g.d.a.b.d.g.m5 r0 = new g.d.a.b.d.g.m5
            r0.<init>(r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof p147g.p156d.p157a.p167b.p173d.p180g.C4182r6
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof p147g.p156d.p157a.p167b.p173d.p180g.C3914a5
            if (r1 == 0) goto L_0x0024
            g.d.a.b.d.g.a5 r0 = (p147g.p156d.p157a.p167b.p173d.p180g.C3914a5) r0
            g.d.a.b.d.g.a5 r6 = r0.mo12078a(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            p147g.p156d.p157a.p167b.p173d.p180g.C4183r7.m16997a(r3, r4, r0)
            goto L_0x007a
        L_0x002d:
            java.lang.Class<?> r1 = f11245c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
        L_0x0046:
            p147g.p156d.p157a.p167b.p173d.p180g.C4183r7.m16997a(r3, r4, r1)
            r0 = r1
            goto L_0x007a
        L_0x004b:
            boolean r1 = r0 instanceof p147g.p156d.p157a.p167b.p173d.p180g.C4168q7
            if (r1 == 0) goto L_0x005f
            g.d.a.b.d.g.m5 r1 = new g.d.a.b.d.g.m5
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            g.d.a.b.d.g.q7 r0 = (p147g.p156d.p157a.p167b.p173d.p180g.C4168q7) r0
            r1.addAll(r0)
            goto L_0x0046
        L_0x005f:
            boolean r1 = r0 instanceof p147g.p156d.p157a.p167b.p173d.p180g.C4182r6
            if (r1 == 0) goto L_0x007a
            boolean r1 = r0 instanceof p147g.p156d.p157a.p167b.p173d.p180g.C3914a5
            if (r1 == 0) goto L_0x007a
            r1 = r0
            g.d.a.b.d.g.a5 r1 = (p147g.p156d.p157a.p167b.p173d.p180g.C3914a5) r1
            boolean r2 = r1.mo12079a()
            if (r2 != 0) goto L_0x007a
            int r0 = r0.size()
            int r0 = r0 + r6
            g.d.a.b.d.g.a5 r0 = r1.mo12078a(r0)
            goto L_0x0029
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p157a.p167b.p173d.p180g.C4166q5.m16940a(java.lang.Object, long, int):java.util.List");
    }

    /* renamed from: b */
    private static <E> List<E> m16941b(Object obj, long j) {
        return (List) C4183r7.m17019f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12689a(Object obj, long j) {
        Object obj2;
        List list = (List) C4183r7.m17019f(obj, j);
        if (list instanceof C4094l5) {
            obj2 = ((C4094l5) list).mo12624j();
        } else if (!f11245c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C4182r6) || !(list instanceof C3914a5)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C3914a5 a5Var = (C3914a5) list;
                if (a5Var.mo12079a()) {
                    a5Var.mo12080n();
                }
                return;
            }
        } else {
            return;
        }
        C4183r7.m16997a(obj, j, obj2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo12690a(Object obj, Object obj2, long j) {
        List b = m16941b(obj2, j);
        List a = m16940a(obj, j, b.size());
        int size = a.size();
        int size2 = b.size();
        if (size > 0 && size2 > 0) {
            a.addAll(b);
        }
        if (size > 0) {
            b = a;
        }
        C4183r7.m16997a(obj, j, (Object) b);
    }
}
