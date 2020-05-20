package p071f.p072a.p079o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import p071f.p072a.C3101i;

/* renamed from: f.a.o.d */
public class C3127d extends ContextWrapper {

    /* renamed from: a */
    private int f8836a;

    /* renamed from: b */
    private Theme f8837b;

    /* renamed from: c */
    private LayoutInflater f8838c;

    /* renamed from: d */
    private Configuration f8839d;

    /* renamed from: e */
    private Resources f8840e;

    public C3127d() {
        super(null);
    }

    public C3127d(Context context, int i) {
        super(context);
        this.f8836a = i;
    }

    public C3127d(Context context, Theme theme) {
        super(context);
        this.f8837b = theme;
    }

    /* renamed from: b */
    private Resources m12672b() {
        Resources resources;
        if (this.f8840e == null) {
            Configuration configuration = this.f8839d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            }
            this.f8840e = resources;
        }
        return this.f8840e;
    }

    /* renamed from: c */
    private void m12673c() {
        boolean z = this.f8837b == null;
        if (z) {
            this.f8837b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f8837b.setTo(theme);
            }
        }
        mo10050a(this.f8837b, this.f8836a, z);
    }

    /* renamed from: a */
    public int mo10049a() {
        return this.f8836a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10050a(Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return m12672b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f8838c == null) {
            this.f8838c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f8838c;
    }

    public Theme getTheme() {
        Theme theme = this.f8837b;
        if (theme != null) {
            return theme;
        }
        if (this.f8836a == 0) {
            this.f8836a = C3101i.Theme_AppCompat_Light;
        }
        m12673c();
        return this.f8837b;
    }

    public void setTheme(int i) {
        if (this.f8836a != i) {
            this.f8836a = i;
            m12673c();
        }
    }
}
