package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.C0566d0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.f */
class C0622f {

    /* renamed from: a */
    final C0624b f2548a;

    /* renamed from: b */
    final C0623a f2549b = new C0623a();

    /* renamed from: c */
    final List<View> f2550c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.f$a */
    static class C0623a {

        /* renamed from: a */
        long f2551a = 0;

        /* renamed from: b */
        C0623a f2552b;

        C0623a() {
        }

        /* renamed from: b */
        private void m3582b() {
            if (this.f2552b == null) {
                this.f2552b = new C0623a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3851a() {
            this.f2551a = 0;
            C0623a aVar = this.f2552b;
            if (aVar != null) {
                aVar.mo3851a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3852a(int i) {
            if (i >= 64) {
                C0623a aVar = this.f2552b;
                if (aVar != null) {
                    aVar.mo3852a(i - 64);
                    return;
                }
                return;
            }
            this.f2551a &= ~(1 << i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3853a(int i, boolean z) {
            if (i >= 64) {
                m3582b();
                this.f2552b.mo3853a(i - 64, z);
                return;
            }
            boolean z2 = (this.f2551a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.f2551a;
            this.f2551a = ((j2 & (~j)) << 1) | (j2 & j);
            if (z) {
                mo3857e(i);
            } else {
                mo3852a(i);
            }
            if (z2 || this.f2552b != null) {
                m3582b();
                this.f2552b.mo3853a(0, z2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo3854b(int i) {
            C0623a aVar = this.f2552b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.f2551a) : Long.bitCount(this.f2551a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f2551a & ((1 << i) - 1)) : aVar.mo3854b(i - 64) + Long.bitCount(this.f2551a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo3855c(int i) {
            if (i >= 64) {
                m3582b();
                return this.f2552b.mo3855c(i - 64);
            }
            return (this.f2551a & (1 << i)) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo3856d(int i) {
            if (i >= 64) {
                m3582b();
                return this.f2552b.mo3856d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f2551a & j) != 0;
            long j2 = this.f2551a & (~j);
            this.f2551a = j2;
            long j3 = j - 1;
            this.f2551a = (j2 & j3) | Long.rotateRight((~j3) & j2, 1);
            C0623a aVar = this.f2552b;
            if (aVar != null) {
                if (aVar.mo3855c(0)) {
                    mo3857e(63);
                }
                this.f2552b.mo3856d(0);
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo3857e(int i) {
            if (i >= 64) {
                m3582b();
                this.f2552b.mo3857e(i - 64);
                return;
            }
            this.f2551a |= 1 << i;
        }

        public String toString() {
            if (this.f2552b == null) {
                return Long.toBinaryString(this.f2551a);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f2552b.toString());
            sb.append("xx");
            sb.append(Long.toBinaryString(this.f2551a));
            return sb.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$b */
    interface C0624b {
        /* renamed from: a */
        int mo3442a();

        /* renamed from: a */
        View mo3443a(int i);

        /* renamed from: a */
        void mo3444a(View view);

        /* renamed from: a */
        void mo3445a(View view, int i);

        /* renamed from: a */
        void mo3446a(View view, int i, LayoutParams layoutParams);

        /* renamed from: b */
        C0566d0 mo3447b(View view);

        /* renamed from: b */
        void mo3448b();

        /* renamed from: b */
        void mo3449b(int i);

        /* renamed from: c */
        void mo3450c(int i);

        /* renamed from: c */
        void mo3451c(View view);

        /* renamed from: d */
        int mo3452d(View view);
    }

    C0622f(C0624b bVar) {
        this.f2548a = bVar;
    }

    /* renamed from: f */
    private int m3562f(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.f2548a.mo3442a();
        int i2 = i;
        while (i2 < a) {
            int b = i - (i2 - this.f2549b.mo3854b(i2));
            if (b == 0) {
                while (this.f2549b.mo3855c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: g */
    private void m3563g(View view) {
        this.f2550c.add(view);
        this.f2548a.mo3444a(view);
    }

    /* renamed from: h */
    private boolean m3564h(View view) {
        if (!this.f2550c.remove(view)) {
            return false;
        }
        this.f2548a.mo3451c(view);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo3833a() {
        return this.f2548a.mo3442a() - this.f2550c.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3834a(int i) {
        int f = m3562f(i);
        this.f2549b.mo3856d(f);
        this.f2548a.mo3449b(f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3835a(View view) {
        int d = this.f2548a.mo3452d(view);
        if (d >= 0) {
            this.f2549b.mo3857e(d);
            m3563g(view);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("view is not a child, cannot hide ");
        sb.append(view);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3836a(View view, int i, LayoutParams layoutParams, boolean z) {
        int a = i < 0 ? this.f2548a.mo3442a() : m3562f(i);
        this.f2549b.mo3853a(a, z);
        if (z) {
            m3563g(view);
        }
        this.f2548a.mo3446a(view, a, layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3837a(View view, int i, boolean z) {
        int a = i < 0 ? this.f2548a.mo3442a() : m3562f(i);
        this.f2549b.mo3853a(a, z);
        if (z) {
            m3563g(view);
        }
        this.f2548a.mo3445a(view, a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3838a(View view, boolean z) {
        mo3837a(view, -1, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo3839b() {
        return this.f2548a.mo3442a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo3840b(View view) {
        int d = this.f2548a.mo3452d(view);
        if (d != -1 && !this.f2549b.mo3855c(d)) {
            return d - this.f2549b.mo3854b(d);
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo3841b(int i) {
        int size = this.f2550c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f2550c.get(i2);
            C0566d0 b = this.f2548a.mo3447b(view);
            if (b.mo3423i() == i && !b.mo3429o() && !b.mo3431q()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public View mo3842c(int i) {
        return this.f2548a.mo3443a(m3562f(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo3843c() {
        this.f2549b.mo3851a();
        for (int size = this.f2550c.size() - 1; size >= 0; size--) {
            this.f2548a.mo3451c((View) this.f2550c.get(size));
            this.f2550c.remove(size);
        }
        this.f2548a.mo3448b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo3844c(View view) {
        return this.f2550c.contains(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public View mo3845d(int i) {
        return this.f2548a.mo3443a(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo3846d(View view) {
        int d = this.f2548a.mo3452d(view);
        if (d >= 0) {
            if (this.f2549b.mo3856d(d)) {
                m3564h(view);
            }
            this.f2548a.mo3450c(d);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo3847e(int i) {
        int f = m3562f(i);
        View a = this.f2548a.mo3443a(f);
        if (a != null) {
            if (this.f2549b.mo3856d(f)) {
                m3564h(a);
            }
            this.f2548a.mo3450c(f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo3848e(View view) {
        int d = this.f2548a.mo3452d(view);
        if (d == -1) {
            m3564h(view);
            return true;
        } else if (!this.f2549b.mo3855c(d)) {
            return false;
        } else {
            this.f2549b.mo3856d(d);
            m3564h(view);
            this.f2548a.mo3450c(d);
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo3849f(View view) {
        int d = this.f2548a.mo3452d(view);
        if (d < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("view is not a child, cannot hide ");
            sb.append(view);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f2549b.mo3855c(d)) {
            this.f2549b.mo3852a(d);
            m3564h(view);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("trying to unhide a view that was not hidden");
            sb2.append(view);
            throw new RuntimeException(sb2.toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2549b.toString());
        sb.append(", hidden list:");
        sb.append(this.f2550c.size());
        return sb.toString();
    }
}
