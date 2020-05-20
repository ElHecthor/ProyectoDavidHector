package com.bumptech.glide.load.p007o;

import com.bumptech.glide.p029t.C1309j;
import com.bumptech.glide.p029t.p030l.C1312a;
import com.bumptech.glide.p029t.p030l.C1312a.C1316d;
import com.bumptech.glide.p029t.p030l.C1312a.C1318f;
import com.bumptech.glide.p029t.p030l.C1321c;
import p071f.p097h.p107l.C3318e;

/* renamed from: com.bumptech.glide.load.o.u */
final class C1018u<Z> implements C1020v<Z>, C1318f {

    /* renamed from: j */
    private static final C3318e<C1018u<?>> f3728j = C1312a.m6176a(20, (C1316d<T>) new C1019a<T>());

    /* renamed from: f */
    private final C1321c f3729f = C1321c.m6194b();

    /* renamed from: g */
    private C1020v<Z> f3730g;

    /* renamed from: h */
    private boolean f3731h;

    /* renamed from: i */
    private boolean f3732i;

    /* renamed from: com.bumptech.glide.load.o.u$a */
    class C1019a implements C1316d<C1018u<?>> {
        C1019a() {
        }

        /* renamed from: a */
        public C1018u<?> m5071a() {
            return new C1018u<>();
        }
    }

    C1018u() {
    }

    /* renamed from: a */
    private void m5062a(C1020v<Z> vVar) {
        this.f3732i = false;
        this.f3731h = true;
        this.f3730g = vVar;
    }

    /* renamed from: b */
    static <Z> C1018u<Z> m5063b(C1020v<Z> vVar) {
        C1018u<Z> uVar = (C1018u) f3728j.mo5387a();
        C1309j.m6149a(uVar);
        C1018u<Z> uVar2 = uVar;
        uVar2.m5062a(vVar);
        return uVar2;
    }

    /* renamed from: e */
    private void m5064e() {
        this.f3730g = null;
        f3728j.mo5388a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo4908a() {
        this.f3729f.mo5389a();
        if (this.f3731h) {
            this.f3731h = false;
            if (this.f3732i) {
                mo4882d();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    /* renamed from: b */
    public int mo4880b() {
        return this.f3730g.mo4880b();
    }

    /* renamed from: c */
    public Class<Z> mo4881c() {
        return this.f3730g.mo4881c();
    }

    /* renamed from: d */
    public synchronized void mo4882d() {
        this.f3729f.mo5389a();
        this.f3732i = true;
        if (!this.f3731h) {
            this.f3730g.mo4882d();
            m5064e();
        }
    }

    /* renamed from: g */
    public C1321c mo4765g() {
        return this.f3729f;
    }

    public Z get() {
        return this.f3730g.get();
    }
}
