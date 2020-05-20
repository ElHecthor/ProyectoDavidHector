package p350n;

import p308k.p323z.p325d.C5942k;

/* renamed from: n.j */
public abstract class C6488j implements C6506y {

    /* renamed from: f */
    private final C6506y f16103f;

    public C6488j(C6506y yVar) {
        C5942k.m22327b(yVar, "delegate");
        this.f16103f = yVar;
    }

    /* renamed from: a */
    public final C6506y mo16877a() {
        return this.f16103f;
    }

    /* renamed from: b */
    public long mo16163b(C6480e eVar, long j) {
        C5942k.m22327b(eVar, "sink");
        return this.f16103f.mo16163b(eVar, j);
    }

    /* renamed from: b */
    public C6507z mo16270b() {
        return this.f16103f.mo16270b();
    }

    public void close() {
        this.f16103f.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        sb.append(this.f16103f);
        sb.append(')');
        return sb.toString();
    }
}
