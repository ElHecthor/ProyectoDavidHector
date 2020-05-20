package androidx.lifecycle;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p071f.p080b.p081a.p082a.C3137a;

/* renamed from: androidx.lifecycle.b */
public abstract class C0499b<T> {

    /* renamed from: a */
    final Executor f2210a;

    /* renamed from: b */
    final LiveData<T> f2211b;

    /* renamed from: c */
    final AtomicBoolean f2212c = new AtomicBoolean(true);

    /* renamed from: d */
    final AtomicBoolean f2213d = new AtomicBoolean(false);

    /* renamed from: e */
    final Runnable f2214e = new C0501b();

    /* renamed from: f */
    final Runnable f2215f = new C0502c();

    /* renamed from: androidx.lifecycle.b$a */
    class C0500a extends LiveData<T> {
        C0500a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo2983d() {
            C0499b bVar = C0499b.this;
            bVar.f2210a.execute(bVar.f2214e);
        }
    }

    /* renamed from: androidx.lifecycle.b$b */
    class C0501b implements Runnable {
        C0501b() {
        }

        /* JADX INFO: finally extract failed */
        public void run() {
            do {
                boolean z = false;
                if (C0499b.this.f2213d.compareAndSet(false, true)) {
                    Object obj = null;
                    boolean z2 = false;
                    while (C0499b.this.f2212c.compareAndSet(true, false)) {
                        try {
                            obj = C0499b.this.mo3007a();
                            z2 = true;
                        } catch (Throwable th) {
                            C0499b.this.f2213d.set(false);
                            throw th;
                        }
                    }
                    if (z2) {
                        C0499b.this.f2211b.mo2978a(obj);
                    }
                    C0499b.this.f2213d.set(false);
                    z = z2;
                }
                if (!z) {
                    return;
                }
            } while (C0499b.this.f2212c.get());
        }
    }

    /* renamed from: androidx.lifecycle.b$c */
    class C0502c implements Runnable {
        C0502c() {
        }

        public void run() {
            boolean c = C0499b.this.f2211b.mo2982c();
            if (C0499b.this.f2212c.compareAndSet(false, true) && c) {
                C0499b bVar = C0499b.this;
                bVar.f2210a.execute(bVar.f2214e);
            }
        }
    }

    public C0499b(Executor executor) {
        this.f2210a = executor;
        this.f2211b = new C0500a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo3007a();

    /* renamed from: b */
    public LiveData<T> mo3008b() {
        return this.f2211b;
    }

    /* renamed from: c */
    public void mo3009c() {
        C3137a.m12723c().mo10114b(this.f2215f);
    }
}
