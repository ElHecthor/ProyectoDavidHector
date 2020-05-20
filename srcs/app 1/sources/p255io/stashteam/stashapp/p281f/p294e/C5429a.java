package p255io.stashteam.stashapp.p281f.p294e;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.C0429d;
import androidx.lifecycle.C0523n;
import androidx.lifecycle.C0533u;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.C2589a;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import io.stashteam.games.tracker.stashapp.R;
import java.util.List;
import p255io.stashteam.stashapp.p256b.p257a.C4938c;
import p255io.stashteam.stashapp.p262c.C5008y;
import p255io.stashteam.stashapp.p269e.p280c.C5323z;
import p255io.stashteam.stashapp.p281f.p282a.C5325b;
import p255io.stashteam.stashapp.p281f.p282a.p283e.C5329a;
import p255io.stashteam.stashapp.p281f.p282a.p286h.C5343d;
import p255io.stashteam.stashapp.p281f.p295f.p297b.C5449b;
import p255io.stashteam.stashapp.p298ui.game.detail.GameDetailActivity;
import p255io.stashteam.stashapp.p298ui.game.detail.GameDetailActivity.C5495c;
import p255io.stashteam.stashapp.utils.C5688a;
import p255io.stashteam.stashapp.utils.p304f.C5698d;
import p255io.stashteam.stashapp.utils.p304f.C5703i;
import p255io.stashteam.stashapp.utils.p304f.C5710m;
import p308k.C5797g;
import p308k.C5809q;
import p308k.C5812t;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p352o.p353a.p364c.p372k.C6560a;

/* renamed from: io.stashteam.stashapp.f.e.a */
public final class C5429a extends C5325b<C5008y> {

    /* renamed from: u0 */
    public static final C5432c f14203u0 = new C5432c(null);

    /* renamed from: r0 */
    private final C5797g f14204r0 = C5799i.m22044a(new C5431b(this, null, null));

    /* renamed from: s0 */
    private final C5797g f14205s0 = C5799i.m22044a(new C5430a(this, null, null));

    /* renamed from: t0 */
    private final C5797g f14206t0 = C5799i.m22044a(new C5433d(this));

    /* renamed from: io.stashteam.stashapp.f.e.a$a */
    public static final class C5430a extends C5943l implements C5907a<C4938c> {

        /* renamed from: g */
        final /* synthetic */ ComponentCallbacks f14207g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14208h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14209i;

        public C5430a(ComponentCallbacks componentCallbacks, C6560a aVar, C5907a aVar2) {
            this.f14207g = componentCallbacks;
            this.f14208h = aVar;
            this.f14209i = aVar2;
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
                android.content.ComponentCallbacks r0 = r4.f14207g
                o.a.c.k.a r1 = r4.f14208h
                k.z.c.a r2 = r4.f14209i
                o.a.c.a r0 = p352o.p353a.p354a.p356b.p357a.C6511a.m24704a(r0)
                o.a.c.m.a r0 = r0.mo16935b()
                java.lang.Class<io.stashteam.stashapp.b.a.c> r3 = p255io.stashteam.stashapp.p256b.p257a.C4938c.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                java.lang.Object r0 = r0.mo17011a(r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p281f.p294e.C5429a.C5430a.invoke():java.lang.Object");
        }
    }

    /* renamed from: io.stashteam.stashapp.f.e.a$b */
    public static final class C5431b extends C5943l implements C5907a<C5440b> {

        /* renamed from: g */
        final /* synthetic */ C0523n f14210g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14211h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14212i;

