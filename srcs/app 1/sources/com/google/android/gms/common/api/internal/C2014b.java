package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C1981a;
import com.google.android.gms.common.api.C1981a.C1985d;
import com.google.android.gms.common.internal.C2141q;

/* renamed from: com.google.android.gms.common.api.internal.b */
public final class C2014b<O extends C1985d> {

    /* renamed from: a */
    private final boolean f5843a = false;

    /* renamed from: b */
    private final int f5844b;

    /* renamed from: c */
    private final C1981a<O> f5845c;

    /* renamed from: d */
    private final O f5846d;

    private C2014b(C1981a<O> aVar, O o) {
        this.f5845c = aVar;
        this.f5846d = o;
        this.f5844b = C2141q.m8821a(aVar, o);
    }

    /* renamed from: a */
    public static <O extends C1985d> C2014b<O> m8397a(C1981a<O> aVar, O o) {
        return new C2014b<>(aVar, o);
    }

    /* renamed from: a */
    public final String mo6651a() {
        return this.f5845c.mo6592b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2014b)) {
            return false;
        }
        C2014b bVar = (C2014b) obj;
        return !this.f5843a && !bVar.f5843a && C2141q.m8823a(this.f5845c, bVar.f5845c) && C2141q.m8823a(this.f5846d, bVar.f5846d);
    }

    public final int hashCode() {
        return this.f5844b;
    }
}
