package com.crashlytics.android.p031c;

import android.annotation.SuppressLint;
import android.content.Context;
import p242i.p243a.p244a.p245a.p246n.p253f.C4903c;
import p242i.p243a.p244a.p245a.p246n.p253f.C4904d;

/* renamed from: com.crashlytics.android.c.g */
class C1346g {

    /* renamed from: a */
    private final C4903c f4384a;

    C1346g(C4903c cVar) {
        this.f4384a = cVar;
    }

    /* renamed from: a */
    public static C1346g m6257a(Context context) {
        return new C1346g(new C4904d(context, "settings"));
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    public boolean mo5439a() {
        return this.f4384a.get().getBoolean("analytics_launched", false);
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: b */
    public void mo5440b() {
        C4903c cVar = this.f4384a;
        cVar.mo14053a(cVar.mo14052a().putBoolean("analytics_launched", true));
    }
}
