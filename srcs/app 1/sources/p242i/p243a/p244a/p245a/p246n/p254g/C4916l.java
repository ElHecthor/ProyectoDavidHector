package p242i.p243a.p244a.p245a.p246n.p254g;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4792i;
import p242i.p243a.p244a.p245a.C4795l;
import p242i.p243a.p244a.p245a.p246n.p248b.C4801a;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;
import p242i.p243a.p244a.p245a.p246n.p252e.C4887c;
import p242i.p243a.p244a.p245a.p246n.p252e.C4888d;
import p242i.p243a.p244a.p245a.p246n.p252e.C4896e;

/* renamed from: i.a.a.a.n.g.l */
class C4916l extends C4801a implements C4930x {
    public C4916l(C4792i iVar, String str, String str2, C4896e eVar) {
        this(iVar, str, str2, eVar, C4887c.GET);
    }

    C4916l(C4792i iVar, String str, String str2, C4896e eVar, C4887c cVar) {
        super(iVar, str, str2, eVar, cVar);
    }

    /* renamed from: a */
    private C4888d m19706a(C4888d dVar, C4929w wVar) {
        m19708a(dVar, "X-CRASHLYTICS-API-KEY", wVar.f12822a);
        m19708a(dVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m19708a(dVar, "X-CRASHLYTICS-API-CLIENT-VERSION", this.f12549e.mo5402p());
        m19708a(dVar, "Accept", "application/json");
        m19708a(dVar, "X-CRASHLYTICS-DEVICE-MODEL", wVar.f12823b);
        m19708a(dVar, "X-CRASHLYTICS-OS-BUILD-VERSION", wVar.f12824c);
        m19708a(dVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", wVar.f12825d);
        m19708a(dVar, "X-CRASHLYTICS-INSTALLATION-ID", wVar.f12826e);
        return dVar;
    }

    /* renamed from: a */
    private JSONObject m19707a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            C4795l f = C4781c.m19229f();
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse settings JSON from ");
            sb.append(mo13851b());
            String str2 = "Fabric";
            f.mo13788a(str2, sb.toString(), (Throwable) e);
            C4795l f2 = C4781c.m19229f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Settings response ");
            sb2.append(str);
            f2.mo13796e(str2, sb2.toString());
            return null;
        }
    }

    /* renamed from: a */
    private void m19708a(C4888d dVar, String str, String str2) {
        if (str2 != null) {
            dVar.mo14018c(str, str2);
        }
    }

