package p147g.p156d.p157a.p167b.p173d.p180g;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: g.d.a.b.d.g.gd */
public final class C4025gd extends C3907a implements C3992ed {
    C4025gd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: a */
    public final int mo12316a() {
        Parcel a = mo12050a(2, mo12053t());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: a */
    public final void mo12317a(String str, String str2, Bundle bundle, long j) {
        Parcel t = mo12053t();
        t.writeString(str);
        t.writeString(str2);
        C4229u.m17243a(t, (Parcelable) bundle);
        t.writeLong(j);
        mo12052b(1, t);
    }
}
