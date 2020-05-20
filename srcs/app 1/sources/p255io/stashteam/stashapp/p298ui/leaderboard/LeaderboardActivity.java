package p255io.stashteam.stashapp.p298ui.leaderboard;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.C0523n;
import androidx.lifecycle.C0533u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C2585e;
import com.google.android.material.textview.MaterialTextView;
import io.stashteam.games.tracker.stashapp.R;
import java.util.List;
import p071f.p131r.C3503h;
import p255io.stashteam.stashapp.p256b.p257a.C4938c;
import p255io.stashteam.stashapp.p262c.C4973d;
import p255io.stashteam.stashapp.p269e.p280c.C5292c0;
import p255io.stashteam.stashapp.p269e.p280c.C5294d0;
import p255io.stashteam.stashapp.p281f.p282a.C5324a;
import p255io.stashteam.stashapp.p281f.p282a.p286h.C5340a;
import p255io.stashteam.stashapp.p281f.p282a.p286h.C5344e;
import p255io.stashteam.stashapp.p298ui.leaderboard.views.TopUserView;
import p255io.stashteam.stashapp.p298ui.profile.user.UserProfileActivity;
import p255io.stashteam.stashapp.utils.C5688a;
import p255io.stashteam.stashapp.utils.p304f.C5708k;
import p255io.stashteam.stashapp.utils.p304f.C5710m;
import p308k.C5797g;
import p308k.C5808p;
import p308k.C5812t;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p352o.p353a.p364c.p372k.C6560a;

/* renamed from: io.stashteam.stashapp.ui.leaderboard.LeaderboardActivity */
public final class LeaderboardActivity extends C5324a<C4973d> implements C5344e {

    /* renamed from: B */
    public static final C5602c f14584B = new C5602c(null);

    /* renamed from: A */
    private final C5797g f14585A = C5799i.m22044a(new C5603d(this));

    /* renamed from: x */
    private final C5797g f14586x = C5799i.m22044a(new C5600a(this, null, null));

    /* renamed from: y */
    private final C5797g f14587y = C5799i.m22044a(new C5601b(this, null, null));

    /* renamed from: z */
    private final C5797g f14588z = C5799i.m22044a(new C5604e(this));

    /* renamed from: io.stashteam.stashapp.ui.leaderboard.LeaderboardActivity$a */
    public static final class C5600a extends C5943l implements C5907a<C4938c> {

        /* renamed from: g */
        final /* synthetic */ ComponentCallbacks f14589g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14590h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14591i;

