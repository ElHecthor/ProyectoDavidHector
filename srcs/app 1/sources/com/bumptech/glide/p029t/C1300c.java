package com.bumptech.glide.p029t;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.t.c */
public final class C1300c extends FilterInputStream {

    /* renamed from: f */
    private final long f4294f;

    /* renamed from: g */
    private int f4295g;

    private C1300c(InputStream inputStream, long j) {
        super(inputStream);
        this.f4294f = j;
    }

    /* renamed from: a */
    private int m6127a(int i) {
        if (i >= 0) {
            this.f4295g += i;
        } else if (this.f4294f - ((long) this.f4295g) > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to read all expected data, expected: ");
            sb.append(this.f4294f);
            sb.append(", but read: ");
            sb.append(this.f4295g);
            throw new IOException(sb.toString());
        }
        return i;
    }

    /* renamed from: a */
    public static InputStream m6128a(InputStream inputStream, long j) {
        return new C1300c(inputStream, j);
    }

    public synchronized int available() {
        return (int) Math.max(this.f4294f - ((long) this.f4295g), (long) this.in.available());
    }

    public synchronized int read() {
        int read;
        read = super.read();
        m6127a(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) {
        int read;
        read = super.read(bArr, i, i2);
        m6127a(read);
        return read;
    }
}
