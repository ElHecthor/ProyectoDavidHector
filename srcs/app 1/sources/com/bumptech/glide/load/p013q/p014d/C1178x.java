package com.bumptech.glide.load.p013q.p014d;

import com.bumptech.glide.load.p007o.p008a0.C0916b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.q.d.x */
public class C1178x extends FilterInputStream {

    /* renamed from: f */
    private volatile byte[] f3970f;

    /* renamed from: g */
    private int f3971g;

    /* renamed from: h */
    private int f3972h;

    /* renamed from: i */
    private int f3973i;

    /* renamed from: j */
    private int f3974j;

    /* renamed from: k */
    private final C0916b f3975k;

    /* renamed from: com.bumptech.glide.load.q.d.x$a */
    static class C1179a extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        C1179a(String str) {
            super(str);
        }
    }

    public C1178x(InputStream inputStream, C0916b bVar) {
        this(inputStream, bVar, 65536);
    }

    C1178x(InputStream inputStream, C0916b bVar, int i) {
        super(inputStream);
        this.f3973i = -1;
        this.f3975k = bVar;
        this.f3970f = (byte[]) bVar.mo4692b(i, byte[].class);
    }

    /* renamed from: a */
    private int m5556a(InputStream inputStream, byte[] bArr) {
        int i = this.f3973i;
        if (i != -1) {
            int i2 = this.f3974j - i;
            int i3 = this.f3972h;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f3971g == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f3975k.mo4692b(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f3970f = bArr2;
                    this.f3975k.put(bArr);
                    bArr = bArr2;
                } else {
                    int i4 = this.f3973i;
                    if (i4 > 0) {
                        System.arraycopy(bArr, i4, bArr, 0, bArr.length - i4);
                    }
                }
                int i5 = this.f3974j - this.f3973i;
                this.f3974j = i5;
                this.f3973i = 0;
                this.f3971g = 0;
                int read = inputStream.read(bArr, i5, bArr.length - i5);
                int i6 = this.f3974j;
                if (read > 0) {
                    i6 += read;
                }
                this.f3971g = i6;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f3973i = -1;
            this.f3974j = 0;
            this.f3971g = read2;
        }
        return read2;
    }

    /* renamed from: f */
    private static IOException m5557f() {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public synchronized void mo5060a() {
        this.f3972h = this.f3970f.length;
    }

    public synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f3970f == null || inputStream == null) {
            m5557f();
            throw null;
        }
        return (this.f3971g - this.f3974j) + inputStream.available();
    }

    public void close() {
        if (this.f3970f != null) {
            this.f3975k.put(this.f3970f);
            this.f3970f = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* renamed from: d */
    public synchronized void mo5063d() {
        if (this.f3970f != null) {
            this.f3975k.put(this.f3970f);
            this.f3970f = null;
        }
    }

    public synchronized void mark(int i) {
        this.f3972h = Math.max(this.f3972h, i);
        this.f3973i = this.f3974j;
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0026=Splitter:B:19:0x0026, B:11:0x0019=Splitter:B:11:0x0019, B:28:0x003b=Splitter:B:28:0x003b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f3970f     // Catch:{ all -> 0x003f }
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x003f }
            r2 = 0
            if (r0 == 0) goto L_0x003b
            if (r1 == 0) goto L_0x003b
            int r3 = r6.f3974j     // Catch:{ all -> 0x003f }
            int r4 = r6.f3971g     // Catch:{ all -> 0x003f }
            r5 = -1
            if (r3 < r4) goto L_0x0019
            int r1 = r6.m5556a(r1, r0)     // Catch:{ all -> 0x003f }
            if (r1 != r5) goto L_0x0019
            monitor-exit(r6)
            return r5
        L_0x0019:
            byte[] r1 = r6.f3970f     // Catch:{ all -> 0x003f }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r6.f3970f     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            m5557f()     // Catch:{ all -> 0x003f }
            throw r2
        L_0x0026:
            int r1 = r6.f3971g     // Catch:{ all -> 0x003f }
            int r2 = r6.f3974j     // Catch:{ all -> 0x003f }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0039
            int r1 = r6.f3974j     // Catch:{ all -> 0x003f }
            int r2 = r1 + 1
            r6.f3974j = r2     // Catch:{ all -> 0x003f }
            byte r0 = r0[r1]     // Catch:{ all -> 0x003f }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L_0x0039:
            monitor-exit(r6)
            return r5
        L_0x003b:
            m5557f()     // Catch:{ all -> 0x003f }
            throw r2
        L_0x003f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p013q.p014d.C1178x.read():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0051, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x005e, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f3970f     // Catch:{ all -> 0x009c }
            r1 = 0
            if (r0 == 0) goto L_0x0098
            if (r9 != 0) goto L_0x000b
            r7 = 0
            monitor-exit(r6)
            return r7
        L_0x000b:
            java.io.InputStream r2 = r6.in     // Catch:{ all -> 0x009c }
            if (r2 == 0) goto L_0x0094
            int r3 = r6.f3974j     // Catch:{ all -> 0x009c }
            int r4 = r6.f3971g     // Catch:{ all -> 0x009c }
            if (r3 >= r4) goto L_0x003c
            int r3 = r6.f3971g     // Catch:{ all -> 0x009c }
            int r4 = r6.f3974j     // Catch:{ all -> 0x009c }
            int r3 = r3 - r4
            if (r3 < r9) goto L_0x001e
            r3 = r9
            goto L_0x0023
        L_0x001e:
            int r3 = r6.f3971g     // Catch:{ all -> 0x009c }
            int r4 = r6.f3974j     // Catch:{ all -> 0x009c }
            int r3 = r3 - r4
        L_0x0023:
            int r4 = r6.f3974j     // Catch:{ all -> 0x009c }
            java.lang.System.arraycopy(r0, r4, r7, r8, r3)     // Catch:{ all -> 0x009c }
            int r4 = r6.f3974j     // Catch:{ all -> 0x009c }
            int r4 = r4 + r3
            r6.f3974j = r4     // Catch:{ all -> 0x009c }
            if (r3 == r9) goto L_0x003a
            int r4 = r2.available()     // Catch:{ all -> 0x009c }
            if (r4 != 0) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            int r8 = r8 + r3
            int r3 = r9 - r3
            goto L_0x003d
        L_0x003a:
            monitor-exit(r6)
            return r3
        L_0x003c:
            r3 = r9
        L_0x003d:
            int r4 = r6.f3973i     // Catch:{ all -> 0x009c }
            r5 = -1
            if (r4 != r5) goto L_0x0052
            int r4 = r0.length     // Catch:{ all -> 0x009c }
            if (r3 < r4) goto L_0x0052
            int r4 = r2.read(r7, r8, r3)     // Catch:{ all -> 0x009c }
            if (r4 != r5) goto L_0x0084
            if (r3 != r9) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            int r5 = r9 - r3
        L_0x0050:
            monitor-exit(r6)
            return r5
        L_0x0052:
            int r4 = r6.m5556a(r2, r0)     // Catch:{ all -> 0x009c }
            if (r4 != r5) goto L_0x005f
            if (r3 != r9) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            int r5 = r9 - r3
        L_0x005d:
            monitor-exit(r6)
            return r5
        L_0x005f:
            byte[] r4 = r6.f3970f     // Catch:{ all -> 0x009c }
            if (r0 == r4) goto L_0x006c
            byte[] r0 = r6.f3970f     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            m5557f()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x006c:
            int r4 = r6.f3971g     // Catch:{ all -> 0x009c }
            int r5 = r6.f3974j     // Catch:{ all -> 0x009c }
            int r4 = r4 - r5
            if (r4 < r3) goto L_0x0075
            r4 = r3
            goto L_0x007a
        L_0x0075:
            int r4 = r6.f3971g     // Catch:{ all -> 0x009c }
            int r5 = r6.f3974j     // Catch:{ all -> 0x009c }
            int r4 = r4 - r5
        L_0x007a:
            int r5 = r6.f3974j     // Catch:{ all -> 0x009c }
            java.lang.System.arraycopy(r0, r5, r7, r8, r4)     // Catch:{ all -> 0x009c }
            int r5 = r6.f3974j     // Catch:{ all -> 0x009c }
            int r5 = r5 + r4
            r6.f3974j = r5     // Catch:{ all -> 0x009c }
        L_0x0084:
            int r3 = r3 - r4
            if (r3 != 0) goto L_0x0089
            monitor-exit(r6)
            return r9
        L_0x0089:
            int r5 = r2.available()     // Catch:{ all -> 0x009c }
            if (r5 != 0) goto L_0x0092
            int r9 = r9 - r3
            monitor-exit(r6)
            return r9
        L_0x0092:
            int r8 = r8 + r4
            goto L_0x003d
        L_0x0094:
            m5557f()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x0098:
            m5557f()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x009c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p013q.p014d.C1178x.read(byte[], int, int):int");
    }

    public synchronized void reset() {
        if (this.f3970f == null) {
            throw new IOException("Stream is closed");
        } else if (-1 != this.f3973i) {
            this.f3974j = this.f3973i;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Mark has been invalidated, pos: ");
            sb.append(this.f3974j);
            sb.append(" markLimit: ");
            sb.append(this.f3972h);
            throw new C1179a(sb.toString());
        }
    }

    public synchronized long skip(long j) {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f3970f;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream == null) {
                m5557f();
                throw null;
            } else if (((long) (this.f3971g - this.f3974j)) >= j) {
                this.f3974j = (int) (((long) this.f3974j) + j);
                return j;
            } else {
                long j2 = ((long) this.f3971g) - ((long) this.f3974j);
                this.f3974j = this.f3971g;
                if (this.f3973i == -1 || j > ((long) this.f3972h)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (m5556a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    if (((long) (this.f3971g - this.f3974j)) >= j - j2) {
                        this.f3974j = (int) ((((long) this.f3974j) + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + ((long) this.f3971g)) - ((long) this.f3974j);
                    this.f3974j = this.f3971g;
                    return j3;
                }
            }
        } else {
            m5557f();
            throw null;
        }
    }
}
