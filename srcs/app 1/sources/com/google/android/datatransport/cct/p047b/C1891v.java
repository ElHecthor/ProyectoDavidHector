package com.google.android.datatransport.cct.p047b;

import com.google.firebase.p057e.C2905c;
import com.google.firebase.p057e.C2906d;

/* renamed from: com.google.android.datatransport.cct.b.v */
public final class C1891v implements C2905c<C1870j> {
    /* renamed from: a */
    public void mo6324a(Object obj, Object obj2) {
        C1870j jVar = (C1870j) obj;
        C2906d dVar = (C2906d) obj2;
        if (jVar.mo6387b() != null) {
            dVar.mo9588a("mobileSubtype", (Object) jVar.mo6387b().name());
        }
        if (jVar.mo6388c() != null) {
            dVar.mo9588a("networkType", (Object) jVar.mo6388c().name());
        }
    }
}
