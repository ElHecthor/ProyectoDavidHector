package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.C6138u;
import kotlinx.coroutines.internal.C6139v;
import kotlinx.coroutines.internal.C6143z;
import p308k.C5803m;
import p308k.C5803m.C5804a;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.v0 */
public final class C6204v0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C6139v f15315a = new C6139v("UNDEFINED");

    /* renamed from: a */
    public static final <T> void m23255a(C5866d<? super T> dVar, T t) {
        boolean z;
        C5871g b;
        Object b2;
        C5942k.m22327b(dVar, "$this$resumeCancellable");
        if (dVar instanceof C6194t0) {
            C6194t0 t0Var = (C6194t0) dVar;
            if (t0Var.f15304l.mo15712b(t0Var.mo15390b())) {
                t0Var.f15301i = t;
                t0Var.f15319h = 1;
                t0Var.f15304l.mo15711a(t0Var.mo15390b(), t0Var);
                return;
            }
            C6046d1 b3 = C6202u2.f15311b.mo15969b();
            if (b3.mo15767p()) {
                t0Var.f15301i = t;
                t0Var.f15319h = 1;
                b3.mo15763a((C6208w0<?>) t0Var);
                return;
            }
            b3.mo15765b(true);
            try {
                C6199u1 u1Var = (C6199u1) t0Var.mo15390b().get(C6199u1.f15308d);
                if (u1Var == null || u1Var.mo15630a()) {
                    z = false;
                } else {
                    CancellationException l = u1Var.mo15742l();
                    C5804a aVar = C5803m.f14866f;
                    Object a = C5806n.m22053a((Throwable) l);
                    C5803m.m22049a(a);
                    t0Var.mo15391b(a);
                    z = true;
                }
                if (!z) {
                    b = t0Var.mo15390b();
                    b2 = C6143z.m23097b(b, t0Var.f15303k);
                    C5866d<T> dVar2 = t0Var.f15305m;
                    C5804a aVar2 = C5803m.f14866f;
                    C5803m.m22049a(t);
                    dVar2.mo15391b(t);
                    C5812t tVar = C5812t.f14872a;
                    C6143z.m23096a(b, b2);
                }
                do {
                } while (b3.mo15771t());
            } catch (Throwable th) {
                try {
                    t0Var.mo15987a(th, (Throwable) null);
                } catch (Throwable th2) {
                    b3.mo15764a(true);
                    throw th2;
                }
            }
            b3.mo15764a(true);
            return;
        }
        C5804a aVar3 = C5803m.f14866f;
        C5803m.m22049a(t);
        dVar.mo15391b(t);
    }

    /* renamed from: a */
    public static final <T> void m23256a(C5866d<? super T> dVar, Throwable th) {
        C5871g b;
        Object b2;
        C5942k.m22327b(dVar, "$this$resumeCancellableWithException");
        C5942k.m22327b(th, "exception");
        if (dVar instanceof C6194t0) {
            C6194t0 t0Var = (C6194t0) dVar;
            C5871g b3 = t0Var.f15305m.mo15390b();
            boolean z = false;
            C6193t tVar = new C6193t(th, false, 2, null);
            if (t0Var.f15304l.mo15712b(b3)) {
                t0Var.f15301i = new C6193t(th, false, 2, null);
                t0Var.f15319h = 1;
                t0Var.f15304l.mo15711a(b3, t0Var);
                return;
            }
            C6046d1 b4 = C6202u2.f15311b.mo15969b();
            if (b4.mo15767p()) {
                t0Var.f15301i = tVar;
                t0Var.f15319h = 1;
                b4.mo15763a((C6208w0<?>) t0Var);
                return;
            }
            b4.mo15765b(true);
            try {
                C6199u1 u1Var = (C6199u1) t0Var.mo15390b().get(C6199u1.f15308d);
                if (u1Var != null && !u1Var.mo15630a()) {
                    CancellationException l = u1Var.mo15742l();
                    C5804a aVar = C5803m.f14866f;
                    Object a = C5806n.m22053a((Throwable) l);
                    C5803m.m22049a(a);
                    t0Var.mo15391b(a);
                    z = true;
                }
                if (!z) {
                    b = t0Var.mo15390b();
                    b2 = C6143z.m23097b(b, t0Var.f15303k);
                    C5866d<T> dVar2 = t0Var.f15305m;
                    C5804a aVar2 = C5803m.f14866f;
                    Object a2 = C5806n.m22053a(C6138u.m23070a(th, dVar2));
                    C5803m.m22049a(a2);
                    dVar2.mo15391b(a2);
                    C5812t tVar2 = C5812t.f14872a;
                    C6143z.m23096a(b, b2);
                }
                do {
                } while (b4.mo15771t());
            } catch (Throwable th2) {
                try {
                    t0Var.mo15987a(th2, (Throwable) null);
                } catch (Throwable th3) {
                    b4.mo15764a(true);
                    throw th3;
                }
            }
            b4.mo15764a(true);
            return;
        }
        C5804a aVar3 = C5803m.f14866f;
        Object a3 = C5806n.m22053a(C6138u.m23070a(th, dVar));
        C5803m.m22049a(a3);
        dVar.mo15391b(a3);
    }

    /* renamed from: a */
    private static final void m23257a(C6208w0<?> w0Var) {
        C6046d1 b = C6202u2.f15311b.mo15969b();
        if (b.mo15767p()) {
            b.mo15763a(w0Var);
            return;
        }
        b.mo15765b(true);
        try {
            m23259a(w0Var, w0Var.mo15942c(), 3);
            do {
            } while (b.mo15771t());
        } catch (Throwable th) {
            b.mo15764a(true);
            throw th;
        }
        b.mo15764a(true);
    }

    /* renamed from: a */
    public static final <T> void m23258a(C6208w0<? super T> w0Var, int i) {
        C5942k.m22327b(w0Var, "$this$dispatch");
        C5866d c = w0Var.mo15942c();
        if (!C6163m2.m23166b(i) || !(c instanceof C6194t0) || C6163m2.m23163a(i) != C6163m2.m23163a(w0Var.f15319h)) {
            m23259a(w0Var, c, i);
            return;
        }
        C6012b0 b0Var = ((C6194t0) c).f15304l;
        C5871g b = c.mo15390b();
        if (b0Var.mo15712b(b)) {
            b0Var.mo15711a(b, w0Var);
        } else {
            m23257a(w0Var);
        }
    }

    /* renamed from: a */
    public static final <T> void m23259a(C6208w0<? super T> w0Var, C5866d<? super T> dVar, int i) {
        C5942k.m22327b(w0Var, "$this$resume");
        C5942k.m22327b(dVar, "delegate");
        Object d = w0Var.mo15943d();
        Throwable a = w0Var.mo15986a(d);
        if (a != null) {
            if (!(dVar instanceof C6208w0)) {
                a = C6138u.m23070a(a, dVar);
            }
            C6163m2.m23165b(dVar, a, i);
            return;
        }
        C6163m2.m23161a(dVar, w0Var.mo15941c(d), i);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=k.w.d<? super T>, code=k.w.d, for r1v0, types: [k.w.d, java.lang.Object, k.w.d<? super T>] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m23260b(p308k.p316w.C5866d r1, T r2) {
        /*
            java.lang.String r0 = "$this$resumeDirect"
            p308k.p323z.p325d.C5942k.m22327b(r1, r0)
            boolean r0 = r1 instanceof kotlinx.coroutines.C6194t0
            if (r0 == 0) goto L_0x000d
            kotlinx.coroutines.t0 r1 = (kotlinx.coroutines.C6194t0) r1
            k.w.d<T> r1 = r1.f15305m
        L_0x000d:
            k.m$a r0 = p308k.C5803m.f14866f
            p308k.C5803m.m22049a(r2)
            r1.mo15391b(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6204v0.m23260b(k.w.d, java.lang.Object):void");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=k.w.d<? super T>, code=k.w.d, for r1v0, types: [k.w.d, java.lang.Object, k.w.d<? super T>] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m23261b(p308k.p316w.C5866d r1, java.lang.Throwable r2) {
        /*
            java.lang.String r0 = "$this$resumeDirectWithException"
            p308k.p323z.p325d.C5942k.m22327b(r1, r0)
            java.lang.String r0 = "exception"
            p308k.p323z.p325d.C5942k.m22327b(r2, r0)
            boolean r0 = r1 instanceof kotlinx.coroutines.C6194t0
            if (r0 == 0) goto L_0x0012
            kotlinx.coroutines.t0 r1 = (kotlinx.coroutines.C6194t0) r1
            k.w.d<T> r1 = r1.f15305m
        L_0x0012:
            k.m$a r0 = p308k.C5803m.f14866f
            java.lang.Throwable r2 = kotlinx.coroutines.internal.C6138u.m23070a(r2, r1)
            java.lang.Object r2 = p308k.C5806n.m22053a(r2)
            p308k.C5803m.m22049a(r2)
            r1.mo15391b(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6204v0.m23261b(k.w.d, java.lang.Throwable):void");
    }
}
