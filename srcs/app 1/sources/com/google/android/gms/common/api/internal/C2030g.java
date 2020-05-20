package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.C2166k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.internal.C2155v0;
import com.google.android.gms.common.internal.C2156w;
import javax.annotation.concurrent.GuardedBy;

@Deprecated
/* renamed from: com.google.android.gms.common.api.internal.g */
public final class C2030g {

    /* renamed from: d */
    private static final Object f5906d = new Object();
    @GuardedBy("sLock")

    /* renamed from: e */
    private static C2030g f5907e;

    /* renamed from: a */
    private final String f5908a;

    /* renamed from: b */
    private final Status f5909b;

    /* renamed from: c */
    private final boolean f5910c;

    C2030g(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(C2166k.common_google_play_services_unknown_issue));
        boolean z = false;
        if (identifier != 0) {
            if (resources.getInteger(identifier) != 0) {
                z = true;
            }
            this.f5910c = !z;
        } else {
            this.f5910c = false;
        }
        String a = C2155v0.m8863a(context);
        if (a == null) {
            a = new C2156w(context).mo6948a("google_app_id");
        }
        if (TextUtils.isEmpty(a)) {
            this.f5909b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f5908a = null;
            return;
        }
        this.f5908a = a;
        this.f5909b = Status.f5796j;
    }

    /* renamed from: a */
    public static Status m8501a(Context context) {
        Status status;
        C2148s.m8835a(context, (Object) "Context must not be null.");
        synchronized (f5906d) {
            if (f5907e == null) {
                f5907e = new C2030g(context);
            }
            status = f5907e.f5909b;
        }
        return status;
    }

    /* renamed from: a */
    private static C2030g m8502a(String str) {
        C2030g gVar;
        synchronized (f5906d) {
            if (f5907e != null) {
                gVar = f5907e;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return gVar;
    }

    /* renamed from: a */
    public static String m8503a() {
        return m8502a("getGoogleAppId").f5908a;
    }

    /* renamed from: b */
    public static boolean m8504b() {
        return m8502a("isMeasurementExplicitlyDisabled").f5910c;
    }
}
