package p255io.stashteam.stashapp.p298ui.onboarding.p302v1;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2.C0798i;
import com.google.android.material.button.MaterialButton;
import io.stashteam.games.tracker.stashapp.R;
import p255io.stashteam.stashapp.p256b.p257a.C4938c;
import p255io.stashteam.stashapp.p262c.C4977f;
import p255io.stashteam.stashapp.p281f.p282a.C5324a;
import p255io.stashteam.stashapp.p298ui.auth.signin.SignInActivity;
import p255io.stashteam.stashapp.p298ui.auth.signin.SignInActivity.C5457g;
import p308k.C5797g;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p352o.p353a.p364c.p372k.C6560a;

/* renamed from: io.stashteam.stashapp.ui.onboarding.v1.OnBoardingActivity */
public final class OnBoardingActivity extends C5324a<C4977f> {

    /* renamed from: z */
    public static final C5626b f14636z = new C5626b(null);

    /* renamed from: x */
    private final C5797g f14637x = C5799i.m22044a(new C5625a(this, null, null));

    /* renamed from: y */
    private final C5797g f14638y = C5799i.m22044a(C5627c.f14642g);

    /* renamed from: io.stashteam.stashapp.ui.onboarding.v1.OnBoardingActivity$a */
    public static final class C5625a extends C5943l implements C5907a<C4938c> {

        /* renamed from: g */
        final /* synthetic */ ComponentCallbacks f14639g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14640h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14641i;

        public C5625a(ComponentCallbacks componentCallbacks, C6560a aVar, C5907a aVar2) {
            this.f14639g = componentCallbacks;
            this.f14640h = aVar;
            this.f14641i = aVar2;
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
                android.content.ComponentCallbacks r0 = r4.f14639g
                o.a.c.k.a r1 = r4.f14640h
                k.z.c.a r2 = r4.f14641i
                o.a.c.a r0 = p352o.p353a.p354a.p356b.p357a.C6511a.m24704a(r0)
                o.a.c.m.a r0 = r0.mo16935b()
                java.lang.Class<io.stashteam.stashapp.b.a.c> r3 = p255io.stashteam.stashapp.p256b.p257a.C4938c.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                java.lang.Object r0 = r0.mo17011a(r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.onboarding.p302v1.OnBoardingActivity.C5625a.invoke():java.lang.Object");
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.onboarding.v1.OnBoardingActivity$b */
    public static final class C5626b {
        private C5626b() {
        }

        public /* synthetic */ C5626b(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final Intent mo15251a(Context context) {
            C5942k.m22327b(context, "context");
            return new Intent(context, OnBoardingActivity.class);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.onboarding.v1.OnBoardingActivity$c */
    static final class C5627c extends C5943l implements C5907a<C5631a> {

        /* renamed from: g */
        public static final C5627c f14642g = new C5627c();

        C5627c() {
            super(0);
        }

        public final C5631a invoke() {
            return new C5631a();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.onboarding.v1.OnBoardingActivity$d */
    public static final class C5628d extends C0798i {

        /* renamed from: a */
        final /* synthetic */ OnBoardingActivity f14643a;

        C5628d(OnBoardingActivity onBoardingActivity) {
            this.f14643a = onBoardingActivity;
        }

        /* renamed from: b */
        public void mo4338b(int i) {
            MaterialButton materialButton;
            int i2;
            super.mo4338b(i);
            ViewPager2 viewPager2 = OnBoardingActivity.m21515c(this.f14643a).f13049d;
            C5942k.m22324a((Object) viewPager2, "binding.viewPager");
            if (viewPager2.getCurrentItem() + 1 == this.f14643a.m21517w().mo3472b()) {
                OnBoardingActivity.m21515c(this.f14643a).f13047b.setText(R.string.action_done);
                materialButton = OnBoardingActivity.m21515c(this.f14643a).f13047b;
                i2 = R.drawable.ic_done_button;
            } else {
                OnBoardingActivity.m21515c(this.f14643a).f13047b.setText(R.string.action_next);
                materialButton = OnBoardingActivity.m21515c(this.f14643a).f13047b;
                i2 = R.drawable.ic_next_button_16dp;
            }
            materialButton.setIconResource(i2);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.onboarding.v1.OnBoardingActivity$e */
    static final class C5629e implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ OnBoardingActivity f14644f;

        C5629e(OnBoardingActivity onBoardingActivity) {
            this.f14644f = onBoardingActivity;
        }

        public final void onClick(View view) {
            ViewPager2 viewPager2 = OnBoardingActivity.m21515c(this.f14644f).f13049d;
            C5942k.m22324a((Object) viewPager2, "binding.viewPager");
            int currentItem = viewPager2.getCurrentItem();
            if (currentItem < this.f14644f.m21517w().mo3472b() - 1) {
                C4938c.m19734a(this.f14644f.m21518x(), "onboarding__next_click", null, 2, null);
                OnBoardingActivity.m21515c(this.f14644f).f13049d.mo4342a(currentItem + 1, true);
                return;
            }
            C4938c.m19734a(this.f14644f.m21518x(), "onboarding__done_click", null, 2, null);
            this.f14644f.m21519y();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.onboarding.v1.OnBoardingActivity$f */
    static final class C5630f implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ OnBoardingActivity f14645f;

        C5630f(OnBoardingActivity onBoardingActivity) {
            this.f14645f = onBoardingActivity;
        }

        public final void onClick(View view) {
            C4938c.m19734a(this.f14645f.m21518x(), "onboarding__skip_click", null, 2, null);
            this.f14645f.m21519y();
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ C4977f m21515c(OnBoardingActivity onBoardingActivity) {
        return (C4977f) onBoardingActivity.mo15023u();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final C5631a m21517w() {
        return (C5631a) this.f14638y.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public final C4938c m21518x() {
        return (C4938c) this.f14637x.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m21519y() {
        startActivity(C5457g.m21134a(SignInActivity.f14251G, this, false, 2, null));
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewPager2 viewPager2 = ((C4977f) mo15023u()).f13049d;
        C5942k.m22324a((Object) viewPager2, "binding.viewPager");
        viewPager2.setAdapter(m21517w());
        ((C4977f) mo15023u()).f13049d.mo4343a((C0798i) new C5628d(this));
        ((C4977f) mo15023u()).f13047b.setOnClickListener(new C5629e(this));
        ((C4977f) mo15023u()).f13048c.setOnClickListener(new C5630f(this));
        C4938c.m19734a(m21518x(), "onboarding__screen_view", null, 2, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C4977f m21521v() {
        C4977f a = C4977f.m19929a(getLayoutInflater());
        C5942k.m22324a((Object) a, "ActivityOnboardingV1Bind…g.inflate(layoutInflater)");
        return a;
    }
}
