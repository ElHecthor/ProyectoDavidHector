package p147g.p156d.p157a.p167b.p173d.p174a;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: g.d.a.b.d.a.f */
public final class C3860f extends C3855a implements C3858d {
    C3860f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: b */
    public final boolean mo12010b(boolean z) {
        Parcel t = mo12009t();
        C3857c.m15596a(t, true);
        Parcel a = mo12007a(2, t);
        boolean a2 = C3857c.m15597a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: c */
    public final boolean mo12011c() {
        Parcel a = mo12007a(6, mo12009t());
        boolean a2 = C3857c.m15597a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: d */
    public final String mo12012d() {
        Parcel a = mo12007a(1, mo12009t());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
