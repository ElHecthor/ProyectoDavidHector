package com.crashlytics.android.p033e;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4795l;
import p242i.p243a.p244a.p245a.p246n.p248b.C4812h;

/* renamed from: com.crashlytics.android.e.p0 */
class C1465p0 {

    /* renamed from: g */
    static final Map<String, String> f4619g = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final short[] f4620h = {10, 20, 30, 60, 120, 300};

    /* renamed from: a */
    private final Object f4621a = new Object();

    /* renamed from: b */
    private final C1479t f4622b;

    /* renamed from: c */
    private final String f4623c;

    /* renamed from: d */
    private final C1468c f4624d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1467b f4625e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Thread f4626f;

    /* renamed from: com.crashlytics.android.e.p0$a */
    static final class C1466a implements C1469d {
        C1466a() {
        }

        /* renamed from: a */
        public boolean mo5601a() {
            return true;
        }
    }

    /* renamed from: com.crashlytics.android.e.p0$b */
    interface C1467b {
        /* renamed from: a */
        boolean mo5607a();
    }

    /* renamed from: com.crashlytics.android.e.p0$c */
    interface C1468c {
        /* renamed from: a */
        File[] mo5604a();

        /* renamed from: b */
        File[] mo5605b();

        /* renamed from: c */
        File[] mo5606c();
    }

    /* renamed from: com.crashlytics.android.e.p0$d */
    interface C1469d {
        /* renamed from: a */
        boolean mo5601a();
    }

    /* renamed from: com.crashlytics.android.e.p0$e */
    private class C1470e extends C4812h {

        /* renamed from: f */
        private final float f4627f;

        /* renamed from: g */
        private final C1469d f4628g;

        C1470e(float f, C1469d dVar) {
            this.f4627f = f;
            this.f4628g = dVar;
        }

        /* renamed from: b */
        private void m6656b() {
            C4795l f = C4781c.m19229f();
            StringBuilder sb = new StringBuilder();
            sb.append("Starting report processing in ");
            sb.append(this.f4627f);
            sb.append(" second(s)...");
            String str = "CrashlyticsCore";
            f.mo13796e(str, sb.toString());
            float f2 = this.f4627f;
            if (f2 > 0.0f) {
                try {
                    Thread.sleep((long) (f2 * 1000.0f));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            List<C1462o0> a = C1465p0.this.mo5646a();
            if (!C1465p0.this.f4625e.mo5607a()) {
                if (a.isEmpty() || this.f4628g.mo5601a()) {
                    int i = 0;
                    while (!a.isEmpty() && !C1465p0.this.f4625e.mo5607a()) {
                        C4795l f3 = C4781c.m19229f();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Attempting to send ");
                        sb2.append(a.size());
                        sb2.append(" report(s)");
                        f3.mo13796e(str, sb2.toString());
                        for (C1462o0 a2 : a) {
                            C1465p0.this.mo5648a(a2);
                        }
                        a = C1465p0.this.mo5646a();
                        if (!a.isEmpty()) {
                            int i2 = i + 1;
                            long j = (long) C1465p0.f4620h[Math.min(i, C1465p0.f4620h.length - 1)];
                            C4795l f4 = C4781c.m19229f();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Report submisson: scheduling delayed retry in ");
                            sb3.append(j);
                            sb3.append(" seconds");
                            f4.mo13796e(str, sb3.toString());
                            Thread.sleep(j * 1000);
                            i = i2;
                        }
                    }
                    return;
                }
                C4795l f5 = C4781c.m19229f();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("User declined to send. Removing ");
                sb4.append(a.size());
                sb4.append(" Report(s).");
                f5.mo13796e(str, sb4.toString());
                for (C1462o0 remove : a) {
                    remove.remove();
                }
            }
        }

        /* renamed from: a */
        public void mo5649a() {
            try {
                m6656b();
            } catch (Exception e) {
                C4781c.m19229f().mo13793c("CrashlyticsCore", "An unexpected error occurred while attempting to upload crash reports.", e);
            }
            C1465p0.this.f4626f = null;
        }
    }

    public C1465p0(String str, C1479t tVar, C1468c cVar, C1467b bVar) {
        if (tVar != null) {
            this.f4622b = tVar;
            this.f4623c = str;
            this.f4624d = cVar;
            this.f4625e = bVar;
            return;
        }
        throw new IllegalArgumentException("createReportCall must not be null.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<C1462o0> mo5646a() {
        File[] c;
        File[] b;
        File[] a;
        C4781c.m19229f().mo13796e("CrashlyticsCore", "Checking for crash reports...");
        synchronized (this.f4621a) {
            c = this.f4624d.mo5606c();
            b = this.f4624d.mo5605b();
            a = this.f4624d.mo5604a();
        }
        LinkedList linkedList = new LinkedList();
        if (c != null) {
            for (File file : c) {
                C4795l f = C4781c.m19229f();
                StringBuilder sb = new StringBuilder();
                sb.append("Found crash report ");
                sb.append(file.getPath());
                f.mo13796e("CrashlyticsCore", sb.toString());
                linkedList.add(new C1478s0(file));
            }
        }
        HashMap hashMap = new HashMap();
        if (b != null) {
            for (File file2 : b) {
                String a2 = C1404k.m6478a(file2);
                if (!hashMap.containsKey(a2)) {
                    hashMap.put(a2, new LinkedList());
                }
                ((List) hashMap.get(a2)).add(file2);
            }
        }
        for (String str : hashMap.keySet()) {
            C4795l f2 = C4781c.m19229f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Found invalid session: ");
            sb2.append(str);
            f2.mo13796e("CrashlyticsCore", sb2.toString());
            List list = (List) hashMap.get(str);
            linkedList.add(new C1495z(str, (File[]) list.toArray(new File[list.size()])));
        }
        if (a != null) {
            for (File h0Var : a) {
                linkedList.add(new C1392h0(h0Var));
            }
        }
        if (linkedList.isEmpty()) {
            C4781c.m19229f().mo13796e("CrashlyticsCore", "No reports found.");
        }
        return linkedList;
    }

    /* renamed from: a */
    public synchronized void mo5647a(float f, C1469d dVar) {
        if (this.f4626f != null) {
            C4781c.m19229f().mo13796e("CrashlyticsCore", "Report upload has already been started.");
            return;
        }
        Thread thread = new Thread(new C1470e(f, dVar), "Crashlytics Report Uploader");
        this.f4626f = thread;
        thread.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5648a(C1462o0 o0Var) {
        boolean z;
        synchronized (this.f4621a) {
            z = false;
            try {
                boolean a = this.f4622b.mo5514a(new C1477s(this.f4623c, o0Var));
                C4795l f = C4781c.m19229f();
                String str = "CrashlyticsCore";
                StringBuilder sb = new StringBuilder();
                sb.append("Crashlytics report upload ");
                sb.append(a ? "complete: " : "FAILED: ");
                sb.append(o0Var.mo5544d());
                f.mo13790b(str, sb.toString());
                if (a) {
                    o0Var.remove();
                    z = true;
                }
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error occurred sending report ");
                sb2.append(o0Var);
                C4781c.m19229f().mo13793c("CrashlyticsCore", sb2.toString(), e);
            }
        }
        return z;
    }
}
