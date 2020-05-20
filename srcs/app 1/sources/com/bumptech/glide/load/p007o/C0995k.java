package com.bumptech.glide.load.p007o;

import android.util.Log;
import com.bumptech.glide.C0836e;
import com.bumptech.glide.C0838g;
import com.bumptech.glide.load.C0856a;
import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.C0877m;
import com.bumptech.glide.load.p007o.p009b0.C0940a;
import com.bumptech.glide.load.p007o.p009b0.C0940a.C0941a;
import com.bumptech.glide.load.p007o.p009b0.C0943b;
import com.bumptech.glide.load.p007o.p009b0.C0953h;
import com.bumptech.glide.load.p007o.p009b0.C0953h.C0954a;
import com.bumptech.glide.load.p007o.p010c0.C0963a;
import com.bumptech.glide.p025r.C1274g;
import com.bumptech.glide.p029t.C1305f;
import com.bumptech.glide.p029t.C1309j;
import com.bumptech.glide.p029t.p030l.C1312a;
import com.bumptech.glide.p029t.p030l.C1312a.C1316d;
import java.util.Map;
import java.util.concurrent.Executor;
import p071f.p097h.p107l.C3318e;

/* renamed from: com.bumptech.glide.load.o.k */
public class C0995k implements C1008m, C0954a, C1012a {

    /* renamed from: i */
    private static final boolean f3641i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    private final C1016s f3642a;

    /* renamed from: b */
    private final C1010o f3643b;

    /* renamed from: c */
    private final C0953h f3644c;

    /* renamed from: d */
    private final C0998b f3645d;

    /* renamed from: e */
    private final C1023y f3646e;

    /* renamed from: f */
    private final C1000c f3647f;

    /* renamed from: g */
    private final C0996a f3648g;

    /* renamed from: h */
    private final C0909a f3649h;

    /* renamed from: com.bumptech.glide.load.o.k$a */
    static class C0996a {

        /* renamed from: a */
        final C0983e f3650a;

        /* renamed from: b */
        final C3318e<C0978h<?>> f3651b = C1312a.m6176a(150, (C1316d<T>) new C0997a<T>());

        /* renamed from: c */
        private int f3652c;

        /* renamed from: com.bumptech.glide.load.o.k$a$a */
        class C0997a implements C1316d<C0978h<?>> {
            C0997a() {
            }

            /* renamed from: a */
            public C0978h<?> m5000a() {
                C0996a aVar = C0996a.this;
                return new C0978h<>(aVar.f3650a, aVar.f3651b);
            }
        }

