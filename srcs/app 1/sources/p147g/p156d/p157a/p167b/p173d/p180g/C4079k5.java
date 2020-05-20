package p147g.p156d.p157a.p167b.p173d.p180g;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: g.d.a.b.d.g.k5 */
public abstract class C4079k5 extends C4075k1 implements C4091l2 {
    /* renamed from: a */
    public static C4091l2 m16700a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof C4091l2 ? (C4091l2) queryLocalInterface : new C4078k4(iBinder);
    }
}
