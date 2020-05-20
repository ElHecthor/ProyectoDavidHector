package com.google.android.datatransport.cct.p047b;

import com.google.firebase.p057e.C2904b;
import com.google.firebase.p057e.C2905c;
import com.google.firebase.p057e.C2906d;

/* renamed from: com.google.android.datatransport.cct.b.s */
public final class C1885s implements C2905c<C1866h> {
    /* renamed from: a */
    public void mo6324a(Object obj, Object obj2) {
        C1866h hVar = (C1866h) obj;
        C2906d dVar = (C2906d) obj2;
        String str = "requestUptimeMs";
        dVar.mo9587a("requestTimeMs", hVar.mo6371f()).mo9587a(str, hVar.mo6372g());
        if (hVar.mo6366b() != null) {
            dVar.mo9588a("clientInfo", (Object) hVar.mo6366b());
        }
        if (hVar.mo6369e() != null) {
            dVar.mo9588a("logSourceName", (Object) hVar.mo6369e());
        } else if (hVar.mo6368d() != Integer.MIN_VALUE) {
            dVar.mo9586a("logSource", hVar.mo6368d());
        } else {
            throw new C2904b("Log request must have either LogSourceName or LogSource");
        }
        if (!hVar.mo6367c().isEmpty()) {
            dVar.mo9588a("logEvent", (Object) hVar.mo6367c());
        }
    }
}
