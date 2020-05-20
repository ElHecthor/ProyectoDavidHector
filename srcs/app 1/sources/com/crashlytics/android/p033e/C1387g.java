package com.crashlytics.android.p033e;

import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.crashlytics.android.e.g */
final class C1387g implements Flushable {

    /* renamed from: f */
    private final byte[] f4459f;

    /* renamed from: g */
    private final int f4460g;

    /* renamed from: h */
    private int f4461h = 0;

    /* renamed from: i */
    private final OutputStream f4462i;

    /* renamed from: com.crashlytics.android.e.g$a */
    static class C1388a extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        C1388a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private C1387g(OutputStream outputStream, byte[] bArr) {
        this.f4462i = outputStream;
        this.f4459f = bArr;
        this.f4460g = bArr.length;
    }

    /* renamed from: a */
    public static C1387g m6393a(OutputStream outputStream) {
        return m6394a(outputStream, 4096);
    }

    /* renamed from: a */
    public static C1387g m6394a(OutputStream outputStream, int i) {
        return new C1387g(outputStream, new byte[i]);
    }

    /* renamed from: a */
    private void m6395a() {
        OutputStream outputStream = this.f4462i;
        if (outputStream != null) {
            outputStream.write(this.f4459f, 0, this.f4461h);
            this.f4461h = 0;
            return;
        }
        throw new C1388a();
    }

    /* renamed from: b */
    public static int m6396b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m6397b(int i, float f) {
        return m6412l(i) + m6396b(f);
    }

    /* renamed from: b */
    public static int m6398b(int i, long j) {
        return m6412l(i) + m6405e(j);
    }

    /* renamed from: b */
    public static int m6399b(int i, C1380d dVar) {
        return m6412l(i) + m6402c(dVar);
    }

    /* renamed from: b */
    public static int m6400b(int i, boolean z) {
        return m6412l(i) + m6401b(z);
    }

    /* renamed from: b */
    public static int m6401b(boolean z) {
        return 1;
    }

    /* renamed from: c */
    public static int m6402c(C1380d dVar) {
        return m6410j(dVar.mo5506b()) + dVar.mo5506b();
    }

