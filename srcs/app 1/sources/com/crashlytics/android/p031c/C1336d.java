package com.crashlytics.android.p031c;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4792i;
import p242i.p243a.p244a.p245a.p246n.p251d.C4878d;
import p242i.p243a.p244a.p245a.p246n.p252e.C4896e;
import p242i.p243a.p244a.p245a.p246n.p254g.C4906b;

/* renamed from: com.crashlytics.android.c.d */
class C1336d implements C4878d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4792i f4358a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f4359b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1344e f4360c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1343d0 f4361d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C4896e f4362e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1356o f4363f;

    /* renamed from: g */
    final ScheduledExecutorService f4364g;

    /* renamed from: h */
    C1368z f4365h = new C1352k();

    /* renamed from: com.crashlytics.android.c.d$a */
    class C1337a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C4906b f4366f;

        /* renamed from: g */
        final /* synthetic */ String f4367g;

        C1337a(C4906b bVar, String str) {
            this.f4366f = bVar;
            this.f4367g = str;
        }

        public void run() {
            try {
                C1336d.this.f4365h.mo5452a(this.f4366f, this.f4367g);
            } catch (Exception e) {
                C4781c.m19229f().mo13793c("Answers", "Failed to set analytics settings data", e);
            }
        }
    }

    /* renamed from: com.crashlytics.android.c.d$b */
    class C1338b implements Runnable {
        C1338b() {
        }

        public void run() {
            try {
                C1368z zVar = C1336d.this.f4365h;
                C1336d.this.f4365h = new C1352k();
                zVar.mo5455d();
            } catch (Exception e) {
                C4781c.m19229f().mo13793c("Answers", "Failed to disable events", e);
            }
        }
    }

    /* renamed from: com.crashlytics.android.c.d$c */
    class C1339c implements Runnable {
        C1339c() {
        }

        public void run() {
            try {
                C1336d.this.f4365h.mo5450a();
            } catch (Exception e) {
                C4781c.m19229f().mo13793c("Answers", "Failed to send events files", e);
            }
        }
    }

    /* renamed from: com.crashlytics.android.c.d$d */
    class C1340d implements Runnable {
        C1340d() {
        }

        public void run() {
            try {
                C1333b0 a = C1336d.this.f4361d.mo5430a();
                C1365w a2 = C1336d.this.f4360c.mo5431a();
                a2.mo13978a((C4878d) C1336d.this);
                C1336d dVar = C1336d.this;
                C1353l lVar = new C1353l(C1336d.this.f4358a, C1336d.this.f4359b, C1336d.this.f4364g, a2, C1336d.this.f4362e, a, C1336d.this.f4363f);
                dVar.f4365h = lVar;
            } catch (Exception e) {
                C4781c.m19229f().mo13793c("Answers", "Failed to enable events", e);
            }
        }
    }

    /* renamed from: com.crashlytics.android.c.d$e */
    class C1341e implements Runnable {
        C1341e() {
        }

        public void run() {
            try {
                C1336d.this.f4365h.mo5453b();
            } catch (Exception e) {
                C4781c.m19229f().mo13793c("Answers", "Failed to flush events", e);
            }
        }
    }

    /* renamed from: com.crashlytics.android.c.d$f */
    class C1342f implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1330b f4373f;

        /* renamed from: g */
        final /* synthetic */ boolean f4374g;

        C1342f(C1330b bVar, boolean z) {
            this.f4373f = bVar;
            this.f4374g = z;
        }

        public void run() {
            try {
                C1336d.this.f4365h.mo5451a(this.f4373f);
                if (this.f4374g) {
                    C1336d.this.f4365h.mo5453b();
                }
            } catch (Exception e) {
                C4781c.m19229f().mo13793c("Answers", "Failed to process event", e);
            }
        }
    }

    public C1336d(C4792i iVar, Context context, C1344e eVar, C1343d0 d0Var, C4896e eVar2, ScheduledExecutorService scheduledExecutorService, C1356o oVar) {
        this.f4358a = iVar;
        this.f4359b = context;
        this.f4360c = eVar;
        this.f4361d = d0Var;
        this.f4362e = eVar2;
        this.f4364g = scheduledExecutorService;
        this.f4363f = oVar;
    }

    /* renamed from: a */
    private void m6232a(Runnable runnable) {
        try {
            this.f4364g.submit(runnable);
        } catch (Exception e) {
            C4781c.m19229f().mo13793c("Answers", "Failed to submit events task", e);
        }
    }

    /* renamed from: b */
    private void m6234b(Runnable runnable) {
        try {
            this.f4364g.submit(runnable).get();
        } catch (Exception e) {
            C4781c.m19229f().mo13793c("Answers", "Failed to run events task", e);
        }
    }

    /* renamed from: a */
    public void mo5415a() {
        m6232a((Runnable) new C1338b());
    }

    /* renamed from: a */
    public void mo5416a(C1330b bVar) {
        mo5417a(bVar, false, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5417a(C1330b bVar, boolean z, boolean z2) {
        C1342f fVar = new C1342f(bVar, z2);
        if (z) {
            m6234b((Runnable) fVar);
        } else {
            m6232a((Runnable) fVar);
        }
    }

    /* renamed from: a */
    public void mo5418a(C4906b bVar, String str) {
        m6232a((Runnable) new C1337a(bVar, str));
    }

    /* renamed from: a */
    public void mo5419a(String str) {
        m6232a((Runnable) new C1339c());
    }

    /* renamed from: b */
    public void mo5420b() {
        m6232a((Runnable) new C1340d());
    }

    /* renamed from: b */
    public void mo5421b(C1330b bVar) {
        mo5417a(bVar, false, true);
    }

    /* renamed from: c */
    public void mo5422c() {
        m6232a((Runnable) new C1341e());
    }

    /* renamed from: c */
    public void mo5423c(C1330b bVar) {
        mo5417a(bVar, true, false);
    }
}
