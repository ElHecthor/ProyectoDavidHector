package p147g.p156d.p157a.p167b.p173d.p176c;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.C2090i;
import com.google.android.gms.common.api.C2001f.C2002a;
import com.google.android.gms.common.api.C2001f.C2003b;
import com.google.android.gms.common.internal.C2109d;
import com.google.android.gms.common.internal.C2119h;
import p147g.p156d.p157a.p167b.p168a.p169a.C3843b;
import p147g.p156d.p157a.p167b.p168a.p169a.C3844c;

/* renamed from: g.d.a.b.d.c.b */
public final class C3871b extends C2119h<C3872c> {

    /* renamed from: z */
    private final Bundle f10785z;

    public C3871b(Context context, Looper looper, C2109d dVar, C3844c cVar, C2002a aVar, C2003b bVar) {
        super(context, looper, 16, dVar, aVar, bVar);
        if (cVar == null) {
            this.f10785z = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo6554a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof C3872c ? (C3872c) queryLocalInterface : new C3873d(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo6555c() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    /* renamed from: e */
    public final int mo6556e() {
        return C2090i.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* renamed from: k */
    public final boolean mo6835k() {
        C2109d A = mo6885A();
        return !TextUtils.isEmpty(A.mo6867b()) && !A.mo6865a(C3843b.f10775c).isEmpty();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final String mo6557l() {
        return "com.google.android.gms.auth.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Bundle mo6843t() {
        return this.f10785z;
    }
}
