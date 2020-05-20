package com.google.android.youtube.player;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.youtube.player.C2813d.C2814a;

/* renamed from: com.google.android.youtube.player.b */
public class C2810b extends Activity {

    /* renamed from: f */
    private C2811a f8251f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public YouTubePlayerView f8252g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f8253h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Bundle f8254i;

    /* renamed from: com.google.android.youtube.player.b$a */
    private final class C2811a implements C2808d {
        private C2811a() {
        }

        /* synthetic */ C2811a(C2810b bVar, byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo9426a(YouTubePlayerView youTubePlayerView) {
            if (!(C2810b.this.f8252g == null || C2810b.this.f8252g == youTubePlayerView)) {
                C2810b.this.f8252g.mo9406b(true);
            }
            C2810b.this.f8252g = youTubePlayerView;
            if (C2810b.this.f8253h > 0) {
                youTubePlayerView.mo9394a();
            }
            if (C2810b.this.f8253h >= 2) {
                youTubePlayerView.mo9405b();
            }
        }

        /* renamed from: a */
        public final void mo9427a(YouTubePlayerView youTubePlayerView, String str, C2814a aVar) {
            C2810b bVar = C2810b.this;
            youTubePlayerView.mo9395a(bVar, youTubePlayerView, str, aVar, bVar.f8254i);
            C2810b.this.f8254i = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C2808d mo9428a() {
        return this.f8251f;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8251f = new C2811a(this, 0);
        this.f8254i = bundle != null ? bundle.getBundle("YouTubeBaseActivity.KEY_PLAYER_VIEW_STATE") : null;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        YouTubePlayerView youTubePlayerView = this.f8252g;
        if (youTubePlayerView != null) {
            youTubePlayerView.mo9397a(isFinishing());
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        this.f8253h = 1;
        YouTubePlayerView youTubePlayerView = this.f8252g;
        if (youTubePlayerView != null) {
            youTubePlayerView.mo9407c();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f8253h = 2;
        YouTubePlayerView youTubePlayerView = this.f8252g;
        if (youTubePlayerView != null) {
            youTubePlayerView.mo9405b();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        YouTubePlayerView youTubePlayerView = this.f8252g;
        bundle.putBundle("YouTubeBaseActivity.KEY_PLAYER_VIEW_STATE", youTubePlayerView != null ? youTubePlayerView.mo9411e() : this.f8254i);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f8253h = 1;
        YouTubePlayerView youTubePlayerView = this.f8252g;
        if (youTubePlayerView != null) {
            youTubePlayerView.mo9394a();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        this.f8253h = 0;
        YouTubePlayerView youTubePlayerView = this.f8252g;
        if (youTubePlayerView != null) {
            youTubePlayerView.mo9409d();
        }
        super.onStop();
    }
}
