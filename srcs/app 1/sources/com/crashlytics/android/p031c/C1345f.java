package com.crashlytics.android.p031c;

import android.app.Activity;
import android.os.Bundle;
import p242i.p243a.p244a.p245a.C4776a.C4779b;

/* renamed from: com.crashlytics.android.c.f */
class C1345f extends C4779b {

    /* renamed from: a */
    private final C1367y f4382a;

    /* renamed from: b */
    private final C1349j f4383b;

    public C1345f(C1367y yVar, C1349j jVar) {
        this.f4382a = yVar;
        this.f4383b = jVar;
    }

    /* renamed from: a */
    public void mo5432a(Activity activity) {
    }

    /* renamed from: a */
    public void mo5433a(Activity activity, Bundle bundle) {
    }

    /* renamed from: b */
    public void mo5434b(Activity activity) {
        this.f4382a.mo5474a(activity, C1331c.PAUSE);
        this.f4383b.mo5444a();
    }

    /* renamed from: b */
    public void mo5435b(Activity activity, Bundle bundle) {
    }

    /* renamed from: c */
    public void mo5436c(Activity activity) {
        this.f4382a.mo5474a(activity, C1331c.RESUME);
        this.f4383b.mo5447b();
    }

    /* renamed from: d */
    public void mo5437d(Activity activity) {
        this.f4382a.mo5474a(activity, C1331c.START);
    }

    /* renamed from: e */
    public void mo5438e(Activity activity) {
        this.f4382a.mo5474a(activity, C1331c.STOP);
    }
}
