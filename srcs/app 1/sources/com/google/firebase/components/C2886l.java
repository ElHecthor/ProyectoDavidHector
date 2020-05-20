package com.google.firebase.components;

import com.google.firebase.p059f.C2917c;
import com.google.firebase.p059f.C2918d;
import com.google.firebase.p061h.C2924a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.l */
public class C2886l extends C2870a {

    /* renamed from: e */
    private static final C2924a<Set<Object>> f8357e = C2885k.m11952a();

    /* renamed from: a */
    private final Map<C2873d<?>, C2896s<?>> f8358a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, C2896s<?>> f8359b = new HashMap();

    /* renamed from: c */
    private final Map<Class<?>, C2896s<Set<?>>> f8360c = new HashMap();

    /* renamed from: d */
    private final C2895r f8361d;

    public C2886l(Executor executor, Iterable<C2882h> iterable, C2873d<?>... dVarArr) {
        this.f8361d = new C2895r(executor);
        ArrayList<C2873d> arrayList = new ArrayList<>();
        arrayList.add(C2873d.m11918a(this.f8361d, C2895r.class, C2918d.class, C2917c.class));
        for (C2882h components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        for (C2873d<?> dVar : dVarArr) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        C2887m.m11962a((List<C2873d<?>>) arrayList);
        for (C2873d dVar2 : arrayList) {
            this.f8358a.put(dVar2, new C2896s(C2883i.m11950a(this, dVar2)));
        }
        m11955a();
        m11956b();
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Set, code=java.util.Set<com.google.firebase.components.s>, for r2v0, types: [java.util.Set<com.google.firebase.components.s>, java.util.Set] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.util.Set m11954a(java.util.Set<com.google.firebase.components.C2896s> r2) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0009:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x001d
            java.lang.Object r1 = r2.next()
            com.google.firebase.components.s r1 = (com.google.firebase.components.C2896s) r1
            java.lang.Object r1 = r1.get()
            r0.add(r1)
            goto L_0x0009
        L_0x001d:
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C2886l.m11954a(java.util.Set):java.util.Set");
    }

    /* renamed from: a */
    private void m11955a() {
        for (Entry entry : this.f8358a.entrySet()) {
            C2873d dVar = (C2873d) entry.getKey();
            if (dVar.mo9543g()) {
                C2896s sVar = (C2896s) entry.getValue();
                for (Class put : dVar.mo9539c()) {
                    this.f8359b.put(put, sVar);
                }
            }
        }
        m11957c();
    }

    /* renamed from: b */
    private void m11956b() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f8358a.entrySet()) {
            C2873d dVar = (C2873d) entry.getKey();
            if (!dVar.mo9543g()) {
                C2896s sVar = (C2896s) entry.getValue();
                for (Class cls : dVar.mo9539c()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(sVar);
                }
            }
        }
        for (Entry entry2 : hashMap.entrySet()) {
            this.f8360c.put((Class) entry2.getKey(), new C2896s(C2884j.m11951a((Set) entry2.getValue())));
        }
    }

    /* renamed from: c */
    private void m11957c() {
        for (C2873d dVar : this.f8358a.keySet()) {
            Iterator it = dVar.mo9537a().iterator();
            while (true) {
                if (it.hasNext()) {
                    C2891n nVar = (C2891n) it.next();
                    if (nVar.mo9567c() && !this.f8359b.containsKey(nVar.mo9565a())) {
                        throw new C2897t(String.format("Unsatisfied dependency for component %s: %s", new Object[]{dVar, nVar.mo9565a()}));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo9555a(boolean z) {
        for (Entry entry : this.f8358a.entrySet()) {
            C2873d dVar = (C2873d) entry.getKey();
            C2896s sVar = (C2896s) entry.getValue();
            if (dVar.mo9541e() || (dVar.mo9542f() && z)) {
                sVar.get();
            }
        }
        this.f8361d.mo9573a();
    }

    /* renamed from: c */
    public <T> C2924a<T> mo9550c(Class<T> cls) {
        C2898u.m11987a(cls, "Null interface requested.");
        return (C2924a) this.f8359b.get(cls);
    }

    /* renamed from: d */
    public <T> C2924a<Set<T>> mo9551d(Class<T> cls) {
        C2896s sVar = (C2896s) this.f8360c.get(cls);
        return sVar != null ? sVar : f8357e;
    }
}
