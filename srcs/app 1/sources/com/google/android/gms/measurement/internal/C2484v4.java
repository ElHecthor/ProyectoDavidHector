package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.internal.C2148s;

/* renamed from: com.google.android.gms.measurement.internal.v4 */
public final class C2484v4 {

    /* renamed from: a */
    private final C2517y4 f7019a;

    public C2484v4(C2517y4 y4Var) {
        C2148s.m8834a(y4Var);
        this.f7019a = y4Var;
    }

    /* renamed from: a */
    public static boolean m9997a(Context context) {
        C2148s.m8834a(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ActivityInfo receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public final void mo7675a(Context context, Intent intent) {
        C2263c5 a = C2263c5.m9228a(context, null, null);
        C2516y3 j = a.mo7098j();
        if (intent == null) {
            j.mo7818w().mo7088a("Receiver called with null intent");
            return;
        }
        a.mo7094f();
        String action = intent.getAction();
        j.mo7810B().mo7089a("Local receiver got", action);
        String str = "com.google.android.gms.measurement.UPLOAD";
        if (str.equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction(str);
            j.mo7810B().mo7088a("Starting wakeful intent.");
            this.f7019a.mo7036a(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            j.mo7818w().mo7088a("Install Referrer Broadcasts are deprecated");
        }
    }
}
