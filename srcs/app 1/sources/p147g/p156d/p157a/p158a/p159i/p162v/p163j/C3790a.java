package p147g.p156d.p157a.p158a.p159i.p162v.p163j;

/* renamed from: g.d.a.a.i.v.j.a */
final class C3790a extends C3798d {

    /* renamed from: b */
    private final long f10697b;

    /* renamed from: c */
    private final int f10698c;

    /* renamed from: d */
    private final int f10699d;

    /* renamed from: e */
    private final long f10700e;

    /* renamed from: g.d.a.a.i.v.j.a$b */
    static final class C3792b extends C3799a {

        /* renamed from: a */
        private Long f10701a;

        /* renamed from: b */
        private Integer f10702b;

        /* renamed from: c */
        private Integer f10703c;

        /* renamed from: d */
        private Long f10704d;

        C3792b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C3799a mo11971a(int i) {
            this.f10703c = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C3799a mo11972a(long j) {
            this.f10704d = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C3798d mo11973a() {
            String str = "";
            if (this.f10701a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" maxStorageSizeInBytes");
                str = sb.toString();
            }
            if (this.f10702b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" loadBatchSize");
                str = sb2.toString();
            }
            if (this.f10703c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" criticalSectionEnterTimeoutMs");
                str = sb3.toString();
            }
            if (this.f10704d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" eventCleanUpAge");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                C3790a aVar = new C3790a(this.f10701a.longValue(), this.f10702b.intValue(), this.f10703c.intValue(), this.f10704d.longValue());
                return aVar;
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C3799a mo11974b(int i) {
            this.f10702b = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C3799a mo11975b(long j) {
            this.f10701a = Long.valueOf(j);
            return this;
        }
    }

    private C3790a(long j, int i, int i2, long j2) {
        this.f10697b = j;
        this.f10698c = i;
        this.f10699d = i2;
        this.f10700e = j2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo11964a() {
        return this.f10699d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public long mo11965b() {
        return this.f10700e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo11966c() {
        return this.f10698c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public long mo11967d() {
        return this.f10697b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3798d)) {
            return false;
        }
        C3798d dVar = (C3798d) obj;
        if (!(this.f10697b == dVar.mo11967d() && this.f10698c == dVar.mo11966c() && this.f10699d == dVar.mo11964a() && this.f10700e == dVar.mo11965b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long j = this.f10697b;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f10698c) * 1000003) ^ this.f10699d) * 1000003;
        long j2 = this.f10700e;
        return ((int) ((j2 >>> 32) ^ j2)) ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f10697b);
        sb.append(", loadBatchSize=");
        sb.append(this.f10698c);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f10699d);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f10700e);
        sb.append("}");
        return sb.toString();
    }
}
