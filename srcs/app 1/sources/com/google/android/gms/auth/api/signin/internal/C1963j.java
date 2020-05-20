package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.C1941a;
import com.google.android.gms.common.C2090i;
import com.google.android.gms.common.api.C2001f.C2002a;
import com.google.android.gms.common.api.C2001f.C2003b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C2109d;
import com.google.android.gms.common.internal.C2119h;
import p147g.p156d.p157a.p167b.p173d.p175b.C3861a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.j */
public final class C1963j extends C2119h<C1975v> {

    /* renamed from: z */
    private final GoogleSignInOptions f5785z;

    public C1963j(Context context, Looper looper, C2109d dVar, GoogleSignInOptions googleSignInOptions, C2002a aVar, C2003b bVar) {
        C1941a aVar2;
        super(context, looper, 91, dVar, aVar, bVar);
        if (googleSignInOptions != null) {
            aVar2 = new C1941a(googleSignInOptions);
        } else {
            aVar2 = new C1941a();
        }
        aVar2.mo6507b(C3861a.m15605a());
        if (!dVar.mo6869d().isEmpty()) {
            for (Scope a : dVar.mo6869d()) {
                aVar2.mo6503a(a, new Scope[0]);
            }
        }
        this.f5785z = aVar2.mo6505a();
    }

    /* renamed from: B */
    public final GoogleSignInOptions mo6553B() {
        return this.f5785z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo6554a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof C1975v ? (C1975v) queryLocalInterface : new C1974u(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo6555c() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    /* renamed from: e */
    public final int mo6556e() {
        return C2090i.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final String mo6557l() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
