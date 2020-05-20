package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import p147g.p156d.p157a.p167b.p173d.p180g.C4137o4;

/* renamed from: g.d.a.b.d.g.m4 */
final class C4109m4<T extends C4137o4<T>> {

    /* renamed from: d */
    private static final C4109m4 f11115d = new C4109m4(true);

    /* renamed from: a */
    final C4296y6<T, Object> f11116a;

    /* renamed from: b */
    private boolean f11117b;

    /* renamed from: c */
    private boolean f11118c;

    private C4109m4() {
        this.f11116a = C4296y6.m17611b(16);
    }

    private C4109m4(C4296y6<T, Object> y6Var) {
        this.f11116a = y6Var;
        mo12650a();
    }

    private C4109m4(boolean z) {
        this(C4296y6.m17611b(0));
        mo12650a();
    }

    /* renamed from: a */
    static int m16804a(C3951c8 c8Var, int i, Object obj) {
        int e = C3945c4.m16038e(i);
        if (c8Var == C3951c8.GROUP) {
            C4248v4.m17307a((C3985e6) obj);
            e <<= 1;
        }
        return e + m16811b(c8Var, obj);
    }

    /* renamed from: a */
    public static int m16805a(C4137o4<?> o4Var, Object obj) {
        C3951c8 b = o4Var.mo12685b();
        int a = o4Var.mo12682a();
        if (!o4Var.mo12687d()) {
            return m16804a(b, a, obj);
        }
        int i = 0;
        List<Object> list = (List) obj;
        if (o4Var.mo12688e()) {
            for (Object b2 : list) {
                i += m16811b(b, b2);
            }
            return C3945c4.m16038e(a) + i + C3945c4.m16060l(i);
        }
        for (Object a2 : list) {
            i += m16804a(b, a, a2);
        }
        return i;
    }

    /* renamed from: a */
    private final Object m16806a(T t) {
        Object obj = this.f11116a.get(t);
        if (!(obj instanceof C3984e5)) {
            return obj;
        }
        C3984e5 e5Var = (C3984e5) obj;
        C3984e5.m16322c();
        throw null;
    }

