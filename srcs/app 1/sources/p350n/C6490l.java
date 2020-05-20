package p350n;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import p308k.p323z.p325d.C5942k;

/* renamed from: n.l */
public final class C6490l implements C6506y {

    /* renamed from: f */
    private byte f16105f;

    /* renamed from: g */
    private final C6498s f16106g;

    /* renamed from: h */
    private final Inflater f16107h;

    /* renamed from: i */
    private final C6491m f16108i;

    /* renamed from: j */
    private final CRC32 f16109j = new CRC32();

    public C6490l(C6506y yVar) {
        C5942k.m22327b(yVar, "source");
        this.f16106g = new C6498s(yVar);
        Inflater inflater = new Inflater(true);
        this.f16107h = inflater;
        this.f16108i = new C6491m(this.f16106g, inflater);
    }

    /* renamed from: a */
    private final void m24610a() {
        this.f16106g.mo16804h(10);
        byte d = this.f16106g.f16124f.mo16796d(3);
        boolean z = true;
        boolean z2 = ((d >> 1) & 1) == 1;
        if (z2) {
            m24612a(this.f16106g.f16124f, 0, 10);
        }
        m24611a("ID1ID2", 8075, (int) this.f16106g.readShort());
        this.f16106g.skip(8);
        if (((d >> 2) & 1) == 1) {
            this.f16106g.mo16804h(2);
            if (z2) {
                m24612a(this.f16106g.f16124f, 0, 2);
            }
            long u = (long) this.f16106g.f16124f.mo16825u();
            this.f16106g.mo16804h(u);
            if (z2) {
                m24612a(this.f16106g.f16124f, 0, u);
            }
            this.f16106g.skip(u);
        }
        if (((d >> 3) & 1) == 1) {
            long a = this.f16106g.mo16903a(0);
            if (a != -1) {
                if (z2) {
                    m24612a(this.f16106g.f16124f, 0, a + 1);
                }
                this.f16106g.skip(a + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((d >> 4) & 1) != 1) {
            z = false;
        }
        if (z) {
            long a2 = this.f16106g.mo16903a(0);
            if (a2 != -1) {
                if (z2) {
                    m24612a(this.f16106g.f16124f, 0, a2 + 1);
                }
                this.f16106g.skip(a2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z2) {
            m24611a("FHCRC", (int) this.f16106g.mo16905d(), (int) (short) ((int) this.f16109j.getValue()));
            this.f16109j.reset();
        }
    }

    /* renamed from: a */
    private final void m24611a(String str, int i, int i2) {
        if (i2 != i) {
            Object[] objArr = {str, Integer.valueOf(i2), Integer.valueOf(i)};
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(objArr, 3));
            C5942k.m22324a((Object) format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    /* renamed from: a */
    private final void m24612a(C6480e eVar, long j, long j2) {
        C6500t tVar = eVar.f16093f;
        if (tVar != null) {
            do {
                int i = tVar.f16130c;
                int i2 = tVar.f16129b;
                if (j >= ((long) (i - i2))) {
                    j -= (long) (i - i2);
                    tVar = tVar.f16133f;
                } else {
                    while (j2 > 0) {
                        int i3 = (int) (((long) tVar.f16129b) + j);
                        int min = (int) Math.min((long) (tVar.f16130c - i3), j2);
                        this.f16109j.update(tVar.f16128a, i3, min);
                        j2 -= (long) min;
                        tVar = tVar.f16133f;
                        if (tVar != null) {
                            j = 0;
                        } else {
                            C5942k.m22323a();
                            throw null;
                        }
                    }
                    return;
                }
            } while (tVar != null);
            C5942k.m22323a();
            throw null;
        }
        C5942k.m22323a();
        throw null;
    }

    /* renamed from: d */
    private final void m24613d() {
        m24611a("CRC", this.f16106g.mo16902a(), (int) this.f16109j.getValue());
        m24611a("ISIZE", this.f16106g.mo16902a(), (int) this.f16107h.getBytesWritten());
    }

    /* renamed from: b */
    public long mo16163b(C6480e eVar, long j) {
        C5942k.m22327b(eVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f16105f == 0) {
                m24610a();
                this.f16105f = 1;
            }
            if (this.f16105f == 1) {
                long x = eVar.mo16834x();
                long b = this.f16108i.mo16163b(eVar, j);
                if (b != -1) {
                    m24612a(eVar, x, b);
                    return b;
                }
                this.f16105f = 2;
            }
            if (this.f16105f == 2) {
                m24613d();
                this.f16105f = 3;
                if (!this.f16106g.mo16809j()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    /* renamed from: b */
    public C6507z mo16270b() {
        return this.f16106g.mo16270b();
    }

    public void close() {
        this.f16108i.close();
    }
}
