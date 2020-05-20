package p255io.stashteam.stashapp.p281f.p288b.p289c;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0523n;
import androidx.lifecycle.C0533u;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.C2542e;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p131r.C3503h;
import p255io.stashteam.stashapp.p256b.p257a.C4938c;
import p255io.stashteam.stashapp.p262c.C4984i0;
import p255io.stashteam.stashapp.p269e.p280c.C5297f;
import p255io.stashteam.stashapp.p269e.p280c.C5313r;
import p255io.stashteam.stashapp.p281f.p282a.C5326c;
import p255io.stashteam.stashapp.p281f.p282a.p286h.C5341b;
import p255io.stashteam.stashapp.p281f.p282a.p286h.C5342c;
import p255io.stashteam.stashapp.p281f.p288b.C5361b;
import p255io.stashteam.stashapp.p281f.p288b.C5361b.C5365c;
import p255io.stashteam.stashapp.p281f.p292d.C5418b;
import p255io.stashteam.stashapp.p281f.p295f.p297b.C5450c;
import p255io.stashteam.stashapp.p298ui.custom_list.detail.CustomListDetailActivity;
import p255io.stashteam.stashapp.p298ui.custom_list.detail.CustomListDetailActivity.C5472c;
import p255io.stashteam.stashapp.p298ui.widgets.empty_view.EmptyView;
import p255io.stashteam.stashapp.utils.p304f.C5709l;
import p255io.stashteam.stashapp.utils.p304f.C5714p;
import p308k.C5797g;
import p308k.C5802l;
import p308k.C5808p;
import p308k.C5809q;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p352o.p353a.p364c.p372k.C6560a;

/* renamed from: io.stashteam.stashapp.f.b.c.a */
public final class C5370a extends C5326c<C4984i0> implements C5365c {

    /* renamed from: g0 */
    public static final C5373c f14075g0 = new C5373c(null);

    /* renamed from: c0 */
    private final C5797g f14076c0 = C5799i.m22044a(new C5372b(this, null, null));

    /* renamed from: d0 */
    private final C5797g f14077d0 = C5799i.m22044a(new C5371a(this, null, null));

    /* renamed from: e0 */
    private final C5797g f14078e0 = C5799i.m22044a(new C5374d(this));

    /* renamed from: f0 */
    private final C2542e f14079f0 = new C5376e(this);

    /* renamed from: io.stashteam.stashapp.f.b.c.a$a */
    public static final class C5371a extends C5943l implements C5907a<C4938c> {

        /* renamed from: g */
        final /* synthetic */ ComponentCallbacks f14080g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14081h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14082i;

