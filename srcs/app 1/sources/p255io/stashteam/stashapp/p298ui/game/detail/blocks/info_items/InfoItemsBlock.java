package p255io.stashteam.stashapp.p298ui.game.detail.blocks.info_items;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import io.stashteam.games.tracker.stashapp.R;
import p255io.stashteam.stashapp.p262c.C4997p;
import p255io.stashteam.stashapp.p269e.p280c.C5293d;
import p255io.stashteam.stashapp.p269e.p280c.C5298g;
import p255io.stashteam.stashapp.p269e.p280c.C5305k;
import p255io.stashteam.stashapp.p269e.p280c.C5322y;
import p255io.stashteam.stashapp.p298ui.game.detail.GameDetailActivity;
import p255io.stashteam.stashapp.p298ui.game.detail.GameDetailActivity.C5495c;
import p255io.stashteam.stashapp.p298ui.game.list.GameListActivity;
import p255io.stashteam.stashapp.p298ui.game.list.GameListActivity.C5558c;
import p255io.stashteam.stashapp.p298ui.widgets.itemviews.InfoItemView;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.game.detail.blocks.info_items.InfoItemsBlock */
public final class InfoItemsBlock extends LinearLayout {

    /* renamed from: f */
    private final C4997p f14453f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C5536a f14454g;

    /* renamed from: io.stashteam.stashapp.ui.game.detail.blocks.info_items.InfoItemsBlock$a */
    public interface C5536a {
        /* renamed from: a */
        void mo15138a(Intent intent, String str);
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.blocks.info_items.InfoItemsBlock$b */
    static final class C5537b implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ InfoItemsBlock f14455f;

        /* renamed from: g */
        final /* synthetic */ C5298g f14456g;

        C5537b(InfoItemsBlock infoItemsBlock, C5298g gVar) {
            this.f14455f = infoItemsBlock;
            this.f14456g = gVar;
        }

