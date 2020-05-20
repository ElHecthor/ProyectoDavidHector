package p255io.stashteam.stashapp.p281f.p288b;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.lifecycle.C0523n;
import androidx.lifecycle.C0533u;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0589t;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.bottomsheet.C2589a;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p131r.C3503h;
import p255io.stashteam.stashapp.p256b.p257a.C4938c;
import p255io.stashteam.stashapp.p262c.C5002s;
import p255io.stashteam.stashapp.p269e.p280c.C5297f;
import p255io.stashteam.stashapp.p269e.p280c.C5313r;
import p255io.stashteam.stashapp.p281f.p282a.C5325b;
import p255io.stashteam.stashapp.p281f.p282a.p286h.C5342c;
import p255io.stashteam.stashapp.p281f.p288b.C5361b.C5365c;
import p255io.stashteam.stashapp.p281f.p288b.p289c.C5381b;
import p255io.stashteam.stashapp.p281f.p288b.p289c.C5386c;
import p255io.stashteam.stashapp.p281f.p295f.p297b.C5450c;
import p255io.stashteam.stashapp.p298ui.widgets.empty_view.EmptyView;
import p255io.stashteam.stashapp.utils.p304f.C5698d;
import p308k.C5797g;
import p308k.C5802l;
import p308k.C5808p;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p352o.p353a.p364c.p372k.C6560a;

/* renamed from: io.stashteam.stashapp.f.b.a */
public final class C5350a extends C5325b<C5002s> implements C5365c {

    /* renamed from: r0 */
    private final C5797g f14047r0 = C5799i.m22044a(new C5352b(this, null, null));

    /* renamed from: s0 */
    private final C5797g f14048s0 = C5799i.m22044a(new C5351a(this, null, null));

    /* renamed from: t0 */
    private final C5797g f14049t0 = C5799i.m22044a(new C5354d(this));
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public C5342c f14050u0;

    /* renamed from: io.stashteam.stashapp.f.b.a$a */
    public static final class C5351a extends C5943l implements C5907a<C4938c> {

        /* renamed from: g */
        final /* synthetic */ ComponentCallbacks f14051g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14052h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14053i;

