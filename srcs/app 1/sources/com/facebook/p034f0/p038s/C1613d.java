package com.facebook.p034f0.p038s;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.C1787m;
import com.facebook.internal.C1666k;
import com.facebook.internal.C1670l;
import com.facebook.internal.C1672m;
import com.facebook.internal.C1703w;
import com.facebook.p034f0.C1547g;
import com.facebook.p034f0.C1558m;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.f0.s.d */
public class C1613d {

    /* renamed from: a */
    private static final String f4984a = "com.facebook.f0.s.d";

    /* renamed from: b */
    private static final C1558m f4985b = new C1558m(C1787m.m7744e());

    /* renamed from: com.facebook.f0.s.d$a */
    private static class C1614a {

        /* renamed from: a */
        BigDecimal f4986a;

        /* renamed from: b */
        Currency f4987b;

        /* renamed from: c */
        Bundle f4988c;

        C1614a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            this.f4986a = bigDecimal;
            this.f4987b = currency;
            this.f4988c = bundle;
        }
    }

    /* renamed from: a */
    private static C1614a m7097a(String str, String str2) {
        return m7098a(str, str2, (Map<String, String>) new HashMap<String,String>());
    }

    /* renamed from: a */
    private static C1614a m7098a(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString("type");
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (optString.equals("subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String optString2 = jSONObject2.optString("introductoryPriceCycles");
                if (!optString2.isEmpty()) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", optString2);
                }
            }
            for (String str3 : map.keySet()) {
                bundle.putCharSequence(str3, (CharSequence) map.get(str3));
            }
            return new C1614a(new BigDecimal(((double) jSONObject2.getLong("price_amount_micros")) / 1000000.0d), Currency.getInstance(jSONObject2.getString("price_currency_code")), bundle);
        } catch (JSONException e) {
            Log.e(f4984a, "Error parsing in-app subscription data.", e);
            return null;
        }
    }

    /* renamed from: a */
    public static void m7099a(String str, long j) {
        Context e = C1787m.m7744e();
        String f = C1787m.m7745f();
        C1703w.m7423a((Object) e, "context");
        C1670l a = C1672m.m7260a(f, false);
        if (a != null && a.mo5905a() && j > 0) {
            C1558m mVar = new C1558m(e);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            mVar.mo5771a("fb_aa_time_spent_on_view", (double) j, bundle);
        }
    }

    /* renamed from: a */
    static void m7100a(String str, String str2, boolean z) {
        if (m7101a()) {
            C1614a a = m7097a(str, str2);
            if (a != null) {
                boolean z2 = false;
                if (z) {
                    if (C1666k.m7237a("app_events_if_auto_log_subs", C1787m.m7745f(), false)) {
                        z2 = true;
                    }
                }
                if (z2) {
                    f4985b.mo5774a(C1621g.m7122a(str2) ? "StartTrial" : "Subscribe", a.f4986a, a.f4987b, a.f4988c);
                } else {
                    f4985b.mo5775a(a.f4986a, a.f4987b, a.f4988c);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m7101a() {
        C1670l c = C1672m.m7268c(C1787m.m7745f());
        return c != null && C1787m.m7747h() && c.mo5909e();
    }

    /* renamed from: b */
    public static void m7102b() {
        Context e = C1787m.m7744e();
        String f = C1787m.m7745f();
        boolean h = C1787m.m7747h();
        C1703w.m7423a((Object) e, "context");
        if (!h) {
            return;
        }
        if (e instanceof Application) {
            C1547g.m6881a((Application) e, f);
        } else {
            Log.w(f4984a, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
        }
    }
}
