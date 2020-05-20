package p378p;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import kotlinx.coroutines.C6148j;
import kotlinx.coroutines.C6152k;
import p308k.C5765e;
import p308k.C5803m;
import p308k.C5803m.C5804a;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p316w.p318j.p319a.C5893h;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;

/* renamed from: p.m */
public final class C6626m {

    /* renamed from: p.m$a */
    static final class C6627a extends C5943l implements C5918l<Throwable, C5812t> {

        /* renamed from: g */
        final /* synthetic */ C6604d f16275g;

        C6627a(C6604d dVar) {
            this.f16275g = dVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo17093a(Throwable th) {
            this.f16275g.cancel();
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo17093a((Throwable) obj);
            return C5812t.f14872a;
        }
    }

    /* renamed from: p.m$b */
    static final class C6628b extends C5943l implements C5918l<Throwable, C5812t> {

        /* renamed from: g */
        final /* synthetic */ C6604d f16276g;

        C6628b(C6604d dVar) {
            this.f16276g = dVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo17094a(Throwable th) {
            this.f16276g.cancel();
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo17094a((Throwable) obj);
            return C5812t.f14872a;
        }
    }

    /* renamed from: p.m$c */
    public static final class C6629c implements C6607f<T> {

        /* renamed from: a */
        final /* synthetic */ C6148j f16277a;

        C6629c(C6148j jVar) {
            this.f16277a = jVar;
        }

        /* renamed from: a */
        public void mo17082a(C6604d<T> dVar, Throwable th) {
            C5942k.m22327b(dVar, "call");
            C5942k.m22327b(th, "t");
            C6148j jVar = this.f16277a;
            C5804a aVar = C5803m.f14866f;
            Object a = C5806n.m22053a(th);
            C5803m.m22049a(a);
            jVar.mo15391b(a);
        }

        /* renamed from: a */
        public void mo17083a(C6604d<T> dVar, C6663t<T> tVar) {
            Object obj;
            C6148j jVar;
            C5942k.m22327b(dVar, "call");
            C5942k.m22327b(tVar, "response");
            if (tVar.mo17128d()) {
                obj = tVar.mo17125a();
                if (obj == null) {
                    Object a = dVar.mo17077g().mo16747a(C6625l.class);
                    if (a != null) {
                        C5942k.m22324a(a, "call.request().tag(Invocation::class.java)!!");
                        Method a2 = ((C6625l) a).mo17091a();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Response from ");
                        C5942k.m22324a((Object) a2, "method");
                        Class declaringClass = a2.getDeclaringClass();
                        C5942k.m22324a((Object) declaringClass, "method.declaringClass");
                        sb.append(declaringClass.getName());
                        sb.append('.');
                        sb.append(a2.getName());
                        sb.append(" was null but response body type was declared as non-null");
                        C5765e eVar = new C5765e(sb.toString());
                        jVar = this.f16277a;
                        C5804a aVar = C5803m.f14866f;
                        obj = C5806n.m22053a((Throwable) eVar);
                    } else {
                        C5942k.m22323a();
                        throw null;
                    }
                } else {
                    jVar = this.f16277a;
                    C5804a aVar2 = C5803m.f14866f;
                }
            } else {
                jVar = this.f16277a;
                C6620j jVar2 = new C6620j(tVar);
                C5804a aVar3 = C5803m.f14866f;
                obj = C5806n.m22053a((Throwable) jVar2);
            }
            C5803m.m22049a(obj);
            jVar.mo15391b(obj);
        }
    }

    /* renamed from: p.m$d */
    public static final class C6630d implements C6607f<T> {

        /* renamed from: a */
        final /* synthetic */ C6148j f16278a;

        C6630d(C6148j jVar) {
            this.f16278a = jVar;
        }

        /* renamed from: a */
        public void mo17082a(C6604d<T> dVar, Throwable th) {
            C5942k.m22327b(dVar, "call");
            C5942k.m22327b(th, "t");
            C6148j jVar = this.f16278a;
            C5804a aVar = C5803m.f14866f;
            Object a = C5806n.m22053a(th);
            C5803m.m22049a(a);
            jVar.mo15391b(a);
        }

        /* renamed from: a */
        public void mo17083a(C6604d<T> dVar, C6663t<T> tVar) {
            Object obj;
            C6148j jVar;
            C5942k.m22327b(dVar, "call");
            C5942k.m22327b(tVar, "response");
            if (tVar.mo17128d()) {
                jVar = this.f16278a;
                obj = tVar.mo17125a();
                C5804a aVar = C5803m.f14866f;
            } else {
                jVar = this.f16278a;
                C6620j jVar2 = new C6620j(tVar);
                C5804a aVar2 = C5803m.f14866f;
                obj = C5806n.m22053a((Throwable) jVar2);
            }
            C5803m.m22049a(obj);
            jVar.mo15391b(obj);
        }
    }

    /* renamed from: p.m$e */
    static final class C6631e extends C5943l implements C5918l<Throwable, C5812t> {

        /* renamed from: g */
        final /* synthetic */ C6604d f16279g;

        C6631e(C6604d dVar) {
            this.f16279g = dVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo17095a(Throwable th) {
            this.f16279g.cancel();
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo17095a((Throwable) obj);
            return C5812t.f14872a;
        }
    }

    /* renamed from: p.m$f */
    public static final class C6632f implements C6607f<T> {

