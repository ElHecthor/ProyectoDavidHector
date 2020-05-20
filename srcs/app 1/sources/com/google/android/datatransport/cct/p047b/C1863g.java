package com.google.android.datatransport.cct.p047b;

import com.google.android.datatransport.cct.p047b.C1880p.C1881a;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.cct.b.g */
final class C1863g extends C1880p {

    /* renamed from: a */
    private final long f5524a;

    /* renamed from: b */
    private final int f5525b;

    /* renamed from: c */
    private final long f5526c;

    /* renamed from: d */
    private final byte[] f5527d;

    /* renamed from: e */
    private final String f5528e;

    /* renamed from: f */
    private final long f5529f;

    /* renamed from: g */
    private final C1887u f5530g;

    /* renamed from: com.google.android.datatransport.cct.b.g$b */
    static final class C1865b extends C1881a {

        /* renamed from: a */
        private Long f5531a;

        /* renamed from: b */
        private Integer f5532b;

        /* renamed from: c */
        private Long f5533c;

        /* renamed from: d */
        private byte[] f5534d;

        /* renamed from: e */
        private String f5535e;

        /* renamed from: f */
        private Long f5536f;

        /* renamed from: g */
        private C1887u f5537g;

        C1865b() {
        }

        /* renamed from: a */
        public C1881a mo6358a(int i) {
            this.f5532b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public C1881a mo6359a(long j) {
            this.f5531a = Long.valueOf(j);
            return this;
        }

        /* renamed from: a */
        public C1881a mo6360a(C1887u uVar) {
            this.f5537g = uVar;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1881a mo6361a(String str) {
            this.f5535e = str;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1881a mo6362a(byte[] bArr) {
            this.f5534d = bArr;
            return this;
        }

        /* renamed from: a */
        public C1880p mo6363a() {
            String str = "";
            if (this.f5531a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" eventTimeMs");
                str = sb.toString();
            }
            if (this.f5532b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" eventCode");
                str = sb2.toString();
            }
            if (this.f5533c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" eventUptimeMs");
                str = sb3.toString();
            }
            if (this.f5536f == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" timezoneOffsetSeconds");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                C1863g gVar = new C1863g(this.f5531a.longValue(), this.f5532b.intValue(), this.f5533c.longValue(), this.f5534d, this.f5535e, this.f5536f.longValue(), this.f5537g, null);
                return gVar;
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }

        /* renamed from: b */
        public C1881a mo6364b(long j) {
            this.f5533c = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public C1881a mo6365c(long j) {
            this.f5536f = Long.valueOf(j);
            return this;
        }
    }

    /* synthetic */ C1863g(long j, int i, long j2, byte[] bArr, String str, long j3, C1887u uVar, C1864a aVar) {
        this.f5524a = j;
        this.f5525b = i;
        this.f5526c = j2;
        this.f5527d = bArr;
        this.f5528e = str;
        this.f5529f = j3;
        this.f5530g = uVar;
    }

    /* renamed from: a */
    public long mo6348a() {
        return this.f5524a;
    }

    /* renamed from: b */
    public long mo6349b() {
        return this.f5526c;
    }

    /* renamed from: c */
    public long mo6350c() {
        return this.f5529f;
    }

    /* renamed from: d */
    public int mo6351d() {
        return this.f5525b;
    }

    /* renamed from: e */
    public C1887u mo6352e() {
        return this.f5530g;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1880p)) {
            return false;
        }
        C1880p pVar = (C1880p) obj;
        if (this.f5524a == pVar.mo6348a()) {
            C1863g gVar = (C1863g) pVar;
            if (this.f5525b == gVar.f5525b && this.f5526c == pVar.mo6349b()) {
                boolean z2 = pVar instanceof C1863g;
                if (Arrays.equals(this.f5527d, gVar.f5527d)) {
                    String str = this.f5528e;
                    if (str != null ? str.equals(gVar.f5528e) : gVar.f5528e == null) {
                        if (this.f5529f == pVar.mo6350c()) {
                            C1887u uVar = this.f5530g;
                            if (uVar != null) {
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
    public byte[] mo6354f() {
        return this.f5527d;
    }

    /* renamed from: g */
    public String mo6355g() {
        return this.f5528e;
    }

    public int hashCode() {
        long j = this.f5524a;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f5525b) * 1000003;
        long j2 = this.f5526c;
        int hashCode = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f5527d)) * 1000003;
        String str = this.f5528e;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f5529f;
        int i3 = (hashCode2 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        C1887u uVar = this.f5530g;
        if (uVar != null) {
            i2 = uVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LogEvent{eventTimeMs=");
        sb.append(this.f5524a);
        sb.append(", eventCode=");
        sb.append(this.f5525b);
        sb.append(", eventUptimeMs=");
        sb.append(this.f5526c);
        sb.append(", sourceExtension=");
        sb.append(Arrays.toString(this.f5527d));
        sb.append(", sourceExtensionJsonProto3=");
        sb.append(this.f5528e);
        sb.append(", timezoneOffsetSeconds=");
        sb.append(this.f5529f);
        sb.append(", networkConnectionInfo=");
        sb.append(this.f5530g);
        sb.append("}");
        return sb.toString();
    }
}
