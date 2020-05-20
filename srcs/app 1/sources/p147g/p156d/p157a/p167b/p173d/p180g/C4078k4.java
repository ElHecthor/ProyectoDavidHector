package p147g.p156d.p157a.p167b.p173d.p180g;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: g.d.a.b.d.g.k4 */
public final class C4078k4 extends C3907a implements C4091l2 {
    C4078k4(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: a */
    public final Bundle mo12594a(Bundle bundle) {
        Parcel t = mo12053t();
        C4229u.m17243a(t, (Parcelable) bundle);
        Parcel a = mo12050a(1, t);
        Bundle bundle2 = (Bundle) C4229u.m17241a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }
}
