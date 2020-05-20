package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C1995b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C2025f.C2026a;
import p147g.p156d.p157a.p167b.p184g.C4351i;

/* renamed from: com.google.android.gms.common.api.internal.p0 */
abstract class C2049p0<T> extends C2058u {

    /* renamed from: a */
    protected final C4351i<T> f5927a;

    public C2049p0(int i, C4351i<T> iVar) {
        super(i);
        this.f5927a = iVar;
    }

    /* renamed from: a */
    public void mo6714a(Status status) {
        this.f5927a.mo13028b((Exception) new C1995b(status));
    }

    /* renamed from: a */
    public final void mo6715a(C2026a<?> aVar) {
        try {
            mo6736d(aVar);
        } catch (DeadObjectException e) {
            mo6714a(C2031g0.m8505a((RemoteException) e));
            throw e;
        } catch (RemoteException e2) {
            mo6714a(C2031g0.m8505a(e2));
        } catch (RuntimeException e3) {
            mo6717a(e3);
        }
    }

    /* renamed from: a */
    public void mo6717a(RuntimeException runtimeException) {
        this.f5927a.mo13028b((Exception) runtimeException);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo6736d(C2026a<?> aVar);
}
