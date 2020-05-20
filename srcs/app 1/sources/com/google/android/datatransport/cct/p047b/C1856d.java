package com.google.android.datatransport.cct.p047b;

import com.google.android.datatransport.cct.p047b.C1852a.C1853a;

/* renamed from: com.google.android.datatransport.cct.b.d */
final class C1856d extends C1852a {

    /* renamed from: a */
    private final int f5503a;

    /* renamed from: b */
    private final String f5504b;

    /* renamed from: c */
    private final String f5505c;

    /* renamed from: d */
    private final String f5506d;

    /* renamed from: e */
    private final String f5507e;

    /* renamed from: f */
    private final String f5508f;

    /* renamed from: g */
    private final String f5509g;

    /* renamed from: h */
    private final String f5510h;

    /* renamed from: com.google.android.datatransport.cct.b.d$b */
    static final class C1858b extends C1853a {

        /* renamed from: a */
        private Integer f5511a;

        /* renamed from: b */
        private String f5512b;

        /* renamed from: c */
        private String f5513c;

        /* renamed from: d */
        private String f5514d;

        /* renamed from: e */
        private String f5515e;

        /* renamed from: f */
        private String f5516f;

        /* renamed from: g */
        private String f5517g;

        /* renamed from: h */
        private String f5518h;

        C1858b() {
        }

        /* renamed from: a */
        public C1853a mo6315a(int i) {
            this.f5511a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public C1853a mo6316a(String str) {
            this.f5514d = str;
            return this;
        }

        /* renamed from: a */
        public C1852a mo6317a() {
            String str = "";
            if (this.f5511a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" sdkVersion");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                C1856d dVar = new C1856d(this.f5511a.intValue(), this.f5512b, this.f5513c, this.f5514d, this.f5515e, this.f5516f, this.f5517g, this.f5518h, null);
                return dVar;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }

        /* renamed from: b */
        public C1853a mo6318b(String str) {
            this.f5518h = str;
            return this;
        }

        /* renamed from: c */
        public C1853a mo6319c(String str) {
            this.f5513c = str;
            return this;
        }

        /* renamed from: d */
        public C1853a mo6320d(String str) {
            this.f5517g = str;
            return this;
        }

        /* renamed from: e */
        public C1853a mo6321e(String str) {
            this.f5512b = str;
            return this;
        }

        /* renamed from: f */
        public C1853a mo6322f(String str) {
            this.f5516f = str;
            return this;
        }

        /* renamed from: g */
        public C1853a mo6323g(String str) {
            this.f5515e = str;
            return this;
        }
    }

    /* synthetic */ C1856d(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, C1857a aVar) {
        this.f5503a = i;
        this.f5504b = str;
        this.f5505c = str2;
        this.f5506d = str3;
        this.f5507e = str4;
        this.f5508f = str5;
        this.f5509g = str6;
        this.f5510h = str7;
    }

    /* renamed from: b */
    public String mo6325b() {
        return this.f5506d;
    }

    /* renamed from: c */
    public String mo6326c() {
        return this.f5510h;
    }

    /* renamed from: d */
    public String mo6327d() {
        return this.f5505c;
    }

    /* renamed from: e */
    public String mo6328e() {
        return this.f5509g;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1852a)) {
            return false;
        }
        C1856d dVar = (C1856d) ((C1852a) obj);
        if (this.f5503a == dVar.f5503a) {
            String str = this.f5504b;
            if (str != null ? str.equals(dVar.f5504b) : dVar.f5504b == null) {
                String str2 = this.f5505c;
                if (str2 != null ? str2.equals(dVar.f5505c) : dVar.f5505c == null) {
                    String str3 = this.f5506d;
                    if (str3 != null ? str3.equals(dVar.f5506d) : dVar.f5506d == null) {
                        String str4 = this.f5507e;
                        if (str4 != null ? str4.equals(dVar.f5507e) : dVar.f5507e == null) {
                            String str5 = this.f5508f;
                            if (str5 != null ? str5.equals(dVar.f5508f) : dVar.f5508f == null) {
                                String str6 = this.f5509g;
                                if (str6 != null ? str6.equals(dVar.f5509g) : dVar.f5509g == null) {
                                    String str7 = this.f5510h;
                                    String str8 = dVar.f5510h;
                                    if (str7 != null) {
                                    }
                                }
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
    public String mo6330f() {
        return this.f5504b;
    }

    /* renamed from: g */
    public String mo6331g() {
        return this.f5508f;
    }

    /* renamed from: h */
    public String mo6332h() {
        return this.f5507e;
    }

    public int hashCode() {
        int i = (this.f5503a ^ 1000003) * 1000003;
        String str = this.f5504b;
        int i2 = 0;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f5505c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f5506d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f5507e;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f5508f;
        int hashCode5 = (hashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f5509g;
        int hashCode6 = (hashCode5 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f5510h;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        return hashCode6 ^ i2;
    }

    /* renamed from: i */
    public int mo6334i() {
        return this.f5503a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AndroidClientInfo{sdkVersion=");
        sb.append(this.f5503a);
        sb.append(", model=");
        sb.append(this.f5504b);
        sb.append(", hardware=");
        sb.append(this.f5505c);
        sb.append(", device=");
        sb.append(this.f5506d);
        sb.append(", product=");
        sb.append(this.f5507e);
        sb.append(", osBuild=");
        sb.append(this.f5508f);
        sb.append(", manufacturer=");
        sb.append(this.f5509g);
        sb.append(", fingerprint=");
        sb.append(this.f5510h);
        sb.append("}");
        return sb.toString();
    }
}
