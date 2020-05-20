package p255io.stashteam.stashapp.p269e.p275b.p276a;

import androidx.recyclerview.widget.RecyclerView;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;

/* renamed from: io.stashteam.stashapp.e.b.a.a */
public interface C5257a<F, T> {

    /* renamed from: io.stashteam.stashapp.e.b.a.a$a */
    public static final class C5258a {

        @C5891f(mo15593c = "io.stashteam.stashapp.domain.mapper.base.Mapper$DefaultImpls", mo15594f = "Mapper.kt", mo15595l = {8}, mo15596m = "map")
        /* renamed from: io.stashteam.stashapp.e.b.a.a$a$a */
        static final class C5259a extends C5889d {

            /* renamed from: i */
            /* synthetic */ Object f13757i;

            /* renamed from: j */
            int f13758j;

            /* renamed from: k */
            final /* synthetic */ C5257a f13759k;

            /* renamed from: l */
            Object f13760l;

            /* renamed from: m */
            Object f13761m;

            /* renamed from: n */
            Object f13762n;

            /* renamed from: o */
            Object f13763o;

            /* renamed from: p */
            int f13764p;

            /* renamed from: q */
            int f13765q;

            /* renamed from: r */
            int f13766r;

            C5259a(C5257a aVar, C5866d dVar) {
                this.f13759k = aVar;
                super(dVar);
            }

            /* renamed from: a */
            public final Object mo4016a(Object obj) {
                this.f13757i = obj;
                this.f13758j |= RecyclerView.UNDEFINED_DURATION;
                return C5258a.m20632a(null, null, this);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static <F, T> java.lang.Object m20632a(p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a<F, T> r8, java.util.List<? extends F> r9, p308k.p316w.C5866d<? super java.util.List<? extends T>> r10) {
            /*
                boolean r0 = r10 instanceof p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a.C5258a.C5259a
                if (r0 == 0) goto L_0x0013
                r0 = r10
                io.stashteam.stashapp.e.b.a.a$a$a r0 = (p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a.C5258a.C5259a) r0
                int r1 = r0.f13758j
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f13758j = r1
                goto L_0x0018
            L_0x0013:
                io.stashteam.stashapp.e.b.a.a$a$a r0 = new io.stashteam.stashapp.e.b.a.a$a$a
                r0.<init>(r8, r10)
            L_0x0018:
                java.lang.Object r10 = r0.f13757i
                java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
                int r2 = r0.f13758j
                r3 = 1
                if (r2 == 0) goto L_0x004c
                if (r2 != r3) goto L_0x0044
                java.lang.Object r8 = r0.f13763o
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                int r9 = r0.f13766r
                int r9 = r0.f13765q
                int r2 = r0.f13764p
                java.lang.Object r4 = r0.f13762n
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                java.lang.Object r5 = r0.f13761m
                java.util.List r5 = (java.util.List) r5
                java.lang.Object r6 = r0.f13760l
                io.stashteam.stashapp.e.b.a.a r6 = (p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a) r6
                p308k.C5806n.m22054a(r10)
                r7 = r0
                r0 = r9
                r9 = r6
                r6 = r1
                r1 = r7
                goto L_0x008b
            L_0x0044:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x004c:
                p308k.C5806n.m22054a(r10)
                int r10 = r9.size()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r10)
                r4 = 0
                r7 = r9
                r9 = r8
                r8 = r2
                r2 = r1
                r1 = r0
                r0 = r7
            L_0x005f:
                if (r4 >= r10) goto L_0x0097
                java.lang.Integer r5 = p308k.p316w.p318j.p319a.C5887b.m22260a(r4)
                int r5 = r5.intValue()
                java.lang.Object r6 = r0.get(r5)
                r1.f13760l = r9
                r1.f13761m = r0
                r1.f13762n = r8
                r1.f13764p = r4
                r1.f13765q = r10
                r1.f13766r = r5
                r1.f13763o = r8
                r1.f13758j = r3
                java.lang.Object r5 = r9.mo14344a(r6, r1)
                if (r5 != r2) goto L_0x0084
                return r2
            L_0x0084:
                r6 = r2
                r2 = r4
                r4 = r8
                r7 = r0
                r0 = r10
                r10 = r5
                r5 = r7
            L_0x008b:
                r8.add(r10)
                int r8 = r2 + 1
                r10 = r0
                r0 = r5
                r2 = r6
                r7 = r4
                r4 = r8
                r8 = r7
                goto L_0x005f
            L_0x0097:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p269e.p275b.p276a.C5257a.C5258a.m20632a(io.stashteam.stashapp.e.b.a.a, java.util.List, k.w.d):java.lang.Object");
        }
    }

    /* renamed from: a */
    Object mo14344a(F f, C5866d<? super T> dVar);
}
