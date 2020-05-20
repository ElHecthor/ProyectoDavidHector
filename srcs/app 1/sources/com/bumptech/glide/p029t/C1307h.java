package com.bumptech.glide.p029t;

import androidx.recyclerview.widget.RecyclerView;
import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.t.h */
public class C1307h extends FilterInputStream {

    /* renamed from: f */
    private int f4306f = RecyclerView.UNDEFINED_DURATION;

    public C1307h(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: d */
    private long m6146d(long j) {
        int i = this.f4306f;
        if (i == 0) {
            return -1;
        }
        if (i != Integer.MIN_VALUE && j > ((long) i)) {
            j = (long) i;
        }
        return j;
    }

    /* renamed from: g */
    private void m6147g(long j) {
        int i = this.f4306f;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f4306f = (int) (((long) i) - j);
        }
    }

    public int available() {
        int i = this.f4306f;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.f4306f = i;
    }

    public int read() {
        if (m6146d(1) == -1) {
            return -1;
        }
        int read = super.read();
        m6147g(1);
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int d = (int) m6146d((long) i2);
        if (d == -1) {
            return -1;
        }
        int read = super.read(bArr, i, d);
        m6147g((long) read);
        return read;
    }

    public synchronized void reset() {
        super.reset();
        this.f4306f = RecyclerView.UNDEFINED_DURATION;
    }

    public long skip(long j) {
        long d = m6146d(j);
        if (d == -1) {
            return 0;
        }
        long skip = super.skip(d);
        m6147g(skip);
        return skip;
    }
}
