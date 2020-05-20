package kotlinx.coroutines.p328b3;

import androidx.recyclerview.widget.RecyclerView;
import kotlinx.coroutines.p327a3.C5981f;
import p308k.p316w.C5866d;
import p308k.p316w.p318j.p319a.C5889d;
import p308k.p316w.p318j.p319a.C5891f;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.b3.d */
final /* synthetic */ class C6023d {

    /* renamed from: kotlinx.coroutines.b3.d$a */
    public static final class C6024a implements C6020a<T> {

        /* renamed from: a */
        final /* synthetic */ C5981f f15035a;

        public C6024a(C5981f fVar) {
            this.f15035a = fVar;
        }

        /* renamed from: a */
        public Object mo15758a(C6021b bVar, C5866d dVar) {
            return C6022c.m22670a(bVar, this.f15035a.mo15697d(), dVar);
        }
    }

    @C5891f(mo15593c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", mo15594f = "Channels.kt", mo15595l = {45, 56}, mo15596m = "emitAll")
    /* renamed from: kotlinx.coroutines.b3.d$b */
    static final class C6025b extends C5889d {

        /* renamed from: i */
        /* synthetic */ Object f15036i;

        /* renamed from: j */
        int f15037j;

        /* renamed from: k */
        Object f15038k;

        /* renamed from: l */
        Object f15039l;

        /* renamed from: m */
        Object f15040m;

        /* renamed from: n */
        Object f15041n;

        C6025b(C5866d dVar) {
            super(dVar);
        }

        /* renamed from: a */
        public final Object mo4016a(Object obj) {
            this.f15036i = obj;
            this.f15037j |= RecyclerView.UNDEFINED_DURATION;
            return C6022c.m22670a(null, null, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a1, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a2, code lost:
        kotlinx.coroutines.p327a3.C5987k.m22509a(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a5, code lost:
        throw r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e A[Catch:{ all -> 0x00a1 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f A[Catch:{ all -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b A[SYNTHETIC, Splitter:B:32:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008c A[Catch:{ all -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m22673a(kotlinx.coroutines.p328b3.C6021b<? super T> r7, kotlinx.coroutines.p327a3.C6003w<? extends T> r8, p308k.p316w.C5866d<? super p308k.C5812t> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.p328b3.C6023d.C6025b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.b3.d$b r0 = (kotlinx.coroutines.p328b3.C6023d.C6025b) r0
            int r1 = r0.f15037j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f15037j = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.b3.d$b r0 = new kotlinx.coroutines.b3.d$b
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f15036i
            java.lang.Object r1 = p308k.p316w.p317i.C5885d.m22250a()
            int r2 = r0.f15037j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x005a
            if (r2 == r4) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            java.lang.Object r7 = r0.f15041n
            java.lang.Object r7 = r0.f15040m
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            java.lang.Object r8 = r0.f15039l
            kotlinx.coroutines.a3.w r8 = (kotlinx.coroutines.p327a3.C6003w) r8
            java.lang.Object r2 = r0.f15038k
            kotlinx.coroutines.b3.b r2 = (kotlinx.coroutines.p328b3.C6021b) r2
            p308k.C5806n.m22054a(r9)     // Catch:{ all -> 0x0058 }
        L_0x0039:
            r9 = r7
            r7 = r2
            goto L_0x005e
        L_0x003c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0044:
            java.lang.Object r7 = r0.f15041n
            kotlinx.coroutines.b3.b r7 = (kotlinx.coroutines.p328b3.C6021b) r7
            java.lang.Object r7 = r0.f15040m
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            java.lang.Object r8 = r0.f15039l
            kotlinx.coroutines.a3.w r8 = (kotlinx.coroutines.p327a3.C6003w) r8
            java.lang.Object r2 = r0.f15038k
            kotlinx.coroutines.b3.b r2 = (kotlinx.coroutines.p328b3.C6021b) r2
            p308k.C5806n.m22054a(r9)     // Catch:{ all -> 0x0058 }
            goto L_0x0073
        L_0x0058:
            r7 = move-exception
            goto L_0x00a0
        L_0x005a:
            p308k.C5806n.m22054a(r9)
            r9 = 0
        L_0x005e:
            r0.f15038k = r7     // Catch:{ all -> 0x0058 }
            r0.f15039l = r8     // Catch:{ all -> 0x0058 }
            r0.f15040m = r9     // Catch:{ all -> 0x0058 }
            r0.f15041n = r7     // Catch:{ all -> 0x0058 }
            r0.f15037j = r4     // Catch:{ all -> 0x0058 }
            java.lang.Object r2 = r8.mo15646c(r0)     // Catch:{ all -> 0x0058 }
            if (r2 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r6 = r2
            r2 = r7
            r7 = r9
            r9 = r6
        L_0x0073:
            kotlinx.coroutines.a3.c0 r9 = (kotlinx.coroutines.p327a3.C5975c0) r9     // Catch:{ all -> 0x0058 }
            java.lang.Object r9 = r9.mo15690a()     // Catch:{ all -> 0x0058 }
            boolean r5 = kotlinx.coroutines.p327a3.C5975c0.m22459f(r9)     // Catch:{ all -> 0x0058 }
            if (r5 == 0) goto L_0x008c
            java.lang.Throwable r9 = kotlinx.coroutines.p327a3.C5975c0.m22456c(r9)     // Catch:{ all -> 0x0058 }
            if (r9 != 0) goto L_0x008b
            kotlinx.coroutines.p327a3.C5987k.m22509a(r8, r7)
            k.t r7 = p308k.C5812t.f14872a
            return r7
        L_0x008b:
            throw r9     // Catch:{ all -> 0x0058 }
        L_0x008c:
            kotlinx.coroutines.p327a3.C5975c0.m22457d(r9)     // Catch:{ all -> 0x0058 }
            r0.f15038k = r2     // Catch:{ all -> 0x0058 }
            r0.f15039l = r8     // Catch:{ all -> 0x0058 }
            r0.f15040m = r7     // Catch:{ all -> 0x0058 }
            r0.f15041n = r9     // Catch:{ all -> 0x0058 }
            r0.f15037j = r3     // Catch:{ all -> 0x0058 }
            java.lang.Object r9 = r2.mo15106a(r9, r0)     // Catch:{ all -> 0x0058 }
            if (r9 != r1) goto L_0x0039
            return r1
        L_0x00a0:
            throw r7     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r9 = move-exception
            kotlinx.coroutines.p327a3.C5987k.m22509a(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p328b3.C6023d.m22673a(kotlinx.coroutines.b3.b, kotlinx.coroutines.a3.w, k.w.d):java.lang.Object");
    }

    /* renamed from: a */
    public static final <T> C6020a<T> m22674a(C5981f<T> fVar) {
        C5942k.m22327b(fVar, "$this$asFlow");
        return new C6024a(fVar);
    }
}
