package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p147g.p156d.p157a.p167b.p172c.C3851a;
import p147g.p156d.p157a.p167b.p173d.p178e.C3879a;
import p147g.p156d.p157a.p167b.p173d.p178e.C3881c;

/* renamed from: com.google.android.gms.common.internal.r0 */
public abstract class C2147r0 extends C3879a implements C2140p0 {
    public C2147r0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: a */
    public static C2140p0 m8831a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof C2140p0 ? (C2140p0) queryLocalInterface : new C2143q0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo6913a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C3851a b = mo6933b();
            parcel2.writeNoException();
            C3881c.m15634a(parcel2, (IInterface) b);
        } else if (i != 2) {
            return false;
        } else {
            int c = mo6934c();
            parcel2.writeNoException();
            parcel2.writeInt(c);
        }
        return true;
    }
}
