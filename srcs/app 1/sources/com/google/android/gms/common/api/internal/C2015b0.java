package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.C2078b;
import com.google.android.gms.common.api.internal.C2025f.C2026a;

/* renamed from: com.google.android.gms.common.api.internal.b0 */
final class C2015b0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C2078b f5847f;

    /* renamed from: g */
    private final /* synthetic */ C2027b f5848g;

    C2015b0(C2027b bVar, C2078b bVar2) {
        this.f5848g = bVar;
        this.f5847f = bVar2;
    }

    public final void run() {
        C2026a aVar = (C2026a) C2025f.this.f5878i.get(this.f5848g.f5897b);
        if (aVar != null) {
            if (this.f5847f.mo6781k()) {
                this.f5848g.f5900e = true;
                if (this.f5848g.f5896a.mo6607k()) {
                    this.f5848g.m8492a();
                    return;
                }
                try {
                    this.f5848g.f5896a.mo6599a(null, this.f5848g.f5896a.mo6601b());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    aVar.mo6695a(new C2078b(10));
                }
            } else {
                aVar.mo6695a(this.f5847f);
            }
        }
    }
}
