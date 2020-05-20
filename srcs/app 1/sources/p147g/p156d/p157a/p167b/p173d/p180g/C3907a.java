package p147g.p156d.p157a.p167b.p173d.p180g;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: g.d.a.b.d.g.a */
public class C3907a implements IInterface {

    /* renamed from: a */
    private final IBinder f10802a;

    /* renamed from: b */
    private final String f10803b;

    protected C3907a(IBinder iBinder, String str) {
        this.f10802a = iBinder;
        this.f10803b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo12050a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f10802a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f10802a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo12052b(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f10802a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Parcel mo12053t() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f10803b);
        return obtain;
    }
}
