package p147g.p156d.p157a.p167b.p184g;

import java.util.concurrent.Callable;

/* renamed from: g.d.a.b.g.d0 */
final class C4346d0 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ C4344c0 f11521f;

    /* renamed from: g */
    private final /* synthetic */ Callable f11522g;

    C4346d0(C4344c0 c0Var, Callable callable) {
        this.f11521f = c0Var;
        this.f11522g = callable;
    }

    public final void run() {
        try {
            this.f11521f.mo13014a(this.f11522g.call());
        } catch (Exception e) {
            this.f11521f.mo13013a(e);
        }
    }
}