        C0996a(C0983e eVar) {
            this.f3650a = eVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <R> C0978h<R> mo4849a(C0836e eVar, Object obj, C1009n nVar, C0869g gVar, int i, int i2, Class<?> cls, Class<R> cls2, C0838g gVar2, C0989j jVar, Map<Class<?>, C0877m<?>> map, boolean z, boolean z2, boolean z3, C0873i iVar, C0980b<R> bVar) {
            C0836e eVar2 = eVar;
            Object obj2 = obj;
            C1009n nVar2 = nVar;
            C0869g gVar3 = gVar;
            int i3 = i;
            int i4 = i2;
            Class<?> cls3 = cls;
            Class<R> cls4 = cls2;
            C0838g gVar4 = gVar2;
            C0989j jVar2 = jVar;
            Map<Class<?>, C0877m<?>> map2 = map;
            boolean z4 = z;
            boolean z5 = z2;
            boolean z6 = z3;
            C0873i iVar2 = iVar;
            C0980b<R> bVar2 = bVar;
            C0978h hVar = (C0978h) this.f3651b.mo5387a();
            C1309j.m6149a(hVar);
            C0978h<R> hVar2 = hVar;
            C0978h<R> hVar3 = hVar2;
            int i5 = this.f3652c;
            int i6 = i5;
            this.f3652c = i5 + 1;
            hVar3.mo4818a(eVar2, obj2, nVar2, gVar3, i3, i4, cls3, cls4, gVar4, jVar2, map2, z4, z5, z6, iVar2, bVar2, i6);
            return hVar2;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.k$b */
    static class C0998b {

        /* renamed from: a */
        final C0963a f3654a;

        /* renamed from: b */
        final C0963a f3655b;

        /* renamed from: c */
        final C0963a f3656c;

        /* renamed from: d */
        final C0963a f3657d;

        /* renamed from: e */
        final C1008m f3658e;

        /* renamed from: f */
        final C1012a f3659f;

        /* renamed from: g */
        final C3318e<C1002l<?>> f3660g = C1312a.m6176a(150, (C1316d<T>) new C0999a<T>());

        /* renamed from: com.bumptech.glide.load.o.k$b$a */
        class C0999a implements C1316d<C1002l<?>> {
            C0999a() {
            }

            /* renamed from: a */
            public C1002l<?> m5003a() {
                C0998b bVar = C0998b.this;
                C1002l lVar = new C1002l(bVar.f3654a, bVar.f3655b, bVar.f3656c, bVar.f3657d, bVar.f3658e, bVar.f3659f, bVar.f3660g);
                return lVar;
            }
        }

        C0998b(C0963a aVar, C0963a aVar2, C0963a aVar3, C0963a aVar4, C1008m mVar, C1012a aVar5) {
            this.f3654a = aVar;
            this.f3655b = aVar2;
            this.f3656c = aVar3;
            this.f3657d = aVar4;
            this.f3658e = mVar;
            this.f3659f = aVar5;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <R> C1002l<R> mo4850a(C0869g gVar, boolean z, boolean z2, boolean z3, boolean z4) {
            C1002l<R> lVar = (C1002l) this.f3660g.mo5387a();
            C1309j.m6149a(lVar);
            C1002l<R> lVar2 = lVar;
            lVar2.mo4852a(gVar, z, z2, z3, z4);
            return lVar2;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.k$c */
    private static class C1000c implements C0983e {

        /* renamed from: a */
        private final C0941a f3662a;

        /* renamed from: b */
        private volatile C0940a f3663b;

        C1000c(C0941a aVar) {
            this.f3662a = aVar;
        }

        /* renamed from: a */
        public C0940a mo4833a() {
            if (this.f3663b == null) {
                synchronized (this) {
                    if (this.f3663b == null) {
                        this.f3663b = this.f3662a.mo4740a();
                    }
                    if (this.f3663b == null) {
                        this.f3663b = new C0943b();
                    }
                }
            }
            return this.f3663b;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.k$d */
    public class C1001d {

        /* renamed from: a */
        private final C1002l<?> f3664a;

        /* renamed from: b */
        private final C1274g f3665b;

        C1001d(C1274g gVar, C1002l<?> lVar) {
            this.f3665b = gVar;
            this.f3664a = lVar;
        }

        /* renamed from: a */
        public void mo4851a() {
            synchronized (C0995k.this) {
                this.f3664a.mo4861c(this.f3665b);
            }
        }
    }

    C0995k(C0953h hVar, C0941a aVar, C0963a aVar2, C0963a aVar3, C0963a aVar4, C0963a aVar5, C1016s sVar, C1010o oVar, C0909a aVar6, C0998b bVar, C0996a aVar7, C1023y yVar, boolean z) {
        this.f3644c = hVar;
        C0941a aVar8 = aVar;
        this.f3647f = new C1000c(aVar);
        C0909a aVar9 = aVar6 == null ? new C0909a(z) : aVar6;
        this.f3649h = aVar9;
        aVar9.mo4678a((C1012a) this);
        this.f3643b = oVar == null ? new C1010o() : oVar;
        this.f3642a = sVar == null ? new C1016s() : sVar;
        this.f3645d = bVar == null ? new C0998b(aVar2, aVar3, aVar4, aVar5, this, this) : bVar;
        this.f3648g = aVar7 == null ? new C0996a(this.f3647f) : aVar7;
        this.f3646e = yVar == null ? new C1023y() : yVar;
        hVar.mo4751a((C0954a) this);
    }

    public C0995k(C0953h hVar, C0941a aVar, C0963a aVar2, C0963a aVar3, C0963a aVar4, C0963a aVar5, boolean z) {
        this(hVar, aVar, aVar2, aVar3, aVar4, aVar5, null, null, null, null, null, null, z);
    }

    /* renamed from: a */
    private <R> C1001d m4986a(C0836e eVar, Object obj, C0869g gVar, int i, int i2, Class<?> cls, Class<R> cls2, C0838g gVar2, C0989j jVar, Map<Class<?>, C0877m<?>> map, boolean z, boolean z2, C0873i iVar, boolean z3, boolean z4, boolean z5, boolean z6, C1274g gVar3, Executor executor, C1009n nVar, long j) {
        C1274g gVar4 = gVar3;
        Executor executor2 = executor;
        C1009n nVar2 = nVar;
        long j2 = j;
        C1002l a = this.f3642a.mo4903a((C0869g) nVar2, z6);
        if (a != null) {
            a.mo4856a(gVar4, executor2);
            if (f3641i) {
                m4989a("Added to existing load", j2, (C0869g) nVar2);
            }
            return new C1001d(gVar4, a);
        }
        C1002l a2 = this.f3645d.mo4850a(nVar, z3, z4, z5, z6);
        C1002l lVar = a2;
        C1009n nVar3 = nVar2;
        C0978h a3 = this.f3648g.mo4849a(eVar, obj, nVar, gVar, i, i2, cls, cls2, gVar2, jVar, map, z, z2, z6, iVar, a2);
        this.f3642a.mo4904a((C0869g) nVar3, lVar);
        C1002l lVar2 = lVar;
        C1009n nVar4 = nVar3;
        C1274g gVar5 = gVar3;
        lVar2.mo4856a(gVar5, executor);
        lVar2.mo4858b(a3);
        if (f3641i) {
            m4989a("Started new load", j, (C0869g) nVar4);
        }
        return new C1001d(gVar5, lVar2);
    }

    /* renamed from: a */
    private C1011p<?> m4987a(C0869g gVar) {
        C1020v a = this.f3644c.mo4748a(gVar);
        if (a == null) {
            return null;
        }
        if (a instanceof C1011p) {
            return (C1011p) a;
        }
        C1011p pVar = new C1011p(a, true, true, gVar, this);
        return pVar;
    }

    /* renamed from: a */
    private C1011p<?> m4988a(C1009n nVar, boolean z, long j) {
        if (!z) {
            return null;
        }
        C1011p<?> b = m4990b((C0869g) nVar);
        if (b != null) {
            if (f3641i) {
                m4989a("Loaded resource from active resources", j, (C0869g) nVar);
            }
            return b;
        }
        C1011p<?> c = m4991c(nVar);
        if (c == null) {
            return null;
        }
        if (f3641i) {
            m4989a("Loaded resource from cache", j, (C0869g) nVar);
        }
        return c;
    }

    /* renamed from: a */
    private static void m4989a(String str, long j, C0869g gVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C1305f.m6135a(j));
        sb.append("ms, key: ");
        sb.append(gVar);
        Log.v("Engine", sb.toString());
    }

    /* renamed from: b */
    private C1011p<?> m4990b(C0869g gVar) {
        C1011p<?> b = this.f3649h.mo4679b(gVar);
        if (b != null) {
            b.mo4879a();
        }
        return b;
    }

    /* renamed from: c */
    private C1011p<?> m4991c(C0869g gVar) {
        C1011p<?> a = m4987a(gVar);
        if (a != null) {
            a.mo4879a();
            this.f3649h.mo4676a(gVar, a);
        }
        return a;
    }

    /* renamed from: a */
    public <R> C1001d mo4844a(C0836e eVar, Object obj, C0869g gVar, int i, int i2, Class<?> cls, Class<R> cls2, C0838g gVar2, C0989j jVar, Map<Class<?>, C0877m<?>> map, boolean z, boolean z2, C0873i iVar, boolean z3, boolean z4, boolean z5, boolean z6, C1274g gVar3, Executor executor) {
        long a = f3641i ? C1305f.m6136a() : 0;
        C1009n a2 = this.f3643b.mo4878a(obj, gVar, i, i2, map, cls, cls2, iVar);
        synchronized (this) {
            C1011p a3 = m4988a(a2, z3, a);
            if (a3 == null) {
                C1001d a4 = m4986a(eVar, obj, gVar, i, i2, cls, cls2, gVar2, jVar, map, z, z2, iVar, z3, z4, z5, z6, gVar3, executor, a2, a);
                return a4;
            }
            gVar3.mo5313a(a3, C0856a.MEMORY_CACHE);
            return null;
        }
    }

    /* renamed from: a */
    public void mo4845a(C0869g gVar, C1011p<?> pVar) {
        this.f3649h.mo4675a(gVar);
        if (pVar.mo4884f()) {
            this.f3644c.mo4749a(gVar, pVar);
        } else {
            this.f3646e.mo4910a(pVar, false);
        }
    }

    /* renamed from: a */
    public synchronized void mo4846a(C1002l<?> lVar, C0869g gVar) {
        this.f3642a.mo4905b(gVar, lVar);
    }

    /* renamed from: a */
    public synchronized void mo4847a(C1002l<?> lVar, C0869g gVar, C1011p<?> pVar) {
        if (pVar != null) {
            if (pVar.mo4884f()) {
                this.f3649h.mo4676a(gVar, pVar);
            }
        }
        this.f3642a.mo4905b(gVar, lVar);
    }

    /* renamed from: a */
    public void mo4756a(C1020v<?> vVar) {
        this.f3646e.mo4910a(vVar, true);
    }

    /* renamed from: b */
    public void mo4848b(C1020v<?> vVar) {
        if (vVar instanceof C1011p) {
            ((C1011p) vVar).mo4885g();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }
}
