package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.C0368m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p071f.p088e.C3162a;
import p071f.p097h.p104i.C3277a;
import p071f.p097h.p108m.C3376s;
import p071f.p097h.p108m.C3379v;

/* renamed from: androidx.fragment.app.t */
class C0468t {

    /* renamed from: a */
    private static final int[] f2104a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    private static final C0483v f2105b = (VERSION.SDK_INT >= 21 ? new C0477u() : null);

    /* renamed from: c */
    private static final C0483v f2106c = m2574a();

    /* renamed from: androidx.fragment.app.t$a */
    static class C0469a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0475g f2107f;

        /* renamed from: g */
        final /* synthetic */ Fragment f2108g;

        /* renamed from: h */
        final /* synthetic */ C3277a f2109h;

        C0469a(C0475g gVar, Fragment fragment, C3277a aVar) {
            this.f2107f = gVar;
            this.f2108g = fragment;
            this.f2109h = aVar;
        }

        public void run() {
            this.f2107f.mo2827a(this.f2108g, this.f2109h);
        }
    }

    /* renamed from: androidx.fragment.app.t$b */
    static class C0470b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2110f;

        C0470b(ArrayList arrayList) {
            this.f2110f = arrayList;
        }

        public void run() {
            C0468t.m2593a(this.f2110f, 4);
        }
    }

    /* renamed from: androidx.fragment.app.t$c */
    static class C0471c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0475g f2111f;

        /* renamed from: g */
        final /* synthetic */ Fragment f2112g;

        /* renamed from: h */
        final /* synthetic */ C3277a f2113h;

        C0471c(C0475g gVar, Fragment fragment, C3277a aVar) {
            this.f2111f = gVar;
            this.f2112g = fragment;
            this.f2113h = aVar;
        }

        public void run() {
            this.f2111f.mo2827a(this.f2112g, this.f2113h);
        }
    }

    /* renamed from: androidx.fragment.app.t$d */
    static class C0472d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Object f2114f;

        /* renamed from: g */
        final /* synthetic */ C0483v f2115g;

        /* renamed from: h */
        final /* synthetic */ View f2116h;

        /* renamed from: i */
        final /* synthetic */ Fragment f2117i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f2118j;

        /* renamed from: k */
        final /* synthetic */ ArrayList f2119k;

        /* renamed from: l */
        final /* synthetic */ ArrayList f2120l;

        /* renamed from: m */
        final /* synthetic */ Object f2121m;

        C0472d(Object obj, C0483v vVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f2114f = obj;
            this.f2115g = vVar;
            this.f2116h = view;
            this.f2117i = fragment;
            this.f2118j = arrayList;
            this.f2119k = arrayList2;
            this.f2120l = arrayList3;
            this.f2121m = obj2;
        }

        public void run() {
            Object obj = this.f2114f;
            if (obj != null) {
                this.f2115g.mo2937b(obj, this.f2116h);
                this.f2119k.addAll(C0468t.m2583a(this.f2115g, this.f2114f, this.f2117i, this.f2118j, this.f2116h));
            }
            if (this.f2120l != null) {
                if (this.f2121m != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f2116h);
                    this.f2115g.mo2933a(this.f2121m, this.f2120l, arrayList);
                }
                this.f2120l.clear();
                this.f2120l.add(this.f2116h);
            }
        }
    }

    /* renamed from: androidx.fragment.app.t$e */
    static class C0473e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Fragment f2122f;

        /* renamed from: g */
        final /* synthetic */ Fragment f2123g;

        /* renamed from: h */
        final /* synthetic */ boolean f2124h;

        /* renamed from: i */
        final /* synthetic */ C3162a f2125i;

        /* renamed from: j */
        final /* synthetic */ View f2126j;

        /* renamed from: k */
        final /* synthetic */ C0483v f2127k;

        /* renamed from: l */
        final /* synthetic */ Rect f2128l;

        C0473e(Fragment fragment, Fragment fragment2, boolean z, C3162a aVar, View view, C0483v vVar, Rect rect) {
            this.f2122f = fragment;
            this.f2123g = fragment2;
            this.f2124h = z;
            this.f2125i = aVar;
            this.f2126j = view;
            this.f2127k = vVar;
            this.f2128l = rect;
        }

        public void run() {
            C0468t.m2584a(this.f2122f, this.f2123g, this.f2124h, this.f2125i, false);
            View view = this.f2126j;
            if (view != null) {
                this.f2127k.mo2960a(view, this.f2128l);
            }
        }
    }

    /* renamed from: androidx.fragment.app.t$f */
    static class C0474f implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0483v f2129f;

        /* renamed from: g */
        final /* synthetic */ C3162a f2130g;

        /* renamed from: h */
        final /* synthetic */ Object f2131h;

        /* renamed from: i */
        final /* synthetic */ C0476h f2132i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f2133j;

        /* renamed from: k */
        final /* synthetic */ View f2134k;

        /* renamed from: l */
        final /* synthetic */ Fragment f2135l;

        /* renamed from: m */
        final /* synthetic */ Fragment f2136m;

        /* renamed from: n */
        final /* synthetic */ boolean f2137n;

        /* renamed from: o */
        final /* synthetic */ ArrayList f2138o;

        /* renamed from: p */
        final /* synthetic */ Object f2139p;

        /* renamed from: q */
        final /* synthetic */ Rect f2140q;

        C0474f(C0483v vVar, C3162a aVar, Object obj, C0476h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f2129f = vVar;
            this.f2130g = aVar;
            this.f2131h = obj;
            this.f2132i = hVar;
            this.f2133j = arrayList;
            this.f2134k = view;
            this.f2135l = fragment;
            this.f2136m = fragment2;
            this.f2137n = z;
            this.f2138o = arrayList2;
            this.f2139p = obj2;
            this.f2140q = rect;
        }

        public void run() {
            C3162a a = C0468t.m2577a(this.f2129f, this.f2130g, this.f2131h, this.f2132i);
            if (a != null) {
                this.f2133j.addAll(a.values());
                this.f2133j.add(this.f2134k);
            }
            C0468t.m2584a(this.f2135l, this.f2136m, this.f2137n, a, false);
            Object obj = this.f2131h;
            if (obj != null) {
                this.f2129f.mo2939b(obj, this.f2138o, this.f2133j);
                View a2 = C0468t.m2572a(a, this.f2132i, this.f2139p, this.f2137n);
                if (a2 != null) {
                    this.f2129f.mo2960a(a2, this.f2140q);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.t$g */
    interface C0475g {
        /* renamed from: a */
        void mo2827a(Fragment fragment, C3277a aVar);

        /* renamed from: b */
        void mo2828b(Fragment fragment, C3277a aVar);
    }

    /* renamed from: androidx.fragment.app.t$h */
    static class C0476h {

        /* renamed from: a */
        public Fragment f2141a;

        /* renamed from: b */
        public boolean f2142b;

        /* renamed from: c */
        public C0422a f2143c;

        /* renamed from: d */
        public Fragment f2144d;

        /* renamed from: e */
        public boolean f2145e;

        /* renamed from: f */
        public C0422a f2146f;

        C0476h() {
        }
    }

    /* renamed from: a */
    static View m2572a(C3162a<String, View> aVar, C0476h hVar, Object obj, boolean z) {
        C0422a aVar2 = hVar.f2143c;
        if (!(obj == null || aVar == null)) {
            ArrayList<String> arrayList = aVar2.f2092m;
            if (arrayList != null && !arrayList.isEmpty()) {
                return (View) aVar.get((String) (z ? aVar2.f2092m : aVar2.f2093n).get(0));
            }
        }
        return null;
    }

    /* renamed from: a */
    private static C0476h m2573a(C0476h hVar, SparseArray<C0476h> sparseArray, int i) {
        if (hVar != null) {
            return hVar;
        }
        C0476h hVar2 = new C0476h();
        sparseArray.put(i, hVar2);
        return hVar2;
    }

    /* renamed from: a */
    private static C0483v m2574a() {
        try {
            return (C0483v) Class.forName("f.v.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static C0483v m2575a(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object q = fragment.mo2577q();
            if (q != null) {
                arrayList.add(q);
            }
            Object C = fragment.mo2463C();
            if (C != null) {
                arrayList.add(C);
            }
            Object E = fragment.mo2465E();
            if (E != null) {
                arrayList.add(E);
            }
        }
        if (fragment2 != null) {
            Object o = fragment2.mo2570o();
            if (o != null) {
                arrayList.add(o);
            }
            Object z = fragment2.mo2590z();
            if (z != null) {
                arrayList.add(z);
            }
            Object D = fragment2.mo2464D();
            if (D != null) {
                arrayList.add(D);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C0483v vVar = f2105b;
        if (vVar != null && m2595a(vVar, (List<Object>) arrayList)) {
            return f2105b;
        }
        C0483v vVar2 = f2106c;
        if (vVar2 != null && m2595a(vVar2, (List<Object>) arrayList)) {
            return f2106c;
        }
        if (f2105b == null && f2106c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    private static C3162a<String, String> m2576a(int i, ArrayList<C0422a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList arrayList4;
        C3162a<String, String> aVar = new C3162a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0422a aVar2 = (C0422a) arrayList.get(i4);
            if (aVar2.mo2633b(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f2092m;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f2092m;
                        arrayList4 = aVar2.f2093n;
                    } else {
                        ArrayList arrayList6 = aVar2.f2092m;
                        arrayList3 = aVar2.f2093n;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList4.get(i5);
                        String str2 = (String) arrayList3.get(i5);
                        String str3 = (String) aVar.remove(str2);
                        if (str3 != null) {
                            aVar.put(str, str3);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: a */
    static C3162a<String, View> m2577a(C0483v vVar, C3162a<String, String> aVar, Object obj, C0476h hVar) {
        C0368m mVar;
        ArrayList<String> arrayList;
        Fragment fragment = hVar.f2141a;
        View I = fragment.mo2469I();
        if (aVar.isEmpty() || obj == null || I == null) {
            aVar.clear();
            return null;
        }
        C3162a<String, View> aVar2 = new C3162a<>();
        vVar.mo2965a((Map<String, View>) aVar2, I);
        C0422a aVar3 = hVar.f2143c;
        if (hVar.f2142b) {
            mVar = fragment.mo2579r();
            arrayList = aVar3.f2092m;
        } else {
            mVar = fragment.mo2575p();
            arrayList = aVar3.f2093n;
        }
        if (arrayList != null) {
            aVar2.mo10148a(arrayList);
            aVar2.mo10148a(aVar.values());
        }
        if (mVar != null) {
            mVar.mo2226a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view = (View) aVar2.get(str);
                if (view == null) {
                    String a = m2582a(aVar, str);
                    if (a != null) {
                        aVar.remove(a);
                    }
                } else if (!str.equals(C3379v.m13835v(view))) {
                    String a2 = m2582a(aVar, str);
                    if (a2 != null) {
                        aVar.put(a2, C3379v.m13835v(view));
                    }
                }
            }
        } else {
            m2592a(aVar, aVar2);
        }
        return aVar2;
    }

    /* renamed from: a */
    private static Object m2578a(C0483v vVar, ViewGroup viewGroup, View view, C3162a<String, String> aVar, C0476h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C3162a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        C0483v vVar2 = vVar;
        C0476h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = hVar2.f2141a;
        Fragment fragment2 = hVar2.f2144d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.f2142b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = m2579a(vVar2, fragment, fragment2, z);
            aVar2 = aVar;
        }
        C3162a b = m2596b(vVar2, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(b.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m2584a(fragment, fragment2, z, b, true);
        if (obj4 != null) {
            rect = new Rect();
            vVar2.mo2938b(obj4, view, arrayList3);
            m2591a(vVar, obj4, obj2, b, hVar2.f2145e, hVar2.f2146f);
            if (obj5 != null) {
                vVar2.mo2928a(obj5, rect);
            }
        } else {
            rect = null;
        }
        C0474f fVar = r0;
        C0474f fVar2 = new C0474f(vVar, aVar, obj4, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect);
        C3376s.m13761a(viewGroup, fVar);
        return obj4;
    }

    /* renamed from: a */
    private static Object m2579a(C0483v vVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return vVar.mo2940c(vVar.mo2935b(z ? fragment2.mo2465E() : fragment.mo2464D()));
    }

    /* renamed from: a */
    private static Object m2580a(C0483v vVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return vVar.mo2935b(z ? fragment.mo2590z() : fragment.mo2570o());
    }

    /* renamed from: a */
    private static Object m2581a(C0483v vVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2 = (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.mo2554i() : fragment.mo2546g();
        return z2 ? vVar.mo2936b(obj2, obj, obj3) : vVar.mo2925a(obj2, obj, obj3);
    }

    /* renamed from: a */
    private static String m2582a(C3162a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.mo10274d(i))) {
                return (String) aVar.mo10271b(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    static ArrayList<View> m2583a(C0483v vVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View I = fragment.mo2469I();
        if (I != null) {
            vVar.mo2964a(arrayList2, I);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        vVar.mo2932a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    static void m2584a(Fragment fragment, Fragment fragment2, boolean z, C3162a<String, View> aVar, boolean z2) {
        C0368m p = z ? fragment2.mo2575p() : fragment.mo2575p();
        if (p != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(aVar.mo10271b(i));
                arrayList.add(aVar.mo10274d(i));
            }
            if (z2) {
                p.mo2227b(arrayList2, arrayList, null);
            } else {
                p.mo2225a(arrayList2, arrayList, null);
            }
        }
    }

    /* renamed from: a */
    public static void m2585a(C0422a aVar, SparseArray<C0476h> sparseArray, boolean z) {
        int size = aVar.f2080a.size();
        for (int i = 0; i < size; i++) {
            m2586a(aVar, (C0467a) aVar.f2080a.get(i), sparseArray, false, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        if (r0.f1893p != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x006c, code lost:
        if (r0.f1874R >= 0.0f) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0076, code lost:
        if (r0.f1860D == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0088, code lost:
        if (r0.f1860D == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008a, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0098  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m2586a(androidx.fragment.app.C0422a r8, androidx.fragment.app.C0466s.C0467a r9, android.util.SparseArray<androidx.fragment.app.C0468t.C0476h> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.f2097b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.f1858B
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = f2104a
            int r9 = r9.f2096a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.f2096a
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L_0x007d
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x007d
            r9 = 0
        L_0x0029:
            r4 = 0
            r5 = 0
            goto L_0x0090
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.f1873Q
            if (r9 == 0) goto L_0x008c
            boolean r9 = r0.f1860D
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.f1893p
            if (r9 == 0) goto L_0x008c
            goto L_0x008a
        L_0x003c:
            boolean r9 = r0.f1860D
            goto L_0x008d
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.f1873Q
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f1893p
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f1860D
            if (r9 == 0) goto L_0x0070
        L_0x004d:
            goto L_0x006e
        L_0x004e:
            boolean r9 = r0.f1893p
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f1860D
            if (r9 != 0) goto L_0x0070
            goto L_0x004d
        L_0x0057:
            boolean r9 = r0.f1893p
            if (r12 == 0) goto L_0x0072
            if (r9 != 0) goto L_0x0070
            android.view.View r9 = r0.f1868L
            if (r9 == 0) goto L_0x0070
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0070
            float r9 = r0.f1874R
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0070
        L_0x006e:
            r9 = 1
            goto L_0x0079
        L_0x0070:
            r9 = 0
            goto L_0x0079
        L_0x0072:
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f1860D
            if (r9 != 0) goto L_0x0070
            goto L_0x006e
        L_0x0079:
            r5 = r9
            r9 = 0
            r4 = 1
            goto L_0x0090
        L_0x007d:
            if (r12 == 0) goto L_0x0082
            boolean r9 = r0.f1872P
            goto L_0x008d
        L_0x0082:
            boolean r9 = r0.f1893p
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.f1860D
            if (r9 != 0) goto L_0x008c
        L_0x008a:
            r9 = 1
            goto L_0x008d
        L_0x008c:
            r9 = 0
        L_0x008d:
            r2 = r9
            r9 = 1
            goto L_0x0029
        L_0x0090:
            java.lang.Object r6 = r10.get(r1)
            androidx.fragment.app.t$h r6 = (androidx.fragment.app.C0468t.C0476h) r6
            if (r2 == 0) goto L_0x00a2
            androidx.fragment.app.t$h r6 = m2573a(r6, r10, r1)
            r6.f2141a = r0
            r6.f2142b = r11
            r6.f2143c = r8
        L_0x00a2:
            r2 = 0
            if (r12 != 0) goto L_0x00c3
            if (r9 == 0) goto L_0x00c3
            if (r6 == 0) goto L_0x00af
            androidx.fragment.app.Fragment r9 = r6.f2144d
            if (r9 != r0) goto L_0x00af
            r6.f2144d = r2
        L_0x00af:
            androidx.fragment.app.l r9 = r8.f1930q
            int r7 = r0.f1883f
            if (r7 >= r3) goto L_0x00c3
            int r7 = r9.f2022n
            if (r7 < r3) goto L_0x00c3
            boolean r7 = r8.f2094o
            if (r7 != 0) goto L_0x00c3
            r9.mo2799h(r0)
            r9.mo2762a(r0, r3)
        L_0x00c3:
            if (r5 == 0) goto L_0x00d5
            if (r6 == 0) goto L_0x00cb
            androidx.fragment.app.Fragment r9 = r6.f2144d
            if (r9 != 0) goto L_0x00d5
        L_0x00cb:
            androidx.fragment.app.t$h r6 = m2573a(r6, r10, r1)
            r6.f2144d = r0
            r6.f2145e = r11
            r6.f2146f = r8
        L_0x00d5:
            if (r12 != 0) goto L_0x00e1
            if (r4 == 0) goto L_0x00e1
            if (r6 == 0) goto L_0x00e1
            androidx.fragment.app.Fragment r8 = r6.f2141a
            if (r8 != r0) goto L_0x00e1
            r6.f2141a = r2
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0468t.m2586a(androidx.fragment.app.a, androidx.fragment.app.s$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a */
    private static void m2587a(C0445l lVar, int i, C0476h hVar, View view, C3162a<String, String> aVar, C0475g gVar) {
        Object obj;
        C0445l lVar2 = lVar;
        C0476h hVar2 = hVar;
        View view2 = view;
        C3162a<String, String> aVar2 = aVar;
        C0475g gVar2 = gVar;
        ViewGroup viewGroup = lVar2.f2024p.mo2594d() ? (ViewGroup) lVar2.f2024p.mo2593a(i) : null;
        if (viewGroup != null) {
            Fragment fragment = hVar2.f2141a;
            Fragment fragment2 = hVar2.f2144d;
            C0483v a = m2575a(fragment2, fragment);
            if (a != null) {
                boolean z = hVar2.f2142b;
                boolean z2 = hVar2.f2145e;
                Object a2 = m2580a(a, fragment, z);
                Object b = m2598b(a, fragment2, z2);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = arrayList;
                Object obj2 = b;
                Object obj3 = a2;
                C0483v vVar = a;
                Fragment fragment3 = fragment2;
                Object a3 = m2578a(a, viewGroup, view, aVar, hVar, arrayList3, arrayList2, obj3, obj2);
                Object obj4 = obj3;
                if (obj4 == null && a3 == null) {
                    obj = obj2;
                    if (obj == null) {
                        return;
                    }
                } else {
                    obj = obj2;
                }
                ArrayList arrayList4 = arrayList3;
                ArrayList a4 = m2583a(vVar, obj, fragment3, arrayList4, view2);
                Object obj5 = (a4 == null || a4.isEmpty()) ? null : obj;
                vVar.mo2929a(obj4, view2);
                Object a5 = m2581a(vVar, obj4, obj5, a3, fragment, hVar2.f2142b);
                if (!(fragment3 == null || a4 == null || (a4.size() <= 0 && arrayList4.size() <= 0))) {
                    C3277a aVar3 = new C3277a();
                    gVar2.mo2828b(fragment3, aVar3);
                    vVar.mo2927a(fragment3, a5, aVar3, new C0471c(gVar2, fragment3, aVar3));
                }
                if (a5 != null) {
                    ArrayList arrayList5 = new ArrayList();
                    C0483v vVar2 = vVar;
                    vVar2.mo2931a(a5, obj4, arrayList5, obj5, a4, a3, arrayList2);
                    m2589a(vVar2, viewGroup, fragment, view, arrayList2, obj4, arrayList5, obj5, a4);
                    ArrayList arrayList6 = arrayList2;
                    C3162a<String, String> aVar4 = aVar;
                    vVar.mo2962a((View) viewGroup, arrayList6, (Map<String, String>) aVar4);
                    vVar.mo2926a(viewGroup, a5);
                    vVar.mo2963a(viewGroup, arrayList6, (Map<String, String>) aVar4);
                }
            }
        }
    }

    /* renamed from: a */
    static void m2588a(C0445l lVar, ArrayList<C0422a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, C0475g gVar) {
        C0445l lVar2 = lVar;
        ArrayList<C0422a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i3 = i2;
        boolean z2 = z;
        if (lVar2.f2022n >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i4 = i; i4 < i3; i4++) {
                C0422a aVar = (C0422a) arrayList3.get(i4);
                if (((Boolean) arrayList4.get(i4)).booleanValue()) {
                    m2599b(aVar, sparseArray, z2);
                } else {
                    m2585a(aVar, sparseArray, z2);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(lVar2.f2023o.mo2730f());
                int size = sparseArray.size();
                for (int i5 = 0; i5 < size; i5++) {
                    int keyAt = sparseArray.keyAt(i5);
                    C3162a a = m2576a(keyAt, arrayList3, arrayList4, i, i3);
                    C0476h hVar = (C0476h) sparseArray.valueAt(i5);
                    C0445l lVar3 = lVar;
                    View view2 = view;
                    C0475g gVar2 = gVar;
                    if (z2) {
                        m2600b(lVar3, keyAt, hVar, view2, a, gVar2);
                    } else {
                        m2587a(lVar3, keyAt, hVar, view2, a, gVar2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m2589a(C0483v vVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        C0472d dVar = new C0472d(obj, vVar, view, fragment, arrayList, arrayList2, arrayList3, obj2);
        ViewGroup viewGroup2 = viewGroup;
        C3376s.m13761a(viewGroup, dVar);
    }

    /* renamed from: a */
    private static void m2590a(C0483v vVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f1893p && fragment.f1860D && fragment.f1873Q) {
            fragment.mo2545g(true);
            vVar.mo2930a(obj, fragment.mo2469I(), arrayList);
            C3376s.m13761a(fragment.f1867K, new C0470b(arrayList));
        }
    }

    /* renamed from: a */
    private static void m2591a(C0483v vVar, Object obj, Object obj2, C3162a<String, View> aVar, boolean z, C0422a aVar2) {
        ArrayList<String> arrayList = aVar2.f2092m;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = (View) aVar.get((String) (z ? aVar2.f2093n : aVar2.f2092m).get(0));
            vVar.mo2941c(obj, view);
            if (obj2 != null) {
                vVar.mo2941c(obj2, view);
            }
        }
    }

    /* renamed from: a */
    private static void m2592a(C3162a<String, String> aVar, C3162a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey((String) aVar.mo10274d(size))) {
                aVar.mo5347c(size);
            }
        }
    }

    /* renamed from: a */
    static void m2593a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    private static void m2594a(ArrayList<View> arrayList, C3162a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.mo10274d(size);
            if (collection.contains(C3379v.m13835v(view))) {
                arrayList.add(view);
            }
        }
    }

    /* renamed from: a */
    private static boolean m2595a(C0483v vVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!vVar.mo2934a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static C3162a<String, View> m2596b(C0483v vVar, C3162a<String, String> aVar, Object obj, C0476h hVar) {
        C0368m mVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f2144d;
        C3162a<String, View> aVar2 = new C3162a<>();
        vVar.mo2965a((Map<String, View>) aVar2, fragment.mo2578q0());
        C0422a aVar3 = hVar.f2146f;
        if (hVar.f2145e) {
            mVar = fragment.mo2575p();
            arrayList = aVar3.f2093n;
        } else {
            mVar = fragment.mo2579r();
            arrayList = aVar3.f2092m;
        }
        if (arrayList != null) {
            aVar2.mo10148a(arrayList);
        }
        if (mVar != null) {
            mVar.mo2226a(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view = (View) aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(C3379v.m13835v(view))) {
                    aVar.put(C3379v.m13835v(view), (String) aVar.remove(str));
                }
            }
        } else {
            aVar.mo10148a(aVar2.keySet());
        }
        return aVar2;
    }

    /* renamed from: b */
    private static Object m2597b(C0483v vVar, ViewGroup viewGroup, View view, C3162a<String, String> aVar, C0476h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        C0483v vVar2 = vVar;
        View view3 = view;
        C3162a<String, String> aVar2 = aVar;
        C0476h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj4 = obj;
        Fragment fragment = hVar2.f2141a;
        Fragment fragment2 = hVar2.f2144d;
        if (fragment != null) {
            fragment.mo2578q0().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.f2142b;
        Object a = aVar.isEmpty() ? null : m2579a(vVar, fragment, fragment2, z);
        C3162a b = m2596b(vVar, aVar2, a, hVar2);
        C3162a a2 = m2577a(vVar, aVar2, a, hVar2);
        if (aVar.isEmpty()) {
            if (b != null) {
                b.clear();
            }
            if (a2 != null) {
                a2.clear();
            }
            obj3 = null;
        } else {
            m2594a(arrayList3, b, (Collection<String>) aVar.keySet());
            m2594a(arrayList4, a2, aVar.values());
            obj3 = a;
        }
        if (obj4 == null && obj2 == null && obj3 == null) {
            return null;
        }
        m2584a(fragment, fragment2, z, b, true);
        if (obj3 != null) {
            arrayList4.add(view3);
            vVar.mo2938b(obj3, view3, arrayList3);
            m2591a(vVar, obj3, obj2, b, hVar2.f2145e, hVar2.f2146f);
            Rect rect2 = new Rect();
            View a3 = m2572a(a2, hVar2, obj4, z);
            if (a3 != null) {
                vVar.mo2928a(obj4, rect2);
            }
            rect = rect2;
            view2 = a3;
        } else {
            view2 = null;
            rect = null;
        }
        C0473e eVar = new C0473e(fragment, fragment2, z, a2, view2, vVar, rect);
        C3376s.m13761a(viewGroup, eVar);
        return obj3;
    }

    /* renamed from: b */
    private static Object m2598b(C0483v vVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return vVar.mo2935b(z ? fragment.mo2463C() : fragment.mo2577q());
    }

    /* renamed from: b */
    public static void m2599b(C0422a aVar, SparseArray<C0476h> sparseArray, boolean z) {
        if (aVar.f1930q.f2024p.mo2594d()) {
            for (int size = aVar.f2080a.size() - 1; size >= 0; size--) {
                m2586a(aVar, (C0467a) aVar.f2080a.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: b */
    private static void m2600b(C0445l lVar, int i, C0476h hVar, View view, C3162a<String, String> aVar, C0475g gVar) {
        Object obj;
        C0445l lVar2 = lVar;
        C0476h hVar2 = hVar;
        View view2 = view;
        C0475g gVar2 = gVar;
        ViewGroup viewGroup = lVar2.f2024p.mo2594d() ? (ViewGroup) lVar2.f2024p.mo2593a(i) : null;
        if (viewGroup != null) {
            Fragment fragment = hVar2.f2141a;
            Fragment fragment2 = hVar2.f2144d;
            C0483v a = m2575a(fragment2, fragment);
            if (a != null) {
                boolean z = hVar2.f2142b;
                boolean z2 = hVar2.f2145e;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Object a2 = m2580a(a, fragment, z);
                Object b = m2598b(a, fragment2, z2);
                Object obj2 = a2;
                ViewGroup viewGroup2 = viewGroup;
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = arrayList;
                Object b2 = m2597b(a, viewGroup, view, aVar, hVar, arrayList2, arrayList, obj2, b);
                Object obj3 = obj2;
                if (obj3 == null && b2 == null) {
                    obj = b;
                    if (obj == null) {
                        return;
                    }
                } else {
                    obj = b;
                }
                ArrayList a3 = m2583a(a, obj, fragment2, arrayList3, view2);
                ArrayList a4 = m2583a(a, obj3, fragment, arrayList4, view2);
                m2593a(a4, 4);
                Fragment fragment3 = fragment;
                ArrayList arrayList5 = a3;
                Object a5 = m2581a(a, obj3, obj, b2, fragment3, z);
                if (!(fragment2 == null || arrayList5 == null || (arrayList5.size() <= 0 && arrayList3.size() <= 0))) {
                    C3277a aVar2 = new C3277a();
                    C0475g gVar3 = gVar;
                    gVar3.mo2828b(fragment2, aVar2);
                    a.mo2927a(fragment2, a5, aVar2, new C0469a(gVar3, fragment2, aVar2));
                }
                if (a5 != null) {
                    m2590a(a, obj, fragment2, arrayList5);
                    ArrayList a6 = a.mo2959a(arrayList4);
                    a.mo2931a(a5, obj3, a4, obj, arrayList5, b2, arrayList4);
                    ViewGroup viewGroup3 = viewGroup2;
                    a.mo2926a(viewGroup3, a5);
                    a.mo2961a(viewGroup3, arrayList3, arrayList4, a6, aVar);
                    m2593a(a4, 0);
                    a.mo2939b(b2, arrayList3, arrayList4);
                }
            }
        }
    }
}
