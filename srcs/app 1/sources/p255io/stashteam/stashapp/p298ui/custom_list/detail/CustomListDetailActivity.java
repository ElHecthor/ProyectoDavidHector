package p255io.stashteam.stashapp.p298ui.custom_list.detail;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.C0523n;
import androidx.lifecycle.C0533u;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C2585e;
import com.google.android.material.card.MaterialCardView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p131r.C3503h;
import p147g.p156d.p157a.p185c.p196s.C4447b;
import p255io.stashteam.stashapp.p256b.p257a.C4938c;
import p255io.stashteam.stashapp.p262c.C4967a;
import p255io.stashteam.stashapp.p269e.p280c.C5297f;
import p255io.stashteam.stashapp.p269e.p280c.C5313r;
import p255io.stashteam.stashapp.p269e.p280c.C5323z;
import p255io.stashteam.stashapp.p281f.p282a.C5324a;
import p255io.stashteam.stashapp.p281f.p282a.p283e.C5331b;
import p255io.stashteam.stashapp.p281f.p282a.p286h.C5340a;
import p255io.stashteam.stashapp.p281f.p282a.p286h.C5343d;
import p255io.stashteam.stashapp.p281f.p288b.C5361b;
import p255io.stashteam.stashapp.p281f.p288b.C5361b.C5365c;
import p255io.stashteam.stashapp.p298ui.game.detail.GameDetailActivity;
import p255io.stashteam.stashapp.p298ui.widgets.empty_view.EmptyView;
import p255io.stashteam.stashapp.utils.p304f.C5693a;
import p255io.stashteam.stashapp.utils.p304f.C5697c;
import p255io.stashteam.stashapp.utils.p304f.C5699e;
import p255io.stashteam.stashapp.utils.p304f.C5713o;
import p308k.C5797g;
import p308k.C5812t;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p352o.p353a.p364c.p371j.C6557a;
import p352o.p353a.p364c.p371j.C6559b;
import p352o.p353a.p364c.p372k.C6560a;

/* renamed from: io.stashteam.stashapp.ui.custom_list.detail.CustomListDetailActivity */
public final class CustomListDetailActivity extends C5324a<C4967a> {

    /* renamed from: D */
    public static final C5472c f14300D = new C5472c(null);

    /* renamed from: A */
    private final C5797g f14301A = C5799i.m22044a(new C5470a(this, null, null));

    /* renamed from: B */
    private final C5797g f14302B = C5799i.m22044a(C5476f.f14316g);

    /* renamed from: C */
    private final C5797g f14303C = C5799i.m22044a(new C5473d(this));

    /* renamed from: x */
    private final C5797g f14304x = C5693a.m21776a((Activity) this, "extra_custom_list_id");

    /* renamed from: y */
    private final C5797g f14305y = C5799i.m22044a(new C5475e(this));

    /* renamed from: z */
    private final C5797g f14306z = C5799i.m22044a(new C5471b(this, null, new C5485o(this)));

    /* renamed from: io.stashteam.stashapp.ui.custom_list.detail.CustomListDetailActivity$a */
    public static final class C5470a extends C5943l implements C5907a<C4938c> {

        /* renamed from: g */
        final /* synthetic */ ComponentCallbacks f14307g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14308h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14309i;

