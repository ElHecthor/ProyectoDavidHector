package p255io.stashteam.stashapp.p298ui.reviews;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.C0523n;
import androidx.lifecycle.C0533u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C2585e;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p131r.C3503h;
import p255io.stashteam.stashapp.p256b.p257a.C4938c;
import p255io.stashteam.stashapp.p262c.C4983i;
import p255io.stashteam.stashapp.p269e.p280c.C5294d0;
import p255io.stashteam.stashapp.p269e.p280c.C5313r;
import p255io.stashteam.stashapp.p269e.p280c.C5321x;
import p255io.stashteam.stashapp.p281f.p282a.C5324a;
import p255io.stashteam.stashapp.p281f.p282a.p286h.C5340a;
import p255io.stashteam.stashapp.p281f.p282a.p286h.C5344e;
import p255io.stashteam.stashapp.p298ui.profile.user.UserProfileActivity;
import p255io.stashteam.stashapp.utils.p304f.C5693a;
import p255io.stashteam.stashapp.utils.p304f.C5697c;
import p255io.stashteam.stashapp.utils.p304f.C5710m;
import p255io.stashteam.stashapp.utils.p304f.C5713o;
import p308k.C5797g;
import p308k.C5802l;
import p308k.C5808p;
import p308k.C5812t;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p352o.p353a.p364c.p371j.C6557a;
import p352o.p353a.p364c.p371j.C6559b;
import p352o.p353a.p364c.p372k.C6560a;

/* renamed from: io.stashteam.stashapp.ui.reviews.ReviewsActivity */
public final class ReviewsActivity extends C5324a<C4983i> {

    /* renamed from: E */
    public static final C5644c f14671E = new C5644c(null);

    /* renamed from: A */
    private final C5797g f14672A = C5799i.m22044a(new C5643b(this, null, new C5651i(this)));

    /* renamed from: B */
    private final C5797g f14673B = C5799i.m22044a(new C5642a(this, null, null));

    /* renamed from: C */
    private final C5797g f14674C = C5799i.m22044a(new C5647e(this));

    /* renamed from: D */
    private final C5797g f14675D = C5799i.m22044a(new C5645d(this));

    /* renamed from: x */
    private final C5797g f14676x = C5693a.m21776a((Activity) this, "extra_list_type");

    /* renamed from: y */
    private final C5797g f14677y = C5693a.m21776a((Activity) this, "extra_game_id");

    /* renamed from: z */
    private final C5797g f14678z = C5693a.m21777a(this, "extra_game_name", null);

    /* renamed from: io.stashteam.stashapp.ui.reviews.ReviewsActivity$a */
    public static final class C5642a extends C5943l implements C5907a<C4938c> {

        /* renamed from: g */
        final /* synthetic */ ComponentCallbacks f14679g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14680h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14681i;

