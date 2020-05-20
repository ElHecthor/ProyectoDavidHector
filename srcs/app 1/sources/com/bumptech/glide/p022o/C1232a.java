package com.bumptech.glide.p022o;

import com.bumptech.glide.p029t.C1310k;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.o.a */
class C1232a implements C1241h {

    /* renamed from: a */
    private final Set<C1242i> f4132a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private boolean f4133b;

    /* renamed from: c */
    private boolean f4134c;

    C1232a() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5180a() {
        this.f4134c = true;
        for (C1242i d : C1310k.m6164a((Collection<T>) this.f4132a)) {
            d.mo4594d();
        }
    }

    /* renamed from: a */
    public void mo5181a(C1242i iVar) {
        this.f4132a.add(iVar);
        if (this.f4134c) {
            iVar.mo4594d();
        } else if (this.f4133b) {
            iVar.mo4587a();
        } else {
            iVar.mo4592b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5182b() {
        this.f4133b = true;
        for (C1242i a : C1310k.m6164a((Collection<T>) this.f4132a)) {
            a.mo4587a();
        }
    }

    /* renamed from: b */
    public void mo5183b(C1242i iVar) {
        this.f4132a.remove(iVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5184c() {
        this.f4133b = false;
        for (C1242i b : C1310k.m6164a((Collection<T>) this.f4132a)) {
            b.mo4592b();
        }
    }
}
