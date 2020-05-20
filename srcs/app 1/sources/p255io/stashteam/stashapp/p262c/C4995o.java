package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.o */
public final class C4995o implements C3657a {

    /* renamed from: a */
    private final View f13132a;

    /* renamed from: b */
    public final ChipGroup f13133b;

    private C4995o(View view, ChipGroup chipGroup) {
        this.f13132a = view;
        this.f13133b = chipGroup;
    }

    /* renamed from: a */
    public static C4995o m20002a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.block_genres, viewGroup);
            return m20003a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: a */
    public static C4995o m20003a(View view) {
        ChipGroup chipGroup = (ChipGroup) view.findViewById(R.id.chip_group_genres);
        if (chipGroup != null) {
            return new C4995o(view, chipGroup);
        }
        throw new NullPointerException("Missing required view with ID: ".concat("chipGroupGenres"));
    }

    /* renamed from: b */
    public View mo11568b() {
        return this.f13132a;
    }
}
