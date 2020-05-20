package p255io.stashteam.stashapp.p281f.p292d;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0523n;
import androidx.lifecycle.C0533u;
import androidx.lifecycle.LiveData;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.C2747b;
import com.google.android.material.tabs.C2747b.C2749b;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.C2740i;
import io.stashteam.games.tracker.stashapp.R;
import java.io.Serializable;
import p255io.stashteam.stashapp.p256b.p257a.C4938c;
import p255io.stashteam.stashapp.p262c.C5007x;
import p255io.stashteam.stashapp.p269e.p280c.C5292c0;
import p255io.stashteam.stashapp.p269e.p280c.C5294d0;
import p255io.stashteam.stashapp.p281f.p282a.C5326c;
import p255io.stashteam.stashapp.p298ui.leaderboard.LeaderboardActivity;
import p255io.stashteam.stashapp.p298ui.leaderboard.LeaderboardActivity.C5602c;
import p255io.stashteam.stashapp.p298ui.settings.SettingsActivity;
import p255io.stashteam.stashapp.p298ui.settings.SettingsActivity.C5661c;
import p255io.stashteam.stashapp.p298ui.widgets.empty_view.EmptyView;
import p255io.stashteam.stashapp.utils.p304f.C5705j;
import p255io.stashteam.stashapp.utils.p304f.C5708k;
import p255io.stashteam.stashapp.utils.p304f.C5710m;
import p308k.C5797g;
import p308k.C5802l;
import p308k.C5808p;
import p308k.C5809q;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p352o.p353a.p364c.p371j.C6557a;
import p352o.p353a.p364c.p371j.C6559b;
import p352o.p353a.p364c.p372k.C6560a;

/* renamed from: io.stashteam.stashapp.f.d.b */
public final class C5418b extends C5326c<C5007x> implements OnClickListener {

    /* renamed from: h0 */
    public static final C5421c f14179h0 = new C5421c(null);

    /* renamed from: c0 */
    private final C5797g f14180c0 = C5705j.m21800a(this, "arg_user_id", null);

    /* renamed from: d0 */
    private final C5797g f14181d0 = C5705j.m21800a(this, "arg_user_is_closed", Boolean.valueOf(false));

    /* renamed from: e0 */
    private final C5797g f14182e0 = C5799i.m22044a(new C5420b(this, null, new C5425g(this)));

    /* renamed from: f0 */
    private final C5797g f14183f0 = C5799i.m22044a(new C5419a(this, null, null));

    /* renamed from: g0 */
    private final C5797g f14184g0 = C5799i.m22044a(new C5422d(this));

    /* renamed from: io.stashteam.stashapp.f.d.b$a */
    public static final class C5419a extends C5943l implements C5907a<C4938c> {

        /* renamed from: g */
        final /* synthetic */ ComponentCallbacks f14185g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14186h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14187i;

