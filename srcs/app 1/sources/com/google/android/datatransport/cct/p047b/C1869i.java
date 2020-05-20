package com.google.android.datatransport.cct.p047b;

/* renamed from: com.google.android.datatransport.cct.b.i */
final class C1869i extends C1886t {

    /* renamed from: a */
    private final long f5552a;

    C1869i(long j) {
        this.f5552a = j;
    }

    /* renamed from: a */
    public long mo6383a() {
        return this.f5552a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1886t)) {
            return false;
        }
        if (this.f5552a != ((C1886t) obj).mo6383a()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long j = this.f5552a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LogResponse{nextRequestWaitMillis=");
        sb.append(this.f5552a);
        sb.append("}");
        return sb.toString();
    }
}
