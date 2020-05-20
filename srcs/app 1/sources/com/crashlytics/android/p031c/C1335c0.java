package com.crashlytics.android.p031c;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p242i.p243a.p244a.p245a.p246n.p251d.C4873a;

/* renamed from: com.crashlytics.android.c.c0 */
class C1335c0 implements C4873a<C1328a0> {
    C1335c0() {
    }

    @TargetApi(9)
    /* renamed from: a */
    public JSONObject mo5412a(C1328a0 a0Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            C1333b0 b0Var = a0Var.f4321a;
            jSONObject.put("appBundleId", b0Var.f4347a);
            jSONObject.put("executionId", b0Var.f4348b);
            jSONObject.put("installationId", b0Var.f4349c);
            jSONObject.put("limitAdTrackingEnabled", b0Var.f4350d);
            jSONObject.put("betaDeviceToken", b0Var.f4351e);
            jSONObject.put("buildId", b0Var.f4352f);
            jSONObject.put("osVersion", b0Var.f4353g);
            jSONObject.put("deviceModel", b0Var.f4354h);
            jSONObject.put("appVersionCode", b0Var.f4355i);
            jSONObject.put("appVersionName", b0Var.f4356j);
            jSONObject.put("timestamp", a0Var.f4322b);
            jSONObject.put("type", a0Var.f4323c.toString());
            if (a0Var.f4324d != null) {
                jSONObject.put("details", new JSONObject(a0Var.f4324d));
            }
            jSONObject.put("customType", a0Var.f4325e);
            if (a0Var.f4326f != null) {
                jSONObject.put("customAttributes", new JSONObject(a0Var.f4326f));
            }
            jSONObject.put("predefinedType", a0Var.f4327g);
            if (a0Var.f4328h != null) {
                jSONObject.put("predefinedAttributes", new JSONObject(a0Var.f4328h));
            }
            return jSONObject;
        } catch (JSONException e) {
            if (VERSION.SDK_INT >= 9) {
                throw new IOException(e.getMessage(), e);
            }
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: b */
    public byte[] mo5413a(C1328a0 a0Var) {
        return mo5412a(a0Var).toString().getBytes("UTF-8");
    }
}
