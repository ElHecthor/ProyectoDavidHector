package p071f.p115k.p117c;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p071f.p136u.p137a.p138a.C3556b;

/* renamed from: f.k.c.e */
class C3435e {

    /* renamed from: f.k.c.e$a */
    private static class C3436a implements C3438c {

        /* renamed from: a */
        private final byte[] f9719a;

        /* renamed from: b */
        private final ByteBuffer f9720b;

        /* renamed from: c */
        private final InputStream f9721c;

        /* renamed from: d */
        private long f9722d = 0;

        C3436a(InputStream inputStream) {
            this.f9721c = inputStream;
            byte[] bArr = new byte[4];
            this.f9719a = bArr;
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.f9720b = wrap;
            wrap.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: b */
        private void m14092b(int i) {
            if (this.f9721c.read(this.f9719a, 0, i) == i) {
                this.f9722d += (long) i;
                return;
            }
            throw new IOException("read failed");
        }

        /* renamed from: a */
        public long mo10966a() {
            this.f9720b.position(0);
            m14092b(4);
            return C3435e.m14088a(this.f9720b.getInt());
        }

        /* renamed from: a */
        public void mo10967a(int i) {
            while (i > 0) {
                int skip = (int) this.f9721c.skip((long) i);
                if (skip >= 1) {
                    i -= skip;
                    this.f9722d += (long) skip;
                } else {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
            }
        }

        /* renamed from: b */
        public int mo10968b() {
            this.f9720b.position(0);
            m14092b(4);
            return this.f9720b.getInt();
        }

        /* renamed from: c */
        public long mo10969c() {
            return this.f9722d;
        }

        public int readUnsignedShort() {
            this.f9720b.position(0);
            m14092b(2);
            return C3435e.m14087a(this.f9720b.getShort());
        }
    }

    /* renamed from: f.k.c.e$b */
    private static class C3437b {

        /* renamed from: a */
        private final long f9723a;

        /* renamed from: b */
        private final long f9724b;

        C3437b(long j, long j2) {
            this.f9723a = j;
            this.f9724b = j2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public long mo10971a() {
            return this.f9724b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public long mo10972b() {
            return this.f9723a;
        }
    }

    /* renamed from: f.k.c.e$c */
    private interface C3438c {
        /* renamed from: a */
        long mo10966a();

        /* renamed from: a */
        void mo10967a(int i);

        /* renamed from: b */
        int mo10968b();

        /* renamed from: c */
        long mo10969c();

        int readUnsignedShort();
    }

    /* renamed from: a */
    static int m14087a(short s) {
        return s & 65535;
    }

    /* renamed from: a */
    static long m14088a(int i) {
        return ((long) i) & 4294967295L;
    }

    /* renamed from: a */
    private static C3437b m14089a(C3438c cVar) {
        long j;
        cVar.mo10967a(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        String str = "Cannot read metadata.";
        if (readUnsignedShort <= 100) {
            cVar.mo10967a(6);
            int i = 0;
            while (true) {
                if (i >= readUnsignedShort) {
                    j = -1;
                    break;
                }
                int b = cVar.mo10968b();
                cVar.mo10967a(4);
                j = cVar.mo10966a();
                cVar.mo10967a(4);
                if (1835365473 == b) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                cVar.mo10967a((int) (j - cVar.mo10969c()));
                cVar.mo10967a(12);
                long a = cVar.mo10966a();
                for (int i2 = 0; ((long) i2) < a; i2++) {
                    int b2 = cVar.mo10968b();
                    long a2 = cVar.mo10966a();
                    long a3 = cVar.mo10966a();
                    if (1164798569 == b2 || 1701669481 == b2) {
                        return new C3437b(a2 + j, a3);
                    }
                }
            }
            throw new IOException(str);
        }
        throw new IOException(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        if (r1 != null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        r2.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = move-exception;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p071f.p136u.p137a.p138a.C3556b m14090a(android.content.res.AssetManager r1, java.lang.String r2) {
        /*
            java.io.InputStream r1 = r1.open(r2)
            f.u.a.a.b r2 = m14091a(r1)     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x000d
            r1.close()
        L_0x000d:
            return r2
        L_0x000e:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0010 }
        L_0x0010:
            r0 = move-exception
            if (r1 == 0) goto L_0x001b
            r1.close()     // Catch:{ all -> 0x0017 }
            goto L_0x001b
        L_0x0017:
            r1 = move-exception
            r2.addSuppressed(r1)
        L_0x001b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p115k.p117c.C3435e.m14090a(android.content.res.AssetManager, java.lang.String):f.u.a.a.b");
    }

    /* renamed from: a */
    static C3556b m14091a(InputStream inputStream) {
        C3436a aVar = new C3436a(inputStream);
        C3437b a = m14089a((C3438c) aVar);
        aVar.mo10967a((int) (a.mo10972b() - aVar.mo10969c()));
        ByteBuffer allocate = ByteBuffer.allocate((int) a.mo10971a());
        int read = inputStream.read(allocate.array());
        if (((long) read) == a.mo10971a()) {
            return C3556b.m14522a(allocate);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Needed ");
        sb.append(a.mo10971a());
        sb.append(" bytes, got ");
        sb.append(read);
        throw new IOException(sb.toString());
    }
}
