package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1924g.C1926b;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1924g.C1926b.C1927a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1924g.C1928c;
import java.util.Set;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.d */
final class C1919d extends C1926b {

    /* renamed from: a */
    private final long f5652a;

    /* renamed from: b */
    private final long f5653b;

    /* renamed from: c */
    private final Set<C1928c> f5654c;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.d$b */
    static final class C1921b extends C1927a {

        /* renamed from: a */
        private Long f5655a;

        /* renamed from: b */
        private Long f5656b;

        /* renamed from: c */
        private Set<C1928c> f5657c;

        C1921b() {
        }

        /* renamed from: a */
        public C1927a mo6446a(long j) {
            this.f5655a = Long.valueOf(j);
            return this;
        }

        /* renamed from: a */
        public C1927a mo6447a(Set<C1928c> set) {
            if (set != null) {
                this.f5657c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        /* renamed from: a */
        public C1926b mo6448a() {
            String str = "";
            if (this.f5655a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" delta");
                str = sb.toString();
            }
            if (this.f5656b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" maxAllowedDelay");
                str = sb2.toString();
            }
            if (this.f5657c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" flags");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                C1919d dVar = new C1919d(this.f5655a.longValue(), this.f5656b.longValue(), this.f5657c);
                return dVar;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }

        /* renamed from: b */
        public C1927a mo6449b(long j) {
            this.f5656b = Long.valueOf(j);
            return this;
        }
    }

    private C1919d(long j, long j2, Set<C1928c> set) {
        this.f5652a = j;
        this.f5653b = j2;
        this.f5654c = set;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public long mo6440a() {
        return this.f5652a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Set<C1928c> mo6441b() {
        return this.f5654c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public long mo6442c() {
        return this.f5653b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1926b)) {
            return false;
        }
        C1926b bVar = (C1926b) obj;
        if (!(this.f5652a == bVar.mo6440a() && this.f5653b == bVar.mo6442c() && this.f5654c.equals(bVar.mo6441b()))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long j = this.f5652a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f5653b;
        return this.f5654c.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ConfigValue{delta=");
        sb.append(this.f5652a);
        sb.append(", maxAllowedDelay=");
        sb.append(this.f5653b);
        sb.append(", flags=");
        sb.append(this.f5654c);
        sb.append("}");
        return sb.toString();
    }
}
