package p255io.stashteam.stashapp.p298ui.settings;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.app.C0061a;
import androidx.appcompat.app.C0069e;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.C0523n;
import androidx.lifecycle.C0533u;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textfield.TextInputEditText;
import io.stashteam.games.tracker.stashapp.R;
import java.util.ArrayList;
import java.util.Map;
import p071f.p097h.p098e.C3236a;
import p071f.p097h.p100f.C3253a;
import p071f.p097h.p100f.C3254b;
import p147g.p156d.p157a.p185c.p196s.C4447b;
import p255io.stashteam.stashapp.p256b.p257a.C4938c;
import p255io.stashteam.stashapp.p262c.C4985j;
import p255io.stashteam.stashapp.p269e.p280c.C5284a;
import p255io.stashteam.stashapp.p269e.p280c.C5294d0;
import p255io.stashteam.stashapp.p281f.p282a.C5324a;
import p255io.stashteam.stashapp.p281f.p295f.p296a.C5445a;
import p255io.stashteam.stashapp.p281f.p295f.p296a.C5447b;
import p255io.stashteam.stashapp.p298ui.auth.signin.SignInActivity;
import p255io.stashteam.stashapp.p298ui.widgets.itemviews.SettingItemView;
import p255io.stashteam.stashapp.utils.p304f.C5699e;
import p255io.stashteam.stashapp.utils.p304f.C5708k;
import p308k.C5797g;
import p308k.C5808p;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p352o.p353a.p364c.p372k.C6560a;

/* renamed from: io.stashteam.stashapp.ui.settings.SettingsActivity */
public final class SettingsActivity extends C5324a<C4985j> implements OnClickListener {

    /* renamed from: A */
    public static final C5661c f14701A = new C5661c(null);

    /* renamed from: x */
    private final C5797g f14702x = C5799i.m22044a(new C5660b(this, null, null));

    /* renamed from: y */
    private final C5797g f14703y = C5799i.m22044a(new C5659a(this, null, null));

    /* renamed from: z */
    private final C5797g f14704z = C5799i.m22044a(C5662d.f14711g);

    /* renamed from: io.stashteam.stashapp.ui.settings.SettingsActivity$a */
    public static final class C5659a extends C5943l implements C5907a<C4938c> {

        /* renamed from: g */
        final /* synthetic */ ComponentCallbacks f14705g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14706h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14707i;

