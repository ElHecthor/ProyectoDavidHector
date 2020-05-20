package com.google.firebase.analytics.p056a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.C2860a;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.internal.C2867b;
import com.google.firebase.p059f.C2915a;
import com.google.firebase.p059f.C2918d;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.firebase.analytics.a.b */
public class C2862b implements C2861a {

    /* renamed from: b */
    private static volatile C2861a f8323b;

    /* renamed from: a */
    private final AppMeasurement f8324a;

    private C2862b(AppMeasurement appMeasurement) {
        C2148s.m8834a(appMeasurement);
        this.f8324a = appMeasurement;
        new ConcurrentHashMap();
    }

    /* renamed from: a */
    public static C2861a m11881a(FirebaseApp firebaseApp, Context context, C2918d dVar) {
        C2148s.m8834a(firebaseApp);
        C2148s.m8834a(context);
        C2148s.m8834a(dVar);
        C2148s.m8834a(context.getApplicationContext());
        if (f8323b == null) {
            synchronized (C2862b.class) {
                if (f8323b == null) {
                    Bundle bundle = new Bundle(1);
                    if (firebaseApp.mo9513e()) {
                        dVar.mo9576a(C2860a.class, C2864d.f8326f, C2863c.f8325a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                    }
                    f8323b = new C2862b(AppMeasurement.m9078a(context, bundle));
                }
            }
        }
        return f8323b;
    }

    /* renamed from: a */
    static final /* synthetic */ void m11882a(C2915a aVar) {
        boolean z = ((C2860a) aVar.mo9601a()).f8318a;
        synchronized (C2862b.class) {
            ((C2862b) f8323b).f8324a.mo7006a(z);
        }
    }

    /* renamed from: a */
    public void mo9527a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C2867b.m11903a(str) && C2867b.m11904a(str2, bundle) && C2867b.m11906a(str, str2, bundle)) {
            C2867b.m11907b(str, str2, bundle);
            this.f8324a.logEventInternal(str, str2, bundle);
        }
    }

    /* renamed from: a */
    public void mo9528a(String str, String str2, Object obj) {
        if (C2867b.m11903a(str) && C2867b.m11905a(str, str2)) {
            this.f8324a.mo7005a(str, str2, obj);
        }
    }
}
