package kotlinx.coroutines;

import kotlinx.coroutines.internal.C6138u;
import kotlinx.coroutines.internal.C6143z;
import p308k.C5803m;
import p308k.C5803m.C5804a;
import p308k.C5806n;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.m2 */
public final class C6163m2 {
    /* renamed from: a */
    public static final <T> void m23161a(C5866d<? super T> dVar, T t, int i) {
        C5942k.m22327b(dVar, "$this$resumeMode");
        if (i == 0) {
            C5804a aVar = C5803m.f14866f;
            C5803m.m22049a(t);
            dVar.mo15391b(t);
        } else if (i == 1) {
            C6204v0.m23255a(dVar, t);
        } else if (i == 2) {
            C6204v0.m23260b(dVar, t);
        } else if (i == 3) {
            C6194t0 t0Var = (C6194t0) dVar;
            C5871g b = t0Var.mo15390b();
            Object b2 = C6143z.m23097b(b, t0Var.f15303k);
            try {
                C5866d<T> dVar2 = t0Var.f15305m;
                C5804a aVar2 = C5803m.f14866f;
                C5803m.m22049a(t);
                dVar2.mo15391b(t);
                C5812t tVar = C5812t.f14872a;
            } finally {
                C6143z.m23096a(b, b2);
            }
        } else if (i != 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid mode ");
            sb.append(i);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    /* renamed from: a */
    public static final <T> void m23162a(C5866d<? super T> dVar, Throwable th, int i) {
        C5942k.m22327b(dVar, "$this$resumeUninterceptedWithExceptionMode");
        C5942k.m22327b(th, "exception");
        if (i == 0) {
            dVar = C5880c.m22243a(dVar);
        } else if (i == 1) {
            C6204v0.m23256a(C5880c.m22243a(dVar), th);
            return;
        } else if (i != 2) {
            if (i == 3) {
                C5871g b = dVar.mo15390b();
                Object b2 = C6143z.m23097b(b, null);
                try {
                    C5804a aVar = C5803m.f14866f;
                    Object a = C5806n.m22053a(th);
                    C5803m.m22049a(a);
                    dVar.mo15391b(a);
                    C5812t tVar = C5812t.f14872a;
                    return;
                } finally {
                    C6143z.m23096a(b, b2);
                }
            } else if (i != 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid mode ");
                sb.append(i);
                throw new IllegalStateException(sb.toString().toString());
            } else {
                return;
            }
        }
        C5804a aVar2 = C5803m.f14866f;
        Object a2 = C5806n.m22053a(th);
        C5803m.m22049a(a2);
        dVar.mo15391b(a2);
    }

    /* renamed from: a */
    public static final boolean m23163a(int i) {
        return i == 1;
    }

    /* renamed from: b */
    public static final <T> void m23164b(C5866d<? super T> dVar, T t, int i) {
        C5942k.m22327b(dVar, "$this$resumeUninterceptedMode");
        if (i == 0) {
            dVar = C5880c.m22243a(dVar);
        } else if (i == 1) {
            C6204v0.m23255a(C5880c.m22243a(dVar), t);
            return;
        } else if (i != 2) {
            if (i == 3) {
                C5871g b = dVar.mo15390b();
                Object b2 = C6143z.m23097b(b, null);
                try {
                    C5804a aVar = C5803m.f14866f;
                    C5803m.m22049a(t);
                    dVar.mo15391b(t);
                    C5812t tVar = C5812t.f14872a;
                    return;
                } finally {
                    C6143z.m23096a(b, b2);
                }
            } else if (i != 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid mode ");
                sb.append(i);
                throw new IllegalStateException(sb.toString().toString());
            } else {
                return;
            }
        }
        C5804a aVar2 = C5803m.f14866f;
        C5803m.m22049a(t);
        dVar.mo15391b(t);
    }

    /* renamed from: b */
    public static final <T> void m23165b(C5866d<? super T> dVar, Throwable th, int i) {
        C5942k.m22327b(dVar, "$this$resumeWithExceptionMode");
        C5942k.m22327b(th, "exception");
        if (i == 0) {
            C5804a aVar = C5803m.f14866f;
            Object a = C5806n.m22053a(th);
            C5803m.m22049a(a);
            dVar.mo15391b(a);
        } else if (i == 1) {
            C6204v0.m23256a(dVar, th);
        } else if (i == 2) {
            C6204v0.m23261b(dVar, th);
        } else if (i == 3) {
            C6194t0 t0Var = (C6194t0) dVar;
            C5871g b = t0Var.mo15390b();
            Object b2 = C6143z.m23097b(b, t0Var.f15303k);
            try {
                C5866d<T> dVar2 = t0Var.f15305m;
                C5804a aVar2 = C5803m.f14866f;
                Object a2 = C5806n.m22053a(C6138u.m23070a(th, dVar2));
                C5803m.m22049a(a2);
                dVar2.mo15391b(a2);
                C5812t tVar = C5812t.f14872a;
            } finally {
                C6143z.m23096a(b, b2);
            }
        } else if (i != 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid mode ");
            sb.append(i);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    /* renamed from: b */
    public static final boolean m23166b(int i) {
        return i == 0 || i == 1;
    }
}
