package com.google.android.datatransport.cct.p047b;

import com.google.firebase.p057e.C2905c;
import com.google.firebase.p057e.C2906d;

/* renamed from: com.google.android.datatransport.cct.b.c */
public final class C1855c implements C2905c<C1856d> {
    /* renamed from: a */
    public void mo6324a(Object obj, Object obj2) {
        C1856d dVar = (C1856d) obj;
        C2906d dVar2 = (C2906d) obj2;
        if (dVar.mo6334i() != Integer.MIN_VALUE) {
            dVar2.mo9586a("sdkVersion", dVar.mo6334i());
        }
        if (dVar.mo6330f() != null) {
            dVar2.mo9588a("model", (Object) dVar.mo6330f());
        }
        if (dVar.mo6327d() != null) {
            dVar2.mo9588a("hardware", (Object) dVar.mo6327d());
        }
        if (dVar.mo6325b() != null) {
            dVar2.mo9588a("device", (Object) dVar.mo6325b());
        }
        if (dVar.mo6332h() != null) {
            dVar2.mo9588a("product", (Object) dVar.mo6332h());
        }
        if (dVar.mo6331g() != null) {
            dVar2.mo9588a("osBuild", (Object) dVar.mo6331g());
        }
        if (dVar.mo6328e() != null) {
            dVar2.mo9588a("manufacturer", (Object) dVar.mo6328e());
        }
        if (dVar.mo6326c() != null) {
            dVar2.mo9588a("fingerprint", (Object) dVar.mo6326c());
        }
    }
}
