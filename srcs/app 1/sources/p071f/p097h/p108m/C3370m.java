package p071f.p097h.p108m;

import android.view.View;
import android.view.ViewParent;

/* renamed from: f.h.m.m */
public class C3370m {

    /* renamed from: a */
    private ViewParent f9572a;

    /* renamed from: b */
    private ViewParent f9573b;

    /* renamed from: c */
    private final View f9574c;

    /* renamed from: d */
    private boolean f9575d;

    /* renamed from: e */
    private int[] f9576e;

    public C3370m(View view) {
        this.f9574c = view;
    }

    /* renamed from: a */
    private void m13730a(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f9572a = viewParent;
        } else if (i == 1) {
            this.f9573b = viewParent;
        }
    }

    /* renamed from: b */
    private boolean m13731b(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (mo10827b()) {
            ViewParent d = m13732d(i5);
            if (d == null) {
                return false;
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr4 != null) {
                    this.f9574c.getLocationInWindow(iArr4);
                    i7 = iArr4[0];
                    i6 = iArr4[1];
                } else {
                    i7 = 0;
                    i6 = 0;
                }
                if (iArr2 == null) {
                    int[] d2 = m13733d();
                    d2[0] = 0;
                    d2[1] = 0;
                    iArr3 = d2;
                } else {
                    iArr3 = iArr2;
                }
                C3393z.m13885a(d, this.f9574c, i, i2, i3, i4, i5, iArr3);
                if (iArr4 != null) {
                    this.f9574c.getLocationInWindow(iArr4);
                    iArr4[0] = iArr4[0] - i7;
                    iArr4[1] = iArr4[1] - i6;
                }
                return true;
            } else if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: d */
    private ViewParent m13732d(int i) {
        if (i == 0) {
            return this.f9572a;
        }
        if (i != 1) {
            return null;
        }
        return this.f9573b;
    }

    /* renamed from: d */
    private int[] m13733d() {
        if (this.f9576e == null) {
            this.f9576e = new int[2];
        }
        return this.f9576e;
    }

    /* renamed from: a */
    public void mo10816a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m13731b(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: a */
    public void mo10817a(boolean z) {
        if (this.f9575d) {
            C3379v.m13774J(this.f9574c);
        }
        this.f9575d = z;
    }

    /* renamed from: a */
    public boolean mo10818a() {
        return mo10821a(0);
    }

    /* renamed from: a */
    public boolean mo10819a(float f, float f2) {
        if (mo10827b()) {
            ViewParent d = m13732d(0);
            if (d != null) {
                return C3393z.m13888a(d, this.f9574c, f, f2);
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo10820a(float f, float f2, boolean z) {
        if (mo10827b()) {
            ViewParent d = m13732d(0);
            if (d != null) {
                return C3393z.m13889a(d, this.f9574c, f, f2, z);
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo10821a(int i) {
        return m13732d(i) != null;
    }

    /* renamed from: a */
    public boolean mo10822a(int i, int i2) {
        if (mo10821a(i2)) {
            return true;
        }
        if (mo10827b()) {
            View view = this.f9574c;
            for (ViewParent parent = this.f9574c.getParent(); parent != null; parent = parent.getParent()) {
                if (C3393z.m13891b(parent, view, this.f9574c, i, i2)) {
                    m13730a(i2, parent);
                    C3393z.m13887a(parent, view, this.f9574c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo10823a(int i, int i2, int i3, int i4, int[] iArr) {
        return m13731b(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: a */
    public boolean mo10824a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m13731b(i, i2, i3, i4, iArr, i5, null);
    }

    /* renamed from: a */
    public boolean mo10825a(int i, int i2, int[] iArr, int[] iArr2) {
        return mo10826a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public boolean mo10826a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        int i4;
        int i5;
        boolean z = false;
        if (mo10827b()) {
            ViewParent d = m13732d(i3);
            if (d == null) {
                return false;
            }
            if (i != 0 || i2 != 0) {
                if (iArr2 != null) {
                    this.f9574c.getLocationInWindow(iArr2);
                    i5 = iArr2[0];
                    i4 = iArr2[1];
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (iArr == null) {
                    iArr = m13733d();
                }
                iArr[0] = 0;
                iArr[1] = 0;
                C3393z.m13886a(d, this.f9574c, i, i2, iArr, i3);
                if (iArr2 != null) {
                    this.f9574c.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i5;
                    iArr2[1] = iArr2[1] - i4;
                }
                if (!(iArr[0] == 0 && iArr[1] == 0)) {
                    z = true;
                }
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return z;
    }

    /* renamed from: b */
    public boolean mo10827b() {
        return this.f9575d;
    }

    /* renamed from: b */
    public boolean mo10828b(int i) {
        return mo10822a(i, 0);
    }

    /* renamed from: c */
    public void mo10829c() {
        mo10830c(0);
    }

    /* renamed from: c */
    public void mo10830c(int i) {
        ViewParent d = m13732d(i);
        if (d != null) {
            C3393z.m13884a(d, this.f9574c, i);
            m13730a(i, (ViewParent) null);
        }
    }
}
