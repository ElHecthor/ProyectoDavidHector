package p147g.p156d.p157a.p158a.p159i;

import java.util.Map;
import p147g.p156d.p157a.p158a.p159i.C3761h.C3762a;

/* renamed from: g.d.a.a.i.a */
final class C3746a extends C3761h {

    /* renamed from: a */
    private final String f10611a;

    /* renamed from: b */
    private final Integer f10612b;

    /* renamed from: c */
    private final C3760g f10613c;

    /* renamed from: d */
    private final long f10614d;

    /* renamed from: e */
    private final long f10615e;

    /* renamed from: f */
    private final Map<String, String> f10616f;

    /* renamed from: g.d.a.a.i.a$b */
    static final class C3748b extends C3762a {

        /* renamed from: a */
        private String f10617a;

        /* renamed from: b */
        private Integer f10618b;

        /* renamed from: c */
        private C3760g f10619c;

        /* renamed from: d */
        private Long f10620d;

        /* renamed from: e */
        private Long f10621e;

        /* renamed from: f */
        private Map<String, String> f10622f;

        C3748b() {
        }

        /* renamed from: a */
        public C3762a mo11906a(long j) {
            this.f10620d = Long.valueOf(j);
            return this;
        }

        /* renamed from: a */
        public C3762a mo11907a(C3760g gVar) {
            if (gVar != null) {
                this.f10619c = gVar;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        /* renamed from: a */
        public C3762a mo11908a(Integer num) {
            this.f10618b = num;
            return this;
        }

        /* renamed from: a */
        public C3762a mo11909a(String str) {
            if (str != null) {
                this.f10617a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C3762a mo11910a(Map<String, String> map) {
            if (map != null) {
                this.f10622f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        /* renamed from: a */
        public C3761h mo11911a() {
            String str = "";
            if (this.f10617a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" transportName");
                str = sb.toString();
            }
            if (this.f10619c == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" encodedPayload");
                str = sb2.toString();
            }
            if (this.f10620d == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" eventMillis");
                str = sb3.toString();
            }
            if (this.f10621e == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" uptimeMillis");
                str = sb4.toString();
            }
            if (this.f10622f == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" autoMetadata");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                C3746a aVar = new C3746a(this.f10617a, this.f10618b, this.f10619c, this.f10620d.longValue(), this.f10621e.longValue(), this.f10622f);
                return aVar;
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }

        /* renamed from: b */
        public C3762a mo11912b(long j) {
            this.f10621e = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Map<String, String> mo11913b() {
            Map<String, String> map = this.f10622f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
    }

    private C3746a(String str, Integer num, C3760g gVar, long j, long j2, Map<String, String> map) {
        this.f10611a = str;
        this.f10612b = num;
        this.f10613c = gVar;
        this.f10614d = j;
        this.f10615e = j2;
        this.f10616f = map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo11897a() {
        return this.f10616f;
    }

    /* renamed from: b */
    public Integer mo11898b() {
        return this.f10612b;
    }

    /* renamed from: c */
    public C3760g mo11899c() {
        return this.f10613c;
    }

    /* renamed from: d */
    public long mo11900d() {
        return this.f10614d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r7.f10616f.equals(r8.mo11897a()) != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof p147g.p156d.p157a.p158a.p159i.C3761h
            r2 = 0
            if (r1 == 0) goto L_0x005b
            g.d.a.a.i.h r8 = (p147g.p156d.p157a.p158a.p159i.C3761h) r8
            java.lang.String r1 = r7.f10611a
            java.lang.String r3 = r8.mo11902f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            java.lang.Integer r1 = r7.f10612b
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r8.mo11898b()
            if (r1 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r8.mo11898b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
        L_0x002c:
            g.d.a.a.i.g r1 = r7.f10613c
            g.d.a.a.i.g r3 = r8.mo11899c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            long r3 = r7.f10614d
            long r5 = r8.mo11900d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            long r3 = r7.f10615e
            long r5 = r8.mo11903g()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.f10616f
            java.util.Map r8 = r8.mo11897a()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            return r0
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p157a.p158a.p159i.C3746a.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public String mo11902f() {
        return this.f10611a;
    }

    /* renamed from: g */
    public long mo11903g() {
        return this.f10615e;
    }

    public int hashCode() {
        int hashCode = (this.f10611a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f10612b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f10613c.hashCode()) * 1000003;
        long j = this.f10614d;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f10615e;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f10616f.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EventInternal{transportName=");
        sb.append(this.f10611a);
        sb.append(", code=");
        sb.append(this.f10612b);
        sb.append(", encodedPayload=");
        sb.append(this.f10613c);
        sb.append(", eventMillis=");
        sb.append(this.f10614d);
        sb.append(", uptimeMillis=");
        sb.append(this.f10615e);
        sb.append(", autoMetadata=");
        sb.append(this.f10616f);
        sb.append("}");
        return sb.toString();
    }
}
