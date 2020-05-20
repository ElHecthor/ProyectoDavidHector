package p242i.p243a.p244a.p245a.p246n.p254g;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4792i;
import p242i.p243a.p244a.p245a.p246n.p248b.C4811g;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;
import p242i.p243a.p244a.p245a.p246n.p248b.C4820l;
import p242i.p243a.p244a.p245a.p246n.p248b.C4821m;
import p242i.p243a.p244a.p245a.p246n.p248b.C4830s;
import p242i.p243a.p244a.p245a.p246n.p248b.C4840w;
import p242i.p243a.p244a.p245a.p246n.p252e.C4896e;

/* renamed from: i.a.a.a.n.g.q */
public class C4921q {

    /* renamed from: a */
    private final AtomicReference<C4926t> f12806a;

    /* renamed from: b */
    private final CountDownLatch f12807b;

    /* renamed from: c */
    private C4925s f12808c;

    /* renamed from: d */
    private boolean f12809d;

    /* renamed from: i.a.a.a.n.g.q$b */
    static class C4923b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C4921q f12810a = new C4921q();
    }

    private C4921q() {
        this.f12806a = new AtomicReference<>();
        this.f12807b = new CountDownLatch(1);
        this.f12809d = false;
    }

    /* renamed from: a */
    private void m19714a(C4926t tVar) {
        this.f12806a.set(tVar);
        this.f12807b.countDown();
    }

    /* renamed from: d */
    public static C4921q m19715d() {
        return C4923b.f12810a;
    }

    /* renamed from: a */
    public synchronized C4921q mo14070a(C4792i iVar, C4830s sVar, C4896e eVar, String str, String str2, String str3, C4820l lVar) {
        C4792i iVar2 = iVar;
        synchronized (this) {
            if (this.f12809d) {
                return this;
            }
            if (this.f12808c == null) {
                Context i = iVar.mo13833i();
                String c = sVar.mo13892c();
                String d = new C4811g().mo13870d(i);
                String f = sVar.mo13895f();
                C4840w wVar = new C4840w();
                C4915k kVar = new C4915k();
                C4913i iVar3 = new C4913i(iVar2);
                String c2 = C4813i.m19377c(i);
                String str4 = str3;
                C4916l lVar2 = new C4916l(iVar2, str4, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[]{c}), eVar);
                String g = sVar.mo13896g();
                String str5 = g;
                String str6 = str2;
                String str7 = str;
                C4929w wVar2 = new C4929w(d, str5, sVar.mo13897h(), sVar.mo13898i(), sVar.mo13893d(), C4813i.m19362a(C4813i.m19392n(i)), str6, str7, C4821m.m19402a(f).mo13880f(), c2);
                C4914j jVar = new C4914j(iVar, wVar2, wVar, kVar, iVar3, lVar2, lVar);
                this.f12808c = jVar;
            }
            this.f12809d = true;
            return this;
        }
    }

    /* renamed from: a */
    public C4926t mo14071a() {
        try {
            this.f12807b.await();
            return (C4926t) this.f12806a.get();
        } catch (InterruptedException unused) {
            C4781c.m19229f().mo13792c("Fabric", "Interrupted while waiting for settings data.");
            return null;
        }
    }

    /* renamed from: b */
    public synchronized boolean mo14072b() {
        C4926t a;
        a = this.f12808c.mo14060a();
        m19714a(a);
        return a != null;
    }

    /* renamed from: c */
    public synchronized boolean mo14073c() {
        C4926t a;
        a = this.f12808c.mo14061a(C4924r.SKIP_CACHE_LOOKUP);
        m19714a(a);
        if (a == null) {
            C4781c.m19229f().mo13793c("Fabric", "Failed to force reload of settings from Crashlytics.", null);
        }
        return a != null;
    }
}
