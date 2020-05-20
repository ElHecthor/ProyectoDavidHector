package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import p147g.p156d.p157a.p167b.p173d.p178e.C3879a;

/* renamed from: com.google.android.gms.common.internal.s0 */
public abstract class C2149s0 extends C3879a implements C2151t0 {
    /* renamed from: a */
    public static C2151t0 m8848a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof C2151t0 ? (C2151t0) queryLocalInterface : new C2153u0(iBinder);
    }
}
