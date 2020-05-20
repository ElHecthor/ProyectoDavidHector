package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p071f.p088e.C3164b;

/* renamed from: androidx.appcompat.app.e */
public abstract class C0069e {

    /* renamed from: f */
    private static int f224f = -100;

    /* renamed from: g */
    private static final C3164b<WeakReference<C0069e>> f225g = new C3164b<>();

    /* renamed from: h */
    private static final Object f226h = new Object();

    C0069e() {
    }

    /* renamed from: a */
    public static C0069e m266a(Activity activity, C0068d dVar) {
        return new C0070f(activity, dVar);
    }

    /* renamed from: a */
    public static C0069e m267a(Dialog dialog, C0068d dVar) {
        return new C0070f(dialog, dVar);
    }

    /* renamed from: a */
    static void m268a(C0069e eVar) {
        synchronized (f226h) {
            m270c(eVar);
            f225g.add(new WeakReference(eVar));
        }
    }

    /* renamed from: b */
    static void m269b(C0069e eVar) {
        synchronized (f226h) {
            m270c(eVar);
        }
    }

    /* renamed from: c */
    private static void m270c(C0069e eVar) {
        synchronized (f226h) {
            Iterator it = f225g.iterator();
            while (it.hasNext()) {
                C0069e eVar2 = (C0069e) ((WeakReference) it.next()).get();
                if (eVar2 == eVar || eVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: e */
    public static void m271e(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f224f != i) {
            f224f = i;
            mo311k();
        }
    }

    /* renamed from: k */
    private static void mo311k() {
        synchronized (f226h) {
            Iterator it = f225g.iterator();
            while (it.hasNext()) {
                C0069e eVar = (C0069e) ((WeakReference) it.next()).get();
                if (eVar != null) {
                    eVar.mo274a();
                }
            }
        }
    }

    /* renamed from: l */
    public static int m273l() {
        return f224f;
    }

    /* renamed from: a */
    public abstract <T extends View> T mo266a(int i);

    /* renamed from: a */
    public void mo267a(Context context) {
    }

    /* renamed from: a */
    public abstract void mo268a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo269a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo270a(View view);

    /* renamed from: a */
    public abstract void mo271a(View view, LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo272a(Toolbar toolbar);

    /* renamed from: a */
    public abstract void mo273a(CharSequence charSequence);

    /* renamed from: a */
    public abstract boolean mo274a();

    /* renamed from: b */
    public int mo275b() {
        return -100;
    }

    /* renamed from: b */
    public abstract void mo276b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo277b(View view, LayoutParams layoutParams);

    /* renamed from: b */
    public abstract boolean mo278b(int i);

    /* renamed from: c */
    public abstract MenuInflater mo279c();

    /* renamed from: c */
    public abstract void mo280c(int i);

    /* renamed from: c */
    public abstract void mo281c(Bundle bundle);

    /* renamed from: d */
    public abstract C0061a mo282d();

    /* renamed from: d */
    public void mo283d(int i) {
    }

    /* renamed from: e */
    public abstract void mo284e();

    /* renamed from: f */
    public abstract void mo285f();

    /* renamed from: g */
    public abstract void mo286g();

    /* renamed from: h */
    public abstract void mo287h();

    /* renamed from: i */
    public abstract void mo288i();

    /* renamed from: j */
    public abstract void mo289j();
}
