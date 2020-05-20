package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.x */
class C0674x {

    /* renamed from: a */
    final C0676b f2719a;

    /* renamed from: b */
    C0675a f2720b = new C0675a();

    /* renamed from: androidx.recyclerview.widget.x$a */
    static class C0675a {

        /* renamed from: a */
        int f2721a = 0;

        /* renamed from: b */
        int f2722b;

        /* renamed from: c */
        int f2723c;

        /* renamed from: d */
        int f2724d;

        /* renamed from: e */
        int f2725e;

        C0675a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo3988a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3989a(int i) {
            this.f2721a = i | this.f2721a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3990a(int i, int i2, int i3, int i4) {
            this.f2722b = i;
            this.f2723c = i2;
            this.f2724d = i3;
            this.f2725e = i4;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo3991a() {
            int i = this.f2721a;
            if ((i & 7) != 0 && (i & (mo3988a(this.f2724d, this.f2722b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f2721a;
            if ((i2 & 112) != 0 && (i2 & (mo3988a(this.f2724d, this.f2723c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f2721a;
            if ((i3 & 1792) != 0 && (i3 & (mo3988a(this.f2725e, this.f2722b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f2721a;
            return (i4 & 28672) == 0 || (i4 & (mo3988a(this.f2725e, this.f2723c) << 12)) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3992b() {
            this.f2721a = 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.x$b */
    interface C0676b {
        /* renamed from: a */
        int mo3624a();

        /* renamed from: a */
        int mo3625a(View view);

        /* renamed from: a */
        View mo3626a(int i);

        /* renamed from: b */
        int mo3627b();

        /* renamed from: b */
        int mo3628b(View view);
    }

    C0674x(C0676b bVar) {
        this.f2719a = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo3986a(int i, int i2, int i3, int i4) {
        int b = this.f2719a.mo3627b();
        int a = this.f2719a.mo3624a();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a2 = this.f2719a.mo3626a(i);
            this.f2720b.mo3990a(b, a, this.f2719a.mo3625a(a2), this.f2719a.mo3628b(a2));
            if (i3 != 0) {
                this.f2720b.mo3992b();
                this.f2720b.mo3989a(i3);
                if (this.f2720b.mo3991a()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.f2720b.mo3992b();
                this.f2720b.mo3989a(i4);
                if (this.f2720b.mo3991a()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3987a(View view, int i) {
        this.f2720b.mo3990a(this.f2719a.mo3627b(), this.f2719a.mo3624a(), this.f2719a.mo3625a(view), this.f2719a.mo3628b(view));
        if (i == 0) {
            return false;
        }
        this.f2720b.mo3992b();
        this.f2720b.mo3989a(i);
        return this.f2720b.mo3991a();
    }
}
