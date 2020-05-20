package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.util.DynamiteApi;
import java.util.Map;
import p071f.p088e.C3162a;
import p147g.p156d.p157a.p167b.p172c.C3851a;
import p147g.p156d.p157a.p167b.p172c.C3854b;
import p147g.p156d.p157a.p167b.p173d.p180g.C3923b;
import p147g.p156d.p157a.p167b.p173d.p180g.C3992ed;
import p147g.p156d.p157a.p167b.p173d.p180g.C4009fd;
import p147g.p156d.p157a.p167b.p173d.p180g.C4287xc;
import p147g.p156d.p157a.p167b.p173d.p180g.C4317zc;

@DynamiteApi
public class AppMeasurementDynamiteService extends C4287xc {

    /* renamed from: a */
    C2263c5 f6216a = null;

    /* renamed from: b */
    private Map<Integer, C2324h6> f6217b = new C3162a();

    /* renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$a */
    class C2231a implements C2276d6 {

        /* renamed from: a */
        private C3992ed f6218a;

        C2231a(C3992ed edVar) {
            this.f6218a = edVar;
        }

        /* renamed from: a */
        public final void mo7085a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f6218a.mo12317a(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.f6216a.mo7098j().mo7818w().mo7089a("Event interceptor threw exception", e);
            }
        }
    }

    /* renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$b */
    class C2232b implements C2324h6 {

        /* renamed from: a */
        private C3992ed f6220a;

        C2232b(C3992ed edVar) {
            this.f6220a = edVar;
        }

        public final void onEvent(String str, String str2, Bundle bundle, long j) {
            try {
                this.f6220a.mo12317a(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.f6216a.mo7098j().mo7818w().mo7089a("Event listener threw exception", e);
            }
        }
    }

    /* renamed from: a */
    private final void m9093a() {
        if (this.f6216a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    /* renamed from: a */
    private final void m9094a(C4317zc zcVar, String str) {
        this.f6216a.mo7218v().mo7694a(zcVar, str);
    }

    public void beginAdUnitExposure(String str, long j) {
        m9093a();
        this.f6216a.mo7197H().mo7131a(str, j);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        m9093a();
        this.f6216a.mo7217u().mo7445c(str, str2, bundle);
    }

    public void endAdUnitExposure(String str, long j) {
        m9093a();
        this.f6216a.mo7197H().mo7132b(str, j);
    }

    public void generateEventId(C4317zc zcVar) {
        m9093a();
        this.f6216a.mo7218v().mo7692a(zcVar, this.f6216a.mo7218v().mo7711t());
    }

    public void getAppInstanceId(C4317zc zcVar) {
        m9093a();
        this.f6216a.mo7097i().mo7841a((Runnable) new C2301f7(this, zcVar));
    }

    public void getCachedAppInstanceId(C4317zc zcVar) {
        m9093a();
        m9094a(zcVar, this.f6216a.mo7217u().mo7414H());
    }

    public void getConditionalUserProperties(String str, String str2, C4317zc zcVar) {
        m9093a();
        this.f6216a.mo7097i().mo7841a((Runnable) new C2302f8(this, zcVar, str, str2));
    }

    public void getCurrentScreenClass(C4317zc zcVar) {
        m9093a();
        m9094a(zcVar, this.f6216a.mo7217u().mo7417K());
    }

    public void getCurrentScreenName(C4317zc zcVar) {
        m9093a();
        m9094a(zcVar, this.f6216a.mo7217u().mo7416J());
    }

    public void getGmpAppId(C4317zc zcVar) {
        m9093a();
        m9094a(zcVar, this.f6216a.mo7217u().mo7418L());
    }

    public void getMaxUserProperties(String str, C4317zc zcVar) {
        m9093a();
        this.f6216a.mo7217u();
        C2148s.m8844b(str);
        this.f6216a.mo7218v().mo7691a(zcVar, 25);
    }

    public void getTestFlag(C4317zc zcVar, int i) {
        m9093a();
        if (i == 0) {
            this.f6216a.mo7218v().mo7694a(zcVar, this.f6216a.mo7217u().mo7410D());
        } else if (i == 1) {
            this.f6216a.mo7218v().mo7692a(zcVar, this.f6216a.mo7217u().mo7411E().longValue());
        } else if (i == 2) {
            C2489v9 v = this.f6216a.mo7218v();
            double doubleValue = this.f6216a.mo7217u().mo7413G().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                zcVar.mo12121a(bundle);
            } catch (RemoteException e) {
                v.f7100a.mo7098j().mo7818w().mo7089a("Error returning double value to wrapper", e);
            }
        } else if (i != 3) {
            if (i == 4) {
                this.f6216a.mo7218v().mo7696a(zcVar, this.f6216a.mo7217u().mo7409C().booleanValue());
            }
        } else {
            this.f6216a.mo7218v().mo7691a(zcVar, this.f6216a.mo7217u().mo7412F().intValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, C4317zc zcVar) {
        m9093a();
        C2528z4 i = this.f6216a.mo7097i();
        C2315g9 g9Var = new C2315g9(this, zcVar, str, str2, z);
        i.mo7841a((Runnable) g9Var);
    }

    public void initForTests(Map map) {
        m9093a();
    }

    public void initialize(C3851a aVar, C3923b bVar, long j) {
        Context context = (Context) C3854b.m15593a(aVar);
        C2263c5 c5Var = this.f6216a;
        if (c5Var == null) {
            this.f6216a = C2263c5.m9228a(context, bVar, Long.valueOf(j));
        } else {
            c5Var.mo7098j().mo7818w().mo7088a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(C4317zc zcVar) {
        m9093a();
        this.f6216a.mo7097i().mo7841a((Runnable) new C2533z9(this, zcVar));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        m9093a();
        this.f6216a.mo7217u().mo7433a(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, C4317zc zcVar, long j) {
        Bundle bundle2;
        m9093a();
        C2148s.m8844b(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        String str3 = "app";
        bundle2.putString("_o", str3);
        C2435r rVar = new C2435r(str2, new C2377m(bundle), str3, j);
        this.f6216a.mo7097i().mo7841a((Runnable) new C2312g6(this, zcVar, rVar, str));
    }

    public void logHealthData(int i, String str, C3851a aVar, C3851a aVar2, C3851a aVar3) {
        m9093a();
        Object obj = null;
        Object a = aVar == null ? null : C3854b.m15593a(aVar);
        Object a2 = aVar2 == null ? null : C3854b.m15593a(aVar2);
        if (aVar3 != null) {
            obj = C3854b.m15593a(aVar3);
        }
        this.f6216a.mo7098j().mo7813a(i, true, false, str, a, a2, obj);
    }

    public void onActivityCreated(C3851a aVar, Bundle bundle, long j) {
        m9093a();
        C2265c7 c7Var = this.f6216a.mo7217u().f6550c;
        if (c7Var != null) {
            this.f6216a.mo7217u().mo7408B();
            c7Var.onActivityCreated((Activity) C3854b.m15593a(aVar), bundle);
        }
    }

    public void onActivityDestroyed(C3851a aVar, long j) {
        m9093a();
        C2265c7 c7Var = this.f6216a.mo7217u().f6550c;
        if (c7Var != null) {
            this.f6216a.mo7217u().mo7408B();
            c7Var.onActivityDestroyed((Activity) C3854b.m15593a(aVar));
        }
    }

    public void onActivityPaused(C3851a aVar, long j) {
        m9093a();
        C2265c7 c7Var = this.f6216a.mo7217u().f6550c;
        if (c7Var != null) {
            this.f6216a.mo7217u().mo7408B();
            c7Var.onActivityPaused((Activity) C3854b.m15593a(aVar));
        }
    }

    public void onActivityResumed(C3851a aVar, long j) {
        m9093a();
        C2265c7 c7Var = this.f6216a.mo7217u().f6550c;
        if (c7Var != null) {
            this.f6216a.mo7217u().mo7408B();
            c7Var.onActivityResumed((Activity) C3854b.m15593a(aVar));
        }
    }

    public void onActivitySaveInstanceState(C3851a aVar, C4317zc zcVar, long j) {
        m9093a();
        C2265c7 c7Var = this.f6216a.mo7217u().f6550c;
        Bundle bundle = new Bundle();
        if (c7Var != null) {
            this.f6216a.mo7217u().mo7408B();
            c7Var.onActivitySaveInstanceState((Activity) C3854b.m15593a(aVar), bundle);
        }
        try {
            zcVar.mo12121a(bundle);
        } catch (RemoteException e) {
            this.f6216a.mo7098j().mo7818w().mo7089a("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(C3851a aVar, long j) {
        m9093a();
        C2265c7 c7Var = this.f6216a.mo7217u().f6550c;
        if (c7Var != null) {
            this.f6216a.mo7217u().mo7408B();
            c7Var.onActivityStarted((Activity) C3854b.m15593a(aVar));
        }
    }

    public void onActivityStopped(C3851a aVar, long j) {
        m9093a();
        C2265c7 c7Var = this.f6216a.mo7217u().f6550c;
        if (c7Var != null) {
            this.f6216a.mo7217u().mo7408B();
            c7Var.onActivityStopped((Activity) C3854b.m15593a(aVar));
        }
    }

    public void performAction(Bundle bundle, C4317zc zcVar, long j) {
        m9093a();
        zcVar.mo12121a(null);
    }

    public void registerOnMeasurementEventListener(C3992ed edVar) {
        m9093a();
        C2324h6 h6Var = (C2324h6) this.f6217b.get(Integer.valueOf(edVar.mo12316a()));
        if (h6Var == null) {
            h6Var = new C2232b(edVar);
            this.f6217b.put(Integer.valueOf(edVar.mo12316a()), h6Var);
        }
        this.f6216a.mo7217u().mo7427a(h6Var);
    }

    public void resetAnalyticsData(long j) {
        m9093a();
        this.f6216a.mo7217u().mo7444c(j);
    }

    public void setConditionalUserProperty(Bundle bundle, long j) {
        m9093a();
        if (bundle == null) {
            this.f6216a.mo7098j().mo7815t().mo7088a("Conditional user property must not be null");
        } else {
            this.f6216a.mo7217u().mo7425a(bundle, j);
        }
    }

    public void setCurrentScreen(C3851a aVar, String str, String str2, long j) {
        m9093a();
        this.f6216a.mo7193D().mo7524a((Activity) C3854b.m15593a(aVar), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) {
        m9093a();
        this.f6216a.mo7217u().mo7443b(z);
    }

    public void setDefaultEventParameters(Bundle bundle) {
        m9093a();
        C2348j6 u = this.f6216a.mo7217u();
        u.mo7097i().mo7841a((Runnable) new C2336i6(u, bundle == null ? null : new Bundle(bundle)));
    }

    public void setEventInterceptor(C3992ed edVar) {
        m9093a();
        C2348j6 u = this.f6216a.mo7217u();
        C2231a aVar = new C2231a(edVar);
        u.mo7273a();
        u.mo7245x();
        u.mo7097i().mo7841a((Runnable) new C2442r6(u, aVar));
    }

    public void setInstanceIdProvider(C4009fd fdVar) {
        m9093a();
    }

    public void setMeasurementEnabled(boolean z, long j) {
        m9093a();
        this.f6216a.mo7217u().mo7438a(z);
    }

    public void setMinimumSessionDuration(long j) {
        m9093a();
        this.f6216a.mo7217u().mo7423a(j);
    }

    public void setSessionTimeoutDuration(long j) {
        m9093a();
        this.f6216a.mo7217u().mo7439b(j);
    }

    public void setUserId(String str, long j) {
        m9093a();
        this.f6216a.mo7217u().mo7436a(null, "_id", str, true, j);
    }

    public void setUserProperty(String str, String str2, C3851a aVar, boolean z, long j) {
        m9093a();
        this.f6216a.mo7217u().mo7436a(str, str2, C3854b.m15593a(aVar), z, j);
    }

    public void unregisterOnMeasurementEventListener(C3992ed edVar) {
        m9093a();
        C2324h6 h6Var = (C2324h6) this.f6217b.remove(Integer.valueOf(edVar.mo12316a()));
        if (h6Var == null) {
            h6Var = new C2232b(edVar);
        }
        this.f6216a.mo7217u().mo7441b(h6Var);
    }
}
