package kotlinx.coroutines.p327a3;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C5957a;
import kotlinx.coroutines.p332e3.C6080c;
import p308k.C5812t;
import p308k.p316w.C5866d;
import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.a3.i */
public class C5985i<E> extends C5957a<C5812t> implements C5983h<E> {

    /* renamed from: i */
    private final C5983h<E> f14998i;

    public C5985i(C5871g gVar, C5983h<E> hVar, boolean z) {
        C5942k.m22327b(gVar, "parentContext");
        C5942k.m22327b(hVar, "_channel");
        super(gVar, z);
        this.f14998i = hVar;
    }

    /* renamed from: a */
    public Object mo15670a(E e, C5866d<? super C5812t> dVar) {
        return this.f14998i.mo15670a(e, dVar);
    }

    /* renamed from: a */
    public final void mo15644a(CancellationException cancellationException) {
        mo15700d(cancellationException);
    }

    /* renamed from: a */
    public boolean mo15671a(Throwable th) {
        return this.f14998i.mo15671a(th);
    }

    /* renamed from: c */
    public Object mo15646c(C5866d<? super C5975c0<? extends E>> dVar) {
        return this.f14998i.mo15646c(dVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r5 != null) goto L_0x0025;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo15700d(java.lang.Throwable r5) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x000b
            java.util.concurrent.CancellationException r5 = kotlinx.coroutines.C6014b2.m22588a(r4, r5, r1, r0, r1)
            if (r5 == 0) goto L_0x000b
            goto L_0x0025
        L_0x000b:
            kotlinx.coroutines.v1 r5 = new kotlinx.coroutines.v1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = kotlinx.coroutines.C6161m0.m23157a(r4)
            r2.append(r3)
            java.lang.String r3 = " was cancelled"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r5.<init>(r2, r1, r4)
        L_0x0025:
            kotlinx.coroutines.a3.h<E> r1 = r4.f14998i
            r1.mo15644a(r5)
            r4.mo15730c(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p327a3.C5985i.mo15700d(java.lang.Throwable):boolean");
    }

    /* renamed from: g */
    public C6080c<E> mo15647g() {
        return this.f14998i.mo15647g();
    }

    public boolean offer(E e) {
        return this.f14998i.offer(e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final C5983h<E> mo15701v() {
        return this.f14998i;
    }
}
