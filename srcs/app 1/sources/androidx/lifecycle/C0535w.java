package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.C0514h.C0515a;

/* renamed from: androidx.lifecycle.w */
public class C0535w implements C0523n {

    /* renamed from: n */
    private static final C0535w f2248n = new C0535w();

    /* renamed from: f */
    private int f2249f = 0;

    /* renamed from: g */
    private int f2250g = 0;

    /* renamed from: h */
    private boolean f2251h = true;

    /* renamed from: i */
    private boolean f2252i = true;

    /* renamed from: j */
    private Handler f2253j;

    /* renamed from: k */
    private final C0524o f2254k = new C0524o(this);

    /* renamed from: l */
    private Runnable f2255l = new C0536a();

    /* renamed from: m */
    C0541a f2256m = new C0537b();

    /* renamed from: androidx.lifecycle.w$a */
    class C0536a implements Runnable {
        C0536a() {
        }

        public void run() {
            C0535w.this.mo3056h();
            C0535w.this.mo3057i();
        }
    }

    /* renamed from: androidx.lifecycle.w$b */
    class C0537b implements C0541a {
        C0537b() {
        }

        /* renamed from: a */
        public void mo3059a() {
            C0535w.this.mo3054f();
        }

        /* renamed from: b */
        public void mo3060b() {
        }

        /* renamed from: c */
        public void mo3061c() {
            C0535w.this.mo3053e();
        }
    }

    /* renamed from: androidx.lifecycle.w$c */
    class C0538c extends C0509d {

        /* renamed from: androidx.lifecycle.w$c$a */
        class C0539a extends C0509d {
            C0539a() {
            }

            public void onActivityPostResumed(Activity activity) {
                C0535w.this.mo3053e();
            }

            public void onActivityPostStarted(Activity activity) {
                C0535w.this.mo3054f();
            }
        }

        C0538c() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (VERSION.SDK_INT < 29) {
                C0540x.m2785a(activity).mo3065a(C0535w.this.f2256m);
            }
        }

        public void onActivityPaused(Activity activity) {
            C0535w.this.mo3052d();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new C0539a());
        }

        public void onActivityStopped(Activity activity) {
            C0535w.this.mo3055g();
        }
    }

    private C0535w() {
    }

    /* renamed from: b */
    static void m2773b(Context context) {
        f2248n.mo3051a(context);
    }

    /* renamed from: a */
    public C0514h mo115a() {
        return this.f2254k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3051a(Context context) {
        this.f2253j = new Handler();
        this.f2254k.mo3041a(C0515a.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0538c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo3052d() {
        int i = this.f2250g - 1;
        this.f2250g = i;
        if (i == 0) {
            this.f2253j.postDelayed(this.f2255l, 700);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo3053e() {
        int i = this.f2250g + 1;
        this.f2250g = i;
        if (i != 1) {
            return;
        }
        if (this.f2251h) {
            this.f2254k.mo3041a(C0515a.ON_RESUME);
            this.f2251h = false;
            return;
        }
        this.f2253j.removeCallbacks(this.f2255l);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo3054f() {
        int i = this.f2249f + 1;
        this.f2249f = i;
        if (i == 1 && this.f2252i) {
            this.f2254k.mo3041a(C0515a.ON_START);
            this.f2252i = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo3055g() {
        this.f2249f--;
        mo3057i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo3056h() {
        if (this.f2250g == 0) {
            this.f2251h = true;
            this.f2254k.mo3041a(C0515a.ON_PAUSE);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo3057i() {
        if (this.f2249f == 0 && this.f2251h) {
            this.f2254k.mo3041a(C0515a.ON_STOP);
            this.f2252i = true;
        }
    }
}
