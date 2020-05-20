package p147g.p156d.p157a.p167b.p173d.p180g;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: g.d.a.b.d.g.cd */
public abstract class C3956cd extends C4075k1 implements C4317zc {
    public C3956cd() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7623a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        mo12121a((Bundle) C4229u.m17241a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
