package p255io.stashteam.stashapp.p281f.p282a.p283e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.card.MaterialCardView;
import p071f.p131r.C3511i;
import p255io.stashteam.stashapp.p262c.C4970b0;
import p255io.stashteam.stashapp.p269e.p280c.C5323z;
import p255io.stashteam.stashapp.p281f.p282a.p285g.C5337a;
import p255io.stashteam.stashapp.p281f.p282a.p286h.C5343d;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.f.a.e.b */
public final class C5331b extends C3511i<C5323z, C5337a> {

    /* renamed from: e */
    private final boolean f14004e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C5343d f14005f;

    /* renamed from: io.stashteam.stashapp.f.a.e.b$a */
    static final class C5332a implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C5331b f14006f;

        /* renamed from: g */
        final /* synthetic */ C5337a f14007g;

        /* renamed from: h */
        final /* synthetic */ C4970b0 f14008h;

        C5332a(C5331b bVar, C5337a aVar, C4970b0 b0Var) {
            this.f14006f = bVar;
            this.f14007g = aVar;
            this.f14008h = b0Var;
        }

        public final void onClick(View view) {
            int f = this.f14007g.mo3420f();
            if (f != -1) {
                C5323z a = C5331b.m20827a(this.f14006f, f);
                if (a != null) {
                    C5942k.m22324a((Object) a, "getItem(position) ?: return@setOnClickListener");
                    C5343d a2 = this.f14006f.f14005f;
                    MaterialCardView materialCardView = this.f14008h.f13001b;
                    C5942k.m22324a((Object) materialCardView, "binding.cardView");
                    AppCompatImageView appCompatImageView = this.f14008h.f13003d;
                    C5942k.m22324a((Object) appCompatImageView, "binding.imageCover");
                    a2.mo15044a(materialCardView, appCompatImageView, a);
                }
            }
        }
    }

    public C5331b(boolean z, C5343d dVar) {
        C5942k.m22327b(dVar, "clickListener");
        super(C5337a.f14029v.mo15040a());
        this.f14004e = z;
        this.f14005f = dVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ C5323z m20827a(C5331b bVar, int i) {
        return (C5323z) bVar.mo11180c(i);
    }

    /* renamed from: a */
    public void mo3477b(C5337a aVar, int i) {
        C5942k.m22327b(aVar, "holder");
        aVar.mo15037a((C5323z) mo11180c(i), this.f14004e);
    }

    /* renamed from: b */
    public C5337a m20831b(ViewGroup viewGroup, int i) {
        C5942k.m22327b(viewGroup, "parent");
        C4970b0 a = C4970b0.m19898a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C5942k.m22324a((Object) a, "ItemGameBinding.inflate(….context), parent, false)");
        C5337a aVar = new C5337a(a);
        a.mo11568b().setOnClickListener(new C5332a(this, aVar, a));
        return aVar;
    }
}
