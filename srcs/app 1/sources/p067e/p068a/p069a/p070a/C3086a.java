package p067e.p068a.p069a.p070a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e.a.a.a.a */
public interface C3086a extends IInterface {

    /* renamed from: e.a.a.a.a$a */
    public static abstract class C3087a extends Binder implements C3086a {

        /* renamed from: e.a.a.a.a$a$a */
        private static class C3088a implements C3086a {

            /* renamed from: a */
            private IBinder f8751a;

            C3088a(IBinder iBinder) {
                this.f8751a = iBinder;
            }

            public IBinder asBinder() {
                return this.f8751a;
            }

            /* renamed from: b */
            public void mo9907b(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f8751a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C3087a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: a */
        public static C3086a m12549a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C3086a)) ? new C3088a(iBinder) : (C3086a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = "android.support.v4.os.IResultReceiver";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo9907b(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    /* renamed from: b */
    void mo9907b(int i, Bundle bundle);
}
