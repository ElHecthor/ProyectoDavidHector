package p147g.p156d.p157a.p167b.p173d.p180g;

import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;
import p147g.p156d.p157a.p167b.p172c.C3851a;

/* renamed from: g.d.a.b.d.g.yc */
public interface C4302yc extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void endAdUnitExposure(String str, long j);

    void generateEventId(C4317zc zcVar);

    void getAppInstanceId(C4317zc zcVar);

    void getCachedAppInstanceId(C4317zc zcVar);

    void getConditionalUserProperties(String str, String str2, C4317zc zcVar);

    void getCurrentScreenClass(C4317zc zcVar);

    void getCurrentScreenName(C4317zc zcVar);

    void getGmpAppId(C4317zc zcVar);

    void getMaxUserProperties(String str, C4317zc zcVar);

    void getTestFlag(C4317zc zcVar, int i);

    void getUserProperties(String str, String str2, boolean z, C4317zc zcVar);

    void initForTests(Map map);

    void initialize(C3851a aVar, C3923b bVar, long j);

    void isDataCollectionEnabled(C4317zc zcVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, C4317zc zcVar, long j);

    void logHealthData(int i, String str, C3851a aVar, C3851a aVar2, C3851a aVar3);

    void onActivityCreated(C3851a aVar, Bundle bundle, long j);

    void onActivityDestroyed(C3851a aVar, long j);

    void onActivityPaused(C3851a aVar, long j);

    void onActivityResumed(C3851a aVar, long j);

    void onActivitySaveInstanceState(C3851a aVar, C4317zc zcVar, long j);

    void onActivityStarted(C3851a aVar, long j);

    void onActivityStopped(C3851a aVar, long j);

    void performAction(Bundle bundle, C4317zc zcVar, long j);

    void registerOnMeasurementEventListener(C3992ed edVar);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setCurrentScreen(C3851a aVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(C3992ed edVar);

    void setInstanceIdProvider(C4009fd fdVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, C3851a aVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(C3992ed edVar);
}
