package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import p071f.p133t.p134a.C3545f;

/* renamed from: androidx.room.t */
public abstract class C0736t {

    /* renamed from: a */
    private final AtomicBoolean f2900a = new AtomicBoolean(false);

    /* renamed from: b */
    private final C0711l f2901b;

    /* renamed from: c */
    private volatile C3545f f2902c;

    public C0736t(C0711l lVar) {
        this.f2901b = lVar;
    }

    /* renamed from: a */
    private C3545f m4038a(boolean z) {
        if (!z) {
            return m4039d();
        }
        if (this.f2902c == null) {
            this.f2902c = m4039d();
        }
        return this.f2902c;
    }

    /* renamed from: d */
    private C3545f m4039d() {
        return this.f2901b.mo4064a(mo4129c());
    }

    /* renamed from: a */
    public C3545f mo4126a() {
        mo4128b();
        return m4038a(this.f2900a.compareAndSet(false, true));
    }

    /* renamed from: a */
    public void mo4127a(C3545f fVar) {
        if (fVar == this.f2902c) {
            this.f2900a.set(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4128b() {
        this.f2901b.mo4065a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo4129c();
}
