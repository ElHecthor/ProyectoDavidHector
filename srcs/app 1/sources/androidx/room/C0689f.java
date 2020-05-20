package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: androidx.room.f */
public interface C0689f extends IInterface {

    /* renamed from: androidx.room.f$a */
    public static abstract class C0690a extends Binder implements C0689f {

        /* renamed from: androidx.room.f$a$a */
        private static class C0691a implements C0689f {

            /* renamed from: a */
            private IBinder f2755a;

            C0691a(IBinder iBinder) {
                this.f2755a = iBinder;
            }

            /* renamed from: a */
            public void mo4024a(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f2755a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f2755a;
            }
        }

        public C0690a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* renamed from: a */
        public static C0689f m3908a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0689f)) ? new C0691a(iBinder) : (C0689f) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = "androidx.room.IMultiInstanceInvalidationCallback";
            if (i == 1) {
                parcel.enforceInterface(str);
                mo4024a(parcel.createStringArray());
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
    void mo4024a(String[] strArr);
}
