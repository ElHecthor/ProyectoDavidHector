package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;
import p255io.stashteam.stashapp.p298ui.widgets.itemviews.InfoItemView;

/* renamed from: io.stashteam.stashapp.c.p */
public final class C4997p implements C3657a {

    /* renamed from: a */
    private final View f13140a;

    /* renamed from: b */
    public final InfoItemView f13141b;

    /* renamed from: c */
    public final InfoItemView f13142c;

    /* renamed from: d */
    public final InfoItemView f13143d;

    /* renamed from: e */
    public final InfoItemView f13144e;

    /* renamed from: f */
    public final InfoItemView f13145f;

    private C4997p(View view, InfoItemView infoItemView, InfoItemView infoItemView2, InfoItemView infoItemView3, InfoItemView infoItemView4, InfoItemView infoItemView5) {
        this.f13140a = view;
        this.f13141b = infoItemView;
        this.f13142c = infoItemView2;
        this.f13143d = infoItemView3;
        this.f13144e = infoItemView4;
        this.f13145f = infoItemView5;
    }

    /* renamed from: a */
    public static C4997p m20008a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.block_info_items, viewGroup);
            return m20009a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: a */
    public static C4997p m20009a(View view) {
        String str;
        InfoItemView infoItemView = (InfoItemView) view.findViewById(R.id.info_item_addons);
        if (infoItemView != null) {
            InfoItemView infoItemView2 = (InfoItemView) view.findViewById(R.id.info_item_developer);
            if (infoItemView2 != null) {
                InfoItemView infoItemView3 = (InfoItemView) view.findViewById(R.id.info_item_parent_game);
                if (infoItemView3 != null) {
                    InfoItemView infoItemView4 = (InfoItemView) view.findViewById(R.id.info_item_publisher);
                    if (infoItemView4 != null) {
                        InfoItemView infoItemView5 = (InfoItemView) view.findViewById(R.id.info_item_series);
                        if (infoItemView5 != null) {
                            C4997p pVar = new C4997p(view, infoItemView, infoItemView2, infoItemView3, infoItemView4, infoItemView5);
                            return pVar;
                        }
                        str = "infoItemSeries";
                    } else {
                        str = "infoItemPublisher";
                    }
                } else {
                    str = "infoItemParentGame";
                }
            } else {
                str = "infoItemDeveloper";
            }
        } else {
            str = "infoItemAddons";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public View mo11568b() {
        return this.f13140a;
    }
}
