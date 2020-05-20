package p147g.p148a.p149a;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.location.Location;
import android.os.Build.VERSION;
import android.util.Pair;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p337m.C6462x;

/* renamed from: g.a.a.d */
public class C3679d {

    /* renamed from: R */
    private static final String f10379R = "g.a.a.d";

    /* renamed from: S */
    private static final C3690f f10380S = C3690f.m15021a();

    /* renamed from: A */
    private long f10381A;

    /* renamed from: B */
    private long f10382B;

    /* renamed from: C */
    private long f10383C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f10384D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f10385E;

    /* renamed from: F */
    private boolean f10386F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f10387G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f10388H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public boolean f10389I;

    /* renamed from: J */
    private String f10390J;

    /* renamed from: K */
    private String f10391K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public AtomicBoolean f10392L;

    /* renamed from: M */
    AtomicBoolean f10393M;

    /* renamed from: N */
    String f10394N;

    /* renamed from: O */
    String f10395O;

    /* renamed from: P */
    C3701o f10396P;

    /* renamed from: Q */
    C3701o f10397Q;

    /* renamed from: a */
    protected Context f10398a;

    /* renamed from: b */
    protected C6462x f10399b;

    /* renamed from: c */
    protected C3693i f10400c;

    /* renamed from: d */
    protected String f10401d;

    /* renamed from: e */
    protected String f10402e;

    /* renamed from: f */
    protected String f10403f;

    /* renamed from: g */
    protected String f10404g;

    /* renamed from: h */
    private boolean f10405h;

    /* renamed from: i */
    private boolean f10406i;

    /* renamed from: j */
    protected boolean f10407j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f10408k;

    /* renamed from: l */
    private boolean f10409l;

    /* renamed from: m */
    C3699m f10410m;

    /* renamed from: n */
    C3699m f10411n;

    /* renamed from: o */
    JSONObject f10412o;

    /* renamed from: p */
    protected String f10413p;

    /* renamed from: q */
    long f10414q;

    /* renamed from: r */
    long f10415r;

    /* renamed from: s */
    long f10416s;

    /* renamed from: t */
    long f10417t;

    /* renamed from: u */
    long f10418u;

    /* renamed from: v */
    long f10419v;

    /* renamed from: w */
    private C3695k f10420w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public int f10421x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public int f10422y;

    /* renamed from: z */
    private int f10423z;

    /* renamed from: g.a.a.d$a */
    class C3680a implements Runnable {
        C3680a() {
        }

        public void run() {
            C3679d.this.f10392L.set(false);
            C3679d.this.mo11691c();
        }
    }

    /* renamed from: g.a.a.d$b */
    class C3681b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f10425f;

        /* renamed from: g */
        final /* synthetic */ long f10426g;

        /* renamed from: h */
        final /* synthetic */ long f10427h;

        C3681b(String str, long j, long j2) {
            this.f10425f = str;
            this.f10426g = j;
            this.f10427h = j2;
        }

