package com.crashlytics.android.p031c;

import android.content.Context;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4792i;
import p242i.p243a.p244a.p245a.C4795l;
import p242i.p243a.p244a.p245a.p246n.p248b.C4811g;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;
import p242i.p243a.p244a.p245a.p246n.p251d.C4880f;
import p242i.p243a.p244a.p245a.p246n.p251d.C4883i;
import p242i.p243a.p244a.p245a.p246n.p252e.C4896e;
import p242i.p243a.p244a.p245a.p246n.p254g.C4906b;

/* renamed from: com.crashlytics.android.c.l */
class C1353l implements C1368z {

    /* renamed from: a */
    private final C4792i f4395a;

    /* renamed from: b */
    private final C4896e f4396b;

    /* renamed from: c */
    private final Context f4397c;

    /* renamed from: d */
    private final C1365w f4398d;

    /* renamed from: e */
    private final ScheduledExecutorService f4399e;

    /* renamed from: f */
    private final AtomicReference<ScheduledFuture<?>> f4400f = new AtomicReference<>();

    /* renamed from: g */
    final C1333b0 f4401g;

    /* renamed from: h */
    private final C1356o f4402h;

    /* renamed from: i */
    C4880f f4403i;

    /* renamed from: j */
    C4811g f4404j = new C4811g();

    /* renamed from: k */
    C1354m f4405k = new C1359r();

    /* renamed from: l */
    boolean f4406l = true;

    /* renamed from: m */
    boolean f4407m = true;

    /* renamed from: n */
    volatile int f4408n = -1;

    /* renamed from: o */
    boolean f4409o = false;

    /* renamed from: p */
    boolean f4410p = false;

    public C1353l(C4792i iVar, Context context, ScheduledExecutorService scheduledExecutorService, C1365w wVar, C4896e eVar, C1333b0 b0Var, C1356o oVar) {
        this.f4395a = iVar;
        this.f4397c = context;
        this.f4399e = scheduledExecutorService;
        this.f4398d = wVar;
        this.f4396b = eVar;
        this.f4401g = b0Var;
        this.f4402h = oVar;
    }

