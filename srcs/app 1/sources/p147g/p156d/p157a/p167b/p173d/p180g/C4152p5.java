package p147g.p156d.p157a.p167b.p173d.p180g;

/* renamed from: g.d.a.b.d.g.p5 */
final class C4152p5 extends C4138o5 {
    private C4152p5() {
        super();
    }

    /* renamed from: b */
    private static <E> C3914a5<E> m16919b(Object obj, long j) {
        return (C3914a5) C4183r7.m17019f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12689a(Object obj, long j) {
        m16919b(obj, j).mo12080n();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo12690a(Object obj, Object obj2, long j) {
        C3914a5 b = m16919b(obj, j);
        C3914a5 b2 = m16919b(obj2, j);
        int size = b.size();
        int size2 = b2.size();
        if (size > 0 && size2 > 0) {
            if (!b.mo12079a()) {
                b = b.mo12078a(size2 + size);
            }
            b.addAll(b2);
        }
        if (size > 0) {
            b2 = b;
        }
        C4183r7.m16997a(obj, j, (Object) b2);
    }
}
