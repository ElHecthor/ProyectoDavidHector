package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C2090i;
import com.google.android.gms.common.internal.C2095c;
import com.google.android.gms.common.internal.C2095c.C2096a;
import com.google.android.gms.common.internal.C2095c.C2097b;

/* renamed from: com.google.android.gms.measurement.internal.z3 */
public final class C2527z3 extends C2095c<C2428q3> {
    public C2527z3(Context context, Looper looper, C2096a aVar, C2097b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo6554a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof C2428q3 ? (C2428q3) queryLocalInterface : new C2450s3(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo6555c() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* renamed from: e */
    public final int mo6556e() {
        return C2090i.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final String mo6557l() {
        return "com.google.android.gms.measurement.START";
    }
}
