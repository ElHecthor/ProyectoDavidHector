package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.Map.Entry;

/* renamed from: g.d.a.b.d.g.g5 */
final class C4017g5<K> implements Entry<K, Object> {

    /* renamed from: f */
    private Entry<K, C3984e5> f10974f;

    private C4017g5(Entry<K, C3984e5> entry) {
        this.f10974f = entry;
    }

    /* renamed from: a */
    public final C3984e5 mo12483a() {
        return (C3984e5) this.f10974f.getValue();
    }

    public final K getKey() {
        return this.f10974f.getKey();
    }

    public final Object getValue() {
        if (((C3984e5) this.f10974f.getValue()) == null) {
            return null;
        }
        C3984e5.m16322c();
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C3985e6) {
            return ((C3984e5) this.f10974f.getValue()).mo12539a((C3985e6) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
