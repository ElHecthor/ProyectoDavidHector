package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView.C0560a0;
import androidx.recyclerview.widget.RecyclerView.C0566d0;
import androidx.recyclerview.widget.RecyclerView.C0580o;
import androidx.recyclerview.widget.RecyclerView.C0580o.C0583c;
import androidx.recyclerview.widget.RecyclerView.C0580o.C0584d;
import androidx.recyclerview.widget.RecyclerView.C0585p;
import androidx.recyclerview.widget.RecyclerView.C0592v;
import androidx.recyclerview.widget.RecyclerView.C0597z;
import androidx.recyclerview.widget.RecyclerView.C0597z.C0599b;
import java.util.List;

public class LinearLayoutManager extends C0580o implements C0599b {

    /* renamed from: A */
    int f2289A;

    /* renamed from: B */
    int f2290B;

    /* renamed from: C */
    private boolean f2291C;

    /* renamed from: D */
    C0557d f2292D;

    /* renamed from: E */
    final C0554a f2293E;

    /* renamed from: F */
    private final C0555b f2294F;

    /* renamed from: G */
    private int f2295G;

    /* renamed from: H */
    private int[] f2296H;

    /* renamed from: s */
    int f2297s;

    /* renamed from: t */
    private C0556c f2298t;

    /* renamed from: u */
    C0662r f2299u;

    /* renamed from: v */
    private boolean f2300v;

    /* renamed from: w */
    private boolean f2301w;

    /* renamed from: x */
    boolean f2302x;

    /* renamed from: y */
    private boolean f2303y;

