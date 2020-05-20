package p147g.p156d.p157a.p167b.p173d.p175b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: g.d.a.b.d.b.d */
public class C3864d implements IInterface {

    /* renamed from: a */
    private final IBinder f10781a;

    /* renamed from: b */
    private final String f10782b;

    protected C3864d(IBinder iBinder, String str) {
        this.f10781a = iBinder;
        this.f10782b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12015a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f10781a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f10781a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Parcel mo12017t() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f10782b);
        return obtain;
    }
}
