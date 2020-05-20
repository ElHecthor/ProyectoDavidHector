package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.C0445l;
import androidx.fragment.app.C0445l.C0451f;
import androidx.fragment.app.C0466s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment.C0420g;
import androidx.lifecycle.C0514h;
import androidx.lifecycle.C0514h.C0515a;
import androidx.lifecycle.C0514h.C0516b;
import androidx.lifecycle.C0521l;
import androidx.lifecycle.C0523n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0569g;
import androidx.recyclerview.widget.RecyclerView.C0571i;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2.C0798i;
import p071f.p088e.C3164b;
import p071f.p088e.C3167d;
import p071f.p097h.p107l.C3321h;
import p071f.p097h.p108m.C3379v;

public abstract class FragmentStateAdapter extends C0569g<C0788a> implements C0789b {

    /* renamed from: c */
    final C0514h f3060c;

    /* renamed from: d */
    final C0445l f3061d;

    /* renamed from: e */
    final C3167d<Fragment> f3062e;

    /* renamed from: f */
    private final C3167d<C0420g> f3063f;

    /* renamed from: g */
    private final C3167d<Integer> f3064g;

    /* renamed from: h */
    private FragmentMaxLifecycleEnforcer f3065h;

    /* renamed from: i */
    boolean f3066i;

    /* renamed from: j */
    private boolean f3067j;

    class FragmentMaxLifecycleEnforcer {

        /* renamed from: a */
        private C0798i f3072a;

        /* renamed from: b */
        private C0571i f3073b;

        /* renamed from: c */
        private C0521l f3074c;

        /* renamed from: d */
        private ViewPager2 f3075d;

        /* renamed from: e */
        private long f3076e = -1;

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$a */
        class C0782a extends C0798i {
            C0782a() {
            }

            /* renamed from: a */
            public void mo4337a(int i) {
                FragmentMaxLifecycleEnforcer.this.mo4335a(false);
            }

            /* renamed from: b */
            public void mo4338b(int i) {
                FragmentMaxLifecycleEnforcer.this.mo4335a(false);
            }
        }

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$b */
        class C0783b extends C0787d {
            C0783b() {
                super(null);
            }

            /* renamed from: a */
            public void mo3492a() {
                FragmentMaxLifecycleEnforcer.this.mo4335a(true);
            }
        }

        FragmentMaxLifecycleEnforcer() {
        }

