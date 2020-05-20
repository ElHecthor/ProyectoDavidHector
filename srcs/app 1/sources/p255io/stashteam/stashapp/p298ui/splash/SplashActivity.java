package p255io.stashteam.stashapp.p298ui.splash;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import p255io.stashteam.stashapp.p262c.C4989l;
import p255io.stashteam.stashapp.p281f.p282a.C5327d;
import p255io.stashteam.stashapp.p298ui.main.MainActivity;
import p255io.stashteam.stashapp.p298ui.onboarding.p302v1.OnBoardingActivity;
import p255io.stashteam.stashapp.p298ui.onboarding.p303v2.OnBoardingV2Activity;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.splash.SplashActivity */
public final class SplashActivity extends C5327d<C4989l> {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = (mo15028w() || mo15029x()) ? MainActivity.f14623B.mo15248a(this) : VERSION.SDK_INT > 21 ? OnBoardingV2Activity.f14652y.mo15259a(this) : OnBoardingActivity.f14636z.mo15251a(this);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C4989l m21619v() {
        C4989l a = C4989l.m19980a(getLayoutInflater());
        C5942k.m22324a((Object) a, "ActivitySplashBinding.inflate(layoutInflater)");
        return a;
    }
}
