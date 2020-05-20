package com.google.android.datatransport.cct.p047b;

import com.google.firebase.p057e.C2905c;
import com.google.firebase.p057e.C2906d;

/* renamed from: com.google.android.datatransport.cct.b.q */
public final class C1882q implements C2905c<C1863g> {
    /* renamed from: a */
    public void mo6324a(Object obj, Object obj2) {
        C1863g gVar = (C1863g) obj;
        C2906d dVar = (C2906d) obj2;
        String str = "eventUptimeMs";
        String str2 = "timezoneOffsetSeconds";
        dVar.mo9587a("eventTimeMs", gVar.mo6348a()).mo9587a(str, gVar.mo6349b()).mo9587a(str2, gVar.mo6350c());
        if (gVar.mo6354f() != null) {
            dVar.mo9588a("sourceExtension", (Object) gVar.mo6354f());
        }
        if (gVar.mo6355g() != null) {
            dVar.mo9588a("sourceExtensionJsonProto3", (Object) gVar.mo6355g());
        }
        if (gVar.mo6351d() != Integer.MIN_VALUE) {
            dVar.mo9586a("eventCode", gVar.mo6351d());
        }
        if (gVar.mo6352e() != null) {
            dVar.mo9588a("networkConnectionInfo", (Object) gVar.mo6352e());
        }
    }
}
