package com.crashlytics.android.p031c;

import java.io.File;
import java.util.List;
import p242i.p243a.p244a.p245a.p246n.p249c.p250n.C4869b;
import p242i.p243a.p244a.p245a.p246n.p249c.p250n.C4870c;
import p242i.p243a.p244a.p245a.p246n.p249c.p250n.C4872e;
import p242i.p243a.p244a.p245a.p246n.p251d.C4880f;

/* renamed from: com.crashlytics.android.c.h */
class C1347h implements C4880f {

    /* renamed from: a */
    private final C1366x f4385a;

    /* renamed from: b */
    private final C1362u f4386b;

    C1347h(C1366x xVar, C1362u uVar) {
        this.f4385a = xVar;
        this.f4386b = uVar;
    }

    /* renamed from: a */
    public static C1347h m6260a(C1366x xVar) {
        return new C1347h(xVar, new C1362u(new C4872e(new C1361t(new C4870c(1000, 8), 0.1d), new C4869b(5))));
    }

    /* renamed from: a */
    public boolean mo5441a(List<File> list) {
        long nanoTime = System.nanoTime();
        if (this.f4386b.mo5467a(nanoTime)) {
            if (this.f4385a.mo5441a(list)) {
                this.f4386b.mo5466a();
                return true;
            }
            this.f4386b.mo5468b(nanoTime);
        }
        return false;
    }
}
