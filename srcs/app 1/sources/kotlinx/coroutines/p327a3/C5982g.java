package kotlinx.coroutines.p327a3;

/* renamed from: kotlinx.coroutines.a3.g */
public final class C5982g {
    /* renamed from: a */
    public static final <E> C5981f<E> m22497a(int i) {
        if (i == -2) {
            return new C5978d(C5983h.f14995e.mo15699a());
        }
        if (i == -1) {
            return new C5992p();
        }
        if (i == 0) {
            throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
        } else if (i != Integer.MAX_VALUE) {
            return new C5978d(i);
        } else {
            throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
        }
    }
}
