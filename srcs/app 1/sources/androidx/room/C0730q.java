package androidx.room;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.room.C0696i.C0699c;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p071f.p080b.p081a.p082a.C3137a;

/* renamed from: androidx.room.q */
class C0730q<T> extends LiveData<T> {

    /* renamed from: k */
    final C0711l f2877k;

    /* renamed from: l */
    final boolean f2878l;

    /* renamed from: m */
    final Callable<T> f2879m;

    /* renamed from: n */
    private final C0695h f2880n;

    /* renamed from: o */
    final C0699c f2881o;

    /* renamed from: p */
    final AtomicBoolean f2882p = new AtomicBoolean(true);

    /* renamed from: q */
    final AtomicBoolean f2883q = new AtomicBoolean(false);

    /* renamed from: r */
    final AtomicBoolean f2884r = new AtomicBoolean(false);

    /* renamed from: s */
    final Runnable f2885s = new C0731a();

    /* renamed from: t */
    final Runnable f2886t = new C0732b();

    /* renamed from: androidx.room.q$a */
    class C0731a implements Runnable {
        C0731a() {
        }

        public void run() {
            boolean z;
            if (C0730q.this.f2884r.compareAndSet(false, true)) {
                C0730q.this.f2877k.mo4074h().mo4041b(C0730q.this.f2881o);
            }
            do {
                if (C0730q.this.f2883q.compareAndSet(false, true)) {
                    Object obj = null;
                    z = false;
                    while (C0730q.this.f2882p.compareAndSet(true, false)) {
                        try {
                            obj = C0730q.this.f2879m.call();
                            z = true;
                        } catch (Exception e) {
                            throw new RuntimeException("Exception while computing database live data.", e);
                        } catch (Throwable th) {
                            C0730q.this.f2883q.set(false);
                            throw th;
                        }
                    }
                    if (z) {
                        C0730q.this.mo2978a(obj);
                    }
                    C0730q.this.f2883q.set(false);
                } else {
                    z = false;
                }
                if (!z) {
                    return;
                }
            } while (C0730q.this.f2882p.get());
        }
    }

    /* renamed from: androidx.room.q$b */
    class C0732b implements Runnable {
        C0732b() {
        }

        public void run() {
            boolean c = C0730q.this.mo2982c();
            if (C0730q.this.f2882p.compareAndSet(false, true) && c) {
                C0730q.this.mo4118f().execute(C0730q.this.f2885s);
            }
        }
    }

    /* renamed from: androidx.room.q$c */
    class C0733c extends C0699c {
        C0733c(String[] strArr) {
            super(strArr);
        }

        /* renamed from: a */
        public void mo4051a(Set<String> set) {
            C3137a.m12723c().mo10114b(C0730q.this.f2886t);
        }
    }

    @SuppressLint({"RestrictedApi"})
    C0730q(C0711l lVar, C0695h hVar, boolean z, Callable<T> callable, String[] strArr) {
        this.f2877k = lVar;
        this.f2878l = z;
        this.f2879m = callable;
        this.f2880n = hVar;
        this.f2881o = new C0733c(strArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo2983d() {
        super.mo2983d();
        this.f2880n.mo4032a(this);
        mo4118f().execute(this.f2885s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo2984e() {
        super.mo2984e();
        this.f2880n.mo4033b(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public Executor mo4118f() {
        return this.f2878l ? this.f2877k.mo4078l() : this.f2877k.mo4076j();
    }
}
