package com.bumptech.glide.load.p013q.p019i;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.q.i.f */
public class C1214f {

    /* renamed from: a */
    private final List<C1215a<?, ?>> f4043a = new ArrayList();

    /* renamed from: com.bumptech.glide.load.q.i.f$a */
    private static final class C1215a<Z, R> {

        /* renamed from: a */
        private final Class<Z> f4044a;

        /* renamed from: b */
        private final Class<R> f4045b;

        /* renamed from: c */
        final C1213e<Z, R> f4046c;

        C1215a(Class<Z> cls, Class<R> cls2, C1213e<Z, R> eVar) {
            this.f4044a = cls;
            this.f4045b = cls2;
            this.f4046c = eVar;
        }

        /* renamed from: a */
        public boolean mo5141a(Class<?> cls, Class<?> cls2) {
            return this.f4044a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f4045b);
        }
    }

    /* renamed from: a */
    public synchronized <Z, R> C1213e<Z, R> mo5138a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C1216g.m5684a();
        }
        for (C1215a aVar : this.f4043a) {
            if (aVar.mo5141a(cls, cls2)) {
                return aVar.f4046c;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No transcoder registered to transcode from ");
        sb.append(cls);
        sb.append(" to ");
        sb.append(cls2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public synchronized <Z, R> void mo5139a(Class<Z> cls, Class<R> cls2, C1213e<Z, R> eVar) {
        this.f4043a.add(new C1215a(cls, cls2, eVar));
    }

    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> mo5140b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C1215a a : this.f4043a) {
            if (a.mo5141a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
