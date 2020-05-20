package p147g.p156d.p157a.p167b.p173d.p177d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: g.d.a.b.d.d.b */
public class C3876b implements IInterface {

    /* renamed from: a */
    private final IBinder f10786a;

    /* renamed from: b */
    private final String f10787b;

    protected C3876b(IBinder iBinder, String str) {
        this.f10786a = iBinder;
        this.f10787b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12022a(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f10786a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f10786a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Parcel mo12024t() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f10787b);
        return obtain;
    }
}
