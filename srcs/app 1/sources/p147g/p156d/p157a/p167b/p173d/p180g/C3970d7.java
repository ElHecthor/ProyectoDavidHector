package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.Map.Entry;

/* renamed from: g.d.a.b.d.g.d7 */
final class C3970d7 implements Comparable<C3970d7>, Entry<K, V> {

    /* renamed from: f */
    private final K f10908f;

    /* renamed from: g */
    private V f10909g;

    /* renamed from: h */
    private final /* synthetic */ C4296y6 f10910h;

    C3970d7(C4296y6 y6Var, K k, V v) {
        this.f10910h = y6Var;
        this.f10908f = k;
        this.f10909g = v;
    }

    C3970d7(C4296y6 y6Var, Entry<K, V> entry) {
        this(y6Var, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    private static boolean m16216a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C3970d7) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return m16216a(this.f10908f, entry.getKey()) && m16216a(this.f10909g, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f10908f;
    }

    public final V getValue() {
        return this.f10909g;
    }

    public final int hashCode() {
        K k = this.f10908f;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f10909g;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.f10910h.m17616f();
        V v2 = this.f10909g;
        this.f10909g = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10908f);
        String valueOf2 = String.valueOf(this.f10909g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
