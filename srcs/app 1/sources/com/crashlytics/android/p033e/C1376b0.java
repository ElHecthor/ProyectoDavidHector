package com.crashlytics.android.p033e;

import android.content.Context;
import android.os.Bundle;

/* renamed from: com.crashlytics.android.e.b0 */
class C1376b0 implements C1489w0 {

    /* renamed from: a */
    private final Context f4441a;

    /* renamed from: b */
    private final String f4442b;

    public C1376b0(Context context, String str) {
        this.f4441a = context;
        this.f4442b = str;
    }

    /* renamed from: a */
    public String mo5496a() {
        try {
            Bundle bundle = this.f4441a.getPackageManager().getApplicationInfo(this.f4442b, 128).metaData;
            if (bundle != null) {
                return bundle.getString("io.fabric.unity.crashlytics.version");
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
