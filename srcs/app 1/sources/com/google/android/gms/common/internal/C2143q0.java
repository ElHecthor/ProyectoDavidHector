package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import p147g.p156d.p157a.p167b.p172c.C3851a;
import p147g.p156d.p157a.p167b.p172c.C3851a.C3852a;
import p147g.p156d.p157a.p167b.p173d.p178e.C3880b;

/* renamed from: com.google.android.gms.common.internal.q0 */
public final class C2143q0 extends C3880b implements C2140p0 {
    C2143q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: b */
    public final C3851a mo6933b() {
        Parcel a = mo12029a(1, mo12028a());
        C3851a a2 = C3852a.m15591a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final int mo6934c() {
        Parcel a = mo12029a(2, mo12028a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
