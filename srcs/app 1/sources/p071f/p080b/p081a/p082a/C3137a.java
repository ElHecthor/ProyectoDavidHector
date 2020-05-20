package p071f.p080b.p081a.p082a;

import java.util.concurrent.Executor;

/* renamed from: f.b.a.a.a */
public class C3137a extends C3142c {

    /* renamed from: c */
    private static volatile C3137a f8904c;

    /* renamed from: d */
    private static final Executor f8905d = new C3138a();

    /* renamed from: e */
    private static final Executor f8906e = new C3139b();

    /* renamed from: a */
    private C3142c f8907a;

    /* renamed from: b */
    private C3142c f8908b;

    /* renamed from: f.b.a.a.a$a */
    static class C3138a implements Executor {
        C3138a() {
        }

        public void execute(Runnable runnable) {
            C3137a.m12723c().mo10110c(runnable);
        }
    }

    /* renamed from: f.b.a.a.a$b */
    static class C3139b implements Executor {
        C3139b() {
        }

        public void execute(Runnable runnable) {
            C3137a.m12723c().mo10108a(runnable);
        }
    }

    private C3137a() {
        C3140b bVar = new C3140b();
        this.f8908b = bVar;
        this.f8907a = bVar;
    }

    /* renamed from: b */
    public static Executor m12722b() {
        return f8906e;
    }

    /* renamed from: c */
    public static C3137a m12723c() {
        if (f8904c != null) {
            return f8904c;
        }
        synchronized (C3137a.class) {
            if (f8904c == null) {
                f8904c = new C3137a();
            }
        }
        return f8904c;
    }

    /* renamed from: d */
    public static Executor m12724d() {
        return f8905d;
    }

    /* renamed from: a */
    public void mo10108a(Runnable runnable) {
        this.f8907a.mo10108a(runnable);
    }

    /* renamed from: a */
    public boolean mo10109a() {
        return this.f8907a.mo10109a();
    }

    /* renamed from: c */
    public void mo10110c(Runnable runnable) {
        this.f8907a.mo10110c(runnable);
    }
}
