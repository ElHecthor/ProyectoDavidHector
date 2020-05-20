package com.google.firebase.installations;

import com.google.firebase.installations.C3010m.C3011a;

/* renamed from: com.google.firebase.installations.a */
final class C2993a extends C3010m {

    /* renamed from: a */
    private final String f8567a;

    /* renamed from: b */
    private final long f8568b;

    /* renamed from: c */
    private final long f8569c;

    /* renamed from: com.google.firebase.installations.a$b */
    static final class C2995b extends C3011a {

        /* renamed from: a */
        private String f8570a;

        /* renamed from: b */
        private Long f8571b;

        /* renamed from: c */
        private Long f8572c;

        C2995b() {
        }

        /* renamed from: a */
        public C3011a mo9718a(long j) {
            this.f8572c = Long.valueOf(j);
            return this;
        }

        /* renamed from: a */
        public C3011a mo9719a(String str) {
            if (str != null) {
                this.f8570a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        /* renamed from: a */
        public C3010m mo9720a() {
            String str = "";
            if (this.f8570a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" token");
                str = sb.toString();
            }
            if (this.f8571b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" tokenExpirationTimestamp");
                str = sb2.toString();
            }
            if (this.f8572c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" tokenCreationTimestamp");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                C2993a aVar = new C2993a(this.f8570a, this.f8571b.longValue(), this.f8572c.longValue());
                return aVar;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        /* renamed from: b */
        public C3011a mo9721b(long j) {
            this.f8571b = Long.valueOf(j);
            return this;
        }
    }

    private C2993a(String str, long j, long j2) {
        this.f8567a = str;
        this.f8568b = j;
        this.f8569c = j2;
    }

    /* renamed from: a */
    public String mo9712a() {
        return this.f8567a;
    }

    /* renamed from: b */
    public long mo9713b() {
        return this.f8569c;
    }

    /* renamed from: c */
    public long mo9714c() {
        return this.f8568b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3010m)) {
            return false;
        }
        C3010m mVar = (C3010m) obj;
        if (!(this.f8567a.equals(mVar.mo9712a()) && this.f8568b == mVar.mo9714c() && this.f8569c == mVar.mo9713b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = (this.f8567a.hashCode() ^ 1000003) * 1000003;
        long j = this.f8568b;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f8569c;
        return i ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InstallationTokenResult{token=");
        sb.append(this.f8567a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f8568b);
        sb.append(", tokenCreationTimestamp=");
        sb.append(this.f8569c);
        sb.append("}");
        return sb.toString();
    }
}