        public C5371a(ComponentCallbacks componentCallbacks, C6560a aVar, C5907a aVar2) {
            this.f14080g = componentCallbacks;
            this.f14081h = aVar;
            this.f14082i = aVar2;
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
                android.content.ComponentCallbacks r0 = r4.f14080g
                o.a.c.k.a r1 = r4.f14081h
                k.z.c.a r2 = r4.f14082i
                o.a.c.a r0 = p352o.p353a.p354a.p356b.p357a.C6511a.m24704a(r0)
                o.a.c.m.a r0 = r0.mo16935b()
                java.lang.Class<io.stashteam.stashapp.b.a.c> r3 = p255io.stashteam.stashapp.p256b.p257a.C4938c.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                java.lang.Object r0 = r0.mo17011a(r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p281f.p288b.p289c.C5370a.C5371a.invoke():java.lang.Object");
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.c.a$b */
    public static final class C5372b extends C5943l implements C5907a<C5389d> {

        /* renamed from: g */
        final /* synthetic */ C0523n f14083g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14084h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14085i;

        public C5372b(C0523n nVar, C6560a aVar, C5907a aVar2) {
            this.f14083g = nVar;
            this.f14084h = aVar;
            this.f14085i = aVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [io.stashteam.stashapp.f.b.c.d, androidx.lifecycle.a0] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1, types: [io.stashteam.stashapp.f.b.c.d, androidx.lifecycle.a0]
          assigns: [androidx.lifecycle.a0]
          uses: [io.stashteam.stashapp.f.b.c.d]
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
        public final p255io.stashteam.stashapp.p281f.p288b.p289c.C5389d invoke() {
            /*
                r4 = this;
                androidx.lifecycle.n r0 = r4.f14083g
                o.a.c.k.a r1 = r4.f14084h
                k.z.c.a r2 = r4.f14085i
                java.lang.Class<io.stashteam.stashapp.f.b.c.d> r3 = p255io.stashteam.stashapp.p281f.p288b.p289c.C5389d.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                androidx.lifecycle.a0 r0 = p352o.p353a.p359b.p360a.p362d.p363a.C6521a.m24722a(r0, r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p281f.p288b.p289c.C5370a.C5372b.invoke():androidx.lifecycle.a0");
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.c.a$c */
    public static final class C5373c {
        private C5373c() {
        }

        public /* synthetic */ C5373c(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C5370a mo15065a() {
            return new C5370a();
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.c.a$d */
    static final class C5374d extends C5943l implements C5907a<C5381b> {

        /* renamed from: g */
        final /* synthetic */ C5370a f14086g;

        /* renamed from: io.stashteam.stashapp.f.b.c.a$d$a */
        public static final class C5375a implements C5342c {

            /* renamed from: a */
            final /* synthetic */ C5374d f14087a;

            C5375a(C5374d dVar) {
                this.f14087a = dVar;
            }

            /* renamed from: a */
            public void mo15043a(C5297f fVar) {
                C5942k.m22327b(fVar, "customList");
                C5370a aVar = this.f14087a.f14086g;
                C5472c cVar = CustomListDetailActivity.f14300D;
                Context p0 = aVar.mo2576p0();
                C5942k.m22324a((Object) p0, "requireContext()");
                aVar.mo2499a(cVar.mo15127a(p0, fVar.mo14903d()));
            }
        }

        C5374d(C5370a aVar) {
            this.f14086g = aVar;
            super(0);
        }

        public final C5381b invoke() {
            return new C5381b(R.color.color_surface, new C5375a(this));
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.c.a$e */
    static final class C5376e implements C2542e {

        /* renamed from: a */
        final /* synthetic */ C5370a f14088a;

        C5376e(C5370a aVar) {
            this.f14088a = aVar;
        }

        /* renamed from: a */
        public final void mo7923a(AppBarLayout appBarLayout, int i) {
            C5942k.m22324a((Object) appBarLayout, "appBar");
            int height = (appBarLayout.getHeight() - C5709l.m21806a(48)) + i;
            ExtendedFloatingActionButton extendedFloatingActionButton = C5370a.m20924b(this.f14088a).f13073c;
            String str = "binding.fabCreate";
            C5942k.m22324a((Object) extendedFloatingActionButton, str);
            LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            Integer num = null;
            if (!(layoutParams instanceof MarginLayoutParams)) {
                layoutParams = null;
            }
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                num = Integer.valueOf(marginLayoutParams.bottomMargin);
            }
            if (num == null || height != num.intValue()) {
                ExtendedFloatingActionButton extendedFloatingActionButton2 = C5370a.m20924b(this.f14088a).f13073c;
                C5942k.m22324a((Object) extendedFloatingActionButton2, str);
                C5714p.m21815a(extendedFloatingActionButton2, null, null, null, Integer.valueOf(height), 7, null);
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.c.a$f */
    public static final class C5377f<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ C5370a f14089a;

        public C5377f(C5370a aVar) {
            this.f14089a = aVar;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            C5313r rVar = (C5313r) t;
            SwipeRefreshLayout swipeRefreshLayout = C5370a.m20924b(this.f14089a).f13075e;
            C5942k.m22324a((Object) swipeRefreshLayout, "binding.swipeRefresh");
            boolean z = true;
            int i = 0;
            swipeRefreshLayout.setRefreshing(rVar == C5313r.LOADING);
            EmptyView emptyView = C5370a.m20924b(this.f14089a).f13072b;
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

    /* renamed from: io.stashteam.stashapp.f.b.c.a$g */
    public static final class C5378g<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ C5370a f14090a;

        public C5378g(C5370a aVar) {
            this.f14090a = aVar;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            this.f14090a.m20928t0().mo11179b((C3503h) t);
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.c.a$h */
    public static final class C5379h extends C5341b {

        /* renamed from: a */
        final /* synthetic */ C5370a f14091a;

        C5379h(C5370a aVar) {
            this.f14091a = aVar;
        }

        /* renamed from: a */
        public void mo15041a() {
            C5370a.m20924b(this.f14091a).f13073c.mo8691b();
        }

        /* renamed from: b */
        public void mo15042b() {
            C5370a.m20924b(this.f14091a).f13073c.mo8692c();
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.c.a$i */
    static final class C5380i implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C5370a f14092f;

        C5380i(C5370a aVar) {
            this.f14092f = aVar;
        }

        public final void onClick(View view) {
            this.f14092f.m20931w0();
            this.f14092f.m20932x0();
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ C4984i0 m20924b(C5370a aVar) {
        return (C4984i0) aVar.mo2653s0();
    }

    /* renamed from: b */
    private final void m20925b(C5297f fVar) {
        C4938c u0 = m20929u0();
        C5802l[] lVarArr = new C5802l[2];
        lVarArr[0] = C5808p.m22056a("custom_list_name", fVar.mo14904e());
        String a = fVar.mo14899a();
        if (a == null) {
            a = "";
        }
        lVarArr[1] = C5808p.m22056a("custom_list_color", a);
        u0.mo14079a("custom_lists__created_list", C5823c0.m22080b(lVarArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public final C5381b m20928t0() {
        return (C5381b) this.f14078e0.getValue();
    }

    /* renamed from: u0 */
    private final C4938c m20929u0() {
        return (C4938c) this.f14077d0.getValue();
    }

    /* renamed from: v0 */
    private final C5389d m20930v0() {
        return (C5389d) this.f14076c0.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public final void m20931w0() {
        C5361b a = C5361b.f14064t0.mo15060a();
        C5361b.m20905a(a, null, this, 1, null);
        a.mo2649a(mo2565m(), a.mo2467G());
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public final void m20932x0() {
        C4938c.m19734a(m20929u0(), "custom_lists__create_click", null, 2, null);
    }

    /* renamed from: Y */
    public void mo2485Y() {
        super.mo2485Y();
        Fragment x = mo2588x();
        if (x != null) {
            ((C5418b) x).mo2654t0().mo7859b(this.f14079f0);
            return;
        }
        throw new C5809q("null cannot be cast to non-null type io.stashteam.stashapp.ui.profile.ProfileFragment");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C4984i0 m20935a(ViewGroup viewGroup) {
        C4984i0 a = C4984i0.m19960a(mo2585u(), viewGroup, false);
        C5942k.m22324a((Object) a, "ViewCustomListsBinding.i…flater, container, false)");
        return a;
    }

    /* renamed from: a */
    public void mo2506a(View view, Bundle bundle) {
        C5942k.m22327b(view, "view");
        super.mo2506a(view, bundle);
        int dimensionPixelOffset = mo2461A().getDimensionPixelOffset(R.dimen.space_medium);
        RecyclerView recyclerView = ((C4984i0) mo2653s0()).f13074d;
        String str = "binding.recyclerView";
        C5942k.m22324a((Object) recyclerView, str);
        recyclerView.setLayoutManager(new LinearLayoutManager(mo2576p0()));
        RecyclerView recyclerView2 = ((C4984i0) mo2653s0()).f13074d;
        C5942k.m22324a((Object) recyclerView2, str);
        recyclerView2.setAdapter(m20928t0());
        ((C4984i0) mo2653s0()).f13074d.addItemDecoration(new C5450c(dimensionPixelOffset));
        ((C4984i0) mo2653s0()).f13074d.addOnScrollListener(new C5379h(this));
        Fragment x = mo2588x();
        if (x != null) {
            ((C5418b) x).mo2654t0().mo7853a(this.f14079f0);
            ((C4984i0) mo2653s0()).f13073c.setOnClickListener(new C5380i(this));
            ((C4984i0) mo2653s0()).f13075e.setColorSchemeResources(R.color.black);
            SwipeRefreshLayout swipeRefreshLayout = ((C4984i0) mo2653s0()).f13075e;
            C5942k.m22324a((Object) swipeRefreshLayout, "binding.swipeRefresh");
            swipeRefreshLayout.setEnabled(false);
            LiveData g = m20930v0().mo15078g();
            C0523n J = mo2470J();
            String str2 = "viewLifecycleOwner";
            C5942k.m22324a((Object) J, str2);
            g.mo2976a(J, new C5377f(this));
            LiveData f = m20930v0().mo15077f();
            C0523n J2 = mo2470J();
            C5942k.m22324a((Object) J2, str2);
            f.mo2976a(J2, new C5378g(this));
            return;
        }
        throw new C5809q("null cannot be cast to non-null type io.stashteam.stashapp.ui.profile.ProfileFragment");
    }

    /* renamed from: a */
    public void mo15052a(C5297f fVar) {
        C5942k.m22327b(fVar, "customList");
        m20930v0().mo15076a(fVar);
        m20925b(fVar);
    }
}
