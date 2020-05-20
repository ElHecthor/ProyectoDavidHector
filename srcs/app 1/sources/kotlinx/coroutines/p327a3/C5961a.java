package kotlinx.coroutines.p327a3;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C5959a1;
import kotlinx.coroutines.C6092h;
import kotlinx.coroutines.C6148j;
import kotlinx.coroutines.C6152k;
import kotlinx.coroutines.C6157l0;
import kotlinx.coroutines.C6161m0;
import kotlinx.coroutines.internal.C6102b;
import kotlinx.coroutines.internal.C6120i;
import kotlinx.coroutines.internal.C6121j;
import kotlinx.coroutines.internal.C6122k;
import kotlinx.coroutines.internal.C6122k.C6125b;
import kotlinx.coroutines.internal.C6122k.C6126c;
import kotlinx.coroutines.internal.C6138u;
import kotlinx.coroutines.p327a3.C5975c0.C5976a;
import kotlinx.coroutines.p327a3.C5975c0.C5977b;
import kotlinx.coroutines.p330c3.C6043b;
import kotlinx.coroutines.p332e3.C6080c;
import kotlinx.coroutines.p332e3.C6081d;
import kotlinx.coroutines.p332e3.C6082e;
import p308k.C5803m;
import p308k.C5803m.C5804a;
import p308k.C5806n;
import p308k.C5809q;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.C5870f;
import p308k.p316w.p318j.p319a.C5893h;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.a3.a */
public abstract class C5961a<E> extends C5972c<E> implements C5983h<E> {

    /* renamed from: kotlinx.coroutines.a3.a$a */
    private static final class C5962a<E> extends C6002v<E> {

        /* renamed from: i */
        public final C6148j<Object> f14956i;

        /* renamed from: j */
        public final int f14957j;

        public C5962a(C6148j<Object> jVar, int i) {
            C5942k.m22327b(jVar, "cont");
            this.f14956i = jVar;
            this.f14957j = i;
        }

        /* renamed from: a */
        public void mo15657a(C5989m<?> mVar) {
            Object obj;
            C6148j<Object> jVar;
            C5942k.m22327b(mVar, "closed");
            if (this.f14957j == 1 && mVar.f14999i == null) {
                C6148j<Object> jVar2 = this.f14956i;
                C5804a aVar = C5803m.f14866f;
                C5803m.m22049a(null);
                jVar2.mo15391b(null);
                return;
            }
            if (this.f14957j == 2) {
                jVar = this.f14956i;
                C5977b bVar = C5975c0.f14982b;
                C5976a aVar2 = new C5976a(mVar.f14999i);
                C5975c0.m22455b(aVar2);
                obj = C5975c0.m22453a(aVar2);
                C5804a aVar3 = C5803m.f14866f;
            } else {
                jVar = this.f14956i;
                Throwable u = mVar.mo15703u();
                C5804a aVar4 = C5803m.f14866f;
                obj = C5806n.m22053a(u);
            }
            C5803m.m22049a(obj);
            jVar.mo15391b(obj);
        }

        /* renamed from: b */
        public Object mo15658b(E e, Object obj) {
            return this.f14956i.mo15933a(mo15660f(e), obj);
        }

        /* renamed from: c */
        public void mo15659c(Object obj) {
            C5942k.m22327b(obj, "token");
            this.f14956i.mo15936e(obj);
        }

