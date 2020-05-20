package p242i.p243a.p244a.p245a.p246n.p254g;

import org.json.JSONObject;
import p242i.p243a.p244a.p245a.p246n.p248b.C4819k;

/* renamed from: i.a.a.a.n.g.k */
class C4915k implements C4928v {
    C4915k() {
    }

    /* renamed from: a */
    private long m19697a(C4819k kVar, long j, JSONObject jSONObject) {
        String str = "expires_at";
        return jSONObject.has(str) ? jSONObject.getLong(str) : kVar.mo13877a() + (j * 1000);
    }

    /* renamed from: a */
    private C4906b m19698a(JSONObject jSONObject) {
        C4906b bVar = new C4906b(jSONObject.optString("url", "https://e.crashlytics.com/spi/v2/events"), jSONObject.optInt("flush_interval_secs", 600), jSONObject.optInt("max_byte_size_per_file", 8000), jSONObject.optInt("max_file_count_per_send", 1), jSONObject.optInt("max_pending_send_file_count", 100), jSONObject.optBoolean("forward_to_google_analytics", false), jSONObject.optBoolean("include_purchase_events_in_forwarded_events", false), jSONObject.optBoolean("track_custom_events", true), jSONObject.optBoolean("track_predefined_events", true), jSONObject.optInt("sampling_rate", 1), jSONObject.optBoolean("flush_on_background", true));
        return bVar;
    }

    /* renamed from: b */
    private C4909e m19699b(JSONObject jSONObject) {
        String str = "icon";
        C4909e eVar = new C4909e(jSONObject.getString("identifier"), jSONObject.getString("status"), jSONObject.getString("url"), jSONObject.getString("reports_url"), jSONObject.getString("ndk_reports_url"), jSONObject.optBoolean("update_required", false), (!jSONObject.has(str) || !jSONObject.getJSONObject(str).has("hash")) ? null : m19702e(jSONObject.getJSONObject(str)));
        return eVar;
    }

    /* renamed from: c */
    private C4910f m19700c(JSONObject jSONObject) {
        return new C4910f(jSONObject.optString("update_endpoint", C4927u.f12821a), jSONObject.optInt("update_suspend_duration", 3600));
    }

    /* renamed from: d */
    private C4917m m19701d(JSONObject jSONObject) {
        C4917m mVar = new C4917m(jSONObject.optBoolean("prompt_enabled", false), jSONObject.optBoolean("collect_logged_exceptions", true), jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_analytics", false), jSONObject.optBoolean("firebase_crashlytics_enabled", false));
        return mVar;
    }

    /* renamed from: e */
    private C4907c m19702e(JSONObject jSONObject) {
        return new C4907c(jSONObject.getString("hash"), jSONObject.getInt("width"), jSONObject.getInt("height"));
    }

    /* renamed from: f */
    private C4919o m19703f(JSONObject jSONObject) {
        C4919o oVar = new C4919o(jSONObject.optString("title", "Send Crash Report?"), jSONObject.optString("message", "Looks like we crashed! Please help us fix the problem by sending a crash report."), jSONObject.optString("send_button_title", "Send"), jSONObject.optBoolean("show_cancel_button", true), jSONObject.optString("cancel_button_title", "Don't Send"), jSONObject.optBoolean("show_always_send_button", true), jSONObject.optString("always_send_button_title", "Always Send"));
        return oVar;
    }

    /* renamed from: g */
    private C4920p m19704g(JSONObject jSONObject) {
        C4920p pVar = new C4920p(jSONObject.optInt("log_buffer_size", 64000), jSONObject.optInt("max_chained_exception_depth", 8), jSONObject.optInt("max_custom_exception_events", 64), jSONObject.optInt("max_custom_key_value_pairs", 64), jSONObject.optInt("identifier_mask", 255), jSONObject.optBoolean("send_session_without_crash", false), jSONObject.optInt("max_complete_sessions_count", 4));
        return pVar;
    }

    /* renamed from: a */
    public C4926t mo14066a(C4819k kVar, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        C4926t tVar = new C4926t(m19697a(kVar, (long) optInt2, jSONObject), m19699b(jSONObject.getJSONObject("app")), m19704g(jSONObject.getJSONObject("session")), m19703f(jSONObject.getJSONObject("prompt")), m19701d(jSONObject.getJSONObject("features")), m19698a(jSONObject.getJSONObject("analytics")), m19700c(jSONObject.getJSONObject("beta")), optInt, optInt2);
        return tVar;
    }
}
