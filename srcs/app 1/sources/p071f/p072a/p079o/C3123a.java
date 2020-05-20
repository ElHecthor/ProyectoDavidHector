package p071f.p072a.p079o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.view.ViewConfiguration;
import p071f.p072a.C3093a;
import p071f.p072a.C3094b;
import p071f.p072a.C3096d;
import p071f.p072a.C3102j;

/* renamed from: f.a.o.a */
public class C3123a {

    /* renamed from: a */
    private Context f8833a;

    private C3123a(Context context) {
        this.f8833a = context;
    }

    /* renamed from: a */
    public static C3123a m12641a(Context context) {
        return new C3123a(context);
    }

    /* renamed from: a */
    public boolean mo10039a() {
        return this.f8833a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: b */
    public int mo10040b() {
        return this.f8833a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: c */
    public int mo10041c() {
        Configuration configuration = this.f8833a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600 || ((i > 960 && i2 > 720) || (i > 720 && i2 > 960))) {
            return 5;
        }
        if (i >= 500 || ((i > 640 && i2 > 480) || (i > 480 && i2 > 640))) {
            return 4;
        }
        return i >= 360 ? 3 : 2;
    }

    /* renamed from: d */
    public int mo10042d() {
        return this.f8833a.getResources().getDimensionPixelSize(C3096d.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: e */
    public int mo10043e() {
        TypedArray obtainStyledAttributes = this.f8833a.obtainStyledAttributes(null, C3102j.ActionBar, C3093a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C3102j.ActionBar_height, 0);
        Resources resources = this.f8833a.getResources();
        if (!mo10044f()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C3096d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public boolean mo10044f() {
        return this.f8833a.getResources().getBoolean(C3094b.abc_action_bar_embed_tabs);
    }

    /* renamed from: g */
    public boolean mo10045g() {
        if (VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f8833a).hasPermanentMenuKey();
    }
}
