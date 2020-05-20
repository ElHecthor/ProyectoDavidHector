package com.google.firebase.components;

import com.google.firebase.p059f.C2915a;
import com.google.firebase.p059f.C2916b;
import com.google.firebase.p059f.C2917c;
import com.google.firebase.p059f.C2918d;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.components.r */
class C2895r implements C2918d, C2917c {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<C2916b<Object>, Executor>> f8372a = new HashMap();

    /* renamed from: b */
    private Queue<C2915a<?>> f8373b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f8374c;

    C2895r(Executor executor) {
        this.f8374c = executor;
    }

    /* renamed from: b */
    private synchronized Set<Entry<C2916b<Object>, Executor>> m11981b(C2915a<?> aVar) {
        Map map;
        map = (Map) this.f8372a.get(aVar.mo9602b());
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9573a() {
        Queue<C2915a> queue;
        synchronized (this) {
            queue = null;
            if (this.f8373b != null) {
                Queue<C2915a<?>> queue2 = this.f8373b;
                this.f8373b = null;
                queue = queue2;
            }
        }
        if (queue != null) {
            for (C2915a a : queue) {
                mo9574a(a);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(com.google.firebase.components.C2894q.m11979a(r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = m11981b(r4).iterator();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9574a(com.google.firebase.p059f.C2915a<?> r4) {
        /*
            r3 = this;
            com.google.firebase.components.C2898u.m11986a(r4)
            monitor-enter(r3)
            java.util.Queue<com.google.firebase.f.a<?>> r0 = r3.f8373b     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000f
            java.util.Queue<com.google.firebase.f.a<?>> r0 = r3.f8373b     // Catch:{ all -> 0x0033 }
            r0.add(r4)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            java.util.Set r0 = r3.m11981b(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.lang.Runnable r1 = com.google.firebase.components.C2894q.m11979a(r1, r4)
            r2.execute(r1)
            goto L_0x0018
        L_0x0032:
            return
        L_0x0033:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.C2895r.mo9574a(com.google.firebase.f.a):void");
    }

    /* renamed from: a */
    public <T> void mo9575a(Class<T> cls, C2916b<? super T> bVar) {
        mo9576a(cls, this.f8374c, bVar);
    }

    /* renamed from: a */
    public synchronized <T> void mo9576a(Class<T> cls, Executor executor, C2916b<? super T> bVar) {
        C2898u.m11986a(cls);
        C2898u.m11986a(bVar);
        C2898u.m11986a(executor);
        if (!this.f8372a.containsKey(cls)) {
            this.f8372a.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f8372a.get(cls)).put(bVar, executor);
    }
}
