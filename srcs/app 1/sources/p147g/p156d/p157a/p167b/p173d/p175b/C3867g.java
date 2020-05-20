package p147g.p156d.p157a.p167b.p173d.p175b;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C2001f.C2002a;
import com.google.android.gms.common.api.C2001f.C2003b;
import com.google.android.gms.common.internal.C2109d;
import com.google.android.gms.common.internal.C2119h;
import p147g.p156d.p157a.p167b.p168a.p169a.C3840a.C3841a;
import p147g.p156d.p157a.p167b.p168a.p169a.C3840a.C3841a.C3842a;

/* renamed from: g.d.a.b.d.b.g */
public final class C3867g extends C2119h<C3869i> {

    /* renamed from: z */
    private final C3841a f10783z;

    public C3867g(Context context, Looper looper, C2109d dVar, C3841a aVar, C2002a aVar2, C2003b bVar) {
        super(context, looper, 68, dVar, aVar2, bVar);
        if (aVar == null) {
            aVar = C3841a.f10766i;
        }
        C3842a aVar3 = new C3842a(aVar);
        aVar3.mo12005a(C3861a.m15605a());
        this.f10783z = aVar3.mo12006a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo6554a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof C3869i ? (C3869i) queryLocalInterface : new C3868h(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo6555c() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* renamed from: e */
    public final int mo6556e() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final String mo6557l() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Bundle mo6843t() {
        return this.f10783z.mo12002a();
    }
}
