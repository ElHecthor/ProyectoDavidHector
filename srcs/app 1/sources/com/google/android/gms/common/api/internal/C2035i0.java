package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C2078b;
import com.google.android.gms.common.api.C1981a.C1982a;
import com.google.android.gms.common.api.C2001f.C2002a;
import com.google.android.gms.common.api.C2001f.C2003b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C2109d;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.internal.C2152u;
import java.util.Set;
import p147g.p156d.p157a.p167b.p181e.C4318a;
import p147g.p156d.p157a.p167b.p181e.C4333d;
import p147g.p156d.p157a.p167b.p181e.C4334e;
import p147g.p156d.p157a.p167b.p181e.p182b.C4324e;
import p147g.p156d.p157a.p167b.p181e.p182b.C4331l;

/* renamed from: com.google.android.gms.common.api.internal.i0 */
public final class C2035i0 extends C4324e implements C2002a, C2003b {

    /* renamed from: h */
    private static C1982a<? extends C4334e, C4318a> f5913h = C4333d.f11497c;

    /* renamed from: a */
    private final Context f5914a;

    /* renamed from: b */
    private final Handler f5915b;

    /* renamed from: c */
    private final C1982a<? extends C4334e, C4318a> f5916c;

    /* renamed from: d */
    private Set<Scope> f5917d;

    /* renamed from: e */
    private C2109d f5918e;

    /* renamed from: f */
    private C4334e f5919f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C2037j0 f5920g;

    public C2035i0(Context context, Handler handler, C2109d dVar) {
        this(context, handler, dVar, f5913h);
    }

    public C2035i0(Context context, Handler handler, C2109d dVar, C1982a<? extends C4334e, C4318a> aVar) {
        this.f5914a = context;
        this.f5915b = handler;
        C2148s.m8835a(dVar, (Object) "ClientSettings must not be null");
        this.f5918e = dVar;
        this.f5917d = dVar.mo6873h();
        this.f5916c = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m8520b(C4331l lVar) {
        C2078b e = lVar.mo12993e();
        if (e.mo6781k()) {
            C2152u f = lVar.mo12994f();
            e = f.mo6944f();
            if (!e.mo6781k()) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
            } else {
                this.f5920g.mo6709a(f.mo6942e(), this.f5917d);
                this.f5919f.mo6606i();
            }
        }
        this.f5920g.mo6710b(e);
        this.f5919f.mo6606i();
    }

    /* renamed from: a */
    public final void mo6680a(int i) {
        this.f5919f.mo6606i();
    }

    /* renamed from: a */
    public final void mo6724a(C2037j0 j0Var) {
        C4334e eVar = this.f5919f;
        if (eVar != null) {
            eVar.mo6606i();
        }
        this.f5918e.mo6866a(Integer.valueOf(System.identityHashCode(this)));
        C1982a<? extends C4334e, C4318a> aVar = this.f5916c;
        Context context = this.f5914a;
        Looper looper = this.f5915b.getLooper();
        C2109d dVar = this.f5918e;
        this.f5919f = (C4334e) aVar.mo6594a(context, looper, dVar, dVar.mo6874i(), this, this);
        this.f5920g = j0Var;
        Set<Scope> set = this.f5917d;
        if (set == null || set.isEmpty()) {
            this.f5915b.post(new C2033h0(this));
        } else {
            this.f5919f.mo12979j();
        }
    }

    /* renamed from: a */
    public final void mo6695a(C2078b bVar) {
        this.f5920g.mo6710b(bVar);
    }

    /* renamed from: a */
    public final void mo6725a(C4331l lVar) {
        this.f5915b.post(new C2039k0(this, lVar));
    }

    /* renamed from: c */
    public final void mo6681c(Bundle bundle) {
        this.f5919f.mo12978a(this);
    }

    /* renamed from: t */
    public final void mo6726t() {
        C4334e eVar = this.f5919f;
        if (eVar != null) {
            eVar.mo6606i();
        }
    }
}
