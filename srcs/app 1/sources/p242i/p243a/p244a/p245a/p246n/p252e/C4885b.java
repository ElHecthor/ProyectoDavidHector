package p242i.p243a.p244a.p245a.p246n.p252e;

import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import p242i.p243a.p244a.p245a.C4780b;
import p242i.p243a.p244a.p245a.C4795l;

/* renamed from: i.a.a.a.n.e.b */
public class C4885b implements C4896e {

    /* renamed from: a */
    private final C4795l f12714a;

    /* renamed from: b */
    private C4898g f12715b;

    /* renamed from: c */
    private SSLSocketFactory f12716c;

    /* renamed from: d */
    private boolean f12717d;

    /* renamed from: i.a.a.a.n.e.b$a */
    static /* synthetic */ class C4886a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12718a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                i.a.a.a.n.e.c[] r0 = p242i.p243a.p244a.p245a.p246n.p252e.C4887c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12718a = r0
                i.a.a.a.n.e.c r1 = p242i.p243a.p244a.p245a.p246n.p252e.C4887c.GET     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12718a     // Catch:{ NoSuchFieldError -> 0x001d }
                i.a.a.a.n.e.c r1 = p242i.p243a.p244a.p245a.p246n.p252e.C4887c.POST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12718a     // Catch:{ NoSuchFieldError -> 0x0028 }
                i.a.a.a.n.e.c r1 = p242i.p243a.p244a.p245a.p246n.p252e.C4887c.PUT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12718a     // Catch:{ NoSuchFieldError -> 0x0033 }
                i.a.a.a.n.e.c r1 = p242i.p243a.p244a.p245a.p246n.p252e.C4887c.DELETE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p242i.p243a.p244a.p245a.p246n.p252e.C4885b.C4886a.<clinit>():void");
        }
    }

    public C4885b() {
        this(new C4780b());
    }

    public C4885b(C4795l lVar) {
        this.f12714a = lVar;
    }

    /* renamed from: a */
    private synchronized SSLSocketFactory m19588a() {
        if (this.f12716c == null && !this.f12717d) {
            this.f12716c = m19590b();
        }
        return this.f12716c;
    }

    /* renamed from: a */
    private boolean m19589a(String str) {
        return str != null && str.toLowerCase(Locale.US).startsWith("https");
    }

    /* renamed from: b */
    private synchronized SSLSocketFactory m19590b() {
        SSLSocketFactory a;
        this.f12717d = true;
        try {
            a = C4897f.m19659a(this.f12715b);
            this.f12714a.mo13796e("Fabric", "Custom SSL pinning enabled");
        } catch (Exception e) {
            this.f12714a.mo13793c("Fabric", "Exception while validating pinned certs", e);
            return null;
        }
        return a;
    }

    /* renamed from: c */
    private synchronized void m19591c() {
        this.f12717d = false;
        this.f12716c = null;
    }

    /* renamed from: a */
    public C4888d mo13997a(C4887c cVar, String str, Map<String, String> map) {
        C4888d dVar;
        int i = C4886a.f12718a[cVar.ordinal()];
        if (i == 1) {
            dVar = C4888d.m19595a((CharSequence) str, map, true);
        } else if (i == 2) {
            dVar = C4888d.m19599b((CharSequence) str, map, true);
        } else if (i == 3) {
            dVar = C4888d.m19605f((CharSequence) str);
        } else if (i == 4) {
            dVar = C4888d.m19598b((CharSequence) str);
        } else {
            throw new IllegalArgumentException("Unsupported HTTP method!");
        }
        if (m19589a(str) && this.f12715b != null) {
            SSLSocketFactory a = m19588a();
            if (a != null) {
                ((HttpsURLConnection) dVar.mo14031j()).setSSLSocketFactory(a);
            }
        }
        return dVar;
    }

    /* renamed from: a */
    public void mo13998a(C4898g gVar) {
        if (this.f12715b != gVar) {
            this.f12715b = gVar;
            m19591c();
        }
    }
}
