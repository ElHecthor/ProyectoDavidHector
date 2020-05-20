package com.google.android.youtube.player.p055e;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.youtube.player.e.g */
public interface C2825g extends IInterface {

    /* renamed from: com.google.android.youtube.player.e.g$a */
    public static abstract class C2826a extends Binder implements C2825g {

        /* renamed from: com.google.android.youtube.player.e.g$a$a */
        private static class C2827a implements C2825g {

            /* renamed from: a */
            private IBinder f8271a;

            C2827a(IBinder iBinder) {
                this.f8271a = iBinder;
            }

            /* renamed from: a */
            public final void mo9462a(C2820e eVar, int i, String str, String str2, String str3, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IServiceBroker");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f8271a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f8271a;
            }
        }

        /* renamed from: a */
        public static C2825g m11771a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IServiceBroker");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2825g)) ? new C2827a(iBinder) : (C2825g) queryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo9462a(C2820e eVar, int i, String str, String str2, String str3, Bundle bundle);
}
