package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.l0 */
public final class C4990l0 implements C3657a {

    /* renamed from: a */
    private final View f13114a;

    /* renamed from: b */
    public final AppCompatImageButton f13115b;

    /* renamed from: c */
    public final RecyclerView f13116c;

    /* renamed from: d */
    public final AppCompatTextView f13117d;

    private C4990l0(View view, AppCompatImageButton appCompatImageButton, RecyclerView recyclerView, AppCompatTextView appCompatTextView) {
        this.f13114a = view;
        this.f13115b = appCompatImageButton;
        this.f13116c = recyclerView;
        this.f13117d = appCompatTextView;
    }

    /* renamed from: a */
    public static C4990l0 m19985a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.view_horizontal_list, viewGroup);
            return m19986a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: a */
    public static C4990l0 m19986a(View view) {
        String str;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) view.findViewById(R.id.btn_see_all);
        if (appCompatImageButton != null) {
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
            if (recyclerView != null) {
                AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_title);
                if (appCompatTextView != null) {
                    return new C4990l0(view, appCompatImageButton, recyclerView, appCompatTextView);
                }
                str = "textTitle";
            } else {
                str = "recyclerView";
            }
        } else {
            str = "btnSeeAll";
        }
        throw new NullPointerException("Missing required view with ID: ".concat(str));
    }

    /* renamed from: b */
    public View mo11568b() {
        return this.f13114a;
    }
}
