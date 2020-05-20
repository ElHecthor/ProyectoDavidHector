package p255io.stashteam.stashapp.p298ui.profile.user;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.app.C0061a;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0445l;
import androidx.fragment.app.C0466s;
import androidx.fragment.app.Fragment;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p097h.p098e.C3236a;
import p071f.p097h.p100f.C3253a;
import p071f.p097h.p100f.C3254b;
import p255io.stashteam.stashapp.p262c.C4991m;
import p255io.stashteam.stashapp.p281f.p282a.C5324a;
import p255io.stashteam.stashapp.p281f.p292d.C5418b;
import p255io.stashteam.stashapp.utils.p304f.C5693a;
import p308k.C5797g;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.profile.user.UserProfileActivity */
public final class UserProfileActivity extends C5324a<C4991m> {

    /* renamed from: z */
    public static final C5638a f14659z = new C5638a(null);

    /* renamed from: x */
    private final C5797g f14660x = C5693a.m21776a((Activity) this, "extra_user_id");

    /* renamed from: y */
    private final C5797g f14661y = C5693a.m21776a((Activity) this, "extra_user_is_closed");

    /* renamed from: io.stashteam.stashapp.ui.profile.user.UserProfileActivity$a */
    public static final class C5638a {
        private C5638a() {
        }

        public /* synthetic */ C5638a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final Intent mo15262a(Context context, long j, boolean z) {
            C5942k.m22327b(context, "context");
            Intent putExtra = new Intent(context, UserProfileActivity.class).putExtra("extra_user_id", j).putExtra("extra_user_is_closed", z);
            C5942k.m22324a((Object) putExtra, "Intent(context, UserProf…USER_IS_CLOSED, isClosed)");
            return putExtra;
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.profile.user.UserProfileActivity$b */
    static final class C5639b implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ UserProfileActivity f14662f;

        C5639b(UserProfileActivity userProfileActivity) {
            this.f14662f = userProfileActivity;
        }

        public final void onClick(View view) {
            this.f14662f.onBackPressed();
        }
    }

    /* renamed from: w */
    private final long m21543w() {
        return ((Number) this.f14660x.getValue()).longValue();
    }

    /* renamed from: x */
    private final boolean m21544x() {
        return ((Boolean) this.f14661y.getValue()).booleanValue();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Toolbar toolbar = ((C4991m) mo15023u()).f13119b.f13064b;
        C5942k.m22324a((Object) toolbar, "binding.appbar.toolbar");
        mo228a(toolbar);
        C0061a r = mo259r();
        if (r != null) {
            r.mo192d(true);
        }
        Drawable c = C3236a.m13271c(this, R.drawable.ic_back_circle);
        if (c != null) {
            c.setColorFilter(C3253a.m13340a(C3236a.m13263a((Context) this, (int) R.color.color_primary_text), C3254b.SRC_ATOP));
        }
        C0061a r2 = mo259r();
        if (r2 != null) {
            r2.mo186a(c);
        }
        toolbar.setNavigationOnClickListener(new C5639b(this));
        C0445l l = mo2666l();
        C5942k.m22324a((Object) l, "supportFragmentManager");
        C0466s b = l.mo2778b();
        C5942k.m22324a((Object) b, "beginTransaction()");
        b.mo2911a((int) R.id.container, (Fragment) C5418b.f14179h0.mo15097a(Long.valueOf(m21543w()), m21544x()));
        b.mo2635c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C4991m m21546v() {
        C4991m a = C4991m.m19988a(getLayoutInflater());
        C5942k.m22324a((Object) a, "ActivityUserProfileBinding.inflate(layoutInflater)");
        return a;
    }
}
