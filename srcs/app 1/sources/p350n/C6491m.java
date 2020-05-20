package p350n;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p308k.p323z.p325d.C5942k;

/* renamed from: n.m */
public final class C6491m implements C6506y {

    /* renamed from: f */
    private int f16110f;

    /* renamed from: g */
    private boolean f16111g;

    /* renamed from: h */
    private final C6484g f16112h;

    /* renamed from: i */
    private final Inflater f16113i;

    public C6491m(C6484g gVar, Inflater inflater) {
        C5942k.m22327b(gVar, "source");
        C5942k.m22327b(inflater, "inflater");
        this.f16112h = gVar;
        this.f16113i = inflater;
    }

    /* renamed from: d */
    private final void m24616d() {
        int i = this.f16110f;
        if (i != 0) {
            int remaining = i - this.f16113i.getRemaining();
            this.f16110f -= remaining;
            this.f16112h.skip((long) remaining);
        }
    }

    /* renamed from: a */
    public final boolean mo16889a() {
        if (!this.f16113i.needsInput()) {
            return false;
        }
        m24616d();
        if (!(this.f16113i.getRemaining() == 0)) {
            throw new IllegalStateException("?".toString());
        } else if (this.f16112h.mo16809j()) {
            return true;
        } else {
            C6500t tVar = this.f16112h.getBuffer().f16093f;
            if (tVar != null) {
                int i = tVar.f16130c;
                int i2 = tVar.f16129b;
                int i3 = i - i2;
                this.f16110f = i3;
                this.f16113i.setInput(tVar.f16128a, i2, i3);
                return false;
            }
            C5942k.m22323a();
            throw null;
        }
    }

    /* renamed from: b */
    public long mo16163b(C6480e eVar, long j) {
        C6500t b;
        C5942k.m22327b(eVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (!(!this.f16111g)) {
            throw new IllegalStateException("closed".toString());
        } else if (i == 0) {
            return 0;
        } else {
            while (true) {
                boolean a = mo16889a();
                try {
                    b = eVar.mo16791b(1);
                    int inflate = this.f16113i.inflate(b.f16128a, b.f16130c, (int) Math.min(j, (long) (8192 - b.f16130c)));
                    if (inflate > 0) {
                        b.f16130c += inflate;
                        long j2 = (long) inflate;
                        eVar.mo16808j(eVar.mo16834x() + j2);
                        return j2;
                    } else if (this.f16113i.finished()) {
                        break;
                    } else if (this.f16113i.needsDictionary()) {
                        break;
                    } else if (a) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            m24616d();
            if (b.f16129b == b.f16130c) {
                eVar.f16093f = b.mo16918b();
                C6502u.f16137c.mo16921a(b);
            }
            return -1;
        }
    }

    /* renamed from: b */
    public C6507z mo16270b() {
        return this.f16112h.mo16270b();
    }

    public void close() {
        if (!this.f16111g) {
            this.f16113i.end();
            this.f16111g = true;
            this.f16112h.close();
        }
    }
}
