package p147g.p156d.p157a.p167b.p181e.p182b;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p147g.p156d.p157a.p167b.p173d.p177d.C3876b;
import p147g.p156d.p157a.p167b.p173d.p177d.C3877c;

/* renamed from: g.d.a.b.e.b.h */
public final class C4327h extends C3876b implements C4325f {
    C4327h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void mo12987a(C4329j jVar, C4323d dVar) {
        Parcel t = mo12024t();
        C3877c.m15629a(t, (Parcelable) jVar);
        C3877c.m15628a(t, (IInterface) dVar);
        mo12022a(12, t);
    }
}
