package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C0580o;
import androidx.recyclerview.widget.RecyclerView.C0585p;

/* renamed from: androidx.recyclerview.widget.r */
public abstract class C0662r {

    /* renamed from: a */
    protected final C0580o f2702a;

    /* renamed from: b */
    private int f2703b;

    /* renamed from: c */
    final Rect f2704c;

    /* renamed from: androidx.recyclerview.widget.r$a */
    static class C0663a extends C0662r {
        C0663a(C0580o oVar) {
            super(oVar, null);
        }

        /* renamed from: a */
        public int mo3939a() {
            return this.f2702a.mo3617r();
        }

        /* renamed from: a */
        public int mo3940a(View view) {
            return this.f2702a.mo3602i(view) + ((C0585p) view.getLayoutParams()).rightMargin;
        }

        /* renamed from: a */
        public void mo3941a(int i) {
            this.f2702a.mo3589e(i);
        }

        /* renamed from: b */
        public int mo3942b() {
            return this.f2702a.mo3617r() - this.f2702a.mo3615p();
        }

        /* renamed from: b */
        public int mo3943b(View view) {
            C0585p pVar = (C0585p) view.getLayoutParams();
            return this.f2702a.mo3599h(view) + pVar.leftMargin + pVar.rightMargin;
        }

        /* renamed from: c */
        public int mo3944c() {
            return this.f2702a.mo3615p();
        }

        /* renamed from: c */
        public int mo3945c(View view) {
            C0585p pVar = (C0585p) view.getLayoutParams();
            return this.f2702a.mo3595g(view) + pVar.topMargin + pVar.bottomMargin;
        }

        /* renamed from: d */
        public int mo3946d() {
            return this.f2702a.mo3618s();
        }

        /* renamed from: d */
        public int mo3947d(View view) {
            return this.f2702a.mo3591f(view) - ((C0585p) view.getLayoutParams()).leftMargin;
        }

        /* renamed from: e */
        public int mo3948e() {
            return this.f2702a.mo3601i();
        }

        /* renamed from: e */
        public int mo3949e(View view) {
            this.f2702a.mo3543a(view, true, this.f2704c);
            return this.f2704c.right;
        }

        /* renamed from: f */
        public int mo3950f() {
            return this.f2702a.mo3613o();
        }

        /* renamed from: f */
        public int mo3951f(View view) {
            this.f2702a.mo3543a(view, true, this.f2704c);
            return this.f2704c.left;
        }

        /* renamed from: g */
        public int mo3952g() {
            return (this.f2702a.mo3617r() - this.f2702a.mo3613o()) - this.f2702a.mo3615p();
        }
    }

    /* renamed from: androidx.recyclerview.widget.r$b */
    static class C0664b extends C0662r {
        C0664b(C0580o oVar) {
            super(oVar, null);
        }

        /* renamed from: a */
        public int mo3939a() {
            return this.f2702a.mo3598h();
        }

        /* renamed from: a */
        public int mo3940a(View view) {
            return this.f2702a.mo3588e(view) + ((C0585p) view.getLayoutParams()).bottomMargin;
        }

        /* renamed from: a */
        public void mo3941a(int i) {
            this.f2702a.mo3592f(i);
        }

        /* renamed from: b */
        public int mo3942b() {
            return this.f2702a.mo3598h() - this.f2702a.mo3611n();
        }

        /* renamed from: b */
        public int mo3943b(View view) {
            C0585p pVar = (C0585p) view.getLayoutParams();
            return this.f2702a.mo3595g(view) + pVar.topMargin + pVar.bottomMargin;
        }

        /* renamed from: c */
        public int mo3944c() {
            return this.f2702a.mo3611n();
        }

        /* renamed from: c */
        public int mo3945c(View view) {
            C0585p pVar = (C0585p) view.getLayoutParams();
            return this.f2702a.mo3599h(view) + pVar.leftMargin + pVar.rightMargin;
        }

        /* renamed from: d */
        public int mo3946d() {
            return this.f2702a.mo3601i();
        }

        /* renamed from: d */
        public int mo3947d(View view) {
            return this.f2702a.mo3604j(view) - ((C0585p) view.getLayoutParams()).topMargin;
        }

        /* renamed from: e */
        public int mo3948e() {
            return this.f2702a.mo3618s();
        }

        /* renamed from: e */
        public int mo3949e(View view) {
            this.f2702a.mo3543a(view, true, this.f2704c);
            return this.f2704c.bottom;
        }

        /* renamed from: f */
        public int mo3950f() {
            return this.f2702a.mo3616q();
        }

        /* renamed from: f */
        public int mo3951f(View view) {
            this.f2702a.mo3543a(view, true, this.f2704c);
            return this.f2704c.top;
        }

        /* renamed from: g */
        public int mo3952g() {
            return (this.f2702a.mo3598h() - this.f2702a.mo3616q()) - this.f2702a.mo3611n();
        }
    }

    private C0662r(C0580o oVar) {
        this.f2703b = RecyclerView.UNDEFINED_DURATION;
        this.f2704c = new Rect();
        this.f2702a = oVar;
    }

    /* synthetic */ C0662r(C0580o oVar, C0663a aVar) {
        this(oVar);
    }

    /* renamed from: a */
    public static C0662r m3734a(C0580o oVar) {
        return new C0663a(oVar);
    }

    /* renamed from: a */
    public static C0662r m3735a(C0580o oVar, int i) {
        if (i == 0) {
            return m3734a(oVar);
        }
        if (i == 1) {
            return m3736b(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public static C0662r m3736b(C0580o oVar) {
        return new C0664b(oVar);
    }

    /* renamed from: a */
    public abstract int mo3939a();

    /* renamed from: a */
    public abstract int mo3940a(View view);

    /* renamed from: a */
    public abstract void mo3941a(int i);

    /* renamed from: b */
    public abstract int mo3942b();

    /* renamed from: b */
    public abstract int mo3943b(View view);

    /* renamed from: c */
    public abstract int mo3944c();

    /* renamed from: c */
    public abstract int mo3945c(View view);

    /* renamed from: d */
    public abstract int mo3946d();

    /* renamed from: d */
    public abstract int mo3947d(View view);

    /* renamed from: e */
    public abstract int mo3948e();

    /* renamed from: e */
    public abstract int mo3949e(View view);

    /* renamed from: f */
    public abstract int mo3950f();

    /* renamed from: f */
    public abstract int mo3951f(View view);

    /* renamed from: g */
    public abstract int mo3952g();

    /* renamed from: h */
    public int mo3953h() {
        if (Integer.MIN_VALUE == this.f2703b) {
            return 0;
        }
        return mo3952g() - this.f2703b;
    }

    /* renamed from: i */
    public void mo3954i() {
        this.f2703b = mo3952g();
    }
}
