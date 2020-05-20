package p255io.stashteam.stashapp.p298ui.leaderboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.C0636h.C0640d;
import androidx.recyclerview.widget.RecyclerView.C0566d0;
import com.google.android.material.textview.MaterialTextView;
import p071f.p131r.C3511i;
import p255io.stashteam.stashapp.p262c.C4980g0;
import p255io.stashteam.stashapp.p269e.p280c.C5292c0;
import p255io.stashteam.stashapp.p269e.p280c.C5294d0;
import p255io.stashteam.stashapp.p281f.p282a.p286h.C5344e;
import p255io.stashteam.stashapp.utils.p304f.C5708k;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.leaderboard.a */
public final class C5610a extends C3511i<C5294d0, C5613c> {

    /* renamed from: f */
    private static final C0640d<C5294d0> f14602f = new C5611a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C5344e f14603e;

    /* renamed from: io.stashteam.stashapp.ui.leaderboard.a$a */
    public static final class C5611a extends C0640d<C5294d0> {
        C5611a() {
        }

        /* renamed from: a */
        public boolean mo3888a(C5294d0 d0Var, C5294d0 d0Var2) {
            C5942k.m22327b(d0Var, "old");
            C5942k.m22327b(d0Var2, "new");
            return C5942k.m22326a((Object) d0Var, (Object) d0Var2);
        }

        /* renamed from: b */
        public boolean mo3889b(C5294d0 d0Var, C5294d0 d0Var2) {
            C5942k.m22327b(d0Var, "old");
            C5942k.m22327b(d0Var2, "new");
            return d0Var.mo14885c() == d0Var2.mo14885c();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.leaderboard.a$b */
    public static final class C5612b {
        private C5612b() {
        }

        public /* synthetic */ C5612b(C5938g gVar) {
            this();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.leaderboard.a$c */
    public static final class C5613c extends C0566d0 {

        /* renamed from: t */
        private final C4980g0 f14604t;

        public C5613c(C4980g0 g0Var) {
            C5942k.m22327b(g0Var, "binding");
            super(g0Var.mo11568b());
            this.f14604t = g0Var;
        }

        /* renamed from: a */
        public final void mo15239a(C5294d0 d0Var) {
            C4980g0 g0Var = this.f14604t;
            if (d0Var != null) {
                AppCompatImageView appCompatImageView = g0Var.f13056b;
                C5942k.m22324a((Object) appCompatImageView, "imageAvatar");
                C5708k.m21801a(appCompatImageView, d0Var.mo14886d());
                MaterialTextView materialTextView = g0Var.f13057c;
                C5942k.m22324a((Object) materialTextView, "textName");
                materialTextView.setText(d0Var.mo14884b());
                MaterialTextView materialTextView2 = g0Var.f13058d;
                C5942k.m22324a((Object) materialTextView2, "textNickname");
                materialTextView2.setText(d0Var.mo14889f());
                C5292c0 g = d0Var.mo14890g();
                if (g != null) {
                    MaterialTextView materialTextView3 = g0Var.f13059e;
                    C5942k.m22324a((Object) materialTextView3, "textPlace");
                    materialTextView3.setText(String.valueOf(g.mo14872d()));
                    MaterialTextView materialTextView4 = g0Var.f13060f;
                    C5942k.m22324a((Object) materialTextView4, "textPoints");
                    materialTextView4.setText(String.valueOf(g.mo14871c()));
                }
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.leaderboard.a$d */
    static final class C5614d implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C5610a f14605f;

        /* renamed from: g */
        final /* synthetic */ C5613c f14606g;

        C5614d(C5610a aVar, C5613c cVar) {
            this.f14605f = aVar;
            this.f14606g = cVar;
        }

        public final void onClick(View view) {
            C5294d0 a = C5610a.m21473a(this.f14605f, this.f14606g.mo3420f());
            if (a != null) {
                C5344e a2 = this.f14605f.f14603e;
                C5942k.m22324a((Object) a, "it");
                a2.mo15045a(a);
            }
        }
    }

    static {
        new C5612b(null);
    }

    public C5610a(C5344e eVar) {
        C5942k.m22327b(eVar, "userClickListener");
        super(f14602f);
        this.f14603e = eVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ C5294d0 m21473a(C5610a aVar, int i) {
        return (C5294d0) aVar.mo11180c(i);
    }

    /* renamed from: a */
    public void mo3477b(C5613c cVar, int i) {
        C5942k.m22327b(cVar, "holder");
        cVar.mo15239a((C5294d0) mo11180c(i));
    }

    /* renamed from: b */
    public C5613c m21477b(ViewGroup viewGroup, int i) {
        C5942k.m22327b(viewGroup, "parent");
        C4980g0 a = C4980g0.m19943a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C5942k.m22324a((Object) a, "ItemUserBinding.inflate(….context), parent, false)");
        C5613c cVar = new C5613c(a);
        cVar.f2358a.setOnClickListener(new C5614d(this, cVar));
        return cVar;
    }
}
