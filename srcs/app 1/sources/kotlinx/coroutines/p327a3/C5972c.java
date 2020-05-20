package kotlinx.coroutines.p327a3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C6157l0;
import kotlinx.coroutines.C6161m0;
import kotlinx.coroutines.internal.C6120i;
import kotlinx.coroutines.internal.C6121j;
import kotlinx.coroutines.internal.C6122k;
import kotlinx.coroutines.internal.C6122k.C6125b;
import kotlinx.coroutines.internal.C6138u;
import p308k.C5809q;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5953v;

/* renamed from: kotlinx.coroutines.a3.c */
public abstract class C5972c<E> implements C5968a0<E> {

    /* renamed from: g */
    private static final AtomicReferenceFieldUpdater f14978g = AtomicReferenceFieldUpdater.newUpdater(C5972c.class, Object.class, "onCloseHandler");

    /* renamed from: f */
    private final C6120i f14979f = new C6120i();
    private volatile Object onCloseHandler = null;

    /* renamed from: kotlinx.coroutines.a3.c$a */
    public static final class C5973a<E> extends C6006z {

        /* renamed from: i */
        public final E f14980i;

        public C5973a(E e) {
            this.f14980i = e;
        }

        /* renamed from: a */
        public void mo15673a(C5989m<?> mVar) {
            C5942k.m22327b(mVar, "closed");
        }

        /* renamed from: f */
        public void mo15674f(Object obj) {
            C5942k.m22327b(obj, "token");
            if (C6157l0.m23149a()) {
                if (!(obj == C5970b.f14974g)) {
                    throw new AssertionError();
                }
            }
        }

        /* renamed from: g */
        public Object mo15675g(Object obj) {
            return C5970b.f14974g;
        }

        /* renamed from: t */
        public Object mo15676t() {
            return this.f14980i;
        }
    }

    /* renamed from: kotlinx.coroutines.a3.c$b */
    public static final class C5974b extends C6125b {

        /* renamed from: d */
        final /* synthetic */ C5972c f14981d;

        public C5974b(C6122k kVar, C6122k kVar2, C5972c cVar) {
            this.f14981d = cVar;
            super(kVar2);
        }

