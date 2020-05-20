package p255io.stashteam.stashapp.p281f.p290c.p291a;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.C0429d;
import androidx.fragment.app.C0445l;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0523n;
import androidx.lifecycle.C0533u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.C2542e;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import io.stashteam.games.tracker.stashapp.R;
import java.util.LinkedHashMap;
import p071f.p131r.C3503h;
import p255io.stashteam.stashapp.p256b.p257a.C4938c;
import p255io.stashteam.stashapp.p262c.C5009z;
import p255io.stashteam.stashapp.p269e.p280c.C5288b0;
import p255io.stashteam.stashapp.p269e.p280c.C5299h;
import p255io.stashteam.stashapp.p269e.p280c.C5303j;
import p255io.stashteam.stashapp.p269e.p280c.C5305k;
import p255io.stashteam.stashapp.p269e.p280c.C5313r;
import p255io.stashteam.stashapp.p269e.p280c.C5323z;
import p255io.stashteam.stashapp.p281f.p282a.C5326c;
import p255io.stashteam.stashapp.p281f.p282a.p283e.C5331b;
import p255io.stashteam.stashapp.p281f.p282a.p286h.C5343d;
import p255io.stashteam.stashapp.p281f.p292d.C5418b;
import p255io.stashteam.stashapp.p298ui.game.detail.GameDetailActivity;
import p255io.stashteam.stashapp.p298ui.game.detail.GameDetailActivity.C5495c;
import p255io.stashteam.stashapp.p298ui.game.list.C5574a;
import p255io.stashteam.stashapp.p298ui.widgets.empty_view.EmptyView;
import p255io.stashteam.stashapp.p298ui.widgets.filter.C5674a;
import p255io.stashteam.stashapp.p298ui.widgets.filter.C5675b;
import p255io.stashteam.stashapp.p298ui.widgets.filter.FilterView.C5672a;
import p255io.stashteam.stashapp.utils.C5688a;
import p255io.stashteam.stashapp.utils.p304f.C5705j;
import p255io.stashteam.stashapp.utils.p304f.C5709l;
import p255io.stashteam.stashapp.utils.p304f.C5710m;
import p255io.stashteam.stashapp.utils.p304f.C5713o;
import p255io.stashteam.stashapp.utils.p304f.C5714p;
import p308k.C5797g;
import p308k.C5808p;
import p308k.C5809q;
import p308k.C5812t;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p352o.p353a.p364c.p371j.C6557a;
import p352o.p353a.p364c.p371j.C6559b;
import p352o.p353a.p364c.p372k.C6560a;

/* renamed from: io.stashteam.stashapp.f.c.a.b */
public final class C5398b extends C5326c<C5009z> {

    /* renamed from: k0 */
    public static final C5401c f14149k0 = new C5401c(null);

    /* renamed from: c0 */
    private final C5797g f14150c0 = C5705j.m21799a((Fragment) this, "arg_list_type");

    /* renamed from: d0 */
    private final C5797g f14151d0 = C5705j.m21800a(this, "arg_user_id", null);

    /* renamed from: e0 */
    private final C5797g f14152e0 = C5799i.m22044a(new C5399a(this, null, null));

    /* renamed from: f0 */
    private final C5797g f14153f0 = C5799i.m22044a(new C5400b(this, null, new C5415p(this)));

    /* renamed from: g0 */
    private final C5797g f14154g0 = C5799i.m22044a(new C5402d(this));

    /* renamed from: h0 */
    private final C5797g f14155h0 = C5799i.m22044a(new C5405f(this));

    /* renamed from: i0 */
    private final C5797g f14156i0 = C5799i.m22044a(new C5404e(this));

    /* renamed from: j0 */
    private final C2542e f14157j0 = new C5406g(this);

    /* renamed from: io.stashteam.stashapp.f.c.a.b$a */
    public static final class C5399a extends C5943l implements C5907a<C4938c> {

        /* renamed from: g */
        final /* synthetic */ ComponentCallbacks f14158g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14159h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14160i;