        /* renamed from: c */
        private ViewPager2 m4246c(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected ViewPager2 instance. Got: ");
            sb.append(parent);
            throw new IllegalStateException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4334a(RecyclerView recyclerView) {
            this.f3075d = m4246c(recyclerView);
            C0782a aVar = new C0782a();
            this.f3072a = aVar;
            this.f3075d.mo4343a((C0798i) aVar);
            C0783b bVar = new C0783b();
            this.f3073b = bVar;
            FragmentStateAdapter.this.mo3468a((C0571i) bVar);
            C07813 r2 = new C0521l() {
                /* renamed from: a */
                public void mo124a(C0523n nVar, C0515a aVar) {
                    FragmentMaxLifecycleEnforcer.this.mo4335a(false);
                }
            };
            this.f3074c = r2;
            FragmentStateAdapter.this.f3060c.mo3037a(r2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4335a(boolean z) {
            if (!FragmentStateAdapter.this.mo4333g() && this.f3075d.getScrollState() == 0 && !FragmentStateAdapter.this.f3062e.mo10192c() && FragmentStateAdapter.this.mo3472b() != 0) {
                int currentItem = this.f3075d.getCurrentItem();
                if (currentItem < FragmentStateAdapter.this.mo3472b()) {
                    long a = FragmentStateAdapter.this.mo3462a(currentItem);
                    if (a != this.f3076e || z) {
                        Fragment fragment = (Fragment) FragmentStateAdapter.this.f3062e.mo10190c(a);
                        if (fragment != null && fragment.mo2472L()) {
                            this.f3076e = a;
                            C0466s b = FragmentStateAdapter.this.f3061d.mo2778b();
                            Fragment fragment2 = null;
                            for (int i = 0; i < FragmentStateAdapter.this.f3062e.mo10194d(); i++) {
                                long a2 = FragmentStateAdapter.this.f3062e.mo10182a(i);
                                Fragment fragment3 = (Fragment) FragmentStateAdapter.this.f3062e.mo10189c(i);
                                if (fragment3.mo2472L()) {
                                    if (a2 != this.f3076e) {
                                        b.mo2621a(fragment3, C0516b.STARTED);
                                    } else {
                                        fragment2 = fragment3;
                                    }
                                    fragment3.mo2549h(a2 == this.f3076e);
                                }
                            }
                            if (fragment2 != null) {
                                b.mo2621a(fragment2, C0516b.RESUMED);
                            }
                            if (!b.mo2638f()) {
                                b.mo2635c();
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4336b(RecyclerView recyclerView) {
            m4246c(recyclerView).mo4346b(this.f3072a);
            FragmentStateAdapter.this.mo3478b(this.f3073b);
            FragmentStateAdapter.this.f3060c.mo3038b(this.f3074c);
            this.f3075d = null;
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$a */
    class C0784a implements OnLayoutChangeListener {

        /* renamed from: f */
        final /* synthetic */ FrameLayout f3081f;

        /* renamed from: g */
        final /* synthetic */ C0788a f3082g;

        C0784a(FrameLayout frameLayout, C0788a aVar) {
            this.f3081f = frameLayout;
            this.f3082g = aVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f3081f.getParent() != null) {
                this.f3081f.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.mo4331d(this.f3082g);
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$b */
    class C0785b extends C0451f {

        /* renamed from: a */
        final /* synthetic */ Fragment f3084a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout f3085b;

        C0785b(Fragment fragment, FrameLayout frameLayout) {
            this.f3084a = fragment;
            this.f3085b = frameLayout;
        }

        /* renamed from: a */
        public void mo2834a(C0445l lVar, Fragment fragment, View view, Bundle bundle) {
            if (fragment == this.f3084a) {
                lVar.mo2769a((C0451f) this);
                FragmentStateAdapter.this.mo4324a(view, this.f3085b);
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$c */
    class C0786c implements Runnable {
        C0786c() {
        }

        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f3066i = false;
            fragmentStateAdapter.mo4332f();
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$d */
    private static abstract class C0787d extends C0571i {
        private C0787d() {
        }

        /* synthetic */ C0787d(C0784a aVar) {
            this();
        }

        /* renamed from: a */
        public final void mo3493a(int i, int i2) {
            mo3492a();
        }

        /* renamed from: a */
        public final void mo3494a(int i, int i2, int i3) {
            mo3492a();
        }

        /* renamed from: a */
        public final void mo3495a(int i, int i2, Object obj) {
            mo3492a();
        }

        /* renamed from: b */
        public final void mo3496b(int i, int i2) {
            mo3492a();
        }

        /* renamed from: c */
        public final void mo3497c(int i, int i2) {
            mo3492a();
        }
    }

    public FragmentStateAdapter(Fragment fragment) {
        this(fragment.mo2565m(), fragment.mo115a());
    }

    public FragmentStateAdapter(C0445l lVar, C0514h hVar) {
        this.f3062e = new C3167d<>();
        this.f3063f = new C3167d<>();
        this.f3064g = new C3167d<>();
        this.f3066i = false;
        this.f3067j = false;
        this.f3061d = lVar;
        this.f3060c = hVar;
        super.mo3470a(true);
    }

    /* renamed from: a */
    private static String m4213a(String str, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: a */
    private void m4214a(Fragment fragment, FrameLayout frameLayout) {
        this.f3061d.mo2770a((C0451f) new C0785b(fragment, frameLayout), false);
    }

    /* renamed from: a */
    private static boolean m4215a(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    /* renamed from: b */
    private static long m4216b(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    /* renamed from: b */
    private boolean m4217b(long j) {
        boolean z = true;
        if (this.f3064g.mo10184a(j)) {
            return true;
        }
        Fragment fragment = (Fragment) this.f3062e.mo10190c(j);
        if (fragment == null) {
            return false;
        }
        View I = fragment.mo2469I();
        if (I == null) {
            return false;
        }
        if (I.getParent() == null) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    private void m4218c(long j) {
        Fragment fragment = (Fragment) this.f3062e.mo10190c(j);
        if (fragment != null) {
            if (fragment.mo2469I() != null) {
                ViewParent parent = fragment.mo2469I().getParent();
                if (parent != null) {
                    ((FrameLayout) parent).removeAllViews();
                }
            }
            if (!mo4326a(j)) {
                this.f3063f.mo10196e(j);
            }
            if (!fragment.mo2472L()) {
                this.f3062e.mo10196e(j);
            } else if (mo4333g()) {
                this.f3067j = true;
            } else {
                if (fragment.mo2472L() && mo4326a(j)) {
                    this.f3063f.mo10191c(j, this.f3061d.mo2811n(fragment));
                }
                C0466s b = this.f3061d.mo2778b();
                b.mo2632b(fragment);
                b.mo2635c();
                this.f3062e.mo10196e(j);
            }
        }
    }

    /* renamed from: d */
    private void mo15098d(int i) {
        long a = mo3462a(i);
        if (!this.f3062e.mo10184a(a)) {
            Fragment c = mo4329c(i);
            c.mo2508a((C0420g) this.f3063f.mo10190c(a));
            this.f3062e.mo10191c(a, c);
        }
    }

    /* renamed from: e */
    private Long m4220e(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.f3064g.mo10194d(); i2++) {
            if (((Integer) this.f3064g.mo10189c(i2)).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.f3064g.mo10182a(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l;
    }

    /* renamed from: h */
    private void m4221h() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final C0786c cVar = new C0786c();
        this.f3060c.mo3037a(new C0521l(this) {
            /* renamed from: a */
            public void mo124a(C0523n nVar, C0515a aVar) {
                if (aVar == C0515a.ON_DESTROY) {
                    handler.removeCallbacks(cVar);
                    nVar.mo115a().mo3038b(this);
                }
            }
        });
        handler.postDelayed(cVar, 10000);
    }

    /* renamed from: a */
    public long mo3462a(int i) {
        return (long) i;
    }

    /* renamed from: a */
    public final Parcelable mo4322a() {
        Bundle bundle = new Bundle(this.f3062e.mo10194d() + this.f3063f.mo10194d());
        for (int i = 0; i < this.f3062e.mo10194d(); i++) {
            long a = this.f3062e.mo10182a(i);
            Fragment fragment = (Fragment) this.f3062e.mo10190c(a);
            if (fragment != null && fragment.mo2472L()) {
                this.f3061d.mo2758a(bundle, m4213a("f#", a), fragment);
            }
        }
        for (int i2 = 0; i2 < this.f3063f.mo10194d(); i2++) {
            long a2 = this.f3063f.mo10182a(i2);
            if (mo4326a(a2)) {
                bundle.putParcelable(m4213a("s#", a2), (Parcelable) this.f3063f.mo10190c(a2));
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo4323a(Parcelable parcelable) {
        long b;
        Object obj;
        C3167d dVar;
        if (!this.f3063f.mo10192c() || !this.f3062e.mo10192c()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            String str2 = "f#";
            if (m4215a(str, str2)) {
                b = m4216b(str, str2);
                obj = this.f3061d.mo2753a(bundle, str);
                dVar = this.f3062e;
            } else {
                String str3 = "s#";
                if (m4215a(str, str3)) {
                    b = m4216b(str, str3);
                    obj = (C0420g) bundle.getParcelable(str);
                    if (mo4326a(b)) {
                        dVar = this.f3063f;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected key in savedState: ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            dVar.mo10191c(b, obj);
        }
        if (!this.f3062e.mo10192c()) {
            this.f3067j = true;
            this.f3066i = true;
            mo4332f();
            m4221h();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4324a(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    /* renamed from: a */
    public void mo3469a(RecyclerView recyclerView) {
        C3321h.m13545a(this.f3065h == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.f3065h = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.mo4334a(recyclerView);
    }

    /* renamed from: a */
    public final void mo3477b(C0788a aVar, int i) {
        long g = aVar.mo3421g();
        int id = aVar.mo4341B().getId();
        Long e = m4220e(id);
        if (!(e == null || e.longValue() == g)) {
            m4218c(e.longValue());
            this.f3064g.mo10196e(e.longValue());
        }
        this.f3064g.mo10191c(g, Integer.valueOf(id));
        mo15098d(i);
        FrameLayout B = aVar.mo4341B();
        if (C3379v.m13767C(B)) {
            if (B.getParent() == null) {
                B.addOnLayoutChangeListener(new C0784a(B, aVar));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        mo4332f();
    }

    /* renamed from: a */
    public final void mo3470a(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    /* renamed from: a */
    public boolean mo4326a(long j) {
        return j >= 0 && j < ((long) mo3472b());
    }

    /* renamed from: a */
    public final boolean mo3471a(C0788a aVar) {
        return true;
    }

    /* renamed from: b */
    public final C0788a m4233b(ViewGroup viewGroup, int i) {
        return C0788a.m4260a(viewGroup);
    }

    /* renamed from: b */
    public void mo3479b(RecyclerView recyclerView) {
        this.f3065h.mo4336b(recyclerView);
        this.f3065h = null;
    }

    /* renamed from: b */
    public final void mo3476b(C0788a aVar) {
        mo4331d(aVar);
        mo4332f();
    }

    /* renamed from: c */
    public abstract Fragment mo4329c(int i);

    /* renamed from: c */
    public final void mo3483d(C0788a aVar) {
        Long e = m4220e(aVar.mo4341B().getId());
        if (e != null) {
            m4218c(e.longValue());
            this.f3064g.mo10196e(e.longValue());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4331d(final C0788a aVar) {
        Fragment fragment = (Fragment) this.f3062e.mo10190c(aVar.mo3421g());
        String str = "Design assumption violated.";
        if (fragment != null) {
            FrameLayout B = aVar.mo4341B();
            View I = fragment.mo2469I();
            if (!fragment.mo2472L() && I != null) {
                throw new IllegalStateException(str);
            } else if (fragment.mo2472L() && I == null) {
                m4214a(fragment, B);
            } else if (fragment.mo2472L() && I.getParent() != null) {
                if (I.getParent() != B) {
                    mo4324a(I, B);
                }
            } else if (fragment.mo2472L()) {
                mo4324a(I, B);
            } else {
                if (!mo4333g()) {
                    m4214a(fragment, B);
                    C0466s b = this.f3061d.mo2778b();
                    StringBuilder sb = new StringBuilder();
                    sb.append("f");
                    sb.append(aVar.mo3421g());
                    b.mo2914a(fragment, sb.toString());
                    b.mo2621a(fragment, C0516b.STARTED);
                    b.mo2635c();
                    this.f3065h.mo4335a(false);
                } else if (!this.f3061d.mo2822v()) {
                    this.f3060c.mo3037a(new C0521l() {
                        /* renamed from: a */
                        public void mo124a(C0523n nVar, C0515a aVar) {
                            if (!FragmentStateAdapter.this.mo4333g()) {
                                nVar.mo115a().mo3038b(this);
                                if (C3379v.m13767C(aVar.mo4341B())) {
                                    FragmentStateAdapter.this.mo4331d(aVar);
                                }
                            }
                        }
                    });
                }
            }
        } else {
            throw new IllegalStateException(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo4332f() {
        if (this.f3067j && !mo4333g()) {
            C3164b<Long> bVar = new C3164b<>();
            for (int i = 0; i < this.f3062e.mo10194d(); i++) {
                long a = this.f3062e.mo10182a(i);
                if (!mo4326a(a)) {
                    bVar.add(Long.valueOf(a));
                    this.f3064g.mo10196e(a);
                }
            }
            if (!this.f3066i) {
                this.f3067j = false;
                for (int i2 = 0; i2 < this.f3062e.mo10194d(); i2++) {
                    long a2 = this.f3062e.mo10182a(i2);
                    if (!m4217b(a2)) {
                        bVar.add(Long.valueOf(a2));
                    }
                }
            }
            for (Long longValue : bVar) {
                m4218c(longValue.longValue());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo4333g() {
        return this.f3061d.mo2823w();
    }
}
