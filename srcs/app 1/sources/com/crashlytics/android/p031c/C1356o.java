package com.crashlytics.android.p031c;

import android.content.Context;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4795l;

/* renamed from: com.crashlytics.android.c.o */
class C1356o {

    /* renamed from: a */
    private final Context f4411a;

    /* renamed from: b */
    private final C1358q f4412b;

    /* renamed from: c */
    private C1355n f4413c;

    public C1356o(Context context) {
        this(context, new C1358q());
    }

    public C1356o(Context context, C1358q qVar) {
        this.f4411a = context;
        this.f4412b = qVar;
    }

    /* renamed from: a */
    public C1355n mo5459a() {
        if (this.f4413c == null) {
            this.f4413c = C1348i.m6264b(this.f4411a);
        }
        return this.f4413c;
    }

    /* renamed from: a */
    public void mo5460a(C1328a0 a0Var) {
        C1355n a = mo5459a();
        String str = "Answers";
        if (a == null) {
            C4781c.m19229f().mo13796e(str, "Firebase analytics logging was enabled, but not available...");
            return;
        }
        C1357p a2 = this.f4412b.mo5463a(a0Var);
        if (a2 == null) {
            C4795l f = C4781c.m19229f();
            StringBuilder sb = new StringBuilder();
            sb.append("Fabric event was not mappable to Firebase event: ");
            sb.append(a0Var);
            f.mo13796e(str, sb.toString());
            return;
        }
        a.mo5442a(a2.mo5461a(), a2.mo5462b());
        if ("levelEnd".equals(a0Var.f4327g)) {
            a.mo5442a("post_score", a2.mo5462b());
        }
    }
}
