package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.measurement.internal.C2263c5;
import com.google.android.gms.measurement.internal.C2289e7;
import com.google.android.gms.measurement.internal.C2324h6;
import com.google.android.gms.measurement.internal.C2529z5;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement {

    /* renamed from: d */
    private static volatile AppMeasurement f6209d;

    /* renamed from: a */
    private final C2263c5 f6210a;

    /* renamed from: b */
    private final C2289e7 f6211b;

    /* renamed from: c */
    private final boolean f6212c;

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(Bundle bundle) {
            Class<Long> cls = Long.class;
            Class<String> cls2 = String.class;
            C2148s.m8834a(bundle);
            this.mAppId = (String) C2529z5.m10194a(bundle, "app_id", cls2, null);
            this.mOrigin = (String) C2529z5.m10194a(bundle, "origin", cls2, null);
            this.mName = (String) C2529z5.m10194a(bundle, "name", cls2, null);
            this.mValue = C2529z5.m10194a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) C2529z5.m10194a(bundle, "trigger_event_name", cls2, null);
            Long valueOf = Long.valueOf(0);
            this.mTriggerTimeout = ((Long) C2529z5.m10194a(bundle, "trigger_timeout", cls, valueOf)).longValue();
            this.mTimedOutEventName = (String) C2529z5.m10194a(bundle, "timed_out_event_name", cls2, null);
            this.mTimedOutEventParams = (Bundle) C2529z5.m10194a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) C2529z5.m10194a(bundle, "triggered_event_name", cls2, null);
            this.mTriggeredEventParams = (Bundle) C2529z5.m10194a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) C2529z5.m10194a(bundle, "time_to_live", cls, valueOf)).longValue();
            this.mExpiredEventName = (String) C2529z5.m10194a(bundle, "expired_event_name", cls2, null);
            this.mExpiredEventParams = (Bundle) C2529z5.m10194a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) C2529z5.m10194a(bundle, "active", Boolean.class, Boolean.valueOf(false))).booleanValue();
            this.mCreationTimestamp = ((Long) C2529z5.m10194a(bundle, "creation_timestamp", cls, valueOf)).longValue();
            this.mTriggeredTimestamp = ((Long) C2529z5.m10194a(bundle, "triggered_timestamp", cls, valueOf)).longValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Bundle mo7025a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                C2529z5.m10195a(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }
    }

    public interface OnEventListener extends C2324h6 {
        void onEvent(String str, String str2, Bundle bundle, long j);
    }

    private AppMeasurement(C2263c5 c5Var) {
        C2148s.m8834a(c5Var);
        this.f6210a = c5Var;
        this.f6211b = null;
        this.f6212c = false;
    }

    private AppMeasurement(C2289e7 e7Var) {
        C2148s.m8834a(e7Var);
        this.f6211b = e7Var;
        this.f6210a = null;
        this.f6212c = true;
    }

    /* renamed from: a */
    public static AppMeasurement m9078a(Context context, Bundle bundle) {
        if (f6209d == null) {
            synchronized (AppMeasurement.class) {
                if (f6209d == null) {
                    C2289e7 b = m9080b(context, bundle);
                    if (b != null) {
                        f6209d = new AppMeasurement(b);
                    } else {
                        f6209d = new AppMeasurement(C2263c5.m9229a(context, null, null, bundle));
                    }
                }
            }
        }
        return f6209d;
    }

    /* renamed from: a */
    private static AppMeasurement m9079a(Context context, String str, String str2) {
        if (f6209d == null) {
            synchronized (AppMeasurement.class) {
                if (f6209d == null) {
                    C2289e7 b = m9080b(context, null);
                    if (b != null) {
                        f6209d = new AppMeasurement(b);
                    } else {
                        f6209d = new AppMeasurement(C2263c5.m9229a(context, null, null, null));
                    }
                }
            }
        }
        return f6209d;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.measurement.internal.C2289e7 m9080b(android.content.Context r8, android.os.Bundle r9) {
        /*
            r0 = 0
            java.lang.String r1 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0027 }
            java.lang.String r2 = "getScionFrontendApiImplementation"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{  }
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch:{  }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch:{  }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{  }
            r2[r6] = r8     // Catch:{  }
            r2[r7] = r9     // Catch:{  }
            java.lang.Object r8 = r1.invoke(r0, r2)     // Catch:{  }
            com.google.android.gms.measurement.internal.e7 r8 = (com.google.android.gms.measurement.internal.C2289e7) r8     // Catch:{  }
            return r8
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.m9080b(android.content.Context, android.os.Bundle):com.google.android.gms.measurement.internal.e7");
    }

    @Deprecated
    @Keep
    public static AppMeasurement getInstance(Context context) {
        return m9079a(context, (String) null, (String) null);
    }

    /* renamed from: a */
    public void mo7005a(String str, String str2, Object obj) {
        C2148s.m8844b(str);
        if (this.f6212c) {
            this.f6211b.mo7256a(str, str2, obj);
        } else {
            this.f6210a.mo7217u().mo7435a(str, str2, obj, true);
        }
    }

    /* renamed from: a */
    public final void mo7006a(boolean z) {
        if (this.f6212c) {
            this.f6211b.mo7260b(z);
        } else {
            this.f6210a.mo7217u().mo7443b(z);
        }
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        if (this.f6212c) {
            this.f6211b.mo7254a(str);
        } else {
            this.f6210a.mo7197H().mo7131a(str, this.f6210a.mo7095g().mo6989c());
        }
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (this.f6212c) {
            this.f6211b.mo7255a(str, str2, bundle);
        } else {
            this.f6210a.mo7217u().mo7445c(str, str2, bundle);
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) {
        if (this.f6212c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f6210a.mo7217u().mo7437a(str, str2, str3, bundle);
        throw null;
    }

    @Keep
    public void endAdUnitExposure(String str) {
        if (this.f6212c) {
            this.f6211b.mo7262c(str);
        } else {
            this.f6210a.mo7197H().mo7132b(str, this.f6210a.mo7095g().mo6989c());
        }
    }

    @Keep
    public long generateEventId() {
        return this.f6212c ? this.f6211b.mo7264e() : this.f6210a.mo7218v().mo7711t();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f6212c ? this.f6211b.mo7261c() : this.f6210a.mo7217u().mo7414H();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> a = this.f6212c ? this.f6211b.mo7250a(str, str2) : this.f6210a.mo7217u().mo7419a(str, str2);
        ArrayList arrayList = new ArrayList(a == null ? 0 : a.size());
        for (Bundle conditionalUserProperty : a) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Keep
    public List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        if (this.f6212c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f6210a.mo7217u().mo7420a(str, str2, str3);
        throw null;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f6212c ? this.f6211b.mo7258b() : this.f6210a.mo7217u().mo7417K();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f6212c ? this.f6211b.mo7249a() : this.f6210a.mo7217u().mo7416J();
    }

    @Keep
    public String getGmpAppId() {
        return this.f6212c ? this.f6211b.mo7263d() : this.f6210a.mo7217u().mo7418L();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        if (this.f6212c) {
            return this.f6211b.mo7257b(str);
        }
        this.f6210a.mo7217u();
        C2148s.m8844b(str);
        return 25;
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f6212c ? this.f6211b.mo7251a(str, str2, z) : this.f6210a.mo7217u().mo7422a(str, str2, z);
    }

    /* access modifiers changed from: protected */
    @Keep
    public Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (this.f6212c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f6210a.mo7217u().mo7421a(str, str2, str3, z);
        throw null;
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.f6212c) {
            this.f6211b.mo7259b(str, str2, bundle);
        } else {
            this.f6210a.mo7217u().mo7431a(str, str2, bundle);
        }
    }

    public void registerOnMeasurementEventListener(OnEventListener onEventListener) {
        if (this.f6212c) {
            this.f6211b.mo7253a((C2324h6) onEventListener);
        } else {
            this.f6210a.mo7217u().mo7427a((C2324h6) onEventListener);
        }
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        C2148s.m8834a(conditionalUserProperty);
        if (this.f6212c) {
            this.f6211b.mo7252a(conditionalUserProperty.mo7025a());
        } else {
            this.f6210a.mo7217u().mo7424a(conditionalUserProperty.mo7025a());
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) {
        C2148s.m8834a(conditionalUserProperty);
        if (this.f6212c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f6210a.mo7217u().mo7440b(conditionalUserProperty.mo7025a());
        throw null;
    }
}
