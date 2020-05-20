package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.Iterator;
import java.util.Map.Entry;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4218d;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4220f;

/* renamed from: g.d.a.b.d.g.k6 */
final class C4080k6<T> implements C4236u6<T> {

    /* renamed from: a */
    private final C3985e6 f11067a;

    /* renamed from: b */
    private final C4096l7<?, ?> f11068b;

    /* renamed from: c */
    private final boolean f11069c;

    /* renamed from: d */
    private final C4032h4<?> f11070d;

    private C4080k6(C4096l7<?, ?> l7Var, C4032h4<?> h4Var, C3985e6 e6Var) {
        this.f11068b = l7Var;
        this.f11069c = h4Var.mo12514a(e6Var);
        this.f11070d = h4Var;
        this.f11067a = e6Var;
    }

    /* renamed from: a */
    static <T> C4080k6<T> m16701a(C4096l7<?, ?> l7Var, C4032h4<?> h4Var, C3985e6 e6Var) {
        return new C4080k6<>(l7Var, h4Var, e6Var);
    }

    /* renamed from: a */
    public final int mo12541a(T t) {
        int hashCode = this.f11068b.mo12626a(t).hashCode();
        return this.f11069c ? (hashCode * 53) + this.f11070d.mo12511a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: a */
    public final T mo12543a() {
        return this.f11067a.mo12433b().mo12347m();
    }

    /* renamed from: a */
    public final void mo12544a(T t, C4051i8 i8Var) {
        Iterator c = this.f11070d.mo12511a((Object) t).mo12653c();
        while (c.hasNext()) {
            Entry entry = (Entry) c.next();
            C4137o4 o4Var = (C4137o4) entry.getKey();
            if (o4Var.mo12686c() != C4004f8.MESSAGE || o4Var.mo12687d() || o4Var.mo12688e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            i8Var.mo12396a(o4Var.mo12682a(), entry instanceof C4017g5 ? ((C4017g5) entry).mo12483a().mo12540b() : entry.getValue());
        }
        C4096l7<?, ?> l7Var = this.f11068b;
        l7Var.mo12632b(l7Var.mo12626a(t), i8Var);
    }

    /* renamed from: a */
    public final void mo12545a(T t, byte[] bArr, int i, int i2, C4077k3 k3Var) {
        C4214t4 t4Var = (C4214t4) t;
        C4140o7 o7Var = t4Var.zzb;
        if (o7Var == C4140o7.m16895d()) {
            o7Var = C4140o7.m16896e();
            t4Var.zzb = o7Var;
        }
        ((C4218d) t).mo12821a();
        C4220f fVar = null;
        while (i < i2) {
            int a = C4031h3.m16478a(bArr, i, k3Var);
            int i3 = k3Var.f11063a;
            if (i3 == 11) {
                int i4 = 0;
                Object obj = null;
                while (a < i2) {
                    a = C4031h3.m16478a(bArr, a, k3Var);
                    int i5 = k3Var.f11063a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (fVar != null) {
                                C4167q6.m16944a();
                                throw new NoSuchMethodError();
                            } else if (i7 == 2) {
                                a = C4031h3.m16485e(bArr, a, k3Var);
                                obj = (C4092l3) k3Var.f11065c;
                            }
                        }
                    } else if (i7 == 0) {
                        a = C4031h3.m16478a(bArr, a, k3Var);
                        i4 = k3Var.f11063a;
                        fVar = (C4220f) this.f11070d.mo12512a(k3Var.f11066d, this.f11067a, i4);
                    }
                    if (i5 == 12) {
                        break;
                    }
                    a = C4031h3.m16470a(i5, bArr, a, i2, k3Var);
                }
                if (obj != null) {
                    o7Var.mo12692a((i4 << 3) | 2, obj);
                }
                i = a;
            } else if ((i3 & 7) == 2) {
                fVar = (C4220f) this.f11070d.mo12512a(k3Var.f11066d, this.f11067a, i3 >>> 3);
                if (fVar == null) {
                    i = C4031h3.m16471a(i3, bArr, a, i2, o7Var, k3Var);
                } else {
                    C4167q6.m16944a();
                    throw new NoSuchMethodError();
                }
            } else {
                i = C4031h3.m16470a(i3, bArr, a, i2, k3Var);
            }
        }
        if (i != i2) {
            throw C3968d5.m16209e();
        }
    }

    /* renamed from: a */
    public final boolean mo12546a(T t, T t2) {
        if (!this.f11068b.mo12626a(t).equals(this.f11068b.mo12626a(t2))) {
            return false;
        }
        if (this.f11069c) {
            return this.f11070d.mo12511a((Object) t).equals(this.f11070d.mo12511a((Object) t2));
        }
        return true;
    }

    /* renamed from: b */
    public final void mo12547b(T t, T t2) {
        C4250v6.m17324a(this.f11068b, t, t2);
        if (this.f11069c) {
            C4250v6.m17323a(this.f11070d, t, t2);
        }
    }

    /* renamed from: b */
    public final boolean mo12548b(T t) {
        return this.f11070d.mo12511a((Object) t).mo12656e();
    }

    /* renamed from: c */
    public final void mo12549c(T t) {
        this.f11068b.mo12631b(t);
        this.f11070d.mo12516c(t);
    }

    /* renamed from: d */
    public final int mo12550d(T t) {
        C4096l7<?, ?> l7Var = this.f11068b;
        int c = l7Var.mo12634c(l7Var.mo12626a(t)) + 0;
        return this.f11069c ? c + this.f11070d.mo12511a((Object) t).mo12658f() : c;
    }
}
