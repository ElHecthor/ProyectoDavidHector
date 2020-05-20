package p147g.p156d.p157a.p167b.p173d.p180g;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.measurement.internal.C2324h6;

/* renamed from: g.d.a.b.d.g.v */
final class C4243v extends C3958a {

    /* renamed from: j */
    private final /* synthetic */ C2324h6 f11349j;

    /* renamed from: k */
    private final /* synthetic */ C3957d f11350k;

    C4243v(C3957d dVar, C2324h6 h6Var) {
        this.f11350k = dVar;
        this.f11349j = h6Var;
        super(dVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12054a() {
        for (int i = 0; i < this.f11350k.f10890d.size(); i++) {
            if (this.f11349j.equals(((Pair) this.f11350k.f10890d.get(i)).first)) {
                Log.w(this.f11350k.f10887a, "OnEventListener already registered.");
                return;
            }
        }
        C3959b bVar = new C3959b(this.f11349j);
        this.f11350k.f10890d.add(new Pair(this.f11349j, bVar));
        this.f11350k.f10893g.registerOnMeasurementEventListener(bVar);
    }
}
