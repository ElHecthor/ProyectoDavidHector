package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment.C0420g;
import androidx.lifecycle.C0510d0;
import androidx.lifecycle.C0514h.C0516b;
import p071f.p097h.p108m.C3379v;
import p071f.p120m.C3448b;

/* renamed from: androidx.fragment.app.q */
class C0463q {

    /* renamed from: a */
    private final C0443k f2074a;

    /* renamed from: b */
    private final Fragment f2075b;

    /* renamed from: c */
    private int f2076c = -1;

    /* renamed from: androidx.fragment.app.q$a */
    static /* synthetic */ class C0464a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2077a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.lifecycle.h$b[] r0 = androidx.lifecycle.C0514h.C0516b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2077a = r0
                androidx.lifecycle.h$b r1 = androidx.lifecycle.C0514h.C0516b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2077a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.h$b r1 = androidx.lifecycle.C0514h.C0516b.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2077a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.h$b r1 = androidx.lifecycle.C0514h.C0516b.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0463q.C0464a.<clinit>():void");
        }
    }

    C0463q(C0443k kVar, Fragment fragment) {
        this.f2074a = kVar;
        this.f2075b = fragment;
    }

    C0463q(C0443k kVar, Fragment fragment, C0461p pVar) {
        this.f2074a = kVar;
        this.f2075b = fragment;
        fragment.f1885h = null;
        fragment.f1899v = 0;
        fragment.f1896s = false;
        fragment.f1893p = false;
        Fragment fragment2 = fragment.f1889l;
        fragment.f1890m = fragment2 != null ? fragment2.f1887j : null;
        Fragment fragment3 = this.f2075b;
        fragment3.f1889l = null;
        Bundle bundle = pVar.f2073r;
        if (bundle == null) {
            bundle = new Bundle();
        }
        fragment3.f1884g = bundle;
    }

    C0463q(C0443k kVar, ClassLoader classLoader, C0440h hVar, C0461p pVar) {
        this.f2074a = kVar;
        this.f2075b = hVar.mo2728a(classLoader, pVar.f2061f);
        Bundle bundle = pVar.f2070o;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        this.f2075b.mo2566m(pVar.f2070o);
        Fragment fragment = this.f2075b;
        fragment.f1887j = pVar.f2062g;
        fragment.f1895r = pVar.f2063h;
        fragment.f1897t = true;
        fragment.f1857A = pVar.f2064i;
        fragment.f1858B = pVar.f2065j;
        fragment.f1859C = pVar.f2066k;
        fragment.f1862F = pVar.f2067l;
        fragment.f1894q = pVar.f2068m;
        fragment.f1861E = pVar.f2069n;
        fragment.f1860D = pVar.f2071p;
        fragment.f1877U = C0516b.values()[pVar.f2072q];
        Bundle bundle2 = pVar.f2073r;
        if (bundle2 != null) {
            this.f2075b.f1884g = bundle2;
        } else {
            this.f2075b.f1884g = new Bundle();
        }
        if (C0445l.m2390d(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(this.f2075b);
            Log.v("FragmentManager", sb.toString());
        }
    }

    /* renamed from: n */
    private Bundle m2514n() {
        Bundle bundle = new Bundle();
        this.f2075b.mo2557j(bundle);
        this.f2074a.mo2745d(this.f2075b, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f2075b.f1868L != null) {
            mo2888k();
        }
        if (this.f2075b.f1885h != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f2075b.f1885h);
        }
        if (!this.f2075b.f1870N) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f2075b.f1870N);
        }
        return bundle;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2872a() {
        if (C0445l.m2390d(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ACTIVITY_CREATED: ");
            sb.append(this.f2075b);
            Log.d("FragmentManager", sb.toString());
        }
        Fragment fragment = this.f2075b;
        fragment.mo2544g(fragment.f1884g);
        C0443k kVar = this.f2074a;
        Fragment fragment2 = this.f2075b;
        kVar.mo2735a(fragment2, fragment2.f1884g, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2873a(int i) {
        this.f2076c = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2874a(C0438f fVar) {
        String str;
        if (!this.f2075b.f1895r) {
            if (C0445l.m2390d(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.f2075b);
                Log.d("FragmentManager", sb.toString());
            }
            ViewGroup viewGroup = null;
            Fragment fragment = this.f2075b;
            ViewGroup viewGroup2 = fragment.f1867K;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i = fragment.f1858B;
                if (i != 0) {
                    if (i != -1) {
                        viewGroup = (ViewGroup) fVar.mo2593a(i);
                        if (viewGroup == null) {
                            Fragment fragment2 = this.f2075b;
                            if (!fragment2.f1897t) {
                                try {
                                    str = fragment2.mo2461A().getResourceName(this.f2075b.f1858B);
                                } catch (NotFoundException unused) {
                                    str = "unknown";
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("No view found for id 0x");
                                sb2.append(Integer.toHexString(this.f2075b.f1858B));
                                sb2.append(" (");
                                sb2.append(str);
                                sb2.append(") for fragment ");
                                sb2.append(this.f2075b);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Cannot create fragment ");
                        sb3.append(this.f2075b);
                        sb3.append(" for a container view with no id");
                        throw new IllegalArgumentException(sb3.toString());
                    }
                }
            }
            Fragment fragment3 = this.f2075b;
            fragment3.f1867K = viewGroup;
            fragment3.mo2517b(fragment3.mo2552i(fragment3.f1884g), viewGroup, this.f2075b.f1884g);
            View view = this.f2075b.f1868L;
            if (view != null) {
                boolean z = false;
                view.setSaveFromParentEnabled(false);
                Fragment fragment4 = this.f2075b;
                fragment4.f1868L.setTag(C3448b.fragment_container_view_tag, fragment4);
                if (viewGroup != null) {
                    viewGroup.addView(this.f2075b.f1868L);
                }
                Fragment fragment5 = this.f2075b;
                if (fragment5.f1860D) {
                    fragment5.f1868L.setVisibility(8);
                }
                C3379v.m13773I(this.f2075b.f1868L);
                Fragment fragment6 = this.f2075b;
                fragment6.mo2506a(fragment6.f1868L, fragment6.f1884g);
                C0443k kVar = this.f2074a;
                Fragment fragment7 = this.f2075b;
                kVar.mo2736a(fragment7, fragment7.f1868L, fragment7.f1884g, false);
                Fragment fragment8 = this.f2075b;
                if (fragment8.f1868L.getVisibility() == 0 && this.f2075b.f1867K != null) {
                    z = true;
                }
                fragment8.f1872P = z;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2875a(C0441i<?> iVar, C0445l lVar, Fragment fragment) {
        Fragment fragment2 = this.f2075b;
        fragment2.f1901x = iVar;
        fragment2.f1903z = fragment;
        fragment2.f1900w = lVar;
        this.f2074a.mo2740b(fragment2, iVar.mo2730f(), false);
        this.f2075b.mo2538e0();
        Fragment fragment3 = this.f2075b;
        Fragment fragment4 = fragment3.f1903z;
        if (fragment4 == null) {
            iVar.mo2687a(fragment3);
        } else {
            fragment4.mo2509a(fragment3);
        }
        this.f2074a.mo2734a(this.f2075b, iVar.mo2730f(), false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2876a(C0441i<?> iVar, C0459o oVar) {
        if (C0445l.m2390d(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATED: ");
            sb.append(this.f2075b);
            Log.d("FragmentManager", sb.toString());
        }
        Fragment fragment = this.f2075b;
        boolean z = true;
        boolean z2 = fragment.f1894q && !fragment.mo2475O();
        if (z2 || oVar.mo2863f(this.f2075b)) {
            if (iVar instanceof C0510d0) {
                z = oVar.mo2860d();
            } else if (iVar.mo2730f() instanceof Activity) {
                z = true ^ ((Activity) iVar.mo2730f()).isChangingConfigurations();
            }
            if (z2 || z) {
                oVar.mo2856b(this.f2075b);
            }
            this.f2075b.mo2543f0();
            this.f2074a.mo2737a(this.f2075b, false);
            return;
        }
        this.f2075b.f1883f = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2877a(C0459o oVar) {
        String str = "FragmentManager";
        if (C0445l.m2390d(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom ATTACHED: ");
            sb.append(this.f2075b);
            Log.d(str, sb.toString());
        }
        this.f2075b.mo2550h0();
        boolean z = false;
        this.f2074a.mo2742b(this.f2075b, false);
        Fragment fragment = this.f2075b;
        fragment.f1883f = -1;
        fragment.f1901x = null;
        fragment.f1903z = null;
        fragment.f1900w = null;
        if (fragment.f1894q && !fragment.mo2475O()) {
            z = true;
        }
        if (z || oVar.mo2863f(this.f2075b)) {
            if (C0445l.m2390d(3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("initState called for fragment: ");
                sb2.append(this.f2075b);
                Log.d(str, sb2.toString());
            }
            this.f2075b.mo2471K();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2878a(ClassLoader classLoader) {
        Bundle bundle = this.f2075b.f1884g;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f2075b;
            fragment.f1885h = fragment.f1884g.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f2075b;
            fragment2.f1890m = fragment2.f1884g.getString("android:target_state");
            Fragment fragment3 = this.f2075b;
            if (fragment3.f1890m != null) {
                fragment3.f1891n = fragment3.f1884g.getInt("android:target_req_state", 0);
            }
            Fragment fragment4 = this.f2075b;
            Boolean bool = fragment4.f1886i;
            if (bool != null) {
                fragment4.f1870N = bool.booleanValue();
                this.f2075b.f1886i = null;
            } else {
                fragment4.f1870N = fragment4.f1884g.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment5 = this.f2075b;
            if (!fragment5.f1870N) {
                fragment5.f1869M = true;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo2879b() {
        int i = this.f2076c;
        Fragment fragment = this.f2075b;
        if (fragment.f1895r) {
            i = fragment.f1896s ? Math.max(i, 1) : i < 2 ? Math.min(i, fragment.f1883f) : Math.min(i, 1);
        }
        if (!this.f2075b.f1893p) {
            i = Math.min(i, 1);
        }
        Fragment fragment2 = this.f2075b;
        if (fragment2.f1894q) {
            i = fragment2.mo2475O() ? Math.min(i, 1) : Math.min(i, -1);
        }
        Fragment fragment3 = this.f2075b;
        if (fragment3.f1869M && fragment3.f1883f < 3) {
            i = Math.min(i, 2);
        }
        int i2 = C0464a.f2077a[this.f2075b.f1877U.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? Math.min(i, -1) : Math.min(i, 1) : Math.min(i, 3) : i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2880c() {
        if (C0445l.m2390d(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATED: ");
            sb.append(this.f2075b);
            Log.d("FragmentManager", sb.toString());
        }
        Fragment fragment = this.f2075b;
        if (!fragment.f1876T) {
            this.f2074a.mo2743c(fragment, fragment.f1884g, false);
            Fragment fragment2 = this.f2075b;
            fragment2.mo2548h(fragment2.f1884g);
            C0443k kVar = this.f2074a;
            Fragment fragment3 = this.f2075b;
            kVar.mo2741b(fragment3, fragment3.f1884g, false);
            return;
        }
        fragment.mo2560k(fragment.f1884g);
        this.f2075b.f1883f = 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2881d() {
        Fragment fragment = this.f2075b;
        if (fragment.f1895r && fragment.f1896s && !fragment.f1898u) {
            if (C0445l.m2390d(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.f2075b);
                Log.d("FragmentManager", sb.toString());
            }
            Fragment fragment2 = this.f2075b;
            fragment2.mo2517b(fragment2.mo2552i(fragment2.f1884g), (ViewGroup) null, this.f2075b.f1884g);
            View view = this.f2075b.f1868L;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f2075b;
                fragment3.f1868L.setTag(C3448b.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f2075b;
                if (fragment4.f1860D) {
                    fragment4.f1868L.setVisibility(8);
                }
                Fragment fragment5 = this.f2075b;
                fragment5.mo2506a(fragment5.f1868L, fragment5.f1884g);
                C0443k kVar = this.f2074a;
                Fragment fragment6 = this.f2075b;
                kVar.mo2736a(fragment6, fragment6.f1868L, fragment6.f1884g, false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public Fragment mo2882e() {
        return this.f2075b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo2883f() {
        if (C0445l.m2390d(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom RESUMED: ");
            sb.append(this.f2075b);
            Log.d("FragmentManager", sb.toString());
        }
        this.f2075b.mo2558j0();
        this.f2074a.mo2744c(this.f2075b, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo2884g() {
        if (C0445l.m2390d(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESTORE_VIEW_STATE: ");
            sb.append(this.f2075b);
            Log.d("FragmentManager", sb.toString());
        }
        Fragment fragment = this.f2075b;
        if (fragment.f1868L != null) {
            fragment.mo2563l(fragment.f1884g);
        }
        this.f2075b.f1884g = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo2885h() {
        if (C0445l.m2390d(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESUMED: ");
            sb.append(this.f2075b);
            Log.d("FragmentManager", sb.toString());
        }
        this.f2075b.mo2564l0();
        this.f2074a.mo2746d(this.f2075b, false);
        Fragment fragment = this.f2075b;
        fragment.f1884g = null;
        fragment.f1885h = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public C0420g mo2886i() {
        if (this.f2075b.f1883f <= -1) {
            return null;
        }
        Bundle n = m2514n();
        if (n != null) {
            return new C0420g(n);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public C0461p mo2887j() {
        C0461p pVar = new C0461p(this.f2075b);
        if (this.f2075b.f1883f <= -1 || pVar.f2073r != null) {
            pVar.f2073r = this.f2075b.f1884g;
        } else {
            Bundle n = m2514n();
            pVar.f2073r = n;
            if (this.f2075b.f1890m != null) {
                if (n == null) {
                    pVar.f2073r = new Bundle();
                }
                pVar.f2073r.putString("android:target_state", this.f2075b.f1890m);
                int i = this.f2075b.f1891n;
                if (i != 0) {
                    pVar.f2073r.putInt("android:target_req_state", i);
                }
            }
        }
        return pVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo2888k() {
        if (this.f2075b.f1868L != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f2075b.f1868L.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f2075b.f1885h = sparseArray;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo2889l() {
        if (C0445l.m2390d(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto STARTED: ");
            sb.append(this.f2075b);
            Log.d("FragmentManager", sb.toString());
        }
        this.f2075b.mo2567m0();
        this.f2074a.mo2747e(this.f2075b, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo2890m() {
        if (C0445l.m2390d(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom STARTED: ");
            sb.append(this.f2075b);
            Log.d("FragmentManager", sb.toString());
        }
        this.f2075b.mo2569n0();
        this.f2074a.mo2748f(this.f2075b, false);
    }
}