    /* renamed from: a */
    private static Object m16807a(Object obj) {
        if (obj instanceof C4064j6) {
            return ((C4064j6) obj).mo12327a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: a */
    static void m16808a(C3945c4 c4Var, C3951c8 c8Var, int i, Object obj) {
        if (c8Var == C3951c8.GROUP) {
            C3985e6 e6Var = (C3985e6) obj;
            C4248v4.m17307a(e6Var);
            c4Var.mo12254a(i, 3);
            e6Var.mo12432a(c4Var);
            c4Var.mo12254a(i, 4);
            return;
        }
        c4Var.mo12254a(i, c8Var.mo12286b());
        switch (C4093l4.f11081b[c8Var.ordinal()]) {
            case 1:
                c4Var.mo12249a(((Double) obj).doubleValue());
                break;
            case 2:
                c4Var.mo12250a(((Float) obj).floatValue());
                return;
            case 3:
                c4Var.mo12261a(((Long) obj).longValue());
                return;
            case 4:
                c4Var.mo12261a(((Long) obj).longValue());
                return;
            case 5:
                c4Var.mo12251a(((Integer) obj).intValue());
                return;
            case 6:
                c4Var.mo12277c(((Long) obj).longValue());
                return;
            case 7:
                c4Var.mo12278d(((Integer) obj).intValue());
                return;
            case 8:
                c4Var.mo12266a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((C3985e6) obj).mo12432a(c4Var);
                return;
            case 10:
                c4Var.mo12262a((C3985e6) obj);
                return;
            case 11:
                if (obj instanceof C4092l3) {
                    c4Var.mo12263a((C4092l3) obj);
                    return;
                } else {
                    c4Var.mo12264a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof C4092l3) {
                    c4Var.mo12263a((C4092l3) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                c4Var.mo12273b(bArr, 0, bArr.length);
                return;
            case 13:
                c4Var.mo12268b(((Integer) obj).intValue());
                return;
            case 14:
                c4Var.mo12278d(((Integer) obj).intValue());
                return;
            case 15:
                c4Var.mo12277c(((Long) obj).longValue());
                return;
            case 16:
                c4Var.mo12274c(((Integer) obj).intValue());
                return;
            case 17:
                c4Var.mo12272b(((Long) obj).longValue());
                return;
            case 18:
                if (!(obj instanceof C4279x4)) {
                    c4Var.mo12251a(((Integer) obj).intValue());
                    break;
                } else {
                    c4Var.mo12251a(((C4279x4) obj).mo12325a());
                    return;
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if ((r3 instanceof p147g.p156d.p157a.p167b.p173d.p180g.C4279x4) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((r3 instanceof p147g.p156d.p157a.p167b.p173d.p180g.C3984e5) == false) goto L_0x0014;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m16809a(p147g.p156d.p157a.p167b.p173d.p180g.C3951c8 r2, java.lang.Object r3) {
        /*
            p147g.p156d.p157a.p167b.p173d.p180g.C4248v4.m17304a(r3)
            int[] r0 = p147g.p156d.p157a.p167b.p173d.p180g.C4093l4.f11080a
            g.d.a.b.d.g.f8 r2 = r2.mo12285a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001f;
                case 9: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r0 = 0
            goto L_0x0042
        L_0x0016:
            boolean r2 = r3 instanceof p147g.p156d.p157a.p167b.p173d.p180g.C3985e6
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof p147g.p156d.p157a.p167b.p173d.p180g.C3984e5
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x001f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof p147g.p156d.p157a.p167b.p173d.p180g.C4279x4
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0028:
            boolean r2 = r3 instanceof p147g.p156d.p157a.p167b.p173d.p180g.C4092l3
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0042:
            if (r0 == 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p157a.p167b.p173d.p180g.C4109m4.m16809a(g.d.a.b.d.g.c8, java.lang.Object):void");
    }

    /* renamed from: a */
    private static <T extends C4137o4<T>> boolean m16810a(Entry<T, Object> entry) {
        C4137o4 o4Var = (C4137o4) entry.getKey();
        if (o4Var.mo12686c() == C4004f8.MESSAGE) {
            boolean d = o4Var.mo12687d();
            Object value = entry.getValue();
            if (d) {
                for (C3985e6 c : (List) value) {
                    if (!c.mo12487c()) {
                        return false;
                    }
                }
            } else if (value instanceof C3985e6) {
                if (!((C3985e6) value).mo12487c()) {
                    return false;
                }
            } else if (value instanceof C3984e5) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* renamed from: b */
    private static int m16811b(C3951c8 c8Var, Object obj) {
        switch (C4093l4.f11081b[c8Var.ordinal()]) {
            case 1:
                return C3945c4.m16017b(((Double) obj).doubleValue());
            case 2:
                return C3945c4.m16018b(((Float) obj).floatValue());
            case 3:
                return C3945c4.m16037d(((Long) obj).longValue());
            case 4:
                return C3945c4.m16040e(((Long) obj).longValue());
            case 5:
                return C3945c4.m16041f(((Integer) obj).intValue());
            case 6:
                return C3945c4.m16048g(((Long) obj).longValue());
            case 7:
                return C3945c4.m16053i(((Integer) obj).intValue());
            case 8:
                return C3945c4.m16029b(((Boolean) obj).booleanValue());
            case 9:
                return C3945c4.m16033c((C3985e6) obj);
            case 10:
                return obj instanceof C3984e5 ? C3945c4.m16015a((C4048i5) (C3984e5) obj) : C3945c4.m16026b((C3985e6) obj);
            case 11:
                return obj instanceof C4092l3 ? C3945c4.m16027b((C4092l3) obj) : C3945c4.m16028b((String) obj);
            case 12:
                return obj instanceof C4092l3 ? C3945c4.m16027b((C4092l3) obj) : C3945c4.m16030b((byte[]) obj);
            case 13:
                return C3945c4.m16045g(((Integer) obj).intValue());
            case 14:
                return C3945c4.m16056j(((Integer) obj).intValue());
            case 15:
                return C3945c4.m16052h(((Long) obj).longValue());
            case 16:
                return C3945c4.m16049h(((Integer) obj).intValue());
            case 17:
                return C3945c4.m16044f(((Long) obj).longValue());
            case 18:
                return obj instanceof C4279x4 ? C3945c4.m16058k(((C4279x4) obj).mo12325a()) : C3945c4.m16058k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: b */
    private final void m16812b(T t, Object obj) {
        if (!t.mo12687d()) {
            m16809a(t.mo12685b(), obj);
            r6 = obj;
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                m16809a(t.mo12685b(), obj2);
            }
            r6 = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (r6 instanceof C3984e5) {
            this.f11118c = true;
        }
        this.f11116a.put(t, r6);
    }

    /* renamed from: b */
    private final void m16813b(Entry<T, Object> entry) {
        C4137o4 o4Var = (C4137o4) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C3984e5) {
            C3984e5 e5Var = (C3984e5) value;
            C3984e5.m16322c();
            throw null;
        } else if (o4Var.mo12687d()) {
            Object a = m16806a((T) o4Var);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m16807a(a2));
            }
            this.f11116a.put(o4Var, a);
        } else if (o4Var.mo12686c() == C4004f8.MESSAGE) {
            Object a3 = m16806a((T) o4Var);
            if (a3 == null) {
                this.f11116a.put(o4Var, m16807a(value));
            } else {
                this.f11116a.put(o4Var, a3 instanceof C4064j6 ? o4Var.mo12684a((C4064j6) a3, (C4064j6) value) : o4Var.mo12683a(((C3985e6) a3).mo12435k(), (C3985e6) value).mo12346f());
            }
        } else {
            this.f11116a.put(o4Var, m16807a(value));
        }
    }

    /* renamed from: c */
    private static int m16814c(Entry<T, Object> entry) {
        C4137o4 o4Var = (C4137o4) entry.getKey();
        Object value = entry.getValue();
        if (o4Var.mo12686c() != C4004f8.MESSAGE || o4Var.mo12687d() || o4Var.mo12688e()) {
            return m16805a(o4Var, value);
        }
        boolean z = value instanceof C3984e5;
        int a = ((C4137o4) entry.getKey()).mo12682a();
        return z ? C3945c4.m16023b(a, (C4048i5) (C3984e5) value) : C3945c4.m16021b(a, (C3985e6) value);
    }

    /* renamed from: g */
    public static <T extends C4137o4<T>> C4109m4<T> m16815g() {
        return f11115d;
    }

    /* renamed from: a */
    public final void mo12650a() {
        if (!this.f11117b) {
            this.f11116a.mo12907a();
            this.f11117b = true;
        }
    }

    /* renamed from: a */
    public final void mo12651a(C4109m4<T> m4Var) {
        for (int i = 0; i < m4Var.f11116a.mo12952c(); i++) {
            m16813b(m4Var.f11116a.mo12950a(i));
        }
        for (Entry b : m4Var.f11116a.mo12955d()) {
            m16813b(b);
        }
    }

    /* renamed from: b */
    public final boolean mo12652b() {
        return this.f11117b;
    }

    /* renamed from: c */
    public final Iterator<Entry<T, Object>> mo12653c() {
        return this.f11118c ? new C4063j5(this.f11116a.entrySet().iterator()) : this.f11116a.entrySet().iterator();
    }

    public final /* synthetic */ Object clone() {
        C4109m4 m4Var = new C4109m4();
        for (int i = 0; i < this.f11116a.mo12952c(); i++) {
            Entry a = this.f11116a.mo12950a(i);
            m4Var.m16812b((T) (C4137o4) a.getKey(), a.getValue());
        }
        for (Entry entry : this.f11116a.mo12955d()) {
            m4Var.m16812b((T) (C4137o4) entry.getKey(), entry.getValue());
        }
        m4Var.f11118c = this.f11118c;
        return m4Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Iterator<Entry<T, Object>> mo12655d() {
        return this.f11118c ? new C4063j5(this.f11116a.mo12956e().iterator()) : this.f11116a.mo12956e().iterator();
    }

    /* renamed from: e */
    public final boolean mo12656e() {
        for (int i = 0; i < this.f11116a.mo12952c(); i++) {
            if (!m16810a(this.f11116a.mo12950a(i))) {
                return false;
            }
        }
        for (Entry a : this.f11116a.mo12955d()) {
            if (!m16810a(a)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4109m4)) {
            return false;
        }
        return this.f11116a.equals(((C4109m4) obj).f11116a);
    }

    /* renamed from: f */
    public final int mo12658f() {
        int i = 0;
        for (int i2 = 0; i2 < this.f11116a.mo12952c(); i2++) {
            i += m16814c(this.f11116a.mo12950a(i2));
        }
        for (Entry c : this.f11116a.mo12955d()) {
            i += m16814c(c);
        }
        return i;
    }

    public final int hashCode() {
        return this.f11116a.hashCode();
    }
}