        public C5399a(ComponentCallbacks componentCallbacks, C6560a aVar, C5907a aVar2) {
            this.f14158g = componentCallbacks;
            this.f14159h = aVar;
            this.f14160i = aVar2;
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p255io.stashteam.stashapp.p256b.p257a.C4938c invoke() {
            /*
                r4 = this;
                android.content.ComponentCallbacks r0 = r4.f14158g
                o.a.c.k.a r1 = r4.f14159h
                k.z.c.a r2 = r4.f14160i
                o.a.c.a r0 = p352o.p353a.p354a.p356b.p357a.C6511a.m24704a(r0)
                o.a.c.m.a r0 = r0.mo16935b()
                java.lang.Class<io.stashteam.stashapp.b.a.c> r3 = p255io.stashteam.stashapp.p256b.p257a.C4938c.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                java.lang.Object r0 = r0.mo17011a(r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p281f.p290c.p291a.C5398b.C5399a.invoke():java.lang.Object");
        }
    }

    /* renamed from: io.stashteam.stashapp.f.c.a.b$b */
    public static final class C5400b extends C5943l implements C5907a<C5574a> {

        /* renamed from: g */
        final /* synthetic */ C0523n f14161g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14162h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14163i;

        public C5400b(C0523n nVar, C6560a aVar, C5907a aVar2) {
            this.f14161g = nVar;
            this.f14162h = aVar;
            this.f14163i = aVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, io.stashteam.stashapp.ui.game.list.a] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1, types: [androidx.lifecycle.a0, io.stashteam.stashapp.ui.game.list.a]
          assigns: [androidx.lifecycle.a0]
          uses: [io.stashteam.stashapp.ui.game.list.a]
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
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p255io.stashteam.stashapp.p298ui.game.list.C5574a invoke() {
            /*
                r4 = this;
                androidx.lifecycle.n r0 = r4.f14161g
                o.a.c.k.a r1 = r4.f14162h
                k.z.c.a r2 = r4.f14163i
                java.lang.Class<io.stashteam.stashapp.ui.game.list.a> r3 = p255io.stashteam.stashapp.p298ui.game.list.C5574a.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                androidx.lifecycle.a0 r0 = p352o.p353a.p359b.p360a.p362d.p363a.C6521a.m24722a(r0, r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p281f.p290c.p291a.C5398b.C5400b.invoke():androidx.lifecycle.a0");
        }
    }

    /* renamed from: io.stashteam.stashapp.f.c.a.b$c */
    public static final class C5401c {
        private C5401c() {
        }

        public /* synthetic */ C5401c(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C5398b mo15086a(C5305k kVar, Long l) {
            C5942k.m22327b(kVar, "listType");
            C5398b bVar = new C5398b();
            Bundle bundle = new Bundle();
            bundle.putSerializable("arg_list_type", kVar);
            if (l != null) {
                bundle.putLong("arg_user_id", l.longValue());
            }
            bVar.mo2566m(bundle);
            return bVar;
        }
    }

    /* renamed from: io.stashteam.stashapp.f.c.a.b$d */
    static final class C5402d extends C5943l implements C5907a<C5331b> {

        /* renamed from: g */
        final /* synthetic */ C5398b f14164g;

        /* renamed from: io.stashteam.stashapp.f.c.a.b$d$a */
        public static final class C5403a implements C5343d {

            /* renamed from: a */
            final /* synthetic */ C5402d f14165a;

            C5403a(C5402d dVar) {
                this.f14165a = dVar;
            }

            /* renamed from: a */
            public void mo15044a(MaterialCardView materialCardView, AppCompatImageView appCompatImageView, C5323z zVar) {
                C5942k.m22327b(materialCardView, "cardView");
                C5942k.m22327b(appCompatImageView, "imageView");
                C5942k.m22327b(zVar, "game");
                C5495c cVar = GameDetailActivity.f14345I;
                C0429d o0 = this.f14165a.f14164g.mo2571o0();
                String str = "requireActivity()";
                C5942k.m22324a((Object) o0, str);
                Bundle a = cVar.mo15150a(o0, materialCardView, appCompatImageView);
                C5398b bVar = this.f14165a.f14164g;
                C5495c cVar2 = GameDetailActivity.f14345I;
                C0429d o02 = bVar.mo2571o0();
                C5942k.m22324a((Object) o02, str);
                bVar.mo2501a(cVar2.mo15149a((Context) o02, zVar), a);
            }
        }

        C5402d(C5398b bVar) {
            this.f14164g = bVar;
            super(0);
        }

        public final C5331b invoke() {
            return new C5331b(false, new C5403a(this));
        }
    }

    /* renamed from: io.stashteam.stashapp.f.c.a.b$e */
    static final class C5404e extends C5943l implements C5907a<C5674a> {

        /* renamed from: g */
        final /* synthetic */ C5398b f14166g;

        C5404e(C5398b bVar) {
            this.f14166g = bVar;
            super(0);
        }

        public final C5674a invoke() {
            return new C5674a(this.f14166g.m21027w0());
        }
    }

    /* renamed from: io.stashteam.stashapp.f.c.a.b$f */
    static final class C5405f extends C5943l implements C5907a<C5672a> {

        /* renamed from: g */
        final /* synthetic */ C5398b f14167g;

        C5405f(C5398b bVar) {
            this.f14167g = bVar;
            super(0);
        }

        public final C5672a invoke() {
            C5398b bVar = this.f14167g;
            return bVar.m21014a(bVar.m21028x0());
        }
    }

    /* renamed from: io.stashteam.stashapp.f.c.a.b$g */
    static final class C5406g implements C2542e {

        /* renamed from: a */
        final /* synthetic */ C5398b f14168a;

        C5406g(C5398b bVar) {
            this.f14168a = bVar;
        }

        /* renamed from: a */
        public final void mo7923a(AppBarLayout appBarLayout, int i) {
            C5942k.m22324a((Object) appBarLayout, "appBar");
            int height = (appBarLayout.getHeight() - C5709l.m21806a(48)) + i;
            FloatingActionButton floatingActionButton = C5398b.m21018b(this.f14168a).f13222d;
            String str = "binding.fabFilter";
            C5942k.m22324a((Object) floatingActionButton, str);
            LayoutParams layoutParams = floatingActionButton.getLayoutParams();
            Integer num = null;
            if (!(layoutParams instanceof MarginLayoutParams)) {
                layoutParams = null;
            }
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                num = Integer.valueOf(marginLayoutParams.bottomMargin);
            }
            if (num == null || height != num.intValue()) {
                FloatingActionButton floatingActionButton2 = C5398b.m21018b(this.f14168a).f13222d;
                C5942k.m22324a((Object) floatingActionButton2, str);
                C5714p.m21815a(floatingActionButton2, null, null, null, Integer.valueOf(height), 7, null);
                Chip chip = C5398b.m21018b(this.f14168a).f13220b;
                C5942k.m22324a((Object) chip, "binding.chipFilter");
                C5714p.m21815a(chip, null, null, null, Integer.valueOf(height), 7, null);
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.f.c.a.b$h */
    static final class C5407h<T> implements C0533u<C5313r> {

        /* renamed from: a */
        final /* synthetic */ C5398b f14169a;

        C5407h(C5398b bVar) {
            this.f14169a = bVar;
        }

        /* renamed from: a */
        public final void mo3048a(C5313r rVar) {
            SwipeRefreshLayout swipeRefreshLayout = C5398b.m21018b(this.f14169a).f13224f;
            C5942k.m22324a((Object) swipeRefreshLayout, "binding.swipeRefresh");
            boolean z = true;
            int i = 0;
            swipeRefreshLayout.setRefreshing(rVar == C5313r.LOADING);
            EmptyView emptyView = C5398b.m21018b(this.f14169a).f13221c;
            C5942k.m22324a((Object) emptyView, "binding.emptyView");
            if (rVar != C5313r.EMPTY_LIST) {
                z = false;
            }
            if (!z) {
                i = 8;
            }
            emptyView.setVisibility(i);
        }
    }

    /* renamed from: io.stashteam.stashapp.f.c.a.b$i */
    static final class C5408i<T> implements C0533u<C3503h<C5323z>> {

        /* renamed from: a */
        final /* synthetic */ C5398b f14170a;

        C5408i(C5398b bVar) {
            this.f14170a = bVar;
        }

        /* renamed from: a */
        public final void mo3048a(C3503h<C5323z> hVar) {
            this.f14170a.m21024t0().mo11179b(hVar);
        }
    }

    /* renamed from: io.stashteam.stashapp.f.c.a.b$j */
    public static final class C5409j extends C5675b {

        /* renamed from: b */
        final /* synthetic */ C5398b f14171b;

        C5409j(C5398b bVar, FloatingActionButton floatingActionButton) {
            this.f14171b = bVar;
            super(floatingActionButton);
        }

        /* renamed from: c */
        public boolean mo15089c() {
            C5299h hVar = (C5299h) this.f14171b.m21030z0().mo15212f().mo2974a();
            return hVar != null && hVar.mo14941j();
        }
    }

    /* renamed from: io.stashteam.stashapp.f.c.a.b$k */
    static final class C5410k implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C5398b f14172f;

        C5410k(C5398b bVar) {
            this.f14172f = bVar;
        }

        public final void onClick(View view) {
            this.f14172f.m21011B0();
        }
    }

    /* renamed from: io.stashteam.stashapp.f.c.a.b$l */
    static final class C5411l implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C5398b f14173f;

        C5411l(C5398b bVar) {
            this.f14173f = bVar;
        }

        public final void onClick(View view) {
            this.f14173f.m21011B0();
        }
    }

    /* renamed from: io.stashteam.stashapp.f.c.a.b$m */
    static final class C5412m implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C5398b f14174f;

        C5412m(C5398b bVar) {
            this.f14174f = bVar;
        }

        public final void onClick(View view) {
            this.f14174f.m21030z0().mo15083i();
        }
    }

    /* renamed from: io.stashteam.stashapp.f.c.a.b$n */
    static final class C5413n extends C5943l implements C5918l<C5299h, C5812t> {

        /* renamed from: g */
        final /* synthetic */ C5398b f14175g;

        C5413n(C5398b bVar) {
            this.f14175g = bVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo15093a(C5299h hVar) {
            C5942k.m22327b(hVar, "filterData");
            this.f14175g.m21030z0().mo15080a(hVar);
            this.f14175g.m21016a(hVar);
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo15093a((C5299h) obj);
            return C5812t.f14872a;
        }
    }

    /* renamed from: io.stashteam.stashapp.f.c.a.b$o */
    static final class C5414o<T> implements C0533u<C5299h> {

        /* renamed from: a */
        final /* synthetic */ C5398b f14176a;

        C5414o(C5398b bVar) {
            this.f14176a = bVar;
        }

        /* renamed from: a */
        public final void mo3048a(C5299h hVar) {
            boolean j = hVar.mo14941j();
            Chip chip = C5398b.m21018b(this.f14176a).f13220b;
            String str = "binding.chipFilter";
            C5942k.m22324a((Object) chip, str);
            int i = 8;
            chip.setVisibility(j ? 0 : 8);
            FloatingActionButton floatingActionButton = C5398b.m21018b(this.f14176a).f13222d;
            C5942k.m22324a((Object) floatingActionButton, "binding.fabFilter");
            if (!j && this.f14176a.m21027w0() != null) {
                i = 0;
            }
            floatingActionButton.setVisibility(i);
            if (j) {
                Chip chip2 = C5398b.m21018b(this.f14176a).f13220b;
                C5942k.m22324a((Object) chip2, str);
                C5688a aVar = C5688a.f14784a;
                Context p0 = this.f14176a.mo2576p0();
                C5942k.m22324a((Object) p0, "requireContext()");
                C5942k.m22324a((Object) hVar, "filterData");
                chip2.setText(aVar.mo15340a(p0, hVar));
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.f.c.a.b$p */
    static final class C5415p extends C5943l implements C5907a<C6557a> {

        /* renamed from: g */
        final /* synthetic */ C5398b f14177g;

        C5415p(C5398b bVar) {
            this.f14177g = bVar;
            super(0);
        }

        public final C6557a invoke() {
            C5299h hVar = new C5299h(null, null, null, null, C5288b0.ADDED_DATE, 15, null);
            return C6559b.m24801a(this.f14177g.m21028x0(), this.f14177g.m21029y0(), hVar);
        }
    }

    /* renamed from: A0 */
    private final void m21010A0() {
        String str = "binding.fabFilter";
        if (m21027w0() != null) {
            Fragment x = mo2588x();
            if (x != null) {
                ((C5418b) x).mo2654t0().mo7853a(this.f14157j0);
                RecyclerView recyclerView = ((C5009z) mo2653s0()).f13223e;
                FloatingActionButton floatingActionButton = ((C5009z) mo2653s0()).f13222d;
                C5942k.m22324a((Object) floatingActionButton, str);
                recyclerView.addOnScrollListener(new C5409j(this, floatingActionButton));
            } else {
                throw new C5809q("null cannot be cast to non-null type io.stashteam.stashapp.ui.profile.ProfileFragment");
            }
        }
        FloatingActionButton floatingActionButton2 = ((C5009z) mo2653s0()).f13222d;
        C5942k.m22324a((Object) floatingActionButton2, str);
        int i = 0;
        if (!(m21027w0() != null)) {
            i = 8;
        }
        floatingActionButton2.setVisibility(i);
        ((C5009z) mo2653s0()).f13222d.setOnClickListener(new C5410k(this));
        ((C5009z) mo2653s0()).f13220b.setOnClickListener(new C5411l(this));
        ((C5009z) mo2653s0()).f13220b.setOnCloseIconClickListener(new C5412m(this));
        m21026v0().mo15304a((C5918l<? super C5299h, C5812t>) new C5413n<Object,C5812t>(this));
        m21030z0().mo15212f().mo2976a(mo2470J(), new C5414o(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public final void m21011B0() {
        if (!m21026v0().mo2481U()) {
            C5299h hVar = (C5299h) m21030z0().mo15212f().mo2974a();
            if (hVar == null) {
                hVar = new C5299h(null, null, null, null, null, 31, null);
            }
            C5942k.m22324a((Object) hVar, "viewModel.filterData.value ?: FilterData()");
            C5674a v0 = m21026v0();
            C0445l y = mo2589y();
            C5942k.m22324a((Object) y, "parentFragmentManager");
            v0.mo15303a(y, m21026v0().mo2467G(), hVar);
            m21012C0();
        }
    }

    /* renamed from: C0 */
    private final void m21012C0() {
        String str = "game_list__filter_open";
        m21025u0().mo14079a(str, C5821b0.m22070a(C5808p.m22056a("list_type", m21028x0().mo14955f())));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C5672a m21014a(C5305k kVar) {
        int i = C5416c.f14178a[kVar.ordinal()];
        if (i == 1) {
            return new C5672a(C5836k.m22153a(C5303j.ONLY_RELEASED), C5837l.m22162b((Object[]) new C5288b0[]{C5288b0.ADDED_DATE, C5288b0.RELEASE_DATE, C5288b0.GAME_NAME}));
        } else if (i == 2) {
            return new C5672a(null, C5837l.m22162b((Object[]) new C5288b0[]{C5288b0.ADDED_DATE, C5288b0.RELEASE_DATE, C5288b0.GAME_NAME}), 1, null);
        } else if (i != 3) {
            return null;
        } else {
            return new C5672a(C5837l.m22162b((Object[]) new C5303j[]{C5303j.COMPLETED, C5303j.NOT_COMPLETED}), C5837l.m22162b((Object[]) new C5288b0[]{C5288b0.ADDED_DATE, C5288b0.RELEASE_DATE, C5288b0.USER_SCORE, C5288b0.GAME_NAME}));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m21016a(C5299h hVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("list_type", m21028x0().mo14955f());
        if (hVar.mo14933d() != null) {
            linkedHashMap.put(hVar.mo14933d().mo14950f(), Boolean.valueOf(true));
        }
        if (hVar.mo14938h() != null) {
            linkedHashMap.put("sort_field", hVar.mo14938h().mo14861f());
        }
        m21025u0().mo14079a("game_list__filter_apply", linkedHashMap);
    }

    /* renamed from: b */
    public static final /* synthetic */ C5009z m21018b(C5398b bVar) {
        return (C5009z) bVar.mo2653s0();
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public final C5331b m21024t0() {
        return (C5331b) this.f14154g0.getValue();
    }

    /* renamed from: u0 */
    private final C4938c m21025u0() {
        return (C4938c) this.f14152e0.getValue();
    }

    /* renamed from: v0 */
    private final C5674a m21026v0() {
        return (C5674a) this.f14156i0.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public final C5672a m21027w0() {
        return (C5672a) this.f14155h0.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public final C5305k m21028x0() {
        return (C5305k) this.f14150c0.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public final Long m21029y0() {
        return (Long) this.f14151d0.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public final C5574a m21030z0() {
        return (C5574a) this.f14153f0.getValue();
    }

    /* renamed from: Y */
    public void mo2485Y() {
        super.mo2485Y();
        Fragment x = mo2588x();
        if (x != null) {
            ((C5418b) x).mo2654t0().mo7859b(this.f14157j0);
            return;
        }
        throw new C5809q("null cannot be cast to non-null type io.stashteam.stashapp.ui.profile.ProfileFragment");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C5009z m21033a(ViewGroup viewGroup) {
        C5009z a = C5009z.m20051a(mo2585u(), viewGroup, false);
        C5942k.m22324a((Object) a, "FragmentUserGamesBinding…flater, container, false)");
        return a;
    }

    /* renamed from: a */
    public void mo2506a(View view, Bundle bundle) {
        int i;
        C5942k.m22327b(view, "view");
        super.mo2506a(view, bundle);
        RecyclerView recyclerView = ((C5009z) mo2653s0()).f13223e;
        String str = "binding.recyclerView";
        C5942k.m22324a((Object) recyclerView, str);
        C5713o.m21812a(recyclerView, 0, 1, null);
        RecyclerView recyclerView2 = ((C5009z) mo2653s0()).f13223e;
        C5942k.m22324a((Object) recyclerView2, str);
        recyclerView2.setAdapter(m21024t0());
        m21010A0();
        ((C5009z) mo2653s0()).f13221c.setDescriptionVisibility(m21029y0() == null);
        EmptyView emptyView = ((C5009z) mo2653s0()).f13221c;
        if (m21028x0() == C5305k.WANT_LIST && m21029y0() == null) {
            i = R.string.profile_want_empty_title;
        } else if (m21028x0() == C5305k.PLAYING_LIST && m21029y0() == null) {
            i = R.string.profile_playing_empty_title;
        } else if (m21028x0() == C5305k.PLAYED_LIST && m21029y0() == null) {
            i = R.string.profile_played_empty_title;
        } else if (m21029y0() != null) {
            i = R.string.common_empty_list_title;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Don't support ");
            sb.append(m21028x0().name());
            sb.append(" type.");
            throw new IllegalArgumentException(sb.toString());
        }
        emptyView.setTitle(i);
        ((C5009z) mo2653s0()).f13224f.setColorSchemeResources(R.color.black);
        SwipeRefreshLayout swipeRefreshLayout = ((C5009z) mo2653s0()).f13224f;
        C5942k.m22324a((Object) swipeRefreshLayout, "binding.swipeRefresh");
        swipeRefreshLayout.setEnabled(false);
        m21030z0().mo15082h().mo2976a(mo2470J(), new C5407h(this));
        m21030z0().mo15081g().mo2976a(mo2470J(), new C5408i(this));
        C0523n J = mo2470J();
        C5942k.m22324a((Object) J, "viewLifecycleOwner");
        Context p0 = mo2576p0();
        C5942k.m22324a((Object) p0, "requireContext()");
        C5710m.m21808a(J, p0, m21030z0().mo15048c(), 0, null, 12, null);
    }
}
