package androidx.lifecycle;

import androidx.lifecycle.C0514h.C0515a;
import androidx.savedstate.C0758b;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistry.C0755a;

final class SavedStateHandleController implements C0521l {

    /* renamed from: f */
    private boolean f2197f;

    /* renamed from: g */
    private final C0543y f2198g;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$1 */
    final class C04931 implements C0521l {

        /* renamed from: f */
        final /* synthetic */ C0514h f2199f;

        /* renamed from: g */
        final /* synthetic */ SavedStateRegistry f2200g;

        /* renamed from: a */
        public void mo124a(C0523n nVar, C0515a aVar) {
            if (aVar == C0515a.ON_START) {
                this.f2199f.mo3038b(this);
                this.f2200g.mo4170a(C0494a.class);
            }
        }
    }

    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    static final class C0494a implements C0755a {
        C0494a() {
        }

        /* renamed from: a */
        public void mo2998a(C0758b bVar) {
            if (bVar instanceof C0510d0) {
                C0508c0 h = ((C0510d0) bVar).mo118h();
                SavedStateRegistry c = bVar.mo117c();
                for (String a : h.mo3021b()) {
                    SavedStateHandleController.m2683a(h.mo3018a(a), c, bVar.mo115a());
                }
                if (!h.mo3021b().isEmpty()) {
                    c.mo4170a(C0494a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    /* renamed from: a */
    static void m2683a(C0498a0 a0Var, SavedStateRegistry savedStateRegistry, C0514h hVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) a0Var.mo3005a("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.mo2997a()) {
            savedStateHandleController.mo2996a(savedStateRegistry, hVar);
            throw null;
        }
    }

    /* renamed from: a */
    public void mo124a(C0523n nVar, C0515a aVar) {
        if (aVar == C0515a.ON_DESTROY) {
            this.f2197f = false;
            nVar.mo115a().mo3038b(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2996a(SavedStateRegistry savedStateRegistry, C0514h hVar) {
        if (this.f2197f) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f2197f = true;
        hVar.mo3037a(this);
        this.f2198g.mo3085a();
        throw null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2997a() {
        return this.f2197f;
    }
}
