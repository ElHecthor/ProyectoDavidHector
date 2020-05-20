package com.bumptech.glide.load.p007o;

import com.bumptech.glide.load.C0869g;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.o.d */
final class C0973d implements C0869g {

    /* renamed from: b */
    private final C0869g f3557b;

    /* renamed from: c */
    private final C0869g f3558c;

    C0973d(C0869g gVar, C0869g gVar2) {
        this.f3557b = gVar;
        this.f3558c = gVar2;
    }

    /* renamed from: a */
    public void mo4618a(MessageDigest messageDigest) {
        this.f3557b.mo4618a(messageDigest);
        this.f3558c.mo4618a(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0973d)) {
            return false;
        }
        C0973d dVar = (C0973d) obj;
        return this.f3557b.equals(dVar.f3557b) && this.f3558c.equals(dVar.f3558c);
    }

    public int hashCode() {
        return (this.f3557b.hashCode() * 31) + this.f3558c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataCacheKey{sourceKey=");
        sb.append(this.f3557b);
        sb.append(", signature=");
        sb.append(this.f3558c);
        sb.append('}');
        return sb.toString();
    }
}
