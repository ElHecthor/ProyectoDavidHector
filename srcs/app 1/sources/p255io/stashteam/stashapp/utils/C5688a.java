package p255io.stashteam.stashapp.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.view.inputmethod.InputMethodManager;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p097h.p106k.C3300b;
import p255io.stashteam.stashapp.p269e.p280c.C5299h;
import p255io.stashteam.stashapp.p269e.p280c.C5312q;
import p308k.C5802l;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;
import p333l.p334a.p335a.p336a.C6223a;

/* renamed from: io.stashteam.stashapp.utils.a */
public final class C5688a {

    /* renamed from: a */
    public static final C5688a f14784a = new C5688a();

    private C5688a() {
    }

    /* renamed from: a */
    private final void m21678a(Context context) {
        Object systemService = context != null ? context.getSystemService("input_method") : null;
        if (systemService != null) {
            ((InputMethodManager) systemService).toggleSoftInput(2, 0);
            return;
        }
        throw new C5809q("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    /* renamed from: a */
    public final int mo15339a() {
        Resources system = Resources.getSystem();
        C5942k.m22324a((Object) system, "Resources.getSystem()");
        return system.getDisplayMetrics().heightPixels;
    }

    /* renamed from: a */
    public final Spanned mo15340a(Context context, C5299h hVar) {
        String str;
        C5942k.m22327b(context, "context");
        C5942k.m22327b(hVar, "filterData");
        C5802l c = hVar.mo14932c();
        Integer num = (Integer) c.mo15418a();
        String str2 = (String) c.mo15419b();
        int b = hVar.mo14931b();
        Object[] objArr = new Object[2];
        if (num != null) {
            str2 = context.getString(num.intValue());
        }
        objArr[0] = str2;
        if (b > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append('+');
            sb.append(b - 1);
            str = sb.toString();
        } else {
            str = "";
        }
        objArr[1] = str;
        Spanned a = C3300b.m13501a(context.getString(R.string.filter_value, objArr), 0);
        C5942k.m22324a((Object) a, "HtmlCompat.fromHtml(\n   …at.FROM_HTML_MODE_LEGACY)");
        return a;
    }

    /* renamed from: a */
    public final String mo15341a(String str, C5312q qVar, C5312q qVar2) {
        C5942k.m22327b(qVar, "from");
        C5942k.m22327b(qVar2, "to");
        if (str == null) {
            return null;
        }
        return C5787p.m21971a(str, qVar.mo14986f(), qVar2.mo14986f(), false, 4, (Object) null);
    }

    /* renamed from: a */
    public final void mo15342a(Activity activity) {
        if (C6223a.m23305b(activity)) {
            m21678a((Context) activity);
        }
    }

    /* renamed from: b */
    public final int mo15343b() {
        int identifier = Resources.getSystem().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return Resources.getSystem().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo15344b(Activity activity) {
        if (!C6223a.m23305b(activity)) {
            m21678a((Context) activity);
        }
    }
}
