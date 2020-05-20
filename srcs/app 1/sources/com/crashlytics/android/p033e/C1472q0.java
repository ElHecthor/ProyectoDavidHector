package com.crashlytics.android.p033e;

import android.content.Context;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;

/* renamed from: com.crashlytics.android.e.q0 */
class C1472q0 implements C1489w0 {

    /* renamed from: a */
    private final Context f4631a;

    /* renamed from: b */
    private final C1489w0 f4632b;

    /* renamed from: c */
    private boolean f4633c = false;

    /* renamed from: d */
    private String f4634d;

    public C1472q0(Context context, C1489w0 w0Var) {
        this.f4631a = context;
        this.f4632b = w0Var;
    }

    /* renamed from: a */
    public String mo5496a() {
        if (!this.f4633c) {
            this.f4634d = C4813i.m19393o(this.f4631a);
            this.f4633c = true;
        }
        String str = this.f4634d;
        if (str != null) {
            return str;
        }
        C1489w0 w0Var = this.f4632b;
        if (w0Var != null) {
            return w0Var.mo5496a();
        }
        return null;
    }
}
