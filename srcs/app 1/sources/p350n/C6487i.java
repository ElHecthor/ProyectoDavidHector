package p350n;

import p308k.p323z.p325d.C5942k;

/* renamed from: n.i */
public abstract class C6487i implements C6504w {

    /* renamed from: f */
    private final C6504w f16102f;

    public C6487i(C6504w wVar) {
        C5942k.m22327b(wVar, "delegate");
        this.f16102f = wVar;
    }

    /* renamed from: a */
    public void mo16159a(C6480e eVar, long j) {
        C5942k.m22327b(eVar, "source");
        this.f16102f.mo16159a(eVar, j);
    }

    /* renamed from: b */
    public C6507z mo16272b() {
        return this.f16102f.mo16272b();
    }

    public void close() {
        this.f16102f.close();
    }

    public void flush() {
        this.f16102f.flush();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        sb.append(this.f16102f);
        sb.append(')');
        return sb.toString();
    }
}
