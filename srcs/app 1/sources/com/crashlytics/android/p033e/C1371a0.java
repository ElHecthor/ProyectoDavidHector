package com.crashlytics.android.p033e;

import android.content.Context;
import java.io.File;
import java.util.Set;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;

/* renamed from: com.crashlytics.android.e.a0 */
class C1371a0 {

    /* renamed from: d */
    private static final C1374c f4437d = new C1374c();

    /* renamed from: a */
    private final Context f4438a;

    /* renamed from: b */
    private final C1373b f4439b;

    /* renamed from: c */
    private C1492y f4440c;

    /* renamed from: com.crashlytics.android.e.a0$b */
    public interface C1373b {
        /* renamed from: a */
        File mo5489a();
    }

    /* renamed from: com.crashlytics.android.e.a0$c */
    private static final class C1374c implements C1492y {
        private C1374c() {
        }

        /* renamed from: a */
        public void mo5490a() {
        }

        /* renamed from: a */
        public void mo5491a(long j, String str) {
        }

        /* renamed from: b */
        public C1380d mo5492b() {
            return null;
        }

        /* renamed from: c */
        public byte[] mo5493c() {
            return null;
        }

        /* renamed from: d */
        public void mo5494d() {
        }
    }

    C1371a0(Context context, C1373b bVar) {
        this(context, bVar, null);
    }

    C1371a0(Context context, C1373b bVar, String str) {
        this.f4438a = context;
        this.f4439b = bVar;
        this.f4440c = f4437d;
        mo5485a(str);
    }

    /* renamed from: a */
    private String m6341a(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".temp");
        return lastIndexOf == -1 ? name : name.substring(20, lastIndexOf);
    }

    /* renamed from: b */
    private File m6342b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("crashlytics-userlog-");
        sb.append(str);
        sb.append(".temp");
        return new File(this.f4439b.mo5489a(), sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5482a() {
        this.f4440c.mo5494d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5483a(long j, String str) {
        this.f4440c.mo5491a(j, str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5484a(File file, int i) {
        this.f4440c = new C1456m0(file, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5485a(String str) {
        this.f4440c.mo5490a();
        this.f4440c = f4437d;
        if (str != null) {
            if (!C4813i.m19370a(this.f4438a, "com.crashlytics.CollectCustomLogs", true)) {
                C4781c.m19229f().mo13796e("CrashlyticsCore", "Preferences requested no custom logs. Aborting log file creation.");
            } else {
                mo5484a(m6342b(str), 65536);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5486a(Set<String> set) {
        File[] listFiles = this.f4439b.mo5489a().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!set.contains(m6341a(file))) {
                    file.delete();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C1380d mo5487b() {
        return this.f4440c.mo5492b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public byte[] mo5488c() {
        return this.f4440c.mo5493c();
    }
}
