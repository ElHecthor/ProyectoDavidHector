package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.C2001f;
import com.google.android.gms.common.api.internal.C2042m;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p071f.p126p.p128b.C3462a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.h */
public final class C1961h extends C3462a<Void> implements C2042m {

    /* renamed from: o */
    private Semaphore f5782o = new Semaphore(0);

    /* renamed from: p */
    private Set<C2001f> f5783p;

    public C1961h(Context context, Set<C2001f> set) {
        super(context);
        this.f5783p = set;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final Void mo6552t() {
        Iterator it = this.f5783p.iterator();
        if (!it.hasNext()) {
            try {
                this.f5782o.tryAcquire(0, 5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
                Thread.currentThread().interrupt();
            }
            return null;
        }
        ((C2001f) it.next()).mo6628a((C2042m) this);
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo6551l() {
        this.f5782o.drainPermits();
        mo11060e();
    }
}
