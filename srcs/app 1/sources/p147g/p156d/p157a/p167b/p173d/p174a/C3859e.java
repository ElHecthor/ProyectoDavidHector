package p147g.p156d.p157a.p167b.p173d.p174a;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: g.d.a.b.d.a.e */
public abstract class C3859e extends C3856b implements C3858d {
    /* renamed from: a */
    public static C3858d m15601a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof C3858d ? (C3858d) queryLocalInterface : new C3860f(iBinder);
    }
}
