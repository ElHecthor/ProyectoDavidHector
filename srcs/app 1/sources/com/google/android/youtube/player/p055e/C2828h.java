package com.google.android.youtube.player.p055e;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.youtube.player.e.h */
public interface C2828h extends IInterface {

    /* renamed from: com.google.android.youtube.player.e.h$a */
    public static abstract class C2829a extends Binder implements C2828h {

        /* renamed from: com.google.android.youtube.player.e.h$a$a */
        private static class C2830a implements C2828h {

            /* renamed from: a */
            private IBinder f8272a;

            C2830a(IBinder iBinder) {
                this.f8272a = iBinder;
            }

            /* renamed from: a */
            public final void mo9464a(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f8272a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f8272a;
            }

            /* renamed from: e */
            public final IBinder mo9465e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IYouTubeService");
                    this.f8272a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static C2828h m11775a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IYouTubeService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2828h)) ? new C2830a(iBinder) : (C2828h) queryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo9464a(boolean z);

    /* renamed from: e */
    IBinder mo9465e();
}
