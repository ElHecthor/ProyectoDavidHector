package com.google.android.datatransport.cct.p047b;

import com.google.android.datatransport.cct.p047b.C1883r.C1884a;
import java.util.List;

/* renamed from: com.google.android.datatransport.cct.b.h */
final class C1866h extends C1883r {

    /* renamed from: a */
    private final long f5538a;

    /* renamed from: b */
    private final long f5539b;

    /* renamed from: c */
    private final C1875m f5540c;

    /* renamed from: d */
    private final int f5541d;

    /* renamed from: e */
    private final String f5542e;

    /* renamed from: f */
    private final List<C1880p> f5543f;

    /* renamed from: g */
    private final C1854b f5544g;

    /* renamed from: com.google.android.datatransport.cct.b.h$b */
    static final class C1868b extends C1884a {

        /* renamed from: a */
        private Long f5545a;

        /* renamed from: b */
        private Long f5546b;

        /* renamed from: c */
        private C1875m f5547c;

        /* renamed from: d */
        private Integer f5548d;

        /* renamed from: e */
        private String f5549e;

        /* renamed from: f */
        private List<C1880p> f5550f;

        /* renamed from: g */
        private C1854b f5551g;

        C1868b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1884a mo6375a(int i) {
            this.f5548d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public C1884a mo6376a(long j) {
            this.f5545a = Long.valueOf(j);
            return this;
        }

        /* renamed from: a */
        public C1884a mo6377a(C1854b bVar) {
            this.f5551g = bVar;
            return this;
        }

        /* renamed from: a */
        public C1884a mo6378a(C1875m mVar) {
            this.f5547c = mVar;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1884a mo6379a(String str) {
            this.f5549e = str;
            return this;
        }

        /* renamed from: a */
        public C1884a mo6380a(List<C1880p> list) {
            this.f5550f = list;
            return this;
        }

        /* renamed from: a */
        public C1883r mo6381a() {
            String str = "";
            if (this.f5545a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" requestTimeMs");
                str = sb.toString();
            }
            if (this.f5546b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" requestUptimeMs");
                str = sb2.toString();
            }
            if (this.f5548d == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" logSource");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                C1866h hVar = new C1866h(this.f5545a.longValue(), this.f5546b.longValue(), this.f5547c, this.f5548d.intValue(), this.f5549e, this.f5550f, this.f5551g, null);
                return hVar;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        /* renamed from: b */
        public C1884a mo6382b(long j) {
            this.f5546b = Long.valueOf(j);
            return this;
        }
    }

    /* synthetic */ C1866h(long j, long j2, C1875m mVar, int i, String str, List list, C1854b bVar, C1867a aVar) {
        this.f5538a = j;
        this.f5539b = j2;
        this.f5540c = mVar;
        this.f5541d = i;
        this.f5542e = str;
        this.f5543f = list;
        this.f5544g = bVar;
    }

    /* renamed from: b */
    public C1875m mo6366b() {
        return this.f5540c;
    }

    /* renamed from: c */
    public List<C1880p> mo6367c() {
        return this.f5543f;
    }

    /* renamed from: d */
    public int mo6368d() {
        return this.f5541d;
    }

    /* renamed from: e */
    public String mo6369e() {
        return this.f5542e;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1883r)) {
            return false;
        }
        C1866h hVar = (C1866h) ((C1883r) obj);
        if (this.f5538a == hVar.f5538a && this.f5539b == hVar.f5539b) {
            C1875m mVar = this.f5540c;
            if (mVar != null ? mVar.equals(hVar.f5540c) : hVar.f5540c == null) {
                if (this.f5541d == hVar.f5541d) {
                    String str = this.f5542e;
                    if (str != null ? str.equals(hVar.f5542e) : hVar.f5542e == null) {
                        List<C1880p> list = this.f5543f;
                        if (list != null ? list.equals(hVar.f5543f) : hVar.f5543f == null) {
                            C1854b bVar = this.f5544g;
                            C1854b bVar2 = hVar.f5544g;
                            if (bVar != null) {
                            }
                        }
                    }
                }
            }
        }
        z = false;
        return z;
    }

    /* renamed from: f */
    public long mo6371f() {
        return this.f5538a;
    }

    /* renamed from: g */
    public long mo6372g() {
        return this.f5539b;
    }

    public int hashCode() {
        long j = this.f5538a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f5539b;
        int i2 = (i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        C1875m mVar = this.f5540c;
        int i3 = 0;
        int hashCode = (((i2 ^ (mVar == null ? 0 : mVar.hashCode())) * 1000003) ^ this.f5541d) * 1000003;
        String str = this.f5542e;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<C1880p> list = this.f5543f;
        int hashCode3 = (hashCode2 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        C1854b bVar = this.f5544g;
        if (bVar != null) {
            i3 = bVar.hashCode();
        }
        return hashCode3 ^ i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LogRequest{requestTimeMs=");
        sb.append(this.f5538a);
        sb.append(", requestUptimeMs=");
        sb.append(this.f5539b);
        sb.append(", clientInfo=");
        sb.append(this.f5540c);
        sb.append(", logSource=");
        sb.append(this.f5541d);
        sb.append(", logSourceName=");
        sb.append(this.f5542e);
        sb.append(", logEvents=");
        sb.append(this.f5543f);
        sb.append(", qosTier=");
        sb.append(this.f5544g);
        sb.append("}");
        return sb.toString();
    }
}
