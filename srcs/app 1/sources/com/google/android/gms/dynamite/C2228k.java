package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p147g.p156d.p157a.p167b.p172c.C3851a;
import p147g.p156d.p157a.p167b.p172c.C3851a.C3852a;
import p147g.p156d.p157a.p167b.p173d.p178e.C3880b;
import p147g.p156d.p157a.p167b.p173d.p178e.C3881c;

/* renamed from: com.google.android.gms.dynamite.k */
public final class C2228k extends C3880b implements C2229l {
    C2228k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: a */
    public final C3851a mo7003a(C3851a aVar, String str, int i, C3851a aVar2) {
        Parcel a = mo12028a();
        C3881c.m15634a(a, (IInterface) aVar);
        a.writeString(str);
        a.writeInt(i);
        C3881c.m15634a(a, (IInterface) aVar2);
        Parcel a2 = mo12029a(2, a);
        C3851a a3 = C3852a.m15591a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    /* renamed from: b */
    public final C3851a mo7004b(C3851a aVar, String str, int i, C3851a aVar2) {
        Parcel a = mo12028a();
        C3881c.m15634a(a, (IInterface) aVar);
        a.writeString(str);
        a.writeInt(i);
        C3881c.m15634a(a, (IInterface) aVar2);
        Parcel a2 = mo12029a(3, a);
        C3851a a3 = C3852a.m15591a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
