package p147g.p156d.p157a.p167b.p173d.p180g;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: g.d.a.b.d.g.dd */
public abstract class C3976dd extends C4075k1 implements C3992ed {
    public C3976dd() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7623a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo12317a(parcel.readString(), parcel.readString(), (Bundle) C4229u.m17241a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int a = mo12316a();
            parcel2.writeNoException();
            parcel2.writeInt(a);
        }
        return true;
    }
}
