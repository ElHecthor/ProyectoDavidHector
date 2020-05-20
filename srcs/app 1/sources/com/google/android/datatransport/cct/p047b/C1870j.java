package com.google.android.datatransport.cct.p047b;

import com.google.android.datatransport.cct.p047b.C1887u.C1888a;
import com.google.android.datatransport.cct.p047b.C1887u.C1889b;
import com.google.android.datatransport.cct.p047b.C1887u.C1890c;

/* renamed from: com.google.android.datatransport.cct.b.j */
final class C1870j extends C1887u {

    /* renamed from: a */
    private final C1890c f5553a;

    /* renamed from: b */
    private final C1889b f5554b;

    /* renamed from: com.google.android.datatransport.cct.b.j$b */
    static final class C1872b extends C1888a {

        /* renamed from: a */
        private C1890c f5555a;

        /* renamed from: b */
        private C1889b f5556b;

        C1872b() {
        }

        /* renamed from: a */
        public C1888a mo6392a(C1889b bVar) {
            this.f5556b = bVar;
            return this;
        }

        /* renamed from: a */
        public C1888a mo6393a(C1890c cVar) {
            this.f5555a = cVar;
            return this;
        }

        /* renamed from: a */
        public C1887u mo6394a() {
            return new C1870j(this.f5555a, this.f5556b, null);
        }
    }

    /* synthetic */ C1870j(C1890c cVar, C1889b bVar, C1871a aVar) {
        this.f5553a = cVar;
        this.f5554b = bVar;
    }

    /* renamed from: b */
    public C1889b mo6387b() {
        return this.f5554b;
    }

    /* renamed from: c */
    public C1890c mo6388c() {
        return this.f5553a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1887u)) {
            return false;
        }
        C1890c cVar = this.f5553a;
        if (cVar != null ? cVar.equals(((C1870j) obj).f5553a) : ((C1870j) obj).f5553a == null) {
            C1889b bVar = this.f5554b;
            C1889b bVar2 = ((C1870j) obj).f5554b;
            if (bVar != null) {
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        C1890c cVar = this.f5553a;
        int i = 0;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        C1889b bVar = this.f5554b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NetworkConnectionInfo{networkType=");
        sb.append(this.f5553a);
        sb.append(", mobileSubtype=");
        sb.append(this.f5554b);
        sb.append("}");
        return sb.toString();
    }
}
