package com.crashlytics.android.p031c;

import android.content.Context;
import java.util.Map;
import java.util.UUID;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;
import p242i.p243a.p244a.p245a.p246n.p248b.C4830s;
import p242i.p243a.p244a.p245a.p246n.p248b.C4830s.C4831a;

/* renamed from: com.crashlytics.android.c.d0 */
class C1343d0 {

    /* renamed from: a */
    private final Context f4376a;

    /* renamed from: b */
    private final C4830s f4377b;

    /* renamed from: c */
    private final String f4378c;

    /* renamed from: d */
    private final String f4379d;

    public C1343d0(Context context, C4830s sVar, String str, String str2) {
        this.f4376a = context;
        this.f4377b = sVar;
        this.f4378c = str;
        this.f4379d = str2;
    }

    /* renamed from: a */
    public C1333b0 mo5430a() {
        Map e = this.f4377b.mo13894e();
        C1333b0 b0Var = new C1333b0(this.f4377b.mo13892c(), UUID.randomUUID().toString(), this.f4377b.mo13893d(), this.f4377b.mo13900k(), (String) e.get(C4831a.FONT_TOKEN), C4813i.m19392n(this.f4376a), this.f4377b.mo13899j(), this.f4377b.mo13896g(), this.f4378c, this.f4379d);
        return b0Var;
    }
}
