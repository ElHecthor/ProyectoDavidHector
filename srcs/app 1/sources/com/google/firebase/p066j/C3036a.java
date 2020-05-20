package com.google.firebase.p066j;

import javax.annotation.Nonnull;

/* renamed from: com.google.firebase.j.a */
final class C3036a extends C3041f {

    /* renamed from: a */
    private final String f8657a;

    /* renamed from: b */
    private final String f8658b;

    C3036a(String str, String str2) {
        if (str != null) {
            this.f8657a = str;
            if (str2 != null) {
                this.f8658b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Nonnull
    /* renamed from: a */
    public String mo9798a() {
        return this.f8657a;
    }

    @Nonnull
    /* renamed from: b */
    public String mo9799b() {
        return this.f8658b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3041f)) {
            return false;
        }
        C3041f fVar = (C3041f) obj;
        if (!this.f8657a.equals(fVar.mo9798a()) || !this.f8658b.equals(fVar.mo9799b())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.f8657a.hashCode() ^ 1000003) * 1000003) ^ this.f8658b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LibraryVersion{libraryName=");
        sb.append(this.f8657a);
        sb.append(", version=");
        sb.append(this.f8658b);
        sb.append("}");
        return sb.toString();
    }
}
