package com.google.android.datatransport.cct.p047b;

import java.util.List;

/* renamed from: com.google.android.datatransport.cct.b.e */
final class C1859e extends C1873k {

    /* renamed from: a */
    private final List<C1883r> f5519a;

    C1859e(List<C1883r> list) {
        if (list != null) {
            this.f5519a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    /* renamed from: a */
    public List<C1883r> mo6336a() {
        return this.f5519a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1873k)) {
            return false;
        }
        return this.f5519a.equals(((C1873k) obj).mo6336a());
    }

    public int hashCode() {
        return this.f5519a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BatchedLogRequest{logRequests=");
        sb.append(this.f5519a);
        sb.append("}");
        return sb.toString();
    }
}
