package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: g.d.a.b.d.g.y5 */
public final class C4295y5<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: g */
    private static final C4295y5 f11441g;

    /* renamed from: f */
    private boolean f11442f = true;

    static {
        C4295y5 y5Var = new C4295y5();
        f11441g = y5Var;
        y5Var.f11442f = false;
    }

    private C4295y5() {
    }

    private C4295y5(Map<K, V> map) {
        super(map);
    }

    /* renamed from: a */
    private static int m17601a(Object obj) {
        if (obj instanceof byte[]) {
            return C4248v4.m17310c((byte[]) obj);
        }
        if (!(obj instanceof C4279x4)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static <K, V> C4295y5<K, V> m17602a() {
        return f11441g;
    }

    /* renamed from: e */
    private final void m17603e() {
        if (!this.f11442f) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public final void mo12938a(C4295y5<K, V> y5Var) {
        m17603e();
        if (!y5Var.isEmpty()) {
            putAll(y5Var);
        }
    }

    /* renamed from: b */
    public final C4295y5<K, V> mo12939b() {
        return isEmpty() ? new C4295y5<>() : new C4295y5<>(this);
    }

    /* renamed from: c */
    public final void mo12940c() {
        this.f11442f = false;
    }

    public final void clear() {
        m17603e();
        super.clear();
    }

    /* renamed from: d */
    public final boolean mo12942d() {
        return this.f11442f;
    }

    public final Set<Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
        L_0x0014:
            r7 = 0
            goto L_0x005a
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
            goto L_0x0014
        L_0x0059:
            r7 = 1
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p157a.p167b.p173d.p180g.C4295y5.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        for (Entry entry : entrySet()) {
            i += m17601a(entry.getValue()) ^ m17601a(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        m17603e();
        C4248v4.m17304a(k);
        C4248v4.m17304a(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m17603e();
        for (Object next : map.keySet()) {
            C4248v4.m17304a(next);
            C4248v4.m17304a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m17603e();
        return super.remove(obj);
    }
}
