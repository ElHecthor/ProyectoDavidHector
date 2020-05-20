package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0636h.C0640d;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: androidx.recyclerview.widget.c */
public final class C0613c<T> {

    /* renamed from: a */
    private final Executor f2518a;

    /* renamed from: b */
    private final Executor f2519b;

    /* renamed from: c */
    private final C0640d<T> f2520c;

    /* renamed from: androidx.recyclerview.widget.c$a */
    public static final class C0614a<T> {

        /* renamed from: d */
        private static final Object f2521d = new Object();

        /* renamed from: e */
        private static Executor f2522e;

        /* renamed from: a */
        private Executor f2523a;

        /* renamed from: b */
        private Executor f2524b;

        /* renamed from: c */
        private final C0640d<T> f2525c;

        public C0614a(C0640d<T> dVar) {
            this.f2525c = dVar;
        }

        /* renamed from: a */
        public C0613c<T> mo3817a() {
            if (this.f2524b == null) {
                synchronized (f2521d) {
                    if (f2522e == null) {
                        f2522e = Executors.newFixedThreadPool(2);
                    }
                }
                this.f2524b = f2522e;
            }
            return new C0613c<>(this.f2523a, this.f2524b, this.f2525c);
        }
    }

    C0613c(Executor executor, Executor executor2, C0640d<T> dVar) {
        this.f2518a = executor;
        this.f2519b = executor2;
        this.f2520c = dVar;
    }

    /* renamed from: a */
    public Executor mo3814a() {
        return this.f2519b;
    }

    /* renamed from: b */
    public C0640d<T> mo3815b() {
        return this.f2520c;
    }

    /* renamed from: c */
    public Executor mo3816c() {
        return this.f2518a;
    }
}
