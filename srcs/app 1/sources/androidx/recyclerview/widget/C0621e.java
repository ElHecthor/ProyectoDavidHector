package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.e */
public class C0621e implements C0659p {

    /* renamed from: a */
    final C0659p f2543a;

    /* renamed from: b */
    int f2544b = 0;

    /* renamed from: c */
    int f2545c = -1;

    /* renamed from: d */
    int f2546d = -1;

    /* renamed from: e */
    Object f2547e = null;

    public C0621e(C0659p pVar) {
        this.f2543a = pVar;
    }

    /* renamed from: a */
    public void mo3832a() {
        int i = this.f2544b;
        if (i != 0) {
            if (i == 1) {
                this.f2543a.mo3813c(this.f2545c, this.f2546d);
            } else if (i == 2) {
                this.f2543a.mo3810a(this.f2545c, this.f2546d);
            } else if (i == 3) {
                this.f2543a.mo3811a(this.f2545c, this.f2546d, this.f2547e);
            }
            this.f2547e = null;
            this.f2544b = 0;
        }
    }

    /* renamed from: a */
    public void mo3810a(int i, int i2) {
        if (this.f2544b == 2) {
            int i3 = this.f2545c;
            if (i3 >= i && i3 <= i + i2) {
                this.f2546d += i2;
                this.f2545c = i;
                return;
            }
        }
        mo3832a();
        this.f2545c = i;
        this.f2546d = i2;
        this.f2544b = 2;
    }

    /* renamed from: a */
    public void mo3811a(int i, int i2, Object obj) {
        if (this.f2544b == 3) {
            int i3 = this.f2545c;
            int i4 = this.f2546d;
            if (i <= i3 + i4) {
                int i5 = i + i2;
                if (i5 >= i3 && this.f2547e == obj) {
                    int i6 = i4 + i3;
                    this.f2545c = Math.min(i, i3);
                    this.f2546d = Math.max(i6, i5) - this.f2545c;
                    return;
                }
            }
        }
        mo3832a();
        this.f2545c = i;
        this.f2546d = i2;
        this.f2547e = obj;
        this.f2544b = 3;
    }

    /* renamed from: b */
    public void mo3812b(int i, int i2) {
        mo3832a();
        this.f2543a.mo3812b(i, i2);
    }

    /* renamed from: c */
    public void mo3813c(int i, int i2) {
        if (this.f2544b == 1) {
            int i3 = this.f2545c;
            if (i >= i3) {
                int i4 = this.f2546d;
                if (i <= i3 + i4) {
                    this.f2546d = i4 + i2;
                    this.f2545c = Math.min(i, i3);
                    return;
                }
            }
        }
        mo3832a();
        this.f2545c = i;
        this.f2546d = i2;
        this.f2544b = 1;
    }
}
