package p255io.stashteam.stashapp.p298ui.home;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.emoji.widget.EmojiAppCompatTextView;
import androidx.fragment.app.C0429d;
import androidx.lifecycle.C0523n;
import androidx.lifecycle.C0533u;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.C0768j;
import com.google.android.material.card.MaterialCardView;
import io.stashteam.games.tracker.stashapp.R;
import p255io.stashteam.stashapp.p256b.p257a.C4938c;
import p255io.stashteam.stashapp.p262c.C5006w;
import p255io.stashteam.stashapp.p269e.p280c.C5305k;
import p255io.stashteam.stashapp.p269e.p280c.C5323z;
import p255io.stashteam.stashapp.p281f.p282a.C5326c;
import p255io.stashteam.stashapp.p281f.p282a.p283e.C5329a;
import p255io.stashteam.stashapp.p281f.p282a.p286h.C5343d;
import p255io.stashteam.stashapp.p298ui.game.detail.GameDetailActivity;
import p255io.stashteam.stashapp.p298ui.game.detail.GameDetailActivity.C5495c;
import p255io.stashteam.stashapp.p298ui.game.list.GameListActivity;
import p255io.stashteam.stashapp.p298ui.game.list.GameListActivity.C5558c;
import p255io.stashteam.stashapp.utils.p304f.C5699e;
import p255io.stashteam.stashapp.utils.p304f.C5710m;
import p308k.C5797g;
import p308k.C5812t;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p352o.p353a.p364c.p372k.C6560a;

/* renamed from: io.stashteam.stashapp.ui.home.b */
public final class C5581b extends C5326c<C5006w> {

    /* renamed from: j0 */
    public static final C5584c f14535j0 = new C5584c(null);

    /* renamed from: c0 */
    private final C5797g f14536c0 = C5799i.m22044a(new C5583b(this, null, null));

    /* renamed from: d0 */
    private final C5797g f14537d0 = C5799i.m22044a(new C5582a(this, null, null));
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public final C5588g f14538e0 = new C5588g(this);

    /* renamed from: f0 */
    private final C5918l<View, C5812t> f14539f0 = new C5594m(this);

    /* renamed from: g0 */
    private final C5797g f14540g0 = C5799i.m22044a(new C5585d(this));

    /* renamed from: h0 */
    private final C5797g f14541h0 = C5799i.m22044a(new C5586e(this));

    /* renamed from: i0 */
    private final C5797g f14542i0 = C5799i.m22044a(new C5587f(this));

    /* renamed from: io.stashteam.stashapp.ui.home.b$a */
    public static final class C5582a extends C5943l implements C5907a<C4938c> {

        /* renamed from: g */
        final /* synthetic */ ComponentCallbacks f14543g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14544h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14545i;