        public C5351a(ComponentCallbacks componentCallbacks, C6560a aVar, C5907a aVar2) {
            this.f14051g = componentCallbacks;
            this.f14052h = aVar;
            this.f14053i = aVar2;
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
                android.content.ComponentCallbacks r0 = r4.f14051g
                o.a.c.k.a r1 = r4.f14052h
                k.z.c.a r2 = r4.f14053i
                o.a.c.a r0 = p352o.p353a.p354a.p356b.p357a.C6511a.m24704a(r0)
                o.a.c.m.a r0 = r0.mo16935b()
                java.lang.Class<io.stashteam.stashapp.b.a.c> r3 = p255io.stashteam.stashapp.p256b.p257a.C4938c.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                java.lang.Object r0 = r0.mo17011a(r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p281f.p288b.C5350a.C5351a.invoke():java.lang.Object");
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.a$b */
    public static final class C5352b extends C5943l implements C5907a<C5386c> {

        /* renamed from: g */
        final /* synthetic */ C0523n f14054g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14055h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14056i;

        public C5352b(C0523n nVar, C6560a aVar, C5907a aVar2) {
            this.f14054g = nVar;
            this.f14055h = aVar;
            this.f14056i = aVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [io.stashteam.stashapp.f.b.c.c, androidx.lifecycle.a0] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1, types: [io.stashteam.stashapp.f.b.c.c, androidx.lifecycle.a0]
          assigns: [androidx.lifecycle.a0]
          uses: [io.stashteam.stashapp.f.b.c.c]
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
        public final p255io.stashteam.stashapp.p281f.p288b.p289c.C5386c invoke() {
            /*
                r4 = this;
                androidx.lifecycle.n r0 = r4.f14054g
                o.a.c.k.a r1 = r4.f14055h
                k.z.c.a r2 = r4.f14056i
                java.lang.Class<io.stashteam.stashapp.f.b.c.c> r3 = p255io.stashteam.stashapp.p281f.p288b.p289c.C5386c.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                androidx.lifecycle.a0 r0 = p352o.p353a.p359b.p360a.p362d.p363a.C6521a.m24722a(r0, r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p281f.p288b.C5350a.C5352b.invoke():androidx.lifecycle.a0");
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.a$c */
    public static final class C5353c {
        private C5353c() {
        }

        public /* synthetic */ C5353c(C5938g gVar) {
            this();
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.a$d */
    static final class C5354d extends C5943l implements C5907a<C5381b> {

        /* renamed from: g */
        final /* synthetic */ C5350a f14057g;

        /* renamed from: io.stashteam.stashapp.f.b.a$d$a */
        public static final class C5355a implements C5342c {

            /* renamed from: a */
            final /* synthetic */ C5354d f14058a;

            C5355a(C5354d dVar) {
                this.f14058a = dVar;
            }

            /* renamed from: a */
            public void mo15043a(C5297f fVar) {
                C5942k.m22327b(fVar, "customList");
                C5342c c = this.f14058a.f14057g.f14050u0;
                if (c != null) {
                    c.mo15043a(fVar);
                }
                this.f14058a.f14057g.mo2653s0();
            }
        }

        C5354d(C5350a aVar) {
            this.f14057g = aVar;
            super(0);
        }

        public final C5381b invoke() {
            return new C5381b(R.color.color_background, new C5355a(this));
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.a$e */
    public static final class C5356e<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ C5350a f14059a;

        public C5356e(C5350a aVar) {
            this.f14059a = aVar;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            C5313r rVar = (C5313r) t;
            SwipeRefreshLayout swipeRefreshLayout = C5350a.m20885a(this.f14059a).f13170b.f13075e;
            C5942k.m22324a((Object) swipeRefreshLayout, "binding.viewCustomList.swipeRefresh");
            boolean z = true;
            int i = 0;
            swipeRefreshLayout.setRefreshing(rVar == C5313r.LOADING);
            EmptyView emptyView = C5350a.m20885a(this.f14059a).f13170b.f13072b;
            C5942k.m22324a((Object) emptyView, "binding.viewCustomList.emptyView");
            if (rVar != C5313r.EMPTY_LIST) {
                z = false;
            }
            if (!z) {
                i = 8;
            }
            emptyView.setVisibility(i);
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.a$f */
    public static final class C5357f<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ C5350a f14060a;

        public C5357f(C5350a aVar) {
            this.f14060a = aVar;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            this.f14060a.m20892z0().mo11179b((C3503h) t);
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.a$g */
    static final class C5358g implements OnShowListener {

        /* renamed from: a */
        public static final C5358g f14061a = new C5358g();

        C5358g() {
        }

        public final void onShow(DialogInterface dialogInterface) {
            if (!(dialogInterface instanceof C2589a)) {
                dialogInterface = null;
            }
            C2589a aVar = (C2589a) dialogInterface;
            if (aVar != null) {
                C5698d.m21782a(aVar);
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.a$h */
    public static final class C5359h extends C0589t {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f14062a;

        C5359h(RecyclerView recyclerView) {
            this.f14062a = recyclerView;
        }

        /* renamed from: a */
        public void mo3641a(RecyclerView recyclerView, int i, int i2) {
            C5942k.m22327b(recyclerView, "recyclerView");
            this.f14062a.setNestedScrollingEnabled(i2 <= 0);
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.a$i */
    static final class C5360i implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C5350a f14063f;

        C5360i(C5350a aVar) {
            this.f14063f = aVar;
        }

        public final void onClick(View view) {
            this.f14063f.m20883B0();
            this.f14063f.m20884C0();
        }
    }

    static {
        new C5353c(null);
    }

    /* renamed from: A0 */
    private final C5386c m20882A0() {
        return (C5386c) this.f14047r0.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public final void m20883B0() {
        C5361b a = C5361b.f14064t0.mo15060a();
        C5361b.m20905a(a, null, this, 1, null);
        a.mo2649a(mo2565m(), a.mo2467G());
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public final void m20884C0() {
        C4938c.m19734a(m20891y0(), "custom_lists__create_click", null, 2, null);
    }

    /* renamed from: a */
    public static final /* synthetic */ C5002s m20885a(C5350a aVar) {
        return (C5002s) aVar.mo15026x0();
    }

    /* renamed from: b */
    private final void m20887b(C5297f fVar) {
        C4938c y0 = m20891y0();
        C5802l[] lVarArr = new C5802l[2];
        lVarArr[0] = C5808p.m22056a("custom_list_name", fVar.mo14904e());
        String a = fVar.mo14899a();
        if (a == null) {
            a = "";
        }
        lVarArr[1] = C5808p.m22056a("custom_list_color", a);
        y0.mo14079a("custom_lists__created_list", C5823c0.m22080b(lVarArr));
    }

    /* renamed from: y0 */
    private final C4938c m20891y0() {
        return (C4938c) this.f14048s0.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public final C5381b m20892z0() {
        return (C5381b) this.f14049t0.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C5002s m20894a(ViewGroup viewGroup) {
        C5002s a = C5002s.m20023a(mo2585u(), viewGroup, false);
        C5942k.m22324a((Object) a, "DialogAddToCustomListBin…flater, container, false)");
        return a;
    }

    /* renamed from: a */
    public void mo2506a(View view, Bundle bundle) {
        C5942k.m22327b(view, "view");
        super.mo2506a(view, bundle);
        Dialog u0 = mo2655u0();
        if (u0 != null) {
            u0.setOnShowListener(C5358g.f14061a);
        }
        int dimensionPixelOffset = mo2461A().getDimensionPixelOffset(R.dimen.space_medium);
        RecyclerView recyclerView = ((C5002s) mo15026x0()).f13170b.f13074d;
        recyclerView.setLayoutManager(new LinearLayoutManager(mo2576p0()));
        recyclerView.setAdapter(m20892z0());
        recyclerView.addOnScrollListener(new C5359h(recyclerView));
        recyclerView.addItemDecoration(new C5450c(dimensionPixelOffset));
        ((C5002s) mo15026x0()).f13170b.f13073c.setOnClickListener(new C5360i(this));
        LiveData g = m20882A0().mo15074g();
        C0523n J = mo2470J();
        String str = "viewLifecycleOwner";
        C5942k.m22324a((Object) J, str);
        g.mo2976a(J, new C5356e(this));
        LiveData f = m20882A0().mo15073f();
        C0523n J2 = mo2470J();
        C5942k.m22324a((Object) J2, str);
        f.mo2976a(J2, new C5357f(this));
    }

    /* renamed from: a */
    public void mo15052a(C5297f fVar) {
        C5942k.m22327b(fVar, "customList");
        m20882A0().mo15072a(fVar);
        m20887b(fVar);
    }

    /* renamed from: a */
    public final void mo15053a(C5342c cVar) {
        C5942k.m22327b(cVar, "listener");
        this.f14050u0 = cVar;
    }
}
