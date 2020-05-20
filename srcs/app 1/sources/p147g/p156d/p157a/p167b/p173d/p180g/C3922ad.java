package p147g.p156d.p157a.p167b.p173d.p180g;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import p147g.p156d.p157a.p167b.p172c.C3851a;

/* renamed from: g.d.a.b.d.g.ad */
public final class C3922ad extends C3907a implements C4302yc {
    C3922ad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) {
        Parcel t = mo12053t();
        t.writeString(str);
        t.writeLong(j);
        mo12052b(23, t);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel t = mo12053t();
        t.writeString(str);
        t.writeString(str2);
        C4229u.m17243a(t, (Parcelable) bundle);
        mo12052b(9, t);
    }

    public final void endAdUnitExposure(String str, long j) {
        Parcel t = mo12053t();
        t.writeString(str);
        t.writeLong(j);
        mo12052b(24, t);
    }

    public final void generateEventId(C4317zc zcVar) {
        Parcel t = mo12053t();
        C4229u.m17242a(t, (IInterface) zcVar);
        mo12052b(22, t);
    }

    public final void getAppInstanceId(C4317zc zcVar) {
        Parcel t = mo12053t();
        C4229u.m17242a(t, (IInterface) zcVar);
        mo12052b(20, t);
    }

    public final void getCachedAppInstanceId(C4317zc zcVar) {
        Parcel t = mo12053t();
        C4229u.m17242a(t, (IInterface) zcVar);
        mo12052b(19, t);
    }

    public final void getConditionalUserProperties(String str, String str2, C4317zc zcVar) {
        Parcel t = mo12053t();
        t.writeString(str);
        t.writeString(str2);
        C4229u.m17242a(t, (IInterface) zcVar);
        mo12052b(10, t);
    }

    public final void getCurrentScreenClass(C4317zc zcVar) {
        Parcel t = mo12053t();
        C4229u.m17242a(t, (IInterface) zcVar);
        mo12052b(17, t);
    }

    public final void getCurrentScreenName(C4317zc zcVar) {
        Parcel t = mo12053t();
        C4229u.m17242a(t, (IInterface) zcVar);
        mo12052b(16, t);
    }

    public final void getGmpAppId(C4317zc zcVar) {
        Parcel t = mo12053t();
        C4229u.m17242a(t, (IInterface) zcVar);
        mo12052b(21, t);
    }

    public final void getMaxUserProperties(String str, C4317zc zcVar) {
        Parcel t = mo12053t();
        t.writeString(str);
        C4229u.m17242a(t, (IInterface) zcVar);
        mo12052b(6, t);
    }

    public final void getTestFlag(C4317zc zcVar, int i) {
        Parcel t = mo12053t();
        C4229u.m17242a(t, (IInterface) zcVar);
        t.writeInt(i);
        mo12052b(38, t);
    }

    public final void getUserProperties(String str, String str2, boolean z, C4317zc zcVar) {
        Parcel t = mo12053t();
        t.writeString(str);
        t.writeString(str2);
        C4229u.m17244a(t, z);
        C4229u.m17242a(t, (IInterface) zcVar);
        mo12052b(5, t);
    }

    public final void initForTests(Map map) {
        Parcel t = mo12053t();
        t.writeMap(map);
        mo12052b(37, t);
    }

    public final void initialize(C3851a aVar, C3923b bVar, long j) {
        Parcel t = mo12053t();
        C4229u.m17242a(t, (IInterface) aVar);
        C4229u.m17243a(t, (Parcelable) bVar);
        t.writeLong(j);
        mo12052b(1, t);
    }

    public final void isDataCollectionEnabled(C4317zc zcVar) {
        Parcel t = mo12053t();
        C4229u.m17242a(t, (IInterface) zcVar);
        mo12052b(40, t);
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel t = mo12053t();
        t.writeString(str);
        t.writeString(str2);
        C4229u.m17243a(t, (Parcelable) bundle);
        C4229u.m17244a(t, z);
        C4229u.m17244a(t, z2);
        t.writeLong(j);
        mo12052b(2, t);
    }

    public final void logEventAndBundle(String str, String str2, Bundle bundle, C4317zc zcVar, long j) {
        Parcel t = mo12053t();
        t.writeString(str);
        t.writeString(str2);
        C4229u.m17243a(t, (Parcelable) bundle);
        C4229u.m17242a(t, (IInterface) zcVar);
        t.writeLong(j);
        mo12052b(3, t);
    }

    public final void logHealthData(int i, String str, C3851a aVar, C3851a aVar2, C3851a aVar3) {
        Parcel t = mo12053t();
        t.writeInt(i);
        t.writeString(str);
        C4229u.m17242a(t, (IInterface) aVar);
        C4229u.m17242a(t, (IInterface) aVar2);
        C4229u.m17242a(t, (IInterface) aVar3);
        mo12052b(33, t);
    }

    public final void onActivityCreated(C3851a aVar, Bundle bundle, long j) {
        Parcel t = mo12053t();
        C4229u.m17242a(t, (IInterface) aVar);
        C4229u.m17243a(t, (Parcelable) bundle);
        t.writeLong(j);
        mo12052b(27, t);
    }

    public final void onActivityDestroyed(C3851a aVar, long j) {
        Parcel t = mo12053t();
        C4229u.m17242a(t, (IInterface) aVar);
        t.writeLong(j);
        mo12052b(28, t);
    }

    public final void onActivityPaused(C3851a aVar, long j) {
        Parcel t = mo12053t();
        C4229u.m17242a(t, (IInterface) aVar);
        t.writeLong(j);
        mo12052b(29, t);
    }

    public final void onActivityResumed(C3851a aVar, long j) {
        Parcel t = mo12053t();
        C4229u.m17242a(t, (IInterface) aVar);
        t.writeLong(j);
        mo12052b(30, t);
    }

    public final void onActivitySaveInstanceState(C3851a aVar, C4317zc zcVar, long j) {
        Parcel t = mo12053t();
        C4229u.m17242a(t, (IInterface) aVar);
        C4229u.m17242a(t, (IInterface) zcVar);
        t.writeLong(j);
        mo12052b(31, t);
    }

    public final void onActivityStarted(C3851a aVar, long j) {
        Parcel t = mo12053t();
        C4229u.m17242a(t, (IInterface) aVar);
        t.writeLong(j);
        mo12052b(25, t);
    }

    public final void onActivityStopped(C3851a aVar, long j) {
        Parcel t = mo12053t();
        C4229u.m17242a(t, (IInterface) aVar);
        t.writeLong(j);
        mo12052b(26, t);
    }

    public final void performAction(Bundle bundle, C4317zc zcVar, long j) {
        Parcel t = mo12053t();
        C4229u.m17243a(t, (Parcelable) bundle);
        C4229u.m17242a(t, (IInterface) zcVar);
        t.writeLong(j);
        mo12052b(32, t);
    }

    public final void registerOnMeasurementEventListener(C3992ed edVar) {
        Parcel t = mo12053t();
        C4229u.m17242a(t, (IInterface) edVar);
        mo12052b(35, t);
    }

    public final void resetAnalyticsData(long j) {
        Parcel t = mo12053t();
        t.writeLong(j);
        mo12052b(12, t);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel t = mo12053t();
        C4229u.m17243a(t, (Parcelable) bundle);
        t.writeLong(j);
        mo12052b(8, t);
    }

    public final void setCurrentScreen(C3851a aVar, String str, String str2, long j) {
        Parcel t = mo12053t();
        C4229u.m17242a(t, (IInterface) aVar);
        t.writeString(str);
        t.writeString(str2);
        t.writeLong(j);
        mo12052b(15, t);
    }

    public final void setDataCollectionEnabled(boolean z) {
        Parcel t = mo12053t();
        C4229u.m17244a(t, z);
        mo12052b(39, t);
    }

    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel t = mo12053t();
        C4229u.m17243a(t, (Parcelable) bundle);
        mo12052b(42, t);
    }

    public final void setEventInterceptor(C3992ed edVar) {
        Parcel t = mo12053t();
        C4229u.m17242a(t, (IInterface) edVar);
        mo12052b(34, t);
    }

    public final void setInstanceIdProvider(C4009fd fdVar) {
        Parcel t = mo12053t();
        C4229u.m17242a(t, (IInterface) fdVar);
        mo12052b(18, t);
    }

    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel t = mo12053t();
        C4229u.m17244a(t, z);
        t.writeLong(j);
        mo12052b(11, t);
    }

    public final void setMinimumSessionDuration(long j) {
        Parcel t = mo12053t();
        t.writeLong(j);
        mo12052b(13, t);
    }

    public final void setSessionTimeoutDuration(long j) {
        Parcel t = mo12053t();
        t.writeLong(j);
        mo12052b(14, t);
    }

    public final void setUserId(String str, long j) {
        Parcel t = mo12053t();
        t.writeString(str);
        t.writeLong(j);
        mo12052b(7, t);
    }

    public final void setUserProperty(String str, String str2, C3851a aVar, boolean z, long j) {
        Parcel t = mo12053t();
        t.writeString(str);
        t.writeString(str2);
        C4229u.m17242a(t, (IInterface) aVar);
        C4229u.m17244a(t, z);
        t.writeLong(j);
        mo12052b(4, t);
    }

    public final void unregisterOnMeasurementEventListener(C3992ed edVar) {
        Parcel t = mo12053t();
        C4229u.m17242a(t, (IInterface) edVar);
        mo12052b(36, t);
    }
}
