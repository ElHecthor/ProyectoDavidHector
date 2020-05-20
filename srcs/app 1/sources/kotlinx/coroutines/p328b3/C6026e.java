package kotlinx.coroutines.p328b3;

import kotlinx.coroutines.C6089g0;
import kotlinx.coroutines.internal.C6139v;
import kotlinx.coroutines.p327a3.C6001u;
import kotlinx.coroutines.p327a3.C6003w;
import kotlinx.coroutines.p328b3.p329g.C6035c;
import kotlinx.coroutines.p328b3.p329g.C6037d;
import kotlinx.coroutines.p332e3.C6074a;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p316w.p318j.p319a.C5898l;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p324c.C5923q;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5949r;

/* renamed from: kotlinx.coroutines.b3.e */
final /* synthetic */ class C6026e {

    @C5891f(mo15593c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2", mo15594f = "Delay.kt", mo15595l = {137}, mo15596m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.b3.e$a */
    static final class C6027a extends C5898l implements C5923q<C6089g0, C6021b<? super T>, C5866d<? super C5812t>, Object> {

        /* renamed from: j */
        private C6089g0 f15042j;

        /* renamed from: k */
        private C6021b f15043k;

        /* renamed from: l */
        Object f15044l;

        /* renamed from: m */
        Object f15045m;

        /* renamed from: n */
        Object f15046n;

        /* renamed from: o */
        Object f15047o;

        /* renamed from: p */
        Object f15048p;

        /* renamed from: q */
        int f15049q;

        /* renamed from: r */
        final /* synthetic */ C6020a f15050r;

        /* renamed from: s */
        final /* synthetic */ long f15051s;

        /* renamed from: kotlinx.coroutines.b3.e$a$a */
        static final class C6028a extends C5898l implements C5922p<Object, C5866d<? super C5812t>, Object> {

            /* renamed from: j */
            private Object f15052j;

            /* renamed from: k */
            Object f15053k;

            /* renamed from: l */
            int f15054l;

            /* renamed from: m */
            final /* synthetic */ C6027a f15055m;

            /* renamed from: n */
            final /* synthetic */ C6003w f15056n;

            /* renamed from: o */
            final /* synthetic */ C5949r f15057o;

            /* renamed from: p */
            final /* synthetic */ C6021b f15058p;

            C6028a(C5866d dVar, C6027a aVar, C6003w wVar, C5949r rVar, C6021b bVar) {
                this.f15055m = aVar;
                this.f15056n = wVar;
                this.f15057o = rVar;
                this.f15058p = bVar;
                super(2, dVar);
            }

            /* renamed from: a */
            public final Object mo4016a(Object obj) {
                Object a = C5885d.m22250a();
                int i = this.f15054l;
                if (i == 0) {
                    C5806n.m22054a(obj);
                    T t = this.f15052j;
                    if (t == null) {
                        T t2 = this.f15057o.f14947f;
                        if (t2 != null) {
                            C6021b bVar = this.f15058p;
                            if (t2 == C6037d.f15085a) {
                                t2 = null;
                            }
                            this.f15053k = t;
                            this.f15054l = 1;
                            if (bVar.mo15106a(t2, this) == a) {
                                return a;
                            }
                        }
                    } else {
                        this.f15057o.f14947f = t;
                        return C5812t.f14872a;
                    }
                } else if (i == 1) {
                    C5806n.m22054a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f15057o.f14947f = C6037d.f15086b;
                return C5812t.f14872a;
            }

            /* renamed from: a */
            public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
                C5942k.m22327b(dVar, "completion");
                C6028a aVar = new C6028a(dVar, this.f15055m, this.f15056n, this.f15057o, this.f15058p);
                aVar.f15052j = obj;
                return aVar;
            }

            /* renamed from: c */
            public final Object mo4018c(Object obj, Object obj2) {
                return ((C6028a) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
            }
        }

        /* renamed from: kotlinx.coroutines.b3.e$a$b */
        static final class C6029b extends C5898l implements C5918l<C5866d<? super C5812t>, Object> {

            /* renamed from: j */
            int f15059j;

            /* renamed from: k */
            final /* synthetic */ Object f15060k;

            /* renamed from: l */
            final /* synthetic */ C6074a f15061l;

            /* renamed from: m */
            final /* synthetic */ C6027a f15062m;

            /* renamed from: n */
            final /* synthetic */ C6003w f15063n;

            /* renamed from: o */
            final /* synthetic */ C5949r f15064o;

            /* renamed from: p */
            final /* synthetic */ C6021b f15065p;

            C6029b(Object obj, C5866d dVar, C6074a aVar, C6027a aVar2, C6003w wVar, C5949r rVar, C6021b bVar) {
                this.f15060k = obj;
                this.f15061l = aVar;
                this.f15062m = aVar2;
                this.f15063n = wVar;
                this.f15064o = rVar;
                this.f15065p = bVar;
                super(1, dVar);
            }

            /* renamed from: a */
            public final Object mo4016a(Object obj) {
                Object a = C5885d.m22250a();
                int i = this.f15059j;
                if (i == 0) {
                    C5806n.m22054a(obj);
                    Object obj2 = null;
                    this.f15064o.f14947f = null;
                    C6021b bVar = this.f15065p;
                    C6139v vVar = C6037d.f15085a;
                    Object obj3 = this.f15060k;
                    if (obj3 != vVar) {
                        obj2 = obj3;
                    }
                    this.f15059j = 1;
                    if (bVar.mo15106a(obj2, this) == a) {
                        return a;
                    }
                } else if (i == 1) {
                    C5806n.m22054a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C5812t.f14872a;
            }

            /* renamed from: a */
            public final C5866d<C5812t> mo15586a(C5866d<?> dVar) {
                C5942k.m22327b(dVar, "completion");
                C6029b bVar = new C6029b(this.f15060k, dVar, this.f15061l, this.f15062m, this.f15063n, this.f15064o, this.f15065p);
                return bVar;
            }

            /* renamed from: d */
            public final Object mo4090d(Object obj) {
                return ((C6029b) mo15586a((C5866d) obj)).mo4016a((Object) C5812t.f14872a);
            }
        }

        @C5891f(mo15593c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2$values$1", mo15594f = "Delay.kt", mo15595l = {137}, mo15596m = "invokeSuspend")
        /* renamed from: kotlinx.coroutines.b3.e$a$c */
        static final class C6030c extends C5898l implements C5922p<C6001u<? super Object>, C5866d<? super C5812t>, Object> {

            /* renamed from: j */
            private C6001u f15066j;

            /* renamed from: k */
            Object f15067k;

            /* renamed from: l */
            Object f15068l;

            /* renamed from: m */
            int f15069m;

            /* renamed from: n */
            final /* synthetic */ C6027a f15070n;

            /* renamed from: kotlinx.coroutines.b3.e$a$c$a */
            public static final class C6031a implements C6021b<T> {

                /* renamed from: a */
                final /* synthetic */ C6001u f15071a;

                public C6031a(C6001u uVar) {
                    this.f15071a = uVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object mo15106a(java.lang.Object r5, p308k.p316w.C5866d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof kotlinx.coroutines.p328b3.C6032f
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        kotlinx.coroutines.b3.f r0 = (kotlinx.coroutines.p328b3.C6032f) r0
                        int r1 = r0.f15073j
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f15073j = r1
                        goto L_0x0018
                    L_0x0013:
                        kotlinx.coroutines.b3.f r0 = new kotlinx.coroutines.b3.f
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f15072i
                        java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
                        int r2 = r0.f15073j
                        r3 = 1
                        if (r2 == 0) goto L_0x003d
                        if (r2 != r3) goto L_0x0035
                        java.lang.Object r5 = r0.f15078o
                        java.lang.Object r5 = r0.f15077n
                        k.w.d r5 = (p308k.p316w.C5866d) r5
                        java.lang.Object r5 = r0.f15076m
                        java.lang.Object r5 = r0.f15075l
                        kotlinx.coroutines.b3.e$a$c$a r5 = (kotlinx.coroutines.p328b3.C6026e.C6027a.C6030c.C6031a) r5
                        p308k.C5806n.m22054a(r6)
                        goto L_0x0059
                    L_0x0035:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x003d:
                        p308k.C5806n.m22054a(r6)
                        kotlinx.coroutines.a3.u r6 = r4.f15071a
                        if (r5 == 0) goto L_0x0046
                        r2 = r5
                        goto L_0x0048
                    L_0x0046:
                        kotlinx.coroutines.internal.v r2 = kotlinx.coroutines.p328b3.p329g.C6037d.f15085a
                    L_0x0048:
                        r0.f15075l = r4
                        r0.f15076m = r5
                        r0.f15077n = r0
                        r0.f15078o = r5
                        r0.f15073j = r3
                        java.lang.Object r5 = r6.mo15670a(r2, r0)
                        if (r5 != r1) goto L_0x0059
                        return r1
                    L_0x0059:
                        k.t r5 = p308k.C5812t.f14872a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p328b3.C6026e.C6027a.C6030c.C6031a.mo15106a(java.lang.Object, k.w.d):java.lang.Object");
                }
            }

            C6030c(C6027a aVar, C5866d dVar) {
                this.f15070n = aVar;
                super(2, dVar);
            }

            /* renamed from: a */
            public final Object mo4016a(Object obj) {
                Object a = C5885d.m22250a();
                int i = this.f15069m;
                if (i == 0) {
                    C5806n.m22054a(obj);
                    C6001u uVar = this.f15066j;
                    C6020a aVar = this.f15070n.f15050r;
                    C6031a aVar2 = new C6031a(uVar);
                    this.f15067k = uVar;
                    this.f15068l = aVar;
                    this.f15069m = 1;
                    if (aVar.mo15758a(aVar2, this) == a) {
                        return a;
                    }
                } else if (i == 1) {
                    C6020a aVar3 = (C6020a) this.f15068l;
                    C6001u uVar2 = (C6001u) this.f15067k;
                    C5806n.m22054a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C5812t.f14872a;
            }

            /* renamed from: a */
            public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
                C5942k.m22327b(dVar, "completion");
                C6030c cVar = new C6030c(this.f15070n, dVar);
                cVar.f15066j = (C6001u) obj;
                return cVar;
            }

            /* renamed from: c */
            public final Object mo4018c(Object obj, Object obj2) {
                return ((C6030c) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
            }
        }

        C6027a(C6020a aVar, long j, C5866d dVar) {
            this.f15050r = aVar;
            this.f15051s = j;
            super(3, dVar);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:13|14|15|16) */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x009e, code lost:
            r0 = th;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00b5  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x005d  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo4016a(java.lang.Object r20) {
            /*
                r19 = this;
                r1 = r19
                java.lang.Object r0 = p308k.p316w.p317i.C5885d.m22250a()
                int r2 = r1.f15049q
                r3 = 1
                if (r2 == 0) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                java.lang.Object r2 = r1.f15048p
                kotlinx.coroutines.b3.e$a r2 = (kotlinx.coroutines.p328b3.C6026e.C6027a) r2
                java.lang.Object r2 = r1.f15047o
                k.z.d.r r2 = (p308k.p323z.p325d.C5949r) r2
                java.lang.Object r4 = r1.f15046n
                kotlinx.coroutines.a3.w r4 = (kotlinx.coroutines.p327a3.C6003w) r4
                java.lang.Object r5 = r1.f15045m
                kotlinx.coroutines.b3.b r5 = (kotlinx.coroutines.p328b3.C6021b) r5
                java.lang.Object r6 = r1.f15044l
                kotlinx.coroutines.g0 r6 = (kotlinx.coroutines.C6089g0) r6
                p308k.C5806n.m22054a(r20)
                r11 = r1
                r12 = r2
                r13 = r4
                r14 = r5
                r15 = r6
                r2 = r0
                goto L_0x00bd
            L_0x002c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0034:
                p308k.C5806n.m22054a(r20)
                kotlinx.coroutines.g0 r2 = r1.f15042j
                kotlinx.coroutines.b3.b r10 = r1.f15043k
                r5 = 0
                r6 = -1
                kotlinx.coroutines.b3.e$a$c r7 = new kotlinx.coroutines.b3.e$a$c
                r11 = 0
                r7.<init>(r1, r11)
                r8 = 1
                r9 = 0
                r4 = r2
                kotlinx.coroutines.a3.w r4 = kotlinx.coroutines.p327a3.C5999s.m22548a(r4, r5, r6, r7, r8, r9)
                k.z.d.r r5 = new k.z.d.r
                r5.<init>()
                r5.f14947f = r11
                r11 = r1
                r15 = r2
                r13 = r4
                r12 = r5
                r14 = r10
                r2 = r0
            L_0x0057:
                T r0 = r12.f14947f
                kotlinx.coroutines.internal.v r4 = kotlinx.coroutines.p328b3.p329g.C6037d.f15086b
                if (r0 == r4) goto L_0x00bf
                r11.f15044l = r15
                r11.f15045m = r14
                r11.f15046n = r13
                r11.f15047o = r12
                r11.f15048p = r11
                r11.f15049q = r3
                kotlinx.coroutines.e3.b r10 = new kotlinx.coroutines.e3.b
                r10.<init>(r11)
                kotlinx.coroutines.e3.c r0 = r13.mo15647g()     // Catch:{ all -> 0x00a4 }
                kotlinx.coroutines.b3.e$a$a r9 = new kotlinx.coroutines.b3.e$a$a     // Catch:{ all -> 0x00a4 }
                r5 = 0
                r4 = r9
                r6 = r11
                r7 = r13
                r8 = r12
                r3 = r9
                r9 = r14
                r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00a4 }
                r10.mo15839a(r0, r3)     // Catch:{ all -> 0x00a4 }
                T r5 = r12.f14947f     // Catch:{ all -> 0x00a4 }
                if (r5 == 0) goto L_0x00a0
                long r8 = r11.f15051s     // Catch:{ all -> 0x00a4 }
                kotlinx.coroutines.b3.e$a$b r0 = new kotlinx.coroutines.b3.e$a$b     // Catch:{ all -> 0x00a4 }
                r6 = 0
                r4 = r0
                r7 = r10
                r16 = r8
                r8 = r11
                r9 = r13
                r3 = r10
                r10 = r12
                r18 = r11
                r11 = r14
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x009e }
                r4 = r16
                r3.mo15838a(r4, r0)     // Catch:{ all -> 0x009e }
                goto L_0x00ab
            L_0x009e:
                r0 = move-exception
                goto L_0x00a8
            L_0x00a0:
                r3 = r10
                r18 = r11
                goto L_0x00ab
            L_0x00a4:
                r0 = move-exception
                r3 = r10
                r18 = r11
            L_0x00a8:
                r3.mo15845d(r0)
            L_0x00ab:
                java.lang.Object r0 = r3.mo15676t()
                java.lang.Object r3 = p308k.p316w.p317i.C5885d.m22250a()
                if (r0 != r3) goto L_0x00b8
                p308k.p316w.p318j.p319a.C5893h.m22280c(r18)
            L_0x00b8:
                if (r0 != r2) goto L_0x00bb
                return r2
            L_0x00bb:
                r11 = r18
            L_0x00bd:
                r3 = 1
                goto L_0x0057
            L_0x00bf:
                k.t r0 = p308k.C5812t.f14872a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p328b3.C6026e.C6027a.mo4016a(java.lang.Object):java.lang.Object");
        }

        /* renamed from: a */
        public final Object mo15602a(Object obj, Object obj2, Object obj3) {
            return ((C6027a) mo15759a((C6089g0) obj, (C6021b) obj2, (C5866d) obj3)).mo4016a(C5812t.f14872a);
        }

        /* renamed from: a */
        public final C5866d<C5812t> mo15759a(C6089g0 g0Var, C6021b<? super T> bVar, C5866d<? super C5812t> dVar) {
            C5942k.m22327b(g0Var, "$this$create");
            C5942k.m22327b(bVar, "downstream");
            C5942k.m22327b(dVar, "continuation");
            C6027a aVar = new C6027a(this.f15050r, this.f15051s, dVar);
            aVar.f15042j = g0Var;
            aVar.f15043k = bVar;
            return aVar;
        }
    }

    /* renamed from: a */
    public static final <T> C6020a<T> m22677a(C6020a<? extends T> aVar, long j) {
        C5942k.m22327b(aVar, "$this$debounce");
        if (j > 0) {
            return C6035c.m22697a(new C6027a(aVar, j, null));
        }
        throw new IllegalArgumentException("Debounce timeout should be positive".toString());
    }
}
