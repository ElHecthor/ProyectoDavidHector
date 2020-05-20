package com.bumptech.glide.load.p005n;

import com.bumptech.glide.load.p007o.p008a0.C0916b;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.load.n.c */
public final class C0880c extends OutputStream {

    /* renamed from: f */
    private final OutputStream f3403f;

    /* renamed from: g */
    private byte[] f3404g;

    /* renamed from: h */
    private C0916b f3405h;

    /* renamed from: i */
    private int f3406i;

    public C0880c(OutputStream outputStream, C0916b bVar) {
        this(outputStream, bVar, 65536);
    }

    C0880c(OutputStream outputStream, C0916b bVar, int i) {
        this.f3403f = outputStream;
        this.f3405h = bVar;
        this.f3404g = (byte[]) bVar.mo4692b(i, byte[].class);
    }

    /* renamed from: a */
    private void m4600a() {
        int i = this.f3406i;
        if (i > 0) {
            this.f3403f.write(this.f3404g, 0, i);
            this.f3406i = 0;
        }
    }

    /* renamed from: d */
    private void m4601d() {
        if (this.f3406i == this.f3404g.length) {
            m4600a();
        }
    }

    /* renamed from: f */
    private void m4602f() {
        byte[] bArr = this.f3404g;
        if (bArr != null) {
            this.f3405h.put(bArr);
            this.f3404g = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        try {
            flush();
            this.f3403f.close();
            m4602f();
        } catch (Throwable th) {
            this.f3403f.close();
            throw th;
        }
    }

    public void flush() {
        m4600a();
        this.f3403f.flush();
    }

    public void write(int i) {
        byte[] bArr = this.f3404g;
        int i2 = this.f3406i;
        this.f3406i = i2 + 1;
        bArr[i2] = (byte) i;
        m4601d();
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            if (this.f3406i != 0 || i4 < this.f3404g.length) {
                int min = Math.min(i4, this.f3404g.length - this.f3406i);
                System.arraycopy(bArr, i5, this.f3404g, this.f3406i, min);
                this.f3406i += min;
                i3 += min;
                m4601d();
            } else {
                this.f3403f.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
