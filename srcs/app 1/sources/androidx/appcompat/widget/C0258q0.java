package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.q0 */
public class C0258q0 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f1146c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<C0258q0>> f1147d;

    /* renamed from: a */
    private final Resources f1148a;

    /* renamed from: b */
    private final Theme f1149b;

    private C0258q0(Context context) {
        super(context);
        if (C0291y0.m1459b()) {
            C0291y0 y0Var = new C0291y0(this, context.getResources());
            this.f1148a = y0Var;
            Theme newTheme = y0Var.newTheme();
            this.f1149b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1148a = new C0262s0(this, context.getResources());
        this.f1149b = null;
    }

    /* renamed from: a */
    private static boolean m1263a(Context context) {
        if ((context instanceof C0258q0) || (context.getResources() instanceof C0262s0) || (context.getResources() instanceof C0291y0)) {
            return false;
        }
        return VERSION.SDK_INT < 21 || C0291y0.m1459b();
    }

    /* renamed from: b */
    public static Context m1264b(Context context) {
        if (!m1263a(context)) {
            return context;
        }
        synchronized (f1146c) {
            if (f1147d == null) {
                f1147d = new ArrayList<>();
            } else {
                for (int size = f1147d.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = (WeakReference) f1147d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1147d.remove(size);
                    }
                }
                for (int size2 = f1147d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = (WeakReference) f1147d.get(size2);
                    C0258q0 q0Var = weakReference2 != null ? (C0258q0) weakReference2.get() : null;
                    if (q0Var != null && q0Var.getBaseContext() == context) {
                        return q0Var;
                    }
                }
            }
            C0258q0 q0Var2 = new C0258q0(context);
            f1147d.add(new WeakReference(q0Var2));
            return q0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f1148a.getAssets();
    }

    public Resources getResources() {
        return this.f1148a;
    }

    public Theme getTheme() {
        Theme theme = this.f1149b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Theme theme = this.f1149b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
