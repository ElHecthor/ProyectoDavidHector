package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C6199u1.C6200a;
import kotlinx.coroutines.internal.C6108e;
import kotlinx.coroutines.internal.C6121j;
import kotlinx.coroutines.internal.C6122k;
import kotlinx.coroutines.internal.C6122k.C6125b;
import kotlinx.coroutines.internal.C6134q;
import kotlinx.coroutines.internal.C6138u;
import kotlinx.coroutines.p330c3.C6042a;
import kotlinx.coroutines.p330c3.C6043b;
import kotlinx.coroutines.p332e3.C6081d;
import p308k.C5809q;
import p308k.C5812t;
import p308k.p312d0.C5751d;
import p308k.p312d0.C5753f;
import p308k.p316w.C5866d;
import p308k.p316w.C5871g;
import p308k.p316w.C5871g.C5874b;
import p308k.p316w.C5871g.C5876c;
import p308k.p316w.p318j.p319a.C5890e;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p316w.p318j.p319a.C5893h;
import p308k.p316w.p318j.p319a.C5897k;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5941j;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.b2 */
public class C6014b2 implements C6199u1, C6176q, C6151j2 {

    /* renamed from: f */
    private static final AtomicReferenceFieldUpdater f15017f = AtomicReferenceFieldUpdater.newUpdater(C6014b2.class, Object.class, "_state");
    private volatile Object _state;
    public volatile C6168o parentHandle;

    /* renamed from: kotlinx.coroutines.b2$a */
    private static final class C6015a<T> extends C6152k<T> {

        /* renamed from: m */
        private final C6014b2 f15018m;

        public C6015a(C5866d<? super T> dVar, C6014b2 b2Var) {
            C5942k.m22327b(dVar, "delegate");
            C5942k.m22327b(b2Var, "job");
            super(dVar, 1);
            this.f15018m = b2Var;
        }

        /* renamed from: a */
        public Throwable mo15749a(C6199u1 u1Var) {
            C5942k.m22327b(u1Var, "parent");
            Object m = this.f15018m.mo15743m();
            if (m instanceof C6017c) {
                Throwable th = ((C6017c) m).rootCause;
                if (th != null) {
                    return th;
                }
            }
            return m instanceof C6193t ? ((C6193t) m).f15300a : u1Var.mo15742l();
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public String mo15750i() {
            return "AwaitContinuation";
        }
    }

    /* renamed from: kotlinx.coroutines.b2$b */
    private static final class C6016b extends C5960a2<C6199u1> {

        /* renamed from: j */
        private final C6014b2 f15019j;

        /* renamed from: k */
        private final C6017c f15020k;

        /* renamed from: l */
        private final C6172p f15021l;

        /* renamed from: m */
        private final Object f15022m;

        public C6016b(C6014b2 b2Var, C6017c cVar, C6172p pVar, Object obj) {
            C5942k.m22327b(b2Var, "parent");
            C5942k.m22327b(cVar, "state");
            C5942k.m22327b(pVar, "child");
            super(pVar.f15285j);
            this.f15019j = b2Var;
            this.f15020k = cVar;
            this.f15021l = pVar;
            this.f15022m = obj;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo15751d((Throwable) obj);
            return C5812t.f14872a;
        }

