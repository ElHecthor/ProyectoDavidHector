package com.bumptech.glide.load.p011p;

import com.bumptech.glide.C0840i.C0843c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p071f.p097h.p107l.C3318e;

/* renamed from: com.bumptech.glide.load.p.p */
public class C1072p {

    /* renamed from: a */
    private final C1077r f3809a;

    /* renamed from: b */
    private final C1073a f3810b;

    /* renamed from: com.bumptech.glide.load.p.p$a */
    private static class C1073a {

        /* renamed from: a */
        private final Map<Class<?>, C1074a<?>> f3811a = new HashMap();

        /* renamed from: com.bumptech.glide.load.p.p$a$a */
        private static class C1074a<Model> {

            /* renamed from: a */
            final List<C1069n<Model, ?>> f3812a;

            public C1074a(List<C1069n<Model, ?>> list) {
                this.f3812a = list;
            }
        }

        C1073a() {
        }

        /* renamed from: a */
        public <Model> List<C1069n<Model, ?>> mo4963a(Class<Model> cls) {
            C1074a aVar = (C1074a) this.f3811a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f3812a;
        }

        /* renamed from: a */
        public void mo4964a() {
            this.f3811a.clear();
        }

        /* renamed from: a */
        public <Model> void mo4965a(Class<Model> cls, List<C1069n<Model, ?>> list) {
            if (((C1074a) this.f3811a.put(cls, new C1074a(list))) != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Already cached loaders for model: ");
                sb.append(cls);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    private C1072p(C1077r rVar) {
        this.f3810b = new C1073a();
        this.f3809a = rVar;
    }

    public C1072p(C3318e<List<Throwable>> eVar) {
        this(new C1077r(eVar));
    }

    /* renamed from: a */
    private <Model, Data> void m5215a(List<C1071o<? extends Model, ? extends Data>> list) {
        for (C1071o a : list) {
            a.mo4575a();
        }
    }

    /* renamed from: b */
    private static <A> Class<A> m5216b(A a) {
        return a.getClass();
    }

    /* renamed from: b */
    private synchronized <A> List<C1069n<A, ?>> m5217b(Class<A> cls) {
        List<C1069n<A, ?>> a;
        a = this.f3810b.mo4963a(cls);
        if (a == null) {
            a = Collections.unmodifiableList(this.f3809a.mo4968a(cls));
            this.f3810b.mo4965a(cls, a);
        }
        return a;
    }

    /* renamed from: a */
    public synchronized List<Class<?>> mo4959a(Class<?> cls) {
        return this.f3809a.mo4970b(cls);
    }

    /* renamed from: a */
    public <A> List<C1069n<A, ?>> mo4960a(A a) {
        List b = m5217b(m5216b(a));
        if (!b.isEmpty()) {
            int size = b.size();
            List<C1069n<A, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                C1069n nVar = (C1069n) b.get(i);
                if (nVar.mo4573a(a)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i);
                        z = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new C0843c(a, b);
        }
        throw new C0843c(a);
    }

    /* renamed from: a */
    public synchronized <Model, Data> void mo4961a(Class<Model> cls, Class<Data> cls2, C1071o<? extends Model, ? extends Data> oVar) {
        this.f3809a.mo4969a(cls, cls2, oVar);
        this.f3810b.mo4964a();
    }

    /* renamed from: b */
    public synchronized <Model, Data> void mo4962b(Class<Model> cls, Class<Data> cls2, C1071o<? extends Model, ? extends Data> oVar) {
        m5215a(this.f3809a.mo4972b(cls, cls2, oVar));
        this.f3810b.mo4964a();
    }
}
