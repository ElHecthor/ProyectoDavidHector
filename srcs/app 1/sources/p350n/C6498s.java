package p350n;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import p308k.p323z.p325d.C5942k;
import p350n.p351a0.C6470a;

/* renamed from: n.s */
public final class C6498s implements C6484g {

    /* renamed from: f */
    public final C6480e f16124f = new C6480e();

    /* renamed from: g */
    public boolean f16125g;

    /* renamed from: h */
    public final C6506y f16126h;

    /* renamed from: n.s$a */
    public static final class C6499a extends InputStream {

        /* renamed from: f */
        final /* synthetic */ C6498s f16127f;

        C6499a(C6498s sVar) {
            this.f16127f = sVar;
        }

        public int available() {
            C6498s sVar = this.f16127f;
            if (!sVar.f16125g) {
                return (int) Math.min(sVar.f16124f.mo16834x(), (long) Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        public void close() {
            this.f16127f.close();
        }

        public int read() {
            C6498s sVar = this.f16127f;
            if (!sVar.f16125g) {
                if (sVar.f16124f.mo16834x() == 0) {
                    C6498s sVar2 = this.f16127f;
                    if (sVar2.f16126h.mo16163b(sVar2.f16124f, (long) 8192) == -1) {
                        return -1;
                    }
                }
                return this.f16127f.f16124f.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public int read(byte[] bArr, int i, int i2) {
            C5942k.m22327b(bArr, "data");
            if (!this.f16127f.f16125g) {
                C6474c.m24474a((long) bArr.length, (long) i, (long) i2);
                if (this.f16127f.f16124f.mo16834x() == 0) {
                    C6498s sVar = this.f16127f;
                    if (sVar.f16126h.mo16163b(sVar.f16124f, (long) 8192) == -1) {
                        return -1;
                    }
                }
                return this.f16127f.f16124f.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f16127f);
            sb.append(".inputStream()");
            return sb.toString();
        }
    }

    public C6498s(C6506y yVar) {
        C5942k.m22327b(yVar, "source");
        this.f16126h = yVar;
    }

    /* renamed from: a */
    public int mo16902a() {
        mo16804h(4);
        return this.f16124f.mo16823t();
    }

    /* renamed from: a */
    public int mo16777a(C6494p pVar) {
        C5942k.m22327b(pVar, "options");
        if (!this.f16125g) {
            while (true) {
                int a = C6470a.m24457a(this.f16124f, pVar, true);
                if (a == -2) {
                    if (this.f16126h.mo16163b(this.f16124f, (long) 8192) == -1) {
                        break;
                    }
                } else if (a != -1) {
                    this.f16124f.skip((long) pVar.mo16894d()[a].mo16868p());
                    return a;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: a */
    public long mo16903a(byte b) {
        return mo16904a(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: a */
    public long mo16904a(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f16125g) {
            if (0 > j || j2 < j) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long a = this.f16124f.mo16778a(b, j, j2);
                    if (a != -1) {
                        return a;
                    }
                    long x = this.f16124f.mo16834x();
                    if (x >= j2 || this.f16126h.mo16163b(this.f16124f, (long) 8192) == -1) {
                        return -1;
                    }
                    j = Math.max(j, x);
                }
                return -1;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("fromIndex=");
            sb.append(j);
            sb.append(" toIndex=");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: a */
    public long mo16779a(C6504w wVar) {
        C6480e eVar;
        C5942k.m22327b(wVar, "sink");
        long j = 0;
        while (true) {
            int i = (this.f16126h.mo16163b(this.f16124f, (long) 8192) > -1 ? 1 : (this.f16126h.mo16163b(this.f16124f, (long) 8192) == -1 ? 0 : -1));
            eVar = this.f16124f;
            if (i == 0) {
                break;
            }
            long l = eVar.mo16810l();
            if (l > 0) {
                j += l;
                wVar.mo16159a(this.f16124f, l);
            }
        }
        if (eVar.mo16834x() <= 0) {
            return j;
        }
        long x = j + this.f16124f.mo16834x();
        C6480e eVar2 = this.f16124f;
        wVar.mo16159a(eVar2, eVar2.mo16834x());
        return x;
    }

    /* renamed from: a */
    public String mo16782a(Charset charset) {
        C5942k.m22327b(charset, "charset");
        this.f16124f.mo16780a(this.f16126h);
        return this.f16124f.mo16782a(charset);
    }

    /* renamed from: b */
    public long mo16163b(C6480e eVar, long j) {
        C5942k.m22327b(eVar, "sink");
        if (!(j >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (!(true ^ this.f16125g)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.f16124f.mo16834x() == 0 && this.f16126h.mo16163b(this.f16124f, (long) 8192) == -1) {
            return -1;
        } else {
            return this.f16124f.mo16163b(eVar, Math.min(j, this.f16124f.mo16834x()));
        }
    }

    /* renamed from: b */
    public C6485h mo16790b(long j) {
        mo16804h(j);
        return this.f16124f.mo16790b(j);
    }

    /* renamed from: b */
    public C6507z mo16270b() {
        return this.f16126h.mo16270b();
    }

    /* renamed from: c */
    public boolean mo16794c(long j) {
        if (!(j >= 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (!this.f16125g) {
            while (this.f16124f.mo16834x() < j) {
                if (this.f16126h.mo16163b(this.f16124f, (long) 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public void close() {
        if (!this.f16125g) {
            this.f16125g = true;
            this.f16126h.close();
            this.f16124f.mo16797d();
        }
    }

    /* renamed from: d */
    public short mo16905d() {
        mo16804h(2);
        return this.f16124f.mo16825u();
    }

    /* renamed from: e */
    public String mo16798e() {
        return mo16801f(Long.MAX_VALUE);
    }

    /* renamed from: e */
    public byte[] mo16799e(long j) {
        mo16804h(j);
        return this.f16124f.mo16799e(j);
    }

    /* renamed from: f */
    public String mo16801f(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            byte b = (byte) 10;
            long a = mo16904a(b, 0, j2);
            if (a != -1) {
                return C6470a.m24459a(this.f16124f, a);
            }
            if (j2 < Long.MAX_VALUE && mo16794c(j2) && this.f16124f.mo16796d(j2 - 1) == ((byte) 13) && mo16794c(1 + j2) && this.f16124f.mo16796d(j2) == b) {
                return C6470a.m24459a(this.f16124f, j2);
            }
            C6480e eVar = new C6480e();
            C6480e eVar2 = this.f16124f;
            eVar2.mo16787a(eVar, 0, Math.min((long) 32, eVar2.mo16834x()));
            StringBuilder sb = new StringBuilder();
            sb.append("\\n not found: limit=");
            sb.append(Math.min(this.f16124f.mo16834x(), j));
            sb.append(" content=");
            sb.append(eVar.mo16821s().mo16864l());
            sb.append("…");
            throw new EOFException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("limit < 0: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public C6480e getBuffer() {
        return this.f16124f;
    }

    /* renamed from: h */
    public void mo16804h(long j) {
        if (!mo16794c(j)) {
            throw new EOFException();
        }
    }

    public boolean isOpen() {
        return !this.f16125g;
    }

    /* renamed from: j */
    public boolean mo16809j() {
        if (!this.f16125g) {
            return this.f16124f.mo16809j() && this.f16126h.mo16163b(this.f16124f, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo16811n() {
        /*
            r5 = this;
            r0 = 1
            r5.mo16804h(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.mo16794c(r2)
            if (r2 == 0) goto L_0x0062
            n.e r2 = r5.f16124f
            long r3 = (long) r0
            byte r2 = r2.mo16796d(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0020
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x0020:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x002a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0037
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0062
        L_0x003a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            r1 = 16
            p308k.p313e0.C5767b.m21914a(r1)
            p308k.p313e0.C5767b.m21914a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            p308k.p323z.p325d.C5942k.m22324a(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r1.<init>(r0)
            throw r1
        L_0x0062:
            n.e r0 = r5.f16124f
            long r0 = r0.mo16811n()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p350n.C6498s.mo16811n():long");
    }

    /* renamed from: r */
    public InputStream mo16815r() {
        return new C6499a(this);
    }

    public int read(ByteBuffer byteBuffer) {
        C5942k.m22327b(byteBuffer, "sink");
        if (this.f16124f.mo16834x() == 0 && this.f16126h.mo16163b(this.f16124f, (long) 8192) == -1) {
            return -1;
        }
        return this.f16124f.read(byteBuffer);
    }

    public byte readByte() {
        mo16804h(1);
        return this.f16124f.readByte();
    }

    public int readInt() {
        mo16804h(4);
        return this.f16124f.readInt();
    }

    public short readShort() {
        mo16804h(2);
        return this.f16124f.readShort();
    }

    public void skip(long j) {
        if (!this.f16125g) {
            while (j > 0) {
                if (this.f16124f.mo16834x() == 0 && this.f16126h.mo16163b(this.f16124f, (long) 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f16124f.mo16834x());
                this.f16124f.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append(this.f16126h);
        sb.append(')');
        return sb.toString();
    }
}
