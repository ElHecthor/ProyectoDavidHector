package android.support.p001v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.v4.media.session.b */
public interface C0023b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    public static abstract class C0024a extends Binder implements C0023b {

        /* renamed from: android.support.v4.media.session.b$a$a */
        private static class C0025a implements C0023b {

            /* renamed from: a */
            private IBinder f65a;

            C0025a(IBinder iBinder) {
                this.f65a = iBinder;
            }

            /* renamed from: a */
            public void mo87a(C0021a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f65a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f65a;
            }
        }

        /* renamed from: a */
        public static C0023b m74a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0023b)) ? new C0025a(iBinder) : (C0023b) queryLocalInterface;
        }
    }

    /* renamed from: a */
    void mo87a(C0021a aVar);
}
