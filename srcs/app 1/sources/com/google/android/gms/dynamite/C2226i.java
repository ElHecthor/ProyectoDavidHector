package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p147g.p156d.p157a.p167b.p172c.C3851a;
import p147g.p156d.p157a.p167b.p172c.C3851a.C3852a;
import p147g.p156d.p157a.p167b.p173d.p178e.C3880b;
import p147g.p156d.p157a.p167b.p173d.p178e.C3881c;

/* renamed from: com.google.android.gms.dynamite.i */
public final class C2226i extends C3880b implements C2227j {
    C2226i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: a */
    public final int mo6998a(C3851a aVar, String str, boolean z) {
        Parcel a = mo12028a();
        C3881c.m15634a(a, (IInterface) aVar);
        a.writeString(str);
        C3881c.m15636a(a, z);
        Parcel a2 = mo12029a(5, a);
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    /* renamed from: a */
    public final C3851a mo6999a(C3851a aVar, String str, int i) {
        Parcel a = mo12028a();
        C3881c.m15634a(a, (IInterface) aVar);
        a.writeString(str);
        a.writeInt(i);
        Parcel a2 = mo12029a(4, a);
        C3851a a3 = C3852a.m15591a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    /* renamed from: b */
    public final int mo7000b(C3851a aVar, String str, boolean z) {
        Parcel a = mo12028a();
        C3881c.m15634a(a, (IInterface) aVar);
        a.writeString(str);
        C3881c.m15636a(a, z);
        Parcel a2 = mo12029a(3, a);
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    /* renamed from: b */
    public final C3851a mo7001b(C3851a aVar, String str, int i) {
        Parcel a = mo12028a();
        C3881c.m15634a(a, (IInterface) aVar);
        a.writeString(str);
        a.writeInt(i);
        Parcel a2 = mo12029a(2, a);
        C3851a a3 = C3852a.m15591a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    /* renamed from: r */
    public final int mo7002r() {
        Parcel a = mo12029a(6, mo12028a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
