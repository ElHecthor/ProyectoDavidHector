package com.bumptech.glide.p024q;

import com.bumptech.glide.load.C0876l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.q.f */
public class C1265f {

    /* renamed from: a */
    private final List<C1266a<?>> f4180a = new ArrayList();

    /* renamed from: com.bumptech.glide.q.f$a */
    private static final class C1266a<T> {

        /* renamed from: a */
        private final Class<T> f4181a;

        /* renamed from: b */
        final C0876l<T> f4182b;

        C1266a(Class<T> cls, C0876l<T> lVar) {
            this.f4181a = cls;
            this.f4182b = lVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5243a(Class<?> cls) {
            return this.f4181a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> C0876l<Z> mo5241a(Class<Z> cls) {
        int size = this.f4180a.size();
        for (int i = 0; i < size; i++) {
            C1266a aVar = (C1266a) this.f4180a.get(i);
            if (aVar.mo5243a(cls)) {
                return aVar.f4182b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public synchronized <Z> void mo5242a(Class<Z> cls, C0876l<Z> lVar) {
        this.f4180a.add(new C1266a(cls, lVar));
    }
}
