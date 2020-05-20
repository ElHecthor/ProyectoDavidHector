package p147g.p156d.p157a.p167b.p173d.p180g;

import android.os.Binder;

/* renamed from: g.d.a.b.d.g.u1 */
public final /* synthetic */ class C4231u1 {
    /* renamed from: a */
    public static <V> V m17248a(C4211t1<V> t1Var) {
        long clearCallingIdentity;
        try {
            return t1Var.mo12718a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a = t1Var.mo12718a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
