package com.google.android.youtube.player.p055e;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.youtube.player.e.e */
public interface C2820e extends IInterface {

    /* renamed from: com.google.android.youtube.player.e.e$a */
    public static abstract class C2821a extends Binder implements C2820e {
        public C2821a() {
            attachInterface(this, "com.google.android.youtube.player.internal.IConnectionCallbacks");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = "com.google.android.youtube.player.internal.IConnectionCallbacks";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo9443a(parcel.readString(), parcel.readStrongBinder());
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    /* renamed from: a */
    void mo9443a(String str, IBinder iBinder);
}
