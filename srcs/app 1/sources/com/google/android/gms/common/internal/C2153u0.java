package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C2211z;
import p147g.p156d.p157a.p167b.p172c.C3851a;
import p147g.p156d.p157a.p167b.p173d.p178e.C3880b;
import p147g.p156d.p157a.p167b.p173d.p178e.C3881c;

/* renamed from: com.google.android.gms.common.internal.u0 */
public final class C2153u0 extends C3880b implements C2151t0 {
    C2153u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: a */
    public final boolean mo6941a(C2211z zVar, C3851a aVar) {
        Parcel a = mo12028a();
        C3881c.m15635a(a, (Parcelable) zVar);
        C3881c.m15634a(a, (IInterface) aVar);
        Parcel a2 = mo12029a(5, a);
        boolean a3 = C3881c.m15637a(a2);
        a2.recycle();
        return a3;
    }
}
