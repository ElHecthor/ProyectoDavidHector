package com.crashlytics.android.p033e;

import android.content.Context;
import android.util.Log;
import com.crashlytics.android.p031c.C1348i;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4792i;
import p242i.p243a.p244a.p245a.C4795l;
import p242i.p243a.p244a.p245a.p246n.p248b.C4811g;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;
import p242i.p243a.p244a.p245a.p246n.p248b.C4820l;
import p242i.p243a.p244a.p245a.p246n.p248b.C4823o;
import p242i.p243a.p244a.p245a.p246n.p248b.C4829r;
import p242i.p243a.p244a.p245a.p246n.p248b.C4830s;
import p242i.p243a.p244a.p245a.p246n.p249c.C4855d;
import p242i.p243a.p244a.p245a.p246n.p249c.C4856e;
import p242i.p243a.p244a.p245a.p246n.p249c.C4860g;
import p242i.p243a.p244a.p245a.p246n.p249c.C4866l;
import p242i.p243a.p244a.p245a.p246n.p249c.C4867m;
import p242i.p243a.p244a.p245a.p246n.p252e.C4885b;
import p242i.p243a.p244a.p245a.p246n.p252e.C4896e;
import p242i.p243a.p244a.p245a.p246n.p252e.C4898g;
import p242i.p243a.p244a.p245a.p246n.p253f.C4902b;
import p242i.p243a.p244a.p245a.p246n.p253f.C4904d;
import p242i.p243a.p244a.p245a.p246n.p254g.C4921q;
import p242i.p243a.p244a.p245a.p246n.p254g.C4926t;

@C4855d({C1464p.class})
/* renamed from: com.crashlytics.android.e.l */
public class C1448l extends C4792i<Void> {

    /* renamed from: l */
    private final long f4585l;

    /* renamed from: m */
    private final ConcurrentHashMap<String, String> f4586m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C1455m f4587n;

    /* renamed from: o */
    private C1455m f4588o;

    /* renamed from: p */
    private C1459n f4589p;

    /* renamed from: q */
    private C1404k f4590q;

    /* renamed from: r */
    private String f4591r;

    /* renamed from: s */
    private String f4592s;

    /* renamed from: t */
    private String f4593t;

    /* renamed from: u */
    private float f4594u;

    /* renamed from: v */
    private boolean f4595v;

    /* renamed from: w */
    private final C1399i0 f4596w;

    /* renamed from: x */
    private C4896e f4597x;

    /* renamed from: y */
    private C1400j f4598y;

    /* renamed from: z */
    private C1464p f4599z;

    /* renamed from: com.crashlytics.android.e.l$a */
    class C1449a extends C4860g<Void> {
        C1449a() {
        }

        public Void call() {
            return C1448l.this.mo5400h();
        }

        /* renamed from: k */
        public C4856e mo5636k() {
            return C4856e.IMMEDIATE;
        }
    }

    /* renamed from: com.crashlytics.android.e.l$b */
    class C1450b implements Callable<Void> {
        C1450b() {
        }

        public Void call() {
            C1448l.this.f4587n.mo5641a();
            C4781c.m19229f().mo13796e("CrashlyticsCore", "Initialization marker file created.");
            return null;
        }
    }

    /* renamed from: com.crashlytics.android.e.l$c */
    class C1451c implements Callable<Boolean> {
        C1451c() {
        }

        public Boolean call() {
            String str = "CrashlyticsCore";
            try {
                boolean c = C1448l.this.f4587n.mo5643c();
                C4795l f = C4781c.m19229f();
                StringBuilder sb = new StringBuilder();
                sb.append("Initialization marker file removed: ");
                sb.append(c);
                f.mo13796e(str, sb.toString());
                return Boolean.valueOf(c);
            } catch (Exception e) {
                C4781c.m19229f().mo13793c(str, "Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.valueOf(false);
            }
        }
    }

    /* renamed from: com.crashlytics.android.e.l$d */
    private static final class C1452d implements Callable<Boolean> {

        /* renamed from: f */
        private final C1455m f4603f;

        public C1452d(C1455m mVar) {
            this.f4603f = mVar;
        }

