package p147g.p156d.p204b.p207y.p208n;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import p147g.p156d.p204b.C4485f;
import p147g.p156d.p204b.C4497l;
import p147g.p156d.p204b.C4502q;
import p147g.p156d.p204b.C4505t;
import p147g.p156d.p204b.C4509v;
import p147g.p156d.p204b.C4511w;
import p147g.p156d.p204b.p205a0.C4470a;
import p147g.p156d.p204b.p205a0.C4472b;
import p147g.p156d.p204b.p205a0.C4473c;
import p147g.p156d.p204b.p207y.C4518b;
import p147g.p156d.p204b.p207y.C4522c;
import p147g.p156d.p204b.p207y.C4540f;
import p147g.p156d.p204b.p207y.C4550i;
import p147g.p156d.p204b.p207y.C4553l;
import p147g.p156d.p204b.p211z.C4632a;

/* renamed from: g.d.b.y.n.g */
public final class C4572g implements C4511w {

    /* renamed from: f */
    private final C4522c f12005f;

    /* renamed from: g */
    final boolean f12006g;

    /* renamed from: g.d.b.y.n.g$a */
    private final class C4573a<K, V> extends C4509v<Map<K, V>> {

        /* renamed from: a */
        private final C4509v<K> f12007a;

        /* renamed from: b */
        private final C4509v<V> f12008b;

        /* renamed from: c */
        private final C4550i<? extends Map<K, V>> f12009c;

        public C4573a(C4485f fVar, Type type, C4509v<K> vVar, Type type2, C4509v<V> vVar2, C4550i<? extends Map<K, V>> iVar) {
            this.f12007a = new C4588m(fVar, vVar, type);
            this.f12008b = new C4588m(fVar, vVar2, type2);
            this.f12009c = iVar;
        }

        /* renamed from: a */
        private String m18509a(C4497l lVar) {
            if (lVar.mo13369i()) {
                C4502q e = lVar.mo13365e();
                if (e.mo13388t()) {
                    return String.valueOf(e.mo13385q());
                }
                if (e.mo13387s()) {
                    return Boolean.toString(e.mo13380k());
                }
                if (e.mo13389u()) {
                    return e.mo13386r();
                }
                throw new AssertionError();
            } else if (lVar.mo13367g()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: a */
        public Map<K, V> m18511a(C4470a aVar) {
            C4472b w = aVar.mo13307w();
            if (w == C4472b.NULL) {
                aVar.mo13305u();
                return null;
            }
            Map<K, V> map = (Map) this.f12009c.mo13419a();
            String str = "duplicate key: ";
            if (w == C4472b.BEGIN_ARRAY) {
                aVar.mo13288a();
                while (aVar.mo13296i()) {
                    aVar.mo13288a();
                    Object a = this.f12007a.mo13284a(aVar);
                    if (map.put(a, this.f12008b.mo13284a(aVar)) == null) {
                        aVar.mo13293g();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(a);
                        throw new C4505t(sb.toString());
                    }
                }
                aVar.mo13293g();
            } else {
                aVar.mo13291d();
                while (aVar.mo13296i()) {
                    C4540f.f11953a.mo13309a(aVar);
                    Object a2 = this.f12007a.mo13284a(aVar);
                    if (map.put(a2, this.f12008b.mo13284a(aVar)) != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(a2);
                        throw new C4505t(sb2.toString());
                    }
                }
                aVar.mo13295h();
            }
            return map;
        }

        /* renamed from: a */
        public void mo13285a(C4473c cVar, Map<K, V> map) {
            if (map == null) {
                cVar.mo13329m();
            } else if (!C4572g.this.f12006g) {
                cVar.mo13318d();
                for (Entry entry : map.entrySet()) {
                    cVar.mo13315c(String.valueOf(entry.getKey()));
                    this.f12008b.mo13285a(cVar, entry.getValue());
                }
                cVar.mo13325g();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Entry entry2 : map.entrySet()) {
                    C4497l a = this.f12007a.mo13391a(entry2.getKey());
                    arrayList.add(a);
                    arrayList2.add(entry2.getValue());
                    z |= a.mo13366f() || a.mo13368h();
                }
                if (z) {
                    cVar.mo13310a();
                    int size = arrayList.size();
                    while (i < size) {
                        cVar.mo13310a();
                        C4553l.m18449a((C4497l) arrayList.get(i), cVar);
                        this.f12008b.mo13285a(cVar, arrayList2.get(i));
                        cVar.mo13323f();
                        i++;
                    }
                    cVar.mo13323f();
                } else {
                    cVar.mo13318d();
                    int size2 = arrayList.size();
                    while (i < size2) {
                        cVar.mo13315c(m18509a((C4497l) arrayList.get(i)));
                        this.f12008b.mo13285a(cVar, arrayList2.get(i));
                        i++;
                    }
                    cVar.mo13325g();
                }
            }
        }
    }

    public C4572g(C4522c cVar, boolean z) {
        this.f12005f = cVar;
        this.f12006g = z;
    }

    /* renamed from: a */
    private C4509v<?> m18507a(C4485f fVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? C4589n.f12075f : fVar.mo13336a(C4632a.m18691a(type));
    }

    /* renamed from: a */
    public <T> C4509v<T> mo13393a(C4485f fVar, C4632a<T> aVar) {
        Type b = aVar.mo13530b();
        if (!Map.class.isAssignableFrom(aVar.mo13529a())) {
            return null;
        }
        Type[] b2 = C4518b.m18380b(b, C4518b.m18383e(b));
        C4485f fVar2 = fVar;
        C4573a aVar2 = new C4573a(fVar2, b2[0], m18507a(fVar, b2[0]), b2[1], fVar.mo13336a(C4632a.m18691a(b2[1])), this.f12005f.mo13417a(aVar));
        return aVar2;
    }
}
