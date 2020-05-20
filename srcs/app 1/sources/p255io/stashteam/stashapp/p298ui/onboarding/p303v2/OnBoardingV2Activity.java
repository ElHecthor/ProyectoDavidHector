package p255io.stashteam.stashapp.p298ui.onboarding.p303v2;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p097h.p098e.C3236a;
import p255io.stashteam.stashapp.p256b.p257a.C4938c;
import p255io.stashteam.stashapp.p262c.C4979g;
import p255io.stashteam.stashapp.p281f.p282a.C5324a;
import p255io.stashteam.stashapp.p298ui.auth.signin.SignInActivity;
import p255io.stashteam.stashapp.p298ui.auth.signin.SignInActivity.C5457g;
import p308k.C5797g;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p352o.p353a.p364c.p372k.C6560a;

/* renamed from: io.stashteam.stashapp.ui.onboarding.v2.OnBoardingV2Activity */
public final class OnBoardingV2Activity extends C5324a<C4979g> {

    /* renamed from: y */
    public static final C5635b f14652y = new C5635b(null);

    /* renamed from: x */
    private final C5797g f14653x = C5799i.m22044a(new C5634a(this, null, null));

    /* renamed from: io.stashteam.stashapp.ui.onboarding.v2.OnBoardingV2Activity$a */
    public static final class C5634a extends C5943l implements C5907a<C4938c> {

        /* renamed from: g */
        final /* synthetic */ ComponentCallbacks f14654g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14655h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14656i;

        public C5634a(ComponentCallbacks componentCallbacks, C6560a aVar, C5907a aVar2) {
            this.f14654g = componentCallbacks;
            this.f14655h = aVar;
            this.f14656i = aVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, io.stashteam.stashapp.b.a.c] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [java.lang.Object, io.stashteam.stashapp.b.a.c]
          assigns: [java.lang.Object]
          uses: [io.stashteam.stashapp.b.a.c]
          mth insns count: 9
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p255io.stashteam.stashapp.p256b.p257a.C4938c invoke() {
            /*
                r4 = this;
                android.content.ComponentCallbacks r0 = r4.f14654g
                o.a.c.k.a r1 = r4.f14655h
                k.z.c.a r2 = r4.f14656i
                o.a.c.a r0 = p352o.p353a.p354a.p356b.p357a.C6511a.m24704a(r0)
                o.a.c.m.a r0 = r0.mo16935b()
                java.lang.Class<io.stashteam.stashapp.b.a.c> r3 = p255io.stashteam.stashapp.p256b.p257a.C4938c.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                java.lang.Object r0 = r0.mo17011a(r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.onboarding.p303v2.OnBoardingV2Activity.C5634a.invoke():java.lang.Object");
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.onboarding.v2.OnBoardingV2Activity$b */
    public static final class C5635b {
        private C5635b() {
        }

        public /* synthetic */ C5635b(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final Intent mo15259a(Context context) {
            C5942k.m22327b(context, "context");
            return new Intent(context, OnBoardingV2Activity.class);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.onboarding.v2.OnBoardingV2Activity$c */
    static final class C5636c implements OnPreparedListener {

        /* renamed from: a */
        public static final C5636c f14657a = new C5636c();

        C5636c() {
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            C5942k.m22324a((Object) mediaPlayer, "it");
            mediaPlayer.setLooping(true);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.onboarding.v2.OnBoardingV2Activity$d */
    static final class C5637d implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ OnBoardingV2Activity f14658f;

        C5637d(OnBoardingV2Activity onBoardingV2Activity) {
            this.f14658f = onBoardingV2Activity;
        }

        public final void onClick(View view) {
            C4938c.m19734a(this.f14658f.m21536w(), "onboarding__done_click", null, 2, null);
            this.f14658f.m21538y();
        }
    }

    /* renamed from: a */
    private final Uri m21533a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("android.resource://");
        sb.append(getPackageName());
        sb.append("/raw/");
        sb.append(str);
        return Uri.parse(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final C4938c m21536w() {
        return (C4938c) this.f14653x.getValue();
    }

    /* renamed from: x */
    private final void m21537x() {
        Uri a = m21533a("video_onboarding_hevc");
        if (VERSION.SDK_INT >= 26) {
            ((C4979g) mo15023u()).f13054c.setAudioFocusRequest(0);
        }
        ((C4979g) mo15023u()).f13054c.setVideoURI(a);
        ((C4979g) mo15023u()).f13054c.setOnPreparedListener(C5636c.f14657a);
        ((C4979g) mo15023u()).f13054c.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m21538y() {
        startActivity(C5457g.m21134a(SignInActivity.f14251G, this, false, 2, null));
        finish();
    }

    /* renamed from: z */
    private final void m21539z() {
        ((C4979g) mo15023u()).f13054c.stopPlayback();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Window window = getWindow();
        String str = "window";
        C5942k.m22324a((Object) window, str);
        window.setNavigationBarColor(C3236a.m13263a((Context) this, (int) R.color.color_primary));
        Window window2 = getWindow();
        C5942k.m22324a((Object) window2, str);
        window2.setStatusBarColor(C3236a.m13263a((Context) this, (int) R.color.yellow_light));
        super.onCreate(bundle);
        ((C4979g) mo15023u()).f13053b.setOnClickListener(new C5637d(this));
        C4938c.m19734a(m21536w(), "onboarding__screen_view", null, 2, null);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (VERSION.SDK_INT < 24) {
            ((C4979g) mo15023u()).f13054c.pause();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        m21537x();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        m21539z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C4979g m21541v() {
        C4979g a = C4979g.m19938a(getLayoutInflater());
        C5942k.m22324a((Object) a, "ActivityOnboardingV2Bind…g.inflate(layoutInflater)");
        return a;
    }
}
