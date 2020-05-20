package com.crashlytics.android.p033e;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.crashlytics.android.p031c.C1332b;
import com.crashlytics.android.p031c.C1355n;
import com.crashlytics.android.p033e.C1371a0.C1373b;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4792i;
import p242i.p243a.p244a.p245a.C4795l;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;
import p242i.p243a.p244a.p245a.p246n.p248b.C4816j.C4817a;
import p242i.p243a.p244a.p245a.p246n.p248b.C4816j.C4818b;
import p242i.p243a.p244a.p245a.p246n.p248b.C4820l;
import p242i.p243a.p244a.p245a.p246n.p248b.C4821m;
import p242i.p243a.p244a.p245a.p246n.p248b.C4830s;
import p242i.p243a.p244a.p245a.p246n.p252e.C4896e;
import p242i.p243a.p244a.p245a.p246n.p253f.C4901a;
import p242i.p243a.p244a.p245a.p246n.p254g.C4909e;
import p242i.p243a.p244a.p245a.p246n.p254g.C4917m;
import p242i.p243a.p244a.p245a.p246n.p254g.C4919o;
import p242i.p243a.p244a.p245a.p246n.p254g.C4920p;
import p242i.p243a.p244a.p245a.p246n.p254g.C4921q;
import p242i.p243a.p244a.p245a.p246n.p254g.C4926t;

/* renamed from: com.crashlytics.android.e.k */
class C1404k {

    /* renamed from: s */
    static final FilenameFilter f4480s = new C1426j("BeginSession");

    /* renamed from: t */
    static final FilenameFilter f4481t = new C1437q();

    /* renamed from: u */
    static final FileFilter f4482u = new C1438r();

    /* renamed from: v */
    static final Comparator<File> f4483v = new C1439s();

    /* renamed from: w */
    static final Comparator<File> f4484w = new C1440t();
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static final Pattern f4485x = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");

    /* renamed from: y */
    private static final Map<String, String> f4486y = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");

