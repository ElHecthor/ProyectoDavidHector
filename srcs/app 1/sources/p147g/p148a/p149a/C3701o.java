package p147g.p148a.p149a;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: g.a.a.o */
public class C3701o extends HandlerThread {

    /* renamed from: f */
    private Handler f10487f;

    public C3701o(String str) {
        super(str);
    }

    /* renamed from: a */
    private synchronized void m15140a() {
        if (this.f10487f == null) {
            this.f10487f = new Handler(getLooper());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11776a(Runnable runnable) {
        m15140a();
        this.f10487f.post(runnable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11777a(Runnable runnable, long j) {
        m15140a();
        this.f10487f.postDelayed(runnable, j);
    }
}
