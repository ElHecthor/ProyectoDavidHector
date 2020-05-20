package androidx.room;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.C6089g0;
import kotlinx.coroutines.C6148j;
import kotlinx.coroutines.C6152k;
import kotlinx.coroutines.C6188s;
import kotlinx.coroutines.C6199u1;
import kotlinx.coroutines.C6199u1.C6200a;
import p308k.C5803m;
import p308k.C5803m.C5804a;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.C5867e;
import p308k.p316w.C5871g.C5874b;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p316w.p318j.p319a.C5893h;
import p308k.p316w.p318j.p319a.C5898l;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;

/* renamed from: androidx.room.m */
public final class C0716m {

    /* renamed from: androidx.room.m$a */
    static final class C0717a extends C5943l implements C5918l<Throwable, C5812t> {

        /* renamed from: g */
        final /* synthetic */ C6199u1 f2837g;

        C0717a(Executor executor, C6199u1 u1Var) {
            this.f2837g = u1Var;
            super(1);
        }

        /* renamed from: a */
        public final void mo4089a(Throwable th) {
            C6200a.m23248a(this.f2837g, null, 1, null);
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo4089a((Throwable) obj);
            return C5812t.f14872a;
        }
    }

    /* renamed from: androidx.room.m$b */
    static final class C0718b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C6148j f2838f;

        /* renamed from: g */
        final /* synthetic */ C6199u1 f2839g;

        /* renamed from: androidx.room.m$b$a */
        static final class C0719a extends C5898l implements C5922p<C6089g0, C5866d<? super C5812t>, Object> {

            /* renamed from: j */
            private C6089g0 f2840j;

            /* renamed from: k */
            Object f2841k;

            /* renamed from: l */
            int f2842l;

            /* renamed from: m */
            final /* synthetic */ C0718b f2843m;

            C0719a(C0718b bVar, C5866d dVar) {
                this.f2843m = bVar;
                super(2, dVar);
            }

            /* renamed from: a */
            public final Object mo4016a(Object obj) {
                Object a = C5885d.m22250a();
                int i = this.f2842l;
                if (i == 0) {
                    C5806n.m22054a(obj);
                    C6089g0 g0Var = this.f2840j;
                    C6148j jVar = this.f2843m.f2838f;
                    C5874b bVar = g0Var.mo2973c().get(C5867e.f14898b);
                    if (bVar != null) {
                        C5804a aVar = C5803m.f14866f;
                        C5803m.m22049a(bVar);
                        jVar.mo15391b(bVar);
                        C6199u1 u1Var = this.f2843m.f2839g;
                        this.f2841k = g0Var;
                        this.f2842l = 1;
                        if (u1Var.mo15731d(this) == a) {
                            return a;
                        }
                    } else {
                        C5942k.m22323a();
                        throw null;
                    }
                } else if (i == 1) {
                    C6089g0 g0Var2 = (C6089g0) this.f2841k;
                    C5806n.m22054a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C5812t.f14872a;
            }

            /* renamed from: a */
            public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
                C5942k.m22327b(dVar, "completion");
                C0719a aVar = new C0719a(this.f2843m, dVar);
                aVar.f2840j = (C6089g0) obj;
                return aVar;
            }

            /* renamed from: c */
            public final Object mo4018c(Object obj, Object obj2) {
                return ((C0719a) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
            }
        }

        C0718b(C6148j jVar, Executor executor, C6199u1 u1Var) {
            this.f2838f = jVar;
            this.f2839g = u1Var;
        }

        public final void run() {
            C6083f.m22894a(null, new C0719a(this, null), 1, null);
        }
    }

    @C5891f(mo15593c = "androidx.room.RoomDatabaseKt", mo15594f = "RoomDatabase.kt", mo15595l = {99}, mo15596m = "createTransactionContext")
    /* renamed from: androidx.room.m$c */
    static final class C0720c extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f2844i;

        /* renamed from: j */
        int f2845j;

        /* renamed from: k */
        Object f2846k;

        /* renamed from: l */
        Object f2847l;