        public C5600a(ComponentCallbacks componentCallbacks, C6560a aVar, C5907a aVar2) {
            this.f14589g = componentCallbacks;
            this.f14590h = aVar;
            this.f14591i = aVar2;
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
                android.content.ComponentCallbacks r0 = r4.f14589g
                o.a.c.k.a r1 = r4.f14590h
                k.z.c.a r2 = r4.f14591i
                o.a.c.a r0 = p352o.p353a.p354a.p356b.p357a.C6511a.m24704a(r0)
                o.a.c.m.a r0 = r0.mo16935b()
                java.lang.Class<io.stashteam.stashapp.b.a.c> r3 = p255io.stashteam.stashapp.p256b.p257a.C4938c.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                java.lang.Object r0 = r0.mo17011a(r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.leaderboard.LeaderboardActivity.C5600a.invoke():java.lang.Object");
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.leaderboard.LeaderboardActivity$b */
    public static final class C5601b extends C5943l implements C5907a<C5615b> {

        /* renamed from: g */
        final /* synthetic */ C0523n f14592g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14593h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14594i;

        public C5601b(C0523n nVar, C6560a aVar, C5907a aVar2) {
            this.f14592g = nVar;
            this.f14593h = aVar;
            this.f14594i = aVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, io.stashteam.stashapp.ui.leaderboard.b] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1, types: [androidx.lifecycle.a0, io.stashteam.stashapp.ui.leaderboard.b]
          assigns: [androidx.lifecycle.a0]
          uses: [io.stashteam.stashapp.ui.leaderboard.b]
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
        public final p255io.stashteam.stashapp.p298ui.leaderboard.C5615b invoke() {
            /*
                r4 = this;
                androidx.lifecycle.n r0 = r4.f14592g
                o.a.c.k.a r1 = r4.f14593h
                k.z.c.a r2 = r4.f14594i
                java.lang.Class<io.stashteam.stashapp.ui.leaderboard.b> r3 = p255io.stashteam.stashapp.p298ui.leaderboard.C5615b.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                androidx.lifecycle.a0 r0 = p352o.p353a.p359b.p360a.p362d.p363a.C6521a.m24722a(r0, r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.leaderboard.LeaderboardActivity.C5601b.invoke():androidx.lifecycle.a0");
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.leaderboard.LeaderboardActivity$c */
    public static final class C5602c {
        private C5602c() {
        }

        public /* synthetic */ C5602c(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final Intent mo15235a(Context context) {
            C5942k.m22327b(context, "context");
            return new Intent(context, LeaderboardActivity.class);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.leaderboard.LeaderboardActivity$d */
    static final class C5603d extends C5943l implements C5907a<C5610a> {

        /* renamed from: g */
        final /* synthetic */ LeaderboardActivity f14595g;

        C5603d(LeaderboardActivity leaderboardActivity) {
            this.f14595g = leaderboardActivity;
            super(0);
        }

        public final C5610a invoke() {
            return new C5610a(this.f14595g);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.leaderboard.LeaderboardActivity$e */
    static final class C5604e extends C5943l implements C5907a<BottomSheetBehavior<LinearLayout>> {

        /* renamed from: g */
        final /* synthetic */ LeaderboardActivity f14596g;

        C5604e(LeaderboardActivity leaderboardActivity) {
            this.f14596g = leaderboardActivity;
            super(0);
        }

        public final BottomSheetBehavior<LinearLayout> invoke() {
            return BottomSheetBehavior.m10458b(LeaderboardActivity.m21458b(this.f14596g).f13023b);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.leaderboard.LeaderboardActivity$f */
    public static final class C5605f<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ LeaderboardActivity f14597a;

        public C5605f(LeaderboardActivity leaderboardActivity) {
            this.f14597a = leaderboardActivity;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            C5294d0 d0Var = (C5294d0) t;
            if (d0Var != null) {
                this.f14597a.m21459b(d0Var);
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.leaderboard.LeaderboardActivity$g */
    public static final class C5606g<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ LeaderboardActivity f14598a;

        public C5606g(LeaderboardActivity leaderboardActivity) {
            this.f14598a = leaderboardActivity;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            List list = (List) t;
            if (list.size() == 3) {
                LeaderboardActivity.m21458b(this.f14598a).f13029h.mo15246a((C5294d0) C5845t.m22183d(list), this.f14598a);
                LeaderboardActivity.m21458b(this.f14598a).f13030i.mo15246a((C5294d0) list.get(1), this.f14598a);
                LeaderboardActivity.m21458b(this.f14598a).f13031j.mo15246a((C5294d0) C5845t.m22185e(list), this.f14598a);
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.leaderboard.LeaderboardActivity$h */
    public static final class C5607h<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ LeaderboardActivity f14599a;

        public C5607h(LeaderboardActivity leaderboardActivity) {
            this.f14599a = leaderboardActivity;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            boolean booleanValue = ((Boolean) t).booleanValue();
            TopUserView topUserView = LeaderboardActivity.m21458b(this.f14599a).f13029h;
            C5942k.m22324a((Object) topUserView, "binding.viewUserFirst");
            int i = 4;
            int i2 = 0;
            topUserView.setVisibility(booleanValue ? 4 : 0);
            TopUserView topUserView2 = LeaderboardActivity.m21458b(this.f14599a).f13030i;
            C5942k.m22324a((Object) topUserView2, "binding.viewUserSecond");
            topUserView2.setVisibility(booleanValue ? 4 : 0);
            TopUserView topUserView3 = LeaderboardActivity.m21458b(this.f14599a).f13031j;
            C5942k.m22324a((Object) topUserView3, "binding.viewUserThird");
            if (!booleanValue) {
                i = 0;
            }
            topUserView3.setVisibility(i);
            ProgressBar progressBar = LeaderboardActivity.m21458b(this.f14599a).f13025d;
            C5942k.m22324a((Object) progressBar, "binding.progressBarTop");
            if (!booleanValue) {
                i2 = 8;
            }
            progressBar.setVisibility(i2);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.leaderboard.LeaderboardActivity$i */
    public static final class C5608i<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ LeaderboardActivity f14600a;

        public C5608i(LeaderboardActivity leaderboardActivity) {
            this.f14600a = leaderboardActivity;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            this.f14600a.m21461w().mo11179b((C3503h) t);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.leaderboard.LeaderboardActivity$j */
    static final class C5609j extends C5943l implements C5907a<C5812t> {

        /* renamed from: g */
        final /* synthetic */ LeaderboardActivity f14601g;

        C5609j(LeaderboardActivity leaderboardActivity) {
            this.f14601g = leaderboardActivity;
            super(0);
        }

        public final void invoke() {
            this.f14601g.finishAfterTransition();
        }
    }

    /* renamed from: A */
    private final C5615b m21454A() {
        return (C5615b) this.f14587y.getValue();
    }

    /* renamed from: B */
    private final void m21455B() {
        C4938c.m19734a(m21462x(), "leaderboard__screen_view", null, 2, null);
    }

    /* renamed from: b */
    public static final /* synthetic */ C4973d m21458b(LeaderboardActivity leaderboardActivity) {
        return (C4973d) leaderboardActivity.mo15023u();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C5812t m21459b(C5294d0 d0Var) {
        C4973d dVar = (C4973d) mo15023u();
        AppCompatImageView appCompatImageView = dVar.f13024c;
        C5942k.m22324a((Object) appCompatImageView, "imageAvatar");
        C5708k.m21801a(appCompatImageView, d0Var.mo14886d());
        C5292c0 g = d0Var.mo14890g();
        if (g == null) {
            return null;
        }
        MaterialTextView materialTextView = dVar.f13027f;
        C5942k.m22324a((Object) materialTextView, "textYourPlace");
        materialTextView.setText(String.valueOf(g.mo14872d()));
        MaterialTextView materialTextView2 = dVar.f13028g;
        C5942k.m22324a((Object) materialTextView2, "textYourPoints");
        materialTextView2.setText(String.valueOf(g.mo14871c()));
        return C5812t.f14872a;
    }

    /* renamed from: c */
    private final void m21460c(long j) {
        String str = "leaderboard__user_click";
        m21462x().mo14079a(str, C5821b0.m22070a(C5808p.m22056a("user_id", Long.valueOf(j))));
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final C5610a m21461w() {
        return (C5610a) this.f14585A.getValue();
    }

    /* renamed from: x */
    private final C4938c m21462x() {
        return (C4938c) this.f14586x.getValue();
    }

    /* renamed from: y */
    private final int m21463y() {
        return C5688a.f14784a.mo15339a() - (getResources().getDimensionPixelOffset(R.dimen.leaders_block_height) + C5688a.f14784a.mo15343b());
    }

    /* renamed from: z */
    private final BottomSheetBehavior<LinearLayout> m21464z() {
        return (BottomSheetBehavior) this.f14588z.getValue();
    }

    /* renamed from: a */
    public void mo15045a(C5294d0 d0Var) {
        C5942k.m22327b(d0Var, "user");
        m21460c(d0Var.mo14885c());
        startActivity(UserProfileActivity.f14659z.mo15262a(this, d0Var.mo14885c(), d0Var.mo14891h()));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BottomSheetBehavior z = m21464z();
        C5942k.m22324a((Object) z, "bottomSheetBehavior");
        z.mo8119c(m21463y());
        m21464z().mo8112a((C2585e) new C5340a(new C5609j(this)));
        RecyclerView recyclerView = ((C4973d) mo15023u()).f13026e;
        String str = "binding.recyclerView";
        C5942k.m22324a((Object) recyclerView, str);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView2 = ((C4973d) mo15023u()).f13026e;
        C5942k.m22324a((Object) recyclerView2, str);
        recyclerView2.setAdapter(m21461w());
        m21454A().mo15244i().mo2976a(this, new C5605f(this));
        m21454A().mo15243h().mo2976a(this, new C5606g(this));
        m21454A().mo15242g().mo2976a(this, new C5607h(this));
        m21454A().mo15241f().mo2976a(this, new C5608i(this));
        C5710m.m21808a(this, this, m21454A().mo15048c(), 0, null, 12, null);
        m21455B();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C4973d m21467v() {
        C4973d a = C4973d.m19911a(getLayoutInflater());
        C5942k.m22324a((Object) a, "ActivityLeaderboardBinding.inflate(layoutInflater)");
        return a;
    }
}