        public C5470a(ComponentCallbacks componentCallbacks, C6560a aVar, C5907a aVar2) {
            this.f14307g = componentCallbacks;
            this.f14308h = aVar;
            this.f14309i = aVar2;
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
                android.content.ComponentCallbacks r0 = r4.f14307g
                o.a.c.k.a r1 = r4.f14308h
                k.z.c.a r2 = r4.f14309i
                o.a.c.a r0 = p352o.p353a.p354a.p356b.p357a.C6511a.m24704a(r0)
                o.a.c.m.a r0 = r0.mo16935b()
                java.lang.Class<io.stashteam.stashapp.b.a.c> r3 = p255io.stashteam.stashapp.p256b.p257a.C4938c.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                java.lang.Object r0 = r0.mo17011a(r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.custom_list.detail.CustomListDetailActivity.C5470a.invoke():java.lang.Object");
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.custom_list.detail.CustomListDetailActivity$b */
    public static final class C5471b extends C5943l implements C5907a<C5486a> {

        /* renamed from: g */
        final /* synthetic */ C0523n f14310g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14311h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14312i;

        public C5471b(C0523n nVar, C6560a aVar, C5907a aVar2) {
            this.f14310g = nVar;
            this.f14311h = aVar;
            this.f14312i = aVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, io.stashteam.stashapp.ui.custom_list.detail.a] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1, types: [androidx.lifecycle.a0, io.stashteam.stashapp.ui.custom_list.detail.a]
          assigns: [androidx.lifecycle.a0]
          uses: [io.stashteam.stashapp.ui.custom_list.detail.a]
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
        public final p255io.stashteam.stashapp.p298ui.custom_list.detail.C5486a invoke() {
            /*
                r4 = this;
                androidx.lifecycle.n r0 = r4.f14310g
                o.a.c.k.a r1 = r4.f14311h
                k.z.c.a r2 = r4.f14312i
                java.lang.Class<io.stashteam.stashapp.ui.custom_list.detail.a> r3 = p255io.stashteam.stashapp.p298ui.custom_list.detail.C5486a.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                androidx.lifecycle.a0 r0 = p352o.p353a.p359b.p360a.p362d.p363a.C6521a.m24722a(r0, r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.custom_list.detail.CustomListDetailActivity.C5471b.invoke():androidx.lifecycle.a0");
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.custom_list.detail.CustomListDetailActivity$c */
    public static final class C5472c {
        private C5472c() {
        }

        public /* synthetic */ C5472c(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final Intent mo15127a(Context context, long j) {
            C5942k.m22327b(context, "context");
            Intent putExtra = new Intent(context, CustomListDetailActivity.class).putExtra("extra_custom_list_id", j);
            C5942k.m22324a((Object) putExtra, "Intent(context, CustomLi…OM_LIST_ID, customListId)");
            return putExtra;
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.custom_list.detail.CustomListDetailActivity$d */
    static final class C5473d extends C5943l implements C5907a<C5331b> {

        /* renamed from: g */
        final /* synthetic */ CustomListDetailActivity f14313g;

        /* renamed from: io.stashteam.stashapp.ui.custom_list.detail.CustomListDetailActivity$d$a */
        public static final class C5474a implements C5343d {

            /* renamed from: a */
            final /* synthetic */ C5473d f14314a;

            C5474a(C5473d dVar) {
                this.f14314a = dVar;
            }

            /* renamed from: a */
            public void mo15044a(MaterialCardView materialCardView, AppCompatImageView appCompatImageView, C5323z zVar) {
                C5942k.m22327b(materialCardView, "cardView");
                C5942k.m22327b(appCompatImageView, "imageView");
                C5942k.m22327b(zVar, "game");
                Bundle a = GameDetailActivity.f14345I.mo15150a(this.f14314a.f14313g, materialCardView, appCompatImageView);
                CustomListDetailActivity customListDetailActivity = this.f14314a.f14313g;
                customListDetailActivity.startActivity(GameDetailActivity.f14345I.mo15149a((Context) customListDetailActivity, zVar), a);
            }
        }

        C5473d(CustomListDetailActivity customListDetailActivity) {
            this.f14313g = customListDetailActivity;
            super(0);
        }

        public final C5331b invoke() {
            return new C5331b(true, new C5474a(this));
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.custom_list.detail.CustomListDetailActivity$e */
    static final class C5475e extends C5943l implements C5907a<BottomSheetBehavior<LinearLayout>> {

        /* renamed from: g */
        final /* synthetic */ CustomListDetailActivity f14315g;

        C5475e(CustomListDetailActivity customListDetailActivity) {
            this.f14315g = customListDetailActivity;
            super(0);
        }

        public final BottomSheetBehavior<LinearLayout> invoke() {
            return BottomSheetBehavior.m10458b(CustomListDetailActivity.m21165b(this.f14315g).f12962b);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.custom_list.detail.CustomListDetailActivity$f */
    static final class C5476f extends C5943l implements C5907a<C5361b> {

        /* renamed from: g */
        public static final C5476f f14316g = new C5476f();

        C5476f() {
            super(0);
        }

        public final C5361b invoke() {
            return new C5361b();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.custom_list.detail.CustomListDetailActivity$g */
    public static final class C5477g<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ CustomListDetailActivity f14317a;

        public C5477g(CustomListDetailActivity customListDetailActivity) {
            this.f14317a = customListDetailActivity;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            C5297f fVar = (C5297f) t;
            if (fVar == null) {
                this.f14317a.finishAfterTransition();
                return;
            }
            AppCompatTextView appCompatTextView = CustomListDetailActivity.m21165b(this.f14317a).f12970j;
            C5942k.m22324a((Object) appCompatTextView, "binding.textTitle");
            appCompatTextView.setText(fVar.mo14904e());
            CustomListDetailActivity.m21165b(this.f14317a).f12970j.setTextColor(fVar.mo14898a(C5699e.m21783a((Context) this.f14317a, (int) R.color.color_primary_text)));
            AppCompatTextView appCompatTextView2 = CustomListDetailActivity.m21165b(this.f14317a).f12969i;
            String str = "binding.textDescription";
            C5942k.m22324a((Object) appCompatTextView2, str);
            String b = fVar.mo14901b();
            int i = 0;
            if (!(!(b == null || b.length() == 0))) {
                i = 8;
            }
            appCompatTextView2.setVisibility(i);
            AppCompatTextView appCompatTextView3 = CustomListDetailActivity.m21165b(this.f14317a).f12969i;
            C5942k.m22324a((Object) appCompatTextView3, str);
            appCompatTextView3.setText(fVar.mo14901b());
            AppCompatTextView appCompatTextView4 = CustomListDetailActivity.m21165b(this.f14317a).f12968h;
            C5942k.m22324a((Object) appCompatTextView4, "binding.textCount");
            appCompatTextView4.setText(fVar.mo14900a((Context) this.f14317a));
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.custom_list.detail.CustomListDetailActivity$h */
    public static final class C5478h<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ CustomListDetailActivity f14318a;

        public C5478h(CustomListDetailActivity customListDetailActivity) {
            this.f14318a = customListDetailActivity;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            C5313r rVar = (C5313r) t;
            ProgressBar progressBar = CustomListDetailActivity.m21165b(this.f14318a).f12966f;
            C5942k.m22324a((Object) progressBar, "binding.progressBar");
            boolean z = true;
            int i = 0;
            progressBar.setVisibility(rVar == C5313r.LOADING ? 0 : 8);
            EmptyView emptyView = CustomListDetailActivity.m21165b(this.f14318a).f12965e;
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

    /* renamed from: io.stashteam.stashapp.ui.custom_list.detail.CustomListDetailActivity$i */
    public static final class C5479i<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ CustomListDetailActivity f14319a;

        public C5479i(CustomListDetailActivity customListDetailActivity) {
            this.f14319a = customListDetailActivity;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            this.f14319a.m21172w().mo11179b((C3503h) t);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.custom_list.detail.CustomListDetailActivity$j */
    static final class C5480j extends C5943l implements C5907a<C5812t> {

        /* renamed from: g */
        final /* synthetic */ CustomListDetailActivity f14320g;

        C5480j(CustomListDetailActivity customListDetailActivity) {
            this.f14320g = customListDetailActivity;
            super(0);
        }

        public final void invoke() {
            this.f14320g.finishAfterTransition();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.custom_list.detail.CustomListDetailActivity$k */
    static final class C5481k implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ CustomListDetailActivity f14321f;

        C5481k(CustomListDetailActivity customListDetailActivity) {
            this.f14321f = customListDetailActivity;
        }

        public final void onClick(View view) {
            this.f14321f.m21159C();
            this.f14321f.m21161E();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.custom_list.detail.CustomListDetailActivity$l */
    static final class C5482l implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ CustomListDetailActivity f14322f;

        C5482l(CustomListDetailActivity customListDetailActivity) {
            this.f14322f = customListDetailActivity;
        }

        public final void onClick(View view) {
            this.f14322f.m21160D();
            this.f14322f.m21162F();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.custom_list.detail.CustomListDetailActivity$m */
    static final class C5483m implements DialogInterface.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ CustomListDetailActivity f14323f;

        C5483m(CustomListDetailActivity customListDetailActivity) {
            this.f14323f = customListDetailActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f14323f.m21158B().mo15132f();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.custom_list.detail.CustomListDetailActivity$n */
    public static final class C5484n implements C5365c {

        /* renamed from: f */
        final /* synthetic */ CustomListDetailActivity f14324f;

        C5484n(CustomListDetailActivity customListDetailActivity) {
            this.f14324f = customListDetailActivity;
        }

        /* renamed from: a */
        public void mo15052a(C5297f fVar) {
            C5942k.m22327b(fVar, "customList");
            this.f14324f.m21158B().mo15131a(fVar);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.custom_list.detail.CustomListDetailActivity$o */
    static final class C5485o extends C5943l implements C5907a<C6557a> {

        /* renamed from: g */
        final /* synthetic */ CustomListDetailActivity f14325g;

        C5485o(CustomListDetailActivity customListDetailActivity) {
            this.f14325g = customListDetailActivity;
            super(0);
        }

        public final C6557a invoke() {
            return C6559b.m24801a(Long.valueOf(this.f14325g.m21157A()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final long m21157A() {
        return ((Number) this.f14304x.getValue()).longValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final C5486a m21158B() {
        return (C5486a) this.f14306z.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final void m21159C() {
        new C4447b(this).mo222b((int) R.string.lists_delete_dlg_title).mo212a((int) R.string.lists_delete_dlg_message).mo213a((int) R.string.action_cancel, (DialogInterface.OnClickListener) null).mo223b(R.string.action_delete, new C5483m(this)).mo225c();
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m21160D() {
        if (!m21175z().mo2481U()) {
            m21175z().mo15056a((C5297f) m21158B().mo15133g().mo2974a(), (C5365c) new C5484n(this));
            m21175z().mo2649a(mo2666l(), m21175z().mo2467G());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m21161E() {
        C4938c.m19734a(m21173x(), "custom_list_detail__delete_click", null, 2, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final void m21162F() {
        C4938c.m19734a(m21173x(), "custom_list_detail__edit_click", null, 2, null);
    }

    /* renamed from: G */
    private final void m21163G() {
        C4938c.m19734a(m21173x(), "custom_list_detail__screen_view", null, 2, null);
    }

    /* renamed from: b */
    public static final /* synthetic */ C4967a m21165b(CustomListDetailActivity customListDetailActivity) {
        return (C4967a) customListDetailActivity.mo15023u();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final C5331b m21172w() {
        return (C5331b) this.f14303C.getValue();
    }

    /* renamed from: x */
    private final C4938c m21173x() {
        return (C4938c) this.f14301A.getValue();
    }

    /* renamed from: y */
    private final BottomSheetBehavior<LinearLayout> m21174y() {
        return (BottomSheetBehavior) this.f14305y.getValue();
    }

    /* renamed from: z */
    private final C5361b m21175z() {
        return (C5361b) this.f14302B.getValue();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C4967a) mo15023u()).f12962b.setOnClickListener(null);
        BottomSheetBehavior y = m21174y();
        C5942k.m22324a((Object) y, "bottomSheetBehavior");
        C5697c.m21781a(y, getResources().getDimensionPixelOffset(R.dimen.space_large));
        m21174y().mo8112a((C2585e) new C5340a(new C5480j(this)));
        ((C4967a) mo15023u()).f12963c.setOnClickListener(new C5481k(this));
        ((C4967a) mo15023u()).f12964d.setOnClickListener(new C5482l(this));
        RecyclerView recyclerView = ((C4967a) mo15023u()).f12967g;
        String str = "binding.recyclerView";
        C5942k.m22324a((Object) recyclerView, str);
        C5713o.m21812a(recyclerView, 0, 1, null);
        RecyclerView recyclerView2 = ((C4967a) mo15023u()).f12967g;
        C5942k.m22324a((Object) recyclerView2, str);
        recyclerView2.setAdapter(m21172w());
        m21158B().mo15133g().mo2976a(this, new C5477g(this));
        m21158B().mo15135i().mo2976a(this, new C5478h(this));
        m21158B().mo15134h().mo2976a(this, new C5479i(this));
        m21163G();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C4967a m21177v() {
        C4967a a = C4967a.m19884a(getLayoutInflater());
        C5942k.m22324a((Object) a, "ActivityCustomListDetail…g.inflate(layoutInflater)");
        return a;
    }
}
