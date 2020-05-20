package com.facebook.p034f0;

import android.content.Context;
import com.facebook.C1787m;
import com.facebook.internal.C1633a;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.facebook.f0.d */
class C1537d {

    /* renamed from: a */
    private final HashMap<C1528a, C1562o> f4801a = new HashMap<>();

    /* renamed from: b */
    private synchronized C1562o m6854b(C1528a aVar) {
        C1562o oVar;
        oVar = (C1562o) this.f4801a.get(aVar);
        if (oVar == null) {
            Context e = C1787m.m7744e();
            oVar = new C1562o(C1633a.m7170d(e), C1547g.m6880a(e));
        }
        this.f4801a.put(aVar, oVar);
        return oVar;
    }

    /* renamed from: a */
    public synchronized int mo5745a() {
        int i;
        i = 0;
        for (C1562o a : this.f4801a.values()) {
            i += a.mo5781a();
        }
        return i;
    }

    /* renamed from: a */
    public synchronized C1562o mo5746a(C1528a aVar) {
        return (C1562o) this.f4801a.get(aVar);
    }

    /* renamed from: a */
    public synchronized void mo5747a(C1528a aVar, C1533c cVar) {
        m6854b(aVar).mo5783a(cVar);
    }

    /* renamed from: a */
    public synchronized void mo5748a(C1559n nVar) {
        if (nVar != null) {
            for (C1528a aVar : nVar.mo5777a()) {
                C1562o b = m6854b(aVar);
                for (C1533c a : nVar.mo5780b(aVar)) {
                    b.mo5783a(a);
                }
            }
        }
    }

    /* renamed from: b */
    public synchronized Set<C1528a> mo5749b() {
        return this.f4801a.keySet();
    }
}
