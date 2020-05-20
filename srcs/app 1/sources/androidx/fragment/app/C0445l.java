package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.C0045b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment.C0420g;
import androidx.lifecycle.C0508c0;
import androidx.lifecycle.C0514h.C0516b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p071f.p088e.C3164b;
import p071f.p097h.p104i.C3277a;
import p071f.p097h.p107l.C3315b;
import p071f.p120m.C3448b;

/* renamed from: androidx.fragment.app.l */
public abstract class C0445l {

    /* renamed from: F */
    private static boolean f2003F = false;

    /* renamed from: A */
    private ArrayList<Boolean> f2004A;

    /* renamed from: B */
    private ArrayList<Fragment> f2005B;

    /* renamed from: C */
    private ArrayList<C0455j> f2006C;

    /* renamed from: D */
    private C0459o f2007D;

    /* renamed from: E */
    private Runnable f2008E = new C0449d();

    /* renamed from: a */
    private final ArrayList<C0453h> f2009a = new ArrayList<>();

    /* renamed from: b */
    private boolean f2010b;

    /* renamed from: c */
    private final C0465r f2011c = new C0465r();

    /* renamed from: d */
    ArrayList<C0422a> f2012d;

    /* renamed from: e */
    private ArrayList<Fragment> f2013e;

    /* renamed from: f */
    private final C0442j f2014f = new C0442j(this);

    /* renamed from: g */
    private OnBackPressedDispatcher f2015g;

    /* renamed from: h */
    private final C0045b f2016h = new C0446a(false);

    /* renamed from: i */
    private final AtomicInteger f2017i = new AtomicInteger();

    /* renamed from: j */
    private ArrayList<C0452g> f2018j;

    /* renamed from: k */
    private ConcurrentHashMap<Fragment, HashSet<C3277a>> f2019k = new ConcurrentHashMap<>();

    /* renamed from: l */
    private final C0475g f2020l = new C0447b();

    /* renamed from: m */
    private final C0443k f2021m = new C0443k(this);

    /* renamed from: n */
    int f2022n = -1;

    /* renamed from: o */
    C0441i<?> f2023o;

    /* renamed from: p */
    C0438f f2024p;

    /* renamed from: q */
    private Fragment f2025q;

    /* renamed from: r */
    Fragment f2026r;

    /* renamed from: s */
    private C0440h f2027s = null;

    /* renamed from: t */
    private C0440h f2028t = new C0448c();

    /* renamed from: u */
    private boolean f2029u;

    /* renamed from: v */
    private boolean f2030v;

    /* renamed from: w */
    private boolean f2031w;

    /* renamed from: x */
    private boolean f2032x;

    /* renamed from: y */
    private boolean f2033y;

    /* renamed from: z */
    private ArrayList<C0422a> f2034z;

    /* renamed from: androidx.fragment.app.l$a */
    class C0446a extends C0045b {
        C0446a(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public void mo130a() {
            C0445l.this.mo2821u();
        }
    }

    /* renamed from: androidx.fragment.app.l$b */
    class C0447b implements C0475g {
        C0447b() {
        }

        /* renamed from: a */
        public void mo2827a(Fragment fragment, C3277a aVar) {
            if (!aVar.mo10627b()) {
                C0445l.this.mo2780b(fragment, aVar);
            }
        }

        /* renamed from: b */
        public void mo2828b(Fragment fragment, C3277a aVar) {
            C0445l.this.mo2764a(fragment, aVar);
        }
    }

    /* renamed from: androidx.fragment.app.l$c */
    class C0448c extends C0440h {
        C0448c() {
        }

        /* renamed from: a */
        public Fragment mo2728a(ClassLoader classLoader, String str) {
            C0441i<?> iVar = C0445l.this.f2023o;
            return iVar.mo2703a(iVar.mo2730f(), str, null);
        }
    }

    /* renamed from: androidx.fragment.app.l$d */
    class C0449d implements Runnable {
        C0449d() {
        }

        public void run() {
            C0445l.this.mo2789c(true);
        }
    }

    /* renamed from: androidx.fragment.app.l$e */
    class C0450e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f2039a;

        /* renamed from: b */
        final /* synthetic */ View f2040b;

        /* renamed from: c */
        final /* synthetic */ Fragment f2041c;

