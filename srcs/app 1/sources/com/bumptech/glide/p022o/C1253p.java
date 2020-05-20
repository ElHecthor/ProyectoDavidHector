package com.bumptech.glide.p022o;

import com.bumptech.glide.p025r.p026j.C1285h;
import com.bumptech.glide.p029t.C1310k;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.o.p */
public final class C1253p implements C1242i {

    /* renamed from: f */
    private final Set<C1285h<?>> f4164f = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public void mo4587a() {
        for (C1285h a : C1310k.m6164a((Collection<T>) this.f4164f)) {
            a.mo4587a();
        }
    }

    /* renamed from: a */
    public void mo5221a(C1285h<?> hVar) {
        this.f4164f.add(hVar);
    }

    /* renamed from: b */
    public void mo4592b() {
        for (C1285h b : C1310k.m6164a((Collection<T>) this.f4164f)) {
            b.mo4592b();
        }
    }

    /* renamed from: b */
    public void mo5222b(C1285h<?> hVar) {
        this.f4164f.remove(hVar);
    }

    /* renamed from: d */
    public void mo4594d() {
        for (C1285h d : C1310k.m6164a((Collection<T>) this.f4164f)) {
            d.mo4594d();
        }
    }

    /* renamed from: e */
    public void mo5223e() {
        this.f4164f.clear();
    }

    /* renamed from: f */
    public List<C1285h<?>> mo5224f() {
        return C1310k.m6164a((Collection<T>) this.f4164f);
    }
}
