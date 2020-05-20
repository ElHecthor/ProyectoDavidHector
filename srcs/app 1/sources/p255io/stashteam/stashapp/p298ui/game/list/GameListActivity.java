package p255io.stashteam.stashapp.p298ui.game.list;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.C0445l;
import androidx.lifecycle.C0523n;
import androidx.lifecycle.C0533u;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C2585e;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import io.stashteam.games.tracker.stashapp.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p071f.p131r.C3503h;
import p255io.stashteam.stashapp.p256b.p257a.C4938c;
import p255io.stashteam.stashapp.p262c.C4971c;
import p255io.stashteam.stashapp.p269e.p280c.C5299h;
import p255io.stashteam.stashapp.p269e.p280c.C5303j;
import p255io.stashteam.stashapp.p269e.p280c.C5305k;
import p255io.stashteam.stashapp.p269e.p280c.C5309o;
import p255io.stashteam.stashapp.p269e.p280c.C5313r;
import p255io.stashteam.stashapp.p269e.p280c.C5315t;
import p255io.stashteam.stashapp.p269e.p280c.C5323z;
import p255io.stashteam.stashapp.p281f.p282a.C5324a;
import p255io.stashteam.stashapp.p281f.p282a.p283e.C5331b;
import p255io.stashteam.stashapp.p281f.p282a.p286h.C5340a;
import p255io.stashteam.stashapp.p281f.p282a.p286h.C5343d;
import p255io.stashteam.stashapp.p298ui.game.detail.GameDetailActivity;
import p255io.stashteam.stashapp.p298ui.widgets.empty_view.EmptyView;
import p255io.stashteam.stashapp.p298ui.widgets.filter.C5674a;
import p255io.stashteam.stashapp.p298ui.widgets.filter.C5675b;
import p255io.stashteam.stashapp.p298ui.widgets.filter.FilterView.C5672a;
import p255io.stashteam.stashapp.utils.C5688a;
import p255io.stashteam.stashapp.utils.p304f.C5693a;
import p255io.stashteam.stashapp.utils.p304f.C5697c;
import p255io.stashteam.stashapp.utils.p304f.C5710m;
import p255io.stashteam.stashapp.utils.p304f.C5713o;
import p308k.C5797g;
import p308k.C5808p;
import p308k.C5812t;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p352o.p353a.p364c.p371j.C6557a;
import p352o.p353a.p364c.p371j.C6559b;
import p352o.p353a.p364c.p372k.C6560a;

/* renamed from: io.stashteam.stashapp.ui.game.list.GameListActivity */
public final class GameListActivity extends C5324a<C4971c> {

    /* renamed from: J */
    public static final C5558c f14483J = new C5558c(null);

    /* renamed from: A */
    private final C5797g f14484A = C5693a.m21777a(this, "extra_key_id", null);

    /* renamed from: B */
    private final C5797g f14485B = C5693a.m21777a(this, "extra_original_id", null);

    /* renamed from: C */
    private final C5797g f14486C = C5693a.m21777a(this, "extra_filter_data", null);

    /* renamed from: D */
    private final C5797g f14487D = C5799i.m22044a(new C5557b(this, null, new C5573q(this)));

    /* renamed from: E */
    private final C5797g f14488E = C5799i.m22044a(new C5556a(this, null, null));

    /* renamed from: F */
    private final C5797g f14489F = C5799i.m22044a(new C5561e(this));

    /* renamed from: G */
    private final C5797g f14490G = C5799i.m22044a(new C5559d(this));

    /* renamed from: H */
    private final C5797g f14491H = C5799i.m22044a(new C5563g(this));

    /* renamed from: I */
    private final C5797g f14492I = C5799i.m22044a(new C5562f(this));

    /* renamed from: x */
    private final C5797g f14493x = C5693a.m21777a(this, "extra_title", null);

    /* renamed from: y */
    private final C5797g f14494y = C5693a.m21777a(this, "extra_subtitle", null);

