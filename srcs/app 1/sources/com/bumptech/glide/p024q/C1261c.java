package com.bumptech.glide.p024q;

import com.bumptech.glide.load.p007o.C0987i;
import com.bumptech.glide.load.p007o.C1017t;
import com.bumptech.glide.load.p013q.p019i.C1216g;
import com.bumptech.glide.p029t.C1308i;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p071f.p088e.C3162a;

/* renamed from: com.bumptech.glide.q.c */
public class C1261c {

    /* renamed from: c */
    private static final C1017t<?, ?, ?> f4170c;

    /* renamed from: a */
    private final C3162a<C1308i, C1017t<?, ?, ?>> f4171a = new C3162a<>();

    /* renamed from: b */
    private final AtomicReference<C1308i> f4172b = new AtomicReference<>();

    static {
        C0987i iVar = new C0987i(Object.class, Object.class, Object.class, Collections.emptyList(), new C1216g(), null);
        C1017t tVar = new C1017t(Object.class, Object.class, Object.class, Collections.singletonList(iVar), null);
        f4170c = tVar;
    }

    /* renamed from: b */
    private C1308i m5895b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C1308i iVar = (C1308i) this.f4172b.getAndSet(null);
        if (iVar == null) {
            iVar = new C1308i();
        }
        iVar.mo5381a(cls, cls2, cls3);
        return iVar;
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C1017t<Data, TResource, Transcode> mo5231a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C1017t<Data, TResource, Transcode> tVar;
        C1308i b = m5895b(cls, cls2, cls3);
        synchronized (this.f4171a) {
            tVar = (C1017t) this.f4171a.get(b);
        }
        this.f4172b.set(b);
        return tVar;
    }

    /* renamed from: a */
    public void mo5232a(Class<?> cls, Class<?> cls2, Class<?> cls3, C1017t<?, ?, ?> tVar) {
        synchronized (this.f4171a) {
            C3162a<C1308i, C1017t<?, ?, ?>> aVar = this.f4171a;
            C1308i iVar = new C1308i(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f4170c;
            }
            aVar.put(iVar, tVar);
        }
    }

    /* renamed from: a */
    public boolean mo5233a(C1017t<?, ?, ?> tVar) {
        return f4170c.equals(tVar);
    }
}
