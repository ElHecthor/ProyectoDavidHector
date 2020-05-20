package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.measurement.internal.C2263c5;
import com.google.android.gms.measurement.internal.C2289e7;
import com.google.android.gms.measurement.internal.C2352ja;
import com.google.firebase.iid.FirebaseInstanceId;
import p147g.p156d.p157a.p167b.p173d.p180g.C3957d;

public final class FirebaseAnalytics {

    /* renamed from: d */
    private static volatile FirebaseAnalytics f8319d;

    /* renamed from: a */
    private final C2263c5 f8320a;

    /* renamed from: b */
    private final C3957d f8321b;

    /* renamed from: c */
    private final boolean f8322c;

    private FirebaseAnalytics(C2263c5 c5Var) {
        C2148s.m8834a(c5Var);
        this.f8320a = c5Var;
        this.f8321b = null;
        this.f8322c = false;
    }

    private FirebaseAnalytics(C3957d dVar) {
        C2148s.m8834a(dVar);
        this.f8320a = null;
        this.f8321b = dVar;
        this.f8322c = true;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f8319d == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f8319d == null) {
                    f8319d = C3957d.m16153b(context) ? new FirebaseAnalytics(C3957d.m16139a(context)) : new FirebaseAnalytics(C2263c5.m9228a(context, null, null));
                }
            }
        }
        return f8319d;
    }

    @Keep
    public static C2289e7 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        if (!C3957d.m16153b(context)) {
            return null;
        }
        C3957d a = C3957d.m16140a(context, (String) null, (String) null, (String) null, bundle);
        if (a == null) {
            return null;
        }
        return new C2865b(a);
    }

    /* renamed from: a */
    public final void mo9522a(String str) {
        if (this.f8322c) {
            this.f8321b.mo12299a(str);
        } else {
            this.f8320a.mo7217u().mo7435a("app", "_id", (Object) str, true);
        }
    }

    /* renamed from: a */
    public final void mo9523a(String str, Bundle bundle) {
        if (this.f8322c) {
            this.f8321b.mo12300a(str, bundle);
        } else {
            this.f8320a.mo7217u().mo7432a("app", str, bundle, true);
        }
    }

    /* renamed from: a */
    public final void mo9524a(String str, String str2) {
        if (this.f8322c) {
            this.f8321b.mo12301a(str, str2);
        } else {
            this.f8320a.mo7217u().mo7435a("app", str, (Object) str2, false);
        }
    }

    @Keep
    public final String getFirebaseInstanceId() {
        return FirebaseInstanceId.m12068k().mo9612a();
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        if (this.f8322c) {
            this.f8321b.mo12296a(activity, str, str2);
        } else if (!C2352ja.m9553a()) {
            this.f8320a.mo7098j().mo7818w().mo7088a("setCurrentScreen must be called from the main thread");
        } else {
            this.f8320a.mo7193D().mo7524a(activity, str, str2);
        }
    }
}