    /* renamed from: z */
    private boolean f2304z;

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    static class C0554a {

        /* renamed from: a */
        C0662r f2305a;

        /* renamed from: b */
        int f2306b;

        /* renamed from: c */
        int f2307c;

        /* renamed from: d */
        boolean f2308d;

        /* renamed from: e */
        boolean f2309e;

        C0554a() {
            mo3179b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3176a() {
            this.f2307c = this.f2308d ? this.f2305a.mo3942b() : this.f2305a.mo3950f();
        }

        /* renamed from: a */
        public void mo3177a(View view, int i) {
            this.f2307c = this.f2308d ? this.f2305a.mo3940a(view) + this.f2305a.mo3953h() : this.f2305a.mo3947d(view);
            this.f2306b = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo3178a(View view, C0560a0 a0Var) {
            C0585p pVar = (C0585p) view.getLayoutParams();
            return !pVar.mo3632c() && pVar.mo3630a() >= 0 && pVar.mo3630a() < a0Var.mo3384a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3179b() {
            this.f2306b = -1;
            this.f2307c = RecyclerView.UNDEFINED_DURATION;
            this.f2308d = false;
            this.f2309e = false;
        }

        /* renamed from: b */
        public void mo3180b(View view, int i) {
            int h = this.f2305a.mo3953h();
            if (h >= 0) {
                mo3177a(view, i);
                return;
            }
            this.f2306b = i;
            if (this.f2308d) {
                int b = (this.f2305a.mo3942b() - h) - this.f2305a.mo3940a(view);
                this.f2307c = this.f2305a.mo3942b() - b;
                if (b > 0) {
                    int b2 = this.f2307c - this.f2305a.mo3943b(view);
                    int f = this.f2305a.mo3950f();
                    int min = b2 - (f + Math.min(this.f2305a.mo3947d(view) - f, 0));
                    if (min < 0) {
                        this.f2307c += Math.min(b, -min);
                    }
                }
            } else {
                int d = this.f2305a.mo3947d(view);
                int f2 = d - this.f2305a.mo3950f();
                this.f2307c = d;
                if (f2 > 0) {
                    int b3 = (this.f2305a.mo3942b() - Math.min(0, (this.f2305a.mo3942b() - h) - this.f2305a.mo3940a(view))) - (d + this.f2305a.mo3943b(view));
                    if (b3 < 0) {
                        this.f2307c -= Math.min(f2, -b3);
                    }
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AnchorInfo{mPosition=");
            sb.append(this.f2306b);
            sb.append(", mCoordinate=");
            sb.append(this.f2307c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.f2308d);
            sb.append(", mValid=");
            sb.append(this.f2309e);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    protected static class C0555b {

        /* renamed from: a */
        public int f2310a;

        /* renamed from: b */
        public boolean f2311b;

        /* renamed from: c */
        public boolean f2312c;

        /* renamed from: d */
        public boolean f2313d;

        protected C0555b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3182a() {
            this.f2310a = 0;
            this.f2311b = false;
            this.f2312c = false;
            this.f2313d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    static class C0556c {

        /* renamed from: a */
        boolean f2314a = true;

        /* renamed from: b */
        int f2315b;

        /* renamed from: c */
        int f2316c;

        /* renamed from: d */
        int f2317d;

        /* renamed from: e */
        int f2318e;

        /* renamed from: f */
        int f2319f;

        /* renamed from: g */
        int f2320g;

        /* renamed from: h */
        int f2321h = 0;

        /* renamed from: i */
        int f2322i = 0;

        /* renamed from: j */
        boolean f2323j;

        /* renamed from: k */
        int f2324k;

        /* renamed from: l */
        List<C0566d0> f2325l = null;

        /* renamed from: m */
        boolean f2326m;

        C0556c() {
        }

        /* renamed from: b */
        private View m2955b() {
            int size = this.f2325l.size();
            for (int i = 0; i < size; i++) {
                View view = ((C0566d0) this.f2325l.get(i)).f2358a;
                C0585p pVar = (C0585p) view.getLayoutParams();
                if (!pVar.mo3632c() && this.f2317d == pVar.mo3630a()) {
                    mo3185a(view);
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public View mo3183a(C0592v vVar) {
            if (this.f2325l != null) {
                return m2955b();
            }
            View d = vVar.mo3677d(this.f2317d);
            this.f2317d += this.f2318e;
            return d;
        }

        /* renamed from: a */
        public void mo3184a() {
            mo3185a((View) null);
        }

        /* renamed from: a */
        public void mo3185a(View view) {
            View b = mo3187b(view);
            this.f2317d = b == null ? -1 : ((C0585p) b.getLayoutParams()).mo3630a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo3186a(C0560a0 a0Var) {
            int i = this.f2317d;
            return i >= 0 && i < a0Var.mo3384a();
        }

        /* renamed from: b */
        public View mo3187b(View view) {
            int size = this.f2325l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((C0566d0) this.f2325l.get(i2)).f2358a;
                C0585p pVar = (C0585p) view3.getLayoutParams();
                if (view3 != view && !pVar.mo3632c()) {
                    int a = (pVar.mo3630a() - this.f2317d) * this.f2318e;
                    if (a >= 0 && a < i) {
                        view2 = view3;
                        if (a == 0) {
                            break;
                        }
                        i = a;
                    }
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    public static class C0557d implements Parcelable {
        public static final Creator<C0557d> CREATOR = new C0558a();

        /* renamed from: f */
        int f2327f;

        /* renamed from: g */
        int f2328g;

        /* renamed from: h */
        boolean f2329h;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        static class C0558a implements Creator<C0557d> {
            C0558a() {
            }

            public C0557d createFromParcel(Parcel parcel) {
                return new C0557d(parcel);
            }

            public C0557d[] newArray(int i) {
                return new C0557d[i];
            }
        }

        public C0557d() {
        }

        C0557d(Parcel parcel) {
            this.f2327f = parcel.readInt();
            this.f2328g = parcel.readInt();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f2329h = z;
        }

        public C0557d(C0557d dVar) {
            this.f2327f = dVar.f2327f;
            this.f2328g = dVar.f2328g;
            this.f2329h = dVar.f2329h;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo3188a() {
            return this.f2327f >= 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3189b() {
            this.f2327f = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2327f);
            parcel.writeInt(this.f2328g);
            parcel.writeInt(this.f2329h ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f2297s = 1;
        this.f2301w = false;
        this.f2302x = false;
        this.f2303y = false;
        this.f2304z = true;
        this.f2289A = -1;
        this.f2290B = RecyclerView.UNDEFINED_DURATION;
        this.f2292D = null;
        this.f2293E = new C0554a();
        this.f2294F = new C0555b();
        this.f2295G = 2;
        this.f2296H = new int[2];
        mo3173k(i);
        mo3161a(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2297s = 1;
        this.f2301w = false;
        this.f2302x = false;
        this.f2303y = false;
        this.f2304z = true;
        this.f2289A = -1;
        this.f2290B = RecyclerView.UNDEFINED_DURATION;
        this.f2292D = null;
        this.f2293E = new C0554a();
        this.f2294F = new C0555b();
        this.f2295G = 2;
        this.f2296H = new int[2];
        C0584d a = C0580o.m3113a(context, attributeSet, i, i2);
        mo3173k(a.f2409a);
        mo3161a(a.f2411c);
        mo3120b(a.f2412d);
    }

    /* renamed from: N */
    private View mo3100N() {
        return mo3169e(0, mo3587e());
    }

    /* renamed from: O */
    private View m2868O() {
        return mo3169e(mo3587e() - 1, -1);
    }

    /* renamed from: P */
    private View m2869P() {
        return this.f2302x ? mo3100N() : m2868O();
    }

    /* renamed from: Q */
    private View m2870Q() {
        return this.f2302x ? m2868O() : mo3100N();
    }

    /* renamed from: R */
    private View m2871R() {
        return mo3583d(this.f2302x ? 0 : mo3587e() - 1);
    }

    /* renamed from: S */
    private View m2872S() {
        return mo3583d(this.f2302x ? mo3587e() - 1 : 0);
    }

    /* renamed from: T */
    private void m2873T() {
        this.f2302x = (this.f2297s == 1 || !mo3146K()) ? this.f2301w : !this.f2301w;
    }

    /* renamed from: a */
    private int m2874a(int i, C0592v vVar, C0560a0 a0Var, boolean z) {
        int b = this.f2299u.mo3942b() - i;
        if (b <= 0) {
            return 0;
        }
        int i2 = -mo3166c(-b, vVar, a0Var);
        int i3 = i + i2;
        if (z) {
            int b2 = this.f2299u.mo3942b() - i3;
            if (b2 > 0) {
                this.f2299u.mo3941a(b2);
                return b2 + i2;
            }
        }
        return i2;
    }

    /* renamed from: a */
    private void m2875a(int i, int i2, boolean z, C0560a0 a0Var) {
        int i3;
        this.f2298t.f2326m = mo3148M();
        this.f2298t.f2319f = i;
        int[] iArr = this.f2296H;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        mo3158a(a0Var, iArr);
        int max = Math.max(0, this.f2296H[0]);
        int max2 = Math.max(0, this.f2296H[1]);
        if (i == 1) {
            z2 = true;
        }
        this.f2298t.f2321h = z2 ? max2 : max;
        C0556c cVar = this.f2298t;
        if (!z2) {
            max = max2;
        }
        cVar.f2322i = max;
        if (z2) {
            this.f2298t.f2321h += this.f2299u.mo3944c();
            View R = m2871R();
            C0556c cVar2 = this.f2298t;
            if (this.f2302x) {
                i4 = -1;
            }
            cVar2.f2318e = i4;
            C0556c cVar3 = this.f2298t;
            int l = mo3608l(R);
            C0556c cVar4 = this.f2298t;
            cVar3.f2317d = l + cVar4.f2318e;
            cVar4.f2315b = this.f2299u.mo3940a(R);
            i3 = this.f2299u.mo3940a(R) - this.f2299u.mo3942b();
        } else {
            View S = m2872S();
            this.f2298t.f2321h += this.f2299u.mo3950f();
            C0556c cVar5 = this.f2298t;
            if (!this.f2302x) {
                i4 = -1;
            }
            cVar5.f2318e = i4;
            C0556c cVar6 = this.f2298t;
            int l2 = mo3608l(S);
            C0556c cVar7 = this.f2298t;
            cVar6.f2317d = l2 + cVar7.f2318e;
            cVar7.f2315b = this.f2299u.mo3947d(S);
            i3 = (-this.f2299u.mo3947d(S)) + this.f2299u.mo3950f();
        }
        C0556c cVar8 = this.f2298t;
        cVar8.f2316c = i2;
        if (z) {
            cVar8.f2316c = i2 - i3;
        }
        this.f2298t.f2320g = i3;
    }

    /* renamed from: a */
    private void m2876a(C0554a aVar) {
        mo3126f(aVar.f2306b, aVar.f2307c);
    }

    /* renamed from: a */
    private void m2877a(C0592v vVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo3534a(i3, vVar);
                }
            } else {
                while (i > i2) {
                    mo3534a(i, vVar);
                    i--;
                }
            }
        }
    }

    /* renamed from: a */
    private void m2878a(C0592v vVar, C0556c cVar) {
        if (cVar.f2314a && !cVar.f2326m) {
            int i = cVar.f2320g;
            int i2 = cVar.f2322i;
            if (cVar.f2319f == -1) {
                m2883b(vVar, i, i2);
            } else {
                m2886c(vVar, i, i2);
            }
        }
    }

    /* renamed from: a */
    private boolean m2879a(C0560a0 a0Var, C0554a aVar) {
        boolean z = false;
        if (!a0Var.mo3389d()) {
            int i = this.f2289A;
            if (i != -1) {
                if (i < 0 || i >= a0Var.mo3384a()) {
                    this.f2289A = -1;
                    this.f2290B = RecyclerView.UNDEFINED_DURATION;
                } else {
                    aVar.f2306b = this.f2289A;
                    C0557d dVar = this.f2292D;
                    if (dVar != null && dVar.mo3188a()) {
                        boolean z2 = this.f2292D.f2329h;
                        aVar.f2308d = z2;
                        aVar.f2307c = z2 ? this.f2299u.mo3942b() - this.f2292D.f2328g : this.f2299u.mo3950f() + this.f2292D.f2328g;
                        return true;
                    } else if (this.f2290B == Integer.MIN_VALUE) {
                        View c = mo3167c(this.f2289A);
                        if (c == null) {
                            if (mo3587e() > 0) {
                                if ((this.f2289A < mo3608l(mo3583d(0))) == this.f2302x) {
                                    z = true;
                                }
                                aVar.f2308d = z;
                            }
                            aVar.mo3176a();
                        } else if (this.f2299u.mo3943b(c) > this.f2299u.mo3952g()) {
                            aVar.mo3176a();
                            return true;
                        } else if (this.f2299u.mo3947d(c) - this.f2299u.mo3950f() < 0) {
                            aVar.f2307c = this.f2299u.mo3950f();
                            aVar.f2308d = false;
                            return true;
                        } else if (this.f2299u.mo3942b() - this.f2299u.mo3940a(c) < 0) {
                            aVar.f2307c = this.f2299u.mo3942b();
                            aVar.f2308d = true;
                            return true;
                        } else {
                            aVar.f2307c = aVar.f2308d ? this.f2299u.mo3940a(c) + this.f2299u.mo3953h() : this.f2299u.mo3947d(c);
                        }
                        return true;
                    } else {
                        boolean z3 = this.f2302x;
                        aVar.f2308d = z3;
                        aVar.f2307c = z3 ? this.f2299u.mo3942b() - this.f2290B : this.f2299u.mo3950f() + this.f2290B;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m2880a(C0592v vVar, C0560a0 a0Var, C0554a aVar) {
        boolean z = false;
        if (mo3587e() == 0) {
            return false;
        }
        View g = mo3596g();
        if (g != null && aVar.mo3178a(g, a0Var)) {
            aVar.mo3180b(g, mo3608l(g));
            return true;
        } else if (this.f2300v != this.f2303y) {
            return false;
        } else {
            View h = aVar.f2308d ? m2891h(vVar, a0Var) : m2893i(vVar, a0Var);
            if (h == null) {
                return false;
            }
            aVar.mo3177a(h, mo3608l(h));
            if (!a0Var.mo3389d() && mo3099D()) {
                if (this.f2299u.mo3947d(h) >= this.f2299u.mo3942b() || this.f2299u.mo3940a(h) < this.f2299u.mo3950f()) {
                    z = true;
                }
                if (z) {
                    aVar.f2307c = aVar.f2308d ? this.f2299u.mo3942b() : this.f2299u.mo3950f();
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    private int m2881b(int i, C0592v vVar, C0560a0 a0Var, boolean z) {
        int f = i - this.f2299u.mo3950f();
        if (f <= 0) {
            return 0;
        }
        int i2 = -mo3166c(f, vVar, a0Var);
        int i3 = i + i2;
        if (z) {
            int f2 = i3 - this.f2299u.mo3950f();
            if (f2 > 0) {
                this.f2299u.mo3941a(-f2);
                i2 -= f2;
            }
        }
        return i2;
    }

    /* renamed from: b */
    private void m2882b(C0554a aVar) {
        m2890g(aVar.f2306b, aVar.f2307c);
    }

    /* renamed from: b */
    private void m2883b(C0592v vVar, int i, int i2) {
        int e = mo3587e();
        if (i >= 0) {
            int a = (this.f2299u.mo3939a() - i) + i2;
            if (this.f2302x) {
                for (int i3 = 0; i3 < e; i3++) {
                    View d = mo3583d(i3);
                    if (this.f2299u.mo3947d(d) < a || this.f2299u.mo3951f(d) < a) {
                        m2877a(vVar, 0, i3);
                        return;
                    }
                }
            } else {
                int i4 = e - 1;
                int i5 = i4;
                while (true) {
                    if (i5 < 0) {
                        break;
                    }
                    View d2 = mo3583d(i5);
                    if (this.f2299u.mo3947d(d2) < a || this.f2299u.mo3951f(d2) < a) {
                        m2877a(vVar, i4, i5);
                    } else {
                        i5--;
                    }
                }
                m2877a(vVar, i4, i5);
            }
        }
    }

    /* renamed from: b */
    private void m2884b(C0592v vVar, C0560a0 a0Var, int i, int i2) {
        C0592v vVar2 = vVar;
        C0560a0 a0Var2 = a0Var;
        if (a0Var.mo3390e() && mo3587e() != 0 && !a0Var.mo3389d() && mo3099D()) {
            List<C0566d0> f = vVar.mo3682f();
            int size = f.size();
            int l = mo3608l(mo3583d(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                C0566d0 d0Var = (C0566d0) f.get(i5);
                if (!d0Var.mo3431q()) {
                    char c = 1;
                    if ((d0Var.mo3423i() < l) != this.f2302x) {
                        c = 65535;
                    }
                    int b = this.f2299u.mo3943b(d0Var.f2358a);
                    if (c == 65535) {
                        i3 += b;
                    } else {
                        i4 += b;
                    }
                }
            }
            this.f2298t.f2325l = f;
            if (i3 > 0) {
                m2890g(mo3608l(m2872S()), i);
                C0556c cVar = this.f2298t;
                cVar.f2321h = i3;
                cVar.f2316c = 0;
                cVar.mo3184a();
                mo3150a(vVar2, this.f2298t, a0Var2, false);
            }
            if (i4 > 0) {
                mo3126f(mo3608l(m2871R()), i2);
                C0556c cVar2 = this.f2298t;
                cVar2.f2321h = i4;
                cVar2.f2316c = 0;
                cVar2.mo3184a();
                mo3150a(vVar2, this.f2298t, a0Var2, false);
            }
            this.f2298t.f2325l = null;
        }
    }

    /* renamed from: b */
    private void m2885b(C0592v vVar, C0560a0 a0Var, C0554a aVar) {
        if (!m2879a(a0Var, aVar) && !m2880a(vVar, a0Var, aVar)) {
            aVar.mo3176a();
            aVar.f2306b = this.f2303y ? a0Var.mo3384a() - 1 : 0;
        }
    }

    /* renamed from: c */
    private void m2886c(C0592v vVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int e = mo3587e();
            if (!this.f2302x) {
                int i4 = 0;
                while (true) {
                    if (i4 >= e) {
                        break;
                    }
                    View d = mo3583d(i4);
                    if (this.f2299u.mo3940a(d) > i3 || this.f2299u.mo3949e(d) > i3) {
                        m2877a(vVar, 0, i4);
                    } else {
                        i4++;
                    }
                }
            } else {
                int i5 = e - 1;
                for (int i6 = i5; i6 >= 0; i6--) {
                    View d2 = mo3583d(i6);
                    if (this.f2299u.mo3940a(d2) > i3 || this.f2299u.mo3949e(d2) > i3) {
                        m2877a(vVar, i5, i6);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: f */
    private View m2887f(C0592v vVar, C0560a0 a0Var) {
        return mo3104a(vVar, a0Var, 0, mo3587e(), a0Var.mo3384a());
    }

    /* renamed from: f */
    private void mo3126f(int i, int i2) {
        this.f2298t.f2316c = this.f2299u.mo3942b() - i2;
        this.f2298t.f2318e = this.f2302x ? -1 : 1;
        C0556c cVar = this.f2298t;
        cVar.f2317d = i;
        cVar.f2319f = 1;
        cVar.f2315b = i2;
        cVar.f2320g = RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: g */
    private View m2889g(C0592v vVar, C0560a0 a0Var) {
        return mo3104a(vVar, a0Var, mo3587e() - 1, -1, a0Var.mo3384a());
    }

    /* renamed from: g */
    private void m2890g(int i, int i2) {
        this.f2298t.f2316c = i2 - this.f2299u.mo3950f();
        C0556c cVar = this.f2298t;
        cVar.f2317d = i;
        cVar.f2318e = this.f2302x ? 1 : -1;
        C0556c cVar2 = this.f2298t;
        cVar2.f2319f = -1;
        cVar2.f2315b = i2;
        cVar2.f2320g = RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: h */
    private View m2891h(C0592v vVar, C0560a0 a0Var) {
        return this.f2302x ? m2887f(vVar, a0Var) : m2889g(vVar, a0Var);
    }

    /* renamed from: i */
    private int m2892i(C0560a0 a0Var) {
        if (mo3587e() == 0) {
            return 0;
        }
        mo3141F();
        C0662r rVar = this.f2299u;
        View b = mo3163b(!this.f2304z, true);
        return C0669u.m3811a(a0Var, rVar, b, mo3153a(!this.f2304z, true), this, this.f2304z);
    }

    /* renamed from: i */
    private View m2893i(C0592v vVar, C0560a0 a0Var) {
        return this.f2302x ? m2889g(vVar, a0Var) : m2887f(vVar, a0Var);
    }

    /* renamed from: j */
    private int m2894j(C0560a0 a0Var) {
        if (mo3587e() == 0) {
            return 0;
        }
        mo3141F();
        C0662r rVar = this.f2299u;
        View b = mo3163b(!this.f2304z, true);
        return C0669u.m3812a(a0Var, rVar, b, mo3153a(!this.f2304z, true), this, this.f2304z, this.f2302x);
    }

    /* renamed from: k */
    private int m2895k(C0560a0 a0Var) {
        if (mo3587e() == 0) {
            return 0;
        }
        mo3141F();
        C0662r rVar = this.f2299u;
        View b = mo3163b(!this.f2304z, true);
        return C0669u.m3813b(a0Var, rVar, b, mo3153a(!this.f2304z, true), this, this.f2304z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public boolean mo3139B() {
        return (mo3601i() == 1073741824 || mo3618s() == 1073741824 || !mo3619t()) ? false : true;
    }

    /* renamed from: D */
    public boolean mo3099D() {
        return this.f2292D == null && this.f2300v == this.f2303y;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public C0556c mo3140E() {
        return new C0556c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public void mo3141F() {
        if (this.f2298t == null) {
            this.f2298t = mo3140E();
        }
    }

    /* renamed from: G */
    public int mo3142G() {
        View a = mo3152a(0, mo3587e(), true, false);
        if (a == null) {
            return -1;
        }
        return mo3608l(a);
    }

    /* renamed from: H */
    public int mo3143H() {
        View a = mo3152a(0, mo3587e(), false, true);
        if (a == null) {
            return -1;
        }
        return mo3608l(a);
    }

    /* renamed from: I */
    public int mo3144I() {
        View a = mo3152a(mo3587e() - 1, -1, false, true);
        if (a == null) {
            return -1;
        }
        return mo3608l(a);
    }

    /* renamed from: J */
    public int mo3145J() {
        return this.f2297s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public boolean mo3146K() {
        return mo3605k() == 1;
    }

    /* renamed from: L */
    public boolean mo3147L() {
        return this.f2304z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: M */
    public boolean mo3148M() {
        return this.f2299u.mo3946d() == 0 && this.f2299u.mo3939a() == 0;
    }

    /* renamed from: a */
    public int mo3101a(int i, C0592v vVar, C0560a0 a0Var) {
        if (this.f2297s == 1) {
            return 0;
        }
        return mo3166c(i, vVar, a0Var);
    }

    /* renamed from: a */
    public int mo3149a(C0560a0 a0Var) {
        return m2892i(a0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo3150a(C0592v vVar, C0556c cVar, C0560a0 a0Var, boolean z) {
        int i = cVar.f2316c;
        int i2 = cVar.f2320g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f2320g = i2 + i;
            }
            m2878a(vVar, cVar);
        }
        int i3 = cVar.f2316c + cVar.f2321h;
        C0555b bVar = this.f2294F;
        while (true) {
            if ((!cVar.f2326m && i3 <= 0) || !cVar.mo3186a(a0Var)) {
                break;
            }
            bVar.mo3182a();
            mo3111a(vVar, a0Var, cVar, bVar);
            if (!bVar.f2311b) {
                cVar.f2315b += bVar.f2310a * cVar.f2319f;
                if (!bVar.f2312c || cVar.f2325l != null || !a0Var.mo3389d()) {
                    int i4 = cVar.f2316c;
                    int i5 = bVar.f2310a;
                    cVar.f2316c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f2320g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f2310a;
                    cVar.f2320g = i7;
                    int i8 = cVar.f2316c;
                    if (i8 < 0) {
                        cVar.f2320g = i7 + i8;
                    }
                    m2878a(vVar, cVar);
                }
                if (z && bVar.f2313d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f2316c;
    }

    /* renamed from: a */
    public PointF mo3151a(int i) {
        if (mo3587e() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo3608l(mo3583d(0))) {
            z = true;
        }
        if (z != this.f2302x) {
            i2 = -1;
        }
        return this.f2297s == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo3152a(int i, int i2, boolean z, boolean z2) {
        mo3141F();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return (this.f2297s == 0 ? this.f2393e : this.f2394f).mo3986a(i, i2, i4, i3);
    }

    /* renamed from: a */
    public View mo3103a(View view, int i, C0592v vVar, C0560a0 a0Var) {
        m2873T();
        if (mo3587e() == 0) {
            return null;
        }
        int j = mo3172j(i);
        if (j == Integer.MIN_VALUE) {
            return null;
        }
        mo3141F();
        m2875a(j, (int) (((float) this.f2299u.mo3952g()) * 0.33333334f), false, a0Var);
        C0556c cVar = this.f2298t;
        cVar.f2320g = RecyclerView.UNDEFINED_DURATION;
        cVar.f2314a = false;
        mo3150a(vVar, cVar, a0Var, true);
        View Q = j == -1 ? m2870Q() : m2869P();
        View S = j == -1 ? m2872S() : m2871R();
        if (!S.hasFocusable()) {
            return Q;
        }
        if (Q == null) {
            return null;
        }
        return S;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo3104a(C0592v vVar, C0560a0 a0Var, int i, int i2, int i3) {
        mo3141F();
        int f = this.f2299u.mo3950f();
        int b = this.f2299u.mo3942b();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View d = mo3583d(i);
            int l = mo3608l(d);
            if (l >= 0 && l < i3) {
                if (((C0585p) d.getLayoutParams()).mo3632c()) {
                    if (view2 == null) {
                        view2 = d;
                    }
                } else if (this.f2299u.mo3947d(d) < b && this.f2299u.mo3940a(d) >= f) {
                    return d;
                } else {
                    if (view == null) {
                        view = d;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            view = view2;
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo3153a(boolean z, boolean z2) {
        int e;
        int i;
        if (this.f2302x) {
            e = 0;
            i = mo3587e();
        } else {
            e = mo3587e() - 1;
            i = -1;
        }
        return mo3152a(e, i, z, z2);
    }

    /* renamed from: a */
    public void mo3154a(int i, int i2, C0560a0 a0Var, C0583c cVar) {
        if (this.f2297s != 0) {
            i = i2;
        }
        if (mo3587e() != 0 && i != 0) {
            mo3141F();
            m2875a(i > 0 ? 1 : -1, Math.abs(i), true, a0Var);
            mo3108a(a0Var, this.f2298t, cVar);
        }
    }

    /* renamed from: a */
    public void mo3155a(int i, C0583c cVar) {
        boolean z;
        int i2;
        C0557d dVar = this.f2292D;
        int i3 = -1;
        if (dVar == null || !dVar.mo3188a()) {
            m2873T();
            z = this.f2302x;
            i2 = this.f2289A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            C0557d dVar2 = this.f2292D;
            z = dVar2.f2329h;
            i2 = dVar2.f2327f;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f2295G && i2 >= 0 && i2 < i; i4++) {
            cVar.mo3629a(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: a */
    public void mo3156a(Parcelable parcelable) {
        if (parcelable instanceof C0557d) {
            this.f2292D = (C0557d) parcelable;
            mo3623z();
        }
    }

    /* renamed from: a */
    public void mo3157a(AccessibilityEvent accessibilityEvent) {
        super.mo3157a(accessibilityEvent);
        if (mo3587e() > 0) {
            accessibilityEvent.setFromIndex(mo3143H());
            accessibilityEvent.setToIndex(mo3144I());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3108a(C0560a0 a0Var, C0556c cVar, C0583c cVar2) {
        int i = cVar.f2317d;
        if (i >= 0 && i < a0Var.mo3384a()) {
            cVar2.mo3629a(i, Math.max(0, cVar.f2320g));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3158a(C0560a0 a0Var, int[] iArr) {
        int i;
        int h = mo3170h(a0Var);
        if (this.f2298t.f2319f == -1) {
            i = 0;
        } else {
            i = h;
            h = 0;
        }
        iArr[0] = h;
        iArr[1] = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3110a(C0592v vVar, C0560a0 a0Var, C0554a aVar, int i) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3111a(C0592v vVar, C0560a0 a0Var, C0556c cVar, C0555b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View a = cVar.mo3183a(vVar);
        if (a == null) {
            bVar.f2311b = true;
            return;
        }
        C0585p pVar = (C0585p) a.getLayoutParams();
        if (cVar.f2325l == null) {
            if (this.f2302x == (cVar.f2319f == -1)) {
                mo3567b(a);
            } else {
                mo3568b(a, 0);
            }
        } else {
            if (this.f2302x == (cVar.f2319f == -1)) {
                mo3535a(a);
            } else {
                mo3536a(a, 0);
            }
        }
        mo3537a(a, 0, 0);
        bVar.f2310a = this.f2299u.mo3943b(a);
        if (this.f2297s == 1) {
            if (mo3146K()) {
                i5 = mo3617r() - mo3615p();
                i4 = i5 - this.f2299u.mo3945c(a);
            } else {
                i4 = mo3613o();
                i5 = this.f2299u.mo3945c(a) + i4;
            }
            int i6 = cVar.f2319f;
            int i7 = cVar.f2315b;
            if (i6 == -1) {
                i = i7;
                i2 = i5;
                i3 = i7 - bVar.f2310a;
            } else {
                i3 = i7;
                i2 = i5;
                i = bVar.f2310a + i7;
            }
        } else {
            int q = mo3616q();
            int c = this.f2299u.mo3945c(a) + q;
            int i8 = cVar.f2319f;
            int i9 = cVar.f2315b;
            if (i8 == -1) {
                i2 = i9;
                i3 = q;
                i = c;
                i4 = i9 - bVar.f2310a;
            } else {
                i3 = q;
                i2 = bVar.f2310a + i9;
                i = c;
                i4 = i9;
            }
        }
        mo3538a(a, i4, i3, i2, i);
        if (pVar.mo3632c() || pVar.mo3631b()) {
            bVar.f2312c = true;
        }
        bVar.f2313d = a.hasFocusable();
    }

    /* renamed from: a */
    public void mo3159a(RecyclerView recyclerView, C0560a0 a0Var, int i) {
        C0655m mVar = new C0655m(recyclerView.getContext());
        mVar.mo3706c(i);
        mo3571b((C0597z) mVar);
    }

    /* renamed from: a */
    public void mo3160a(String str) {
        if (this.f2292D == null) {
            super.mo3160a(str);
        }
    }

    /* renamed from: a */
    public void mo3161a(boolean z) {
        mo3160a((String) null);
        if (z != this.f2301w) {
            this.f2301w = z;
            mo3623z();
        }
    }

    /* renamed from: a */
    public boolean mo3162a() {
        return this.f2297s == 0;
    }

    /* renamed from: b */
    public int mo3116b(int i, C0592v vVar, C0560a0 a0Var) {
        if (this.f2297s == 0) {
            return 0;
        }
        return mo3166c(i, vVar, a0Var);
    }

    /* renamed from: b */
    public int mo3117b(C0560a0 a0Var) {
        return m2894j(a0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo3163b(boolean z, boolean z2) {
        int i;
        int e;
        if (this.f2302x) {
            i = mo3587e() - 1;
            e = -1;
        } else {
            i = 0;
            e = mo3587e();
        }
        return mo3152a(i, e, z, z2);
    }

    /* renamed from: b */
    public void mo3164b(RecyclerView recyclerView, C0592v vVar) {
        super.mo3164b(recyclerView, vVar);
        if (this.f2291C) {
            mo3570b(vVar);
            vVar.mo3657a();
        }
    }

    /* renamed from: b */
    public void mo3120b(boolean z) {
        mo3160a((String) null);
        if (this.f2303y != z) {
            this.f2303y = z;
            mo3623z();
        }
    }

    /* renamed from: b */
    public boolean mo3165b() {
        return this.f2297s == 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo3166c(int i, C0592v vVar, C0560a0 a0Var) {
        if (mo3587e() == 0 || i == 0) {
            return 0;
        }
        mo3141F();
        this.f2298t.f2314a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m2875a(i2, abs, true, a0Var);
        C0556c cVar = this.f2298t;
        int a = cVar.f2320g + mo3150a(vVar, cVar, a0Var, false);
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.f2299u.mo3941a(-i);
        this.f2298t.f2324k = i;
        return i;
    }

    /* renamed from: c */
    public int mo3121c(C0560a0 a0Var) {
        return m2895k(a0Var);
    }

    /* renamed from: c */
    public View mo3167c(int i) {
        int e = mo3587e();
        if (e == 0) {
            return null;
        }
        int l = i - mo3608l(mo3583d(0));
        if (l >= 0 && l < e) {
            View d = mo3583d(l);
            if (mo3608l(d) == i) {
                return d;
            }
        }
        return super.mo3167c(i);
    }

    /* renamed from: c */
    public C0585p mo3122c() {
        return new C0585p(-2, -2);
    }

    /* renamed from: d */
    public int mo3168d(C0560a0 a0Var) {
        return m2892i(a0Var);
    }

    /* renamed from: e */
    public int mo3124e(C0560a0 a0Var) {
        return m2894j(a0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public View mo3169e(int i, int i2) {
        int i3;
        int i4;
        mo3141F();
        char c = i2 > i ? 1 : i2 < i ? (char) 65535 : 0;
        if (c == 0) {
            return mo3583d(i);
        }
        if (this.f2299u.mo3947d(mo3583d(i)) < this.f2299u.mo3950f()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return (this.f2297s == 0 ? this.f2393e : this.f2394f).mo3986a(i, i2, i4, i3);
    }

    /* renamed from: e */
    public void mo3125e(C0592v vVar, C0560a0 a0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = -1;
        if (!(this.f2292D == null && this.f2289A == -1) && a0Var.mo3384a() == 0) {
            mo3570b(vVar);
            return;
        }
        C0557d dVar = this.f2292D;
        if (dVar != null && dVar.mo3188a()) {
            this.f2289A = this.f2292D.f2327f;
        }
        mo3141F();
        this.f2298t.f2314a = false;
        m2873T();
        View g = mo3596g();
        if (!this.f2293E.f2309e || this.f2289A != -1 || this.f2292D != null) {
            this.f2293E.mo3179b();
            C0554a aVar = this.f2293E;
            aVar.f2308d = this.f2302x ^ this.f2303y;
            m2885b(vVar, a0Var, aVar);
            this.f2293E.f2309e = true;
        } else if (g != null && (this.f2299u.mo3947d(g) >= this.f2299u.mo3942b() || this.f2299u.mo3940a(g) <= this.f2299u.mo3950f())) {
            this.f2293E.mo3180b(g, mo3608l(g));
        }
        C0556c cVar = this.f2298t;
        cVar.f2319f = cVar.f2324k >= 0 ? 1 : -1;
        int[] iArr = this.f2296H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo3158a(a0Var, iArr);
        int max = Math.max(0, this.f2296H[0]) + this.f2299u.mo3950f();
        int max2 = Math.max(0, this.f2296H[1]) + this.f2299u.mo3944c();
        if (a0Var.mo3389d()) {
            int i9 = this.f2289A;
            if (!(i9 == -1 || this.f2290B == Integer.MIN_VALUE)) {
                View c = mo3167c(i9);
                if (c != null) {
                    if (this.f2302x) {
                        i6 = this.f2299u.mo3942b() - this.f2299u.mo3940a(c);
                        i7 = this.f2290B;
                    } else {
                        i7 = this.f2299u.mo3947d(c) - this.f2299u.mo3950f();
                        i6 = this.f2290B;
                    }
                    int i10 = i6 - i7;
                    if (i10 > 0) {
                        max += i10;
                    } else {
                        max2 -= i10;
                    }
                }
            }
        }
        if (!this.f2293E.f2308d ? !this.f2302x : this.f2302x) {
            i8 = 1;
        }
        mo3110a(vVar, a0Var, this.f2293E, i8);
        mo3545a(vVar);
        this.f2298t.f2326m = mo3148M();
        this.f2298t.f2323j = a0Var.mo3389d();
        this.f2298t.f2322i = 0;
        C0554a aVar2 = this.f2293E;
        if (aVar2.f2308d) {
            m2882b(aVar2);
            C0556c cVar2 = this.f2298t;
            cVar2.f2321h = max;
            mo3150a(vVar, cVar2, a0Var, false);
            C0556c cVar3 = this.f2298t;
            i2 = cVar3.f2315b;
            int i11 = cVar3.f2317d;
            int i12 = cVar3.f2316c;
            if (i12 > 0) {
                max2 += i12;
            }
            m2876a(this.f2293E);
            C0556c cVar4 = this.f2298t;
            cVar4.f2321h = max2;
            cVar4.f2317d += cVar4.f2318e;
            mo3150a(vVar, cVar4, a0Var, false);
            C0556c cVar5 = this.f2298t;
            i = cVar5.f2315b;
            int i13 = cVar5.f2316c;
            if (i13 > 0) {
                m2890g(i11, i2);
                C0556c cVar6 = this.f2298t;
                cVar6.f2321h = i13;
                mo3150a(vVar, cVar6, a0Var, false);
                i2 = this.f2298t.f2315b;
            }
        } else {
            m2876a(aVar2);
            C0556c cVar7 = this.f2298t;
            cVar7.f2321h = max2;
            mo3150a(vVar, cVar7, a0Var, false);
            C0556c cVar8 = this.f2298t;
            i = cVar8.f2315b;
            int i14 = cVar8.f2317d;
            int i15 = cVar8.f2316c;
            if (i15 > 0) {
                max += i15;
            }
            m2882b(this.f2293E);
            C0556c cVar9 = this.f2298t;
            cVar9.f2321h = max;
            cVar9.f2317d += cVar9.f2318e;
            mo3150a(vVar, cVar9, a0Var, false);
            C0556c cVar10 = this.f2298t;
            i2 = cVar10.f2315b;
            int i16 = cVar10.f2316c;
            if (i16 > 0) {
                mo3126f(i14, i);
                C0556c cVar11 = this.f2298t;
                cVar11.f2321h = i16;
                mo3150a(vVar, cVar11, a0Var, false);
                i = this.f2298t.f2315b;
            }
        }
        if (mo3587e() > 0) {
            if (this.f2302x ^ this.f2303y) {
                int a = m2874a(i, vVar, a0Var, true);
                i4 = i2 + a;
                i3 = i + a;
                i5 = m2881b(i4, vVar, a0Var, false);
            } else {
                int b = m2881b(i2, vVar, a0Var, true);
                i4 = i2 + b;
                i3 = i + b;
                i5 = m2874a(i3, vVar, a0Var, false);
            }
            i2 = i4 + i5;
            i = i3 + i5;
        }
        m2884b(vVar, a0Var, i2, i);
        if (!a0Var.mo3389d()) {
            this.f2299u.mo3954i();
        } else {
            this.f2293E.mo3179b();
        }
        this.f2300v = this.f2303y;
    }

    /* renamed from: f */
    public int mo3127f(C0560a0 a0Var) {
        return m2895k(a0Var);
    }

    /* renamed from: g */
    public void mo3128g(C0560a0 a0Var) {
        super.mo3128g(a0Var);
        this.f2292D = null;
        this.f2289A = -1;
        this.f2290B = RecyclerView.UNDEFINED_DURATION;
        this.f2293E.mo3179b();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: h */
    public int mo3170h(C0560a0 a0Var) {
        if (a0Var.mo3388c()) {
            return this.f2299u.mo3952g();
        }
        return 0;
    }

    /* renamed from: i */
    public void mo3171i(int i) {
        this.f2289A = i;
        this.f2290B = RecyclerView.UNDEFINED_DURATION;
        C0557d dVar = this.f2292D;
        if (dVar != null) {
            dVar.mo3189b();
        }
        mo3623z();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo3172j(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.f2297s != 1 && mo3146K()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f2297s != 1 && mo3146K()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.f2297s != 0) {
                i2 = RecyclerView.UNDEFINED_DURATION;
            }
            return i2;
        } else if (i == 33) {
            if (this.f2297s != 1) {
                i2 = RecyclerView.UNDEFINED_DURATION;
            }
            return i2;
        } else if (i == 66) {
            if (this.f2297s != 0) {
                i3 = RecyclerView.UNDEFINED_DURATION;
            }
            return i3;
        } else if (i != 130) {
            return RecyclerView.UNDEFINED_DURATION;
        } else {
            if (this.f2297s != 1) {
                i3 = RecyclerView.UNDEFINED_DURATION;
            }
            return i3;
        }
    }

    /* renamed from: k */
    public void mo3173k(int i) {
        if (i == 0 || i == 1) {
            mo3160a((String) null);
            if (i != this.f2297s || this.f2299u == null) {
                C0662r a = C0662r.m3735a(this, i);
                this.f2299u = a;
                this.f2293E.f2305a = a;
                this.f2297s = i;
                mo3623z();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid orientation:");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: v */
    public boolean mo3174v() {
        return true;
    }

    /* renamed from: y */
    public Parcelable mo3175y() {
        if (this.f2292D != null) {
            return new C0557d(this.f2292D);
        }
        C0557d dVar = new C0557d();
        if (mo3587e() > 0) {
            mo3141F();
            boolean z = this.f2300v ^ this.f2302x;
            dVar.f2329h = z;
            if (z) {
                View R = m2871R();
                dVar.f2328g = this.f2299u.mo3942b() - this.f2299u.mo3940a(R);
                dVar.f2327f = mo3608l(R);
            } else {
                View S = m2872S();
                dVar.f2327f = mo3608l(S);
                dVar.f2328g = this.f2299u.mo3947d(S) - this.f2299u.mo3950f();
            }
        } else {
            dVar.mo3189b();
        }
        return dVar;
    }
}
