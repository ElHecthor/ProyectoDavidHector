package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.lifecycle.h */
public abstract class C0514h {

    /* renamed from: androidx.lifecycle.h$a */
    public enum C0515a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: androidx.lifecycle.h$b */
    public enum C0516b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean mo3039a(C0516b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    public C0514h() {
        new AtomicReference();
    }

    /* renamed from: a */
    public abstract C0516b mo3036a();

    /* renamed from: a */
    public abstract void mo3037a(C0522m mVar);

    /* renamed from: b */
    public abstract void mo3038b(C0522m mVar);
}
