package p255io.stashteam.stashapp.p298ui.game.detail;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.C0345b;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.C0523n;
import androidx.lifecycle.C0533u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import io.stashteam.games.tracker.stashapp.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p071f.p072a.p079o.C3127d;
import p071f.p097h.p107l.C3317d;
import p255io.stashteam.stashapp.p256b.p257a.C4938c;
import p255io.stashteam.stashapp.p262c.C4969b;
import p255io.stashteam.stashapp.p269e.p280c.C5294d0;
import p255io.stashteam.stashapp.p269e.p280c.C5296e0;
import p255io.stashteam.stashapp.p269e.p280c.C5297f;
import p255io.stashteam.stashapp.p269e.p280c.C5298g;
import p255io.stashteam.stashapp.p269e.p280c.C5299h;
import p255io.stashteam.stashapp.p269e.p280c.C5305k;
import p255io.stashteam.stashapp.p269e.p280c.C5306l;
import p255io.stashteam.stashapp.p269e.p280c.C5307m;
import p255io.stashteam.stashapp.p269e.p280c.C5308n;
import p255io.stashteam.stashapp.p269e.p280c.C5309o;
import p255io.stashteam.stashapp.p269e.p280c.C5311p;
import p255io.stashteam.stashapp.p269e.p280c.C5312q;
import p255io.stashteam.stashapp.p269e.p280c.C5317u;
import p255io.stashteam.stashapp.p269e.p280c.C5321x;
import p255io.stashteam.stashapp.p269e.p280c.C5323z;
import p255io.stashteam.stashapp.p281f.p282a.C5327d;
import p255io.stashteam.stashapp.p281f.p282a.p286h.C5342c;
import p255io.stashteam.stashapp.p281f.p288b.C5350a;
import p255io.stashteam.stashapp.p281f.p295f.p296a.C5445a;
import p255io.stashteam.stashapp.p281f.p295f.p296a.C5447b;
import p255io.stashteam.stashapp.p281f.p295f.p297b.C5449b;
import p255io.stashteam.stashapp.p298ui.auth.signin.SignInActivity;
import p255io.stashteam.stashapp.p298ui.game.detail.blocks.custom_lists.CustomListsBlock.C5530a;
import p255io.stashteam.stashapp.p298ui.game.detail.blocks.genres.GenresBlock.C5534a;
import p255io.stashteam.stashapp.p298ui.game.detail.blocks.info_items.InfoItemsBlock.C5536a;
import p255io.stashteam.stashapp.p298ui.game.detail.blocks.own_review.OwnReviewBlock.C5541a;
import p255io.stashteam.stashapp.p298ui.game.detail.blocks.status_buttons.StatusButtonsBlock.C5543a;
import p255io.stashteam.stashapp.p298ui.game.detail.p299c.p300a.C5547a;
import p255io.stashteam.stashapp.p298ui.game.detail.p301d.C5553a;
import p255io.stashteam.stashapp.p298ui.game.detail.p301d.C5553a.C5554a;
import p255io.stashteam.stashapp.p298ui.game.detail.p301d.C5553a.C5555b;
import p255io.stashteam.stashapp.p298ui.game.list.GameListActivity;
import p255io.stashteam.stashapp.p298ui.game.list.GameListActivity.C5558c;
import p255io.stashteam.stashapp.p298ui.reviews.ReviewsActivity;
import p255io.stashteam.stashapp.p298ui.widgets.player.PlayerActivity;
import p255io.stashteam.stashapp.utils.C5688a;
import p255io.stashteam.stashapp.utils.p304f.C5693a;
import p255io.stashteam.stashapp.utils.p304f.C5708k;
import p255io.stashteam.stashapp.utils.p304f.C5710m;
import p308k.C5797g;
import p308k.C5808p;
import p308k.C5812t;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p352o.p353a.p364c.p371j.C6557a;
import p352o.p353a.p364c.p371j.C6559b;
import p352o.p353a.p364c.p372k.C6560a;

/* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity */
public final class GameDetailActivity extends C5327d<C4969b> implements C5543a, C5541a, C5536a, C5534a, C5530a {

    /* renamed from: I */
    public static final C5495c f14345I = new C5495c(null);

    /* renamed from: A */
    private final C5797g f14346A = C5693a.m21777a(this, "extra_cover_url", null);

    /* renamed from: B */
    private final C5797g f14347B = C5693a.m21777a(this, "extra_wait_for_load", Boolean.valueOf(false));

    /* renamed from: C */
    private final C5797g f14348C = C5799i.m22044a(new C5493b(this, null, new C5496c0(this)));

    /* renamed from: D */
    private final C5797g f14349D = C5799i.m22044a(new C5491a(this, null, null));

    /* renamed from: E */
    private final C5797g f14350E = C5799i.m22044a(C5500g.f14370g);

    /* renamed from: F */
    private final C5797g f14351F = C5799i.m22044a(C5497d.f14367g);

    /* renamed from: G */
    private final C5797g f14352G = C5799i.m22044a(C5498e.f14368g);

    /* renamed from: H */
    private final C5797g f14353H = C5799i.m22044a(C5513s.f14382g);

    /* renamed from: y */
    private final C5797g f14354y = C5799i.m22044a(new C5499f(this));

    /* renamed from: z */
    private final C5797g f14355z = C5693a.m21776a((Activity) this, "extra_game_id");

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$a */
    public static final class C5491a extends C5943l implements C5907a<C4938c> {

        /* renamed from: g */
        final /* synthetic */ ComponentCallbacks f14356g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14357h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14358i;

