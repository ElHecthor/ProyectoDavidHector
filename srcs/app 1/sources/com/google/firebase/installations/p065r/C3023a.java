package com.google.firebase.installations.p065r;

import com.google.firebase.installations.p065r.C3030d.C3031a;
import com.google.firebase.installations.p065r.C3030d.C3032b;

/* renamed from: com.google.firebase.installations.r.a */
final class C3023a extends C3030d {

    /* renamed from: a */
    private final String f8629a;

    /* renamed from: b */
    private final String f8630b;

    /* renamed from: c */
    private final String f8631c;

    /* renamed from: d */
    private final C3033e f8632d;

    /* renamed from: e */
    private final C3032b f8633e;

    /* renamed from: com.google.firebase.installations.r.a$b */
    static final class C3025b extends C3031a {

        /* renamed from: a */
        private String f8634a;

        /* renamed from: b */
        private String f8635b;

        /* renamed from: c */
        private String f8636c;

        /* renamed from: d */
        private C3033e f8637d;

        /* renamed from: e */
        private C3032b f8638e;

        C3025b() {
        }

        /* renamed from: a */
        public C3031a mo9780a(C3032b bVar) {
            this.f8638e = bVar;
            return this;
        }

        /* renamed from: a */
        public C3031a mo9781a(C3033e eVar) {
            this.f8637d = eVar;
            return this;
        }

        /* renamed from: a */
        public C3031a mo9782a(String str) {
            this.f8635b = str;
            return this;
        }

        /* renamed from: a */
        public C3030d mo9783a() {
            C3023a aVar = new C3023a(this.f8634a, this.f8635b, this.f8636c, this.f8637d, this.f8638e);
            return aVar;
        }

        /* renamed from: b */
        public C3031a mo9784b(String str) {
            this.f8636c = str;
            return this;
        }

        /* renamed from: c */
        public C3031a mo9785c(String str) {
            this.f8634a = str;
            return this;
        }
    }

    private C3023a(String str, String str2, String str3, C3033e eVar, C3032b bVar) {
        this.f8629a = str;
        this.f8630b = str2;
        this.f8631c = str3;
        this.f8632d = eVar;
        this.f8633e = bVar;
    }

    /* renamed from: a */
    public C3033e mo9772a() {
        return this.f8632d;
    }

    /* renamed from: b */
    public String mo9773b() {
        return this.f8630b;
    }

    /* renamed from: c */
    public String mo9774c() {
        return this.f8631c;
    }

    /* renamed from: d */
    public C3032b mo9775d() {
        return this.f8633e;
    }

    /* renamed from: e */
    public String mo9776e() {
        return this.f8629a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3030d)) {
            return false;
        }
        C3030d dVar = (C3030d) obj;
        String str = this.f8629a;
        if (str != null ? str.equals(dVar.mo9776e()) : dVar.mo9776e() == null) {
            String str2 = this.f8630b;
            if (str2 != null ? str2.equals(dVar.mo9773b()) : dVar.mo9773b() == null) {
                String str3 = this.f8631c;
                if (str3 != null ? str3.equals(dVar.mo9774c()) : dVar.mo9774c() == null) {
                    C3033e eVar = this.f8632d;
                    if (eVar != null ? eVar.equals(dVar.mo9772a()) : dVar.mo9772a() == null) {
                        C3032b bVar = this.f8633e;
                        C3032b d = dVar.mo9775d();
                        if (bVar != null) {
                        }
                    }
                }
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        String str = this.f8629a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f8630b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f8631c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C3033e eVar = this.f8632d;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        C3032b bVar = this.f8633e;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InstallationResponse{uri=");
        sb.append(this.f8629a);
        sb.append(", fid=");
        sb.append(this.f8630b);
        sb.append(", refreshToken=");
        sb.append(this.f8631c);
        sb.append(", authToken=");
        sb.append(this.f8632d);
        sb.append(", responseCode=");
        sb.append(this.f8633e);
        sb.append("}");
        return sb.toString();
    }
}