        C0720c(C5866d dVar) {
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f2844i = obj;
            this.f2845j |= RecyclerView.UNDEFINED_DURATION;
            return C0716m.m3984a(null, this);
        }
    }

    /* renamed from: androidx.room.m$d */
    static final class C0721d extends C5943l implements C5918l<Throwable, C5812t> {

        /* renamed from: g */
        final /* synthetic */ C6188s f2848g;

        C0721d(C6188s sVar) {
            this.f2848g = sVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo4092a(Throwable th) {
            C6200a.m23248a(this.f2848g, null, 1, null);
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo4092a((Throwable) obj);
            return C5812t.f14872a;
        }
    }

    @C5891f(mo15593c = "androidx.room.RoomDatabaseKt", mo15594f = "RoomDatabase.kt", mo15595l = {50, 51}, mo15596m = "withTransaction")
    /* renamed from: androidx.room.m$e */
    static final class C0722e extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f2849i;

        /* renamed from: j */
        int f2850j;

        /* renamed from: k */
        Object f2851k;

        /* renamed from: l */
        Object f2852l;

        /* renamed from: m */
        Object f2853m;

        C0722e(C5866d dVar) {
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f2849i = obj;
            this.f2850j |= RecyclerView.UNDEFINED_DURATION;
            return C0716m.m3985a((C0711l) null, null, (C5866d<? super R>) this);
        }
    }

    @C5891f(mo15593c = "androidx.room.RoomDatabaseKt$withTransaction$2", mo15594f = "RoomDatabase.kt", mo15595l = {58}, mo15596m = "invokeSuspend")
    /* renamed from: androidx.room.m$f */
    static final class C0723f extends C5898l implements C5922p<C6089g0, C5866d<? super R>, Object> {

        /* renamed from: j */
        private C6089g0 f2854j;

        /* renamed from: k */
        Object f2855k;

        /* renamed from: l */
        Object f2856l;

        /* renamed from: m */
        int f2857m;

        /* renamed from: n */
        final /* synthetic */ C0711l f2858n;

        /* renamed from: o */
        final /* synthetic */ C5918l f2859o;

        C0723f(C0711l lVar, C5918l lVar2, C5866d dVar) {
            this.f2858n = lVar;
            this.f2859o = lVar2;
            super(2, dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            C0737u uVar;
            C0737u uVar2;
            Object a = C5885d.m22250a();
            int i = this.f2857m;
            if (i == 0) {
                C5806n.m22054a(obj);
                C6089g0 g0Var = this.f2854j;
                C5874b bVar = g0Var.mo2973c().get(C0737u.f2903i);
                if (bVar != null) {
                    uVar = (C0737u) bVar;
                    uVar.mo4130b();
                    try {
                        this.f2858n.mo4069c();
                    } catch (Throwable th) {
                        th = th;
                        uVar.mo4132d();
                        throw th;
                    }
                    try {
                        C5918l lVar = this.f2859o;
                        this.f2855k = g0Var;
                        this.f2856l = uVar;
                        this.f2857m = 1;
                        obj = lVar.mo4090d(this);
                        if (obj == a) {
                            return a;
                        }
                        uVar2 = uVar;
                    } catch (Throwable th2) {
                        th = th2;
                        uVar2 = uVar;
                        this.f2858n.mo4071e();
                        throw th;
                    }
                } else {
                    C5942k.m22323a();
                    throw null;
                }
            } else if (i == 1) {
                uVar2 = (C0737u) this.f2856l;
                C6089g0 g0Var2 = (C6089g0) this.f2855k;
                try {
                    C5806n.m22054a(obj);
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f2858n.mo4081o();
            try {
                this.f2858n.mo4071e();
                uVar2.mo4132d();
                return obj;
            } catch (Throwable th4) {
                th = th4;
                uVar = uVar2;
                uVar.mo4132d();
                throw th;
            }
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
            C5942k.m22327b(dVar, "completion");
            C0723f fVar = new C0723f(this.f2858n, this.f2859o, dVar);
            fVar.f2854j = (C6089g0) obj;
            return fVar;
        }

        /* renamed from: c */
        public final Object mo4018c(Object obj, Object obj2) {
            return ((C0723f) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ java.lang.Object m3984a(androidx.room.C0711l r6, p308k.p316w.C5866d<? super p308k.p316w.C5871g> r7) {
        /*
            boolean r0 = r7 instanceof androidx.room.C0716m.C0720c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.room.m$c r0 = (androidx.room.C0716m.C0720c) r0
            int r1 = r0.f2845j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f2845j = r1
            goto L_0x0018
        L_0x0013:
            androidx.room.m$c r0 = new androidx.room.m$c
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f2844i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f2845j
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r6 = r0.f2847l
            kotlinx.coroutines.s r6 = (kotlinx.coroutines.C6188s) r6
            java.lang.Object r0 = r0.f2846k
            androidx.room.l r0 = (androidx.room.C0711l) r0
            p308k.C5806n.m22054a(r7)
            goto L_0x0071
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            p308k.C5806n.m22054a(r7)
            r7 = 0
            kotlinx.coroutines.s r7 = kotlinx.coroutines.C6221z1.m23298a(r7, r3, r7)
            k.w.g r2 = r0.mo15390b()
            kotlinx.coroutines.u1$b r4 = kotlinx.coroutines.C6199u1.f15308d
            k.w.g$b r2 = r2.get(r4)
            kotlinx.coroutines.u1 r2 = (kotlinx.coroutines.C6199u1) r2
            if (r2 == 0) goto L_0x0057
            androidx.room.m$d r4 = new androidx.room.m$d
            r4.<init>(r7)
            r2.mo15719a(r4)
        L_0x0057:
            java.util.concurrent.Executor r2 = r6.mo4078l()
            java.lang.String r4 = "transactionExecutor"
            p308k.p323z.p325d.C5942k.m22324a(r2, r4)
            r0.f2846k = r6
            r0.f2847l = r7
            r0.f2845j = r3
            java.lang.Object r0 = m3986a(r2, r7, r0)
            if (r0 != r1) goto L_0x006d
            return r1
        L_0x006d:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L_0x0071:
            k.w.e r7 = (p308k.p316w.C5867e) r7
            androidx.room.u r1 = new androidx.room.u
            r1.<init>(r6, r7)
            java.lang.ThreadLocal r0 = r0.mo4077k()
            java.lang.String r2 = "suspendingTransactionId"
            p308k.p323z.p325d.C5942k.m22324a(r0, r2)
            int r6 = java.lang.System.identityHashCode(r6)
            java.lang.Integer r6 = p308k.p316w.p318j.p319a.C5887b.m22260a(r6)
            kotlinx.coroutines.s2 r6 = kotlinx.coroutines.C6196t2.m23229a(r0, r6)
            k.w.g r7 = r7.plus(r1)
            k.w.g r6 = r7.plus(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C0716m.m3984a(androidx.room.l, k.w.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        if (r7 != null) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0088 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0089 A[PHI: r7 
      PHI: (r7v2 java.lang.Object) = (r7v4 java.lang.Object), (r7v1 java.lang.Object) binds: [B:23:0x0086, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <R> java.lang.Object m3985a(androidx.room.C0711l r5, p308k.p323z.p324c.C5918l<? super p308k.p316w.C5866d<? super R>, ? extends java.lang.Object> r6, p308k.p316w.C5866d<? super R> r7) {
        /*
            boolean r0 = r7 instanceof androidx.room.C0716m.C0722e
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.room.m$e r0 = (androidx.room.C0716m.C0722e) r0
            int r1 = r0.f2850j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f2850j = r1
            goto L_0x0018
        L_0x0013:
            androidx.room.m$e r0 = new androidx.room.m$e
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f2849i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f2850j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r5 = r0.f2853m
            k.w.g r5 = (p308k.p316w.C5871g) r5
            java.lang.Object r5 = r0.f2852l
            k.z.c.l r5 = (p308k.p323z.p324c.C5918l) r5
            java.lang.Object r5 = r0.f2851k
            androidx.room.l r5 = (androidx.room.C0711l) r5
            p308k.C5806n.m22054a(r7)
            goto L_0x0089
        L_0x0038:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0040:
            java.lang.Object r5 = r0.f2852l
            r6 = r5
            k.z.c.l r6 = (p308k.p323z.p324c.C5918l) r6
            java.lang.Object r5 = r0.f2851k
            androidx.room.l r5 = (androidx.room.C0711l) r5
            p308k.C5806n.m22054a(r7)
            goto L_0x0072
        L_0x004d:
            p308k.C5806n.m22054a(r7)
            k.w.g r7 = r0.mo15390b()
            androidx.room.u$a r2 = androidx.room.C0737u.f2903i
            k.w.g$b r7 = r7.get(r2)
            androidx.room.u r7 = (androidx.room.C0737u) r7
            if (r7 == 0) goto L_0x0065
            k.w.e r7 = r7.mo4131c()
            if (r7 == 0) goto L_0x0065
            goto L_0x0074
        L_0x0065:
            r0.f2851k = r5
            r0.f2852l = r6
            r0.f2850j = r4
            java.lang.Object r7 = m3984a(r5, r0)
            if (r7 != r1) goto L_0x0072
            return r1
        L_0x0072:
            k.w.g r7 = (p308k.p316w.C5871g) r7
        L_0x0074:
            androidx.room.m$f r2 = new androidx.room.m$f
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f2851k = r5
            r0.f2852l = r6
            r0.f2853m = r7
            r0.f2850j = r3
            java.lang.Object r7 = kotlinx.coroutines.C6066e.m22822a(r7, r2, r0)
            if (r7 != r1) goto L_0x0089
            return r1
        L_0x0089:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.C0716m.m3985a(androidx.room.l, k.z.c.l, k.w.d):java.lang.Object");
    }

    /* renamed from: a */
    static final /* synthetic */ Object m3986a(Executor executor, C6199u1 u1Var, C5866d<? super C5867e> dVar) {
        C6152k kVar = new C6152k(C5880c.m22243a(dVar), 1);
        kVar.mo15934b((C5918l<? super Throwable, C5812t>) new C0717a<Object,C5812t>(executor, u1Var));
        try {
            executor.execute(new C0718b(kVar, executor, u1Var));
        } catch (RejectedExecutionException e) {
            kVar.mo15935b((Throwable) new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        Object f = kVar.mo15944f();
        if (f == C5885d.m22250a()) {
            C5893h.m22280c(dVar);
        }
        return f;
    }
}
