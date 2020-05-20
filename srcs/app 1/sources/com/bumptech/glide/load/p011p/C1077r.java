package com.bumptech.glide.load.p011p;

import com.bumptech.glide.C0840i.C0843c;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import com.bumptech.glide.p029t.C1309j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p071f.p097h.p107l.C3318e;

/* renamed from: com.bumptech.glide.load.p.r */
public class C1077r {

    /* renamed from: e */
    private static final C1080c f3822e = new C1080c();

    /* renamed from: f */
    private static final C1069n<Object, Object> f3823f = new C1078a();

    /* renamed from: a */
    private final List<C1079b<?, ?>> f3824a;

    /* renamed from: b */
    private final C1080c f3825b;

    /* renamed from: c */
    private final Set<C1079b<?, ?>> f3826c;

    /* renamed from: d */
    private final C3318e<List<Throwable>> f3827d;

    /* renamed from: com.bumptech.glide.load.p.r$a */
    private static class C1078a implements C1069n<Object, Object> {
        C1078a() {
        }

        /* renamed from: a */
        public C1070a<Object> mo4571a(Object obj, int i, int i2, C0873i iVar) {
            return null;
        }

        /* renamed from: a */
        public boolean mo4573a(Object obj) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.p.r$b */
    private static class C1079b<Model, Data> {

        /* renamed from: a */
        private final Class<Model> f3828a;

        /* renamed from: b */
        final Class<Data> f3829b;

        /* renamed from: c */
        final C1071o<? extends Model, ? extends Data> f3830c;

        public C1079b(Class<Model> cls, Class<Data> cls2, C1071o<? extends Model, ? extends Data> oVar) {
            this.f3828a = cls;
            this.f3829b = cls2;
            this.f3830c = oVar;
        }

        /* renamed from: a */
        public boolean mo4973a(Class<?> cls) {
            return this.f3828a.isAssignableFrom(cls);
        }

        /* renamed from: a */
        public boolean mo4974a(Class<?> cls, Class<?> cls2) {
            return mo4973a(cls) && this.f3829b.isAssignableFrom(cls2);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.r$c */
    static class C1080c {
        C1080c() {
        }

        /* renamed from: a */
        public <Model, Data> C1075q<Model, Data> mo4975a(List<C1069n<Model, Data>> list, C3318e<List<Throwable>> eVar) {
            return new C1075q<>(list, eVar);
        }
    }

    public C1077r(C3318e<List<Throwable>> eVar) {
        this(eVar, f3822e);
    }

    C1077r(C3318e<List<Throwable>> eVar, C1080c cVar) {
        this.f3824a = new ArrayList();
        this.f3826c = new HashSet();
        this.f3827d = eVar;
        this.f3825b = cVar;
    }

    /* renamed from: a */
    private static <Model, Data> C1069n<Model, Data> m5234a() {
        return f3823f;
    }

    /* renamed from: a */
    private <Model, Data> C1069n<Model, Data> m5235a(C1079b<?, ?> bVar) {
        C1069n<Model, Data> a = bVar.f3830c.mo4574a(this);
        C1309j.m6149a(a);
        return a;
    }

    /* renamed from: a */
    private <Model, Data> void m5236a(Class<Model> cls, Class<Data> cls2, C1071o<? extends Model, ? extends Data> oVar, boolean z) {
        C1079b bVar = new C1079b(cls, cls2, oVar);
        List<C1079b<?, ?>> list = this.f3824a;
        list.add(z ? list.size() : 0, bVar);
    }

    /* renamed from: b */
    private <Model, Data> C1071o<Model, Data> m5237b(C1079b<?, ?> bVar) {
        return bVar.f3830c;
    }

    /* renamed from: a */
    public synchronized <Model, Data> C1069n<Model, Data> mo4967a(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C1079b bVar : this.f3824a) {
                if (this.f3826c.contains(bVar)) {
                    z = true;
                } else if (bVar.mo4974a(cls, cls2)) {
                    this.f3826c.add(bVar);
                    arrayList.add(m5235a(bVar));
                    this.f3826c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f3825b.mo4975a(arrayList, this.f3827d);
            } else if (arrayList.size() == 1) {
                return (C1069n) arrayList.get(0);
            } else if (z) {
                return m5234a();
            } else {
                throw new C0843c(cls, cls2);
            }
        } catch (Throwable th) {
            this.f3826c.clear();
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized <Model> List<C1069n<Model, ?>> mo4968a(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C1079b bVar : this.f3824a) {
                if (!this.f3826c.contains(bVar)) {
                    if (bVar.mo4973a(cls)) {
                        this.f3826c.add(bVar);
                        arrayList.add(m5235a(bVar));
                        this.f3826c.remove(bVar);
                    }
                }
            }
        } catch (Throwable th) {
            this.f3826c.clear();
            throw th;
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized <Model, Data> void mo4969a(Class<Model> cls, Class<Data> cls2, C1071o<? extends Model, ? extends Data> oVar) {
        m5236a(cls, cls2, oVar, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized List<Class<?>> mo4970b(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C1079b bVar : this.f3824a) {
            if (!arrayList.contains(bVar.f3829b) && bVar.mo4973a(cls)) {
                arrayList.add(bVar.f3829b);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized <Model, Data> List<C1071o<? extends Model, ? extends Data>> mo4971b(Class<Model> cls, Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f3824a.iterator();
        while (it.hasNext()) {
            C1079b bVar = (C1079b) it.next();
            if (bVar.mo4974a(cls, cls2)) {
                it.remove();
                arrayList.add(m5237b(bVar));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized <Model, Data> List<C1071o<? extends Model, ? extends Data>> mo4972b(Class<Model> cls, Class<Data> cls2, C1071o<? extends Model, ? extends Data> oVar) {
        List<C1071o<? extends Model, ? extends Data>> b;
        b = mo4971b(cls, cls2);
        mo4969a(cls, cls2, oVar);
        return b;
    }
}
