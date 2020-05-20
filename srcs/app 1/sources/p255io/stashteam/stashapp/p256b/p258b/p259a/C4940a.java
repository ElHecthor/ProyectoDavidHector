package p255io.stashteam.stashapp.p256b.p258b.p259a;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import p255io.stashteam.stashapp.utils.p304f.C5712n;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.b.b.a.a */
public final class C4940a {

    /* renamed from: a */
    private final SharedPreferences f12844a;

    /* renamed from: io.stashteam.stashapp.b.b.a.a$a */
    public static final class C4941a {
        private C4941a() {
        }

        public /* synthetic */ C4941a(C5938g gVar) {
            this();
        }
    }

    static {
        new C4941a(null);
    }

    public C4940a(SharedPreferences sharedPreferences) {
        C5942k.m22327b(sharedPreferences, "sharedPreferences");
        this.f12844a = sharedPreferences;
    }

    /* renamed from: a */
    private final boolean m19740a(long j) {
        return j - System.currentTimeMillis() < 2592000000L;
    }

    /* renamed from: a */
    public final String mo14081a() {
        return this.f12844a.getString("pref_app_theme", null);
    }

    /* renamed from: a */
    public final void mo14082a(String str) {
        C5942k.m22327b(str, "theme");
        this.f12844a.edit().putString("pref_app_theme", str).apply();
    }

    /* renamed from: a */
    public final void mo14083a(String str, long j, String str2) {
        C5942k.m22327b(str, "token");
        C5942k.m22327b(str2, "refreshToken");
        Editor edit = this.f12844a.edit();
        C5942k.m22324a((Object) edit, "editor");
        edit.putString("pref_auth_token", str);
        edit.putLong("pref_auth_expire_date", System.currentTimeMillis() + C5712n.m21810a(j));
        edit.putString("pref_auth_refresh_token", str2);
        edit.putBoolean("pref_auth_is_new_format", true);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo14084a(boolean z) {
        this.f12844a.edit().putBoolean("pref_feedback_sent", z).apply();
    }

    /* renamed from: b */
    public final String mo14085b() {
        return this.f12844a.getString("pref_auth_refresh_token", null);
    }

    /* renamed from: b */
    public final void mo14086b(String str) {
        C5942k.m22327b(str, "deviceId");
        this.f12844a.edit().putString("pref_device_id", str).apply();
    }

    /* renamed from: b */
    public final void mo14087b(String str, long j, String str2) {
        C5942k.m22327b(str, "token");
        C5942k.m22327b(str2, "refreshToken");
        Editor edit = this.f12844a.edit();
        C5942k.m22324a((Object) edit, "editor");
        edit.putString("pref_device_token", str);
        edit.putLong("pref_device_expire_date", System.currentTimeMillis() + C5712n.m21810a(j));
        edit.putString("pref_device_refresh_token", str2);
        edit.putBoolean("pref_device_is_new_format", true);
        edit.apply();
    }

    /* renamed from: b */
    public final void mo14088b(boolean z) {
        this.f12844a.edit().putBoolean("pref_onboarding_complete", z).apply();
    }

    /* renamed from: c */
    public final String mo14089c() {
        return this.f12844a.getString("pref_auth_token", null);
    }

    /* renamed from: d */
    public final String mo14090d() {
        return this.f12844a.getString("pref_device_id", null);
    }

    /* renamed from: e */
    public final String mo14091e() {
        return this.f12844a.getString("pref_device_refresh_token", null);
    }

    /* renamed from: f */
    public final String mo14092f() {
        return this.f12844a.getString("pref_device_token", null);
    }

    /* renamed from: g */
    public final boolean mo14093g() {
        return this.f12844a.getBoolean("pref_feedback_sent", false);
    }

    /* renamed from: h */
    public final boolean mo14094h() {
        return m19740a(this.f12844a.getLong("pref_auth_expire_date", 0));
    }

    /* renamed from: i */
    public final boolean mo14095i() {
        return m19740a(this.f12844a.getLong("pref_device_expire_date", 0));
    }

    /* renamed from: j */
    public final boolean mo14096j() {
        return this.f12844a.getBoolean("pref_auth_is_new_format", false);
    }

    /* renamed from: k */
    public final boolean mo14097k() {
        return this.f12844a.getBoolean("pref_device_is_new_format", false);
    }

    /* renamed from: l */
    public final boolean mo14098l() {
        return this.f12844a.getBoolean("pref_onboarding_complete", false);
    }

    /* renamed from: m */
    public final void mo14099m() {
        Editor edit = this.f12844a.edit();
        C5942k.m22324a((Object) edit, "editor");
        edit.remove("pref_auth_token");
        edit.remove("pref_auth_expire_date");
        edit.remove("pref_auth_refresh_token");
        edit.remove("pref_auth_is_new_format");
        edit.apply();
    }

    /* renamed from: n */
    public final void mo14100n() {
        Editor edit = this.f12844a.edit();
        C5942k.m22324a((Object) edit, "editor");
        edit.remove("pref_device_token");
        edit.remove("pref_device_expire_date");
        edit.remove("pref_device_refresh_token");
        edit.remove("pref_device_is_new_format");
        edit.apply();
    }
}
