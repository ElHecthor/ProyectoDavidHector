package com.bumptech.glide.p020m;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.m.b */
class C1223b implements Closeable {

    /* renamed from: f */
    private final InputStream f4076f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Charset f4077g;

    /* renamed from: h */
    private byte[] f4078h;

    /* renamed from: i */
    private int f4079i;

    /* renamed from: j */
    private int f4080j;

    /* renamed from: com.bumptech.glide.m.b$a */
    class C1224a extends ByteArrayOutputStream {
        C1224a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            try {
                return new String(this.buf, 0, (i <= 0 || this.buf[i + -1] != 13) ? this.count : i - 1, C1223b.this.f4077g.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C1223b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C1225c.f4082a)) {
            this.f4076f = inputStream;
            this.f4077g = charset;
            this.f4078h = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public C1223b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: f */
    private void m5734f() {
        InputStream inputStream = this.f4076f;
        byte[] bArr = this.f4078h;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f4079i = 0;
            this.f4080j = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public boolean mo5157a() {
        return this.f4080j == -1;
    }

    public void close() {
        synchronized (this.f4076f) {
            if (this.f4078h != null) {
                this.f4078h = null;
                this.f4076f.close();
            }
        }
    }

    /* renamed from: d */
    public String mo5159d() {
        int i;
        int i2;
        synchronized (this.f4076f) {
            if (this.f4078h != null) {
                if (this.f4079i >= this.f4080j) {
                    m5734f();
                }
                for (int i3 = this.f4079i; i3 != this.f4080j; i3++) {
                    if (this.f4078h[i3] == 10) {
                        if (i3 != this.f4079i) {
                            i2 = i3 - 1;
                            if (this.f4078h[i2] == 13) {
                                String str = new String(this.f4078h, this.f4079i, i2 - this.f4079i, this.f4077g.name());
                                this.f4079i = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f4078h, this.f4079i, i2 - this.f4079i, this.f4077g.name());
                        this.f4079i = i3 + 1;
                        return str2;
                    }
                }
                C1224a aVar = new C1224a((this.f4080j - this.f4079i) + 80);
                loop1:
                while (true) {
                    aVar.write(this.f4078h, this.f4079i, this.f4080j - this.f4079i);
                    this.f4080j = -1;
                    m5734f();
                    i = this.f4079i;
                    while (true) {
                        if (i != this.f4080j) {
                            if (this.f4078h[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f4079i) {
                    aVar.write(this.f4078h, this.f4079i, i - this.f4079i);
                }
                this.f4079i = i + 1;
                String aVar2 = aVar.toString();
                return aVar2;
            }
            throw new IOException("LineReader is closed");
        }
    }
}
