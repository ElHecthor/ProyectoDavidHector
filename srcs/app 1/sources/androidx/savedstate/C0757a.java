package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C0514h;
import androidx.lifecycle.C0514h.C0516b;

/* renamed from: androidx.savedstate.a */
public final class C0757a {

    /* renamed from: a */
    private final C0758b f2955a;

    /* renamed from: b */
    private final SavedStateRegistry f2956b = new SavedStateRegistry();

    private C0757a(C0758b bVar) {
        this.f2955a = bVar;
    }

    /* renamed from: a */
    public static C0757a m4087a(C0758b bVar) {
        return new C0757a(bVar);
    }

    /* renamed from: a */
    public SavedStateRegistry mo4172a() {
        return this.f2956b;
    }

    /* renamed from: a */
    public void mo4173a(Bundle bundle) {
        C0514h a = this.f2955a.mo115a();
        if (a.mo3036a() == C0516b.INITIALIZED) {
            a.mo3037a(new Recreator(this.f2955a));
            this.f2956b.mo4169a(a, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: b */
    public void mo4174b(Bundle bundle) {
        this.f2956b.mo4168a(bundle);
    }
}
