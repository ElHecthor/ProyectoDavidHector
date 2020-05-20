package p255io.stashteam.stashapp.p298ui.auth.signin;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.C0523n;
import androidx.lifecycle.C0533u;
import com.facebook.C1499a;
import com.facebook.C1522e;
import com.facebook.C1627g;
import com.facebook.C1631i;
import com.facebook.login.C1772m;
import com.facebook.login.C1779o;
import com.google.android.gms.auth.api.signin.C1942a;
import com.google.android.gms.auth.api.signin.C1943b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C1995b;
import io.stashteam.games.tracker.stashapp.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.koin.androidx.scope.C6574a;
import p255io.stashteam.stashapp.p256b.p257a.C4938c;
import p255io.stashteam.stashapp.p256b.p258b.p259a.C4940a;
import p255io.stashteam.stashapp.p262c.C4987k;
import p255io.stashteam.stashapp.p269e.p280c.C5287b;
import p255io.stashteam.stashapp.p269e.p280c.C5294d0;
import p255io.stashteam.stashapp.p281f.p282a.C5324a;
import p255io.stashteam.stashapp.p298ui.main.MainActivity;
import p255io.stashteam.stashapp.utils.p304f.C5693a;
import p255io.stashteam.stashapp.utils.p304f.C5699e;
import p255io.stashteam.stashapp.utils.p304f.C5710m;
import p308k.C5797g;
import p308k.C5808p;
import p308k.C5812t;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p352o.p353a.p364c.p371j.C6557a;
import p352o.p353a.p364c.p371j.C6559b;
import p352o.p353a.p364c.p372k.C6560a;
import p352o.p353a.p364c.p374m.C6565a;

/* renamed from: io.stashteam.stashapp.ui.auth.signin.SignInActivity */
public final class SignInActivity extends C5324a<C4987k> implements OnClickListener {

    /* renamed from: F */
    private static final List<String> f14250F = C5837l.m22162b((Object[]) new String[]{"public_profile", "email"});

    /* renamed from: G */
    public static final C5457g f14251G = new C5457g(null);

    /* renamed from: A */
    private final C5797g f14252A = C5799i.m22044a(new C5452b(C6574a.m24865a(this), null, null));

    /* renamed from: B */
    private final C5797g f14253B = C5799i.m22044a(new C5453c(C6574a.m24865a(this), null, null));

    /* renamed from: C */
    private final C5797g f14254C = C5799i.m22044a(new C5454d(this, null, null));

    /* renamed from: D */
    private final C5797g f14255D = C5799i.m22044a(new C5455e(this, null, null));

    /* renamed from: E */
    private final C5459i f14256E = new C5459i(this);

    /* renamed from: x */
    private final C5797g f14257x = C5693a.m21776a((Activity) this, "extra_auth_in_app");

    /* renamed from: y */
    private final C5797g f14258y = C5799i.m22044a(new C5456f(this, null, null));

    /* renamed from: z */
    private final C5797g f14259z = C5799i.m22044a(new C5451a(C6574a.m24865a(this), null, new C5460j(this)));

    /* renamed from: io.stashteam.stashapp.ui.auth.signin.SignInActivity$a */
    public static final class C5451a extends C5943l implements C5907a<C1943b> {

        /* renamed from: g */
        final /* synthetic */ C6565a f14260g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14261h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14262i;

