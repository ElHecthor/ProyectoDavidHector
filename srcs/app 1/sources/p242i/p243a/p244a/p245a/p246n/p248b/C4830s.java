package p242i.p243a.p244a.p245a.p246n.p248b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4792i;
import p242i.p243a.p244a.p245a.C4795l;

/* renamed from: i.a.a.a.n.b.s */
public class C4830s {

    /* renamed from: m */
    private static final Pattern f12601m = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: n */
    private static final String f12602n = Pattern.quote("/");

    /* renamed from: a */
    private final ReentrantLock f12603a = new ReentrantLock();

    /* renamed from: b */
    private final C4832t f12604b;

    /* renamed from: c */
    private final boolean f12605c;

    /* renamed from: d */
    private final boolean f12606d;

    /* renamed from: e */
    private final Context f12607e;

    /* renamed from: f */
    private final String f12608f;

    /* renamed from: g */
    private final String f12609g;

    /* renamed from: h */
    private final Collection<C4792i> f12610h;

    /* renamed from: i */
    C4803c f12611i;

    /* renamed from: j */
    C4802b f12612j;

    /* renamed from: k */
    boolean f12613k;

    /* renamed from: l */
    C4829r f12614l;

    /* renamed from: i.a.a.a.n.b.s$a */
    public enum C4831a {
        WIFI_MAC_ADDRESS(1),
        BLUETOOTH_MAC_ADDRESS(2),
        FONT_TOKEN(53),
        ANDROID_ID(100),
        ANDROID_DEVICE_ID(101),
        ANDROID_SERIAL(102),
        ANDROID_ADVERTISING_ID(103);
        

        /* renamed from: f */
        public final int f12623f;

        private C4831a(int i) {
            this.f12623f = i;
        }
    }

    public C4830s(Context context, String str, String str2, Collection<C4792i> collection) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        } else if (collection != null) {
            this.f12607e = context;
            this.f12608f = str;
            this.f12609g = str2;
            this.f12610h = collection;
            this.f12604b = new C4832t();
            this.f12611i = new C4803c(context);
            this.f12614l = new C4829r();
            boolean a = C4813i.m19370a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
            this.f12605c = a;
            String str3 = "Fabric";
            if (!a) {
                C4795l f = C4781c.m19229f();
                StringBuilder sb = new StringBuilder();
                sb.append("Device ID collection disabled for ");
                sb.append(context.getPackageName());
                f.mo13796e(str3, sb.toString());
            }
            boolean a2 = C4813i.m19370a(context, "com.crashlytics.CollectUserIdentifiers", true);
            this.f12606d = a2;
            if (!a2) {
                C4795l f2 = C4781c.m19229f();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("User information collection disabled for ");
                sb2.append(context.getPackageName());
                f2.mo13796e(str3, sb2.toString());
            }
        } else {
            throw new IllegalArgumentException("kits must not be null");
        }
    }

    /* renamed from: a */
    private String m19421a(String str) {
        if (str == null) {
            return null;
        }
        return f12601m.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: a */
    private void m19422a(SharedPreferences sharedPreferences) {
        C4802b b = mo13891b();
        if (b != null) {
            m19423a(sharedPreferences, b.f12550a);
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    private void m19423a(SharedPreferences sharedPreferences, String str) {
        Editor putString;
        String str2 = "crashlytics.advertising.id";
        this.f12603a.lock();
        try {
            if (!TextUtils.isEmpty(str)) {
                String string = sharedPreferences.getString(str2, null);
                if (TextUtils.isEmpty(string)) {
                    putString = sharedPreferences.edit().putString(str2, str);
                } else {
                    if (!string.equals(str)) {
                        putString = sharedPreferences.edit().remove("crashlytics.installation.id").putString(str2, str);
                    }
                    this.f12603a.unlock();
                }
                putString.commit();
                this.f12603a.unlock();
            }
        } finally {
            this.f12603a.unlock();
        }
    }

    /* renamed from: a */
    private void m19424a(Map<C4831a, String> map, C4831a aVar, String str) {
        if (str != null) {
            map.put(aVar, str);
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: b */
    private String m19425b(SharedPreferences sharedPreferences) {
        String str = "crashlytics.installation.id";
        this.f12603a.lock();
        try {
            String string = sharedPreferences.getString(str, null);
            if (string == null) {
                string = m19421a(UUID.randomUUID().toString());
                sharedPreferences.edit().putString(str, string).commit();
            }
            return string;
        } finally {
            this.f12603a.unlock();
        }
    }

    /* renamed from: b */
    private String m19426b(String str) {
        return str.replaceAll(f12602n, "");
    }

    /* renamed from: m */
    private Boolean m19427m() {
        C4802b b = mo13891b();
        if (b != null) {
            return Boolean.valueOf(b.f12551b);
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo13890a() {
        return this.f12606d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized C4802b mo13891b() {
        if (!this.f12613k) {
            this.f12612j = this.f12611i.mo13854a();
            this.f12613k = true;
        }
        return this.f12612j;
    }

    /* renamed from: c */
    public String mo13892c() {
        return this.f12608f;
    }

    /* renamed from: d */
    public String mo13893d() {
        String str = this.f12609g;
        if (str != null) {
            return str;
        }
        SharedPreferences i = C4813i.m19387i(this.f12607e);
        m19422a(i);
        String string = i.getString("crashlytics.installation.id", null);
        return string == null ? m19425b(i) : string;
    }

    /* renamed from: e */
    public Map<C4831a, String> mo13894e() {
        HashMap hashMap = new HashMap();
        for (C4792i iVar : this.f12610h) {
            if (iVar instanceof C4822n) {
                for (Entry entry : ((C4822n) iVar).mo5481g().entrySet()) {
                    m19424a(hashMap, (C4831a) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: f */
    public String mo13895f() {
        return this.f12604b.mo13902a(this.f12607e);
    }

    /* renamed from: g */
    public String mo13896g() {
        return String.format(Locale.US, "%s/%s", new Object[]{m19426b(Build.MANUFACTURER), m19426b(Build.MODEL)});
    }

    /* renamed from: h */
    public String mo13897h() {
        return m19426b(VERSION.INCREMENTAL);
    }

    /* renamed from: i */
    public String mo13898i() {
        return m19426b(VERSION.RELEASE);
    }

    /* renamed from: j */
    public String mo13899j() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo13898i());
        sb.append("/");
        sb.append(mo13897h());
        return sb.toString();
    }

    /* renamed from: k */
    public Boolean mo13900k() {
        if (mo13901l()) {
            return m19427m();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo13901l() {
        return this.f12605c && !this.f12614l.mo13889e(this.f12607e);
    }
}
