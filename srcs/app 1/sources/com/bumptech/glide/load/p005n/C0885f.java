package com.bumptech.glide.load.p005n;

import com.bumptech.glide.load.p005n.C0883e.C0884a;
import com.bumptech.glide.p029t.C1309j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.n.f */
public class C0885f {

    /* renamed from: b */
    private static final C0884a<?> f3407b = new C0886a();

    /* renamed from: a */
    private final Map<Class<?>, C0884a<?>> f3408a = new HashMap();

    /* renamed from: com.bumptech.glide.load.n.f$a */
    class C0886a implements C0884a<Object> {
        C0886a() {
        }

        /* renamed from: a */
        public C0883e<Object> mo4649a(Object obj) {
            return new C0887b(obj);
        }

        /* renamed from: a */
        public Class<Object> mo4650a() {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* renamed from: com.bumptech.glide.load.n.f$b */
    private static final class C0887b implements C0883e<Object> {

        /* renamed from: a */
        private final Object f3409a;

        C0887b(Object obj) {
            this.f3409a = obj;
        }

        /* renamed from: a */
        public Object mo4647a() {
            return this.f3409a;
        }

        /* renamed from: b */
        public void mo4648b() {
        }
    }

    /* renamed from: a */
    public synchronized <T> C0883e<T> mo4651a(T t) {
        C0884a aVar;
        C1309j.m6149a(t);
        aVar = (C0884a) this.f3408a.get(t.getClass());
        if (aVar == null) {
            Iterator it = this.f3408a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0884a aVar2 = (C0884a) it.next();
                if (aVar2.mo4650a().isAssignableFrom(t.getClass())) {
                    aVar = aVar2;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f3407b;
        }
        return aVar.mo4649a(t);
    }

    /* renamed from: a */
    public synchronized void mo4652a(C0884a<?> aVar) {
        this.f3408a.put(aVar.mo4650a(), aVar);
    }
}