        public C5451a(C6565a aVar, C6560a aVar2, C5907a aVar3) {
            this.f14260g = aVar;
            this.f14261h = aVar2;
            this.f14262i = aVar3;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.auth.api.signin.b, java.lang.Object] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1, types: [com.google.android.gms.auth.api.signin.b, java.lang.Object]
          assigns: [java.lang.Object]
          uses: [com.google.android.gms.auth.api.signin.b]
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
        public final com.google.android.gms.auth.api.signin.C1943b invoke() {
            /*
                r4 = this;
                o.a.c.m.a r0 = r4.f14260g
                o.a.c.k.a r1 = r4.f14261h
                k.z.c.a r2 = r4.f14262i
                java.lang.Class<com.google.android.gms.auth.api.signin.b> r3 = com.google.android.gms.auth.api.signin.C1943b.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                java.lang.Object r0 = r0.mo17011a(r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.auth.signin.SignInActivity.C5451a.invoke():java.lang.Object");
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.auth.signin.SignInActivity$b */
    public static final class C5452b extends C5943l implements C5907a<C1772m> {

        /* renamed from: g */
        final /* synthetic */ C6565a f14263g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14264h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14265i;

        public C5452b(C6565a aVar, C6560a aVar2, C5907a aVar3) {
            this.f14263g = aVar;
            this.f14264h = aVar2;
            this.f14265i = aVar3;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [com.facebook.login.m, java.lang.Object] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1, types: [com.facebook.login.m, java.lang.Object]
          assigns: [java.lang.Object]
          uses: [com.facebook.login.m]
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
        public final com.facebook.login.C1772m invoke() {
            /*
                r4 = this;
                o.a.c.m.a r0 = r4.f14263g
                o.a.c.k.a r1 = r4.f14264h
                k.z.c.a r2 = r4.f14265i
                java.lang.Class<com.facebook.login.m> r3 = com.facebook.login.C1772m.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                java.lang.Object r0 = r0.mo17011a(r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.auth.signin.SignInActivity.C5452b.invoke():java.lang.Object");
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.auth.signin.SignInActivity$c */
    public static final class C5453c extends C5943l implements C5907a<C1522e> {

        /* renamed from: g */
        final /* synthetic */ C6565a f14266g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14267h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14268i;

        public C5453c(C6565a aVar, C6560a aVar2, C5907a aVar3) {
            this.f14266g = aVar;
            this.f14267h = aVar2;
            this.f14268i = aVar3;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.facebook.e] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1, types: [java.lang.Object, com.facebook.e]
          assigns: [java.lang.Object]
          uses: [com.facebook.e]
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
        public final com.facebook.C1522e invoke() {
            /*
                r4 = this;
                o.a.c.m.a r0 = r4.f14266g
                o.a.c.k.a r1 = r4.f14267h
                k.z.c.a r2 = r4.f14268i
                java.lang.Class<com.facebook.e> r3 = com.facebook.C1522e.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                java.lang.Object r0 = r0.mo17011a(r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.auth.signin.SignInActivity.C5453c.invoke():java.lang.Object");
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.auth.signin.SignInActivity$d */
    public static final class C5454d extends C5943l implements C5907a<C4938c> {

        /* renamed from: g */
        final /* synthetic */ ComponentCallbacks f14269g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14270h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14271i;

        public C5454d(ComponentCallbacks componentCallbacks, C6560a aVar, C5907a aVar2) {
            this.f14269g = componentCallbacks;
            this.f14270h = aVar;
            this.f14271i = aVar2;
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
                android.content.ComponentCallbacks r0 = r4.f14269g
                o.a.c.k.a r1 = r4.f14270h
                k.z.c.a r2 = r4.f14271i
                o.a.c.a r0 = p352o.p353a.p354a.p356b.p357a.C6511a.m24704a(r0)
                o.a.c.m.a r0 = r0.mo16935b()
                java.lang.Class<io.stashteam.stashapp.b.a.c> r3 = p255io.stashteam.stashapp.p256b.p257a.C4938c.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                java.lang.Object r0 = r0.mo17011a(r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.auth.signin.SignInActivity.C5454d.invoke():java.lang.Object");
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.auth.signin.SignInActivity$e */
    public static final class C5455e extends C5943l implements C5907a<C4940a> {

        /* renamed from: g */
        final /* synthetic */ ComponentCallbacks f14272g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14273h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14274i;

        public C5455e(ComponentCallbacks componentCallbacks, C6560a aVar, C5907a aVar2) {
            this.f14272g = componentCallbacks;
            this.f14273h = aVar;
            this.f14274i = aVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [io.stashteam.stashapp.b.b.a.a, java.lang.Object] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [io.stashteam.stashapp.b.b.a.a, java.lang.Object]
          assigns: [java.lang.Object]
          uses: [io.stashteam.stashapp.b.b.a.a]
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
        public final p255io.stashteam.stashapp.p256b.p258b.p259a.C4940a invoke() {
            /*
                r4 = this;
                android.content.ComponentCallbacks r0 = r4.f14272g
                o.a.c.k.a r1 = r4.f14273h
                k.z.c.a r2 = r4.f14274i
                o.a.c.a r0 = p352o.p353a.p354a.p356b.p357a.C6511a.m24704a(r0)
                o.a.c.m.a r0 = r0.mo16935b()
                java.lang.Class<io.stashteam.stashapp.b.b.a.a> r3 = p255io.stashteam.stashapp.p256b.p258b.p259a.C4940a.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                java.lang.Object r0 = r0.mo17011a(r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.auth.signin.SignInActivity.C5455e.invoke():java.lang.Object");
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.auth.signin.SignInActivity$f */
    public static final class C5456f extends C5943l implements C5907a<C5467b> {

        /* renamed from: g */
        final /* synthetic */ C0523n f14275g;

        /* renamed from: h */
        final /* synthetic */ C6560a f14276h;

        /* renamed from: i */
        final /* synthetic */ C5907a f14277i;

        public C5456f(C0523n nVar, C6560a aVar, C5907a aVar2) {
            this.f14275g = nVar;
            this.f14276h = aVar;
            this.f14277i = aVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [androidx.lifecycle.a0, io.stashteam.stashapp.ui.auth.signin.b] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1, types: [androidx.lifecycle.a0, io.stashteam.stashapp.ui.auth.signin.b]
          assigns: [androidx.lifecycle.a0]
          uses: [io.stashteam.stashapp.ui.auth.signin.b]
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
        public final p255io.stashteam.stashapp.p298ui.auth.signin.C5467b invoke() {
            /*
                r4 = this;
                androidx.lifecycle.n r0 = r4.f14275g
                o.a.c.k.a r1 = r4.f14276h
                k.z.c.a r2 = r4.f14277i
                java.lang.Class<io.stashteam.stashapp.ui.auth.signin.b> r3 = p255io.stashteam.stashapp.p298ui.auth.signin.C5467b.class
                k.c0.b r3 = p308k.p323z.p325d.C5950s.m22341a(r3)
                androidx.lifecycle.a0 r0 = p352o.p353a.p359b.p360a.p362d.p363a.C6521a.m24722a(r0, r3, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.auth.signin.SignInActivity.C5456f.invoke():androidx.lifecycle.a0");
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.auth.signin.SignInActivity$g */
    public static final class C5457g {
        private C5457g() {
        }

        public /* synthetic */ C5457g(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ Intent m21134a(C5457g gVar, Context context, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return gVar.mo15117a(context, z);
        }

        /* renamed from: a */
        public final Intent mo15116a(Context context) {
            C5942k.m22327b(context, "context");
            Intent flags = mo15117a(context, false).setFlags(268468224);
            C5942k.m22324a((Object) flags, "createIntent(context, fa…FLAG_ACTIVITY_CLEAR_TASK)");
            return flags;
        }

        /* renamed from: a */
        public final Intent mo15117a(Context context, boolean z) {
            C5942k.m22327b(context, "context");
            Intent putExtra = new Intent(context, SignInActivity.class).putExtra("extra_auth_in_app", z);
            C5942k.m22324a((Object) putExtra, "Intent(context, SignInAc…A_AUTH_IN_APP, authInApp)");
            return putExtra;
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.auth.signin.SignInActivity$h */
    public static final class C5458h extends ClickableSpan {

        /* renamed from: f */
        final /* synthetic */ SignInActivity f14278f;

        /* renamed from: g */
        final /* synthetic */ C5907a f14279g;

        C5458h(SignInActivity signInActivity, C5907a aVar) {
            this.f14278f = signInActivity;
            this.f14279g = aVar;
        }

        public void onClick(View view) {
            C5942k.m22327b(view, "widget");
            this.f14279g.invoke();
        }

        public void updateDrawState(TextPaint textPaint) {
            C5942k.m22327b(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(C5699e.m21783a((Context) this.f14278f, (int) R.color.color_secondary_text));
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.auth.signin.SignInActivity$i */
    public static final class C5459i implements C1627g<C1779o> {

        /* renamed from: a */
        final /* synthetic */ SignInActivity f14280a;

        C5459i(SignInActivity signInActivity) {
            this.f14280a = signInActivity;
        }

        /* renamed from: a */
        public void mo5860a() {
            this.f14280a.m21131z().mo6137a();
        }

        /* renamed from: a */
        public void mo5861a(C1631i iVar) {
            C5693a.m21778a((Activity) this.f14280a, C5942k.m22326a((Object) "net::ERR_INTERNET_DISCONNECTED", (Object) iVar != null ? iVar.getMessage() : null) ? R.string.error_no_network : R.string.error_auth);
            this.f14280a.m21131z().mo6137a();
        }

        /* renamed from: a */
        public void mo5862a(C1779o oVar) {
            C5942k.m22327b(oVar, "loginResult");
            C5467b e = this.f14280a.m21118C();
            C1499a a = oVar.mo6150a();
            C5942k.m22324a((Object) a, "loginResult.accessToken");
            String i = a.mo5692i();
            C5942k.m22324a((Object) i, "loginResult.accessToken.token");
            e.mo15124b(i);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.auth.signin.SignInActivity$j */
    static final class C5460j extends C5943l implements C5907a<C6557a> {

        /* renamed from: g */
        final /* synthetic */ SignInActivity f14281g;

        C5460j(SignInActivity signInActivity) {
            this.f14281g = signInActivity;
            super(0);
        }

        public final C6557a invoke() {
            return C6559b.m24801a(this.f14281g);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.auth.signin.SignInActivity$k */
    static final class C5461k<T> implements C0533u<C5294d0> {

        /* renamed from: a */
        final /* synthetic */ SignInActivity f14282a;

        C5461k(SignInActivity signInActivity) {
            this.f14282a = signInActivity;
        }

        /* renamed from: a */
        public final void mo3048a(C5294d0 d0Var) {
            if (d0Var != null) {
                this.f14282a.m21124b(d0Var);
                this.f14282a.m21117B().mo14088b(true);
                SignInActivity signInActivity = this.f14282a;
                signInActivity.startActivity(MainActivity.f14623B.mo15249b(signInActivity));
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.auth.signin.SignInActivity$l */
    static final class C5462l<T> implements C0533u<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SignInActivity f14283a;

        C5462l(SignInActivity signInActivity) {
            this.f14283a = signInActivity;
        }

        /* renamed from: a */
        public final void mo3048a(Boolean bool) {
            ProgressBar progressBar = SignInActivity.m21123b(this.f14283a).f13099e;
            C5942k.m22324a((Object) progressBar, "binding.progressBar");
            C5942k.m22324a((Object) bool, "it");
            progressBar.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.auth.signin.SignInActivity$m */
    static final class C5463m extends C5943l implements C5918l<Throwable, Boolean> {

        /* renamed from: g */
        final /* synthetic */ SignInActivity f14284g;

        C5463m(SignInActivity signInActivity) {
            this.f14284g = signInActivity;
            super(1);
        }

        /* renamed from: a */
        public final boolean mo15123a(Throwable th) {
            C5942k.m22327b(th, "it");
            C4938c a = this.f14284g.m21128w();
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            a.mo14079a("sign_in__auth_failed", C5821b0.m22070a(C5808p.m22056a("error_message", message)));
            return false;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            return Boolean.valueOf(mo15123a((Throwable) obj));
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.auth.signin.SignInActivity$n */
    static final class C5464n extends C5943l implements C5907a<C5812t> {

        /* renamed from: g */
        final /* synthetic */ SignInActivity f14285g;

        C5464n(SignInActivity signInActivity) {
            this.f14285g = signInActivity;
            super(0);
        }

        public final void invoke() {
            C4938c.m19734a(this.f14285g.m21128w(), "sign_in__policy_click", null, 2, null);
            C5699e.m21790c(this.f14285g);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.auth.signin.SignInActivity$o */
    static final class C5465o extends C5943l implements C5907a<C5812t> {

        /* renamed from: g */
        final /* synthetic */ SignInActivity f14286g;

        C5465o(SignInActivity signInActivity) {
            this.f14286g = signInActivity;
            super(0);
        }

        public final void invoke() {
            C4938c.m19734a(this.f14286g.m21128w(), "sign_in__terms_click", null, 2, null);
            C5699e.m21792e(this.f14286g);
        }
    }

    /* renamed from: A */
    private final C1943b m21116A() {
        return (C1943b) this.f14259z.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final C4940a m21117B() {
        return (C4940a) this.f14255D.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final C5467b m21118C() {
        return (C5467b) this.f14258y.getValue();
    }

    /* renamed from: D */
    private final void m21119D() {
        String string = getString(R.string.sign_in_terms_and_policy_begin);
        C5942k.m22324a((Object) string, "getString(R.string.sign_in_terms_and_policy_begin)");
        String string2 = getString(R.string.common_terms);
        C5942k.m22324a((Object) string2, "getString(R.string.common_terms)");
        String string3 = getString(R.string.sign_in_and);
        C5942k.m22324a((Object) string3, "getString(R.string.sign_in_and)");
        String string4 = getString(R.string.common_policy);
        C5942k.m22324a((Object) string4, "getString(R.string.common_policy)");
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(' ');
        sb.append(string2);
        sb.append(' ');
        sb.append(string3);
        sb.append(' ');
        sb.append(string4);
        SpannableString spannableString = new SpannableString(sb.toString());
        ClickableSpan a = m21120a((C5907a<C5812t>) new C5465o<C5812t>(this));
        ClickableSpan a2 = m21120a((C5907a<C5812t>) new C5464n<C5812t>(this));
        int length = string.length() + 1;
        int length2 = string2.length() + length;
        spannableString.setSpan(a, length, length2, 33);
        int length3 = length2 + string3.length() + 2;
        spannableString.setSpan(a2, length3, string4.length() + length3, 33);
        AppCompatTextView appCompatTextView = ((C4987k) mo15023u()).f13100f;
        appCompatTextView.setText(spannableString);
        appCompatTextView.setMovementMethod(LinkMovementMethod.getInstance());
        appCompatTextView.setHighlightColor(C5699e.m21783a((Context) this, 17170445));
    }

    /* renamed from: a */
    private final ClickableSpan m21120a(C5907a<C5812t> aVar) {
        return new C5458h(this, aVar);
    }

    /* renamed from: b */
    public static final /* synthetic */ C4987k m21123b(SignInActivity signInActivity) {
        return (C4987k) signInActivity.mo15023u();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m21124b(C5294d0 d0Var) {
        String str;
        C5287b a = d0Var.mo14883a();
        if (a != null) {
            int i = C5466a.f14287a[a.ordinal()];
            if (i == 1) {
                str = "google";
            } else if (i == 2) {
                str = "facebook";
            }
            Map b = C5823c0.m22080b(C5808p.m22056a("auth_method", str), C5808p.m22056a("user_id", Long.valueOf(d0Var.mo14885c())), C5808p.m22056a("auth_in_app", Boolean.valueOf(m21129x())));
            m21128w().mo14080a(b);
            m21128w().mo14079a("sign_in__auth_success", b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final C4938c m21128w() {
        return (C4938c) this.f14254C.getValue();
    }

    /* renamed from: x */
    private final boolean m21129x() {
        return ((Boolean) this.f14257x.getValue()).booleanValue();
    }

    /* renamed from: y */
    private final C1522e m21130y() {
        return (C1522e) this.f14253B.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final C1772m m21131z() {
        return (C1772m) this.f14252A.getValue();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m21130y().mo5732a(i, i2, intent);
        if (i == 5 && i2 == -1) {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) C1942a.m8235a(intent).mo13012a(C1995b.class);
            String m = googleSignInAccount != null ? googleSignInAccount.mo6484m() : null;
            if (m != null) {
                m21118C().mo15125c(m);
            }
        }
    }

    public void onClick(View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.btn_facebook) {
            C4938c.m19734a(m21128w(), "sign_in__facebook_click", null, 2, null);
            m21131z().mo6142b((Activity) this, (Collection<String>) f14250F);
        } else if (valueOf != null && valueOf.intValue() == R.id.btn_google) {
            C4938c.m19734a(m21128w(), "sign_in__google_click", null, 2, null);
            startActivityForResult(m21116A().mo6513h(), 5);
        } else if (valueOf != null && valueOf.intValue() == R.id.btn_close) {
            C4938c.m19734a(m21128w(), "sign_in__close_click", null, 2, null);
            m21117B().mo14088b(true);
            if (m21129x()) {
                finish();
            } else {
                startActivity(MainActivity.f14623B.mo15249b(this));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m21131z().mo6139a(m21130y(), (C1627g<C1779o>) this.f14256E);
        m21131z().mo6137a();
        m21116A().mo6515j();
        ((C4987k) mo15023u()).f13097c.setOnClickListener(this);
        ((C4987k) mo15023u()).f13098d.setOnClickListener(this);
        ((C4987k) mo15023u()).f13096b.setOnClickListener(this);
        m21119D();
        m21118C().mo15126f().mo2976a(this, new C5461k(this));
        m21118C().mo15049d().mo2976a(this, new C5462l(this));
        C5710m.m21807a(this, this, m21118C().mo15048c(), R.string.error_auth, new C5463m(this));
        C4938c.m19734a(m21128w(), "sign_in__screen_view", null, 2, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C4987k m21133v() {
        C4987k a = C4987k.m19972a(getLayoutInflater());
        C5942k.m22324a((Object) a, "ActivitySignInBinding.inflate(layoutInflater)");
        return a;
    }
}