        public C5419a(ComponentCallbacks componentCallbacks, C6560a aVar, C5907a aVar2) {
            this.f14185g = componentCallbacks;
            this.f14186h = aVar;
            this.f14187i = aVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, io.stashteam.stashapp.b.a.c] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [java.lang.Object, io.stashteam.stashapp.b.a.c]
          assigns: [java.lang.Object]
          uses: [io.stashteam.stashapp.b.a.c]
          mth insns count: 9
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p255io.stashteam.stashapp.p256b.p257a.C4938c invoke() {
            /*
                r4 = this;
                android.content.ComponentCallbacks r0 = r4.f14185g
                o.a.c.k.a r1 = r4.f14186h
                k.z.c.a r2 = r4.f14187i
                o.a.c.a r0 = p352o.p353a.p354a.p356b.p357a.C6511a.m24704a(r0)
                o.a.c.m.a r0 = r0.mo16935b()
                java.lang.Class<io.stashteam.stashapp.b.a.c> r3 = p255io.stashteam.stashapp.p256b.p257a.C4938c.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                java.lang.Object r0 = r0.mo17011a(r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p281f.p292d.C5418b.C5419a.invoke():java.lang.Object");
        }
    }

    /* renamed from: io.stashteam.stashapp.f.d.b$b */
    public static final class C5420b extends C5943l implements C5907a<C5417a> {

        /* renamed from: g */
        final /* synthetic */ C0523n f14188g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14189h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14190i;

        public C5420b(C0523n nVar, C6560a aVar, C5907a aVar2) {
            this.f14188g = nVar;
            this.f14189h = aVar;
            this.f14190i = aVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, io.stashteam.stashapp.f.d.a] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1, types: [androidx.lifecycle.a0, io.stashteam.stashapp.f.d.a]
          assigns: [androidx.lifecycle.a0]
          uses: [io.stashteam.stashapp.f.d.a]
          mth insns count: 7
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p255io.stashteam.stashapp.p281f.p292d.C5417a invoke() {
            /*
                r4 = this;
                androidx.lifecycle.n r0 = r4.f14188g
                o.a.c.k.a r1 = r4.f14189h
                k.z.c.a r2 = r4.f14190i
                java.lang.Class<io.stashteam.stashapp.f.d.a> r3 = p255io.stashteam.stashapp.p281f.p292d.C5417a.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                androidx.lifecycle.a0 r0 = p352o.p353a.p359b.p360a.p362d.p363a.C6521a.m24722a(r0, r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p281f.p292d.C5418b.C5420b.invoke():androidx.lifecycle.a0");
        }
    }

    /* renamed from: io.stashteam.stashapp.f.d.b$c */
    public static final class C5421c {
        private C5421c() {
        }

        public /* synthetic */ C5421c(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ C5418b m21063a(C5421c cVar, Long l, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                l = null;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return cVar.mo15097a(l, z);
        }

        /* renamed from: a */
        public final C5418b mo15097a(Long l, boolean z) {
            C5418b bVar = new C5418b();
            if (l != null) {
                C5705j.m21798a((Fragment) bVar, (C5802l<String, ? extends Serializable>[]) new C5802l[]{C5808p.m22056a("arg_user_id", l), C5808p.m22056a("arg_user_is_closed", Boolean.valueOf(z))});
            }
            return bVar;
        }
    }

    /* renamed from: io.stashteam.stashapp.f.d.b$d */
    static final class C5422d extends C5943l implements C5907a<C5426c> {

        /* renamed from: g */
        final /* synthetic */ C5418b f14191g;

        C5422d(C5418b bVar) {
            this.f14191g = bVar;
            super(0);
        }

        public final C5426c invoke() {
            C5418b bVar = this.f14191g;
            return new C5426c(bVar, bVar.m21055w0());
        }
    }

    /* renamed from: io.stashteam.stashapp.f.d.b$e */
    public static final class C5423e<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ C5418b f14192a;

        public C5423e(C5418b bVar) {
            this.f14192a = bVar;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            C5294d0 d0Var = (C5294d0) t;
            if (d0Var != null) {
                this.f14192a.m21050a(d0Var);
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.f.d.b$f */
    static final class C5424f implements C2749b {

        /* renamed from: a */
        final /* synthetic */ C5418b f14193a;

        C5424f(C5418b bVar) {
            this.f14193a = bVar;
        }

        /* renamed from: a */
        public final void mo9159a(C2740i iVar, int i) {
            C5942k.m22327b(iVar, "tab");
            iVar.mo9136c(this.f14193a.m21053u0().mo15098d(i));
        }
    }

    /* renamed from: io.stashteam.stashapp.f.d.b$g */
    static final class C5425g extends C5943l implements C5907a<C6557a> {

        /* renamed from: g */
        final /* synthetic */ C5418b f14194g;

        C5425g(C5418b bVar) {
            this.f14194g = bVar;
            super(0);
        }

        public final C6557a invoke() {
            return C6559b.m24801a(this.f14194g.m21055w0());
        }
    }

    /* renamed from: a */
    private final void m21049a(TabLayout tabLayout) {
        int tabCount = tabLayout.getTabCount() - 1;
        int i = 0;
        while (i < tabCount) {
            View childAt = tabLayout.getChildAt(0);
            if (childAt != null) {
                View childAt2 = ((ViewGroup) childAt).getChildAt(i);
                C5942k.m22324a((Object) childAt2, "tab");
                LayoutParams layoutParams = childAt2.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    marginLayoutParams.rightMargin = mo2461A().getDimensionPixelOffset(R.dimen.space_small);
                    childAt2.setLayoutParams(marginLayoutParams);
                    i++;
                } else {
                    throw new C5809q("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            } else {
                throw new C5809q("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m21050a(C5294d0 d0Var) {
        AppCompatTextView appCompatTextView = ((C5007x) mo2653s0()).f13205g;
        C5942k.m22324a((Object) appCompatTextView, "binding.textUsername");
        appCompatTextView.setText(d0Var.mo14884b());
        AppCompatImageView appCompatImageView = ((C5007x) mo2653s0()).f13203e;
        C5942k.m22324a((Object) appCompatImageView, "binding.imageAvatar");
        C5708k.m21801a(appCompatImageView, d0Var.mo14886d());
        C5292c0 g = d0Var.mo14890g();
        if (g != null) {
            ((C5007x) mo2653s0()).f13207i.setValue(String.valueOf(g.mo14872d()));
            ((C5007x) mo2653s0()).f13210l.setValue(String.valueOf(g.mo14873e()));
            ((C5007x) mo2653s0()).f13209k.setValue(String.valueOf(g.mo14870b()));
            ((C5007x) mo2653s0()).f13208j.setValue(String.valueOf(g.mo14869a()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public final C5426c m21053u0() {
        return (C5426c) this.f14184g0.getValue();
    }

    /* renamed from: v0 */
    private final C4938c m21054v0() {
        return (C4938c) this.f14183f0.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public final Long m21055w0() {
        return (Long) this.f14180c0.getValue();
    }

    /* renamed from: x0 */
    private final Boolean m21056x0() {
        return (Boolean) this.f14181d0.getValue();
    }

    /* renamed from: y0 */
    private final C5417a m21057y0() {
        return (C5417a) this.f14182e0.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C5007x m21059a(ViewGroup viewGroup) {
        C5007x a = C5007x.m20043a(mo2585u(), viewGroup, false);
        C5942k.m22324a((Object) a, "FragmentProfileBinding.i…flater, container, false)");
        return a;
    }

    /* renamed from: a */
    public void mo2506a(View view, Bundle bundle) {
        C5942k.m22327b(view, "view");
        super.mo2506a(view, bundle);
        LiveData f = m21057y0().mo15095f();
        C0523n J = mo2470J();
        String str = "viewLifecycleOwner";
        C5942k.m22324a((Object) J, str);
        f.mo2976a(J, new C5423e(this));
        C5007x xVar = (C5007x) mo2653s0();
        AppCompatImageButton appCompatImageButton = xVar.f13201c;
        C5942k.m22324a((Object) appCompatImageButton, "btnSettings");
        Long w0 = m21055w0();
        int i = 0;
        Boolean valueOf = Boolean.valueOf(true);
        appCompatImageButton.setVisibility(w0 == null ? 0 : 8);
        xVar.f13201c.setOnClickListener(this);
        xVar.f13203e.setOnClickListener(this);
        xVar.f13207i.setOnClickListener(this);
        xVar.f13210l.setOnClickListener(this);
        xVar.f13209k.setOnClickListener(this);
        xVar.f13208j.setOnClickListener(this);
        ViewPager2 viewPager2 = xVar.f13206h;
        C5942k.m22324a((Object) viewPager2, "viewPager");
        C5942k.m22326a((Object) Boolean.valueOf(viewPager2.getVisibility() == 0), (Object) m21056x0());
        EmptyView emptyView = xVar.f13202d;
        C5942k.m22324a((Object) emptyView, "emptyView");
        if (!C5942k.m22326a((Object) m21056x0(), (Object) valueOf)) {
            i = 8;
        }
        emptyView.setVisibility(i);
        if (!C5942k.m22326a((Object) m21056x0(), (Object) valueOf)) {
            TabLayout tabLayout = ((C5007x) mo2653s0()).f13204f;
            C5942k.m22324a((Object) tabLayout, "binding.tabLayout");
            m21049a(tabLayout);
            ViewPager2 viewPager22 = ((C5007x) mo2653s0()).f13206h;
            C5942k.m22324a((Object) viewPager22, "binding.viewPager");
            viewPager22.setAdapter(m21053u0());
            new C2747b(((C5007x) mo2653s0()).f13204f, ((C5007x) mo2653s0()).f13206h, new C5424f(this)).mo9157a();
        }
        C0523n J2 = mo2470J();
        C5942k.m22324a((Object) J2, str);
        Context p0 = mo2576p0();
        C5942k.m22324a((Object) p0, "requireContext()");
        C5710m.m21808a(J2, p0, m21057y0().mo15048c(), 0, null, 12, null);
    }

    /* renamed from: a */
    public void mo2511a(boolean z) {
        super.mo2511a(z);
        if (!z) {
            C4938c.m19734a(m21054v0(), "profile__screen_view", null, 2, null);
        }
    }

    public void onClick(View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        String str = "requireContext()";
        if ((valueOf != null && valueOf.intValue() == R.id.btn_settings) || (valueOf != null && valueOf.intValue() == R.id.image_avatar)) {
            if (m21055w0() == null) {
                C5661c cVar = SettingsActivity.f14701A;
                Context p0 = mo2576p0();
                C5942k.m22324a((Object) p0, str);
                mo2499a(cVar.mo15274a(p0));
                C4938c.m19734a(m21054v0(), view.getId() == R.id.btn_settings ? "profile__settings_click" : "profile__avatar_click", null, 2, null);
            }
        } else if (valueOf != null && valueOf.intValue() == R.id.view_stats_place) {
            C5602c cVar2 = LeaderboardActivity.f14584B;
            Context p02 = mo2576p0();
            C5942k.m22324a((Object) p02, str);
            mo2499a(cVar2.mo15235a(p02));
        } else if (valueOf != null && valueOf.intValue() == R.id.view_stats_want) {
            ((C5007x) mo2653s0()).f13206h.mo4342a(0, true);
        } else if (valueOf != null && valueOf.intValue() == R.id.view_stats_playing) {
            ((C5007x) mo2653s0()).f13206h.mo4342a(1, true);
        } else if (valueOf != null && valueOf.intValue() == R.id.view_stats_played) {
            ((C5007x) mo2653s0()).f13206h.mo4342a(2, true);
        }
    }

    /* renamed from: t0 */
    public final AppBarLayout mo2654t0() {
        AppBarLayout appBarLayout = ((C5007x) mo2653s0()).f13200b;
        C5942k.m22324a((Object) appBarLayout, "binding.appBarLayout");
        return appBarLayout;
    }
}