        public C5659a(ComponentCallbacks componentCallbacks, C6560a aVar, C5907a aVar2) {
            this.f14705g = componentCallbacks;
            this.f14706h = aVar;
            this.f14707i = aVar2;
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
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p255io.stashteam.stashapp.p256b.p257a.C4938c invoke() {
            /*
                r4 = this;
                android.content.ComponentCallbacks r0 = r4.f14705g
                o.a.c.k.a r1 = r4.f14706h
                k.z.c.a r2 = r4.f14707i
                o.a.c.a r0 = p352o.p353a.p354a.p356b.p357a.C6511a.m24704a(r0)
                o.a.c.m.a r0 = r0.mo16935b()
                java.lang.Class<io.stashteam.stashapp.b.a.c> r3 = p255io.stashteam.stashapp.p256b.p257a.C4938c.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                java.lang.Object r0 = r0.mo17011a(r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.settings.SettingsActivity.C5659a.invoke():java.lang.Object");
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.settings.SettingsActivity$b */
    public static final class C5660b extends C5943l implements C5907a<C5668a> {

        /* renamed from: g */
        final /* synthetic */ C0523n f14708g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14709h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14710i;

        public C5660b(C0523n nVar, C6560a aVar, C5907a aVar2) {
            this.f14708g = nVar;
            this.f14709h = aVar;
            this.f14710i = aVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [io.stashteam.stashapp.ui.settings.a, androidx.lifecycle.a0] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1, types: [io.stashteam.stashapp.ui.settings.a, androidx.lifecycle.a0]
          assigns: [androidx.lifecycle.a0]
          uses: [io.stashteam.stashapp.ui.settings.a]
          mth insns count: 7
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
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p255io.stashteam.stashapp.p298ui.settings.C5668a invoke() {
            /*
                r4 = this;
                androidx.lifecycle.n r0 = r4.f14708g
                o.a.c.k.a r1 = r4.f14709h
                k.z.c.a r2 = r4.f14710i
                java.lang.Class<io.stashteam.stashapp.ui.settings.a> r3 = p255io.stashteam.stashapp.p298ui.settings.C5668a.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                androidx.lifecycle.a0 r0 = p352o.p353a.p359b.p360a.p362d.p363a.C6521a.m24722a(r0, r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.settings.SettingsActivity.C5660b.invoke():androidx.lifecycle.a0");
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.settings.SettingsActivity$c */
    public static final class C5661c {
        private C5661c() {
        }

        public /* synthetic */ C5661c(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final Intent mo15274a(Context context) {
            C5942k.m22327b(context, "context");
            return new Intent(context, SettingsActivity.class);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.settings.SettingsActivity$d */
    static final class C5662d extends C5943l implements C5907a<C5445a> {

        /* renamed from: g */
        public static final C5662d f14711g = new C5662d();

        C5662d() {
            super(0);
        }

        public final C5445a invoke() {
            return new C5445a();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.settings.SettingsActivity$e */
    static final class C5663e implements DialogInterface.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ SettingsActivity f14712f;

        C5663e(SettingsActivity settingsActivity) {
            this.f14712f = settingsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C4938c.m19734a(this.f14712f.m21594x(), "settings__log_out", null, 2, null);
            this.f14712f.m21595y().mo15284h();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.settings.SettingsActivity$f */
    static final class C5664f implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ SettingsActivity f14713f;

        C5664f(SettingsActivity settingsActivity) {
            this.f14713f = settingsActivity;
        }

        public final void onClick(View view) {
            this.f14713f.onBackPressed();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.settings.SettingsActivity$g */
    static final class C5665g<T> implements C0533u<C5294d0> {

        /* renamed from: a */
        final /* synthetic */ SettingsActivity f14714a;

        C5665g(SettingsActivity settingsActivity) {
            this.f14714a = settingsActivity;
        }

        /* renamed from: a */
        public final void mo3048a(C5294d0 d0Var) {
            if (d0Var == null) {
                SettingsActivity settingsActivity = this.f14714a;
                settingsActivity.startActivity(SignInActivity.f14251G.mo15116a(settingsActivity));
                return;
            }
            this.f14714a.m21591b(d0Var);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.settings.SettingsActivity$h */
    static final class C5666h<T> implements C0533u<C5284a> {

        /* renamed from: a */
        final /* synthetic */ SettingsActivity f14715a;

        C5666h(SettingsActivity settingsActivity) {
            this.f14715a = settingsActivity;
        }

        /* renamed from: a */
        public final void mo3048a(C5284a aVar) {
            SettingsActivity.m21590b(this.f14715a).f13088m.setValueText(this.f14715a.getString(aVar.mo14857g()));
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.settings.SettingsActivity$i */
    static final class C5667i implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C5284a f14716f;

        /* renamed from: g */
        final /* synthetic */ SettingsActivity f14717g;

        C5667i(C5284a aVar, SettingsActivity settingsActivity) {
            this.f14716f = aVar;
            this.f14717g = settingsActivity;
        }

        public final void run() {
            this.f14717g.m21595y().mo15280a(this.f14716f);
            C0069e.m271e(this.f14716f.mo14858h());
            Map a = C5821b0.m22070a(C5808p.m22056a("app_theme", this.f14716f.mo14856f()));
            this.f14717g.m21594x().mo14080a(a);
            this.f14717g.m21594x().mo14079a("settings__theme_apply", a);
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ C4985j m21590b(SettingsActivity settingsActivity) {
        return (C4985j) settingsActivity.mo15023u();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m21591b(C5294d0 d0Var) {
        AppCompatImageView appCompatImageView = ((C4985j) mo15023u()).f13081f;
        C5942k.m22324a((Object) appCompatImageView, "binding.imageAvatar");
        C5708k.m21801a(appCompatImageView, d0Var.mo14886d());
        ((C4985j) mo15023u()).f13079d.setText(d0Var.mo14884b());
        ((C4985j) mo15023u()).f13080e.setText(d0Var.mo14887e());
        SwitchMaterial switchMaterial = ((C4985j) mo15023u()).f13090o;
        C5942k.m22324a((Object) switchMaterial, "binding.switchHideProfile");
        switchMaterial.setChecked(d0Var.mo14891h());
    }

    /* renamed from: w */
    private final C5445a m21593w() {
        return (C5445a) this.f14704z.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public final C4938c m21594x() {
        return (C4938c) this.f14703y.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final C5668a m21595y() {
        return (C5668a) this.f14702x.getValue();
    }

    /* renamed from: z */
    private final void m21596z() {
        if (!m21593w().mo2481U()) {
            C5284a[] values = C5284a.values();
            ArrayList arrayList = new ArrayList(values.length);
            for (C5284a aVar : values) {
                C5447b bVar = new C5447b(Integer.valueOf(aVar.mo14857g()), null, new C5667i(aVar, this), 2, null);
                arrayList.add(bVar);
            }
            m21593w().mo15107a(arrayList);
            m21593w().mo2649a(mo2666l(), m21593w().mo2467G());
        }
    }

    public void onBackPressed() {
        mo2669o();
    }

    public void onClick(View view) {
        String str;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.item_theme) {
            C4938c.m19734a(m21594x(), "settings__theme_click", null, 2, null);
            m21596z();
        } else if (valueOf != null && valueOf.intValue() == R.id.item_rate_us) {
            C4938c.m19734a(m21594x(), "settings__rate_click", null, 2, null);
            C5699e.m21791d(this);
        } else if (valueOf != null && valueOf.intValue() == R.id.item_send_feedback) {
            C4938c.m19734a(m21594x(), "settings__send_feedback_click", null, 2, null);
            C5699e.m21789b(this);
        } else if (valueOf != null && valueOf.intValue() == R.id.item_contact_us) {
            C4938c.m19734a(m21594x(), "settings__contact_click", null, 2, null);
            C5294d0 d0Var = (C5294d0) m21595y().mo15283g().mo2974a();
            C5699e.m21785a((Context) this, d0Var != null ? d0Var.mo14885c() : 0);
        } else {
            if (valueOf != null && valueOf.intValue() == R.id.item_facebook) {
                C4938c.m19734a(m21594x(), "settings__facebook_click", null, 2, null);
                str = "https://www.facebook.com/StashApp-122231719167474/";
            } else if (valueOf != null && valueOf.intValue() == R.id.item_twitter) {
                C4938c.m19734a(m21594x(), "settings__twitter_click", null, 2, null);
                str = "https://twitter.com/StashTrackGames";
            } else if (valueOf != null && valueOf.intValue() == R.id.item_terms) {
                C4938c.m19734a(m21594x(), "settings__terms_click", null, 2, null);
                C5699e.m21792e(this);
                return;
            } else if (valueOf != null && valueOf.intValue() == R.id.item_policy) {
                C4938c.m19734a(m21594x(), "settings__policy_click", null, 2, null);
                C5699e.m21790c(this);
                return;
            } else if (valueOf != null && valueOf.intValue() == R.id.btn_logout) {
                new C4447b(this).mo222b((int) R.string.settings_sign_out).mo212a((int) R.string.settings_sign_out_confirm_text).mo213a((int) R.string.action_cancel, (DialogInterface.OnClickListener) null).mo223b(R.string.action_sign_out, new C5663e(this)).mo225c();
                return;
            } else {
                return;
            }
            C5699e.m21786a((Context) this, str);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Toolbar toolbar = ((C4985j) mo15023u()).f13077b.f13064b;
        C5942k.m22324a((Object) toolbar, "binding.appbar.toolbar");
        toolbar.setTitle((CharSequence) getString(R.string.settings_title));
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
        toolbar.setNavigationOnClickListener(new C5664f(this));
        C4985j jVar = (C4985j) mo15023u();
        SettingItemView settingItemView = jVar.f13088m;
        C5942k.m22324a((Object) settingItemView, "itemTheme");
        SettingItemView settingItemView2 = jVar.f13085j;
        C5942k.m22324a((Object) settingItemView2, "itemRateUs");
        SettingItemView settingItemView3 = jVar.f13086k;
        C5942k.m22324a((Object) settingItemView3, "itemSendFeedback");
        SettingItemView settingItemView4 = jVar.f13082g;
        C5942k.m22324a((Object) settingItemView4, "itemContactUs");
        SettingItemView settingItemView5 = jVar.f13083h;
        C5942k.m22324a((Object) settingItemView5, "itemFacebook");
        SettingItemView settingItemView6 = jVar.f13089n;
        C5942k.m22324a((Object) settingItemView6, "itemTwitter");
        SettingItemView settingItemView7 = jVar.f13087l;
        C5942k.m22324a((Object) settingItemView7, "itemTerms");
        SettingItemView settingItemView8 = jVar.f13084i;
        C5942k.m22324a((Object) settingItemView8, "itemPolicy");
        MaterialButton materialButton = jVar.f13078c;
        C5942k.m22324a((Object) materialButton, "btnLogout");
        for (View onClickListener : C5837l.m22162b((Object[]) new View[]{settingItemView, settingItemView2, settingItemView3, settingItemView4, settingItemView5, settingItemView6, settingItemView7, settingItemView8, materialButton})) {
            onClickListener.setOnClickListener(this);
        }
        m21595y().mo15283g().mo2976a(this, new C5665g(this));
        m21595y().mo15282f().mo2976a(this, new C5666h(this));
        C4938c.m19734a(m21594x(), "settings__screen_view", null, 2, null);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C5668a y = m21595y();
        TextInputEditText textInputEditText = ((C4985j) mo15023u()).f13079d;
        C5942k.m22324a((Object) textInputEditText, "binding.fieldName");
        String valueOf = String.valueOf(textInputEditText.getText());
        TextInputEditText textInputEditText2 = ((C4985j) mo15023u()).f13080e;
        C5942k.m22324a((Object) textInputEditText2, "binding.fieldNickname");
        String valueOf2 = String.valueOf(textInputEditText2.getText());
        SwitchMaterial switchMaterial = ((C4985j) mo15023u()).f13090o;
        C5942k.m22324a((Object) switchMaterial, "binding.switchHideProfile");
        y.mo15281a(valueOf, valueOf2, switchMaterial.isChecked());
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C4985j m21598v() {
        C4985j a = C4985j.m19964a(getLayoutInflater());
        C5942k.m22324a((Object) a, "ActivitySettingsBinding.inflate(layoutInflater)");
        return a;
    }
}