        public C5431b(C0523n nVar, C6560a aVar, C5907a aVar2) {
            this.f14210g = nVar;
            this.f14211h = aVar;
            this.f14212i = aVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, io.stashteam.stashapp.f.e.b] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1, types: [androidx.lifecycle.a0, io.stashteam.stashapp.f.e.b]
          assigns: [androidx.lifecycle.a0]
          uses: [io.stashteam.stashapp.f.e.b]
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
        public final p255io.stashteam.stashapp.p281f.p294e.C5440b invoke() {
            /*
                r4 = this;
                androidx.lifecycle.n r0 = r4.f14210g
                o.a.c.k.a r1 = r4.f14211h
                k.z.c.a r2 = r4.f14212i
                java.lang.Class<io.stashteam.stashapp.f.e.b> r3 = p255io.stashteam.stashapp.p281f.p294e.C5440b.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                androidx.lifecycle.a0 r0 = p352o.p353a.p359b.p360a.p362d.p363a.C6521a.m24722a(r0, r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p281f.p294e.C5429a.C5431b.invoke():androidx.lifecycle.a0");
        }
    }

    /* renamed from: io.stashteam.stashapp.f.e.a$c */
    public static final class C5432c {
        private C5432c() {
        }

        public /* synthetic */ C5432c(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C5429a mo15099a() {
            return new C5429a();
        }
    }

    /* renamed from: io.stashteam.stashapp.f.e.a$d */
    static final class C5433d extends C5943l implements C5907a<C5329a> {

        /* renamed from: g */
        final /* synthetic */ C5429a f14213g;

        /* renamed from: io.stashteam.stashapp.f.e.a$d$a */
        public static final class C5434a implements C5343d {

            /* renamed from: a */
            final /* synthetic */ C5433d f14214a;

            C5434a(C5433d dVar) {
                this.f14214a = dVar;
            }

            /* renamed from: a */
            public void mo15044a(MaterialCardView materialCardView, AppCompatImageView appCompatImageView, C5323z zVar) {
                C5942k.m22327b(materialCardView, "cardView");
                C5942k.m22327b(appCompatImageView, "imageView");
                C5942k.m22327b(zVar, "game");
                C5495c cVar = GameDetailActivity.f14345I;
                C0429d o0 = this.f14214a.f14213g.mo2571o0();
                String str = "requireActivity()";
                C5942k.m22324a((Object) o0, str);
                Bundle a = cVar.mo15150a(o0, materialCardView, appCompatImageView);
                C5429a aVar = this.f14214a.f14213g;
                C5495c cVar2 = GameDetailActivity.f14345I;
                C0429d o02 = aVar.mo2571o0();
                C5942k.m22324a((Object) o02, str);
                aVar.mo2501a(cVar2.mo15149a((Context) o02, zVar), a);
            }
        }

        C5433d(C5429a aVar) {
            this.f14213g = aVar;
            super(0);
        }

        public final C5329a invoke() {
            return new C5329a(0, new C5434a(this), 1, null);
        }
    }

    /* renamed from: io.stashteam.stashapp.f.e.a$e */
    public static final class C5435e<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ C5429a f14215a;

        public C5435e(C5429a aVar) {
            this.f14215a = aVar;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            List list = (List) t;
            this.f14215a.m21079y0().mo3932a(list);
            int i = 0;
            C5429a.m21077b(this.f14215a).f13216f.smoothScrollToPosition(0);
            MaterialTextView materialTextView = C5429a.m21077b(this.f14215a).f13217g;
            C5942k.m22324a((Object) materialTextView, "binding.textNoResults");
            if (!list.isEmpty()) {
                i = 8;
            }
            materialTextView.setVisibility(i);
        }
    }

    /* renamed from: io.stashteam.stashapp.f.e.a$f */
    public static final class C5436f<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ C5429a f14216a;

        public C5436f(C5429a aVar) {
            this.f14216a = aVar;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            C5429a.m21077b(this.f14216a).f13218h.setText(((Boolean) t).booleanValue() ? R.string.search_search_results : R.string.search_popular);
        }
    }

    /* renamed from: io.stashteam.stashapp.f.e.a$g */
    public static final class C5437g<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ C5429a f14217a;

        public C5437g(C5429a aVar) {
            this.f14217a = aVar;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            boolean booleanValue = ((Boolean) t).booleanValue();
            TextInputLayout textInputLayout = C5429a.m21077b(this.f14217a).f13212b;
            C5942k.m22324a((Object) textInputLayout, "binding.inputLayout");
            int i = 0;
            textInputLayout.setEndIconMode(booleanValue ? 0 : 2);
            ProgressBar progressBar = C5429a.m21077b(this.f14217a).f13215e;
            C5942k.m22324a((Object) progressBar, "binding.progressBar");
            if (!booleanValue) {
                i = 8;
            }
            progressBar.setVisibility(i);
        }
    }

    /* renamed from: io.stashteam.stashapp.f.e.a$h */
    static final class C5438h extends C5943l implements C5918l<String, C5812t> {

        /* renamed from: g */
        final /* synthetic */ C5429a f14218g;

        C5438h(C5429a aVar) {
            this.f14218g = aVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo15100a(String str) {
            C5942k.m22327b(str, "it");
            this.f14218g.m21075A0().mo15102b(str);
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo15100a((String) obj);
            return C5812t.f14872a;
        }
    }

