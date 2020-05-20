package p255io.stashteam.stashapp.p281f.p282a.p283e;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.C0657o;
import com.google.android.material.card.MaterialCardView;
import io.stashteam.games.tracker.stashapp.R;
import p255io.stashteam.stashapp.p262c.C4970b0;
import p255io.stashteam.stashapp.p269e.p280c.C5323z;
import p255io.stashteam.stashapp.p281f.p282a.p285g.C5337a;
import p255io.stashteam.stashapp.p281f.p282a.p286h.C5343d;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.f.a.e.a */
public final class C5329a extends C0657o<C5323z, C5337a> {

    /* renamed from: e */
    private final int f13999e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C5343d f14000f;

    /* renamed from: io.stashteam.stashapp.f.a.e.a$a */
    static final class C5330a implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C5329a f14001f;

        /* renamed from: g */
        final /* synthetic */ C5337a f14002g;

        /* renamed from: h */
        final /* synthetic */ C4970b0 f14003h;

        C5330a(C5329a aVar, C5337a aVar2, C4970b0 b0Var) {
            this.f14001f = aVar;
            this.f14002g = aVar2;
            this.f14003h = b0Var;
        }

        public final void onClick(View view) {
            int f = this.f14002g.mo3420f();
            if (f != -1) {
                C5323z a = C5329a.m20821a(this.f14001f, f);
                if (a != null) {
                    C5343d a2 = this.f14001f.f14000f;
                    MaterialCardView materialCardView = this.f14003h.f13001b;
                    C5942k.m22324a((Object) materialCardView, "binding.cardView");
                    AppCompatImageView appCompatImageView = this.f14003h.f13003d;
                    C5942k.m22324a((Object) appCompatImageView, "binding.imageCover");
                    a2.mo15044a(materialCardView, appCompatImageView, a);
                }
            }
        }
    }

    public C5329a(int i, C5343d dVar) {
        C5942k.m22327b(dVar, "clickListener");
        super(C5337a.f14029v.mo15040a());
        this.f13999e = i;
        this.f14000f = dVar;
    }

    public /* synthetic */ C5329a(int i, C5343d dVar, int i2, C5938g gVar) {
        if ((i2 & 1) != 0) {
            i = R.dimen.item_game_width_medium;
        }
        this(i, dVar);
    }

    /* renamed from: a */
    public static final /* synthetic */ C5323z m20821a(C5329a aVar, int i) {
        return (C5323z) aVar.mo3934c(i);
    }

    /* renamed from: a */
    public void mo3477b(C5337a aVar, int i) {
        C5942k.m22327b(aVar, "holder");
        aVar.mo15037a((C5323z) mo3934c(i), true);
    }

    /* renamed from: b */
    public C5337a m20825b(ViewGroup viewGroup, int i) {
        C5942k.m22327b(viewGroup, "parent");
        C4970b0 a = C4970b0.m19898a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C5942k.m22324a((Object) a, "ItemGameBinding.inflate(….context), parent, false)");
        Context context = viewGroup.getContext();
        C5942k.m22324a((Object) context, "parent.context");
        LayoutParams layoutParams = new LayoutParams(context.getResources().getDimensionPixelOffset(this.f13999e), -2);
        MaterialCardView b = a.mo11568b();
        C5942k.m22324a((Object) b, "binding.root");
        b.setLayoutParams(layoutParams);
        C5337a aVar = new C5337a(a);
        a.mo11568b().setOnClickListener(new C5330a(this, aVar, a));
        return aVar;
    }
}
