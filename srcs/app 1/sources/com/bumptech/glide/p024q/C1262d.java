package com.bumptech.glide.p024q;

import com.bumptech.glide.p029t.C1308i;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p071f.p088e.C3162a;

/* renamed from: com.bumptech.glide.q.d */
public class C1262d {

    /* renamed from: a */
    private final AtomicReference<C1308i> f4173a = new AtomicReference<>();

    /* renamed from: b */
    private final C3162a<C1308i, List<Class<?>>> f4174b = new C3162a<>();

    /* renamed from: a */
    public List<Class<?>> mo5234a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        C1308i iVar = (C1308i) this.f4173a.getAndSet(null);
        if (iVar == null) {
            iVar = new C1308i(cls, cls2, cls3);
        } else {
            iVar.mo5381a(cls, cls2, cls3);
        }
        synchronized (this.f4174b) {
            list = (List) this.f4174b.get(iVar);
        }
        this.f4173a.set(iVar);
        return list;
    }

    /* renamed from: a */
    public void mo5235a(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f4174b) {
            this.f4174b.put(new C1308i(cls, cls2, cls3), list);
        }
    }
}
