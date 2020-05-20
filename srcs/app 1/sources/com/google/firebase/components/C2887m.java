package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.firebase.components.m */
class C2887m {

    /* renamed from: com.google.firebase.components.m$b */
    private static class C2889b {

        /* renamed from: a */
        private final C2873d<?> f8362a;

        /* renamed from: b */
        private final Set<C2889b> f8363b = new HashSet();

        /* renamed from: c */
        private final Set<C2889b> f8364c = new HashSet();

        C2889b(C2873d<?> dVar) {
            this.f8362a = dVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C2873d<?> mo9556a() {
            return this.f8362a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9557a(C2889b bVar) {
            this.f8363b.add(bVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Set<C2889b> mo9558b() {
            return this.f8363b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo9559b(C2889b bVar) {
            this.f8364c.add(bVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo9560c(C2889b bVar) {
            this.f8364c.remove(bVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo9561c() {
            return this.f8363b.isEmpty();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo9562d() {
            return this.f8364c.isEmpty();
        }
    }

    /* renamed from: com.google.firebase.components.m$c */
    private static class C2890c {

        /* renamed from: a */
        private final Class<?> f8365a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f8366b;

        private C2890c(Class<?> cls, boolean z) {
            this.f8365a = cls;
            this.f8366b = z;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2890c)) {
                return false;
            }
            C2890c cVar = (C2890c) obj;
            return cVar.f8365a.equals(this.f8365a) && cVar.f8366b == this.f8366b;
        }

        public int hashCode() {
            return ((this.f8365a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f8366b).hashCode();
        }
    }

    /* renamed from: a */
    private static Set<C2889b> m11961a(Set<C2889b> set) {
        HashSet hashSet = new HashSet();
        for (C2889b bVar : set) {
            if (bVar.mo9562d()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    static void m11962a(List<C2873d<?>> list) {
        Set<C2889b> b = m11963b(list);
        Set a = m11961a(b);
        int i = 0;
        while (!a.isEmpty()) {
            C2889b bVar = (C2889b) a.iterator().next();
            a.remove(bVar);
            i++;
            for (C2889b bVar2 : bVar.mo9558b()) {
                bVar2.mo9560c(bVar);
                if (bVar2.mo9562d()) {
                    a.add(bVar2);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (C2889b bVar3 : b) {
                if (!bVar3.mo9562d() && !bVar3.mo9561c()) {
                    arrayList.add(bVar3.mo9556a());
                }
            }
            throw new C2892o(arrayList);
        }
    }

    /* renamed from: b */
    private static Set<C2889b> m11963b(List<C2873d<?>> list) {
        HashMap hashMap = new HashMap(list.size());
        for (C2873d dVar : list) {
            C2889b bVar = new C2889b(dVar);
            Iterator it = dVar.mo9539c().iterator();
            while (true) {
                if (it.hasNext()) {
                    Class cls = (Class) it.next();
                    C2890c cVar = new C2890c(cls, !dVar.mo9543g());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set = (Set) hashMap.get(cVar);
                    if (set.isEmpty() || cVar.f8366b) {
                        set.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{cls}));
                    }
                }
            }
        }
        for (Set<C2889b> it2 : hashMap.values()) {
            for (C2889b bVar2 : it2) {
                for (C2891n nVar : bVar2.mo9556a().mo9537a()) {
                    if (nVar.mo9566b()) {
                        Set<C2889b> set2 = (Set) hashMap.get(new C2890c(nVar.mo9565a(), nVar.mo9568d()));
                        if (set2 != null) {
                            for (C2889b bVar3 : set2) {
                                bVar2.mo9557a(bVar3);
                                bVar3.mo9559b(bVar2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}