    /* renamed from: b */
    private Map<String, String> m19709b(C4929w wVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", wVar.f12829h);
        hashMap.put("display_version", wVar.f12828g);
        hashMap.put("source", Integer.toString(wVar.f12830i));
        String str = wVar.f12831j;
        if (str != null) {
            hashMap.put("icon_hash", str);
        }
        String str2 = wVar.f12827f;
        if (!C4813i.m19376b(str2)) {
            hashMap.put("instance", str2);
        }
        return hashMap;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public JSONObject mo14067a(C4888d dVar) {
        int g = dVar.mo14028g();
        C4795l f = C4781c.m19229f();
        StringBuilder sb = new StringBuilder();
        sb.append("Settings result was: ");
        sb.append(g);
        String str = "Fabric";
        f.mo13796e(str, sb.toString());
        if (mo14069a(g)) {
            return m19707a(dVar.mo14012a());
        }
        C4795l f2 = C4781c.m19229f();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed to retrieve settings from ");
        sb2.append(mo13851b());
        f2.mo13792c(str, sb2.toString());
        return null;
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [i.a.a.a.n.e.d] */
    /* JADX WARNING: type inference failed for: r3v2, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3, types: [i.a.a.a.n.e.d] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r5v4, types: [i.a.a.a.n.e.d] */
    /* JADX WARNING: type inference failed for: r3v5, types: [org.json.JSONObject] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], org.json.JSONObject, ?[OBJECT, ARRAY]]
      uses: [org.json.JSONObject, ?[int, boolean, OBJECT, ARRAY, byte, short, char], i.a.a.a.n.e.d]
      mth insns count: 59
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject mo14068a(p242i.p243a.p244a.p245a.p246n.p254g.C4929w r9) {
        /*
            r8 = this;
            java.lang.String r0 = "X-REQUEST-ID"
            java.lang.String r1 = "Settings request ID: "
            java.lang.String r2 = "Fabric"
            r3 = 0
            java.util.Map r4 = r8.m19709b(r9)     // Catch:{ d -> 0x006b, all -> 0x0069 }
            i.a.a.a.n.e.d r5 = r8.mo13850a(r4)     // Catch:{ d -> 0x006b, all -> 0x0069 }
            r8.m19706a(r5, r9)     // Catch:{ d -> 0x0067 }
            i.a.a.a.l r9 = p242i.p243a.p244a.p245a.C4781c.m19229f()     // Catch:{ d -> 0x0067 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ d -> 0x0067 }
            r6.<init>()     // Catch:{ d -> 0x0067 }
            java.lang.String r7 = "Requesting settings from "
            r6.append(r7)     // Catch:{ d -> 0x0067 }
            java.lang.String r7 = r8.mo13851b()     // Catch:{ d -> 0x0067 }
            r6.append(r7)     // Catch:{ d -> 0x0067 }
            java.lang.String r6 = r6.toString()     // Catch:{ d -> 0x0067 }
            r9.mo13796e(r2, r6)     // Catch:{ d -> 0x0067 }
            i.a.a.a.l r9 = p242i.p243a.p244a.p245a.C4781c.m19229f()     // Catch:{ d -> 0x0067 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ d -> 0x0067 }
            r6.<init>()     // Catch:{ d -> 0x0067 }
            java.lang.String r7 = "Settings query params were: "
            r6.append(r7)     // Catch:{ d -> 0x0067 }
            r6.append(r4)     // Catch:{ d -> 0x0067 }
            java.lang.String r4 = r6.toString()     // Catch:{ d -> 0x0067 }
            r9.mo13796e(r2, r4)     // Catch:{ d -> 0x0067 }
            org.json.JSONObject r3 = r8.mo14067a(r5)     // Catch:{ d -> 0x0067 }
            if (r5 == 0) goto L_0x0082
            i.a.a.a.l r9 = p242i.p243a.p244a.p245a.C4781c.m19229f()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x0055:
            r4.append(r1)
            java.lang.String r0 = r5.mo14020c(r0)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r9.mo13796e(r2, r0)
            goto L_0x0082
        L_0x0067:
            r9 = move-exception
            goto L_0x006d
        L_0x0069:
            r9 = move-exception
            goto L_0x0085
        L_0x006b:
            r9 = move-exception
            r5 = r3
        L_0x006d:
            i.a.a.a.l r4 = p242i.p243a.p244a.p245a.C4781c.m19229f()     // Catch:{ all -> 0x0083 }
            java.lang.String r6 = "Settings request failed."
            r4.mo13793c(r2, r6, r9)     // Catch:{ all -> 0x0083 }
            if (r5 == 0) goto L_0x0082
            i.a.a.a.l r9 = p242i.p243a.p244a.p245a.C4781c.m19229f()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x0055
        L_0x0082:
            return r3
        L_0x0083:
            r9 = move-exception
            r3 = r5
        L_0x0085:
            if (r3 == 0) goto L_0x00a1
            i.a.a.a.l r4 = p242i.p243a.p244a.p245a.C4781c.m19229f()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r0 = r3.mo14020c(r0)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r4.mo13796e(r2, r0)
        L_0x00a1:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p242i.p243a.p244a.p245a.p246n.p254g.C4916l.mo14068a(i.a.a.a.n.g.w):org.json.JSONObject");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo14069a(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }
}
