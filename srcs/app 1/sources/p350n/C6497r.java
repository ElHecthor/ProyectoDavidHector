package p350n;

import java.nio.ByteBuffer;
import p308k.p323z.p325d.C5942k;

/* renamed from: n.r */
public final class C6497r implements C6483f {

    /* renamed from: f */
    public final C6480e f16121f = new C6480e();

    /* renamed from: g */
    public boolean f16122g;

    /* renamed from: h */
    public final C6504w f16123h;

    public C6497r(C6504w wVar) {
        C5942k.m22327b(wVar, "sink");
        this.f16123h = wVar;
    }

    /* renamed from: a */
    public C6483f mo16898a() {
        if (!this.f16122g) {
            long l = this.f16121f.mo16810l();
            if (l > 0) {
                this.f16123h.mo16159a(this.f16121f, l);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: a */
    public C6483f mo16783a(long j) {
        if (!this.f16122g) {
            this.f16121f.mo16783a(j);
            return mo16898a();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: a */
    public C6483f mo16784a(String str) {
        C5942k.m22327b(str, "string");
        if (!this.f16122g) {
            this.f16121f.mo16784a(str);
            mo16898a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: a */
    public C6483f mo16788a(C6485h hVar) {
        C5942k.m22327b(hVar, "byteString");
        if (!this.f16122g) {
            this.f16121f.mo16788a(hVar);
            mo16898a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: a */
    public void mo16159a(C6480e eVar, long j) {
        C5942k.m22327b(eVar, "source");
        if (!this.f16122g) {
            this.f16121f.mo16159a(eVar, j);
            mo16898a();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: b */
    public C6507z mo16272b() {
        return this.f16123h.mo16272b();
    }

    public void close() {
        if (!this.f16122g) {
            Throwable th = null;
            try {
                if (this.f16121f.mo16834x() > 0) {
                    this.f16123h.mo16159a(this.f16121f, this.f16121f.mo16834x());
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f16123h.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f16122g = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public void flush() {
        if (!this.f16122g) {
            if (this.f16121f.mo16834x() > 0) {
                C6504w wVar = this.f16123h;
                C6480e eVar = this.f16121f;
                wVar.mo16159a(eVar, eVar.mo16834x());
            }
            this.f16123h.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C6480e getBuffer() {
        return this.f16121f;
    }

    /* renamed from: i */
    public C6483f mo16806i(long j) {
        if (!this.f16122g) {
            this.f16121f.mo16806i(j);
            mo16898a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean isOpen() {
        return !this.f16122g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append(this.f16123h);
        sb.append(')');
        return sb.toString();
    }

    public int write(ByteBuffer byteBuffer) {
        C5942k.m22327b(byteBuffer, "source");
        if (!this.f16122g) {
            int write = this.f16121f.write(byteBuffer);
            mo16898a();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C6483f write(byte[] bArr) {
        C5942k.m22327b(bArr, "source");
        if (!this.f16122g) {
            this.f16121f.write(bArr);
            mo16898a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C6483f write(byte[] bArr, int i, int i2) {
        C5942k.m22327b(bArr, "source");
        if (!this.f16122g) {
            this.f16121f.write(bArr, i, i2);
            mo16898a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C6483f writeByte(int i) {
        if (!this.f16122g) {
            this.f16121f.writeByte(i);
            return mo16898a();
        }
        throw new IllegalStateException("closed".toString());
    }

    public C6483f writeInt(int i) {
        if (!this.f16122g) {
            this.f16121f.writeInt(i);
            return mo16898a();
        }
        throw new IllegalStateException("closed".toString());
    }

    public C6483f writeShort(int i) {
        if (!this.f16122g) {
            this.f16121f.writeShort(i);
            mo16898a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
