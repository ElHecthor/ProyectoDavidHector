package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.C1907g.C1908a;

/* renamed from: com.google.android.datatransport.runtime.backends.b */
final class C1901b extends C1907g {

    /* renamed from: a */
    private final C1908a f5621a;

    /* renamed from: b */
    private final long f5622b;

    C1901b(C1908a aVar, long j) {
        if (aVar != null) {
            this.f5621a = aVar;
            this.f5622b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    /* renamed from: a */
    public long mo6413a() {
        return this.f5622b;
    }

    /* renamed from: b */
    public C1908a mo6414b() {
        return this.f5621a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1907g)) {
            return false;
        }
        C1907g gVar = (C1907g) obj;
        if (!this.f5621a.equals(gVar.mo6414b()) || this.f5622b != gVar.mo6413a()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = (this.f5621a.hashCode() ^ 1000003) * 1000003;
        long j = this.f5622b;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BackendResponse{status=");
        sb.append(this.f5621a);
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f5622b);
        sb.append("}");
        return sb.toString();
    }
}