        /* renamed from: d */
        public void mo15751d(Throwable th) {
            this.f15019j.m22593a(this.f15020k, this.f15021l, this.f15022m);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChildCompletion[");
            sb.append(this.f15021l);
            sb.append(", ");
            sb.append(this.f15022m);
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.b2$c */
    private static final class C6017c implements C6174p1 {
        private volatile Object _exceptionsHolder;

        /* renamed from: f */
        private final C6091g2 f15023f;
        public volatile boolean isCompleting;
        public volatile Throwable rootCause;

        public C6017c(C6091g2 g2Var, boolean z, Throwable th) {
            C5942k.m22327b(g2Var, "list");
            this.f15023f = g2Var;
            this.isCompleting = z;
            this.rootCause = th;
        }

        /* renamed from: d */
        private final ArrayList<Throwable> m22656d() {
            return new ArrayList<>(4);
        }

        /* renamed from: a */
        public final void mo15752a(Throwable th) {
            C5942k.m22327b(th, "exception");
            Throwable th2 = this.rootCause;
            if (th2 == null) {
                this.rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList d = m22656d();
                        d.add(obj);
                        d.add(th);
                        this._exceptionsHolder = d;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("State is ");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
        }

        /* renamed from: a */
        public boolean mo15640a() {
            return this.rootCause == null;
        }

        /* renamed from: b */
        public final List<Throwable> mo15753b(Throwable th) {
            ArrayList arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = m22656d();
            } else if (obj instanceof Throwable) {
                ArrayList d = m22656d();
                d.add(obj);
                arrayList = d;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("State is ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
            Throwable th2 = this.rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && (!C5942k.m22326a((Object) th, (Object) th2))) {
                arrayList.add(th);
            }
            this._exceptionsHolder = C6041c2.f15091a;
            return arrayList;
        }

        /* renamed from: b */
        public final boolean mo15754b() {
            return this.rootCause != null;
        }

        /* renamed from: c */
        public final boolean mo15755c() {
            return this._exceptionsHolder == C6041c2.f15091a;
        }

        /* renamed from: i */
        public C6091g2 mo15641i() {
            return this.f15023f;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Finishing[cancelling=");
            sb.append(mo15754b());
            sb.append(", completing=");
            sb.append(this.isCompleting);
            sb.append(", rootCause=");
            sb.append(this.rootCause);
            sb.append(", exceptions=");
            sb.append(this._exceptionsHolder);
            sb.append(", list=");
            sb.append(mo15641i());
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: kotlinx.coroutines.b2$d */
    public static final class C6018d extends C6125b {

        /* renamed from: d */
        final /* synthetic */ C6014b2 f15024d;

        /* renamed from: e */
        final /* synthetic */ Object f15025e;

        public C6018d(C6122k kVar, C6122k kVar2, C6014b2 b2Var, Object obj) {
            this.f15024d = b2Var;
            this.f15025e = obj;
            super(kVar2);
        }

        /* renamed from: a */
        public Object mo15668b(C6122k kVar) {
            C5942k.m22327b(kVar, "affected");
            if (this.f15024d.mo15743m() == this.f15025e) {
                return null;
            }
            return C6121j.m22985b();
        }
    }

    @C5891f(mo15593c = "kotlinx.coroutines.JobSupport$children$1", mo15594f = "JobSupport.kt", mo15595l = {897, 899}, mo15596m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.b2$e */
    static final class C6019e extends C5897k implements C5922p<C5753f<? super C6176q>, C5866d<? super C5812t>, Object> {

        /* renamed from: h */
        private C5753f f15026h;

        /* renamed from: i */
        Object f15027i;

        /* renamed from: j */
        Object f15028j;

        /* renamed from: k */
        Object f15029k;

        /* renamed from: l */
        Object f15030l;

        /* renamed from: m */
        Object f15031m;

        /* renamed from: n */
        Object f15032n;

        /* renamed from: o */
        int f15033o;

        /* renamed from: p */
        final /* synthetic */ C6014b2 f15034p;

        C6019e(C6014b2 b2Var, C5866d dVar) {
            this.f15034p = b2Var;
            super(2, dVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo4016a(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = p308k.p316w.p317i.C5885d.m22250a()
                int r1 = r10.f15033o
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x003b
                if (r1 == r3) goto L_0x0032
                if (r1 != r2) goto L_0x002a
                java.lang.Object r1 = r10.f15032n
                kotlinx.coroutines.p r1 = (kotlinx.coroutines.C6172p) r1
                java.lang.Object r1 = r10.f15031m
                kotlinx.coroutines.internal.k r1 = (kotlinx.coroutines.internal.C6122k) r1
                java.lang.Object r4 = r10.f15030l
                kotlinx.coroutines.g2 r4 = (kotlinx.coroutines.C6091g2) r4
                java.lang.Object r5 = r10.f15029k
                kotlinx.coroutines.g2 r5 = (kotlinx.coroutines.C6091g2) r5
                java.lang.Object r6 = r10.f15028j
                java.lang.Object r7 = r10.f15027i
                k.d0.f r7 = (p308k.p312d0.C5753f) r7
                p308k.C5806n.m22054a(r11)
                r11 = r10
                goto L_0x009b
            L_0x002a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0032:
                java.lang.Object r0 = r10.f15027i
                k.d0.f r0 = (p308k.p312d0.C5753f) r0
                p308k.C5806n.m22054a(r11)
                goto L_0x00a8
            L_0x003b:
                p308k.C5806n.m22054a(r11)
                k.d0.f r11 = r10.f15026h
                kotlinx.coroutines.b2 r1 = r10.f15034p
                java.lang.Object r1 = r1.mo15743m()
                boolean r4 = r1 instanceof kotlinx.coroutines.C6172p
                if (r4 == 0) goto L_0x005c
                r2 = r1
                kotlinx.coroutines.p r2 = (kotlinx.coroutines.C6172p) r2
                kotlinx.coroutines.q r2 = r2.f15285j
                r10.f15027i = r11
                r10.f15028j = r1
                r10.f15033o = r3
                java.lang.Object r11 = r11.mo15388a(r2, r10)
                if (r11 != r0) goto L_0x00a8
                return r0
            L_0x005c:
                boolean r4 = r1 instanceof kotlinx.coroutines.C6174p1
                if (r4 == 0) goto L_0x00a8
                r4 = r1
                kotlinx.coroutines.p1 r4 = (kotlinx.coroutines.C6174p1) r4
                kotlinx.coroutines.g2 r4 = r4.mo15641i()
                if (r4 == 0) goto L_0x00a8
                java.lang.Object r5 = r4.mo15897l()
                if (r5 == 0) goto L_0x00a0
                kotlinx.coroutines.internal.k r5 = (kotlinx.coroutines.internal.C6122k) r5
                r7 = r11
                r6 = r1
                r1 = r5
                r11 = r10
                r5 = r4
            L_0x0076:
                boolean r8 = p308k.p323z.p325d.C5942k.m22326a(r1, r4)
                r8 = r8 ^ r3
                if (r8 == 0) goto L_0x00a8
                boolean r8 = r1 instanceof kotlinx.coroutines.C6172p
                if (r8 == 0) goto L_0x009b
                r8 = r1
                kotlinx.coroutines.p r8 = (kotlinx.coroutines.C6172p) r8
                kotlinx.coroutines.q r9 = r8.f15285j
                r11.f15027i = r7
                r11.f15028j = r6
                r11.f15029k = r5
                r11.f15030l = r4
                r11.f15031m = r1
                r11.f15032n = r8
                r11.f15033o = r2
                java.lang.Object r8 = r7.mo15388a(r9, r11)
                if (r8 != r0) goto L_0x009b
                return r0
            L_0x009b:
                kotlinx.coroutines.internal.k r1 = r1.mo15898m()
                goto L_0x0076
            L_0x00a0:
                k.q r11 = new k.q
                java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
                r11.<init>(r0)
                throw r11
            L_0x00a8:
                k.t r11 = p308k.C5812t.f14872a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6014b2.C6019e.mo4016a(java.lang.Object):java.lang.Object");
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C6019e eVar = new C6019e(this.f15034p, dVar);
            eVar.f15026h = (C5753f) obj;
            return eVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C6019e) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    public C6014b2(boolean z) {
        this._state = z ? C6041c2.f15093c : C6041c2.f15092b;
    }

    /* renamed from: a */
    private final int m22586a(Object obj, Object obj2, int i) {
        if (!(obj instanceof C6174p1)) {
            return 0;
        }
        return (((obj instanceof C6040c1) || (obj instanceof C5960a2)) && !(obj instanceof C6172p) && !(obj2 instanceof C6193t)) ? !m22605b((C6174p1) obj, obj2, i) ? 3 : 1 : m22606c((C6174p1) obj, obj2, i);
    }

    /* renamed from: a */
    private final Throwable m22587a(C6017c cVar, List<? extends Throwable> list) {
        Object obj = null;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!(((Throwable) next) instanceof CancellationException)) {
                    obj = next;
                    break;
                }
            }
            Throwable th = (Throwable) obj;
            if (th == null) {
                th = (Throwable) list.get(0);
            }
            return th;
        } else if (cVar.mo15754b()) {
            return mo15636s();
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ CancellationException m22588a(C6014b2 b2Var, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return b2Var.mo15718a(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* renamed from: a */
    private final C5960a2<?> m22589a(C5918l<? super Throwable, C5812t> lVar, boolean z) {
        String str = "Failed requirement.";
        boolean z2 = true;
        C6209w1 w1Var = null;
        if (z) {
            if (lVar instanceof C6209w1) {
                w1Var = lVar;
            }
            C6209w1 w1Var2 = w1Var;
            if (w1Var2 != null) {
                if (w1Var2.f14955i != this) {
                    z2 = false;
                }
                if (!z2) {
                    throw new IllegalArgumentException(str.toString());
                } else if (w1Var2 != null) {
                    return w1Var2;
                }
            }
            return new C6190s1(this, lVar);
        }
        if (lVar instanceof C5960a2) {
            w1Var = lVar;
        }
        C5960a2<?> a2Var = w1Var;
        if (a2Var != null) {
            if (a2Var.f14955i != this || (a2Var instanceof C6209w1)) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(str.toString());
            } else if (a2Var != null) {
                return a2Var;
            }
        }
        return new C6195t1(this, lVar);
    }

    /* renamed from: a */
    private final C6172p m22590a(C6122k kVar) {
        while (kVar.mo15903r()) {
            kVar = kVar.mo15900o();
        }
        while (true) {
            kVar = kVar.mo15898m();
            if (!kVar.mo15903r()) {
                if (kVar instanceof C6172p) {
                    return (C6172p) kVar;
                }
                if (kVar instanceof C6091g2) {
                    return null;
                }
            }
        }
    }

    /* renamed from: a */
    private final C6172p m22591a(C6174p1 p1Var) {
        C6172p pVar = (C6172p) (!(p1Var instanceof C6172p) ? null : p1Var);
        if (pVar != null) {
            return pVar;
        }
        C6091g2 i = p1Var.mo15641i();
        if (i != null) {
            return m22590a((C6122k) i);
        }
        return null;
    }

    /* renamed from: a */
    private final void m22592a(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set a = C6108e.m22953a(list.size());
            Throwable d = C6138u.m23080d(th);
            for (Throwable d2 : list) {
                Throwable d3 = C6138u.m23080d(d2);
                if (d3 != th && d3 != d && !(d3 instanceof CancellationException) && a.add(d3)) {
                    C5727b.m21843a(th, d3);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m22593a(C6017c cVar, C6172p pVar, Object obj) {
        if (mo15743m() == cVar) {
            C6172p a = m22590a((C6122k) pVar);
            if (a == null || !m22604b(cVar, a, obj)) {
                boolean a2 = m22599a(cVar, obj, 0);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [kotlinx.coroutines.o1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m22595a(kotlinx.coroutines.C6040c1 r3) {
        /*
            r2 = this;
            kotlinx.coroutines.g2 r0 = new kotlinx.coroutines.g2
            r0.<init>()
            boolean r1 = r3.mo15640a()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            kotlinx.coroutines.o1 r1 = new kotlinx.coroutines.o1
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f15017f
            r1.compareAndSet(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6014b2.m22595a(kotlinx.coroutines.c1):void");
    }

    /* renamed from: a */
    private final void m22596a(C6091g2 g2Var, Throwable th) {
        mo15738h(th);
        Object l = g2Var.mo15897l();
        if (l != null) {
            C6215y yVar = null;
            for (C6122k kVar = (C6122k) l; !C5942k.m22326a((Object) kVar, (Object) g2Var); kVar = kVar.mo15898m()) {
                if (kVar instanceof C6209w1) {
                    C5960a2 a2Var = (C5960a2) kVar;
                    try {
                        a2Var.mo15751d(th);
                    } catch (Throwable th2) {
                        if (yVar != null) {
                            C5727b.m21843a(yVar, th2);
                            if (yVar != null) {
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Exception in completion handler ");
                        sb.append(a2Var);
                        sb.append(" for ");
                        sb.append(this);
                        yVar = new C6215y(sb.toString(), th2);
                        C5812t tVar = C5812t.f14872a;
                    }
                }
            }
            if (yVar != null) {
                mo15633g((Throwable) yVar);
            }
            m22612i(th);
            return;
        }
        throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: a */
    private final void m22597a(C6174p1 p1Var, Object obj, int i) {
        C6168o oVar = this.parentHandle;
        if (oVar != null) {
            oVar.mo15639f();
            this.parentHandle = C6095h2.f15187f;
        }
        Throwable th = null;
        C6193t tVar = (C6193t) (!(obj instanceof C6193t) ? null : obj);
        if (tVar != null) {
            th = tVar.f15300a;
        }
        if (p1Var instanceof C5960a2) {
            try {
                ((C5960a2) p1Var).mo15751d(th);
            } catch (Throwable th2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in completion handler ");
                sb.append(p1Var);
                sb.append(" for ");
                sb.append(this);
                mo15633g((Throwable) new C6215y(sb.toString(), th2));
            }
        } else {
            C6091g2 i2 = p1Var.mo15641i();
            if (i2 != null) {
                m22603b(i2, th);
            }
        }
        mo15722a(obj, i);
    }

    /* renamed from: a */
    private final boolean m22598a(Object obj, C6091g2 g2Var, C5960a2<?> a2Var) {
        int a;
        C6018d dVar = new C6018d(a2Var, a2Var, this, obj);
        do {
            Object n = g2Var.mo15899n();
            if (n != null) {
                a = ((C6122k) n).mo15893a(a2Var, g2Var, dVar);
                if (a == 1) {
                    return true;
                }
            } else {
                throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (a != 2);
        return false;
    }

    /* renamed from: a */
    private final boolean m22599a(C6017c cVar, Object obj, int i) {
        boolean b;
        Throwable a;
        boolean z = false;
        if (!(mo15743m() == cVar)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!(!cVar.mo15755c())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (cVar.isCompleting) {
            C6193t tVar = (C6193t) (!(obj instanceof C6193t) ? null : obj);
            Throwable th = tVar != null ? tVar.f15300a : null;
            synchronized (cVar) {
                b = cVar.mo15754b();
                List b2 = cVar.mo15753b(th);
                a = m22587a(cVar, b2);
                if (a != null) {
                    m22592a(a, b2);
                }
            }
            if (!(a == null || a == th)) {
                obj = new C6193t(a, false, 2, null);
            }
            if (a != null) {
                if (m22612i(a) || mo15735f(a)) {
                    z = true;
                }
                if (z) {
                    if (obj != null) {
                        ((C6193t) obj).mo15963b();
                    } else {
                        throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    }
                }
            }
            if (!b) {
                mo15738h(a);
            }
            mo15631c(obj);
            if (f15017f.compareAndSet(this, cVar, C6041c2.m22705a(obj))) {
                m22597a((C6174p1) cVar, obj, i);
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected state: ");
            sb.append(this._state);
            sb.append(", expected: ");
            sb.append(cVar);
            sb.append(", update: ");
            sb.append(obj);
            throw new IllegalArgumentException(sb.toString().toString());
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: a */
    private final boolean m22600a(C6174p1 p1Var, Throwable th) {
        if (C6157l0.m23149a() && !(!(p1Var instanceof C6017c))) {
            throw new AssertionError();
        } else if (!C6157l0.m23149a() || p1Var.mo15640a()) {
            C6091g2 b = m22601b(p1Var);
            if (b == null) {
                return false;
            }
            if (!f15017f.compareAndSet(this, p1Var, new C6017c(b, false, th))) {
                return false;
            }
            m22596a(b, th);
            return true;
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    private final C6091g2 m22601b(C6174p1 p1Var) {
        C6091g2 i = p1Var.mo15641i();
        if (i != null) {
            return i;
        }
        if (p1Var instanceof C6040c1) {
            return new C6091g2();
        }
        if (p1Var instanceof C5960a2) {
            m22602b((C5960a2) p1Var);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("State should have list: ");
        sb.append(p1Var);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* renamed from: b */
    private final void m22602b(C5960a2<?> a2Var) {
        a2Var.mo15896b(new C6091g2());
        f15017f.compareAndSet(this, a2Var, a2Var.mo15898m());
    }

    /* renamed from: b */
    private final void m22603b(C6091g2 g2Var, Throwable th) {
        Object l = g2Var.mo15897l();
        if (l != null) {
            C6215y yVar = null;
            for (C6122k kVar = (C6122k) l; !C5942k.m22326a((Object) kVar, (Object) g2Var); kVar = kVar.mo15898m()) {
                if (kVar instanceof C5960a2) {
                    C5960a2 a2Var = (C5960a2) kVar;
                    try {
                        a2Var.mo15751d(th);
                    } catch (Throwable th2) {
                        if (yVar != null) {
                            C5727b.m21843a(yVar, th2);
                            if (yVar != null) {
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Exception in completion handler ");
                        sb.append(a2Var);
                        sb.append(" for ");
                        sb.append(this);
                        yVar = new C6215y(sb.toString(), th2);
                        C5812t tVar = C5812t.f14872a;
                    }
                }
            }
            if (yVar != null) {
                mo15633g((Throwable) yVar);
                return;
            }
            return;
        }
        throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: b */
    private final boolean m22604b(C6017c cVar, C6172p pVar, Object obj) {
        while (C6200a.m23247a(pVar.f15285j, false, false, new C6016b(this, cVar, pVar, obj), 1, null) == C6095h2.f15187f) {
            pVar = m22590a((C6122k) pVar);
            if (pVar == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private final boolean m22605b(C6174p1 p1Var, Object obj, int i) {
        if (C6157l0.m23149a()) {
            if (!((p1Var instanceof C6040c1) || (p1Var instanceof C5960a2))) {
                throw new AssertionError();
            }
        }
        if (C6157l0.m23149a() && !(!(obj instanceof C6193t))) {
            throw new AssertionError();
        } else if (!f15017f.compareAndSet(this, p1Var, C6041c2.m22705a(obj))) {
            return false;
        } else {
            mo15738h((Throwable) null);
            mo15631c(obj);
            m22597a(p1Var, obj, i);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0054, code lost:
        if (r3 == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0056, code lost:
        m22596a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0059, code lost:
        r8 = m22591a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005d, code lost:
        if (r8 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0063, code lost:
        if (m22604b(r2, r8, r9) == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0066, code lost:
        return 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x006b, code lost:
        if (m22599a(r2, r9, r10) == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x006d, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x006e, code lost:
        return 3;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m22606c(kotlinx.coroutines.C6174p1 r8, java.lang.Object r9, int r10) {
        /*
            r7 = this;
            kotlinx.coroutines.g2 r0 = r7.m22601b(r8)
            r1 = 3
            if (r0 == 0) goto L_0x007e
            boolean r2 = r8 instanceof kotlinx.coroutines.C6014b2.C6017c
            r3 = 0
            if (r2 != 0) goto L_0x000e
            r2 = r3
            goto L_0x000f
        L_0x000e:
            r2 = r8
        L_0x000f:
            kotlinx.coroutines.b2$c r2 = (kotlinx.coroutines.C6014b2.C6017c) r2
            r4 = 0
            if (r2 == 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            kotlinx.coroutines.b2$c r2 = new kotlinx.coroutines.b2$c
            r2.<init>(r0, r4, r3)
        L_0x001a:
            monitor-enter(r2)
            boolean r5 = r2.isCompleting     // Catch:{ all -> 0x007b }
            if (r5 == 0) goto L_0x0021
            monitor-exit(r2)
            return r4
        L_0x0021:
            r4 = 1
            r2.isCompleting = r4     // Catch:{ all -> 0x007b }
            if (r2 == r8) goto L_0x0030
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f15017f     // Catch:{ all -> 0x007b }
            boolean r5 = r5.compareAndSet(r7, r8, r2)     // Catch:{ all -> 0x007b }
            if (r5 != 0) goto L_0x0030
            monitor-exit(r2)
            return r1
        L_0x0030:
            boolean r5 = r2.mo15755c()     // Catch:{ all -> 0x007b }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x006f
            boolean r5 = r2.mo15754b()     // Catch:{ all -> 0x007b }
            boolean r6 = r9 instanceof kotlinx.coroutines.C6193t     // Catch:{ all -> 0x007b }
            if (r6 != 0) goto L_0x0041
            r6 = r3
            goto L_0x0042
        L_0x0041:
            r6 = r9
        L_0x0042:
            kotlinx.coroutines.t r6 = (kotlinx.coroutines.C6193t) r6     // Catch:{ all -> 0x007b }
            if (r6 == 0) goto L_0x004b
            java.lang.Throwable r6 = r6.f15300a     // Catch:{ all -> 0x007b }
            r2.mo15752a(r6)     // Catch:{ all -> 0x007b }
        L_0x004b:
            java.lang.Throwable r6 = r2.rootCause     // Catch:{ all -> 0x007b }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x0051
            r3 = r6
        L_0x0051:
            k.t r5 = p308k.C5812t.f14872a     // Catch:{ all -> 0x007b }
            monitor-exit(r2)
            if (r3 == 0) goto L_0x0059
            r7.m22596a(r0, r3)
        L_0x0059:
            kotlinx.coroutines.p r8 = r7.m22591a(r8)
            if (r8 == 0) goto L_0x0067
            boolean r8 = r7.m22604b(r2, r8, r9)
            if (r8 == 0) goto L_0x0067
            r8 = 2
            return r8
        L_0x0067:
            boolean r8 = r7.m22599a(r2, r9, r10)
            if (r8 == 0) goto L_0x006e
            return r4
        L_0x006e:
            return r1
        L_0x006f:
            java.lang.String r8 = "Failed requirement."
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007b }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x007b }
            r9.<init>(r8)     // Catch:{ all -> 0x007b }
            throw r9     // Catch:{ all -> 0x007b }
        L_0x007b:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x007e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6014b2.m22606c(kotlinx.coroutines.p1, java.lang.Object, int):int");
    }

    /* renamed from: d */
    private final boolean mo15632d(Object obj) {
        int a;
        do {
            Object m = mo15743m();
            if ((m instanceof C6174p1) && (!(m instanceof C6017c) || !((C6017c) m).isCompleting)) {
                a = m22586a(m, (Object) new C6193t(m22608f(obj), false, 2, null), 0);
                if (a != 0) {
                    if (a == 1 || a == 2) {
                        return true;
                    }
                }
            }
            return false;
        } while (a == 3);
        throw new IllegalStateException("unexpected result".toString());
    }

    /* renamed from: f */
    private final Throwable m22608f(Object obj) {
        if (obj != null ? obj instanceof Throwable : true) {
            return obj != null ? (Throwable) obj : mo15636s();
        }
        if (obj != null) {
            return ((C6151j2) obj).mo15740i();
        }
        throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
    }

    /* renamed from: g */
    private final Throwable m22609g(Object obj) {
        if (!(obj instanceof C6193t)) {
            obj = null;
        }
        C6193t tVar = (C6193t) obj;
        if (tVar != null) {
            return tVar.f15300a;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        if (r0 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        m22596a(((kotlinx.coroutines.C6014b2.C6017c) r2).mo15641i(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        return true;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m22610h(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r7.mo15743m()
            boolean r3 = r2 instanceof kotlinx.coroutines.C6014b2.C6017c
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x004a
            monitor-enter(r2)
            r3 = r2
            kotlinx.coroutines.b2$c r3 = (kotlinx.coroutines.C6014b2.C6017c) r3     // Catch:{ all -> 0x0047 }
            boolean r3 = r3.mo15755c()     // Catch:{ all -> 0x0047 }
            if (r3 == 0) goto L_0x0018
            monitor-exit(r2)
            return r4
        L_0x0018:
            r3 = r2
            kotlinx.coroutines.b2$c r3 = (kotlinx.coroutines.C6014b2.C6017c) r3     // Catch:{ all -> 0x0047 }
            boolean r3 = r3.mo15754b()     // Catch:{ all -> 0x0047 }
            if (r8 != 0) goto L_0x0023
            if (r3 != 0) goto L_0x0030
        L_0x0023:
            if (r1 == 0) goto L_0x0026
            goto L_0x002a
        L_0x0026:
            java.lang.Throwable r1 = r7.m22608f(r8)     // Catch:{ all -> 0x0047 }
        L_0x002a:
            r8 = r2
            kotlinx.coroutines.b2$c r8 = (kotlinx.coroutines.C6014b2.C6017c) r8     // Catch:{ all -> 0x0047 }
            r8.mo15752a(r1)     // Catch:{ all -> 0x0047 }
        L_0x0030:
            r8 = r2
            kotlinx.coroutines.b2$c r8 = (kotlinx.coroutines.C6014b2.C6017c) r8     // Catch:{ all -> 0x0047 }
            java.lang.Throwable r8 = r8.rootCause     // Catch:{ all -> 0x0047 }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003a
            r0 = r8
        L_0x003a:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0046
            kotlinx.coroutines.b2$c r2 = (kotlinx.coroutines.C6014b2.C6017c) r2
            kotlinx.coroutines.g2 r8 = r2.mo15641i()
            r7.m22596a(r8, r0)
        L_0x0046:
            return r5
        L_0x0047:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x004a:
            boolean r3 = r2 instanceof kotlinx.coroutines.C6174p1
            if (r3 == 0) goto L_0x00a1
            if (r1 == 0) goto L_0x0051
            goto L_0x0055
        L_0x0051:
            java.lang.Throwable r1 = r7.m22608f(r8)
        L_0x0055:
            r3 = r2
            kotlinx.coroutines.p1 r3 = (kotlinx.coroutines.C6174p1) r3
            boolean r6 = r3.mo15640a()
            if (r6 == 0) goto L_0x0065
            boolean r2 = r7.m22600a(r3, r1)
            if (r2 == 0) goto L_0x0002
            return r5
        L_0x0065:
            kotlinx.coroutines.t r3 = new kotlinx.coroutines.t
            r6 = 2
            r3.<init>(r1, r4, r6, r0)
            int r3 = r7.m22586a(r2, r3, r4)
            if (r3 == 0) goto L_0x0086
            if (r3 == r5) goto L_0x0085
            if (r3 == r6) goto L_0x0085
            r2 = 3
            if (r3 != r2) goto L_0x0079
            goto L_0x0002
        L_0x0079:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected result"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x0085:
            return r5
        L_0x0086:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Cannot happen in "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L_0x00a1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6014b2.m22610h(java.lang.Object):boolean");
    }

    /* renamed from: i */
    private final int m22611i(Object obj) {
        if (obj instanceof C6040c1) {
            if (((C6040c1) obj).mo15640a()) {
                return 0;
            }
            if (!f15017f.compareAndSet(this, obj, C6041c2.f15093c)) {
                return -1;
            }
            mo15635q();
            return 1;
        } else if (!(obj instanceof C6170o1)) {
            return 0;
        } else {
            if (!f15017f.compareAndSet(this, obj, ((C6170o1) obj).mo15641i())) {
                return -1;
            }
            mo15635q();
            return 1;
        }
    }

    /* renamed from: i */
    private final boolean m22612i(Throwable th) {
        boolean z = true;
        if (mo15745o()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        C6168o oVar = this.parentHandle;
        if (oVar == null || oVar == C6095h2.f15187f) {
            return z2;
        }
        if (!oVar.mo15857c(th) && !z2) {
            z = false;
        }
        return z;
    }

    /* renamed from: j */
    private final String m22613j(Object obj) {
        String str = "Active";
        if (!(obj instanceof C6017c)) {
            return obj instanceof C6174p1 ? ((C6174p1) obj).mo15640a() ? str : "New" : obj instanceof C6193t ? "Cancelled" : "Completed";
        }
        C6017c cVar = (C6017c) obj;
        return cVar.mo15754b() ? "Cancelling" : cVar.isCompleting ? "Completing" : str;
    }

    /* renamed from: s */
    private final C6205v1 mo15636s() {
        return new C6205v1("Job was cancelled", null, this);
    }

    /* renamed from: t */
    private final boolean mo15637t() {
        Object m;
        do {
            m = mo15743m();
            if (!(m instanceof C6174p1)) {
                return false;
            }
        } while (m22611i(m) < 0);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final CancellationException mo15718a(Throwable th, String str) {
        C5942k.m22327b(th, "$this$toCancellationException");
        CancellationException cancellationException = (CancellationException) (!(th instanceof CancellationException) ? null : th);
        if (cancellationException == null) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(C6161m0.m23157a((Object) th));
                sb.append(" was cancelled");
                str = sb.toString();
            }
            cancellationException = new C6205v1(str, th, this);
        }
        return cancellationException;
    }

    /* renamed from: a */
    public final C5959a1 mo15719a(C5918l<? super Throwable, C5812t> lVar) {
        C5942k.m22327b(lVar, "handler");
        return mo15720a(false, true, lVar);
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r4v0, types: [kotlinx.coroutines.h2] */
    /* JADX WARNING: type inference failed for: r4v1, types: [kotlinx.coroutines.a1] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4, types: [kotlinx.coroutines.a1, kotlinx.coroutines.a2] */
    /* JADX WARNING: type inference failed for: r1v5, types: [kotlinx.coroutines.a2] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7, types: [kotlinx.coroutines.a1, kotlinx.coroutines.a2] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r1v8, types: [kotlinx.coroutines.a2] */
    /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Object, kotlinx.coroutines.a1] */
    /* JADX WARNING: type inference failed for: r1v10, types: [kotlinx.coroutines.a2] */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0007, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v2
      assigns: []
      uses: []
      mth insns count: 91
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.C5959a1 mo15720a(boolean r8, boolean r9, p308k.p323z.p324c.C5918l<? super java.lang.Throwable, p308k.C5812t> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "handler"
            p308k.p323z.p325d.C5942k.m22327b(r10, r0)
            r0 = 0
            r1 = r0
        L_0x0007:
            java.lang.Object r2 = r7.mo15743m()
            boolean r3 = r2 instanceof kotlinx.coroutines.C6040c1
            if (r3 == 0) goto L_0x002c
            r3 = r2
            kotlinx.coroutines.c1 r3 = (kotlinx.coroutines.C6040c1) r3
            boolean r4 = r3.mo15640a()
            if (r4 == 0) goto L_0x0028
            if (r1 == 0) goto L_0x001b
            goto L_0x001f
        L_0x001b:
            kotlinx.coroutines.a2 r1 = r7.m22589a(r10, r8)
        L_0x001f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f15017f
            boolean r2 = r3.compareAndSet(r7, r2, r1)
            if (r2 == 0) goto L_0x0007
            return r1
        L_0x0028:
            r7.m22595a(r3)
            goto L_0x0007
        L_0x002c:
            boolean r3 = r2 instanceof kotlinx.coroutines.C6174p1
            if (r3 == 0) goto L_0x0096
            r3 = r2
            kotlinx.coroutines.p1 r3 = (kotlinx.coroutines.C6174p1) r3
            kotlinx.coroutines.g2 r3 = r3.mo15641i()
            if (r3 != 0) goto L_0x0049
            if (r2 == 0) goto L_0x0041
            kotlinx.coroutines.a2 r2 = (kotlinx.coroutines.C5960a2) r2
            r7.m22602b(r2)
            goto L_0x0007
        L_0x0041:
            k.q r8 = new k.q
            java.lang.String r9 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>"
            r8.<init>(r9)
            throw r8
        L_0x0049:
            kotlinx.coroutines.h2 r4 = kotlinx.coroutines.C6095h2.f15187f
            if (r8 == 0) goto L_0x007f
            boolean r5 = r2 instanceof kotlinx.coroutines.C6014b2.C6017c
            if (r5 == 0) goto L_0x007f
            monitor-enter(r2)
            r5 = r2
            kotlinx.coroutines.b2$c r5 = (kotlinx.coroutines.C6014b2.C6017c) r5     // Catch:{ all -> 0x007c }
            java.lang.Throwable r5 = r5.rootCause     // Catch:{ all -> 0x007c }
            if (r5 == 0) goto L_0x0064
            boolean r6 = r10 instanceof kotlinx.coroutines.C6172p     // Catch:{ all -> 0x007c }
            if (r6 == 0) goto L_0x0078
            r6 = r2
            kotlinx.coroutines.b2$c r6 = (kotlinx.coroutines.C6014b2.C6017c) r6     // Catch:{ all -> 0x007c }
            boolean r6 = r6.isCompleting     // Catch:{ all -> 0x007c }
            if (r6 != 0) goto L_0x0078
        L_0x0064:
            if (r1 == 0) goto L_0x0067
            goto L_0x006b
        L_0x0067:
            kotlinx.coroutines.a2 r1 = r7.m22589a(r10, r8)     // Catch:{ all -> 0x007c }
        L_0x006b:
            boolean r4 = r7.m22598a(r2, r3, r1)     // Catch:{ all -> 0x007c }
            if (r4 != 0) goto L_0x0073
            monitor-exit(r2)
            goto L_0x0007
        L_0x0073:
            if (r5 != 0) goto L_0x0077
            monitor-exit(r2)
            return r1
        L_0x0077:
            r4 = r1
        L_0x0078:
            k.t r6 = p308k.C5812t.f14872a     // Catch:{ all -> 0x007c }
            monitor-exit(r2)
            goto L_0x0080
        L_0x007c:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x007f:
            r5 = r0
        L_0x0080:
            if (r5 == 0) goto L_0x0088
            if (r9 == 0) goto L_0x0087
            r10.mo4090d(r5)
        L_0x0087:
            return r4
        L_0x0088:
            if (r1 == 0) goto L_0x008b
            goto L_0x008f
        L_0x008b:
            kotlinx.coroutines.a2 r1 = r7.m22589a(r10, r8)
        L_0x008f:
            boolean r2 = r7.m22598a(r2, r3, r1)
            if (r2 == 0) goto L_0x0007
            return r1
        L_0x0096:
            if (r9 == 0) goto L_0x00a6
            boolean r8 = r2 instanceof kotlinx.coroutines.C6193t
            if (r8 != 0) goto L_0x009d
            r2 = r0
        L_0x009d:
            kotlinx.coroutines.t r2 = (kotlinx.coroutines.C6193t) r2
            if (r2 == 0) goto L_0x00a3
            java.lang.Throwable r0 = r2.f15300a
        L_0x00a3:
            r10.mo4090d(r0)
        L_0x00a6:
            kotlinx.coroutines.h2 r8 = kotlinx.coroutines.C6095h2.f15187f
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6014b2.mo15720a(boolean, boolean, k.z.c.l):kotlinx.coroutines.a1");
    }

    /* renamed from: a */
    public final C6168o mo15721a(C6176q qVar) {
        C5942k.m22327b(qVar, "child");
        C5959a1 a = C6200a.m23247a(this, true, false, new C6172p(this, qVar), 2, null);
        if (a != null) {
            return (C6168o) a;
        }
        throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15722a(Object obj, int i) {
    }

    /* renamed from: a */
    public void mo15644a(CancellationException cancellationException) {
        mo15700d((Throwable) cancellationException);
    }

    /* renamed from: a */
    public final void mo15723a(C5960a2<?> a2Var) {
        Object m;
        C5942k.m22327b(a2Var, "node");
        do {
            m = mo15743m();
            if (!(m instanceof C5960a2)) {
                if ((m instanceof C6174p1) && ((C6174p1) m).mo15641i() != null) {
                    a2Var.mo15892s();
                }
                return;
            } else if (m != a2Var) {
                return;
            }
        } while (!f15017f.compareAndSet(this, m, C6041c2.f15093c));
    }

    /* renamed from: a */
    public final void mo15724a(C6151j2 j2Var) {
        C5942k.m22327b(j2Var, "parentJob");
        mo15726a((Object) j2Var);
    }

    /* renamed from: a */
    public final void mo15725a(C6199u1 u1Var) {
        if (C6157l0.m23149a()) {
            if (!(this.parentHandle == null)) {
                throw new AssertionError();
            }
        }
        if (u1Var == null) {
            this.parentHandle = C6095h2.f15187f;
            return;
        }
        u1Var.start();
        C6168o a = u1Var.mo15721a((C6176q) this);
        this.parentHandle = a;
        if (mo15744n()) {
            a.mo15639f();
            this.parentHandle = C6095h2.f15187f;
        }
    }

    /* renamed from: a */
    public boolean mo15630a() {
        Object m = mo15743m();
        return (m instanceof C6174p1) && ((C6174p1) m).mo15640a();
    }

    /* renamed from: a */
    public final boolean mo15726a(Object obj) {
        if (!mo15741k() || !mo15632d(obj)) {
            return m22610h(obj);
        }
        return true;
    }

    /* renamed from: b */
    public final <T, R> void mo15727b(C6081d<? super R> dVar, C5922p<? super T, ? super C5866d<? super R>, ? extends Object> pVar) {
        Object m;
        C5942k.m22327b(dVar, "select");
        C5942k.m22327b(pVar, "block");
        do {
            m = mo15743m();
            if (!dVar.mo15846k()) {
                if (!(m instanceof C6174p1)) {
                    if (dVar.mo15843a((Object) null)) {
                        if (m instanceof C6193t) {
                            dVar.mo15841a(((C6193t) m).f15300a);
                        } else {
                            C6043b.m22715b(pVar, C6041c2.m22707b(m), dVar.mo15844c());
                        }
                    }
                    return;
                }
            } else {
                return;
            }
        } while (m22611i(m) != 0);
        dVar.mo15842a(mo15719a((C5918l<? super Throwable, C5812t>) new C6171o2<Object,C5812t>(this, dVar, pVar)));
    }

    /* renamed from: b */
    public final boolean mo15728b(Object obj, int i) {
        int a;
        do {
            a = m22586a(mo15743m(), obj, i);
            if (a == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Job ");
                sb.append(this);
                sb.append(" is already complete or completing, ");
                sb.append("but is being completed with ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString(), m22609g(obj));
            } else if (a == 1) {
                return true;
            } else {
                if (a == 2) {
                    return false;
                }
            }
        } while (a == 3);
        throw new IllegalStateException("unexpected result".toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo15631c(Object obj) {
    }

    /* renamed from: c */
    public final <T, R> void mo15729c(C6081d<? super R> dVar, C5922p<? super T, ? super C5866d<? super R>, ? extends Object> pVar) {
        C5942k.m22327b(dVar, "select");
        C5942k.m22327b(pVar, "block");
        Object m = mo15743m();
        if (m instanceof C6193t) {
            dVar.mo15841a(((C6193t) m).f15300a);
        } else {
            C6042a.m22711a(pVar, C6041c2.m22707b(m), dVar.mo15844c());
        }
    }

    /* renamed from: c */
    public final boolean mo15730c(Throwable th) {
        return mo15726a((Object) th);
    }

    /* renamed from: d */
    public final Object mo15731d(C5866d<? super C5812t> dVar) {
        if (mo15637t()) {
            return mo15737h(dVar);
        }
        C6222z2.m23303a(dVar.mo15390b());
        return C5812t.f14872a;
    }

    /* renamed from: d */
    public boolean mo15700d(Throwable th) {
        return mo15726a((Object) th) && mo15739h();
    }

    /* renamed from: e */
    public boolean mo15732e(Throwable th) {
        C5942k.m22327b(th, "cause");
        boolean z = true;
        if (th instanceof CancellationException) {
            return true;
        }
        if (!mo15726a((Object) th) || !mo15739h()) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public final Object mo15733f(C5866d<Object> dVar) {
        Object m;
        do {
            m = mo15743m();
            if (!(m instanceof C6174p1)) {
                if (!(m instanceof C6193t)) {
                    return C6041c2.m22707b(m);
                }
                Throwable th = ((C6193t) m).f15300a;
                if (C6157l0.m23152d()) {
                    C5941j.m22319a(0);
                    if (!(dVar instanceof C5890e)) {
                        throw th;
                    }
                    throw C6138u.m23078b(th, (C5890e) dVar);
                }
                throw th;
            }
        } while (m22611i(m) < 0);
        return mo15736g(dVar);
    }

    /* renamed from: f */
    public final C5751d<C6199u1> mo15734f() {
        return C5755h.m21898b(new C6019e(this, null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo15735f(Throwable th) {
        C5942k.m22327b(th, "exception");
        return false;
    }

    public <R> R fold(R r, C5922p<? super R, ? super C5874b, ? extends R> pVar) {
        C5942k.m22327b(pVar, "operation");
        return C6200a.m23244a(this, r, pVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ Object mo15736g(C5866d<Object> dVar) {
        C6015a aVar = new C6015a(C5880c.m22243a(dVar), this);
        C6156l.m23147a((C6148j<?>) aVar, mo15719a((C5918l<? super Throwable, C5812t>) new C6159l2<Object,C5812t>(this, aVar)));
        Object f = aVar.mo15944f();
        if (f == C5885d.m22250a()) {
            C5893h.m22280c(dVar);
        }
        return f;
    }

    /* renamed from: g */
    public void mo15633g(Throwable th) {
        C5942k.m22327b(th, "exception");
        throw th;
    }

    public <E extends C5874b> E get(C5876c<E> cVar) {
        C5942k.m22327b(cVar, "key");
        return C6200a.m23245a((C6199u1) this, cVar);
    }

    public final C5876c<?> getKey() {
        return C6199u1.f15308d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ Object mo15737h(C5866d<? super C5812t> dVar) {
        C6152k kVar = new C6152k(C5880c.m22243a(dVar), 1);
        C6156l.m23147a((C6148j<?>) kVar, mo15719a((C5918l<? super Throwable, C5812t>) new C6167n2<Object,C5812t>(this, kVar)));
        Object f = kVar.mo15944f();
        if (f == C5885d.m22250a()) {
            C5893h.m22280c(dVar);
        }
        return f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo15738h(Throwable th) {
    }

    /* renamed from: h */
    public boolean mo15739h() {
        return true;
    }

    /* renamed from: i */
    public CancellationException mo15740i() {
        Throwable th;
        Object m = mo15743m();
        CancellationException cancellationException = null;
        if (m instanceof C6017c) {
            th = ((C6017c) m).rootCause;
        } else if (m instanceof C6193t) {
            th = ((C6193t) m).f15300a;
        } else if (!(m instanceof C6174p1)) {
            th = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot be cancelling child in this state: ");
            sb.append(m);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Parent job is ");
        sb2.append(m22613j(m));
        return new C6205v1(sb2.toString(), th, this);
    }

    /* renamed from: k */
    public boolean mo15741k() {
        return false;
    }

    /* renamed from: l */
    public final CancellationException mo15742l() {
        Object m = mo15743m();
        String str = "Job is still new or active: ";
        if (m instanceof C6017c) {
            Throwable th = ((C6017c) m).rootCause;
            if (th != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(C6161m0.m23157a((Object) this));
                sb.append(" is cancelling");
                CancellationException a = mo15718a(th, sb.toString());
                if (a != null) {
                    return a;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this);
            throw new IllegalStateException(sb2.toString().toString());
        } else if (m instanceof C6174p1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(this);
            throw new IllegalStateException(sb3.toString().toString());
        } else if (m instanceof C6193t) {
            return m22588a(this, ((C6193t) m).f15300a, null, 1, null);
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(C6161m0.m23157a((Object) this));
            sb4.append(" has completed normally");
            return new C6205v1(sb4.toString(), null, this);
        }
    }

    /* renamed from: m */
    public final Object mo15743m() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C6134q)) {
                return obj;
            }
            ((C6134q) obj).mo15876a(this);
        }
    }

    public C5871g minusKey(C5876c<?> cVar) {
        C5942k.m22327b(cVar, "key");
        return C6200a.m23249b(this, cVar);
    }

    /* renamed from: n */
    public final boolean mo15744n() {
        return !(mo15743m() instanceof C6174p1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo15745o() {
        return false;
    }

    /* renamed from: p */
    public String mo15634p() {
        return C6161m0.m23157a((Object) this);
    }

    public C5871g plus(C5871g gVar) {
        C5942k.m22327b(gVar, "context");
        return C6200a.m23246a((C6199u1) this, gVar);
    }

    /* renamed from: q */
    public void mo15635q() {
    }

    /* renamed from: r */
    public final String mo15746r() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo15634p());
        sb.append('{');
        sb.append(m22613j(mo15743m()));
        sb.append('}');
        return sb.toString();
    }

    public final boolean start() {
        int i;
        do {
            i = m22611i(mo15743m());
            if (i == 0) {
                return false;
            }
        } while (i != 1);
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo15746r());
        sb.append('@');
        sb.append(C6161m0.m23159b(this));
        return sb.toString();
    }
}
