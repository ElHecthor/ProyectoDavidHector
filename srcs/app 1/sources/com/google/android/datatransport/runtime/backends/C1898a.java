package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.C1905f.C1906a;
import java.util.Arrays;
import p147g.p156d.p157a.p158a.p159i.C3761h;

/* renamed from: com.google.android.datatransport.runtime.backends.a */
final class C1898a extends C1905f {

    /* renamed from: a */
    private final Iterable<C3761h> f5617a;

    /* renamed from: b */
    private final byte[] f5618b;

    /* renamed from: com.google.android.datatransport.runtime.backends.a$b */
    static final class C1900b extends C1906a {

        /* renamed from: a */
        private Iterable<C3761h> f5619a;

        /* renamed from: b */
        private byte[] f5620b;

        C1900b() {
        }

        /* renamed from: a */
        public C1906a mo6410a(Iterable<C3761h> iterable) {
            if (iterable != null) {
                this.f5619a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        /* renamed from: a */
        public C1906a mo6411a(byte[] bArr) {
            this.f5620b = bArr;
            return this;
        }

        /* renamed from: a */
        public C1905f mo6412a() {
            String str = "";
            if (this.f5619a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" events");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new C1898a(this.f5619a, this.f5620b);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private C1898a(Iterable<C3761h> iterable, byte[] bArr) {
        this.f5617a = iterable;
        this.f5618b = bArr;
    }

    /* renamed from: a */
    public Iterable<C3761h> mo6405a() {
        return this.f5617a;
    }

    /* renamed from: b */
    public byte[] mo6406b() {
        return this.f5618b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (java.util.Arrays.equals(r4.f5618b, r5 instanceof com.google.android.datatransport.runtime.backends.C1898a ? ((com.google.android.datatransport.runtime.backends.C1898a) r5).f5618b : r5.mo6406b()) != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.datatransport.runtime.backends.C1905f
            r2 = 0
            if (r1 == 0) goto L_0x002f
            com.google.android.datatransport.runtime.backends.f r5 = (com.google.android.datatransport.runtime.backends.C1905f) r5
            java.lang.Iterable<g.d.a.a.i.h> r1 = r4.f5617a
            java.lang.Iterable r3 = r5.mo6405a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002d
            byte[] r1 = r4.f5618b
            boolean r3 = r5 instanceof com.google.android.datatransport.runtime.backends.C1898a
            if (r3 == 0) goto L_0x0022
            com.google.android.datatransport.runtime.backends.a r5 = (com.google.android.datatransport.runtime.backends.C1898a) r5
            byte[] r5 = r5.f5618b
            goto L_0x0026
        L_0x0022:
            byte[] r5 = r5.mo6406b()
        L_0x0026:
            boolean r5 = java.util.Arrays.equals(r1, r5)
            if (r5 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            return r0
        L_0x002f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.backends.C1898a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return ((this.f5617a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5618b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BackendRequest{events=");
        sb.append(this.f5617a);
        sb.append(", extras=");
        sb.append(Arrays.toString(this.f5618b));
        sb.append("}");
        return sb.toString();
    }
}
