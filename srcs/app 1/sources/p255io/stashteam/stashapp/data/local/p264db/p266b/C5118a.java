package p255io.stashteam.stashapp.data.local.p264db.p266b;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;

/* renamed from: io.stashteam.stashapp.data.local.db.b.a */
public abstract class C5118a<T> {

    /* renamed from: a */
    private final long f13339a = -1;

    @C5891f(mo15593c = "io.stashteam.stashapp.data.local.db.dao.BaseDao", mo15594f = "BaseDao.kt", mo15595l = {25, 27}, mo15596m = "insertOrUpdate$suspendImpl")
    /* renamed from: io.stashteam.stashapp.data.local.db.b.a$a */
    static final class C5119a extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13340i;

        /* renamed from: j */
        int f13341j;

        /* renamed from: k */
        final /* synthetic */ C5118a f13342k;

        /* renamed from: l */
        Object f13343l;

        /* renamed from: m */
        Object f13344m;

        /* renamed from: n */
        long f13345n;

        C5119a(C5118a aVar, C5866d dVar) {
            this.f13342k = aVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13340i = obj;
            this.f13341j |= RecyclerView.UNDEFINED_DURATION;
            return C5118a.m20309a(this.f13342k, (Object) null, (C5866d) this);
        }
    }

    @C5891f(mo15593c = "io.stashteam.stashapp.data.local.db.dao.BaseDao", mo15594f = "BaseDao.kt", mo15595l = {34}, mo15596m = "insertOrUpdate$suspendImpl")
    /* renamed from: io.stashteam.stashapp.data.local.db.b.a$b */
    static final class C5120b extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f13346i;

        /* renamed from: j */
        int f13347j;

        /* renamed from: k */
        final /* synthetic */ C5118a f13348k;

        /* renamed from: l */
        Object f13349l;

        /* renamed from: m */
        Object f13350m;

        /* renamed from: n */
        Object f13351n;

        /* renamed from: o */
        Object f13352o;

        /* renamed from: p */
        Object f13353p;

        /* renamed from: q */
        Object f13354q;

        C5120b(C5118a aVar, C5866d dVar) {
            this.f13348k = aVar;
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f13346i = obj;
            this.f13347j |= RecyclerView.UNDEFINED_DURATION;
            return C5118a.m20310a(this.f13348k, (List) null, (C5866d) this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object m20309a(p255io.stashteam.stashapp.data.local.p264db.p266b.C5118a r8, java.lang.Object r9, p308k.p316w.C5866d r10) {
        /*
            boolean r0 = r10 instanceof p255io.stashteam.stashapp.data.local.p264db.p266b.C5118a.C5119a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            io.stashteam.stashapp.data.local.db.b.a$a r0 = (p255io.stashteam.stashapp.data.local.p264db.p266b.C5118a.C5119a) r0
            int r1 = r0.f13341j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13341j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.data.local.db.b.a$a r0 = new io.stashteam.stashapp.data.local.db.b.a$a
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f13340i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f13341j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            long r8 = r0.f13345n
            java.lang.Object r8 = r0.f13344m
            java.lang.Object r8 = r0.f13343l
            io.stashteam.stashapp.data.local.db.b.a r8 = (p255io.stashteam.stashapp.data.local.p264db.p266b.C5118a) r8
            p308k.C5806n.m22054a(r10)
            goto L_0x0071
        L_0x0034:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003c:
            java.lang.Object r9 = r0.f13344m
            java.lang.Object r8 = r0.f13343l
            io.stashteam.stashapp.data.local.db.b.a r8 = (p255io.stashteam.stashapp.data.local.p264db.p266b.C5118a) r8
            p308k.C5806n.m22054a(r10)
            goto L_0x0056
        L_0x0046:
            p308k.C5806n.m22054a(r10)
            r0.f13343l = r8
            r0.f13344m = r9
            r0.f13341j = r4
            java.lang.Object r10 = r8.mo14289a((T) r9, r0)
            if (r10 != r1) goto L_0x0056
            return r1
        L_0x0056:
            java.lang.Number r10 = (java.lang.Number) r10
            long r4 = r10.longValue()
            long r6 = r8.f13339a
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0071
            r0.f13343l = r8
            r0.f13344m = r9
            r0.f13345n = r4
            r0.f13341j = r3
            java.lang.Object r8 = r8.mo14292c(r9, r0)
            if (r8 != r1) goto L_0x0071
            return r1
        L_0x0071:
            k.t r8 = p308k.C5812t.f14872a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.local.p264db.p266b.C5118a.m20309a(io.stashteam.stashapp.data.local.db.b.a, java.lang.Object, k.w.d):java.lang.Object");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.lang.Iterable, for r6v0, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object m20310a(p255io.stashteam.stashapp.data.local.p264db.p266b.C5118a r5, java.lang.Iterable r6, p308k.p316w.C5866d r7) {
        /*
            boolean r0 = r7 instanceof p255io.stashteam.stashapp.data.local.p264db.p266b.C5118a.C5120b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            io.stashteam.stashapp.data.local.db.b.a$b r0 = (p255io.stashteam.stashapp.data.local.p264db.p266b.C5118a.C5120b) r0
            int r1 = r0.f13347j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13347j = r1
            goto L_0x0018
        L_0x0013:
            io.stashteam.stashapp.data.local.db.b.a$b r0 = new io.stashteam.stashapp.data.local.db.b.a$b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f13346i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f13347j
            r3 = 1
            if (r2 == 0) goto L_0x004a
            if (r2 != r3) goto L_0x0042
            java.lang.Object r5 = r0.f13354q
            java.lang.Object r5 = r0.f13353p
            java.lang.Object r5 = r0.f13352o
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.f13351n
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r2 = r0.f13350m
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.f13349l
            io.stashteam.stashapp.data.local.db.b.a r4 = (p255io.stashteam.stashapp.data.local.p264db.p266b.C5118a) r4
            p308k.C5806n.m22054a(r7)
            r7 = r2
            r2 = r1
            r1 = r0
            r0 = r6
            r6 = r4
            goto L_0x0057
        L_0x0042:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x004a:
            p308k.C5806n.m22054a(r7)
            java.util.Iterator r7 = r6.iterator()
            r2 = r1
            r1 = r0
            r0 = r6
            r6 = r5
            r5 = r7
            r7 = r0
        L_0x0057:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x0076
            java.lang.Object r4 = r5.next()
            r1.f13349l = r6
            r1.f13350m = r7
            r1.f13351n = r0
            r1.f13352o = r5
            r1.f13353p = r4
            r1.f13354q = r4
            r1.f13347j = r3
            java.lang.Object r4 = r6.mo14291b(r4, r1)
            if (r4 != r2) goto L_0x0057
            return r2
        L_0x0076:
            k.t r5 = p308k.C5812t.f14872a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.data.local.p264db.p266b.C5118a.m20310a(io.stashteam.stashapp.data.local.db.b.a, java.util.List, k.w.d):java.lang.Object");
    }

    /* renamed from: a */
    public abstract Object mo14289a(T t, C5866d<? super Long> dVar);

    /* renamed from: a */
    public Object mo14290a(List<? extends T> list, C5866d<? super C5812t> dVar) {
        return m20310a(this, (List) list, (C5866d) dVar);
    }

    /* renamed from: b */
    public Object mo14291b(T t, C5866d<? super C5812t> dVar) {
        return m20309a(this, (Object) t, (C5866d) dVar);
    }

    /* renamed from: c */
    public abstract Object mo14292c(T t, C5866d<? super C5812t> dVar);
}
