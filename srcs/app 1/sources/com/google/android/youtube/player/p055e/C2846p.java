package com.google.android.youtube.player.p055e;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.youtube.player.e.p */
public interface C2846p extends IInterface {

    /* renamed from: com.google.android.youtube.player.e.p$a */
    public static abstract class C2847a extends Binder implements C2846p {

        /* renamed from: com.google.android.youtube.player.e.p$a$a */
        private static class C2848a implements C2846p {

            /* renamed from: a */
            private IBinder f8300a;

            C2848a(IBinder iBinder) {
                this.f8300a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f8300a;
            }
        }

        public C2847a() {
            attachInterface(this, "com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
        }

        /* renamed from: a */
        public static C2846p m11837a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2846p)) ? new C2848a(iBinder) : (C2846p) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            return true;
        }
    }
}