        /* renamed from: a */
        public Object mo15668b(C6122k kVar) {
            C5942k.m22327b(kVar, "affected");
            if (this.f14981d.mo15686h()) {
                return null;
            }
            return C6121j.m22985b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Object m22425a(C6006z zVar) {
        boolean z;
        C6122k kVar;
        String str = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */";
        if (mo15685f()) {
            C6120i iVar = this.f14979f;
            do {
                Object n = iVar.mo15899n();
                if (n != null) {
                    kVar = (C6122k) n;
                    if (kVar instanceof C6004x) {
                        return kVar;
                    }
                } else {
                    throw new C5809q(str);
                }
            } while (!kVar.mo15895a((C6122k) zVar, (C6122k) iVar));
        } else {
            C6120i iVar2 = this.f14979f;
            C5974b bVar = new C5974b(zVar, zVar, this);
            while (true) {
                Object n2 = iVar2.mo15899n();
                if (n2 != null) {
                    C6122k kVar2 = (C6122k) n2;
                    if (!(kVar2 instanceof C6004x)) {
                        int a = kVar2.mo15893a(zVar, iVar2, bVar);
                        z = true;
                        if (a != 1) {
                            if (a == 2) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        return kVar2;
                    }
                } else {
                    throw new C5809q(str);
                }
            }
            if (!z) {
                return C5970b.f14971d;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22427a(C5989m<?> mVar) {
        while (true) {
            C6122k o = mVar.mo15900o();
            if ((o instanceof C6120i) || !(o instanceof C6002v)) {
                mo15679a((C6122k) mVar);
            } else if (!o.mo15892s()) {
                o.mo15902q();
            } else {
                ((C6002v) o).mo15657a(mVar);
            }
        }
        mo15679a((C6122k) mVar);
    }

    /* renamed from: b */
    private final void mo15645b(Throwable th) {
        Object obj = this.onCloseHandler;
        if (obj != null) {
            Object obj2 = C5970b.f14975h;
            if (obj != obj2 && f14978g.compareAndSet(this, obj, obj2)) {
                C5953v.m22350a(obj, 1);
                ((C5918l) obj).mo4090d(th);
            }
        }
    }

    /* renamed from: k */
    private final int mo15649k() {
        C6120i iVar = this.f14979f;
        Object l = iVar.mo15897l();
        if (l != null) {
            int i = 0;
            for (C6122k kVar = (C6122k) l; !C5942k.m22326a((Object) kVar, (Object) iVar); kVar = kVar.mo15898m()) {
                if (kVar instanceof C6122k) {
                    i++;
                }
            }
            return i;
        }
        throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final boolean mo15650l() {
        return !(this.f14979f.mo15898m() instanceof C6004x) && mo15686h();
    }

    /* renamed from: m */
    private final String mo15651m() {
        String str;
        C6122k m = this.f14979f.mo15898m();
        if (m == this.f14979f) {
            return "EmptyQueue";
        }
        if (m instanceof C5989m) {
            str = m.toString();
        } else if (m instanceof C6002v) {
            str = "ReceiveQueued";
        } else if (m instanceof C6006z) {
            str = "SendQueued";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("UNEXPECTED:");
            sb.append(m);
            str = sb.toString();
        }
        C6122k o = this.f14979f.mo15900o();
        if (o != m) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(",queueSize=");
            sb2.append(mo15649k());
            str = sb2.toString();
            if (o instanceof C5989m) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(",closedForSend=");
                sb3.append(o);
                str = sb3.toString();
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo15677a(E e) {
        C6004x i;
        Object b;
        do {
            i = mo15648i();
            if (i == null) {
                return C5970b.f14969b;
            }
            b = i.mo15658b(e, null);
        } while (b == null);
        i.mo15659c(b);
        return i.mo15702h();
    }

    /* renamed from: a */
    public final Object mo15670a(E e, C5866d<? super C5812t> dVar) {
        return offer(e) ? C5812t.f14872a : mo15680b(e, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo15678a() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15679a(C6122k kVar) {
        C5942k.m22327b(kVar, "closed");
    }

    /* renamed from: a */
    public boolean mo15671a(Throwable th) {
        boolean z;
        C5989m mVar = new C5989m(th);
        C6120i iVar = this.f14979f;
        while (true) {
            Object n = iVar.mo15899n();
            if (n != null) {
                C6122k kVar = (C6122k) n;
                if (!(kVar instanceof C5989m)) {
                    if (kVar.mo15895a((C6122k) mVar, (C6122k) iVar)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            } else {
                throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
        if (!z) {
            C6122k o = this.f14979f.mo15900o();
            if (o != null) {
                m22427a((C5989m) o);
                return false;
            }
            throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.channels.Closed<*>");
        }
        m22427a(mVar);
        mo15645b(th);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        r1 = p308k.C5803m.f14866f;
        r4 = p308k.C5806n.m22053a(r4);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo15680b(E r4, p308k.p316w.C5866d<? super p308k.C5812t> r5) {
        /*
            r3 = this;
            kotlinx.coroutines.k r0 = new kotlinx.coroutines.k
            k.w.d r1 = p308k.p316w.p317i.C5880c.m22243a(r5)
            r2 = 0
            r0.<init>(r1, r2)
        L_0x000a:
            boolean r1 = r3.mo15650l()
            if (r1 == 0) goto L_0x0058
            kotlinx.coroutines.a3.b0 r1 = new kotlinx.coroutines.a3.b0
            r1.<init>(r4, r0)
            java.lang.Object r2 = r3.m22425a(r1)
            if (r2 != 0) goto L_0x001f
            kotlinx.coroutines.C6156l.m23148a(r0, r1)
            goto L_0x007e
        L_0x001f:
            boolean r1 = r2 instanceof kotlinx.coroutines.p327a3.C5989m
            if (r1 == 0) goto L_0x0033
            kotlinx.coroutines.a3.m r2 = (kotlinx.coroutines.p327a3.C5989m) r2
            r3.m22427a(r2)
            java.lang.Throwable r4 = r2.mo15704v()
        L_0x002c:
            k.m$a r1 = p308k.C5803m.f14866f
            java.lang.Object r4 = p308k.C5806n.m22053a(r4)
            goto L_0x0064
        L_0x0033:
            java.lang.Object r1 = kotlinx.coroutines.p327a3.C5970b.f14971d
            if (r2 != r1) goto L_0x0038
            goto L_0x0058
        L_0x0038:
            boolean r1 = r2 instanceof kotlinx.coroutines.p327a3.C6002v
            if (r1 == 0) goto L_0x003d
            goto L_0x0058
        L_0x003d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "enqueueSend returned "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L_0x0058:
            java.lang.Object r1 = r3.mo15677a((E) r4)
            java.lang.Object r2 = kotlinx.coroutines.p327a3.C5970b.f14968a
            if (r1 != r2) goto L_0x006b
            k.t r4 = p308k.C5812t.f14872a
            k.m$a r1 = p308k.C5803m.f14866f
        L_0x0064:
            p308k.C5803m.m22049a(r4)
            r0.mo15391b(r4)
            goto L_0x007e
        L_0x006b:
            java.lang.Object r2 = kotlinx.coroutines.p327a3.C5970b.f14969b
            if (r1 != r2) goto L_0x0070
            goto L_0x000a
        L_0x0070:
            boolean r4 = r1 instanceof kotlinx.coroutines.p327a3.C5989m
            if (r4 == 0) goto L_0x008c
            kotlinx.coroutines.a3.m r1 = (kotlinx.coroutines.p327a3.C5989m) r1
            r3.m22427a(r1)
            java.lang.Throwable r4 = r1.mo15704v()
            goto L_0x002c
        L_0x007e:
            java.lang.Object r4 = r0.mo15944f()
            java.lang.Object r0 = p308k.p316w.p317i.C5885d.m22250a()
            if (r4 != r0) goto L_0x008b
            p308k.p316w.p318j.p319a.C5893h.m22280c(r5)
        L_0x008b:
            return r4
        L_0x008c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "offerInternal returned "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p327a3.C5972c.mo15680b(java.lang.Object, k.w.d):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C5989m<?> mo15681b() {
        C6122k m = this.f14979f.mo15898m();
        if (!(m instanceof C5989m)) {
            m = null;
        }
        C5989m mVar = (C5989m) m;
        if (mVar == null) {
            return null;
        }
        m22427a(mVar);
        return mVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C6004x<?> mo15682b(E e) {
        C6122k kVar;
        C6120i iVar = this.f14979f;
        C5973a aVar = new C5973a(e);
        do {
            Object n = iVar.mo15899n();
            if (n != null) {
                kVar = (C6122k) n;
                if (kVar instanceof C6004x) {
                    return (C6004x) kVar;
                }
            } else {
                throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!kVar.mo15895a((C6122k) aVar, (C6122k) iVar));
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C5989m<?> mo15683c() {
        C6122k o = this.f14979f.mo15900o();
        if (!(o instanceof C5989m)) {
            o = null;
        }
        C5989m mVar = (C5989m) o;
        if (mVar == null) {
            return null;
        }
        m22427a(mVar);
        return mVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C6120i mo15684e() {
        return this.f14979f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo15685f();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract boolean mo15686h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C6004x<E> mo15648i() {
        C6122k kVar;
        C6120i iVar = this.f14979f;
        while (true) {
            Object l = iVar.mo15897l();
            if (l != null) {
                kVar = (C6122k) l;
                if (kVar != iVar && (kVar instanceof C6004x)) {
                    if ((((C6004x) kVar) instanceof C5989m) || kVar.mo15892s()) {
                        break;
                    }
                    kVar.mo15901p();
                }
            } else {
                throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
        kVar = null;
        return (C6004x) kVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C6006z mo15687j() {
        C6122k kVar;
        C6120i iVar = this.f14979f;
        while (true) {
            Object l = iVar.mo15897l();
            if (l != null) {
                kVar = (C6122k) l;
                if (kVar != iVar && (kVar instanceof C6006z)) {
                    if ((((C6006z) kVar) instanceof C5989m) || kVar.mo15892s()) {
                        break;
                    }
                    kVar.mo15901p();
                }
            } else {
                throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
        kVar = null;
        return (C6006z) kVar;
    }

    public final boolean offer(E e) {
        Object a = mo15677a(e);
        if (a == C5970b.f14968a) {
            return true;
        }
        if (a == C5970b.f14969b) {
            C5989m c = mo15683c();
            if (c != null) {
                Throwable v = c.mo15704v();
                if (v != null) {
                    Throwable b = C6138u.m23077b(v);
                    if (b != null) {
                        throw b;
                    }
                }
            }
            return false;
        } else if (a instanceof C5989m) {
            throw C6138u.m23077b(((C5989m) a).mo15704v());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("offerInternal returned ");
            sb.append(a);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C6161m0.m23157a((Object) this));
        sb.append('@');
        sb.append(C6161m0.m23159b(this));
        sb.append('{');
        sb.append(mo15651m());
        sb.append('}');
        sb.append(mo15678a());
        return sb.toString();
    }
}
