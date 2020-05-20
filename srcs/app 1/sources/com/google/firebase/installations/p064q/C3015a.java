package com.google.firebase.installations.p064q;

import com.google.firebase.installations.p064q.C3019c.C3020a;
import com.google.firebase.installations.p064q.C3021d.C3022a;

/* renamed from: com.google.firebase.installations.q.a */
final class C3015a extends C3021d {

    /* renamed from: a */
    private final String f8604a;

    /* renamed from: b */
    private final C3020a f8605b;

    /* renamed from: c */
    private final String f8606c;

    /* renamed from: d */
    private final String f8607d;

    /* renamed from: e */
    private final long f8608e;

    /* renamed from: f */
    private final long f8609f;

    /* renamed from: g */
    private final String f8610g;

    /* renamed from: com.google.firebase.installations.q.a$b */
    static final class C3017b extends C3022a {

        /* renamed from: a */
        private String f8611a;

        /* renamed from: b */
        private C3020a f8612b;

        /* renamed from: c */
        private String f8613c;

        /* renamed from: d */
        private String f8614d;

        /* renamed from: e */
        private Long f8615e;

        /* renamed from: f */
        private Long f8616f;

        /* renamed from: g */
        private String f8617g;

        C3017b() {
        }

        private C3017b(C3021d dVar) {
            this.f8611a = dVar.mo9740c();
            this.f8612b = dVar.mo9744f();
            this.f8613c = dVar.mo9738a();
            this.f8614d = dVar.mo9742e();
            this.f8615e = Long.valueOf(dVar.mo9739b());
            this.f8616f = Long.valueOf(dVar.mo9745g());
            this.f8617g = dVar.mo9741d();
        }

        /* renamed from: a */
        public C3022a mo9749a(long j) {
            this.f8615e = Long.valueOf(j);
            return this;
        }

        /* renamed from: a */
        public C3022a mo9750a(C3020a aVar) {
            if (aVar != null) {
                this.f8612b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        /* renamed from: a */
        public C3022a mo9751a(String str) {
            this.f8613c = str;
            return this;
        }

        /* renamed from: a */
        public C3021d mo9752a() {
            String str = "";
            if (this.f8612b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" registrationStatus");
                str = sb.toString();
            }
            if (this.f8615e == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" expiresInSecs");
                str = sb2.toString();
            }
            if (this.f8616f == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" tokenCreationEpochInSecs");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                C3015a aVar = new C3015a(this.f8611a, this.f8612b, this.f8613c, this.f8614d, this.f8615e.longValue(), this.f8616f.longValue(), this.f8617g);
                return aVar;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        /* renamed from: b */
        public C3022a mo9753b(long j) {
            this.f8616f = Long.valueOf(j);
            return this;
        }

        /* renamed from: b */
        public C3022a mo9754b(String str) {
            this.f8611a = str;
            return this;
        }

        /* renamed from: c */
        public C3022a mo9755c(String str) {
            this.f8617g = str;
            return this;
        }

        /* renamed from: d */
        public C3022a mo9756d(String str) {
            this.f8614d = str;
            return this;
        }
    }

    private C3015a(String str, C3020a aVar, String str2, String str3, long j, long j2, String str4) {
        this.f8604a = str;
        this.f8605b = aVar;
        this.f8606c = str2;
        this.f8607d = str3;
        this.f8608e = j;
        this.f8609f = j2;
        this.f8610g = str4;
    }

    /* renamed from: a */
    public String mo9738a() {
        return this.f8606c;
    }

    /* renamed from: b */
    public long mo9739b() {
        return this.f8608e;
    }

    /* renamed from: c */
    public String mo9740c() {
        return this.f8604a;
    }

    /* renamed from: d */
    public String mo9741d() {
        return this.f8610g;
    }

    /* renamed from: e */
    public String mo9742e() {
        return this.f8607d;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3021d)) {
            return false;
        }
        C3021d dVar = (C3021d) obj;
        String str = this.f8604a;
        if (str != null ? str.equals(dVar.mo9740c()) : dVar.mo9740c() == null) {
            if (this.f8605b.equals(dVar.mo9744f())) {
                String str2 = this.f8606c;
                if (str2 != null ? str2.equals(dVar.mo9738a()) : dVar.mo9738a() == null) {
                    String str3 = this.f8607d;
                    if (str3 != null ? str3.equals(dVar.mo9742e()) : dVar.mo9742e() == null) {
                        if (this.f8608e == dVar.mo9739b() && this.f8609f == dVar.mo9745g()) {
                            String str4 = this.f8610g;
                            String d = dVar.mo9741d();
                            if (str4 != null) {
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
    public C3020a mo9744f() {
        return this.f8605b;
    }

    /* renamed from: g */
    public long mo9745g() {
        return this.f8609f;
    }

    public int hashCode() {
        String str = this.f8604a;
        int i = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f8605b.hashCode()) * 1000003;
        String str2 = this.f8606c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f8607d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f8608e;
        int i2 = (hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f8609f;
        int i3 = (i2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f8610g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i3 ^ i;
    }

    /* renamed from: m */
    public C3022a mo9747m() {
        return new C3017b(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f8604a);
        sb.append(", registrationStatus=");
        sb.append(this.f8605b);
        sb.append(", authToken=");
        sb.append(this.f8606c);
        sb.append(", refreshToken=");
        sb.append(this.f8607d);
        sb.append(", expiresInSecs=");
        sb.append(this.f8608e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f8609f);
        sb.append(", fisError=");
        sb.append(this.f8610g);
        sb.append("}");
        return sb.toString();
    }
}
