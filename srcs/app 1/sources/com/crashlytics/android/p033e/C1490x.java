package com.crashlytics.android.p033e;

import android.content.Context;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;
import p242i.p243a.p244a.p245a.p246n.p254g.C4919o;

/* renamed from: com.crashlytics.android.e.x */
class C1490x {

    /* renamed from: a */
    private final Context f4665a;

    /* renamed from: b */
    private final C4919o f4666b;

    public C1490x(Context context, C4919o oVar) {
        this.f4665a = context;
        this.f4666b = oVar;
    }

    /* renamed from: a */
    private String m6725a(String str, String str2) {
        return m6727b(C4813i.m19373b(this.f4665a, str), str2);
    }

    /* renamed from: a */
    private boolean m6726a(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: b */
    private String m6727b(String str, String str2) {
        return m6726a(str) ? str2 : str;
    }

    /* renamed from: a */
    public String mo5664a() {
        return m6725a("com.crashlytics.CrashSubmissionAlwaysSendTitle", this.f4666b.f12803g);
    }

    /* renamed from: b */
    public String mo5665b() {
        return m6725a("com.crashlytics.CrashSubmissionCancelTitle", this.f4666b.f12801e);
    }

    /* renamed from: c */
    public String mo5666c() {
        return m6725a("com.crashlytics.CrashSubmissionPromptMessage", this.f4666b.f12798b);
    }

    /* renamed from: d */
    public String mo5667d() {
        return m6725a("com.crashlytics.CrashSubmissionSendTitle", this.f4666b.f12799c);
    }

    /* renamed from: e */
    public String mo5668e() {
        return m6725a("com.crashlytics.CrashSubmissionPromptTitle", this.f4666b.f12797a);
    }
}