        /* renamed from: f */
        public final Object mo15660f(E e) {
            if (this.f14957j != 2) {
                return e;
            }
            C5977b bVar = C5975c0.f14982b;
            C5975c0.m22455b(e);
            return C5975c0.m22453a(e);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ReceiveElement[receiveMode=");
            sb.append(this.f14957j);
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.a3.a$b */
    private static final class C5963b<R, E> extends C6002v<E> implements C5959a1 {

        /* renamed from: i */
        public final C5961a<E> f14958i;

        /* renamed from: j */
        public final C6081d<R> f14959j;

        /* renamed from: k */
        public final C5922p<Object, C5866d<? super R>, Object> f14960k;

        /* renamed from: l */
        public final int f14961l;

        public C5963b(C5961a<E> aVar, C6081d<? super R> dVar, C5922p<Object, ? super C5866d<? super R>, ? extends Object> pVar, int i) {
            C5942k.m22327b(aVar, "channel");
            C5942k.m22327b(dVar, "select");
            C5942k.m22327b(pVar, "block");
            this.f14958i = aVar;
            this.f14959j = dVar;
            this.f14960k = pVar;
            this.f14961l = i;
        }

        /* renamed from: a */
        public void mo15657a(C5989m<?> mVar) {
            C5942k.m22327b(mVar, "closed");
            if (this.f14959j.mo15843a((Object) null)) {
                int i = this.f14961l;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            C5922p<Object, C5866d<? super R>, Object> pVar = this.f14960k;
                            C5977b bVar = C5975c0.f14982b;
                            C5976a aVar = new C5976a(mVar.f14999i);
                            C5975c0.m22455b(aVar);
                            C5870f.m22231a(pVar, C5975c0.m22453a(aVar), this.f14959j.mo15844c());
                        }
                    } else if (mVar.f14999i == null) {
                        C5870f.m22231a(this.f14960k, null, this.f14959j.mo15844c());
                    }
                }
                this.f14959j.mo15841a(mVar.mo15703u());
            }
        }

        /* renamed from: b */
        public Object mo15658b(E e, Object obj) {
            if (this.f14959j.mo15843a(obj)) {
                return e != null ? e : C5970b.f14972e;
            }
            return null;
        }

        /* renamed from: c */
        public void mo15659c(Object obj) {
            C5942k.m22327b(obj, "token");
            if (obj == C5970b.f14972e) {
                obj = null;
            }
            C5922p<Object, C5866d<? super R>, Object> pVar = this.f14960k;
            if (this.f14961l == 2) {
                C5977b bVar = C5975c0.f14982b;
                C5975c0.m22455b(obj);
                obj = C5975c0.m22453a(obj);
            }
            C5870f.m22231a(pVar, obj, this.f14959j.mo15844c());
        }

