package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0589t;
import androidx.viewpager2.widget.ViewPager2.C0798i;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.e */
final class C0814e extends C0589t {

    /* renamed from: a */
    private C0798i f3134a;

    /* renamed from: b */
    private final ViewPager2 f3135b;

    /* renamed from: c */
    private final RecyclerView f3136c;

    /* renamed from: d */
    private final LinearLayoutManager f3137d;

    /* renamed from: e */
    private int f3138e;

    /* renamed from: f */
    private int f3139f;

    /* renamed from: g */
    private C0815a f3140g = new C0815a();

    /* renamed from: h */
    private int f3141h;

    /* renamed from: i */
    private int f3142i;

    /* renamed from: j */
    private boolean f3143j;

    /* renamed from: k */
    private boolean f3144k;

    /* renamed from: l */
    private boolean f3145l;

    /* renamed from: m */
    private boolean f3146m;

    /* renamed from: androidx.viewpager2.widget.e$a */
    private static final class C0815a {

        /* renamed from: a */
        int f3147a;

        /* renamed from: b */
        float f3148b;

        /* renamed from: c */
        int f3149c;

        C0815a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4421a() {
            this.f3147a = -1;
            this.f3148b = 0.0f;
            this.f3149c = 0;
        }
    }

    C0814e(ViewPager2 viewPager2) {
        this.f3135b = viewPager2;
        RecyclerView recyclerView = viewPager2.f3098o;
        this.f3136c = recyclerView;
        this.f3137d = (LinearLayoutManager) recyclerView.getLayoutManager();
        m4368h();
    }

    /* renamed from: a */
    private void m4362a(int i) {
        C0798i iVar = this.f3134a;
        if (iVar != null) {
            iVar.mo4338b(i);
        }
    }

    /* renamed from: a */
    private void m4363a(int i, float f, int i2) {
        C0798i iVar = this.f3134a;
        if (iVar != null) {
            iVar.mo4395a(i, f, i2);
        }
    }

    /* renamed from: a */
    private void m4364a(boolean z) {
        this.f3146m = z;
        this.f3138e = z ? 4 : 1;
        int i = this.f3142i;
        if (i != -1) {
            this.f3141h = i;
            this.f3142i = -1;
        } else if (this.f3141h == -1) {
            this.f3141h = m4366f();
        }
        m4365b(1);
    }

    /* renamed from: b */
    private void m4365b(int i) {
        if ((this.f3138e != 3 || this.f3139f != 0) && this.f3139f != i) {
            this.f3139f = i;
            C0798i iVar = this.f3134a;
            if (iVar != null) {
                iVar.mo4337a(i);
            }
        }
    }

    /* renamed from: f */
    private int m4366f() {
        return this.f3137d.mo3143H();
    }

    /* renamed from: g */
    private boolean m4367g() {
        int i = this.f3138e;
        return i == 1 || i == 4;
    }

    /* renamed from: h */
    private void m4368h() {
        this.f3138e = 0;
        this.f3139f = 0;
        this.f3140g.mo4421a();
        this.f3141h = -1;
        this.f3142i = -1;
        this.f3143j = false;
        this.f3144k = false;
        this.f3146m = false;
        this.f3145l = false;
    }