    /* renamed from: d */
    public static int m6403d(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: e */
    public static int m6404e(int i, int i2) {
        return m6412l(i) + m6408h(i2);
    }

    /* renamed from: e */
    public static int m6405e(long j) {
        return m6403d(j);
    }

    /* renamed from: f */
    public static int m6406f(int i, int i2) {
        return m6412l(i) + m6411k(i2);
    }

    /* renamed from: g */
    public static int m6407g(int i, int i2) {
        return m6412l(i) + m6413m(i2);
    }

    /* renamed from: h */
    public static int m6408h(int i) {
        return m6409i(i);
    }

    /* renamed from: i */
    public static int m6409i(int i) {
        if (i >= 0) {
            return m6410j(i);
        }
        return 10;
    }

    /* renamed from: j */
    public static int m6410j(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: k */
    public static int m6411k(int i) {
        return m6410j(m6414n(i));
    }

    /* renamed from: l */
    public static int m6412l(int i) {
        return m6410j(C1496z0.m6746a(i, 0));
    }

    /* renamed from: m */
    public static int m6413m(int i) {
        return m6410j(i);
    }

    /* renamed from: n */
    public static int m6414n(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a */
    public void mo5515a(byte b) {
        if (this.f4461h == this.f4460g) {
            m6395a();
        }
        byte[] bArr = this.f4459f;
        int i = this.f4461h;
        this.f4461h = i + 1;
        bArr[i] = b;
    }

    /* renamed from: a */
    public void mo5516a(float f) {
        mo5535d(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public void mo5517a(int i) {
        mo5528b(i);
    }

    /* renamed from: a */
    public void mo5518a(int i, float f) {
        mo5533c(i, 5);
        mo5516a(f);
    }

    /* renamed from: a */
    public void mo5519a(int i, int i2) {
        mo5533c(i, 0);
        mo5517a(i2);
    }

    /* renamed from: a */
    public void mo5520a(int i, long j) {
        mo5533c(i, 0);
        mo5534c(j);
    }

    /* renamed from: a */
    public void mo5521a(int i, C1380d dVar) {
        mo5533c(i, 2);
        mo5523a(dVar);
    }

    /* renamed from: a */
    public void mo5522a(int i, boolean z) {
        mo5533c(i, 0);
        mo5525a(z);
    }

    /* renamed from: a */
    public void mo5523a(C1380d dVar) {
        mo5537e(dVar.mo5506b());
        mo5531b(dVar);
    }

    /* renamed from: a */
    public void mo5524a(C1380d dVar, int i, int i2) {
        int i3 = this.f4460g;
        int i4 = this.f4461h;
        if (i3 - i4 >= i2) {
            dVar.mo5505a(this.f4459f, i, i4, i2);
            this.f4461h += i2;
            return;
        }
        int i5 = i3 - i4;
        dVar.mo5505a(this.f4459f, i, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f4461h = this.f4460g;
        m6395a();
        if (i7 <= this.f4460g) {
            dVar.mo5505a(this.f4459f, i6, 0, i7);
            this.f4461h = i7;
            return;
        }
        InputStream a = dVar.mo5504a();
        long j = (long) i6;
        if (j == a.skip(j)) {
            while (i7 > 0) {
                int min = Math.min(i7, this.f4460g);
                int read = a.read(this.f4459f, 0, min);
                if (read == min) {
                    this.f4462i.write(this.f4459f, 0, read);
                    i7 -= read;
                } else {
                    throw new IllegalStateException("Read failed.");
                }
            }
            return;
        }
        throw new IllegalStateException("Skip failed.");
    }

    /* renamed from: a */
    public void mo5525a(boolean z) {
        mo5532c(z ? 1 : 0);
    }

    /* renamed from: a */
    public void mo5526a(byte[] bArr) {
        mo5527a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public void mo5527a(byte[] bArr, int i, int i2) {
        int i3 = this.f4460g;
        int i4 = this.f4461h;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f4459f, i4, i2);
            this.f4461h += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.f4459f, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f4461h = this.f4460g;
        m6395a();
        if (i7 <= this.f4460g) {
            System.arraycopy(bArr, i6, this.f4459f, 0, i7);
            this.f4461h = i7;
            return;
        }
        this.f4462i.write(bArr, i6, i7);
    }

    /* renamed from: b */
    public void mo5528b(int i) {
        if (i >= 0) {
            mo5537e(i);
        } else {
            mo5530b((long) i);
        }
    }

    /* renamed from: b */
    public void mo5529b(int i, int i2) {
        mo5533c(i, 0);
        mo5538f(i2);
    }

    /* renamed from: b */
    public void mo5530b(long j) {
        while ((-128 & j) != 0) {
            mo5532c((((int) j) & 127) | 128);
            j >>>= 7;
        }
        mo5532c((int) j);
    }

    /* renamed from: b */
    public void mo5531b(C1380d dVar) {
        mo5524a(dVar, 0, dVar.mo5506b());
    }

    /* renamed from: c */
    public void mo5532c(int i) {
        mo5515a((byte) i);
    }

    /* renamed from: c */
    public void mo5533c(int i, int i2) {
        mo5537e(C1496z0.m6746a(i, i2));
    }

    /* renamed from: c */
    public void mo5534c(long j) {
        mo5530b(j);
    }

    /* renamed from: d */
    public void mo5535d(int i) {
        mo5532c(i & 255);
        mo5532c((i >> 8) & 255);
        mo5532c((i >> 16) & 255);
        mo5532c((i >> 24) & 255);
    }

    /* renamed from: d */
    public void mo5536d(int i, int i2) {
        mo5533c(i, 0);
        mo5540g(i2);
    }

    /* renamed from: e */
    public void mo5537e(int i) {
        while ((i & -128) != 0) {
            mo5532c((i & 127) | 128);
            i >>>= 7;
        }
        mo5532c(i);
    }

    /* renamed from: f */
    public void mo5538f(int i) {
        mo5537e(m6414n(i));
    }

    public void flush() {
        if (this.f4462i != null) {
            m6395a();
        }
    }

    /* renamed from: g */
    public void mo5540g(int i) {
        mo5537e(i);
    }
}
