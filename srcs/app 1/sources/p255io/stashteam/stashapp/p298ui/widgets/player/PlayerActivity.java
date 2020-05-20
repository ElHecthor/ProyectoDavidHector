package p255io.stashteam.stashapp.p298ui.widgets.player;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.youtube.player.C2810b;
import com.google.android.youtube.player.C2812c;
import com.google.android.youtube.player.C2813d;
import com.google.android.youtube.player.C2813d.C2814a;
import com.google.android.youtube.player.C2813d.C2815b;
import io.stashteam.games.tracker.stashapp.R;
import p255io.stashteam.stashapp.p262c.C4981h;
import p255io.stashteam.stashapp.utils.p304f.C5693a;
import p308k.C5797g;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.widgets.player.PlayerActivity */
public final class PlayerActivity extends C2810b implements C2814a {

    /* renamed from: k */
    public static final C5677a f14759k = new C5677a(null);

    /* renamed from: j */
    private final C5797g f14760j = C5693a.m21777a(this, "extra_video_id", null);

    /* renamed from: io.stashteam.stashapp.ui.widgets.player.PlayerActivity$a */
    public static final class C5677a {
        private C5677a() {
        }

        public /* synthetic */ C5677a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final Intent mo15316a(Context context, String str) {
            C5942k.m22327b(context, "context");
            C5942k.m22327b(str, "videoId");
            Intent putExtra = new Intent(context, PlayerActivity.class).putExtra("extra_video_id", str);
            C5942k.m22324a((Object) putExtra, "Intent(context, PlayerAc…(EXTRA_VIDEO_ID, videoId)");
            return putExtra;
        }
    }

    /* renamed from: b */
    private final String m21651b() {
        return (String) this.f14760j.getValue();
    }

    /* renamed from: a */
    public void mo9437a(C2815b bVar, C2812c cVar) {
        C5693a.m21778a((Activity) this, (int) R.string.error_common);
    }

    /* renamed from: a */
    public void mo9438a(C2815b bVar, C2813d dVar, boolean z) {
        String b = m21651b();
        if (b != null && dVar != null) {
            dVar.mo9436a(b);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        C4981h a = C4981h.m19947a(getLayoutInflater());
        C5942k.m22324a((Object) a, "ActivityPlayerBinding.inflate(layoutInflater)");
        setContentView(a.mo11568b());
        a.f13062b.mo9396a(getString(R.string.google_api_key), (C2814a) this);
    }
}