    /* renamed from: i */
    private void m4369i() {
        int i;
        C0815a aVar = this.f3140g;
        int H = this.f3137d.mo3143H();
        aVar.f3147a = H;
        if (H == -1) {
            aVar.mo4421a();
            return;
        }
        View c = this.f3137d.mo3167c(H);
        if (c == null) {
            aVar.mo4421a();
            return;
        }
        int k = this.f3137d.mo3606k(c);
        int m = this.f3137d.mo3610m(c);
        int n = this.f3137d.mo3612n(c);
        int d = this.f3137d.mo3582d(c);
        LayoutParams layoutParams = c.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            k += marginLayoutParams.leftMargin;
            m += marginLayoutParams.rightMargin;
            n += marginLayoutParams.topMargin;
            d += marginLayoutParams.bottomMargin;
        }
        int height = c.getHeight() + n + d;
        int width = c.getWidth() + k + m;
        if (this.f3137d.mo3145J() == 0) {
            i = (c.getLeft() - k) - this.f3136c.getPaddingLeft();
            if (this.f3135b.mo4347b()) {
                i = -i;
            }
            height = width;
        } else {
            i = (c.getTop() - n) - this.f3136c.getPaddingTop();
        }
        int i2 = -i;
        aVar.f3149c = i2;
        if (i2 >= 0) {
            aVar.f3148b = height == 0 ? 0.0f : ((float) i2) / ((float) height);
        } else if (new C0809a(this.f3137d).mo4406a()) {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", new Object[]{Integer.valueOf(aVar.f3149c)}));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public double mo4414a() {
        m4369i();
        C0815a aVar = this.f3140g;
        return ((double) aVar.f3147a) + ((double) aVar.f3148b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4415a(int i, boolean z) {
        this.f3138e = z ? 2 : 3;
        boolean z2 = false;
        this.f3146m = false;
        if (this.f3142i != i) {
            z2 = true;
        }
        this.f3142i = i;
        m4365b(2);
        if (z2) {
            m4362a(i);
        }
    }

    /* renamed from: a */
    public void mo3640a(RecyclerView recyclerView, int i) {
        boolean z = true;
        if (!(this.f3138e == 1 && this.f3139f == 1) && i == 1) {
            m4364a(false);
        } else if (!m4367g() || i != 2) {
            if (m4367g() && i == 0) {
                m4369i();
                if (!this.f3144k) {
                    int i2 = this.f3140g.f3147a;
                    if (i2 != -1) {
                        m4363a(i2, 0.0f, 0);
                    }
                } else {
                    C0815a aVar = this.f3140g;
                    if (aVar.f3149c == 0) {
                        int i3 = this.f3141h;
                        int i4 = aVar.f3147a;
                        if (i3 != i4) {
                            m4362a(i4);
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    m4365b(0);
                    m4368h();
                }
            }
            if (this.f3138e == 2 && i == 0 && this.f3145l) {
                m4369i();
                C0815a aVar2 = this.f3140g;
                if (aVar2.f3149c == 0) {
                    int i5 = this.f3142i;
                    int i6 = aVar2.f3147a;
                    if (i5 != i6) {
                        if (i6 == -1) {
                            i6 = 0;
                        }
                        m4362a(i6);
                    }
                    m4365b(0);
                    m4368h();
                }
            }
        } else {
            if (this.f3144k) {
                m4365b(2);
                this.f3143j = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r3.f3141h != r5) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r5 < 0) == r3.f3135b.mo4347b()) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3641a(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f3144k = r4
            r3.m4369i()
            boolean r0 = r3.f3143j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x003a
            r3.f3143j = r2
            if (r6 > 0) goto L_0x0022
            if (r6 != 0) goto L_0x0020
            if (r5 >= 0) goto L_0x0016
            r5 = 1
            goto L_0x0017
        L_0x0016:
            r5 = 0
        L_0x0017:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f3135b
            boolean r6 = r6.mo4347b()
            if (r5 != r6) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r5 = 0
            goto L_0x0023
        L_0x0022:
            r5 = 1
        L_0x0023:
            if (r5 == 0) goto L_0x002f
            androidx.viewpager2.widget.e$a r5 = r3.f3140g
            int r6 = r5.f3149c
            if (r6 == 0) goto L_0x002f
            int r5 = r5.f3147a
            int r5 = r5 + r4
            goto L_0x0033
        L_0x002f:
            androidx.viewpager2.widget.e$a r5 = r3.f3140g
            int r5 = r5.f3147a
        L_0x0033:
            r3.f3142i = r5
            int r6 = r3.f3141h
            if (r6 == r5) goto L_0x0048
            goto L_0x0045
        L_0x003a:
            int r5 = r3.f3138e
            if (r5 != 0) goto L_0x0048
            androidx.viewpager2.widget.e$a r5 = r3.f3140g
            int r5 = r5.f3147a
            if (r5 != r1) goto L_0x0045
            r5 = 0
        L_0x0045:
            r3.m4362a(r5)
        L_0x0048:
            androidx.viewpager2.widget.e$a r5 = r3.f3140g
            int r5 = r5.f3147a
            if (r5 != r1) goto L_0x004f
            r5 = 0
        L_0x004f:
            androidx.viewpager2.widget.e$a r6 = r3.f3140g
            float r0 = r6.f3148b
            int r6 = r6.f3149c
            r3.m4363a(r5, r0, r6)
            androidx.viewpager2.widget.e$a r5 = r3.f3140g
            int r5 = r5.f3147a
            int r6 = r3.f3142i
            if (r5 == r6) goto L_0x0062
            if (r6 != r1) goto L_0x0072
        L_0x0062:
            androidx.viewpager2.widget.e$a r5 = r3.f3140g
            int r5 = r5.f3149c
            if (r5 != 0) goto L_0x0072
            int r5 = r3.f3139f
            if (r5 == r4) goto L_0x0072
            r3.m4365b(r2)
            r3.m4368h()
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C0814e.mo3641a(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4416a(C0798i iVar) {
        this.f3134a = iVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo4417b() {
        return this.f3139f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo4418c() {
        return this.f3146m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo4419d() {
        return this.f3139f == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo4420e() {
        this.f3145l = true;
    }
}
