package p350n;

import java.io.OutputStream;
import p308k.p323z.p325d.C5942k;

/* renamed from: n.q */
final class C6496q implements C6504w {

    /* renamed from: f */
    private final OutputStream f16119f;

    /* renamed from: g */
    private final C6507z f16120g;

    public C6496q(OutputStream outputStream, C6507z zVar) {
        C5942k.m22327b(outputStream, "out");
        C5942k.m22327b(zVar, "timeout");
        this.f16119f = outputStream;
        this.f16120g = zVar;
    }

    /* renamed from: a */
    public void mo16159a(C6480e eVar, long j) {
        C5942k.m22327b(eVar, "source");
        C6474c.m24474a(eVar.mo16834x(), 0, j);
        while (j > 0) {
            this.f16120g.mo16886e();
            C6500t tVar = eVar.f16093f;
            if (tVar != null) {
                int min = (int) Math.min(j, (long) (tVar.f16130c - tVar.f16129b));
                this.f16119f.write(tVar.f16128a, tVar.f16129b, min);
                tVar.f16129b += min;
                long j2 = (long) min;
                j -= j2;
                eVar.mo16808j(eVar.mo16834x() - j2);
                if (tVar.f16129b == tVar.f16130c) {
                    eVar.f16093f = tVar.mo16918b();
                    C6502u.f16137c.mo16921a(tVar);
                }
            } else {
                C5942k.m22323a();
                throw null;
            }
        }
    }

    /* renamed from: b */
    public C6507z mo16272b() {
        return this.f16120g;
    }

    public void close() {
        this.f16119f.close();
    }

    public void flush() {
        this.f16119f.flush();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("sink(");
        sb.append(this.f16119f);
        sb.append(')');
        return sb.toString();
    }
}