    /* renamed from: a */
    public void mo5450a() {
        if (this.f4403i == null) {
            C4813i.m19379c(this.f4397c, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        C4813i.m19379c(this.f4397c, "Sending all files");
        List d = this.f4398d.mo13982d();
        int i = 0;
        while (true) {
            try {
                if (d.size() <= 0) {
                    break;
                }
                C4813i.m19379c(this.f4397c, String.format(Locale.US, "attempt to send batch of %d files", new Object[]{Integer.valueOf(d.size())}));
                boolean a = this.f4403i.mo5441a(d);
                if (a) {
                    i += d.size();
                    this.f4398d.mo13980a(d);
                }
                if (!a) {
                    break;
                }
                d = this.f4398d.mo13982d();
            } catch (Exception e) {
                Context context = this.f4397c;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to send batch of analytics files to server: ");
                sb.append(e.getMessage());
                C4813i.m19364a(context, sb.toString(), (Throwable) e);
            }
        }
        if (i == 0) {
            this.f4398d.mo13981b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5456a(long j, long j2) {
        if (this.f4400f.get() == null) {
            C4883i iVar = new C4883i(this.f4397c, this);
            Context context = this.f4397c;
            StringBuilder sb = new StringBuilder();
            sb.append("Scheduling time based file roll over every ");
            sb.append(j2);
            sb.append(" seconds");
            C4813i.m19379c(context, sb.toString());
            try {
                this.f4400f.set(this.f4399e.scheduleAtFixedRate(iVar, j, j2, TimeUnit.SECONDS));
            } catch (RejectedExecutionException e) {
                C4813i.m19364a(this.f4397c, "Failed to schedule time based file roll over", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public void mo5451a(C1330b bVar) {
        C4795l f;
        StringBuilder sb;
        String str;
        C1328a0 a = bVar.mo5405a(this.f4401g);
        String str2 = "Answers";
        if (!this.f4406l && C1331c.CUSTOM.equals(a.f4323c)) {
            f = C4781c.m19229f();
            sb = new StringBuilder();
            str = "Custom events tracking disabled - skipping event: ";
        } else if (!this.f4407m && C1331c.PREDEFINED.equals(a.f4323c)) {
            f = C4781c.m19229f();
            sb = new StringBuilder();
            str = "Predefined events tracking disabled - skipping event: ";
        } else if (this.f4405k.mo5458a(a)) {
            f = C4781c.m19229f();
            sb = new StringBuilder();
            str = "Skipping filtered event: ";
        } else {
            try {
                this.f4398d.mo13979a(a);
            } catch (IOException e) {
                C4795l f2 = C4781c.m19229f();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to write event: ");
                sb2.append(a);
                f2.mo13793c(str2, sb2.toString(), e);
            }
            mo5457e();
            boolean z = C1331c.CUSTOM.equals(a.f4323c) || C1331c.PREDEFINED.equals(a.f4323c);
            boolean equals = "purchase".equals(a.f4327g);
            if (this.f4409o && z && (!equals || this.f4410p)) {
                try {
                    this.f4402h.mo5460a(a);
                } catch (Exception e2) {
                    C4795l f3 = C4781c.m19229f();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Failed to map event to Firebase: ");
                    sb3.append(a);
                    f3.mo13793c(str2, sb3.toString(), e2);
                }
                return;
            }
            return;
        }
        sb.append(str);
        sb.append(a);
        f.mo13796e(str2, sb.toString());
    }

    /* renamed from: a */
    public void mo5452a(C4906b bVar, String str) {
        C1366x xVar = new C1366x(this.f4395a, str, bVar.f12754a, this.f4396b, this.f4404j.mo13870d(this.f4397c));
        this.f4403i = C1347h.m6260a(xVar);
        this.f4398d.mo5469a(bVar);
        this.f4409o = bVar.f12758e;
        this.f4410p = bVar.f12759f;
        C4795l f = C4781c.m19229f();
        StringBuilder sb = new StringBuilder();
        sb.append("Firebase analytics forwarding ");
        String str2 = "enabled";
        String str3 = "disabled";
        sb.append(this.f4409o ? str2 : str3);
        String str4 = "Answers";
        f.mo13796e(str4, sb.toString());
        C4795l f2 = C4781c.m19229f();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Firebase analytics including purchase events ");
        sb2.append(this.f4410p ? str2 : str3);
        f2.mo13796e(str4, sb2.toString());
        this.f4406l = bVar.f12760g;
        C4795l f3 = C4781c.m19229f();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Custom event tracking ");
        sb3.append(this.f4406l ? str2 : str3);
        f3.mo13796e(str4, sb3.toString());
        this.f4407m = bVar.f12761h;
        C4795l f4 = C4781c.m19229f();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Predefined event tracking ");
        if (!this.f4407m) {
            str2 = str3;
        }
        sb4.append(str2);
        f4.mo13796e(str4, sb4.toString());
        if (bVar.f12763j > 1) {
            C4781c.m19229f().mo13796e(str4, "Event sampling enabled");
            this.f4405k = new C1363v(bVar.f12763j);
        }
        this.f4408n = bVar.f12755b;
        mo5456a(0, (long) this.f4408n);
    }

    /* renamed from: b */
    public boolean mo5453b() {
        try {
            return this.f4398d.mo13983g();
        } catch (IOException e) {
            C4813i.m19364a(this.f4397c, "Failed to roll file over.", (Throwable) e);
            return false;
        }
    }

    /* renamed from: c */
    public void mo5454c() {
        if (this.f4400f.get() != null) {
            C4813i.m19379c(this.f4397c, "Cancelling time-based rollover because no events are currently being generated.");
            ((ScheduledFuture) this.f4400f.get()).cancel(false);
            this.f4400f.set(null);
        }
    }

    /* renamed from: d */
    public void mo5455d() {
        this.f4398d.mo13977a();
    }

    /* renamed from: e */
    public void mo5457e() {
        if (this.f4408n != -1) {
            mo5456a((long) this.f4408n, (long) this.f4408n);
        }
    }
}
