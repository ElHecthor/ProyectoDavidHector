package com.google.firebase.installations.p065r;

import com.google.firebase.installations.p065r.C3033e.C3034a;
import com.google.firebase.installations.p065r.C3033e.C3035b;

/* renamed from: com.google.firebase.installations.r.b */
final class C3026b extends C3033e {

    /* renamed from: a */
    private final String f8639a;

    /* renamed from: b */
    private final long f8640b;

    /* renamed from: c */
    private final C3035b f8641c;

    /* renamed from: com.google.firebase.installations.r.b$b */
    static final class C3028b extends C3034a {

        /* renamed from: a */
        private String f8642a;

        /* renamed from: b */
        private Long f8643b;

        /* renamed from: c */
        private C3035b f8644c;

        C3028b() {
        }

        /* renamed from: a */
        public C3034a mo9792a(long j) {
            this.f8643b = Long.valueOf(j);
            return this;
        }

        /* renamed from: a */
        public C3034a mo9793a(C3035b bVar) {
            this.f8644c = bVar;
            return this;
        }

        /* renamed from: a */
        public C3034a mo9794a(String str) {
            this.f8642a = str;
            return this;
        }

        /* renamed from: a */
        public C3033e mo9795a() {
            String str = "";
            if (this.f8643b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" tokenExpirationTimestamp");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                C3026b bVar = new C3026b(this.f8642a, this.f8643b.longValue(), this.f8644c);
                return bVar;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private C3026b(String str, long j, C3035b bVar) {
        this.f8639a = str;
        this.f8640b = j;
        this.f8641c = bVar;
    }

    /* renamed from: a */
    public C3035b mo9786a() {
        return this.f8641c;
    }

    /* renamed from: b */
    public String mo9787b() {
        return this.f8639a;
    }

    /* renamed from: c */
    public long mo9788c() {
        return this.f8640b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3033e)) {
            return false;
        }
        C3033e eVar = (C3033e) obj;
        String str = this.f8639a;
        if (str != null ? str.equals(eVar.mo9787b()) : eVar.mo9787b() == null) {
            if (this.f8640b == eVar.mo9788c()) {
                C3035b bVar = this.f8641c;
                C3035b a = eVar.mo9786a();
                if (bVar != null) {
                }
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        String str = this.f8639a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        long j = this.f8640b;
        int i2 = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        C3035b bVar = this.f8641c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TokenResult{token=");
        sb.append(this.f8639a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f8640b);
        sb.append(", responseCode=");
        sb.append(this.f8641c);
        sb.append("}");
        return sb.toString();
    }
}