    /* renamed from: io.stashteam.stashapp.f.e.a$i */
    static final class C5439i implements OnShowListener {

        /* renamed from: a */
        public static final C5439i f14219a = new C5439i();

        C5439i() {
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

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public final C5440b m21075A0() {
        return (C5440b) this.f14204r0.getValue();
    }

    /* renamed from: b */
    public static final /* synthetic */ C5008y m21077b(C5429a aVar) {
        return (C5008y) aVar.mo15026x0();
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public final C5329a m21079y0() {
        return (C5329a) this.f14206t0.getValue();
    }

    /* renamed from: z0 */
    private final C4938c m21080z0() {
        return (C4938c) this.f14205s0.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C5008y m21082a(ViewGroup viewGroup) {
        C5008y a = C5008y.m20047a(mo2585u(), viewGroup, false);
        C5942k.m22324a((Object) a, "FragmentSearchBinding.in…flater, container, false)");
        return a;
    }

    /* renamed from: a */
    public void mo2506a(View view, Bundle bundle) {
        C5942k.m22327b(view, "view");
        super.mo2506a(view, bundle);
        Context n = mo2568n();
        view.setBackground(n != null ? n.getDrawable(R.drawable.bg_bottom_sheet_gray) : null);
        TextInputEditText textInputEditText = ((C5008y) mo15026x0()).f13213c;
        C5942k.m22324a((Object) textInputEditText, "binding.inputSearch");
        C5703i.m21797a(textInputEditText, new C5438h(this));
        LinearLayout linearLayout = ((C5008y) mo15026x0()).f13214d;
        String str = "binding.layoutContent";
        C5942k.m22324a((Object) linearLayout, str);
        LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.height = C5688a.f14784a.mo15339a();
            LinearLayout linearLayout2 = ((C5008y) mo15026x0()).f13214d;
            C5942k.m22324a((Object) linearLayout2, str);
            linearLayout2.setLayoutParams(marginLayoutParams);
            int dimensionPixelOffset = mo2461A().getDimensionPixelOffset(R.dimen.space_small);
            RecyclerView recyclerView = ((C5008y) mo15026x0()).f13216f;
            String str2 = "binding.recyclerView";
            C5942k.m22324a((Object) recyclerView, str2);
            recyclerView.setLayoutManager(new LinearLayoutManager(mo2576p0(), 0, false));
            ((C5008y) mo15026x0()).f13216f.addItemDecoration(new C5449b(dimensionPixelOffset));
            RecyclerView recyclerView2 = ((C5008y) mo15026x0()).f13216f;
            C5942k.m22324a((Object) recyclerView2, str2);
            recyclerView2.setAdapter(m21079y0());
            Dialog u0 = mo2655u0();
            if (u0 != null) {
                u0.setOnShowListener(C5439i.f14219a);
            }
            LiveData f = m21075A0().mo15103f();
            C0523n J = mo2470J();
            String str3 = "viewLifecycleOwner";
            C5942k.m22324a((Object) J, str3);
            f.mo2976a(J, new C5435e(this));
            LiveData h = m21075A0().mo15105h();
            C0523n J2 = mo2470J();
            C5942k.m22324a((Object) J2, str3);
            h.mo2976a(J2, new C5436f(this));
            LiveData g = m21075A0().mo15104g();
            C0523n J3 = mo2470J();
            C5942k.m22324a((Object) J3, str3);
            g.mo2976a(J3, new C5437g(this));
            m21075A0().mo15102b("");
            C0523n J4 = mo2470J();
            C5942k.m22324a((Object) J4, str3);
            Context p0 = mo2576p0();
            C5942k.m22324a((Object) p0, "requireContext()");
            C5710m.m21808a(J4, p0, m21075A0().mo15048c(), 0, null, 12, null);
            C4938c.m19734a(m21080z0(), "search__screen_view", null, 2, null);
            return;
        }
        throw new C5809q("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: a0 */
    public void mo2513a0() {
        super.mo2513a0();
        C5688a.f14784a.mo15342a((Activity) mo2540f());
    }

    /* renamed from: b0 */
    public void mo2522b0() {
        super.mo2522b0();
        ((C5008y) mo15026x0()).f13213c.requestFocus();
        C5688a.f14784a.mo15344b(mo2540f());
    }
}
