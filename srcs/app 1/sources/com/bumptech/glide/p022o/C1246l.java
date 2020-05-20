package com.bumptech.glide.p022o;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import androidx.fragment.app.C0429d;
import androidx.fragment.app.C0445l;
import androidx.fragment.app.C0466s;
import com.bumptech.glide.C0832c;
import com.bumptech.glide.C0852k;
import com.bumptech.glide.p029t.C1310k;
import java.util.HashMap;
import java.util.Map;
import p071f.p088e.C3162a;

/* renamed from: com.bumptech.glide.o.l */
public class C1246l implements Callback {

    /* renamed from: f */
    private static final C1248b f4148f = new C1247a();

    /* renamed from: a */
    private volatile C0852k f4149a;

    /* renamed from: b */
    final Map<FragmentManager, C1244k> f4150b = new HashMap();

    /* renamed from: c */
    final Map<C0445l, C1251o> f4151c = new HashMap();

    /* renamed from: d */
    private final Handler f4152d;

    /* renamed from: e */
    private final C1248b f4153e;

    /* renamed from: com.bumptech.glide.o.l$a */
    class C1247a implements C1248b {
        C1247a() {
        }

        /* renamed from: a */
        public C0852k mo4514a(C0832c cVar, C1241h hVar, C1249m mVar, Context context) {
            return new C0852k(cVar, hVar, mVar, context);
        }
    }

    /* renamed from: com.bumptech.glide.o.l$b */
    public interface C1248b {
        /* renamed from: a */
        C0852k mo4514a(C0832c cVar, C1241h hVar, C1249m mVar, Context context);
    }

    public C1246l(C1248b bVar) {
        new C3162a();
        new C3162a();
        new Bundle();
        if (bVar == null) {
            bVar = f4148f;
        }
        this.f4153e = bVar;
        this.f4152d = new Handler(Looper.getMainLooper(), this);
    }

    @Deprecated
    /* renamed from: a */
    private C0852k m5833a(Context context, FragmentManager fragmentManager, Fragment fragment, boolean z) {
        C1244k a = m5835a(fragmentManager, fragment, z);
        C0852k c = a.mo5193c();
        if (c != null) {
            return c;
        }
        C0852k a2 = this.f4153e.mo4514a(C0832c.m4445a(context), a.mo5192b(), a.mo5194d(), context);
        a.mo5191a(a2);
        return a2;
    }

    /* renamed from: a */
    private C0852k m5834a(Context context, C0445l lVar, androidx.fragment.app.Fragment fragment, boolean z) {
        C1251o a = m5836a(lVar, fragment, z);
        C0852k u0 = a.mo5218u0();
        if (u0 != null) {
            return u0;
        }
        C0852k a2 = this.f4153e.mo4514a(C0832c.m4445a(context), a.mo2654t0(), a.mo5219v0(), context);
        a.mo5216a(a2);
        return a2;
    }

    /* renamed from: a */
    private C1244k m5835a(FragmentManager fragmentManager, Fragment fragment, boolean z) {
        String str = "com.bumptech.glide.manager";
        C1244k kVar = (C1244k) fragmentManager.findFragmentByTag(str);
        if (kVar == null) {
            kVar = (C1244k) this.f4150b.get(fragmentManager);
            if (kVar == null) {
                kVar = new C1244k();
                kVar.mo5190a(fragment);
                if (z) {
                    kVar.mo5192b().mo5182b();
                }
                this.f4150b.put(fragmentManager, kVar);
                fragmentManager.beginTransaction().add(kVar, str).commitAllowingStateLoss();
                this.f4152d.obtainMessage(1, fragmentManager).sendToTarget();
            }
        }
        return kVar;
    }

