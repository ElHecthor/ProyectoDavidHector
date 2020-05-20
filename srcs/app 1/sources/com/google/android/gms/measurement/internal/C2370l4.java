package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: com.google.android.gms.measurement.internal.l4 */
final class C2370l4 extends C2507x5 {

    /* renamed from: E */
    static final Pair<String, Long> f6615E = new Pair<>("", Long.valueOf(0));

    /* renamed from: A */
    public final C2440r4 f6616A = new C2440r4(this, "firebase_feature_rollouts", null);

    /* renamed from: B */
    public final C2440r4 f6617B = new C2440r4(this, "deferred_attribution_cache", null);

    /* renamed from: C */
    public final C2418p4 f6618C = new C2418p4(this, "deferred_attribution_cache_timestamp", 0);

    /* renamed from: D */
    public final C2429q4 f6619D = new C2429q4(this, "default_event_parameters", null);

    /* renamed from: c */
    private SharedPreferences f6620c;

    /* renamed from: d */
    public C2451s4 f6621d;

    /* renamed from: e */
    public final C2418p4 f6622e = new C2418p4(this, "last_upload", 0);

    /* renamed from: f */
    public final C2418p4 f6623f = new C2418p4(this, "last_upload_attempt", 0);

    /* renamed from: g */
    public final C2418p4 f6624g = new C2418p4(this, "backoff", 0);

    /* renamed from: h */
    public final C2418p4 f6625h = new C2418p4(this, "last_delete_stale", 0);

    /* renamed from: i */
    public final C2418p4 f6626i = new C2418p4(this, "midnight_offset", 0);

    /* renamed from: j */
    public final C2418p4 f6627j = new C2418p4(this, "first_open_time", 0);

    /* renamed from: k */
    public final C2418p4 f6628k = new C2418p4(this, "app_install_time", 0);

    /* renamed from: l */
    public final C2440r4 f6629l = new C2440r4(this, "app_instance_id", null);

    /* renamed from: m */
    private String f6630m;

    /* renamed from: n */
    private boolean f6631n;

    /* renamed from: o */
    private long f6632o;

    /* renamed from: p */
    public final C2418p4 f6633p = new C2418p4(this, "time_before_start", 10000);

    /* renamed from: q */
    public final C2418p4 f6634q = new C2418p4(this, "session_timeout", 1800000);

    /* renamed from: r */
    public final C2394n4 f6635r = new C2394n4(this, "start_new_session", true);

    /* renamed from: s */
    public final C2440r4 f6636s = new C2440r4(this, "non_personalized_ads", null);

    /* renamed from: t */
    public final C2394n4 f6637t = new C2394n4(this, "use_dynamite_api", false);

    /* renamed from: u */
    public final C2394n4 f6638u = new C2394n4(this, "allow_remote_dynamite", false);

    /* renamed from: v */
    public final C2418p4 f6639v = new C2418p4(this, "last_pause_time", 0);

    /* renamed from: w */
    public boolean f6640w;

    /* renamed from: x */
    public C2394n4 f6641x = new C2394n4(this, "app_backgrounded", false);

    /* renamed from: y */
    public C2394n4 f6642y = new C2394n4(this, "deep_link_retrieval_complete", false);

    /* renamed from: z */
    public C2418p4 f6643z = new C2418p4(this, "deep_link_retrieval_attempts", 0);

    C2370l4(C2263c5 c5Var) {
        super(c5Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public final boolean mo7468A() {
        return this.f6620c.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Pair<String, Boolean> mo7469a(String str) {
        String str2 = "";
        mo7274c();
        long c = mo7095g().mo6989c();
        if (this.f6630m != null && c < this.f6632o) {
            return new Pair<>(this.f6630m, Boolean.valueOf(this.f6631n));
        }
        this.f6632o = c + mo7827m().mo7105a(str, C2457t.f6908b);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(mo7096h());
            if (advertisingIdInfo != null) {
                this.f6630m = advertisingIdInfo.getId();
                this.f6631n = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.f6630m == null) {
                this.f6630m = str2;
            }
        } catch (Exception e) {
            mo7098j().mo7809A().mo7089a("Unable to get advertising id", e);
            this.f6630m = str2;
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.f6630m, Boolean.valueOf(this.f6631n));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7470a(boolean z) {
        mo7274c();
        Editor edit = mo7478t().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo7471a(long j) {
        return j - this.f6634q.mo7570a() > this.f6639v.mo7570a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo7472b(String str) {
        mo7274c();
        String str2 = (String) mo7469a(str).first;
        MessageDigest y = C2489v9.m10035y();
        if (y == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, y.digest(str2.getBytes()))});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo7473b(boolean z) {
        mo7274c();
        Editor edit = mo7478t().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo7474c(String str) {
        mo7274c();
        Editor edit = mo7478t().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo7475c(boolean z) {
        mo7274c();
        mo7098j().mo7810B().mo7089a("App measurement setting deferred collection", Boolean.valueOf(z));
        Editor edit = mo7478t().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo7476d(String str) {
        mo7274c();
        Editor edit = mo7478t().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo7477n() {
        SharedPreferences sharedPreferences = mo7096h().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f6620c = sharedPreferences;
        String str = "has_been_opened";
        boolean z = sharedPreferences.getBoolean(str, false);
        this.f6640w = z;
        if (!z) {
            Editor edit = this.f6620c.edit();
            edit.putBoolean(str, true);
            edit.apply();
        }
        C2451s4 s4Var = new C2451s4(this, "health_monitor", Math.max(0, ((Long) C2457t.f6910c.mo7587a(null)).longValue()));
        this.f6621d = s4Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo7397r() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final SharedPreferences mo7478t() {
        mo7274c();
        mo7742o();
        return this.f6620c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final String mo7479u() {
        mo7274c();
        return mo7478t().getString("gmp_app_id", null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final String mo7480v() {
        mo7274c();
        return mo7478t().getString("admob_app_id", null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final Boolean mo7481w() {
        mo7274c();
        String str = "use_service";
        if (!mo7478t().contains(str)) {
            return null;
        }
        return Boolean.valueOf(mo7478t().getBoolean(str, false));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public final void mo7482x() {
        mo7274c();
        Boolean y = mo7483y();
        Editor edit = mo7478t().edit();
        edit.clear();
        edit.apply();
        if (y != null) {
            mo7473b(y.booleanValue());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public final Boolean mo7483y() {
        mo7274c();
        String str = "measurement_enabled";
        if (mo7478t().contains(str)) {
            return Boolean.valueOf(mo7478t().getBoolean(str, true));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final String mo7484z() {
        mo7274c();
        String str = "previous_os_version";
        String string = mo7478t().getString(str, null);
        mo7823d().mo7742o();
        String str2 = VERSION.RELEASE;
        if (!TextUtils.isEmpty(str2) && !str2.equals(string)) {
            Editor edit = mo7478t().edit();
            edit.putString(str, str2);
            edit.apply();
        }
        return string;
    }
}
