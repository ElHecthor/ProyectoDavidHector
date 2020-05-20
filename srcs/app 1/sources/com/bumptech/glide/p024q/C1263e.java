package com.bumptech.glide.p024q;

import com.bumptech.glide.load.C0875k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.q.e */
public class C1263e {

    /* renamed from: a */
    private final List<String> f4175a = new ArrayList();

    /* renamed from: b */
    private final Map<String, List<C1264a<?, ?>>> f4176b = new HashMap();

    /* renamed from: com.bumptech.glide.q.e$a */
    private static class C1264a<T, R> {

        /* renamed from: a */
        private final Class<T> f4177a;

        /* renamed from: b */
        final Class<R> f4178b;

        /* renamed from: c */
        final C0875k<T, R> f4179c;

        public C1264a(Class<T> cls, Class<R> cls2, C0875k<T, R> kVar) {
            this.f4177a = cls;
            this.f4178b = cls2;
            this.f4179c = kVar;
        }

        /* renamed from: a */
        public boolean mo5240a(Class<?> cls, Class<?> cls2) {
            return this.f4177a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f4178b);
        }
    }

    /* renamed from: a */
    private synchronized List<C1264a<?, ?>> m5901a(String str) {
        List<C1264a<?, ?>> list;
        if (!this.f4175a.contains(str)) {
            this.f4175a.add(str);
        }
        list = (List) this.f4176b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f4176b.put(str, list);
        }
        return list;
    }

    /* renamed from: a */
    public synchronized <T, R> List<C0875k<T, R>> mo5236a(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f4175a) {
            List<C1264a> list = (List) this.f4176b.get(str);
            if (list != null) {
                for (C1264a aVar : list) {
                    if (aVar.mo5240a(cls, cls2)) {
                        arrayList.add(aVar.f4179c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized <T, R> void mo5237a(String str, C0875k<T, R> kVar, Class<T> cls, Class<R> cls2) {
        m5901a(str).add(new C1264a(cls, cls2, kVar));
    }

    /* renamed from: a */
    public synchronized void mo5238a(List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>(this.f4175a);
        this.f4175a.clear();
        for (String add : list) {
            this.f4175a.add(add);
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f4175a.add(str);
            }
        }
    }

    /* renamed from: b */
    public synchronized <T, R> List<Class<R>> mo5239b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f4175a) {
            List<C1264a> list = (List) this.f4176b.get(str);
            if (list != null) {
                for (C1264a aVar : list) {
                    if (aVar.mo5240a(cls, cls2) && !arrayList.contains(aVar.f4178b)) {
                        arrayList.add(aVar.f4178b);
                    }
                }
            }
        }
        return arrayList;
    }
}
