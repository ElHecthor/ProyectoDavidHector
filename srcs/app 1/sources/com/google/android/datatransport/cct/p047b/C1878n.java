package com.google.android.datatransport.cct.p047b;

import com.google.firebase.p057e.C2905c;
import com.google.firebase.p057e.C2906d;

/* renamed from: com.google.android.datatransport.cct.b.n */
public final class C1878n implements C2905c<C1860f> {
    /* renamed from: a */
    public void mo6324a(Object obj, Object obj2) {
        C1860f fVar = (C1860f) obj;
        C2906d dVar = (C2906d) obj2;
        if (fVar.mo6341c() != null) {
            dVar.mo9588a("clientType", (Object) fVar.mo6341c().name());
        }
        if (fVar.mo6340b() != null) {
            dVar.mo9588a("androidClientInfo", (Object) fVar.mo6340b());
        }
    }
}
