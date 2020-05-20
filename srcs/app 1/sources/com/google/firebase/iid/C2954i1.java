package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;

/* renamed from: com.google.firebase.iid.i1 */
public final class C2954i1 implements C2957j1 {

    /* renamed from: a */
    private final IBinder f8500a;

    C2954i1(IBinder iBinder) {
        this.f8500a = iBinder;
    }

    /* renamed from: a */
    public final void mo9667a(Message message) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        obtain.writeInt(1);
        message.writeToParcel(obtain, 0);
        try {
            this.f8500a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f8500a;
    }
}