        public Boolean call() {
            if (!this.f4603f.mo5642b()) {
                return Boolean.FALSE;
            }
            C4781c.m19229f().mo13796e("CrashlyticsCore", "Found previous crash marker.");
            this.f4603f.mo5643c();
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.crashlytics.android.e.l$e */
    private static final class C1453e implements C1459n {
        private C1453e() {
        }

        /* synthetic */ C1453e(C1449a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo5640a() {
        }
    }

    public C1448l() {
        this(1.0f, null, null, false);
    }

    C1448l(float f, C1459n nVar, C1399i0 i0Var, boolean z) {
        this(f, nVar, i0Var, z, C4823o.m19405a("Crashlytics Exception Handler"));
    }

    C1448l(float f, C1459n nVar, C1399i0 i0Var, boolean z, ExecutorService executorService) {
        this.f4591r = null;
        this.f4592s = null;
        this.f4593t = null;
        this.f4594u = f;
        if (nVar == null) {
            nVar = new C1453e(null);
        }
        this.f4589p = nVar;
        this.f4596w = i0Var;
        this.f4595v = z;
        this.f4598y = new C1400j(executorService);
        this.f4586m = new ConcurrentHashMap<>();
        this.f4585l = System.currentTimeMillis();
    }

    /* renamed from: C */
    private void m6589C() {
        if (Boolean.TRUE.equals((Boolean) this.f4598y.mo5563b(new C1452d(this.f4588o)))) {
            try {
                this.f4589p.mo5640a();
            } catch (Exception e) {
                C4781c.m19229f().mo13793c("CrashlyticsCore", "Exception thrown by CrashlyticsListener while notifying of previous crash.", e);
            }
        }
    }

    /* renamed from: D */
    private void m6590D() {
        String str;
        C4795l lVar;
        C1449a aVar = new C1449a();
        for (C4866l a : mo13834j()) {
            aVar.mo13930a(a);
        }
        Future submit = mo13835l().mo13803b().submit(aVar);
        String str2 = "CrashlyticsCore";
        C4781c.m19229f().mo13796e(str2, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
            return;
        } catch (InterruptedException e) {
            e = e;
            lVar = C4781c.m19229f();
            str = "Crashlytics was interrupted during initialization.";
        } catch (ExecutionException e2) {
            e = e2;
            lVar = C4781c.m19229f();
            str = "Problem encountered during Crashlytics initialization.";
        } catch (TimeoutException e3) {
            e = e3;
            lVar = C4781c.m19229f();
            str = "Crashlytics timed out during initialization.";
        }
        lVar.mo13793c(str2, str, e);
    }

    /* renamed from: E */
    public static C1448l m6591E() {
        return (C1448l) C4781c.m19220a(C1448l.class);
    }

    /* renamed from: a */
    private void m6593a(int i, String str, String str2) {
        if (!this.f4595v && m6596b("prior to logging messages.")) {
            this.f4590q.mo5571a(System.currentTimeMillis() - this.f4585l, m6595b(i, str, str2));
        }
    }

    /* renamed from: a */
    static boolean m6594a(String str, boolean z) {
        String str2 = "CrashlyticsCore";
        if (!z) {
            C4781c.m19229f().mo13796e(str2, "Configured not to require a build ID.");
            return true;
        } else if (!C4813i.m19376b(str)) {
            return true;
        } else {
            String str3 = ".";
            Log.e(str2, str3);
            Log.e(str2, ".     |  | ");
            String str4 = ".     |  |";
            Log.e(str2, str4);
            Log.e(str2, str4);
            Log.e(str2, ".   \\ |  | /");
            Log.e(str2, ".    \\    /");
            Log.e(str2, ".     \\  /");
            Log.e(str2, ".      \\/");
            Log.e(str2, str3);
            Log.e(str2, "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
            Log.e(str2, str3);
            Log.e(str2, ".      /\\");
            Log.e(str2, ".     /  \\");
            Log.e(str2, ".    /    \\");
            Log.e(str2, ".   / |  | \\");
            Log.e(str2, str4);
            Log.e(str2, str4);
            Log.e(str2, str4);
            Log.e(str2, str3);
            return false;
        }
    }

    /* renamed from: b */
    private static String m6595b(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(C4813i.m19355a(i));
        sb.append("/");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m6596b(String str) {
        C1448l E = m6591E();
        if (E != null && E.f4590q != null) {
            return true;
        }
        C4795l f = C4781c.m19229f();
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics must be initialized by calling Fabric.with(Context) ");
        sb.append(str);
        f.mo13793c("CrashlyticsCore", sb.toString(), null);
        return false;
    }

    /* renamed from: c */
    private static String m6597c(String str) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > 1024 ? trim.substring(0, 1024) : trim;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public void mo5621A() {
        this.f4598y.mo5562a((Callable<T>) new C1451c<T>());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public void mo5622B() {
        this.f4598y.mo5563b(new C1450b());
    }

    /* renamed from: a */
    public void mo5623a(String str) {
        m6593a(3, "CrashlyticsCore", str);
    }

    /* renamed from: a */
    public void mo5624a(String str, int i) {
        mo5625a(str, Integer.toString(i));
    }

    /* renamed from: a */
    public void mo5625a(String str, String str2) {
        if (!this.f4595v && m6596b("prior to setting keys.")) {
            String str3 = "CrashlyticsCore";
            if (str == null) {
                Context i = mo13833i();
                if (i == null || !C4813i.m19388j(i)) {
                    C4781c.m19229f().mo13793c(str3, "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            String c = m6597c(str);
            if (this.f4586m.size() < 64 || this.f4586m.containsKey(c)) {
                this.f4586m.put(c, str2 == null ? "" : m6597c(str2));
                this.f4590q.mo5577a((Map<String, String>) this.f4586m);
                return;
            }
            C4781c.m19229f().mo13796e(str3, "Exceeded maximum number of custom attributes (64)");
        }
    }

    /* renamed from: a */
    public void mo5626a(Throwable th) {
        if (this.f4595v || !m6596b("prior to logging exceptions.")) {
            return;
        }
        if (th == null) {
            C4781c.m19229f().mo13785a(5, "CrashlyticsCore", "Crashlytics is ignoring a request to log a null exception.");
        } else {
            this.f4590q.mo5576a(Thread.currentThread(), th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5627a(Context context) {
        Context context2 = context;
        String str = "CrashlyticsCore";
        if (!C4820l.m19399a(context).mo13878a()) {
            C4781c.m19229f().mo13796e(str, "Crashlytics is disabled, because data collection is disabled by Firebase.");
            this.f4595v = true;
        }
        if (this.f4595v) {
            return false;
        }
        String d = new C4811g().mo13870d(context2);
        if (d == null) {
            return false;
        }
        String n = C4813i.m19392n(context);
        if (m6594a(n, C4813i.m19370a(context2, "com.crashlytics.RequireBuildId", true))) {
            try {
                C4795l f = C4781c.m19229f();
                StringBuilder sb = new StringBuilder();
                sb.append("Initializing Crashlytics Core ");
                sb.append(mo5402p());
                f.mo13790b(str, sb.toString());
                C4902b bVar = new C4902b(this);
                this.f4588o = new C1455m("crash_marker", bVar);
                this.f4587n = new C1455m("initialization_marker", bVar);
                C1403j0 a = C1403j0.m6473a(new C4904d(mo13833i(), "com.crashlytics.android.core.CrashlyticsCore"), this);
                C4898g qVar = this.f4596w != null ? new C1471q(this.f4596w) : null;
                C4885b bVar2 = new C4885b(C4781c.m19229f());
                this.f4597x = bVar2;
                bVar2.mo13998a(qVar);
                C4830s m = mo13836m();
                C1370a a2 = C1370a.m6340a(context2, m, d, n);
                C1404k kVar = r1;
                C1404k kVar2 = new C1404k(this, this.f4598y, this.f4597x, m, a, bVar, a2, new C1472q0(context2, new C1376b0(context2, a2.f4434d)), new C1481u(this), C1348i.m6264b(context));
                this.f4590q = kVar;
                boolean u = mo5629u();
                m6589C();
                this.f4590q.mo5575a(Thread.getDefaultUncaughtExceptionHandler(), new C4829r().mo13889e(context2));
                if (!u || !C4813i.m19375b(context)) {
                    C4781c.m19229f().mo13796e(str, "Exception handling initialization successful");
                    return true;
                }
                C4781c.m19229f().mo13796e(str, "Crashlytics did not finish previous background initialization. Initializing synchronously.");
                m6590D();
                return false;
            } catch (Exception e) {
                C4781c.m19229f().mo13793c(str, "Crashlytics was not started due to an exception during initialization", e);
                this.f4590q = null;
                return false;
            }
        } else {
            throw new C4867m("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public Void m6606h() {
        String str = "CrashlyticsCore";
        mo5622B();
        this.f4590q.mo5568a();
        try {
            this.f4590q.mo5590k();
            C4926t a = C4921q.m19715d().mo14071a();
            if (a == null) {
                C4781c.m19229f().mo13787a(str, "Received null settings, skipping report submission!");
                mo5621A();
                return null;
            }
            this.f4590q.mo5574a(a);
            if (!a.f12818d.f12790b) {
                C4781c.m19229f().mo13796e(str, "Collection of crash reports disabled in Crashlytics settings.");
                mo5621A();
                return null;
            } else if (!C4820l.m19399a(mo13833i()).mo13878a()) {
                C4781c.m19229f().mo13796e(str, "Automatic collection of crash reports disabled by Firebase settings.");
                mo5621A();
                return null;
            } else {
                C1461o w = mo5631w();
                if (w != null && !this.f4590q.mo5579a(w)) {
                    C4781c.m19229f().mo13796e(str, "Could not finalize previous NDK sessions.");
                }
                if (!this.f4590q.mo5581b(a.f12816b)) {
                    C4781c.m19229f().mo13796e(str, "Could not finalize previous sessions.");
                }
                this.f4590q.mo5569a(this.f4594u, a);
                mo5621A();
                return null;
            }
        } catch (Exception e) {
            C4781c.m19229f().mo13793c(str, "Crashlytics encountered a problem during asynchronous initialization.", e);
        } catch (Throwable th) {
            mo5621A();
            throw th;
        }
    }

    /* renamed from: n */
    public String mo5401n() {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    /* renamed from: p */
    public String mo5402p() {
        return "2.7.0.33";
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo5409s() {
        return mo5627a(super.mo13833i());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo5628t() {
        this.f4588o.mo5641a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public boolean mo5629u() {
        return this.f4587n.mo5642b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public Map<String, String> mo5630v() {
        return Collections.unmodifiableMap(this.f4586m);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public C1461o mo5631w() {
        C1464p pVar = this.f4599z;
        if (pVar != null) {
            return pVar.mo5645a();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public String mo5632x() {
        if (mo13836m().mo13890a()) {
            return this.f4592s;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public String mo5633y() {
        if (mo13836m().mo13890a()) {
            return this.f4591r;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public String mo5634z() {
        if (mo13836m().mo13890a()) {
            return this.f4593t;
        }
        return null;
    }
}