        public void run() {
            C3679d dVar = C3679d.this;
            dVar.mo11680a(dVar.f10399b, this.f10425f, this.f10426g, this.f10427h);
        }
    }

    /* renamed from: g.a.a.d$c */
    class C3682c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ long f10429f;

        /* renamed from: g */
        final /* synthetic */ long f10430g;

        /* renamed from: g.a.a.d$c$a */
        class C3683a implements Runnable {
            C3683a() {
            }

            public void run() {
                C3679d dVar = C3679d.this;
                dVar.mo11682a(dVar.f10384D);
            }
        }

        C3682c(long j, long j2) {
            this.f10429f = j;
            this.f10430g = j2;
        }

        public void run() {
            long j = this.f10429f;
            if (j >= 0) {
                C3679d.this.f10400c.mo11739k(j);
            }
            long j2 = this.f10430g;
            if (j2 >= 0) {
                C3679d.this.f10400c.mo11741m(j2);
            }
            C3679d.this.f10393M.set(false);
            if (C3679d.this.f10400c.mo11735f() > ((long) C3679d.this.f10421x)) {
                C3679d.this.f10396P.mo11776a(new C3683a());
                return;
            }
            C3679d.this.f10384D = false;
            C3679d dVar = C3679d.this;
            dVar.f10385E = dVar.f10422y;
        }
    }

    /* renamed from: g.a.a.d$d */
    class C3684d implements Runnable {
        C3684d() {
        }

        public void run() {
            C3679d.this.f10393M.set(false);
            C3679d.this.mo11682a(true);
        }
    }

    /* renamed from: g.a.a.d$e */
    class C3685e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f10434f;

        /* renamed from: g */
        final /* synthetic */ JSONObject f10435g;

        /* renamed from: h */
        final /* synthetic */ JSONObject f10436h;

        /* renamed from: i */
        final /* synthetic */ JSONObject f10437i;

        /* renamed from: j */
        final /* synthetic */ JSONObject f10438j;

        /* renamed from: k */
        final /* synthetic */ JSONObject f10439k;

        /* renamed from: l */
        final /* synthetic */ long f10440l;

        /* renamed from: m */
        final /* synthetic */ boolean f10441m;

        C3685e(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, long j, boolean z) {
            this.f10434f = str;
            this.f10435g = jSONObject;
            this.f10436h = jSONObject2;
            this.f10437i = jSONObject3;
            this.f10438j = jSONObject4;
            this.f10439k = jSONObject5;
            this.f10440l = j;
            this.f10441m = z;
        }

        public void run() {
            if (!C3700n.m15138a(C3679d.this.f10401d)) {
                C3679d.this.mo11661a(this.f10434f, this.f10435g, this.f10436h, this.f10437i, this.f10438j, this.f10439k, this.f10440l, this.f10441m);
            }
        }
    }

    /* renamed from: g.a.a.d$f */
    class C3686f implements Runnable {

        /* renamed from: f */
        final /* synthetic */ long f10443f;

        C3686f(long j) {
            this.f10443f = j;
        }

        public void run() {
            if (!C3700n.m15138a(C3679d.this.f10401d)) {
                C3679d.this.mo11692c(this.f10443f);
                C3679d.this.f10388H = false;
                if (C3679d.this.f10389I) {
                    C3679d.this.mo11691c();
                }
                C3679d dVar = C3679d.this;
                dVar.f10400c.mo11730c("device_id", dVar.f10404g);
                C3679d dVar2 = C3679d.this;
                dVar2.f10400c.mo11730c("user_id", dVar2.f10403f);
                C3679d dVar3 = C3679d.this;
                dVar3.f10400c.mo11719a("opt_out", Long.valueOf(dVar3.f10408k ? 1 : 0));
                C3679d dVar4 = C3679d.this;
                dVar4.f10400c.mo11719a("previous_session_id", Long.valueOf(dVar4.f10414q));
                C3679d dVar5 = C3679d.this;
                dVar5.f10400c.mo11719a("last_event_time", Long.valueOf(dVar5.f10418u));
            }
        }
    }

    /* renamed from: g.a.a.d$g */
    class C3687g implements Runnable {

        /* renamed from: f */
        final /* synthetic */ long f10445f;

        C3687g(long j) {
            this.f10445f = j;
        }

        public void run() {
            if (!C3700n.m15138a(C3679d.this.f10401d)) {
                C3679d.this.mo11699h(this.f10445f);
                C3679d.this.f10388H = true;
            }
        }
    }

    /* renamed from: g.a.a.d$h */
    class C3688h implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C3679d f10447f;

        /* renamed from: g */
        final /* synthetic */ boolean f10448g;

        /* renamed from: h */
        final /* synthetic */ String f10449h;

        C3688h(C3679d dVar, boolean z, String str) {
            this.f10447f = dVar;
            this.f10448g = z;
            this.f10449h = str;
        }

        public void run() {
            if (!C3700n.m15138a(this.f10447f.f10401d)) {
                if (this.f10448g && C3679d.this.f10387G) {
                    C3679d.this.m14971f("session_end");
                }
                C3679d dVar = this.f10447f;
                String str = this.f10449h;
                dVar.f10403f = str;
                C3679d.this.f10400c.mo11730c("user_id", str);
                if (this.f10448g) {
                    long a = C3679d.this.mo11660a();
                    C3679d.this.m14977j(a);
                    C3679d.this.mo11692c(a);
                    if (C3679d.this.f10387G) {
                        C3679d.this.m14971f("session_start");
                    }
                }
            }
        }
    }

    public C3679d() {
        this(null);
    }

    public C3679d(String str) {
        this.f10405h = false;
        this.f10406i = false;
        this.f10407j = false;
        this.f10408k = false;
        this.f10409l = false;
        C3699m mVar = new C3699m();
        this.f10410m = mVar;
        C3699m a = C3699m.m15117a(mVar);
        this.f10411n = a;
        this.f10412o = a.mo11761a();
        this.f10414q = -1;
        this.f10415r = 0;
        this.f10416s = -1;
        this.f10417t = -1;
        this.f10418u = -1;
        this.f10419v = -1;
        this.f10421x = 30;
        this.f10422y = 50;
        this.f10423z = 1000;
        this.f10381A = 30000;
        this.f10382B = 300000;
        this.f10383C = 1800000;
        this.f10384D = false;
        this.f10385E = 50;
        this.f10386F = false;
        this.f10387G = false;
        this.f10388H = false;
        this.f10389I = true;
        this.f10390J = "amplitude-android";
        this.f10391K = "2.25.0";
        this.f10392L = new AtomicBoolean(false);
        this.f10393M = new AtomicBoolean(false);
        this.f10394N = "https://api.amplitude.com/";
        this.f10395O = null;
        this.f10396P = new C3701o("logThread");
        this.f10397Q = new C3701o("httpThread");
        this.f10402e = C3700n.m15139b(str);
        this.f10396P.start();
        this.f10397Q.start();
    }

    /* renamed from: a */
    private long m14951a(String str, long j) {
        Long e = this.f10400c.mo11734e(str);
        return e == null ? j : e.longValue();
    }

    /* renamed from: a */
    private static void m14952a(SharedPreferences sharedPreferences, String str, long j, C3693i iVar, String str2) {
        if (iVar.mo11734e(str2) == null) {
            iVar.mo11719a(str2, Long.valueOf(sharedPreferences.getLong(str, j)));
            sharedPreferences.edit().remove(str).apply();
        }
    }

    /* renamed from: a */
    private static void m14953a(SharedPreferences sharedPreferences, String str, String str2, C3693i iVar, String str3) {
        if (C3700n.m15138a(iVar.mo11736f(str3))) {
            String string = sharedPreferences.getString(str, str2);
            if (!C3700n.m15138a(string)) {
                iVar.mo11730c(str3, string);
                sharedPreferences.edit().remove(str).apply();
            }
        }
    }

    /* renamed from: a */
    private static void m14954a(SharedPreferences sharedPreferences, String str, boolean z, C3693i iVar, String str2) {
        if (iVar.mo11734e(str2) == null) {
            iVar.mo11719a(str2, Long.valueOf(sharedPreferences.getBoolean(str, z) ? 1 : 0));
            sharedPreferences.edit().remove(str).apply();
        }
    }

    /* renamed from: a */
    static boolean m14957a(Context context) {
        return m14962b(context, null, null);
    }

    /* renamed from: b */
    static boolean m14960b(Context context) {
        return m14961b(context, (String) null);
    }

    /* renamed from: b */
    static boolean m14961b(Context context, String str) {
        if (str == null) {
            str = "com.amplitude.api";
        }
        C3693i a = C3693i.m15029a(context);
        String str2 = "device_id";
        String f = a.mo11736f(str2);
        Long e = a.mo11734e("previous_session_id");
        Long e2 = a.mo11734e("last_event_time");
        if (!C3700n.m15138a(f) && e != null && e2 != null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(context.getPackageName());
        SharedPreferences sharedPreferences = context.getSharedPreferences(sb.toString(), 0);
        m14953a(sharedPreferences, "com.amplitude.api.deviceId", (String) null, a, str2);
        SharedPreferences sharedPreferences2 = sharedPreferences;
        C3693i iVar = a;
        m14952a(sharedPreferences2, "com.amplitude.api.lastEventTime", -1, iVar, "last_event_time");
        m14952a(sharedPreferences2, "com.amplitude.api.lastEventId", -1, iVar, "last_event_id");
        m14952a(sharedPreferences2, "com.amplitude.api.lastIdentifyId", -1, iVar, "last_identify_id");
        m14952a(sharedPreferences2, "com.amplitude.api.previousSessionId", -1, iVar, "previous_session_id");
        m14953a(sharedPreferences, "com.amplitude.api.userId", (String) null, a, "user_id");
        m14954a(sharedPreferences, "com.amplitude.api.optOut", false, a, "opt_out");
        return true;
    }

    /* renamed from: b */
    static boolean m14962b(Context context, String str, String str2) {
        String str3 = ".optOut";
        String str4 = ".userId";
        String str5 = ".deviceId";
        String str6 = ".previousSessionId";
        String str7 = ".";
        String str8 = "com.amplitude.api";
        if (str == null) {
            try {
                str = C3691g.class.getPackage().getName();
            } catch (Exception unused) {
                str = str8;
            }
        }
        if (str2 == null) {
            str2 = str8;
        }
        try {
            if (str2.equals(str)) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str7);
            sb.append(context.getPackageName());
            String sb2 = sb.toString();
            SharedPreferences sharedPreferences = context.getSharedPreferences(sb2, 0);
            if (sharedPreferences.getAll().size() == 0) {
                return false;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(str7);
            sb3.append(context.getPackageName());
            String sb4 = sb3.toString();
            Editor edit = context.getSharedPreferences(sb4, 0).edit();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append(str6);
            if (sharedPreferences.contains(sb5.toString())) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(str6);
                edit.putLong("com.amplitude.api.previousSessionId", sharedPreferences.getLong(sb6.toString(), -1));
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str);
            sb7.append(str5);
            if (sharedPreferences.contains(sb7.toString())) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(str5);
                edit.putString("com.amplitude.api.deviceId", sharedPreferences.getString(sb8.toString(), null));
            }
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str);
            sb9.append(str4);
            if (sharedPreferences.contains(sb9.toString())) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(str4);
                edit.putString("com.amplitude.api.userId", sharedPreferences.getString(sb10.toString(), null));
            }
            StringBuilder sb11 = new StringBuilder();
            sb11.append(str);
            sb11.append(str3);
            if (sharedPreferences.contains(sb11.toString())) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(str3);
                edit.putBoolean("com.amplitude.api.optOut", sharedPreferences.getBoolean(sb12.toString(), false));
            }
            edit.apply();
            sharedPreferences.edit().clear().apply();
            C3690f fVar = f10380S;
            String str9 = f10379R;
            StringBuilder sb13 = new StringBuilder();
            sb13.append("Upgraded shared preferences from ");
            sb13.append(sb2);
            sb13.append(" to ");
            sb13.append(sb4);
            fVar.mo11714c(str9, sb13.toString());
            return true;
        } catch (Exception e) {
            f10380S.mo11711a(f10379R, "Error upgrading shared preferences", e);
            return false;
        }
    }

    /* renamed from: e */
    private Set<String> m14967e() {
        HashSet hashSet = new HashSet();
        hashSet.add("");
        hashSet.add("9774d56d682e549c");
        hashSet.add("unknown");
        hashSet.add("000000000000000");
        hashSet.add("Android");
        hashSet.add("DEFACE");
        hashSet.add("00000000-0000-0000-0000-000000000000");
        return hashSet;
    }

    /* renamed from: e */
    private void m14968e(String str) {
        String str2 = "device_id";
        this.f10400c.mo11730c(str2, str);
        C3700n.m15137a(this.f10398a, this.f10402e, str2, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m14971f(String str) {
        if (mo11683a(String.format("sendSessionEvent('%s')", new Object[]{str})) && m14972f()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("special", str);
                mo11661a(str, null, jSONObject, null, null, null, this.f10418u, false);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: f */
    private boolean m14972f() {
        return this.f10414q >= 0;
    }

    /* renamed from: g */
    private String m14974g() {
        Set e = m14967e();
        String str = "device_id";
        String f = this.f10400c.mo11736f(str);
        String a = C3700n.m15135a(this.f10398a, this.f10402e, str);
        if (!C3700n.m15138a(f) && !e.contains(f)) {
            if (!f.equals(a)) {
                m14968e(f);
            }
            return f;
        } else if (C3700n.m15138a(a) || e.contains(a)) {
            if (!this.f10405h && this.f10406i && !this.f10420w.mo11757n()) {
                String a2 = this.f10420w.mo11744a();
                if (!C3700n.m15138a(a2) && !e.contains(a2)) {
                    m14968e(a2);
                    return a2;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C3695k.m15069r());
            sb.append("R");
            String sb2 = sb.toString();
            m14968e(sb2);
            return sb2;
        } else {
            m14968e(a);
            return a;
        }
    }

    /* renamed from: g */
    public static String m14975g(String str) {
        return str.length() <= 1024 ? str : str.substring(0, 1024);
    }

    /* renamed from: i */
    private boolean m14976i(long j) {
        return j - this.f10418u < (this.f10386F ? this.f10382B : this.f10383C);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m14977j(long j) {
        this.f10414q = j;
        mo11698g(j);
    }

    /* renamed from: k */
    private void m14978k(long j) {
        if (this.f10387G) {
            m14971f("session_end");
        }
        m14977j(j);
        mo11692c(j);
        if (this.f10387G) {
            m14971f("session_start");
        }
    }

    /* renamed from: l */
    private void m14979l(long j) {
        if (!this.f10392L.getAndSet(true)) {
            this.f10396P.mo11777a(new C3680a(), j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo11660a() {
        return System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo11661a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, long j, boolean z) {
        long j2;
        String str2 = str;
        JSONObject jSONObject6 = jSONObject;
        JSONObject jSONObject7 = jSONObject3;
        JSONObject jSONObject8 = jSONObject4;
        JSONObject jSONObject9 = jSONObject5;
        long j3 = j;
        C3690f fVar = f10380S;
        String str3 = f10379R;
        StringBuilder sb = new StringBuilder();
        sb.append("Logged event to Amplitude: ");
        sb.append(str2);
        fVar.mo11710a(str3, sb.toString());
        if (this.f10408k) {
            return -1;
        }
        if (!(this.f10387G && (str2.equals("session_start") || str2.equals("session_end"))) && !z) {
            if (!this.f10388H) {
                mo11699h(j3);
            } else {
                mo11692c(j3);
            }
        }
        JSONObject jSONObject10 = new JSONObject();
        try {
            jSONObject10.put("event_type", mo11668a((Object) str));
            jSONObject10.put("timestamp", j3);
            jSONObject10.put("user_id", mo11668a((Object) this.f10403f));
            jSONObject10.put("device_id", mo11668a((Object) this.f10404g));
            jSONObject10.put("session_id", z ? -1 : this.f10414q);
            jSONObject10.put("uuid", UUID.randomUUID().toString());
            jSONObject10.put("sequence_number", mo11684b());
            if (this.f10411n.mo11775n()) {
                jSONObject10.put("version_name", mo11668a((Object) this.f10420w.mo11755l()));
            }
            if (this.f10411n.mo11772k()) {
                jSONObject10.put("os_name", mo11668a((Object) this.f10420w.mo11753j()));
            }
            if (this.f10411n.mo11773l()) {
                jSONObject10.put("os_version", mo11668a((Object) this.f10420w.mo11754k()));
            }
            if (this.f10411n.mo11763c()) {
                jSONObject10.put("api_level", mo11668a((Object) Integer.valueOf(VERSION.SDK_INT)));
            }
            if (this.f10411n.mo11767f()) {
                jSONObject10.put("device_brand", mo11668a((Object) this.f10420w.mo11745b()));
            }
            if (this.f10411n.mo11768g()) {
                jSONObject10.put("device_manufacturer", mo11668a((Object) this.f10420w.mo11750g()));
            }
            if (this.f10411n.mo11769h()) {
                jSONObject10.put("device_model", mo11668a((Object) this.f10420w.mo11751h()));
            }
            if (this.f10411n.mo11764d()) {
                jSONObject10.put("carrier", mo11668a((Object) this.f10420w.mo11746c()));
            }
            if (this.f10411n.mo11765e()) {
                jSONObject10.put("country", mo11668a((Object) this.f10420w.mo11747d()));
            }
            if (this.f10411n.mo11770i()) {
                jSONObject10.put("language", mo11668a((Object) this.f10420w.mo11749f()));
            }
            if (this.f10411n.mo11774m()) {
                jSONObject10.put("platform", this.f10413p);
            }
            JSONObject jSONObject11 = new JSONObject();
            jSONObject11.put("name", this.f10390J == null ? "unknown-library" : this.f10390J);
            jSONObject11.put("version", this.f10391K == null ? "unknown-version" : this.f10391K);
            jSONObject10.put("library", jSONObject11);
            JSONObject jSONObject12 = jSONObject2 == null ? new JSONObject() : jSONObject2;
            if (this.f10412o != null && this.f10412o.length() > 0) {
                jSONObject12.put("tracking_options", this.f10412o);
            }
            if (this.f10411n.mo11771j()) {
                Location i = this.f10420w.mo11752i();
                if (i != null) {
                    JSONObject jSONObject13 = new JSONObject();
                    jSONObject13.put("lat", i.getLatitude());
                    jSONObject13.put("lng", i.getLongitude());
                    jSONObject12.put("location", jSONObject13);
                }
            }
            if (this.f10411n.mo11762b() && this.f10420w.mo11744a() != null) {
                jSONObject12.put("androidADID", this.f10420w.mo11744a());
            }
            jSONObject12.put("limit_ad_tracking", this.f10420w.mo11757n());
            jSONObject12.put("gps_enabled", this.f10420w.mo11756m());
            jSONObject10.put("api_properties", jSONObject12);
            jSONObject10.put("event_properties", jSONObject6 == null ? new JSONObject() : mo11686b(jSONObject6));
            jSONObject10.put("user_properties", jSONObject7 == null ? new JSONObject() : mo11686b(jSONObject7));
            jSONObject10.put("groups", jSONObject8 == null ? new JSONObject() : mo11686b(jSONObject8));
            jSONObject10.put("group_properties", jSONObject9 == null ? new JSONObject() : mo11686b(jSONObject9));
            j2 = mo11685b(str2, jSONObject10);
        } catch (JSONException e) {
            f10380S.mo11713b(f10379R, String.format("JSON Serialization of event type %s failed, skipping: %s", new Object[]{str2, e.toString()}));
            j2 = -1;
        }
        return j2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0087, code lost:
        if (((org.json.JSONObject) r15.get(0)).getLong(r8) >= ((org.json.JSONObject) r1.get(0)).getLong(r8)) goto L_0x0054;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<android.util.Pair<java.lang.Long, java.lang.Long>, org.json.JSONArray> mo11662a(java.util.List<org.json.JSONObject> r15, java.util.List<org.json.JSONObject> r16, long r17) {
        /*
            r14 = this;
            r0 = r15
            r1 = r16
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            r3 = -1
            r5 = r3
        L_0x000b:
            int r7 = r2.length()
            long r7 = (long) r7
            int r9 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r9 >= 0) goto L_0x008a
            boolean r7 = r15.isEmpty()
            boolean r8 = r16.isEmpty()
            r9 = 0
            if (r7 == 0) goto L_0x003f
            if (r8 == 0) goto L_0x003f
            g.a.a.f r0 = f10380S
            java.lang.String r1 = f10379R
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            int r8 = r2.length()
            long r10 = (long) r8
            long r10 = r17 - r10
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            r7[r9] = r8
            java.lang.String r8 = "mergeEventsAndIdentifys: number of events and identifys less than expected by %d"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            r0.mo11715d(r1, r7)
            goto L_0x008a
        L_0x003f:
            java.lang.String r10 = "event_id"
            if (r8 == 0) goto L_0x0052
        L_0x0043:
            java.lang.Object r3 = r15.remove(r9)
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            long r7 = r3.getLong(r10)
            r2.put(r3)
            r3 = r7
            goto L_0x000b
        L_0x0052:
            if (r7 == 0) goto L_0x0063
        L_0x0054:
            java.lang.Object r5 = r1.remove(r9)
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            long r6 = r5.getLong(r10)
            r2.put(r5)
            r5 = r6
            goto L_0x000b
        L_0x0063:
            java.lang.Object r7 = r15.get(r9)
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.lang.String r8 = "sequence_number"
            boolean r7 = r7.has(r8)
            if (r7 == 0) goto L_0x0043
            java.lang.Object r7 = r15.get(r9)
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            long r11 = r7.getLong(r8)
            java.lang.Object r7 = r1.get(r9)
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            long r7 = r7.getLong(r8)
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 >= 0) goto L_0x0054
            goto L_0x0043
        L_0x008a:
            android.util.Pair r0 = new android.util.Pair
            android.util.Pair r1 = new android.util.Pair
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Long r4 = java.lang.Long.valueOf(r5)
            r1.<init>(r3, r4)
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p148a.p149a.C3679d.mo11662a(java.util.List, java.util.List, long):android.util.Pair");
    }

    /* renamed from: a */
    public C3679d mo11663a(Application application) {
        if (!this.f10386F && mo11683a("enableForegroundTracking()") && VERSION.SDK_INT >= 14) {
            application.registerActivityLifecycleCallbacks(new C3678c(this));
        }
        return this;
    }

    /* renamed from: a */
    public C3679d mo11664a(Context context, String str) {
        mo11665a(context, str, (String) null);
        return this;
    }

    /* renamed from: a */
    public C3679d mo11665a(Context context, String str, String str2) {
        mo11666a(context, str, str2, (String) null, false);
        return this;
    }

    /* renamed from: a */
    public synchronized C3679d mo11666a(Context context, String str, String str2, String str3, boolean z) {
        if (context == null) {
            f10380S.mo11713b(f10379R, "Argument context cannot be null in initialize()");
            return this;
        } else if (C3700n.m15138a(str)) {
            f10380S.mo11713b(f10379R, "Argument apiKey cannot be null or blank in initialize()");
            return this;
        } else {
            Context applicationContext = context.getApplicationContext();
            this.f10398a = applicationContext;
            this.f10401d = str;
            this.f10400c = C3693i.m15030a(applicationContext, this.f10402e);
            if (C3700n.m15138a(str3)) {
                str3 = "Android";
            }
            this.f10413p = str3;
            mo11675a((Runnable) new C3676a(this, context, str2, this));
            return this;
        }
    }

    /* renamed from: a */
    public C3679d mo11667a(String str, boolean z) {
        if (!mo11683a("setUserId()")) {
            return this;
        }
        mo11675a((Runnable) new C3688h(this, z, str));
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo11668a(Object obj) {
        return obj == null ? JSONObject.NULL : obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo11669a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            cArr2[i2] = cArr[b >>> 4];
            cArr2[i2 + 1] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    /* renamed from: a */
    public JSONArray mo11670a(JSONArray jSONArray) {
        Object a;
        if (jSONArray == null) {
            return new JSONArray();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj.getClass().equals(String.class)) {
                a = m14975g((String) obj);
            } else if (obj.getClass().equals(JSONObject.class)) {
                a = mo11686b((JSONObject) obj);
            } else if (obj.getClass().equals(JSONArray.class)) {
                a = mo11670a((JSONArray) obj);
            }
            jSONArray.put(i, a);
        }
        return jSONArray;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11671a(long j) {
        mo11675a((Runnable) new C3687g(j));
    }

    /* renamed from: a */
    public /* synthetic */ void mo11672a(Context context, String str, C3679d dVar) {
        if (!this.f10407j) {
            try {
                if (this.f10402e.equals("$default_instance")) {
                    m14957a(context);
                    m14960b(context);
                }
                this.f10399b = new C6462x();
                this.f10420w = new C3695k(context);
                this.f10404g = m14974g();
                this.f10420w.mo11759p();
                String str2 = "user_id";
                if (str != null) {
                    dVar.f10403f = str;
                    this.f10400c.mo11730c(str2, str);
                } else {
                    dVar.f10403f = this.f10400c.mo11736f(str2);
                }
                Long e = this.f10400c.mo11734e("opt_out");
                this.f10408k = e != null && e.longValue() == 1;
                long a = m14951a("previous_session_id", -1);
                this.f10419v = a;
                if (a >= 0) {
                    this.f10414q = a;
                }
                this.f10415r = m14951a("sequence_number", 0);
                this.f10416s = m14951a("last_event_id", -1);
                this.f10417t = m14951a("last_identify_id", -1);
                this.f10418u = m14951a("last_event_time", -1);
                this.f10400c.mo11725a((C3694j) new C3689e(this, dVar));
                this.f10407j = true;
            } catch (C3692h e2) {
                f10380S.mo11713b(f10379R, String.format("Failed to initialize Amplitude SDK due to: %s", new Object[]{e2.getMessage()}));
                dVar.f10401d = null;
            }
        }
    }

    /* renamed from: a */
    public void mo11673a(C3698l lVar) {
        mo11674a(lVar, false);
    }

    /* renamed from: a */
    public void mo11674a(C3698l lVar, boolean z) {
        if (lVar != null && lVar.f10480a.length() != 0 && mo11683a("identify()")) {
            mo11689b("$identify", null, null, lVar.f10480a, null, null, mo11660a(), z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11675a(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        C3701o oVar = this.f10396P;
        if (currentThread != oVar) {
            oVar.mo11776a(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: a */
    public void mo11676a(String str, JSONObject jSONObject) {
        mo11679a(str, jSONObject, false);
    }

    /* renamed from: a */
    public void mo11677a(String str, JSONObject jSONObject, JSONObject jSONObject2, long j, boolean z) {
        if (mo11695d(str)) {
            mo11689b(str, jSONObject, null, null, jSONObject2, null, j, z);
        }
    }

    /* renamed from: a */
    public void mo11678a(String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        mo11677a(str, jSONObject, jSONObject2, mo11660a(), z);
    }

    /* renamed from: a */
    public void mo11679a(String str, JSONObject jSONObject, boolean z) {
        mo11678a(str, jSONObject, (JSONObject) null, z);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x019c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11680a(p337m.C6462x r10, java.lang.String r11, long r12, long r14) {
        /*
            r9 = this;
            java.lang.String r0 = "Exception:"
            java.lang.String r1 = "2"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ""
            r2.append(r3)
            long r4 = r9.mo11660a()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0044 }
            r4.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0044 }
            r4.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x0044 }
            java.lang.String r5 = r9.f10401d     // Catch:{ UnsupportedEncodingException -> 0x0044 }
            r4.append(r5)     // Catch:{ UnsupportedEncodingException -> 0x0044 }
            r4.append(r11)     // Catch:{ UnsupportedEncodingException -> 0x0044 }
            r4.append(r2)     // Catch:{ UnsupportedEncodingException -> 0x0044 }
            java.lang.String r4 = r4.toString()     // Catch:{ UnsupportedEncodingException -> 0x0044 }
            g.a.b.a r5 = new g.a.b.a     // Catch:{ UnsupportedEncodingException -> 0x0044 }
            r5.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0044 }
            java.lang.String r6 = "UTF-8"
            byte[] r4 = r4.getBytes(r6)     // Catch:{ UnsupportedEncodingException -> 0x0044 }
            byte[] r4 = r5.digest(r4)     // Catch:{ UnsupportedEncodingException -> 0x0044 }
            java.lang.String r3 = r9.mo11669a(r4)     // Catch:{ UnsupportedEncodingException -> 0x0044 }
            goto L_0x0050
        L_0x0044:
            r4 = move-exception
            g.a.a.f r5 = f10380S
            java.lang.String r6 = f10379R
            java.lang.String r4 = r4.toString()
            r5.mo11713b(r6, r4)
        L_0x0050:
            m.q$a r4 = new m.q$a
            r4.<init>()
            java.lang.String r5 = "v"
            r4.mo16591a(r5, r1)
            java.lang.String r1 = r9.f10401d
            java.lang.String r5 = "client"
            r4.mo16591a(r5, r1)
            java.lang.String r1 = "e"
            r4.mo16591a(r1, r11)
            java.lang.String r11 = "upload_time"
            r4.mo16591a(r11, r2)
            java.lang.String r11 = "checksum"
            r4.mo16591a(r11, r3)
            m.q r11 = r4.mo16592a()
            r1 = 0
            m.z$a r2 = new m.z$a     // Catch:{ IllegalArgumentException -> 0x01a2 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x01a2 }
            java.lang.String r3 = r9.f10394N     // Catch:{ IllegalArgumentException -> 0x01a2 }
            r2.mo16766b(r3)     // Catch:{ IllegalArgumentException -> 0x01a2 }
            r2.mo16762a(r11)     // Catch:{ IllegalArgumentException -> 0x01a2 }
            java.lang.String r11 = r9.f10395O     // Catch:{ IllegalArgumentException -> 0x01a2 }
            boolean r11 = p147g.p148a.p149a.C3700n.m15138a(r11)     // Catch:{ IllegalArgumentException -> 0x01a2 }
            if (r11 != 0) goto L_0x00a2
            java.lang.String r11 = "Authorization"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x01a2 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x01a2 }
            java.lang.String r4 = "Bearer "
            r3.append(r4)     // Catch:{ IllegalArgumentException -> 0x01a2 }
            java.lang.String r4 = r9.f10395O     // Catch:{ IllegalArgumentException -> 0x01a2 }
            r3.append(r4)     // Catch:{ IllegalArgumentException -> 0x01a2 }
            java.lang.String r3 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x01a2 }
            r2.mo16760a(r11, r3)     // Catch:{ IllegalArgumentException -> 0x01a2 }
        L_0x00a2:
            m.z r11 = r2.mo16765a()     // Catch:{ IllegalArgumentException -> 0x01a2 }
            r2 = 1
            m.e r10 = r10.mo16097a(r11)     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            m.b0 r10 = r10.mo16095h()     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            m.c0 r11 = r10.mo16018a()     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            java.lang.String r11 = r11.mo16064i()     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            java.lang.String r3 = "success"
            boolean r3 = r11.equals(r3)     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            if (r3 == 0) goto L_0x00db
            g.a.a.o r10 = r9.f10396P     // Catch:{ ConnectException | UnknownHostException -> 0x00d8, IOException -> 0x00d5, AssertionError -> 0x00d2, Exception -> 0x00cf }
            g.a.a.d$c r11 = new g.a.a.d$c     // Catch:{ ConnectException | UnknownHostException -> 0x00d8, IOException -> 0x00d5, AssertionError -> 0x00d2, Exception -> 0x00cf }
            r3 = r11
            r4 = r9
            r5 = r12
            r7 = r14
            r3.<init>(r5, r7)     // Catch:{ ConnectException | UnknownHostException -> 0x00d8, IOException -> 0x00d5, AssertionError -> 0x00d2, Exception -> 0x00cf }
            r10.mo11776a(r11)     // Catch:{ ConnectException | UnknownHostException -> 0x00d8, IOException -> 0x00d5, AssertionError -> 0x00d2, Exception -> 0x00cf }
            goto L_0x019a
        L_0x00cf:
            r10 = move-exception
            goto L_0x0185
        L_0x00d2:
            r10 = move-exception
            goto L_0x0185
        L_0x00d5:
            r10 = move-exception
            goto L_0x018f
        L_0x00d8:
            goto L_0x019a
        L_0x00db:
            java.lang.String r3 = "invalid_api_key"
            boolean r3 = r11.equals(r3)     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            if (r3 == 0) goto L_0x00ee
            g.a.a.f r10 = f10380S     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            java.lang.String r11 = f10379R     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            java.lang.String r12 = "Invalid API key, make sure your API key is correct in initialize()"
            r10.mo11713b(r11, r12)     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            goto L_0x017f
        L_0x00ee:
            java.lang.String r3 = "bad_checksum"
            boolean r3 = r11.equals(r3)     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            if (r3 == 0) goto L_0x0101
            g.a.a.f r10 = f10380S     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            java.lang.String r11 = f10379R     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            java.lang.String r12 = "Bad checksum, post request was mangled in transit, will attempt to reupload later"
        L_0x00fc:
            r10.mo11715d(r11, r12)     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            goto L_0x017f
        L_0x0101:
            java.lang.String r3 = "request_db_write_failed"
            boolean r3 = r11.equals(r3)     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            if (r3 == 0) goto L_0x0110
            g.a.a.f r10 = f10380S     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            java.lang.String r11 = f10379R     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            java.lang.String r12 = "Couldn't write to request database on server, will attempt to reupload later"
            goto L_0x00fc
        L_0x0110:
            int r10 = r10.mo16022g()     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            r3 = 413(0x19d, float:5.79E-43)
            if (r10 != r3) goto L_0x0162
            boolean r10 = r9.f10384D     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            if (r10 == 0) goto L_0x0134
            int r10 = r9.f10385E     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            if (r10 != r2) goto L_0x0134
            r10 = 0
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 < 0) goto L_0x012b
            g.a.a.i r3 = r9.f10400c     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            r3.mo11738j(r12)     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
        L_0x012b:
            int r12 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0134
            g.a.a.i r10 = r9.f10400c     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            r10.mo11740l(r14)     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
        L_0x0134:
            r9.f10384D = r2     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            g.a.a.i r10 = r9.f10400c     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            long r10 = r10.mo11716a()     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            int r11 = (int) r10     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            int r10 = r9.f10385E     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            int r10 = java.lang.Math.min(r11, r10)     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            double r10 = (double) r10     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = r10 / r12
            double r10 = java.lang.Math.ceil(r10)     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            int r10 = (int) r10     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            r9.f10385E = r10     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            g.a.a.f r10 = f10380S     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            java.lang.String r11 = f10379R     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            java.lang.String r12 = "Request too large, will decrease size and attempt to reupload"
            r10.mo11715d(r11, r12)     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            g.a.a.o r10 = r9.f10396P     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            g.a.a.d$d r11 = new g.a.a.d$d     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            r11.<init>()     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            r10.mo11776a(r11)     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            goto L_0x017f
        L_0x0162:
            g.a.a.f r10 = f10380S     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            java.lang.String r12 = f10379R     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            r13.<init>()     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            java.lang.String r14 = "Upload failed, "
            r13.append(r14)     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            r13.append(r11)     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            java.lang.String r11 = ", will attempt to reupload later"
            r13.append(r11)     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            java.lang.String r11 = r13.toString()     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
            r10.mo11715d(r12, r11)     // Catch:{ ConnectException | UnknownHostException -> 0x017f, IOException -> 0x018d, AssertionError -> 0x0183, Exception -> 0x0181 }
        L_0x017f:
            r2 = 0
            goto L_0x019a
        L_0x0181:
            r10 = move-exception
            goto L_0x0184
        L_0x0183:
            r10 = move-exception
        L_0x0184:
            r2 = 0
        L_0x0185:
            g.a.a.f r11 = f10380S
            java.lang.String r12 = f10379R
            r11.mo11711a(r12, r0, r10)
            goto L_0x019a
        L_0x018d:
            r10 = move-exception
            r2 = 0
        L_0x018f:
            g.a.a.f r11 = f10380S
            java.lang.String r12 = f10379R
            java.lang.String r10 = r10.toString()
            r11.mo11713b(r12, r10)
        L_0x019a:
            if (r2 != 0) goto L_0x01a1
            java.util.concurrent.atomic.AtomicBoolean r10 = r9.f10393M
            r10.set(r1)
        L_0x01a1:
            return
        L_0x01a2:
            r10 = move-exception
            g.a.a.f r11 = f10380S
            java.lang.String r12 = f10379R
            java.lang.String r10 = r10.toString()
            r11.mo11713b(r12, r10)
            java.util.concurrent.atomic.AtomicBoolean r10 = r9.f10393M
            r10.set(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p148a.p149a.C3679d.mo11680a(m.x, java.lang.String, long, long):void");
    }

    /* renamed from: a */
    public void mo11681a(JSONObject jSONObject) {
        if (!(jSONObject == null || jSONObject.length() == 0 || !mo11683a("setUserProperties"))) {
            JSONObject b = mo11686b(jSONObject);
            if (b.length() != 0) {
                C3698l lVar = new C3698l();
                Iterator keys = b.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    try {
                        lVar.mo11760a(str, b.get(str));
                    } catch (JSONException e) {
                        f10380S.mo11713b(f10379R, e.toString());
                    }
                }
                mo11673a(lVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11682a(boolean z) {
        if (!this.f10408k && !this.f10409l && !this.f10393M.getAndSet(true)) {
            long min = Math.min((long) (z ? this.f10385E : this.f10422y), this.f10400c.mo11735f());
            if (min <= 0) {
                this.f10393M.set(false);
                return;
            }
            try {
                Pair a = mo11662a(this.f10400c.mo11723a(this.f10416s, min), this.f10400c.mo11728b(this.f10417t, min), min);
                if (((JSONArray) a.second).length() == 0) {
                    this.f10393M.set(false);
                    return;
                }
                long longValue = ((Long) ((Pair) a.first).first).longValue();
                long longValue2 = ((Long) ((Pair) a.first).second).longValue();
                String jSONArray = ((JSONArray) a.second).toString();
                C3701o oVar = this.f10397Q;
                C3681b bVar = new C3681b(jSONArray, longValue, longValue2);
                oVar.mo11776a(bVar);
            } catch (JSONException e) {
                this.f10393M.set(false);
                f10380S.mo11713b(f10379R, e.toString());
            } catch (C3692h e2) {
                this.f10393M.set(false);
                f10380S.mo11713b(f10379R, String.format("Caught Cursor window exception during event upload, deferring upload: %s", new Object[]{e2.getMessage()}));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized boolean mo11683a(String str) {
        if (this.f10398a == null) {
            C3690f fVar = f10380S;
            String str2 = f10379R;
            StringBuilder sb = new StringBuilder();
            sb.append("context cannot be null, set context with initialize() before calling ");
            sb.append(str);
            fVar.mo11713b(str2, sb.toString());
            return false;
        } else if (!C3700n.m15138a(this.f10401d)) {
            return true;
        } else {
            C3690f fVar2 = f10380S;
            String str3 = f10379R;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("apiKey cannot be null or empty, set apiKey with initialize() before calling ");
            sb2.append(str);
            fVar2.mo11713b(str3, sb2.toString());
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public long mo11684b() {
        long j = this.f10415r + 1;
        this.f10415r = j;
        this.f10400c.mo11719a("sequence_number", Long.valueOf(j));
        return this.f10415r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo11685b(String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        if (C3700n.m15138a(jSONObject2)) {
            f10380S.mo11713b(f10379R, String.format("Detected empty event string for event type %s, skipping", new Object[]{str}));
            return -1;
        }
        String str2 = "$identify";
        String str3 = "$groupidentify";
        if (str.equals(str2) || str.equals(str3)) {
            long d = this.f10400c.mo11733d(jSONObject2);
            this.f10417t = d;
            mo11697f(d);
        } else {
            long c = this.f10400c.mo11729c(jSONObject2);
            this.f10416s = c;
            mo11694d(c);
        }
        int min = Math.min(Math.max(1, this.f10423z / 10), 20);
        if (this.f10400c.mo11716a() > ((long) this.f10423z)) {
            C3693i iVar = this.f10400c;
            iVar.mo11739k(iVar.mo11732d((long) min));
        }
        if (this.f10400c.mo11731d() > ((long) this.f10423z)) {
            C3693i iVar2 = this.f10400c;
            iVar2.mo11741m(iVar2.mo11737g((long) min));
        }
        long f = this.f10400c.mo11735f();
        int i = this.f10421x;
        if (f % ((long) i) != 0 || f < ((long) i)) {
            m14979l(this.f10381A);
        } else {
            mo11691c();
        }
        return (str.equals(str2) || str.equals(str3)) ? this.f10417t : this.f10416s;
    }

    /* renamed from: b */
    public JSONObject mo11686b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (jSONObject.length() > 1000) {
            f10380S.mo11715d(f10379R, "Warning: too many properties (more than 1000), ignoring");
            return new JSONObject();
        }
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            try {
                Object obj = jSONObject.get(str);
                if (!str.equals("$receipt")) {
                    if (!str.equals("$receiptSig")) {
                        if (obj.getClass().equals(String.class)) {
                            obj = m14975g((String) obj);
                        } else if (obj.getClass().equals(JSONObject.class)) {
                            obj = mo11686b((JSONObject) obj);
                        } else if (obj.getClass().equals(JSONArray.class)) {
                            obj = mo11670a((JSONArray) obj);
                        }
                    }
                }
                jSONObject.put(str, obj);
            } catch (JSONException e) {
                f10380S.mo11713b(f10379R, e.toString());
            }
        }
        return jSONObject;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo11687b(long j) {
        mo11675a((Runnable) new C3686f(j));
    }

    /* renamed from: b */
    public void mo11688b(String str) {
        mo11676a(str, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo11689b(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, long j, boolean z) {
        C3685e eVar = new C3685e(str, jSONObject != null ? C3700n.m15136a(jSONObject) : jSONObject, jSONObject2 != null ? C3700n.m15136a(jSONObject2) : jSONObject2, jSONObject3 != null ? C3700n.m15136a(jSONObject3) : jSONObject3, jSONObject4 != null ? C3700n.m15136a(jSONObject4) : jSONObject4, jSONObject5 != null ? C3700n.m15136a(jSONObject5) : jSONObject5, j, z);
        mo11675a((Runnable) eVar);
    }

    /* renamed from: c */
    public C3679d mo11690c(String str) {
        mo11667a(str, false);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo11691c() {
        mo11682a(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo11692c(long j) {
        if (m14972f()) {
            mo11696e(j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo11693d() {
        this.f10386F = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo11694d(long j) {
        this.f10416s = j;
        this.f10400c.mo11719a("last_event_id", Long.valueOf(j));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo11695d(String str) {
        if (!C3700n.m15138a(str)) {
            return mo11683a("logEvent()");
        }
        f10380S.mo11713b(f10379R, "Argument eventType cannot be null or blank in logEvent()");
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo11696e(long j) {
        this.f10418u = j;
        this.f10400c.mo11719a("last_event_time", Long.valueOf(j));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo11697f(long j) {
        this.f10417t = j;
        this.f10400c.mo11719a("last_identify_id", Long.valueOf(j));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo11698g(long j) {
        this.f10419v = j;
        this.f10400c.mo11719a("previous_session_id", Long.valueOf(j));
    }

    /* renamed from: h */
    public boolean mo11699h(long j) {
        if (m14972f()) {
            if (m14976i(j)) {
                mo11692c(j);
                return false;
            }
            m14978k(j);
            return true;
        } else if (m14976i(j)) {
            long j2 = this.f10419v;
            if (j2 == -1) {
                m14978k(j);
                return true;
            }
            m14977j(j2);
            mo11692c(j);
            return false;
        } else {
            m14978k(j);
            return true;
        }
    }
}
