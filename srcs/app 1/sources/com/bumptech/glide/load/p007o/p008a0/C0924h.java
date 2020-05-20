package com.bumptech.glide.load.p007o.p008a0;

import com.bumptech.glide.load.p007o.p008a0.C0934m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.o.a0.h */
class C0924h<K extends C0934m, V> {

    /* renamed from: a */
    private final C0925a<K, V> f3461a = new C0925a<>();

    /* renamed from: b */
    private final Map<K, C0925a<K, V>> f3462b = new HashMap();

    /* renamed from: com.bumptech.glide.load.o.a0.h$a */
    private static class C0925a<K, V> {

        /* renamed from: a */
        final K f3463a;

        /* renamed from: b */
        private List<V> f3464b;

        /* renamed from: c */
        C0925a<K, V> f3465c;

        /* renamed from: d */
        C0925a<K, V> f3466d;

        C0925a() {
            this(null);
        }

        C0925a(K k) {
            this.f3466d = this;
            this.f3465c = this;
            this.f3463a = k;
        }

        /* renamed from: a */
        public V mo4720a() {
            int b = mo4722b();
            if (b > 0) {
                return this.f3464b.remove(b - 1);
            }
            return null;
        }

        /* renamed from: a */
        public void mo4721a(V v) {
            if (this.f3464b == null) {
                this.f3464b = new ArrayList();
            }
            this.f3464b.add(v);
        }

        /* renamed from: b */
        public int mo4722b() {
            List<V> list = this.f3464b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
    }

    C0924h() {
    }

    /* renamed from: a */
    private void m4739a(C0925a<K, V> aVar) {
        m4741c(aVar);
        C0925a<K, V> aVar2 = this.f3461a;
        aVar.f3466d = aVar2;
        aVar.f3465c = aVar2.f3465c;
        m4742d(aVar);
    }

    /* renamed from: b */
    private void m4740b(C0925a<K, V> aVar) {
        m4741c(aVar);
        C0925a<K, V> aVar2 = this.f3461a;
        aVar.f3466d = aVar2.f3466d;
        aVar.f3465c = aVar2;
        m4742d(aVar);
    }

    /* renamed from: c */
    private static <K, V> void m4741c(C0925a<K, V> aVar) {
        C0925a<K, V> aVar2 = aVar.f3466d;
        aVar2.f3465c = aVar.f3465c;
        aVar.f3465c.f3466d = aVar2;
    }

    /* renamed from: d */
    private static <K, V> void m4742d(C0925a<K, V> aVar) {
        aVar.f3465c.f3466d = aVar;
        aVar.f3466d.f3465c = aVar;
    }

    /* renamed from: a */
    public V mo4716a() {
        C0925a<K, V> aVar = this.f3461a;
        while (true) {
            aVar = aVar.f3466d;
            if (aVar.equals(this.f3461a)) {
                return null;
            }
            V a = aVar.mo4720a();
            if (a != null) {
                return a;
            }
            m4741c(aVar);
            this.f3462b.remove(aVar.f3463a);
            ((C0934m) aVar.f3463a).mo4701a();
        }
    }

    /* renamed from: a */
    public V mo4717a(K k) {
        C0925a aVar = (C0925a) this.f3462b.get(k);
        if (aVar == null) {
            aVar = new C0925a(k);
            this.f3462b.put(k, aVar);
        } else {
            k.mo4701a();
        }
        m4739a(aVar);
        return aVar.mo4720a();
    }

    /* renamed from: a */
    public void mo4718a(K k, V v) {
        C0925a aVar = (C0925a) this.f3462b.get(k);
        if (aVar == null) {
            aVar = new C0925a(k);
            m4740b(aVar);
            this.f3462b.put(k, aVar);
        } else {
            k.mo4701a();
        }
        aVar.mo4721a(v);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C0925a<K, V> aVar = this.f3461a.f3465c; !aVar.equals(this.f3461a); aVar = aVar.f3465c) {
            z = true;
            sb.append('{');
            sb.append(aVar.f3463a);
            sb.append(':');
            sb.append(aVar.mo4722b());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
