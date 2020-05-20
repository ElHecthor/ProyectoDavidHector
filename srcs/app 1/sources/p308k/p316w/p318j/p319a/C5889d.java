package p308k.p316w.p318j.p319a;

import p308k.p316w.C5866d;
import p308k.p316w.C5867e;
import p308k.p316w.C5871g;
import p308k.p316w.C5871g.C5874b;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.w.j.a.d */
public abstract class C5889d extends C5886a {

    /* renamed from: g */
    private transient C5866d<Object> f14916g;

    /* renamed from: h */
    private final C5871g f14917h;

    public C5889d(C5866d<Object> dVar) {
        this(dVar, dVar != null ? dVar.mo15390b() : null);
    }

    public C5889d(C5866d<Object> dVar, C5871g gVar) {
        super(dVar);
        this.f14917h = gVar;
    }

    /* renamed from: b */
    public C5871g mo15390b() {
        C5871g gVar = this.f14917h;
        if (gVar != null) {
            return gVar;
        }
        C5942k.m22323a();
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo15587c() {
        C5866d<Object> dVar = this.f14916g;
        if (!(dVar == null || dVar == this)) {
            C5874b bVar = mo15390b().get(C5867e.f14898b);
            if (bVar != null) {
                ((C5867e) bVar).mo15580a(dVar);
            } else {
                C5942k.m22323a();
                throw null;
            }
        }
        this.f14916g = C5888c.f14915f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r0 != 0) goto L_0x001b;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p308k.p316w.C5866d<java.lang.Object> mo15592f() {
        /*
            r2 = this;
            k.w.d<java.lang.Object> r0 = r2.f14916g
            if (r0 == 0) goto L_0x0005
            goto L_0x001d
        L_0x0005:
            k.w.g r0 = r2.mo15390b()
            k.w.e$b r1 = p308k.p316w.C5867e.f14898b
            k.w.g$b r0 = r0.get(r1)
            k.w.e r0 = (p308k.p316w.C5867e) r0
            if (r0 == 0) goto L_0x001a
            k.w.d r0 = r0.mo15581b(r2)
            if (r0 == 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r0 = r2
        L_0x001b:
            r2.f14916g = r0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p308k.p316w.p318j.p319a.C5889d.mo15592f():k.w.d");
    }
}
