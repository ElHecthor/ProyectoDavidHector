package p242i.p243a.p244a.p245a;

import p242i.p243a.p244a.p245a.p246n.p248b.C4841x;
import p242i.p243a.p244a.p245a.p246n.p249c.C4856e;
import p242i.p243a.p244a.p245a.p246n.p249c.C4857f;
import p242i.p243a.p244a.p245a.p246n.p249c.C4867m;

/* renamed from: i.a.a.a.h */
class C4791h<Result> extends C4857f<Void, Void, Result> {

    /* renamed from: t */
    final C4792i<Result> f12521t;

    public C4791h(C4792i<Result> iVar) {
        this.f12521t = iVar;
    }

    /* renamed from: a */
    private C4841x m19258a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12521t.mo5401n());
        sb.append(".");
        sb.append(str);
        C4841x xVar = new C4841x(sb.toString(), "KitInitialization");
        xVar.mo13916a();
        return xVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Result mo13822a(Void... voidArr) {
        C4841x a = m19258a("doInBackground");
        Result h = !mo13922j() ? this.f12521t.mo5400h() : null;
        a.mo13917b();
        return h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo13824b(Result result) {
        this.f12521t.mo13829a(result);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12521t.mo5401n());
        sb.append(" Initialization was cancelled");
        this.f12521t.f12525i.mo13808a((Exception) new C4790g(sb.toString()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo13825c(Result result) {
        this.f12521t.mo13830b(result);
        this.f12521t.f12525i.mo13809a(result);
    }

    /* renamed from: k */
    public C4856e mo5636k() {
        return C4856e.HIGH;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo13826l() {
        super.mo13826l();
        C4841x a = m19258a("onPreExecute");
        try {
            boolean s = this.f12521t.mo5409s();
            a.mo13917b();
            if (s) {
                return;
            }
        } catch (C4867m e) {
            throw e;
        } catch (Exception e2) {
            C4781c.m19229f().mo13793c("Fabric", "Failure onPreExecute()", e2);
            a.mo13917b();
        } catch (Throwable th) {
            a.mo13917b();
            mo13920b(true);
            throw th;
        }
        mo13920b(true);
    }
}
