package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView.C0569g;
import androidx.recyclerview.widget.RecyclerView.C0571i;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2.C0798i;
import com.google.android.material.tabs.TabLayout.C2735f;
import com.google.android.material.tabs.TabLayout.C2740i;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.tabs.b */
public final class C2747b {

    /* renamed from: a */
    private final TabLayout f8021a;

    /* renamed from: b */
    private final ViewPager2 f8022b;

    /* renamed from: c */
    private final boolean f8023c;

    /* renamed from: d */
    private final C2749b f8024d;

    /* renamed from: e */
    private C0569g<?> f8025e;

    /* renamed from: f */
    private boolean f8026f;

    /* renamed from: g */
    private C2750c f8027g;

    /* renamed from: h */
    private C2735f f8028h;

    /* renamed from: i */
    private C0571i f8029i;

    /* renamed from: com.google.android.material.tabs.b$a */
    private class C2748a extends C0571i {
        C2748a() {
        }

        /* renamed from: a */
        public void mo3492a() {
            C2747b.this.mo9158b();
        }

        /* renamed from: a */
        public void mo3493a(int i, int i2) {
            C2747b.this.mo9158b();
        }

        /* renamed from: a */
        public void mo3494a(int i, int i2, int i3) {
            C2747b.this.mo9158b();
        }

        /* renamed from: a */
        public void mo3495a(int i, int i2, Object obj) {
            C2747b.this.mo9158b();
        }

        /* renamed from: b */
        public void mo3496b(int i, int i2) {
            C2747b.this.mo9158b();
        }

        /* renamed from: c */
        public void mo3497c(int i, int i2) {
            C2747b.this.mo9158b();
        }
    }

    /* renamed from: com.google.android.material.tabs.b$b */
    public interface C2749b {
        /* renamed from: a */
        void mo9159a(C2740i iVar, int i);
    }

    /* renamed from: com.google.android.material.tabs.b$c */
    private static class C2750c extends C0798i {

        /* renamed from: a */
        private final WeakReference<TabLayout> f8031a;

        /* renamed from: b */
        private int f8032b;

        /* renamed from: c */
        private int f8033c;

        C2750c(TabLayout tabLayout) {
            this.f8031a = new WeakReference<>(tabLayout);
            mo9160a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9160a() {
            this.f8033c = 0;
            this.f8032b = 0;
        }

        /* renamed from: a */
        public void mo4337a(int i) {
            this.f8032b = this.f8033c;
            this.f8033c = i;
        }

        /* renamed from: a */
        public void mo4395a(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.f8031a.get();
            if (tabLayout != null) {
                boolean z = false;
                boolean z2 = this.f8033c != 2 || this.f8032b == 1;
                if (!(this.f8033c == 2 && this.f8032b == 0)) {
                    z = true;
                }
                tabLayout.mo9045a(i, f, z2, z);
            }
        }

        /* renamed from: b */
        public void mo4338b(int i) {
            TabLayout tabLayout = (TabLayout) this.f8031a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f8033c;
                tabLayout.mo9059b(tabLayout.mo9042a(i), i2 == 0 || (i2 == 2 && this.f8032b == 0));
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.b$d */
    private static class C2751d implements C2735f {

        /* renamed from: a */
        private final ViewPager2 f8034a;

        C2751d(ViewPager2 viewPager2) {
            this.f8034a = viewPager2;
        }

        /* renamed from: a */
        public void mo9103a(C2740i iVar) {
        }

        /* renamed from: b */
        public void mo9104b(C2740i iVar) {
        }

        /* renamed from: c */
        public void mo9105c(C2740i iVar) {
            this.f8034a.mo4342a(iVar.mo9135c(), true);
        }
    }

    public C2747b(TabLayout tabLayout, ViewPager2 viewPager2, C2749b bVar) {
        this(tabLayout, viewPager2, true, bVar);
    }

    public C2747b(TabLayout tabLayout, ViewPager2 viewPager2, boolean z, C2749b bVar) {
        this.f8021a = tabLayout;
        this.f8022b = viewPager2;
        this.f8023c = z;
        this.f8024d = bVar;
    }

    /* renamed from: a */
    public void mo9157a() {
        if (!this.f8026f) {
            C0569g<?> adapter = this.f8022b.getAdapter();
            this.f8025e = adapter;
            if (adapter != null) {
                this.f8026f = true;
                C2750c cVar = new C2750c(this.f8021a);
                this.f8027g = cVar;
                this.f8022b.mo4343a((C0798i) cVar);
                C2751d dVar = new C2751d(this.f8022b);
                this.f8028h = dVar;
                this.f8021a.mo9046a((C2735f) dVar);
                if (this.f8023c) {
                    C2748a aVar = new C2748a();
                    this.f8029i = aVar;
                    this.f8025e.mo3468a((C0571i) aVar);
                }
                mo9158b();
                this.f8021a.mo9044a(this.f8022b.getCurrentItem(), 0.0f, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9158b() {
        this.f8021a.mo9064e();
        C0569g<?> gVar = this.f8025e;
        if (gVar != null) {
            int b = gVar.mo3472b();
            for (int i = 0; i < b; i++) {
                C2740i c = this.f8021a.mo9061c();
                this.f8024d.mo9159a(c, i);
                this.f8021a.mo9049a(c, false);
            }
            if (b > 0) {
                int min = Math.min(this.f8022b.getCurrentItem(), this.f8021a.getTabCount() - 1);
                if (min != this.f8021a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f8021a;
                    tabLayout.mo9062c(tabLayout.mo9042a(min));
                }
            }
        }
    }
}
