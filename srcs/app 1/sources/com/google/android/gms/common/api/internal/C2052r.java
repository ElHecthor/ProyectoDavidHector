package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.C2078b;
import com.google.android.gms.common.internal.C2148s;
import p071f.p088e.C3164b;

/* renamed from: com.google.android.gms.common.api.internal.r */
public class C2052r extends C2055s0 {

    /* renamed from: k */
    private final C3164b<C2014b<?>> f5931k = new C3164b<>();

    /* renamed from: l */
    private C2025f f5932l;

    private C2052r(C2034i iVar) {
        super(iVar);
        this.f5838f.mo6672a("ConnectionlessLifecycleHelper", (LifecycleCallback) this);
    }

    /* renamed from: a */
    public static void m8550a(Activity activity, C2025f fVar, C2014b<?> bVar) {
        C2034i a = LifecycleCallback.m8384a(activity);
        C2052r rVar = (C2052r) a.mo6671a("ConnectionlessLifecycleHelper", C2052r.class);
        if (rVar == null) {
            rVar = new C2052r(a);
        }
        rVar.f5932l = fVar;
        C2148s.m8835a(bVar, (Object) "ApiKey cannot be null");
        rVar.f5931k.add(bVar);
        fVar.mo6685a(rVar);
    }

    /* renamed from: i */
    private final void m8551i() {
        if (!this.f5931k.isEmpty()) {
            this.f5932l.mo6685a(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6739a(C2078b bVar, int i) {
        this.f5932l.mo6686a(bVar, i);
    }

    /* renamed from: c */
    public void mo6647c() {
        super.mo6647c();
        m8551i();
    }

    /* renamed from: d */
    public void mo6648d() {
        super.mo6648d();
        m8551i();
    }

    /* renamed from: e */
    public void mo6649e() {
        super.mo6649e();
        this.f5932l.mo6688b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo6740f() {
        this.f5932l.mo6687b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final C3164b<C2014b<?>> mo6741h() {
        return this.f5931k;
    }
}