        C0450e(C0445l lVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2039a = viewGroup;
            this.f2040b = view;
            this.f2041c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2039a.endViewTransition(this.f2040b);
            animator.removeListener(this);
            Fragment fragment = this.f2041c;
            View view = fragment.f1868L;
            if (view != null && fragment.f1860D) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: androidx.fragment.app.l$f */
    public static abstract class C0451f {
        /* renamed from: a */
        public void mo2831a(C0445l lVar, Fragment fragment) {
        }

        /* renamed from: a */
        public void mo2832a(C0445l lVar, Fragment fragment, Context context) {
        }

        /* renamed from: a */
        public void mo2833a(C0445l lVar, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: a */
        public abstract void mo2834a(C0445l lVar, Fragment fragment, View view, Bundle bundle);

        /* renamed from: b */
        public void mo2835b(C0445l lVar, Fragment fragment) {
        }

        /* renamed from: b */
        public void mo2836b(C0445l lVar, Fragment fragment, Context context) {
        }

        /* renamed from: b */
        public void mo2837b(C0445l lVar, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: c */
        public void mo2838c(C0445l lVar, Fragment fragment) {
        }

        /* renamed from: c */
        public void mo2839c(C0445l lVar, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: d */
        public void mo2840d(C0445l lVar, Fragment fragment) {
        }

        /* renamed from: d */
        public void mo2841d(C0445l lVar, Fragment fragment, Bundle bundle) {
        }

        /* renamed from: e */
        public void mo2842e(C0445l lVar, Fragment fragment) {
        }

        /* renamed from: f */
        public void mo2843f(C0445l lVar, Fragment fragment) {
        }

        /* renamed from: g */
        public void mo2844g(C0445l lVar, Fragment fragment) {
        }
    }

    /* renamed from: androidx.fragment.app.l$g */
    public interface C0452g {
        /* renamed from: a */
        void mo2845a();
    }

    /* renamed from: androidx.fragment.app.l$h */
    interface C0453h {
        /* renamed from: a */
        boolean mo2628a(ArrayList<C0422a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.l$i */
    private class C0454i implements C0453h {

        /* renamed from: a */
        final String f2042a;

        /* renamed from: b */
        final int f2043b;

        /* renamed from: c */
        final int f2044c;

        C0454i(String str, int i, int i2) {
            this.f2042a = str;
            this.f2043b = i;
            this.f2044c = i2;
        }

        /* renamed from: a */
        public boolean mo2628a(ArrayList<C0422a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = C0445l.this.f2026r;
            if (fragment != null && this.f2043b < 0 && this.f2042a == null && fragment.mo2565m().mo2825y()) {
                return false;
            }
            return C0445l.this.mo2776a(arrayList, arrayList2, this.f2042a, this.f2043b, this.f2044c);
        }
    }

    /* renamed from: androidx.fragment.app.l$j */
    static class C0455j implements C0419f {

        /* renamed from: a */
        final boolean f2046a;

        /* renamed from: b */
        final C0422a f2047b;

        /* renamed from: c */
        private int f2048c;

        C0455j(C0422a aVar, boolean z) {
            this.f2046a = z;
            this.f2047b = aVar;
        }

        /* renamed from: a */
        public void mo2595a() {
            int i = this.f2048c - 1;
            this.f2048c = i;
            if (i == 0) {
                this.f2047b.f1930q.mo2750A();
            }
        }

        /* renamed from: b */
        public void mo2596b() {
            this.f2048c++;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo2846c() {
            C0422a aVar = this.f2047b;
            aVar.f1930q.mo2767a(aVar, this.f2046a, false, false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo2847d() {
            boolean z = this.f2048c > 0;
            for (Fragment fragment : this.f2047b.f1930q.mo2814p()) {
                fragment.mo2507a((C0419f) null);
                if (z && fragment.mo2476P()) {
                    fragment.mo2580r0();
                }
            }
            C0422a aVar = this.f2047b;
            aVar.f1930q.mo2767a(aVar, this.f2046a, !z, true);
        }

        /* renamed from: e */
        public boolean mo2848e() {
            return this.f2048c == 0;
        }
    }

    /* renamed from: B */
    private void m2368B() {
        if (mo2823w()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: C */
    private void m2369C() {
        this.f2010b = false;
        this.f2004A.clear();
        this.f2034z.clear();
    }

    /* renamed from: D */
    private void m2370D() {
        if (this.f2033y) {
            this.f2033y = false;
            m2374H();
        }
    }

    /* renamed from: E */
    private void m2371E() {
        if (!this.f2019k.isEmpty()) {
            for (Fragment fragment : this.f2019k.keySet()) {
                m2392q(fragment);
                mo2762a(fragment, fragment.mo2466F());
            }
        }
    }

    /* renamed from: F */
    private void m2372F() {
        if (this.f2006C != null) {
            while (!this.f2006C.isEmpty()) {
                ((C0455j) this.f2006C.remove(0)).mo2847d();
            }
        }
    }

    /* renamed from: G */
    private void m2373G() {
        if (this.f2018j != null) {
            for (int i = 0; i < this.f2018j.size(); i++) {
                ((C0452g) this.f2018j.get(i)).mo2845a();
            }
        }
    }

    /* renamed from: H */
    private void m2374H() {
        for (Fragment fragment : this.f2011c.mo2901b()) {
            if (fragment != null) {
                mo2805k(fragment);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (mo2810n() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (mo2797g(r3.f2025q) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.mo132a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f2016h;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2375I() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.l$h> r0 = r3.f2009a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.l$h> r1 = r3.f2009a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.b r1 = r3.f2016h     // Catch:{ all -> 0x002a }
            r1.mo132a(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.b r0 = r3.f2016h
            int r1 = r3.mo2810n()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.f2025q
            boolean r1 = r3.mo2797g(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.mo132a(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0445l.m2375I():void");
    }

    /* renamed from: a */
    private int m2376a(ArrayList<C0422a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C3164b<Fragment> bVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0422a aVar = (C0422a) arrayList.get(i4);
            boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
            if (aVar.mo2641i() && !aVar.mo2627a(arrayList, i4 + 1, i2)) {
                if (this.f2006C == null) {
                    this.f2006C = new ArrayList<>();
                }
                C0455j jVar = new C0455j(aVar, booleanValue);
                this.f2006C.add(jVar);
                aVar.mo2624a((C0419f) jVar);
                if (booleanValue) {
                    aVar.mo2639g();
                } else {
                    aVar.mo2636c(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, aVar);
                }
                m2379a(bVar);
            }
        }
        return i3;
    }

    /* renamed from: a */
    static Fragment m2377a(View view) {
        Object tag = view.getTag(C3448b.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* renamed from: a */
    private void m2378a(C0463q qVar) {
        Fragment e = qVar.mo2882e();
        if (this.f2011c.mo2897a(e.f1887j)) {
            if (m2390d(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Removed fragment from active set ");
                sb.append(e);
                Log.v("FragmentManager", sb.toString());
            }
            this.f2011c.mo2902b(qVar);
            mo2809m(e);
        }
    }

    /* renamed from: a */
    private void m2379a(C3164b<Fragment> bVar) {
        int i = this.f2022n;
        if (i >= 1) {
            int min = Math.min(i, 3);
            for (Fragment fragment : this.f2011c.mo2904c()) {
                if (fragment.f1883f < min) {
                    mo2762a(fragment, min);
                    if (fragment.f1868L != null && !fragment.f1860D && fragment.f1872P) {
                        bVar.add(fragment);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m2380a(RuntimeException runtimeException) {
        String str = "FragmentManager";
        Log.e(str, runtimeException.getMessage());
        Log.e(str, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C3315b(str));
        C0441i<?> iVar = this.f2023o;
        String str2 = "Failed dumping state";
        String str3 = "  ";
        if (iVar != null) {
            try {
                iVar.mo2689a(str3, (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e(str, str2, e);
            }
        } else {
            mo2772a(str3, (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0077, code lost:
        if (((java.lang.Boolean) r9.get(r5)).booleanValue() != false) goto L_0x003c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2381a(java.util.ArrayList<androidx.fragment.app.C0422a> r8, java.util.ArrayList<java.lang.Boolean> r9) {
        /*
            r7 = this;
            java.util.ArrayList<androidx.fragment.app.l$j> r0 = r7.f2006C
            r1 = 0
            if (r0 != 0) goto L_0x0007
            r0 = 0
            goto L_0x000b
        L_0x0007:
            int r0 = r0.size()
        L_0x000b:
            r2 = 0
        L_0x000c:
            if (r2 >= r0) goto L_0x0080
            java.util.ArrayList<androidx.fragment.app.l$j> r3 = r7.f2006C
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.l$j r3 = (androidx.fragment.app.C0445l.C0455j) r3
            r4 = -1
            if (r8 == 0) goto L_0x0040
            boolean r5 = r3.f2046a
            if (r5 != 0) goto L_0x0040
            androidx.fragment.app.a r5 = r3.f2047b
            int r5 = r8.indexOf(r5)
            if (r5 == r4) goto L_0x0040
            if (r9 == 0) goto L_0x0040
            java.lang.Object r5 = r9.get(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0040
            java.util.ArrayList<androidx.fragment.app.l$j> r4 = r7.f2006C
            r4.remove(r2)
            int r2 = r2 + -1
            int r0 = r0 + -1
        L_0x003c:
            r3.mo2846c()
            goto L_0x007d
        L_0x0040:
            boolean r5 = r3.mo2848e()
            if (r5 != 0) goto L_0x0054
            if (r8 == 0) goto L_0x007d
            androidx.fragment.app.a r5 = r3.f2047b
            int r6 = r8.size()
            boolean r5 = r5.mo2627a(r8, r1, r6)
            if (r5 == 0) goto L_0x007d
        L_0x0054:
            java.util.ArrayList<androidx.fragment.app.l$j> r5 = r7.f2006C
            r5.remove(r2)
            int r2 = r2 + -1
            int r0 = r0 + -1
            if (r8 == 0) goto L_0x007a
            boolean r5 = r3.f2046a
            if (r5 != 0) goto L_0x007a
            androidx.fragment.app.a r5 = r3.f2047b
            int r5 = r8.indexOf(r5)
            if (r5 == r4) goto L_0x007a
            if (r9 == 0) goto L_0x007a
            java.lang.Object r4 = r9.get(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x007a
            goto L_0x003c
        L_0x007a:
            r3.mo2847d()
        L_0x007d:
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0445l.m2381a(java.util.ArrayList, java.util.ArrayList):void");
    }

    /* renamed from: a */
    private static void m2382a(ArrayList<C0422a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0422a aVar = (C0422a) arrayList.get(i);
            boolean z = true;
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                aVar.mo2622a(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                aVar.mo2636c(z);
            } else {
                aVar.mo2622a(1);
                aVar.mo2639g();
            }
            i++;
        }
    }

    /* renamed from: a */
    private boolean m2383a(String str, int i, int i2) {
        mo2789c(false);
        m2389d(true);
        Fragment fragment = this.f2026r;
        if (fragment != null && i < 0 && str == null && fragment.mo2565m().mo2825y()) {
            return true;
        }
        boolean a = mo2776a(this.f2034z, this.f2004A, str, i, i2);
        if (a) {
            this.f2010b = true;
            try {
                m2388c(this.f2034z, this.f2004A);
            } finally {
                m2369C();
            }
        }
        m2375I();
        m2370D();
        this.f2011c.mo2891a();
        return a;
    }

    /* renamed from: b */
    private void m2384b(C3164b<Fragment> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) bVar.mo10170f(i);
            if (!fragment.f1893p) {
                View q0 = fragment.mo2578q0();
                fragment.f1874R = q0.getAlpha();
                q0.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: b */
    private void m2385b(ArrayList<C0422a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        ArrayList<C0422a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i4 = i;
        int i5 = i2;
        boolean z = ((C0422a) arrayList3.get(i4)).f2094o;
        ArrayList<Fragment> arrayList5 = this.f2005B;
        if (arrayList5 == null) {
            this.f2005B = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f2005B.addAll(this.f2011c.mo2904c());
        Fragment t = mo2819t();
        boolean z2 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C0422a aVar = (C0422a) arrayList3.get(i6);
            t = !((Boolean) arrayList4.get(i6)).booleanValue() ? aVar.mo2619a(this.f2005B, t) : aVar.mo2631b(this.f2005B, t);
            z2 = z2 || aVar.f2086g;
        }
        this.f2005B.clear();
        if (!z) {
            C0468t.m2588a(this, arrayList, arrayList2, i, i2, false, this.f2020l);
        }
        m2382a(arrayList, arrayList2, i, i2);
        if (z) {
            C3164b bVar = new C3164b();
            m2379a(bVar);
            int a = m2376a(arrayList, arrayList2, i, i2, bVar);
            m2384b(bVar);
            i3 = a;
        } else {
            i3 = i5;
        }
        if (i3 != i4 && z) {
            C0468t.m2588a(this, arrayList, arrayList2, i, i3, true, this.f2020l);
            mo2756a(this.f2022n, true);
        }
        while (i4 < i5) {
            C0422a aVar2 = (C0422a) arrayList3.get(i4);
            if (((Boolean) arrayList4.get(i4)).booleanValue() && aVar2.f1932s >= 0) {
                aVar2.f1932s = -1;
            }
            aVar2.mo2642j();
            i4++;
        }
        if (z2) {
            m2373G();
        }
    }

    /* renamed from: b */
    private boolean m2386b(ArrayList<C0422a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f2009a) {
            if (this.f2009a.isEmpty()) {
                return false;
            }
            boolean z = false;
            for (int i = 0; i < this.f2009a.size(); i++) {
                z |= ((C0453h) this.f2009a.get(i)).mo2628a(arrayList, arrayList2);
            }
            this.f2009a.clear();
            this.f2023o.mo2731g().removeCallbacks(this.f2008E);
            return z;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    private void m2387c(int i) {
        try {
            this.f2010b = true;
            this.f2011c.mo2892a(i);
            mo2756a(i, false);
            this.f2010b = false;
            mo2789c(true);
        } catch (Throwable th) {
            this.f2010b = false;
            throw th;
        }
    }

    /* renamed from: c */
    private void m2388c(ArrayList<C0422a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                m2381a(arrayList, arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!((C0422a) arrayList.get(i)).f2094o) {
                        if (i2 != i) {
                            m2385b(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (((Boolean) arrayList2.get(i)).booleanValue()) {
                            while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0422a) arrayList.get(i2)).f2094o) {
                                i2++;
                            }
                        }
                        m2385b(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    m2385b(arrayList, arrayList2, i2, size);
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* renamed from: d */
    private void m2389d(boolean z) {
        if (this.f2010b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f2023o == null) {
            if (this.f2032x) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f2023o.mo2731g().getLooper()) {
            if (!z) {
                m2368B();
            }
            if (this.f2034z == null) {
                this.f2034z = new ArrayList<>();
                this.f2004A = new ArrayList<>();
            }
            this.f2010b = true;
            try {
                m2381a(null, null);
            } finally {
                this.f2010b = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: d */
    static boolean m2390d(int i) {
        return f2003F || Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: e */
    static int m2391e(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: q */
    private void m2392q(Fragment fragment) {
        HashSet hashSet = (HashSet) this.f2019k.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((C3277a) it.next()).mo10625a();
            }
            hashSet.clear();
            m2394s(fragment);
            this.f2019k.remove(fragment);
        }
    }

    /* renamed from: r */
    private void m2393r(Fragment fragment) {
        if (fragment.f1868L != null) {
            C0436d a = C0431e.m2305a(this.f2023o.mo2730f(), this.f2024p, fragment, !fragment.f1860D);
            if (a != null) {
                Animator animator = a.f1986b;
                if (animator != null) {
                    animator.setTarget(fragment.f1868L);
                    if (!fragment.f1860D) {
                        fragment.f1868L.setVisibility(0);
                    } else if (fragment.mo2474N()) {
                        fragment.mo2545g(false);
                    } else {
                        ViewGroup viewGroup = fragment.f1867K;
                        View view = fragment.f1868L;
                        viewGroup.startViewTransition(view);
                        a.f1986b.addListener(new C0450e(this, viewGroup, view, fragment));
                    }
                    a.f1986b.start();
                }
            }
            if (a != null) {
                fragment.f1868L.startAnimation(a.f1985a);
                a.f1985a.start();
            }
            fragment.f1868L.setVisibility((!fragment.f1860D || fragment.mo2474N()) ? 0 : 8);
            if (fragment.mo2474N()) {
                fragment.mo2545g(false);
            }
        }
        if (fragment.f1893p && m2398w(fragment)) {
            this.f2029u = true;
        }
        fragment.f1873Q = false;
        fragment.mo2511a(fragment.f1860D);
    }

    /* renamed from: s */
    private void m2394s(Fragment fragment) {
        fragment.mo2547g0();
        this.f2021m.mo2749g(fragment, false);
        fragment.f1867K = null;
        fragment.f1868L = null;
        fragment.f1879W = null;
        fragment.f1880X.mo2981b(null);
        fragment.f1896s = false;
    }

    /* renamed from: t */
    private void m2395t(Fragment fragment) {
        if (fragment != null && fragment.equals(mo2754a(fragment.f1887j))) {
            fragment.mo2561k0();
        }
    }

    /* renamed from: u */
    private C0459o m2396u(Fragment fragment) {
        return this.f2007D.mo2857c(fragment);
    }

    /* renamed from: v */
    private ViewGroup m2397v(Fragment fragment) {
        if (fragment.f1858B > 0 && this.f2024p.mo2594d()) {
            View a = this.f2024p.mo2593a(fragment.f1858B);
            if (a instanceof ViewGroup) {
                return (ViewGroup) a;
            }
        }
        return null;
    }

    /* renamed from: w */
    private boolean m2398w(Fragment fragment) {
        return (fragment.f1864H && fragment.f1865I) || fragment.f1902y.mo2788c();
    }

    /* renamed from: x */
    private void m2399x(Fragment fragment) {
        ViewGroup v = m2397v(fragment);
        if (v != null) {
            if (v.getTag(C3448b.visible_removing_fragment_view_tag) == null) {
                v.setTag(C3448b.visible_removing_fragment_view_tag, fragment);
            }
            ((Fragment) v.getTag(C3448b.visible_removing_fragment_view_tag)).mo2515b(fragment.mo2586v());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public void mo2750A() {
        synchronized (this.f2009a) {
            boolean z = false;
            boolean z2 = this.f2006C != null && !this.f2006C.isEmpty();
            if (this.f2009a.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f2023o.mo2731g().removeCallbacks(this.f2008E);
                this.f2023o.mo2731g().post(this.f2008E);
                m2375I();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo2751a() {
        return this.f2017i.getAndIncrement();
    }

    /* renamed from: a */
    public Fragment mo2752a(int i) {
        return this.f2011c.mo2898b(i);
    }

    /* renamed from: a */
    public Fragment mo2753a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment a = mo2754a(string);
        if (a != null) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment no longer exists for key ");
        sb.append(str);
        sb.append(": unique id ");
        sb.append(string);
        m2380a((RuntimeException) new IllegalStateException(sb.toString()));
        throw null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Fragment mo2754a(String str) {
        return this.f2011c.mo2900b(str);
    }

    /* renamed from: a */
    public void mo2755a(int i, int i2) {
        if (i >= 0) {
            mo2771a((C0453h) new C0454i(null, i, i2), false);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bad id: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2756a(int i, boolean z) {
        if (this.f2023o == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f2022n) {
            this.f2022n = i;
            for (Fragment i2 : this.f2011c.mo2904c()) {
                mo2801i(i2);
            }
            for (Fragment fragment : this.f2011c.mo2901b()) {
                if (fragment != null && !fragment.f1872P) {
                    mo2801i(fragment);
                }
            }
            m2374H();
            if (this.f2029u) {
                C0441i<?> iVar = this.f2023o;
                if (iVar != null && this.f2022n == 4) {
                    iVar.mo2693k();
                    this.f2029u = false;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2757a(Configuration configuration) {
        for (Fragment fragment : this.f2011c.mo2904c()) {
            if (fragment != null) {
                fragment.mo2502a(configuration);
            }
        }
    }

    /* renamed from: a */
    public void mo2758a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f1900w == this) {
            bundle.putString(str, fragment.f1887j);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not currently in the FragmentManager");
        m2380a((RuntimeException) new IllegalStateException(sb.toString()));
        throw null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2759a(Parcelable parcelable) {
        String str;
        String str2;
        C0463q qVar;
        if (parcelable != null) {
            C0457n nVar = (C0457n) parcelable;
            if (nVar.f2049f != null) {
                this.f2011c.mo2907d();
                Iterator it = nVar.f2049f.iterator();
                while (true) {
                    str = "): ";
                    str2 = "FragmentManager";
                    if (!it.hasNext()) {
                        break;
                    }
                    C0461p pVar = (C0461p) it.next();
                    if (pVar != null) {
                        Fragment b = this.f2007D.mo2854b(pVar.f2062g);
                        if (b != null) {
                            if (m2390d(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("restoreSaveState: re-attaching retained ");
                                sb.append(b);
                                Log.v(str2, sb.toString());
                            }
                            qVar = new C0463q(this.f2021m, b, pVar);
                        } else {
                            qVar = new C0463q(this.f2021m, this.f2023o.mo2730f().getClassLoader(), mo2812o(), pVar);
                        }
                        Fragment e = qVar.mo2882e();
                        e.f1900w = this;
                        if (m2390d(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("restoreSaveState: active (");
                            sb2.append(e.f1887j);
                            sb2.append(str);
                            sb2.append(e);
                            Log.v(str2, sb2.toString());
                        }
                        qVar.mo2878a(this.f2023o.mo2730f().getClassLoader());
                        this.f2011c.mo2894a(qVar);
                        qVar.mo2873a(this.f2022n);
                    }
                }
                for (Fragment fragment : this.f2007D.mo2858c()) {
                    if (!this.f2011c.mo2897a(fragment.f1887j)) {
                        if (m2390d(2)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Discarding retained Fragment ");
                            sb3.append(fragment);
                            sb3.append(" that was not found in the set of active Fragments ");
                            sb3.append(nVar.f2049f);
                            Log.v(str2, sb3.toString());
                        }
                        mo2762a(fragment, 1);
                        fragment.f1894q = true;
                        mo2762a(fragment, -1);
                    }
                }
                this.f2011c.mo2896a((List<String>) nVar.f2050g);
                if (nVar.f2051h != null) {
                    this.f2012d = new ArrayList<>(nVar.f2051h.length);
                    int i = 0;
                    while (true) {
                        C0423b[] bVarArr = nVar.f2051h;
                        if (i >= bVarArr.length) {
                            break;
                        }
                        C0422a a = bVarArr[i].mo2644a(this);
                        if (m2390d(2)) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("restoreAllState: back stack #");
                            sb4.append(i);
                            sb4.append(" (index ");
                            sb4.append(a.f1932s);
                            sb4.append(str);
                            sb4.append(a);
                            Log.v(str2, sb4.toString());
                            PrintWriter printWriter = new PrintWriter(new C3315b(str2));
                            a.mo2626a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f2012d.add(a);
                        i++;
                    }
                } else {
                    this.f2012d = null;
                }
                this.f2017i.set(nVar.f2052i);
                String str3 = nVar.f2053j;
                if (str3 != null) {
                    Fragment a2 = mo2754a(str3);
                    this.f2026r = a2;
                    m2395t(a2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2760a(Menu menu) {
        if (this.f2022n >= 1) {
            for (Fragment fragment : this.f2011c.mo2904c()) {
                if (fragment != null) {
                    fragment.mo2525c(menu);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2761a(Fragment fragment) {
        if (m2390d(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        mo2799h(fragment);
        if (!fragment.f1861E) {
            this.f2011c.mo2893a(fragment);
            fragment.f1894q = false;
            if (fragment.f1868L == null) {
                fragment.f1873Q = false;
            }
            if (m2398w(fragment)) {
                this.f2029u = true;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r2 != 3) goto L_0x01f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2762a(androidx.fragment.app.Fragment r13, int r14) {
        /*
            r12 = this;
            androidx.fragment.app.r r0 = r12.f2011c
            java.lang.String r1 = r13.f1887j
            androidx.fragment.app.q r0 = r0.mo2908e(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0015
            androidx.fragment.app.q r0 = new androidx.fragment.app.q
            androidx.fragment.app.k r2 = r12.f2021m
            r0.<init>(r2, r13)
            r0.mo2873a(r1)
        L_0x0015:
            int r2 = r0.mo2879b()
            int r14 = java.lang.Math.min(r14, r2)
            int r2 = r13.f1883f
            r3 = 0
            java.lang.String r4 = "FragmentManager"
            r5 = -1
            r6 = 2
            r7 = 3
            if (r2 > r14) goto L_0x0102
            if (r2 >= r14) goto L_0x0034
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<f.h.i.a>> r2 = r12.f2019k
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0034
            r12.m2392q(r13)
        L_0x0034:
            int r2 = r13.f1883f
            if (r2 == r5) goto L_0x0042
            if (r2 == 0) goto L_0x00df
            if (r2 == r1) goto L_0x00e4
            if (r2 == r6) goto L_0x00f6
            if (r2 == r7) goto L_0x00fb
            goto L_0x01f5
        L_0x0042:
            if (r14 <= r5) goto L_0x00df
            boolean r2 = m2390d(r7)
            if (r2 == 0) goto L_0x005e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "moveto ATTACHED: "
            r2.append(r8)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r4, r2)
        L_0x005e:
            androidx.fragment.app.Fragment r2 = r13.f1889l
            java.lang.String r8 = " that does not belong to this FragmentManager!"
            java.lang.String r9 = " declared target fragment "
            java.lang.String r10 = "Fragment "
            if (r2 == 0) goto L_0x00a6
            java.lang.String r11 = r2.f1887j
            androidx.fragment.app.Fragment r11 = r12.mo2754a(r11)
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x0086
            androidx.fragment.app.Fragment r2 = r13.f1889l
            int r11 = r2.f1883f
            if (r11 >= r1) goto L_0x007d
            r12.mo2762a(r2, r1)
        L_0x007d:
            androidx.fragment.app.Fragment r2 = r13.f1889l
            java.lang.String r2 = r2.f1887j
            r13.f1890m = r2
            r13.f1889l = r3
            goto L_0x00a6
        L_0x0086:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r13)
            r0.append(r9)
            androidx.fragment.app.Fragment r13 = r13.f1889l
            r0.append(r13)
            r0.append(r8)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        L_0x00a6:
            java.lang.String r2 = r13.f1890m
            if (r2 == 0) goto L_0x00d8
            androidx.fragment.app.Fragment r2 = r12.mo2754a(r2)
            if (r2 == 0) goto L_0x00b8
            int r3 = r2.f1883f
            if (r3 >= r1) goto L_0x00d8
            r12.mo2762a(r2, r1)
            goto L_0x00d8
        L_0x00b8:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r13)
            r0.append(r9)
            java.lang.String r13 = r13.f1890m
            r0.append(r13)
            r0.append(r8)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        L_0x00d8:
            androidx.fragment.app.i<?> r2 = r12.f2023o
            androidx.fragment.app.Fragment r3 = r12.f2025q
            r0.mo2875a(r2, r12, r3)
        L_0x00df:
            if (r14 <= 0) goto L_0x00e4
            r0.mo2880c()
        L_0x00e4:
            if (r14 <= r5) goto L_0x00e9
            r0.mo2881d()
        L_0x00e9:
            if (r14 <= r1) goto L_0x00f6
            androidx.fragment.app.f r1 = r12.f2024p
            r0.mo2874a(r1)
            r0.mo2872a()
            r0.mo2884g()
        L_0x00f6:
            if (r14 <= r6) goto L_0x00fb
            r0.mo2889l()
        L_0x00fb:
            if (r14 <= r7) goto L_0x01f5
            r0.mo2885h()
            goto L_0x01f5
        L_0x0102:
            if (r2 <= r14) goto L_0x01f5
            if (r2 == 0) goto L_0x01ec
            r8 = 0
            if (r2 == r1) goto L_0x01ab
            if (r2 == r6) goto L_0x011c
            if (r2 == r7) goto L_0x0117
            r9 = 4
            if (r2 == r9) goto L_0x0112
            goto L_0x01f5
        L_0x0112:
            if (r14 >= r9) goto L_0x0117
            r0.mo2883f()
        L_0x0117:
            if (r14 >= r7) goto L_0x011c
            r0.mo2890m()
        L_0x011c:
            if (r14 >= r6) goto L_0x01ab
            boolean r2 = m2390d(r7)
            if (r2 == 0) goto L_0x0138
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "movefrom ACTIVITY_CREATED: "
            r2.append(r6)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r4, r2)
        L_0x0138:
            android.view.View r2 = r13.f1868L
            if (r2 == 0) goto L_0x014b
            androidx.fragment.app.i<?> r2 = r12.f2023o
            boolean r2 = r2.mo2690b(r13)
            if (r2 == 0) goto L_0x014b
            android.util.SparseArray<android.os.Parcelable> r2 = r13.f1885h
            if (r2 != 0) goto L_0x014b
            r0.mo2888k()
        L_0x014b:
            android.view.View r2 = r13.f1868L
            if (r2 == 0) goto L_0x019c
            android.view.ViewGroup r6 = r13.f1867K
            if (r6 == 0) goto L_0x019c
            r6.endViewTransition(r2)
            android.view.View r2 = r13.f1868L
            r2.clearAnimation()
            boolean r2 = r13.mo2478R()
            if (r2 != 0) goto L_0x019c
            int r2 = r12.f2022n
            r6 = 0
            if (r2 <= r5) goto L_0x0184
            boolean r2 = r12.f2032x
            if (r2 != 0) goto L_0x0184
            android.view.View r2 = r13.f1868L
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0184
            float r2 = r13.f1874R
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0184
            androidx.fragment.app.i<?> r2 = r12.f2023o
            android.content.Context r2 = r2.mo2730f()
            androidx.fragment.app.f r3 = r12.f2024p
            androidx.fragment.app.e$d r3 = androidx.fragment.app.C0431e.m2305a(r2, r3, r13, r8)
        L_0x0184:
            r13.f1874R = r6
            android.view.ViewGroup r2 = r13.f1867K
            android.view.View r5 = r13.f1868L
            if (r3 == 0) goto L_0x0194
            r13.mo2530d(r14)
            androidx.fragment.app.t$g r6 = r12.f2020l
            androidx.fragment.app.C0431e.m2306a(r13, r3, r6)
        L_0x0194:
            r2.removeView(r5)
            android.view.ViewGroup r3 = r13.f1867K
            if (r2 == r3) goto L_0x019c
            return
        L_0x019c:
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<f.h.i.a>> r2 = r12.f2019k
            java.lang.Object r2 = r2.get(r13)
            if (r2 != 0) goto L_0x01a8
            r12.m2394s(r13)
            goto L_0x01ab
        L_0x01a8:
            r13.mo2530d(r14)
        L_0x01ab:
            if (r14 >= r1) goto L_0x01ec
            boolean r2 = r13.f1894q
            if (r2 == 0) goto L_0x01b8
            boolean r2 = r13.mo2475O()
            if (r2 != 0) goto L_0x01b8
            r8 = 1
        L_0x01b8:
            if (r8 != 0) goto L_0x01d6
            androidx.fragment.app.o r2 = r12.f2007D
            boolean r2 = r2.mo2863f(r13)
            if (r2 == 0) goto L_0x01c3
            goto L_0x01d6
        L_0x01c3:
            java.lang.String r2 = r13.f1890m
            if (r2 == 0) goto L_0x01d9
            androidx.fragment.app.Fragment r2 = r12.mo2754a(r2)
            if (r2 == 0) goto L_0x01d9
            boolean r3 = r2.mo2462B()
            if (r3 == 0) goto L_0x01d9
            r13.f1889l = r2
            goto L_0x01d9
        L_0x01d6:
            r12.m2378a(r0)
        L_0x01d9:
            java.util.concurrent.ConcurrentHashMap<androidx.fragment.app.Fragment, java.util.HashSet<f.h.i.a>> r2 = r12.f2019k
            java.lang.Object r2 = r2.get(r13)
            if (r2 == 0) goto L_0x01e5
            r13.mo2530d(r14)
            goto L_0x01ed
        L_0x01e5:
            androidx.fragment.app.i<?> r1 = r12.f2023o
            androidx.fragment.app.o r2 = r12.f2007D
            r0.mo2876a(r1, r2)
        L_0x01ec:
            r1 = r14
        L_0x01ed:
            if (r1 >= 0) goto L_0x01f4
            androidx.fragment.app.o r14 = r12.f2007D
            r0.mo2877a(r14)
        L_0x01f4:
            r14 = r1
        L_0x01f5:
            int r0 = r13.f1883f
            if (r0 == r14) goto L_0x0227
            boolean r0 = m2390d(r7)
            if (r0 == 0) goto L_0x0225
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r13.f1883f
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r4, r0)
        L_0x0225:
            r13.f1883f = r14
        L_0x0227:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0445l.mo2762a(androidx.fragment.app.Fragment, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2763a(Fragment fragment, C0516b bVar) {
        if (!fragment.equals(mo2754a(fragment.f1887j)) || !(fragment.f1901x == null || fragment.f1900w == this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(fragment);
            sb.append(" is not an active fragment of FragmentManager ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }
        fragment.f1877U = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2764a(Fragment fragment, C3277a aVar) {
        if (this.f2019k.get(fragment) == null) {
            this.f2019k.put(fragment, new HashSet());
        }
        ((HashSet) this.f2019k.get(fragment)).add(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2765a(Fragment fragment, boolean z) {
        ViewGroup v = m2397v(fragment);
        if (v != null && (v instanceof FragmentContainerView)) {
            ((FragmentContainerView) v).setDrawDisappearingViewsLast(!z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2766a(C0422a aVar) {
        if (this.f2012d == null) {
            this.f2012d = new ArrayList<>();
        }
        this.f2012d.add(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2767a(C0422a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.mo2636c(z3);
        } else {
            aVar.mo2639g();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0468t.m2588a(this, arrayList, arrayList2, 0, 1, true, this.f2020l);
        }
        if (z3) {
            mo2756a(this.f2022n, true);
        }
        for (Fragment fragment : this.f2011c.mo2901b()) {
            if (fragment != null && fragment.f1868L != null && fragment.f1872P && aVar.mo2633b(fragment.f1858B)) {
                float f = fragment.f1874R;
                if (f > 0.0f) {
                    fragment.f1868L.setAlpha(f);
                }
                if (z3) {
                    fragment.f1874R = 0.0f;
                } else {
                    fragment.f1874R = -1.0f;
                    fragment.f1872P = false;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v7, types: [androidx.lifecycle.n] */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2768a(androidx.fragment.app.C0441i<?> r3, androidx.fragment.app.C0438f r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.i<?> r0 = r2.f2023o
            if (r0 != 0) goto L_0x0048
            r2.f2023o = r3
            r2.f2024p = r4
            r2.f2025q = r5
            if (r5 == 0) goto L_0x000f
            r2.m2375I()
        L_0x000f:
            boolean r4 = r3 instanceof androidx.activity.C0046c
            if (r4 == 0) goto L_0x0026
            r4 = r3
            androidx.activity.c r4 = (androidx.activity.C0046c) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.mo116b()
            r2.f2015g = r0
            if (r5 == 0) goto L_0x001f
            r4 = r5
        L_0x001f:
            androidx.activity.OnBackPressedDispatcher r0 = r2.f2015g
            androidx.activity.b r1 = r2.f2016h
            r0.mo128a(r4, r1)
        L_0x0026:
            if (r5 == 0) goto L_0x0031
            androidx.fragment.app.l r3 = r5.f1900w
            androidx.fragment.app.o r3 = r3.m2396u(r5)
        L_0x002e:
            r2.f2007D = r3
            goto L_0x0047
        L_0x0031:
            boolean r4 = r3 instanceof androidx.lifecycle.C0510d0
            if (r4 == 0) goto L_0x0040
            androidx.lifecycle.d0 r3 = (androidx.lifecycle.C0510d0) r3
            androidx.lifecycle.c0 r3 = r3.mo118h()
            androidx.fragment.app.o r3 = androidx.fragment.app.C0459o.m2502a(r3)
            goto L_0x002e
        L_0x0040:
            androidx.fragment.app.o r3 = new androidx.fragment.app.o
            r4 = 0
            r3.<init>(r4)
            goto L_0x002e
        L_0x0047:
            return
        L_0x0048:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0445l.mo2768a(androidx.fragment.app.i, androidx.fragment.app.f, androidx.fragment.app.Fragment):void");
    }

    /* renamed from: a */
    public void mo2769a(C0451f fVar) {
        this.f2021m.mo2738a(fVar);
    }

    /* renamed from: a */
    public void mo2770a(C0451f fVar, boolean z) {
        this.f2021m.mo2739a(fVar, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2771a(C0453h hVar, boolean z) {
        if (!z) {
            if (this.f2023o != null) {
                m2368B();
            } else if (this.f2032x) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f2009a) {
            if (this.f2023o != null) {
                this.f2009a.add(hVar);
                mo2750A();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* renamed from: a */
    public void mo2772a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String sb2 = sb.toString();
        this.f2011c.mo2895a(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f2013e;
        if (arrayList != null) {
            int size = arrayList.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (int i = 0; i < size; i++) {
                    Fragment fragment = (Fragment) this.f2013e.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fragment.toString());
                }
            }
        }
        ArrayList<C0422a> arrayList2 = this.f2012d;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            if (size2 > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (int i2 = 0; i2 < size2; i2++) {
                    C0422a aVar = (C0422a) this.f2012d.get(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.mo2625a(sb2, printWriter);
                }
            }
        }
        printWriter.print(str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Back Stack Index: ");
        sb3.append(this.f2017i.get());
        printWriter.println(sb3.toString());
        synchronized (this.f2009a) {
            int size3 = this.f2009a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    C0453h hVar = (C0453h) this.f2009a.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(hVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2023o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2024p);
        if (this.f2025q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2025q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2022n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2030v);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2031w);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2032x);
        if (this.f2029u) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2029u);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2773a(boolean z) {
        for (Fragment fragment : this.f2011c.mo2904c()) {
            if (fragment != null) {
                fragment.mo2537e(z);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2774a(Menu menu, MenuInflater menuInflater) {
        if (this.f2022n < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f2011c.mo2904c()) {
            if (fragment != null && fragment.mo2520b(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f2013e != null) {
            for (int i = 0; i < this.f2013e.size(); i++) {
                Fragment fragment2 = (Fragment) this.f2013e.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.mo2484X();
                }
            }
        }
        this.f2013e = arrayList;
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2775a(MenuItem menuItem) {
        if (this.f2022n < 1) {
            return false;
        }
        for (Fragment fragment : this.f2011c.mo2904c()) {
            if (fragment != null && fragment.mo2527c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2776a(ArrayList<C0422a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C0422a> arrayList3 = this.f2012d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2012d.remove(size));
            arrayList2.add(Boolean.valueOf(true));
        } else {
            if (str != null || i >= 0) {
                int size2 = this.f2012d.size() - 1;
                while (size2 >= 0) {
                    C0422a aVar = (C0422a) this.f2012d.get(size2);
                    if ((str != null && str.equals(aVar.mo2640h())) || (i >= 0 && i == aVar.f1932s)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0422a aVar2 = (C0422a) this.f2012d.get(size2);
                        if ((str == null || !str.equals(aVar2.mo2640h())) && (i < 0 || i != aVar2.f1932s)) {
                            break;
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.f2012d.size() - 1) {
                return false;
            }
            for (int size3 = this.f2012d.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.f2012d.remove(size3));
                arrayList2.add(Boolean.valueOf(true));
            }
        }
        return true;
    }

    /* renamed from: b */
    public Fragment mo2777b(String str) {
        return this.f2011c.mo2903c(str);
    }

    /* renamed from: b */
    public C0466s mo2778b() {
        return new C0422a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2779b(Fragment fragment) {
        String str = "FragmentManager";
        if (mo2823w()) {
            if (m2390d(2)) {
                Log.v(str, "Ignoring addRetainedFragment as the state is already saved");
            }
            return;
        }
        if (this.f2007D.mo2853a(fragment) && m2390d(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Added ");
            sb.append(fragment);
            Log.v(str, sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2780b(Fragment fragment, C3277a aVar) {
        HashSet hashSet = (HashSet) this.f2019k.get(fragment);
        if (hashSet != null && hashSet.remove(aVar) && hashSet.isEmpty()) {
            this.f2019k.remove(fragment);
            if (fragment.f1883f < 3) {
                m2394s(fragment);
                mo2762a(fragment, fragment.mo2466F());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2781b(C0453h hVar, boolean z) {
        if (!z || (this.f2023o != null && !this.f2032x)) {
            m2389d(z);
            if (hVar.mo2628a(this.f2034z, this.f2004A)) {
                this.f2010b = true;
                try {
                    m2388c(this.f2034z, this.f2004A);
                } finally {
                    m2369C();
                }
            }
            m2375I();
            m2370D();
            this.f2011c.mo2891a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2782b(boolean z) {
        for (Fragment fragment : this.f2011c.mo2904c()) {
            if (fragment != null) {
                fragment.mo2542f(z);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo2783b(int i) {
        return this.f2022n >= i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo2784b(Menu menu) {
        boolean z = false;
        if (this.f2022n < 1) {
            return false;
        }
        for (Fragment fragment : this.f2011c.mo2904c()) {
            if (fragment != null && fragment.mo2532d(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo2785b(MenuItem menuItem) {
        if (this.f2022n < 1) {
            return false;
        }
        for (Fragment fragment : this.f2011c.mo2904c()) {
            if (fragment != null && fragment.mo2533d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Fragment mo2786c(String str) {
        return this.f2011c.mo2906d(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2787c(Fragment fragment) {
        String str = "FragmentManager";
        if (m2390d(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
            Log.v(str, sb.toString());
        }
        if (fragment.f1861E) {
            fragment.f1861E = false;
            if (!fragment.f1893p) {
                this.f2011c.mo2893a(fragment);
                if (m2390d(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("add from attach: ");
                    sb2.append(fragment);
                    Log.v(str, sb2.toString());
                }
                if (m2398w(fragment)) {
                    this.f2029u = true;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo2788c() {
        boolean z = false;
        for (Fragment fragment : this.f2011c.mo2901b()) {
            if (fragment != null) {
                z = m2398w(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo2789c(boolean z) {
        m2389d(z);
        boolean z2 = false;
        while (m2386b(this.f2034z, this.f2004A)) {
            this.f2010b = true;
            try {
                m2388c(this.f2034z, this.f2004A);
                m2369C();
                z2 = true;
            } catch (Throwable th) {
                m2369C();
                throw th;
            }
        }
        m2375I();
        m2370D();
        this.f2011c.mo2891a();
        return z2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2790d() {
        this.f2030v = false;
        this.f2031w = false;
        m2387c(2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2791d(Fragment fragment) {
        String str = "FragmentManager";
        if (m2390d(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
            Log.v(str, sb.toString());
        }
        if (!fragment.f1861E) {
            fragment.f1861E = true;
            if (fragment.f1893p) {
                if (m2390d(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("remove from detach: ");
                    sb2.append(fragment);
                    Log.v(str, sb2.toString());
                }
                this.f2011c.mo2905c(fragment);
                if (m2398w(fragment)) {
                    this.f2029u = true;
                }
                m2399x(fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C0508c0 mo2792e(Fragment fragment) {
        return this.f2007D.mo2859d(fragment);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo2793e() {
        this.f2030v = false;
        this.f2031w = false;
        m2387c(1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo2794f() {
        this.f2032x = true;
        mo2789c(true);
        m2371E();
        m2387c(-1);
        this.f2023o = null;
        this.f2024p = null;
        this.f2025q = null;
        if (this.f2015g != null) {
            this.f2016h.mo135c();
            this.f2015g = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo2795f(Fragment fragment) {
        if (m2390d(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (!fragment.f1860D) {
            fragment.f1860D = true;
            fragment.f1873Q = true ^ fragment.f1873Q;
            m2399x(fragment);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo2796g() {
        m2387c(1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo2797g(Fragment fragment) {
        boolean z = true;
        if (fragment == null) {
            return true;
        }
        C0445l lVar = fragment.f1900w;
        if (!fragment.equals(lVar.mo2819t()) || !mo2797g(lVar.f2025q)) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo2798h() {
        for (Fragment fragment : this.f2011c.mo2904c()) {
            if (fragment != null) {
                fragment.mo2555i0();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo2799h(Fragment fragment) {
        if (!this.f2011c.mo2897a(fragment.f1887j)) {
            C0463q qVar = new C0463q(this.f2021m, fragment);
            qVar.mo2878a(this.f2023o.mo2730f().getClassLoader());
            this.f2011c.mo2894a(qVar);
            if (fragment.f1863G) {
                if (fragment.f1862F) {
                    mo2779b(fragment);
                } else {
                    mo2809m(fragment);
                }
                fragment.f1863G = false;
            }
            qVar.mo2873a(this.f2022n);
            if (m2390d(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Added fragment to active set ");
                sb.append(fragment);
                Log.v("FragmentManager", sb.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo2800i() {
        m2387c(3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo2801i(Fragment fragment) {
        if (!this.f2011c.mo2897a(fragment.f1887j)) {
            if (m2390d(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring moving ");
                sb.append(fragment);
                sb.append(" to state ");
                sb.append(this.f2022n);
                sb.append("since it is not added to ");
                sb.append(this);
                Log.d("FragmentManager", sb.toString());
            }
            return;
        }
        mo2803j(fragment);
        if (fragment.f1868L != null) {
            Fragment b = this.f2011c.mo2899b(fragment);
            if (b != null) {
                View view = b.f1868L;
                ViewGroup viewGroup = fragment.f1867K;
                int indexOfChild = viewGroup.indexOfChild(view);
                int indexOfChild2 = viewGroup.indexOfChild(fragment.f1868L);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.f1868L, indexOfChild);
                }
            }
            if (fragment.f1872P && fragment.f1867K != null) {
                float f = fragment.f1874R;
                if (f > 0.0f) {
                    fragment.f1868L.setAlpha(f);
                }
                fragment.f1874R = 0.0f;
                fragment.f1872P = false;
                C0436d a = C0431e.m2305a(this.f2023o.mo2730f(), this.f2024p, fragment, true);
                if (a != null) {
                    Animation animation = a.f1985a;
                    if (animation != null) {
                        fragment.f1868L.startAnimation(animation);
                    } else {
                        a.f1986b.setTarget(fragment.f1868L);
                        a.f1986b.start();
                    }
                }
            }
        }
        if (fragment.f1873Q) {
            m2393r(fragment);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo2802j() {
        m2375I();
        m2395t(this.f2026r);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo2803j(Fragment fragment) {
        mo2762a(fragment, this.f2022n);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo2804k() {
        this.f2030v = false;
        this.f2031w = false;
        m2387c(4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo2805k(Fragment fragment) {
        if (fragment.f1869M) {
            if (this.f2010b) {
                this.f2033y = true;
            } else {
                fragment.f1869M = false;
                mo2762a(fragment, this.f2022n);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo2806l() {
        this.f2030v = false;
        this.f2031w = false;
        m2387c(3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo2807l(Fragment fragment) {
        if (m2390d(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.f1899v);
            Log.v("FragmentManager", sb.toString());
        }
        boolean z = !fragment.mo2475O();
        if (!fragment.f1861E || z) {
            this.f2011c.mo2905c(fragment);
            if (m2398w(fragment)) {
                this.f2029u = true;
            }
            fragment.f1894q = true;
            m2399x(fragment);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo2808m() {
        this.f2031w = true;
        m2387c(2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo2809m(Fragment fragment) {
        String str = "FragmentManager";
        if (mo2823w()) {
            if (m2390d(2)) {
                Log.v(str, "Ignoring removeRetainedFragment as the state is already saved");
            }
            return;
        }
        if (this.f2007D.mo2861e(fragment) && m2390d(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(fragment);
            Log.v(str, sb.toString());
        }
    }

    /* renamed from: n */
    public int mo2810n() {
        ArrayList<C0422a> arrayList = this.f2012d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: n */
    public C0420g mo2811n(Fragment fragment) {
        C0463q e = this.f2011c.mo2908e(fragment.f1887j);
        if (e != null && e.mo2882e().equals(fragment)) {
            return e.mo2886i();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not currently in the FragmentManager");
        m2380a((RuntimeException) new IllegalStateException(sb.toString()));
        throw null;
    }

    /* renamed from: o */
    public C0440h mo2812o() {
        C0440h hVar = this.f2027s;
        if (hVar != null) {
            return hVar;
        }
        Fragment fragment = this.f2025q;
        return fragment != null ? fragment.f1900w.mo2812o() : this.f2028t;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo2813o(Fragment fragment) {
        if (fragment == null || (fragment.equals(mo2754a(fragment.f1887j)) && (fragment.f1901x == null || fragment.f1900w == this))) {
            Fragment fragment2 = this.f2026r;
            this.f2026r = fragment;
            m2395t(fragment2);
            m2395t(this.f2026r);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: p */
    public List<Fragment> mo2814p() {
        return this.f2011c.mo2904c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo2815p(Fragment fragment) {
        if (m2390d(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (fragment.f1860D) {
            fragment.f1860D = false;
            fragment.f1873Q = !fragment.f1873Q;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public Factory2 mo2816q() {
        return this.f2014f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public C0443k mo2817r() {
        return this.f2021m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public Fragment mo2818s() {
        return this.f2025q;
    }

    /* renamed from: t */
    public Fragment mo2819t() {
        return this.f2026r;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f2025q;
        String str = "}";
        String str2 = "{";
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append(str2);
            obj = this.f2025q;
        } else {
            C0441i<?> iVar = this.f2023o;
            if (iVar != null) {
                sb.append(iVar.getClass().getSimpleName());
                sb.append(str2);
                obj = this.f2023o;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append(str);
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public void mo2821u() {
        mo2789c(true);
        if (this.f2016h.mo134b()) {
            mo2825y();
        } else {
            this.f2015g.mo127a();
        }
    }

    /* renamed from: v */
    public boolean mo2822v() {
        return this.f2032x;
    }

    /* renamed from: w */
    public boolean mo2823w() {
        return this.f2030v || this.f2031w;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public void mo2824x() {
        if (this.f2023o != null) {
            this.f2030v = false;
            this.f2031w = false;
            for (Fragment fragment : this.f2011c.mo2904c()) {
                if (fragment != null) {
                    fragment.mo2482V();
                }
            }
        }
    }

    /* renamed from: y */
    public boolean mo2825y() {
        return m2383a((String) null, -1, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public Parcelable mo2826z() {
        m2372F();
        m2371E();
        mo2789c(true);
        this.f2030v = true;
        ArrayList<C0461p> e = this.f2011c.mo2909e();
        String str = "FragmentManager";
        C0423b[] bVarArr = null;
        if (e.isEmpty()) {
            if (m2390d(2)) {
                Log.v(str, "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> f = this.f2011c.mo2910f();
        ArrayList<C0422a> arrayList = this.f2012d;
        if (arrayList != null) {
            int size = arrayList.size();
            if (size > 0) {
                bVarArr = new C0423b[size];
                for (int i = 0; i < size; i++) {
                    bVarArr[i] = new C0423b((C0422a) this.f2012d.get(i));
                    if (m2390d(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("saveAllState: adding back stack #");
                        sb.append(i);
                        sb.append(": ");
                        sb.append(this.f2012d.get(i));
                        Log.v(str, sb.toString());
                    }
                }
            }
        }
        C0457n nVar = new C0457n();
        nVar.f2049f = e;
        nVar.f2050g = f;
        nVar.f2051h = bVarArr;
        nVar.f2052i = this.f2017i.get();
        Fragment fragment = this.f2026r;
        if (fragment != null) {
            nVar.f2053j = fragment.f1887j;
        }
        return nVar;
    }
}