    /* renamed from: z */
    private static final String[] f4487z = {"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};

    /* renamed from: a */
    private final AtomicInteger f4488a = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1448l f4489b;

    /* renamed from: c */
    private final C1400j f4490c;

    /* renamed from: d */
    private final C4896e f4491d;

    /* renamed from: e */
    private final C4830s f4492e;

    /* renamed from: f */
    private final C1403j0 f4493f;

    /* renamed from: g */
    private final C4901a f4494g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1370a f4495h;

    /* renamed from: i */
    private final C1414e0 f4496i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C1371a0 f4497j;

    /* renamed from: k */
    private final C1468c f4498k;

    /* renamed from: l */
    private final C1467b f4499l;

    /* renamed from: m */
    private final C1486w f4500m;

    /* renamed from: n */
    private final C1483u0 f4501n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final String f4502o;

    /* renamed from: p */
    private final C1375b f4503p;

    /* renamed from: q */
    private final C1355n f4504q;

    /* renamed from: r */
    private C1473r f4505r;

    /* renamed from: com.crashlytics.android.e.k$a */
    class C1405a implements Callable<Void> {

        /* renamed from: f */
        final /* synthetic */ Map f4506f;

        C1405a(Map map) {
            this.f4506f = map;
        }

        public Void call() {
            new C1379c0(C1404k.this.mo5582c()).mo5501a(C1404k.this.m6539o(), this.f4506f);
            return null;
        }
    }

    /* renamed from: com.crashlytics.android.e.k$a0 */
    private static final class C1406a0 implements C1475b {
        private C1406a0() {
        }

        /* synthetic */ C1406a0(C1426j jVar) {
            this();
        }

        /* renamed from: a */
        public C4926t mo5592a() {
            return C4921q.m19715d().mo14071a();
        }
    }

    /* renamed from: com.crashlytics.android.e.k$b */
    class C1407b implements Callable<Void> {
        C1407b() {
        }

        public Void call() {
            C1404k.this.m6537m();
            return null;
        }
    }

    /* renamed from: com.crashlytics.android.e.k$b0 */
    static class C1408b0 implements FilenameFilter {

        /* renamed from: a */
        private final String f4509a;

        public C1408b0(String str) {
            this.f4509a = str;
        }

        public boolean accept(File file, String str) {
            return str.contains(this.f4509a) && !str.endsWith(".cls_temp");
        }
    }

    /* renamed from: com.crashlytics.android.e.k$c */
    class C1409c implements Callable<Boolean> {

        /* renamed from: f */
        final /* synthetic */ C4920p f4510f;

        C1409c(C4920p pVar) {
            this.f4510f = pVar;
        }

        public Boolean call() {
            String str = "CrashlyticsCore";
            if (C1404k.this.mo5585f()) {
                C4781c.m19229f().mo13796e(str, "Skipping session finalization because a crash has already occurred.");
                return Boolean.FALSE;
            }
            C4781c.m19229f().mo13796e(str, "Finalizing previously open sessions.");
            C1404k.this.m6491a(this.f4510f, true);
            C4781c.m19229f().mo13796e(str, "Closed all previously open sessions");
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.crashlytics.android.e.k$c0 */
    private interface C1410c0 {
        /* renamed from: a */
        void mo5596a(FileOutputStream fileOutputStream);
    }

    /* renamed from: com.crashlytics.android.e.k$d */
    class C1411d implements Runnable {
        C1411d() {
        }

        public void run() {
            C1404k kVar = C1404k.this;
            kVar.mo5578a(kVar.m6509a((FilenameFilter) new C1412d0()));
        }
    }

    /* renamed from: com.crashlytics.android.e.k$d0 */
    static class C1412d0 implements FilenameFilter {
        C1412d0() {
        }

        public boolean accept(File file, String str) {
            return C1384f.f4455i.accept(file, str) || str.contains("SessionMissingBinaryImages");
        }
    }

    /* renamed from: com.crashlytics.android.e.k$e */
    class C1413e implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ Set f4513a;

        C1413e(C1404k kVar, Set set) {
            this.f4513a = set;
        }

        public boolean accept(File file, String str) {
            if (str.length() < 35) {
                return false;
            }
            return this.f4513a.contains(str.substring(0, 35));
        }
    }

    /* renamed from: com.crashlytics.android.e.k$e0 */
    private static final class C1414e0 implements C1373b {

        /* renamed from: a */
        private final C4901a f4514a;

        public C1414e0(C4901a aVar) {
            this.f4514a = aVar;
        }

        /* renamed from: a */
        public File mo5489a() {
            File file = new File(this.f4514a.mo14050a(), "log-files");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }
    }

    /* renamed from: com.crashlytics.android.e.k$f */
    class C1415f implements Callable<Boolean> {

        /* renamed from: f */
        final /* synthetic */ C1461o f4515f;

        C1415f(C1461o oVar) {
            this.f4515f = oVar;
        }

        public Boolean call() {
            TreeSet<File> treeSet = this.f4515f.f4615a;
            String c = C1404k.this.m6540p();
            if (c != null && !treeSet.isEmpty()) {
                File file = (File) treeSet.first();
                if (file != null) {
                    C1404k kVar = C1404k.this;
                    kVar.m6480a(kVar.f4489b.mo13833i(), file, c);
                }
            }
            C1404k.this.m6501a((Set<File>) treeSet);
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.crashlytics.android.e.k$f0 */
    private static final class C1416f0 implements C1469d {

        /* renamed from: a */
        private final C4792i f4517a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C1403j0 f4518b;

        /* renamed from: c */
        private final C4919o f4519c;

        /* renamed from: com.crashlytics.android.e.k$f0$a */
        class C1417a implements C1397d {
            C1417a() {
            }

            /* renamed from: a */
            public void mo5554a(boolean z) {
                C1416f0.this.f4518b.mo5566a(z);
            }
        }

        /* renamed from: com.crashlytics.android.e.k$f0$b */
        class C1418b implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C1393i f4521f;

            C1418b(C1416f0 f0Var, C1393i iVar) {
                this.f4521f = iVar;
            }

            public void run() {
                this.f4521f.mo5550c();
            }
        }

        public C1416f0(C4792i iVar, C1403j0 j0Var, C4919o oVar) {
            this.f4517a = iVar;
            this.f4518b = j0Var;
            this.f4519c = oVar;
        }

        /* renamed from: a */
        public boolean mo5601a() {
            Activity a = this.f4517a.mo13835l().mo13798a();
            if (a == null || a.isFinishing()) {
                return true;
            }
            C1393i a2 = C1393i.m6459a(a, this.f4519c, new C1417a());
            a.runOnUiThread(new C1418b(this, a2));
            C4781c.m19229f().mo13796e("CrashlyticsCore", "Waiting for user opt-in.");
            a2.mo5548a();
            return a2.mo5549b();
        }
    }

    /* renamed from: com.crashlytics.android.e.k$g */
    class C1419g implements C1446z {

        /* renamed from: a */
        final /* synthetic */ String f4522a;

        /* renamed from: b */
        final /* synthetic */ String f4523b;

        /* renamed from: c */
        final /* synthetic */ long f4524c;

        C1419g(C1404k kVar, String str, String str2, long j) {
            this.f4522a = str;
            this.f4523b = str2;
            this.f4524c = j;
        }

        /* renamed from: a */
        public void mo5603a(C1387g gVar) {
            C1476r0.m6690a(gVar, this.f4522a, this.f4523b, this.f4524c);
        }
    }

    /* renamed from: com.crashlytics.android.e.k$g0 */
    private final class C1420g0 implements C1468c {
        private C1420g0() {
        }

        /* synthetic */ C1420g0(C1404k kVar, C1426j jVar) {
            this();
        }

        /* renamed from: a */
        public File[] mo5604a() {
            return C1404k.this.mo5587h();
        }

        /* renamed from: b */
        public File[] mo5605b() {
            return C1404k.this.mo5583d().listFiles();
        }

        /* renamed from: c */
        public File[] mo5606c() {
            return C1404k.this.mo5586g();
        }
    }

    /* renamed from: com.crashlytics.android.e.k$h */
    class C1421h implements C1410c0 {

        /* renamed from: a */
        final /* synthetic */ String f4526a;

        /* renamed from: b */
        final /* synthetic */ String f4527b;

        /* renamed from: c */
        final /* synthetic */ long f4528c;

        /* renamed from: com.crashlytics.android.e.k$h$a */
        class C1422a extends HashMap<String, Object> {
            C1422a() {
                put("session_id", C1421h.this.f4526a);
                put("generator", C1421h.this.f4527b);
                put("started_at_seconds", Long.valueOf(C1421h.this.f4528c));
            }
        }

        C1421h(C1404k kVar, String str, String str2, long j) {
            this.f4526a = str;
            this.f4527b = str2;
            this.f4528c = j;
        }

        /* renamed from: a */
        public void mo5596a(FileOutputStream fileOutputStream) {
            fileOutputStream.write(new JSONObject(new C1422a()).toString().getBytes());
        }
    }

    /* renamed from: com.crashlytics.android.e.k$h0 */
    private final class C1423h0 implements C1467b {
        private C1423h0() {
        }

        /* synthetic */ C1423h0(C1404k kVar, C1426j jVar) {
            this();
        }

        /* renamed from: a */
        public boolean mo5607a() {
            return C1404k.this.mo5585f();
        }
    }

    /* renamed from: com.crashlytics.android.e.k$i */
    class C1424i implements C1446z {

        /* renamed from: a */
        final /* synthetic */ String f4531a;

        /* renamed from: b */
        final /* synthetic */ String f4532b;

        /* renamed from: c */
        final /* synthetic */ String f4533c;

        /* renamed from: d */
        final /* synthetic */ String f4534d;

        /* renamed from: e */
        final /* synthetic */ int f4535e;

        C1424i(String str, String str2, String str3, String str4, int i) {
            this.f4531a = str;
            this.f4532b = str2;
            this.f4533c = str3;
            this.f4534d = str4;
            this.f4535e = i;
        }

        /* renamed from: a */
        public void mo5603a(C1387g gVar) {
            C1476r0.m6692a(gVar, this.f4531a, C1404k.this.f4495h.f4431a, this.f4532b, this.f4533c, this.f4534d, this.f4535e, C1404k.this.f4502o);
        }
    }

    /* renamed from: com.crashlytics.android.e.k$i0 */
    private static final class C1425i0 implements Runnable {

        /* renamed from: f */
        private final Context f4537f;

        /* renamed from: g */
        private final C1462o0 f4538g;

        /* renamed from: h */
        private final C1465p0 f4539h;

        public C1425i0(Context context, C1462o0 o0Var, C1465p0 p0Var) {
            this.f4537f = context;
            this.f4538g = o0Var;
            this.f4539h = p0Var;
        }

        public void run() {
            if (C4813i.m19375b(this.f4537f)) {
                C4781c.m19229f().mo13796e("CrashlyticsCore", "Attempting to send crash report at time of crash...");
                this.f4539h.mo5648a(this.f4538g);
            }
        }
    }

    /* renamed from: com.crashlytics.android.e.k$j */
    static class C1426j extends C1408b0 {
        C1426j(String str) {
            super(str);
        }

        public boolean accept(File file, String str) {
            return super.accept(file, str) && str.endsWith(".cls");
        }
    }

    /* renamed from: com.crashlytics.android.e.k$j0 */
    static class C1427j0 implements FilenameFilter {

        /* renamed from: a */
        private final String f4540a;

        public C1427j0(String str) {
            this.f4540a = str;
        }

        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f4540a);
            sb.append(".cls");
            boolean z = false;
            if (str.equals(sb.toString())) {
                return false;
            }
            if (str.contains(this.f4540a) && !str.endsWith(".cls_temp")) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: com.crashlytics.android.e.k$k */
    class C1428k implements C1410c0 {

        /* renamed from: a */
        final /* synthetic */ String f4541a;

        /* renamed from: b */
        final /* synthetic */ String f4542b;

        /* renamed from: c */
        final /* synthetic */ String f4543c;

        /* renamed from: d */
        final /* synthetic */ String f4544d;

        /* renamed from: e */
        final /* synthetic */ int f4545e;

        /* renamed from: com.crashlytics.android.e.k$k$a */
        class C1429a extends HashMap<String, Object> {
            C1429a() {
                put("app_identifier", C1428k.this.f4541a);
                put("api_key", C1404k.this.f4495h.f4431a);
                put("version_code", C1428k.this.f4542b);
                put("version_name", C1428k.this.f4543c);
                put("install_uuid", C1428k.this.f4544d);
                put("delivery_mechanism", Integer.valueOf(C1428k.this.f4545e));
                put("unity_version", TextUtils.isEmpty(C1404k.this.f4502o) ? "" : C1404k.this.f4502o);
            }
        }

        C1428k(String str, String str2, String str3, String str4, int i) {
            this.f4541a = str;
            this.f4542b = str2;
            this.f4543c = str3;
            this.f4544d = str4;
            this.f4545e = i;
        }

        /* renamed from: a */
        public void mo5596a(FileOutputStream fileOutputStream) {
            fileOutputStream.write(new JSONObject(new C1429a()).toString().getBytes());
        }
    }

    /* renamed from: com.crashlytics.android.e.k$l */
    class C1430l implements C1446z {

        /* renamed from: a */
        final /* synthetic */ boolean f4548a;

        C1430l(C1404k kVar, boolean z) {
            this.f4548a = z;
        }

        /* renamed from: a */
        public void mo5603a(C1387g gVar) {
            C1476r0.m6693a(gVar, VERSION.RELEASE, VERSION.CODENAME, this.f4548a);
        }
    }

    /* renamed from: com.crashlytics.android.e.k$m */
    class C1431m implements C1410c0 {

        /* renamed from: a */
        final /* synthetic */ boolean f4549a;

        /* renamed from: com.crashlytics.android.e.k$m$a */
        class C1432a extends HashMap<String, Object> {
            C1432a() {
                put("version", VERSION.RELEASE);
                put("build_version", VERSION.CODENAME);
                put("is_rooted", Boolean.valueOf(C1431m.this.f4549a));
            }
        }

        C1431m(C1404k kVar, boolean z) {
            this.f4549a = z;
        }

        /* renamed from: a */
        public void mo5596a(FileOutputStream fileOutputStream) {
            fileOutputStream.write(new JSONObject(new C1432a()).toString().getBytes());
        }
    }

    /* renamed from: com.crashlytics.android.e.k$n */
    class C1433n implements C1446z {

        /* renamed from: a */
        final /* synthetic */ int f4551a;

        /* renamed from: b */
        final /* synthetic */ int f4552b;

        /* renamed from: c */
        final /* synthetic */ long f4553c;

        /* renamed from: d */
        final /* synthetic */ long f4554d;

        /* renamed from: e */
        final /* synthetic */ boolean f4555e;

        /* renamed from: f */
        final /* synthetic */ Map f4556f;

        /* renamed from: g */
        final /* synthetic */ int f4557g;

        C1433n(C1404k kVar, int i, int i2, long j, long j2, boolean z, Map map, int i3) {
            this.f4551a = i;
            this.f4552b = i2;
            this.f4553c = j;
            this.f4554d = j2;
            this.f4555e = z;
            this.f4556f = map;
            this.f4557g = i3;
        }

        /* renamed from: a */
        public void mo5603a(C1387g gVar) {
            C1476r0.m6683a(gVar, this.f4551a, Build.MODEL, this.f4552b, this.f4553c, this.f4554d, this.f4555e, this.f4556f, this.f4557g, Build.MANUFACTURER, Build.PRODUCT);
        }
    }

    /* renamed from: com.crashlytics.android.e.k$o */
    class C1434o implements C1410c0 {

        /* renamed from: a */
        final /* synthetic */ int f4558a;

        /* renamed from: b */
        final /* synthetic */ int f4559b;

        /* renamed from: c */
        final /* synthetic */ long f4560c;

        /* renamed from: d */
        final /* synthetic */ long f4561d;

        /* renamed from: e */
        final /* synthetic */ boolean f4562e;

        /* renamed from: f */
        final /* synthetic */ Map f4563f;

        /* renamed from: g */
        final /* synthetic */ int f4564g;

        /* renamed from: com.crashlytics.android.e.k$o$a */
        class C1435a extends HashMap<String, Object> {
            C1435a() {
                put("arch", Integer.valueOf(C1434o.this.f4558a));
                put("build_model", Build.MODEL);
                put("available_processors", Integer.valueOf(C1434o.this.f4559b));
                put("total_ram", Long.valueOf(C1434o.this.f4560c));
                put("disk_space", Long.valueOf(C1434o.this.f4561d));
                put("is_emulator", Boolean.valueOf(C1434o.this.f4562e));
                put("ids", C1434o.this.f4563f);
                put("state", Integer.valueOf(C1434o.this.f4564g));
                put("build_manufacturer", Build.MANUFACTURER);
                put("build_product", Build.PRODUCT);
            }
        }

        C1434o(C1404k kVar, int i, int i2, long j, long j2, boolean z, Map map, int i3) {
            this.f4558a = i;
            this.f4559b = i2;
            this.f4560c = j;
            this.f4561d = j2;
            this.f4562e = z;
            this.f4563f = map;
            this.f4564g = i3;
        }

        /* renamed from: a */
        public void mo5596a(FileOutputStream fileOutputStream) {
            fileOutputStream.write(new JSONObject(new C1435a()).toString().getBytes());
        }
    }

    /* renamed from: com.crashlytics.android.e.k$p */
    class C1436p implements C1446z {

        /* renamed from: a */
        final /* synthetic */ C1491x0 f4566a;

        C1436p(C1404k kVar, C1491x0 x0Var) {
            this.f4566a = x0Var;
        }

        /* renamed from: a */
        public void mo5603a(C1387g gVar) {
            C1491x0 x0Var = this.f4566a;
            C1476r0.m6691a(gVar, x0Var.f4668a, x0Var.f4669b, x0Var.f4670c);
        }
    }

    /* renamed from: com.crashlytics.android.e.k$q */
    static class C1437q implements FilenameFilter {
        C1437q() {
        }

        public boolean accept(File file, String str) {
            return str.length() == 39 && str.endsWith(".cls");
        }
    }

    /* renamed from: com.crashlytics.android.e.k$r */
    static class C1438r implements FileFilter {
        C1438r() {
        }

        public boolean accept(File file) {
            return file.isDirectory() && file.getName().length() == 35;
        }
    }

    /* renamed from: com.crashlytics.android.e.k$s */
    static class C1439s implements Comparator<File> {
        C1439s() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return file2.getName().compareTo(file.getName());
        }
    }

    /* renamed from: com.crashlytics.android.e.k$t */
    static class C1440t implements Comparator<File> {
        C1440t() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    }

    /* renamed from: com.crashlytics.android.e.k$u */
    class C1441u implements C1474a {
        C1441u() {
        }

        /* renamed from: a */
        public void mo5616a(C1475b bVar, Thread thread, Throwable th, boolean z) {
            C1404k.this.mo5572a(bVar, thread, th, z);
        }
    }

    /* renamed from: com.crashlytics.android.e.k$v */
    class C1442v implements Callable<Void> {

        /* renamed from: f */
        final /* synthetic */ Date f4568f;

        /* renamed from: g */
        final /* synthetic */ Thread f4569g;

        /* renamed from: h */
        final /* synthetic */ Throwable f4570h;

        /* renamed from: i */
        final /* synthetic */ C1475b f4571i;

        /* renamed from: j */
        final /* synthetic */ boolean f4572j;

        C1442v(Date date, Thread thread, Throwable th, C1475b bVar, boolean z) {
            this.f4568f = date;
            this.f4569g = thread;
            this.f4570h = th;
            this.f4571i = bVar;
            this.f4572j = z;
        }

        public Void call() {
            C4917m mVar;
            C4920p pVar;
            C1404k.this.f4489b.mo5628t();
            C1404k.this.m6517b(this.f4568f, this.f4569g, this.f4570h);
            C4926t a = this.f4571i.mo5592a();
            if (a != null) {
                pVar = a.f12816b;
                mVar = a.f12818d;
            } else {
                pVar = null;
                mVar = null;
            }
            boolean z = false;
            if ((mVar == null || mVar.f12792d) || this.f4572j) {
                C1404k.this.m6479a(this.f4568f.getTime());
            }
            C1404k.this.mo5573a(pVar);
            C1404k.this.m6537m();
            if (pVar != null) {
                C1404k.this.mo5570a(pVar.f12805b);
            }
            if (C4820l.m19399a(C1404k.this.f4489b.mo13833i()).mo13878a() && !C1404k.this.m6525c(a)) {
                z = true;
            }
            if (z) {
                C1404k.this.m6516b(a);
            }
            return null;
        }
    }

    /* renamed from: com.crashlytics.android.e.k$w */
    class C1443w implements Callable<Void> {

        /* renamed from: f */
        final /* synthetic */ long f4574f;

        /* renamed from: g */
        final /* synthetic */ String f4575g;

        C1443w(long j, String str) {
            this.f4574f = j;
            this.f4575g = str;
        }

        public Void call() {
            if (!C1404k.this.mo5585f()) {
                C1404k.this.f4497j.mo5483a(this.f4574f, this.f4575g);
            }
            return null;
        }
    }

    /* renamed from: com.crashlytics.android.e.k$x */
    class C1444x implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Date f4577f;

        /* renamed from: g */
        final /* synthetic */ Thread f4578g;

        /* renamed from: h */
        final /* synthetic */ Throwable f4579h;

        C1444x(Date date, Thread thread, Throwable th) {
            this.f4577f = date;
            this.f4578g = thread;
            this.f4579h = th;
        }

        public void run() {
            if (!C1404k.this.mo5585f()) {
                C1404k.this.m6500a(this.f4577f, this.f4578g, this.f4579h);
            }
        }
    }

    /* renamed from: com.crashlytics.android.e.k$y */
    private static class C1445y implements FilenameFilter {
        private C1445y() {
        }

        /* synthetic */ C1445y(C1426j jVar) {
            this();
        }

        public boolean accept(File file, String str) {
            return !C1404k.f4481t.accept(file, str) && C1404k.f4485x.matcher(str).matches();
        }
    }

    /* renamed from: com.crashlytics.android.e.k$z */
    private interface C1446z {
        /* renamed from: a */
        void mo5603a(C1387g gVar);
    }

    C1404k(C1448l lVar, C1400j jVar, C4896e eVar, C4830s sVar, C1403j0 j0Var, C4901a aVar, C1370a aVar2, C1489w0 w0Var, C1375b bVar, C1355n nVar) {
        this.f4489b = lVar;
        this.f4490c = jVar;
        this.f4491d = eVar;
        this.f4492e = sVar;
        this.f4493f = j0Var;
        this.f4494g = aVar;
        this.f4495h = aVar2;
        this.f4502o = w0Var.mo5496a();
        this.f4503p = bVar;
        this.f4504q = nVar;
        Context i = lVar.mo13833i();
        this.f4496i = new C1414e0(aVar);
        this.f4497j = new C1371a0(i, this.f4496i);
        this.f4498k = new C1420g0(this, null);
        this.f4499l = new C1423h0(this, null);
        this.f4500m = new C1486w(i);
        this.f4501n = new C1381d0(1024, new C1460n0(10));
    }

    /* renamed from: a */
    private C1479t m6477a(String str, String str2) {
        String b = C4813i.m19373b(this.f4489b.mo13833i(), "com.crashlytics.ApiEndpoint");
        return new C1390h(new C1484v(this.f4489b, b, str, this.f4491d), new C1386f0(this.f4489b, b, str2, this.f4491d));
    }

    /* renamed from: a */
    static String m6478a(File file) {
        return file.getName().substring(0, 35);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6479a(long j) {
        String str = "CrashlyticsCore";
        if (m6538n()) {
            C4781c.m19229f().mo13796e(str, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return;
        }
        if (this.f4504q != null) {
            C4781c.m19229f().mo13796e(str, "Logging Crashlytics event to Firebase");
            Bundle bundle = new Bundle();
            bundle.putInt("_r", 1);
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", j);
            this.f4504q.mo5443a("clx", "_ae", bundle);
        } else {
            C4781c.m19229f().mo13796e(str, "Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6480a(Context context, File file, String str) {
        byte[] b = C1389g0.m6445b(file);
        byte[] a = C1389g0.m6442a(file);
        byte[] b2 = C1389g0.m6446b(file, context);
        String str2 = "CrashlyticsCore";
        if (b == null || b.length == 0) {
            C4795l f = C4781c.m19229f();
            StringBuilder sb = new StringBuilder();
            sb.append("No minidump data found in directory ");
            sb.append(file);
            f.mo13787a(str2, sb.toString());
            return;
        }
        m6524c(str, "<native-crash: minidump>");
        byte[] b3 = m6519b(str, "BeginSession.json");
        byte[] b4 = m6519b(str, "SessionApp.json");
        byte[] b5 = m6519b(str, "SessionDevice.json");
        byte[] b6 = m6519b(str, "SessionOS.json");
        byte[] d = C1389g0.m6449d(new C1379c0(mo5582c()).mo5502b(str));
        C1371a0 a0Var = new C1371a0(this.f4489b.mo13833i(), this.f4496i, str);
        byte[] c = a0Var.mo5488c();
        a0Var.mo5482a();
        byte[] d2 = C1389g0.m6449d(new C1379c0(mo5582c()).mo5500a(str));
        File file2 = new File(this.f4494g.mo14050a(), str);
        if (!file2.mkdir()) {
            C4781c.m19229f().mo13796e(str2, "Couldn't create native sessions directory");
            return;
        }
        m6518b(b, new File(file2, "minidump"));
        m6518b(a, new File(file2, "metadata"));
        m6518b(b2, new File(file2, "binaryImages"));
        m6518b(b3, new File(file2, "session"));
        m6518b(b4, new File(file2, "app"));
        m6518b(b5, new File(file2, "device"));
        m6518b(b6, new File(file2, "os"));
        m6518b(d, new File(file2, "user"));
        m6518b(c, new File(file2, "logs"));
        m6518b(d2, new File(file2, "keys"));
    }

    /* renamed from: a */
    private void m6481a(C1384f fVar) {
        if (fVar != null) {
            try {
                fVar.mo5511a();
            } catch (IOException e) {
                C4781c.m19229f().mo13793c("CrashlyticsCore", "Error closing session file stream in the presence of an exception", e);
            }
        }
    }

    /* renamed from: a */
    private static void m6482a(C1387g gVar, File file) {
        String str = "Failed to close file input stream.";
        FileInputStream fileInputStream = null;
        if (!file.exists()) {
            C4795l f = C4781c.m19229f();
            StringBuilder sb = new StringBuilder();
            sb.append("Tried to include a file that doesn't exist: ");
            sb.append(file.getName());
            f.mo13793c("CrashlyticsCore", sb.toString(), null);
            return;
        }
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                m6494a((InputStream) fileInputStream2, gVar, (int) file.length());
                C4813i.m19366a((Closeable) fileInputStream2, str);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                C4813i.m19366a((Closeable) fileInputStream, str);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C4813i.m19366a((Closeable) fileInputStream, str);
            throw th;
        }
    }

    /* renamed from: a */
    private void m6483a(C1387g gVar, String str) {
        String[] strArr;
        for (String str2 : f4487z) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append(".cls");
            File[] a = m6509a((FilenameFilter) new C1408b0(sb.toString()));
            String str3 = " data for session ID ";
            String str4 = "CrashlyticsCore";
            if (a.length == 0) {
                C4795l f = C4781c.m19229f();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't find ");
                sb2.append(str2);
                sb2.append(str3);
                sb2.append(str);
                f.mo13793c(str4, sb2.toString(), null);
            } else {
                C4795l f2 = C4781c.m19229f();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Collecting ");
                sb3.append(str2);
                sb3.append(str3);
                sb3.append(str);
                f2.mo13796e(str4, sb3.toString());
                m6482a(gVar, a[0]);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v2, types: [boolean]
      assigns: []
      uses: [boolean, ?[int, byte, short, char]]
      mth insns count: 75
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
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6484a(com.crashlytics.android.p033e.C1387g r25, java.util.Date r26, java.lang.Thread r27, java.lang.Throwable r28, java.lang.String r29, boolean r30) {
        /*
            r24 = this;
            r0 = r24
            com.crashlytics.android.e.v0 r5 = new com.crashlytics.android.e.v0
            com.crashlytics.android.e.u0 r1 = r0.f4501n
            r2 = r28
            r5.<init>(r2, r1)
            com.crashlytics.android.e.l r1 = r0.f4489b
            android.content.Context r1 = r1.mo13833i()
            long r2 = r26.getTime()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r6
            java.lang.Float r16 = p242i.p243a.p244a.p245a.p246n.p248b.C4813i.m19383e(r1)
            com.crashlytics.android.e.w r4 = r0.f4500m
            boolean r4 = r4.mo5661c()
            int r17 = p242i.p243a.p244a.p245a.p246n.p248b.C4813i.m19350a(r1, r4)
            boolean r18 = p242i.p243a.p244a.p245a.p246n.p248b.C4813i.m19385g(r1)
            android.content.res.Resources r4 = r1.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r13 = r4.orientation
            long r6 = p242i.p243a.p244a.p245a.p246n.p248b.C4813i.m19371b()
            long r8 = p242i.p243a.p244a.p245a.p246n.p248b.C4813i.m19351a(r1)
            long r19 = r6 - r8
            java.io.File r4 = android.os.Environment.getDataDirectory()
            java.lang.String r4 = r4.getPath()
            long r21 = p242i.p243a.p244a.p245a.p246n.p248b.C4813i.m19352a(r4)
            java.lang.String r4 = r1.getPackageName()
            android.app.ActivityManager$RunningAppProcessInfo r12 = p242i.p243a.p244a.p245a.p246n.p248b.C4813i.m19354a(r4, r1)
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            java.lang.StackTraceElement[] r7 = r5.f4653c
            com.crashlytics.android.e.a r4 = r0.f4495h
            java.lang.String r15 = r4.f4432b
            i.a.a.a.n.b.s r4 = r0.f4492e
            java.lang.String r14 = r4.mo13892c()
            r4 = 0
            if (r30 == 0) goto L_0x00a1
            java.util.Map r8 = java.lang.Thread.getAllStackTraces()
            int r10 = r8.size()
            java.lang.Thread[] r10 = new java.lang.Thread[r10]
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0078:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x009e
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r23 = r11.getKey()
            java.lang.Thread r23 = (java.lang.Thread) r23
            r10[r4] = r23
            com.crashlytics.android.e.u0 r6 = r0.f4501n
            java.lang.Object r11 = r11.getValue()
            java.lang.StackTraceElement[] r11 = (java.lang.StackTraceElement[]) r11
            java.lang.StackTraceElement[] r6 = r6.mo5509a(r11)
            r9.add(r6)
            r6 = 1
            int r4 = r4 + r6
            goto L_0x0078
        L_0x009e:
            r6 = 1
            r8 = r10
            goto L_0x00a5
        L_0x00a1:
            r6 = 1
            java.lang.Thread[] r4 = new java.lang.Thread[r4]
            r8 = r4
        L_0x00a5:
            java.lang.String r4 = "com.crashlytics.CollectCustomKeys"
            boolean r1 = p242i.p243a.p244a.p245a.p246n.p248b.C4813i.m19370a(r1, r4, r6)
            if (r1 != 0) goto L_0x00b3
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            goto L_0x00c8
        L_0x00b3:
            com.crashlytics.android.e.l r1 = r0.f4489b
            java.util.Map r1 = r1.mo5630v()
            if (r1 == 0) goto L_0x00c8
            int r4 = r1.size()
            if (r4 <= r6) goto L_0x00c8
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>(r1)
            r10 = r4
            goto L_0x00c9
        L_0x00c8:
            r10 = r1
        L_0x00c9:
            com.crashlytics.android.e.a0 r11 = r0.f4497j
            r1 = r25
            r4 = r29
            r6 = r27
            com.crashlytics.android.p033e.C1476r0.m6684a(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.p033e.C1404k.m6484a(com.crashlytics.android.e.g, java.util.Date, java.lang.Thread, java.lang.Throwable, java.lang.String, boolean):void");
    }

    /* renamed from: a */
    private static void m6485a(C1387g gVar, File[] fileArr, String str) {
        String str2 = "CrashlyticsCore";
        Arrays.sort(fileArr, C4813i.f12564d);
        for (File file : fileArr) {
            try {
                C4781c.m19229f().mo13796e(str2, String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[]{str, file.getName()}));
                m6482a(gVar, file);
            } catch (Exception e) {
                C4781c.m19229f().mo13793c(str2, "Error writting non-fatal to session.", e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean, code=int, for r5v0, types: [int, boolean] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m6491a(p242i.p243a.p244a.p245a.p246n.p254g.C4920p r4, int r5) {
        /*
            r3 = this;
            int r0 = r5 + 8
            r3.m6513b(r0)
            java.io.File[] r0 = r3.m6541q()
            int r1 = r0.length
            java.lang.String r2 = "CrashlyticsCore"
            if (r1 > r5) goto L_0x0018
            i.a.a.a.l r4 = p242i.p243a.p244a.p245a.C4781c.m19229f()
            java.lang.String r5 = "No open sessions to be closed."
            r4.mo13796e(r2, r5)
            return
        L_0x0018:
            r1 = r0[r5]
            java.lang.String r1 = m6478a(r1)
            r3.m6535g(r1)
            if (r4 != 0) goto L_0x002d
            i.a.a.a.l r4 = p242i.p243a.p244a.p245a.C4781c.m19229f()
            java.lang.String r5 = "Unable to close session. Settings are not loaded."
            r4.mo13796e(r2, r5)
            return
        L_0x002d:
            int r4 = r4.f12804a
            r3.m6503a(r0, r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.p033e.C1404k.m6491a(i.a.a.a.n.g.p, boolean):void");
    }

    /* renamed from: a */
    private void m6492a(File file, String str, int i) {
        C4795l f = C4781c.m19229f();
        StringBuilder sb = new StringBuilder();
        sb.append("Collecting session parts for ID ");
        sb.append(str);
        String str2 = "CrashlyticsCore";
        f.mo13796e(str2, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("SessionCrash");
        File[] a = m6509a((FilenameFilter) new C1408b0(sb2.toString()));
        boolean z = a != null && a.length > 0;
        C4781c.m19229f().mo13796e(str2, String.format(Locale.US, "Session %s has fatal exception: %s", new Object[]{str, Boolean.valueOf(z)}));
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("SessionEvent");
        File[] a2 = m6509a((FilenameFilter) new C1408b0(sb3.toString()));
        boolean z2 = a2 != null && a2.length > 0;
        C4781c.m19229f().mo13796e(str2, String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[]{str, Boolean.valueOf(z2)}));
        if (z || z2) {
            m6493a(file, str, m6510a(str, a2, i), z ? a[0] : null);
        } else {
            C4795l f2 = C4781c.m19229f();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("No events present for session ID ");
            sb4.append(str);
            f2.mo13796e(str2, sb4.toString());
        }
        C4795l f3 = C4781c.m19229f();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Removing session part files for ID ");
        sb5.append(str);
        f3.mo13796e(str2, sb5.toString());
        m6495a(str);
    }

    /* renamed from: a */
    private void m6493a(File file, String str, File[] fileArr, File file2) {
        C1384f fVar;
        String str2 = str;
        File file3 = file2;
        String str3 = "Failed to close CLS file";
        String str4 = "CrashlyticsCore";
        String str5 = "Error flushing session file stream";
        boolean z = file3 != null;
        File b = z ? mo5580b() : mo5584e();
        if (!b.exists()) {
            b.mkdirs();
        }
        try {
            fVar = new C1384f(b, str2);
            try {
                C1387g a = C1387g.m6393a((OutputStream) fVar);
                C4795l f = C4781c.m19229f();
                StringBuilder sb = new StringBuilder();
                sb.append("Collecting SessionStart data for session ID ");
                sb.append(str2);
                f.mo13796e(str4, sb.toString());
                m6482a(a, file);
                a.mo5520a(4, new Date().getTime() / 1000);
                a.mo5522a(5, z);
                a.mo5536d(11, 1);
                a.mo5519a(12, 3);
                m6483a(a, str2);
                m6485a(a, fileArr, str2);
                if (z) {
                    m6482a(a, file3);
                }
                C4813i.m19367a((Flushable) a, str5);
                C4813i.m19366a((Closeable) fVar, str3);
            } catch (Exception e) {
                e = e;
                try {
                    C4795l f2 = C4781c.m19229f();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to write session file for session ID: ");
                    sb2.append(str2);
                    f2.mo13793c(str4, sb2.toString(), e);
                    C4813i.m19367a((Flushable) null, str5);
                    m6481a(fVar);
                } catch (Throwable th) {
                    th = th;
                    C4813i.m19367a((Flushable) null, str5);
                    C4813i.m19366a((Closeable) fVar, str3);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            fVar = null;
            C4795l f22 = C4781c.m19229f();
            StringBuilder sb22 = new StringBuilder();
            sb22.append("Failed to write session file for session ID: ");
            sb22.append(str2);
            f22.mo13793c(str4, sb22.toString(), e);
            C4813i.m19367a((Flushable) null, str5);
            m6481a(fVar);
        } catch (Throwable th2) {
            th = th2;
            fVar = null;
            C4813i.m19367a((Flushable) null, str5);
            C4813i.m19366a((Closeable) fVar, str3);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m6494a(InputStream inputStream, C1387g gVar, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        gVar.mo5526a(bArr);
    }

    /* renamed from: a */
    private void m6495a(String str) {
        for (File delete : m6526c(str)) {
            delete.delete();
        }
    }

    /* renamed from: a */
    private void m6496a(String str, int i) {
        File c = mo5582c();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("SessionEvent");
        C1493y0.m6739a(c, new C1408b0(sb.toString()), i, f4484w);
    }

    /* renamed from: a */
    private void m6497a(String str, String str2, C1410c0 c0Var) {
        String str3 = " file.";
        String str4 = "Failed to close ";
        FileOutputStream fileOutputStream = null;
        try {
            File c = mo5582c();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(c, sb.toString()));
            try {
                c0Var.mo5596a(fileOutputStream2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append(str2);
                sb2.append(str3);
                C4813i.m19366a((Closeable) fileOutputStream2, sb2.toString());
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str4);
                sb3.append(str2);
                sb3.append(str3);
                C4813i.m19366a((Closeable) fileOutputStream, sb3.toString());
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            StringBuilder sb32 = new StringBuilder();
            sb32.append(str4);
            sb32.append(str2);
            sb32.append(str3);
            C4813i.m19366a((Closeable) fileOutputStream, sb32.toString());
            throw th;
        }
    }

    /* renamed from: a */
    private void m6498a(String str, String str2, C1446z zVar) {
        C1384f fVar;
        String str3 = "Failed to close session ";
        String str4 = "Failed to flush to session ";
        String str5 = " file.";
        C1387g gVar = null;
        try {
            File c = mo5582c();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            fVar = new C1384f(c, sb.toString());
            try {
                gVar = C1387g.m6393a((OutputStream) fVar);
                zVar.mo5603a(gVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str4);
                sb2.append(str2);
                sb2.append(str5);
                C4813i.m19367a((Flushable) gVar, sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(str2);
                sb3.append(str5);
                C4813i.m19366a((Closeable) fVar, sb3.toString());
            } catch (Throwable th) {
                th = th;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str4);
                sb4.append(str2);
                sb4.append(str5);
                C4813i.m19367a((Flushable) gVar, sb4.toString());
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str3);
                sb5.append(str2);
                sb5.append(str5);
                C4813i.m19366a((Closeable) fVar, sb5.toString());
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fVar = null;
            StringBuilder sb42 = new StringBuilder();
            sb42.append(str4);
            sb42.append(str2);
            sb42.append(str5);
            C4813i.m19367a((Flushable) gVar, sb42.toString());
            StringBuilder sb52 = new StringBuilder();
            sb52.append(str3);
            sb52.append(str2);
            sb52.append(str5);
            C4813i.m19366a((Closeable) fVar, sb52.toString());
            throw th;
        }
    }

    /* renamed from: a */
    private void m6499a(String str, Date date) {
        String str2 = str;
        String format = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{this.f4489b.mo5402p()});
        long time = date.getTime() / 1000;
        C1419g gVar = new C1419g(this, str2, format, time);
        m6498a(str, "BeginSession", (C1446z) gVar);
        C1421h hVar = new C1421h(this, str2, format, time);
        m6497a(str, "BeginSession.json", (C1410c0) hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6500a(Date date, Thread thread, Throwable th) {
        C1384f fVar;
        String str = "Failed to close non-fatal file output stream.";
        String str2 = "Failed to flush to non-fatal file.";
        String o = m6539o();
        C1387g gVar = null;
        String str3 = "CrashlyticsCore";
        if (o == null) {
            C4781c.m19229f().mo13793c(str3, "Tried to write a non-fatal exception while no session was open.", null);
            return;
        }
        m6529d(o, th.getClass().getName());
        try {
            C4795l f = C4781c.m19229f();
            StringBuilder sb = new StringBuilder();
            sb.append("Crashlytics is logging non-fatal exception \"");
            sb.append(th);
            sb.append("\" from thread ");
            sb.append(thread.getName());
            f.mo13796e(str3, sb.toString());
            String b = C4813i.m19372b(this.f4488a.getAndIncrement());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(o);
            sb2.append("SessionEvent");
            sb2.append(b);
            fVar = new C1384f(mo5582c(), sb2.toString());
            try {
                C1387g a = C1387g.m6393a((OutputStream) fVar);
                try {
                    m6484a(a, date, thread, th, "error", false);
                    C4813i.m19367a((Flushable) a, str2);
                } catch (Exception e) {
                    e = e;
                    gVar = a;
                    try {
                        C4781c.m19229f().mo13793c(str3, "An error occurred in the non-fatal exception logger", e);
                        C4813i.m19367a((Flushable) gVar, str2);
                        C4813i.m19366a((Closeable) fVar, str);
                        m6496a(o, 64);
                    } catch (Throwable th2) {
                        th = th2;
                        C4813i.m19367a((Flushable) gVar, str2);
                        C4813i.m19366a((Closeable) fVar, str);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    gVar = a;
                    C4813i.m19367a((Flushable) gVar, str2);
                    C4813i.m19366a((Closeable) fVar, str);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                C4781c.m19229f().mo13793c(str3, "An error occurred in the non-fatal exception logger", e);
                C4813i.m19367a((Flushable) gVar, str2);
                C4813i.m19366a((Closeable) fVar, str);
                m6496a(o, 64);
            }
        } catch (Exception e3) {
            e = e3;
            fVar = null;
            C4781c.m19229f().mo13793c(str3, "An error occurred in the non-fatal exception logger", e);
            C4813i.m19367a((Flushable) gVar, str2);
            C4813i.m19366a((Closeable) fVar, str);
            m6496a(o, 64);
        } catch (Throwable th4) {
            th = th4;
            fVar = null;
            C4813i.m19367a((Flushable) gVar, str2);
            C4813i.m19366a((Closeable) fVar, str);
            throw th;
        }
        C4813i.m19366a((Closeable) fVar, str);
        try {
            m6496a(o, 64);
        } catch (Exception e4) {
            C4781c.m19229f().mo13793c(str3, "An error occurred when trimming non-fatal files.", e4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6501a(Set<File> set) {
        for (File c : set) {
            m6523c(c);
        }
    }

    /* renamed from: a */
    private void m6502a(byte[] bArr, File file) {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            try {
                gZIPOutputStream2.write(bArr);
                gZIPOutputStream2.finish();
                C4813i.m19365a((Closeable) gZIPOutputStream2);
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = gZIPOutputStream2;
                C4813i.m19365a((Closeable) gZIPOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C4813i.m19365a((Closeable) gZIPOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    private void m6503a(File[] fileArr, int i, int i2) {
        String str = "CrashlyticsCore";
        C4781c.m19229f().mo13796e(str, "Closing open sessions.");
        while (i < fileArr.length) {
            File file = fileArr[i];
            String a = m6478a(file);
            C4795l f = C4781c.m19229f();
            StringBuilder sb = new StringBuilder();
            sb.append("Closing session: ");
            sb.append(a);
            f.mo13796e(str, sb.toString());
            m6492a(file, a, i2);
            i++;
        }
    }

    /* renamed from: a */
    private void m6504a(File[] fileArr, Set<String> set) {
        C4795l f;
        StringBuilder sb;
        String str;
        for (File file : fileArr) {
            String name = file.getName();
            Matcher matcher = f4485x.matcher(name);
            String str2 = "CrashlyticsCore";
            if (!matcher.matches()) {
                f = C4781c.m19229f();
                sb = new StringBuilder();
                str = "Deleting unknown file: ";
            } else if (!set.contains(matcher.group(1))) {
                f = C4781c.m19229f();
                sb = new StringBuilder();
                str = "Trimming session file: ";
            }
            sb.append(str);
            sb.append(name);
            f.mo13796e(str2, sb.toString());
            file.delete();
        }
    }

    /* renamed from: a */
    private File[] m6507a(File file, FilenameFilter filenameFilter) {
        return m6521b(file.listFiles(filenameFilter));
    }

    /* renamed from: a */
    private File[] m6508a(FileFilter fileFilter) {
        return m6521b(mo5582c().listFiles(fileFilter));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public File[] m6509a(FilenameFilter filenameFilter) {
        return m6507a(mo5582c(), filenameFilter);
    }

    /* renamed from: a */
    private File[] m6510a(String str, File[] fileArr, int i) {
        if (fileArr.length <= i) {
            return fileArr;
        }
        C4781c.m19229f().mo13796e("CrashlyticsCore", String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[]{Integer.valueOf(i)}));
        m6496a(str, i);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("SessionEvent");
        return m6509a((FilenameFilter) new C1408b0(sb.toString()));
    }

    /* renamed from: b */
    private C1491x0 m6511b(String str) {
        return mo5585f() ? new C1491x0(this.f4489b.mo5633y(), this.f4489b.mo5634z(), this.f4489b.mo5632x()) : new C1379c0(mo5582c()).mo5503c(str);
    }

    /* renamed from: b */
    private void m6513b(int i) {
        HashSet hashSet = new HashSet();
        File[] q = m6541q();
        int min = Math.min(i, q.length);
        for (int i2 = 0; i2 < min; i2++) {
            hashSet.add(m6478a(q[i2]));
        }
        this.f4497j.mo5486a((Set<String>) hashSet);
        m6504a(m6509a((FilenameFilter) new C1445y(null)), (Set<String>) hashSet);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m6516b(C4926t tVar) {
        if (tVar == null) {
            C4781c.m19229f().mo13787a("CrashlyticsCore", "Cannot send reports. Settings are unavailable.");
            return;
        }
        Context i = this.f4489b.mo13833i();
        C4909e eVar = tVar.f12815a;
        C1465p0 p0Var = new C1465p0(this.f4495h.f4431a, m6477a(eVar.f12777c, eVar.f12778d), this.f4498k, this.f4499l);
        for (File s0Var : mo5586g()) {
            this.f4490c.mo5561a((Runnable) new C1425i0(i, new C1478s0(s0Var, f4486y), p0Var));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m6517b(Date date, Thread thread, Throwable th) {
        C1384f fVar;
        String str = "CrashlyticsCore";
        String str2 = "Failed to close fatal exception file output stream.";
        String str3 = "Failed to flush to session begin file.";
        C1387g gVar = null;
        try {
            String o = m6539o();
            if (o == null) {
                C4781c.m19229f().mo13793c(str, "Tried to write a fatal exception while no session was open.", null);
                C4813i.m19367a((Flushable) null, str3);
                C4813i.m19366a((Closeable) null, str2);
                return;
            }
            m6524c(o, th.getClass().getName());
            File c = mo5582c();
            StringBuilder sb = new StringBuilder();
            sb.append(o);
            sb.append("SessionCrash");
            fVar = new C1384f(c, sb.toString());
            try {
                gVar = C1387g.m6393a((OutputStream) fVar);
                m6484a(gVar, date, thread, th, "crash", true);
            } catch (Exception e) {
                e = e;
            }
            C4813i.m19367a((Flushable) gVar, str3);
            C4813i.m19366a((Closeable) fVar, str2);
        } catch (Exception e2) {
            e = e2;
            fVar = null;
            try {
                C4781c.m19229f().mo13793c(str, "An error occurred in the fatal exception logger", e);
                C4813i.m19367a((Flushable) gVar, str3);
                C4813i.m19366a((Closeable) fVar, str2);
            } catch (Throwable th2) {
                th = th2;
                C4813i.m19367a((Flushable) gVar, str3);
                C4813i.m19366a((Closeable) fVar, str2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fVar = null;
            C4813i.m19367a((Flushable) gVar, str3);
            C4813i.m19366a((Closeable) fVar, str2);
            throw th;
        }
    }

    /* renamed from: b */
    private void m6518b(byte[] bArr, File file) {
        if (bArr != null && bArr.length > 0) {
            m6502a(bArr, file);
        }
    }

    /* renamed from: b */
    private byte[] m6519b(String str, String str2) {
        File c = mo5582c();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return C1389g0.m6449d(new File(c, sb.toString()));
    }

    /* renamed from: b */
    private File[] m6520b(File file) {
        return m6521b(file.listFiles());
    }

    /* renamed from: b */
    private File[] m6521b(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    /* renamed from: c */
    private void m6523c(File file) {
        if (file.isDirectory()) {
            for (File c : file.listFiles()) {
                m6523c(c);
            }
        }
        file.delete();
    }

    /* renamed from: c */
    private static void m6524c(String str, String str2) {
        C1332b bVar = (C1332b) C4781c.m19220a(C1332b.class);
        if (bVar == null) {
            C4781c.m19229f().mo13796e("CrashlyticsCore", "Answers is not available");
        } else {
            bVar.mo5407a(new C4817a(str, str2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m6525c(C4926t tVar) {
        boolean z = false;
        if (tVar == null) {
            return false;
        }
        if (tVar.f12818d.f12789a && !this.f4493f.mo5567a()) {
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    private File[] m6526c(String str) {
        return m6509a((FilenameFilter) new C1427j0(str));
    }

    /* renamed from: d */
    private void m6528d(String str) {
        String c = this.f4492e.mo13892c();
        C1370a aVar = this.f4495h;
        String str2 = aVar.f4435e;
        String str3 = aVar.f4436f;
        String str4 = c;
        String str5 = str2;
        String str6 = str3;
        String d = this.f4492e.mo13893d();
        int f = C4821m.m19402a(this.f4495h.f4433c).mo13880f();
        C1424i iVar = new C1424i(str4, str5, str6, d, f);
        m6498a(str, "SessionApp", (C1446z) iVar);
        C1428k kVar = new C1428k(str4, str5, str6, d, f);
        m6497a(str, "SessionApp.json", (C1410c0) kVar);
    }

    /* renamed from: d */
    private static void m6529d(String str, String str2) {
        C1332b bVar = (C1332b) C4781c.m19220a(C1332b.class);
        if (bVar == null) {
            C4781c.m19229f().mo13796e("CrashlyticsCore", "Answers is not available");
        } else {
            bVar.mo5408a(new C4818b(str, str2));
        }
    }

    /* renamed from: e */
    private void m6531e(String str) {
        String str2 = str;
        Context i = this.f4489b.mo13833i();
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int a = C4813i.m19348a();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b = C4813i.m19371b();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean l = C4813i.m19390l(i);
        int i2 = a;
        int i3 = availableProcessors;
        long j = b;
        long j2 = blockCount;
        boolean z = l;
        Map e = this.f4492e.mo13894e();
        long j3 = b;
        C1433n nVar = r0;
        int f = C4813i.m19384f(i);
        C1433n nVar2 = new C1433n(this, i2, i3, j, j2, z, e, f);
        m6498a(str2, "SessionDevice", (C1446z) nVar);
        C1434o oVar = new C1434o(this, i2, i3, j3, j2, z, e, f);
        m6497a(str2, "SessionDevice.json", (C1410c0) oVar);
    }

    /* renamed from: f */
    private void m6533f(String str) {
        boolean m = C4813i.m19391m(this.f4489b.mo13833i());
        m6498a(str, "SessionOS", (C1446z) new C1430l(this, m));
        m6497a(str, "SessionOS.json", (C1410c0) new C1431m(this, m));
    }

    /* renamed from: g */
    private void m6535g(String str) {
        m6498a(str, "SessionUser", (C1446z) new C1436p(this, m6511b(str)));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m6537m() {
        Date date = new Date();
        String eVar = new C1382e(this.f4492e).toString();
        C4795l f = C4781c.m19229f();
        StringBuilder sb = new StringBuilder();
        sb.append("Opening a new session with ID ");
        sb.append(eVar);
        f.mo13796e("CrashlyticsCore", sb.toString());
        m6499a(eVar, date);
        m6528d(eVar);
        m6533f(eVar);
        m6531e(eVar);
        this.f4497j.mo5485a(eVar);
    }

    /* renamed from: n */
    private boolean m6538n() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public String m6539o() {
        File[] q = m6541q();
        if (q.length > 0) {
            return m6478a(q[0]);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public String m6540p() {
        File[] q = m6541q();
        if (q.length > 1) {
            return m6478a(q[1]);
        }
        return null;
    }

    /* renamed from: q */
    private File[] m6541q() {
        File[] i = mo5588i();
        Arrays.sort(i, f4483v);
        return i;
    }

    /* renamed from: r */
    private void m6542r() {
        File d = mo5583d();
        if (d.exists()) {
            File[] a = m6507a(d, (FilenameFilter) new C1412d0());
            Arrays.sort(a, Collections.reverseOrder());
            HashSet hashSet = new HashSet();
            for (int i = 0; i < a.length && hashSet.size() < 4; i++) {
                hashSet.add(m6478a(a[i]));
            }
            m6504a(m6520b(d), (Set<String>) hashSet);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5568a() {
        this.f4490c.mo5561a((Runnable) new C1411d());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5569a(float f, C4926t tVar) {
        if (tVar == null) {
            C4781c.m19229f().mo13787a("CrashlyticsCore", "Could not send reports. Settings are not available.");
            return;
        }
        C4909e eVar = tVar.f12815a;
        new C1465p0(this.f4495h.f4431a, m6477a(eVar.f12777c, eVar.f12778d), this.f4498k, this.f4499l).mo5647a(f, m6525c(tVar) ? new C1416f0(this.f4489b, this.f4493f, tVar.f12817c) : new C1466a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5570a(int i) {
        int a = i - C1493y0.m6738a(mo5580b(), i, f4484w);
        C1493y0.m6739a(mo5582c(), f4481t, a - C1493y0.m6738a(mo5584e(), a, f4484w), f4484w);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5571a(long j, String str) {
        this.f4490c.mo5562a((Callable<T>) new C1443w<T>(j, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo5572a(C1475b bVar, Thread thread, Throwable th, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics is handling uncaught exception \"");
        sb.append(th);
        sb.append("\" from thread ");
        sb.append(thread.getName());
        C4781c.m19229f().mo13796e("CrashlyticsCore", sb.toString());
        this.f4500m.mo5659a();
        Date date = new Date();
        C1400j jVar = this.f4490c;
        C1442v vVar = new C1442v(date, thread, th, bVar, z);
        jVar.mo5563b(vVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5573a(C4920p pVar) {
        m6491a(pVar, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5574a(C4926t tVar) {
        if (tVar.f12818d.f12792d) {
            boolean a = this.f4503p.mo5495a();
            C4795l f = C4781c.m19229f();
            StringBuilder sb = new StringBuilder();
            sb.append("Registered Firebase Analytics event listener for breadcrumbs: ");
            sb.append(a);
            f.mo13796e("CrashlyticsCore", sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5575a(UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        mo5589j();
        C1473r rVar = new C1473r(new C1441u(), new C1406a0(null), z, uncaughtExceptionHandler);
        this.f4505r = rVar;
        Thread.setDefaultUncaughtExceptionHandler(rVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5576a(Thread thread, Throwable th) {
        this.f4490c.mo5561a((Runnable) new C1444x(new Date(), thread, th));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5577a(Map<String, String> map) {
        this.f4490c.mo5562a((Callable<T>) new C1405a<T>(map));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5578a(File[] fileArr) {
        String str;
        File[] a;
        HashSet hashSet = new HashSet();
        int length = fileArr.length;
        int i = 0;
        while (true) {
            str = "CrashlyticsCore";
            if (i >= length) {
                break;
            }
            File file = fileArr[i];
            C4795l f = C4781c.m19229f();
            StringBuilder sb = new StringBuilder();
            sb.append("Found invalid session part file: ");
            sb.append(file);
            f.mo13796e(str, sb.toString());
            hashSet.add(m6478a(file));
            i++;
        }
        if (!hashSet.isEmpty()) {
            File d = mo5583d();
            if (!d.exists()) {
                d.mkdir();
            }
            for (File file2 : m6509a((FilenameFilter) new C1413e(this, hashSet))) {
                C4795l f2 = C4781c.m19229f();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Moving session file: ");
                sb2.append(file2);
                f2.mo13796e(str, sb2.toString());
                if (!file2.renameTo(new File(d, file2.getName()))) {
                    C4795l f3 = C4781c.m19229f();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Could not move session file. Deleting ");
                    sb3.append(file2);
                    f3.mo13796e(str, sb3.toString());
                    file2.delete();
                }
            }
            m6542r();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5579a(C1461o oVar) {
        if (oVar == null) {
            return true;
        }
        return ((Boolean) this.f4490c.mo5563b(new C1415f(oVar))).booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public File mo5580b() {
        return new File(mo5582c(), "fatal-sessions");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo5581b(C4920p pVar) {
        return ((Boolean) this.f4490c.mo5563b(new C1409c(pVar))).booleanValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public File mo5582c() {
        return this.f4494g.mo14050a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public File mo5583d() {
        return new File(mo5582c(), "invalidClsFiles");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public File mo5584e() {
        return new File(mo5582c(), "nonfatal-sessions");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo5585f() {
        C1473r rVar = this.f4505r;
        return rVar != null && rVar.mo5654a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public File[] mo5586g() {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, m6507a(mo5580b(), f4481t));
        Collections.addAll(linkedList, m6507a(mo5584e(), f4481t));
        Collections.addAll(linkedList, m6507a(mo5582c(), f4481t));
        return (File[]) linkedList.toArray(new File[linkedList.size()]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public File[] mo5587h() {
        return m6508a(f4482u);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public File[] mo5588i() {
        return m6509a(f4480s);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo5589j() {
        this.f4490c.mo5562a((Callable<T>) new C1407b<T>());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo5590k() {
        this.f4500m.mo5660b();
    }
}
