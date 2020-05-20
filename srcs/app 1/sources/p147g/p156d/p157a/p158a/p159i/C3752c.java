package p147g.p156d.p157a.p158a.p159i;

import java.util.Arrays;
import p147g.p156d.p157a.p158a.C3741d;
import p147g.p156d.p157a.p158a.p159i.C3767l.C3768a;

/* renamed from: g.d.a.a.i.c */
final class C3752c extends C3767l {

    /* renamed from: a */
    private final String f10633a;

    /* renamed from: b */
    private final byte[] f10634b;

    /* renamed from: c */
    private final C3741d f10635c;

    /* renamed from: g.d.a.a.i.c$b */
    static final class C3754b extends C3768a {

        /* renamed from: a */
        private String f10636a;

        /* renamed from: b */
        private byte[] f10637b;

        /* renamed from: c */
        private C3741d f10638c;

        C3754b() {
        }

        /* renamed from: a */
        public C3768a mo11933a(C3741d dVar) {
            if (dVar != null) {
                this.f10638c = dVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }

        /* renamed from: a */
        public C3768a mo11934a(String str) {
            if (str != null) {
                this.f10636a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        /* renamed from: a */
        public C3768a mo11935a(byte[] bArr) {
            this.f10637b = bArr;
            return this;
        }

        /* renamed from: a */
        public C3767l mo11936a() {
            String str = "";
            if (this.f10636a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" backendName");
                str = sb.toString();
            }
            if (this.f10638c == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" priority");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new C3752c(this.f10636a, this.f10637b, this.f10638c);
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private C3752c(String str, byte[] bArr, C3741d dVar) {
        this.f10633a = str;
        this.f10634b = bArr;
        this.f10635c = dVar;
    }

    /* renamed from: a */
    public String mo11928a() {
        return this.f10633a;
    }

    /* renamed from: b */
    public byte[] mo11929b() {
        return this.f10634b;
    }

    /* renamed from: c */
    public C3741d mo11930c() {
        return this.f10635c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        if (r4.f10635c.equals(r5.mo11930c()) != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof p147g.p156d.p157a.p158a.p159i.C3767l
            r2 = 0
            if (r1 == 0) goto L_0x003c
            g.d.a.a.i.l r5 = (p147g.p156d.p157a.p158a.p159i.C3767l) r5
            java.lang.String r1 = r4.f10633a
            java.lang.String r3 = r5.mo11928a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003a
            byte[] r1 = r4.f10634b
            boolean r3 = r5 instanceof p147g.p156d.p157a.p158a.p159i.C3752c
            if (r3 == 0) goto L_0x0023
            r3 = r5
            g.d.a.a.i.c r3 = (p147g.p156d.p157a.p158a.p159i.C3752c) r3
            byte[] r3 = r3.f10634b
            goto L_0x0027
        L_0x0023:
            byte[] r3 = r5.mo11929b()
        L_0x0027:
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L_0x003a
            g.d.a.a.d r1 = r4.f10635c
            g.d.a.a.d r5 = r5.mo11930c()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r0 = 0
        L_0x003b:
            return r0
        L_0x003c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p157a.p158a.p159i.C3752c.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return ((((this.f10633a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f10634b)) * 1000003) ^ this.f10635c.hashCode();
    }
}
