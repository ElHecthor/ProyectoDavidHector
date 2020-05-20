package com.facebook.p034f0;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: com.facebook.f0.n */
class C1559n implements Serializable {
    private static final long serialVersionUID = 20160629001L;

    /* renamed from: f */
    private HashMap<C1528a, List<C1533c>> f4847f;

    /* renamed from: com.facebook.f0.n$b */
    static class C1561b implements Serializable {
        private static final long serialVersionUID = 20160629001L;

        /* renamed from: f */
        private final HashMap<C1528a, List<C1533c>> f4848f;

        private C1561b(HashMap<C1528a, List<C1533c>> hashMap) {
            this.f4848f = hashMap;
        }

        private Object readResolve() {
            return new C1559n(this.f4848f);
        }
    }

    public C1559n() {
        this.f4847f = new HashMap<>();
    }

    public C1559n(HashMap<C1528a, List<C1533c>> hashMap) {
        HashMap<C1528a, List<C1533c>> hashMap2 = new HashMap<>();
        this.f4847f = hashMap2;
        hashMap2.putAll(hashMap);
    }

    private Object writeReplace() {
        return new C1561b(this.f4847f);
    }

    /* renamed from: a */
    public Set<C1528a> mo5777a() {
        return this.f4847f.keySet();
    }

    /* renamed from: a */
    public void mo5778a(C1528a aVar, List<C1533c> list) {
        if (!this.f4847f.containsKey(aVar)) {
            this.f4847f.put(aVar, list);
        } else {
            ((List) this.f4847f.get(aVar)).addAll(list);
        }
    }

    /* renamed from: a */
    public boolean mo5779a(C1528a aVar) {
        return this.f4847f.containsKey(aVar);
    }

    /* renamed from: b */
    public List<C1533c> mo5780b(C1528a aVar) {
        return (List) this.f4847f.get(aVar);
    }
}
