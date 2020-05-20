package kotlinx.coroutines.p327a3;

import kotlinx.coroutines.internal.C6120i;
import kotlinx.coroutines.internal.C6122k;
import kotlinx.coroutines.p327a3.C5972c.C5973a;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.a3.q */
public class C5997q<E> extends C5961a<E> {
    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlinx.coroutines.a3.c$a<? extends E>, code=kotlinx.coroutines.internal.k, for r2v0, types: [kotlinx.coroutines.a3.c$a<? extends E>, kotlinx.coroutines.internal.k] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m22534a(kotlinx.coroutines.internal.C6122k r2) {
        /*
            r1 = this;
        L_0x0000:
            kotlinx.coroutines.internal.k r2 = r2.mo15900o()
            boolean r0 = r2 instanceof kotlinx.coroutines.p327a3.C5972c.C5973a
            if (r0 == 0) goto L_0x0012
            boolean r0 = r2.mo15892s()
            if (r0 != 0) goto L_0x0000
            r2.mo15902q()
            goto L_0x0000
        L_0x0012:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p327a3.C5997q.m22534a(kotlinx.coroutines.a3.c$a):void");
    }

    /* renamed from: c */
    private final C6004x<?> m22535c(E e) {
        C6122k kVar;
        C5973a aVar = new C5973a(e);
        C6120i e2 = mo15684e();
        do {
            Object n = e2.mo15899n();
            if (n != null) {
                kVar = (C6122k) n;
                if (kVar instanceof C6004x) {
                    return (C6004x) kVar;
                }
            } else {
                throw new C5809q("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!kVar.mo15895a((C6122k) aVar, (C6122k) e2));
        m22534a(aVar);
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo15677a(E e) {
        C6004x c;
        do {
            Object a = super.mo15677a(e);
            Object obj = C5970b.f14968a;
            if (a == obj) {
                return obj;
            }
            if (a == C5970b.f14969b) {
                c = m22535c(e);
                if (c == null) {
                    return C5970b.f14968a;
                }
            } else if (a instanceof C5989m) {
                return a;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid offerInternal result ");
                sb.append(a);
                throw new IllegalStateException(sb.toString().toString());
            }
        } while (!(c instanceof C5989m));
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15679a(C6122k kVar) {
        C5942k.m22327b(kVar, "closed");
        C6122k o = kVar.mo15900o();
        if (!(o instanceof C5973a)) {
            o = null;
        }
        C5973a aVar = (C5973a) o;
        if (aVar != null) {
            m22534a(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo15685f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo15686h() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo15651m() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo15652n() {
        return true;
    }
}
