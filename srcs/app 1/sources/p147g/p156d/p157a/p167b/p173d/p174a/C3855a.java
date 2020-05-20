package p147g.p156d.p157a.p167b.p173d.p174a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: g.d.a.b.d.a.a */
public class C3855a implements IInterface {

    /* renamed from: a */
    private final IBinder f10778a;

    /* renamed from: b */
    private final String f10779b;

    protected C3855a(IBinder iBinder, String str) {
        this.f10778a = iBinder;
        this.f10779b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo12007a(int i, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f10778a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f10778a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Parcel mo12009t() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f10779b);
        return obtain;
    }
}
