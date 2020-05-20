package p255io.stashteam.stashapp.p262c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.player.YouTubePlayerView;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p143x.C3657a;

/* renamed from: io.stashteam.stashapp.c.h */
public final class C4981h implements C3657a {

    /* renamed from: a */
    private final YouTubePlayerView f13061a;

    /* renamed from: b */
    public final YouTubePlayerView f13062b;

    private C4981h(YouTubePlayerView youTubePlayerView, YouTubePlayerView youTubePlayerView2) {
        this.f13061a = youTubePlayerView;
        this.f13062b = youTubePlayerView2;
    }

    /* renamed from: a */
    public static C4981h m19947a(LayoutInflater layoutInflater) {
        return m19948a(layoutInflater, null, false);
    }

    /* renamed from: a */
    public static C4981h m19948a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_player, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m19949a(inflate);
    }

    /* renamed from: a */
    public static C4981h m19949a(View view) {
        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) view.findViewById(R.id.player_view);
        if (youTubePlayerView != null) {
            return new C4981h((YouTubePlayerView) view, youTubePlayerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat("playerView"));
    }

    /* renamed from: b */
    public YouTubePlayerView m19951b() {
        return this.f13061a;
    }
}
