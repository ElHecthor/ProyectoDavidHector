package androidx.room;

import java.util.concurrent.Callable;
import kotlinx.coroutines.C6089g0;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.p317i.C5879b;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p316w.p318j.p319a.C5898l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: androidx.room.a */
public final class C0682a {

    /* renamed from: a */
    public static final C0683a f2738a = new C0683a(null);

    /* renamed from: androidx.room.a$a */
    public static final class C0683a {

        @C5891f(mo15593c = "androidx.room.CoroutinesRoom$Companion$execute$2", mo15594f = "CoroutinesRoom.kt", mo15595l = {}, mo15596m = "invokeSuspend")
        /* renamed from: androidx.room.a$a$a */
        static final class C0684a extends C5898l implements C5922p<C6089g0, C5866d<? super R>, Object> {

            /* renamed from: j */
            private C6089g0 f2739j;

            /* renamed from: k */
            int f2740k;

            /* renamed from: l */
            final /* synthetic */ Callable f2741l;

            C0684a(Callable callable, C5866d dVar) {
                this.f2741l = callable;
                super(2, dVar);
            }

            /* renamed from: a */
            public final Object mo4016a(Object obj) {
                C5879b.m22239a();
                if (this.f2740k == 0) {
                    C5806n.m22054a(obj);
                    return this.f2741l.call();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: a */
            public final C5866d<C5812t> mo4017a(Object obj, C5866d<?> dVar) {
                C5942k.m22327b(dVar, "completion");
                C0684a aVar = new C0684a(this.f2741l, dVar);
                aVar.f2739j = (C6089g0) obj;
                return aVar;
            }

            /* renamed from: c */
            public final Object mo4018c(Object obj, Object obj2) {
                return ((C0684a) mo4017a(obj, (C5866d) obj2)).mo4016a(C5812t.f14872a);
            }
        }

        private C0683a() {
        }

        public /* synthetic */ C0683a(C5938g gVar) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
            if (r0 != null) goto L_0x0032;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <R> java.lang.Object mo4015a(androidx.room.C0711l r3, boolean r4, java.util.concurrent.Callable<R> r5, p308k.p316w.C5866d<? super R> r6) {
            /*
                r2 = this;
                boolean r0 = r3.mo4080n()
                if (r0 == 0) goto L_0x0011
                boolean r0 = r3.mo4079m()
                if (r0 == 0) goto L_0x0011
                java.lang.Object r3 = r5.call()
                return r3
            L_0x0011:
                k.w.g r0 = r6.mo15390b()
                androidx.room.u$a r1 = androidx.room.C0737u.f2903i
                k.w.g$b r0 = r0.get(r1)
                androidx.room.u r0 = (androidx.room.C0737u) r0
                if (r0 == 0) goto L_0x0026
                k.w.e r0 = r0.mo4131c()
                if (r0 == 0) goto L_0x0026
                goto L_0x0032
            L_0x0026:
                if (r4 == 0) goto L_0x002d
                kotlinx.coroutines.b0 r3 = androidx.room.C0685b.m3901b(r3)
                goto L_0x0031
            L_0x002d:
                kotlinx.coroutines.b0 r3 = androidx.room.C0685b.m3900a(r3)
            L_0x0031:
                r0 = r3
            L_0x0032:
                androidx.room.a$a$a r3 = new androidx.room.a$a$a
                r4 = 0
                r3.<init>(r5, r4)
                java.lang.Object r3 = kotlinx.coroutines.C6066e.m22822a(r0, r3, r6)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.C0682a.C0683a.mo4015a(androidx.room.l, boolean, java.util.concurrent.Callable, k.w.d):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final <R> Object m3895a(C0711l lVar, boolean z, Callable<R> callable, C5866d<? super R> dVar) {
        return f2738a.mo4015a(lVar, z, callable, dVar);
    }
}
