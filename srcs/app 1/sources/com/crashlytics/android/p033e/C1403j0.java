package com.crashlytics.android.p033e;

import android.annotation.SuppressLint;
import p242i.p243a.p244a.p245a.p246n.p253f.C4903c;
import p242i.p243a.p244a.p245a.p246n.p253f.C4904d;

@SuppressLint({"CommitPrefEdits"})
/* renamed from: com.crashlytics.android.e.j0 */
class C1403j0 {

    /* renamed from: a */
    private final C4903c f4478a;

    /* renamed from: b */
    private final C1448l f4479b;

    public C1403j0(C4903c cVar, C1448l lVar) {
        this.f4478a = cVar;
        this.f4479b = lVar;
    }

    /* renamed from: a */
    public static C1403j0 m6473a(C4903c cVar, C1448l lVar) {
        return new C1403j0(cVar, lVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5566a(boolean z) {
        C4903c cVar = this.f4478a;
        cVar.mo14053a(cVar.mo14052a().putBoolean("always_send_reports_opt_in", z));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5567a() {
        String str = "preferences_migration_complete";
        String str2 = "always_send_reports_opt_in";
        if (!this.f4478a.get().contains(str)) {
            C4904d dVar = new C4904d(this.f4479b);
            if (!this.f4478a.get().contains(str2) && dVar.get().contains(str2)) {
                boolean z = dVar.get().getBoolean(str2, false);
                C4903c cVar = this.f4478a;
                cVar.mo14053a(cVar.mo14052a().putBoolean(str2, z));
            }
            C4903c cVar2 = this.f4478a;
            cVar2.mo14053a(cVar2.mo14052a().putBoolean(str, true));
        }
        return this.f4478a.get().getBoolean(str2, false);
    }
}
