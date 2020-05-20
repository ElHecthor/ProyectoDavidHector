package androidx.activity;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.C0355f;
import androidx.lifecycle.C0508c0;
import androidx.lifecycle.C0510d0;
import androidx.lifecycle.C0514h;
import androidx.lifecycle.C0514h.C0515a;
import androidx.lifecycle.C0514h.C0516b;
import androidx.lifecycle.C0521l;
import androidx.lifecycle.C0523n;
import androidx.lifecycle.C0524o;
import androidx.lifecycle.C0540x;
import androidx.savedstate.C0757a;
import androidx.savedstate.C0758b;
import androidx.savedstate.SavedStateRegistry;

public class ComponentActivity extends C0355f implements C0523n, C0510d0, C0758b, C0046c {

    /* renamed from: g */
    private final C0524o f72g = new C0524o(this);

    /* renamed from: h */
    private final C0757a f73h = C0757a.m4087a((C0758b) this);

    /* renamed from: i */
    private C0508c0 f74i;

    /* renamed from: j */
    private final OnBackPressedDispatcher f75j = new OnBackPressedDispatcher(new C0041a());

    /* renamed from: k */
    private int f76k;

    /* renamed from: androidx.activity.ComponentActivity$a */
    class C0041a implements Runnable {
        C0041a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    static final class C0042b {

        /* renamed from: a */
        Object f80a;

        /* renamed from: b */
        C0508c0 f81b;

        C0042b() {
        }
    }

    public ComponentActivity() {
        if (mo115a() != null) {
            if (VERSION.SDK_INT >= 19) {
                mo115a().mo3037a(new C0521l() {
                    /* renamed from: a */
                    public void mo124a(C0523n nVar, C0515a aVar) {
                        if (aVar == C0515a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            mo115a().mo3037a(new C0521l() {
                /* renamed from: a */
                public void mo124a(C0523n nVar, C0515a aVar) {
                    if (aVar == C0515a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.mo118h().mo3019a();
                    }
                }
            });
            int i = VERSION.SDK_INT;
            if (19 <= i && i <= 23) {
                mo115a().mo3037a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* renamed from: a */
    public C0514h mo115a() {
        return this.f72g;
    }

    /* renamed from: b */
    public final OnBackPressedDispatcher mo116b() {
        return this.f75j;
    }

    /* renamed from: c */
    public final SavedStateRegistry mo117c() {
        return this.f73h.mo4172a();
    }

    /* renamed from: h */
    public C0508c0 mo118h() {
        if (getApplication() != null) {
            if (this.f74i == null) {
                C0042b bVar = (C0042b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.f74i = bVar.f81b;
                }
                if (this.f74i == null) {
                    this.f74i = new C0508c0();
                }
            }
            return this.f74i;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    /* renamed from: k */
    public Object mo119k() {
        return null;
    }

    public void onBackPressed() {
        this.f75j.mo127a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f73h.mo4173a(bundle);
        C0540x.m2788b((Activity) this);
        int i = this.f76k;
        if (i != 0) {
            setContentView(i);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        Object k = mo119k();
        C0508c0 c0Var = this.f74i;
        if (c0Var == null) {
            C0042b bVar = (C0042b) getLastNonConfigurationInstance();
            if (bVar != null) {
                c0Var = bVar.f81b;
            }
        }
        if (c0Var == null && k == null) {
            return null;
        }
        C0042b bVar2 = new C0042b();
        bVar2.f80a = k;
        bVar2.f81b = c0Var;
        return bVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C0514h a = mo115a();
        if (a instanceof C0524o) {
            ((C0524o) a).mo3043b(C0516b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f73h.mo4174b(bundle);
    }
}
