package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.j */
public final class C2036j<L> {

    /* renamed from: a */
    private final L f5921a;

    /* renamed from: b */
    private final String f5922b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2036j)) {
            return false;
        }
        C2036j jVar = (C2036j) obj;
        return this.f5921a == jVar.f5921a && this.f5922b.equals(jVar.f5922b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f5921a) * 31) + this.f5922b.hashCode();
    }
}
