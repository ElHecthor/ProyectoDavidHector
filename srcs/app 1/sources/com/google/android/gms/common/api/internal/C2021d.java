package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C1981a;
import com.google.android.gms.common.api.C1981a.C1983b;
import com.google.android.gms.common.api.C2001f;
import com.google.android.gms.common.api.C2071k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.internal.C2154v;

/* renamed from: com.google.android.gms.common.api.internal.d */
public abstract class C2021d<R extends C2071k, A extends C1983b> extends BasePendingResult<R> {
    protected C2021d(C1981a<?> aVar, C2001f fVar) {
        C2148s.m8835a(fVar, (Object) "GoogleApiClient must not be null");
        super(fVar);
        C2148s.m8835a(aVar, (Object) "Api must not be null");
        aVar.mo6591a();
    }

    /* renamed from: a */
    private void m8421a(RemoteException remoteException) {
        mo6676c(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6559a(A a);

    /* renamed from: b */
    public final void mo6674b(A a) {
        if (a instanceof C2154v) {
            a = ((C2154v) a).mo6553B();
        }
        try {
            mo6559a(a);
        } catch (DeadObjectException e) {
            m8421a((RemoteException) e);
            throw e;
        } catch (RemoteException e2) {
            m8421a(e2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6675b(R r) {
    }

    /* renamed from: c */
    public final void mo6676c(Status status) {
        C2148s.m8842a(!status.mo6586h(), (Object) "Failed result must not be success");
        C2071k a = mo6558a(status);
        mo6634a(a);
        mo6675b((R) a);
    }
}