        public C5582a(ComponentCallbacks componentCallbacks, C6560a aVar, C5907a aVar2) {
            this.f14543g = componentCallbacks;
            this.f14544h = aVar;
            this.f14545i = aVar2;
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
                android.content.ComponentCallbacks r0 = r4.f14543g
                o.a.c.k.a r1 = r4.f14544h
                k.z.c.a r2 = r4.f14545i
                o.a.c.a r0 = p352o.p353a.p354a.p356b.p357a.C6511a.m24704a(r0)
                o.a.c.m.a r0 = r0.mo16935b()
                java.lang.Class<io.stashteam.stashapp.b.a.c> r3 = p255io.stashteam.stashapp.p256b.p257a.C4938c.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                java.lang.Object r0 = r0.mo17011a(r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.home.C5581b.C5582a.invoke():java.lang.Object");
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.home.b$b */
    public static final class C5583b extends C5943l implements C5907a<C5595c> {

        /* renamed from: g */
        final /* synthetic */ C0523n f14546g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14547h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14548i;

        public C5583b(C0523n nVar, C6560a aVar, C5907a aVar2) {
            this.f14546g = nVar;
            this.f14547h = aVar;
            this.f14548i = aVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [io.stashteam.stashapp.ui.home.c, androidx.lifecycle.a0] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1, types: [io.stashteam.stashapp.ui.home.c, androidx.lifecycle.a0]
          assigns: [androidx.lifecycle.a0]
          uses: [io.stashteam.stashapp.ui.home.c]
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
        public final p255io.stashteam.stashapp.p298ui.home.C5595c invoke() {
            /*
                r4 = this;
                androidx.lifecycle.n r0 = r4.f14546g
                o.a.c.k.a r1 = r4.f14547h
                k.z.c.a r2 = r4.f14548i
                java.lang.Class<io.stashteam.stashapp.ui.home.c> r3 = p255io.stashteam.stashapp.p298ui.home.C5595c.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                androidx.lifecycle.a0 r0 = p352o.p353a.p359b.p360a.p362d.p363a.C6521a.m24722a(r0, r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.home.C5581b.C5583b.invoke():androidx.lifecycle.a0");
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.home.b$c */
    public static final class C5584c {
        private C5584c() {
        }

        public /* synthetic */ C5584c(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C5581b mo15225a() {
            return new C5581b();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.home.b$d */
    static final class C5585d extends C5943l implements C5907a<C5329a> {

        /* renamed from: g */
        final /* synthetic */ C5581b f14549g;

        C5585d(C5581b bVar) {
            this.f14549g = bVar;
            super(0);
        }

        public final C5329a invoke() {
            return new C5329a(R.dimen.item_game_width_large, this.f14549g.f14538e0);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.home.b$e */
    static final class C5586e extends C5943l implements C5907a<C5329a> {

        /* renamed from: g */
        final /* synthetic */ C5581b f14550g;

        C5586e(C5581b bVar) {
            this.f14550g = bVar;
            super(0);
        }

        public final C5329a invoke() {
            return new C5329a(0, this.f14550g.f14538e0, 1, null);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.home.b$f */
    static final class C5587f extends C5943l implements C5907a<C5329a> {

        /* renamed from: g */
        final /* synthetic */ C5581b f14551g;

        C5587f(C5581b bVar) {
            this.f14551g = bVar;
            super(0);
        }

        public final C5329a invoke() {
            return new C5329a(0, this.f14551g.f14538e0, 1, null);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.home.b$g */
    public static final class C5588g implements C5343d {

        /* renamed from: a */
        final /* synthetic */ C5581b f14552a;

        C5588g(C5581b bVar) {
            this.f14552a = bVar;
        }

        /* renamed from: a */
        public void mo15044a(MaterialCardView materialCardView, AppCompatImageView appCompatImageView, C5323z zVar) {
            C5942k.m22327b(materialCardView, "cardView");
            C5942k.m22327b(appCompatImageView, "imageView");
            C5942k.m22327b(zVar, "game");
            C5495c cVar = GameDetailActivity.f14345I;
            C0429d o0 = this.f14552a.mo2571o0();
            String str = "requireActivity()";
            C5942k.m22324a((Object) o0, str);
            Bundle a = cVar.mo15150a(o0, materialCardView, appCompatImageView);
            C5581b bVar = this.f14552a;
            C5495c cVar2 = GameDetailActivity.f14345I;
            C0429d o02 = bVar.mo2571o0();
            C5942k.m22324a((Object) o02, str);
            bVar.mo2501a(cVar2.mo15149a((Context) o02, zVar), a);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.home.b$h */
    static final class C5589h implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C5581b f14553f;

        C5589h(C5581b bVar) {
            this.f14553f = bVar;
        }

        public final void onClick(View view) {
            C5581b bVar = this.f14553f;
            C5558c cVar = GameListActivity.f14483J;
            Context p0 = bVar.mo2576p0();
            C5942k.m22324a((Object) p0, "requireContext()");
            bVar.mo2499a(C5558c.m21386a(cVar, p0, this.f14553f.mo2491a((int) R.string.home_top_rated_with_emoji), null, C5305k.TOP_RATED, null, null, null, 116, null));
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.home.b$i */
    static final class C5590i implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C5581b f14554f;

        C5590i(C5581b bVar) {
            this.f14554f = bVar;
        }

        public final void onClick(View view) {
            C4938c.m19734a(this.f14554f.m21421w0(), "home__send_feedback_click", null, 2, null);
            Context n = this.f14554f.mo2568n();
            if (n != null) {
                C5699e.m21789b(n);
            }
            this.f14554f.m21422x0().mo15234i();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.home.b$j */
    static final class C5591j implements C0768j {

        /* renamed from: a */
        final /* synthetic */ C5581b f14555a;

        C5591j(C5581b bVar) {
            this.f14555a = bVar;
        }

        /* renamed from: a */
        public final void mo4225a() {
            this.f14555a.m21422x0().mo15233h();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.home.b$k */
    static final class C5592k<T> implements C0533u<C5580a> {

        /* renamed from: a */
        final /* synthetic */ C5581b f14556a;

        C5592k(C5581b bVar) {
            this.f14556a = bVar;
        }

        /* renamed from: a */
        public final void mo3048a(C5580a aVar) {
            this.f14556a.m21418t0().mo3932a(aVar.mo15219a());
            this.f14556a.m21419u0().mo3932a(aVar.mo15220b());
            this.f14556a.m21420v0().mo3932a(aVar.mo15221c());
            NestedScrollView nestedScrollView = C5581b.m21415e(this.f14556a).f13193d;
            C5942k.m22324a((Object) nestedScrollView, "binding.layoutHomeContent");
            nestedScrollView.setVisibility(0);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.home.b$l */
    static final class C5593l<T> implements C0533u<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C5581b f14557a;

        C5593l(C5581b bVar) {
            this.f14557a = bVar;
        }

        /* renamed from: a */
        public final void mo3048a(Boolean bool) {
            SwipeRefreshLayout swipeRefreshLayout = C5581b.m21415e(this.f14557a).f13197h;
            C5942k.m22324a((Object) swipeRefreshLayout, "binding.swipeRefresh");
            C5942k.m22324a((Object) bool, "loading");
            swipeRefreshLayout.setRefreshing(bool.booleanValue());
            if (bool.booleanValue() && this.f14557a.m21422x0().mo15231f().mo2974a() == null) {
                NestedScrollView nestedScrollView = C5581b.m21415e(this.f14557a).f13193d;
                C5942k.m22324a((Object) nestedScrollView, "binding.layoutHomeContent");
                nestedScrollView.setVisibility(8);
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.home.b$m */
    static final class C5594m extends C5943l implements C5918l<View, C5812t> {

        /* renamed from: g */
        final /* synthetic */ C5581b f14558g;

        C5594m(C5581b bVar) {
            this.f14558g = bVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo15230a(View view) {
            Intent intent;
            C5558c cVar;
            C5305k kVar;
            String str;
            String str2;
            Context context;
            C5942k.m22327b(view, "view");
            String str3 = "requireContext()";
            switch (view.getId()) {
                case R.id.list_view_anticipated /*2131231046*/:
                    cVar = GameListActivity.f14483J;
                    context = this.f14558g.mo2576p0();
                    C5942k.m22324a((Object) context, str3);
                    str2 = this.f14558g.mo2491a((int) R.string.home_most_anticipated);
                    str = null;
                    kVar = C5305k.ANTICIPATED;
                    break;
                case R.id.list_view_latest /*2131231047*/:
                    cVar = GameListActivity.f14483J;
                    context = this.f14558g.mo2576p0();
                    C5942k.m22324a((Object) context, str3);
                    str2 = this.f14558g.mo2491a((int) R.string.home_latest_releases);
                    str = null;
                    kVar = C5305k.LATEST_RELEASES;
                    break;
                case R.id.list_view_upcoming /*2131231048*/:
                    C5558c cVar2 = GameListActivity.f14483J;
                    Context p0 = this.f14558g.mo2576p0();
                    C5942k.m22324a((Object) p0, str3);
                    intent = C5558c.m21386a(cVar2, p0, this.f14558g.mo2491a((int) R.string.home_upcoming), null, C5305k.UPCOMING, null, null, null, 116, null);
                    break;
                default:
                    intent = null;
                    break;
            }
            intent = C5558c.m21386a(cVar, context, str2, str, kVar, null, null, null, 116, null);
            this.f14558g.mo2499a(intent);
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo15230a((View) obj);
            return C5812t.f14872a;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ C5006w m21415e(C5581b bVar) {
        return (C5006w) bVar.mo2653s0();
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public final C5329a m21418t0() {
        return (C5329a) this.f14540g0.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public final C5329a m21419u0() {
        return (C5329a) this.f14541h0.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public final C5329a m21420v0() {
        return (C5329a) this.f14542i0.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public final C4938c m21421w0() {
        return (C4938c) this.f14537d0.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public final C5595c m21422x0() {
        return (C5595c) this.f14536c0.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C5006w m21424a(ViewGroup viewGroup) {
        C5006w a = C5006w.m20039a(mo2585u(), viewGroup, false);
        C5942k.m22324a((Object) a, "FragmentHomeBinding.infl…flater, container, false)");
        return a;
    }

    /* renamed from: a */
    public void mo2511a(boolean z) {
        super.mo2511a(z);
        if (!z) {
            C4938c.m19734a(m21421w0(), "home__screen_view", null, 2, null);
        }
    }

    /* renamed from: b */
    public void mo2516b(Bundle bundle) {
        super.mo2516b(bundle);
        C5006w wVar = (C5006w) mo2653s0();
        wVar.f13194e.setAdapter(m21418t0());
        wVar.f13194e.setSeeAllListener(this.f14539f0);
        wVar.f13195f.setAdapter(m21419u0());
        wVar.f13195f.setSeeAllListener(this.f14539f0);
        wVar.f13196g.setAdapter(m21420v0());
        wVar.f13196g.setSeeAllListener(this.f14539f0);
        EmojiAppCompatTextView emojiAppCompatTextView = ((C5006w) mo2653s0()).f13198i;
        C5942k.m22324a((Object) emojiAppCompatTextView, "binding.textEmoji");
        emojiAppCompatTextView.setText("🏆");
        ((C5006w) mo2653s0()).f13192c.setOnClickListener(new C5589h(this));
        MaterialCardView materialCardView = ((C5006w) mo2653s0()).f13191b;
        C5942k.m22324a((Object) materialCardView, "binding.cardFeedback");
        materialCardView.setVisibility(m21422x0().mo15232g() ^ true ? 0 : 8);
        ((C5006w) mo2653s0()).f13191b.setOnClickListener(new C5590i(this));
        ((C5006w) mo2653s0()).f13197h.setColorSchemeResources(R.color.black);
        ((C5006w) mo2653s0()).f13197h.setOnRefreshListener(new C5591j(this));
        m21422x0().mo15231f().mo2976a(mo2470J(), new C5592k(this));
        m21422x0().mo15049d().mo2976a(mo2470J(), new C5593l(this));
        C0523n J = mo2470J();
        C5942k.m22324a((Object) J, "viewLifecycleOwner");
        Context p0 = mo2576p0();
        C5942k.m22324a((Object) p0, "requireContext()");
        C5710m.m21808a(J, p0, m21422x0().mo15048c(), 0, null, 12, null);
        C4938c.m19734a(m21421w0(), "home__screen_view", null, 2, null);
    }
}