        /* renamed from: f */
        public void mo15639f() {
            if (mo15892s()) {
                this.f14958i.mo15654p();
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ReceiveSelect[");
            sb.append(this.f14959j);
            sb.append(",receiveMode=");
            sb.append(this.f14961l);
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.a3.a$c */
    private final class C5964c extends C6092h {

        /* renamed from: f */
        private final C6002v<?> f14962f;

        /* renamed from: g */
        final /* synthetic */ C5961a f14963g;

        public C5964c(C5961a aVar, C6002v<?> vVar) {
            C5942k.m22327b(vVar, "receive");
            this.f14963g = aVar;
            this.f14962f = vVar;
        }

        /* renamed from: a */
        public void mo15662a(Throwable th) {
            if (this.f14962f.mo15892s()) {
                this.f14963g.mo15654p();
            }
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo15662a((Throwable) obj);
            return C5812t.f14872a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RemoveReceiveOnCancel[");
            sb.append(this.f14962f);
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.a3.a$d */
    protected static final class C5965d<E> extends C6126c<C6006z> {

        /* renamed from: d */
        public Object f14964d;

        /* renamed from: e */
        public E f14965e;

        public C5965d(C6120i iVar) {
            C5942k.m22327b(iVar, "queue");
            super(iVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo15664a(C6122k kVar) {
            C5942k.m22327b(kVar, "affected");
            if (kVar instanceof C5989m) {
                return kVar;
            }
            if (!(kVar instanceof C6006z)) {
                return C5970b.f14970c;
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo15665a(C6006z zVar) {
            C5942k.m22327b(zVar, "node");
            Object g = zVar.mo15675g(this);
            if (g == null) {
                return false;
            }
            this.f14964d = g;
            this.f14965e = zVar.mo15676t();
            return true;
        }
    }

    /* renamed from: kotlinx.coroutines.a3.a$e */
    public static final class C5966e extends C6125b {

        /* renamed from: d */
        final /* synthetic */ C5961a f14966d;

        public C5966e(C6122k kVar, C6122k kVar2, C5961a aVar) {
            this.f14966d = aVar;
            super(kVar2);
        }

        /* renamed from: a */
        public Object mo15668b(C6122k kVar) {
            C5942k.m22327b(kVar, "affected");
            if (this.f14966d.mo15652n()) {
                return null;
            }
            return C6121j.m22985b();
        }
    }

    /* renamed from: kotlinx.coroutines.a3.a$f */
    public static final class C5967f implements C6080c<E> {

        /* renamed from: f */
        final /* synthetic */ C5961a f14967f;

        C5967f(C5961a aVar) {
            this.f14967f = aVar;
        }

        /* renamed from: a */
        public <R> void mo15669a(C6081d<? super R> dVar, C5922p<? super E, ? super C5866d<? super R>, ? extends Object> pVar) {
            C5942k.m22327b(dVar, "select");
            C5942k.m22327b(pVar, "block");
            this.f14967f.m22381a(dVar, pVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final <R> void m22381a(C6081d<? super R> dVar, C5922p<? super E, ? super C5866d<? super R>, ? extends Object> pVar) {
        while (!dVar.mo15846k()) {
            if (!mo15653o()) {
                Object a = mo15643a(dVar);
                if (a != C6082e.m22892c()) {
                    if (a != C5970b.f14970c) {
                        if (a instanceof C5989m) {
                            Throwable th = ((C5989m) a).f14999i;
                            if (th == null) {
                                if (dVar.mo15843a((Object) null)) {
                                    C6043b.m22715b(pVar, null, dVar.mo15844c());
                                }
                                return;
                            }
                            throw C6138u.m23077b(th);
                        }
                        C6043b.m22715b(pVar, a, dVar.mo15844c());
                        return;
                    }
                } else {
                    return;
                }
            } else if (pVar == null) {
                throw new C5809q("null cannot be cast to non-null type suspend (kotlin.Any?) -> R");
            } else if (m22385a(dVar, pVar, 1)) {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22382a(C6148j<?> jVar, C6002v<?> vVar) {
        jVar.mo15934b((C5918l<? super Throwable, C5812t>) new C5964c<Object,C5812t>(this, vVar));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m22384a(kotlinx.coroutines.p327a3.C6002v<? super E> r8) {
        /*
            r7 = this;
            boolean r0 = r7.mo15651m()
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0029
            kotlinx.coroutines.internal.i r0 = r7.mo15684e()
        L_0x000e:
            java.lang.Object r4 = r0.mo15899n()
            if (r4 == 0) goto L_0x0023
            kotlinx.coroutines.internal.k r4 = (kotlinx.coroutines.internal.C6122k) r4
            boolean r5 = r4 instanceof kotlinx.coroutines.p327a3.C6006z
            r5 = r5 ^ r3
            if (r5 != 0) goto L_0x001c
            goto L_0x004b
        L_0x001c:
            boolean r4 = r4.mo15895a(r8, r0)
            if (r4 == 0) goto L_0x000e
            goto L_0x004a
        L_0x0023:
            k.q r8 = new k.q
            r8.<init>(r1)
            throw r8
        L_0x0029:
            kotlinx.coroutines.internal.i r0 = r7.mo15684e()
            kotlinx.coroutines.a3.a$e r4 = new kotlinx.coroutines.a3.a$e
            r4.<init>(r8, r8, r7)
        L_0x0032:
            java.lang.Object r5 = r0.mo15899n()
            if (r5 == 0) goto L_0x0051
            kotlinx.coroutines.internal.k r5 = (kotlinx.coroutines.internal.C6122k) r5
            boolean r6 = r5 instanceof kotlinx.coroutines.p327a3.C6006z
            r6 = r6 ^ r3
            if (r6 != 0) goto L_0x0040
            goto L_0x004b
        L_0x0040:
            int r5 = r5.mo15893a(r8, r0, r4)
            if (r5 == r3) goto L_0x004a
            r6 = 2
            if (r5 == r6) goto L_0x004b
            goto L_0x0032
        L_0x004a:
            r2 = 1
        L_0x004b:
            if (r2 == 0) goto L_0x0050
            r7.mo15655q()
        L_0x0050:
            return r2
        L_0x0051:
            k.q r8 = new k.q
            r8.<init>(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p327a3.C5961a.m22384a(kotlinx.coroutines.a3.v):boolean");
    }

    /* renamed from: a */
    private final <R> boolean m22385a(C6081d<? super R> dVar, C5922p<Object, ? super C5866d<? super R>, ? extends Object> pVar, int i) {
        C5963b bVar = new C5963b(this, dVar, pVar, i);
        boolean a = m22384a((C6002v<? super E>) bVar);
        if (a) {
            dVar.mo15842a((C5959a1) bVar);
        }
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ <R> Object mo15642a(int i, C5866d<? super R> dVar) {
        C6152k kVar = new C6152k(C5880c.m22243a(dVar), 0);
        C5962a aVar = new C5962a(kVar, i);
        while (true) {
            if (!m22384a((C6002v<? super E>) aVar)) {
                Object r = mo15656r();
                if (!(r instanceof C5989m)) {
                    if (r != C5970b.f14970c) {
                        Object f = aVar.mo15660f(r);
                        C5804a aVar2 = C5803m.f14866f;
                        C5803m.m22049a(f);
                        kVar.mo15391b(f);
                        break;
                    }
                } else {
                    aVar.mo15657a((C5989m) r);
                    break;
                }
            } else {
                m22382a((C6148j<?>) kVar, (C6002v<?>) aVar);
                break;
            }
        }
        Object f2 = kVar.mo15944f();
        if (f2 == C5885d.m22250a()) {
            C5893h.m22280c(dVar);
        }
        return f2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo15643a(C6081d<?> dVar) {
        C5942k.m22327b(dVar, "select");
        C5965d l = mo15650l();
        Object a = dVar.mo15840a((C6102b) l);
        if (a != null) {
            return a;
        }
        C6006z zVar = (C6006z) l.mo15912c();
        Object obj = l.f14964d;
        if (obj != null) {
            zVar.mo15674f(obj);
            return l.f14965e;
        }
        C5942k.m22323a();
        throw null;
    }

    /* renamed from: a */
    public final void mo15644a(CancellationException cancellationException) {
        if (cancellationException == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C6161m0.m23157a((Object) this));
            sb.append(" was cancelled");
            cancellationException = new CancellationException(sb.toString());
        }
        mo15645b(cancellationException);
    }

    /* renamed from: b */
    public boolean mo15645b(Throwable th) {
        boolean a = mo15671a(th);
        mo15649k();
        return a;
    }

    /* renamed from: c */
    public final Object mo15646c(C5866d<? super C5975c0<? extends E>> dVar) {
        Object r = mo15656r();
        if (r == C5970b.f14970c) {
            return mo15642a(2, dVar);
        }
        if (r instanceof C5989m) {
            C5977b bVar = C5975c0.f14982b;
            r = new C5976a(((C5989m) r).f14999i);
        } else {
            C5977b bVar2 = C5975c0.f14982b;
        }
        C5975c0.m22455b(r);
        return C5975c0.m22453a(r);
    }

    /* renamed from: g */
    public final C6080c<E> mo15647g() {
        return new C5967f(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C6004x<E> mo15648i() {
        C6004x<E> i = super.mo15648i();
        if (i != null && !(i instanceof C5989m)) {
            mo15654p();
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo15649k() {
        C5989m c = mo15683c();
        String str = "Cannot happen";
        if (c != null) {
            while (true) {
                C6006z j = mo15687j();
                if (j == null) {
                    throw new IllegalStateException(str.toString());
                } else if (!(j instanceof C5989m)) {
                    j.mo15673a(c);
                } else if (C6157l0.m23149a()) {
                    if (!(j == c)) {
                        throw new AssertionError();
                    }
                    return;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException(str.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final C5965d<E> mo15650l() {
        return new C5965d<>(mo15684e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract boolean mo15651m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract boolean mo15652n();

    /* renamed from: o */
    public final boolean mo15653o() {
        return !(mo15684e().mo15898m() instanceof C6006z) && mo15652n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo15654p() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo15655q() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Object mo15656r() {
        C6006z j;
        Object g;
        do {
            j = mo15687j();
            if (j == null) {
                return C5970b.f14970c;
            }
            g = j.mo15675g(null);
        } while (g == null);
        j.mo15674f(g);
        return j.mo15676t();
    }
}
