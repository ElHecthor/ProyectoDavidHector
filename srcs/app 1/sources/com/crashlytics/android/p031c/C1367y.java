package com.crashlytics.android.p031c;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.crashlytics.android.p031c.C1349j.C1351b;
import java.util.concurrent.ScheduledExecutorService;
import p242i.p243a.p244a.p245a.C4776a;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4792i;
import p242i.p243a.p244a.p245a.C4795l;
import p242i.p243a.p244a.p245a.p246n.p248b.C4823o;
import p242i.p243a.p244a.p245a.p246n.p248b.C4830s;
import p242i.p243a.p244a.p245a.p246n.p252e.C4885b;
import p242i.p243a.p244a.p245a.p246n.p253f.C4902b;
import p242i.p243a.p244a.p245a.p246n.p254g.C4906b;

/* renamed from: com.crashlytics.android.c.y */
class C1367y implements C1351b {

    /* renamed from: a */
    private final long f4426a;

    /* renamed from: b */
    final C1336d f4427b;

    /* renamed from: c */
    final C4776a f4428c;

    /* renamed from: d */
    final C1349j f4429d;

    /* renamed from: e */
    final C1346g f4430e;

    C1367y(C1336d dVar, C4776a aVar, C1349j jVar, C1346g gVar, long j) {
        this.f4427b = dVar;
        this.f4428c = aVar;
        this.f4429d = jVar;
        this.f4430e = gVar;
        this.f4426a = j;
    }

    /* renamed from: a */
    public static C1367y m6321a(C4792i iVar, Context context, C4830s sVar, String str, String str2, long j) {
        Context context2 = context;
        C4830s sVar2 = sVar;
        C1343d0 d0Var = new C1343d0(context, sVar, str, str2);
        C4792i iVar2 = iVar;
        C1344e eVar = new C1344e(context, new C4902b(iVar));
        C4885b bVar = new C4885b(C4781c.m19229f());
        C4776a aVar = new C4776a(context);
        ScheduledExecutorService b = C4823o.m19408b("Answers Events Handler");
        C1349j jVar = new C1349j(b);
        C1336d dVar = new C1336d(iVar2, context, eVar, d0Var, bVar, b, new C1356o(context));
        C1367y yVar = new C1367y(dVar, aVar, jVar, C1346g.m6257a(context), j);
        return yVar;
    }

    /* renamed from: a */
    public void mo5449a() {
        C4781c.m19229f().mo13796e("Answers", "Flush events when app is backgrounded");
        this.f4427b.mo5422c();
    }

    /* renamed from: a */
    public void mo5473a(long j) {
        C4781c.m19229f().mo13796e("Answers", "Logged install");
        this.f4427b.mo5421b(C1328a0.m6213a(j));
    }

    /* renamed from: a */
    public void mo5474a(Activity activity, C1331c cVar) {
        C4795l f = C4781c.m19229f();
        StringBuilder sb = new StringBuilder();
        sb.append("Logged lifecycle event: ");
        sb.append(cVar.name());
        f.mo13796e("Answers", sb.toString());
        this.f4427b.mo5416a(C1328a0.m6214a(cVar, activity));
    }

    /* renamed from: a */
    public void mo5475a(C4906b bVar, String str) {
        this.f4429d.mo5446a(bVar.f12762i);
        this.f4427b.mo5418a(bVar, str);
    }

    /* renamed from: a */
    public void mo5476a(String str) {
    }

    /* renamed from: a */
    public void mo5477a(String str, String str2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C4781c.m19229f().mo13796e("Answers", "Logged crash");
            this.f4427b.mo5423c(C1328a0.m6216a(str, str2));
            return;
        }
        throw new IllegalStateException("onCrash called from main thread!!!");
    }

    /* renamed from: b */
    public void mo5478b() {
        this.f4428c.mo13776a();
        this.f4427b.mo5415a();
    }

    /* renamed from: c */
    public void mo5479c() {
        this.f4427b.mo5420b();
        this.f4428c.mo13777a(new C1345f(this, this.f4429d));
        this.f4429d.mo5445a((C1351b) this);
        if (mo5480d()) {
            mo5473a(this.f4426a);
            this.f4430e.mo5440b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo5480d() {
        return !this.f4430e.mo5439a();
    }
}
