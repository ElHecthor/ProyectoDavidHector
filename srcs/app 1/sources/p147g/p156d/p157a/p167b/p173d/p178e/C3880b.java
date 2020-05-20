package p147g.p156d.p157a.p167b.p173d.p178e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: g.d.a.b.d.e.b */
public class C3880b implements IInterface {

    /* renamed from: a */
    private final IBinder f10788a;

    /* renamed from: b */
    private final String f10789b;

    protected C3880b(IBinder iBinder, String str) {
        this.f10788a = iBinder;
        this.f10789b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo12028a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f10789b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo12029a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f10788a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f10788a;
    }
}
