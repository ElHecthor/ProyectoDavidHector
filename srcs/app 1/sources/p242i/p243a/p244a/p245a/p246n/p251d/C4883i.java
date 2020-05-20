package p242i.p243a.p244a.p245a.p246n.p251d;

import android.content.Context;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;

/* renamed from: i.a.a.a.n.d.i */
public class C4883i implements Runnable {

    /* renamed from: f */
    private final Context f12712f;

    /* renamed from: g */
    private final C4879e f12713g;

    public C4883i(Context context, C4879e eVar) {
        this.f12712f = context;
        this.f12713g = eVar;
    }

    public void run() {
        try {
            C4813i.m19379c(this.f12712f, "Performing time based file roll over.");
            if (!this.f12713g.mo5453b()) {
                this.f12713g.mo5454c();
            }
        } catch (Exception e) {
            C4813i.m19364a(this.f12712f, "Failed to roll over file", (Throwable) e);
        }
    }
}