    /* renamed from: a */
    private C1251o m5836a(C0445l lVar, androidx.fragment.app.Fragment fragment, boolean z) {
        String str = "com.bumptech.glide.manager";
        C1251o oVar = (C1251o) lVar.mo2777b(str);
        if (oVar == null) {
            oVar = (C1251o) this.f4151c.get(lVar);
            if (oVar == null) {
                oVar = new C1251o();
                oVar.mo5217b(fragment);
                if (z) {
                    oVar.mo2654t0().mo5182b();
                }
                this.f4151c.put(lVar, oVar);
                C0466s b = lVar.mo2778b();
                b.mo2914a((androidx.fragment.app.Fragment) oVar, str);
                b.mo2629b();
                this.f4152d.obtainMessage(2, lVar).sendToTarget();
            }
        }
        return oVar;
    }

    /* renamed from: b */
    private static Activity m5837b(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m5837b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: c */
    private C0852k m5838c(Context context) {
        if (this.f4149a == null) {
            synchronized (this) {
                if (this.f4149a == null) {
                    this.f4149a = this.f4153e.mo4514a(C0832c.m4445a(context.getApplicationContext()), new C1233b(), new C1240g(), context.getApplicationContext());
                }
            }
        }
        return this.f4149a;
    }

    @TargetApi(17)
    /* renamed from: c */
    private static void m5839c(Activity activity) {
        if (VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: d */
    private static boolean m5840d(Context context) {
        Activity b = m5837b(context);
        return b == null || !b.isFinishing();
    }

    /* renamed from: a */
    public C0852k mo5202a(Activity activity) {
        if (C1310k.m6169b()) {
            return mo5203a(activity.getApplicationContext());
        }
        m5839c(activity);
        return m5833a((Context) activity, activity.getFragmentManager(), (Fragment) null, m5840d(activity));
    }

    /* renamed from: a */
    public C0852k mo5203a(Context context) {
        if (context != null) {
            if (C1310k.m6172c() && !(context instanceof Application)) {
                if (context instanceof C0429d) {
                    return mo5204a((C0429d) context);
                }
                if (context instanceof Activity) {
                    return mo5202a((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return mo5203a(contextWrapper.getBaseContext());
                    }
                }
            }
            return m5838c(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    /* renamed from: a */
    public C0852k mo5204a(C0429d dVar) {
        if (C1310k.m6169b()) {
            return mo5203a(dVar.getApplicationContext());
        }
        m5839c((Activity) dVar);
        return m5834a((Context) dVar, dVar.mo2666l(), (androidx.fragment.app.Fragment) null, m5840d(dVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1251o mo5205a(Context context, C0445l lVar) {
        return m5836a(lVar, (androidx.fragment.app.Fragment) null, m5840d(context));
    }

    /* access modifiers changed from: 0000 */
    @Deprecated
    /* renamed from: b */
    public C1244k mo5206b(Activity activity) {
        return m5835a(activity.getFragmentManager(), (Fragment) null, m5840d(activity));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r6) {
        /*
            r5 = this;
            int r0 = r6.what
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0014
            r3 = 2
            if (r0 == r3) goto L_0x000c
            r2 = 0
            r6 = r1
            goto L_0x0022
        L_0x000c:
            java.lang.Object r6 = r6.obj
            r1 = r6
            androidx.fragment.app.l r1 = (androidx.fragment.app.C0445l) r1
            java.util.Map<androidx.fragment.app.l, com.bumptech.glide.o.o> r6 = r5.f4151c
            goto L_0x001b
        L_0x0014:
            java.lang.Object r6 = r6.obj
            r1 = r6
            android.app.FragmentManager r1 = (android.app.FragmentManager) r1
            java.util.Map<android.app.FragmentManager, com.bumptech.glide.o.k> r6 = r5.f4150b
        L_0x001b:
            java.lang.Object r6 = r6.remove(r1)
            r4 = r1
            r1 = r6
            r6 = r4
        L_0x0022:
            if (r2 == 0) goto L_0x0043
            if (r1 != 0) goto L_0x0043
            r0 = 5
            java.lang.String r1 = "RMRetriever"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x0043
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Failed to remove expected request manager fragment, manager: "
            r0.append(r3)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.util.Log.w(r1, r6)
        L_0x0043:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p022o.C1246l.handleMessage(android.os.Message):boolean");
    }
}
