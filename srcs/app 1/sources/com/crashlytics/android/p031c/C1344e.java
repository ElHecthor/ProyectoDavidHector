package com.crashlytics.android.p031c;

import android.content.Context;
import android.os.Looper;
import p242i.p243a.p244a.p245a.p246n.p248b.C4840w;
import p242i.p243a.p244a.p245a.p246n.p251d.C4881g;
import p242i.p243a.p244a.p245a.p246n.p253f.C4901a;

/* renamed from: com.crashlytics.android.c.e */
class C1344e {

    /* renamed from: a */
    final Context f4380a;

    /* renamed from: b */
    final C4901a f4381b;

    public C1344e(Context context, C4901a aVar) {
        this.f4380a = context;
        this.f4381b = aVar;
    }

    /* renamed from: a */
    public C1365w mo5431a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return new C1365w(this.f4380a, new C1335c0(), new C4840w(), new C4881g(this.f4380a, this.f4381b.mo14050a(), "session_analytics.tap", "session_analytics_to_send"));
        }
        throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
    }
}
