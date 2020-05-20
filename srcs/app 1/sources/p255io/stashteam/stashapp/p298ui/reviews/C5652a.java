package p255io.stashteam.stashapp.p298ui.reviews;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.C0636h.C0640d;
import androidx.recyclerview.widget.RecyclerView.C0566d0;
import p071f.p131r.C3511i;
import p255io.stashteam.stashapp.p262c.C4976e0;
import p255io.stashteam.stashapp.p269e.p280c.C5294d0;
import p255io.stashteam.stashapp.p269e.p280c.C5306l;
import p255io.stashteam.stashapp.p269e.p280c.C5308n;
import p255io.stashteam.stashapp.p269e.p280c.C5320w;
import p255io.stashteam.stashapp.p281f.p282a.p286h.C5344e;
import p255io.stashteam.stashapp.utils.p304f.C5700f;
import p255io.stashteam.stashapp.utils.p304f.C5708k;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.reviews.a */
public final class C5652a extends C3511i<C5320w, C5655c> {

    /* renamed from: f */
    private static final C0640d<C5320w> f14692f = new C5653a();

    /* renamed from: e */
    private final C5344e f14693e;

    /* renamed from: io.stashteam.stashapp.ui.reviews.a$a */
    public static final class C5653a extends C0640d<C5320w> {
        C5653a() {
        }

        /* renamed from: a */
        public boolean mo3888a(C5320w wVar, C5320w wVar2) {
            C5942k.m22327b(wVar, "old");
            C5942k.m22327b(wVar2, "new");
            return C5942k.m22326a((Object) wVar, (Object) wVar2);
        }

