package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C1995b;
import com.google.android.gms.common.api.C2004g;
import com.google.android.gms.common.api.C2071k;
import com.google.android.gms.common.api.Status;
import p147g.p156d.p157a.p167b.p184g.C4350h;
import p147g.p156d.p157a.p167b.p184g.C4351i;

/* renamed from: com.google.android.gms.common.internal.r */
public class C2144r {

    /* renamed from: a */
    private static final C2146b f6102a = new C2112d0();

    /* renamed from: com.google.android.gms.common.internal.r$a */
    public interface C2145a<R extends C2071k, T> {
        /* renamed from: a */
        T mo6516a(R r);
    }

    /* renamed from: com.google.android.gms.common.internal.r$b */
    public interface C2146b {
        /* renamed from: a */
        C1995b mo6880a(Status status);
    }

    /* renamed from: a */
    public static <R extends C2071k> C4350h<Void> m8827a(C2004g<R> gVar) {
        return m8828a(gVar, new C2116f0());
    }

    /* renamed from: a */
    public static <R extends C2071k, T> C4350h<T> m8828a(C2004g<R> gVar, C2145a<R, T> aVar) {
        C2146b bVar = f6102a;
        C4351i iVar = new C4351i();
        gVar.mo6631a(new C2114e0(gVar, iVar, aVar, bVar));
        return iVar.mo13025a();
    }
}
