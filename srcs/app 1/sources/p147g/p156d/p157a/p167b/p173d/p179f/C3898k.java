package p147g.p156d.p157a.p167b.p173d.p179f;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: g.d.a.b.d.f.k */
final class C3898k extends FilterInputStream {

    /* renamed from: f */
    private long f10795f;

    /* renamed from: g */
    private long f10796g = -1;

    C3898k(InputStream inputStream, long j) {
        super(inputStream);
        C3894g.m15646a(inputStream);
        this.f10795f = 1048577;
    }

    public final int available() {
        return (int) Math.min((long) this.in.available(), this.f10795f);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.f10796g = this.f10795f;
    }

    public final int read() {
        if (this.f10795f == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f10795f--;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f10795f;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f10795f -= (long) read;
        }
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f10796g != -1) {
            this.in.reset();
            this.f10795f = this.f10796g;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) {
        long skip = this.in.skip(Math.min(j, this.f10795f));
        this.f10795f -= skip;
        return skip;
    }
}
