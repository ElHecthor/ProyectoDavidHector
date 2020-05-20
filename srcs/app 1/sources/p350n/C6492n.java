package p350n;

import java.io.IOException;
import java.io.InputStream;
import p308k.p323z.p325d.C5942k;

/* renamed from: n.n */
final class C6492n implements C6506y {

    /* renamed from: f */
    private final InputStream f16114f;

    /* renamed from: g */
    private final C6507z f16115g;

    public C6492n(InputStream inputStream, C6507z zVar) {
        C5942k.m22327b(inputStream, "input");
        C5942k.m22327b(zVar, "timeout");
        this.f16114f = inputStream;
        this.f16115g = zVar;
    }

    /* renamed from: b */
    public long mo16163b(C6480e eVar, long j) {
        C5942k.m22327b(eVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i >= 0) {
            try {
                this.f16115g.mo16886e();
                C6500t b = eVar.mo16791b(1);
                int read = this.f16114f.read(b.f16128a, b.f16130c, (int) Math.min(j, (long) (8192 - b.f16130c)));
                if (read == -1) {
                    if (b.f16129b == b.f16130c) {
                        eVar.f16093f = b.mo16918b();
                        C6502u.f16137c.mo16921a(b);
                    }
                    return -1;
                }
                b.f16130c += read;
                long j2 = (long) read;
                eVar.mo16808j(eVar.mo16834x() + j2);
                return j2;
            } catch (AssertionError e) {
                if (C6493o.m24626a(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    /* renamed from: b */
    public C6507z mo16270b() {
        return this.f16115g;
    }

    public void close() {
        this.f16114f.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("source(");
        sb.append(this.f16114f);
        sb.append(')');
        return sb.toString();
    }
}