        /* renamed from: b */
        public boolean mo3889b(C5320w wVar, C5320w wVar2) {
            C5942k.m22327b(wVar, "old");
            C5942k.m22327b(wVar2, "new");
            return C5942k.m22326a((Object) wVar.mo15002a().mo14961c(), (Object) wVar2.mo15002a().mo14961c());
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.reviews.a$b */
    public static final class C5654b {
        private C5654b() {
        }

        public /* synthetic */ C5654b(C5938g gVar) {
            this();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.reviews.a$c */
    public final class C5655c extends C0566d0 {

        /* renamed from: t */
        private final C4976e0 f14694t;

        /* renamed from: io.stashteam.stashapp.ui.reviews.a$c$a */
        static final class C5656a implements OnClickListener {

            /* renamed from: f */
            final /* synthetic */ C5294d0 f14695f;

            /* renamed from: g */
            final /* synthetic */ C5344e f14696g;

            C5656a(C5294d0 d0Var, C5344e eVar, C5306l lVar) {
                this.f14695f = d0Var;
                this.f14696g = eVar;
            }

            public final void onClick(View view) {
                this.f14696g.mo15045a(this.f14695f);
            }
        }

        public C5655c(C5652a aVar, C4976e0 e0Var) {
            C5942k.m22327b(e0Var, "binding");
            super(e0Var.mo11568b());
            this.f14694t = e0Var;
        }

        /* renamed from: a */
        public final void mo15268a(C5320w wVar, C5344e eVar) {
            C5942k.m22327b(eVar, "userClickListener");
            if (wVar != null) {
                C5294d0 b = wVar.mo15003b();
                C5306l a = wVar.mo15002a();
                C4976e0 e0Var = this.f14694t;
                AppCompatTextView appCompatTextView = e0Var.f13045j;
                C5942k.m22324a((Object) appCompatTextView, "textUserName");
                appCompatTextView.setText(b.mo14884b());
                AppCompatImageView appCompatImageView = e0Var.f13037b;
                C5942k.m22324a((Object) appCompatImageView, "imageAvatar");
                C5708k.m21801a(appCompatImageView, b.mo14886d());
                e0Var.f13037b.setOnClickListener(new C5656a(b, eVar, a));
                AppCompatTextView appCompatTextView2 = e0Var.f13042g;
                String str = "textNickname";
                C5942k.m22324a((Object) appCompatTextView2, str);
                boolean z = true;
                int i = 0;
                appCompatTextView2.setVisibility(a.mo14963e() == C5308n.f13936h ? 0 : 8);
                AppCompatTextView appCompatTextView3 = e0Var.f13042g;
                C5942k.m22324a((Object) appCompatTextView3, str);
                appCompatTextView3.setText(b.mo14889f());
                AppCompatTextView appCompatTextView4 = e0Var.f13044i;
                String str2 = "textScore";
                C5942k.m22324a((Object) appCompatTextView4, str2);
                appCompatTextView4.setVisibility(a.mo14962d().mo15000i() ? 0 : 8);
                AppCompatTextView appCompatTextView5 = e0Var.f13044i;
                C5942k.m22324a((Object) appCompatTextView5, str2);
                appCompatTextView5.setText(a.mo14962d().mo14998g());
                AppCompatTextView appCompatTextView6 = e0Var.f13041f;
                String str3 = "textEmoji";
                C5942k.m22324a((Object) appCompatTextView6, str3);
                appCompatTextView6.setVisibility(a.mo14962d().mo15000i() ? 0 : 8);
                AppCompatTextView appCompatTextView7 = e0Var.f13041f;
                C5942k.m22324a((Object) appCompatTextView7, str3);
                appCompatTextView7.setText(a.mo14962d().mo14997f());
                AppCompatRatingBar appCompatRatingBar = e0Var.f13039d;
                String str4 = "ratingBar";
                C5942k.m22324a((Object) appCompatRatingBar, str4);
                appCompatRatingBar.setVisibility(a.mo14962d().mo15000i() ? 0 : 8);
                AppCompatRatingBar appCompatRatingBar2 = e0Var.f13039d;
                C5942k.m22324a((Object) appCompatRatingBar2, str4);
                appCompatRatingBar2.setRating((float) a.mo14962d().mo14999h());
                AppCompatTextView appCompatTextView8 = e0Var.f13043h;
                String str5 = "textReview";
                C5942k.m22324a((Object) appCompatTextView8, str5);
                String a2 = a.mo14959a();
                appCompatTextView8.setVisibility((a2 == null || a2.length() == 0) ^ true ? 0 : 8);
                AppCompatTextView appCompatTextView9 = e0Var.f13043h;
                C5942k.m22324a((Object) appCompatTextView9, str5);
                appCompatTextView9.setText(a.mo14959a());
                AppCompatTextView appCompatTextView10 = e0Var.f13040e;
                String str6 = "textDate";
                C5942k.m22324a((Object) appCompatTextView10, str6);
                if (a.mo14963e() == C5308n.f13936h) {
                    z = false;
                }
                appCompatTextView10.setVisibility(z ? 0 : 8);
                AppCompatTextView appCompatTextView11 = e0Var.f13040e;
                C5942k.m22324a((Object) appCompatTextView11, str6);
                appCompatTextView11.setText(C5700f.m21793a(a.mo14961c()));
                AppCompatImageView appCompatImageView2 = e0Var.f13038c;
                C5942k.m22324a((Object) appCompatImageView2, "imageComplete");
                if (!a.mo14960b()) {
                    i = 8;
                }
                appCompatImageView2.setVisibility(i);
            }
        }
    }

    static {
        new C5654b(null);
    }

    public C5652a(C5344e eVar) {
        C5942k.m22327b(eVar, "userClickListener");
        super(f14692f);
        this.f14693e = eVar;
    }

    /* renamed from: a */
    public void mo3477b(C5655c cVar, int i) {
        C5942k.m22327b(cVar, "holder");
        cVar.mo15268a((C5320w) mo11180c(i), this.f14693e);
    }

    /* renamed from: b */
    public C5655c m21577b(ViewGroup viewGroup, int i) {
        C5942k.m22327b(viewGroup, "parent");
        C4976e0 a = C4976e0.m19925a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C5942k.m22324a((Object) a, "ItemReviewBinding.inflat….context), parent, false)");
        return new C5655c(this, a);
    }
}