        public final void onClick(View view) {
            Long i = this.f14456g.mo14919i();
            if (i != null) {
                long longValue = i.longValue();
                C5536a a = this.f14455f.f14454g;
                if (a != null) {
                    C5495c cVar = GameDetailActivity.f14345I;
                    Context context = this.f14455f.getContext();
                    C5942k.m22324a((Object) context, "context");
                    a.mo15138a(cVar.mo15148a(context, longValue), "game_detail__parent_click");
                }
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.blocks.info_items.InfoItemsBlock$c */
    static final class C5538c implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ InfoItemsBlock f14457f;

        /* renamed from: g */
        final /* synthetic */ C5298g f14458g;

        C5538c(InfoItemsBlock infoItemsBlock, C5298g gVar) {
            this.f14457f = infoItemsBlock;
            this.f14458g = gVar;
        }

        public final void onClick(View view) {
            C5536a a = this.f14457f.f14454g;
            if (a != null) {
                C5558c cVar = GameListActivity.f14483J;
                Context context = this.f14457f.getContext();
                C5942k.m22324a((Object) context, "context");
                String string = this.f14457f.getContext().getString(R.string.game_series);
                C5322y m = this.f14458g.mo14923m();
                a.mo15138a(C5558c.m21386a(cVar, context, string, m != null ? m.mo15011b() : null, C5305k.GAME_SERIES, Long.valueOf(this.f14458g.mo14916g()), Long.valueOf(this.f14458g.mo14916g()), null, 64, null), "game_detail__game_series_click");
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.blocks.info_items.InfoItemsBlock$d */
    static final class C5539d implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ InfoItemsBlock f14459f;

        /* renamed from: g */
        final /* synthetic */ C5298g f14460g;

        C5539d(InfoItemsBlock infoItemsBlock, C5298g gVar) {
            this.f14459f = infoItemsBlock;
            this.f14460g = gVar;
        }

        public final void onClick(View view) {
            C5536a a = this.f14459f.f14454g;
            if (a != null) {
                C5558c cVar = GameListActivity.f14483J;
                Context context = this.f14459f.getContext();
                C5942k.m22324a((Object) context, "context");
                a.mo15138a(C5558c.m21386a(cVar, context, this.f14459f.getContext().getString(R.string.game_dlcs), this.f14460g.mo14917h(), C5305k.GAME_ADDONS, Long.valueOf(this.f14460g.mo14916g()), Long.valueOf(this.f14460g.mo14916g()), null, 64, null), "game_detail__addons_click");
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.blocks.info_items.InfoItemsBlock$e */
    static final class C5540e implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ InfoItemsBlock f14461f;

        /* renamed from: g */
        final /* synthetic */ C5293d f14462g;

        /* renamed from: h */
        final /* synthetic */ C5298g f14463h;

        C5540e(InfoItemsBlock infoItemsBlock, C5293d dVar, C5298g gVar) {
            this.f14461f = infoItemsBlock;
            this.f14462g = dVar;
            this.f14463h = gVar;
        }

        public final void onClick(View view) {
            C5536a a = this.f14461f.f14454g;
            if (a != null) {
                C5558c cVar = GameListActivity.f14483J;
                Context context = this.f14461f.getContext();
                C5942k.m22324a((Object) context, "context");
                String string = this.f14461f.getContext().getString(R.string.company_developer);
                C5942k.m22324a((Object) string, "context.getString(R.string.company_developer)");
                String c = C5787p.m21981c(string);
                C5293d dVar = this.f14462g;
                Long l = null;
                String c2 = dVar != null ? dVar.mo14879c() : null;
                C5305k kVar = C5305k.GAMES_BY_DEVELOPER;
                C5293d dVar2 = this.f14462g;
                if (dVar2 != null) {
                    l = Long.valueOf(dVar2.mo14878b());
                }
                a.mo15138a(C5558c.m21386a(cVar, context, c, c2, kVar, l, Long.valueOf(this.f14463h.mo14916g()), null, 64, null), "game_detail__by_developer_click");
            }
        }
    }

    public InfoItemsBlock() {
        this(null, null, 0, 7, null);
    }

    public InfoItemsBlock(Context context) {
        this(context, null, 0, 6, null);
    }

    public InfoItemsBlock(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public InfoItemsBlock(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C4997p a = C4997p.m20008a(LayoutInflater.from(context), this);
        C5942k.m22324a((Object) a, "BlockInfoItemsBinding.in…ater.from(context), this)");
        this.f14453f = a;
        setOrientation(1);
    }

    public /* synthetic */ InfoItemsBlock(Context context, AttributeSet attributeSet, int i, int i2, C5938g gVar) {
        if ((i2 & 1) != 0) {
            context = null;
        }
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void setActionListener(C5536a aVar) {
        C5942k.m22327b(aVar, "listener");
        this.f14454g = aVar;
    }

    public final void setUpInfoItems(C5298g gVar) {
        C5942k.m22327b(gVar, "game");
        InfoItemView infoItemView = this.f14453f.f13143d;
        C5942k.m22324a((Object) infoItemView, "binding.infoItemParentGame");
        boolean z = true;
        int i = 0;
        infoItemView.setVisibility(gVar.mo14926p() && gVar.mo14919i() != null ? 0 : 8);
        this.f14453f.f13143d.setOnClickListener(new C5537b(this, gVar));
        InfoItemView infoItemView2 = this.f14453f.f13145f;
        C5942k.m22324a((Object) infoItemView2, "binding.infoItemSeries");
        infoItemView2.setVisibility(gVar.mo14928r() ? 0 : 8);
        this.f14453f.f13145f.setOnClickListener(new C5538c(this, gVar));
        InfoItemView infoItemView3 = this.f14453f.f13141b;
        C5942k.m22324a((Object) infoItemView3, "binding.infoItemAddons");
        infoItemView3.setVisibility(gVar.mo14927q() ? 0 : 8);
        this.f14453f.f13141b.setOnClickListener(new C5539d(this, gVar));
        C5293d c = gVar.mo14911c();
        InfoItemView infoItemView4 = this.f14453f.f13142c;
        C5942k.m22324a((Object) infoItemView4, "binding.infoItemDeveloper");
        infoItemView4.setVisibility(c != null ? 0 : 8);
        String str = null;
        this.f14453f.f13142c.setTitle(c != null ? c.mo14879c() : null);
        this.f14453f.f13142c.setOnClickListener(new C5540e(this, c, gVar));
        C5293d k = gVar.mo14921k();
        InfoItemView infoItemView5 = this.f14453f.f13144e;
        C5942k.m22324a((Object) infoItemView5, "binding.infoItemPublisher");
        if (k == null) {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        infoItemView5.setVisibility(i);
        InfoItemView infoItemView6 = this.f14453f.f13144e;
        if (k != null) {
            str = k.mo14879c();
        }
        infoItemView6.setTitle(str);
    }
}
