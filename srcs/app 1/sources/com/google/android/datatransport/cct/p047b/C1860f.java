package com.google.android.datatransport.cct.p047b;

import com.google.android.datatransport.cct.p047b.C1875m.C1876a;
import com.google.android.datatransport.cct.p047b.C1875m.C1877b;

/* renamed from: com.google.android.datatransport.cct.b.f */
final class C1860f extends C1875m {

    /* renamed from: a */
    private final C1877b f5520a;

    /* renamed from: b */
    private final C1852a f5521b;

    /* renamed from: com.google.android.datatransport.cct.b.f$b */
    static final class C1862b extends C1876a {

        /* renamed from: a */
        private C1877b f5522a;

        /* renamed from: b */
        private C1852a f5523b;

        C1862b() {
        }

        /* renamed from: a */
        public C1876a mo6345a(C1852a aVar) {
            this.f5523b = aVar;
            return this;
        }

        /* renamed from: a */
        public C1876a mo6346a(C1877b bVar) {
            this.f5522a = bVar;
            return this;
        }

        /* renamed from: a */
        public C1875m mo6347a() {
            return new C1860f(this.f5522a, this.f5523b, null);
        }
    }

    /* synthetic */ C1860f(C1877b bVar, C1852a aVar, C1861a aVar2) {
        this.f5520a = bVar;
        this.f5521b = aVar;
    }

    /* renamed from: b */
    public C1852a mo6340b() {
        return this.f5521b;
    }

    /* renamed from: c */
    public C1877b mo6341c() {
        return this.f5520a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1875m)) {
            return false;
        }
        C1877b bVar = this.f5520a;
        if (bVar != null ? bVar.equals(((C1860f) obj).f5520a) : ((C1860f) obj).f5520a == null) {
            C1852a aVar = this.f5521b;
            C1852a aVar2 = ((C1860f) obj).f5521b;
            if (aVar != null) {
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        C1877b bVar = this.f5520a;
        int i = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        C1852a aVar = this.f5521b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClientInfo{clientType=");
        sb.append(this.f5520a);
        sb.append(", androidClientInfo=");
        sb.append(this.f5521b);
        sb.append("}");
        return sb.toString();
    }
}