        /* renamed from: a */
        final /* synthetic */ C6148j f16280a;

        C6632f(C6148j jVar) {
            this.f16280a = jVar;
        }

        /* renamed from: a */
        public void mo17082a(C6604d<T> dVar, Throwable th) {
            C5942k.m22327b(dVar, "call");
            C5942k.m22327b(th, "t");
            C6148j jVar = this.f16280a;
            C5804a aVar = C5803m.f14866f;
            Object a = C5806n.m22053a(th);
            C5803m.m22049a(a);
            jVar.mo15391b(a);
        }

        /* renamed from: a */
        public void mo17083a(C6604d<T> dVar, C6663t<T> tVar) {
            C5942k.m22327b(dVar, "call");
            C5942k.m22327b(tVar, "response");
            C6148j jVar = this.f16280a;
            C5804a aVar = C5803m.f14866f;
            C5803m.m22049a(tVar);
            jVar.mo15391b(tVar);
        }
    }

    /* renamed from: p.m$g */
    static final class C6633g implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C5866d f16281f;

        /* renamed from: g */
        final /* synthetic */ Exception f16282g;

        C6633g(C5866d dVar, Exception exc) {
            this.f16281f = dVar;
            this.f16282g = exc;
        }

        public final void run() {
            C5866d a = C5880c.m22243a(this.f16281f);
            Exception exc = this.f16282g;
            C5804a aVar = C5803m.f14866f;
            Object a2 = C5806n.m22053a((Throwable) exc);
            C5803m.m22049a(a2);
            a.mo15391b(a2);
        }
    }

    @C5891f(mo15593c = "retrofit2.KotlinExtensions", mo15594f = "KotlinExtensions.kt", mo15595l = {113}, mo15596m = "suspendAndThrow")
    /* renamed from: p.m$h */
    static final class C6634h extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f16283i;

        /* renamed from: j */
        int f16284j;

        /* renamed from: k */
        Object f16285k;

        C6634h(C5866d dVar) {
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f16283i = obj;
            this.f16284j |= RecyclerView.UNDEFINED_DURATION;
            return C6626m.m24936a((Exception) null, (C5866d<?>) this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m24936a(java.lang.Exception r4, p308k.p316w.C5866d<?> r5) {
        /*
            boolean r0 = r5 instanceof p378p.C6626m.C6634h
            if (r0 == 0) goto L_0x0013
            r0 = r5
            p.m$h r0 = (p378p.C6626m.C6634h) r0
            int r1 = r0.f16284j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f16284j = r1
            goto L_0x0018
        L_0x0013:
            p.m$h r0 = new p.m$h
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f16283i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f16284j
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.f16285k
            java.lang.Exception r4 = (java.lang.Exception) r4
            p308k.C5806n.m22054a(r5)
            goto L_0x005c
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            p308k.C5806n.m22054a(r5)
            r0.f16285k = r4
            r0.f16284j = r3
            kotlinx.coroutines.b0 r5 = kotlinx.coroutines.C6216y0.m23285a()
            k.w.g r2 = r0.mo15390b()
            p.m$g r3 = new p.m$g
            r3.<init>(r0, r4)
            r5.mo15711a(r2, r3)
            java.lang.Object r4 = p308k.p316w.p317i.C5885d.m22250a()
            java.lang.Object r5 = p308k.p316w.p317i.C5885d.m22250a()
            if (r4 != r5) goto L_0x0059
            p308k.p316w.p318j.p319a.C5893h.m22280c(r0)
        L_0x0059:
            if (r4 != r1) goto L_0x005c
            return r1
        L_0x005c:
            k.t r4 = p308k.C5812t.f14872a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p378p.C6626m.m24936a(java.lang.Exception, k.w.d):java.lang.Object");
    }

    /* renamed from: a */
    public static final <T> Object m24937a(C6604d<T> dVar, C5866d<? super T> dVar2) {
        C6152k kVar = new C6152k(C5880c.m22243a(dVar2), 1);
        kVar.mo15934b((C5918l<? super Throwable, C5812t>) new C6627a<Object,C5812t>(dVar));
        dVar.mo17074a(new C6629c(kVar));
        Object f = kVar.mo15944f();
        if (f == C5885d.m22250a()) {
            C5893h.m22280c(dVar2);
        }
        return f;
    }

    /* renamed from: b */
    public static final <T> Object m24938b(C6604d<T> dVar, C5866d<? super T> dVar2) {
        C6152k kVar = new C6152k(C5880c.m22243a(dVar2), 1);
        kVar.mo15934b((C5918l<? super Throwable, C5812t>) new C6628b<Object,C5812t>(dVar));
        dVar.mo17074a(new C6630d(kVar));
        Object f = kVar.mo15944f();
        if (f == C5885d.m22250a()) {
            C5893h.m22280c(dVar2);
        }
        return f;
    }

    /* renamed from: c */
    public static final <T> Object m24939c(C6604d<T> dVar, C5866d<? super C6663t<T>> dVar2) {
        C6152k kVar = new C6152k(C5880c.m22243a(dVar2), 1);
        kVar.mo15934b((C5918l<? super Throwable, C5812t>) new C6631e<Object,C5812t>(dVar));
        dVar.mo17074a(new C6632f(kVar));
        Object f = kVar.mo15944f();
        if (f == C5885d.m22250a()) {
            C5893h.m22280c(dVar2);
        }
        return f;
    }
}
