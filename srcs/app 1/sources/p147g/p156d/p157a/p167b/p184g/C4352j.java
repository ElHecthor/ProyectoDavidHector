package p147g.p156d.p157a.p167b.p184g;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: g.d.a.b.g.j */
public final class C4352j {

    /* renamed from: a */
    public static final Executor f11524a = new C4353a();

    /* renamed from: b */
    static final Executor f11525b = new C4342b0();

    /* renamed from: g.d.a.b.g.j$a */
    private static final class C4353a implements Executor {

        /* renamed from: f */
        private final Handler f11526f = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f11526f.post(runnable);
        }
    }
}
