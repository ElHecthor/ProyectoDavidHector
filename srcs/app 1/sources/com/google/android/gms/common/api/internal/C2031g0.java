package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C2025f.C2026a;
import com.google.android.gms.common.util.C2197l;

/* renamed from: com.google.android.gms.common.api.internal.g0 */
public abstract class C2031g0 {
    public C2031g0(int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static Status m8505a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (C2197l.m8999b() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    /* renamed from: a */
    public abstract void mo6714a(Status status);

    /* renamed from: a */
    public abstract void mo6715a(C2026a<?> aVar);

    /* renamed from: a */
    public abstract void mo6716a(C2067y0 y0Var, boolean z);

    /* renamed from: a */
    public abstract void mo6717a(RuntimeException runtimeException);
}
