package p255io.stashteam.stashapp.p281f.p282a.p285g;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.C0636h.C0640d;
import androidx.recyclerview.widget.RecyclerView.C0566d0;
import com.google.android.material.textview.MaterialTextView;
import io.stashteam.games.tracker.stashapp.R;
import p255io.stashteam.stashapp.p262c.C4970b0;
import p255io.stashteam.stashapp.p269e.p280c.C5306l;
import p255io.stashteam.stashapp.p269e.p280c.C5308n;
import p255io.stashteam.stashapp.p269e.p280c.C5311p;
import p255io.stashteam.stashapp.p269e.p280c.C5323z;
import p255io.stashteam.stashapp.utils.p304f.C5708k;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.f.a.g.a */
public final class C5337a extends C0566d0 {
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final C0640d<C5323z> f14028u = new C5338a();

    /* renamed from: v */
    public static final C5339b f14029v = new C5339b(null);

    /* renamed from: t */
    private final C4970b0 f14030t;

    /* renamed from: io.stashteam.stashapp.f.a.g.a$a */
    public static final class C5338a extends C0640d<C5323z> {
        C5338a() {
        }

        /* renamed from: a */
        public boolean mo3888a(C5323z zVar, C5323z zVar2) {
            C5942k.m22327b(zVar, "old");
            C5942k.m22327b(zVar2, "new");
            return C5942k.m22326a((Object) zVar, (Object) zVar2);
        }

        /* renamed from: b */
        public boolean mo3889b(C5323z zVar, C5323z zVar2) {
            C5942k.m22327b(zVar, "old");
            C5942k.m22327b(zVar2, "new");
            return zVar.mo15017c() == zVar2.mo15017c();
        }
    }

    /* renamed from: io.stashteam.stashapp.f.a.g.a$b */
    public static final class C5339b {
        private C5339b() {
        }

        public /* synthetic */ C5339b(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C0640d<C5323z> mo15040a() {
            return C5337a.f14028u;
        }
    }

    public C5337a(C4970b0 b0Var) {
        C5942k.m22327b(b0Var, "binding");
        super(b0Var.mo11568b());
        this.f14030t = b0Var;
    }

    /* renamed from: a */
    private final void m20849a(C5306l lVar) {
        AppCompatImageView appCompatImageView = this.f14030t.f13002c;
        C5942k.m22324a((Object) appCompatImageView, "binding.imageComplete");
        int i = 0;
        boolean z = true;
        if (lVar == null || !lVar.mo14960b()) {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        appCompatImageView.setVisibility(i);
    }

    /* renamed from: a */
    private final void m20850a(C5306l lVar, boolean z) {
        AppCompatImageView appCompatImageView = this.f14030t.f13004e;
        C5942k.m22324a((Object) appCompatImageView, "binding.imagePlaying");
        int i = 0;
        if (!((lVar != null ? lVar.mo14963e() : null) == C5308n.f13938j) || !z) {
            i = 8;
        }
        appCompatImageView.setVisibility(i);
    }

    /* renamed from: b */
    private final void m20851b(C5306l lVar) {
        MaterialTextView materialTextView = this.f14030t.f13007h;
        int i = 8;
        if (lVar == null) {
            materialTextView.setVisibility(8);
            return;
        }
        if (lVar.mo14962d().mo15000i()) {
            i = 0;
        }
        materialTextView.setVisibility(i);
        materialTextView.setText(lVar.mo14962d().mo14998g());
    }

    /* renamed from: b */
    private final void m20852b(C5306l lVar, boolean z) {
        MaterialTextView materialTextView = this.f14030t.f13008i;
        if (lVar == null || !z || lVar.mo14962d().mo15000i()) {
            materialTextView.setVisibility(8);
            return;
        }
        materialTextView.setVisibility(0);
        materialTextView.setText(lVar.mo14963e().mo14972g());
    }

    /* renamed from: a */
    public final void mo15037a(C5323z zVar, boolean z) {
        if (zVar != null) {
            AppCompatTextView appCompatTextView = this.f14030t.f13006g;
            C5942k.m22324a((Object) appCompatTextView, "binding.textName");
            appCompatTextView.setText(zVar.mo15018d());
            View view = this.f2358a;
            C5942k.m22324a((Object) view, "itemView");
            Context context = view.getContext();
            C5942k.m22324a((Object) context, "itemView.context");
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.card_corner_radius);
            AppCompatImageView appCompatImageView = this.f14030t.f13003d;
            C5942k.m22324a((Object) appCompatImageView, "binding.imageCover");
            C5311p a = zVar.mo15015a();
            C5708k.m21803a(appCompatImageView, a != null ? a.mo14981b() : null, null, dimensionPixelOffset, 0, 10, null);
            MaterialTextView materialTextView = this.f14030t.f13005f;
            C5942k.m22324a((Object) materialTextView, "binding.textDlc");
            materialTextView.setVisibility(zVar.mo15019e() ? 0 : 8);
            m20849a(zVar.mo15016b());
            m20851b(zVar.mo15016b());
            m20850a(zVar.mo15016b(), z);
            m20852b(zVar.mo15016b(), z);
        }
    }
}