        public C5642a(ComponentCallbacks componentCallbacks, C6560a aVar, C5907a aVar2) {
            this.f14679g = componentCallbacks;
            this.f14680h = aVar;
            this.f14681i = aVar2;
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
                android.content.ComponentCallbacks r0 = r4.f14679g
                o.a.c.k.a r1 = r4.f14680h
                k.z.c.a r2 = r4.f14681i
                o.a.c.a r0 = p352o.p353a.p354a.p356b.p357a.C6511a.m24704a(r0)
                o.a.c.m.a r0 = r0.mo16935b()
                java.lang.Class<io.stashteam.stashapp.b.a.c> r3 = p255io.stashteam.stashapp.p256b.p257a.C4938c.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                java.lang.Object r0 = r0.mo17011a(r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.reviews.ReviewsActivity.C5642a.invoke():java.lang.Object");
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.reviews.ReviewsActivity$b */
    public static final class C5643b extends C5943l implements C5907a<C5657b> {

        /* renamed from: g */
        final /* synthetic */ C0523n f14682g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14683h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14684i;

        public C5643b(C0523n nVar, C6560a aVar, C5907a aVar2) {
            this.f14682g = nVar;
            this.f14683h = aVar;
            this.f14684i = aVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, io.stashteam.stashapp.ui.reviews.b] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1, types: [androidx.lifecycle.a0, io.stashteam.stashapp.ui.reviews.b]
          assigns: [androidx.lifecycle.a0]
          uses: [io.stashteam.stashapp.ui.reviews.b]
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
        public final p255io.stashteam.stashapp.p298ui.reviews.C5657b invoke() {
            /*
                r4 = this;
                androidx.lifecycle.n r0 = r4.f14682g
                o.a.c.k.a r1 = r4.f14683h
                k.z.c.a r2 = r4.f14684i
                java.lang.Class<io.stashteam.stashapp.ui.reviews.b> r3 = p255io.stashteam.stashapp.p298ui.reviews.C5657b.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                androidx.lifecycle.a0 r0 = p352o.p353a.p359b.p360a.p362d.p363a.C6521a.m24722a(r0, r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.reviews.ReviewsActivity.C5643b.invoke():androidx.lifecycle.a0");
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.reviews.ReviewsActivity$c */
    public static final class C5644c {
        private C5644c() {
        }

        public /* synthetic */ C5644c(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final Intent mo15264a(Context context, C5321x xVar, long j, String str) {
            C5942k.m22327b(context, "context");
            C5942k.m22327b(xVar, "listType");
            Intent putExtra = new Intent(context, ReviewsActivity.class).putExtra("extra_list_type", xVar).putExtra("extra_game_id", j).putExtra("extra_game_name", str);
            C5942k.m22324a((Object) putExtra, "Intent(context, ReviewsA…XTRA_GAME_NAME, gameName)");
            return putExtra;
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.reviews.ReviewsActivity$d */
    static final class C5645d extends C5943l implements C5907a<C5652a> {

        /* renamed from: g */
        final /* synthetic */ ReviewsActivity f14685g;

        /* renamed from: io.stashteam.stashapp.ui.reviews.ReviewsActivity$d$a */
        public static final class C5646a implements C5344e {

            /* renamed from: f */
            final /* synthetic */ C5645d f14686f;

            C5646a(C5645d dVar) {
                this.f14686f = dVar;
            }

            /* renamed from: a */
            public void mo15045a(C5294d0 d0Var) {
                C5942k.m22327b(d0Var, "user");
                this.f14686f.f14685g.m21563c(d0Var.mo14885c());
                ReviewsActivity reviewsActivity = this.f14686f.f14685g;
                reviewsActivity.startActivity(UserProfileActivity.f14659z.mo15262a(reviewsActivity, d0Var.mo14885c(), d0Var.mo14891h()));
            }
        }

        C5645d(ReviewsActivity reviewsActivity) {
            this.f14685g = reviewsActivity;
            super(0);
        }

        public final C5652a invoke() {
            return new C5652a(new C5646a(this));
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.reviews.ReviewsActivity$e */
    static final class C5647e extends C5943l implements C5907a<BottomSheetBehavior<LinearLayout>> {

        /* renamed from: g */
        final /* synthetic */ ReviewsActivity f14687g;

        C5647e(ReviewsActivity reviewsActivity) {
            this.f14687g = reviewsActivity;
            super(0);
        }

        public final BottomSheetBehavior<LinearLayout> invoke() {
            return BottomSheetBehavior.m10458b(ReviewsActivity.m21561b(this.f14687g).f13066b);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.reviews.ReviewsActivity$f */
    public static final class C5648f<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ ReviewsActivity f14688a;

        public C5648f(ReviewsActivity reviewsActivity) {
            this.f14688a = reviewsActivity;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            this.f14688a.m21565w().mo11179b((C3503h) t);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.reviews.ReviewsActivity$g */
    public static final class C5649g<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ ReviewsActivity f14689a;

        public C5649g(ReviewsActivity reviewsActivity) {
            this.f14689a = reviewsActivity;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            C5313r rVar = (C5313r) t;
            ProgressBar progressBar = ReviewsActivity.m21561b(this.f14689a).f13067c;
            C5942k.m22324a((Object) progressBar, "binding.progressBar");
            int i = 0;
            if (!(rVar == C5313r.LOADING)) {
                i = 8;
            }
            progressBar.setVisibility(i);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.reviews.ReviewsActivity$h */
    static final class C5650h extends C5943l implements C5907a<C5812t> {

        /* renamed from: g */
        final /* synthetic */ ReviewsActivity f14690g;

        C5650h(ReviewsActivity reviewsActivity) {
            this.f14690g = reviewsActivity;
            super(0);
        }

        public final void invoke() {
            this.f14690g.finishAfterTransition();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.reviews.ReviewsActivity$i */
    static final class C5651i extends C5943l implements C5907a<C6557a> {

        /* renamed from: g */
        final /* synthetic */ ReviewsActivity f14691g;

        C5651i(ReviewsActivity reviewsActivity) {
            this.f14691g = reviewsActivity;
            super(0);
        }

        public final C6557a invoke() {
            return C6559b.m24801a(this.f14691g.m21556B(), Long.valueOf(this.f14691g.m21568z()));
        }
    }

    /* renamed from: A */
    private final String m21555A() {
        return (String) this.f14678z.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final C5321x m21556B() {
        return (C5321x) this.f14676x.getValue();
    }

    /* renamed from: C */
    private final C5657b m21557C() {
        return (C5657b) this.f14672A.getValue();
    }

    /* renamed from: D */
    private final void m21558D() {
        C4938c x = m21566x();
        C5802l[] lVarArr = new C5802l[3];
        lVarArr[0] = C5808p.m22056a("game_id", Long.valueOf(m21568z()));
        String A = m21555A();
        if (A == null) {
            A = "";
        }
        lVarArr[1] = C5808p.m22056a("game_name", A);
        lVarArr[2] = C5808p.m22056a("list_type", m21556B().mo15007f());
        x.mo14079a("reviews__screen_view", C5823c0.m22080b(lVarArr));
    }

    /* renamed from: b */
    public static final /* synthetic */ C4983i m21561b(ReviewsActivity reviewsActivity) {
        return (C4983i) reviewsActivity.mo15023u();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m21563c(long j) {
        C5802l[] lVarArr = {C5808p.m22056a("user_id", Long.valueOf(j)), C5808p.m22056a("list_type", m21556B().mo15007f())};
        m21566x().mo14079a("reviews__user_click", C5823c0.m22080b(lVarArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final C5652a m21565w() {
        return (C5652a) this.f14675D.getValue();
    }

    /* renamed from: x */
    private final C4938c m21566x() {
        return (C4938c) this.f14673B.getValue();
    }

    /* renamed from: y */
    private final BottomSheetBehavior<LinearLayout> m21567y() {
        return (BottomSheetBehavior) this.f14674C.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final long m21568z() {
        return ((Number) this.f14677y.getValue()).longValue();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C4983i) mo15023u()).f13070f.setText(m21556B().mo15008g());
        AppCompatTextView appCompatTextView = ((C4983i) mo15023u()).f13069e;
        String str = "binding.textSubtitle";
        C5942k.m22324a((Object) appCompatTextView, str);
        appCompatTextView.setText(m21555A());
        AppCompatTextView appCompatTextView2 = ((C4983i) mo15023u()).f13069e;
        C5942k.m22324a((Object) appCompatTextView2, str);
        int i = 0;
        if (!(m21555A() != null)) {
            i = 8;
        }
        appCompatTextView2.setVisibility(i);
        ((C4983i) mo15023u()).f13066b.setOnClickListener(null);
        BottomSheetBehavior y = m21567y();
        C5942k.m22324a((Object) y, "bottomSheetBehavior");
        C5697c.m21781a(y, getResources().getDimensionPixelOffset(R.dimen.space_large));
        m21567y().mo8112a((C2585e) new C5340a(new C5650h(this)));
        RecyclerView recyclerView = ((C4983i) mo15023u()).f13068d;
        String str2 = "binding.recyclerView";
        C5942k.m22324a((Object) recyclerView, str2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        if (m21556B() != C5321x.WANT) {
            RecyclerView recyclerView2 = ((C4983i) mo15023u()).f13068d;
            C5942k.m22324a((Object) recyclerView2, str2);
            C5713o.m21811a(recyclerView2, R.drawable.divider_recycler_view);
        }
        RecyclerView recyclerView3 = ((C4983i) mo15023u()).f13068d;
        C5942k.m22324a((Object) recyclerView3, str2);
        recyclerView3.setAdapter(m21565w());
        m21557C().mo15271g().mo2976a(this, new C5648f(this));
        m21557C().mo15270f().mo2976a(this, new C5649g(this));
        C5710m.m21808a(this, this, m21557C().mo15048c(), 0, null, 12, null);
        m21558D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C4983i m21570v() {
        C4983i a = C4983i.m19955a(getLayoutInflater());
        C5942k.m22324a((Object) a, "ActivityReviewsBinding.inflate(layoutInflater)");
        return a;
    }
}
