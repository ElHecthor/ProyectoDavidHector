package com.bumptech.glide.p029t;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: com.bumptech.glide.t.d */
public class C1301d extends InputStream {

    /* renamed from: h */
    private static final Queue<C1301d> f4296h = C1310k.m6165a(0);

    /* renamed from: f */
    private InputStream f4297f;

    /* renamed from: g */
    private IOException f4298g;

    C1301d() {
    }

    /* renamed from: b */
    public static C1301d m6129b(InputStream inputStream) {
        C1301d dVar;
        synchronized (f4296h) {
            dVar = (C1301d) f4296h.poll();
        }
        if (dVar == null) {
            dVar = new C1301d();
        }
        dVar.mo5356a(inputStream);
        return dVar;
    }

    /* renamed from: a */
    public IOException mo5355a() {
        return this.f4298g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5356a(InputStream inputStream) {
        this.f4297f = inputStream;
    }

    public int available() {
        return this.f4297f.available();
    }

    public void close() {
        this.f4297f.close();
    }

    /* renamed from: d */
    public void mo5359d() {
        this.f4298g = null;
        this.f4297f = null;
        synchronized (f4296h) {
            f4296h.offer(this);
        }
    }

    public void mark(int i) {
        this.f4297f.mark(i);
    }

    public boolean markSupported() {
        return this.f4297f.markSupported();
    }

    public int read() {
        try {
            return this.f4297f.read();
        } catch (IOException e) {
            this.f4298g = e;
            return -1;
        }
    }

    public int read(byte[] bArr) {
        try {
            return this.f4297f.read(bArr);
        } catch (IOException e) {
            this.f4298g = e;
            return -1;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f4297f.read(bArr, i, i2);
        } catch (IOException e) {
            this.f4298g = e;
            return -1;
        }
    }

    public synchronized void reset() {
        this.f4297f.reset();
    }

    public long skip(long j) {
        try {
            return this.f4297f.skip(j);
        } catch (IOException e) {
            this.f4298g = e;
            return 0;
        }
    }
}