    /* renamed from: z */
    private final C5797g f14495z = C5693a.m21776a((Activity) this, "extra_list_type");

    /* renamed from: io.stashteam.stashapp.ui.game.list.GameListActivity$a */
    public static final class C5556a extends C5943l implements C5907a<C4938c> {

        /* renamed from: g */
        final /* synthetic */ ComponentCallbacks f14496g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14497h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14498i;

        public C5556a(ComponentCallbacks componentCallbacks, C6560a aVar, C5907a aVar2) {
            this.f14496g = componentCallbacks;
            this.f14497h = aVar;
            this.f14498i = aVar2;
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
                android.content.ComponentCallbacks r0 = r4.f14496g
                o.a.c.k.a r1 = r4.f14497h
                k.z.c.a r2 = r4.f14498i
                o.a.c.a r0 = p352o.p353a.p354a.p356b.p357a.C6511a.m24704a(r0)
                o.a.c.m.a r0 = r0.mo16935b()
                java.lang.Class<io.stashteam.stashapp.b.a.c> r3 = p255io.stashteam.stashapp.p256b.p257a.C4938c.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                java.lang.Object r0 = r0.mo17011a(r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.game.list.GameListActivity.C5556a.invoke():java.lang.Object");
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.list.GameListActivity$b */
    public static final class C5557b extends C5943l implements C5907a<C5576c> {

        /* renamed from: g */
        final /* synthetic */ C0523n f14499g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14500h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14501i;

        public C5557b(C0523n nVar, C6560a aVar, C5907a aVar2) {
            this.f14499g = nVar;
            this.f14500h = aVar;
            this.f14501i = aVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, io.stashteam.stashapp.ui.game.list.c] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1, types: [androidx.lifecycle.a0, io.stashteam.stashapp.ui.game.list.c]
          assigns: [androidx.lifecycle.a0]
          uses: [io.stashteam.stashapp.ui.game.list.c]
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
        public final p255io.stashteam.stashapp.p298ui.game.list.C5576c invoke() {
            /*
                r4 = this;
                androidx.lifecycle.n r0 = r4.f14499g
                o.a.c.k.a r1 = r4.f14500h
                k.z.c.a r2 = r4.f14501i
                java.lang.Class<io.stashteam.stashapp.ui.game.list.c> r3 = p255io.stashteam.stashapp.p298ui.game.list.C5576c.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                androidx.lifecycle.a0 r0 = p352o.p353a.p359b.p360a.p362d.p363a.C6521a.m24722a(r0, r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.game.list.GameListActivity.C5557b.invoke():androidx.lifecycle.a0");
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.list.GameListActivity$c */
    public static final class C5558c {
        private C5558c() {
        }

        public /* synthetic */ C5558c(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ Intent m21386a(C5558c cVar, Context context, String str, String str2, C5305k kVar, Long l, Long l2, C5299h hVar, int i, Object obj) {
            return cVar.mo15207a(context, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, kVar, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : hVar);
        }

        /* renamed from: a */
        public final Intent mo15207a(Context context, String str, String str2, C5305k kVar, Long l, Long l2, C5299h hVar) {
            C5942k.m22327b(context, "context");
            C5942k.m22327b(kVar, "listType");
            Intent putExtra = new Intent(context, GameListActivity.class).putExtra("extra_title", str).putExtra("extra_subtitle", str2).putExtra("extra_list_type", kVar).putExtra("extra_key_id", l).putExtra("extra_original_id", l2).putExtra("extra_filter_data", hVar);
            C5942k.m22324a((Object) putExtra, "Intent(context, GameList…_FILTER_DATA, filterData)");
            return putExtra;
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.list.GameListActivity$d */
    static final class C5559d extends C5943l implements C5907a<C5331b> {

        /* renamed from: g */
        final /* synthetic */ GameListActivity f14502g;

        /* renamed from: io.stashteam.stashapp.ui.game.list.GameListActivity$d$a */
        public static final class C5560a implements C5343d {

            /* renamed from: a */
            final /* synthetic */ C5559d f14503a;

            C5560a(C5559d dVar) {
                this.f14503a = dVar;
            }

            /* renamed from: a */
            public void mo15044a(MaterialCardView materialCardView, AppCompatImageView appCompatImageView, C5323z zVar) {
                C5942k.m22327b(materialCardView, "cardView");
                C5942k.m22327b(appCompatImageView, "imageView");
                C5942k.m22327b(zVar, "game");
                long c = zVar.mo15017c();
                Long g = this.f14503a.f14502g.m21360E();
                if (g != null && c == g.longValue()) {
                    this.f14503a.f14502g.finishAfterTransition();
                    return;
                }
                Bundle a = GameDetailActivity.f14345I.mo15150a(this.f14503a.f14502g, materialCardView, appCompatImageView);
                GameListActivity gameListActivity = this.f14503a.f14502g;
                gameListActivity.startActivity(GameDetailActivity.f14345I.mo15149a((Context) gameListActivity, zVar), a);
            }
        }

        C5559d(GameListActivity gameListActivity) {
            this.f14502g = gameListActivity;
            super(0);
        }

        public final C5331b invoke() {
            return new C5331b(true, new C5560a(this));
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.list.GameListActivity$e */
    static final class C5561e extends C5943l implements C5907a<BottomSheetBehavior<LinearLayout>> {

        /* renamed from: g */
        final /* synthetic */ GameListActivity f14504g;

        C5561e(GameListActivity gameListActivity) {
            this.f14504g = gameListActivity;
            super(0);
        }

        public final BottomSheetBehavior<LinearLayout> invoke() {
            return BottomSheetBehavior.m10458b(GameListActivity.m21372b(this.f14504g).f13010b);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.list.GameListActivity$f */
    static final class C5562f extends C5943l implements C5907a<C5674a> {

        /* renamed from: g */
        final /* synthetic */ GameListActivity f14505g;

        C5562f(GameListActivity gameListActivity) {
            this.f14505g = gameListActivity;
            super(0);
        }

        public final C5674a invoke() {
            return new C5674a(this.f14505g.m21357B());
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.list.GameListActivity$g */
    static final class C5563g extends C5943l implements C5907a<C5672a> {

        /* renamed from: g */
        final /* synthetic */ GameListActivity f14506g;

        C5563g(GameListActivity gameListActivity) {
            this.f14506g = gameListActivity;
            super(0);
        }

        public final C5672a invoke() {
            GameListActivity gameListActivity = this.f14506g;
            return gameListActivity.m21368a(gameListActivity.m21359D());
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.list.GameListActivity$h */
    public static final class C5564h<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ GameListActivity f14507a;

        public C5564h(GameListActivity gameListActivity) {
            this.f14507a = gameListActivity;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            this.f14507a.m21380w().mo11179b((C3503h) t);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.list.GameListActivity$i */
    public static final class C5565i<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ GameListActivity f14508a;

        public C5565i(GameListActivity gameListActivity) {
            this.f14508a = gameListActivity;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            C5313r rVar = (C5313r) t;
            ProgressBar progressBar = GameListActivity.m21372b(this.f14508a).f13014f;
            C5942k.m22324a((Object) progressBar, "binding.progressBar");
            boolean z = true;
            int i = 0;
            progressBar.setVisibility(rVar == C5313r.LOADING ? 0 : 8);
            EmptyView emptyView = GameListActivity.m21372b(this.f14508a).f13012d;
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

    /* renamed from: io.stashteam.stashapp.ui.game.list.GameListActivity$j */
    static final class C5566j extends C5943l implements C5907a<C5812t> {

        /* renamed from: g */
        final /* synthetic */ GameListActivity f14509g;

        C5566j(GameListActivity gameListActivity) {
            this.f14509g = gameListActivity;
            super(0);
        }

        public final void invoke() {
            this.f14509g.finishAfterTransition();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.list.GameListActivity$k */
    public static final class C5567k<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ GameListActivity f14510a;

        public C5567k(GameListActivity gameListActivity) {
            this.f14510a = gameListActivity;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            C5299h hVar = (C5299h) t;
            boolean j = hVar.mo14941j();
            Chip chip = GameListActivity.m21372b(this.f14510a).f13011c;
            String str = "binding.chipFilter";
            C5942k.m22324a((Object) chip, str);
            boolean z = true;
            int i = 0;
            chip.setVisibility(j && this.f14510a.m21359D().mo14957h() ? 0 : 8);
            FloatingActionButton floatingActionButton = GameListActivity.m21372b(this.f14510a).f13013e;
            C5942k.m22324a((Object) floatingActionButton, "binding.fabFilter");
            if (j || !this.f14510a.m21359D().mo14957h()) {
                z = false;
            }
            if (!z) {
                i = 8;
            }
            floatingActionButton.setVisibility(i);
            if (j) {
                Chip chip2 = GameListActivity.m21372b(this.f14510a).f13011c;
                C5942k.m22324a((Object) chip2, str);
                chip2.setText(C5688a.f14784a.mo15340a(this.f14510a, hVar));
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.list.GameListActivity$l */
    public static final class C5568l extends C5675b {

        /* renamed from: b */
        final /* synthetic */ GameListActivity f14511b;

        C5568l(GameListActivity gameListActivity, FloatingActionButton floatingActionButton) {
            this.f14511b = gameListActivity;
            super(floatingActionButton);
        }

        /* renamed from: c */
        public boolean mo15089c() {
            C5299h hVar = (C5299h) this.f14511b.m21362G().mo15212f().mo2974a();
            return hVar != null && hVar.mo14941j();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.list.GameListActivity$m */
    static final class C5569m implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ GameListActivity f14512f;

        C5569m(GameListActivity gameListActivity) {
            this.f14512f = gameListActivity;
        }

        public final void onClick(View view) {
            this.f14512f.m21364I();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.list.GameListActivity$n */
    static final class C5570n implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ GameListActivity f14513f;

        C5570n(GameListActivity gameListActivity) {
            this.f14513f = gameListActivity;
        }

        public final void onClick(View view) {
            this.f14513f.m21364I();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.list.GameListActivity$o */
    static final class C5571o implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ GameListActivity f14514f;

        C5571o(GameListActivity gameListActivity) {
            this.f14514f = gameListActivity;
        }

        public final void onClick(View view) {
            this.f14514f.m21362G().mo15083i();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.list.GameListActivity$p */
    static final class C5572p extends C5943l implements C5918l<C5299h, C5812t> {

        /* renamed from: g */
        final /* synthetic */ GameListActivity f14515g;

        C5572p(GameListActivity gameListActivity) {
            this.f14515g = gameListActivity;
            super(1);
        }

        /* renamed from: a */
        public final void mo15211a(C5299h hVar) {
            C5942k.m22327b(hVar, "filterData");
            this.f14515g.m21362G().mo15080a(hVar);
            this.f14515g.m21370a(hVar);
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo15211a((C5299h) obj);
            return C5812t.f14872a;
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.list.GameListActivity$q */
    static final class C5573q extends C5943l implements C5907a<C6557a> {

        /* renamed from: g */
        final /* synthetic */ GameListActivity f14516g;

        C5573q(GameListActivity gameListActivity) {
            this.f14516g = gameListActivity;
            super(0);
        }

        public final C6557a invoke() {
            Object[] objArr = new Object[3];
            objArr[0] = this.f14516g.m21359D();
            objArr[1] = this.f14516g.m21358C();
            C5299h c = this.f14516g.m21383z();
            if (c == null) {
                c = new C5299h(null, null, null, null, null, 31, null);
            }
            objArr[2] = c;
            return C6559b.m24801a(objArr);
        }
    }

    /* renamed from: A */
    private final C5674a m21356A() {
        return (C5674a) this.f14492I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final C5672a m21357B() {
        return (C5672a) this.f14491H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final Long m21358C() {
        return (Long) this.f14484A.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final C5305k m21359D() {
        return (C5305k) this.f14495z.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final Long m21360E() {
        return (Long) this.f14485B.getValue();
    }

    /* renamed from: F */
    private final String m21361F() {
        return (String) this.f14494y.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public final C5576c m21362G() {
        return (C5576c) this.f14487D.getValue();
    }

    /* renamed from: H */
    private final void m21363H() {
        String str = "binding.fabFilter";
        if (m21359D().mo14957h()) {
            RecyclerView recyclerView = ((C4971c) mo15023u()).f13015g;
            FloatingActionButton floatingActionButton = ((C4971c) mo15023u()).f13013e;
            C5942k.m22324a((Object) floatingActionButton, str);
            recyclerView.addOnScrollListener(new C5568l(this, floatingActionButton));
        }
        FloatingActionButton floatingActionButton2 = ((C4971c) mo15023u()).f13013e;
        C5942k.m22324a((Object) floatingActionButton2, str);
        floatingActionButton2.setVisibility(m21359D().mo14957h() ? 0 : 8);
        ((C4971c) mo15023u()).f13013e.setOnClickListener(new C5569m(this));
        ((C4971c) mo15023u()).f13011c.setOnClickListener(new C5570n(this));
        ((C4971c) mo15023u()).f13011c.setOnCloseIconClickListener(new C5571o(this));
        m21356A().mo15304a((C5918l<? super C5299h, C5812t>) new C5572p<Object,C5812t>(this));
        m21362G().mo15212f().mo2976a(this, new C5567k(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public final void m21364I() {
        if (!m21356A().mo2481U()) {
            C5299h hVar = (C5299h) m21362G().mo15212f().mo2974a();
            if (hVar == null) {
                hVar = new C5299h(null, null, null, null, null, 31, null);
            }
            C5942k.m22324a((Object) hVar, "viewModel.filterData.value ?: FilterData()");
            C5674a A = m21356A();
            C0445l l = mo2666l();
            C5942k.m22324a((Object) l, "supportFragmentManager");
            A.mo15303a(l, m21356A().mo2467G(), hVar);
            m21365J();
        }
    }

    /* renamed from: J */
    private final void m21365J() {
        String str = "game_list__filter_open";
        m21381x().mo14079a(str, C5821b0.m22070a(C5808p.m22056a("list_type", m21359D().mo14955f())));
    }

    /* renamed from: K */
    private final void m21366K() {
        String str = "game_list__screen_view";
        m21381x().mo14079a(str, C5821b0.m22070a(C5808p.m22056a("list_type", m21359D().mo14955f())));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C5672a m21368a(C5305k kVar) {
        C5672a aVar;
        int i = C5575b.f14519a[kVar.ordinal()];
        if (i == 1) {
            aVar = new C5672a(C5837l.m22162b((Object[]) new C5303j[]{C5303j.GENRE, C5303j.PLATFORM}), null, 2, null);
        } else if (i == 2) {
            aVar = new C5672a(C5837l.m22162b((Object[]) new C5303j[]{C5303j.GENRE, C5303j.PLATFORM}), null, 2, null);
        } else if (i == 3) {
            aVar = new C5672a(C5837l.m22162b((Object[]) new C5303j[]{C5303j.GENRE, C5303j.PLATFORM}), null, 2, null);
        } else if (i != 4) {
            return null;
        } else {
            aVar = new C5672a(C5837l.m22162b((Object[]) new C5303j[]{C5303j.GENRE, C5303j.PLATFORM, C5303j.RELEASE_YEAR}), null, 2, null);
        }
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m21370a(C5299h hVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("list_type", m21359D().mo14955f());
        List e = hVar.mo14934e();
        if (e != null && (!e.isEmpty())) {
            List<C5309o> e2 = hVar.mo14934e();
            ArrayList arrayList = new ArrayList(C5838m.m22166a(e2, 10));
            for (C5309o h : e2) {
                arrayList.add(h.mo14975h());
            }
            linkedHashMap.put(C5303j.GENRE.mo14950f(), arrayList);
        }
        List f = hVar.mo14936f();
        if (f != null && (!f.isEmpty())) {
            List<C5315t> f2 = hVar.mo14936f();
            ArrayList arrayList2 = new ArrayList(C5838m.m22166a(f2, 10));
            for (C5315t f3 : f2) {
                arrayList2.add(f3.mo14988f());
            }
            linkedHashMap.put(C5303j.PLATFORM.mo14950f(), arrayList2);
        }
        if (hVar.mo14937g() != null) {
            String f4 = C5303j.RELEASE_YEAR.mo14950f();
            StringBuilder sb = new StringBuilder();
            sb.append(hVar.mo14937g().mo14944b());
            sb.append('-');
            sb.append(hVar.mo14937g().mo14943a());
            linkedHashMap.put(f4, sb.toString());
        }
        m21381x().mo14079a("game_list__filter_apply", linkedHashMap);
    }

    /* renamed from: b */
    public static final /* synthetic */ C4971c m21372b(GameListActivity gameListActivity) {
        return (C4971c) gameListActivity.mo15023u();
    }

    private final String getTitle() {
        return (String) this.f14493x.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final C5331b m21380w() {
        return (C5331b) this.f14490G.getValue();
    }

    /* renamed from: x */
    private final C4938c m21381x() {
        return (C4938c) this.f14488E.getValue();
    }

    /* renamed from: y */
    private final BottomSheetBehavior<LinearLayout> m21382y() {
        return (BottomSheetBehavior) this.f14489F.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final C5299h m21383z() {
        return (C5299h) this.f14486C.getValue();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AppCompatTextView appCompatTextView = ((C4971c) mo15023u()).f13017i;
        String str = "binding.textTitle";
        C5942k.m22324a((Object) appCompatTextView, str);
        appCompatTextView.setText(getTitle());
        AppCompatTextView appCompatTextView2 = ((C4971c) mo15023u()).f13017i;
        C5942k.m22324a((Object) appCompatTextView2, str);
        int i = 8;
        appCompatTextView2.setVisibility(getTitle() != null ? 0 : 8);
        AppCompatTextView appCompatTextView3 = ((C4971c) mo15023u()).f13016h;
        String str2 = "binding.textSubtitle";
        C5942k.m22324a((Object) appCompatTextView3, str2);
        appCompatTextView3.setText(m21361F());
        AppCompatTextView appCompatTextView4 = ((C4971c) mo15023u()).f13016h;
        C5942k.m22324a((Object) appCompatTextView4, str2);
        if (m21361F() != null) {
            i = 0;
        }
        appCompatTextView4.setVisibility(i);
        ((C4971c) mo15023u()).f13010b.setOnClickListener(null);
        BottomSheetBehavior y = m21382y();
        C5942k.m22324a((Object) y, "bottomSheetBehavior");
        C5697c.m21781a(y, getResources().getDimensionPixelOffset(R.dimen.space_large));
        m21382y().mo8112a((C2585e) new C5340a(new C5566j(this)));
        RecyclerView recyclerView = ((C4971c) mo15023u()).f13015g;
        String str3 = "binding.recyclerView";
        C5942k.m22324a((Object) recyclerView, str3);
        C5713o.m21812a(recyclerView, 0, 1, null);
        RecyclerView recyclerView2 = ((C4971c) mo15023u()).f13015g;
        C5942k.m22324a((Object) recyclerView2, str3);
        recyclerView2.setAdapter(m21380w());
        m21363H();
        m21362G().mo15081g().mo2976a(this, new C5564h(this));
        m21362G().mo15082h().mo2976a(this, new C5565i(this));
        C5710m.m21808a(this, this, m21362G().mo15048c(), 0, null, 12, null);
        m21366K();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C4971c m21385v() {
        C4971c a = C4971c.m19902a(getLayoutInflater());
        C5942k.m22324a((Object) a, "ActivityGameListBinding.inflate(layoutInflater)");
        return a;
    }
}
