package p071f.p072a.p079o;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p071f.p097h.p108m.C3325a0;
import p071f.p097h.p108m.C3332b0;
import p071f.p097h.p108m.C3338c0;

/* renamed from: f.a.o.h */
public class C3134h {

    /* renamed from: a */
    final ArrayList<C3325a0> f8894a = new ArrayList<>();

    /* renamed from: b */
    private long f8895b = -1;

    /* renamed from: c */
    private Interpolator f8896c;

    /* renamed from: d */
    C3332b0 f8897d;

    /* renamed from: e */
    private boolean f8898e;

    /* renamed from: f */
    private final C3338c0 f8899f = new C3135a();

    /* renamed from: f.a.o.h$a */
    class C3135a extends C3338c0 {

        /* renamed from: a */
        private boolean f8900a = false;

        /* renamed from: b */
        private int f8901b = 0;

        C3135a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo10092a() {
            this.f8901b = 0;
            this.f8900a = false;
            C3134h.this.mo10090b();
        }

        /* renamed from: b */
        public void mo330b(View view) {
            int i = this.f8901b + 1;
            this.f8901b = i;
            if (i == C3134h.this.f8894a.size()) {
                C3332b0 b0Var = C3134h.this.f8897d;
                if (b0Var != null) {
                    b0Var.mo330b(null);
                }
                mo10092a();
            }
        }

        /* renamed from: c */
        public void mo331c(View view) {
            if (!this.f8900a) {
                this.f8900a = true;
                C3332b0 b0Var = C3134h.this.f8897d;
                if (b0Var != null) {
                    b0Var.mo331c(null);
                }
            }
        }
    }

    /* renamed from: a */
    public C3134h mo10084a(long j) {
        if (!this.f8898e) {
            this.f8895b = j;
        }
        return this;
    }

    /* renamed from: a */
    public C3134h mo10085a(Interpolator interpolator) {
        if (!this.f8898e) {
            this.f8896c = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public C3134h mo10086a(C3325a0 a0Var) {
        if (!this.f8898e) {
            this.f8894a.add(a0Var);
        }
        return this;
    }

    /* renamed from: a */
    public C3134h mo10087a(C3325a0 a0Var, C3325a0 a0Var2) {
        this.f8894a.add(a0Var);
        a0Var2.mo10716b(a0Var.mo10714b());
        this.f8894a.add(a0Var2);
        return this;
    }

    /* renamed from: a */
    public C3134h mo10088a(C3332b0 b0Var) {
        if (!this.f8898e) {
            this.f8897d = b0Var;
        }
        return this;
    }

    /* renamed from: a */
    public void mo10089a() {
        if (this.f8898e) {
            Iterator it = this.f8894a.iterator();
            while (it.hasNext()) {
                ((C3325a0) it.next()).mo10713a();
            }
            this.f8898e = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo10090b() {
        this.f8898e = false;
    }

    /* renamed from: c */
    public void mo10091c() {
        if (!this.f8898e) {
            Iterator it = this.f8894a.iterator();
            while (it.hasNext()) {
                C3325a0 a0Var = (C3325a0) it.next();
                long j = this.f8895b;
                if (j >= 0) {
                    a0Var.mo10709a(j);
                }
                Interpolator interpolator = this.f8896c;
                if (interpolator != null) {
                    a0Var.mo10710a(interpolator);
                }
                if (this.f8897d != null) {
                    a0Var.mo10711a((C3332b0) this.f8899f);
                }
                a0Var.mo10717c();
            }
            this.f8898e = true;
        }
    }
}
