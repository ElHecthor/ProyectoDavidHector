package com.bumptech.glide.p024q;

import com.bumptech.glide.load.C0859d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.q.a */
public class C1258a {

    /* renamed from: a */
    private final List<C1259a<?>> f4166a = new ArrayList();

    /* renamed from: com.bumptech.glide.q.a$a */
    private static final class C1259a<T> {

        /* renamed from: a */
        private final Class<T> f4167a;

        /* renamed from: b */
        final C0859d<T> f4168b;

        C1259a(Class<T> cls, C0859d<T> dVar) {
            this.f4167a = cls;
            this.f4168b = dVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5228a(Class<?> cls) {
            return this.f4167a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> C0859d<T> mo5226a(Class<T> cls) {
        for (C1259a aVar : this.f4166a) {
            if (aVar.mo5228a(cls)) {
                return aVar.f4168b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized <T> void mo5227a(Class<T> cls, C0859d<T> dVar) {
        this.f4166a.add(new C1259a(cls, dVar));
    }
}