        public C5491a(ComponentCallbacks componentCallbacks, C6560a aVar, C5907a aVar2) {
            this.f14356g = componentCallbacks;
            this.f14357h = aVar;
            this.f14358i = aVar2;
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
                android.content.ComponentCallbacks r0 = r4.f14356g
                o.a.c.k.a r1 = r4.f14357h
                k.z.c.a r2 = r4.f14358i
                o.a.c.a r0 = p352o.p353a.p354a.p356b.p357a.C6511a.m24704a(r0)
                o.a.c.m.a r0 = r0.mo16935b()
                java.lang.Class<io.stashteam.stashapp.b.a.c> r3 = p255io.stashteam.stashapp.p256b.p257a.C4938c.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                java.lang.Object r0 = r0.mo17011a(r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.game.detail.GameDetailActivity.C5491a.invoke():java.lang.Object");
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$a0 */
    static final class C5492a0 implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ GameDetailActivity f14359f;

        /* renamed from: g */
        final /* synthetic */ C5307m f14360g;

        C5492a0(GameDetailActivity gameDetailActivity, C5307m mVar) {
            this.f14359f = gameDetailActivity;
            this.f14360g = mVar;
        }

        public final void onClick(View view) {
            this.f14359f.m21223a(C5321x.PLAYED, this.f14360g.mo14965a(), (C5298g) this.f14359f.m21212H().mo15165i().mo2974a());
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$b */
    public static final class C5493b extends C5943l implements C5907a<C5522b> {

        /* renamed from: g */
        final /* synthetic */ C0523n f14361g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14362h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14363i;

        public C5493b(C0523n nVar, C6560a aVar, C5907a aVar2) {
            this.f14361g = nVar;
            this.f14362h = aVar;
            this.f14363i = aVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, io.stashteam.stashapp.ui.game.detail.b] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1, types: [androidx.lifecycle.a0, io.stashteam.stashapp.ui.game.detail.b]
          assigns: [androidx.lifecycle.a0]
          uses: [io.stashteam.stashapp.ui.game.detail.b]
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
        public final p255io.stashteam.stashapp.p298ui.game.detail.C5522b invoke() {
            /*
                r4 = this;
                androidx.lifecycle.n r0 = r4.f14361g
                o.a.c.k.a r1 = r4.f14362h
                k.z.c.a r2 = r4.f14363i
                java.lang.Class<io.stashteam.stashapp.ui.game.detail.b> r3 = p255io.stashteam.stashapp.p298ui.game.detail.C5522b.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                androidx.lifecycle.a0 r0 = p352o.p353a.p359b.p360a.p362d.p363a.C6521a.m24722a(r0, r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.game.detail.GameDetailActivity.C5493b.invoke():androidx.lifecycle.a0");
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$b0 */
    static final class C5494b0 implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ GameDetailActivity f14364f;

        /* renamed from: g */
        final /* synthetic */ C5307m f14365g;

        C5494b0(GameDetailActivity gameDetailActivity, C5307m mVar) {
            this.f14364f = gameDetailActivity;
            this.f14365g = mVar;
        }

        public final void onClick(View view) {
            this.f14364f.m21223a(C5321x.REVIEWS, this.f14365g.mo14966b(), (C5298g) this.f14364f.m21212H().mo15165i().mo2974a());
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$c */
    public static final class C5495c {
        private C5495c() {
        }

        public /* synthetic */ C5495c(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final Intent mo15148a(Context context, long j) {
            C5942k.m22327b(context, "context");
            Intent putExtra = new Intent(context, GameDetailActivity.class).putExtra("extra_game_id", j).putExtra("extra_wait_for_load", true);
            C5942k.m22324a((Object) putExtra, "Intent(context, GameDeta…XTRA_WAIT_FOR_LOAD, true)");
            return putExtra;
        }

        /* renamed from: a */
        public final Intent mo15149a(Context context, C5323z zVar) {
            C5942k.m22327b(context, "context");
            C5942k.m22327b(zVar, "shortGame");
            Intent putExtra = new Intent(context, GameDetailActivity.class).putExtra("extra_game_id", zVar.mo15017c());
            C5311p a = zVar.mo15015a();
            Integer num = null;
            Intent putExtra2 = putExtra.putExtra("extra_cover_url", a != null ? a.mo14981b() : null);
            C5311p a2 = zVar.mo15015a();
            Intent putExtra3 = putExtra2.putExtra("extra_cover_height", a2 != null ? a2.mo14980a() : null);
            C5311p a3 = zVar.mo15015a();
            if (a3 != null) {
                num = a3.mo14982c();
            }
            Intent putExtra4 = putExtra3.putExtra("extra_cover_width", num).putExtra("extra_wait_for_load", false);
            C5942k.m22324a((Object) putExtra4, "Intent(context, GameDeta…TRA_WAIT_FOR_LOAD, false)");
            return putExtra4;
        }

        /* renamed from: a */
        public final Bundle mo15150a(Activity activity, MaterialCardView materialCardView, AppCompatImageView appCompatImageView) {
            C5942k.m22327b(activity, "activity");
            C5942k.m22327b(materialCardView, "cardView");
            C5942k.m22327b(appCompatImageView, "coverImageView");
            if (VERSION.SDK_INT <= 27) {
                return null;
            }
            C3317d a = C3317d.m13533a(materialCardView, "coverCard");
            C5942k.m22324a((Object) a, "Pair.create(cardView as View, \"coverCard\")");
            C3317d a2 = C3317d.m13533a(appCompatImageView, "cover");
            C5942k.m22324a((Object) a2, "Pair.create(coverImageView as View, \"cover\")");
            C0345b a3 = C0345b.m1782a(activity, a, a2);
            C5942k.m22324a((Object) a3, "ActivityOptionsCompat.ma…ity, cardPair, coverPair)");
            return a3.mo2164a();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$c0 */
    static final class C5496c0 extends C5943l implements C5907a<C6557a> {

        /* renamed from: g */
        final /* synthetic */ GameDetailActivity f14366g;

        C5496c0(GameDetailActivity gameDetailActivity) {
            this.f14366g = gameDetailActivity;
            super(0);
        }

        public final C6557a invoke() {
            return C6559b.m24801a(Long.valueOf(this.f14366g.m21209E()));
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$d */
    static final class C5497d extends C5943l implements C5907a<C5445a> {

        /* renamed from: g */
        public static final C5497d f14367g = new C5497d();

        C5497d() {
            super(0);
        }

        public final C5445a invoke() {
            return new C5445a();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$e */
    static final class C5498e extends C5943l implements C5907a<C5350a> {

        /* renamed from: g */
        public static final C5498e f14368g = new C5498e();

        C5498e() {
            super(0);
        }

        public final C5350a invoke() {
            return new C5350a();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$f */
    static final class C5499f extends C5943l implements C5907a<BottomSheetBehavior<NestedScrollView>> {

        /* renamed from: g */
        final /* synthetic */ GameDetailActivity f14369g;

        C5499f(GameDetailActivity gameDetailActivity) {
            this.f14369g = gameDetailActivity;
            super(0);
        }

        public final BottomSheetBehavior<NestedScrollView> invoke() {
            return BottomSheetBehavior.m10458b(GameDetailActivity.m21232c(this.f14369g).f12983g);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$g */
    static final class C5500g extends C5943l implements C5907a<C5553a> {

        /* renamed from: g */
        public static final C5500g f14370g = new C5500g();

        C5500g() {
            super(0);
        }

        public final C5553a invoke() {
            return new C5553a();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$h */
    static final class C5501h extends C5943l implements C5907a<C5812t> {

        /* renamed from: g */
        final /* synthetic */ GameDetailActivity f14371g;

        /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$h$a */
        public static final class C5502a implements C5342c {

            /* renamed from: a */
            final /* synthetic */ C5501h f14372a;

            C5502a(C5501h hVar) {
                this.f14372a = hVar;
            }

            /* renamed from: a */
            public void mo15043a(C5297f fVar) {
                C5942k.m22327b(fVar, "customList");
                this.f14372a.f14371g.m21212H().mo15159a(fVar.mo14903d());
                this.f14372a.f14371g.m21215K();
            }
        }

        C5501h(GameDetailActivity gameDetailActivity) {
            this.f14371g = gameDetailActivity;
            super(0);
        }

        public final void invoke() {
            if (!this.f14371g.m21238z().mo2481U()) {
                this.f14371g.m21238z().mo15053a((C5342c) new C5502a(this));
                this.f14371g.m21238z().mo2649a(this.f14371g.mo2666l(), this.f14371g.m21238z().mo2467G());
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$i */
    static final class C5503i extends C5943l implements C5907a<C5812t> {

        /* renamed from: g */
        final /* synthetic */ GameDetailActivity f14373g;

        C5503i(GameDetailActivity gameDetailActivity) {
            this.f14373g = gameDetailActivity;
            super(0);
        }

        public final void invoke() {
            this.f14373g.m21214J();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$j */
    static final class C5504j extends C5943l implements C5907a<C5812t> {

        /* renamed from: g */
        final /* synthetic */ GameDetailActivity f14374g;

        C5504j(GameDetailActivity gameDetailActivity) {
            this.f14374g = gameDetailActivity;
            super(0);
        }

        public final void invoke() {
            C5522b e = this.f14374g.m21212H();
            C5306l lVar = new C5306l(null, null, C5308n.f13936h, false, null, 27, null);
            e.mo15160a(lVar);
            this.f14374g.m21222a(C5308n.f13936h);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$k */
    public static final class C5505k<T> implements C0533u<T> {
        /* renamed from: a */
        public final void mo3048a(T t) {
            C5294d0 d0Var = (C5294d0) t;
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$l */
    public static final class C5506l<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ GameDetailActivity f14375a;

        public C5506l(GameDetailActivity gameDetailActivity) {
            this.f14375a = gameDetailActivity;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            this.f14375a.m21219a((C5298g) t);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$m */
    public static final class C5507m<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ GameDetailActivity f14376a;

        public C5507m(GameDetailActivity gameDetailActivity) {
            this.f14376a = gameDetailActivity;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            this.f14376a.m21221a((C5307m) t);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$n */
    public static final class C5508n<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ GameDetailActivity f14377a;

        public C5508n(GameDetailActivity gameDetailActivity) {
            this.f14377a = gameDetailActivity;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            GameDetailActivity.m21232c(this.f14377a).f12978b.setUpCustomLists((List) t);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$o */
    public static final class C5509o<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ GameDetailActivity f14378a;

        public C5509o(GameDetailActivity gameDetailActivity) {
            this.f14378a = gameDetailActivity;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            boolean booleanValue = ((Boolean) t).booleanValue();
            ProgressBar progressBar = GameDetailActivity.m21232c(this.f14378a).f12991o;
            C5942k.m22324a((Object) progressBar, "binding.progressBar");
            progressBar.setVisibility(booleanValue ? 0 : 8);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$p */
    public static final class C5510p<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ GameDetailActivity f14379a;

        public C5510p(GameDetailActivity gameDetailActivity) {
            this.f14379a = gameDetailActivity;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            GameDetailActivity.m21232c(this.f14379a).f12982f.setLoading(((Boolean) t).booleanValue());
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$q */
    static final class C5511q implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ GameDetailActivity f14380f;

        C5511q(GameDetailActivity gameDetailActivity) {
            this.f14380f = gameDetailActivity;
        }

        public final void onClick(View view) {
            C4938c.m19734a(this.f14380f.m21205A(), "game_detail__close_click", null, 2, null);
            this.f14380f.onBackPressed();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$r */
    static final class C5512r implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ GameDetailActivity f14381f;

        C5512r(GameDetailActivity gameDetailActivity) {
            this.f14381f = gameDetailActivity;
        }

        public final void onClick(View view) {
            C5298g gVar = (C5298g) this.f14381f.m21212H().mo15165i().mo2974a();
            List o = gVar != null ? gVar.mo14925o() : null;
            if (!(o == null || o.isEmpty())) {
                C4938c.m19734a(this.f14381f.m21205A(), "game_detail__video_click", null, 2, null);
                GameDetailActivity gameDetailActivity = this.f14381f;
                gameDetailActivity.startActivity(PlayerActivity.f14759k.mo15316a(gameDetailActivity, ((C5296e0) C5845t.m22183d(o)).mo14894a()));
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$s */
    static final class C5513s extends C5943l implements C5907a<C5547a> {

        /* renamed from: g */
        public static final C5513s f14382g = new C5513s();

        C5513s() {
            super(0);
        }

        public final C5547a invoke() {
            return new C5547a();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$t */
    static final class C5514t implements Runnable {

        /* renamed from: f */
        final /* synthetic */ GameDetailActivity f14383f;

        C5514t(GameDetailActivity gameDetailActivity) {
            this.f14383f = gameDetailActivity;
        }

        public final void run() {
            this.f14383f.m21214J();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$u */
    static final class C5515u implements Runnable {

        /* renamed from: f */
        final /* synthetic */ GameDetailActivity f14384f;

        C5515u(GameDetailActivity gameDetailActivity) {
            this.f14384f = gameDetailActivity;
        }

        public final void run() {
            C5522b e = this.f14384f.m21212H();
            C5306l lVar = new C5306l(null, null, C5308n.f13936h, false, null, 27, null);
            e.mo15160a(lVar);
            this.f14384f.m21222a(C5308n.f13936h);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$v */
    static final class C5516v implements Runnable {

        /* renamed from: f */
        final /* synthetic */ GameDetailActivity f14385f;

        C5516v(GameDetailActivity gameDetailActivity) {
            this.f14385f = gameDetailActivity;
        }

        public final void run() {
            this.f14385f.m21212H().mo15162f();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$w */
    static final class C5517w implements Runnable {

        /* renamed from: f */
        final /* synthetic */ GameDetailActivity f14386f;

        C5517w(GameDetailActivity gameDetailActivity) {
            this.f14386f = gameDetailActivity;
        }

        public final void run() {
            this.f14386f.m21214J();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$x */
    static final class C5518x extends C5943l implements C5907a<C5812t> {

        /* renamed from: g */
        final /* synthetic */ GameDetailActivity f14387g;

        C5518x(GameDetailActivity gameDetailActivity) {
            this.f14387g = gameDetailActivity;
            super(0);
        }

        public final void invoke() {
            C4938c.m19734a(this.f14387g.m21205A(), "game_detail__close_swipe", null, 2, null);
            this.f14387g.finishAfterTransition();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$y */
    public static final class C5519y implements C5555b {

        /* renamed from: a */
        final /* synthetic */ GameDetailActivity f14388a;

        C5519y(GameDetailActivity gameDetailActivity) {
            this.f14388a = gameDetailActivity;
        }

        /* renamed from: a */
        public void mo15157a(C5306l lVar) {
            C5942k.m22327b(lVar, "gameReview");
            this.f14388a.m21212H().mo15160a(lVar);
            this.f14388a.m21222a(lVar.mo14963e());
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.GameDetailActivity$z */
    static final class C5520z implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ GameDetailActivity f14389f;

        /* renamed from: g */
        final /* synthetic */ C5307m f14390g;

        C5520z(GameDetailActivity gameDetailActivity, C5307m mVar) {
            this.f14389f = gameDetailActivity;
            this.f14390g = mVar;
        }

        public final void onClick(View view) {
            this.f14389f.m21223a(C5321x.WANT, this.f14390g.mo14967c(), (C5298g) this.f14389f.m21212H().mo15165i().mo2974a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final C4938c m21205A() {
        return (C4938c) this.f14349D.getValue();
    }

    /* renamed from: B */
    private final int m21206B() {
        return C5688a.f14784a.mo15339a() - (getResources().getDimensionPixelOffset(R.dimen.cover_block_height) + C5688a.f14784a.mo15343b());
    }

    /* renamed from: C */
    private final BottomSheetBehavior<NestedScrollView> m21207C() {
        return (BottomSheetBehavior) this.f14354y.getValue();
    }

    /* renamed from: D */
    private final String m21208D() {
        return (String) this.f14346A.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final long m21209E() {
        return ((Number) this.f14355z.getValue()).longValue();
    }

    /* renamed from: F */
    private final C5553a m21210F() {
        return (C5553a) this.f14350E.getValue();
    }

    /* renamed from: G */
    private final C5547a m21211G() {
        return (C5547a) this.f14353H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public final C5522b m21212H() {
        return (C5522b) this.f14348C.getValue();
    }

    /* renamed from: I */
    private final Boolean m21213I() {
        return (Boolean) this.f14347B.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public final void m21214J() {
        C5298g gVar = (C5298g) m21212H().mo15165i().mo2974a();
        if (!m21210F().mo2481U() && gVar != null) {
            m21210F().mo15198a(new C5554a(gVar.mo14917h(), gVar.mo14912d(), gVar.mo14913e()));
            m21210F().mo15199a((C5555b) new C5519y(this));
            m21210F().mo2649a(mo2666l(), m21210F().mo2467G());
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r0 != null) goto L_0x0019;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m21215K() {
        /*
            r6 = this;
            io.stashteam.stashapp.ui.game.detail.b r0 = r6.m21212H()
            androidx.lifecycle.LiveData r0 = r0.mo15165i()
            java.lang.Object r0 = r0.mo2974a()
            io.stashteam.stashapp.e.c.g r0 = (p255io.stashteam.stashapp.p269e.p280c.C5298g) r0
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = r0.mo14917h()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            java.lang.String r0 = ""
        L_0x0019:
            io.stashteam.stashapp.b.a.c r1 = r6.m21205A()
            r2 = 2
            k.l[] r2 = new p308k.C5802l[r2]
            r3 = 0
            long r4 = r6.m21209E()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "game_id"
            k.l r4 = p308k.C5808p.m22056a(r5, r4)
            r2[r3] = r4
            r3 = 1
            java.lang.String r4 = "game_name"
            k.l r0 = p308k.C5808p.m22056a(r4, r0)
            r2[r3] = r0
            java.util.Map r0 = p308k.p314u.C5823c0.m22080b(r2)
            java.lang.String r2 = "add_to_custom_list"
            r1.mo14079a(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.game.detail.GameDetailActivity.m21215K():void");
    }

    /* renamed from: L */
    private final void m21216L() {
        C4938c.m19734a(m21205A(), "delete_from_custom_list", null, 2, null);
    }

    /* renamed from: M */
    private final void m21217M() {
        String str = "game_detail__screen_view";
        m21205A().mo14079a(str, C5821b0.m22070a(C5808p.m22056a("game_id", Long.valueOf(m21209E()))));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        if (r3 != null) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01a4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m21219a(p255io.stashteam.stashapp.p269e.p280c.C5298g r10) {
        /*
            r9 = this;
            java.lang.Boolean r0 = r9.m21213I()
            r1 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r2)
            r2 = 0
            if (r0 == 0) goto L_0x0043
            io.stashteam.stashapp.e.c.p r0 = r10.mo14909a()
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = r0.mo14981b()
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            io.stashteam.stashapp.e.c.p r3 = r10.mo14909a()
            if (r3 == 0) goto L_0x002d
            java.lang.Integer r3 = r3.mo14980a()
            if (r3 == 0) goto L_0x002d
            int r3 = r3.intValue()
            goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            io.stashteam.stashapp.e.c.p r4 = r10.mo14909a()
            if (r4 == 0) goto L_0x003f
            java.lang.Integer r4 = r4.mo14982c()
            if (r4 == 0) goto L_0x003f
            int r4 = r4.intValue()
            goto L_0x0040
        L_0x003f:
            r4 = 0
        L_0x0040:
            r9.m21228a(r0, r3, r4)
        L_0x0043:
            f.x.a r0 = r9.mo15023u()
            io.stashteam.stashapp.c.b r0 = (p255io.stashteam.stashapp.p262c.C4969b) r0
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f12993q
            java.lang.String r3 = "binding.textName"
            p308k.p323z.p325d.C5942k.m22324a(r0, r3)
            java.lang.String r3 = r10.mo14917h()
            r0.setText(r3)
            f.x.a r0 = r9.mo15023u()
            io.stashteam.stashapp.c.b r0 = (p255io.stashteam.stashapp.p262c.C4969b) r0
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f12994r
            java.lang.String r3 = "binding.textReleaseDate"
            p308k.p323z.p325d.C5942k.m22324a(r0, r3)
            java.util.Date r3 = r10.mo14912d()
            if (r3 == 0) goto L_0x0071
            java.lang.String r3 = p255io.stashteam.stashapp.utils.p304f.C5700f.m21793a(r3)
            if (r3 == 0) goto L_0x0071
            goto L_0x0078
        L_0x0071:
            r3 = 2131755147(0x7f10008b, float:1.9141165E38)
            java.lang.String r3 = r9.getString(r3)
        L_0x0078:
            r0.setText(r3)
            f.x.a r0 = r9.mo15023u()
            io.stashteam.stashapp.c.b r0 = (p255io.stashteam.stashapp.p262c.C4969b) r0
            androidx.appcompat.widget.AppCompatImageButton r0 = r0.f12985i
            java.lang.String r3 = "binding.btnVideo"
            p308k.p323z.p325d.C5942k.m22324a(r0, r3)
            java.util.List r3 = r10.mo14925o()
            if (r3 == 0) goto L_0x0097
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0095
            goto L_0x0097
        L_0x0095:
            r3 = 0
            goto L_0x0098
        L_0x0097:
            r3 = 1
        L_0x0098:
            r3 = r3 ^ r1
            r4 = 8
            if (r3 == 0) goto L_0x009f
            r3 = 0
            goto L_0x00a1
        L_0x009f:
            r3 = 8
        L_0x00a1:
            r0.setVisibility(r3)
            double r5 = r10.mo14910b()
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x00b6
            r0 = 2131755099(0x7f10005b, float:1.9141068E38)
            java.lang.String r0 = r9.getString(r0)
            goto L_0x00be
        L_0x00b6:
            double r5 = r10.mo14910b()
            java.lang.String r0 = java.lang.String.valueOf(r5)
        L_0x00be:
            java.lang.String r3 = "if (game.criticsRating =…criticsRating}\"\n        }"
            p308k.p323z.p325d.C5942k.m22324a(r0, r3)
            java.util.List r3 = r10.mo14920j()
            r9.m21229a(r3)
            f.x.a r3 = r9.mo15023u()
            io.stashteam.stashapp.c.b r3 = (p255io.stashteam.stashapp.p262c.C4969b) r3
            io.stashteam.stashapp.ui.widgets.stats.StatsView r3 = r3.f12997u
            r3.setValue(r0)
            f.x.a r0 = r9.mo15023u()
            io.stashteam.stashapp.c.b r0 = (p255io.stashteam.stashapp.p262c.C4969b) r0
            io.stashteam.stashapp.ui.game.detail.blocks.own_review.OwnReviewBlock r0 = r0.f12981e
            r0.setActionListener(r9)
            f.x.a r0 = r9.mo15023u()
            io.stashteam.stashapp.c.b r0 = (p255io.stashteam.stashapp.p262c.C4969b) r0
            io.stashteam.stashapp.ui.game.detail.blocks.own_review.OwnReviewBlock r0 = r0.f12981e
            io.stashteam.stashapp.e.c.l r3 = r10.mo14913e()
            io.stashteam.stashapp.ui.game.detail.b r5 = r9.m21212H()
            androidx.lifecycle.LiveData r5 = r5.mo15167k()
            java.lang.Object r5 = r5.mo2974a()
            io.stashteam.stashapp.e.c.d0 r5 = (p255io.stashteam.stashapp.p269e.p280c.C5294d0) r5
            r0.mo15183a(r3, r5)
            f.x.a r0 = r9.mo15023u()
            io.stashteam.stashapp.c.b r0 = (p255io.stashteam.stashapp.p262c.C4969b) r0
            io.stashteam.stashapp.ui.game.detail.blocks.info_items.InfoItemsBlock r0 = r0.f12980d
            r0.setActionListener(r9)
            f.x.a r0 = r9.mo15023u()
            io.stashteam.stashapp.c.b r0 = (p255io.stashteam.stashapp.p262c.C4969b) r0
            io.stashteam.stashapp.ui.game.detail.blocks.info_items.InfoItemsBlock r0 = r0.f12980d
            r0.setUpInfoItems(r10)
            f.x.a r0 = r9.mo15023u()
            io.stashteam.stashapp.c.b r0 = (p255io.stashteam.stashapp.p262c.C4969b) r0
            io.stashteam.stashapp.ui.game.detail.blocks.custom_lists.CustomListsBlock r0 = r0.f12978b
            r0.setActionListener(r9)
            f.x.a r0 = r9.mo15023u()
            io.stashteam.stashapp.c.b r0 = (p255io.stashteam.stashapp.p262c.C4969b) r0
            io.stashteam.stashapp.ui.game.detail.blocks.genres.GenresBlock r0 = r0.f12979c
            r0.setActionListener(r9)
            f.x.a r0 = r9.mo15023u()
            io.stashteam.stashapp.c.b r0 = (p255io.stashteam.stashapp.p262c.C4969b) r0
            io.stashteam.stashapp.ui.game.detail.blocks.genres.GenresBlock r0 = r0.f12979c
            java.util.List r3 = r10.mo14915f()
            r0.setUpGenres(r3)
            f.x.a r0 = r9.mo15023u()
            io.stashteam.stashapp.c.b r0 = (p255io.stashteam.stashapp.p262c.C4969b) r0
            io.stashteam.stashapp.ui.game.detail.blocks.status_buttons.StatusButtonsBlock r0 = r0.f12982f
            io.stashteam.stashapp.e.c.l r3 = r10.mo14913e()
            r0.mo15186a(r3)
            f.x.a r0 = r9.mo15023u()
            io.stashteam.stashapp.c.b r0 = (p255io.stashteam.stashapp.p262c.C4969b) r0
            android.widget.LinearLayout r0 = r0.f12990n
            java.lang.String r3 = "binding.layoutSummary"
            p308k.p323z.p325d.C5942k.m22324a(r0, r3)
            java.lang.String r3 = r10.mo14924n()
            if (r3 == 0) goto L_0x0167
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x0162
            r3 = 1
            goto L_0x0163
        L_0x0162:
            r3 = 0
        L_0x0163:
            if (r3 != r1) goto L_0x0167
            r3 = 1
            goto L_0x0168
        L_0x0167:
            r3 = 0
        L_0x0168:
            if (r3 == 0) goto L_0x016c
            r3 = 0
            goto L_0x016e
        L_0x016c:
            r3 = 8
        L_0x016e:
            r0.setVisibility(r3)
            f.x.a r0 = r9.mo15023u()
            io.stashteam.stashapp.c.b r0 = (p255io.stashteam.stashapp.p262c.C4969b) r0
            com.google.android.material.textview.MaterialTextView r0 = r0.f12995s
            java.lang.String r3 = "binding.textSummary"
            p308k.p323z.p325d.C5942k.m22324a(r0, r3)
            java.lang.String r3 = r10.mo14924n()
            r0.setText(r3)
            f.x.a r0 = r9.mo15023u()
            io.stashteam.stashapp.c.b r0 = (p255io.stashteam.stashapp.p262c.C4969b) r0
            android.widget.LinearLayout r0 = r0.f12989m
            java.lang.String r3 = "binding.layoutScreenshots"
            p308k.p323z.p325d.C5942k.m22324a(r0, r3)
            java.util.List r3 = r10.mo14922l()
            if (r3 == 0) goto L_0x01a0
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r1
            if (r3 != r1) goto L_0x01a0
            goto L_0x01a1
        L_0x01a0:
            r1 = 0
        L_0x01a1:
            if (r1 == 0) goto L_0x01a4
            goto L_0x01a6
        L_0x01a4:
            r2 = 8
        L_0x01a6:
            r0.setVisibility(r2)
            io.stashteam.stashapp.ui.game.detail.c.a.a r0 = r9.m21211G()
            java.util.List r10 = r10.mo14922l()
            r0.mo3932a(r10)
            com.google.android.material.bottomsheet.BottomSheetBehavior r10 = r9.m21207C()
            java.lang.String r0 = "bottomSheetBehavior"
            p308k.p323z.p325d.C5942k.m22324a(r10, r0)
            int r0 = r9.m21206B()
            r10.mo8119c(r0)
            com.google.android.material.bottomsheet.BottomSheetBehavior r10 = r9.m21207C()
            io.stashteam.stashapp.f.a.h.a r0 = new io.stashteam.stashapp.f.a.h.a
            io.stashteam.stashapp.ui.game.detail.GameDetailActivity$x r1 = new io.stashteam.stashapp.ui.game.detail.GameDetailActivity$x
            r1.<init>(r9)
            r0.<init>(r1)
            r10.mo8112a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.game.detail.GameDetailActivity.m21219a(io.stashteam.stashapp.e.c.g):void");
    }

    /* renamed from: a */
    private final void m21220a(C5306l lVar) {
        if (!m21237y().mo2481U()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(lVar.mo14963e() == C5308n.f13936h ? new C5447b(Integer.valueOf(R.string.game_move_to_played), null, new C5514t(this), 2, null) : new C5447b(Integer.valueOf(R.string.game_move_to_want), null, new C5515u(this), 2, null));
            C5447b bVar = new C5447b(null, getString(R.string.game_remove_from, new Object[]{getString(lVar.mo14964f())}), new C5516v(this), 1, null);
            arrayList.add(bVar);
            if (lVar.mo14963e() == C5308n.f13937i || lVar.mo14963e() == C5308n.f13938j) {
                C5447b bVar2 = new C5447b(Integer.valueOf(R.string.game_edit_review), null, new C5517w(this), 2, null);
                arrayList.add(bVar2);
            }
            m21237y().mo15107a(arrayList);
            m21237y().mo2649a(mo2666l(), m21237y().mo2467G());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m21221a(C5307m mVar) {
        ((C4969b) mo15023u()).f12999w.setValue(String.valueOf(mVar.mo14967c()));
        ((C4969b) mo15023u()).f12999w.setOnClickListener(new C5520z(this, mVar));
        ((C4969b) mo15023u()).f12996t.setValue(String.valueOf(mVar.mo14965a()));
        ((C4969b) mo15023u()).f12996t.setOnClickListener(new C5492a0(this, mVar));
        ((C4969b) mo15023u()).f12998v.setValue(String.valueOf(mVar.mo14966b()));
        ((C4969b) mo15023u()).f12998v.setOnClickListener(new C5494b0(this, mVar));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r0 != null) goto L_0x0019;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m21222a(p255io.stashteam.stashapp.p269e.p280c.C5308n r8) {
        /*
            r7 = this;
            io.stashteam.stashapp.ui.game.detail.b r0 = r7.m21212H()
            androidx.lifecycle.LiveData r0 = r0.mo15165i()
            java.lang.Object r0 = r0.mo2974a()
            io.stashteam.stashapp.e.c.g r0 = (p255io.stashteam.stashapp.p269e.p280c.C5298g) r0
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = r0.mo14917h()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            java.lang.String r0 = ""
        L_0x0019:
            int[] r1 = p255io.stashteam.stashapp.p298ui.game.detail.C5521a.f14391a
            int r8 = r8.ordinal()
            r8 = r1[r8]
            r1 = 2
            r2 = 1
            if (r8 == r2) goto L_0x0036
            if (r8 == r1) goto L_0x0033
            r3 = 3
            if (r8 != r3) goto L_0x002d
            java.lang.String r8 = "add_to_played_list"
            goto L_0x0038
        L_0x002d:
            k.k r8 = new k.k
            r8.<init>()
            throw r8
        L_0x0033:
            java.lang.String r8 = "add_to_playing_list"
            goto L_0x0038
        L_0x0036:
            java.lang.String r8 = "add_to_want_list"
        L_0x0038:
            io.stashteam.stashapp.b.a.c r3 = r7.m21205A()
            k.l[] r1 = new p308k.C5802l[r1]
            r4 = 0
            long r5 = r7.m21209E()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "game_id"
            k.l r5 = p308k.C5808p.m22056a(r6, r5)
            r1[r4] = r5
            java.lang.String r4 = "game_name"
            k.l r0 = p308k.C5808p.m22056a(r4, r0)
            r1[r2] = r0
            java.util.Map r0 = p308k.p314u.C5823c0.m22080b(r1)
            r3.mo14079a(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.game.detail.GameDetailActivity.m21222a(io.stashteam.stashapp.e.c.n):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m21223a(C5321x xVar, int i, C5298g gVar) {
        if (i > 0 && gVar != null) {
            String str = "game_detail__reviews_click";
            m21205A().mo14079a(str, C5821b0.m22070a(C5808p.m22056a("list_type", xVar.mo15007f())));
            startActivity(ReviewsActivity.f14671E.mo15264a(this, xVar, gVar.mo14916g(), gVar.mo14917h()));
        }
    }

    /* renamed from: a */
    private final void m21228a(String str, int i, int i2) {
        String str2 = "binding.imageCover";
        if (!(i == 0 || i2 == 0)) {
            int dimensionPixelOffset = (getResources().getDimensionPixelOffset(R.dimen.cover_width) * i) / i2;
            AppCompatImageView appCompatImageView = ((C4969b) mo15023u()).f12986j;
            C5942k.m22324a((Object) appCompatImageView, str2);
            appCompatImageView.getLayoutParams().height = dimensionPixelOffset;
        }
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.card_corner_radius);
        AppCompatImageView appCompatImageView2 = ((C4969b) mo15023u()).f12986j;
        C5942k.m22324a((Object) appCompatImageView2, str2);
        C5708k.m21802a(appCompatImageView2, str, C5312q.ORIGINAL, dimensionPixelOffset2, R.drawable.img_empty_state);
    }

    /* renamed from: a */
    private final void m21229a(List<C5317u> list) {
        if (!(list == null || list.isEmpty())) {
            ConstraintLayout constraintLayout = ((C4969b) mo15023u()).f12987k;
            C5942k.m22324a((Object) constraintLayout, "binding.layoutPlatforms");
            if (constraintLayout.getChildCount() > 2) {
                ((C4969b) mo15023u()).f12987k.removeViews(2, list.size());
            }
            for (C5317u uVar : list) {
                MaterialTextView materialTextView = new MaterialTextView(new C3127d((Context) this, 2131821273));
                materialTextView.setText(uVar.mo14992a());
                materialTextView.setId((int) uVar.mo14993b());
                ((C4969b) mo15023u()).f12987k.addView(materialTextView);
            }
            ArrayList arrayList = new ArrayList(C5838m.m22166a(list, 10));
            for (C5317u b : list) {
                arrayList.add(Integer.valueOf((int) b.mo14993b()));
            }
            List b2 = C5845t.m22180b((Collection) arrayList);
            b2.add(0, Integer.valueOf(R.id.text_release_date));
            Flow flow = ((C4969b) mo15023u()).f12988l;
            C5942k.m22324a((Object) flow, "binding.layoutPlatformsFlow");
            flow.setReferencedIds(C5845t.m22178a((Collection) b2));
        }
    }

    /* renamed from: a */
    private final void m21230a(C5907a<C5812t> aVar) {
        if (!mo15028w()) {
            startActivity(SignInActivity.f14251G.mo15117a(this, true));
        } else {
            aVar.invoke();
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ C4969b m21232c(GameDetailActivity gameDetailActivity) {
        return (C4969b) gameDetailActivity.mo15023u();
    }

    /* renamed from: y */
    private final C5445a m21237y() {
        return (C5445a) this.f14351F.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final C5350a m21238z() {
        return (C5350a) this.f14352G.getValue();
    }

    /* renamed from: a */
    public void mo15137a(long j) {
    }

    /* renamed from: a */
    public void mo15138a(Intent intent, String str) {
        C5942k.m22327b(intent, "intent");
        C5942k.m22327b(str, "analyticsEvent");
        C4938c.m19734a(m21205A(), str, null, 2, null);
        startActivity(intent);
    }

    /* renamed from: a */
    public void mo15139a(C5309o oVar) {
        C5942k.m22327b(oVar, "genre");
        C5558c cVar = GameListActivity.f14483J;
        StringBuilder sb = new StringBuilder();
        sb.append(oVar.mo14973f());
        sb.append(' ');
        sb.append(getString(oVar.mo14976i()));
        String sb2 = sb.toString();
        C5305k kVar = C5305k.GAMES_BY_GENRE;
        C5299h hVar = new C5299h(null, C5836k.m22153a(oVar), null, null, null, 29, null);
        startActivity(C5558c.m21386a(cVar, this, sb2, null, kVar, null, null, hVar, 52, null));
    }

    /* renamed from: b */
    public void mo15140b(long j) {
        m21212H().mo15161b(j);
        m21216L();
    }

    /* renamed from: d */
    public void mo15141d() {
        m21230a((C5907a<C5812t>) new C5503i<C5812t>(this));
    }

    /* renamed from: e */
    public void mo15142e() {
        m21230a((C5907a<C5812t>) new C5504j<C5812t>(this));
    }

    /* renamed from: g */
    public void mo15143g() {
        m21230a((C5907a<C5812t>) new C5501h<C5812t>(this));
    }

    /* renamed from: i */
    public void mo15144i() {
        C5298g gVar = (C5298g) m21212H().mo15165i().mo2974a();
        if (gVar != null) {
            C5306l e = gVar.mo14913e();
            if (e != null) {
                m21220a(e);
            }
        }
    }

    /* renamed from: j */
    public void mo15145j() {
        m21214J();
    }

    public void onBackPressed() {
        mo2669o();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("extra_cover_height", 0);
        int intExtra2 = getIntent().getIntExtra("extra_cover_width", 0);
        if (C5942k.m22326a((Object) m21213I(), (Object) Boolean.valueOf(false))) {
            m21228a(m21208D(), intExtra, intExtra2);
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.space_small);
        RecyclerView recyclerView = ((C4969b) mo15023u()).f12992p;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addItemDecoration(new C5449b(dimensionPixelOffset));
        recyclerView.setAdapter(m21211G());
        ((C4969b) mo15023u()).f12982f.setActionListener(this);
        ((C4969b) mo15023u()).f12984h.setOnClickListener(new C5511q(this));
        ((C4969b) mo15023u()).f12985i.setOnClickListener(new C5512r(this));
        m21212H().mo15167k().mo2976a(this, new C5505k());
        m21212H().mo15165i().mo2976a(this, new C5506l(this));
        m21212H().mo15166j().mo2976a(this, new C5507m(this));
        m21212H().mo15164h().mo2976a(this, new C5508n(this));
        m21212H().mo15049d().mo2976a(this, new C5509o(this));
        m21212H().mo15163g().mo2976a(this, new C5510p(this));
        C5710m.m21808a(this, this, m21212H().mo15048c(), 0, null, 12, null);
        m21217M();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C4969b m21249v() {
        C4969b a = C4969b.m19893a(getLayoutInflater());
        C5942k.m22324a((Object) a, "ActivityGameDetailBinding.inflate(layoutInflater)");
        return a;
    }
}
